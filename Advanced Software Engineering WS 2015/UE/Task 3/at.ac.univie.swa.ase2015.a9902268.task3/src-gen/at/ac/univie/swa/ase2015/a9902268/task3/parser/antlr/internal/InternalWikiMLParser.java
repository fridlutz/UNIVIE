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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'=\\n'", "'=='", "'==\\n'", "'==='", "'===\\n'", "'===='", "'====\\n'", "'\\'\\'\\''", "'\\'\\''"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_TEXT=4;
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
        	return "WikiMLPage";	
       	}
       	
       	@Override
       	protected WikiMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWikiMLPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:67:1: entryRuleWikiMLPage returns [EObject current=null] : iv_ruleWikiMLPage= ruleWikiMLPage EOF ;
    public final EObject entryRuleWikiMLPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWikiMLPage = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:68:2: (iv_ruleWikiMLPage= ruleWikiMLPage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:69:2: iv_ruleWikiMLPage= ruleWikiMLPage EOF
            {
             newCompositeNode(grammarAccess.getWikiMLPageRule()); 
            pushFollow(FOLLOW_ruleWikiMLPage_in_entryRuleWikiMLPage75);
            iv_ruleWikiMLPage=ruleWikiMLPage();

            state._fsp--;

             current =iv_ruleWikiMLPage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWikiMLPage85); 

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
    // $ANTLR end "entryRuleWikiMLPage"


    // $ANTLR start "ruleWikiMLPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:76:1: ruleWikiMLPage returns [EObject current=null] : ( ( (lv_title_0_0= rulePageTitle ) ) ( (lv_section_1_0= ruleAbstractSection ) )* ) ;
    public final EObject ruleWikiMLPage() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_section_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:79:28: ( ( ( (lv_title_0_0= rulePageTitle ) ) ( (lv_section_1_0= ruleAbstractSection ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: ( ( (lv_title_0_0= rulePageTitle ) ) ( (lv_section_1_0= ruleAbstractSection ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: ( ( (lv_title_0_0= rulePageTitle ) ) ( (lv_section_1_0= ruleAbstractSection ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:2: ( (lv_title_0_0= rulePageTitle ) ) ( (lv_section_1_0= ruleAbstractSection ) )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:2: ( (lv_title_0_0= rulePageTitle ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: (lv_title_0_0= rulePageTitle )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: (lv_title_0_0= rulePageTitle )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:82:3: lv_title_0_0= rulePageTitle
            {
             
            	        newCompositeNode(grammarAccess.getWikiMLPageAccess().getTitlePageTitleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePageTitle_in_ruleWikiMLPage131);
            lv_title_0_0=rulePageTitle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikiMLPageRule());
            	        }
                   		add(
                   			current, 
                   			"title",
                    		lv_title_0_0, 
                    		"PageTitle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:98:2: ( (lv_section_1_0= ruleAbstractSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:99:1: (lv_section_1_0= ruleAbstractSection )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:99:1: (lv_section_1_0= ruleAbstractSection )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:100:3: lv_section_1_0= ruleAbstractSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikiMLPageAccess().getSectionAbstractSectionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractSection_in_ruleWikiMLPage152);
            	    lv_section_1_0=ruleAbstractSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikiMLPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"section",
            	            		lv_section_1_0, 
            	            		"AbstractSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleWikiMLPage"


    // $ANTLR start "entryRulePageTitle"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:124:1: entryRulePageTitle returns [EObject current=null] : iv_rulePageTitle= rulePageTitle EOF ;
    public final EObject entryRulePageTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageTitle = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:125:2: (iv_rulePageTitle= rulePageTitle EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:126:2: iv_rulePageTitle= rulePageTitle EOF
            {
             newCompositeNode(grammarAccess.getPageTitleRule()); 
            pushFollow(FOLLOW_rulePageTitle_in_entryRulePageTitle189);
            iv_rulePageTitle=rulePageTitle();

            state._fsp--;

             current =iv_rulePageTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageTitle199); 

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
    // $ANTLR end "entryRulePageTitle"


    // $ANTLR start "rulePageTitle"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:133:1: rulePageTitle returns [EObject current=null] : (otherlv_0= '=' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '=\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) ;
    public final EObject rulePageTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:136:28: ( (otherlv_0= '=' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '=\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:137:1: (otherlv_0= '=' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '=\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:137:1: (otherlv_0= '=' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '=\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:137:3: otherlv_0= '=' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '=\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePageTitle236); 

                	newLeafNode(otherlv_0, grammarAccess.getPageTitleAccess().getEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:141:1: ( (lv_name_1_0= RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:142:1: (lv_name_1_0= RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:142:1: (lv_name_1_0= RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:143:3: lv_name_1_0= RULE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rulePageTitle253); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageTitleAccess().getNameTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageTitleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"TEXT");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePageTitle270); 

                	newLeafNode(otherlv_2, grammarAccess.getPageTitleAccess().getEqualsSignControl000aKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:163:1: ( (lv_content_3_0= ruleAbstractParagraph ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_TEXT||(LA2_0>=20 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:164:1: (lv_content_3_0= ruleAbstractParagraph )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:164:1: (lv_content_3_0= ruleAbstractParagraph )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:165:3: lv_content_3_0= ruleAbstractParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageTitleAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractParagraph_in_rulePageTitle291);
            	    lv_content_3_0=ruleAbstractParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AbstractParagraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePageTitle"


    // $ANTLR start "entryRuleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:189:1: entryRuleAbstractSection returns [EObject current=null] : iv_ruleAbstractSection= ruleAbstractSection EOF ;
    public final EObject entryRuleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:190:2: (iv_ruleAbstractSection= ruleAbstractSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:191:2: iv_ruleAbstractSection= ruleAbstractSection EOF
            {
             newCompositeNode(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection328);
            iv_ruleAbstractSection=ruleAbstractSection();

            state._fsp--;

             current =iv_ruleAbstractSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection338); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:198:1: ruleAbstractSection returns [EObject current=null] : (this_SubSection_0= ruleSubSection | this_SubSubSection_1= ruleSubSubSection | this_SubSubSubSection_2= ruleSubSubSubSection ) ;
    public final EObject ruleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject this_SubSection_0 = null;

        EObject this_SubSubSection_1 = null;

        EObject this_SubSubSubSection_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:201:28: ( (this_SubSection_0= ruleSubSection | this_SubSubSection_1= ruleSubSubSection | this_SubSubSubSection_2= ruleSubSubSubSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:202:1: (this_SubSection_0= ruleSubSection | this_SubSubSection_1= ruleSubSubSection | this_SubSubSubSection_2= ruleSubSubSubSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:202:1: (this_SubSection_0= ruleSubSection | this_SubSubSection_1= ruleSubSubSection | this_SubSubSubSection_2= ruleSubSubSubSection )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:203:5: this_SubSection_0= ruleSubSection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubSectionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSubSection_in_ruleAbstractSection385);
                    this_SubSection_0=ruleSubSection();

                    state._fsp--;

                     
                            current = this_SubSection_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:213:5: this_SubSubSection_1= ruleSubSubSection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubSubSectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubSubSection_in_ruleAbstractSection412);
                    this_SubSubSection_1=ruleSubSubSection();

                    state._fsp--;

                     
                            current = this_SubSubSection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:223:5: this_SubSubSubSection_2= ruleSubSubSubSection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubSubSubSectionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSubSubSubSection_in_ruleAbstractSection439);
                    this_SubSubSubSection_2=ruleSubSubSubSection();

                    state._fsp--;

                     
                            current = this_SubSubSubSection_2; 
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


    // $ANTLR start "entryRuleSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:239:1: entryRuleSubSection returns [EObject current=null] : iv_ruleSubSection= ruleSubSection EOF ;
    public final EObject entryRuleSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:240:2: (iv_ruleSubSection= ruleSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:241:2: iv_ruleSubSection= ruleSubSection EOF
            {
             newCompositeNode(grammarAccess.getSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection474);
            iv_ruleSubSection=ruleSubSection();

            state._fsp--;

             current =iv_ruleSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection484); 

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
    // $ANTLR end "entryRuleSubSection"


    // $ANTLR start "ruleSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:248:1: ruleSubSection returns [EObject current=null] : (otherlv_0= '==' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '==\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) ;
    public final EObject ruleSubSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:251:28: ( (otherlv_0= '==' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '==\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:252:1: (otherlv_0= '==' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '==\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:252:1: (otherlv_0= '==' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '==\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:252:3: otherlv_0= '==' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '==\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSubSection521); 

                	newLeafNode(otherlv_0, grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:256:1: ( (lv_name_1_0= RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:257:1: (lv_name_1_0= RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:257:1: (lv_name_1_0= RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:258:3: lv_name_1_0= RULE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleSubSection538); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"TEXT");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSubSection555); 

                	newLeafNode(otherlv_2, grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignControl000aKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:278:1: ( (lv_content_3_0= ruleAbstractParagraph ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TEXT||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:279:1: (lv_content_3_0= ruleAbstractParagraph )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:279:1: (lv_content_3_0= ruleAbstractParagraph )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:280:3: lv_content_3_0= ruleAbstractParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractParagraph_in_ruleSubSection576);
            	    lv_content_3_0=ruleAbstractParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AbstractParagraph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleSubSection"


    // $ANTLR start "entryRuleSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:304:1: entryRuleSubSubSection returns [EObject current=null] : iv_ruleSubSubSection= ruleSubSubSection EOF ;
    public final EObject entryRuleSubSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSubSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:305:2: (iv_ruleSubSubSection= ruleSubSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:306:2: iv_ruleSubSubSection= ruleSubSubSection EOF
            {
             newCompositeNode(grammarAccess.getSubSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSubSection_in_entryRuleSubSubSection613);
            iv_ruleSubSubSection=ruleSubSubSection();

            state._fsp--;

             current =iv_ruleSubSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSubSection623); 

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
    // $ANTLR end "entryRuleSubSubSection"


    // $ANTLR start "ruleSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:313:1: ruleSubSubSection returns [EObject current=null] : (otherlv_0= '===' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '===\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) ;
    public final EObject ruleSubSubSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:316:28: ( (otherlv_0= '===' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '===\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:317:1: (otherlv_0= '===' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '===\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:317:1: (otherlv_0= '===' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '===\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:317:3: otherlv_0= '===' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '===\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSubSubSection660); 

                	newLeafNode(otherlv_0, grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:321:1: ( (lv_name_1_0= RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:322:1: (lv_name_1_0= RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:322:1: (lv_name_1_0= RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:323:3: lv_name_1_0= RULE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleSubSubSection677); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubSubSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"TEXT");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSubSubSection694); 

                	newLeafNode(otherlv_2, grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignControl000aKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:343:1: ( (lv_content_3_0= ruleAbstractParagraph ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TEXT||(LA5_0>=20 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:344:1: (lv_content_3_0= ruleAbstractParagraph )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:344:1: (lv_content_3_0= ruleAbstractParagraph )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:345:3: lv_content_3_0= ruleAbstractParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractParagraph_in_ruleSubSubSection715);
            	    lv_content_3_0=ruleAbstractParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSubSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AbstractParagraph");
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
    // $ANTLR end "ruleSubSubSection"


    // $ANTLR start "entryRuleSubSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:369:1: entryRuleSubSubSubSection returns [EObject current=null] : iv_ruleSubSubSubSection= ruleSubSubSubSection EOF ;
    public final EObject entryRuleSubSubSubSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSubSubSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:370:2: (iv_ruleSubSubSubSection= ruleSubSubSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:371:2: iv_ruleSubSubSubSection= ruleSubSubSubSection EOF
            {
             newCompositeNode(grammarAccess.getSubSubSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSubSubSection_in_entryRuleSubSubSubSection752);
            iv_ruleSubSubSubSection=ruleSubSubSubSection();

            state._fsp--;

             current =iv_ruleSubSubSubSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSubSubSection762); 

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
    // $ANTLR end "entryRuleSubSubSubSection"


    // $ANTLR start "ruleSubSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:378:1: ruleSubSubSubSection returns [EObject current=null] : (otherlv_0= '====' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '====\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) ;
    public final EObject ruleSubSubSubSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:381:28: ( (otherlv_0= '====' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '====\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:382:1: (otherlv_0= '====' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '====\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:382:1: (otherlv_0= '====' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '====\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:382:3: otherlv_0= '====' ( (lv_name_1_0= RULE_TEXT ) ) otherlv_2= '====\\n' ( (lv_content_3_0= ruleAbstractParagraph ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSubSubSubSection799); 

                	newLeafNode(otherlv_0, grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:386:1: ( (lv_name_1_0= RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:1: (lv_name_1_0= RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:1: (lv_name_1_0= RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:388:3: lv_name_1_0= RULE_TEXT
            {
            lv_name_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleSubSubSubSection816); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubSubSubSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"TEXT");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleSubSubSubSection833); 

                	newLeafNode(otherlv_2, grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignControl000aKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:408:1: ( (lv_content_3_0= ruleAbstractParagraph ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TEXT||(LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:409:1: (lv_content_3_0= ruleAbstractParagraph )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:409:1: (lv_content_3_0= ruleAbstractParagraph )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:410:3: lv_content_3_0= ruleAbstractParagraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractParagraph_in_ruleSubSubSubSection854);
            	    lv_content_3_0=ruleAbstractParagraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSubSubSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AbstractParagraph");
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
    // $ANTLR end "ruleSubSubSubSection"


    // $ANTLR start "entryRuleAbstractParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:434:1: entryRuleAbstractParagraph returns [EObject current=null] : iv_ruleAbstractParagraph= ruleAbstractParagraph EOF ;
    public final EObject entryRuleAbstractParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParagraph = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:435:2: (iv_ruleAbstractParagraph= ruleAbstractParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:436:2: iv_ruleAbstractParagraph= ruleAbstractParagraph EOF
            {
             newCompositeNode(grammarAccess.getAbstractParagraphRule()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_entryRuleAbstractParagraph891);
            iv_ruleAbstractParagraph=ruleAbstractParagraph();

            state._fsp--;

             current =iv_ruleAbstractParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractParagraph901); 

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
    // $ANTLR end "entryRuleAbstractParagraph"


    // $ANTLR start "ruleAbstractParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:443:1: ruleAbstractParagraph returns [EObject current=null] : (this_NormalParagraph_0= ruleNormalParagraph | this_BoldParagraph_1= ruleBoldParagraph | this_ItalicParagraph_2= ruleItalicParagraph ) ;
    public final EObject ruleAbstractParagraph() throws RecognitionException {
        EObject current = null;

        EObject this_NormalParagraph_0 = null;

        EObject this_BoldParagraph_1 = null;

        EObject this_ItalicParagraph_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:446:28: ( (this_NormalParagraph_0= ruleNormalParagraph | this_BoldParagraph_1= ruleBoldParagraph | this_ItalicParagraph_2= ruleItalicParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:447:1: (this_NormalParagraph_0= ruleNormalParagraph | this_BoldParagraph_1= ruleBoldParagraph | this_ItalicParagraph_2= ruleItalicParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:447:1: (this_NormalParagraph_0= ruleNormalParagraph | this_BoldParagraph_1= ruleBoldParagraph | this_ItalicParagraph_2= ruleItalicParagraph )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_TEXT:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:448:5: this_NormalParagraph_0= ruleNormalParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractParagraphAccess().getNormalParagraphParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNormalParagraph_in_ruleAbstractParagraph948);
                    this_NormalParagraph_0=ruleNormalParagraph();

                    state._fsp--;

                     
                            current = this_NormalParagraph_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:458:5: this_BoldParagraph_1= ruleBoldParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractParagraphAccess().getBoldParagraphParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBoldParagraph_in_ruleAbstractParagraph975);
                    this_BoldParagraph_1=ruleBoldParagraph();

                    state._fsp--;

                     
                            current = this_BoldParagraph_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:468:5: this_ItalicParagraph_2= ruleItalicParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractParagraphAccess().getItalicParagraphParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleItalicParagraph_in_ruleAbstractParagraph1002);
                    this_ItalicParagraph_2=ruleItalicParagraph();

                    state._fsp--;

                     
                            current = this_ItalicParagraph_2; 
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
    // $ANTLR end "ruleAbstractParagraph"


    // $ANTLR start "entryRuleNormalParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:484:1: entryRuleNormalParagraph returns [EObject current=null] : iv_ruleNormalParagraph= ruleNormalParagraph EOF ;
    public final EObject entryRuleNormalParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalParagraph = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:485:2: (iv_ruleNormalParagraph= ruleNormalParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:486:2: iv_ruleNormalParagraph= ruleNormalParagraph EOF
            {
             newCompositeNode(grammarAccess.getNormalParagraphRule()); 
            pushFollow(FOLLOW_ruleNormalParagraph_in_entryRuleNormalParagraph1037);
            iv_ruleNormalParagraph=ruleNormalParagraph();

            state._fsp--;

             current =iv_ruleNormalParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalParagraph1047); 

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
    // $ANTLR end "entryRuleNormalParagraph"


    // $ANTLR start "ruleNormalParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:493:1: ruleNormalParagraph returns [EObject current=null] : ( (lv_name_0_0= RULE_TEXT ) ) ;
    public final EObject ruleNormalParagraph() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:496:28: ( ( (lv_name_0_0= RULE_TEXT ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:497:1: ( (lv_name_0_0= RULE_TEXT ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:497:1: ( (lv_name_0_0= RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:498:1: (lv_name_0_0= RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:498:1: (lv_name_0_0= RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:499:3: lv_name_0_0= RULE_TEXT
            {
            lv_name_0_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleNormalParagraph1088); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNormalParagraphAccess().getNameTEXTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalParagraphRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TEXT");
            	    

            }


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
    // $ANTLR end "ruleNormalParagraph"


    // $ANTLR start "entryRuleBoldParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:523:1: entryRuleBoldParagraph returns [EObject current=null] : iv_ruleBoldParagraph= ruleBoldParagraph EOF ;
    public final EObject entryRuleBoldParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoldParagraph = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:524:2: (iv_ruleBoldParagraph= ruleBoldParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:525:2: iv_ruleBoldParagraph= ruleBoldParagraph EOF
            {
             newCompositeNode(grammarAccess.getBoldParagraphRule()); 
            pushFollow(FOLLOW_ruleBoldParagraph_in_entryRuleBoldParagraph1128);
            iv_ruleBoldParagraph=ruleBoldParagraph();

            state._fsp--;

             current =iv_ruleBoldParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldParagraph1138); 

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
    // $ANTLR end "entryRuleBoldParagraph"


    // $ANTLR start "ruleBoldParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:532:1: ruleBoldParagraph returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBoldParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NormalParagraph_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:535:28: ( (otherlv_0= '\\'\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:536:1: (otherlv_0= '\\'\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:536:1: (otherlv_0= '\\'\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:536:3: otherlv_0= '\\'\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBoldParagraph1175); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBoldParagraphAccess().getNormalParagraphParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNormalParagraph_in_ruleBoldParagraph1197);
            this_NormalParagraph_1=ruleNormalParagraph();

            state._fsp--;

             
                    current = this_NormalParagraph_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBoldParagraph1208); 

                	newLeafNode(otherlv_2, grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleBoldParagraph"


    // $ANTLR start "entryRuleItalicParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:561:1: entryRuleItalicParagraph returns [EObject current=null] : iv_ruleItalicParagraph= ruleItalicParagraph EOF ;
    public final EObject entryRuleItalicParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicParagraph = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:562:2: (iv_ruleItalicParagraph= ruleItalicParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:563:2: iv_ruleItalicParagraph= ruleItalicParagraph EOF
            {
             newCompositeNode(grammarAccess.getItalicParagraphRule()); 
            pushFollow(FOLLOW_ruleItalicParagraph_in_entryRuleItalicParagraph1244);
            iv_ruleItalicParagraph=ruleItalicParagraph();

            state._fsp--;

             current =iv_ruleItalicParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicParagraph1254); 

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
    // $ANTLR end "entryRuleItalicParagraph"


    // $ANTLR start "ruleItalicParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:570:1: ruleItalicParagraph returns [EObject current=null] : (otherlv_0= '\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalicParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_NormalParagraph_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:573:28: ( (otherlv_0= '\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:574:1: (otherlv_0= '\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:574:1: (otherlv_0= '\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:574:3: otherlv_0= '\\'\\'' this_NormalParagraph_1= ruleNormalParagraph otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleItalicParagraph1291); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getItalicParagraphAccess().getNormalParagraphParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNormalParagraph_in_ruleItalicParagraph1313);
            this_NormalParagraph_1=ruleNormalParagraph();

            state._fsp--;

             
                    current = this_NormalParagraph_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleItalicParagraph1324); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleItalicParagraph"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWikiMLPage_in_entryRuleWikiMLPage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWikiMLPage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageTitle_in_ruleWikiMLPage131 = new BitSet(new long[]{0x0000000000054002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_ruleWikiMLPage152 = new BitSet(new long[]{0x0000000000054002L});
    public static final BitSet FOLLOW_rulePageTitle_in_entryRulePageTitle189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageTitle199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePageTitle236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rulePageTitle253 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePageTitle270 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_rulePageTitle291 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_ruleAbstractSection385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSection_in_ruleAbstractSection412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSubSection_in_ruleAbstractSection439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubSection521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleSubSection538 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSubSection555 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_ruleSubSection576 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleSubSubSection_in_entryRuleSubSubSection613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSubSection623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubSubSection660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleSubSubSection677 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSubSubSection694 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_ruleSubSubSection715 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleSubSubSubSection_in_entryRuleSubSubSubSection752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSubSubSection762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSubSubSubSection799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleSubSubSubSection816 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSubSubSubSection833 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_ruleSubSubSubSection854 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_entryRuleAbstractParagraph891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractParagraph901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_ruleAbstractParagraph948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldParagraph_in_ruleAbstractParagraph975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicParagraph_in_ruleAbstractParagraph1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_entryRuleNormalParagraph1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalParagraph1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleNormalParagraph1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldParagraph_in_entryRuleBoldParagraph1128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldParagraph1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoldParagraph1175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_ruleBoldParagraph1197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoldParagraph1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicParagraph_in_entryRuleItalicParagraph1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicParagraph1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleItalicParagraph1291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_ruleItalicParagraph1313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleItalicParagraph1324 = new BitSet(new long[]{0x0000000000000002L});

}