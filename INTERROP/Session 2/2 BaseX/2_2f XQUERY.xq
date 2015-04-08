for $group in collection("Z:\INTERROP\Session 2\2 BaseX\baseXML_tranformed.xml")//group
let $courseTitle := $group/../@title
let $id := $group/../@id
let $languages := $group//courselanguage
where data($languages) != "Englisch"
return <course>{$courseTitle}{$id}{$languages}</course>