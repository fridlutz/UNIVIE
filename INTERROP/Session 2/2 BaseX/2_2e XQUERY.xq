for $course in collection("Z:\INTERROP\Session 2\2 BaseX\baseXML_tranformed.xml")//course
let $courseTitle := $course/@title
let $id := $course/@id
where some $appointment in $course//appointment satisfies $appointment/@start < 1200

return <course>{$courseTitle}{$id}</course>