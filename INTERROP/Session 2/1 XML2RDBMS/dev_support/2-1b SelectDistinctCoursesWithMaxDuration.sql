-- SELECT DISTINCT SOURCEIDs as COURSEIDs
SELECT DISTINCT E3.SOURCEID AS COURSEID 
FROM EDGETABLE E1
-- join in integer values
LEFT JOIN EDGEVALUE_TABLE_INT EVINT
ON E1.TARGETID = EVINT.INTEGERVALUEID
-- join in string values
LEFT JOIN EDGEVALUE_TABLE_STRING EVSTRING
ON E1.TARGETID = EVSTRING.STRINGVALUEID
-- join in parent level appointment
LEFT JOIN EDGETABLE E2
ON E1.SOURCEID = E2.TARGETID
-- join in parent level course
LEFT JOIN EDGETABLE E3
ON E2.SOURCEID = E3.TARGETID
-- filter with result of subquery to get thoe with max value.
WHERE E1.EDGENAME = '@duration_min' AND EVINT.INTEGERVALUE =
  -- find the max value for duration and filter the list then 
  (SELECT MAX(EDGEVALUE_TABLE_INT.INTEGERVALUE) FROM EDGETABLE
  INNER JOIN EDGEVALUE_TABLE_INT
  ON EDGETABLE.TARGETID = EDGEVALUE_TABLE_INT.INTEGERVALUEID
  WHERE EDGETABLE.EDGENAME = '@duration_min');