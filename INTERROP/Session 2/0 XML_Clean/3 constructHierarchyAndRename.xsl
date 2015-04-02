<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:variable name="rootChapterID" select="//chapter[@parentID='']/@id" />
		<xsl:variable name="rootChapterTitle" select="//chapter[@parentID='']/@titel" />
		<xsl:element name="studies">
			<xsl:attribute name="name">
		    <xsl:value-of select="$rootChapterTitle" />
		    </xsl:attribute>
			<xsl:attribute name="period">
		    <xsl:value-of select="//semester/@name" />
		  </xsl:attribute>
			<xsl:attribute name="numberOfStudyPrograms">		  
		  <xsl:value-of select="count(//chapter[@parentID=$rootChapterID])" />
		</xsl:attribute>
			<!-- resolve the hierarchy and pick values, on purpose done in for-each 
				loops -->
			<xsl:for-each select="//chapter[@parentID=$rootChapterID]">
				<xsl:element name="study">
					<xsl:variable name="studyID" select="@id" />
					<xsl:call-template name="writeTitleAndID" />
					<!-- retrieve all modules and list -->
					<xsl:for-each select="//chapter[@parentID=$studyID]">
						<xsl:element name="module">
							<xsl:variable name="moduleID" select="@id" />
							<xsl:call-template name="writeTitleAndID" />
							<!-- retrieve all categories for modules -->
							<xsl:for-each select="//chapter[@parentID=$moduleID]">
								<xsl:element name="category">
									<xsl:variable name="categoryID" select="@id" />
									<xsl:call-template name="writeTitleAndID" />
									<!-- retrieve all sub-categories for modules -->
									<xsl:for-each select="//chapter[@parentID=$categoryID]">
										<xsl:element name="sub-category">
											<xsl:variable name="subcategID" select="@id" />
											<xsl:call-template name="writeTitleAndID" />
										</xsl:element>
									</xsl:for-each>
								</xsl:element>
							</xsl:for-each>
						</xsl:element>
					</xsl:for-each>
				</xsl:element>
			</xsl:for-each>
		</xsl:element>
	</xsl:template>

	<xsl:template match="vlvz">
		<xsl:element name="course">
			<xsl:attribute name="id"><xsl:value-of select="@lvnr"/></xsl:attribute>
			<xsl:attribute name="ects"><xsl:value-of select="normalize-space(@ects)"/></xsl:attribute>
		</xsl:element>
	</xsl:template>
	<xsl:template name="writeTitleAndID">
		<xsl:attribute name="name"><xsl:value-of select="@titel" /></xsl:attribute>
		<xsl:attribute name="id"><xsl:value-of select="@id" /></xsl:attribute>
		<xsl:attribute name="parentID"><xsl:value-of select="@parentID" /></xsl:attribute>
		<xsl:apply-templates select="vlvz" />
	</xsl:template>
</xsl:stylesheet>