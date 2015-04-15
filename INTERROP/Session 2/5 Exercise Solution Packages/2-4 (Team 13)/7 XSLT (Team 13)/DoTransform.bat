@echo off

RaptorXML xslt --xslt-version=1 --input="convertedXSDSchema_FIXED.xml" --output="Z:\INTERROP\Session 2\4 Schema Mapping\xsd_gruppe_14_FIXED.xml" --xml-validation-error-as-warning=true %* "MappingMapToxsd_gruppe_14_FIXED.xslt"
IF ERRORLEVEL 1 EXIT/B %ERRORLEVEL%
