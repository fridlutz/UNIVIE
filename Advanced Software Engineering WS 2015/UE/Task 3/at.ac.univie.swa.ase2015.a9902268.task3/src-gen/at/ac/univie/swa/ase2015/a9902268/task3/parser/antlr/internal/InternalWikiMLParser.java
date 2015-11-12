package at.ac.univie.swa.ase2015.a9902268.task3.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.univie.swa.ase2015.a9902268.task3.services.WikiMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWikiMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WIKITEXT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'\\n'", "'=='", "'==='", "'===='", "'====='", "'\\'\\''", "'\\'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "' '", "'[['", "']]'", "'|'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_WIKITEXT=4;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWikiMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWikiMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWikiMLParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g"; }



     	private WikiMLGrammarAccess grammarAccess;
     	
        public InternalWikiMLParser(TokenStream input, WikiMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "wikipage";	
       	}
       	
       	@Override
       	protected WikiMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulewikipage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:67:1: entryRulewikipage returns [EObject current=null] : iv_rulewikipage= rulewikipage EOF ;
    public final EObject entryRulewikipage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewikipage = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:68:2: (iv_rulewikipage= rulewikipage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:69:2: iv_rulewikipage= rulewikipage EOF
            {
             newCompositeNode(grammarAccess.getWikipageRule()); 
            pushFollow(FOLLOW_rulewikipage_in_entryRulewikipage75);
            iv_rulewikipage=rulewikipage();

            state._fsp--;

             current =iv_rulewikipage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewikipage85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewikipage"


    // $ANTLR start "rulewikipage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:76:1: rulewikipage returns [EObject current=null] : (otherlv_0= '=' ( (lv_title_1_0= RULE_WIKITEXT ) ) (this_WIKITEXT_2= RULE_WIKITEXT )* otherlv_3= '=' otherlv_4= '\\n' ( (lv_content_5_0= ruleInlineContent ) )* ( (lv_sections_6_0= ruleAbstractSection ) ) ( (lv_sections_7_0= ruleAbstractSection ) )* ) ;
    public final EObject rulewikipage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token this_WIKITEXT_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_content_5_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:79:28: ( (otherlv_0= '=' ( (lv_title_1_0= RULE_WIKITEXT ) ) (this_WIKITEXT_2= RULE_WIKITEXT )* otherlv_3= '=' otherlv_4= '\\n' ( (lv_content_5_0= ruleInlineContent ) )* ( (lv_sections_6_0= ruleAbstractSection ) ) ( (lv_sections_7_0= ruleAbstractSection ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (otherlv_0= '=' ( (lv_title_1_0= RULE_WIKITEXT ) ) (this_WIKITEXT_2= RULE_WIKITEXT )* otherlv_3= '=' otherlv_4= '\\n' ( (lv_content_5_0= ruleInlineContent ) )* ( (lv_sections_6_0= ruleAbstractSection ) ) ( (lv_sections_7_0= ruleAbstractSection ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (otherlv_0= '=' ( (lv_title_1_0= RULE_WIKITEXT ) ) (this_WIKITEXT_2= RULE_WIKITEXT )* otherlv_3= '=' otherlv_4= '\\n' ( (lv_content_5_0= ruleInlineContent ) )* ( (lv_sections_6_0= ruleAbstractSection ) ) ( (lv_sections_7_0= ruleAbstractSection ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:3: otherlv_0= '=' ( (lv_title_1_0= RULE_WIKITEXT ) ) (this_WIKITEXT_2= RULE_WIKITEXT )* otherlv_3= '=' otherlv_4= '\\n' ( (lv_content_5_0= ruleInlineContent ) )* ( (lv_sections_6_0= ruleAbstractSection ) ) ( (lv_sections_7_0= ruleAbstractSection ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulewikipage122); 

                	newLeafNode(otherlv_0, grammarAccess.getWikipageAccess().getEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:84:1: ( (lv_title_1_0= RULE_WIKITEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:85:1: (lv_title_1_0= RULE_WIKITEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:85:1: (lv_title_1_0= RULE_WIKITEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:86:3: lv_title_1_0= RULE_WIKITEXT
            {
            lv_title_1_0=(Token)match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rulewikipage139); 

            			newLeafNode(lv_title_1_0, grammarAccess.getWikipageAccess().getTitleWIKITEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWikipageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"WIKITEXT");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:102:2: (this_WIKITEXT_2= RULE_WIKITEXT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_WIKITEXT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:102:3: this_WIKITEXT_2= RULE_WIKITEXT
            	    {
            	    this_WIKITEXT_2=(Token)match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rulewikipage156); 
            	     
            	        newLeafNode(this_WIKITEXT_2, grammarAccess.getWikipageAccess().getWIKITEXTTerminalRuleCall_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulewikipage169); 

                	newLeafNode(otherlv_3, grammarAccess.getWikipageAccess().getEqualsSignKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulewikipage181); 

                	newLeafNode(otherlv_4, grammarAccess.getWikipageAccess().getControl000aKeyword_4());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:114:1: ( (lv_content_5_0= ruleInlineContent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_WIKITEXT||(LA2_0>=18 && LA2_0<=21)||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:115:1: (lv_content_5_0= ruleInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:115:1: (lv_content_5_0= ruleInlineContent )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:116:3: lv_content_5_0= ruleInlineContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInlineContent_in_rulewikipage202);
            	    lv_content_5_0=ruleInlineContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_5_0, 
            	            		"InlineContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:132:3: ( (lv_sections_6_0= ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:133:1: (lv_sections_6_0= ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:133:1: (lv_sections_6_0= ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:134:3: lv_sections_6_0= ruleAbstractSection
            {
             
            	        newCompositeNode(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractSection_in_rulewikipage224);
            lv_sections_6_0=ruleAbstractSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_6_0, 
                    		"AbstractSection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:150:2: ( (lv_sections_7_0= ruleAbstractSection ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:151:1: (lv_sections_7_0= ruleAbstractSection )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:151:1: (lv_sections_7_0= ruleAbstractSection )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:152:3: lv_sections_7_0= ruleAbstractSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractSection_in_rulewikipage245);
            	    lv_sections_7_0=ruleAbstractSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_7_0, 
            	            		"AbstractSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewikipage"


    // $ANTLR start "entryRuleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:176:1: entryRuleAbstractSection returns [EObject current=null] : iv_ruleAbstractSection= ruleAbstractSection EOF ;
    public final EObject entryRuleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:177:2: (iv_ruleAbstractSection= ruleAbstractSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:178:2: iv_ruleAbstractSection= ruleAbstractSection EOF
            {
             newCompositeNode(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection282);
            iv_ruleAbstractSection=ruleAbstractSection();

            state._fsp--;

             current =iv_ruleAbstractSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractSection"


    // $ANTLR start "ruleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:185:1: ruleAbstractSection returns [EObject current=null] : (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 ) ;
    public final EObject ruleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject this_SubsectionLevel1_0 = null;

        EObject this_SubsectionLevel2_1 = null;

        EObject this_SubsectionLevel3_2 = null;

        EObject this_SubsectionLevel4_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:188:28: ( (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:189:1: (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:189:1: (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:190:5: this_SubsectionLevel1_0= ruleSubsectionLevel1
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel1_in_ruleAbstractSection339);
                    this_SubsectionLevel1_0=ruleSubsectionLevel1();

                    state._fsp--;

                     
                            current = this_SubsectionLevel1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:200:5: this_SubsectionLevel2_1= ruleSubsectionLevel2
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel2_in_ruleAbstractSection366);
                    this_SubsectionLevel2_1=ruleSubsectionLevel2();

                    state._fsp--;

                     
                            current = this_SubsectionLevel2_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:210:5: this_SubsectionLevel3_2= ruleSubsectionLevel3
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel3_in_ruleAbstractSection393);
                    this_SubsectionLevel3_2=ruleSubsectionLevel3();

                    state._fsp--;

                     
                            current = this_SubsectionLevel3_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:220:5: this_SubsectionLevel4_3= ruleSubsectionLevel4
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel4ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel4_in_ruleAbstractSection420);
                    this_SubsectionLevel4_3=ruleSubsectionLevel4();

                    state._fsp--;

                     
                            current = this_SubsectionLevel4_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractSection"


    // $ANTLR start "entryRuleSubsectionLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:236:1: entryRuleSubsectionLevel1 returns [EObject current=null] : iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF ;
    public final EObject entryRuleSubsectionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:237:2: (iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:238:2: iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel1Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1455);
            iv_ruleSubsectionLevel1=ruleSubsectionLevel1();

            state._fsp--;

             current =iv_ruleSubsectionLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel1465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsectionLevel1"


    // $ANTLR start "ruleSubsectionLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:245:1: ruleSubsectionLevel1 returns [EObject current=null] : (otherlv_0= '==' ( (lv_name_1_0= ruleText ) ) otherlv_2= '==' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) ;
    public final EObject ruleSubsectionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:248:28: ( (otherlv_0= '==' ( (lv_name_1_0= ruleText ) ) otherlv_2= '==' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:249:1: (otherlv_0= '==' ( (lv_name_1_0= ruleText ) ) otherlv_2= '==' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:249:1: (otherlv_0= '==' ( (lv_name_1_0= ruleText ) ) otherlv_2= '==' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:249:3: otherlv_0= '==' ( (lv_name_1_0= ruleText ) ) otherlv_2= '==' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSubsectionLevel1502); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:253:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:254:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:254:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:255:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel1Access().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleSubsectionLevel1523);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSubsectionLevel1535); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSubsectionLevel1547); 

                	newLeafNode(otherlv_3, grammarAccess.getSubsectionLevel1Access().getControl000aKeyword_3());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:279:1: ( (lv_content_4_0= ruleInlineContent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_WIKITEXT||(LA5_0>=18 && LA5_0<=21)||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:280:1: (lv_content_4_0= ruleInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:280:1: (lv_content_4_0= ruleInlineContent )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:281:3: lv_content_4_0= ruleInlineContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1568);
            	    lv_content_4_0=ruleInlineContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"InlineContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsectionLevel1"


    // $ANTLR start "entryRuleSubsectionLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:305:1: entryRuleSubsectionLevel2 returns [EObject current=null] : iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF ;
    public final EObject entryRuleSubsectionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:306:2: (iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:307:2: iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel2Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2605);
            iv_ruleSubsectionLevel2=ruleSubsectionLevel2();

            state._fsp--;

             current =iv_ruleSubsectionLevel2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel2615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsectionLevel2"


    // $ANTLR start "ruleSubsectionLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:314:1: ruleSubsectionLevel2 returns [EObject current=null] : (otherlv_0= '===' ( (lv_name_1_0= ruleText ) ) otherlv_2= '===' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) ;
    public final EObject ruleSubsectionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:317:28: ( (otherlv_0= '===' ( (lv_name_1_0= ruleText ) ) otherlv_2= '===' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:318:1: (otherlv_0= '===' ( (lv_name_1_0= ruleText ) ) otherlv_2= '===' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:318:1: (otherlv_0= '===' ( (lv_name_1_0= ruleText ) ) otherlv_2= '===' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:318:3: otherlv_0= '===' ( (lv_name_1_0= ruleText ) ) otherlv_2= '===' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSubsectionLevel2652); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:322:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:323:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:323:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:324:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel2Access().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleSubsectionLevel2673);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel2Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSubsectionLevel2685); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSubsectionLevel2697); 

                	newLeafNode(otherlv_3, grammarAccess.getSubsectionLevel2Access().getControl000aKeyword_3());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:348:1: ( (lv_content_4_0= ruleInlineContent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WIKITEXT||(LA6_0>=18 && LA6_0<=21)||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:349:1: (lv_content_4_0= ruleInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:349:1: (lv_content_4_0= ruleInlineContent )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:350:3: lv_content_4_0= ruleInlineContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2718);
            	    lv_content_4_0=ruleInlineContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"InlineContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsectionLevel2"


    // $ANTLR start "entryRuleSubsectionLevel3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:374:1: entryRuleSubsectionLevel3 returns [EObject current=null] : iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF ;
    public final EObject entryRuleSubsectionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel3 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:375:2: (iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:376:2: iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel3Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3755);
            iv_ruleSubsectionLevel3=ruleSubsectionLevel3();

            state._fsp--;

             current =iv_ruleSubsectionLevel3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel3765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsectionLevel3"


    // $ANTLR start "ruleSubsectionLevel3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:383:1: ruleSubsectionLevel3 returns [EObject current=null] : (otherlv_0= '====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) ;
    public final EObject ruleSubsectionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:386:28: ( (otherlv_0= '====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:1: (otherlv_0= '====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:1: (otherlv_0= '====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:3: otherlv_0= '====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSubsectionLevel3802); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:391:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:392:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:392:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:393:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel3Access().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleSubsectionLevel3823);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel3Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSubsectionLevel3835); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSubsectionLevel3847); 

                	newLeafNode(otherlv_3, grammarAccess.getSubsectionLevel3Access().getControl000aKeyword_3());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:417:1: ( (lv_content_4_0= ruleInlineContent ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WIKITEXT||(LA7_0>=18 && LA7_0<=21)||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:418:1: (lv_content_4_0= ruleInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:418:1: (lv_content_4_0= ruleInlineContent )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:419:3: lv_content_4_0= ruleInlineContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3868);
            	    lv_content_4_0=ruleInlineContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"InlineContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsectionLevel3"


    // $ANTLR start "entryRuleSubsectionLevel4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:443:1: entryRuleSubsectionLevel4 returns [EObject current=null] : iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF ;
    public final EObject entryRuleSubsectionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel4 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:444:2: (iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:445:2: iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel4Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4905);
            iv_ruleSubsectionLevel4=ruleSubsectionLevel4();

            state._fsp--;

             current =iv_ruleSubsectionLevel4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel4915); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsectionLevel4"


    // $ANTLR start "ruleSubsectionLevel4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:452:1: ruleSubsectionLevel4 returns [EObject current=null] : (otherlv_0= '=====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '=====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) ;
    public final EObject ruleSubsectionLevel4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_content_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:28: ( (otherlv_0= '=====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '=====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:456:1: (otherlv_0= '=====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '=====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:456:1: (otherlv_0= '=====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '=====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:456:3: otherlv_0= '=====' ( (lv_name_1_0= ruleText ) ) otherlv_2= '=====' otherlv_3= '\\n' ( (lv_content_4_0= ruleInlineContent ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSubsectionLevel4952); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:460:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:461:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:461:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:462:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel4Access().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleSubsectionLevel4973);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel4Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSubsectionLevel4985); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSubsectionLevel4997); 

                	newLeafNode(otherlv_3, grammarAccess.getSubsectionLevel4Access().getControl000aKeyword_3());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:486:1: ( (lv_content_4_0= ruleInlineContent ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WIKITEXT||(LA8_0>=18 && LA8_0<=21)||LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:487:1: (lv_content_4_0= ruleInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:487:1: (lv_content_4_0= ruleInlineContent )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:488:3: lv_content_4_0= ruleInlineContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel41018);
            	    lv_content_4_0=ruleInlineContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel4Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"InlineContent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsectionLevel4"


    // $ANTLR start "entryRuleInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:512:1: entryRuleInlineContent returns [EObject current=null] : iv_ruleInlineContent= ruleInlineContent EOF ;
    public final EObject entryRuleInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:513:2: (iv_ruleInlineContent= ruleInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:514:2: iv_ruleInlineContent= ruleInlineContent EOF
            {
             newCompositeNode(grammarAccess.getInlineContentRule()); 
            pushFollow(FOLLOW_ruleInlineContent_in_entryRuleInlineContent1055);
            iv_ruleInlineContent=ruleInlineContent();

            state._fsp--;

             current =iv_ruleInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineContent1065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineContent"


    // $ANTLR start "ruleInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:521:1: ruleInlineContent returns [EObject current=null] : (this_FormattedContent_0= ruleFormattedContent | this_Text_1= ruleText ) ;
    public final EObject ruleInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_FormattedContent_0 = null;

        EObject this_Text_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:524:28: ( (this_FormattedContent_0= ruleFormattedContent | this_Text_1= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:525:1: (this_FormattedContent_0= ruleFormattedContent | this_Text_1= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:525:1: (this_FormattedContent_0= ruleFormattedContent | this_Text_1= ruleText )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=18 && LA9_0<=20)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_WIKITEXT||LA9_0==21||LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:526:5: this_FormattedContent_0= ruleFormattedContent
                    {
                     
                            newCompositeNode(grammarAccess.getInlineContentAccess().getFormattedContentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFormattedContent_in_ruleInlineContent1112);
                    this_FormattedContent_0=ruleFormattedContent();

                    state._fsp--;

                     
                            current = this_FormattedContent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:536:5: this_Text_1= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getInlineContentAccess().getTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleInlineContent1139);
                    this_Text_1=ruleText();

                    state._fsp--;

                     
                            current = this_Text_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineContent"


    // $ANTLR start "entryRuleFormattedContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:552:1: entryRuleFormattedContent returns [EObject current=null] : iv_ruleFormattedContent= ruleFormattedContent EOF ;
    public final EObject entryRuleFormattedContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormattedContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:553:2: (iv_ruleFormattedContent= ruleFormattedContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:554:2: iv_ruleFormattedContent= ruleFormattedContent EOF
            {
             newCompositeNode(grammarAccess.getFormattedContentRule()); 
            pushFollow(FOLLOW_ruleFormattedContent_in_entryRuleFormattedContent1174);
            iv_ruleFormattedContent=ruleFormattedContent();

            state._fsp--;

             current =iv_ruleFormattedContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedContent1184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormattedContent"


    // $ANTLR start "ruleFormattedContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:561:1: ruleFormattedContent returns [EObject current=null] : (this_ItalicContent_0= ruleItalicContent | this_BoldContent_1= ruleBoldContent | this_BoldItalicContent_2= ruleBoldItalicContent ) ;
    public final EObject ruleFormattedContent() throws RecognitionException {
        EObject current = null;

        EObject this_ItalicContent_0 = null;

        EObject this_BoldContent_1 = null;

        EObject this_BoldItalicContent_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:564:28: ( (this_ItalicContent_0= ruleItalicContent | this_BoldContent_1= ruleBoldContent | this_BoldItalicContent_2= ruleBoldItalicContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:1: (this_ItalicContent_0= ruleItalicContent | this_BoldContent_1= ruleBoldContent | this_BoldItalicContent_2= ruleBoldItalicContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:1: (this_ItalicContent_0= ruleItalicContent | this_BoldContent_1= ruleBoldContent | this_BoldItalicContent_2= ruleBoldItalicContent )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:566:5: this_ItalicContent_0= ruleItalicContent
                    {
                     
                            newCompositeNode(grammarAccess.getFormattedContentAccess().getItalicContentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleItalicContent_in_ruleFormattedContent1231);
                    this_ItalicContent_0=ruleItalicContent();

                    state._fsp--;

                     
                            current = this_ItalicContent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:576:5: this_BoldContent_1= ruleBoldContent
                    {
                     
                            newCompositeNode(grammarAccess.getFormattedContentAccess().getBoldContentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoldContent_in_ruleFormattedContent1258);
                    this_BoldContent_1=ruleBoldContent();

                    state._fsp--;

                     
                            current = this_BoldContent_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:586:5: this_BoldItalicContent_2= ruleBoldItalicContent
                    {
                     
                            newCompositeNode(grammarAccess.getFormattedContentAccess().getBoldItalicContentParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoldItalicContent_in_ruleFormattedContent1285);
                    this_BoldItalicContent_2=ruleBoldItalicContent();

                    state._fsp--;

                     
                            current = this_BoldItalicContent_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormattedContent"


    // $ANTLR start "entryRuleItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:602:1: entryRuleItalicContent returns [EObject current=null] : iv_ruleItalicContent= ruleItalicContent EOF ;
    public final EObject entryRuleItalicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:603:2: (iv_ruleItalicContent= ruleItalicContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:604:2: iv_ruleItalicContent= ruleItalicContent EOF
            {
             newCompositeNode(grammarAccess.getItalicContentRule()); 
            pushFollow(FOLLOW_ruleItalicContent_in_entryRuleItalicContent1320);
            iv_ruleItalicContent=ruleItalicContent();

            state._fsp--;

             current =iv_ruleItalicContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicContent1330); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItalicContent"


    // $ANTLR start "ruleItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:611:1: ruleItalicContent returns [EObject current=null] : (otherlv_0= '\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Text_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:614:28: ( (otherlv_0= '\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:615:1: (otherlv_0= '\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:615:1: (otherlv_0= '\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:615:3: otherlv_0= '\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleItalicContent1367); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getItalicContentAccess().getTextParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleText_in_ruleItalicContent1389);
            this_Text_1=ruleText();

            state._fsp--;

             
                    current = this_Text_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleItalicContent1400); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItalicContent"


    // $ANTLR start "entryRuleBoldContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:640:1: entryRuleBoldContent returns [EObject current=null] : iv_ruleBoldContent= ruleBoldContent EOF ;
    public final EObject entryRuleBoldContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoldContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:641:2: (iv_ruleBoldContent= ruleBoldContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:642:2: iv_ruleBoldContent= ruleBoldContent EOF
            {
             newCompositeNode(grammarAccess.getBoldContentRule()); 
            pushFollow(FOLLOW_ruleBoldContent_in_entryRuleBoldContent1436);
            iv_ruleBoldContent=ruleBoldContent();

            state._fsp--;

             current =iv_ruleBoldContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldContent1446); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoldContent"


    // $ANTLR start "ruleBoldContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:649:1: ruleBoldContent returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBoldContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Text_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:652:28: ( (otherlv_0= '\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:653:1: (otherlv_0= '\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:653:1: (otherlv_0= '\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:653:3: otherlv_0= '\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleBoldContent1483); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBoldContentAccess().getTextParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleText_in_ruleBoldContent1505);
            this_Text_1=ruleText();

            state._fsp--;

             
                    current = this_Text_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleBoldContent1516); 

                	newLeafNode(otherlv_2, grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoldContent"


    // $ANTLR start "entryRuleBoldItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:678:1: entryRuleBoldItalicContent returns [EObject current=null] : iv_ruleBoldItalicContent= ruleBoldItalicContent EOF ;
    public final EObject entryRuleBoldItalicContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoldItalicContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:2: (iv_ruleBoldItalicContent= ruleBoldItalicContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:680:2: iv_ruleBoldItalicContent= ruleBoldItalicContent EOF
            {
             newCompositeNode(grammarAccess.getBoldItalicContentRule()); 
            pushFollow(FOLLOW_ruleBoldItalicContent_in_entryRuleBoldItalicContent1552);
            iv_ruleBoldItalicContent=ruleBoldItalicContent();

            state._fsp--;

             current =iv_ruleBoldItalicContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldItalicContent1562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoldItalicContent"


    // $ANTLR start "ruleBoldItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:687:1: ruleBoldItalicContent returns [EObject current=null] : (otherlv_0= '\\'\\'\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'\\'\\'' ) ;
    public final EObject ruleBoldItalicContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Text_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:690:28: ( (otherlv_0= '\\'\\'\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:691:1: (otherlv_0= '\\'\\'\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:691:1: (otherlv_0= '\\'\\'\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:691:3: otherlv_0= '\\'\\'\\'\\'\\'' this_Text_1= ruleText otherlv_2= '\\'\\'\\'\\'\\''
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBoldItalicContent1599); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBoldItalicContentAccess().getTextParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleText_in_ruleBoldItalicContent1621);
            this_Text_1=ruleText();

            state._fsp--;

             
                    current = this_Text_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBoldItalicContent1632); 

                	newLeafNode(otherlv_2, grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoldItalicContent"


    // $ANTLR start "entryRuleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:716:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:717:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:718:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1668);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1678); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:725:1: ruleText returns [EObject current=null] : (this_UnFormattedText_0= ruleUnFormattedText | this_Hyperlink_1= ruleHyperlink ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        EObject this_UnFormattedText_0 = null;

        EObject this_Hyperlink_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:728:28: ( (this_UnFormattedText_0= ruleUnFormattedText | this_Hyperlink_1= ruleHyperlink ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:729:1: (this_UnFormattedText_0= ruleUnFormattedText | this_Hyperlink_1= ruleHyperlink )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:729:1: (this_UnFormattedText_0= ruleUnFormattedText | this_Hyperlink_1= ruleHyperlink )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_WIKITEXT) ) {
                alt11=1;
            }
            else if ( (LA11_0==21||LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:730:5: this_UnFormattedText_0= ruleUnFormattedText
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getUnFormattedTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUnFormattedText_in_ruleText1725);
                    this_UnFormattedText_0=ruleUnFormattedText();

                    state._fsp--;

                     
                            current = this_UnFormattedText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:740:5: this_Hyperlink_1= ruleHyperlink
                    {
                     
                            newCompositeNode(grammarAccess.getTextAccess().getHyperlinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHyperlink_in_ruleText1752);
                    this_Hyperlink_1=ruleHyperlink();

                    state._fsp--;

                     
                            current = this_Hyperlink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleUnFormattedText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:756:1: entryRuleUnFormattedText returns [EObject current=null] : iv_ruleUnFormattedText= ruleUnFormattedText EOF ;
    public final EObject entryRuleUnFormattedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnFormattedText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:757:2: (iv_ruleUnFormattedText= ruleUnFormattedText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:758:2: iv_ruleUnFormattedText= ruleUnFormattedText EOF
            {
             newCompositeNode(grammarAccess.getUnFormattedTextRule()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_entryRuleUnFormattedText1787);
            iv_ruleUnFormattedText=ruleUnFormattedText();

            state._fsp--;

             current =iv_ruleUnFormattedText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnFormattedText1797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnFormattedText"


    // $ANTLR start "ruleUnFormattedText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:765:1: ruleUnFormattedText returns [EObject current=null] : ( ( (lv_words_0_0= RULE_WIKITEXT ) ) (this_WIKITEXT_1= RULE_WIKITEXT )* ) ;
    public final EObject ruleUnFormattedText() throws RecognitionException {
        EObject current = null;

        Token lv_words_0_0=null;
        Token this_WIKITEXT_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:768:28: ( ( ( (lv_words_0_0= RULE_WIKITEXT ) ) (this_WIKITEXT_1= RULE_WIKITEXT )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:769:1: ( ( (lv_words_0_0= RULE_WIKITEXT ) ) (this_WIKITEXT_1= RULE_WIKITEXT )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:769:1: ( ( (lv_words_0_0= RULE_WIKITEXT ) ) (this_WIKITEXT_1= RULE_WIKITEXT )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:769:2: ( (lv_words_0_0= RULE_WIKITEXT ) ) (this_WIKITEXT_1= RULE_WIKITEXT )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:769:2: ( (lv_words_0_0= RULE_WIKITEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:770:1: (lv_words_0_0= RULE_WIKITEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:770:1: (lv_words_0_0= RULE_WIKITEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:771:3: lv_words_0_0= RULE_WIKITEXT
            {
            lv_words_0_0=(Token)match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_ruleUnFormattedText1839); 

            			newLeafNode(lv_words_0_0, grammarAccess.getUnFormattedTextAccess().getWordsWIKITEXTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnFormattedTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"words",
                    		lv_words_0_0, 
                    		"WIKITEXT");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:787:2: (this_WIKITEXT_1= RULE_WIKITEXT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WIKITEXT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:787:3: this_WIKITEXT_1= RULE_WIKITEXT
            	    {
            	    this_WIKITEXT_1=(Token)match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_ruleUnFormattedText1856); 
            	     
            	        newLeafNode(this_WIKITEXT_1, grammarAccess.getUnFormattedTextAccess().getWIKITEXTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnFormattedText"


    // $ANTLR start "entryRuleHyperlink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:799:1: entryRuleHyperlink returns [EObject current=null] : iv_ruleHyperlink= ruleHyperlink EOF ;
    public final EObject entryRuleHyperlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperlink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:800:2: (iv_ruleHyperlink= ruleHyperlink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:801:2: iv_ruleHyperlink= ruleHyperlink EOF
            {
             newCompositeNode(grammarAccess.getHyperlinkRule()); 
            pushFollow(FOLLOW_ruleHyperlink_in_entryRuleHyperlink1893);
            iv_ruleHyperlink=ruleHyperlink();

            state._fsp--;

             current =iv_ruleHyperlink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperlink1903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyperlink"


    // $ANTLR start "ruleHyperlink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:808:1: ruleHyperlink returns [EObject current=null] : (this_InternalLink_0= ruleInternalLink | this_InternalLinkAlternative_1= ruleInternalLinkAlternative | this_ExternalLink_2= ruleExternalLink | this_ExternalLinkAlternative_3= ruleExternalLinkAlternative ) ;
    public final EObject ruleHyperlink() throws RecognitionException {
        EObject current = null;

        EObject this_InternalLink_0 = null;

        EObject this_InternalLinkAlternative_1 = null;

        EObject this_ExternalLink_2 = null;

        EObject this_ExternalLinkAlternative_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:811:28: ( (this_InternalLink_0= ruleInternalLink | this_InternalLinkAlternative_1= ruleInternalLinkAlternative | this_ExternalLink_2= ruleExternalLink | this_ExternalLinkAlternative_3= ruleExternalLinkAlternative ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:812:1: (this_InternalLink_0= ruleInternalLink | this_InternalLinkAlternative_1= ruleInternalLinkAlternative | this_ExternalLink_2= ruleExternalLink | this_ExternalLinkAlternative_3= ruleExternalLinkAlternative )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:812:1: (this_InternalLink_0= ruleInternalLink | this_InternalLinkAlternative_1= ruleInternalLinkAlternative | this_ExternalLink_2= ruleExternalLink | this_ExternalLinkAlternative_3= ruleExternalLinkAlternative )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:813:5: this_InternalLink_0= ruleInternalLink
                    {
                     
                            newCompositeNode(grammarAccess.getHyperlinkAccess().getInternalLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInternalLink_in_ruleHyperlink1950);
                    this_InternalLink_0=ruleInternalLink();

                    state._fsp--;

                     
                            current = this_InternalLink_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:823:5: this_InternalLinkAlternative_1= ruleInternalLinkAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getHyperlinkAccess().getInternalLinkAlternativeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalLinkAlternative_in_ruleHyperlink1977);
                    this_InternalLinkAlternative_1=ruleInternalLinkAlternative();

                    state._fsp--;

                     
                            current = this_InternalLinkAlternative_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:833:5: this_ExternalLink_2= ruleExternalLink
                    {
                     
                            newCompositeNode(grammarAccess.getHyperlinkAccess().getExternalLinkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternalLink_in_ruleHyperlink2004);
                    this_ExternalLink_2=ruleExternalLink();

                    state._fsp--;

                     
                            current = this_ExternalLink_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:843:5: this_ExternalLinkAlternative_3= ruleExternalLinkAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getHyperlinkAccess().getExternalLinkAlternativeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExternalLinkAlternative_in_ruleHyperlink2031);
                    this_ExternalLinkAlternative_3=ruleExternalLinkAlternative();

                    state._fsp--;

                     
                            current = this_ExternalLinkAlternative_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyperlink"


    // $ANTLR start "entryRuleExternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:859:1: entryRuleExternalLink returns [EObject current=null] : iv_ruleExternalLink= ruleExternalLink EOF ;
    public final EObject entryRuleExternalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:860:2: (iv_ruleExternalLink= ruleExternalLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:861:2: iv_ruleExternalLink= ruleExternalLink EOF
            {
             newCompositeNode(grammarAccess.getExternalLinkRule()); 
            pushFollow(FOLLOW_ruleExternalLink_in_entryRuleExternalLink2066);
            iv_ruleExternalLink=ruleExternalLink();

            state._fsp--;

             current =iv_ruleExternalLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLink2076); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalLink"


    // $ANTLR start "ruleExternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:868:1: ruleExternalLink returns [EObject current=null] : (otherlv_0= '[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']' ) ;
    public final EObject ruleExternalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pageName_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:871:28: ( (otherlv_0= '[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:872:1: (otherlv_0= '[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:872:1: (otherlv_0= '[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:872:3: otherlv_0= '[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleExternalLink2113); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLinkAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:876:1: ( (lv_pageName_1_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:877:1: (lv_pageName_1_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:877:1: (lv_pageName_1_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:878:3: lv_pageName_1_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getExternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleExternalLink2134);
            lv_pageName_1_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLinkRule());
            	        }
                   		set(
                   			current, 
                   			"pageName",
                    		lv_pageName_1_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExternalLink2146); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalLink"


    // $ANTLR start "entryRuleExternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:906:1: entryRuleExternalLinkAlternative returns [EObject current=null] : iv_ruleExternalLinkAlternative= ruleExternalLinkAlternative EOF ;
    public final EObject entryRuleExternalLinkAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLinkAlternative = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:907:2: (iv_ruleExternalLinkAlternative= ruleExternalLinkAlternative EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:908:2: iv_ruleExternalLinkAlternative= ruleExternalLinkAlternative EOF
            {
             newCompositeNode(grammarAccess.getExternalLinkAlternativeRule()); 
            pushFollow(FOLLOW_ruleExternalLinkAlternative_in_entryRuleExternalLinkAlternative2182);
            iv_ruleExternalLinkAlternative=ruleExternalLinkAlternative();

            state._fsp--;

             current =iv_ruleExternalLinkAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLinkAlternative2192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalLinkAlternative"


    // $ANTLR start "ruleExternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:915:1: ruleExternalLinkAlternative returns [EObject current=null] : (otherlv_0= '[' ( (lv_url_1_0= ruleUnFormattedText ) ) otherlv_2= ' ' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']' ) ;
    public final EObject ruleExternalLinkAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_url_1_0 = null;

        EObject lv_alternativeText_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:918:28: ( (otherlv_0= '[' ( (lv_url_1_0= ruleUnFormattedText ) ) otherlv_2= ' ' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:919:1: (otherlv_0= '[' ( (lv_url_1_0= ruleUnFormattedText ) ) otherlv_2= ' ' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:919:1: (otherlv_0= '[' ( (lv_url_1_0= ruleUnFormattedText ) ) otherlv_2= ' ' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:919:3: otherlv_0= '[' ( (lv_url_1_0= ruleUnFormattedText ) ) otherlv_2= ' ' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleExternalLinkAlternative2229); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLinkAlternativeAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:923:1: ( (lv_url_1_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:924:1: (lv_url_1_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:924:1: (lv_url_1_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:925:3: lv_url_1_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getExternalLinkAlternativeAccess().getUrlUnFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleExternalLinkAlternative2250);
            lv_url_1_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLinkAlternativeRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleExternalLinkAlternative2262); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalLinkAlternativeAccess().getSpaceKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:945:1: ( (lv_alternativeText_3_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:946:1: (lv_alternativeText_3_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:946:1: (lv_alternativeText_3_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:947:3: lv_alternativeText_3_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getExternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleExternalLinkAlternative2283);
            lv_alternativeText_3_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLinkAlternativeRule());
            	        }
                   		set(
                   			current, 
                   			"alternativeText",
                    		lv_alternativeText_3_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleExternalLinkAlternative2295); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalLinkAlternativeAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalLinkAlternative"


    // $ANTLR start "entryRuleInternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:975:1: entryRuleInternalLink returns [EObject current=null] : iv_ruleInternalLink= ruleInternalLink EOF ;
    public final EObject entryRuleInternalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalLink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:976:2: (iv_ruleInternalLink= ruleInternalLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:977:2: iv_ruleInternalLink= ruleInternalLink EOF
            {
             newCompositeNode(grammarAccess.getInternalLinkRule()); 
            pushFollow(FOLLOW_ruleInternalLink_in_entryRuleInternalLink2331);
            iv_ruleInternalLink=ruleInternalLink();

            state._fsp--;

             current =iv_ruleInternalLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLink2341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalLink"


    // $ANTLR start "ruleInternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:984:1: ruleInternalLink returns [EObject current=null] : (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']]' ) ;
    public final EObject ruleInternalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pageName_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:987:28: ( (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:988:1: (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:988:1: (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:988:3: otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleInternalLink2378); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:992:1: ( (lv_pageName_1_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:993:1: (lv_pageName_1_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:993:1: (lv_pageName_1_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:994:3: lv_pageName_1_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getInternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleInternalLink2399);
            lv_pageName_1_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalLinkRule());
            	        }
                   		set(
                   			current, 
                   			"pageName",
                    		lv_pageName_1_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleInternalLink2411); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalLink"


    // $ANTLR start "entryRuleInternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1022:1: entryRuleInternalLinkAlternative returns [EObject current=null] : iv_ruleInternalLinkAlternative= ruleInternalLinkAlternative EOF ;
    public final EObject entryRuleInternalLinkAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalLinkAlternative = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1023:2: (iv_ruleInternalLinkAlternative= ruleInternalLinkAlternative EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1024:2: iv_ruleInternalLinkAlternative= ruleInternalLinkAlternative EOF
            {
             newCompositeNode(grammarAccess.getInternalLinkAlternativeRule()); 
            pushFollow(FOLLOW_ruleInternalLinkAlternative_in_entryRuleInternalLinkAlternative2447);
            iv_ruleInternalLinkAlternative=ruleInternalLinkAlternative();

            state._fsp--;

             current =iv_ruleInternalLinkAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLinkAlternative2457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternalLinkAlternative"


    // $ANTLR start "ruleInternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1031:1: ruleInternalLinkAlternative returns [EObject current=null] : (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= '|' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']]' ) ;
    public final EObject ruleInternalLinkAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_pageName_1_0 = null;

        EObject lv_alternativeText_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1034:28: ( (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= '|' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1035:1: (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= '|' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1035:1: (otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= '|' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1035:3: otherlv_0= '[[' ( (lv_pageName_1_0= ruleUnFormattedText ) ) otherlv_2= '|' ( (lv_alternativeText_3_0= ruleUnFormattedText ) ) otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleInternalLinkAlternative2494); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalLinkAlternativeAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1039:1: ( (lv_pageName_1_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1040:1: (lv_pageName_1_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1040:1: (lv_pageName_1_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1041:3: lv_pageName_1_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getInternalLinkAlternativeAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleInternalLinkAlternative2515);
            lv_pageName_1_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalLinkAlternativeRule());
            	        }
                   		set(
                   			current, 
                   			"pageName",
                    		lv_pageName_1_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleInternalLinkAlternative2527); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalLinkAlternativeAccess().getVerticalLineKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1061:1: ( (lv_alternativeText_3_0= ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1062:1: (lv_alternativeText_3_0= ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1062:1: (lv_alternativeText_3_0= ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1063:3: lv_alternativeText_3_0= ruleUnFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getInternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUnFormattedText_in_ruleInternalLinkAlternative2548);
            lv_alternativeText_3_0=ruleUnFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalLinkAlternativeRule());
            	        }
                   		set(
                   			current, 
                   			"alternativeText",
                    		lv_alternativeText_3_0, 
                    		"UnFormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleInternalLinkAlternative2560); 

                	newLeafNode(otherlv_4, grammarAccess.getInternalLinkAlternativeAccess().getRightSquareBracketRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternalLinkAlternative"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\13\uffff";
    static final String DFA13_minS =
        "\1\25\5\4\2\uffff\1\4\2\uffff";
    static final String DFA13_maxS =
        "\1\30\2\4\1\32\1\27\1\32\2\uffff\1\27\2\uffff";
    static final String DFA13_acceptS =
        "\6\uffff\1\2\1\1\1\uffff\1\3\1\4";
    static final String DFA13_specialS =
        "\13\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5\24\uffff\1\7\1\6",
            "\1\10\21\uffff\1\11\1\12",
            "\1\5\24\uffff\1\7\1\6",
            "",
            "",
            "\1\10\21\uffff\1\11\1\12",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "812:1: (this_InternalLink_0= ruleInternalLink | this_InternalLinkAlternative_1= ruleInternalLinkAlternative | this_ExternalLink_2= ruleExternalLink | this_ExternalLinkAlternative_3= ruleExternalLinkAlternative )";
        }
    }
 

    public static final BitSet FOLLOW_rulewikipage_in_entryRulewikipage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewikipage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulewikipage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rulewikipage139 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rulewikipage156 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rulewikipage169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulewikipage181 = new BitSet(new long[]{0x00000000013FC010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rulewikipage202 = new BitSet(new long[]{0x00000000013FC010L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rulewikipage224 = new BitSet(new long[]{0x00000000013FC012L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rulewikipage245 = new BitSet(new long[]{0x00000000013FC012L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_ruleAbstractSection339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_ruleAbstractSection366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_ruleAbstractSection393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_ruleAbstractSection420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubsectionLevel1502 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleSubsectionLevel1523 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubsectionLevel1535 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubsectionLevel1547 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1568 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubsectionLevel2652 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleSubsectionLevel2673 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSubsectionLevel2685 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubsectionLevel2697 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2718 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubsectionLevel3802 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleSubsectionLevel3823 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubsectionLevel3835 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubsectionLevel3847 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3868 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubsectionLevel4952 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleSubsectionLevel4973 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSubsectionLevel4985 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSubsectionLevel4997 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel41018 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_entryRuleInlineContent1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineContent1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedContent_in_ruleInlineContent1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleInlineContent1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedContent_in_entryRuleFormattedContent1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedContent1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicContent_in_ruleFormattedContent1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldContent_in_ruleFormattedContent1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldItalicContent_in_ruleFormattedContent1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicContent_in_entryRuleItalicContent1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicContent1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleItalicContent1367 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleItalicContent1389 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleItalicContent1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldContent_in_entryRuleBoldContent1436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldContent1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBoldContent1483 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleBoldContent1505 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBoldContent1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldItalicContent_in_entryRuleBoldItalicContent1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldItalicContent1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoldItalicContent1599 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_ruleText_in_ruleBoldItalicContent1621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoldItalicContent1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleText1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperlink_in_ruleText1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_entryRuleUnFormattedText1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnFormattedText1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_ruleUnFormattedText1839 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_ruleUnFormattedText1856 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHyperlink_in_entryRuleHyperlink1893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperlink1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_ruleHyperlink1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLinkAlternative_in_ruleHyperlink1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_ruleHyperlink2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLinkAlternative_in_ruleHyperlink2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_entryRuleExternalLink2066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLink2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExternalLink2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleExternalLink2134 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExternalLink2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLinkAlternative_in_entryRuleExternalLinkAlternative2182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLinkAlternative2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExternalLinkAlternative2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleExternalLinkAlternative2250 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExternalLinkAlternative2262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleExternalLinkAlternative2283 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExternalLinkAlternative2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_entryRuleInternalLink2331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLink2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInternalLink2378 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleInternalLink2399 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInternalLink2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLinkAlternative_in_entryRuleInternalLinkAlternative2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLinkAlternative2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInternalLinkAlternative2494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleInternalLinkAlternative2515 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleInternalLinkAlternative2527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_ruleInternalLinkAlternative2548 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInternalLinkAlternative2560 = new BitSet(new long[]{0x0000000000000002L});

}