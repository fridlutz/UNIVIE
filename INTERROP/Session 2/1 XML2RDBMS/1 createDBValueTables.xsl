<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml"/>
<xsl:strip-space elements="*" />

 <xsl:template match="/">
 <xsl:element name="values">
   <xsl:apply-templates select="studies"/>
 </xsl:element>
 </xsl:template>
 
 <xsl:template match="*">
 <xsl:for-each select="./@*">
   <xsl:element name="value">
   <xsl:attribute name="type">
   <xsl:choose>
   <xsl:when test="number(.)">int</xsl:when>
   <xsl:otherwise>string</xsl:otherwise>
   </xsl:choose>
   
   </xsl:attribute>
   <xsl:attribute name="id"><xsl:value-of select="generate-id(.)"/></xsl:attribute>
   <xsl:attribute name="attributename"><xsl:value-of select="name()"/></xsl:attribute>
   <xsl:value-of select="."/>
   </xsl:element>
   </xsl:for-each>
     <!--<xsl:apply-templates select="text()"/>-->
     <xsl:apply-templates match="child::*"/>
 </xsl:template>

<xsl:template match ="text()">
 <xsl:if test="string-length(.) != 0">
   <xsl:element name="value">
   <xsl:attribute name="type">
   <xsl:choose>
   <xsl:when test="number(.)">int</xsl:when>
   <xsl:otherwise>string</xsl:otherwise>
   </xsl:choose>
   </xsl:attribute>
   <xsl:attribute name="id"><xsl:value-of select="generate-id(.)"/></xsl:attribute>
   <xsl:attribute name="attributename"><xsl:value-of select="name(../.)"/></xsl:attribute>
     <xsl:value-of select="."/>
   </xsl:element>
</xsl:if>
</xsl:template>
 
 <!--<xsl:template match="text()">
 <xsl:if test="string-length(text()) != 0">
 NON-EMPTY NODE
 </xsl:if>
 
 </xsl:template>-->
 
</xsl:stylesheet>





