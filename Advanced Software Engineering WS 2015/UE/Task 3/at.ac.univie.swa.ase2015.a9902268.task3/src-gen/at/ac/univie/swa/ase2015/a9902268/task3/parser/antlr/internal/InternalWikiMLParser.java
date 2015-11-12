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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<blockquote>'", "'</blockquote>'", "'{{'", "'|'", "'}}'", "'**'", "':LIST'", "'*'", "'#'", "'[[File:'", "'thumb'", "']]'", "'[[Category:'", "'|*'", "'='", "'=='", "'==='", "'===='", "'====='", "'\\'\\'\\''", "'\\'\\''", "'\\'\\'\\'\\'\\''", "'[['", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
        	return "wiki";	
       	}
       	
       	@Override
       	protected WikiMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulewiki"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:67:1: entryRulewiki returns [EObject current=null] : iv_rulewiki= rulewiki EOF ;
    public final EObject entryRulewiki() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewiki = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:68:2: (iv_rulewiki= rulewiki EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:69:2: iv_rulewiki= rulewiki EOF
            {
             newCompositeNode(grammarAccess.getWikiRule()); 
            pushFollow(FOLLOW_rulewiki_in_entryRulewiki75);
            iv_rulewiki=rulewiki();

            state._fsp--;

             current =iv_rulewiki; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewiki85); 

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
    // $ANTLR end "entryRulewiki"


    // $ANTLR start "rulewiki"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:76:1: rulewiki returns [EObject current=null] : (this_Heading1_0= ruleHeading1 ( (lv_elements_1_0= ruleParagraphTypes ) )* ) ;
    public final EObject rulewiki() throws RecognitionException {
        EObject current = null;

        EObject this_Heading1_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:79:28: ( (this_Heading1_0= ruleHeading1 ( (lv_elements_1_0= ruleParagraphTypes ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (this_Heading1_0= ruleHeading1 ( (lv_elements_1_0= ruleParagraphTypes ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:1: (this_Heading1_0= ruleHeading1 ( (lv_elements_1_0= ruleParagraphTypes ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:5: this_Heading1_0= ruleHeading1 ( (lv_elements_1_0= ruleParagraphTypes ) )*
            {
             
                    newCompositeNode(grammarAccess.getWikiAccess().getHeading1ParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleHeading1_in_rulewiki132);
            this_Heading1_0=ruleHeading1();

            state._fsp--;

             
                    current = this_Heading1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:89:1: ( (lv_elements_1_0= ruleParagraphTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==14||LA1_0==17||(LA1_0>=19 && LA1_0<=21)||LA1_0==24||(LA1_0>=26 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:90:1: (lv_elements_1_0= ruleParagraphTypes )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:90:1: (lv_elements_1_0= ruleParagraphTypes )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:91:3: lv_elements_1_0= ruleParagraphTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikiAccess().getElementsParagraphTypesParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraphTypes_in_rulewiki152);
            	    lv_elements_1_0=ruleParagraphTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"ParagraphTypes");
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
    // $ANTLR end "rulewiki"


    // $ANTLR start "entryRuleParagraphTypes"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:115:1: entryRuleParagraphTypes returns [EObject current=null] : iv_ruleParagraphTypes= ruleParagraphTypes EOF ;
    public final EObject entryRuleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraphTypes = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:116:2: (iv_ruleParagraphTypes= ruleParagraphTypes EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:117:2: iv_ruleParagraphTypes= ruleParagraphTypes EOF
            {
             newCompositeNode(grammarAccess.getParagraphTypesRule()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes189);
            iv_ruleParagraphTypes=ruleParagraphTypes();

            state._fsp--;

             current =iv_ruleParagraphTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraphTypes199); 

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
    // $ANTLR end "entryRuleParagraphTypes"


    // $ANTLR start "ruleParagraphTypes"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:124:1: ruleParagraphTypes returns [EObject current=null] : (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_File_3= ruleFile | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AbstractFormattedInlineContent_6= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_7= ruleAbstractUnformattedInlineContent | this_BlockQuote_8= ruleBlockQuote | this_Heading1_9= ruleHeading1 | this_Heading2_10= ruleHeading2 | this_Heading3_11= ruleHeading3 | this_Heading4_12= ruleHeading4 | this_Heading5_13= ruleHeading5 ) ;
    public final EObject ruleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject this_OrderListItemLevel1_0 = null;

        EObject this_UnOrderListItemLevel1_1 = null;

        EObject this_UnOrderListItemLevel2_2 = null;

        EObject this_File_3 = null;

        EObject this_Category_4 = null;

        EObject this_Template_5 = null;

        EObject this_AbstractFormattedInlineContent_6 = null;

        EObject this_AbstractUnformattedInlineContent_7 = null;

        EObject this_BlockQuote_8 = null;

        EObject this_Heading1_9 = null;

        EObject this_Heading2_10 = null;

        EObject this_Heading3_11 = null;

        EObject this_Heading4_12 = null;

        EObject this_Heading5_13 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:127:28: ( (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_File_3= ruleFile | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AbstractFormattedInlineContent_6= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_7= ruleAbstractUnformattedInlineContent | this_BlockQuote_8= ruleBlockQuote | this_Heading1_9= ruleHeading1 | this_Heading2_10= ruleHeading2 | this_Heading3_11= ruleHeading3 | this_Heading4_12= ruleHeading4 | this_Heading5_13= ruleHeading5 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:128:1: (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_File_3= ruleFile | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AbstractFormattedInlineContent_6= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_7= ruleAbstractUnformattedInlineContent | this_BlockQuote_8= ruleBlockQuote | this_Heading1_9= ruleHeading1 | this_Heading2_10= ruleHeading2 | this_Heading3_11= ruleHeading3 | this_Heading4_12= ruleHeading4 | this_Heading5_13= ruleHeading5 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:128:1: (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_File_3= ruleFile | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AbstractFormattedInlineContent_6= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_7= ruleAbstractUnformattedInlineContent | this_BlockQuote_8= ruleBlockQuote | this_Heading1_9= ruleHeading1 | this_Heading2_10= ruleHeading2 | this_Heading3_11= ruleHeading3 | this_Heading4_12= ruleHeading4 | this_Heading5_13= ruleHeading5 )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 14:
                {
                alt2=6;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt2=7;
                }
                break;
            case RULE_ID:
            case 34:
            case 35:
                {
                alt2=8;
                }
                break;
            case 12:
                {
                alt2=9;
                }
                break;
            case 26:
                {
                alt2=10;
                }
                break;
            case 27:
                {
                alt2=11;
                }
                break;
            case 28:
                {
                alt2=12;
                }
                break;
            case 29:
                {
                alt2=13;
                }
                break;
            case 30:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:129:5: this_OrderListItemLevel1_0= ruleOrderListItemLevel1
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getOrderListItemLevel1ParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOrderListItemLevel1_in_ruleParagraphTypes246);
                    this_OrderListItemLevel1_0=ruleOrderListItemLevel1();

                    state._fsp--;

                     
                            current = this_OrderListItemLevel1_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:139:5: this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel1ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnOrderListItemLevel1_in_ruleParagraphTypes273);
                    this_UnOrderListItemLevel1_1=ruleUnOrderListItemLevel1();

                    state._fsp--;

                     
                            current = this_UnOrderListItemLevel1_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:149:5: this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel2ParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUnOrderListItemLevel2_in_ruleParagraphTypes300);
                    this_UnOrderListItemLevel2_2=ruleUnOrderListItemLevel2();

                    state._fsp--;

                     
                            current = this_UnOrderListItemLevel2_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:159:5: this_File_3= ruleFile
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getFileParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFile_in_ruleParagraphTypes327);
                    this_File_3=ruleFile();

                    state._fsp--;

                     
                            current = this_File_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:169:5: this_Category_4= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCategory_in_ruleParagraphTypes354);
                    this_Category_4=ruleCategory();

                    state._fsp--;

                     
                            current = this_Category_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:179:5: this_Template_5= ruleTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTemplate_in_ruleParagraphTypes381);
                    this_Template_5=ruleTemplate();

                    state._fsp--;

                     
                            current = this_Template_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:189:5: this_AbstractFormattedInlineContent_6= ruleAbstractFormattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getAbstractFormattedInlineContentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleParagraphTypes408);
                    this_AbstractFormattedInlineContent_6=ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     
                            current = this_AbstractFormattedInlineContent_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:199:5: this_AbstractUnformattedInlineContent_7= ruleAbstractUnformattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getAbstractUnformattedInlineContentParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleParagraphTypes435);
                    this_AbstractUnformattedInlineContent_7=ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     
                            current = this_AbstractUnformattedInlineContent_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:209:5: this_BlockQuote_8= ruleBlockQuote
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleBlockQuote_in_ruleParagraphTypes462);
                    this_BlockQuote_8=ruleBlockQuote();

                    state._fsp--;

                     
                            current = this_BlockQuote_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:219:5: this_Heading1_9= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleParagraphTypes489);
                    this_Heading1_9=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:229:5: this_Heading2_10= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleParagraphTypes516);
                    this_Heading2_10=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:239:5: this_Heading3_11= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleParagraphTypes543);
                    this_Heading3_11=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:249:5: this_Heading4_12= ruleHeading4
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleHeading4_in_ruleParagraphTypes570);
                    this_Heading4_12=ruleHeading4();

                    state._fsp--;

                     
                            current = this_Heading4_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:259:5: this_Heading5_13= ruleHeading5
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleHeading5_in_ruleParagraphTypes597);
                    this_Heading5_13=ruleHeading5();

                    state._fsp--;

                     
                            current = this_Heading5_13; 
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
    // $ANTLR end "ruleParagraphTypes"


    // $ANTLR start "entryRuleBlockQuote"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:275:1: entryRuleBlockQuote returns [EObject current=null] : iv_ruleBlockQuote= ruleBlockQuote EOF ;
    public final EObject entryRuleBlockQuote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockQuote = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:276:2: (iv_ruleBlockQuote= ruleBlockQuote EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:277:2: iv_ruleBlockQuote= ruleBlockQuote EOF
            {
             newCompositeNode(grammarAccess.getBlockQuoteRule()); 
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote632);
            iv_ruleBlockQuote=ruleBlockQuote();

            state._fsp--;

             current =iv_ruleBlockQuote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote642); 

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
    // $ANTLR end "entryRuleBlockQuote"


    // $ANTLR start "ruleBlockQuote"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:284:1: ruleBlockQuote returns [EObject current=null] : ( () otherlv_1= '<blockquote>' ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )* otherlv_3= '</blockquote>' ) ;
    public final EObject ruleBlockQuote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_1 = null;

        EObject lv_content_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:287:28: ( ( () otherlv_1= '<blockquote>' ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )* otherlv_3= '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:1: ( () otherlv_1= '<blockquote>' ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )* otherlv_3= '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:1: ( () otherlv_1= '<blockquote>' ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )* otherlv_3= '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:2: () otherlv_1= '<blockquote>' ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )* otherlv_3= '</blockquote>'
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:289:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBlockQuote688); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:298:1: ( ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=31 && LA4_0<=35)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:299:1: ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:299:1: ( (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:300:1: (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:300:1: (lv_content_2_1= ruleAbstractUnformattedInlineContent | lv_content_2_2= ruleAbstractFormattedInlineContent )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_ID||(LA3_0>=34 && LA3_0<=35)) ) {
            	        alt3=1;
            	    }
            	    else if ( ((LA3_0>=31 && LA3_0<=33)) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:301:3: lv_content_2_1= ruleAbstractUnformattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getContentAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBlockQuote711);
            	            lv_content_2_1=ruleAbstractUnformattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBlockQuoteRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_2_1, 
            	                    		"AbstractUnformattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:316:8: lv_content_2_2= ruleAbstractFormattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getContentAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleBlockQuote730);
            	            lv_content_2_2=ruleAbstractFormattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBlockQuoteRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_2_2, 
            	                    		"AbstractFormattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBlockQuote746); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3());
                

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
    // $ANTLR end "ruleBlockQuote"


    // $ANTLR start "entryRuleTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:346:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:347:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:348:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate782);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate792); 

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:355:1: ruleTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )* otherlv_6= '}}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_content_3_0 = null;

        EObject lv_content_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:358:28: ( (otherlv_0= '{{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )* otherlv_6= '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:359:1: (otherlv_0= '{{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )* otherlv_6= '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:359:1: (otherlv_0= '{{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )* otherlv_6= '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:359:3: otherlv_0= '{{' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )* otherlv_6= '}}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTemplate829); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:363:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:364:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:364:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:365:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTemplateAccess().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTemplate850);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTemplate862); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getVerticalLineKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:385:1: ( (lv_content_3_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:386:1: (lv_content_3_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:386:1: (lv_content_3_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:387:3: lv_content_3_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTemplate883);
            lv_content_3_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	        }
                   		add(
                   			current, 
                   			"content",
                    		lv_content_3_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:403:2: (otherlv_4= '|' ( (lv_content_5_0= ruleText ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:403:4: otherlv_4= '|' ( (lv_content_5_0= ruleText ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTemplate896); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getVerticalLineKeyword_4_0());
            	        
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:407:1: ( (lv_content_5_0= ruleText ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:408:1: (lv_content_5_0= ruleText )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:408:1: (lv_content_5_0= ruleText )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:409:3: lv_content_5_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleTemplate917);
            	    lv_content_5_0=ruleText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_5_0, 
            	            		"Text");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleTemplate931); 

                	newLeafNode(otherlv_6, grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleUnOrderListItemLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:437:1: entryRuleUnOrderListItemLevel2 returns [EObject current=null] : iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF ;
    public final EObject entryRuleUnOrderListItemLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOrderListItemLevel2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:438:2: (iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:439:2: iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF
            {
             newCompositeNode(grammarAccess.getUnOrderListItemLevel2Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2967);
            iv_ruleUnOrderListItemLevel2=ruleUnOrderListItemLevel2();

            state._fsp--;

             current =iv_ruleUnOrderListItemLevel2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2977); 

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
    // $ANTLR end "entryRuleUnOrderListItemLevel2"


    // $ANTLR start "ruleUnOrderListItemLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:446:1: ruleUnOrderListItemLevel2 returns [EObject current=null] : (otherlv_0= '**' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) ;
    public final EObject ruleUnOrderListItemLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_1 = null;

        EObject lv_name_1_2 = null;

        EObject lv_list_2_1 = null;

        EObject lv_list_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:449:28: ( (otherlv_0= '**' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:450:1: (otherlv_0= '**' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:450:1: (otherlv_0= '**' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:450:3: otherlv_0= '**' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleUnOrderListItemLevel21014); 

                	newLeafNode(otherlv_0, grammarAccess.getUnOrderListItemLevel2Access().getAsteriskAsteriskKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:454:1: ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:456:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:456:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=31 && LA6_0<=33)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||(LA6_0>=34 && LA6_0<=35)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:457:3: lv_name_1_1= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getNameAbstractFormattedInlineContentParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel21037);
                    lv_name_1_1=ruleAbstractFormattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"AbstractFormattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:472:8: lv_name_1_2= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getNameAbstractUnformattedInlineContentParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel21056);
                    lv_name_1_2=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:490:2: ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=31 && LA8_0<=35)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:491:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:491:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:492:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:492:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( ((LA7_0>=31 && LA7_0<=33)) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_ID||(LA7_0>=34 && LA7_0<=35)) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:493:3: lv_list_2_1= ruleAbstractFormattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getListAbstractFormattedInlineContentParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel21082);
            	            lv_list_2_1=ruleAbstractFormattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_1, 
            	                    		"AbstractFormattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:508:8: lv_list_2_2= ruleAbstractUnformattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getListAbstractUnformattedInlineContentParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel21101);
            	            lv_list_2_2=ruleAbstractUnformattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_2, 
            	                    		"AbstractUnformattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUnOrderListItemLevel21117); 

                	newLeafNode(otherlv_3, grammarAccess.getUnOrderListItemLevel2Access().getLISTKeyword_3());
                

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
    // $ANTLR end "ruleUnOrderListItemLevel2"


    // $ANTLR start "entryRuleUnOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:538:1: entryRuleUnOrderListItemLevel1 returns [EObject current=null] : iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF ;
    public final EObject entryRuleUnOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOrderListItemLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:539:2: (iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:540:2: iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF
            {
             newCompositeNode(grammarAccess.getUnOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel11153);
            iv_ruleUnOrderListItemLevel1=ruleUnOrderListItemLevel1();

            state._fsp--;

             current =iv_ruleUnOrderListItemLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel11163); 

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
    // $ANTLR end "entryRuleUnOrderListItemLevel1"


    // $ANTLR start "ruleUnOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:547:1: ruleUnOrderListItemLevel1 returns [EObject current=null] : (otherlv_0= '*' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) ;
    public final EObject ruleUnOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_1 = null;

        EObject lv_name_1_2 = null;

        EObject lv_list_2_1 = null;

        EObject lv_list_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:550:28: ( (otherlv_0= '*' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:551:1: (otherlv_0= '*' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:551:1: (otherlv_0= '*' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:551:3: otherlv_0= '*' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUnOrderListItemLevel11200); 

                	newLeafNode(otherlv_0, grammarAccess.getUnOrderListItemLevel1Access().getAsteriskKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:555:1: ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:556:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:556:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:557:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:557:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=31 && LA9_0<=33)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||(LA9_0>=34 && LA9_0<=35)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:558:3: lv_name_1_1= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getNameAbstractFormattedInlineContentParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel11223);
                    lv_name_1_1=ruleAbstractFormattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"AbstractFormattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:573:8: lv_name_1_2= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getNameAbstractUnformattedInlineContentParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel11242);
                    lv_name_1_2=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:591:2: ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=31 && LA11_0<=35)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:592:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:592:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:593:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:593:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=31 && LA10_0<=33)) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==RULE_ID||(LA10_0>=34 && LA10_0<=35)) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:594:3: lv_list_2_1= ruleAbstractFormattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getListAbstractFormattedInlineContentParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel11268);
            	            lv_list_2_1=ruleAbstractFormattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_1, 
            	                    		"AbstractFormattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:609:8: lv_list_2_2= ruleAbstractUnformattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getListAbstractUnformattedInlineContentParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel11287);
            	            lv_list_2_2=ruleAbstractUnformattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_2, 
            	                    		"AbstractUnformattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUnOrderListItemLevel11303); 

                	newLeafNode(otherlv_3, grammarAccess.getUnOrderListItemLevel1Access().getLISTKeyword_3());
                

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
    // $ANTLR end "ruleUnOrderListItemLevel1"


    // $ANTLR start "entryRuleOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:639:1: entryRuleOrderListItemLevel1 returns [EObject current=null] : iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF ;
    public final EObject entryRuleOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderListItemLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:640:2: (iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:641:2: iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF
            {
             newCompositeNode(grammarAccess.getOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel11339);
            iv_ruleOrderListItemLevel1=ruleOrderListItemLevel1();

            state._fsp--;

             current =iv_ruleOrderListItemLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderListItemLevel11349); 

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
    // $ANTLR end "entryRuleOrderListItemLevel1"


    // $ANTLR start "ruleOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:648:1: ruleOrderListItemLevel1 returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) ;
    public final EObject ruleOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_1 = null;

        EObject lv_name_1_2 = null;

        EObject lv_list_2_1 = null;

        EObject lv_list_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:651:28: ( (otherlv_0= '#' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:652:1: (otherlv_0= '#' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:652:1: (otherlv_0= '#' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:652:3: otherlv_0= '#' ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) ) ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOrderListItemLevel11386); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderListItemLevel1Access().getNumberSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:656:1: ( ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:657:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:657:1: ( (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:658:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:658:1: (lv_name_1_1= ruleAbstractFormattedInlineContent | lv_name_1_2= ruleAbstractUnformattedInlineContent )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||(LA12_0>=34 && LA12_0<=35)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:659:3: lv_name_1_1= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getNameAbstractFormattedInlineContentParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleOrderListItemLevel11409);
                    lv_name_1_1=ruleAbstractFormattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"AbstractFormattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:674:8: lv_name_1_2= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getNameAbstractUnformattedInlineContentParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleOrderListItemLevel11428);
                    lv_name_1_2=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:692:2: ( ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=31 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:693:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:693:1: ( (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:694:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:694:1: (lv_list_2_1= ruleAbstractFormattedInlineContent | lv_list_2_2= ruleAbstractUnformattedInlineContent )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=31 && LA13_0<=33)) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==RULE_ID||(LA13_0>=34 && LA13_0<=35)) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:695:3: lv_list_2_1= ruleAbstractFormattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getListAbstractFormattedInlineContentParserRuleCall_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleOrderListItemLevel11454);
            	            lv_list_2_1=ruleAbstractFormattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_1, 
            	                    		"AbstractFormattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:710:8: lv_list_2_2= ruleAbstractUnformattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getListAbstractUnformattedInlineContentParserRuleCall_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleOrderListItemLevel11473);
            	            lv_list_2_2=ruleAbstractUnformattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"list",
            	                    		lv_list_2_2, 
            	                    		"AbstractUnformattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOrderListItemLevel11489); 

                	newLeafNode(otherlv_3, grammarAccess.getOrderListItemLevel1Access().getLISTKeyword_3());
                

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
    // $ANTLR end "ruleOrderListItemLevel1"


    // $ANTLR start "entryRuleFile"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:740:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:741:2: (iv_ruleFile= ruleFile EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:742:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1525);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1535); 

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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:749:1: ruleFile returns [EObject current=null] : (otherlv_0= '[[File:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '|' otherlv_3= 'thumb' otherlv_4= '|' ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_6= ']]' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_name_1_0 = null;

        EObject lv_caption_5_1 = null;

        EObject lv_caption_5_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:752:28: ( (otherlv_0= '[[File:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '|' otherlv_3= 'thumb' otherlv_4= '|' ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_6= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (otherlv_0= '[[File:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '|' otherlv_3= 'thumb' otherlv_4= '|' ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_6= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (otherlv_0= '[[File:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '|' otherlv_3= 'thumb' otherlv_4= '|' ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_6= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:3: otherlv_0= '[[File:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '|' otherlv_3= 'thumb' otherlv_4= '|' ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )* otherlv_6= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleFile1572); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:757:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:758:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:758:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:759:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleFile1593);
            lv_name_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFile1605); 

                	newLeafNode(otherlv_2, grammarAccess.getFileAccess().getVerticalLineKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFile1617); 

                	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getThumbKeyword_3());
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFile1629); 

                	newLeafNode(otherlv_4, grammarAccess.getFileAccess().getVerticalLineKeyword_4());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:787:1: ( ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=31 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:788:1: ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:788:1: ( (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:789:1: (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:789:1: (lv_caption_5_1= ruleAbstractFormattedInlineContent | lv_caption_5_2= ruleAbstractUnformattedInlineContent )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=31 && LA15_0<=33)) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_ID||(LA15_0>=34 && LA15_0<=35)) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:790:3: lv_caption_5_1= ruleAbstractFormattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFileAccess().getCaptionAbstractFormattedInlineContentParserRuleCall_5_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleFile1652);
            	            lv_caption_5_1=ruleAbstractFormattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"caption",
            	                    		lv_caption_5_1, 
            	                    		"AbstractFormattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:805:8: lv_caption_5_2= ruleAbstractUnformattedInlineContent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFileAccess().getCaptionAbstractUnformattedInlineContentParserRuleCall_5_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleFile1671);
            	            lv_caption_5_2=ruleAbstractUnformattedInlineContent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"caption",
            	                    		lv_caption_5_2, 
            	                    		"AbstractUnformattedInlineContent");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleFile1687); 

                	newLeafNode(otherlv_6, grammarAccess.getFileAccess().getRightSquareBracketRightSquareBracketKeyword_6());
                

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleCategory"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:835:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:836:2: (iv_ruleCategory= ruleCategory EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:837:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory1723);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory1733); 

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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:844:1: ruleCategory returns [EObject current=null] : (otherlv_0= '[[Category:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) (otherlv_2= '|*' )? otherlv_3= ']]' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:847:28: ( (otherlv_0= '[[Category:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) (otherlv_2= '|*' )? otherlv_3= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:848:1: (otherlv_0= '[[Category:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) (otherlv_2= '|*' )? otherlv_3= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:848:1: (otherlv_0= '[[Category:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) (otherlv_2= '|*' )? otherlv_3= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:848:3: otherlv_0= '[[Category:' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) (otherlv_2= '|*' )? otherlv_3= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCategory1770); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:852:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:853:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:853:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:854:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleCategory1791);
            lv_name_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:870:2: (otherlv_2= '|*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:870:4: otherlv_2= '|*'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleCategory1804); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getVerticalLineAsteriskKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCategory1818); 

                	newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleHeading1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:886:1: entryRuleHeading1 returns [EObject current=null] : iv_ruleHeading1= ruleHeading1 EOF ;
    public final EObject entryRuleHeading1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:887:2: (iv_ruleHeading1= ruleHeading1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:888:2: iv_ruleHeading1= ruleHeading1 EOF
            {
             newCompositeNode(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading11854);
            iv_ruleHeading1=ruleHeading1();

            state._fsp--;

             current =iv_ruleHeading1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading11864); 

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
    // $ANTLR end "entryRuleHeading1"


    // $ANTLR start "ruleHeading1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:895:1: ruleHeading1 returns [EObject current=null] : (otherlv_0= '=' this_Text_1= ruleText otherlv_2= '=' ) ;
    public final EObject ruleHeading1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Text_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:898:28: ( (otherlv_0= '=' this_Text_1= ruleText otherlv_2= '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:899:1: (otherlv_0= '=' this_Text_1= ruleText otherlv_2= '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:899:1: (otherlv_0= '=' this_Text_1= ruleText otherlv_2= '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:899:3: otherlv_0= '=' this_Text_1= ruleText otherlv_2= '='
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleHeading11901); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading1Access().getEqualsSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHeading1Access().getTextParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleText_in_ruleHeading11923);
            this_Text_1=ruleText();

            state._fsp--;

             
                    current = this_Text_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleHeading11934); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading1Access().getEqualsSignKeyword_2());
                

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
    // $ANTLR end "ruleHeading1"


    // $ANTLR start "entryRuleHeading2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:924:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:925:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:926:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading21970);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading21980); 

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
    // $ANTLR end "entryRuleHeading2"


    // $ANTLR start "ruleHeading2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:933:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= '==' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '==' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:936:28: ( (otherlv_0= '==' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:937:1: (otherlv_0= '==' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:937:1: (otherlv_0= '==' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:937:3: otherlv_0= '==' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '=='
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleHeading22017); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHeading2Access().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading22039);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleHeading22050); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2());
                

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
    // $ANTLR end "ruleHeading2"


    // $ANTLR start "entryRuleHeading3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:962:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:963:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:964:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading32086);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading32096); 

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
    // $ANTLR end "entryRuleHeading3"


    // $ANTLR start "ruleHeading3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:971:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= '===' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '===' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:974:28: ( (otherlv_0= '===' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:975:1: (otherlv_0= '===' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:975:1: (otherlv_0= '===' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:975:3: otherlv_0= '===' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '==='
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleHeading32133); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHeading3Access().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32155);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleHeading32166); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2());
                

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
    // $ANTLR end "ruleHeading3"


    // $ANTLR start "entryRuleHeading4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1000:1: entryRuleHeading4 returns [EObject current=null] : iv_ruleHeading4= ruleHeading4 EOF ;
    public final EObject entryRuleHeading4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading4 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1001:2: (iv_ruleHeading4= ruleHeading4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1002:2: iv_ruleHeading4= ruleHeading4 EOF
            {
             newCompositeNode(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading42202);
            iv_ruleHeading4=ruleHeading4();

            state._fsp--;

             current =iv_ruleHeading4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading42212); 

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
    // $ANTLR end "entryRuleHeading4"


    // $ANTLR start "ruleHeading4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1009:1: ruleHeading4 returns [EObject current=null] : (otherlv_0= '====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '====' ) ;
    public final EObject ruleHeading4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1012:28: ( (otherlv_0= '====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1013:1: (otherlv_0= '====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1013:1: (otherlv_0= '====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1013:3: otherlv_0= '====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '===='
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleHeading42249); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHeading4Access().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42271);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleHeading42282); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2());
                

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
    // $ANTLR end "ruleHeading4"


    // $ANTLR start "entryRuleHeading5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1038:1: entryRuleHeading5 returns [EObject current=null] : iv_ruleHeading5= ruleHeading5 EOF ;
    public final EObject entryRuleHeading5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading5 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1039:2: (iv_ruleHeading5= ruleHeading5 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1040:2: iv_ruleHeading5= ruleHeading5 EOF
            {
             newCompositeNode(grammarAccess.getHeading5Rule()); 
            pushFollow(FOLLOW_ruleHeading5_in_entryRuleHeading52318);
            iv_ruleHeading5=ruleHeading5();

            state._fsp--;

             current =iv_ruleHeading5; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading52328); 

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
    // $ANTLR end "entryRuleHeading5"


    // $ANTLR start "ruleHeading5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1047:1: ruleHeading5 returns [EObject current=null] : (otherlv_0= '=====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '=====' ) ;
    public final EObject ruleHeading5() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1050:28: ( (otherlv_0= '=====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1051:1: (otherlv_0= '=====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1051:1: (otherlv_0= '=====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1051:3: otherlv_0= '=====' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '====='
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleHeading52365); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getHeading5Access().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52387);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleHeading52398); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2());
                

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
    // $ANTLR end "ruleHeading5"


    // $ANTLR start "entryRuleAbstractFormattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1076:1: entryRuleAbstractFormattedInlineContent returns [EObject current=null] : iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF ;
    public final EObject entryRuleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFormattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1077:2: (iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1078:2: iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractFormattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2434);
            iv_ruleAbstractFormattedInlineContent=ruleAbstractFormattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractFormattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2444); 

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
    // $ANTLR end "entryRuleAbstractFormattedInlineContent"


    // $ANTLR start "ruleAbstractFormattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1085:1: ruleAbstractFormattedInlineContent returns [EObject current=null] : (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) ;
    public final EObject ruleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Bold_0 = null;

        EObject this_Italic_1 = null;

        EObject this_ItalicBold_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1088:28: ( (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1089:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1089:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1090:5: this_Bold_0= ruleBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2491);
                    this_Bold_0=ruleBold();

                    state._fsp--;

                     
                            current = this_Bold_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1100:5: this_Italic_1= ruleItalic
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2518);
                    this_Italic_1=ruleItalic();

                    state._fsp--;

                     
                            current = this_Italic_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1110:5: this_ItalicBold_2= ruleItalicBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2545);
                    this_ItalicBold_2=ruleItalicBold();

                    state._fsp--;

                     
                            current = this_ItalicBold_2; 
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
    // $ANTLR end "ruleAbstractFormattedInlineContent"


    // $ANTLR start "entryRuleBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1126:1: entryRuleBold returns [EObject current=null] : iv_ruleBold= ruleBold EOF ;
    public final EObject entryRuleBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1127:2: (iv_ruleBold= ruleBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1128:2: iv_ruleBold= ruleBold EOF
            {
             newCompositeNode(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold2580);
            iv_ruleBold=ruleBold();

            state._fsp--;

             current =iv_ruleBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold2590); 

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
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1135:1: ruleBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1138:28: ( (otherlv_0= '\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1139:1: (otherlv_0= '\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1139:1: (otherlv_0= '\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1139:3: otherlv_0= '\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleBold2627); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getBoldAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2649);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleBold2660); 

                	newLeafNode(otherlv_2, grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleBold"


    // $ANTLR start "entryRuleItalic"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1164:1: entryRuleItalic returns [EObject current=null] : iv_ruleItalic= ruleItalic EOF ;
    public final EObject entryRuleItalic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalic = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1165:2: (iv_ruleItalic= ruleItalic EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1166:2: iv_ruleItalic= ruleItalic EOF
            {
             newCompositeNode(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic2696);
            iv_ruleItalic=ruleItalic();

            state._fsp--;

             current =iv_ruleItalic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic2706); 

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
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1173:1: ruleItalic returns [EObject current=null] : (otherlv_0= '\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1176:28: ( (otherlv_0= '\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1177:1: (otherlv_0= '\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1177:1: (otherlv_0= '\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1177:3: otherlv_0= '\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleItalic2743); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getItalicAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic2765);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleItalic2776); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicAccess().getApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleItalicBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1202:1: entryRuleItalicBold returns [EObject current=null] : iv_ruleItalicBold= ruleItalicBold EOF ;
    public final EObject entryRuleItalicBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1203:2: (iv_ruleItalicBold= ruleItalicBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1204:2: iv_ruleItalicBold= ruleItalicBold EOF
            {
             newCompositeNode(grammarAccess.getItalicBoldRule()); 
            pushFollow(FOLLOW_ruleItalicBold_in_entryRuleItalicBold2812);
            iv_ruleItalicBold=ruleItalicBold();

            state._fsp--;

             current =iv_ruleItalicBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBold2822); 

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
    // $ANTLR end "entryRuleItalicBold"


    // $ANTLR start "ruleItalicBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1211:1: ruleItalicBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'\\'\\'' ) ;
    public final EObject ruleItalicBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1214:28: ( (otherlv_0= '\\'\\'\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1215:1: (otherlv_0= '\\'\\'\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1215:1: (otherlv_0= '\\'\\'\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1215:3: otherlv_0= '\\'\\'\\'\\'\\'' this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent otherlv_2= '\\'\\'\\'\\'\\''
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleItalicBold2859); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getItalicBoldAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold2881);
            this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             
                    current = this_AbstractUnformattedInlineContent_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleItalicBold2892); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleItalicBold"


    // $ANTLR start "entryRuleAbstractUnformattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1240:1: entryRuleAbstractUnformattedInlineContent returns [EObject current=null] : iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF ;
    public final EObject entryRuleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUnformattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1241:2: (iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1242:2: iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent2928);
            iv_ruleAbstractUnformattedInlineContent=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractUnformattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent2938); 

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
    // $ANTLR end "entryRuleAbstractUnformattedInlineContent"


    // $ANTLR start "ruleAbstractUnformattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1249:1: ruleAbstractUnformattedInlineContent returns [EObject current=null] : (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) ;
    public final EObject ruleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_HyperLink_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1252:28: ( (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1253:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1253:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1254:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent2985);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1264:5: this_HyperLink_1= ruleHyperLink
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent3012);
                    this_HyperLink_1=ruleHyperLink();

                    state._fsp--;

                     
                            current = this_HyperLink_1; 
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
    // $ANTLR end "ruleAbstractUnformattedInlineContent"


    // $ANTLR start "entryRuleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1280:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1281:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1282:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3047);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3057); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1289:1: ruleText returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1292:28: ( ( (lv_name_0_0= ruleName ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1293:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1293:1: ( (lv_name_0_0= ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1294:1: (lv_name_0_0= ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1294:1: (lv_name_0_0= ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1295:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleText3102);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleHyperLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1319:1: entryRuleHyperLink returns [EObject current=null] : iv_ruleHyperLink= ruleHyperLink EOF ;
    public final EObject entryRuleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperLink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1320:2: (iv_ruleHyperLink= ruleHyperLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1321:2: iv_ruleHyperLink= ruleHyperLink EOF
            {
             newCompositeNode(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_ruleHyperLink_in_entryRuleHyperLink3137);
            iv_ruleHyperLink=ruleHyperLink();

            state._fsp--;

             current =iv_ruleHyperLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperLink3147); 

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
    // $ANTLR end "entryRuleHyperLink"


    // $ANTLR start "ruleHyperLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1328:1: ruleHyperLink returns [EObject current=null] : (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt ) ;
    public final EObject ruleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject this_Internal_0 = null;

        EObject this_InternalAlt_1 = null;

        EObject this_External_2 = null;

        EObject this_ExternalAlt_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1331:28: ( (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1332:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1332:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )
            int alt20=4;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1333:5: this_Internal_0= ruleInternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInternal_in_ruleHyperLink3194);
                    this_Internal_0=ruleInternal();

                    state._fsp--;

                     
                            current = this_Internal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1343:5: this_InternalAlt_1= ruleInternalAlt
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalAlt_in_ruleHyperLink3221);
                    this_InternalAlt_1=ruleInternalAlt();

                    state._fsp--;

                     
                            current = this_InternalAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1353:5: this_External_2= ruleExternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternal_in_ruleHyperLink3248);
                    this_External_2=ruleExternal();

                    state._fsp--;

                     
                            current = this_External_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1363:5: this_ExternalAlt_3= ruleExternalAlt
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getExternalAltParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExternalAlt_in_ruleHyperLink3275);
                    this_ExternalAlt_3=ruleExternalAlt();

                    state._fsp--;

                     
                            current = this_ExternalAlt_3; 
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
    // $ANTLR end "ruleHyperLink"


    // $ANTLR start "entryRuleInternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1379:1: entryRuleInternal returns [EObject current=null] : iv_ruleInternal= ruleInternal EOF ;
    public final EObject entryRuleInternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1380:2: (iv_ruleInternal= ruleInternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1381:2: iv_ruleInternal= ruleInternal EOF
            {
             newCompositeNode(grammarAccess.getInternalRule()); 
            pushFollow(FOLLOW_ruleInternal_in_entryRuleInternal3310);
            iv_ruleInternal=ruleInternal();

            state._fsp--;

             current =iv_ruleInternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternal3320); 

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
    // $ANTLR end "entryRuleInternal"


    // $ANTLR start "ruleInternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1388:1: ruleInternal returns [EObject current=null] : (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' ) ;
    public final EObject ruleInternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1391:28: ( (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1392:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1392:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1392:3: otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInternal3357); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1396:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1397:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1397:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1398:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getInternalAccess().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleInternal3378);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInternal3390); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleInternal"


    // $ANTLR start "entryRuleInternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1426:1: entryRuleInternalAlt returns [EObject current=null] : iv_ruleInternalAlt= ruleInternalAlt EOF ;
    public final EObject entryRuleInternalAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAlt = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1427:2: (iv_ruleInternalAlt= ruleInternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1428:2: iv_ruleInternalAlt= ruleInternalAlt EOF
            {
             newCompositeNode(grammarAccess.getInternalAltRule()); 
            pushFollow(FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt3426);
            iv_ruleInternalAlt=ruleInternalAlt();

            state._fsp--;

             current =iv_ruleInternalAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalAlt3436); 

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
    // $ANTLR end "entryRuleInternalAlt"


    // $ANTLR start "ruleInternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1435:1: ruleInternalAlt returns [EObject current=null] : (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' ) ;
    public final EObject ruleInternalAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_1_0 = null;

        EObject lv_altText_3_1 = null;

        EObject lv_altText_3_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1438:28: ( (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1439:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1439:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1439:3: otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInternalAlt3473); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalAltAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1443:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1444:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1444:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1445:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getInternalAltAccess().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleInternalAlt3494);
            lv_name_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalAltRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalAlt3506); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalAltAccess().getVerticalLineKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1465:1: ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1466:1: ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1466:1: ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1467:1: (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1467:1: (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=34 && LA21_0<=35)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=31 && LA21_0<=33)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1468:3: lv_altText_3_1= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternalAlt3529);
                    lv_altText_3_1=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInternalAltRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_3_1, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1483:8: lv_altText_3_2= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternalAlt3548);
                    lv_altText_3_2=ruleAbstractFormattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInternalAltRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_3_2, 
                            		"AbstractFormattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleInternalAlt3563); 

                	newLeafNode(otherlv_4, grammarAccess.getInternalAltAccess().getRightSquareBracketRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleInternalAlt"


    // $ANTLR start "entryRuleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1513:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1514:2: (iv_ruleExternal= ruleExternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1515:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_ruleExternal_in_entryRuleExternal3599);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternal3609); 

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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1522:1: ruleExternal returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1525:28: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1526:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1526:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1526:3: otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExternal3646); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1530:1: ( (lv_name_1_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1531:1: (lv_name_1_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1531:1: (lv_name_1_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1532:3: lv_name_1_0= RULE_URL
            {
            lv_name_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleExternal3663); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"URL");
            	    

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleExternal3680); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleExternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1560:1: entryRuleExternalAlt returns [EObject current=null] : iv_ruleExternalAlt= ruleExternalAlt EOF ;
    public final EObject entryRuleExternalAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAlt = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1561:2: (iv_ruleExternalAlt= ruleExternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1562:2: iv_ruleExternalAlt= ruleExternalAlt EOF
            {
             newCompositeNode(grammarAccess.getExternalAltRule()); 
            pushFollow(FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt3716);
            iv_ruleExternalAlt=ruleExternalAlt();

            state._fsp--;

             current =iv_ruleExternalAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAlt3726); 

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
    // $ANTLR end "entryRuleExternalAlt"


    // $ANTLR start "ruleExternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1569:1: ruleExternalAlt returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleExternalAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_altText_2_1 = null;

        EObject lv_altText_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1572:28: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1573:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1573:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1573:3: otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExternalAlt3763); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalAltAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1577:1: ( (lv_name_1_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1578:1: (lv_name_1_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1578:1: (lv_name_1_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1579:3: lv_name_1_0= RULE_URL
            {
            lv_name_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleExternalAlt3780); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalAltAccess().getNameURLTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalAltRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"URL");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1595:2: ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1596:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1596:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1597:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1597:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=34 && LA22_0<=35)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=31 && LA22_0<=33)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1598:3: lv_altText_2_1= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternalAlt3808);
                    lv_altText_2_1=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExternalAltRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_2_1, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1613:8: lv_altText_2_2= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternalAlt3827);
                    lv_altText_2_2=ruleAbstractFormattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExternalAltRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_2_2, 
                            		"AbstractFormattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleExternalAlt3842); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalAltAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleExternalAlt"


    // $ANTLR start "entryRuleName"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1643:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1644:2: (iv_ruleName= ruleName EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1645:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3879);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3890); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1652:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1655:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1656:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1656:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1656:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName3930); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1663:1: (this_ID_1= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1663:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName3951); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleName"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\42\1\5\1\4\3\5\4\uffff";
    static final String DFA20_maxS =
        "\1\43\1\5\1\4\1\27\1\44\1\27\4\uffff";
    static final String DFA20_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\5\11\uffff\1\7\7\uffff\1\6",
            "\1\11\31\uffff\5\11\1\10",
            "\1\5\11\uffff\1\7\7\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1332:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )";
        }
    }
 

    public static final BitSet FOLLOW_rulewiki_in_entryRulewiki75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewiki85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_rulewiki132 = new BitSet(new long[]{0x0000000FFD3A5022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_rulewiki152 = new BitSet(new long[]{0x0000000FFD3A5022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphTypes199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_ruleParagraphTypes246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_ruleParagraphTypes273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_ruleParagraphTypes300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleParagraphTypes327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleParagraphTypes354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleParagraphTypes381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleParagraphTypes408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleParagraphTypes435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_ruleParagraphTypes462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleParagraphTypes489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleParagraphTypes516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleParagraphTypes543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_ruleParagraphTypes570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_ruleParagraphTypes597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBlockQuote688 = new BitSet(new long[]{0x0000000F80002020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBlockQuote711 = new BitSet(new long[]{0x0000000F80002020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleBlockQuote730 = new BitSet(new long[]{0x0000000F80002020L});
    public static final BitSet FOLLOW_13_in_ruleBlockQuote746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTemplate829 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleTemplate850 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTemplate862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleTemplate883 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleTemplate896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleTemplate917 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleTemplate931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUnOrderListItemLevel21014 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel21037 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel21056 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel21082 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel21101 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_18_in_ruleUnOrderListItemLevel21117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel11153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUnOrderListItemLevel11200 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel11223 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel11242 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleUnOrderListItemLevel11268 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleUnOrderListItemLevel11287 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_18_in_ruleUnOrderListItemLevel11303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel11339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderListItemLevel11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrderListItemLevel11386 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleOrderListItemLevel11409 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleOrderListItemLevel11428 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleOrderListItemLevel11454 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleOrderListItemLevel11473 = new BitSet(new long[]{0x0000000F80040020L});
    public static final BitSet FOLLOW_18_in_ruleOrderListItemLevel11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFile1572 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleFile1593 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile1605 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFile1617 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFile1629 = new BitSet(new long[]{0x0000000F80800020L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleFile1652 = new BitSet(new long[]{0x0000000F80800020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleFile1671 = new BitSet(new long[]{0x0000000F80800020L});
    public static final BitSet FOLLOW_23_in_ruleFile1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory1723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCategory1770 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleCategory1791 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleCategory1804 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCategory1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading11854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleHeading11901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleHeading11923 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleHeading11934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading21970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading21980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHeading22017 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading22039 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHeading22050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading32086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading32096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHeading32133 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32155 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleHeading32166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading42202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading42212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleHeading42249 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42271 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleHeading42282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_entryRuleHeading52318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading52328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleHeading52365 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52387 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHeading52398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold2580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBold2627 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2649 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleBold2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic2696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleItalic2743 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic2765 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleItalic2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_entryRuleItalicBold2812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBold2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleItalicBold2859 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold2881 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleItalicBold2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent2928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleText3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_entryRuleHyperLink3137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperLink3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_ruleHyperLink3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_ruleHyperLink3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_ruleHyperLink3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_ruleHyperLink3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_entryRuleInternal3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternal3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInternal3357 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleInternal3378 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInternal3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalAlt3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInternalAlt3473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleInternalAlt3494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalAlt3506 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternalAlt3529 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternalAlt3548 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInternalAlt3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_entryRuleExternal3599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternal3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExternal3646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleExternal3663 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExternal3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAlt3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExternalAlt3763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleExternalAlt3780 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternalAlt3808 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternalAlt3827 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExternalAlt3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName3930 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName3951 = new BitSet(new long[]{0x0000000000000022L});

}