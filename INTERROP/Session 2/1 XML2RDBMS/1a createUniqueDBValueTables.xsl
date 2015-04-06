<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml"/>

<xsl:key name="stringValues" match="value[@type='string']" use="." />
<xsl:key name="integerValues" match="value[@type='int']" use="." />
<xsl:template match="/">
<xsl:element name="values">
 <xsl:apply-templates select="//value[generate-id()=generate-id(key('stringValues', .)[1])]"/>
 <xsl:apply-templates select="//value[generate-id()=generate-id(key('integerValues', .)[1])]"/>
</xsl:element>
 </xsl:template>
 <xsl:template match="value">
 <xsl:copy-of select="."/>
 </xsl:template>
 <xsl:template match="text()"></xsl:template>
 
</xsl:stylesheet>





