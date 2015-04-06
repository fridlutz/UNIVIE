<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>
<xsl:strip-space elements="*" />
<xsl:template match="/">

DROP TABLE EDGEVALUE_TABLE_STRING;
DROP TABLE EDGEVALUE_TABLE_INT;
CREATE TABLE EDGEVALUE_TABLE_STRING (STRINGVALUEID VARCHAR(20), STRINGVALUE VARCHAR(500));
CREATE TABLE EDGEVALUE_TABLE_INT (STRINFGALUEID VARCHAR(20), INTEGERVALUE INTEGER);

INSERT INTO EDGEVALUE_TABLE_STRING VALUES
<xsl:for-each select="//value[@type='string']">
<xsl:variable name="apos">'</xsl:variable>
<xsl:variable name="stringValue">
<xsl:call-template name="string-replace-all">
    <xsl:with-param name="text" select="."/>
    <xsl:with-param name="replace" select="$apos"/>
    <xsl:with-param name="by" select="concat($apos, '', $apos)"/>
</xsl:call-template>
</xsl:variable>

('<xsl:value-of select="@id"/>', '<xsl:value-of select="$stringValue"/>')
<xsl:if test="not(position() = last())">,</xsl:if>
</xsl:for-each>
;
INSERT INTO EDGEVALUE_TABLE_INT VALUES
<xsl:for-each select="//value[@type='int']">
<xsl:variable name="apos">'</xsl:variable>
('<xsl:value-of select="@id"/>', <xsl:value-of select="."/>)
<xsl:if test="not(position() = last())">,</xsl:if>
</xsl:for-each>
;

 </xsl:template>
 <xsl:template match="text()"></xsl:template>
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





