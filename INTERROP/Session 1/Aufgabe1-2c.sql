SELECT 
XMLSERIALIZE( 
         XMLDOCUMENT( 
           XMLELEMENT( NAME "ANGEBOTE",
             XMLFOREST( FUEHRT_DURCH.ANGNR AS "ANGNR", FUEHRT_DURCH.KURSNR AS "KURSNR", KURSLEITER.PERSNR AS "KURSLEITER_PERSNR", KURSLEITER.NAME AS "KURSLEITER_NAME" )
           ) 
         ) 
       AS CLOB VERSION '1.0' INCLUDING XMLDECLARATION) 
FROM FUEHRT_DURCH, KURSLEITER 
WHERE FUEHRT_DURCH.PERSNR = KURSLEITER.PERSNR