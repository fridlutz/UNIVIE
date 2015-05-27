<?php
  include('rest_handle.php');
  $rest = handleREST($_SERVER,$_GET);
  class Author {
	   public $givenName = 'Wilfrid';
	   public $surName = 'Utz';
	   public $MatrNr = '9902268';
	   public $Email = 'a9902268@unet.univie.ac.at';
	   
   }
   class Order {
	   public $contact ='';
	   public $quantity =0;
	   public $casing = '';
	   public $agiator = '';
	   public $tub = '';
	   public $brandsticker = '';
	   public $motor = '';
	   public $controlpanel = '';
	   public $pcb = '';
   }
   $baseURL = 'http://wwwlab.cs.univie.ac.at/~a9902268/choreography/order_mgmt.php/';
   $inventory = json_decode(file_get_contents('inventory.json'), true);
   $contactPerson = array ('Oppermann Michael','Anderl Benjamin','Bueltmann Michael','Puhr Christoph','Stueckler Karl Hannes','Parg Manuel-Christopher','Gottwald Sabine','Daublebsky-Sterneck Amy','Sahann Raphael','Bellon Ekaterina','Borgova-Filipova Nelly','Dika Bujar','Begy Volodimir','Adamenko Aliaksandr','Domonkos David','Ehrlich Martin','Cachro Artur','Dinulovic Dominik','Morina Fitim','Miller Michelle','Omid Mani','Tamas Alexandra Madalina','Nabizai Arzo','Widenmaier Anna','Hoerbe Rainer','Utz Wilfrid','Isovic Sanjin','Avakumovic Milos','Byulbyulev Petar','Mustafayeva Gulchin','Atmaca Guelsah','Chavush Sibel Behich','Culha Merve Ceren','Zak Manuela','Rockenbauer Paul','Moser Christoph','Szvetits Michael','Tosidis Dimitrios','Kabiljagic Fata','Benjamin Ilg','Koenig Patrik','Michael Dirnberger','Ljaci Kujtim','Haunschmidt Christoph');
  # explanation of methods of REST service   
  if ($rest->method=='GET' && preg_match('/^\/$/',$rest->url)){
    print('<h1>Order management system</h1>');
    print('<p>Append order to order_mgmt.php to retrieve a random order from the system.</p>');
    print('<p>e.g. <a href="order">order</a></p>');
    
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
  elseif ($rest->method=='GET' && preg_match('/^\/order\/?$/',$rest->url)){
	$randomIndex= array_rand($contactPerson);
	$orderQuantity = rand (1, 100);
	#$casingType = 
	
	$randomOrder = new Order();
	
	$randomOrder -> contact = $contactPerson[$randomIndex];
	$randomOrder -> quantity = $orderQuantity;
	$randomOrder -> casing = array_rand($inventory[0]['quantities']);
	$randomOrder -> agiator = array_rand($inventory[1]['quantities']);
	$randomOrder -> tub = array_rand($inventory[2]['quantities']);
	$randomOrder -> brandsticker = array_rand($inventory[3]['quantities']);
	$randomOrder -> motor = array_rand($inventory[4]['quantities']);
	$randomOrder -> controlpanel = array_rand($inventory[5]['quantities']);  
	$randomOrder -> pcb = array_rand($inventory[6]['quantities']);
	if($rest->accept=='application/json') {
		print_r(json_encode($randomOrder));
	} else {
		print('<h1>Order details</h1>');
		print('<p>Contact: '.$randomOrder -> contact.'</br>');
		print('Quantity: '.$randomOrder -> quantity.'</br>');
		print('Casing: '.$randomOrder -> casing.'</br>');
		print('Agiator: '.$randomOrder -> agiator.'</br>');
		print('Tub: '.$randomOrder -> tub.'</br>');
		print('Brandsticker: '.$randomOrder -> brandsticker.'</br>');
		print('Motor: '.$randomOrder -> motor.'</br>');
		print('Controlpanel: '.$randomOrder -> controlpanel.'</br>');
		print('PCP: '.$randomOrder -> pcb.'</p>');
    }	  
  }
  else {
	  print('This did not work out - go back to the <a href="http://wwwlab.cs.univie.ac.at/~a9902268/choreography/order_mgmt.php/">start</a> ...');
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