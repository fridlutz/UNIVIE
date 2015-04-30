<?php
# get path info, validate if a convert should be done
$path_info = !empty($_SERVER['PATH_INFO']) ? $_SERVER['PATH_INFO'] : (!empty($_SERVER['ORIG_PATH_INFO']) ? $_SERVER['ORIG_PATH_INFO'] : '');
if ($path_info == '/convert' or $path_info == '/authorname') {
    # validate if all parameters are provided!
    if ($path_info == '/convert'  && isset($_GET['sourceValue']) && !empty($_GET['sourceValue']) && isset($_GET['sourceCurrency']) && !empty($_GET['sourceCurrency']) && isset($_GET['targetCurrency']) && !empty($_GET['targetCurrency'])) {
        $requestParameter = array(
            'sourceValue' => $_GET['sourceValue'],
            'sourceCurrency' => $_GET['sourceCurrency'],
            'targetCurrency' => $_GET['targetCurrency']
        );
        $data = http_build_query($requestParameter);
    } 
    elseif ($path_info == '/authorname') {
	    $data = null;
    }
    
    else {
        $data = null;
        print_r('<b>You did not provide the necessary input for execution ... please provide the following GET parameters: sourceValue, sourceCurrency (in ISO4217 format/code), targetCurrency (in ISO4217 format/code)</b><br><br>Example:<br><a href="convert?sourceValue=100&sourceCurrency=USD&targetCurrency=EUR">100 bucks in EUR (http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=USD&targetCurrency=EUR)</a><br><br> or do you want to know <a href="authorname">who I</a> am?');
        exit();
    }
    



$opts = array(
    'http' => array(
        'method' => 'GET',
        'header' => "Content-type: application/x-www-form-urlencoded\r\n" . "accept: application/json\r\n",
        'content' => $data
    )
);
# only query the server, if convert to author
header('content-type: text/plain');
$context = stream_context_create($opts);

$result = file_get_contents('http://wwwlab.cs.univie.ac.at/~a9902268/server.php' . $path_info, false, $context);

print_r($result);
}
else {
	print_r('<b>Unsupported operation "'.$path_info.'"</b><br><br>The service supports <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert">/convert</a> and <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/authorname">/authorname</a><br><br>For conversion, it works bidirectional (a bit of an extension to the assignment) for the currencies listed here: <a href="http://www.webservicex.net/currencyconvertor.asmx?op=ConversionRate">http://www.webservicex.net/currencyconvertor.asmx?op=ConversionRate</a><br><br>
Examples:<br>
1. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=USD">100 EUR -> USD</a><br>
2. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=JPY">100 EUR -> JPY</a><br>
3. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=CNY">100 EUR -> CNY</a><br>
4. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=CHF">100 EUR -> CHF</a><br>
5. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=BIF">100 EUR -> BIF</a><br>
6. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=CAD">100 EUR -> CAD</a><br>
7. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=ILS">100 EUR -> ILS</a><br>
8. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=GYD">100 EUR -> GYD</a><br>
9. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=MOP">100 EUR -> MOP</a><br>
10. <a href="http://wwwlab.cs.univie.ac.at/~a9902268/client.php/convert?sourceValue=100&sourceCurrency=EUR&targetCurrency=PGK">100 EUR -> PGK</a><br><br><br> Source code: <a href="https://github.com/fridlutz/UNIVIE/tree/master/INTERROP/Session%203/Exercise">here</a>');

}

?>