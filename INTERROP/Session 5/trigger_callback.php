<?php
 function triggerCallback ($callback, $progressMessage) {
   $eol = "\r\n";
   $mime_boundary=md5(time());
 
   $data = '';
   $data .= '--' . $mime_boundary . $eol;
   $data .= 'Content-Type: application/json' . $eol;
   $data .= "--" . $mime_boundary . "--" . $eol . $eol; 
 
   $opts = array('http' => array(
                   'method' => 'PUT',
                   'header' => 'Content-Type: application/json' . $eol,
                   'content' => $progressMessage
                ));
 
   header('content-type: text/plain');
   $context = stream_context_create($opts);
   $result = file_get_contents($callback,false,$context);
   
   return $result;
  }
?>