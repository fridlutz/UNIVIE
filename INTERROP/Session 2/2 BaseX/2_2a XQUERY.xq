for $course in collection("Z:\INTERROP\Session 2\2 BaseX\baseXML_tranformed.xml")//course
let $courseTitle := $course/@title
let $moduleName := $course/ancestor::module[1]/@name
let $appointments := $course//appointment
return <course>{$courseTitle}{$moduleName}{$appointments}</course>