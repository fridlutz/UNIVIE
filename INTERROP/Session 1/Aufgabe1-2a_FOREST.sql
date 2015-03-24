SELECT XMLSERIALIZE( 
         XMLDOCUMENT( 
           XMLELEMENT( NAME "TEILNEHMER", 
            XMLFOREST( TEILNEHMER.TNNR AS "TNNR", TEILNEHMER.NAME AS "NAME", TEILNEHMER.ORT AS "ORT" )
           ) 
         ) 
       AS CLOB VERSION '1.0' INCLUDING XMLDECLARATION)
FROM TEILNEHMER