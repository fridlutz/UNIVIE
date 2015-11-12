/*
 * generated by Xtext
 */
package at.ac.univie.swa.ase2015.a9902268.task3.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class WikiMLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class WikipageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "wikipage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleWIKITEXTTerminalRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		private final RuleCall cWIKITEXTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cControl000aKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cContentAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cContentInlineContentParserRuleCall_5_0 = (RuleCall)cContentAssignment_5.eContents().get(0);
		private final Assignment cSectionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cSectionsAbstractSectionParserRuleCall_6_0 = (RuleCall)cSectionsAssignment_6.eContents().get(0);
		private final Assignment cSectionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSectionsAbstractSectionParserRuleCall_7_0 = (RuleCall)cSectionsAssignment_7.eContents().get(0);
		
		//wikipage: //obligatory name of a page -> as defined by WikiML, should only occur once on a page, is, can have multiple words and numbers
		////TODO: redefine terminal ID
		//	"=" title=WIKITEXT WIKITEXT* "=" "\n" //optionally, there is text below the main heading
		//	content+=InlineContent* sections+=AbstractSection sections+=AbstractSection*;
		@Override public ParserRule getRule() { return rule; }

		////obligatory name of a page -> as defined by WikiML, should only occur once on a page, is, can have multiple words and numbers
		////TODO: redefine terminal ID
		//"=" title=WIKITEXT WIKITEXT* "=" "\n" //optionally, there is text below the main heading
		//content+=InlineContent* sections+=AbstractSection sections+=AbstractSection*
		public Group getGroup() { return cGroup; }

		////obligatory name of a page -> as defined by WikiML, should only occur once on a page, is, can have multiple words and numbers
		////TODO: redefine terminal ID
		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//title=WIKITEXT
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }

		//WIKITEXT
		public RuleCall getTitleWIKITEXTTerminalRuleCall_1_0() { return cTitleWIKITEXTTerminalRuleCall_1_0; }

		//WIKITEXT*
		public RuleCall getWIKITEXTTerminalRuleCall_2() { return cWIKITEXTTerminalRuleCall_2; }

		//"="
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }

		//"\n"
		public Keyword getControl000aKeyword_4() { return cControl000aKeyword_4; }

		//content+=InlineContent*
		public Assignment getContentAssignment_5() { return cContentAssignment_5; }

		//InlineContent
		public RuleCall getContentInlineContentParserRuleCall_5_0() { return cContentInlineContentParserRuleCall_5_0; }

		//sections+=AbstractSection
		public Assignment getSectionsAssignment_6() { return cSectionsAssignment_6; }

		//AbstractSection
		public RuleCall getSectionsAbstractSectionParserRuleCall_6_0() { return cSectionsAbstractSectionParserRuleCall_6_0; }

		//sections+=AbstractSection*
		public Assignment getSectionsAssignment_7() { return cSectionsAssignment_7; }

		//AbstractSection
		public RuleCall getSectionsAbstractSectionParserRuleCall_7_0() { return cSectionsAbstractSectionParserRuleCall_7_0; }
	}

	public class AbstractSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractSection");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSubsectionLevel1ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSubsectionLevel2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSubsectionLevel3ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSubsectionLevel4ParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AbstractSection:
		//	SubsectionLevel1 | SubsectionLevel2 | SubsectionLevel3 | SubsectionLevel4;
		@Override public ParserRule getRule() { return rule; }

		//SubsectionLevel1 | SubsectionLevel2 | SubsectionLevel3 | SubsectionLevel4
		public Alternatives getAlternatives() { return cAlternatives; }

		//SubsectionLevel1
		public RuleCall getSubsectionLevel1ParserRuleCall_0() { return cSubsectionLevel1ParserRuleCall_0; }

		//SubsectionLevel2
		public RuleCall getSubsectionLevel2ParserRuleCall_1() { return cSubsectionLevel2ParserRuleCall_1; }

		//SubsectionLevel3
		public RuleCall getSubsectionLevel3ParserRuleCall_2() { return cSubsectionLevel3ParserRuleCall_2; }

		//SubsectionLevel4
		public RuleCall getSubsectionLevel4ParserRuleCall_3() { return cSubsectionLevel4ParserRuleCall_3; }
	}

	public class SubsectionLevel1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SubsectionLevel1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameTextParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cControl000aKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentInlineContentParserRuleCall_4_0 = (RuleCall)cContentAssignment_4.eContents().get(0);
		
		//SubsectionLevel1:
		//	"==" name=Text "==" "\n" content+=InlineContent*;
		@Override public ParserRule getRule() { return rule; }

		//"==" name=Text "==" "\n" content+=InlineContent*
		public Group getGroup() { return cGroup; }

		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_0() { return cEqualsSignEqualsSignKeyword_0; }

		//name=Text
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Text
		public RuleCall getNameTextParserRuleCall_1_0() { return cNameTextParserRuleCall_1_0; }

		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_2() { return cEqualsSignEqualsSignKeyword_2; }

		//"\n"
		public Keyword getControl000aKeyword_3() { return cControl000aKeyword_3; }

		//content+=InlineContent*
		public Assignment getContentAssignment_4() { return cContentAssignment_4; }

		//InlineContent
		public RuleCall getContentInlineContentParserRuleCall_4_0() { return cContentInlineContentParserRuleCall_4_0; }
	}

	public class SubsectionLevel2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SubsectionLevel2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameTextParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cControl000aKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentInlineContentParserRuleCall_4_0 = (RuleCall)cContentAssignment_4.eContents().get(0);
		
		//SubsectionLevel2:
		//	"===" name=Text "===" "\n" content+=InlineContent*;
		@Override public ParserRule getRule() { return rule; }

		//"===" name=Text "===" "\n" content+=InlineContent*
		public Group getGroup() { return cGroup; }

		//"==="
		public Keyword getEqualsSignEqualsSignEqualsSignKeyword_0() { return cEqualsSignEqualsSignEqualsSignKeyword_0; }

		//name=Text
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Text
		public RuleCall getNameTextParserRuleCall_1_0() { return cNameTextParserRuleCall_1_0; }

		//"==="
		public Keyword getEqualsSignEqualsSignEqualsSignKeyword_2() { return cEqualsSignEqualsSignEqualsSignKeyword_2; }

		//"\n"
		public Keyword getControl000aKeyword_3() { return cControl000aKeyword_3; }

		//content+=InlineContent*
		public Assignment getContentAssignment_4() { return cContentAssignment_4; }

		//InlineContent
		public RuleCall getContentInlineContentParserRuleCall_4_0() { return cContentInlineContentParserRuleCall_4_0; }
	}

	public class SubsectionLevel3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SubsectionLevel3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameTextParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cControl000aKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentInlineContentParserRuleCall_4_0 = (RuleCall)cContentAssignment_4.eContents().get(0);
		
		//SubsectionLevel3:
		//	"====" name=Text "====" "\n" content+=InlineContent*;
		@Override public ParserRule getRule() { return rule; }

		//"====" name=Text "====" "\n" content+=InlineContent*
		public Group getGroup() { return cGroup; }

		//"===="
		public Keyword getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0() { return cEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0; }

		//name=Text
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Text
		public RuleCall getNameTextParserRuleCall_1_0() { return cNameTextParserRuleCall_1_0; }

		//"===="
		public Keyword getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2() { return cEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2; }

		//"\n"
		public Keyword getControl000aKeyword_3() { return cControl000aKeyword_3; }

		//content+=InlineContent*
		public Assignment getContentAssignment_4() { return cContentAssignment_4; }

		//InlineContent
		public RuleCall getContentInlineContentParserRuleCall_4_0() { return cContentInlineContentParserRuleCall_4_0; }
	}

	public class SubsectionLevel4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SubsectionLevel4");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameTextParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cControl000aKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cContentAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cContentInlineContentParserRuleCall_4_0 = (RuleCall)cContentAssignment_4.eContents().get(0);
		
		//SubsectionLevel4:
		//	"=====" name=Text "=====" "\n" content+=InlineContent*;
		@Override public ParserRule getRule() { return rule; }

		//"=====" name=Text "=====" "\n" content+=InlineContent*
		public Group getGroup() { return cGroup; }

		//"====="
		public Keyword getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0() { return cEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0; }

		//name=Text
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Text
		public RuleCall getNameTextParserRuleCall_1_0() { return cNameTextParserRuleCall_1_0; }

		//"====="
		public Keyword getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2() { return cEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2; }

		//"\n"
		public Keyword getControl000aKeyword_3() { return cControl000aKeyword_3; }

		//content+=InlineContent*
		public Assignment getContentAssignment_4() { return cContentAssignment_4; }

		//InlineContent
		public RuleCall getContentInlineContentParserRuleCall_4_0() { return cContentInlineContentParserRuleCall_4_0; }
	}

	public class InlineContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InlineContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFormattedContentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTextParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//InlineContent:
		//	FormattedContent | Text;
		@Override public ParserRule getRule() { return rule; }

		//FormattedContent | Text
		public Alternatives getAlternatives() { return cAlternatives; }

		//FormattedContent
		public RuleCall getFormattedContentParserRuleCall_0() { return cFormattedContentParserRuleCall_0; }

		//Text
		public RuleCall getTextParserRuleCall_1() { return cTextParserRuleCall_1; }
	}

	public class FormattedContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FormattedContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cItalicContentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBoldContentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cBoldItalicContentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////Formatting basic elements with bold, italic or both
		//FormattedContent:
		//	ItalicContent | BoldContent | BoldItalicContent;
		@Override public ParserRule getRule() { return rule; }

		//ItalicContent | BoldContent | BoldItalicContent
		public Alternatives getAlternatives() { return cAlternatives; }

		//ItalicContent
		public RuleCall getItalicContentParserRuleCall_0() { return cItalicContentParserRuleCall_0; }

		//BoldContent
		public RuleCall getBoldContentParserRuleCall_1() { return cBoldContentParserRuleCall_1; }

		//BoldItalicContent
		public RuleCall getBoldItalicContentParserRuleCall_2() { return cBoldItalicContentParserRuleCall_2; }
	}

	public class ItalicContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ItalicContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApostropheApostropheKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTextParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cApostropheApostropheKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ItalicContent:
		//	"\'\'" Text "\'\'";
		@Override public ParserRule getRule() { return rule; }

		//"\'\'" Text "\'\'"
		public Group getGroup() { return cGroup; }

		//"\'\'"
		public Keyword getApostropheApostropheKeyword_0() { return cApostropheApostropheKeyword_0; }

		//Text
		public RuleCall getTextParserRuleCall_1() { return cTextParserRuleCall_1; }

		//"\'\'"
		public Keyword getApostropheApostropheKeyword_2() { return cApostropheApostropheKeyword_2; }
	}

	public class BoldContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BoldContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApostropheApostropheApostropheKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTextParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cApostropheApostropheApostropheKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//BoldContent:
		//	"\'\'\'" Text "\'\'\'";
		@Override public ParserRule getRule() { return rule; }

		//"\'\'\'" Text "\'\'\'"
		public Group getGroup() { return cGroup; }

		//"\'\'\'"
		public Keyword getApostropheApostropheApostropheKeyword_0() { return cApostropheApostropheApostropheKeyword_0; }

		//Text
		public RuleCall getTextParserRuleCall_1() { return cTextParserRuleCall_1; }

		//"\'\'\'"
		public Keyword getApostropheApostropheApostropheKeyword_2() { return cApostropheApostropheApostropheKeyword_2; }
	}

	public class BoldItalicContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BoldItalicContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cApostropheApostropheApostropheApostropheApostropheKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTextParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cApostropheApostropheApostropheApostropheApostropheKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//BoldItalicContent:
		//	"\'\'\'\'\'" Text "\'\'\'\'\'";
		@Override public ParserRule getRule() { return rule; }

		//"\'\'\'\'\'" Text "\'\'\'\'\'"
		public Group getGroup() { return cGroup; }

		//"\'\'\'\'\'"
		public Keyword getApostropheApostropheApostropheApostropheApostropheKeyword_0() { return cApostropheApostropheApostropheApostropheApostropheKeyword_0; }

		//Text
		public RuleCall getTextParserRuleCall_1() { return cTextParserRuleCall_1; }

		//"\'\'\'\'\'"
		public Keyword getApostropheApostropheApostropheApostropheApostropheKeyword_2() { return cApostropheApostropheApostropheApostropheApostropheKeyword_2; }
	}

	public class TextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Text");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUnFormattedTextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cHyperlinkParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////basic elements to construct a paragraph in sections
		//Text:
		//	UnFormattedText | Hyperlink;
		@Override public ParserRule getRule() { return rule; }

		//UnFormattedText | Hyperlink
		public Alternatives getAlternatives() { return cAlternatives; }

		//UnFormattedText
		public RuleCall getUnFormattedTextParserRuleCall_0() { return cUnFormattedTextParserRuleCall_0; }

		//Hyperlink
		public RuleCall getHyperlinkParserRuleCall_1() { return cHyperlinkParserRuleCall_1; }
	}

	public class UnFormattedTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UnFormattedText");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cWordsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cWordsWIKITEXTTerminalRuleCall_0_0 = (RuleCall)cWordsAssignment_0.eContents().get(0);
		private final RuleCall cWIKITEXTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//UnFormattedText:
		//	words=WIKITEXT WIKITEXT*;
		@Override public ParserRule getRule() { return rule; }

		//words=WIKITEXT WIKITEXT*
		public Group getGroup() { return cGroup; }

		//words=WIKITEXT
		public Assignment getWordsAssignment_0() { return cWordsAssignment_0; }

		//WIKITEXT
		public RuleCall getWordsWIKITEXTTerminalRuleCall_0_0() { return cWordsWIKITEXTTerminalRuleCall_0_0; }

		//WIKITEXT*
		public RuleCall getWIKITEXTTerminalRuleCall_1() { return cWIKITEXTTerminalRuleCall_1; }
	}

	public class HyperlinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Hyperlink");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInternalLinkParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInternalLinkAlternativeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cExternalLinkParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cExternalLinkAlternativeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Hyperlink:
		//	InternalLink | InternalLinkAlternative | ExternalLink | ExternalLinkAlternative;
		@Override public ParserRule getRule() { return rule; }

		//InternalLink | InternalLinkAlternative | ExternalLink | ExternalLinkAlternative
		public Alternatives getAlternatives() { return cAlternatives; }

		//InternalLink
		public RuleCall getInternalLinkParserRuleCall_0() { return cInternalLinkParserRuleCall_0; }

		//InternalLinkAlternative
		public RuleCall getInternalLinkAlternativeParserRuleCall_1() { return cInternalLinkAlternativeParserRuleCall_1; }

		//ExternalLink
		public RuleCall getExternalLinkParserRuleCall_2() { return cExternalLinkParserRuleCall_2; }

		//ExternalLinkAlternative
		public RuleCall getExternalLinkAlternativeParserRuleCall_3() { return cExternalLinkAlternativeParserRuleCall_3; }
	}

	public class ExternalLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExternalLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPageNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPageNameUnFormattedTextParserRuleCall_1_0 = (RuleCall)cPageNameAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ExternalLink:
		//	"[" pageName=UnFormattedText "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" pageName=UnFormattedText "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//pageName=UnFormattedText
		public Assignment getPageNameAssignment_1() { return cPageNameAssignment_1; }

		//UnFormattedText
		public RuleCall getPageNameUnFormattedTextParserRuleCall_1_0() { return cPageNameUnFormattedTextParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}

	public class ExternalLinkAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExternalLinkAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUrlAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cUrlUnFormattedTextParserRuleCall_1_0 = (RuleCall)cUrlAssignment_1.eContents().get(0);
		private final Keyword cSpaceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlternativeTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlternativeTextUnFormattedTextParserRuleCall_3_0 = (RuleCall)cAlternativeTextAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExternalLinkAlternative:
		//	"[" url=UnFormattedText " " alternativeText=UnFormattedText "]";
		@Override public ParserRule getRule() { return rule; }

		//"[" url=UnFormattedText " " alternativeText=UnFormattedText "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//url=UnFormattedText
		public Assignment getUrlAssignment_1() { return cUrlAssignment_1; }

		//UnFormattedText
		public RuleCall getUrlUnFormattedTextParserRuleCall_1_0() { return cUrlUnFormattedTextParserRuleCall_1_0; }

		//" "
		public Keyword getSpaceKeyword_2() { return cSpaceKeyword_2; }

		//alternativeText=UnFormattedText
		public Assignment getAlternativeTextAssignment_3() { return cAlternativeTextAssignment_3; }

		//UnFormattedText
		public RuleCall getAlternativeTextUnFormattedTextParserRuleCall_3_0() { return cAlternativeTextUnFormattedTextParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class InternalLinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InternalLink");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPageNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPageNameUnFormattedTextParserRuleCall_1_0 = (RuleCall)cPageNameAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//InternalLink:
		//	"[[" pageName=UnFormattedText "]]";
		@Override public ParserRule getRule() { return rule; }

		//"[[" pageName=UnFormattedText "]]"
		public Group getGroup() { return cGroup; }

		//"[["
		public Keyword getLeftSquareBracketLeftSquareBracketKeyword_0() { return cLeftSquareBracketLeftSquareBracketKeyword_0; }

		//pageName=UnFormattedText
		public Assignment getPageNameAssignment_1() { return cPageNameAssignment_1; }

		//UnFormattedText
		public RuleCall getPageNameUnFormattedTextParserRuleCall_1_0() { return cPageNameUnFormattedTextParserRuleCall_1_0; }

		//"]]"
		public Keyword getRightSquareBracketRightSquareBracketKeyword_2() { return cRightSquareBracketRightSquareBracketKeyword_2; }
	}

	public class InternalLinkAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InternalLinkAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPageNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPageNameUnFormattedTextParserRuleCall_1_0 = (RuleCall)cPageNameAssignment_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlternativeTextAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlternativeTextUnFormattedTextParserRuleCall_3_0 = (RuleCall)cAlternativeTextAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//InternalLinkAlternative:
		//	"[[" pageName=UnFormattedText "|" alternativeText=UnFormattedText "]]";
		@Override public ParserRule getRule() { return rule; }

		//"[[" pageName=UnFormattedText "|" alternativeText=UnFormattedText "]]"
		public Group getGroup() { return cGroup; }

		//"[["
		public Keyword getLeftSquareBracketLeftSquareBracketKeyword_0() { return cLeftSquareBracketLeftSquareBracketKeyword_0; }

		//pageName=UnFormattedText
		public Assignment getPageNameAssignment_1() { return cPageNameAssignment_1; }

		//UnFormattedText
		public RuleCall getPageNameUnFormattedTextParserRuleCall_1_0() { return cPageNameUnFormattedTextParserRuleCall_1_0; }

		//"|"
		public Keyword getVerticalLineKeyword_2() { return cVerticalLineKeyword_2; }

		//alternativeText=UnFormattedText
		public Assignment getAlternativeTextAssignment_3() { return cAlternativeTextAssignment_3; }

		//UnFormattedText
		public RuleCall getAlternativeTextUnFormattedTextParserRuleCall_3_0() { return cAlternativeTextUnFormattedTextParserRuleCall_3_0; }

		//"]]"
		public Keyword getRightSquareBracketRightSquareBracketKeyword_4() { return cRightSquareBracketRightSquareBracketKeyword_4; }
	}
	
	
	private final WikipageElements pWikipage;
	private final AbstractSectionElements pAbstractSection;
	private final SubsectionLevel1Elements pSubsectionLevel1;
	private final SubsectionLevel2Elements pSubsectionLevel2;
	private final SubsectionLevel3Elements pSubsectionLevel3;
	private final SubsectionLevel4Elements pSubsectionLevel4;
	private final InlineContentElements pInlineContent;
	private final FormattedContentElements pFormattedContent;
	private final ItalicContentElements pItalicContent;
	private final BoldContentElements pBoldContent;
	private final BoldItalicContentElements pBoldItalicContent;
	private final TextElements pText;
	private final UnFormattedTextElements pUnFormattedText;
	private final HyperlinkElements pHyperlink;
	private final ExternalLinkElements pExternalLink;
	private final ExternalLinkAlternativeElements pExternalLinkAlternative;
	private final InternalLinkElements pInternalLink;
	private final InternalLinkAlternativeElements pInternalLinkAlternative;
	private final TerminalRule tWIKITEXT;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public WikiMLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWikipage = new WikipageElements();
		this.pAbstractSection = new AbstractSectionElements();
		this.pSubsectionLevel1 = new SubsectionLevel1Elements();
		this.pSubsectionLevel2 = new SubsectionLevel2Elements();
		this.pSubsectionLevel3 = new SubsectionLevel3Elements();
		this.pSubsectionLevel4 = new SubsectionLevel4Elements();
		this.pInlineContent = new InlineContentElements();
		this.pFormattedContent = new FormattedContentElements();
		this.pItalicContent = new ItalicContentElements();
		this.pBoldContent = new BoldContentElements();
		this.pBoldItalicContent = new BoldItalicContentElements();
		this.pText = new TextElements();
		this.pUnFormattedText = new UnFormattedTextElements();
		this.pHyperlink = new HyperlinkElements();
		this.pExternalLink = new ExternalLinkElements();
		this.pExternalLinkAlternative = new ExternalLinkAlternativeElements();
		this.pInternalLink = new InternalLinkElements();
		this.pInternalLinkAlternative = new InternalLinkAlternativeElements();
		this.tWIKITEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WIKITEXT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.univie.swa.ase2015.a9902268.task3.WikiML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//wikipage: //obligatory name of a page -> as defined by WikiML, should only occur once on a page, is, can have multiple words and numbers
	////TODO: redefine terminal ID
	//	"=" title=WIKITEXT WIKITEXT* "=" "\n" //optionally, there is text below the main heading
	//	content+=InlineContent* sections+=AbstractSection sections+=AbstractSection*;
	public WikipageElements getWikipageAccess() {
		return pWikipage;
	}
	
	public ParserRule getWikipageRule() {
		return getWikipageAccess().getRule();
	}

	//AbstractSection:
	//	SubsectionLevel1 | SubsectionLevel2 | SubsectionLevel3 | SubsectionLevel4;
	public AbstractSectionElements getAbstractSectionAccess() {
		return pAbstractSection;
	}
	
	public ParserRule getAbstractSectionRule() {
		return getAbstractSectionAccess().getRule();
	}

	//SubsectionLevel1:
	//	"==" name=Text "==" "\n" content+=InlineContent*;
	public SubsectionLevel1Elements getSubsectionLevel1Access() {
		return pSubsectionLevel1;
	}
	
	public ParserRule getSubsectionLevel1Rule() {
		return getSubsectionLevel1Access().getRule();
	}

	//SubsectionLevel2:
	//	"===" name=Text "===" "\n" content+=InlineContent*;
	public SubsectionLevel2Elements getSubsectionLevel2Access() {
		return pSubsectionLevel2;
	}
	
	public ParserRule getSubsectionLevel2Rule() {
		return getSubsectionLevel2Access().getRule();
	}

	//SubsectionLevel3:
	//	"====" name=Text "====" "\n" content+=InlineContent*;
	public SubsectionLevel3Elements getSubsectionLevel3Access() {
		return pSubsectionLevel3;
	}
	
	public ParserRule getSubsectionLevel3Rule() {
		return getSubsectionLevel3Access().getRule();
	}

	//SubsectionLevel4:
	//	"=====" name=Text "=====" "\n" content+=InlineContent*;
	public SubsectionLevel4Elements getSubsectionLevel4Access() {
		return pSubsectionLevel4;
	}
	
	public ParserRule getSubsectionLevel4Rule() {
		return getSubsectionLevel4Access().getRule();
	}

	//InlineContent:
	//	FormattedContent | Text;
	public InlineContentElements getInlineContentAccess() {
		return pInlineContent;
	}
	
	public ParserRule getInlineContentRule() {
		return getInlineContentAccess().getRule();
	}

	////Formatting basic elements with bold, italic or both
	//FormattedContent:
	//	ItalicContent | BoldContent | BoldItalicContent;
	public FormattedContentElements getFormattedContentAccess() {
		return pFormattedContent;
	}
	
	public ParserRule getFormattedContentRule() {
		return getFormattedContentAccess().getRule();
	}

	//ItalicContent:
	//	"\'\'" Text "\'\'";
	public ItalicContentElements getItalicContentAccess() {
		return pItalicContent;
	}
	
	public ParserRule getItalicContentRule() {
		return getItalicContentAccess().getRule();
	}

	//BoldContent:
	//	"\'\'\'" Text "\'\'\'";
	public BoldContentElements getBoldContentAccess() {
		return pBoldContent;
	}
	
	public ParserRule getBoldContentRule() {
		return getBoldContentAccess().getRule();
	}

	//BoldItalicContent:
	//	"\'\'\'\'\'" Text "\'\'\'\'\'";
	public BoldItalicContentElements getBoldItalicContentAccess() {
		return pBoldItalicContent;
	}
	
	public ParserRule getBoldItalicContentRule() {
		return getBoldItalicContentAccess().getRule();
	}

	////basic elements to construct a paragraph in sections
	//Text:
	//	UnFormattedText | Hyperlink;
	public TextElements getTextAccess() {
		return pText;
	}
	
	public ParserRule getTextRule() {
		return getTextAccess().getRule();
	}

	//UnFormattedText:
	//	words=WIKITEXT WIKITEXT*;
	public UnFormattedTextElements getUnFormattedTextAccess() {
		return pUnFormattedText;
	}
	
	public ParserRule getUnFormattedTextRule() {
		return getUnFormattedTextAccess().getRule();
	}

	//Hyperlink:
	//	InternalLink | InternalLinkAlternative | ExternalLink | ExternalLinkAlternative;
	public HyperlinkElements getHyperlinkAccess() {
		return pHyperlink;
	}
	
	public ParserRule getHyperlinkRule() {
		return getHyperlinkAccess().getRule();
	}

	//ExternalLink:
	//	"[" pageName=UnFormattedText "]";
	public ExternalLinkElements getExternalLinkAccess() {
		return pExternalLink;
	}
	
	public ParserRule getExternalLinkRule() {
		return getExternalLinkAccess().getRule();
	}

	//ExternalLinkAlternative:
	//	"[" url=UnFormattedText " " alternativeText=UnFormattedText "]";
	public ExternalLinkAlternativeElements getExternalLinkAlternativeAccess() {
		return pExternalLinkAlternative;
	}
	
	public ParserRule getExternalLinkAlternativeRule() {
		return getExternalLinkAlternativeAccess().getRule();
	}

	//InternalLink:
	//	"[[" pageName=UnFormattedText "]]";
	public InternalLinkElements getInternalLinkAccess() {
		return pInternalLink;
	}
	
	public ParserRule getInternalLinkRule() {
		return getInternalLinkAccess().getRule();
	}

	//InternalLinkAlternative:
	//	"[[" pageName=UnFormattedText "|" alternativeText=UnFormattedText "]]";
	public InternalLinkAlternativeElements getInternalLinkAlternativeAccess() {
		return pInternalLinkAlternative;
	}
	
	public ParserRule getInternalLinkAlternativeRule() {
		return getInternalLinkAlternativeAccess().getRule();
	}

	////everything allowed but Umlaute
	//terminal WIKITEXT:
	//	"^"? !("=" | "\'" | "[" | "]" | "\n")*;
	public TerminalRule getWIKITEXTRule() {
		return tWIKITEXT;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
