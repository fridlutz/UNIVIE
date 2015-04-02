<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" />
	<xsl:strip-space elements="*" />
	<xsl:template match="@* | node()">
		<xsl:copy>
			<xsl:apply-templates select="@* | node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="chapter2|chapter3|chapter4|chapter5|chapter6">
		<xsl:variable name="currentLevel">
			<!-- perform a string replace to get the level as a number -->
			<xsl:call-template name="string-replace-all">
				<xsl:with-param name="text" select="name()" />
				<xsl:with-param name="replace" select="'chapter'" />
				<xsl:with-param name="by" select="''" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:element name="chapter">
			<xsl:attribute name="level">
			<xsl:value-of select="$currentLevel" />
				</xsl:attribute>
			<xsl:attribute name="parentLevel">
				<xsl:value-of select="number($currentLevel)-1" />
			</xsl:attribute>
			<xsl:apply-templates select="@* | node()" />
		</xsl:element>
	</xsl:template>
	<xsl:template match="level1|level2|level3|level4|level5|level6|level7">
		<!-- remove all level anchors -->
	</xsl:template>

	<!-- String replace function -->
	<xsl:template name="string-replace-all">
		<xsl:param name="text" />
		<xsl:param name="replace" />
		<xsl:param name="by" />
		<xsl:choose>
			<xsl:when test="contains($text, $replace)">
				<xsl:value-of select="substring-before($text,$replace)" />
				<xsl:value-of select="$by" />

				<xsl:call-template name="string-replace-all">
					<xsl:with-param name="text"
						select="substring-after($text,$replace)" />
					<xsl:with-param name="replace" select="$replace" />
					<xsl:with-param name="by" select="$by" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$text" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
</xsl:stylesheet>