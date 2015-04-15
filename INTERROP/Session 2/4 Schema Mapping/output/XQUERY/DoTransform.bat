@echo off

RaptorXML xquery --input="convertedXSDSchema_FIXED.xml" --output="Z:\INTERROP\Session 2\4 Schema Mapping\xsd_gruppe_14_FIXED.xml" --xml-validation-error-as-warning=true --output-encoding="UTF-8" --output-indent=true %* "MappingMapToxsd_gruppe_14_FIXED.xq"
IF ERRORLEVEL 1 EXIT/B %ERRORLEVEL%
