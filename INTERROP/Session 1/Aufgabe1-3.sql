DROP TABLE teilnehmerxml;
CREATE TABLE teilnehmerxml (TNNr INTEGER, Content XML); 
INSERT INTO TEILNEHMERXML VALUES(215, '<Teilnehmer><Name>Gerstner, M.</Name><Ort>Ulm</Ort></Teilnehmer>');;
SELECT * FROM teilnehmerxml;