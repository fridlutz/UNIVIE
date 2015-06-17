<?php
 function triggerProcess () {
   $eol = "\r\n";
   $mime_boundary=md5(time());
 
   $data = '';
   $data .= '--' . $mime_boundary . $eol;
   $data .= 'Content-Disposition: form-data; name="xml"; filename="produktion.xml"' . $eol;
   $data .= 'Content-Type: text/xml' . $eol;
   //$data .= 'CPEE_CALLBACK : true' . $eol;
   $data .= 'Content-Transfer-Encoding: base64' . $eol . $eol;
   $data .= chunk_split(base64_encode(file_get_contents('produktion.xml'))) . $eol; 
   $data .= "--" . $mime_boundary . "--" . $eol . $eol; 
 
   $opts = array('http' => array(
                   'method' => 'POST',
                   'header' => 'Content-Type: multipart/form-data; boundary=' . $mime_boundary . $eol,
                   'content' => $data
                ));
 
   header('content-type: text/plain');
   $context = stream_context_create($opts);
   $result = file_get_contents('http://cpee.org:9296',false,$context);
   
   return $result;
  }
?>