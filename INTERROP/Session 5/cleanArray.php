<?php
	$allInstances = json_decode(file_get_contents('correlation_rules.json'), true);
	$count = 0;
	$elementKeyToDelete;
	foreach($allInstances as $value) {
		if ($value['pid']=='48f8f7364d7b574e1cd4f64bb583795e') {
			unset($allInstances[$count]);
			
		}
		$count = $count +1;
	}
	file_put_contents('correlation_rules.json', json_encode(array_values($allInstances)), LOCK_EX);
?>