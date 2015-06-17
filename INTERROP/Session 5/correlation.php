<?php
  include('rest_handle_correlation.php');
  include('trigger_process.php');
  include('trigger_callback.php');
  
  
  $eol = "\r\n";
  $rest = handleREST($_SERVER,$_GET);
  
  // log all entries to a file
  $tempArray = json_decode(file_get_contents('handle_rest.log'), true);
  array_push($tempArray, $rest);
  file_put_contents('handle_rest.log', json_encode($tempArray), LOCK_EX);
  
  
  //if key message is present, create a new process instance
  if ($rest->method=='POST' &&  strlen($rest->arguments['message']) > 0) {
	//magic auto-fill of inventory, everytime a new order comes in the inventory is magically updated
	file_put_contents('inventory.json', file_get_contents('inventory_.json'));
	
	//trigger process 
	$instanceURL = triggerProcess();
	file_put_contents('myProcessInstances.log', 'New instance created at: '.$instanceURL.$eol , FILE_APPEND | LOCK_EX);	  
  }
  
  //assumption that if an argument with key pid exists, a new process was triggered
  else if($rest->method=='POST' && strlen($rest->arguments['pid']) > 0) {
	//save callback, pid, CPEE instance URL
	header('CPEE_CALLBACK: true'); 
	$CPEEInstance = new StdClass;
	$CPEEInstance->pid = $rest->arguments['pid'];
	$CPEEInstance->callback = $rest->headers['Cpee_callback'];
	$CPEEInstance->instanceurl = $rest->headers['Cpee_instance'];	
	$allInstances = json_decode(file_get_contents('correlation_rules.json'), true);
    array_push($allInstances, $CPEEInstance);
    file_put_contents('correlation_rules.json', json_encode($allInstances), LOCK_EX);
  }
  
  
  //if content-id header is set to producing, the PUT for progress has to happen, find pid in rules and put the whole message to the callback
  else if($rest->method=='POST' && $rest->headers['Content-Id'] =='producing') {
	
	//this looks crazy, but the return format does not seem to be as intended.
	//Example: "{\"action\":\"Adjust_robots_for_assembly\",\"duration\":60,\"tasktype\":\"manual\",\"pid\":\"0e07e43bfcfb26d6ec0c93ac87c4092b\",\"progress\":\"INTERMEDIATE\"}": ""
	$jsonMessage = key($rest->arguments);
	$json = json_decode($jsonMessage, false)  ;
	file_put_contents('myProcessInstances.log', 'Lookup pid: '.($json->pid).$eol , FILE_APPEND | LOCK_EX);
	$allInstances = json_decode(file_get_contents('correlation_rules.json'), true);
	$callback ="";
	//counting in loop, not elegant, but whatsoever
	$count = 0;
	foreach($allInstances as $value) {
		if ($value['pid']==($json->pid)) {
			$callback = $value['callback'];
			$entry = $value;
			//unsetting the found entry
			unset($allInstances[$count]);
		}
		$count = $count +1;
	}
	// if a callback is found, perform the PUT job and clean the rule
	if (strlen($callback) != 0) {
	  file_put_contents('myProcessInstances.log', 'Run the callback (PUT): '.$callback.' for status '.$json->progress.$eol , FILE_APPEND | LOCK_EX);
	  //delete the entry in file
	  file_put_contents('correlation_rules.json', json_encode(array_values($allInstances)), LOCK_EX);
	  //trigger the put
	  $result = triggerCallback($callback, $jsonMessage);	  
	}
	
  } 
?>