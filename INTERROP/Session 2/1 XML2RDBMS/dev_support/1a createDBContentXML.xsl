<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>
<xsl:strip-space elements="*" />
<xsl:variable name="valueDocument" select="document('value_output_step2_pretty.xml')"/>


<xsl:template match="*">
  <xsl:variable name="currentNode" select="."/>
  <xsl:for-each select="text()|@*">
  <xsl:if test="string-length(.) > 0">
    <xsl:variable name="textValue" select="."/>
    #<xsl:value-of select="."/>#<!--<xsl:value-of select="$valueDocument/values/value[. = $textValue]/@id"/>#-->
    </xsl:if>
  </xsl:for-each>
  <xsl:apply-templates select="child::*"/>
</xsl:template> 


</xsl:stylesheet>





