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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<blockquote>'", "'</blockquote>'", "'{{'", "'about'", "'|'", "'}}'", "'main'", "'\\''", "'*'", "'**'", "'#'", "'[['", "'File:'", "'|alt='", "']]'", "'Category:'", "'|*?'", "'=='", "'==='", "'===='", "'====='", "'\\'\\'\\''", "'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "'\\r\\n\\r\\n'", "'thumb'", "'right'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:77:1: ruleWikiPage returns [EObject current=null] : (otherlv_0= '=' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleParagraphTypes ) )* ) ;
    public final EObject ruleWikiPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:80:28: ( (otherlv_0= '=' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleParagraphTypes ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: (otherlv_0= '=' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleParagraphTypes ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:1: (otherlv_0= '=' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleParagraphTypes ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:81:3: otherlv_0= '=' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_elements_3_0= ruleParagraphTypes ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleWikiPage122); 

                	newLeafNode(otherlv_0, grammarAccess.getWikiPageAccess().getEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:85:1: ( (lv_name_1_0= ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:86:1: (lv_name_1_0= ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:86:1: (lv_name_1_0= ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:87:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getWikiPageAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleWikiPage143);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWikiPageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleWikiPage155); 

                	newLeafNode(otherlv_2, grammarAccess.getWikiPageAccess().getEqualsSignKeyword_2());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:107:1: ( (lv_elements_3_0= ruleParagraphTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==15||(LA1_0>=21 && LA1_0<=24)||(LA1_0>=30 && LA1_0<=37)||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:108:1: (lv_elements_3_0= ruleParagraphTypes )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:108:1: (lv_elements_3_0= ruleParagraphTypes )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:109:3: lv_elements_3_0= ruleParagraphTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParagraphTypes_in_ruleWikiPage176);
            	    lv_elements_3_0=ruleParagraphTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWikiPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:133:1: entryRuleParagraphTypes returns [EObject current=null] : iv_ruleParagraphTypes= ruleParagraphTypes EOF ;
    public final EObject entryRuleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraphTypes = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:134:2: (iv_ruleParagraphTypes= ruleParagraphTypes EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:135:2: iv_ruleParagraphTypes= ruleParagraphTypes EOF
            {
             newCompositeNode(grammarAccess.getParagraphTypesRule()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes213);
            iv_ruleParagraphTypes=ruleParagraphTypes();

            state._fsp--;

             current =iv_ruleParagraphTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraphTypes223); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:142:1: ruleParagraphTypes returns [EObject current=null] : (this_OrderedList_0= ruleOrderedList | this_UnorderedList_1= ruleUnorderedList | this_Image_2= ruleImage | this_Category_3= ruleCategory | this_Template_4= ruleTemplate | this_AnyText_5= ruleAnyText | this_BlockQuote_6= ruleBlockQuote | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Heading4_9= ruleHeading4 | this_Heading5_10= ruleHeading5 | this_Paragraph_11= ruleParagraph ) ;
    public final EObject ruleParagraphTypes() throws RecognitionException {
        EObject current = null;

        EObject this_OrderedList_0 = null;

        EObject this_UnorderedList_1 = null;

        EObject this_Image_2 = null;

        EObject this_Category_3 = null;

        EObject this_Template_4 = null;

        EObject this_AnyText_5 = null;

        EObject this_BlockQuote_6 = null;

        EObject this_Heading2_7 = null;

        EObject this_Heading3_8 = null;

        EObject this_Heading4_9 = null;

        EObject this_Heading5_10 = null;

        EObject this_Paragraph_11 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:145:28: ( (this_OrderedList_0= ruleOrderedList | this_UnorderedList_1= ruleUnorderedList | this_Image_2= ruleImage | this_Category_3= ruleCategory | this_Template_4= ruleTemplate | this_AnyText_5= ruleAnyText | this_BlockQuote_6= ruleBlockQuote | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Heading4_9= ruleHeading4 | this_Heading5_10= ruleHeading5 | this_Paragraph_11= ruleParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:146:1: (this_OrderedList_0= ruleOrderedList | this_UnorderedList_1= ruleUnorderedList | this_Image_2= ruleImage | this_Category_3= ruleCategory | this_Template_4= ruleTemplate | this_AnyText_5= ruleAnyText | this_BlockQuote_6= ruleBlockQuote | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Heading4_9= ruleHeading4 | this_Heading5_10= ruleHeading5 | this_Paragraph_11= ruleParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:146:1: (this_OrderedList_0= ruleOrderedList | this_UnorderedList_1= ruleUnorderedList | this_Image_2= ruleImage | this_Category_3= ruleCategory | this_Template_4= ruleTemplate | this_AnyText_5= ruleAnyText | this_BlockQuote_6= ruleBlockQuote | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Heading4_9= ruleHeading4 | this_Heading5_10= ruleHeading5 | this_Paragraph_11= ruleParagraph )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:147:5: this_OrderedList_0= ruleOrderedList
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getOrderedListParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleParagraphTypes270);
                    this_OrderedList_0=ruleOrderedList();

                    state._fsp--;

                     
                            current = this_OrderedList_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:157:5: this_UnorderedList_1= ruleUnorderedList
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getUnorderedListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleParagraphTypes297);
                    this_UnorderedList_1=ruleUnorderedList();

                    state._fsp--;

                     
                            current = this_UnorderedList_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:167:5: this_Image_2= ruleImage
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImage_in_ruleParagraphTypes324);
                    this_Image_2=ruleImage();

                    state._fsp--;

                     
                            current = this_Image_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:177:5: this_Category_3= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCategory_in_ruleParagraphTypes351);
                    this_Category_3=ruleCategory();

                    state._fsp--;

                     
                            current = this_Category_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:187:5: this_Template_4= ruleTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTemplate_in_ruleParagraphTypes378);
                    this_Template_4=ruleTemplate();

                    state._fsp--;

                     
                            current = this_Template_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:197:5: this_AnyText_5= ruleAnyText
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAnyText_in_ruleParagraphTypes405);
                    this_AnyText_5=ruleAnyText();

                    state._fsp--;

                     
                            current = this_AnyText_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:207:5: this_BlockQuote_6= ruleBlockQuote
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleBlockQuote_in_ruleParagraphTypes432);
                    this_BlockQuote_6=ruleBlockQuote();

                    state._fsp--;

                     
                            current = this_BlockQuote_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:217:5: this_Heading2_7= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleParagraphTypes459);
                    this_Heading2_7=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:227:5: this_Heading3_8= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleParagraphTypes486);
                    this_Heading3_8=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:237:5: this_Heading4_9= ruleHeading4
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleHeading4_in_ruleParagraphTypes513);
                    this_Heading4_9=ruleHeading4();

                    state._fsp--;

                     
                            current = this_Heading4_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:247:5: this_Heading5_10= ruleHeading5
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleHeading5_in_ruleParagraphTypes540);
                    this_Heading5_10=ruleHeading5();

                    state._fsp--;

                     
                            current = this_Heading5_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:257:5: this_Paragraph_11= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getParagraphTypesAccess().getParagraphParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleParagraphTypes567);
                    this_Paragraph_11=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_11; 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:273:1: entryRuleBlockQuote returns [EObject current=null] : iv_ruleBlockQuote= ruleBlockQuote EOF ;
    public final EObject entryRuleBlockQuote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockQuote = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:274:2: (iv_ruleBlockQuote= ruleBlockQuote EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:275:2: iv_ruleBlockQuote= ruleBlockQuote EOF
            {
             newCompositeNode(grammarAccess.getBlockQuoteRule()); 
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote602);
            iv_ruleBlockQuote=ruleBlockQuote();

            state._fsp--;

             current =iv_ruleBlockQuote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote612); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:282:1: ruleBlockQuote returns [EObject current=null] : ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' ) ;
    public final EObject ruleBlockQuote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_content_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:285:28: ( ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:286:1: ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:286:1: ( () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:286:2: () otherlv_1= '<blockquote>' ( (lv_content_2_0= ruleAnyTextSequence ) ) otherlv_3= '</blockquote>'
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:286:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:287:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleBlockQuote658); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:296:1: ( (lv_content_2_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:297:1: (lv_content_2_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:297:1: (lv_content_2_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:298:3: lv_content_2_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleBlockQuote679);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBlockQuote691); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:326:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:327:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:328:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate727);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate737); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:335:1: ruleTemplate returns [EObject current=null] : (this_AboutTemplate_0= ruleAboutTemplate | this_QuoteTemplate_1= ruleQuoteTemplate | this_MainTemplate_2= ruleMainTemplate ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        EObject this_AboutTemplate_0 = null;

        EObject this_QuoteTemplate_1 = null;

        EObject this_MainTemplate_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:338:28: ( (this_AboutTemplate_0= ruleAboutTemplate | this_QuoteTemplate_1= ruleQuoteTemplate | this_MainTemplate_2= ruleMainTemplate ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:339:1: (this_AboutTemplate_0= ruleAboutTemplate | this_QuoteTemplate_1= ruleQuoteTemplate | this_MainTemplate_2= ruleMainTemplate )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:339:1: (this_AboutTemplate_0= ruleAboutTemplate | this_QuoteTemplate_1= ruleQuoteTemplate | this_MainTemplate_2= ruleMainTemplate )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    alt3=3;
                    }
                    break;
                case 20:
                    {
                    alt3=2;
                    }
                    break;
                case 16:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:340:5: this_AboutTemplate_0= ruleAboutTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateAccess().getAboutTemplateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAboutTemplate_in_ruleTemplate784);
                    this_AboutTemplate_0=ruleAboutTemplate();

                    state._fsp--;

                     
                            current = this_AboutTemplate_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:350:5: this_QuoteTemplate_1= ruleQuoteTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateAccess().getQuoteTemplateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuoteTemplate_in_ruleTemplate811);
                    this_QuoteTemplate_1=ruleQuoteTemplate();

                    state._fsp--;

                     
                            current = this_QuoteTemplate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:360:5: this_MainTemplate_2= ruleMainTemplate
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateAccess().getMainTemplateParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMainTemplate_in_ruleTemplate838);
                    this_MainTemplate_2=ruleMainTemplate();

                    state._fsp--;

                     
                            current = this_MainTemplate_2; 
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleAboutTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:376:1: entryRuleAboutTemplate returns [EObject current=null] : iv_ruleAboutTemplate= ruleAboutTemplate EOF ;
    public final EObject entryRuleAboutTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAboutTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:377:2: (iv_ruleAboutTemplate= ruleAboutTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:378:2: iv_ruleAboutTemplate= ruleAboutTemplate EOF
            {
             newCompositeNode(grammarAccess.getAboutTemplateRule()); 
            pushFollow(FOLLOW_ruleAboutTemplate_in_entryRuleAboutTemplate873);
            iv_ruleAboutTemplate=ruleAboutTemplate();

            state._fsp--;

             current =iv_ruleAboutTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAboutTemplate883); 

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
    // $ANTLR end "entryRuleAboutTemplate"


    // $ANTLR start "ruleAboutTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:385:1: ruleAboutTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_type_1_0= 'about' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' ) ;
    public final EObject ruleAboutTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:388:28: ( (otherlv_0= '{{' ( (lv_type_1_0= 'about' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:389:1: (otherlv_0= '{{' ( (lv_type_1_0= 'about' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:389:1: (otherlv_0= '{{' ( (lv_type_1_0= 'about' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:389:3: otherlv_0= '{{' ( (lv_type_1_0= 'about' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAboutTemplate920); 

                	newLeafNode(otherlv_0, grammarAccess.getAboutTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:393:1: ( (lv_type_1_0= 'about' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:394:1: (lv_type_1_0= 'about' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:394:1: (lv_type_1_0= 'about' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:395:3: lv_type_1_0= 'about'
            {
            lv_type_1_0=(Token)match(input,16,FOLLOW_16_in_ruleAboutTemplate938); 

                    newLeafNode(lv_type_1_0, grammarAccess.getAboutTemplateAccess().getTypeAboutKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAboutTemplateRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "about");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:408:2: (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:408:4: otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAboutTemplate964); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAboutTemplateAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:412:1: ( (lv_content_3_0= ruleAnyTextSequence ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:413:1: (lv_content_3_0= ruleAnyTextSequence )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:413:1: (lv_content_3_0= ruleAnyTextSequence )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:414:3: lv_content_3_0= ruleAnyTextSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAboutTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleAboutTemplate985);
            	    lv_content_3_0=ruleAnyTextSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAboutTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AnyTextSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAboutTemplate999); 

                	newLeafNode(otherlv_4, grammarAccess.getAboutTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAboutTemplate"


    // $ANTLR start "entryRuleMainTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:442:1: entryRuleMainTemplate returns [EObject current=null] : iv_ruleMainTemplate= ruleMainTemplate EOF ;
    public final EObject entryRuleMainTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:443:2: (iv_ruleMainTemplate= ruleMainTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:444:2: iv_ruleMainTemplate= ruleMainTemplate EOF
            {
             newCompositeNode(grammarAccess.getMainTemplateRule()); 
            pushFollow(FOLLOW_ruleMainTemplate_in_entryRuleMainTemplate1035);
            iv_ruleMainTemplate=ruleMainTemplate();

            state._fsp--;

             current =iv_ruleMainTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainTemplate1045); 

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
    // $ANTLR end "entryRuleMainTemplate"


    // $ANTLR start "ruleMainTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:451:1: ruleMainTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_type_1_0= 'main' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' ) ;
    public final EObject ruleMainTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:454:28: ( (otherlv_0= '{{' ( (lv_type_1_0= 'main' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:1: (otherlv_0= '{{' ( (lv_type_1_0= 'main' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:1: (otherlv_0= '{{' ( (lv_type_1_0= 'main' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:455:3: otherlv_0= '{{' ( (lv_type_1_0= 'main' ) ) (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+ otherlv_4= '}}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMainTemplate1082); 

                	newLeafNode(otherlv_0, grammarAccess.getMainTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:459:1: ( (lv_type_1_0= 'main' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:460:1: (lv_type_1_0= 'main' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:460:1: (lv_type_1_0= 'main' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:461:3: lv_type_1_0= 'main'
            {
            lv_type_1_0=(Token)match(input,19,FOLLOW_19_in_ruleMainTemplate1100); 

                    newLeafNode(lv_type_1_0, grammarAccess.getMainTemplateAccess().getTypeMainKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMainTemplateRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "main");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:474:2: (otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:474:4: otherlv_2= '|' ( (lv_content_3_0= ruleAnyTextSequence ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleMainTemplate1126); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMainTemplateAccess().getVerticalLineKeyword_2_0());
            	        
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:478:1: ( (lv_content_3_0= ruleAnyTextSequence ) )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:479:1: (lv_content_3_0= ruleAnyTextSequence )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:479:1: (lv_content_3_0= ruleAnyTextSequence )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:480:3: lv_content_3_0= ruleAnyTextSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleMainTemplate1147);
            	    lv_content_3_0=ruleAnyTextSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_3_0, 
            	            		"AnyTextSequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleMainTemplate1161); 

                	newLeafNode(otherlv_4, grammarAccess.getMainTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleMainTemplate"


    // $ANTLR start "entryRuleQuoteTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:508:1: entryRuleQuoteTemplate returns [EObject current=null] : iv_ruleQuoteTemplate= ruleQuoteTemplate EOF ;
    public final EObject entryRuleQuoteTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuoteTemplate = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:509:2: (iv_ruleQuoteTemplate= ruleQuoteTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:510:2: iv_ruleQuoteTemplate= ruleQuoteTemplate EOF
            {
             newCompositeNode(grammarAccess.getQuoteTemplateRule()); 
            pushFollow(FOLLOW_ruleQuoteTemplate_in_entryRuleQuoteTemplate1197);
            iv_ruleQuoteTemplate=ruleQuoteTemplate();

            state._fsp--;

             current =iv_ruleQuoteTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuoteTemplate1207); 

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
    // $ANTLR end "entryRuleQuoteTemplate"


    // $ANTLR start "ruleQuoteTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:517:1: ruleQuoteTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_type_1_0= '\\'' ) ) otherlv_2= '}}' ) ;
    public final EObject ruleQuoteTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:520:28: ( (otherlv_0= '{{' ( (lv_type_1_0= '\\'' ) ) otherlv_2= '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:521:1: (otherlv_0= '{{' ( (lv_type_1_0= '\\'' ) ) otherlv_2= '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:521:1: (otherlv_0= '{{' ( (lv_type_1_0= '\\'' ) ) otherlv_2= '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:521:3: otherlv_0= '{{' ( (lv_type_1_0= '\\'' ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleQuoteTemplate1244); 

                	newLeafNode(otherlv_0, grammarAccess.getQuoteTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:525:1: ( (lv_type_1_0= '\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:526:1: (lv_type_1_0= '\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:526:1: (lv_type_1_0= '\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:527:3: lv_type_1_0= '\\''
            {
            lv_type_1_0=(Token)match(input,20,FOLLOW_20_in_ruleQuoteTemplate1262); 

                    newLeafNode(lv_type_1_0, grammarAccess.getQuoteTemplateAccess().getTypeApostropheKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuoteTemplateRule());
            	        }
                   		setWithLastConsumed(current, "type", lv_type_1_0, "\'");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleQuoteTemplate1287); 

                	newLeafNode(otherlv_2, grammarAccess.getQuoteTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleQuoteTemplate"


    // $ANTLR start "entryRuleOrderedList"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:552:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:553:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:554:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             newCompositeNode(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList1323);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList1333); 

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
    // $ANTLR end "entryRuleOrderedList"


    // $ANTLR start "ruleOrderedList"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:561:1: ruleOrderedList returns [EObject current=null] : ( ( (lv_items_0_0= ruleOrderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;

        EObject lv_end_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:564:28: ( ( ( (lv_items_0_0= ruleOrderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:1: ( ( (lv_items_0_0= ruleOrderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:1: ( ( (lv_items_0_0= ruleOrderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:2: ( (lv_items_0_0= ruleOrderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:565:2: ( (lv_items_0_0= ruleOrderListItem ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:566:1: (lv_items_0_0= ruleOrderListItem )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:566:1: (lv_items_0_0= ruleOrderListItem )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:567:3: lv_items_0_0= ruleOrderListItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrderedListAccess().getItemsOrderListItemParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrderListItem_in_ruleOrderedList1379);
            	    lv_items_0_0=ruleOrderListItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_0_0, 
            	            		"OrderListItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:583:3: ( (lv_end_1_0= ruleParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:584:1: (lv_end_1_0= ruleParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:584:1: (lv_end_1_0= ruleParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:585:3: lv_end_1_0= ruleParagraph
            {
             
            	        newCompositeNode(grammarAccess.getOrderedListAccess().getEndParagraphParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParagraph_in_ruleOrderedList1401);
            lv_end_1_0=ruleParagraph();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderedListRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_1_0, 
                    		"Paragraph");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleOrderedList"


    // $ANTLR start "entryRuleUnorderedList"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:609:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:610:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:611:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList1437);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList1447); 

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
    // $ANTLR end "entryRuleUnorderedList"


    // $ANTLR start "ruleUnorderedList"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:618:1: ruleUnorderedList returns [EObject current=null] : ( ( (lv_items_0_0= ruleUnorderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;

        EObject lv_end_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:621:28: ( ( ( (lv_items_0_0= ruleUnorderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:622:1: ( ( (lv_items_0_0= ruleUnorderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:622:1: ( ( (lv_items_0_0= ruleUnorderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:622:2: ( (lv_items_0_0= ruleUnorderListItem ) )+ ( (lv_end_1_0= ruleParagraph ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:622:2: ( (lv_items_0_0= ruleUnorderListItem ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:623:1: (lv_items_0_0= ruleUnorderListItem )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:623:1: (lv_items_0_0= ruleUnorderListItem )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:624:3: lv_items_0_0= ruleUnorderListItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnorderedListAccess().getItemsUnorderListItemParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnorderListItem_in_ruleUnorderedList1493);
            	    lv_items_0_0=ruleUnorderListItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnorderedListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_0_0, 
            	            		"UnorderListItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:640:3: ( (lv_end_1_0= ruleParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:641:1: (lv_end_1_0= ruleParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:641:1: (lv_end_1_0= ruleParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:642:3: lv_end_1_0= ruleParagraph
            {
             
            	        newCompositeNode(grammarAccess.getUnorderedListAccess().getEndParagraphParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParagraph_in_ruleUnorderedList1515);
            lv_end_1_0=ruleParagraph();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnorderedListRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_1_0, 
                    		"Paragraph");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleUnorderedList"


    // $ANTLR start "entryRuleUnorderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:666:1: entryRuleUnorderListItem returns [EObject current=null] : iv_ruleUnorderListItem= ruleUnorderListItem EOF ;
    public final EObject entryRuleUnorderListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderListItem = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:667:2: (iv_ruleUnorderListItem= ruleUnorderListItem EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:668:2: iv_ruleUnorderListItem= ruleUnorderListItem EOF
            {
             newCompositeNode(grammarAccess.getUnorderListItemRule()); 
            pushFollow(FOLLOW_ruleUnorderListItem_in_entryRuleUnorderListItem1551);
            iv_ruleUnorderListItem=ruleUnorderListItem();

            state._fsp--;

             current =iv_ruleUnorderListItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderListItem1561); 

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
    // $ANTLR end "entryRuleUnorderListItem"


    // $ANTLR start "ruleUnorderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:675:1: ruleUnorderListItem returns [EObject current=null] : ( ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) ) ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) ) ;
    public final EObject ruleUnorderListItem() throws RecognitionException {
        EObject current = null;

        Token lv_level_0_1=null;
        Token lv_level_0_2=null;
        EObject lv_itemtext_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:678:28: ( ( ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) ) ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:1: ( ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) ) ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:1: ( ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) ) ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:2: ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) ) ( (lv_itemtext_1_0= ruleAnyTextSequence ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:679:2: ( ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:680:1: ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:680:1: ( (lv_level_0_1= '*' | lv_level_0_2= '**' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:681:1: (lv_level_0_1= '*' | lv_level_0_2= '**' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:681:1: (lv_level_0_1= '*' | lv_level_0_2= '**' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:682:3: lv_level_0_1= '*'
                    {
                    lv_level_0_1=(Token)match(input,21,FOLLOW_21_in_ruleUnorderListItem1606); 

                            newLeafNode(lv_level_0_1, grammarAccess.getUnorderListItemAccess().getLevelAsteriskKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnorderListItemRule());
                    	        }
                           		setWithLastConsumed(current, "level", lv_level_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:694:8: lv_level_0_2= '**'
                    {
                    lv_level_0_2=(Token)match(input,22,FOLLOW_22_in_ruleUnorderListItem1635); 

                            newLeafNode(lv_level_0_2, grammarAccess.getUnorderListItemAccess().getLevelAsteriskAsteriskKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnorderListItemRule());
                    	        }
                           		setWithLastConsumed(current, "level", lv_level_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:709:2: ( (lv_itemtext_1_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:710:1: (lv_itemtext_1_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:710:1: (lv_itemtext_1_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:711:3: lv_itemtext_1_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getUnorderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleUnorderListItem1672);
            lv_itemtext_1_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnorderListItemRule());
            	        }
                   		set(
                   			current, 
                   			"itemtext",
                    		lv_itemtext_1_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleUnorderListItem"


    // $ANTLR start "entryRuleOrderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:735:1: entryRuleOrderListItem returns [EObject current=null] : iv_ruleOrderListItem= ruleOrderListItem EOF ;
    public final EObject entryRuleOrderListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderListItem = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:736:2: (iv_ruleOrderListItem= ruleOrderListItem EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:737:2: iv_ruleOrderListItem= ruleOrderListItem EOF
            {
             newCompositeNode(grammarAccess.getOrderListItemRule()); 
            pushFollow(FOLLOW_ruleOrderListItem_in_entryRuleOrderListItem1708);
            iv_ruleOrderListItem=ruleOrderListItem();

            state._fsp--;

             current =iv_ruleOrderListItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderListItem1718); 

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
    // $ANTLR end "entryRuleOrderListItem"


    // $ANTLR start "ruleOrderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:744:1: ruleOrderListItem returns [EObject current=null] : (otherlv_0= '#' ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) ) ;
    public final EObject ruleOrderListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_itemtext_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:747:28: ( (otherlv_0= '#' ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:748:1: (otherlv_0= '#' ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:748:1: (otherlv_0= '#' ( (lv_itemtext_1_0= ruleAnyTextSequence ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:748:3: otherlv_0= '#' ( (lv_itemtext_1_0= ruleAnyTextSequence ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleOrderListItem1755); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderListItemAccess().getNumberSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:752:1: ( (lv_itemtext_1_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (lv_itemtext_1_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:753:1: (lv_itemtext_1_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:754:3: lv_itemtext_1_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getOrderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleOrderListItem1776);
            lv_itemtext_1_0=ruleAnyTextSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderListItemRule());
            	        }
                   		set(
                   			current, 
                   			"itemtext",
                    		lv_itemtext_1_0, 
                    		"AnyTextSequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleOrderListItem"


    // $ANTLR start "entryRuleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:778:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:779:2: (iv_ruleImage= ruleImage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:780:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage1812);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage1822); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:787:1: ruleImage returns [EObject current=null] : (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= RULE_URL ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) ) (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        Enumerator lv_hAlign_6_0 = null;

        EObject lv_altText_8_0 = null;

        EObject lv_caption_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:790:28: ( (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= RULE_URL ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) ) (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:791:1: (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= RULE_URL ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) ) (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:791:1: (otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= RULE_URL ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) ) (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:791:3: otherlv_0= '[[' otherlv_1= 'File:' ( (lv_name_2_0= RULE_URL ) ) (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) ) (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )? (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )? otherlv_9= '|' ( (lv_caption_10_0= ruleAnyTextSequence ) ) otherlv_11= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleImage1859); 

                	newLeafNode(otherlv_0, grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleImage1871); 

                	newLeafNode(otherlv_1, grammarAccess.getImageAccess().getFileKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:799:1: ( (lv_name_2_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:800:1: (lv_name_2_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:800:1: (lv_name_2_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:801:3: lv_name_2_0= RULE_URL
            {
            lv_name_2_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleImage1888); 

            			newLeafNode(lv_name_2_0, grammarAccess.getImageAccess().getNameURLTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"URL");
            	    

            }


            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:817:2: (otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:817:4: otherlv_3= '|' ( (lv_type_4_0= ruleViewType ) )
            {
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleImage1906); 

                	newLeafNode(otherlv_3, grammarAccess.getImageAccess().getVerticalLineKeyword_3_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:821:1: ( (lv_type_4_0= ruleViewType ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:822:1: (lv_type_4_0= ruleViewType )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:822:1: (lv_type_4_0= ruleViewType )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:823:3: lv_type_4_0= ruleViewType
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleViewType_in_ruleImage1927);
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

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:839:3: (otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==41) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:839:5: otherlv_5= '|' ( (lv_hAlign_6_0= ruleHorizontalAlign ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleImage1941); 

                        	newLeafNode(otherlv_5, grammarAccess.getImageAccess().getVerticalLineKeyword_4_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:843:1: ( (lv_hAlign_6_0= ruleHorizontalAlign ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:844:1: (lv_hAlign_6_0= ruleHorizontalAlign )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:844:1: (lv_hAlign_6_0= ruleHorizontalAlign )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:845:3: lv_hAlign_6_0= ruleHorizontalAlign
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHorizontalAlign_in_ruleImage1962);
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

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:861:4: (otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:861:6: otherlv_7= '|alt=' ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) )
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleImage1977); 

                        	newLeafNode(otherlv_7, grammarAccess.getImageAccess().getAltKeyword_5_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:865:1: ( (lv_altText_8_0= ruleAbstractUnformattedInlineContent ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:866:1: (lv_altText_8_0= ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:866:1: (lv_altText_8_0= ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:867:3: lv_altText_8_0= ruleAbstractUnformattedInlineContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleImage1998);
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

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleImage2012); 

                	newLeafNode(otherlv_9, grammarAccess.getImageAccess().getVerticalLineKeyword_6());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:887:1: ( (lv_caption_10_0= ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:888:1: (lv_caption_10_0= ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:888:1: (lv_caption_10_0= ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:889:3: lv_caption_10_0= ruleAnyTextSequence
            {
             
            	        newCompositeNode(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAnyTextSequence_in_ruleImage2033);
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

            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleImage2045); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:917:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:918:2: (iv_ruleCategory= ruleCategory EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:919:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory2081);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory2091); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:926:1: ruleCategory returns [EObject current=null] : (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:929:28: ( (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:930:1: (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:930:1: (otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:930:3: otherlv_0= '[[' otherlv_1= 'Category:' ( (lv_name_2_0= ruleText ) ) ( (lv_value_3_0= '|*?' ) )? otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCategory2128); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCategory2140); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:938:1: ( (lv_name_2_0= ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:939:1: (lv_name_2_0= ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:939:1: (lv_name_2_0= ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:940:3: lv_name_2_0= ruleText
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleText_in_ruleCategory2161);
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

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:956:2: ( (lv_value_3_0= '|*?' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:957:1: (lv_value_3_0= '|*?' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:957:1: (lv_value_3_0= '|*?' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:958:3: lv_value_3_0= '|*?'
                    {
                    lv_value_3_0=(Token)match(input,29,FOLLOW_29_in_ruleCategory2179); 

                            newLeafNode(lv_value_3_0, grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_3_0, "|*?");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleCategory2205); 

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


    // $ANTLR start "entryRuleHeading2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:983:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:984:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:985:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading22241);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading22251); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:992:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue2_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:995:28: ( (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:996:1: (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:996:1: (otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:996:3: otherlv_0= '==' ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=='
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleHeading22288); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1000:1: ( (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1001:1: (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1001:1: (lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1002:3: lv_headingValue2_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading22309);
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

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleHeading22321); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1030:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1031:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1032:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading32357);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading32367); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1039:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue3_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1042:28: ( (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1043:1: (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1043:1: (otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1043:3: otherlv_0= '===' ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '==='
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleHeading32404); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1047:1: ( (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1048:1: (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1048:1: (lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1049:3: lv_headingValue3_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32425);
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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleHeading32437); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1077:1: entryRuleHeading4 returns [EObject current=null] : iv_ruleHeading4= ruleHeading4 EOF ;
    public final EObject entryRuleHeading4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading4 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1078:2: (iv_ruleHeading4= ruleHeading4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1079:2: iv_ruleHeading4= ruleHeading4 EOF
            {
             newCompositeNode(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading42473);
            iv_ruleHeading4=ruleHeading4();

            state._fsp--;

             current =iv_ruleHeading4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading42483); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1086:1: ruleHeading4 returns [EObject current=null] : (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' ) ;
    public final EObject ruleHeading4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue4_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1089:28: ( (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1090:1: (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1090:1: (otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1090:3: otherlv_0= '====' ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '===='
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleHeading42520); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1094:1: ( (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1095:1: (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1095:1: (lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1096:3: lv_headingValue4_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42541);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleHeading42553); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1124:1: entryRuleHeading5 returns [EObject current=null] : iv_ruleHeading5= ruleHeading5 EOF ;
    public final EObject entryRuleHeading5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading5 = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1125:2: (iv_ruleHeading5= ruleHeading5 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1126:2: iv_ruleHeading5= ruleHeading5 EOF
            {
             newCompositeNode(grammarAccess.getHeading5Rule()); 
            pushFollow(FOLLOW_ruleHeading5_in_entryRuleHeading52589);
            iv_ruleHeading5=ruleHeading5();

            state._fsp--;

             current =iv_ruleHeading5; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading52599); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1133:1: ruleHeading5 returns [EObject current=null] : (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' ) ;
    public final EObject ruleHeading5() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_headingValue5_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1136:28: ( (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1137:1: (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1137:1: (otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1137:3: otherlv_0= '=====' ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '====='
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleHeading52636); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1141:1: ( (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1142:1: (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1142:1: (lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1143:3: lv_headingValue5_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52657);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleHeading52669); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1171:1: entryRuleAbstractFormattedInlineContent returns [EObject current=null] : iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF ;
    public final EObject entryRuleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFormattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1172:2: (iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1173:2: iv_ruleAbstractFormattedInlineContent= ruleAbstractFormattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractFormattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2705);
            iv_ruleAbstractFormattedInlineContent=ruleAbstractFormattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractFormattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2715); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1180:1: ruleAbstractFormattedInlineContent returns [EObject current=null] : (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) ;
    public final EObject ruleAbstractFormattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Bold_0 = null;

        EObject this_Italic_1 = null;

        EObject this_ItalicBold_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1183:28: ( (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1184:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1184:1: (this_Bold_0= ruleBold | this_Italic_1= ruleItalic | this_ItalicBold_2= ruleItalicBold )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1185:5: this_Bold_0= ruleBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2762);
                    this_Bold_0=ruleBold();

                    state._fsp--;

                     
                            current = this_Bold_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1195:5: this_Italic_1= ruleItalic
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2789);
                    this_Italic_1=ruleItalic();

                    state._fsp--;

                     
                            current = this_Italic_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1205:5: this_ItalicBold_2= ruleItalicBold
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2816);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1221:1: entryRuleBold returns [EObject current=null] : iv_ruleBold= ruleBold EOF ;
    public final EObject entryRuleBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1222:2: (iv_ruleBold= ruleBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1223:2: iv_ruleBold= ruleBold EOF
            {
             newCompositeNode(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold2851);
            iv_ruleBold=ruleBold();

            state._fsp--;

             current =iv_ruleBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold2861); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1230:1: ruleBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1233:28: ( (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1234:1: (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1234:1: (otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1234:3: otherlv_0= '\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleBold2898); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1238:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1239:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1239:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1240:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2919);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleBold2931); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1268:1: entryRuleItalic returns [EObject current=null] : iv_ruleItalic= ruleItalic EOF ;
    public final EObject entryRuleItalic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalic = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1269:2: (iv_ruleItalic= ruleItalic EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1270:2: iv_ruleItalic= ruleItalic EOF
            {
             newCompositeNode(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic2967);
            iv_ruleItalic=ruleItalic();

            state._fsp--;

             current =iv_ruleItalic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic2977); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1277:1: ruleItalic returns [EObject current=null] : (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1280:28: ( (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1281:1: (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1281:1: (otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1281:3: otherlv_0= '\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleItalic3014); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1285:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1286:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1286:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1287:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic3035);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleItalic3047); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1315:1: entryRuleItalicBold returns [EObject current=null] : iv_ruleItalicBold= ruleItalicBold EOF ;
    public final EObject entryRuleItalicBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicBold = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1316:2: (iv_ruleItalicBold= ruleItalicBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1317:2: iv_ruleItalicBold= ruleItalicBold EOF
            {
             newCompositeNode(grammarAccess.getItalicBoldRule()); 
            pushFollow(FOLLOW_ruleItalicBold_in_entryRuleItalicBold3083);
            iv_ruleItalicBold=ruleItalicBold();

            state._fsp--;

             current =iv_ruleItalicBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBold3093); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1324:1: ruleItalicBold returns [EObject current=null] : (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) ;
    public final EObject ruleItalicBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1327:28: ( (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1328:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1328:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1328:3: otherlv_0= '\\'\\'\\'\\'\\'' ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) ) otherlv_2= '\\'\\'\\'\\'\\''
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleItalicBold3130); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1332:1: ( (lv_name_1_0= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1333:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1333:1: (lv_name_1_0= ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1334:3: lv_name_1_0= ruleAbstractUnformattedInlineContent
            {
             
            	        newCompositeNode(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold3151);
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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleItalicBold3163); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1362:1: entryRuleAbstractUnformattedInlineContent returns [EObject current=null] : iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF ;
    public final EObject entryRuleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractUnformattedInlineContent = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1363:2: (iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1364:2: iv_ruleAbstractUnformattedInlineContent= ruleAbstractUnformattedInlineContent EOF
            {
             newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent3199);
            iv_ruleAbstractUnformattedInlineContent=ruleAbstractUnformattedInlineContent();

            state._fsp--;

             current =iv_ruleAbstractUnformattedInlineContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent3209); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1371:1: ruleAbstractUnformattedInlineContent returns [EObject current=null] : (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) ;
    public final EObject ruleAbstractUnformattedInlineContent() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_HyperLink_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1374:28: ( (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1375:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1375:1: (this_Text_0= ruleText | this_HyperLink_1= ruleHyperLink )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==24||LA13_0==37) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1376:5: this_Text_0= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent3256);
                    this_Text_0=ruleText();

                    state._fsp--;

                     
                            current = this_Text_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1386:5: this_HyperLink_1= ruleHyperLink
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent3283);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1402:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1403:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1404:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText3318);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText3328); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1411:1: ruleText returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1414:28: ( ( (lv_name_0_0= ruleName ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1415:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1415:1: ( (lv_name_0_0= ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1416:1: (lv_name_0_0= ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1416:1: (lv_name_0_0= ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1417:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleText3373);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1441:1: entryRuleHyperLink returns [EObject current=null] : iv_ruleHyperLink= ruleHyperLink EOF ;
    public final EObject entryRuleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperLink = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1442:2: (iv_ruleHyperLink= ruleHyperLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1443:2: iv_ruleHyperLink= ruleHyperLink EOF
            {
             newCompositeNode(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_ruleHyperLink_in_entryRuleHyperLink3408);
            iv_ruleHyperLink=ruleHyperLink();

            state._fsp--;

             current =iv_ruleHyperLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperLink3418); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1450:1: ruleHyperLink returns [EObject current=null] : (this_Internal_0= ruleInternal | this_External_1= ruleExternal ) ;
    public final EObject ruleHyperLink() throws RecognitionException {
        EObject current = null;

        EObject this_Internal_0 = null;

        EObject this_External_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1453:28: ( (this_Internal_0= ruleInternal | this_External_1= ruleExternal ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1454:1: (this_Internal_0= ruleInternal | this_External_1= ruleExternal )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1454:1: (this_Internal_0= ruleInternal | this_External_1= ruleExternal )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1455:5: this_Internal_0= ruleInternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInternal_in_ruleHyperLink3465);
                    this_Internal_0=ruleInternal();

                    state._fsp--;

                     
                            current = this_Internal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1465:5: this_External_1= ruleExternal
                    {
                     
                            newCompositeNode(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExternal_in_ruleHyperLink3492);
                    this_External_1=ruleExternal();

                    state._fsp--;

                     
                            current = this_External_1; 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1481:1: entryRuleInternal returns [EObject current=null] : iv_ruleInternal= ruleInternal EOF ;
    public final EObject entryRuleInternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1482:2: (iv_ruleInternal= ruleInternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1483:2: iv_ruleInternal= ruleInternal EOF
            {
             newCompositeNode(grammarAccess.getInternalRule()); 
            pushFollow(FOLLOW_ruleInternal_in_entryRuleInternal3527);
            iv_ruleInternal=ruleInternal();

            state._fsp--;

             current =iv_ruleInternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternal3537); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1490:1: ruleInternal returns [EObject current=null] : ( () otherlv_1= '[[' ( ( ruleName ) )? (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )? (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )? otherlv_7= ']]' ) ;
    public final EObject ruleInternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_anchor_4_0 = null;

        EObject lv_altText_6_1 = null;

        EObject lv_altText_6_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1493:28: ( ( () otherlv_1= '[[' ( ( ruleName ) )? (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )? (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )? otherlv_7= ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1494:1: ( () otherlv_1= '[[' ( ( ruleName ) )? (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )? (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )? otherlv_7= ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1494:1: ( () otherlv_1= '[[' ( ( ruleName ) )? (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )? (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )? otherlv_7= ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1494:2: () otherlv_1= '[[' ( ( ruleName ) )? (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )? (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )? otherlv_7= ']]'
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1494:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1495:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInternalAccess().getInternalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleInternal3583); 

                	newLeafNode(otherlv_1, grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_1());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1504:1: ( ( ruleName ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1505:1: ( ruleName )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1505:1: ( ruleName )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1506:3: ruleName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInternalRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInternalAccess().getLinkWikiPageCrossReference_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleInternal3606);
                    ruleName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1519:3: (otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1519:5: otherlv_3= '#' ( (lv_anchor_4_0= ruleText ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleInternal3620); 

                        	newLeafNode(otherlv_3, grammarAccess.getInternalAccess().getNumberSignKeyword_3_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1523:1: ( (lv_anchor_4_0= ruleText ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1524:1: (lv_anchor_4_0= ruleText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1524:1: (lv_anchor_4_0= ruleText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1525:3: lv_anchor_4_0= ruleText
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalAccess().getAnchorTextParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleText_in_ruleInternal3641);
                    lv_anchor_4_0=ruleText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInternalRule());
                    	        }
                           		set(
                           			current, 
                           			"anchor",
                            		lv_anchor_4_0, 
                            		"Text");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1541:4: (otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1541:6: otherlv_5= '|' ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInternal3656); 

                        	newLeafNode(otherlv_5, grammarAccess.getInternalAccess().getVerticalLineKeyword_4_0());
                        
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1545:1: ( ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1546:1: ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1546:1: ( (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1547:1: (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1547:1: (lv_altText_6_1= ruleAbstractUnformattedInlineContent | lv_altText_6_2= ruleAbstractFormattedInlineContent )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID||LA17_0==24||LA17_0==37) ) {
                        alt17=1;
                    }
                    else if ( ((LA17_0>=34 && LA17_0<=36)) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1548:3: lv_altText_6_1= ruleAbstractUnformattedInlineContent
                            {
                             
                            	        newCompositeNode(grammarAccess.getInternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternal3679);
                            lv_altText_6_1=ruleAbstractUnformattedInlineContent();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInternalRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"altText",
                                    		lv_altText_6_1, 
                                    		"AbstractUnformattedInlineContent");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1563:8: lv_altText_6_2= ruleAbstractFormattedInlineContent
                            {
                             
                            	        newCompositeNode(grammarAccess.getInternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_4_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternal3698);
                            lv_altText_6_2=ruleAbstractFormattedInlineContent();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInternalRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"altText",
                                    		lv_altText_6_2, 
                                    		"AbstractFormattedInlineContent");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleInternal3715); 

                	newLeafNode(otherlv_7, grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1593:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1594:2: (iv_ruleExternal= ruleExternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1595:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_ruleExternal_in_entryRuleExternal3751);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternal3761); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1602:1: ruleExternal returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )? otherlv_3= ']' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_altText_2_1 = null;

        EObject lv_altText_2_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1605:28: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )? otherlv_3= ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1606:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )? otherlv_3= ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1606:1: (otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )? otherlv_3= ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1606:3: otherlv_0= '[' ( (lv_name_1_0= RULE_URL ) ) ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )? otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExternal3798); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0());
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1610:1: ( (lv_name_1_0= RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1611:1: (lv_name_1_0= RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1611:1: (lv_name_1_0= RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1612:3: lv_name_1_0= RULE_URL
            {
            lv_name_1_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleExternal3815); 

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

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1628:2: ( ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==24||(LA20_0>=34 && LA20_0<=37)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1629:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1629:1: ( (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1630:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1630:1: (lv_altText_2_1= ruleAbstractUnformattedInlineContent | lv_altText_2_2= ruleAbstractFormattedInlineContent )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID||LA19_0==24||LA19_0==37) ) {
                        alt19=1;
                    }
                    else if ( ((LA19_0>=34 && LA19_0<=36)) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1631:3: lv_altText_2_1= ruleAbstractUnformattedInlineContent
                            {
                             
                            	        newCompositeNode(grammarAccess.getExternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternal3843);
                            lv_altText_2_1=ruleAbstractUnformattedInlineContent();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExternalRule());
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
                            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1646:8: lv_altText_2_2= ruleAbstractFormattedInlineContent
                            {
                             
                            	        newCompositeNode(grammarAccess.getExternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternal3862);
                            lv_altText_2_2=ruleAbstractFormattedInlineContent();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExternalRule());
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
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleExternal3878); 

                	newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1676:1: entryRuleAnyTextSequence returns [EObject current=null] : iv_ruleAnyTextSequence= ruleAnyTextSequence EOF ;
    public final EObject entryRuleAnyTextSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyTextSequence = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1677:2: (iv_ruleAnyTextSequence= ruleAnyTextSequence EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1678:2: iv_ruleAnyTextSequence= ruleAnyTextSequence EOF
            {
             newCompositeNode(grammarAccess.getAnyTextSequenceRule()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence3914);
            iv_ruleAnyTextSequence=ruleAnyTextSequence();

            state._fsp--;

             current =iv_ruleAnyTextSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyTextSequence3924); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1685:1: ruleAnyTextSequence returns [EObject current=null] : ( () ( (lv_content_1_0= ruleAnyText ) )* ) ;
    public final EObject ruleAnyTextSequence() throws RecognitionException {
        EObject current = null;

        EObject lv_content_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1688:28: ( ( () ( (lv_content_1_0= ruleAnyText ) )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1689:1: ( () ( (lv_content_1_0= ruleAnyText ) )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1689:1: ( () ( (lv_content_1_0= ruleAnyText ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1689:2: () ( (lv_content_1_0= ruleAnyText ) )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1689:2: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1690:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0(),
                        current);
                

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1695:2: ( (lv_content_1_0= ruleAnyText ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==24||(LA21_0>=34 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1696:1: (lv_content_1_0= ruleAnyText )
            	    {
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1696:1: (lv_content_1_0= ruleAnyText )
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1697:3: lv_content_1_0= ruleAnyText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnyText_in_ruleAnyTextSequence3979);
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
            	    break loop21;
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1721:1: entryRuleAnyText returns [EObject current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final EObject entryRuleAnyText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnyText = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1722:2: (iv_ruleAnyText= ruleAnyText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1723:2: iv_ruleAnyText= ruleAnyText EOF
            {
             newCompositeNode(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText4016);
            iv_ruleAnyText=ruleAnyText();

            state._fsp--;

             current =iv_ruleAnyText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText4026); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1730:1: ruleAnyText returns [EObject current=null] : (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent ) ;
    public final EObject ruleAnyText() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractFormattedInlineContent_0 = null;

        EObject this_AbstractUnformattedInlineContent_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1733:28: ( (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1734:1: (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1734:1: (this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent | this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=34 && LA22_0<=36)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID||LA22_0==24||LA22_0==37) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1735:5: this_AbstractFormattedInlineContent_0= ruleAbstractFormattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_ruleAnyText4073);
                    this_AbstractFormattedInlineContent_0=ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     
                            current = this_AbstractFormattedInlineContent_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1745:5: this_AbstractUnformattedInlineContent_1= ruleAbstractUnformattedInlineContent
                    {
                     
                            newCompositeNode(grammarAccess.getAnyTextAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleAnyText4100);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1761:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1762:2: (iv_ruleName= ruleName EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1763:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName4136);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName4147); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1770:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1773:28: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1774:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1774:1: (this_ID_0= RULE_ID (this_ID_1= RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1774:6: this_ID_0= RULE_ID (this_ID_1= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName4187); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1781:1: (this_ID_1= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1781:6: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName4208); 

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


    // $ANTLR start "entryRuleParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1796:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1797:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1798:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph4255);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph4265); 

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1805:1: ruleParagraph returns [EObject current=null] : ( (lv_paragraph_0_0= '\\r\\n\\r\\n' ) ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token lv_paragraph_0_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1808:28: ( ( (lv_paragraph_0_0= '\\r\\n\\r\\n' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1809:1: ( (lv_paragraph_0_0= '\\r\\n\\r\\n' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1809:1: ( (lv_paragraph_0_0= '\\r\\n\\r\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1810:1: (lv_paragraph_0_0= '\\r\\n\\r\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1810:1: (lv_paragraph_0_0= '\\r\\n\\r\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1811:3: lv_paragraph_0_0= '\\r\\n\\r\\n'
            {
            lv_paragraph_0_0=(Token)match(input,39,FOLLOW_39_in_ruleParagraph4307); 

                    newLeafNode(lv_paragraph_0_0, grammarAccess.getParagraphAccess().getParagraphControl000dControl000aControl000dControl000aKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParagraphRule());
            	        }
                   		setWithLastConsumed(current, "paragraph", lv_paragraph_0_0, "\r\n\r\n");
            	    

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "ruleViewType"
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1832:1: ruleViewType returns [Enumerator current=null] : (enumLiteral_0= 'thumb' ) ;
    public final Enumerator ruleViewType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1834:28: ( (enumLiteral_0= 'thumb' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1835:1: (enumLiteral_0= 'thumb' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1835:1: (enumLiteral_0= 'thumb' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1835:3: enumLiteral_0= 'thumb'
            {
            enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleViewType4368); 

                    current = grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration()); 
                

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1845:1: ruleHorizontalAlign returns [Enumerator current=null] : (enumLiteral_0= 'right' ) ;
    public final Enumerator ruleHorizontalAlign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1847:28: ( (enumLiteral_0= 'right' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1848:1: (enumLiteral_0= 'right' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1848:1: (enumLiteral_0= 'right' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1848:3: enumLiteral_0= 'right'
            {
            enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleHorizontalAlign4411); 

                    current = grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration()); 
                

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
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\5\2\uffff\1\5\12\uffff";
    static final String DFA2_maxS =
        "\1\47\2\uffff\1\34\12\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\4\1\3";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\5\7\uffff\1\6\1\uffff\1\4\5\uffff\2\2\1\1\1\3\5\uffff\1"+
            "\7\1\10\1\11\1\12\4\5\1\uffff\1\13",
            "",
            "",
            "\1\5\13\uffff\1\5\5\uffff\1\5\1\uffff\1\15\1\uffff\1\5\1\14",
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
            return "146:1: (this_OrderedList_0= ruleOrderedList | this_UnorderedList_1= ruleUnorderedList | this_Image_2= ruleImage | this_Category_3= ruleCategory | this_Template_4= ruleTemplate | this_AnyText_5= ruleAnyText | this_BlockQuote_6= ruleBlockQuote | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Heading4_9= ruleHeading4 | this_Heading5_10= ruleHeading5 | this_Paragraph_11= ruleParagraph )";
        }
    }
 

    public static final BitSet FOLLOW_ruleWikiPage_in_entryRuleWikiPage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWikiPage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleWikiPage122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleName_in_ruleWikiPage143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleWikiPage155 = new BitSet(new long[]{0x000000BFC1E0A022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_ruleWikiPage176 = new BitSet(new long[]{0x000000BFC1E0A022L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphTypes223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleParagraphTypes270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleParagraphTypes297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_ruleParagraphTypes324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleParagraphTypes351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleParagraphTypes378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleParagraphTypes405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_ruleParagraphTypes432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleParagraphTypes459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleParagraphTypes486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_ruleParagraphTypes513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_ruleParagraphTypes540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleParagraphTypes567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleBlockQuote658 = new BitSet(new long[]{0x0000003C01004020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleBlockQuote679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBlockQuote691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAboutTemplate_in_ruleTemplate784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuoteTemplate_in_ruleTemplate811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainTemplate_in_ruleTemplate838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAboutTemplate_in_entryRuleAboutTemplate873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAboutTemplate883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAboutTemplate920 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAboutTemplate938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAboutTemplate964 = new BitSet(new long[]{0x0000003C01060020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleAboutTemplate985 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleAboutTemplate999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainTemplate_in_entryRuleMainTemplate1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainTemplate1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMainTemplate1082 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMainTemplate1100 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMainTemplate1126 = new BitSet(new long[]{0x0000003C01060020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleMainTemplate1147 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleMainTemplate1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuoteTemplate_in_entryRuleQuoteTemplate1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuoteTemplate1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleQuoteTemplate1244 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuoteTemplate1262 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuoteTemplate1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItem_in_ruleOrderedList1379 = new BitSet(new long[]{0x000000BFC1E0A020L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleOrderedList1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderListItem_in_ruleUnorderedList1493 = new BitSet(new long[]{0x000000BFC1E0A020L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleUnorderedList1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderListItem_in_entryRuleUnorderListItem1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderListItem1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUnorderListItem1606 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_22_in_ruleUnorderListItem1635 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleUnorderListItem1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItem_in_entryRuleOrderListItem1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderListItem1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOrderListItem1755 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleOrderListItem1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImage1859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleImage1871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleImage1888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImage1906 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleViewType_in_ruleImage1927 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17_in_ruleImage1941 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleHorizontalAlign_in_ruleImage1962 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_26_in_ruleImage1977 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleImage1998 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImage2012 = new BitSet(new long[]{0x0000003C09000020L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_ruleImage2033 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleImage2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCategory2128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCategory2140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleCategory2161 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleCategory2179 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCategory2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading22241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading22251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleHeading22288 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading22309 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleHeading22321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading32357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading32367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHeading32404 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading32425 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleHeading32437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading42473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading42483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleHeading42520 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading42541 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleHeading42553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_entryRuleHeading52589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading52599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHeading52636 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleHeading52657 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleHeading52669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent2705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_ruleAbstractFormattedInlineContent2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleAbstractFormattedInlineContent2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_ruleAbstractFormattedInlineContent2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold2851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBold2898 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleBold2919 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBold2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic2967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleItalic3014 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalic3035 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleItalic3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_entryRuleItalicBold3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBold3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleItalicBold3130 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleItalicBold3151 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleItalicBold3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_ruleAbstractUnformattedInlineContent3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_ruleAbstractUnformattedInlineContent3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleText3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_entryRuleHyperLink3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperLink3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_ruleHyperLink3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_ruleHyperLink3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_entryRuleInternal3527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternal3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInternal3583 = new BitSet(new long[]{0x0000000008820020L});
    public static final BitSet FOLLOW_ruleName_in_ruleInternal3606 = new BitSet(new long[]{0x0000000008820000L});
    public static final BitSet FOLLOW_23_in_ruleInternal3620 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleText_in_ruleInternal3641 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_17_in_ruleInternal3656 = new BitSet(new long[]{0x0000003C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleInternal3679 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleInternal3698 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInternal3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_entryRuleExternal3751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternal3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExternal3798 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleExternal3815 = new BitSet(new long[]{0x0000007C01000020L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleExternal3843 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleExternal3862 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExternal3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence3914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyTextSequence3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_ruleAnyTextSequence3979 = new BitSet(new long[]{0x0000003C01000022L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_ruleAnyText4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_ruleAnyText4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName4136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName4187 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName4208 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph4255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleParagraph4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleViewType4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHorizontalAlign4411 = new BitSet(new long[]{0x0000000000000002L});

}