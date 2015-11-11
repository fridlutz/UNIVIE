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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'title\\n'", "'section1'", "'section1\\n'", "'section2'", "'section2\\n'", "'section3'", "'section3\\n'", "'section4'", "'section4\\n'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:76:1: rulewikipage returns [EObject current=null] : (otherlv_0= 'title' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'title\\n' ( (lv_content_3_0= ruleInlineContent ) )? ( (lv_sections_4_0= ruleAbstractSection ) ) ( (lv_AbstractSections_5_0= ruleAbstractSection ) )* ) ;
    public final EObject rulewikipage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;

        EObject lv_sections_4_0 = null;

        EObject lv_AbstractSections_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:79:28: ( (otherlv_0= 'title' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'title\\n' ( (lv_content_3_0= ruleInlineContent ) )? ( (lv_sections_4_0= ruleAbstractSection ) ) ( (lv_AbstractSections_5_0= ruleAbstractSection ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (otherlv_0= 'title' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'title\\n' ( (lv_content_3_0= ruleInlineContent ) )? ( (lv_sections_4_0= ruleAbstractSection ) ) ( (lv_AbstractSections_5_0= ruleAbstractSection ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (otherlv_0= 'title' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'title\\n' ( (lv_content_3_0= ruleInlineContent ) )? ( (lv_sections_4_0= ruleAbstractSection ) ) ( (lv_AbstractSections_5_0= ruleAbstractSection ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:3: otherlv_0= 'title' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'title\\n' ( (lv_content_3_0= ruleInlineContent ) )? ( (lv_sections_4_0= ruleAbstractSection ) ) ( (lv_AbstractSections_5_0= ruleAbstractSection ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulewikipage122); 

                	newLeafNode(otherlv_0, grammarAccess.getWikipageAccess().getTitleKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:84:1: ( (lv_name_1_0= ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:85:1: (lv_name_1_0= ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:85:1: (lv_name_1_0= ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:86:3: lv_name_1_0= ruleInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getWikipageAccess().getNameInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInlineContent_in_rulewikipage143);
            lv_name_1_0=ruleInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"InlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulewikipage155); 

                	newLeafNode(otherlv_2, grammarAccess.getWikipageAccess().getTitleKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:106:1: ( (lv_content_3_0= ruleInlineContent ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:107:1: (lv_content_3_0= ruleInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:107:1: (lv_content_3_0= ruleInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:108:3: lv_content_3_0= ruleInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInlineContent_in_rulewikipage176);
                    lv_content_3_0=ruleInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWikipageRule());
                    	        }
                           		add(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"InlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:124:3: ( (lv_sections_4_0= ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:125:1: (lv_sections_4_0= ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:125:1: (lv_sections_4_0= ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:126:3: lv_sections_4_0= ruleAbstractSection
            {
             
            	        newCompositeNode(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractSection_in_rulewikipage198);
            lv_sections_4_0=ruleAbstractSection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_4_0, 
                    		"AbstractSection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:142:2: ( (lv_AbstractSections_5_0= ruleAbstractSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==15||LA2_0==17||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:143:1: (lv_AbstractSections_5_0= ruleAbstractSection )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:143:1: (lv_AbstractSections_5_0= ruleAbstractSection )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:144:3: lv_AbstractSections_5_0= ruleAbstractSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikipageAccess().getAbstractSectionsAbstractSectionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractSection_in_rulewikipage219);
            	    lv_AbstractSections_5_0=ruleAbstractSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikipageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"AbstractSections",
            	            		lv_AbstractSections_5_0, 
            	            		"AbstractSection");
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
    // $ANTLR end "rulewikipage"


    // $ANTLR start "entryRuleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:168:1: entryRuleAbstractSection returns [EObject current=null] : iv_ruleAbstractSection= ruleAbstractSection EOF ;
    public final EObject entryRuleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSection = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:169:2: (iv_ruleAbstractSection= ruleAbstractSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:170:2: iv_ruleAbstractSection= ruleAbstractSection EOF
            {
             newCompositeNode(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection256);
            iv_ruleAbstractSection=ruleAbstractSection();

            state._fsp--;

             current =iv_ruleAbstractSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection266); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:177:1: ruleAbstractSection returns [EObject current=null] : (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 ) ;
    public final EObject ruleAbstractSection() throws RecognitionException {
        EObject current = null;

        EObject this_SubsectionLevel1_0 = null;

        EObject this_SubsectionLevel2_1 = null;

        EObject this_SubsectionLevel3_2 = null;

        EObject this_SubsectionLevel4_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:180:28: ( (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:181:1: (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:181:1: (this_SubsectionLevel1_0= ruleSubsectionLevel1 | this_SubsectionLevel2_1= ruleSubsectionLevel2 | this_SubsectionLevel3_2= ruleSubsectionLevel3 | this_SubsectionLevel4_3= ruleSubsectionLevel4 )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:182:5: this_SubsectionLevel1_0= ruleSubsectionLevel1
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel1_in_ruleAbstractSection313);
                    this_SubsectionLevel1_0=ruleSubsectionLevel1();

                    state._fsp--;

                     
                            current = this_SubsectionLevel1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:192:5: this_SubsectionLevel2_1= ruleSubsectionLevel2
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel2_in_ruleAbstractSection340);
                    this_SubsectionLevel2_1=ruleSubsectionLevel2();

                    state._fsp--;

                     
                            current = this_SubsectionLevel2_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:202:5: this_SubsectionLevel3_2= ruleSubsectionLevel3
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel3_in_ruleAbstractSection367);
                    this_SubsectionLevel3_2=ruleSubsectionLevel3();

                    state._fsp--;

                     
                            current = this_SubsectionLevel3_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:212:5: this_SubsectionLevel4_3= ruleSubsectionLevel4
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSectionAccess().getSubsectionLevel4ParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSubsectionLevel4_in_ruleAbstractSection394);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:228:1: entryRuleSubsectionLevel1 returns [EObject current=null] : iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF ;
    public final EObject entryRuleSubsectionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:229:2: (iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:230:2: iv_ruleSubsectionLevel1= ruleSubsectionLevel1 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel1Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1429);
            iv_ruleSubsectionLevel1=ruleSubsectionLevel1();

            state._fsp--;

             current =iv_ruleSubsectionLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel1439); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:237:1: ruleSubsectionLevel1 returns [EObject current=null] : (otherlv_0= 'section1' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section1\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) ;
    public final EObject ruleSubsectionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:240:28: ( (otherlv_0= 'section1' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section1\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:241:1: (otherlv_0= 'section1' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section1\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:241:1: (otherlv_0= 'section1' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section1\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:241:3: otherlv_0= 'section1' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section1\\n' ( (lv_content_3_0= ruleInlineContent ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSubsectionLevel1476); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel1Access().getSection1Keyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:245:1: ( (lv_name_1_0= ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:246:1: (lv_name_1_0= ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:246:1: (lv_name_1_0= ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:247:3: lv_name_1_0= ruleInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel1Access().getNameInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1497);
            lv_name_1_0=ruleInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"InlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSubsectionLevel1509); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel1Access().getSection1Keyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:267:1: ( (lv_content_3_0= ruleInlineContent ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:268:1: (lv_content_3_0= ruleInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:268:1: (lv_content_3_0= ruleInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:269:3: lv_content_3_0= ruleInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1530);
                    lv_content_3_0=ruleInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel1Rule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"InlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubsectionLevel1"


    // $ANTLR start "entryRuleSubsectionLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:293:1: entryRuleSubsectionLevel2 returns [EObject current=null] : iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF ;
    public final EObject entryRuleSubsectionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:294:2: (iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:295:2: iv_ruleSubsectionLevel2= ruleSubsectionLevel2 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel2Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2567);
            iv_ruleSubsectionLevel2=ruleSubsectionLevel2();

            state._fsp--;

             current =iv_ruleSubsectionLevel2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel2577); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:302:1: ruleSubsectionLevel2 returns [EObject current=null] : (otherlv_0= 'section2' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section2\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) ;
    public final EObject ruleSubsectionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:305:28: ( (otherlv_0= 'section2' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section2\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:306:1: (otherlv_0= 'section2' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section2\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:306:1: (otherlv_0= 'section2' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section2\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:306:3: otherlv_0= 'section2' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section2\\n' ( (lv_content_3_0= ruleInlineContent ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSubsectionLevel2614); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel2Access().getSection2Keyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:310:1: ( (lv_name_1_0= ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:311:1: (lv_name_1_0= ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:311:1: (lv_name_1_0= ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:312:3: lv_name_1_0= ruleInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel2Access().getNameInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2635);
            lv_name_1_0=ruleInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel2Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"InlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSubsectionLevel2647); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel2Access().getSection2Keyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:332:1: ( (lv_content_3_0= ruleInlineContent ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:333:1: (lv_content_3_0= ruleInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:333:1: (lv_content_3_0= ruleInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:334:3: lv_content_3_0= ruleInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2668);
                    lv_content_3_0=ruleInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel2Rule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"InlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubsectionLevel2"


    // $ANTLR start "entryRuleSubsectionLevel3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:358:1: entryRuleSubsectionLevel3 returns [EObject current=null] : iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF ;
    public final EObject entryRuleSubsectionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel3 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:359:2: (iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:360:2: iv_ruleSubsectionLevel3= ruleSubsectionLevel3 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel3Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3705);
            iv_ruleSubsectionLevel3=ruleSubsectionLevel3();

            state._fsp--;

             current =iv_ruleSubsectionLevel3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel3715); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:367:1: ruleSubsectionLevel3 returns [EObject current=null] : (otherlv_0= 'section3' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section3\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) ;
    public final EObject ruleSubsectionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:370:28: ( (otherlv_0= 'section3' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section3\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:371:1: (otherlv_0= 'section3' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section3\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:371:1: (otherlv_0= 'section3' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section3\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:371:3: otherlv_0= 'section3' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section3\\n' ( (lv_content_3_0= ruleInlineContent ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSubsectionLevel3752); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel3Access().getSection3Keyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:375:1: ( (lv_name_1_0= ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:376:1: (lv_name_1_0= ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:376:1: (lv_name_1_0= ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:377:3: lv_name_1_0= ruleInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel3Access().getNameInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3773);
            lv_name_1_0=ruleInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel3Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"InlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSubsectionLevel3785); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel3Access().getSection3Keyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:397:1: ( (lv_content_3_0= ruleInlineContent ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:398:1: (lv_content_3_0= ruleInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:398:1: (lv_content_3_0= ruleInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:399:3: lv_content_3_0= ruleInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3806);
                    lv_content_3_0=ruleInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel3Rule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"InlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubsectionLevel3"


    // $ANTLR start "entryRuleSubsectionLevel4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:423:1: entryRuleSubsectionLevel4 returns [EObject current=null] : iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF ;
    public final EObject entryRuleSubsectionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsectionLevel4 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:424:2: (iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:425:2: iv_ruleSubsectionLevel4= ruleSubsectionLevel4 EOF
            {
             newCompositeNode(grammarAccess.getSubsectionLevel4Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4843);
            iv_ruleSubsectionLevel4=ruleSubsectionLevel4();

            state._fsp--;

             current =iv_ruleSubsectionLevel4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel4853); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:432:1: ruleSubsectionLevel4 returns [EObject current=null] : (otherlv_0= 'section4' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section4\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) ;
    public final EObject ruleSubsectionLevel4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:435:28: ( (otherlv_0= 'section4' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section4\\n' ( (lv_content_3_0= ruleInlineContent ) )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:436:1: (otherlv_0= 'section4' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section4\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:436:1: (otherlv_0= 'section4' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section4\\n' ( (lv_content_3_0= ruleInlineContent ) )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:436:3: otherlv_0= 'section4' ( (lv_name_1_0= ruleInlineContent ) ) otherlv_2= 'section4\\n' ( (lv_content_3_0= ruleInlineContent ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSubsectionLevel4890); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsectionLevel4Access().getSection4Keyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:440:1: ( (lv_name_1_0= ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:441:1: (lv_name_1_0= ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:441:1: (lv_name_1_0= ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:442:3: lv_name_1_0= ruleInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getSubsectionLevel4Access().getNameInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel4911);
            lv_name_1_0=ruleInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubsectionLevel4Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"InlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSubsectionLevel4923); 

                	newLeafNode(otherlv_2, grammarAccess.getSubsectionLevel4Access().getSection4Keyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:462:1: ( (lv_content_3_0= ruleInlineContent ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:463:1: (lv_content_3_0= ruleInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:463:1: (lv_content_3_0= ruleInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:464:3: lv_content_3_0= ruleInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInlineContent_in_ruleSubsectionLevel4944);
                    lv_content_3_0=ruleInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubsectionLevel4Rule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"InlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubsectionLevel4"


    // $ANTLR start "entryRuleInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:488:1: entryRuleInlineContent returns [String current=null] : iv_ruleInlineContent= ruleInlineContent EOF ;
    public final String entryRuleInlineContent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:489:2: (iv_ruleInlineContent= ruleInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:490:2: iv_ruleInlineContent= ruleInlineContent EOF
            {
             newCompositeNode(grammarAccess.getInlineContentRule()); 
            pushFollow(FOLLOW_ruleInlineContent_in_entryRuleInlineContent982);
            iv_ruleInlineContent=ruleInlineContent();

            state._fsp--;

             current =iv_ruleInlineContent.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineContent993); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:497:1: ruleInlineContent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleInlineContent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:500:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:501:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:501:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:501:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInlineContent1033); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:508:1: (this_ID_1= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:508:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInlineContent1054); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_1()); 
            	        

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
    // $ANTLR end "ruleInlineContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulewikipage_in_entryRulewikipage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewikipage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulewikipage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rulewikipage143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulewikipage155 = new BitSet(new long[]{0x00000000000AA010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rulewikipage176 = new BitSet(new long[]{0x00000000000AA010L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rulewikipage198 = new BitSet(new long[]{0x00000000000AA012L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rulewikipage219 = new BitSet(new long[]{0x00000000000AA012L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_ruleAbstractSection313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_ruleAbstractSection340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_ruleAbstractSection367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_ruleAbstractSection394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSubsectionLevel1476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1497 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubsectionLevel1509 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSubsectionLevel2614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2635 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubsectionLevel2647 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubsectionLevel3752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3773 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubsectionLevel3785 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSubsectionLevel4890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel4911 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSubsectionLevel4923 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_ruleSubsectionLevel4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_entryRuleInlineContent982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineContent993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInlineContent1033 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInlineContent1054 = new BitSet(new long[]{0x0000000000000012L});

}