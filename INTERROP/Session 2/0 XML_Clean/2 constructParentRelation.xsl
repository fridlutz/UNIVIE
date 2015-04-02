<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="@* | node()">
		<xsl:copy>
			<xsl:apply-templates select="@* | node()" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="chapter">
		<xsl:variable name="currentLevel" select="@level" />
		<xsl:variable name="parentLevel" select="@parentLevel" />
		<xsl:element name="chapter">
			<xsl:attribute name="parentID">
			<xsl:value-of select="preceding-sibling::chapter[@level = $parentLevel][1]/@id" />
			</xsl:attribute>
			<xsl:apply-templates select="@* | node()" />
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>