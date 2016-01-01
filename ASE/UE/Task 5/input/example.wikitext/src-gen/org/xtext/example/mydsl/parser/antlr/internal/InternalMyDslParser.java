package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WIKI_COMMENT", "RULE_CUSTOM_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'=='", "'==='", "'===='", "'#'", "'*'", "'\\'\\''", "'\\'\\'\\''", "'\\'\\'\\'\\'\\''", "'<blockquote>'", "'</blockquote>'", "'['", "' '", "']'", "'[['", "'|'", "']]'", "'[[File:'", "'|thumb'", "'|frame'", "'|frameless'", "'[[Category:'", "'|*'", "'{{'", "'}}'", "'about|'", "'|and|'", "'main|'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_CUSTOM_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_WIKI_COMMENT=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleDocument= ruleDocument EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument75);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument85); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleDocument returns [EObject current=null] : ( ( (lv_title_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ( (lv_categories_2_0= ruleCategory ) )* ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_title_0_0 = null;

        EObject lv_elements_1_0 = null;

        EObject lv_categories_2_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_title_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ( (lv_categories_2_0= ruleCategory ) )* ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_title_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ( (lv_categories_2_0= ruleCategory ) )* )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_title_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ( (lv_categories_2_0= ruleCategory ) )* )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_title_0_0= ruleHeading1 ) ) ( (lv_elements_1_0= ruleAbstractElement ) )* ( (lv_categories_2_0= ruleCategory ) )*
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_title_0_0= ruleHeading1 ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_title_0_0= ruleHeading1 )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_title_0_0= ruleHeading1 )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_title_0_0= ruleHeading1
            {
             
            	        newCompositeNode(grammarAccess.getDocumentAccess().getTitleHeading1ParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeading1_in_ruleDocument131);
            lv_title_0_0=ruleHeading1();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_0_0, 
                    		"Heading1");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_WIKI_COMMENT && LA1_0<=RULE_CUSTOM_STRING)||(LA1_0>=14 && LA1_0<=22)||LA1_0==24||LA1_0==27||LA1_0==30||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_elements_1_0= ruleAbstractElement )
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDocument152);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:3: ( (lv_categories_2_0= ruleCategory ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_categories_2_0= ruleCategory )
            	    {
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_categories_2_0= ruleCategory )
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:3: lv_categories_2_0= ruleCategory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDocumentAccess().getCategoriesCategoryParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCategory_in_ruleDocument174);
            	    lv_categories_2_0=ruleCategory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"categories",
            	            		lv_categories_2_0, 
            	            		"Category");
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleComment"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:2: (iv_ruleComment= ruleComment EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment211);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment221); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_WIKI_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:28: ( ( (lv_comment_0_0= RULE_WIKI_COMMENT ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:1: ( (lv_comment_0_0= RULE_WIKI_COMMENT ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:1: ( (lv_comment_0_0= RULE_WIKI_COMMENT ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_comment_0_0= RULE_WIKI_COMMENT )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:1: (lv_comment_0_0= RULE_WIKI_COMMENT )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:157:3: lv_comment_0_0= RULE_WIKI_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_WIKI_COMMENT,FOLLOW_RULE_WIKI_COMMENT_in_ruleComment262); 

            			newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentWIKI_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comment",
                    		lv_comment_0_0, 
                    		"WIKI_COMMENT");
            	    

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleUnformattedText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:181:1: entryRuleUnformattedText returns [EObject current=null] : iv_ruleUnformattedText= ruleUnformattedText EOF ;
    public final EObject entryRuleUnformattedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnformattedText = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:182:2: (iv_ruleUnformattedText= ruleUnformattedText EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:2: iv_ruleUnformattedText= ruleUnformattedText EOF
            {
             newCompositeNode(grammarAccess.getUnformattedTextRule()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_entryRuleUnformattedText302);
            iv_ruleUnformattedText=ruleUnformattedText();

            state._fsp--;

             current =iv_ruleUnformattedText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnformattedText312); 

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
    // $ANTLR end "entryRuleUnformattedText"


    // $ANTLR start "ruleUnformattedText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:190:1: ruleUnformattedText returns [EObject current=null] : ( (lv_text_0_0= RULE_CUSTOM_STRING ) ) ;
    public final EObject ruleUnformattedText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:193:28: ( ( (lv_text_0_0= RULE_CUSTOM_STRING ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:1: ( (lv_text_0_0= RULE_CUSTOM_STRING ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:1: ( (lv_text_0_0= RULE_CUSTOM_STRING ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:1: (lv_text_0_0= RULE_CUSTOM_STRING )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:195:1: (lv_text_0_0= RULE_CUSTOM_STRING )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:196:3: lv_text_0_0= RULE_CUSTOM_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_CUSTOM_STRING,FOLLOW_RULE_CUSTOM_STRING_in_ruleUnformattedText353); 

            			newLeafNode(lv_text_0_0, grammarAccess.getUnformattedTextAccess().getTextCUSTOM_STRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnformattedTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"CUSTOM_STRING");
            	    

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
    // $ANTLR end "ruleUnformattedText"


    // $ANTLR start "entryRuleFormattedText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:1: entryRuleFormattedText returns [EObject current=null] : iv_ruleFormattedText= ruleFormattedText EOF ;
    public final EObject entryRuleFormattedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormattedText = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:2: (iv_ruleFormattedText= ruleFormattedText EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:2: iv_ruleFormattedText= ruleFormattedText EOF
            {
             newCompositeNode(grammarAccess.getFormattedTextRule()); 
            pushFollow(FOLLOW_ruleFormattedText_in_entryRuleFormattedText393);
            iv_ruleFormattedText=ruleFormattedText();

            state._fsp--;

             current =iv_ruleFormattedText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedText403); 

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
    // $ANTLR end "entryRuleFormattedText"


    // $ANTLR start "ruleFormattedText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:229:1: ruleFormattedText returns [EObject current=null] : ( ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) ) ) ;
    public final EObject ruleFormattedText() throws RecognitionException {
        EObject current = null;

        EObject lv_formattedText_0_1 = null;

        EObject lv_formattedText_0_2 = null;

        EObject lv_formattedText_0_3 = null;

        EObject lv_formattedText_0_4 = null;

        EObject lv_formattedText_0_5 = null;

        EObject lv_formattedText_0_6 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:232:28: ( ( ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ( ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:233:1: ( ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:1: ( (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_formattedText_0_1= ruleItalicText | lv_formattedText_0_2= ruleBoldText | lv_formattedText_0_3= ruleItalicBoldText | lv_formattedText_0_4= ruleInternalLink | lv_formattedText_0_5= ruleExternalLink | lv_formattedText_0_6= ruleUnformattedText )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:3: lv_formattedText_0_1= ruleItalicText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextItalicTextParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleItalicText_in_ruleFormattedText450);
                    lv_formattedText_0_1=ruleItalicText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_1, 
                            		"ItalicText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:251:8: lv_formattedText_0_2= ruleBoldText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextBoldTextParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleBoldText_in_ruleFormattedText469);
                    lv_formattedText_0_2=ruleBoldText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_2, 
                            		"BoldText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:8: lv_formattedText_0_3= ruleItalicBoldText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextItalicBoldTextParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleItalicBoldText_in_ruleFormattedText488);
                    lv_formattedText_0_3=ruleItalicBoldText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_3, 
                            		"ItalicBoldText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:281:8: lv_formattedText_0_4= ruleInternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextInternalLinkParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleInternalLink_in_ruleFormattedText507);
                    lv_formattedText_0_4=ruleInternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_4, 
                            		"InternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 5 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:296:8: lv_formattedText_0_5= ruleExternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextExternalLinkParserRuleCall_0_4()); 
                    	    
                    pushFollow(FOLLOW_ruleExternalLink_in_ruleFormattedText526);
                    lv_formattedText_0_5=ruleExternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_5, 
                            		"ExternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 6 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:311:8: lv_formattedText_0_6= ruleUnformattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextAccess().getFormattedTextUnformattedTextParserRuleCall_0_5()); 
                    	    
                    pushFollow(FOLLOW_ruleUnformattedText_in_ruleFormattedText545);
                    lv_formattedText_0_6=ruleUnformattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedText",
                            		lv_formattedText_0_6, 
                            		"UnformattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleFormattedText"


    // $ANTLR start "entryRuleFormattedTextWithoutLinks"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:337:1: entryRuleFormattedTextWithoutLinks returns [EObject current=null] : iv_ruleFormattedTextWithoutLinks= ruleFormattedTextWithoutLinks EOF ;
    public final EObject entryRuleFormattedTextWithoutLinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormattedTextWithoutLinks = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: (iv_ruleFormattedTextWithoutLinks= ruleFormattedTextWithoutLinks EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:2: iv_ruleFormattedTextWithoutLinks= ruleFormattedTextWithoutLinks EOF
            {
             newCompositeNode(grammarAccess.getFormattedTextWithoutLinksRule()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_entryRuleFormattedTextWithoutLinks583);
            iv_ruleFormattedTextWithoutLinks=ruleFormattedTextWithoutLinks();

            state._fsp--;

             current =iv_ruleFormattedTextWithoutLinks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedTextWithoutLinks593); 

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
    // $ANTLR end "entryRuleFormattedTextWithoutLinks"


    // $ANTLR start "ruleFormattedTextWithoutLinks"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: ruleFormattedTextWithoutLinks returns [EObject current=null] : ( ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) ) ) ;
    public final EObject ruleFormattedTextWithoutLinks() throws RecognitionException {
        EObject current = null;

        EObject lv_formattedTextWithoutLinks_0_1 = null;

        EObject lv_formattedTextWithoutLinks_0_2 = null;

        EObject lv_formattedTextWithoutLinks_0_3 = null;

        EObject lv_formattedTextWithoutLinks_0_4 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:349:28: ( ( ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: ( ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:1: ( ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: ( (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:1: (lv_formattedTextWithoutLinks_0_1= ruleItalicText | lv_formattedTextWithoutLinks_0_2= ruleBoldText | lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText | lv_formattedTextWithoutLinks_0_4= ruleUnformattedText )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case RULE_CUSTOM_STRING:
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
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:353:3: lv_formattedTextWithoutLinks_0_1= ruleItalicText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicTextParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleItalicText_in_ruleFormattedTextWithoutLinks640);
                    lv_formattedTextWithoutLinks_0_1=ruleItalicText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextWithoutLinksRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedTextWithoutLinks",
                            		lv_formattedTextWithoutLinks_0_1, 
                            		"ItalicText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:8: lv_formattedTextWithoutLinks_0_2= ruleBoldText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksBoldTextParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleBoldText_in_ruleFormattedTextWithoutLinks659);
                    lv_formattedTextWithoutLinks_0_2=ruleBoldText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextWithoutLinksRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedTextWithoutLinks",
                            		lv_formattedTextWithoutLinks_0_2, 
                            		"BoldText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:383:8: lv_formattedTextWithoutLinks_0_3= ruleItalicBoldText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicBoldTextParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleItalicBoldText_in_ruleFormattedTextWithoutLinks678);
                    lv_formattedTextWithoutLinks_0_3=ruleItalicBoldText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextWithoutLinksRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedTextWithoutLinks",
                            		lv_formattedTextWithoutLinks_0_3, 
                            		"ItalicBoldText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:8: lv_formattedTextWithoutLinks_0_4= ruleUnformattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksUnformattedTextParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleUnformattedText_in_ruleFormattedTextWithoutLinks697);
                    lv_formattedTextWithoutLinks_0_4=ruleUnformattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormattedTextWithoutLinksRule());
                    	        }
                           		set(
                           			current, 
                           			"formattedTextWithoutLinks",
                            		lv_formattedTextWithoutLinks_0_4, 
                            		"UnformattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleFormattedTextWithoutLinks"


    // $ANTLR start "entryRuleAbstractElement"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:426:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement735);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement745); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:433:1: ruleAbstractElement returns [EObject current=null] : ( ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_1 = null;

        EObject lv_element_0_2 = null;

        EObject lv_element_0_3 = null;

        EObject lv_element_0_4 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:436:28: ( ( ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ( ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_element_0_1= ruleTemplate | lv_element_0_2= ruleHeading | lv_element_0_3= ruleTextElement | lv_element_0_4= ruleComment )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt5=2;
                }
                break;
            case RULE_CUSTOM_STRING:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
            case 30:
                {
                alt5=3;
                }
                break;
            case RULE_WIKI_COMMENT:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:440:3: lv_element_0_1= ruleTemplate
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractElementAccess().getElementTemplateParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplate_in_ruleAbstractElement792);
                    lv_element_0_1=ruleTemplate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_1, 
                            		"Template");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:455:8: lv_element_0_2= ruleHeading
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractElementAccess().getElementHeadingParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleHeading_in_ruleAbstractElement811);
                    lv_element_0_2=ruleHeading();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_2, 
                            		"Heading");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:8: lv_element_0_3= ruleTextElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractElementAccess().getElementTextElementParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleTextElement_in_ruleAbstractElement830);
                    lv_element_0_3=ruleTextElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_3, 
                            		"TextElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:485:8: lv_element_0_4= ruleComment
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractElementAccess().getElementCommentParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleComment_in_ruleAbstractElement849);
                    lv_element_0_4=ruleComment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_4, 
                            		"Comment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleTextElement"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:1: entryRuleTextElement returns [EObject current=null] : iv_ruleTextElement= ruleTextElement EOF ;
    public final EObject entryRuleTextElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextElement = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:512:2: (iv_ruleTextElement= ruleTextElement EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:513:2: iv_ruleTextElement= ruleTextElement EOF
            {
             newCompositeNode(grammarAccess.getTextElementRule()); 
            pushFollow(FOLLOW_ruleTextElement_in_entryRuleTextElement887);
            iv_ruleTextElement=ruleTextElement();

            state._fsp--;

             current =iv_ruleTextElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextElement897); 

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
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:520:1: ruleTextElement returns [EObject current=null] : ( ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) ) ) ;
    public final EObject ruleTextElement() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_1 = null;

        EObject lv_element_0_2 = null;

        EObject lv_element_0_3 = null;

        EObject lv_element_0_4 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:28: ( ( ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: ( ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: ( ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:1: ( (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:526:1: (lv_element_0_1= ruleBlockQuote | lv_element_0_2= ruleFile | lv_element_0_3= ruleList | lv_element_0_4= ruleFormattedText )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 17:
            case 18:
                {
                alt6=3;
                }
                break;
            case RULE_CUSTOM_STRING:
            case 19:
            case 20:
            case 21:
            case 24:
            case 27:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:527:3: lv_element_0_1= ruleBlockQuote
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextElementAccess().getElementBlockQuoteParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlockQuote_in_ruleTextElement944);
                    lv_element_0_1=ruleBlockQuote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_1, 
                            		"BlockQuote");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:542:8: lv_element_0_2= ruleFile
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextElementAccess().getElementFileParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFile_in_ruleTextElement963);
                    lv_element_0_2=ruleFile();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_2, 
                            		"File");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:8: lv_element_0_3= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextElementAccess().getElementListParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleTextElement982);
                    lv_element_0_3=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_3, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 4 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:572:8: lv_element_0_4= ruleFormattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextElementAccess().getElementFormattedTextParserRuleCall_0_3()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedText_in_ruleTextElement1001);
                    lv_element_0_4=ruleFormattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextElementRule());
                    	        }
                           		set(
                           			current, 
                           			"element",
                            		lv_element_0_4, 
                            		"FormattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleHeading"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: entryRuleHeading returns [EObject current=null] : iv_ruleHeading= ruleHeading EOF ;
    public final EObject entryRuleHeading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:599:2: (iv_ruleHeading= ruleHeading EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:600:2: iv_ruleHeading= ruleHeading EOF
            {
             newCompositeNode(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_ruleHeading_in_entryRuleHeading1039);
            iv_ruleHeading=ruleHeading();

            state._fsp--;

             current =iv_ruleHeading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading1049); 

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
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:607:1: ruleHeading returns [EObject current=null] : ( ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) ) ) ;
    public final EObject ruleHeading() throws RecognitionException {
        EObject current = null;

        EObject lv_heading_0_1 = null;

        EObject lv_heading_0_2 = null;

        EObject lv_heading_0_3 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:28: ( ( ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: ( ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:1: ( ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:1: ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:1: ( (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_heading_0_1= ruleHeading2 | lv_heading_0_2= ruleHeading3 | lv_heading_0_3= ruleHeading4 )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
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
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:614:3: lv_heading_0_1= ruleHeading2
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadingAccess().getHeadingHeading2ParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHeading2_in_ruleHeading1096);
                    lv_heading_0_1=ruleHeading2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadingRule());
                    	        }
                           		set(
                           			current, 
                           			"heading",
                            		lv_heading_0_1, 
                            		"Heading2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:629:8: lv_heading_0_2= ruleHeading3
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadingAccess().getHeadingHeading3ParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleHeading3_in_ruleHeading1115);
                    lv_heading_0_2=ruleHeading3();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadingRule());
                    	        }
                           		set(
                           			current, 
                           			"heading",
                            		lv_heading_0_2, 
                            		"Heading3");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:644:8: lv_heading_0_3= ruleHeading4
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeadingAccess().getHeadingHeading4ParserRuleCall_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleHeading4_in_ruleHeading1134);
                    lv_heading_0_3=ruleHeading4();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeadingRule());
                    	        }
                           		set(
                           			current, 
                           			"heading",
                            		lv_heading_0_3, 
                            		"Heading4");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleHeading1"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:1: entryRuleHeading1 returns [EObject current=null] : iv_ruleHeading1= ruleHeading1 EOF ;
    public final EObject entryRuleHeading1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading1 = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:2: (iv_ruleHeading1= ruleHeading1 EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:2: iv_ruleHeading1= ruleHeading1 EOF
            {
             newCompositeNode(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading11172);
            iv_ruleHeading1=ruleHeading1();

            state._fsp--;

             current =iv_ruleHeading1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading11182); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:679:1: ruleHeading1 returns [EObject current=null] : (otherlv_0= '=' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '=' ) ;
    public final EObject ruleHeading1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:28: ( (otherlv_0= '=' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '=' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_0= '=' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '=' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_0= '=' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '=' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:3: otherlv_0= '=' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '='
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHeading11219); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading1Access().getEqualsSignKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: ( (lv_heading_1_0= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:1: (lv_heading_1_0= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:688:1: (lv_heading_1_0= ruleFormattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:689:3: lv_heading_1_0= ruleFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getHeading1Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFormattedText_in_ruleHeading11240);
            lv_heading_1_0=ruleFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading1Rule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"FormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleHeading11252); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:717:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading21288);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading21298); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:726:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= '==' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '==' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:28: ( (otherlv_0= '==' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '==' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:1: (otherlv_0= '==' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '==' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:1: (otherlv_0= '==' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '==' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:3: otherlv_0= '==' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '=='
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleHeading21335); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:734:1: ( (lv_heading_1_0= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: (lv_heading_1_0= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:1: (lv_heading_1_0= ruleFormattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:3: lv_heading_1_0= ruleFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getHeading2Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFormattedText_in_ruleHeading21356);
            lv_heading_1_0=ruleFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading2Rule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"FormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHeading21368); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:764:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:765:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:766:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading31404);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading31414); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:773:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= '===' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '===' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:776:28: ( (otherlv_0= '===' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '===' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:1: (otherlv_0= '===' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '===' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:1: (otherlv_0= '===' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '===' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:777:3: otherlv_0= '===' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '==='
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleHeading31451); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:781:1: ( (lv_heading_1_0= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_heading_1_0= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: (lv_heading_1_0= ruleFormattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:3: lv_heading_1_0= ruleFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getHeading3Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFormattedText_in_ruleHeading31472);
            lv_heading_1_0=ruleFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading3Rule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"FormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleHeading31484); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:811:1: entryRuleHeading4 returns [EObject current=null] : iv_ruleHeading4= ruleHeading4 EOF ;
    public final EObject entryRuleHeading4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading4 = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:812:2: (iv_ruleHeading4= ruleHeading4 EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:813:2: iv_ruleHeading4= ruleHeading4 EOF
            {
             newCompositeNode(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading41520);
            iv_ruleHeading4=ruleHeading4();

            state._fsp--;

             current =iv_ruleHeading4; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading41530); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:820:1: ruleHeading4 returns [EObject current=null] : (otherlv_0= '====' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '====' ) ;
    public final EObject ruleHeading4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_heading_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:823:28: ( (otherlv_0= '====' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '====' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (otherlv_0= '====' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '====' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: (otherlv_0= '====' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '====' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:824:3: otherlv_0= '====' ( (lv_heading_1_0= ruleFormattedText ) ) otherlv_2= '===='
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHeading41567); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:828:1: ( (lv_heading_1_0= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:1: (lv_heading_1_0= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:829:1: (lv_heading_1_0= ruleFormattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:3: lv_heading_1_0= ruleFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getHeading4Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFormattedText_in_ruleHeading41588);
            lv_heading_1_0=ruleFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeading4Rule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_1_0, 
                    		"FormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleHeading41600); 

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


    // $ANTLR start "entryRuleList"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:858:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:2: (iv_ruleList= ruleList EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList1636);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1646); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:1: ruleList returns [EObject current=null] : ( ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_1 = null;

        EObject lv_list_0_2 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:870:28: ( ( ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: ( ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: ( ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_list_0_1= ruleOrderedList | lv_list_0_2= ruleUnorderedList )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:3: lv_list_0_1= ruleOrderedList
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getListOrderedListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrderedList_in_ruleList1693);
                    lv_list_0_1=ruleOrderedList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_0_1, 
                            		"OrderedList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:8: lv_list_0_2= ruleUnorderedList
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getListUnorderedListParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleUnorderedList_in_ruleList1712);
                    lv_list_0_2=ruleUnorderedList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_0_2, 
                            		"UnorderedList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleOrderedList"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:915:1: entryRuleOrderedList returns [EObject current=null] : iv_ruleOrderedList= ruleOrderedList EOF ;
    public final EObject entryRuleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedList = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:916:2: (iv_ruleOrderedList= ruleOrderedList EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:2: iv_ruleOrderedList= ruleOrderedList EOF
            {
             newCompositeNode(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList1750);
            iv_ruleOrderedList=ruleOrderedList();

            state._fsp--;

             current =iv_ruleOrderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList1760); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:1: ruleOrderedList returns [EObject current=null] : ( (lv_items_0_0= ruleOrderedListItem ) ) ;
    public final EObject ruleOrderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:28: ( ( (lv_items_0_0= ruleOrderedListItem ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:928:1: ( (lv_items_0_0= ruleOrderedListItem ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:928:1: ( (lv_items_0_0= ruleOrderedListItem ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:1: (lv_items_0_0= ruleOrderedListItem )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:929:1: (lv_items_0_0= ruleOrderedListItem )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:930:3: lv_items_0_0= ruleOrderedListItem
            {
             
            	        newCompositeNode(grammarAccess.getOrderedListAccess().getItemsOrderedListItemParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOrderedListItem_in_ruleOrderedList1805);
            lv_items_0_0=ruleOrderedListItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderedListRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_0_0, 
                    		"OrderedListItem");
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
    // $ANTLR end "ruleOrderedList"


    // $ANTLR start "entryRuleUnorderedList"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:954:1: entryRuleUnorderedList returns [EObject current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
    public final EObject entryRuleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedList = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:2: (iv_ruleUnorderedList= ruleUnorderedList EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:2: iv_ruleUnorderedList= ruleUnorderedList EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList1840);
            iv_ruleUnorderedList=ruleUnorderedList();

            state._fsp--;

             current =iv_ruleUnorderedList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList1850); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:963:1: ruleUnorderedList returns [EObject current=null] : ( (lv_items_0_0= ruleUnorderedListItem ) ) ;
    public final EObject ruleUnorderedList() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:28: ( ( (lv_items_0_0= ruleUnorderedListItem ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: ( (lv_items_0_0= ruleUnorderedListItem ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: ( (lv_items_0_0= ruleUnorderedListItem ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_items_0_0= ruleUnorderedListItem )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_items_0_0= ruleUnorderedListItem )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:3: lv_items_0_0= ruleUnorderedListItem
            {
             
            	        newCompositeNode(grammarAccess.getUnorderedListAccess().getItemsUnorderedListItemParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleUnorderedListItem_in_ruleUnorderedList1895);
            lv_items_0_0=ruleUnorderedListItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnorderedListRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_0_0, 
                    		"UnorderedListItem");
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
    // $ANTLR end "ruleUnorderedList"


    // $ANTLR start "entryRuleOrderedListItem"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:993:1: entryRuleOrderedListItem returns [EObject current=null] : iv_ruleOrderedListItem= ruleOrderedListItem EOF ;
    public final EObject entryRuleOrderedListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderedListItem = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:994:2: (iv_ruleOrderedListItem= ruleOrderedListItem EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:995:2: iv_ruleOrderedListItem= ruleOrderedListItem EOF
            {
             newCompositeNode(grammarAccess.getOrderedListItemRule()); 
            pushFollow(FOLLOW_ruleOrderedListItem_in_entryRuleOrderedListItem1930);
            iv_ruleOrderedListItem=ruleOrderedListItem();

            state._fsp--;

             current =iv_ruleOrderedListItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedListItem1940); 

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
    // $ANTLR end "entryRuleOrderedListItem"


    // $ANTLR start "ruleOrderedListItem"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1002:1: ruleOrderedListItem returns [EObject current=null] : (otherlv_0= '#' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) ) ;
    public final EObject ruleOrderedListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_item_1_1 = null;

        EObject lv_item_1_2 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:28: ( (otherlv_0= '#' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: (otherlv_0= '#' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: (otherlv_0= '#' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:3: otherlv_0= '#' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOrderedListItem1977); 

                	newLeafNode(otherlv_0, grammarAccess.getOrderedListItemAccess().getNumberSignKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:1: ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:1: ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:1: ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CUSTOM_STRING||(LA9_0>=19 && LA9_0<=21)||LA9_0==24||LA9_0==27) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=17 && LA9_0<=18)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:3: lv_item_1_1= ruleFormattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedText_in_ruleOrderedListItem2000);
                    lv_item_1_1=ruleFormattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderedListItemRule());
                    	        }
                           		set(
                           			current, 
                           			"item",
                            		lv_item_1_1, 
                            		"FormattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:8: lv_item_1_2= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrderedListItemAccess().getItemListParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleOrderedListItem2019);
                    lv_item_1_2=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrderedListItemRule());
                    	        }
                           		set(
                           			current, 
                           			"item",
                            		lv_item_1_2, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleOrderedListItem"


    // $ANTLR start "entryRuleUnorderedListItem"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1054:1: entryRuleUnorderedListItem returns [EObject current=null] : iv_ruleUnorderedListItem= ruleUnorderedListItem EOF ;
    public final EObject entryRuleUnorderedListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnorderedListItem = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:2: (iv_ruleUnorderedListItem= ruleUnorderedListItem EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:2: iv_ruleUnorderedListItem= ruleUnorderedListItem EOF
            {
             newCompositeNode(grammarAccess.getUnorderedListItemRule()); 
            pushFollow(FOLLOW_ruleUnorderedListItem_in_entryRuleUnorderedListItem2058);
            iv_ruleUnorderedListItem=ruleUnorderedListItem();

            state._fsp--;

             current =iv_ruleUnorderedListItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedListItem2068); 

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
    // $ANTLR end "entryRuleUnorderedListItem"


    // $ANTLR start "ruleUnorderedListItem"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: ruleUnorderedListItem returns [EObject current=null] : (otherlv_0= '*' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) ) ;
    public final EObject ruleUnorderedListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_item_1_1 = null;

        EObject lv_item_1_2 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1066:28: ( (otherlv_0= '*' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: (otherlv_0= '*' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:1: (otherlv_0= '*' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:3: otherlv_0= '*' ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUnorderedListItem2105); 

                	newLeafNode(otherlv_0, grammarAccess.getUnorderedListItemAccess().getAsteriskKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: ( ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:1: ( (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:1: (lv_item_1_1= ruleFormattedText | lv_item_1_2= ruleList )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CUSTOM_STRING||(LA10_0>=19 && LA10_0<=21)||LA10_0==24||LA10_0==27) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=17 && LA10_0<=18)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:3: lv_item_1_1= ruleFormattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnorderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedText_in_ruleUnorderedListItem2128);
                    lv_item_1_1=ruleFormattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnorderedListItemRule());
                    	        }
                           		set(
                           			current, 
                           			"item",
                            		lv_item_1_1, 
                            		"FormattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:8: lv_item_1_2= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnorderedListItemAccess().getItemListParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleUnorderedListItem2147);
                    lv_item_1_2=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnorderedListItemRule());
                    	        }
                           		set(
                           			current, 
                           			"item",
                            		lv_item_1_2, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleUnorderedListItem"


    // $ANTLR start "entryRuleItalicText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1115:1: entryRuleItalicText returns [EObject current=null] : iv_ruleItalicText= ruleItalicText EOF ;
    public final EObject entryRuleItalicText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicText = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:2: (iv_ruleItalicText= ruleItalicText EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1117:2: iv_ruleItalicText= ruleItalicText EOF
            {
             newCompositeNode(grammarAccess.getItalicTextRule()); 
            pushFollow(FOLLOW_ruleItalicText_in_entryRuleItalicText2186);
            iv_ruleItalicText=ruleItalicText();

            state._fsp--;

             current =iv_ruleItalicText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicText2196); 

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
    // $ANTLR end "entryRuleItalicText"


    // $ANTLR start "ruleItalicText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1124:1: ruleItalicText returns [EObject current=null] : (otherlv_0= '\\'\\'' ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'' ) ;
    public final EObject ruleItalicText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_italicText_1_1 = null;

        EObject lv_italicText_1_2 = null;

        EObject lv_italicText_1_3 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1127:28: ( (otherlv_0= '\\'\\'' ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: (otherlv_0= '\\'\\'' ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:1: (otherlv_0= '\\'\\'' ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1128:3: otherlv_0= '\\'\\'' ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\''
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleItalicText2233); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1132:1: ( ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:1: ( (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:1: (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1134:1: (lv_italicText_1_1= ruleInternalLink | lv_italicText_1_2= ruleExternalLink | lv_italicText_1_3= ruleUnformattedText )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:3: lv_italicText_1_1= ruleInternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicTextAccess().getItalicTextInternalLinkParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInternalLink_in_ruleItalicText2256);
                    lv_italicText_1_1=ruleInternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicText",
                            		lv_italicText_1_1, 
                            		"InternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1150:8: lv_italicText_1_2= ruleExternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicTextAccess().getItalicTextExternalLinkParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleExternalLink_in_ruleItalicText2275);
                    lv_italicText_1_2=ruleExternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicText",
                            		lv_italicText_1_2, 
                            		"ExternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:8: lv_italicText_1_3= ruleUnformattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicTextAccess().getItalicTextUnformattedTextParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleUnformattedText_in_ruleItalicText2294);
                    lv_italicText_1_3=ruleUnformattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicText",
                            		lv_italicText_1_3, 
                            		"UnformattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleItalicText2309); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleItalicText"


    // $ANTLR start "entryRuleBoldText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1195:1: entryRuleBoldText returns [EObject current=null] : iv_ruleBoldText= ruleBoldText EOF ;
    public final EObject entryRuleBoldText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoldText = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1196:2: (iv_ruleBoldText= ruleBoldText EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1197:2: iv_ruleBoldText= ruleBoldText EOF
            {
             newCompositeNode(grammarAccess.getBoldTextRule()); 
            pushFollow(FOLLOW_ruleBoldText_in_entryRuleBoldText2345);
            iv_ruleBoldText=ruleBoldText();

            state._fsp--;

             current =iv_ruleBoldText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldText2355); 

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
    // $ANTLR end "entryRuleBoldText"


    // $ANTLR start "ruleBoldText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:1: ruleBoldText returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'' ) ;
    public final EObject ruleBoldText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_boldText_1_1 = null;

        EObject lv_boldText_1_2 = null;

        EObject lv_boldText_1_3 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1207:28: ( (otherlv_0= '\\'\\'\\'' ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: (otherlv_0= '\\'\\'\\'' ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:1: (otherlv_0= '\\'\\'\\'' ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1208:3: otherlv_0= '\\'\\'\\'' ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleBoldText2392); 

                	newLeafNode(otherlv_0, grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:1: ( ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1213:1: ( (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:1: (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1214:1: (lv_boldText_1_1= ruleInternalLink | lv_boldText_1_2= ruleExternalLink | lv_boldText_1_3= ruleUnformattedText )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case RULE_CUSTOM_STRING:
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
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:3: lv_boldText_1_1= ruleInternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoldTextAccess().getBoldTextInternalLinkParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInternalLink_in_ruleBoldText2415);
                    lv_boldText_1_1=ruleInternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"boldText",
                            		lv_boldText_1_1, 
                            		"InternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:8: lv_boldText_1_2= ruleExternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoldTextAccess().getBoldTextExternalLinkParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleExternalLink_in_ruleBoldText2434);
                    lv_boldText_1_2=ruleExternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"boldText",
                            		lv_boldText_1_2, 
                            		"ExternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1245:8: lv_boldText_1_3= ruleUnformattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getBoldTextAccess().getBoldTextUnformattedTextParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleUnformattedText_in_ruleBoldText2453);
                    lv_boldText_1_3=ruleUnformattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"boldText",
                            		lv_boldText_1_3, 
                            		"UnformattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleBoldText2468); 

                	newLeafNode(otherlv_2, grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleBoldText"


    // $ANTLR start "entryRuleItalicBoldText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:1: entryRuleItalicBoldText returns [EObject current=null] : iv_ruleItalicBoldText= ruleItalicBoldText EOF ;
    public final EObject entryRuleItalicBoldText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalicBoldText = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1276:2: (iv_ruleItalicBoldText= ruleItalicBoldText EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1277:2: iv_ruleItalicBoldText= ruleItalicBoldText EOF
            {
             newCompositeNode(grammarAccess.getItalicBoldTextRule()); 
            pushFollow(FOLLOW_ruleItalicBoldText_in_entryRuleItalicBoldText2504);
            iv_ruleItalicBoldText=ruleItalicBoldText();

            state._fsp--;

             current =iv_ruleItalicBoldText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBoldText2514); 

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
    // $ANTLR end "entryRuleItalicBoldText"


    // $ANTLR start "ruleItalicBoldText"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:1: ruleItalicBoldText returns [EObject current=null] : (otherlv_0= '\\'\\'\\'\\'\\'' ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) ;
    public final EObject ruleItalicBoldText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_italicBoldText_1_1 = null;

        EObject lv_italicBoldText_1_2 = null;

        EObject lv_italicBoldText_1_3 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:28: ( (otherlv_0= '\\'\\'\\'\\'\\'' ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'\\'\\'' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:1: (otherlv_0= '\\'\\'\\'\\'\\'' ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1288:3: otherlv_0= '\\'\\'\\'\\'\\'' ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) ) otherlv_2= '\\'\\'\\'\\'\\''
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleItalicBoldText2551); 

                	newLeafNode(otherlv_0, grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:1: ( ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:1: ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:1: ( (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: (lv_italicBoldText_1_1= ruleInternalLink | lv_italicBoldText_1_2= ruleExternalLink | lv_italicBoldText_1_3= ruleUnformattedText )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:3: lv_italicBoldText_1_1= ruleInternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextInternalLinkParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInternalLink_in_ruleItalicBoldText2574);
                    lv_italicBoldText_1_1=ruleInternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicBoldText",
                            		lv_italicBoldText_1_1, 
                            		"InternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1310:8: lv_italicBoldText_1_2= ruleExternalLink
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextExternalLinkParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleExternalLink_in_ruleItalicBoldText2593);
                    lv_italicBoldText_1_2=ruleExternalLink();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicBoldText",
                            		lv_italicBoldText_1_2, 
                            		"ExternalLink");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:8: lv_italicBoldText_1_3= ruleUnformattedText
                    {
                     
                    	        newCompositeNode(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextUnformattedTextParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleUnformattedText_in_ruleItalicBoldText2612);
                    lv_italicBoldText_1_3=ruleUnformattedText();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItalicBoldTextRule());
                    	        }
                           		set(
                           			current, 
                           			"italicBoldText",
                            		lv_italicBoldText_1_3, 
                            		"UnformattedText");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleItalicBoldText2627); 

                	newLeafNode(otherlv_2, grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2());
                

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
    // $ANTLR end "ruleItalicBoldText"


    // $ANTLR start "entryRuleBlockQuote"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:1: entryRuleBlockQuote returns [EObject current=null] : iv_ruleBlockQuote= ruleBlockQuote EOF ;
    public final EObject entryRuleBlockQuote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockQuote = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:2: (iv_ruleBlockQuote= ruleBlockQuote EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:2: iv_ruleBlockQuote= ruleBlockQuote EOF
            {
             newCompositeNode(grammarAccess.getBlockQuoteRule()); 
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote2663);
            iv_ruleBlockQuote=ruleBlockQuote();

            state._fsp--;

             current =iv_ruleBlockQuote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote2673); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: ruleBlockQuote returns [EObject current=null] : (otherlv_0= '<blockquote>' ( (lv_blockQuoteText_1_0= ruleFormattedText ) ) ( (lv_additional_2_0= ruleFormattedText ) )* otherlv_3= '</blockquote>' ) ;
    public final EObject ruleBlockQuote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_blockQuoteText_1_0 = null;

        EObject lv_additional_2_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1367:28: ( (otherlv_0= '<blockquote>' ( (lv_blockQuoteText_1_0= ruleFormattedText ) ) ( (lv_additional_2_0= ruleFormattedText ) )* otherlv_3= '</blockquote>' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1368:1: (otherlv_0= '<blockquote>' ( (lv_blockQuoteText_1_0= ruleFormattedText ) ) ( (lv_additional_2_0= ruleFormattedText ) )* otherlv_3= '</blockquote>' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1368:1: (otherlv_0= '<blockquote>' ( (lv_blockQuoteText_1_0= ruleFormattedText ) ) ( (lv_additional_2_0= ruleFormattedText ) )* otherlv_3= '</blockquote>' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1368:3: otherlv_0= '<blockquote>' ( (lv_blockQuoteText_1_0= ruleFormattedText ) ) ( (lv_additional_2_0= ruleFormattedText ) )* otherlv_3= '</blockquote>'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBlockQuote2710); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1372:1: ( (lv_blockQuoteText_1_0= ruleFormattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_blockQuoteText_1_0= ruleFormattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1373:1: (lv_blockQuoteText_1_0= ruleFormattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:3: lv_blockQuoteText_1_0= ruleFormattedText
            {
             
            	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getBlockQuoteTextFormattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFormattedText_in_ruleBlockQuote2731);
            lv_blockQuoteText_1_0=ruleFormattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockQuoteRule());
            	        }
                   		set(
                   			current, 
                   			"blockQuoteText",
                    		lv_blockQuoteText_1_0, 
                    		"FormattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1390:2: ( (lv_additional_2_0= ruleFormattedText ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_CUSTOM_STRING||(LA14_0>=19 && LA14_0<=21)||LA14_0==24||LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:1: (lv_additional_2_0= ruleFormattedText )
            	    {
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1391:1: (lv_additional_2_0= ruleFormattedText )
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:3: lv_additional_2_0= ruleFormattedText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockQuoteAccess().getAdditionalFormattedTextParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFormattedText_in_ruleBlockQuote2752);
            	    lv_additional_2_0=ruleFormattedText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockQuoteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additional",
            	            		lv_additional_2_0, 
            	            		"FormattedText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBlockQuote2765); 

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


    // $ANTLR start "entryRuleExternalLink"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1420:1: entryRuleExternalLink returns [EObject current=null] : iv_ruleExternalLink= ruleExternalLink EOF ;
    public final EObject entryRuleExternalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLink = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1421:2: (iv_ruleExternalLink= ruleExternalLink EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:2: iv_ruleExternalLink= ruleExternalLink EOF
            {
             newCompositeNode(grammarAccess.getExternalLinkRule()); 
            pushFollow(FOLLOW_ruleExternalLink_in_entryRuleExternalLink2801);
            iv_ruleExternalLink=ruleExternalLink();

            state._fsp--;

             current =iv_ruleExternalLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLink2811); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:1: ruleExternalLink returns [EObject current=null] : (otherlv_0= '[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleExternalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linkName_1_0 = null;

        EObject lv_renamedLink_3_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:28: ( (otherlv_0= '[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (otherlv_0= '[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (otherlv_0= '[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:3: otherlv_0= '[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExternalLink2848); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalLinkAccess().getLeftSquareBracketKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1437:1: ( (lv_linkName_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:1: (lv_linkName_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1438:1: (lv_linkName_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1439:3: lv_linkName_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getExternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleExternalLink2869);
            lv_linkName_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalLinkRule());
            	        }
                   		set(
                   			current, 
                   			"linkName",
                    		lv_linkName_1_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:2: (otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1455:4: otherlv_2= ' ' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleExternalLink2882); 

                        	newLeafNode(otherlv_2, grammarAccess.getExternalLinkAccess().getSpaceKeyword_2_0());
                        
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1459:1: ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1461:3: lv_renamedLink_3_0= ruleFormattedTextWithoutLinks
                    {
                     
                    	        newCompositeNode(grammarAccess.getExternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_ruleExternalLink2903);
                    lv_renamedLink_3_0=ruleFormattedTextWithoutLinks();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExternalLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"renamedLink",
                            		lv_renamedLink_3_0, 
                            		"FormattedTextWithoutLinks");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleExternalLink2917); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleInternalLink"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1489:1: entryRuleInternalLink returns [EObject current=null] : iv_ruleInternalLink= ruleInternalLink EOF ;
    public final EObject entryRuleInternalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalLink = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1490:2: (iv_ruleInternalLink= ruleInternalLink EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1491:2: iv_ruleInternalLink= ruleInternalLink EOF
            {
             newCompositeNode(grammarAccess.getInternalLinkRule()); 
            pushFollow(FOLLOW_ruleInternalLink_in_entryRuleInternalLink2953);
            iv_ruleInternalLink=ruleInternalLink();

            state._fsp--;

             current =iv_ruleInternalLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLink2963); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:1: ruleInternalLink returns [EObject current=null] : (otherlv_0= '[[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']]' ) ;
    public final EObject ruleInternalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_linkName_1_0 = null;

        EObject lv_renamedLink_3_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1501:28: ( (otherlv_0= '[[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']]' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:1: (otherlv_0= '[[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']]' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:1: (otherlv_0= '[[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']]' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:3: otherlv_0= '[[' ( (lv_linkName_1_0= ruleUnformattedText ) ) (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )? otherlv_4= ']]'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleInternalLink3000); 

                	newLeafNode(otherlv_0, grammarAccess.getInternalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:1: ( (lv_linkName_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:1: (lv_linkName_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:1: (lv_linkName_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1508:3: lv_linkName_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getInternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleInternalLink3021);
            lv_linkName_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInternalLinkRule());
            	        }
                   		set(
                   			current, 
                   			"linkName",
                    		lv_linkName_1_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:2: (otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:4: otherlv_2= '|' ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleInternalLink3034); 

                        	newLeafNode(otherlv_2, grammarAccess.getInternalLinkAccess().getVerticalLineKeyword_2_0());
                        
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:1: ( (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks ) )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:1: (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:1: (lv_renamedLink_3_0= ruleFormattedTextWithoutLinks )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:3: lv_renamedLink_3_0= ruleFormattedTextWithoutLinks
                    {
                     
                    	        newCompositeNode(grammarAccess.getInternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_ruleInternalLink3055);
                    lv_renamedLink_3_0=ruleFormattedTextWithoutLinks();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInternalLinkRule());
                    	        }
                           		set(
                           			current, 
                           			"renamedLink",
                            		lv_renamedLink_3_0, 
                            		"FormattedTextWithoutLinks");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleInternalLink3069); 

                	newLeafNode(otherlv_4, grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleFile"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1558:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1559:2: (iv_ruleFile= ruleFile EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1560:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile3105);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile3115); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1567:1: ruleFile returns [EObject current=null] : (otherlv_0= '[[File:' ( (lv_fileName_1_0= ruleUnformattedText ) ) ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )? (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )? otherlv_6= ']]' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_viewType_2_1=null;
        Token lv_viewType_2_2=null;
        Token lv_viewType_2_3=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_fileName_1_0 = null;

        EObject lv_text_4_0 = null;

        EObject lv_additional_5_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1570:28: ( (otherlv_0= '[[File:' ( (lv_fileName_1_0= ruleUnformattedText ) ) ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )? (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )? otherlv_6= ']]' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: (otherlv_0= '[[File:' ( (lv_fileName_1_0= ruleUnformattedText ) ) ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )? (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )? otherlv_6= ']]' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:1: (otherlv_0= '[[File:' ( (lv_fileName_1_0= ruleUnformattedText ) ) ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )? (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )? otherlv_6= ']]' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1571:3: otherlv_0= '[[File:' ( (lv_fileName_1_0= ruleUnformattedText ) ) ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )? (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )? otherlv_6= ']]'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFile3152); 

                	newLeafNode(otherlv_0, grammarAccess.getFileAccess().getFileKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: ( (lv_fileName_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:1: (lv_fileName_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:1: (lv_fileName_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:3: lv_fileName_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getFileAccess().getFileNameUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleFile3173);
            lv_fileName_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFileRule());
            	        }
                   		set(
                   			current, 
                   			"fileName",
                    		lv_fileName_1_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1593:2: ( ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=31 && LA18_0<=33)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:1: ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1594:1: ( (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' ) )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1595:1: (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1595:1: (lv_viewType_2_1= '|thumb' | lv_viewType_2_2= '|frame' | lv_viewType_2_3= '|frameless' )
                    int alt17=3;
                    switch ( input.LA(1) ) {
                    case 31:
                        {
                        alt17=1;
                        }
                        break;
                    case 32:
                        {
                        alt17=2;
                        }
                        break;
                    case 33:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:3: lv_viewType_2_1= '|thumb'
                            {
                            lv_viewType_2_1=(Token)match(input,31,FOLLOW_31_in_ruleFile3193); 

                                    newLeafNode(lv_viewType_2_1, grammarAccess.getFileAccess().getViewTypeThumbKeyword_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFileRule());
                            	        }
                                   		setWithLastConsumed(current, "viewType", lv_viewType_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1608:8: lv_viewType_2_2= '|frame'
                            {
                            lv_viewType_2_2=(Token)match(input,32,FOLLOW_32_in_ruleFile3222); 

                                    newLeafNode(lv_viewType_2_2, grammarAccess.getFileAccess().getViewTypeFrameKeyword_2_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFileRule());
                            	        }
                                   		setWithLastConsumed(current, "viewType", lv_viewType_2_2, null);
                            	    

                            }
                            break;
                        case 3 :
                            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:8: lv_viewType_2_3= '|frameless'
                            {
                            lv_viewType_2_3=(Token)match(input,33,FOLLOW_33_in_ruleFile3251); 

                                    newLeafNode(lv_viewType_2_3, grammarAccess.getFileAccess().getViewTypeFramelessKeyword_2_0_2());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFileRule());
                            	        }
                                   		setWithLastConsumed(current, "viewType", lv_viewType_2_3, null);
                            	    

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:3: (otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1635:5: otherlv_3= '|' ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) ) ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleFile3281); 

                        	newLeafNode(otherlv_3, grammarAccess.getFileAccess().getVerticalLineKeyword_3_0());
                        
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1639:1: ( (lv_text_4_0= ruleFormattedTextWithoutLinks ) )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (lv_text_4_0= ruleFormattedTextWithoutLinks )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1640:1: (lv_text_4_0= ruleFormattedTextWithoutLinks )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1641:3: lv_text_4_0= ruleFormattedTextWithoutLinks
                    {
                     
                    	        newCompositeNode(grammarAccess.getFileAccess().getTextFormattedTextWithoutLinksParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_ruleFile3302);
                    lv_text_4_0=ruleFormattedTextWithoutLinks();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFileRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"FormattedTextWithoutLinks");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1657:2: ( (lv_additional_5_0= ruleFormattedTextWithoutLinks ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_CUSTOM_STRING||(LA19_0>=19 && LA19_0<=21)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1658:1: (lv_additional_5_0= ruleFormattedTextWithoutLinks )
                    	    {
                    	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1658:1: (lv_additional_5_0= ruleFormattedTextWithoutLinks )
                    	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1659:3: lv_additional_5_0= ruleFormattedTextWithoutLinks
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFileAccess().getAdditionalFormattedTextWithoutLinksParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_ruleFile3323);
                    	    lv_additional_5_0=ruleFormattedTextWithoutLinks();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"additional",
                    	            		lv_additional_5_0, 
                    	            		"FormattedTextWithoutLinks");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleFile3338); 

                	newLeafNode(otherlv_6, grammarAccess.getFileAccess().getRightSquareBracketRightSquareBracketKeyword_4());
                

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1687:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1688:2: (iv_ruleCategory= ruleCategory EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1689:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory3374);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory3384); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1696:1: ruleCategory returns [EObject current=null] : (otherlv_0= '[[Category:' ( (lv_categoryLink_1_0= ruleUnformattedText ) ) (otherlv_2= '|*' )? otherlv_3= ']]' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_categoryLink_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:28: ( (otherlv_0= '[[Category:' ( (lv_categoryLink_1_0= ruleUnformattedText ) ) (otherlv_2= '|*' )? otherlv_3= ']]' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:1: (otherlv_0= '[[Category:' ( (lv_categoryLink_1_0= ruleUnformattedText ) ) (otherlv_2= '|*' )? otherlv_3= ']]' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:1: (otherlv_0= '[[Category:' ( (lv_categoryLink_1_0= ruleUnformattedText ) ) (otherlv_2= '|*' )? otherlv_3= ']]' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:3: otherlv_0= '[[Category:' ( (lv_categoryLink_1_0= ruleUnformattedText ) ) (otherlv_2= '|*' )? otherlv_3= ']]'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCategory3421); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1704:1: ( (lv_categoryLink_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1705:1: (lv_categoryLink_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1705:1: (lv_categoryLink_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1706:3: lv_categoryLink_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getCategoryAccess().getCategoryLinkUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleCategory3442);
            lv_categoryLink_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCategoryRule());
            	        }
                   		set(
                   			current, 
                   			"categoryLink",
                    		lv_categoryLink_1_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:2: (otherlv_2= '|*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1722:4: otherlv_2= '|*'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleCategory3455); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getVerticalLineAsteriskKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleCategory3469); 

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


    // $ANTLR start "entryRuleTemplate"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1740:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate3505);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate3515); 

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
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1747:1: ruleTemplate returns [EObject current=null] : (otherlv_0= '{{' ( (lv_template_1_0= ruleTemplateType ) ) otherlv_2= '}}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_template_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1750:28: ( (otherlv_0= '{{' ( (lv_template_1_0= ruleTemplateType ) ) otherlv_2= '}}' ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: (otherlv_0= '{{' ( (lv_template_1_0= ruleTemplateType ) ) otherlv_2= '}}' )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:1: (otherlv_0= '{{' ( (lv_template_1_0= ruleTemplateType ) ) otherlv_2= '}}' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1751:3: otherlv_0= '{{' ( (lv_template_1_0= ruleTemplateType ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleTemplate3552); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1755:1: ( (lv_template_1_0= ruleTemplateType ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1756:1: (lv_template_1_0= ruleTemplateType )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1756:1: (lv_template_1_0= ruleTemplateType )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1757:3: lv_template_1_0= ruleTemplateType
            {
             
            	        newCompositeNode(grammarAccess.getTemplateAccess().getTemplateTemplateTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTemplateType_in_ruleTemplate3573);
            lv_template_1_0=ruleTemplateType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	        }
                   		set(
                   			current, 
                   			"template",
                    		lv_template_1_0, 
                    		"TemplateType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleTemplate3585); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2());
                

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


    // $ANTLR start "entryRuleTemplateType"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1785:1: entryRuleTemplateType returns [EObject current=null] : iv_ruleTemplateType= ruleTemplateType EOF ;
    public final EObject entryRuleTemplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateType = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1786:2: (iv_ruleTemplateType= ruleTemplateType EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1787:2: iv_ruleTemplateType= ruleTemplateType EOF
            {
             newCompositeNode(grammarAccess.getTemplateTypeRule()); 
            pushFollow(FOLLOW_ruleTemplateType_in_entryRuleTemplateType3621);
            iv_ruleTemplateType=ruleTemplateType();

            state._fsp--;

             current =iv_ruleTemplateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateType3631); 

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
    // $ANTLR end "entryRuleTemplateType"


    // $ANTLR start "ruleTemplateType"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: ruleTemplateType returns [EObject current=null] : ( ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) ) ) ;
    public final EObject ruleTemplateType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1797:28: ( ( ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: ( ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1798:1: ( ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:1: ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1799:1: ( (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:1: (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1800:1: (lv_type_0_1= ruleMetadata | lv_type_0_2= ruleMainInformation )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1801:3: lv_type_0_1= ruleMetadata
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getTypeMetadataParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMetadata_in_ruleTemplateType3678);
                    lv_type_0_1=ruleMetadata();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplateTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_1, 
                            		"Metadata");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1816:8: lv_type_0_2= ruleMainInformation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTemplateTypeAccess().getTypeMainInformationParserRuleCall_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleMainInformation_in_ruleTemplateType3697);
                    lv_type_0_2=ruleMainInformation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTemplateTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_2, 
                            		"MainInformation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

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
    // $ANTLR end "ruleTemplateType"


    // $ANTLR start "entryRuleMetadata"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1844:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata3735);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata3745); 

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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: ruleMetadata returns [EObject current=null] : ( ( (lv_about_0_0= ruleAbout ) ) ( (lv_actualInfo_1_0= ruleActualInformation ) )? ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        EObject lv_about_0_0 = null;

        EObject lv_actualInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1854:28: ( ( ( (lv_about_0_0= ruleAbout ) ) ( (lv_actualInfo_1_0= ruleActualInformation ) )? ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:1: ( ( (lv_about_0_0= ruleAbout ) ) ( (lv_actualInfo_1_0= ruleActualInformation ) )? )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:1: ( ( (lv_about_0_0= ruleAbout ) ) ( (lv_actualInfo_1_0= ruleActualInformation ) )? )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:2: ( (lv_about_0_0= ruleAbout ) ) ( (lv_actualInfo_1_0= ruleActualInformation ) )?
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1855:2: ( (lv_about_0_0= ruleAbout ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: (lv_about_0_0= ruleAbout )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1856:1: (lv_about_0_0= ruleAbout )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1857:3: lv_about_0_0= ruleAbout
            {
             
            	        newCompositeNode(grammarAccess.getMetadataAccess().getAboutAboutParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbout_in_ruleMetadata3791);
            lv_about_0_0=ruleAbout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataRule());
            	        }
                   		set(
                   			current, 
                   			"about",
                    		lv_about_0_0, 
                    		"About");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1873:2: ( (lv_actualInfo_1_0= ruleActualInformation ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: (lv_actualInfo_1_0= ruleActualInformation )
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1874:1: (lv_actualInfo_1_0= ruleActualInformation )
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1875:3: lv_actualInfo_1_0= ruleActualInformation
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetadataAccess().getActualInfoActualInformationParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActualInformation_in_ruleMetadata3812);
                    lv_actualInfo_1_0=ruleActualInformation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetadataRule());
                    	        }
                           		set(
                           			current, 
                           			"actualInfo",
                            		lv_actualInfo_1_0, 
                            		"ActualInformation");
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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleAbout"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:1: entryRuleAbout returns [EObject current=null] : iv_ruleAbout= ruleAbout EOF ;
    public final EObject entryRuleAbout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbout = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1900:2: (iv_ruleAbout= ruleAbout EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1901:2: iv_ruleAbout= ruleAbout EOF
            {
             newCompositeNode(grammarAccess.getAboutRule()); 
            pushFollow(FOLLOW_ruleAbout_in_entryRuleAbout3849);
            iv_ruleAbout=ruleAbout();

            state._fsp--;

             current =iv_ruleAbout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbout3859); 

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
    // $ANTLR end "entryRuleAbout"


    // $ANTLR start "ruleAbout"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1908:1: ruleAbout returns [EObject current=null] : (otherlv_0= 'about|' ( (lv_aboutText_1_0= ruleUnformattedText ) ) ) ;
    public final EObject ruleAbout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_aboutText_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1911:28: ( (otherlv_0= 'about|' ( (lv_aboutText_1_0= ruleUnformattedText ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:1: (otherlv_0= 'about|' ( (lv_aboutText_1_0= ruleUnformattedText ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:1: (otherlv_0= 'about|' ( (lv_aboutText_1_0= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1912:3: otherlv_0= 'about|' ( (lv_aboutText_1_0= ruleUnformattedText ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleAbout3896); 

                	newLeafNode(otherlv_0, grammarAccess.getAboutAccess().getAboutKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1916:1: ( (lv_aboutText_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (lv_aboutText_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1917:1: (lv_aboutText_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1918:3: lv_aboutText_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getAboutAccess().getAboutTextUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleAbout3917);
            lv_aboutText_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAboutRule());
            	        }
                   		set(
                   			current, 
                   			"aboutText",
                    		lv_aboutText_1_0, 
                    		"UnformattedText");
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
    // $ANTLR end "ruleAbout"


    // $ANTLR start "entryRuleActualInformation"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: entryRuleActualInformation returns [EObject current=null] : iv_ruleActualInformation= ruleActualInformation EOF ;
    public final EObject entryRuleActualInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualInformation = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:2: (iv_ruleActualInformation= ruleActualInformation EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1944:2: iv_ruleActualInformation= ruleActualInformation EOF
            {
             newCompositeNode(grammarAccess.getActualInformationRule()); 
            pushFollow(FOLLOW_ruleActualInformation_in_entryRuleActualInformation3953);
            iv_ruleActualInformation=ruleActualInformation();

            state._fsp--;

             current =iv_ruleActualInformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualInformation3963); 

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
    // $ANTLR end "entryRuleActualInformation"


    // $ANTLR start "ruleActualInformation"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1951:1: ruleActualInformation returns [EObject current=null] : (otherlv_0= '|' ( (lv_informationOnWhat_1_0= ruleUnformattedText ) ) otherlv_2= '|' ( (lv_link_3_0= ruleUnformattedText ) ) (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )* ) ;
    public final EObject ruleActualInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_informationOnWhat_1_0 = null;

        EObject lv_link_3_0 = null;

        EObject lv_additionalLinks_5_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1954:28: ( (otherlv_0= '|' ( (lv_informationOnWhat_1_0= ruleUnformattedText ) ) otherlv_2= '|' ( (lv_link_3_0= ruleUnformattedText ) ) (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )* ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:1: (otherlv_0= '|' ( (lv_informationOnWhat_1_0= ruleUnformattedText ) ) otherlv_2= '|' ( (lv_link_3_0= ruleUnformattedText ) ) (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )* )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:1: (otherlv_0= '|' ( (lv_informationOnWhat_1_0= ruleUnformattedText ) ) otherlv_2= '|' ( (lv_link_3_0= ruleUnformattedText ) ) (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )* )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1955:3: otherlv_0= '|' ( (lv_informationOnWhat_1_0= ruleUnformattedText ) ) otherlv_2= '|' ( (lv_link_3_0= ruleUnformattedText ) ) (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleActualInformation4000); 

                	newLeafNode(otherlv_0, grammarAccess.getActualInformationAccess().getVerticalLineKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:1: ( (lv_informationOnWhat_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:1: (lv_informationOnWhat_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:1: (lv_informationOnWhat_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1961:3: lv_informationOnWhat_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getActualInformationAccess().getInformationOnWhatUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleActualInformation4021);
            lv_informationOnWhat_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualInformationRule());
            	        }
                   		set(
                   			current, 
                   			"informationOnWhat",
                    		lv_informationOnWhat_1_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleActualInformation4033); 

                	newLeafNode(otherlv_2, grammarAccess.getActualInformationAccess().getVerticalLineKeyword_2());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: ( (lv_link_3_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:1: (lv_link_3_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:1: (lv_link_3_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1983:3: lv_link_3_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getActualInformationAccess().getLinkUnformattedTextParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleActualInformation4054);
            lv_link_3_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualInformationRule());
            	        }
                   		set(
                   			current, 
                   			"link",
                    		lv_link_3_0, 
                    		"UnformattedText");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1999:2: (otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1999:4: otherlv_4= '|and|' ( (lv_additionalLinks_5_0= ruleUnformattedText ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleActualInformation4067); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActualInformationAccess().getAndKeyword_4_0());
            	        
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2003:1: ( (lv_additionalLinks_5_0= ruleUnformattedText ) )
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:1: (lv_additionalLinks_5_0= ruleUnformattedText )
            	    {
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2004:1: (lv_additionalLinks_5_0= ruleUnformattedText )
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2005:3: lv_additionalLinks_5_0= ruleUnformattedText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActualInformationAccess().getAdditionalLinksUnformattedTextParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnformattedText_in_ruleActualInformation4088);
            	    lv_additionalLinks_5_0=ruleUnformattedText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActualInformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalLinks",
            	            		lv_additionalLinks_5_0, 
            	            		"UnformattedText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleActualInformation"


    // $ANTLR start "entryRuleMainInformation"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2029:1: entryRuleMainInformation returns [EObject current=null] : iv_ruleMainInformation= ruleMainInformation EOF ;
    public final EObject entryRuleMainInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainInformation = null;


        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2030:2: (iv_ruleMainInformation= ruleMainInformation EOF )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:2: iv_ruleMainInformation= ruleMainInformation EOF
            {
             newCompositeNode(grammarAccess.getMainInformationRule()); 
            pushFollow(FOLLOW_ruleMainInformation_in_entryRuleMainInformation4126);
            iv_ruleMainInformation=ruleMainInformation();

            state._fsp--;

             current =iv_ruleMainInformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainInformation4136); 

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
    // $ANTLR end "entryRuleMainInformation"


    // $ANTLR start "ruleMainInformation"
    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2038:1: ruleMainInformation returns [EObject current=null] : (otherlv_0= 'main|' ( (lv_link_1_0= ruleUnformattedText ) ) ) ;
    public final EObject ruleMainInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;


         enterRule(); 
            
        try {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2041:28: ( (otherlv_0= 'main|' ( (lv_link_1_0= ruleUnformattedText ) ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:1: (otherlv_0= 'main|' ( (lv_link_1_0= ruleUnformattedText ) ) )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:1: (otherlv_0= 'main|' ( (lv_link_1_0= ruleUnformattedText ) ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2042:3: otherlv_0= 'main|' ( (lv_link_1_0= ruleUnformattedText ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMainInformation4173); 

                	newLeafNode(otherlv_0, grammarAccess.getMainInformationAccess().getMainKeyword_0());
                
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2046:1: ( (lv_link_1_0= ruleUnformattedText ) )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2047:1: (lv_link_1_0= ruleUnformattedText )
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2047:1: (lv_link_1_0= ruleUnformattedText )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2048:3: lv_link_1_0= ruleUnformattedText
            {
             
            	        newCompositeNode(grammarAccess.getMainInformationAccess().getLinkUnformattedTextParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleUnformattedText_in_ruleMainInformation4194);
            lv_link_1_0=ruleUnformattedText();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMainInformationRule());
            	        }
                   		set(
                   			current, 
                   			"link",
                    		lv_link_1_0, 
                    		"UnformattedText");
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
    // $ANTLR end "ruleMainInformation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleDocument131 = new BitSet(new long[]{0x00000014497FC032L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDocument152 = new BitSet(new long[]{0x00000014497FC032L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleDocument174 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKI_COMMENT_in_ruleComment262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_entryRuleUnformattedText302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnformattedText312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CUSTOM_STRING_in_ruleUnformattedText353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_entryRuleFormattedText393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedText403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_ruleFormattedText450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_ruleFormattedText469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_ruleFormattedText488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_ruleFormattedText507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_ruleFormattedText526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleFormattedText545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_entryRuleFormattedTextWithoutLinks583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedTextWithoutLinks593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_ruleFormattedTextWithoutLinks640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_ruleFormattedTextWithoutLinks659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_ruleFormattedTextWithoutLinks678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleFormattedTextWithoutLinks697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleAbstractElement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading_in_ruleAbstractElement811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextElement_in_ruleAbstractElement830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleAbstractElement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextElement897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_ruleTextElement944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_ruleTextElement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTextElement982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleTextElement1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading_in_entryRuleHeading1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleHeading1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleHeading1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_ruleHeading1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading11172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHeading11219 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleHeading11240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleHeading11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading21288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading21298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleHeading21335 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleHeading21356 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleHeading21368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading31404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading31414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleHeading31451 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleHeading31472 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleHeading31484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading41520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading41530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeading41567 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleHeading41588 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleHeading41600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_ruleList1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_ruleList1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedListItem_in_ruleOrderedList1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList1840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedListItem_in_ruleUnorderedList1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedListItem_in_entryRuleOrderedListItem1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedListItem1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOrderedListItem1977 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleOrderedListItem2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleOrderedListItem2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedListItem_in_entryRuleUnorderedListItem2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedListItem2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUnorderedListItem2105 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleUnorderedListItem2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleUnorderedListItem2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_entryRuleItalicText2186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicText2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleItalicText2233 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleInternalLink_in_ruleItalicText2256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExternalLink_in_ruleItalicText2275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleItalicText2294 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleItalicText2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_entryRuleBoldText2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldText2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBoldText2392 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleInternalLink_in_ruleBoldText2415 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleExternalLink_in_ruleBoldText2434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleBoldText2453 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBoldText2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_entryRuleItalicBoldText2504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBoldText2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleItalicBoldText2551 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleInternalLink_in_ruleItalicBoldText2574 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleExternalLink_in_ruleItalicBoldText2593 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleItalicBoldText2612 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleItalicBoldText2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBlockQuote2710 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleBlockQuote2731 = new BitSet(new long[]{0x0000000049FE0020L});
    public static final BitSet FOLLOW_ruleFormattedText_in_ruleBlockQuote2752 = new BitSet(new long[]{0x0000000049FE0020L});
    public static final BitSet FOLLOW_23_in_ruleBlockQuote2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_entryRuleExternalLink2801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLink2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExternalLink2848 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleExternalLink2869 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_ruleExternalLink2882 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_ruleExternalLink2903 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExternalLink2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_entryRuleInternalLink2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLink2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleInternalLink3000 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleInternalLink3021 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleInternalLink3034 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_ruleInternalLink3055 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInternalLink3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFile3152 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleFile3173 = new BitSet(new long[]{0x00000003B0000000L});
    public static final BitSet FOLLOW_31_in_ruleFile3193 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_32_in_ruleFile3222 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_33_in_ruleFile3251 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleFile3281 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_ruleFile3302 = new BitSet(new long[]{0x00000000697E0020L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_ruleFile3323 = new BitSet(new long[]{0x00000000697E0020L});
    public static final BitSet FOLLOW_29_in_ruleFile3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory3374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCategory3421 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleCategory3442 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_35_in_ruleCategory3455 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCategory3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate3505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTemplate3552 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_ruleTemplateType_in_ruleTemplate3573 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTemplate3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_entryRuleTemplateType3621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateType3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTemplateType3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainInformation_in_ruleTemplateType3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata3735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbout_in_ruleMetadata3791 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleActualInformation_in_ruleMetadata3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbout_in_entryRuleAbout3849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbout3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAbout3896 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleAbout3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualInformation_in_entryRuleActualInformation3953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualInformation3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleActualInformation4000 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleActualInformation4021 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActualInformation4033 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleActualInformation4054 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleActualInformation4067 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleActualInformation4088 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleMainInformation_in_entryRuleMainInformation4126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainInformation4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMainInformation4173 = new BitSet(new long[]{0x00000000497E0020L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_ruleMainInformation4194 = new BitSet(new long[]{0x0000000000000002L});

}