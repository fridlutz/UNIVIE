VALUES (
  XMLSERIALIZE (
    XMLDOCUMENT(
      XMLELEMENT( NAME "A", 
        XMLELEMENT( NAME "B", 'value')
      )
    )
  AS CLOB VERSION '1.0' INCLUDING XMLDECLARATION
  )
);