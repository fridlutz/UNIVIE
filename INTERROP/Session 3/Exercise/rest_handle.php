<?php
 function handleREST($server,$get) {
   $url = (array_key_exists('PATH_INFO',$server) ? $server['PATH_INFO'] : '/');
   $method = $server['REQUEST_METHOD'];
   parse_str(file_get_contents('php://input'),$contentargs);
   $arguments = array_merge($get,$contentargs);
   $accept = array_key_exists('HTTP_ACCEPT',$server) ? $server['HTTP_ACCEPT'] : '*/*';
   class Author {
	   public $givenName = "Wilfrid";
	   public $surName = "Utz";
	   public $MatrNr = "9902268";
	   
   }
   class Conversion {
	   public $sourceCurrency = "EUR"; # defaulting to EUR
	   public $targetCurrency = "USD"; # defaulting to USD
	   public $sourceValue = 0;
	   public $targetValue = 0;
	   public $rate = 0;
	   public $success = true;
	   public $errorMessage = "";
   }

   
   
   $ret = new StdClass;
   $ret->url = $url;
   $ret->method = $method;
   $ret->arguments = $arguments;
   $ret->accept = $accept;

   #return $ret->url;
   #return json_encode($ret);
   if ($url == "/authorname") {
	  return json_encode(new Author());
	
   }
   elseif ($url == "/convert") {
	  #create new object
	  $conversion = new Conversion();
	  $conversion ->  sourceCurrency = $arguments['sourceCurrency'];
	  $conversion ->  targetCurrency = $arguments['targetCurrency'];
	  
	  
	  if (!is_numeric($arguments['sourceValue'])) {	    
	    $conversion ->  success = false;
	    $conversion ->  errorMessage = 'Exception input value not a number! Check your number';
	  }
	  else {
	  $conversion ->  sourceValue = $arguments['sourceValue'];
	  #get conversion rate
	  try {
		  #prefixed, to prevent any errors, we catch errors afterwards
    $rate = new SimpleXMLElement(@file_get_contents('http://www.webservicex.net/currencyconvertor.asmx/ConversionRate?FromCurrency='.$arguments['sourceCurrency'].'&ToCurrency='.$arguments['targetCurrency']));	  
	  $conversion -> rate = (double)$rate;
   } catch (Exception $e) {
	   $conversion ->  success = false;
	   $conversion ->  errorMessage = 'Exception when finding the rate - check your source and target currency codes';
}
	# calculate the conversion
	$conversion ->  targetValue = $conversion ->  sourceValue*$conversion -> rate;
   }
   return json_encode($conversion);
   } 
   
   return $ret;
 }
?>