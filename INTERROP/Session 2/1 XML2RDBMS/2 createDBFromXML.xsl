<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>
<xsl:strip-space elements="*" />
 <xsl:variable name="valueDocument" select="document('value_output_step2.xml')"/>
 <xsl:template match="/">

DROP TABLE EDGETABLE;
CREATE TABLE EDGETABLE (SOURCEID VARCHAR(20), ORDINAL INTEGER, EDGENAME VARCHAR(100), FLAG VARCHAR(30), TARGETID VARCHAR(20));
INSERT INTO EDGETABLE VALUES 
   <xsl:apply-templates select="studies"/>
;
 </xsl:template>
 
 <!-- create the hierarchical structure for the database of above -->
 <xsl:template match="*">
 <xsl:variable name="sourceID">
 <xsl:choose>
 <!-- if root node, make NULL -->
 <xsl:when test="not(ancestor::*[1])">NULL</xsl:when>
 <xsl:otherwise>
 <xsl:value-of select="generate-id(ancestor::*[1])"/>
 </xsl:otherwise>
 </xsl:choose>
 </xsl:variable>
 <xsl:variable name="edgename"><xsl:value-of select="name(.)"/></xsl:variable>
 <xsl:variable name="flag">ref</xsl:variable>
 <xsl:variable name="targetID">
  <xsl:value-of select="generate-id(.)"/>
 </xsl:variable>
 <xsl:variable name="ordinal">
 <xsl:value-of select="count(preceding-sibling::*)"/>
 </xsl:variable>
('<xsl:value-of select="$sourceID"/>', <xsl:value-of select="$ordinal"/>, '<xsl:value-of select="$edgename"/>', '<xsl:value-of select="$flag"/>', '<xsl:value-of select="$targetID"/>'),
   <!-- handle the value of the node -->
   <xsl:apply-templates select="text()"/>
   
   <!-- handle the attributes and text of the node as leafs -->
   
    <xsl:for-each select="text()|@*">
    <xsl:if test="string-length(.) > 0">
   <xsl:variable name="attrValueFlag">
   <xsl:choose>
   <xsl:when test="number(.)">int</xsl:when>
   <xsl:otherwise>string</xsl:otherwise>
   </xsl:choose>
   </xsl:variable>
    <xsl:variable name="textValue" select="."/>
    
    <xsl:variable name="tagname">
    <xsl:choose>
    <xsl:when test="name()"><xsl:value-of select="concat('@', name())"/></xsl:when>
    <xsl:otherwise>text</xsl:otherwise>    
    </xsl:choose>
    </xsl:variable>
    
('<xsl:value-of select="$targetID"/>', <xsl:value-of select="position()" />, '<xsl:value-of select="$tagname"/>', '<xsl:value-of select="concat($attrValueFlag,'Ref')"/>', '<xsl:value-of select="$valueDocument/values/value[. = $textValue]/@id"/>'),   
    
    </xsl:if>
    </xsl:for-each>
   
   
   <!-- move along the hierarchy of nodes and pick the next one -->
   <xsl:apply-templates match="child::*"/>
 </xsl:template>
 <xsl:template match="text()"></xsl:text> 
 <!-- String replace function -->
  <xsl:template name="string-replace-all">
    <xsl:param name="text"/>
    <xsl:param name="replace"/>
    <xsl:param name="by"/>
    <xsl:choose>
      <xsl:when test="contains($text, $replace)">
        <xsl:value-of select="substring-before($text,$replace)"/>
        <xsl:value-of select="$by"/>
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text" select="substring-after($text,$replace)"/>
          <xsl:with-param name="replace" select="$replace"/>
          <xsl:with-param name="by" select="$by"/>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$text"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
 
</xsl:stylesheet>





