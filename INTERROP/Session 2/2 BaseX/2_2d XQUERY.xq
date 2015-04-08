for $course in collection("Z:\INTERROP\Session 2\2 BaseX\baseXML_tranformed.xml")//course
let $courseTitle := $course/@title
let $id := $course/@id
where every $lecturerName in $course//lecturer satisfies starts-with($lecturerName/@name, "M")

return <course>{$courseTitle}{$id}</course>