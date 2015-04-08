SELECT COURSEID, COUNT(COURSEID) AS LECTURERCOUNT FROM (

SELECT DISTINCT COURSEIDATTRVAL.INTEGERVALUE AS COURSEID, 
                STARTATTR.INTEGERVALUE AS STARTTIME,
                COURSENAMEVAL.STRINGVALUE AS COURSETITLE,
                ASSESSMENTATTRVAL.STRINGVALUE AS ASSESSMENTTYPE,
                COURSEWEEKHOURS.INTEGERVALUE AS COURSEWEEKHOURS,
                LECTURERNAMEVAL.STRINGVALUE AS LECTURERNAME
                
                
FROM EDGETABLE COURSE, 
     EDGETABLE GROUP, 
     EDGETABLE APPOINTMENT,
     EDGETABLE LECTURER, 
     EDGETABLE LECTURERNAMEATTR,
     EDGETABLE START,
     EDGETABLE COURSEIDATTR,
     EDGETABLE COURSENAMEATTR,
     EDGETABLE ASSESSMENTATTR,
     EDGETABLE COURSEWEEKHOURSATTR,
     EDGEVALUE_TABLE_INT STARTATTR,
     EDGEVALUE_TABLE_INT COURSEIDATTRVAL,
     EDGEVALUE_TABLE_INT COURSEWEEKHOURS,
     EDGEVALUE_TABLE_STRING COURSENAMEVAL,
     EDGEVALUE_TABLE_STRING ASSESSMENTATTRVAL,
     EDGEVALUE_TABLE_STRING LECTURERNAMEVAL
     
WHERE 
      -- get only starting from course tag
      COURSE.EDGENAME = 'course'
      -- join in the attribute @id
      AND COURSE.TARGETID = COURSEIDATTR.SOURCEID
      AND COURSEIDATTR.TARGETID = COURSEIDATTRVAL.INTEGERVALUEID      
      AND COURSEIDATTR.EDGENAME = '@id'
      -- join in the attribute @title
      AND COURSE.TARGETID = COURSENAMEATTR.SOURCEID
      AND COURSENAMEATTR.TARGETID = COURSENAMEVAL.STRINGVALUEID      
      AND COURSENAMEATTR.EDGENAME = '@title'
      -- join in the attribute @continousassessment
      AND COURSE.TARGETID = ASSESSMENTATTR.SOURCEID
      AND ASSESSMENTATTR.TARGETID = ASSESSMENTATTRVAL.STRINGVALUEID      
      AND ASSESSMENTATTR.EDGENAME = '@continousassessment'
      AND ASSESSMENTATTRVAL.STRINGVALUE = 'Yes'

      -- join in the attribute @weekhours
      AND COURSE.TARGETID = COURSEWEEKHOURSATTR.SOURCEID
      AND COURSEWEEKHOURSATTR.TARGETID = COURSEWEEKHOURS.INTEGERVALUEID
      AND COURSEWEEKHOURSATTR.EDGENAME = '@weekhours'
      -- join in the group tag
      AND COURSE.TARGETID = GROUP.SOURCEID
      AND GROUP.EDGENAME = 'group'
      -- join in the appointment
      AND GROUP.TARGETID = APPOINTMENT.SOURCEID
      AND APPOINTMENT.EDGENAME = 'appointment'
      -- join in the attribute @START_min
      AND APPOINTMENT.TARGETID = START.SOURCEID
      AND START.EDGENAME = '@start'
      AND START.TARGETID = STARTATTR.INTEGERVALUEID
      -- only get those that start later then 18:00
      AND STARTATTR.INTEGERVALUE > 1800
      -- join in the lecturer
      AND GROUP.TARGETID = LECTURER.SOURCEID
      AND LECTURER.EDGENAME = 'lecturer'
      -- join in the attribute @name
      AND LECTURER.TARGETID = LECTURERNAMEATTR.SOURCEID
      AND LECTURERNAMEATTR.EDGENAME = '@name'
      AND LECTURERNAMEATTR.TARGETID = LECTURERNAMEVAL.STRINGVALUEID
)
GROUP BY COURSEID
HAVING COUNT(COURSEID) = 1
;