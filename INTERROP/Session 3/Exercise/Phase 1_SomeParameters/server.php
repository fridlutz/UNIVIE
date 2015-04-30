<?php
  include('rest_handle.php');
  $rest = handleREST($_SERVER,$_GET);
  if ($rest)
  print_r($rest);
?>