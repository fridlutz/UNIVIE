package at.ac.univie.swa.ase2015.a9902268.task3.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_ID", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<blockquote>'", "'</blockquote>'", "'{{'", "'|'", "'}}'", "'**'", "':LIST'", "'*'", "'#'", "'[['", "'File:'", "'|alt='", "']]'", "'Category:'", "'|*?'", "'='", "'=='", "'==='", "'===='", "'====='", "'\\'\\'\\''", "'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "'thumb'", "'thumbnail'", "'frame'", "'framed'", "'frameless'", "'right'", "'left'", "'center'", "'none'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "WikiPage";	
       	}
       	
       	@Override
       	protected WikiMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleWikiPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:68:1: entryRuleWikiPage returns [EObject current=null] : iv_ruleWikiPage= ruleWikiPage EOF ;
    public final EObject entryRuleWikiPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWikiPage = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:69:2: (iv_ruleWikiPage= ruleWikiPage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:70:2: iv_ruleWikiPage= ruleWikiPage EOF
            {
             newCompositeNode(grammarAccess.getWikiPageRule()); 
            pushFollow(FOLLOW_ruleWikiPage_in_entryRuleWikiPage75);
            iv_ruleWikiPage=ruleWikiPage();

            state._fsp--;

             current =iv_ruleWikiPage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWikiPage85); 

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
    // $ANTLR end "entryRuleWikiPage"


    // $ANTLR start "ruleWikiPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:77:1: ruleWikiPage returns [EObject current=null] : ( ( (lv_name_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleParagraphTypes ) )* ) ;
    public final EObject ruleWikiPage() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:28: ( ( ( (lv_name_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleParagraphTypes ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: ( ( (lv_name_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleParagraphTypes ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: ( ( (lv_name_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleParagraphTypes ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:2: ( (lv_name_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleParagraphTypes ) )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:2: ( (lv_name_0_0= ruleHeading1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:82:1: (lv_name_0_0= ruleHeading1 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:82:1: (lv_name_0_0= ruleHeading1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:83:3: lv_name_0_0= ruleHeading1
            {
             
            	        newCompositeNode(grammarAccess.getWikiPageAccess().getNameHeading1ParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeading1_in_ruleWikiPage131);
            lv_name_0_0=ruleHeading1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikiPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Heading1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:99:2: ( (lv_elements_1_0= ruleParagraphTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==14||LA1_0==17||(LA1_0>=19 && LA1_0<=21)||(LA1_0>=27 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:100:1: (lv_elements_1_0= ruleParagraphTypes )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:100:1: (lv_elements_1_0= ruleParagraphTypes )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:101:3: lv_elements_1_0= ruleParagraphTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraphTypes_in_ruleWikiPage152);
            	    lv_elements_1_0=ruleParagraphTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikiPageRule());
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
    // $ANTLR end "ruleWikiPage"


    // $ANTLR start "entryRuleParagraphTypes"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:125:1: entryRuleParagraphTypes returns [EObject current=null] : iv_ruleParagraphTypes= ruleParagraphTypes EOF ;
    public final EObject entryRuleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraphTypes = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:126:2: (iv_ruleParagraphTypes= ruleParagraphTypes EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:127:2: iv_ruleParagraphTypes= ruleParagraphTypes EOF
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:134:1: ruleParagraphTypes returns [EObject current=null] : (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_Image_3= ruleImage | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AnyText_6= ruleAnyText | this_BlockQuote_7= ruleBlockQuote | this_Heading1_8= ruleHeading1 | this_Heading2_9= ruleHeading2 | this_Heading3_10= ruleHeading3 | this_Heading4_11= ruleHeading4 | this_Heading5_12= ruleHeading5 ) ;
    public final EObject ruleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject this_OrderListItemLevel1_0 = null;

        EObject this_UnOrderListItemLevel1_1 = null;

        EObject this_UnOrderListItemLevel2_2 = null;

        EObject this_Image_3 = null;

        EObject this_Category_4 = null;

        EObject this_Template_5 = null;

        EObject this_AnyText_6 = null;

        EObject this_BlockQuote_7 = null;

        EObject this_Heading1_8 = null;

        EObject this_Heading2_9 = null;

        EObject this_Heading3_10 = null;

        EObject this_Heading4_11 = null;

        EObject this_Heading5_12 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:137:28: ( (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_Image_3= ruleImage | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AnyText_6= ruleAnyText | this_BlockQuote_7= ruleBlockQuote | this_Heading1_8= ruleHeading1 | this_Heading2_9= ruleHeading2 | this_Heading3_10= ruleHeading3 | this_Heading4_11= ruleHeading4 | this_Heading5_12= ruleHeading5 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:138:1: (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_Image_3= ruleImage | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AnyText_6= ruleAnyText | this_BlockQuote_7= ruleBlockQuote | this_Heading1_8= ruleHeading1 | this_Heading2_9= ruleHeading2 | this_Heading3_10= ruleHeading3 | this_Heading4_11= ruleHeading4 | this_Heading5_12= ruleHeading5 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:138:1: (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_Image_3= ruleImage | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AnyText_6= ruleAnyText | this_BlockQuote_7= ruleBlockQuote | this_Heading1_8= ruleHeading1 | this_Heading2_9= ruleHeading2 | this_Heading3_10= ruleHeading3 | this_Heading4_11= ruleHeading4 | this_Heading5_12= ruleHeading5 )
            int alt2=13;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:139:5: this_OrderListItemLevel1_0= ruleOrderListItemLevel1
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:149:5: this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:159:5: this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:169:5: this_Image_3= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleParagraphTypes327);
                    this_Image_3=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:179:5: this_Category_4= ruleCategory
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:189:5: this_Template_5= ruleTemplate
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:199:5: this_AnyText_6= ruleAnyText
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAnyText_in_ruleParagraphTypes408);
                    this_AnyText_6=ruleAnyText();

                    state._fsp--;

                     
                            current = this_AnyText_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:209:5: this_BlockQuote_7= ruleBlockQuote
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleBlockQuote_in_ruleParagraphTypes435);
                    this_BlockQuote_7=ruleBlockQuote();

                    state._fsp--;

                     
                            current = this_BlockQuote_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:219:5: this_Heading1_8= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleParagraphTypes462);
                    this_Heading1_8=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:229:5: this_Heading2_9= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleParagraphTypes489);
                    this_Heading2_9=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:239:5: this_Heading3_10= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleParagraphTypes516);
                    this_Heading3_10=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:249:5: this_Heading4_11= ruleHeading4
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleHeading4_in_ruleParagraphTypes543);
                    this_Heading4_11=ruleHeading4();

                    state._fsp--;

                     
                            current = this_Heading4_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:259:5: this_Heading5_12= ruleHeading5
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleHeading5_in_ruleParagraphTypes570);
                    this_Heading5_12=ruleHeading5();

                    state._fsp--;

                     
                            current = this_Heading5_12; 
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
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote605);
            iv_ruleBlockQuote=ruleBlockQuote();

            state._fsp--;

             current =iv_ruleBlockQuote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote615); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:284:1: ruleBlockQuote returns [EObject current=null] : ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' ) ;
    public final EObject ruleBlockQuote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:287:28: ( ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:1: ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:1: ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:2: () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>'
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:288:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:289:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBlockQuote661); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:298:1: ( (lv_content_2_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:299:1: (lv_content_2_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:299:1: (lv_content_2_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:300:3: lv_content_2_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleBlockQuote682);
            lv_content_2_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockQuoteRule());
            	        }
                   		set(
                   			current, 
                   			"content",
                    		lv_content_2_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBlockQuote694); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:328:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:329:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:330:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate730);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate740); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:337:1: ruleTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_content_1_0= ruleText ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+ otherlv_4= '}}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_1_0 = null;

        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:340:28: ( (otherlv_0= '{{' ( (lv_content_1_0= ruleText ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+ otherlv_4= '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:341:1: (otherlv_0= '{{' ( (lv_content_1_0= ruleText ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+ otherlv_4= '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:341:1: (otherlv_0= '{{' ( (lv_content_1_0= ruleText ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+ otherlv_4= '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:341:3: otherlv_0= '{{' ( (lv_content_1_0= ruleText ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+ otherlv_4= '}}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTemplate777); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:345:1: ( (lv_content_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:346:1: (lv_content_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:346:1: (lv_content_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:347:3: lv_content_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleTemplate798);
            lv_content_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	        }
                   		add(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:363:2: (otherlv_2= '|' ( (lv_content_3_0= ruleText ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:363:4: otherlv_2= '|' ( (lv_content_3_0= ruleText ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTemplate811); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:367:1: ( (lv_content_3_0= ruleText ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:368:1: (lv_content_3_0= ruleText )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:368:1: (lv_content_3_0= ruleText )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:369:3: lv_content_3_0= ruleText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleText_in_ruleTemplate832);
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


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTemplate846); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3());
                

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:397:1: entryRuleUnOrderListItemLevel2 returns [EObject current=null] : iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF ;
    public final EObject entryRuleUnOrderListItemLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOrderListItemLevel2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:398:2: (iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:399:2: iv_ruleUnOrderListItemLevel2= ruleUnOrderListItemLevel2 EOF
            {
             newCompositeNode(grammarAccess.getUnOrderListItemLevel2Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2882);
            iv_ruleUnOrderListItemLevel2=ruleUnOrderListItemLevel2();

            state._fsp--;

             current =iv_ruleUnOrderListItemLevel2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2892); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:406:1: ruleUnOrderListItemLevel2 returns [EObject current=null] : (otherlv_0= '**' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) ;
    public final EObject ruleUnOrderListItemLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:409:28: ( (otherlv_0= '**' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:410:1: (otherlv_0= '**' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:410:1: (otherlv_0= '**' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:410:3: otherlv_0= '**' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleUnOrderListItemLevel2929); 

                	newLeafNode(otherlv_0, grammarAccess.getUnOrderListItemLevel2Access().getAsteriskAsteriskKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:414:1: ( (lv_name_1_0= ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:415:1: (lv_name_1_0= ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:415:1: (lv_name_1_0= ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:416:3: lv_name_1_0= ruleAnyText
            {
             
            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getNameAnyTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyText_in_ruleUnOrderListItemLevel2950);
            lv_name_1_0=ruleAnyText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AnyText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:432:2: ( (lv_list_2_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:433:1: (lv_list_2_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:433:1: (lv_list_2_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:434:3: lv_list_2_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel2Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleUnOrderListItemLevel2971);
            lv_list_2_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel2Rule());
            	        }
                   		set(
                   			current, 
                   			"list",
                    		lv_list_2_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUnOrderListItemLevel2983); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:462:1: entryRuleUnOrderListItemLevel1 returns [EObject current=null] : iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF ;
    public final EObject entryRuleUnOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnOrderListItemLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:463:2: (iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:464:2: iv_ruleUnOrderListItemLevel1= ruleUnOrderListItemLevel1 EOF
            {
             newCompositeNode(grammarAccess.getUnOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel11019);
            iv_ruleUnOrderListItemLevel1=ruleUnOrderListItemLevel1();

            state._fsp--;

             current =iv_ruleUnOrderListItemLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel11029); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:471:1: ruleUnOrderListItemLevel1 returns [EObject current=null] : (otherlv_0= '*' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) ;
    public final EObject ruleUnOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:474:28: ( (otherlv_0= '*' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:475:1: (otherlv_0= '*' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:475:1: (otherlv_0= '*' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:475:3: otherlv_0= '*' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUnOrderListItemLevel11066); 

                	newLeafNode(otherlv_0, grammarAccess.getUnOrderListItemLevel1Access().getAsteriskKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:479:1: ( (lv_name_1_0= ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:480:1: (lv_name_1_0= ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:480:1: (lv_name_1_0= ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:481:3: lv_name_1_0= ruleAnyText
            {
             
            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyText_in_ruleUnOrderListItemLevel11087);
            lv_name_1_0=ruleAnyText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AnyText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:497:2: ( (lv_list_2_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:498:1: (lv_list_2_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:498:1: (lv_list_2_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:499:3: lv_list_2_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getUnOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleUnOrderListItemLevel11108);
            lv_list_2_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnOrderListItemLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"list",
                    		lv_list_2_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleUnOrderListItemLevel11120); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:527:1: entryRuleOrderListItemLevel1 returns [EObject current=null] : iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF ;
    public final EObject entryRuleOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderListItemLevel1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:528:2: (iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:529:2: iv_ruleOrderListItemLevel1= ruleOrderListItemLevel1 EOF
            {
             newCompositeNode(grammarAccess.getOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel11156);
            iv_ruleOrderListItemLevel1=ruleOrderListItemLevel1();

            state._fsp--;

             current =iv_ruleOrderListItemLevel1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderListItemLevel11166); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:536:1: ruleOrderListItemLevel1 returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) ;
    public final EObject ruleOrderListItemLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:539:28: ( (otherlv_0= '#' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:540:1: (otherlv_0= '#' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:540:1: (otherlv_0= '#' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:540:3: otherlv_0= '#' ( (lv_name_1_0= ruleAnyText ) ) ( (lv_list_2_0= ruleAnyTextSequence ) ) otherlv_3= ':LIST'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOrderListItemLevel11203); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderListItemLevel1Access().getNumberSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:544:1: ( (lv_name_1_0= ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:545:1: (lv_name_1_0= ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:545:1: (lv_name_1_0= ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:546:3: lv_name_1_0= ruleAnyText
            {
             
            	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyText_in_ruleOrderListItemLevel11224);
            lv_name_1_0=ruleAnyText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AnyText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:562:2: ( (lv_list_2_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:563:1: (lv_list_2_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:563:1: (lv_list_2_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:564:3: lv_list_2_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleOrderListItemLevel11245);
            lv_list_2_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderListItemLevel1Rule());
            	        }
                   		set(
                   			current, 
                   			"list",
                    		lv_list_2_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOrderListItemLevel11257); 

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


    // $ANTLR start "entryRuleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:592:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:593:2: (iv_ruleImage= ruleImage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:594:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1293);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1303); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:601:1: ruleImage returns [EObject current=null] : (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= ruleText ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )? (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;

        Enumerator lv_hAlign_6_0 = null;

        EObject lv_altText_8_0 = null;

        EObject lv_caption_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:604:28: ( (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= ruleText ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )? (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:605:1: (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= ruleText ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )? (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:605:1: (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= ruleText ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )? (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:605:3: otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= ruleText ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )? (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImage1340); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleImage1352); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getFileKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:613:1: ( (lv_name_2_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:614:1: (lv_name_2_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:614:1: (lv_name_2_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:615:3: lv_name_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getNameTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleImage1373);
            lv_name_2_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:631:2: (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=37 && LA4_1<=41)) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:631:4: otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleImage1386); 

                        	newLeafNode(otherlv_3, grammarAccess.getImageAccess().getVerticalLineKeyword_3_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:635:1: ( (lv_type_4_0= ruleViewType ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:636:1: (lv_type_4_0= ruleViewType )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:636:1: (lv_type_4_0= ruleViewType )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:637:3: lv_type_4_0= ruleViewType
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewType_in_ruleImage1407);
                    lv_type_4_0=ruleViewType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"ViewType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:653:4: (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=42 && LA5_1<=45)) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:653:6: otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleImage1422); 

                        	newLeafNode(otherlv_5, grammarAccess.getImageAccess().getVerticalLineKeyword_4_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:657:1: ( (lv_hAlign_6_0= ruleHorizontalAlign ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:658:1: (lv_hAlign_6_0= ruleHorizontalAlign )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:658:1: (lv_hAlign_6_0= ruleHorizontalAlign )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:659:3: lv_hAlign_6_0= ruleHorizontalAlign
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHorizontalAlign_in_ruleImage1443);
                    lv_hAlign_6_0=ruleHorizontalAlign();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"hAlign",
                            		lv_hAlign_6_0, 
                            		"HorizontalAlign");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:675:4: (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:675:6: otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleImage1458); 

                        	newLeafNode(otherlv_7, grammarAccess.getImageAccess().getAltKeyword_5_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:1: ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:680:1: (lv_altText_8_0= ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:680:1: (lv_altText_8_0= ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:681:3: lv_altText_8_0= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleImage1479);
                    lv_altText_8_0=ruleAbstractUnformattedInlineContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageRule());
                    	        }
                           		set(
                           			current, 
                           			"altText",
                            		lv_altText_8_0, 
                            		"AbstractUnformattedInlineContent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleImage1493); 

                	newLeafNode(otherlv_9, grammarAccess.getImageAccess().getVerticalLineKeyword_6());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:701:1: ( (lv_caption_10_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:702:1: (lv_caption_10_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:702:1: (lv_caption_10_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:703:3: lv_caption_10_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleImage1514);
            lv_caption_10_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImageRule());
            	        }
                   		set(
                   			current, 
                   			"caption",
                    		lv_caption_10_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleImage1526); 

                	newLeafNode(otherlv_11, grammarAccess.getImageAccess().getRightSquareBracketRightSquareBracketKeyword_8());
                

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCategory"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:731:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:732:2: (iv_ruleCategory= ruleCategory EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:733:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory1562);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory1572); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:740:1: ruleCategory returns [EObject current=null] : (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:743:28: ( (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:744:1: (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:744:1: (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:744:3: otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCategory1609); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCategory1621); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:752:1: ( (lv_name_2_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (lv_name_2_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (lv_name_2_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:754:3: lv_name_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCategory1642);
            lv_name_2_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:770:2: ( (lv_value_3_0= '|*?' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:771:1: (lv_value_3_0= '|*?' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:771:1: (lv_value_3_0= '|*?' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:772:3: lv_value_3_0= '|*?'
                    {
                    lv_value_3_0=(Token)match(input,26,FOLLOW_26_in_ruleCategory1660); 

                            newLeafNode(lv_value_3_0, grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "|*?");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleCategory1686); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_4());
                

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:797:1: entryRuleHeading1 returns [EObject current=null] : iv_ruleHeading1= ruleHeading1 EOF ;
    public final EObject entryRuleHeading1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading1 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:798:2: (iv_ruleHeading1= ruleHeading1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:799:2: iv_ruleHeading1= ruleHeading1 EOF
            {
             newCompositeNode(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading11722);
            iv_ruleHeading1=ruleHeading1();

            state._fsp--;

             current =iv_ruleHeading1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading11732); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:806:1: ruleHeading1 returns [EObject current=null] : (otherlv_0= '=' ( (lv_headingValue1_1_0= ruleText ) ) otherlv_2= '=' ) ;
    public final EObject ruleHeading1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue1_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:809:28: ( (otherlv_0= '=' ( (lv_headingValue1_1_0= ruleText ) ) otherlv_2= '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:810:1: (otherlv_0= '=' ( (lv_headingValue1_1_0= ruleText ) ) otherlv_2= '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:810:1: (otherlv_0= '=' ( (lv_headingValue1_1_0= ruleText ) ) otherlv_2= '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:810:3: otherlv_0= '=' ( (lv_headingValue1_1_0= ruleText ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleHeading11769); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading1Access().getEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:814:1: ( (lv_headingValue1_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:815:1: (lv_headingValue1_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:815:1: (lv_headingValue1_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:816:3: lv_headingValue1_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getHeading1Access().getHeadingValue1TextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleHeading11790);
            lv_headingValue1_1_0=ruleText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading1Rule());
            	        }
                   		set(
                   			current, 
                   			"headingValue1",
                    		lv_headingValue1_1_0, 
                    		"Text");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleHeading11802); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:844:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:845:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:846:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading21838);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading21848); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:853:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue2_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:856:28: ( (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:857:1: (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:857:1: (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:857:3: otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=='
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleHeading21885); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:861:1: ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:862:1: (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:862:1: (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:863:3: lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading21906);
            lv_headingValue2_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading2Rule());
            	        }
                   		set(
                   			current, 
                   			"headingValue2",
                    		lv_headingValue2_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleHeading21918); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:891:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:892:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:893:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading31954);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading31964); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:900:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue3_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:903:28: ( (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:904:1: (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:904:1: (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:904:3: otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==='
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleHeading32001); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:908:1: ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:909:1: (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:909:1: (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:910:3: lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32022);
            lv_headingValue3_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading3Rule());
            	        }
                   		set(
                   			current, 
                   			"headingValue3",
                    		lv_headingValue3_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleHeading32034); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:938:1: entryRuleHeading4 returns [EObject current=null] : iv_ruleHeading4= ruleHeading4 EOF ;
    public final EObject entryRuleHeading4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading4 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:939:2: (iv_ruleHeading4= ruleHeading4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:940:2: iv_ruleHeading4= ruleHeading4 EOF
            {
             newCompositeNode(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading42070);
            iv_ruleHeading4=ruleHeading4();

            state._fsp--;

             current =iv_ruleHeading4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading42080); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:947:1: ruleHeading4 returns [EObject current=null] : (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' ) ;
    public final EObject ruleHeading4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue4_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:950:28: ( (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:951:1: (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:951:1: (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:951:3: otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===='
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleHeading42117); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:955:1: ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:956:1: (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:956:1: (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:957:3: lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42138);
            lv_headingValue4_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading4Rule());
            	        }
                   		set(
                   			current, 
                   			"headingValue4",
                    		lv_headingValue4_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleHeading42150); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:985:1: entryRuleHeading5 returns [EObject current=null] : iv_ruleHeading5= ruleHeading5 EOF ;
    public final EObject entryRuleHeading5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading5 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:986:2: (iv_ruleHeading5= ruleHeading5 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:987:2: iv_ruleHeading5= ruleHeading5 EOF
            {
             newCompositeNode(grammarAccess.getHeading5Rule()); 
            pushFollow(FOLLOW_ruleHeading5_in_entryRuleHeading52186);
            iv_ruleHeading5=ruleHeading5();

            state._fsp--;

             current =iv_ruleHeading5; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading52196); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:994:1: ruleHeading5 returns [EObject current=null] : (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' ) ;
    public final EObject ruleHeading5() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue5_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:997:28: ( (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:998:1: (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:998:1: (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:998:3: otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====='
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleHeading52233); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1002:1: ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1003:1: (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1003:1: (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1004:3: lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52254);
            lv_headingValue5_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading5Rule());
            	        }
                   		set(
                   			current, 
                   			"headingValue5",
                    		lv_headingValue5_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleHeading52266); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1032:1: entryRuleAbstractFormattedInlineContent returns [EObject current=null] : iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF ;
    public final EObject entryRuleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFormattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1033:2: (iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1034:2: iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractFormattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2302);
            iv_ruleAbstractFormattedInlineContent=ruleAbstractFormattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractFormattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2312); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1041:1: ruleAbstractFormattedInlineContent returns [EObject current=null] : (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) ;
    public final EObject ruleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Bold_0 = null;

        EObject this_Italic_1 = null;

        EObject this_ItalicBold_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1044:28: ( (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1045:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1045:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1046:5: this_Bold_0= ruleBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2359);
                    this_Bold_0=ruleBold();

                    state._fsp--;

                     
                            current = this_Bold_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1056:5: this_Italic_1= ruleItalic
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2386);
                    this_Italic_1=ruleItalic();

                    state._fsp--;

                     
                            current = this_Italic_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1066:5: this_ItalicBold_2= ruleItalicBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2413);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1082:1: entryRuleBold returns [EObject current=null] : iv_ruleBold= ruleBold EOF ;
    public final EObject entryRuleBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1083:2: (iv_ruleBold= ruleBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1084:2: iv_ruleBold= ruleBold EOF
            {
             newCompositeNode(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold2448);
            iv_ruleBold=ruleBold();

            state._fsp--;

             current =iv_ruleBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold2458); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1091:1: ruleBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1094:28: ( (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1095:1: (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1095:1: (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1095:3: otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleBold2495); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1099:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1100:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1100:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1101:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2516);
            lv_name_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBoldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleBold2528); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1129:1: entryRuleItalic returns [EObject current=null] : iv_ruleItalic= ruleItalic EOF ;
    public final EObject entryRuleItalic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalic = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1130:2: (iv_ruleItalic= ruleItalic EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1131:2: iv_ruleItalic= ruleItalic EOF
            {
             newCompositeNode(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic2564);
            iv_ruleItalic=ruleItalic();

            state._fsp--;

             current =iv_ruleItalic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic2574); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1138:1: ruleItalic returns [EObject current=null] : (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1141:28: ( (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1142:1: (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1142:1: (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1142:3: otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleItalic2611); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1146:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1147:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1147:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1148:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic2632);
            lv_name_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItalicRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleItalic2644); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1176:1: entryRuleItalicBold returns [EObject current=null] : iv_ruleItalicBold= ruleItalicBold EOF ;
    public final EObject entryRuleItalicBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1177:2: (iv_ruleItalicBold= ruleItalicBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1178:2: iv_ruleItalicBold= ruleItalicBold EOF
            {
             newCompositeNode(grammarAccess.getItalicBoldRule()); 
            pushFollow(FOLLOW_ruleItalicBold_in_entryRuleItalicBold2680);
            iv_ruleItalicBold=ruleItalicBold();

            state._fsp--;

             current =iv_ruleItalicBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBold2690); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1185:1: ruleItalicBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) ;
    public final EObject ruleItalicBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1188:28: ( (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1189:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1189:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1189:3: otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\''
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleItalicBold2727); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1193:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1194:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1194:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1195:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold2748);
            lv_name_1_0=ruleAbstractUnformattedInlineContent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItalicBoldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"AbstractUnformattedInlineContent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleItalicBold2760); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1223:1: entryRuleAbstractUnformattedInlineContent returns [EObject current=null] : iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF ;
    public final EObject entryRuleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUnformattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1224:2: (iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1225:2: iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent2796);
            iv_ruleAbstractUnformattedInlineContent=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractUnformattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent2806); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1232:1: ruleAbstractUnformattedInlineContent returns [EObject current=null] : (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) ;
    public final EObject ruleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_HyperLink_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1235:28: ( (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1236:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1236:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==21||LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1237:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent2853);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1247:5: this_HyperLink_1= ruleHyperLink
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent2880);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1263:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1264:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1265:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText2915);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText2925); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1272:1: ruleText returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1275:28: ( ( (lv_name_0_0= ruleName ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1276:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1276:1: ( (lv_name_0_0= ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1277:1: (lv_name_0_0= ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1277:1: (lv_name_0_0= ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1278:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleText2970);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1302:1: entryRuleHyperLink returns [EObject current=null] : iv_ruleHyperLink= ruleHyperLink EOF ;
    public final EObject entryRuleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperLink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1303:2: (iv_ruleHyperLink= ruleHyperLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1304:2: iv_ruleHyperLink= ruleHyperLink EOF
            {
             newCompositeNode(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_ruleHyperLink_in_entryRuleHyperLink3005);
            iv_ruleHyperLink=ruleHyperLink();

            state._fsp--;

             current =iv_ruleHyperLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperLink3015); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1311:1: ruleHyperLink returns [EObject current=null] : (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt ) ;
    public final EObject ruleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject this_Internal_0 = null;

        EObject this_InternalAlt_1 = null;

        EObject this_External_2 = null;

        EObject this_ExternalAlt_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1314:28: ( (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1315:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1315:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1316:5: this_Internal_0= ruleInternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInternal_in_ruleHyperLink3062);
                    this_Internal_0=ruleInternal();

                    state._fsp--;

                     
                            current = this_Internal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1326:5: this_InternalAlt_1= ruleInternalAlt
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInternalAlt_in_ruleHyperLink3089);
                    this_InternalAlt_1=ruleInternalAlt();

                    state._fsp--;

                     
                            current = this_InternalAlt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1336:5: this_External_2= ruleExternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExternal_in_ruleHyperLink3116);
                    this_External_2=ruleExternal();

                    state._fsp--;

                     
                            current = this_External_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1346:5: this_ExternalAlt_3= ruleExternalAlt
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getExternalAltParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExternalAlt_in_ruleHyperLink3143);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1362:1: entryRuleInternal returns [EObject current=null] : iv_ruleInternal= ruleInternal EOF ;
    public final EObject entryRuleInternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1363:2: (iv_ruleInternal= ruleInternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1364:2: iv_ruleInternal= ruleInternal EOF
            {
             newCompositeNode(grammarAccess.getInternalRule()); 
            pushFollow(FOLLOW_ruleInternal_in_entryRuleInternal3178);
            iv_ruleInternal=ruleInternal();

            state._fsp--;

             current =iv_ruleInternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternal3188); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1371:1: ruleInternal returns [EObject current=null] : (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' ) ;
    public final EObject ruleInternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1374:28: ( (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1375:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1375:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1375:3: otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInternal3225); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1379:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1380:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1380:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1381:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getInternalAccess().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleInternal3246);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInternal3258); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1409:1: entryRuleInternalAlt returns [EObject current=null] : iv_ruleInternalAlt= ruleInternalAlt EOF ;
    public final EObject entryRuleInternalAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAlt = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1410:2: (iv_ruleInternalAlt= ruleInternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1411:2: iv_ruleInternalAlt= ruleInternalAlt EOF
            {
             newCompositeNode(grammarAccess.getInternalAltRule()); 
            pushFollow(FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt3294);
            iv_ruleInternalAlt=ruleInternalAlt();

            state._fsp--;

             current =iv_ruleInternalAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalAlt3304); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1418:1: ruleInternalAlt returns [EObject current=null] : (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' ) ;
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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1421:28: ( (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1422:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1422:1: (otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1422:3: otherlv_0= '[[' ( (lv_name_1_0= ruleText ) ) otherlv_2= '|' ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInternalAlt3341); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalAltAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1426:1: ( (lv_name_1_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1427:1: (lv_name_1_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1427:1: (lv_name_1_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1428:3: lv_name_1_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getInternalAltAccess().getNameTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleInternalAlt3362);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInternalAlt3374); 

                	newLeafNode(otherlv_2, grammarAccess.getInternalAltAccess().getVerticalLineKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1448:1: ( ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1449:1: ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1449:1: ( (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1450:1: (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1450:1: (lv_altText_3_1= ruleAbstractUnformattedInlineContent | lv_altText_3_2= ruleAbstractFormattedInlineContent )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==21||LA11_0==35) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=32 && LA11_0<=34)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1451:3: lv_altText_3_1= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternalAlt3397);
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1466:8: lv_altText_3_2= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternalAlt3416);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleInternalAlt3431); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1496:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1497:2: (iv_ruleExternal= ruleExternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1498:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_ruleExternal_in_entryRuleExternal3467);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternal3477); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1505:1: ruleExternal returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1508:28: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1509:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1509:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1509:3: otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExternal3514); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1513:1: ( (lv_name_1_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1514:1: (lv_name_1_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1514:1: (lv_name_1_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1515:3: lv_name_1_0= RULE_URL
            {
            lv_name_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleExternal3531); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleExternal3548); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1543:1: entryRuleExternalAlt returns [EObject current=null] : iv_ruleExternalAlt= ruleExternalAlt EOF ;
    public final EObject entryRuleExternalAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAlt = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1544:2: (iv_ruleExternalAlt= ruleExternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1545:2: iv_ruleExternalAlt= ruleExternalAlt EOF
            {
             newCompositeNode(grammarAccess.getExternalAltRule()); 
            pushFollow(FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt3584);
            iv_ruleExternalAlt=ruleExternalAlt();

            state._fsp--;

             current =iv_ruleExternalAlt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAlt3594); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1552:1: ruleExternalAlt returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' ) ;
    public final EObject ruleExternalAlt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_altText_2_1 = null;

        EObject lv_altText_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1555:28: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1556:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1556:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1556:3: otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) ) otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleExternalAlt3631); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalAltAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1560:1: ( (lv_name_1_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1561:1: (lv_name_1_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1561:1: (lv_name_1_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1562:3: lv_name_1_0= RULE_URL
            {
            lv_name_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleExternalAlt3648); 

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

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1578:2: ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1579:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1579:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1580:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1580:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||LA12_0==21||LA12_0==35) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=32 && LA12_0<=34)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1581:3: lv_altText_2_1= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternalAlt3676);
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1596:8: lv_altText_2_2= ruleAbstractFormattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternalAlt3695);
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

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleExternalAlt3710); 

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


    // $ANTLR start "entryRuleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1626:1: entryRuleAnyTextSequence returns [EObject current=null] : iv_ruleAnyTextSequence= ruleAnyTextSequence EOF ;
    public final EObject entryRuleAnyTextSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyTextSequence = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1627:2: (iv_ruleAnyTextSequence= ruleAnyTextSequence EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1628:2: iv_ruleAnyTextSequence= ruleAnyTextSequence EOF
            {
             newCompositeNode(grammarAccess.getAnyTextSequenceRule()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence3746);
            iv_ruleAnyTextSequence=ruleAnyTextSequence();

            state._fsp--;

             current =iv_ruleAnyTextSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyTextSequence3756); 

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
    // $ANTLR end "entryRuleAnyTextSequence"


    // $ANTLR start "ruleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1635:1: ruleAnyTextSequence returns [EObject current=null] : ( () ( (lv_content_1_0= ruleAnyText ) )* ) ;
    public final EObject ruleAnyTextSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1638:28: ( ( () ( (lv_content_1_0= ruleAnyText ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1639:1: ( () ( (lv_content_1_0= ruleAnyText ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1639:1: ( () ( (lv_content_1_0= ruleAnyText ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1639:2: () ( (lv_content_1_0= ruleAnyText ) )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1639:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1640:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0(),
                        current);
                

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1645:2: ( (lv_content_1_0= ruleAnyText ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==21||(LA13_0>=32 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1646:1: (lv_content_1_0= ruleAnyText )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1646:1: (lv_content_1_0= ruleAnyText )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1647:3: lv_content_1_0= ruleAnyText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnyText_in_ruleAnyTextSequence3811);
            	    lv_content_1_0=ruleAnyText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnyTextSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_1_0, 
            	            		"AnyText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleAnyTextSequence"


    // $ANTLR start "entryRuleAnyText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1671:1: entryRuleAnyText returns [EObject current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final EObject entryRuleAnyText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1672:2: (iv_ruleAnyText= ruleAnyText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1673:2: iv_ruleAnyText= ruleAnyText EOF
            {
             newCompositeNode(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText3848);
            iv_ruleAnyText=ruleAnyText();

            state._fsp--;

             current =iv_ruleAnyText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText3858); 

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
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1680:1: ruleAnyText returns [EObject current=null] : (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent ) ;
    public final EObject ruleAnyText() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractFormattedInlineContent_0 = null;

        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1683:28: ( (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1684:1: (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1684:1: (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=32 && LA14_0<=34)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID||LA14_0==21||LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1685:5: this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleAnyText3905);
                    this_AbstractFormattedInlineContent_0=ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     
                            current = this_AbstractFormattedInlineContent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1695:5: this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getAnyTextAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleAnyText3932);
                    this_AbstractUnformattedInlineContent_1=ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     
                            current = this_AbstractUnformattedInlineContent_1; 
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
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleName"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1711:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1712:2: (iv_ruleName= ruleName EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1713:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3968);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3979); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1720:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1723:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1724:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1724:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1724:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName4019); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1731:1: (this_ID_1= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1731:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName4040); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "ruleViewType"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1746:1: ruleViewType returns [Enumerator current=null] : ( (enumLiteral_0= 'thumb' ) | (enumLiteral_1= 'thumbnail' ) | (enumLiteral_2= 'frame' ) | (enumLiteral_3= 'framed' ) | (enumLiteral_4= 'frameless' ) ) ;
    public final Enumerator ruleViewType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1748:28: ( ( (enumLiteral_0= 'thumb' ) | (enumLiteral_1= 'thumbnail' ) | (enumLiteral_2= 'frame' ) | (enumLiteral_3= 'framed' ) | (enumLiteral_4= 'frameless' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1749:1: ( (enumLiteral_0= 'thumb' ) | (enumLiteral_1= 'thumbnail' ) | (enumLiteral_2= 'frame' ) | (enumLiteral_3= 'framed' ) | (enumLiteral_4= 'frameless' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1749:1: ( (enumLiteral_0= 'thumb' ) | (enumLiteral_1= 'thumbnail' ) | (enumLiteral_2= 'frame' ) | (enumLiteral_3= 'framed' ) | (enumLiteral_4= 'frameless' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 39:
                {
                alt16=3;
                }
                break;
            case 40:
                {
                alt16=4;
                }
                break;
            case 41:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1749:2: (enumLiteral_0= 'thumb' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1749:2: (enumLiteral_0= 'thumb' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1749:4: enumLiteral_0= 'thumb'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleViewType4101); 

                            current = grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1755:6: (enumLiteral_1= 'thumbnail' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1755:6: (enumLiteral_1= 'thumbnail' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1755:8: enumLiteral_1= 'thumbnail'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleViewType4118); 

                            current = grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1761:6: (enumLiteral_2= 'frame' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1761:6: (enumLiteral_2= 'frame' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1761:8: enumLiteral_2= 'frame'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleViewType4135); 

                            current = grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1767:6: (enumLiteral_3= 'framed' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1767:6: (enumLiteral_3= 'framed' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1767:8: enumLiteral_3= 'framed'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleViewType4152); 

                            current = grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1773:6: (enumLiteral_4= 'frameless' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1773:6: (enumLiteral_4= 'frameless' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1773:8: enumLiteral_4= 'frameless'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_41_in_ruleViewType4169); 

                            current = grammarAccess.getViewTypeAccess().getFramelessEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getViewTypeAccess().getFramelessEnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleViewType"


    // $ANTLR start "ruleHorizontalAlign"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1783:1: ruleHorizontalAlign returns [Enumerator current=null] : ( (enumLiteral_0= 'right' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'none' ) ) ;
    public final Enumerator ruleHorizontalAlign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1785:28: ( ( (enumLiteral_0= 'right' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'none' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1786:1: ( (enumLiteral_0= 'right' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'none' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1786:1: ( (enumLiteral_0= 'right' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'center' ) | (enumLiteral_3= 'none' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
                {
                alt17=3;
                }
                break;
            case 45:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1786:2: (enumLiteral_0= 'right' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1786:2: (enumLiteral_0= 'right' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1786:4: enumLiteral_0= 'right'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleHorizontalAlign4214); 

                            current = grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1792:6: (enumLiteral_1= 'left' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1792:6: (enumLiteral_1= 'left' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1792:8: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleHorizontalAlign4231); 

                            current = grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1798:6: (enumLiteral_2= 'center' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1798:6: (enumLiteral_2= 'center' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1798:8: enumLiteral_2= 'center'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleHorizontalAlign4248); 

                            current = grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1804:6: (enumLiteral_3= 'none' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1804:6: (enumLiteral_3= 'none' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1804:8: enumLiteral_3= 'none'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleHorizontalAlign4265); 

                            current = grammarAccess.getHorizontalAlignAccess().getNoneEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getHorizontalAlignAccess().getNoneEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleHorizontalAlign"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\5\3\uffff\1\5\12\uffff";
    static final String DFA2_maxS =
        "\1\43\3\uffff\1\31\12\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\4\1\5";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\6\uffff\1\7\1\uffff\1\5\2\uffff\1\3\1\uffff\1\2\1\1\1"+
            "\4\5\uffff\1\10\1\11\1\12\1\13\1\14\4\6",
            "",
            "",
            "",
            "\1\6\20\uffff\1\15\2\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "138:1: (this_OrderListItemLevel1_0= ruleOrderListItemLevel1 | this_UnOrderListItemLevel1_1= ruleUnOrderListItemLevel1 | this_UnOrderListItemLevel2_2= ruleUnOrderListItemLevel2 | this_Image_3= ruleImage | this_Category_4= ruleCategory | this_Template_5= ruleTemplate | this_AnyText_6= ruleAnyText | this_BlockQuote_7= ruleBlockQuote | this_Heading1_8= ruleHeading1 | this_Heading2_9= ruleHeading2 | this_Heading3_10= ruleHeading3 | this_Heading4_11= ruleHeading4 | this_Heading5_12= ruleHeading5 )";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\25\1\5\1\4\3\5\4\uffff";
    static final String DFA10_maxS =
        "\1\43\1\5\1\4\1\30\1\44\1\30\4\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\2\1\1\1\3\1\4";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\15\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\11\uffff\1\6\10\uffff\1\7",
            "\1\11\17\uffff\1\11\12\uffff\4\11\1\10",
            "\1\5\11\uffff\1\6\10\uffff\1\7",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1315:1: (this_Internal_0= ruleInternal | this_InternalAlt_1= ruleInternalAlt | this_External_2= ruleExternal | this_ExternalAlt_3= ruleExternalAlt )";
        }
    }
 

    public static final BitSet FOLLOW_ruleWikiPage_in_entryRuleWikiPage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWikiPage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleWikiPage131 = new BitSet(new long[]{0x0000000FF83A5022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_ruleWikiPage152 = new BitSet(new long[]{0x0000000FF83A5022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphTypes199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_ruleParagraphTypes246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_ruleParagraphTypes273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_ruleParagraphTypes300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleParagraphTypes327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleParagraphTypes354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleParagraphTypes381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleParagraphTypes408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_ruleParagraphTypes435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleParagraphTypes462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleParagraphTypes489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleParagraphTypes516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_ruleParagraphTypes543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_ruleParagraphTypes570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBlockQuote661 = new BitSet(new long[]{0x0000000F00202020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleBlockQuote682 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBlockQuote694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTemplate777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleTemplate798 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTemplate811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleTemplate832 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleTemplate846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleUnOrderListItemLevel2929 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleUnOrderListItemLevel2950 = new BitSet(new long[]{0x0000000F00240020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleUnOrderListItemLevel2971 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUnOrderListItemLevel2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel11019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel11029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUnOrderListItemLevel11066 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleUnOrderListItemLevel11087 = new BitSet(new long[]{0x0000000F00240020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleUnOrderListItemLevel11108 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUnOrderListItemLevel11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel11156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderListItemLevel11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOrderListItemLevel11203 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleOrderListItemLevel11224 = new BitSet(new long[]{0x0000000F00240020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleOrderListItemLevel11245 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOrderListItemLevel11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImage1340 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleImage1352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleImage1373 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleImage1386 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_ruleViewType_in_ruleImage1407 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleImage1422 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_ruleHorizontalAlign_in_ruleImage1443 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleImage1458 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleImage1479 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImage1493 = new BitSet(new long[]{0x0000000F01200020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleImage1514 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleImage1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCategory1609 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCategory1621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleCategory1642 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleCategory1660 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCategory1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading11722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleHeading11769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleHeading11790 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleHeading11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading21838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading21848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHeading21885 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading21906 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleHeading21918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading31954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading31964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleHeading32001 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32022 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleHeading32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading42070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading42080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleHeading42117 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42138 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHeading42150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_entryRuleHeading52186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading52196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHeading52233 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52254 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleHeading52266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBold2495 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2516 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBold2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleItalic2611 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic2632 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleItalic2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_entryRuleItalicBold2680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBold2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleItalicBold2727 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold2748 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleItalicBold2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent2796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleText2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_entryRuleHyperLink3005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperLink3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_ruleHyperLink3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_ruleHyperLink3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_ruleHyperLink3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_ruleHyperLink3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_entryRuleInternal3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternal3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInternal3225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleInternal3246 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInternal3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalAlt3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInternalAlt3341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleInternalAlt3362 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInternalAlt3374 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternalAlt3397 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternalAlt3416 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInternalAlt3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_entryRuleExternal3467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternal3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExternal3514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleExternal3531 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExternal3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt3584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAlt3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleExternalAlt3631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleExternalAlt3648 = new BitSet(new long[]{0x0000000F00200020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternalAlt3676 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternalAlt3695 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExternalAlt3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyTextSequence3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleAnyTextSequence3811 = new BitSet(new long[]{0x0000000F00200022L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText3848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleAnyText3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleAnyText3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName4019 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName4040 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_37_in_ruleViewType4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleViewType4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleViewType4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleViewType4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleViewType4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleHorizontalAlign4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleHorizontalAlign4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleHorizontalAlign4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHorizontalAlign4265 = new BitSet(new long[]{0x0000000000000002L});

}