<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" encoding="UTF-8"/>
<xsl:strip-space elements="*" />
<xsl:variable name="NA" select="'N/A'"/>
 <xsl:template match="/">
 <!-- since the OWN file contains more than one study and the FOREIGN structure allows only 1, we select the first study available -->
   <xsl:variable name="study" select="//study[3]"/>
   <xsl:element name="course">
   <xsl:attribute name="id"><xsl:value-of select="$study/@id"/></xsl:attribute>
   <xsl:element name="name"><xsl:value-of select="$study/@name"/></xsl:element>
   <xsl:element name="description"><xsl:comment>This information is not available in source.</xsl:comment></xsl:element>
   <!-- add a moduleclass for each module node -->
   <xsl:apply-templates select="$study//module"/>
   </xsl:element>
 </xsl:template>
 <!-- match the module -->
 <xsl:template match="module">
 <xsl:element name="moduleclass">
   <xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
   <xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
   <xsl:apply-templates select=".//category"/>
 </xsl:element> 
 </xsl:template>
  <!-- match the category -->
 <xsl:template match="category">
 <xsl:element name="modulegroup">
   <xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
   <xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
   <!-- since the sub structure of a module as suggested by the foreign xml is not available for all courses, an empty module element is creates in case of no sub-category node -->
   <xsl:choose>
     <xsl:when test="not(.//sub-category)">
       <xsl:element name="module">
         <!-- since no sub category in OWN, we redundantyl use name and id from modulegroup-->
         <xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
         <xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
         <xsl:element name="description"><xsl:comment>This information is not available in source.</xsl:comment></xsl:element>
         <xsl:apply-templates select=".//course"/>
       </xsl:element>
     </xsl:when>
     <xsl:otherwise>
       <xsl:apply-templates select=".//sub-category"/>
     </xsl:otherwise> 
   </xsl:choose>
   
 </xsl:element> 
 </xsl:template>
 
  <!-- match the category -->
 <xsl:template match="sub-category">
 <xsl:element name="module">
   <xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
   <xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
   <xsl:element name="description"><xsl:comment>This information is not available in source.</xsl:comment></xsl:element>
   <xsl:apply-templates select=".//course"/>
 </xsl:element> 
 </xsl:template>
 
 <!-- match the course part -->
 <xsl:template match="course">
   <xsl:element name="lecture">
     <xsl:attribute name="ects"><xsl:value-of select="@ects"/></xsl:attribute>
     <xsl:attribute name="title"><xsl:value-of select="@title"/></xsl:attribute>
     <xsl:attribute name="name"><xsl:value-of select="@name"/></xsl:attribute>
     <xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
     <xsl:attribute name="attendance"><xsl:value-of select="@continousassessment"/></xsl:attribute>
     <xsl:attribute name="type"><xsl:value-of select="@type"/></xsl:attribute>
     <xsl:apply-templates select=".//group"/> 
     <xsl:element name="institute"><xsl:value-of select="@responsible_unit"/></xsl:element>  
   </xsl:element>
 </xsl:template>
 
 <xsl:template match="group">
 <xsl:element name="group">
   <xsl:attribute name="id"><xsl:value-of select="$NA"/></xsl:attribute>
   <xsl:attribute name="remark"><xsl:value-of select="$NA"/></xsl:attribute>
   <xsl:attribute name="block"><xsl:value-of select="@block"/></xsl:attribute>
   <xsl:attribute name="startDate"><xsl:value-of select=".//appointment[1]/@date"/></xsl:attribute>
   <xsl:attribute name="signLanguage"><xsl:value-of select="@signlanguage"/></xsl:attribute>
   <xsl:attribute name="lastDate"><xsl:value-of select=".//appointment[last()]/@date"/></xsl:attribute>
   <xsl:attribute name="livestream"><xsl:value-of select="@livestream"/></xsl:attribute>
   <xsl:attribute name="plattform"><xsl:value-of select="@learningplatformurl"/></xsl:attribute>
   <xsl:apply-templates select=".//appointment"/>
   <xsl:apply-templates select=".//lecturer"/>
   <xsl:apply-templates select=".//courselanguage"/>
 </xsl:element> 
 </xsl:template>
 
 <xsl:template match="appointment">
   <xsl:element name="duration">
     <xsl:attribute name="id"><xsl:value-of select="$NA"/></xsl:attribute>
     <xsl:attribute name="begin"><xsl:value-of select="@start"/></xsl:attribute>
     <xsl:attribute name="date"><xsl:value-of select="@date"/></xsl:attribute>
     <xsl:attribute name="end"><xsl:value-of select="@end"/></xsl:attribute>
     <xsl:attribute name="room"><xsl:value-of select="@room"/></xsl:attribute>
     <xsl:attribute name="city"><xsl:value-of select="@city"/></xsl:attribute>
     <xsl:attribute name="zip"><xsl:value-of select="@zip"/></xsl:attribute>
     <xsl:attribute name="roomNr"><xsl:value-of select="@roomnumber"/></xsl:attribute>
     <xsl:attribute name="street"><xsl:value-of select="@street"/></xsl:attribute>
   </xsl:element>
 </xsl:template>
 
 <xsl:template match="lecturer">
   <xsl:element name="lecturer">
     <xsl:attribute name="id"><xsl:value-of select="$NA"/></xsl:attribute>
     <xsl:attribute name="email"><xsl:value-of select="@email"/></xsl:attribute>
     <xsl:attribute name="rolePerson"><xsl:value-of select="@role"/></xsl:attribute>
     <xsl:attribute name="rolePersonNr"><xsl:value-of select="$NA"/></xsl:attribute>
     <xsl:attribute name="firstname"><xsl:value-of select="@givenname"/></xsl:attribute>
     <xsl:attribute name="lastname"><xsl:value-of select="@name"/></xsl:attribute>
   </xsl:element>
 </xsl:template>
 
 <xsl:template match="courselanguage">
   <xsl:element name="language"><xsl:value-of select="."/>
   </xsl:element>
 
 </xsl:template>
</xsl:stylesheet>





