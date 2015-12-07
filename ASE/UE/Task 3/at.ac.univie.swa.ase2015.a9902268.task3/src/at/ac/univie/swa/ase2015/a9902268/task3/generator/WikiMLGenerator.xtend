/*
 * generated by Xtext
 */
package at.ac.univie.swa.ase2015.a9902268.task3.generator

import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AboutTemplate
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractFormattedInlineContent
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AbstractUnformattedInlineContent
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyText
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.AnyTextSequence
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.BlockQuote
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Bold
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Category
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.External
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading2
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading3
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading4
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Heading5
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.HyperLink
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Internal
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Italic
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ItalicBold
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.MainTemplate
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderListItem
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.OrderedList
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Paragraph
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.ParagraphTypes
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.QuoteTemplate
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Template
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Text
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderListItem
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.UnorderedList
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.WikiPage
import java.net.URLEncoder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.univie.swa.ase2015.a9902268.task3.wikiML.Image

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WikiMLGenerator implements IGenerator {
	
	
//FIXME: trailing space for formatting and links
//sources used: https://www.mediawiki.org/wiki/Markup_spec/EBNF
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (page : resource.allContents.toIterable.filter(WikiPage)) {
			fsa.generateFile(page.name + ".html", page.renderWikiPage)
		}
		for (category : resource.allContents.toIterable.filter(Category)) {
			fsa.generateFile("Category_" + category.name.renderText + ".html",
				category.renderCategoryPage(resource.allContents.toIterable.filter(WikiPage)))
		}
	}

	def renderWikiPage(
		WikiPage page
	) '''
		<html>
		  <head>
		    <title>«page.name»</title>
		    «style»
		  </head>
		  <body>
				<h1>«page.name»</h1>
				«FOR contentType : page.elements»
					«contentType.renderHTML»
				«ENDFOR»
		 <!-- categories at the end of the page -->
		 <div style="border: 1px solid #AAA;background-color: #F9F9F9;padding: 5px;margin-top: 1em;clear: both;">
		   <a href="https://en.wikipedia.org/wiki/Help:Category" title="Help:Category">Categories:</a>
		   <ul style="display: inline;margin: 0px;padding: 0px;list-style: outside none none;">
		   «var counter=0»
		  «FOR contentType : page.elements.filter(Category)»
		  	«contentType.renderCategory(counter)»
		  	<!--«counter++»-->
		  «ENDFOR»
		  </ul>
		  </div>
		  </body
		</html>
	'''

	def renderCategoryPage(Category category, Iterable<WikiPage> pages) {
		'''
			<html>
			  <head>
			    <title>Category: «category.name.renderText»</title>
			     «style»
			  </head>
			  <body>
			    <h1>Category: «category.name.renderText»</h1>
			          <ul>
			          «FOR page : pages»
			          	<li>«page.name»</li>
			          «ENDFOR»
			          </ul>
			  </body
			</html>
		'''
	}

	def renderCategory(Category category, int counter) {
		if (counter == 0) {
			'''<li class="category"><a href="Category_«category.name.renderText».html">«category.name.renderText»</a></li>'''
		} else {
			'''<li class="categoryitem"><a href="Category_«category.name.renderText».html">«category.name.renderText»</a></li>'''
		}
	}

	def renderHTML(ParagraphTypes content) {
		switch content {
			AnyText:
				content.renderAnyText
			Heading2:
				content.renderHeading2
			Heading3:
				content.renderHeading3
			Heading4:
				content.renderHeading4
			Heading5:
				content.renderHeading5
			BlockQuote:
				content.renderBlockQuote
			Template:
				content.renderTemplate
			Paragraph:
				content.renderParagraph
			OrderedList:
				content.renderOrderedList
			UnorderedList:
				content.renderUnOrderedList
			Image:
				content.renderImage
			// do not do anything, categories always at bottom, done above
			Category: ''''''
			// should never happen - this is for development purposes
			default: '''«content.class»
			'''
		}
	}

	def renderImage(Image image) {
		'''<div class="«image.type.literal» tright">
<div class="«image.type.literal»inner"><a href="«image.name»" class="image"><img src="«image.name»" class="«image.type.literal»image"></a>
<div class="«image.type.literal»caption">
<div class="magnify"><a href="/wiki/File:Wiki.png" class="internal" title="Enlarge"></a></div>
«image.caption.renderAnyTextSequence»</div>
</div>
</div>'''
	}

	def renderOrderedList(OrderedList list) {
		'''<ol>
		«FOR item : list.items»
			«item.renderOrderedListItem»
		«ENDFOR»		
		</ol>'''
	}

	def renderOrderedListItem(OrderListItem item) {
		'''<li>«item.itemtext.renderAnyTextSequence»</li>'''
	}

	def renderUnOrderedList(UnorderedList list) {
		'''<ul>
		«FOR item : list.items»
			«item.renderUnOrderedListItem»
		«ENDFOR»		
		</ul>'''
	}

	def renderUnOrderedListItem(UnorderListItem item) {
		'''«IF item.level.equals("**")»<ul>«ENDIF»<li>«item.itemtext.renderAnyTextSequence»</li>«IF item.level.equals("**")»</ul>«ENDIF»'''
	}

	def renderParagraph(Paragraph paragraph) {
		'''<br></br>'''
	}

	def renderTemplate(Template template) {
		switch template {
			AboutTemplate:
				template.renderAboutTemplate
			QuoteTemplate:
				template.renderQuoteTemplate
			MainTemplate:
				template.renderMainTemplate
			default: '''«template.class»'''
		}
	}

	// this is a hard-coded generator, FIXME: should have the number of items = 6 cardinality set
	def renderAboutTemplate(AboutTemplate about) {
		'''	<i>This page is about «about.content.get(0).renderAnyTextSequence»For «about.content.get(1).renderAnyTextSequence», see <a href="«about.content.get(2).renderAnyTextSequence + ".html"»">«about.content.get(2).renderAnyTextSequence»</a>«about.content.get(3).renderAnyTextSequence»<a href="«about.content.get(4).renderAnyTextSequence + ".html"»">«about.content.get(4).renderAnyTextSequence»</a></i>'''
	}

	def renderQuoteTemplate(QuoteTemplate quote) {
		'''&apos;'''
	}

	def renderMainTemplate(MainTemplate main) {
		'''<i>Main article: <a href="«main.content.get(0).renderAnyTextSequence + ".html"»">«main.content.get(0).renderAnyTextSequence»</a></i>'''
	}

	// Definition according to: https://en.wikipedia.org/wiki/Help:Wiki_markup
	// Anchor as defined: https://meta.wikimedia.org/wiki/Help:Anchors
	def renderHeading2(
		Heading2 h2
	) '''<a name="«h2.headingValue2.renderPlainText»"></a><h2>«h2.headingValue2.renderUnformattedContent»</h2>'''

	def renderHeading3(
		Heading3 h3
	) '''<a name="«h3.headingValue3.renderPlainText»"></a><h3>«h3.headingValue3.renderUnformattedContent»</h3>'''

	def renderHeading4(
		Heading4 h4
	) '''<a name="«h4.headingValue4.renderPlainText»"></a><h4>«h4.headingValue4.renderUnformattedContent»</h4>'''

	def renderHeading5(
		Heading5 h5
	) '''<a name="«h5.headingValue5.renderPlainText»"></a><h5>«h5.headingValue5.renderUnformattedContent» </h5>'''

	// returns plain text
	def renderText(Text text) '''«text.name»'''

	// found here: http://stackoverflow.com/questions/4737841/urlencoder-not-able-to-translate-space-character, keep #
	def renderURL(
		Text text) '''«URLEncoder.encode(text.name, "UTF-8").replaceAll("\\+", "%20").replaceAll("%23", "#")»'''

	def renderBlockQuote(
		BlockQuote blockquote) '''<blockquote>«blockquote.content.renderAnyTextSequence»</blockquote>'''

	def renderAnyTextSequence(AnyTextSequence anytextSequence) '''
		«FOR anyText : anytextSequence.content»
			«anyText.renderAnyText»
		«ENDFOR»
	'''

	def renderAnyText(AnyText anyText) {
		switch anyText {
			AbstractFormattedInlineContent:
				anyText.renderformattedContent
			AbstractUnformattedInlineContent:
				anyText.renderUnformattedContent
			default: '''«anyText.class»'''
		}
	}

	def renderformattedContent(AbstractFormattedInlineContent abstractFormat) {
		switch abstractFormat {
			Bold: '''<b>«abstractFormat.name.renderUnformattedContent»</b>'''
			Italic: '''<i>«abstractFormat.name.renderUnformattedContent»</i>'''
			ItalicBold: '''<i><b>«abstractFormat.name.renderUnformattedContent»</b></i>'''
			default: '''«abstractFormat.class»'''
		}
	}

	def renderUnformattedContent(AbstractUnformattedInlineContent abstractUnFormat) {
		switch abstractUnFormat {
			HyperLink:
				abstractUnFormat.renderHyperlink
			Text:
				abstractUnFormat.renderText
			default: ''''''
		}
	}

	// anchorImplementation
	def renderPlainText(AbstractUnformattedInlineContent abstractUnFormat) {
		switch abstractUnFormat {
			HyperLink:
				switch abstractUnFormat {
					Internal: '''«abstractUnFormat.link.name»'''
					default: '''«abstractUnFormat.class»'''
				}
			Text:
				abstractUnFormat.renderText
			default: ''''''
		}
	}

	def renderHyperlink(HyperLink hyperLinkContent) {
		switch hyperLinkContent {
			Internal: '''<a href="«if (hyperLinkContent.link != null) hyperLinkContent.link.name + ".html"»«if (hyperLinkContent.anchor != null) "#"+hyperLinkContent.anchor.renderText»">«if (hyperLinkContent.altText != null) hyperLinkContent.altText.renderAnyText else if(hyperLinkContent.link != null) hyperLinkContent.link.name»</a>'''
			External: '''<a class="external"  href="«hyperLinkContent.name»" target="_blank"">«if (hyperLinkContent.altText != null) hyperLinkContent.altText.renderAnyText else "[1]"»</a>'''
			default: '''«hyperLinkContent.class»'''
		}
	}
	
		var style =  '''<style>
		    		.external {
		    			background-position: right center;
		    			background-repeat: no-repeat;
		    			background-image: linear-gradient(transparent, transparent), url("data:image/svg+xml,%3C%3Fxml%20version%3D%221.0%22%20encoding%3D%22UTF-8%22%3F%3E%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%2210%22%20height%3D%2210%22%3E%3Cg%20transform%3D%22translate%28-826.429%20-698.791%29%22%3E%3Crect%20width%3D%225.982%22%20height%3D%225.982%22%20x%3D%22826.929%22%20y%3D%22702.309%22%20fill%3D%22%23fff%22%20stroke%3D%22%2306c%22%2F%3E%3Cg%3E%3Cpath%20d%3D%22M831.194%20698.791h5.234v5.391l-1.571%201.545-1.31-1.31-2.725%202.725-2.689-2.689%202.808-2.808-1.311-1.311z%22%20fill%3D%22%2306f%22%2F%3E%3Cpath%20d%3D%22M835.424%20699.795l.022%204.885-1.817-1.817-2.881%202.881-1.228-1.228%202.881-2.881-1.851-1.851z%22%20fill%3D%22%23fff%22%2F%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E");
		    			padding-right: 13px;
		    	}
		    	h1 {
		    		color: #000000; 
		    		background: none; 
		    		overflow: hidden; 
		    		page-break-after: avoid; 
		    		font-size: 1.8em; 
		    		font-family: Georgia,Times,serif; 
		    		margin-top: 1em; 
		    		margin-bottom: 0.25em; 
		    		line-height: 1.3; 
		    		padding: 0; 
		    		border-bottom: 1px solid #AAAAAA;	
		    	}
		    	.category {
		    		 padding-left: 0.25em;
		    		 border-left: medium none;
		    		 display: inline-block;
		    		 line-height: 1.25em;
		    		 margin: 0.125em 0px;
		    	}
		    	.categoryitem {
		    		padding-left: 0.25em;
		    		border-left: 1px solid #AAA; 
		    		display: inline-block;
		    		line-height: 1.25em;
		    		margin: 0.125em 0px;
		    	}
		    	h2 {
		    		color: #000000; 
		    		background: none; 
		    		overflow: hidden; 
		    		page-break-after: avoid; 
		    		font-size: 1.5em; 
		    		font-family: Georgia,Times,serif; 
		    		margin-top: 1em; 
		    		margin-bottom: 0.25em; 
		    		line-height: 1.3; 
		    		padding: 0; 
		    		border-bottom: 1px solid #AAAAAA;
		    	}
		    	h3 {
		    		color: #000000; 
		    		background: none; 
		    		overflow: hidden; 
		    		page-break-after: avoid; 
		    		font-size: 1.17em; 
		    		font-weight: bold; 
		    		margin-top: 0.3em; 
		    		margin-bottom: 0; 
		    		line-height: 1.6; 
		    		padding-top: 0.5em; 
		    		padding-bottom: 0;
		    	}
		    	h4 {
		    		color: #000000; 
		    		background: none; 
		    		overflow: hidden; 
		    		page-break-after: avoid; 
		    		font-size: 100%; 
		    		font-weight: bold; 
		    		margin-top: 0.3em; 
		    		margin-bottom: 0; 
		    		line-height: 1.6; 
		    		padding-top: 0.5em; 
		    		padding-bottom: 0;"
		    	}
		    	h5 {
		    		color: #000000; 
		    		background: none; 
		    		overflow: hidden; 
		    		page-break-after: avoid; 
		    		font-size: 100%; 
		    		font-weight: bold; 
		    		margin-top: 0.3em; 
		    		margin-bottom: 0; 
		    		line-height: 1.6; 
		    		padding-top: 0.5em; 
		    		padding-bottom: 0;
		    	}
		    	div.tright {
		    		margin: 0.5em 0px 1.3em 1.4em;
				}
				div.thumb {
							margin-bottom: 0.5em;
							width: auto;
							background-color: transparent;
				}
				div.tright, div.floatright, table.floatright {
							clear: right;
							float: right;
				}
				table.wikitable {
							border-collapse: collapse;
							color: #000;
				}
				table {
						font-size: 100%;
				}
				div.thumbinner {
							border: 1px solid #CCC;
							padding: 3px;
							background-color: #F9F9F9;
							font-size: 94%;
						text-align: center;
							overflow: hidden;
				}
				.thumbinner {
							min-width: 100px;
				}
				.thumbinner {
							min-width: 100px;
				}
				a {
							text-decoration: none;
							color: #0645AD;
							background: transparent none repeat scroll 0% 0%;
				}
				div.thumb .thumbimage {
				  	background-color: #FFF;
				}
				div.thumb .thumbimage {
				  	background-color: #FFF;
				}
				html .thumbimage {
				 	 border: 1px solid #CCC;
				}
				img {
					  border: medium none;
					  vertical-align: middle;
				}
				.mw-content-ltr .thumbcaption {
				  	text-align: left;
				}
				.mw-content-ltr .thumbcaption {
				  	text-align: left;
				}
				.thumbcaption {
					  border: medium none;
					  line-height: 1.4em;
					  padding: 3px;
					  font-size: 94%;
					  text-align: left;
				}
				</style>'''
	
}