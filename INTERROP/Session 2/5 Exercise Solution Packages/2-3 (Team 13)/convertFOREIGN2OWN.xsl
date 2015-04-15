<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8"/>
<xsl:strip-space elements="*" />
<xsl:variable name="NA" select="'N/A'"/>
 <xsl:template match="/">
 <xsl:element name="studies">
      <xsl:attribute name="name">
        <xsl:value-of select="/course/name"/>
      </xsl:attribute>
      <xsl:attribute name="period">
        <xsl:value-of select="$NA"/>
      </xsl:attribute>
      <xsl:attribute name="numberOfStudyPrograms">
        <xsl:value-of select="1"/>
      </xsl:attribute>
      <!-- resolve the hierarchy and pick values, on purpose done in for-each 
				loops -->
      <xsl:for-each select="//course">
        <xsl:element name="study">
          <xsl:attribute name="name">
            <xsl:value-of select="name"/>
          </xsl:attribute>
          <xsl:attribute name="id">
            <xsl:value-of select="@id"/>
          </xsl:attribute>
          <xsl:attribute name="parentID">
            <xsl:value-of select="$NA"/>
          </xsl:attribute>
          <!-- retrieve all modules and list -->
          <xsl:for-each select=".//moduleclass">
            <xsl:element name="module">
           <xsl:attribute name="name">
            <xsl:value-of select="@name"/>
          </xsl:attribute>
          <xsl:attribute name="id">
            <xsl:value-of select="@id"/>
          </xsl:attribute>
          <xsl:attribute name="parentID">
            <xsl:value-of select="../@id"/>
          </xsl:attribute>
              <!-- retrieve all categories for modules -->
              <xsl:for-each select=".//modulegroup">
                <xsl:element name="category">
           <xsl:attribute name="name">
            <xsl:value-of select="@name"/>
          </xsl:attribute>
          <xsl:attribute name="id">
            <xsl:value-of select="@id"/>
          </xsl:attribute>
          <xsl:attribute name="parentID">
            <xsl:value-of select="../@id"/>
          </xsl:attribute>
                  <!-- retrieve all sub-categories for modules -->
                  <xsl:for-each select=".//module">
                    <xsl:element name="sub-category">
           <xsl:attribute name="name">
            <xsl:value-of select="@name"/>
          </xsl:attribute>
          <xsl:attribute name="id">
            <xsl:value-of select="@id"/>
          </xsl:attribute>
          <xsl:attribute name="parentID">
            <xsl:value-of select="../@id"/>
          </xsl:attribute>
<xsl:apply-templates select="lecture"/>
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
 <xsl:template match="lecture">
    <xsl:element name="course">
      <xsl:attribute name="id">
        <xsl:value-of select="@id"/>
      </xsl:attribute>
      <xsl:attribute name="name">
        <xsl:value-of select="@name"/>
      </xsl:attribute>
      <xsl:attribute name="title">
        <xsl:value-of select="@title"/>
      </xsl:attribute>
      <xsl:attribute name="type">
        <xsl:value-of select="@type"/>
      </xsl:attribute>
      <xsl:attribute name="groupcount">
        <xsl:value-of select="count(group)"/>
      </xsl:attribute>
      <xsl:attribute name="continousassessment">
        <xsl:choose>
          <xsl:when test="@attendance = 'Y'">Yes</xsl:when>
          <xsl:when test="@attendance = 'N'">No</xsl:when>
          <xsl:otherwise>NA</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="ects">
        <xsl:value-of select="normalize-space(@ects)"/>
      </xsl:attribute>
      <xsl:attribute name="weekhours">
        <xsl:value-of select="$NA"/>
      </xsl:attribute>
      <xsl:apply-templates select="institute"/>
      <xsl:apply-templates select="group"/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="institute">
    <xsl:attribute name="responsible_unit">
      <xsl:value-of select="."/>
    </xsl:attribute>
  </xsl:template>
  <xsl:template match="group">
    <xsl:element name="group">
      <xsl:attribute name="appointmentcount">
        <xsl:value-of select="count(duration)"/>
      </xsl:attribute>
      <xsl:attribute name="signlanguage">
        <xsl:choose>
          <xsl:when test="@signLanguage = 'Y'">Yes</xsl:when>
          <xsl:when test="@signLanguage = 'N'">No</xsl:when>
          <xsl:otherwise>NA</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="livestream">
        <xsl:choose>
          <xsl:when test="@livestream = 'Y'">Yes</xsl:when>
          <xsl:when test="@livestream = 'N'">No</xsl:when>
          <xsl:otherwise>NA</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="learningplatform">
        <xsl:value-of select="@plattform"/>
      </xsl:attribute>
      <xsl:attribute name="learningplatformurl">
        <xsl:value-of select="$NA"/>
      </xsl:attribute>
      <xsl:attribute name="block">
        <xsl:choose>
          <xsl:when test="@block = 'Y'">Yes</xsl:when>
          <xsl:when test="@block = 'N'">No</xsl:when>
          <xsl:otherwise>NA</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="duration_min_sum">
        <!-- pre-process the duration, later again in template to make sure that we have a nodeset of durations for summing up -->
        <xsl:call-template name="calculateOverallDuration">
          <xsl:with-param name="duration_sum_min" select="'0'"/>
          <xsl:with-param name="von_bis_nodeset" select="duration"/>
          <xsl:with-param name="currentPosition" select="1"/>
        </xsl:call-template>
      </xsl:attribute>
      <xsl:apply-templates select="duration"/>
      <xsl:apply-templates select="language"/>
      <xsl:apply-templates select="lecturer"/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="lecturer">
    <xsl:element name="lecturer">
      <xsl:attribute name="givenname">
        <xsl:value-of select="@firstname"/>
      </xsl:attribute>
      <xsl:attribute name="name">
        <xsl:value-of select="@lastname"/>
      </xsl:attribute>
      <xsl:attribute name="email">
        <xsl:value-of select="@email"/>
      </xsl:attribute>
      <xsl:attribute name="role">
        <xsl:value-of select="@rolePerson"/>
      </xsl:attribute>
    </xsl:element>
  </xsl:template>
  <xsl:template match="language">
    <xsl:element name="courselanguage">
      <xsl:value-of select="."/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="duration">
    <xsl:element name="appointment">
      <xsl:attribute name="date">
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text" select="@date"/>
          <xsl:with-param name="replace" select="' 00:00:00'"/>
          <xsl:with-param name="by" select="''"/>
        </xsl:call-template>
      </xsl:attribute>
      <xsl:attribute name="start">
        <xsl:value-of select="@begin"/>
      </xsl:attribute>
      <xsl:attribute name="end">
        <xsl:value-of select="@end"/>
      </xsl:attribute>
      <xsl:attribute name="duration_min">
        <xsl:variable name="starthour">
          <xsl:choose>
            <xsl:when test="string-length(@begin) = 3">
              <xsl:value-of select="number(substring(@begin,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@begin,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="startmin">
          <xsl:choose>
            <xsl:when test="string-length(@begin) = 3">
              <xsl:value-of select="number(substring(@begin,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@begin,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endhour">
          <xsl:choose>
            <xsl:when test="string-length(@end) = 3">
              <xsl:value-of select="number(substring(@end,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@end,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endmin">
          <xsl:choose>
            <xsl:when test="string-length(@end) = 3">
              <xsl:value-of select="number(substring(@end,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@end,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:value-of select="(60*$endhour + $endmin)- (60*$starthour + $startmin)"/>
      </xsl:attribute>
      <xsl:attribute name="room">
        <xsl:value-of select="@room"/>
      </xsl:attribute>
      <xsl:attribute name="zip">
        <xsl:value-of select="@zip"/>
      </xsl:attribute>
      <xsl:attribute name="city">
        <xsl:value-of select="@city"/>
      </xsl:attribute>
      <xsl:attribute name="roomnumber">
        <xsl:value-of select="@roomNr"/>
      </xsl:attribute>
      <xsl:attribute name="street">
        <xsl:value-of select="@street"/>
      </xsl:attribute>
    </xsl:element>
  </xsl:template>
 <xsl:template name="calculateOverallDuration">
    <xsl:param name="duration_sum_min"/>
    <xsl:param name="von_bis_nodeset"/>
    <xsl:param name="currentPosition"/>
    <xsl:choose>
      <xsl:when test="count ($von_bis_nodeset[$currentPosition]) =0">
        <xsl:value-of select="number(0)"/>
      </xsl:when>
      <xsl:otherwise>
        <xsl:variable name="nodeCount" select="count($von_bis_nodeset)"/>
        <xsl:variable name="starthour">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@begin) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@begin,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@begin,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="startmin">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@begin) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@begin,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@begin,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endhour">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@end) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@end,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@end,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endmin">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@end) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@end,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@end,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="intermediate_sum" select="$duration_sum_min + (60*$endhour + $endmin)- (60*$starthour + $startmin)"/>
        <xsl:choose>
          <xsl:when test="$nodeCount = $currentPosition">
            <xsl:value-of select="$intermediate_sum"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:call-template name="calculateOverallDuration">
              <xsl:with-param name="duration_sum_min" select="$intermediate_sum"/>
              <xsl:with-param name="von_bis_nodeset" select="$von_bis_nodeset"/>
              <xsl:with-param name="currentPosition" select="$currentPosition+1"/>
            </xsl:call-template>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
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





