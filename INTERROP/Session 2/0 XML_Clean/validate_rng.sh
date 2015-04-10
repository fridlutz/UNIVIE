#!/bin/sh

# validate against RelaxNG Schema

xmllint --noout --relaxng baseXML_706_tranformed.rng baseXML_706_tranformed.xml 
