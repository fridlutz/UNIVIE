<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <xsl:variable name="rootChapterID" select="//chapter[@parentID='']/@id"/>
    <xsl:variable name="rootChapterTitle" select="//chapter[@parentID='']/@titel"/>
    <xsl:element name="studies">
      <xsl:attribute name="name">
        <xsl:value-of select="$rootChapterTitle"/>
      </xsl:attribute>
      <xsl:attribute name="period">
        <xsl:value-of select="//semester/@name"/>
      </xsl:attribute>
      <xsl:attribute name="numberOfStudyPrograms">
        <xsl:value-of select="count(//chapter[@parentID=$rootChapterID])"/>
      </xsl:attribute>
      <!-- resolve the hierarchy and pick values, on purpose done in for-each 
				loops -->
      <xsl:for-each select="//chapter[@parentID=$rootChapterID]">
        <xsl:element name="study">
          <xsl:variable name="studyID" select="@id"/>
          <xsl:call-template name="writeTitleAndID"/>
          <!-- retrieve all modules and list -->
          <xsl:for-each select="//chapter[@parentID=$studyID]">
            <xsl:element name="module">
              <xsl:variable name="moduleID" select="@id"/>
              <xsl:call-template name="writeTitleAndID"/>
              <!-- retrieve all categories for modules -->
              <xsl:for-each select="//chapter[@parentID=$moduleID]">
                <xsl:element name="category">
                  <xsl:variable name="categoryID" select="@id"/>
                  <xsl:call-template name="writeTitleAndID"/>
                  <!-- retrieve all sub-categories for modules -->
                  <xsl:for-each select="//chapter[@parentID=$categoryID]">
                    <xsl:element name="sub-category">
                      <xsl:variable name="subcategID" select="@id"/>
                      <xsl:call-template name="writeTitleAndID"/>
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
      <xsl:attribute name="id">
        <xsl:value-of select="@lvnr"/>
      </xsl:attribute>
      <xsl:attribute name="name">
        <xsl:value-of select="@kurztitel_en"/>
      </xsl:attribute>
      <xsl:attribute name="title">
        <xsl:value-of select="@langtitel_en"/>
      </xsl:attribute>
      <xsl:attribute name="type">
        <xsl:value-of select="@typ"/>
      </xsl:attribute>
      <xsl:attribute name="groupcount">
        <xsl:value-of select="count(gruppen)"/>
      </xsl:attribute>
      <xsl:attribute name="continousassessment">
        <xsl:choose>
          <xsl:when test="@pruefungsimmanent = 'Y'">Yes</xsl:when>
          <xsl:when test="@pruefungsimmanent = 'N'">No</xsl:when>
          <xsl:otherwise>NA</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="ects">
        <xsl:value-of select="normalize-space(@ects)"/>
      </xsl:attribute>
      <xsl:attribute name="weekhours">
        <xsl:value-of select="@wochenstunden"/>
      </xsl:attribute>
      <xsl:apply-templates select="institut"/>
      <xsl:apply-templates select="gruppen"/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="institut">
    <xsl:attribute name="responsible_unit">
      <xsl:value-of select="@institut"/>
    </xsl:attribute>
  </xsl:template>
  <xsl:template match="gruppen">
    <xsl:element name="group">
      <xsl:attribute name="appointmentcount">
        <xsl:value-of select="count(von_bis)"/>
      </xsl:attribute>
      <xsl:attribute name="signlanguage">
        <xsl:choose>
          <xsl:when test="@gebaerdensprache = 'Y'">Yes</xsl:when>
          <xsl:when test="@gebaerdensprache = 'N'">No</xsl:when>
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
        <xsl:value-of select="@kurs_link"/>
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
          <xsl:with-param name="von_bis_nodeset" select="von_bis"/>
          <xsl:with-param name="currentPosition" select="1"/>
        </xsl:call-template>
      </xsl:attribute>
      <xsl:apply-templates select="von_bis"/>
      <xsl:apply-templates select="unterrichtssprachen"/>
      <xsl:apply-templates select="vortragende"/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="vortragende">
    <xsl:element name="lecturer">
      <xsl:attribute name="givenname">
        <xsl:value-of select="@vorname"/>
      </xsl:attribute>
      <xsl:attribute name="name">
        <xsl:value-of select="@zuname"/>
      </xsl:attribute>
      <xsl:attribute name="email">
        <xsl:value-of select="@email"/>
      </xsl:attribute>
      <xsl:attribute name="role">
        <xsl:value-of select="@rolle_person"/>
      </xsl:attribute>
    </xsl:element>
  </xsl:template>
  <xsl:template match="unterrichtssprachen">
    <xsl:element name="courselanguage">
      <xsl:value-of select="."/>
    </xsl:element>
  </xsl:template>
  <xsl:template match="von_bis">
    <xsl:element name="appointment">
      <xsl:attribute name="date">
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text" select="@datum"/>
          <xsl:with-param name="replace" select="' 00:00:00'"/>
          <xsl:with-param name="by" select="''"/>
        </xsl:call-template>
      </xsl:attribute>
      <xsl:attribute name="start">
        <xsl:value-of select="@beginn"/>
      </xsl:attribute>
      <xsl:attribute name="end">
        <xsl:value-of select="@ende"/>
      </xsl:attribute>
      <xsl:attribute name="duration_min">
        <xsl:variable name="starthour">
          <xsl:choose>
            <xsl:when test="string-length(@beginn) = 3">
              <xsl:value-of select="number(substring(@beginn,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@beginn,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="startmin">
          <xsl:choose>
            <xsl:when test="string-length(@beginn) = 3">
              <xsl:value-of select="number(substring(@beginn,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@beginn,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endhour">
          <xsl:choose>
            <xsl:when test="string-length(@ende) = 3">
              <xsl:value-of select="number(substring(@ende,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@ende,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endmin">
          <xsl:choose>
            <xsl:when test="string-length(@ende) = 3">
              <xsl:value-of select="number(substring(@ende,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring(@ende,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:value-of select="(60*$endhour + $endmin)- (60*$starthour + $startmin)"/>
      </xsl:attribute>
      <xsl:attribute name="room">
        <xsl:value-of select="@kurzraumname"/>
      </xsl:attribute>
      <xsl:attribute name="zip">
        <xsl:value-of select="@plz"/>
      </xsl:attribute>
      <xsl:attribute name="city">
        <xsl:value-of select="@ort"/>
      </xsl:attribute>
      <xsl:attribute name="roomnumber">
        <xsl:value-of select="@raumnummer"/>
      </xsl:attribute>
      <xsl:attribute name="street">
        <xsl:value-of select="@strasse"/>
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
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@beginn) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@beginn,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@beginn,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="startmin">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@beginn) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@beginn,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@beginn,3, 4))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endhour">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@ende) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@ende,1, 1))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@ende,1, 2))"/>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:variable>
        <xsl:variable name="endmin">
          <xsl:choose>
            <xsl:when test="string-length($von_bis_nodeset[$currentPosition]/@ende) = 3">
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@ende,2, 3))"/>
            </xsl:when>
            <xsl:otherwise>
              <xsl:value-of select="number(substring($von_bis_nodeset[$currentPosition]/@ende,3, 4))"/>
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
  <xsl:template name="writeTitleAndID">
    <xsl:attribute name="name">
      <xsl:value-of select="@titel"/>
    </xsl:attribute>
    <xsl:attribute name="id">
      <xsl:value-of select="@id"/>
    </xsl:attribute>
    <xsl:attribute name="parentID">
      <xsl:value-of select="@parentID"/>
    </xsl:attribute>
    <xsl:apply-templates select="vlvz"/>
  </xsl:template>
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
