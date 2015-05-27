<?php
  include('rest_handle.php');
  $rest = handleREST($_SERVER,$_GET);
  class Author {
	   public $givenName = 'Wilfrid';
	   public $surName = 'Utz';
	   public $MatrNr = '9902268';
	   public $Email = 'a9902268@unet.univie.ac.at';
	   
   }
   class Error {
	   public $error = 0;
	   public $errorMessage = '';
   }
   $baseURL = 'http://wwwlab.cs.univie.ac.at/~a9902268/choreography/inventory_mgmt.php/';
   #$inventory = json_encode(file_get_contents('inventory.json'));
   $inventory = json_decode(file_get_contents('inventory.json'));
   
  # explanation of methods of REST service   
  if ($rest->method=='GET' && preg_match('/^\/$/',$rest->url)){
    print('<h1>Management services for washing machine production</h1>');
    print('<p>The company produces washing machines as licensed assembler for well-known brands such as AEG, BOSCH, etc.</br>');
    print('Inventory management service (these parts are on stock and can be used during assembly): <a href="inventory_mgmt.php/allparts">all</a></br>');
    print('To update, make a PUT on the resource as a form-encoded request with quantity = INTEGER</p>');
    
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
  elseif ($rest->method=='GET' && preg_match('/^\/allparts\/?$/',$rest->url)){
	if($rest->accept=='application/json') {
		print_r(json_encode($inventory));
	} else {
      print('<h1>Full inventory</h1>');
      foreach ($inventory as $value) {
	      print('<p><a href="parts/'.$value->partid.'">ID: '.$value->partid.'</a></br>');
	      print('Name: '.$value->fullname.'</br>');
	      print('Classification: '.$value->classification.'</p>');
	      print('<ul>');
	      while ($quantity = current($value->quantities)) {
		      print('<li><a href="parts/'.$value->partid.'/'.key($value->quantities).'">'.key($value->quantities).': '.$quantity.'</a></li>');
		      next($value->quantities);
          }
	      print('</ul>');
      }
    }

  }
  # case/operation to get specifics for one part category
  elseif ($rest->method=='GET' && preg_match('/^\/parts\/[a-z]+\/?$/',$rest->url)){
	$sp = explode('/',$rest->url);
	$selectedPartCategory = $sp[2];
	$product = findProductCategory($selectedPartCategory, $inventory);   
    if($rest->accept=='application/json') {
		if ($product) {
		   print_r ( json_encode(get_object_vars($product)));
		} 
    } else {
	  print('<h1>Inventory for part '.$selectedPartCategory.'</h1>');
	  if ($product) {
	      print('<p><a href="'.$product->partid.'">ID: '.$product->partid.'</a></br>');
	      print('Name: '.$product->fullname.'</br>');
	      print('Classification: '.$product->classification.'</p>');
	      print('<ul>');
	      while ($quantity = current($product->quantities)) {
		      print('<li><a href="'.$product->partid.'/'.key($product->quantities).'">'.key($product->quantities).': '.$quantity.'</a></li>');
		      next($product->quantities);
          }
	      print('</ul>');
	  }
	  else {
		  print('product not found in inventory');
	  }
    }
  }
  # case operation to get quantities for a specific part
  elseif ($rest->method=='GET' && preg_match('/^\/parts\/[a-z]+\/[A-Za-z0-9_.]+\/?$/',$rest->url)){	
    $sp = explode('/',$rest->url);
	$selectedPartCategory = $sp[2];
	$selectedPartClass = $sp[3];
	$product = findProductCategory($selectedPartCategory, $inventory);
	$quantity = findQuantity ($selectedPartClass, $product);

    if($rest->accept=='application/json') {
	  if ($quantity) {
		  print_r ($quantity);
	  }
    } else {
	  print('<h1>Quantity for part '.$selectedPartCategory.' for configuration '.$selectedPartClass.'</h1>');
	  if ($quantity) {
		  print($quantity);
	  }
	  else {
		  print ('Part type not available in stock.');
	  }
	  
    }
  }
  # case operation to put quantities for a specific part
  elseif ($rest->method=='PUT' && preg_match('/^\/parts\/[a-z]+\/[A-Za-z0-9_.]+\/?$/',$rest->url)) {	
    $sp = explode('/',$rest->url);
	$selectedPartCategory = $sp[2];
	$selectedPartClass = $sp[3];
	$product = findProductCategory($selectedPartCategory, $inventory);
	# this is to make sure that the array is associative, for the other parts another approach was chosen!
	$inventory_ass = json_decode(file_get_contents('inventory.json'), true);
    if ($product) {
	    $productIndex = findProductCategoryIndex($selectedPartCategory, $inventory);
	    $newQuantity = array_values($rest -> arguments)[0];
		$inventory_ass[$productIndex]['quantities'][$selectedPartClass] = floatval($newQuantity);
		#var_dump($inventory_ass[$productIndex]['quantities'][$selectedPartClass]);
	}
	file_put_contents('inventory.json', json_encode($inventory_ass));
	
  }
  else {
	  print('This did not work out - go back to the <a href="http://wwwlab.cs.univie.ac.at/~a9902268/choreography/inventory_mgmt.php/">start</a> ...');
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

function findQuantity($category, $product) {
   while ($quantity = current($product->quantities)) {
	   if (key($product->quantities) === $category) {
		   return $quantity;
	   }
	   next($product->quantities);
   }
   return false;
}

?>