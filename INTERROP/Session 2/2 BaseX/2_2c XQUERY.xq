for $studies in collection("Z:\INTERROP\Session 2\2 BaseX\baseXML_tranformed.xml")//studies
let $studyCount := count ($studies//study)
let $moduleCount :=count($studies//module)
return <result studyCount="{$studyCount}" moduleCount="{$moduleCount}"></result>