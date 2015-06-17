<?php
  include('rest_handle.php');
  $rest = handleREST($_SERVER,$_GET);
  class Author {
	   public $givenName = 'Wilfrid';
	   public $surName = 'Utz';
	   public $MatrNr = '9902268';
	   public $Email = 'a9902268@unet.univie.ac.at';
	   
   }
   $baseURL = 'http://wwwlab.cs.univie.ac.at/~a9902268/choreography/progress_mgmt.php/';
   $progress1 = json_decode(file_get_contents('1_progress_prepare.json'), true);
   $progress2 = json_decode(file_get_contents('2_progress_assemble.json'), true);
   $progress3 = json_decode(file_get_contents('3_progress_validate.json'), true);
   $progress4 = json_decode(file_get_contents('4_progress_package.json'), true);
   $progress5 = json_decode(file_get_contents('5_progress_logistics.json'), true);
   $progress6 = json_decode(file_get_contents('6_progress_invoice.json'), true);
   $progress7 = json_decode(file_get_contents('7_progress_crm.json'), true);
   
   $progress = array_merge($progress1, $progress2, $progress3, $progress4, $progress5, $progress6, $progress7);
  # explanation of methods of REST service   
  if ($rest->method=='GET' && preg_match('/^\/$/',$rest->url)){
    print('<h1>Progress management system</h1>');
    print('<p>Append and progress and state count (number between 1 and XY) to progress_mgmt.php to retrieve the progress.</p>');
    print('<p>e.g. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/choreography/progress_mgmt.php/progress/0">progress/0</a>');
  }
  
  # case/operation to get authorname
  elseif ($rest->method=='GET' && preg_match('/^\/authorName\/?$/',$rest->url)){
	$author = new Author();
	if($rest->accept=='application/json') {
		print_r(json_encode($author));
    } else {
	   print('<p>Provided by you by '.$author -> givenName.' '.$author -> surName.' ('.$author -> MatrNr.')</br>Email: <a href="mailto:'.$author -> Email.'">'.$author -> Email.'</a> </p>'); 
    }
    

  }
  # case/operation to get all parts
  elseif ($rest->method=='GET' && preg_match('/^\/progress\/[0-9]+\/?$/',$rest->url)){
    $sp = explode('/',$rest->url);
    #var_dump($progress);
    $selectedStep = floatval($sp[2]);
    $currentStep = $progress[$selectedStep];
    header('Content-Type: application/json');
    //if($rest->accept=='application/json') {
      echo (json_encode($currentStep));
    /*} else {
	  print('<h1>Current step: '.($selectedStep).' of '.count($progress).'</h1>');
	  print('<p>Action: '.$currentStep['action'] .'</br>Duration: '.$currentStep['duration'].'</br>Tasktype: '.$currentStep['tasktype'].'</p>'); 
	  if ($selectedStep > 0) {
		  print('<a href="'.($selectedStep-1).'">Previous</a> ');
	  }
	  if ($selectedStep < count($progress)-1) {
		  print('<a href="'.($selectedStep+1).'">Next</a>');
	  }
	}*/

	
  }
  else {
	  print('This did not work out - go back to the <a href="http://wwwlab.cs.univie.ac.at/~a9902268/choreography/progress_mgmt.php/">start</a> ...');
  }
function findProductCategory($category, $inventory) {
    foreach ($inventory as $value) {
	    if ($category === $value->partid) {
		    return $value;
	    }
    }
    return false;
}

function findProductCategoryIndex($category, $inventory) {
	$counter = 0;
    foreach ($inventory as $value) {
	    if ($category === $value->partid) {
		    return $counter;
	    }
	    $counter++;
    }
    return false;
}
?>