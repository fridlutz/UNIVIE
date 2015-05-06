<?php
  include('rest_handle.php');
  $rest = handleREST($_SERVER,$_GET);
  class Author {
	   public $givenName = 'Wilfrid';
	   public $surName = 'Utz';
	   public $MatrNr = '9902268';
	   public $Email = 'a9902268@unet.univie.ac.at';
	   public $authorCalledService = '';
	   
   }
   class Conversion {
	   public $source;
	   public $target;
	   public $uri;
	   public $sourceValue = 1;
	   public $targetValue;
	   public $rate;
	   public $success = true;
	   public $error = 'ok';
   }
  $baseURL = 'http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/';
  # call the service that should be accessed and get the author information
  ini_set("soap.wsdl_cache_enabled","0");
  $client = new SoapClient('http://wwwlab.cs.univie.ac.at/~a0853423/soap/wsdl.xml',array('trace'=>1));
  
  # update to only use the currencies by the service provided.
  $currencyISOsSource = array('EUR');
  # TODO: dynamically read the list of support ISOs, this is currenly not feasible, since the return is not structured. 
  $currencyISOs = array('USD', 'JPY', 'CNY', 'CHF', 'SGD', 'AUD', 'RUB', 'CAD', 'HKD', 'NZD');
  # since we do not want to ask for all currency when doing a preview, we only select 10!
   $currencyConversionPreviewISOs = array('USD', 'JPY', 'CNY', 'CHF', 'SGD', 'AUD', 'RUB', 'CAD', 'HKD', 'NZD');
  
  # update that shit!
  if ($rest->method=='GET' && preg_match('/^\/$/',$rest->url)){
    print('<p> <b>Currency conversion (based on <a target="_blank" href="http://wwwlab.cs.univie.ac.at/~a0853423/soap/wsdl.xml">online service</a>)</b></p>');
    print('<p> Append /sourceISO to index.php, to get the currency details <br>Example EUR: <a href="http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/">http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/</a></p>');
    print('<p> Append /sourceISO/targetISO to index.php, to get the base rate for conversion <br>Example EUR->USD: <a href="http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/USD/">http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/USD/</a></p>');
    print('<p> Append /sourceISO/targetISO/sourceValue=[amountSOURCE] to index.php, to convert [amountSource] from [sourceISO] into [targetISO] <br>Example 100 EUR->USD: <a href="http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/USD/?sourceValue=100">http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/EUR/USD/?sourceValue=100</a></p>');
    print('<p> Append <a href="index.php/supportedCurrencies">/supportedCurrencies</a> to index.php, to get the list of all currency codes supported </p>');
    print('<p> Append <a href="index.php/matrix">/matrix</a> to index.php, to get the matrix of supported conversions </p>');
    print('<p> Append <a href="index.php/authorName">/authorName</a> to index.php, to get the name of the author </p>');
    print('<p> <b>The service only supports GET requests</b></p>');
    
    print('<p> <b>To get JSON returns, set header to "Accept: application/json"</b></p>');
    
    
  }
  
  # case/operation to get authorname, also show partner service author
  elseif ($rest->method=='GET' && preg_match('/^\/authorName\/?$/',$rest->url)){
	$author = new Author();
    $result = $client->getAuthor();
	#print_r($result);
	$author -> authorCalledService = $result;
	if($rest->accept=='application/json') {
		print_r(json_encode($author));
    } else {
	   print('<p>Provided by you by '.$author -> givenName.' '.$author -> surName.' ('.$author -> MatrNr.')</br>Email: <a href="mailto:'.$author -> Email.'">'.$author -> Email.'</a> </p><p>Service called provided by: '.$author -> authorCalledService.'</p>'); 
    }
    

  }
  # case/operation to get matrix, only show stuff that is supported by partner service
  elseif ($rest->method=='GET' && preg_match('/^\/matrix\/?$/',$rest->url)){
	if($rest->accept=='application/json') {
	  $result = array();
      foreach($currencyISOsSource as $currencyRow) {
	      foreach($currencyISOs as $currencyColumn) {
		      $convert = new Conversion();
		      $convert -> source = $currencyRow;
		      $convert -> target = $currencyColumn;
		      $convert -> uri = $baseURL.$currencyColumn.'/'.$currencyRow;
		      array_push($result, $convert);
	      }  
      }
      print_r(json_encode($result));
	} else {
      print('<p><b>Conversion matrix (click in matrix to get to base conversion from source -> row to target -> column)</b></p>');
      print('<table border=1>');
      # table header
      print('<tr>');
      print ('<td></td>');
      foreach ($currencyISOs as $currencyColumnFirst) {
	    print('<td>'.$currencyColumnFirst.'</td>');  
	  }
      print ('</tr>');
      foreach ($currencyISOsSource as $currencyRow) {
	    $row = $currencyRow;
	    print('<tr>');
	    print('<td>'.$currencyRow.'</td>');
        foreach ($currencyISOs as $currencyColumn) {
	      $column = $currencyColumn;
	        if ($row == $column) {
		      print('<td><a href="'.$row.'/'.$column.'">0</a></td>');
	        } else {
		      print('<td><a href="'.$row.'/'.$column.'">X</a></td>');
	        } 
        }
	    print('</tr>');
	  }   
      print('</table>');
    }

  }
  # case/operation to get supported currencies list
  elseif ($rest->method=='GET' && preg_match('/^\/supportedCurrencies\/?$/',$rest->url)){
    if($rest->accept=='application/json') {
		print_r(json_encode($currencyISOs));
    } else {
	  print('<p><b>The following currencies according to ISO4217 standard are supported:</b></p>');
      foreach ($currencyISOs as $currency) {
	    print('<a href="EUR/'.$currency.'">EUR->'.$currency.'</a><br>');
      }
    }
  }
  # case/operation to get details for a currency
  elseif ($rest->method=='GET' && preg_match('/^\/[A-Z]+\/?$/',$rest->url)){
	$sp = explode('/',$rest->url);
	$selectedSoureCurrency = $sp[1];
	$result = array();
	if($rest->accept=='application/json') {
	  foreach ($currencyConversionPreviewISOs as $currencyPreview) {
	    $convert = new Conversion();
	    $convert -> source = $selectedSoureCurrency;
	    $convert -> target = $currencyPreview;
	    $convert -> uri = $baseURL.$selectedSoureCurrency.'/'.$currencyPreview;
	    if (!in_array($selectedSoureCurrency,$currencyISOsSource)) {
	      $convert -> success = false;
	      $convert -> error = 'Not a valid currency';
	    } else {
		  $rate = $client->getCurrency(1, $currencyPreview)->Ergebnis;
		  $convert -> rate = $rate;
		  $convert -> sourceValue = 1;
		  $convert -> targetValue = $rate;
	    }
	    array_push($result, $convert);
	  }
		print_r(json_encode($result));
    } else {
	  print('<p><b>Currency details</b></p>');
      print('<p>Selected currency: '.$sp[1].'</p>');     
      if (in_array($selectedSoureCurrency,$currencyISOsSource)) {
	    print('<p>Currency is valid. <a href="http://en.wikipedia.org/wiki/'.$selectedSoureCurrency.'">wanna know more? (guessed Wiki Link)</a></p>');
	    # show some preview rates
	    print('<hr>');
	    print('<p><b>Preview conversion rate</b></p>');
	    foreach ($currencyConversionPreviewISOs as $currencyPreview) {
		  # calculate base rate, we can assume that all SRC and TRG are valid, since we check source and target is predefined
		  $rate = $client->getCurrency(1, $currencyPreview)->Ergebnis;
		  print('<a href="'.$selectedSoureCurrency.'/'.$currencyPreview.'">Rate: '.$selectedSoureCurrency.'->'.$currencyPreview.': '.(double)$rate.'<a/><br>');		    
	    }
	    # offer to get all base rates from source
	    /*print('<hr>');
	    foreach ($currencyISOs as $selectedCurrency) {
		  print('<a href="'.$selectedSoureCurrency.'/'.$selectedCurrency.'">Get rate: '.$selectedSoureCurrency.'->'.$selectedCurrency.'<br>');		    
	    }*/	    
      } else {
	    print('<p>Currency is NOT valid - check <a href="../supportedCurrencies">/supportedCurrencies</a></p>');
      }
    }
  }
  # case/operation to get conversion details and run it
  elseif ($rest->method=='GET' && preg_match('/^\/[A-Z]+\/[A-Z]+\/?$/',$rest->url)){
    $sp = explode('/',$rest->url);
    $selectSourceCurrency = $sp[1];
    $selectTargetCurrency = $sp[2];
    $sourceValid = in_array($selectSourceCurrency, $currencyISOsSource);
    $targetValid = in_array($selectTargetCurrency, $currencyISOs);
    $sourceValue = 1;
    $convert = new Conversion();
	$convert -> source = $selectSourceCurrency;
	$convert -> target = $selectTargetCurrency;
	$convert -> uri = $baseURL.$selectSourceCurrency.'/'.$selectTargetCurrency;  
    if (!$sourceValid or !$targetValid) {
	  $convert -> success = false;
	  $convert -> error = 'Not valid currencies';
	} else {
	  $rate = (double) $client->getCurrency(1, $selectTargetCurrency)->Ergebnis;
	  $convert -> rate = $rate;
	  
	  
      if (isset($rest -> arguments['sourceValue']) && !empty($rest -> arguments['sourceValue']) && is_numeric($rest -> arguments['sourceValue'])) {
          $sourceValue = $rest -> arguments['sourceValue'];
      }
      $convert -> sourceValue = $sourceValue;
      $convert -> targetValue = $sourceValue*(double)$rate;
	}
 
    if($rest->accept=='application/json') {
	  print_r(json_encode($convert));
	    
	} else {
	  print('<p><b>Currency details</b></p>');
      print('<p>Selected source currency: <a href="../'.$selectSourceCurrency.'">'.$selectSourceCurrency.'</a></p>');
      print('<p>Selected target currency: <a href="../'.$selectTargetCurrency.'">'.$selectTargetCurrency.'</a></p>');
      # check if SRC and TARGET are good
      if ($sourceValid and $targetValid) {
	    # calculate base rate, we can assume that all SRC and TRG are valid, since we check source and target is predefined
        $rate =  $client->getCurrency(1, $selectTargetCurrency)->Ergebnis;	 
        print('<a href="../'.$selectSourceCurrency.'/'.$selectTargetCurrency.'">Rate: '.$selectSourceCurrency.'->'.$selectTargetCurrency.': '.(double)$rate.'<a/><br>');
        # retrieve the amount to be converted - this is a parameter now
       
        if (isset($rest -> arguments['sourceValue']) && !empty($rest -> arguments['sourceValue']) && is_numeric($rest -> arguments['sourceValue'])) {
          $sourceValue = $rest -> arguments['sourceValue'];
        } else {
	      print('Resetting to 1, no value provided, or value not numeric.');
        }
        # calculate converted value
        $targetValue = (double)$rate*$sourceValue;
        print('<p>Source value in <a href="../'.$selectSourceCurrency.'">'.$selectSourceCurrency.'</a>: '.$sourceValue.'</p>');
        print('<p>Target value in <a href="../'.$selectTargetCurrency.'">'.$selectTargetCurrency.'</a>: '.$targetValue.'</p>');
        
        } else {
	      print('<p>One of the currencies is NOT valid - check <a href="../supportedCurrencies">/supportedCurrencies</a></p>');
      }
    }
  }
  else {
	  print('This did not work out - go back to the <a href="http://wwwlab.cs.univie.ac.at/~a9902268/phase2/index.php/">start</a> ...');
  }

?>