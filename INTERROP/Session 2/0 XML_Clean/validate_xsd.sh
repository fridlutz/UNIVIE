#!/bin/sh

# validate against XML Schema

xmllint --noout --schema baseXML_706_tranformed.xsd baseXML_706_tranformed.xml 
