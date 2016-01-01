package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WIKI_COMMENT", "RULE_CUSTOM_STRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'|thumb'", "'|frame'", "'|frameless'", "'='", "'=='", "'==='", "'===='", "'#'", "'*'", "'\\'\\''", "'\\'\\'\\''", "'\\'\\'\\'\\'\\''", "'<blockquote>'", "'</blockquote>'", "'['", "']'", "' '", "'[['", "']]'", "'|'", "'[[File:'", "'[[Category:'", "'|*'", "'{{'", "'}}'", "'about|'", "'|and|'", "'main|'"
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
    public String getGrammarFileName() { return "../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDocument"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleDocument EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Document__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Document__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Document__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleComment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleComment EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment121);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleComment : ( ( rule__Comment__CommentAssignment ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Comment__CommentAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Comment__CommentAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Comment__CommentAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Comment__CommentAssignment )
            {
             before(grammarAccess.getCommentAccess().getCommentAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Comment__CommentAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Comment__CommentAssignment
            {
            pushFollow(FOLLOW_rule__Comment__CommentAssignment_in_ruleComment154);
            rule__Comment__CommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getCommentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleUnformattedText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleUnformattedText : ruleUnformattedText EOF ;
    public final void entryRuleUnformattedText() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleUnformattedText EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleUnformattedText EOF
            {
             before(grammarAccess.getUnformattedTextRule()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_entryRuleUnformattedText181);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getUnformattedTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnformattedText188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnformattedText"


    // $ANTLR start "ruleUnformattedText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleUnformattedText : ( ( rule__UnformattedText__TextAssignment ) ) ;
    public final void ruleUnformattedText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__UnformattedText__TextAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__UnformattedText__TextAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__UnformattedText__TextAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__UnformattedText__TextAssignment )
            {
             before(grammarAccess.getUnformattedTextAccess().getTextAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__UnformattedText__TextAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__UnformattedText__TextAssignment
            {
            pushFollow(FOLLOW_rule__UnformattedText__TextAssignment_in_ruleUnformattedText214);
            rule__UnformattedText__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnformattedTextAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnformattedText"


    // $ANTLR start "entryRuleFormattedText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleFormattedText : ruleFormattedText EOF ;
    public final void entryRuleFormattedText() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleFormattedText EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleFormattedText EOF
            {
             before(grammarAccess.getFormattedTextRule()); 
            pushFollow(FOLLOW_ruleFormattedText_in_entryRuleFormattedText241);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getFormattedTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedText248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormattedText"


    // $ANTLR start "ruleFormattedText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleFormattedText : ( ( rule__FormattedText__FormattedTextAssignment ) ) ;
    public final void ruleFormattedText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__FormattedText__FormattedTextAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__FormattedText__FormattedTextAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__FormattedText__FormattedTextAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__FormattedText__FormattedTextAssignment )
            {
             before(grammarAccess.getFormattedTextAccess().getFormattedTextAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__FormattedText__FormattedTextAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__FormattedText__FormattedTextAssignment
            {
            pushFollow(FOLLOW_rule__FormattedText__FormattedTextAssignment_in_ruleFormattedText274);
            rule__FormattedText__FormattedTextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFormattedTextAccess().getFormattedTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormattedText"


    // $ANTLR start "entryRuleFormattedTextWithoutLinks"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleFormattedTextWithoutLinks : ruleFormattedTextWithoutLinks EOF ;
    public final void entryRuleFormattedTextWithoutLinks() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleFormattedTextWithoutLinks EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleFormattedTextWithoutLinks EOF
            {
             before(grammarAccess.getFormattedTextWithoutLinksRule()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_entryRuleFormattedTextWithoutLinks301);
            ruleFormattedTextWithoutLinks();

            state._fsp--;

             after(grammarAccess.getFormattedTextWithoutLinksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedTextWithoutLinks308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormattedTextWithoutLinks"


    // $ANTLR start "ruleFormattedTextWithoutLinks"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleFormattedTextWithoutLinks : ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment ) ) ;
    public final void ruleFormattedTextWithoutLinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment )
            {
             before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment
            {
            pushFollow(FOLLOW_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment_in_ruleFormattedTextWithoutLinks334);
            rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormattedTextWithoutLinks"


    // $ANTLR start "entryRuleAbstractElement"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleAbstractElement EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement361);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleAbstractElement : ( ( rule__AbstractElement__ElementAssignment ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__AbstractElement__ElementAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__AbstractElement__ElementAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__AbstractElement__ElementAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__AbstractElement__ElementAssignment )
            {
             before(grammarAccess.getAbstractElementAccess().getElementAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__AbstractElement__ElementAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__AbstractElement__ElementAssignment
            {
            pushFollow(FOLLOW_rule__AbstractElement__ElementAssignment_in_ruleAbstractElement394);
            rule__AbstractElement__ElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleTextElement"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleTextElement : ruleTextElement EOF ;
    public final void entryRuleTextElement() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleTextElement EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleTextElement EOF
            {
             before(grammarAccess.getTextElementRule()); 
            pushFollow(FOLLOW_ruleTextElement_in_entryRuleTextElement421);
            ruleTextElement();

            state._fsp--;

             after(grammarAccess.getTextElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextElement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextElement"


    // $ANTLR start "ruleTextElement"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleTextElement : ( ( rule__TextElement__ElementAssignment ) ) ;
    public final void ruleTextElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__TextElement__ElementAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__TextElement__ElementAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__TextElement__ElementAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__TextElement__ElementAssignment )
            {
             before(grammarAccess.getTextElementAccess().getElementAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__TextElement__ElementAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__TextElement__ElementAssignment
            {
            pushFollow(FOLLOW_rule__TextElement__ElementAssignment_in_ruleTextElement454);
            rule__TextElement__ElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextElementAccess().getElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextElement"


    // $ANTLR start "entryRuleHeading"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleHeading : ruleHeading EOF ;
    public final void entryRuleHeading() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleHeading EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleHeading EOF
            {
             before(grammarAccess.getHeadingRule()); 
            pushFollow(FOLLOW_ruleHeading_in_entryRuleHeading481);
            ruleHeading();

            state._fsp--;

             after(grammarAccess.getHeadingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleHeading : ( ( rule__Heading__HeadingAssignment ) ) ;
    public final void ruleHeading() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Heading__HeadingAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Heading__HeadingAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Heading__HeadingAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Heading__HeadingAssignment )
            {
             before(grammarAccess.getHeadingAccess().getHeadingAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Heading__HeadingAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Heading__HeadingAssignment
            {
            pushFollow(FOLLOW_rule__Heading__HeadingAssignment_in_ruleHeading514);
            rule__Heading__HeadingAssignment();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getHeadingAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleHeading1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleHeading1 : ruleHeading1 EOF ;
    public final void entryRuleHeading1() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleHeading1 EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleHeading1 EOF
            {
             before(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading1541);
            ruleHeading1();

            state._fsp--;

             after(grammarAccess.getHeading1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading1548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading1"


    // $ANTLR start "ruleHeading1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleHeading1 : ( ( rule__Heading1__Group__0 ) ) ;
    public final void ruleHeading1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Heading1__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Heading1__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Heading1__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Heading1__Group__0 )
            {
             before(grammarAccess.getHeading1Access().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Heading1__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Heading1__Group__0
            {
            pushFollow(FOLLOW_rule__Heading1__Group__0_in_ruleHeading1574);
            rule__Heading1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeading1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading1"


    // $ANTLR start "entryRuleHeading2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleHeading2 : ruleHeading2 EOF ;
    public final void entryRuleHeading2() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleHeading2 EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleHeading2 EOF
            {
             before(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading2601);
            ruleHeading2();

            state._fsp--;

             after(grammarAccess.getHeading2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading2608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading2"


    // $ANTLR start "ruleHeading2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleHeading2 : ( ( rule__Heading2__Group__0 ) ) ;
    public final void ruleHeading2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Heading2__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Heading2__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Heading2__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Heading2__Group__0 )
            {
             before(grammarAccess.getHeading2Access().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Heading2__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Heading2__Group__0
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0_in_ruleHeading2634);
            rule__Heading2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeading2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading2"


    // $ANTLR start "entryRuleHeading3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleHeading3 : ruleHeading3 EOF ;
    public final void entryRuleHeading3() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleHeading3 EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleHeading3 EOF
            {
             before(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading3661);
            ruleHeading3();

            state._fsp--;

             after(grammarAccess.getHeading3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading3668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading3"


    // $ANTLR start "ruleHeading3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleHeading3 : ( ( rule__Heading3__Group__0 ) ) ;
    public final void ruleHeading3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Heading3__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Heading3__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Heading3__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Heading3__Group__0 )
            {
             before(grammarAccess.getHeading3Access().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Heading3__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Heading3__Group__0
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0_in_ruleHeading3694);
            rule__Heading3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeading3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading3"


    // $ANTLR start "entryRuleHeading4"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleHeading4 : ruleHeading4 EOF ;
    public final void entryRuleHeading4() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleHeading4 EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleHeading4 EOF
            {
             before(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading4721);
            ruleHeading4();

            state._fsp--;

             after(grammarAccess.getHeading4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading4728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeading4"


    // $ANTLR start "ruleHeading4"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleHeading4 : ( ( rule__Heading4__Group__0 ) ) ;
    public final void ruleHeading4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__Heading4__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Heading4__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Heading4__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Heading4__Group__0 )
            {
             before(grammarAccess.getHeading4Access().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Heading4__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__Heading4__Group__0
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0_in_ruleHeading4754);
            rule__Heading4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeading4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeading4"


    // $ANTLR start "entryRuleList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleList EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList781);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleList : ( ( rule__List__ListAssignment ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__List__ListAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__List__ListAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__List__ListAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__List__ListAssignment )
            {
             before(grammarAccess.getListAccess().getListAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__List__ListAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__List__ListAssignment
            {
            pushFollow(FOLLOW_rule__List__ListAssignment_in_ruleList814);
            rule__List__ListAssignment();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getListAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleOrderedList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleOrderedList EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList841);
            ruleOrderedList();

            state._fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderedList"


    // $ANTLR start "ruleOrderedList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleOrderedList : ( ( rule__OrderedList__ItemsAssignment ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__OrderedList__ItemsAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__OrderedList__ItemsAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__OrderedList__ItemsAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__OrderedList__ItemsAssignment )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__OrderedList__ItemsAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__OrderedList__ItemsAssignment
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_in_ruleOrderedList874);
            rule__OrderedList__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderedList"


    // $ANTLR start "entryRuleUnorderedList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleUnorderedList EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList901);
            ruleUnorderedList();

            state._fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedList"


    // $ANTLR start "ruleUnorderedList"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleUnorderedList : ( ( rule__UnorderedList__ItemsAssignment ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__UnorderedList__ItemsAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__UnorderedList__ItemsAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__UnorderedList__ItemsAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__UnorderedList__ItemsAssignment )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__UnorderedList__ItemsAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__UnorderedList__ItemsAssignment
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_in_ruleUnorderedList934);
            rule__UnorderedList__ItemsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnorderedList"


    // $ANTLR start "entryRuleOrderedListItem"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleOrderedListItem : ruleOrderedListItem EOF ;
    public final void entryRuleOrderedListItem() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleOrderedListItem EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleOrderedListItem EOF
            {
             before(grammarAccess.getOrderedListItemRule()); 
            pushFollow(FOLLOW_ruleOrderedListItem_in_entryRuleOrderedListItem961);
            ruleOrderedListItem();

            state._fsp--;

             after(grammarAccess.getOrderedListItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedListItem968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderedListItem"


    // $ANTLR start "ruleOrderedListItem"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleOrderedListItem : ( ( rule__OrderedListItem__Group__0 ) ) ;
    public final void ruleOrderedListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__OrderedListItem__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__OrderedListItem__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__OrderedListItem__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__OrderedListItem__Group__0 )
            {
             before(grammarAccess.getOrderedListItemAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__OrderedListItem__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__OrderedListItem__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedListItem__Group__0_in_ruleOrderedListItem994);
            rule__OrderedListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderedListItem"


    // $ANTLR start "entryRuleUnorderedListItem"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: entryRuleUnorderedListItem : ruleUnorderedListItem EOF ;
    public final void entryRuleUnorderedListItem() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ruleUnorderedListItem EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ruleUnorderedListItem EOF
            {
             before(grammarAccess.getUnorderedListItemRule()); 
            pushFollow(FOLLOW_ruleUnorderedListItem_in_entryRuleUnorderedListItem1021);
            ruleUnorderedListItem();

            state._fsp--;

             after(grammarAccess.getUnorderedListItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedListItem1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnorderedListItem"


    // $ANTLR start "ruleUnorderedListItem"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:1: ruleUnorderedListItem : ( ( rule__UnorderedListItem__Group__0 ) ) ;
    public final void ruleUnorderedListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:521:2: ( ( ( rule__UnorderedListItem__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__UnorderedListItem__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:522:1: ( ( rule__UnorderedListItem__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: ( rule__UnorderedListItem__Group__0 )
            {
             before(grammarAccess.getUnorderedListItemAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__UnorderedListItem__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: rule__UnorderedListItem__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedListItem__Group__0_in_ruleUnorderedListItem1054);
            rule__UnorderedListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnorderedListItem"


    // $ANTLR start "entryRuleItalicText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: entryRuleItalicText : ruleItalicText EOF ;
    public final void entryRuleItalicText() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( ruleItalicText EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: ruleItalicText EOF
            {
             before(grammarAccess.getItalicTextRule()); 
            pushFollow(FOLLOW_ruleItalicText_in_entryRuleItalicText1081);
            ruleItalicText();

            state._fsp--;

             after(grammarAccess.getItalicTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicText1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItalicText"


    // $ANTLR start "ruleItalicText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ruleItalicText : ( ( rule__ItalicText__Group__0 ) ) ;
    public final void ruleItalicText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:2: ( ( ( rule__ItalicText__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__ItalicText__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( rule__ItalicText__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( rule__ItalicText__Group__0 )
            {
             before(grammarAccess.getItalicTextAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__ItalicText__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:2: rule__ItalicText__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicText__Group__0_in_ruleItalicText1114);
            rule__ItalicText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalicText"


    // $ANTLR start "entryRuleBoldText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: entryRuleBoldText : ruleBoldText EOF ;
    public final void entryRuleBoldText() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( ruleBoldText EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruleBoldText EOF
            {
             before(grammarAccess.getBoldTextRule()); 
            pushFollow(FOLLOW_ruleBoldText_in_entryRuleBoldText1141);
            ruleBoldText();

            state._fsp--;

             after(grammarAccess.getBoldTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldText1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoldText"


    // $ANTLR start "ruleBoldText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ruleBoldText : ( ( rule__BoldText__Group__0 ) ) ;
    public final void ruleBoldText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: ( ( ( rule__BoldText__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__BoldText__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( rule__BoldText__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__BoldText__Group__0 )
            {
             before(grammarAccess.getBoldTextAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__BoldText__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:2: rule__BoldText__Group__0
            {
            pushFollow(FOLLOW_rule__BoldText__Group__0_in_ruleBoldText1174);
            rule__BoldText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoldText"


    // $ANTLR start "entryRuleItalicBoldText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: entryRuleItalicBoldText : ruleItalicBoldText EOF ;
    public final void entryRuleItalicBoldText() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: ( ruleItalicBoldText EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: ruleItalicBoldText EOF
            {
             before(grammarAccess.getItalicBoldTextRule()); 
            pushFollow(FOLLOW_ruleItalicBoldText_in_entryRuleItalicBoldText1201);
            ruleItalicBoldText();

            state._fsp--;

             after(grammarAccess.getItalicBoldTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBoldText1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItalicBoldText"


    // $ANTLR start "ruleItalicBoldText"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ruleItalicBoldText : ( ( rule__ItalicBoldText__Group__0 ) ) ;
    public final void ruleItalicBoldText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: ( ( ( rule__ItalicBoldText__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__ItalicBoldText__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( ( rule__ItalicBoldText__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( rule__ItalicBoldText__Group__0 )
            {
             before(grammarAccess.getItalicBoldTextAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( rule__ItalicBoldText__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:608:2: rule__ItalicBoldText__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__Group__0_in_ruleItalicBoldText1234);
            rule__ItalicBoldText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicBoldTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalicBoldText"


    // $ANTLR start "entryRuleBlockQuote"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: entryRuleBlockQuote : ruleBlockQuote EOF ;
    public final void entryRuleBlockQuote() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( ruleBlockQuote EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ruleBlockQuote EOF
            {
             before(grammarAccess.getBlockQuoteRule()); 
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote1261);
            ruleBlockQuote();

            state._fsp--;

             after(grammarAccess.getBlockQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockQuote"


    // $ANTLR start "ruleBlockQuote"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ruleBlockQuote : ( ( rule__BlockQuote__Group__0 ) ) ;
    public final void ruleBlockQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: ( ( ( rule__BlockQuote__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__BlockQuote__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( ( rule__BlockQuote__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__BlockQuote__Group__0 )
            {
             before(grammarAccess.getBlockQuoteAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( rule__BlockQuote__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:636:2: rule__BlockQuote__Group__0
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0_in_ruleBlockQuote1294);
            rule__BlockQuote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockQuoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockQuote"


    // $ANTLR start "entryRuleExternalLink"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: entryRuleExternalLink : ruleExternalLink EOF ;
    public final void entryRuleExternalLink() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleExternalLink EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleExternalLink EOF
            {
             before(grammarAccess.getExternalLinkRule()); 
            pushFollow(FOLLOW_ruleExternalLink_in_entryRuleExternalLink1321);
            ruleExternalLink();

            state._fsp--;

             after(grammarAccess.getExternalLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLink1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalLink"


    // $ANTLR start "ruleExternalLink"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ruleExternalLink : ( ( rule__ExternalLink__Group__0 ) ) ;
    public final void ruleExternalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: ( ( ( rule__ExternalLink__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__ExternalLink__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ( ( rule__ExternalLink__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rule__ExternalLink__Group__0 )
            {
             before(grammarAccess.getExternalLinkAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__ExternalLink__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:2: rule__ExternalLink__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__0_in_ruleExternalLink1354);
            rule__ExternalLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalLink"


    // $ANTLR start "entryRuleInternalLink"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: entryRuleInternalLink : ruleInternalLink EOF ;
    public final void entryRuleInternalLink() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:1: ( ruleInternalLink EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ruleInternalLink EOF
            {
             before(grammarAccess.getInternalLinkRule()); 
            pushFollow(FOLLOW_ruleInternalLink_in_entryRuleInternalLink1381);
            ruleInternalLink();

            state._fsp--;

             after(grammarAccess.getInternalLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLink1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternalLink"


    // $ANTLR start "ruleInternalLink"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ruleInternalLink : ( ( rule__InternalLink__Group__0 ) ) ;
    public final void ruleInternalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: ( ( ( rule__InternalLink__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__InternalLink__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( rule__InternalLink__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( rule__InternalLink__Group__0 )
            {
             before(grammarAccess.getInternalLinkAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( rule__InternalLink__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:2: rule__InternalLink__Group__0
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__0_in_ruleInternalLink1414);
            rule__InternalLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalLink"


    // $ANTLR start "entryRuleFile"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: ( ruleFile EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1441);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: ( ( ( rule__File__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__File__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( rule__File__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__File__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile1474);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleCategory"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ruleCategory EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory1501);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__Category__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( ( rule__Category__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__Category__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory1534);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleTemplate"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( ruleTemplate EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate1561);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:2: ( ( ( rule__Template__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__Template__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( ( rule__Template__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( rule__Template__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:2: rule__Template__Group__0
            {
            pushFollow(FOLLOW_rule__Template__Group__0_in_ruleTemplate1594);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleTemplateType"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: entryRuleTemplateType : ruleTemplateType EOF ;
    public final void entryRuleTemplateType() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ruleTemplateType EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ruleTemplateType EOF
            {
             before(grammarAccess.getTemplateTypeRule()); 
            pushFollow(FOLLOW_ruleTemplateType_in_entryRuleTemplateType1621);
            ruleTemplateType();

            state._fsp--;

             after(grammarAccess.getTemplateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateType1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplateType"


    // $ANTLR start "ruleTemplateType"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ruleTemplateType : ( ( rule__TemplateType__TypeAssignment ) ) ;
    public final void ruleTemplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:2: ( ( ( rule__TemplateType__TypeAssignment ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__TemplateType__TypeAssignment ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: ( ( rule__TemplateType__TypeAssignment ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__TemplateType__TypeAssignment )
            {
             before(grammarAccess.getTemplateTypeAccess().getTypeAssignment()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__TemplateType__TypeAssignment )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:2: rule__TemplateType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__TemplateType__TypeAssignment_in_ruleTemplateType1654);
            rule__TemplateType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTemplateTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateType"


    // $ANTLR start "entryRuleMetadata"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: entryRuleMetadata : ruleMetadata EOF ;
    public final void entryRuleMetadata() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( ruleMetadata EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ruleMetadata EOF
            {
             before(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata1681);
            ruleMetadata();

            state._fsp--;

             after(grammarAccess.getMetadataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ruleMetadata : ( ( rule__Metadata__Group__0 ) ) ;
    public final void ruleMetadata() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:2: ( ( ( rule__Metadata__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Metadata__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( rule__Metadata__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__Metadata__Group__0 )
            {
             before(grammarAccess.getMetadataAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Metadata__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:2: rule__Metadata__Group__0
            {
            pushFollow(FOLLOW_rule__Metadata__Group__0_in_ruleMetadata1714);
            rule__Metadata__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "entryRuleAbout"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: entryRuleAbout : ruleAbout EOF ;
    public final void entryRuleAbout() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ruleAbout EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ruleAbout EOF
            {
             before(grammarAccess.getAboutRule()); 
            pushFollow(FOLLOW_ruleAbout_in_entryRuleAbout1741);
            ruleAbout();

            state._fsp--;

             after(grammarAccess.getAboutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbout1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbout"


    // $ANTLR start "ruleAbout"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ruleAbout : ( ( rule__About__Group__0 ) ) ;
    public final void ruleAbout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:2: ( ( ( rule__About__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__About__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( rule__About__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( rule__About__Group__0 )
            {
             before(grammarAccess.getAboutAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( rule__About__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:2: rule__About__Group__0
            {
            pushFollow(FOLLOW_rule__About__Group__0_in_ruleAbout1774);
            rule__About__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAboutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbout"


    // $ANTLR start "entryRuleActualInformation"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: entryRuleActualInformation : ruleActualInformation EOF ;
    public final void entryRuleActualInformation() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ruleActualInformation EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ruleActualInformation EOF
            {
             before(grammarAccess.getActualInformationRule()); 
            pushFollow(FOLLOW_ruleActualInformation_in_entryRuleActualInformation1801);
            ruleActualInformation();

            state._fsp--;

             after(grammarAccess.getActualInformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualInformation1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActualInformation"


    // $ANTLR start "ruleActualInformation"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ruleActualInformation : ( ( rule__ActualInformation__Group__0 ) ) ;
    public final void ruleActualInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:2: ( ( ( rule__ActualInformation__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__ActualInformation__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( ( rule__ActualInformation__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__ActualInformation__Group__0 )
            {
             before(grammarAccess.getActualInformationAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( rule__ActualInformation__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:2: rule__ActualInformation__Group__0
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__0_in_ruleActualInformation1834);
            rule__ActualInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActualInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActualInformation"


    // $ANTLR start "entryRuleMainInformation"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: entryRuleMainInformation : ruleMainInformation EOF ;
    public final void entryRuleMainInformation() throws RecognitionException {
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ruleMainInformation EOF )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ruleMainInformation EOF
            {
             before(grammarAccess.getMainInformationRule()); 
            pushFollow(FOLLOW_ruleMainInformation_in_entryRuleMainInformation1861);
            ruleMainInformation();

            state._fsp--;

             after(grammarAccess.getMainInformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainInformation1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainInformation"


    // $ANTLR start "ruleMainInformation"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ruleMainInformation : ( ( rule__MainInformation__Group__0 ) ) ;
    public final void ruleMainInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: ( ( ( rule__MainInformation__Group__0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__MainInformation__Group__0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( ( rule__MainInformation__Group__0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__MainInformation__Group__0 )
            {
             before(grammarAccess.getMainInformationAccess().getGroup()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: ( rule__MainInformation__Group__0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:2: rule__MainInformation__Group__0
            {
            pushFollow(FOLLOW_rule__MainInformation__Group__0_in_ruleMainInformation1894);
            rule__MainInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainInformation"


    // $ANTLR start "rule__FormattedText__FormattedTextAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: rule__FormattedText__FormattedTextAlternatives_0 : ( ( ruleItalicText ) | ( ruleBoldText ) | ( ruleItalicBoldText ) | ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) );
    public final void rule__FormattedText__FormattedTextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( ruleItalicText ) | ( ruleBoldText ) | ( ruleItalicBoldText ) | ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 27:
                {
                alt1=5;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ruleItalicText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ruleItalicText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ruleItalicText
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextItalicTextParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleItalicText_in_rule__FormattedText__FormattedTextAlternatives_01930);
                    ruleItalicText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextItalicTextParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ruleBoldText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ruleBoldText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ruleBoldText
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextBoldTextParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleBoldText_in_rule__FormattedText__FormattedTextAlternatives_01947);
                    ruleBoldText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextBoldTextParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:6: ( ruleItalicBoldText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:6: ( ruleItalicBoldText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ruleItalicBoldText
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextItalicBoldTextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleItalicBoldText_in_rule__FormattedText__FormattedTextAlternatives_01964);
                    ruleItalicBoldText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextItalicBoldTextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( ruleInternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( ruleInternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ruleInternalLink
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextInternalLinkParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleInternalLink_in_rule__FormattedText__FormattedTextAlternatives_01981);
                    ruleInternalLink();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextInternalLinkParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ruleExternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ruleExternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ruleExternalLink
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextExternalLinkParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_ruleExternalLink_in_rule__FormattedText__FormattedTextAlternatives_01998);
                    ruleExternalLink();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextExternalLinkParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:6: ( ruleUnformattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:6: ( ruleUnformattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: ruleUnformattedText
                    {
                     before(grammarAccess.getFormattedTextAccess().getFormattedTextUnformattedTextParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_ruleUnformattedText_in_rule__FormattedText__FormattedTextAlternatives_02015);
                    ruleUnformattedText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextAccess().getFormattedTextUnformattedTextParserRuleCall_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormattedText__FormattedTextAlternatives_0"


    // $ANTLR start "rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 : ( ( ruleItalicText ) | ( ruleBoldText ) | ( ruleItalicBoldText ) | ( ruleUnformattedText ) );
    public final void rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ( ruleItalicText ) | ( ruleBoldText ) | ( ruleItalicBoldText ) | ( ruleUnformattedText ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ruleItalicText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ruleItalicText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ruleItalicText
                    {
                     before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicTextParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleItalicText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02047);
                    ruleItalicText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicTextParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:6: ( ruleBoldText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:985:6: ( ruleBoldText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ruleBoldText
                    {
                     before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksBoldTextParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleBoldText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02064);
                    ruleBoldText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksBoldTextParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:6: ( ruleItalicBoldText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:991:6: ( ruleItalicBoldText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:992:1: ruleItalicBoldText
                    {
                     before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicBoldTextParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleItalicBoldText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02081);
                    ruleItalicBoldText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksItalicBoldTextParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:6: ( ruleUnformattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:6: ( ruleUnformattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ruleUnformattedText
                    {
                     before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksUnformattedTextParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleUnformattedText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02098);
                    ruleUnformattedText();

                    state._fsp--;

                     after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksUnformattedTextParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0"


    // $ANTLR start "rule__AbstractElement__ElementAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: rule__AbstractElement__ElementAlternatives_0 : ( ( ruleTemplate ) | ( ruleHeading ) | ( ruleTextElement ) | ( ruleComment ) );
    public final void rule__AbstractElement__ElementAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( ( ruleTemplate ) | ( ruleHeading ) | ( ruleTextElement ) | ( ruleComment ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt3=1;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt3=2;
                }
                break;
            case RULE_CUSTOM_STRING:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 30:
            case 33:
                {
                alt3=3;
                }
                break;
            case RULE_WIKI_COMMENT:
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
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ruleTemplate )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ruleTemplate )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ruleTemplate
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementTemplateParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleTemplate_in_rule__AbstractElement__ElementAlternatives_02130);
                    ruleTemplate();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementTemplateParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:6: ( ruleHeading )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:6: ( ruleHeading )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: ruleHeading
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementHeadingParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleHeading_in_rule__AbstractElement__ElementAlternatives_02147);
                    ruleHeading();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementHeadingParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:6: ( ruleTextElement )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:6: ( ruleTextElement )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ruleTextElement
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementTextElementParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleTextElement_in_rule__AbstractElement__ElementAlternatives_02164);
                    ruleTextElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementTextElementParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:6: ( ruleComment )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:6: ( ruleComment )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ruleComment
                    {
                     before(grammarAccess.getAbstractElementAccess().getElementCommentParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__AbstractElement__ElementAlternatives_02181);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getElementCommentParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__ElementAlternatives_0"


    // $ANTLR start "rule__TextElement__ElementAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: rule__TextElement__ElementAlternatives_0 : ( ( ruleBlockQuote ) | ( ruleFile ) | ( ruleList ) | ( ruleFormattedText ) );
    public final void rule__TextElement__ElementAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( ruleBlockQuote ) | ( ruleFile ) | ( ruleList ) | ( ruleFormattedText ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 20:
            case 21:
                {
                alt4=3;
                }
                break;
            case RULE_CUSTOM_STRING:
            case 22:
            case 23:
            case 24:
            case 27:
            case 30:
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
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( ruleBlockQuote )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( ruleBlockQuote )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ruleBlockQuote
                    {
                     before(grammarAccess.getTextElementAccess().getElementBlockQuoteParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleBlockQuote_in_rule__TextElement__ElementAlternatives_02213);
                    ruleBlockQuote();

                    state._fsp--;

                     after(grammarAccess.getTextElementAccess().getElementBlockQuoteParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:6: ( ruleFile )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:6: ( ruleFile )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ruleFile
                    {
                     before(grammarAccess.getTextElementAccess().getElementFileParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleFile_in_rule__TextElement__ElementAlternatives_02230);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getTextElementAccess().getElementFileParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:6: ( ruleList )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:6: ( ruleList )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ruleList
                    {
                     before(grammarAccess.getTextElementAccess().getElementListParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleList_in_rule__TextElement__ElementAlternatives_02247);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTextElementAccess().getElementListParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:6: ( ruleFormattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:6: ( ruleFormattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ruleFormattedText
                    {
                     before(grammarAccess.getTextElementAccess().getElementFormattedTextParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_ruleFormattedText_in_rule__TextElement__ElementAlternatives_02264);
                    ruleFormattedText();

                    state._fsp--;

                     after(grammarAccess.getTextElementAccess().getElementFormattedTextParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__ElementAlternatives_0"


    // $ANTLR start "rule__Heading__HeadingAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__Heading__HeadingAlternatives_0 : ( ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) );
    public final void rule__Heading__HeadingAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ruleHeading2 )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ruleHeading2 )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ruleHeading2
                    {
                     before(grammarAccess.getHeadingAccess().getHeadingHeading2ParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleHeading2_in_rule__Heading__HeadingAlternatives_02296);
                    ruleHeading2();

                    state._fsp--;

                     after(grammarAccess.getHeadingAccess().getHeadingHeading2ParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:6: ( ruleHeading3 )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:6: ( ruleHeading3 )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ruleHeading3
                    {
                     before(grammarAccess.getHeadingAccess().getHeadingHeading3ParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleHeading3_in_rule__Heading__HeadingAlternatives_02313);
                    ruleHeading3();

                    state._fsp--;

                     after(grammarAccess.getHeadingAccess().getHeadingHeading3ParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:6: ( ruleHeading4 )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:6: ( ruleHeading4 )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: ruleHeading4
                    {
                     before(grammarAccess.getHeadingAccess().getHeadingHeading4ParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleHeading4_in_rule__Heading__HeadingAlternatives_02330);
                    ruleHeading4();

                    state._fsp--;

                     after(grammarAccess.getHeadingAccess().getHeadingHeading4ParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__HeadingAlternatives_0"


    // $ANTLR start "rule__List__ListAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: rule__List__ListAlternatives_0 : ( ( ruleOrderedList ) | ( ruleUnorderedList ) );
    public final void rule__List__ListAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( ( ruleOrderedList ) | ( ruleUnorderedList ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ruleOrderedList )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ruleOrderedList )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ruleOrderedList
                    {
                     before(grammarAccess.getListAccess().getListOrderedListParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__List__ListAlternatives_02362);
                    ruleOrderedList();

                    state._fsp--;

                     after(grammarAccess.getListAccess().getListOrderedListParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:6: ( ruleUnorderedList )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:6: ( ruleUnorderedList )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ruleUnorderedList
                    {
                     before(grammarAccess.getListAccess().getListUnorderedListParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__List__ListAlternatives_02379);
                    ruleUnorderedList();

                    state._fsp--;

                     after(grammarAccess.getListAccess().getListUnorderedListParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListAlternatives_0"


    // $ANTLR start "rule__OrderedListItem__ItemAlternatives_1_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: rule__OrderedListItem__ItemAlternatives_1_0 : ( ( ruleFormattedText ) | ( ruleList ) );
    public final void rule__OrderedListItem__ItemAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( ( ruleFormattedText ) | ( ruleList ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CUSTOM_STRING||(LA7_0>=22 && LA7_0<=24)||LA7_0==27||LA7_0==30) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ruleFormattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ruleFormattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ruleFormattedText
                    {
                     before(grammarAccess.getOrderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFormattedText_in_rule__OrderedListItem__ItemAlternatives_1_02411);
                    ruleFormattedText();

                    state._fsp--;

                     after(grammarAccess.getOrderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:6: ( ruleList )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:6: ( ruleList )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ruleList
                    {
                     before(grammarAccess.getOrderedListItemAccess().getItemListParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleList_in_rule__OrderedListItem__ItemAlternatives_1_02428);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getOrderedListItemAccess().getItemListParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__ItemAlternatives_1_0"


    // $ANTLR start "rule__UnorderedListItem__ItemAlternatives_1_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: rule__UnorderedListItem__ItemAlternatives_1_0 : ( ( ruleFormattedText ) | ( ruleList ) );
    public final void rule__UnorderedListItem__ItemAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: ( ( ruleFormattedText ) | ( ruleList ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CUSTOM_STRING||(LA8_0>=22 && LA8_0<=24)||LA8_0==27||LA8_0==30) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=20 && LA8_0<=21)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: ( ruleFormattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: ( ruleFormattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: ruleFormattedText
                    {
                     before(grammarAccess.getUnorderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFormattedText_in_rule__UnorderedListItem__ItemAlternatives_1_02460);
                    ruleFormattedText();

                    state._fsp--;

                     after(grammarAccess.getUnorderedListItemAccess().getItemFormattedTextParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:6: ( ruleList )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:6: ( ruleList )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ruleList
                    {
                     before(grammarAccess.getUnorderedListItemAccess().getItemListParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleList_in_rule__UnorderedListItem__ItemAlternatives_1_02477);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getUnorderedListItemAccess().getItemListParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__ItemAlternatives_1_0"


    // $ANTLR start "rule__ItalicText__ItalicTextAlternatives_1_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: rule__ItalicText__ItalicTextAlternatives_1_0 : ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) );
    public final void rule__ItalicText__ItalicTextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case RULE_CUSTOM_STRING:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ruleInternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ruleInternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ruleInternalLink
                    {
                     before(grammarAccess.getItalicTextAccess().getItalicTextInternalLinkParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleInternalLink_in_rule__ItalicText__ItalicTextAlternatives_1_02509);
                    ruleInternalLink();

                    state._fsp--;

                     after(grammarAccess.getItalicTextAccess().getItalicTextInternalLinkParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( ruleExternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:6: ( ruleExternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ruleExternalLink
                    {
                     before(grammarAccess.getItalicTextAccess().getItalicTextExternalLinkParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleExternalLink_in_rule__ItalicText__ItalicTextAlternatives_1_02526);
                    ruleExternalLink();

                    state._fsp--;

                     after(grammarAccess.getItalicTextAccess().getItalicTextExternalLinkParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( ruleUnformattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:6: ( ruleUnformattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ruleUnformattedText
                    {
                     before(grammarAccess.getItalicTextAccess().getItalicTextUnformattedTextParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleUnformattedText_in_rule__ItalicText__ItalicTextAlternatives_1_02543);
                    ruleUnformattedText();

                    state._fsp--;

                     after(grammarAccess.getItalicTextAccess().getItalicTextUnformattedTextParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__ItalicTextAlternatives_1_0"


    // $ANTLR start "rule__BoldText__BoldTextAlternatives_1_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: rule__BoldText__BoldTextAlternatives_1_0 : ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) );
    public final void rule__BoldText__BoldTextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case RULE_CUSTOM_STRING:
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
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ruleInternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( ruleInternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ruleInternalLink
                    {
                     before(grammarAccess.getBoldTextAccess().getBoldTextInternalLinkParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleInternalLink_in_rule__BoldText__BoldTextAlternatives_1_02575);
                    ruleInternalLink();

                    state._fsp--;

                     after(grammarAccess.getBoldTextAccess().getBoldTextInternalLinkParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:6: ( ruleExternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:6: ( ruleExternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ruleExternalLink
                    {
                     before(grammarAccess.getBoldTextAccess().getBoldTextExternalLinkParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleExternalLink_in_rule__BoldText__BoldTextAlternatives_1_02592);
                    ruleExternalLink();

                    state._fsp--;

                     after(grammarAccess.getBoldTextAccess().getBoldTextExternalLinkParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:6: ( ruleUnformattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:6: ( ruleUnformattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ruleUnformattedText
                    {
                     before(grammarAccess.getBoldTextAccess().getBoldTextUnformattedTextParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleUnformattedText_in_rule__BoldText__BoldTextAlternatives_1_02609);
                    ruleUnformattedText();

                    state._fsp--;

                     after(grammarAccess.getBoldTextAccess().getBoldTextUnformattedTextParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__BoldTextAlternatives_1_0"


    // $ANTLR start "rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1226:1: rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 : ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) );
    public final void rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( ruleInternalLink ) | ( ruleExternalLink ) | ( ruleUnformattedText ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 27:
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
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ruleInternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ruleInternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ruleInternalLink
                    {
                     before(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextInternalLinkParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleInternalLink_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02641);
                    ruleInternalLink();

                    state._fsp--;

                     after(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextInternalLinkParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:6: ( ruleExternalLink )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:6: ( ruleExternalLink )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ruleExternalLink
                    {
                     before(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextExternalLinkParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleExternalLink_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02658);
                    ruleExternalLink();

                    state._fsp--;

                     after(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextExternalLinkParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:6: ( ruleUnformattedText )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:6: ( ruleUnformattedText )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ruleUnformattedText
                    {
                     before(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextUnformattedTextParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleUnformattedText_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02675);
                    ruleUnformattedText();

                    state._fsp--;

                     after(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextUnformattedTextParserRuleCall_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0"


    // $ANTLR start "rule__File__ViewTypeAlternatives_2_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__File__ViewTypeAlternatives_2_0 : ( ( '|thumb' ) | ( '|frame' ) | ( '|frameless' ) );
    public final void rule__File__ViewTypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ( '|thumb' ) | ( '|frame' ) | ( '|frameless' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt12=1;
                }
                break;
            case 14:
                {
                alt12=2;
                }
                break;
            case 15:
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
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( '|thumb' )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( '|thumb' )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: '|thumb'
                    {
                     before(grammarAccess.getFileAccess().getViewTypeThumbKeyword_2_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__File__ViewTypeAlternatives_2_02708); 
                     after(grammarAccess.getFileAccess().getViewTypeThumbKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:6: ( '|frame' )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:6: ( '|frame' )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: '|frame'
                    {
                     before(grammarAccess.getFileAccess().getViewTypeFrameKeyword_2_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__File__ViewTypeAlternatives_2_02728); 
                     after(grammarAccess.getFileAccess().getViewTypeFrameKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:6: ( '|frameless' )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:6: ( '|frameless' )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: '|frameless'
                    {
                     before(grammarAccess.getFileAccess().getViewTypeFramelessKeyword_2_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__File__ViewTypeAlternatives_2_02748); 
                     after(grammarAccess.getFileAccess().getViewTypeFramelessKeyword_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ViewTypeAlternatives_2_0"


    // $ANTLR start "rule__TemplateType__TypeAlternatives_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__TemplateType__TypeAlternatives_0 : ( ( ruleMetadata ) | ( ruleMainInformation ) );
    public final void rule__TemplateType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( ruleMetadata ) | ( ruleMainInformation ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            else if ( (LA13_0==40) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ruleMetadata )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ruleMetadata )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ruleMetadata
                    {
                     before(grammarAccess.getTemplateTypeAccess().getTypeMetadataParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleMetadata_in_rule__TemplateType__TypeAlternatives_02782);
                    ruleMetadata();

                    state._fsp--;

                     after(grammarAccess.getTemplateTypeAccess().getTypeMetadataParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:6: ( ruleMainInformation )
                    {
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:6: ( ruleMainInformation )
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ruleMainInformation
                    {
                     before(grammarAccess.getTemplateTypeAccess().getTypeMainInformationParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleMainInformation_in_rule__TemplateType__TypeAlternatives_02799);
                    ruleMainInformation();

                    state._fsp--;

                     after(grammarAccess.getTemplateTypeAccess().getTypeMainInformationParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__TypeAlternatives_0"


    // $ANTLR start "rule__Document__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02829);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02832);
            rule__Document__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: rule__Document__Group__0__Impl : ( ( rule__Document__TitleAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ( ( ( rule__Document__TitleAssignment_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( rule__Document__TitleAssignment_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( rule__Document__TitleAssignment_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( rule__Document__TitleAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getTitleAssignment_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( rule__Document__TitleAssignment_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:2: rule__Document__TitleAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__TitleAssignment_0_in_rule__Document__Group__0__Impl2859);
            rule__Document__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12889);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12892);
            rule__Document__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: rule__Document__Group__1__Impl : ( ( rule__Document__ElementsAssignment_1 )* ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( ( ( rule__Document__ElementsAssignment_1 )* ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( rule__Document__ElementsAssignment_1 )* )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( rule__Document__ElementsAssignment_1 )* )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( rule__Document__ElementsAssignment_1 )*
            {
             before(grammarAccess.getDocumentAccess().getElementsAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( rule__Document__ElementsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_WIKI_COMMENT && LA14_0<=RULE_CUSTOM_STRING)||(LA14_0>=17 && LA14_0<=25)||LA14_0==27||LA14_0==30||LA14_0==33||LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:2: rule__Document__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Document__ElementsAssignment_1_in_rule__Document__Group__1__Impl2919);
            	    rule__Document__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: rule__Document__Group__2 : rule__Document__Group__2__Impl ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( rule__Document__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:2: rule__Document__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22950);
            rule__Document__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: rule__Document__Group__2__Impl : ( ( rule__Document__CategoriesAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ( ( ( rule__Document__CategoriesAssignment_2 )* ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( ( rule__Document__CategoriesAssignment_2 )* )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( ( rule__Document__CategoriesAssignment_2 )* )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( rule__Document__CategoriesAssignment_2 )*
            {
             before(grammarAccess.getDocumentAccess().getCategoriesAssignment_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( rule__Document__CategoriesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:2: rule__Document__CategoriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Document__CategoriesAssignment_2_in_rule__Document__Group__2__Impl2977);
            	    rule__Document__CategoriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getCategoriesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Heading1__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: rule__Heading1__Group__0 : rule__Heading1__Group__0__Impl rule__Heading1__Group__1 ;
    public final void rule__Heading1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( rule__Heading1__Group__0__Impl rule__Heading1__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:2: rule__Heading1__Group__0__Impl rule__Heading1__Group__1
            {
            pushFollow(FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__03014);
            rule__Heading1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__03017);
            rule__Heading1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__0"


    // $ANTLR start "rule__Heading1__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: rule__Heading1__Group__0__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ( ( '=' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( '=' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( '=' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Heading1__Group__0__Impl3045); 
             after(grammarAccess.getHeading1Access().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__0__Impl"


    // $ANTLR start "rule__Heading1__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: rule__Heading1__Group__1 : rule__Heading1__Group__1__Impl rule__Heading1__Group__2 ;
    public final void rule__Heading1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: ( rule__Heading1__Group__1__Impl rule__Heading1__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:2: rule__Heading1__Group__1__Impl rule__Heading1__Group__2
            {
            pushFollow(FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__13076);
            rule__Heading1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__13079);
            rule__Heading1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__1"


    // $ANTLR start "rule__Heading1__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: rule__Heading1__Group__1__Impl : ( ( rule__Heading1__HeadingAssignment_1 ) ) ;
    public final void rule__Heading1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( ( ( rule__Heading1__HeadingAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__Heading1__HeadingAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( rule__Heading1__HeadingAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( rule__Heading1__HeadingAssignment_1 )
            {
             before(grammarAccess.getHeading1Access().getHeadingAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( rule__Heading1__HeadingAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:2: rule__Heading1__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__Heading1__HeadingAssignment_1_in_rule__Heading1__Group__1__Impl3106);
            rule__Heading1__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading1Access().getHeadingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__1__Impl"


    // $ANTLR start "rule__Heading1__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: rule__Heading1__Group__2 : rule__Heading1__Group__2__Impl ;
    public final void rule__Heading1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: ( rule__Heading1__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1469:2: rule__Heading1__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__23136);
            rule__Heading1__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__2"


    // $ANTLR start "rule__Heading1__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: rule__Heading1__Group__2__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ( ( '=' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( '=' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: ( '=' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Heading1__Group__2__Impl3164); 
             after(grammarAccess.getHeading1Access().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__Group__2__Impl"


    // $ANTLR start "rule__Heading2__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__Heading2__Group__0 : rule__Heading2__Group__0__Impl rule__Heading2__Group__1 ;
    public final void rule__Heading2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( rule__Heading2__Group__0__Impl rule__Heading2__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:2: rule__Heading2__Group__0__Impl rule__Heading2__Group__1
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__03201);
            rule__Heading2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__03204);
            rule__Heading2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__0"


    // $ANTLR start "rule__Heading2__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__Heading2__Group__0__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( ( '==' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( '==' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( '==' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Heading2__Group__0__Impl3232); 
             after(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__0__Impl"


    // $ANTLR start "rule__Heading2__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Heading2__Group__1 : rule__Heading2__Group__1__Impl rule__Heading2__Group__2 ;
    public final void rule__Heading2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( rule__Heading2__Group__1__Impl rule__Heading2__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:2: rule__Heading2__Group__1__Impl rule__Heading2__Group__2
            {
            pushFollow(FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__13263);
            rule__Heading2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__13266);
            rule__Heading2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__1"


    // $ANTLR start "rule__Heading2__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: rule__Heading2__Group__1__Impl : ( ( rule__Heading2__HeadingAssignment_1 ) ) ;
    public final void rule__Heading2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( ( rule__Heading2__HeadingAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( rule__Heading2__HeadingAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( rule__Heading2__HeadingAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__Heading2__HeadingAssignment_1 )
            {
             before(grammarAccess.getHeading2Access().getHeadingAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: ( rule__Heading2__HeadingAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:2: rule__Heading2__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__Heading2__HeadingAssignment_1_in_rule__Heading2__Group__1__Impl3293);
            rule__Heading2__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading2Access().getHeadingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__1__Impl"


    // $ANTLR start "rule__Heading2__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: rule__Heading2__Group__2 : rule__Heading2__Group__2__Impl ;
    public final void rule__Heading2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: ( rule__Heading2__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:2: rule__Heading2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__23323);
            rule__Heading2__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__2"


    // $ANTLR start "rule__Heading2__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: rule__Heading2__Group__2__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: ( ( '==' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( '==' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: ( '==' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Heading2__Group__2__Impl3351); 
             after(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__Group__2__Impl"


    // $ANTLR start "rule__Heading3__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__Heading3__Group__0 : rule__Heading3__Group__0__Impl rule__Heading3__Group__1 ;
    public final void rule__Heading3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( rule__Heading3__Group__0__Impl rule__Heading3__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:2: rule__Heading3__Group__0__Impl rule__Heading3__Group__1
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__03388);
            rule__Heading3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__03391);
            rule__Heading3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__0"


    // $ANTLR start "rule__Heading3__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: rule__Heading3__Group__0__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( '===' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( '===' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( '===' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Heading3__Group__0__Impl3419); 
             after(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__0__Impl"


    // $ANTLR start "rule__Heading3__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: rule__Heading3__Group__1 : rule__Heading3__Group__1__Impl rule__Heading3__Group__2 ;
    public final void rule__Heading3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( rule__Heading3__Group__1__Impl rule__Heading3__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:2: rule__Heading3__Group__1__Impl rule__Heading3__Group__2
            {
            pushFollow(FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__13450);
            rule__Heading3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__13453);
            rule__Heading3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__1"


    // $ANTLR start "rule__Heading3__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: rule__Heading3__Group__1__Impl : ( ( rule__Heading3__HeadingAssignment_1 ) ) ;
    public final void rule__Heading3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( ( rule__Heading3__HeadingAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( rule__Heading3__HeadingAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( rule__Heading3__HeadingAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( rule__Heading3__HeadingAssignment_1 )
            {
             before(grammarAccess.getHeading3Access().getHeadingAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( rule__Heading3__HeadingAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:2: rule__Heading3__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__Heading3__HeadingAssignment_1_in_rule__Heading3__Group__1__Impl3480);
            rule__Heading3__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading3Access().getHeadingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__1__Impl"


    // $ANTLR start "rule__Heading3__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Heading3__Group__2 : rule__Heading3__Group__2__Impl ;
    public final void rule__Heading3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( rule__Heading3__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:2: rule__Heading3__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__23510);
            rule__Heading3__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__2"


    // $ANTLR start "rule__Heading3__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: rule__Heading3__Group__2__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ( '===' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( '===' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( '===' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Heading3__Group__2__Impl3538); 
             after(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__Group__2__Impl"


    // $ANTLR start "rule__Heading4__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: rule__Heading4__Group__0 : rule__Heading4__Group__0__Impl rule__Heading4__Group__1 ;
    public final void rule__Heading4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( rule__Heading4__Group__0__Impl rule__Heading4__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:2: rule__Heading4__Group__0__Impl rule__Heading4__Group__1
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__03575);
            rule__Heading4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__03578);
            rule__Heading4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__0"


    // $ANTLR start "rule__Heading4__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: rule__Heading4__Group__0__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ( '====' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( '====' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( '====' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Heading4__Group__0__Impl3606); 
             after(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__0__Impl"


    // $ANTLR start "rule__Heading4__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: rule__Heading4__Group__1 : rule__Heading4__Group__1__Impl rule__Heading4__Group__2 ;
    public final void rule__Heading4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ( rule__Heading4__Group__1__Impl rule__Heading4__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:2: rule__Heading4__Group__1__Impl rule__Heading4__Group__2
            {
            pushFollow(FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__13637);
            rule__Heading4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__13640);
            rule__Heading4__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__1"


    // $ANTLR start "rule__Heading4__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: rule__Heading4__Group__1__Impl : ( ( rule__Heading4__HeadingAssignment_1 ) ) ;
    public final void rule__Heading4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( ( rule__Heading4__HeadingAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Heading4__HeadingAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( rule__Heading4__HeadingAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Heading4__HeadingAssignment_1 )
            {
             before(grammarAccess.getHeading4Access().getHeadingAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Heading4__HeadingAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__Heading4__HeadingAssignment_1
            {
            pushFollow(FOLLOW_rule__Heading4__HeadingAssignment_1_in_rule__Heading4__Group__1__Impl3667);
            rule__Heading4__HeadingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading4Access().getHeadingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__1__Impl"


    // $ANTLR start "rule__Heading4__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: rule__Heading4__Group__2 : rule__Heading4__Group__2__Impl ;
    public final void rule__Heading4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( rule__Heading4__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:2: rule__Heading4__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__23697);
            rule__Heading4__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__2"


    // $ANTLR start "rule__Heading4__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1763:1: rule__Heading4__Group__2__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( '====' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( '====' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( '====' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Heading4__Group__2__Impl3725); 
             after(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__Group__2__Impl"


    // $ANTLR start "rule__OrderedListItem__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: rule__OrderedListItem__Group__0 : rule__OrderedListItem__Group__0__Impl rule__OrderedListItem__Group__1 ;
    public final void rule__OrderedListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1792:1: ( rule__OrderedListItem__Group__0__Impl rule__OrderedListItem__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:2: rule__OrderedListItem__Group__0__Impl rule__OrderedListItem__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedListItem__Group__0__Impl_in_rule__OrderedListItem__Group__03762);
            rule__OrderedListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderedListItem__Group__1_in_rule__OrderedListItem__Group__03765);
            rule__OrderedListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__Group__0"


    // $ANTLR start "rule__OrderedListItem__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__OrderedListItem__Group__0__Impl : ( '#' ) ;
    public final void rule__OrderedListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( ( '#' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( '#' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:1: ( '#' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: '#'
            {
             before(grammarAccess.getOrderedListItemAccess().getNumberSignKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__OrderedListItem__Group__0__Impl3793); 
             after(grammarAccess.getOrderedListItemAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__Group__0__Impl"


    // $ANTLR start "rule__OrderedListItem__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: rule__OrderedListItem__Group__1 : rule__OrderedListItem__Group__1__Impl ;
    public final void rule__OrderedListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( rule__OrderedListItem__Group__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:2: rule__OrderedListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedListItem__Group__1__Impl_in_rule__OrderedListItem__Group__13824);
            rule__OrderedListItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__Group__1"


    // $ANTLR start "rule__OrderedListItem__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: rule__OrderedListItem__Group__1__Impl : ( ( rule__OrderedListItem__ItemAssignment_1 ) ) ;
    public final void rule__OrderedListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( ( ( rule__OrderedListItem__ItemAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( rule__OrderedListItem__ItemAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( ( rule__OrderedListItem__ItemAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( rule__OrderedListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getOrderedListItemAccess().getItemAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( rule__OrderedListItem__ItemAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:2: rule__OrderedListItem__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderedListItem__ItemAssignment_1_in_rule__OrderedListItem__Group__1__Impl3851);
            rule__OrderedListItem__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListItemAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__Group__1__Impl"


    // $ANTLR start "rule__UnorderedListItem__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__UnorderedListItem__Group__0 : rule__UnorderedListItem__Group__0__Impl rule__UnorderedListItem__Group__1 ;
    public final void rule__UnorderedListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( rule__UnorderedListItem__Group__0__Impl rule__UnorderedListItem__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:2: rule__UnorderedListItem__Group__0__Impl rule__UnorderedListItem__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedListItem__Group__0__Impl_in_rule__UnorderedListItem__Group__03885);
            rule__UnorderedListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnorderedListItem__Group__1_in_rule__UnorderedListItem__Group__03888);
            rule__UnorderedListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__Group__0"


    // $ANTLR start "rule__UnorderedListItem__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: rule__UnorderedListItem__Group__0__Impl : ( '*' ) ;
    public final void rule__UnorderedListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( '*' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( '*' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( '*' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: '*'
            {
             before(grammarAccess.getUnorderedListItemAccess().getAsteriskKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__UnorderedListItem__Group__0__Impl3916); 
             after(grammarAccess.getUnorderedListItemAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__Group__0__Impl"


    // $ANTLR start "rule__UnorderedListItem__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__UnorderedListItem__Group__1 : rule__UnorderedListItem__Group__1__Impl ;
    public final void rule__UnorderedListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( rule__UnorderedListItem__Group__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:2: rule__UnorderedListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedListItem__Group__1__Impl_in_rule__UnorderedListItem__Group__13947);
            rule__UnorderedListItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__Group__1"


    // $ANTLR start "rule__UnorderedListItem__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: rule__UnorderedListItem__Group__1__Impl : ( ( rule__UnorderedListItem__ItemAssignment_1 ) ) ;
    public final void rule__UnorderedListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: ( ( ( rule__UnorderedListItem__ItemAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( ( rule__UnorderedListItem__ItemAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( ( rule__UnorderedListItem__ItemAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( rule__UnorderedListItem__ItemAssignment_1 )
            {
             before(grammarAccess.getUnorderedListItemAccess().getItemAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( rule__UnorderedListItem__ItemAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:2: rule__UnorderedListItem__ItemAssignment_1
            {
            pushFollow(FOLLOW_rule__UnorderedListItem__ItemAssignment_1_in_rule__UnorderedListItem__Group__1__Impl3974);
            rule__UnorderedListItem__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListItemAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__Group__1__Impl"


    // $ANTLR start "rule__ItalicText__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: rule__ItalicText__Group__0 : rule__ItalicText__Group__0__Impl rule__ItalicText__Group__1 ;
    public final void rule__ItalicText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ( rule__ItalicText__Group__0__Impl rule__ItalicText__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:2: rule__ItalicText__Group__0__Impl rule__ItalicText__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicText__Group__0__Impl_in_rule__ItalicText__Group__04008);
            rule__ItalicText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicText__Group__1_in_rule__ItalicText__Group__04011);
            rule__ItalicText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__0"


    // $ANTLR start "rule__ItalicText__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: rule__ItalicText__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1930:1: ( ( '\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( '\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1931:1: ( '\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: '\\'\\''
            {
             before(grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ItalicText__Group__0__Impl4039); 
             after(grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__0__Impl"


    // $ANTLR start "rule__ItalicText__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__ItalicText__Group__1 : rule__ItalicText__Group__1__Impl rule__ItalicText__Group__2 ;
    public final void rule__ItalicText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__ItalicText__Group__1__Impl rule__ItalicText__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__ItalicText__Group__1__Impl rule__ItalicText__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicText__Group__1__Impl_in_rule__ItalicText__Group__14070);
            rule__ItalicText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicText__Group__2_in_rule__ItalicText__Group__14073);
            rule__ItalicText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__1"


    // $ANTLR start "rule__ItalicText__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: rule__ItalicText__Group__1__Impl : ( ( rule__ItalicText__ItalicTextAssignment_1 ) ) ;
    public final void rule__ItalicText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ( ( rule__ItalicText__ItalicTextAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( ( rule__ItalicText__ItalicTextAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( ( rule__ItalicText__ItalicTextAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: ( rule__ItalicText__ItalicTextAssignment_1 )
            {
             before(grammarAccess.getItalicTextAccess().getItalicTextAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( rule__ItalicText__ItalicTextAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:2: rule__ItalicText__ItalicTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ItalicText__ItalicTextAssignment_1_in_rule__ItalicText__Group__1__Impl4100);
            rule__ItalicText__ItalicTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicTextAccess().getItalicTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__1__Impl"


    // $ANTLR start "rule__ItalicText__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__ItalicText__Group__2 : rule__ItalicText__Group__2__Impl ;
    public final void rule__ItalicText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__ItalicText__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__ItalicText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicText__Group__2__Impl_in_rule__ItalicText__Group__24130);
            rule__ItalicText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__2"


    // $ANTLR start "rule__ItalicText__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: rule__ItalicText__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: ( ( '\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( '\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( '\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: '\\'\\''
            {
             before(grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__ItalicText__Group__2__Impl4158); 
             after(grammarAccess.getItalicTextAccess().getApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__Group__2__Impl"


    // $ANTLR start "rule__BoldText__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: rule__BoldText__Group__0 : rule__BoldText__Group__0__Impl rule__BoldText__Group__1 ;
    public final void rule__BoldText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( rule__BoldText__Group__0__Impl rule__BoldText__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:2: rule__BoldText__Group__0__Impl rule__BoldText__Group__1
            {
            pushFollow(FOLLOW_rule__BoldText__Group__0__Impl_in_rule__BoldText__Group__04195);
            rule__BoldText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldText__Group__1_in_rule__BoldText__Group__04198);
            rule__BoldText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__0"


    // $ANTLR start "rule__BoldText__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__BoldText__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( ( '\\'\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( '\\'\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( '\\'\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BoldText__Group__0__Impl4226); 
             after(grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__0__Impl"


    // $ANTLR start "rule__BoldText__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__BoldText__Group__1 : rule__BoldText__Group__1__Impl rule__BoldText__Group__2 ;
    public final void rule__BoldText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( rule__BoldText__Group__1__Impl rule__BoldText__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:2: rule__BoldText__Group__1__Impl rule__BoldText__Group__2
            {
            pushFollow(FOLLOW_rule__BoldText__Group__1__Impl_in_rule__BoldText__Group__14257);
            rule__BoldText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldText__Group__2_in_rule__BoldText__Group__14260);
            rule__BoldText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__1"


    // $ANTLR start "rule__BoldText__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__BoldText__Group__1__Impl : ( ( rule__BoldText__BoldTextAssignment_1 ) ) ;
    public final void rule__BoldText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( ( ( rule__BoldText__BoldTextAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( rule__BoldText__BoldTextAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( rule__BoldText__BoldTextAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( rule__BoldText__BoldTextAssignment_1 )
            {
             before(grammarAccess.getBoldTextAccess().getBoldTextAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( rule__BoldText__BoldTextAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:2: rule__BoldText__BoldTextAssignment_1
            {
            pushFollow(FOLLOW_rule__BoldText__BoldTextAssignment_1_in_rule__BoldText__Group__1__Impl4287);
            rule__BoldText__BoldTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldTextAccess().getBoldTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__1__Impl"


    // $ANTLR start "rule__BoldText__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: rule__BoldText__Group__2 : rule__BoldText__Group__2__Impl ;
    public final void rule__BoldText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( rule__BoldText__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:2: rule__BoldText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BoldText__Group__2__Impl_in_rule__BoldText__Group__24317);
            rule__BoldText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__2"


    // $ANTLR start "rule__BoldText__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__BoldText__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ( '\\'\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( '\\'\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( '\\'\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__BoldText__Group__2__Impl4345); 
             after(grammarAccess.getBoldTextAccess().getApostropheApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__Group__2__Impl"


    // $ANTLR start "rule__ItalicBoldText__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__ItalicBoldText__Group__0 : rule__ItalicBoldText__Group__0__Impl rule__ItalicBoldText__Group__1 ;
    public final void rule__ItalicBoldText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__ItalicBoldText__Group__0__Impl rule__ItalicBoldText__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__ItalicBoldText__Group__0__Impl rule__ItalicBoldText__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__Group__0__Impl_in_rule__ItalicBoldText__Group__04382);
            rule__ItalicBoldText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBoldText__Group__1_in_rule__ItalicBoldText__Group__04385);
            rule__ItalicBoldText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__0"


    // $ANTLR start "rule__ItalicBoldText__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: rule__ItalicBoldText__Group__0__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBoldText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: ( '\\'\\'\\'\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ItalicBoldText__Group__0__Impl4413); 
             after(grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__0__Impl"


    // $ANTLR start "rule__ItalicBoldText__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: rule__ItalicBoldText__Group__1 : rule__ItalicBoldText__Group__1__Impl rule__ItalicBoldText__Group__2 ;
    public final void rule__ItalicBoldText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( rule__ItalicBoldText__Group__1__Impl rule__ItalicBoldText__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:2: rule__ItalicBoldText__Group__1__Impl rule__ItalicBoldText__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__Group__1__Impl_in_rule__ItalicBoldText__Group__14444);
            rule__ItalicBoldText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBoldText__Group__2_in_rule__ItalicBoldText__Group__14447);
            rule__ItalicBoldText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__1"


    // $ANTLR start "rule__ItalicBoldText__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: rule__ItalicBoldText__Group__1__Impl : ( ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 ) ) ;
    public final void rule__ItalicBoldText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ( ( ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 )
            {
             before(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: ( rule__ItalicBoldText__ItalicBoldTextAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:2: rule__ItalicBoldText__ItalicBoldTextAssignment_1
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__ItalicBoldTextAssignment_1_in_rule__ItalicBoldText__Group__1__Impl4474);
            rule__ItalicBoldText__ItalicBoldTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__1__Impl"


    // $ANTLR start "rule__ItalicBoldText__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: rule__ItalicBoldText__Group__2 : rule__ItalicBoldText__Group__2__Impl ;
    public final void rule__ItalicBoldText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( rule__ItalicBoldText__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:2: rule__ItalicBoldText__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__Group__2__Impl_in_rule__ItalicBoldText__Group__24504);
            rule__ItalicBoldText__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__2"


    // $ANTLR start "rule__ItalicBoldText__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__ItalicBoldText__Group__2__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBoldText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( '\\'\\'\\'\\'\\'' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__ItalicBoldText__Group__2__Impl4532); 
             after(grammarAccess.getItalicBoldTextAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__Group__2__Impl"


    // $ANTLR start "rule__BlockQuote__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: rule__BlockQuote__Group__0 : rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 ;
    public final void rule__BlockQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:2: rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__04569);
            rule__BlockQuote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__04572);
            rule__BlockQuote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__0"


    // $ANTLR start "rule__BlockQuote__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__BlockQuote__Group__0__Impl : ( '<blockquote>' ) ;
    public final void rule__BlockQuote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( ( '<blockquote>' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( '<blockquote>' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: ( '<blockquote>' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: '<blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__BlockQuote__Group__0__Impl4600); 
             after(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__0__Impl"


    // $ANTLR start "rule__BlockQuote__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: rule__BlockQuote__Group__1 : rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 ;
    public final void rule__BlockQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:2: rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__14631);
            rule__BlockQuote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__14634);
            rule__BlockQuote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__1"


    // $ANTLR start "rule__BlockQuote__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__BlockQuote__Group__1__Impl : ( ( rule__BlockQuote__BlockQuoteTextAssignment_1 ) ) ;
    public final void rule__BlockQuote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( ( ( rule__BlockQuote__BlockQuoteTextAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( ( rule__BlockQuote__BlockQuoteTextAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( ( rule__BlockQuote__BlockQuoteTextAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:1: ( rule__BlockQuote__BlockQuoteTextAssignment_1 )
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockQuoteTextAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__BlockQuote__BlockQuoteTextAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:2: rule__BlockQuote__BlockQuoteTextAssignment_1
            {
            pushFollow(FOLLOW_rule__BlockQuote__BlockQuoteTextAssignment_1_in_rule__BlockQuote__Group__1__Impl4661);
            rule__BlockQuote__BlockQuoteTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockQuoteAccess().getBlockQuoteTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__1__Impl"


    // $ANTLR start "rule__BlockQuote__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__BlockQuote__Group__2 : rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 ;
    public final void rule__BlockQuote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:2: rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__24691);
            rule__BlockQuote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__24694);
            rule__BlockQuote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__2"


    // $ANTLR start "rule__BlockQuote__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__BlockQuote__Group__2__Impl : ( ( rule__BlockQuote__AdditionalAssignment_2 )* ) ;
    public final void rule__BlockQuote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ( ( rule__BlockQuote__AdditionalAssignment_2 )* ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__BlockQuote__AdditionalAssignment_2 )* )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__BlockQuote__AdditionalAssignment_2 )* )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__BlockQuote__AdditionalAssignment_2 )*
            {
             before(grammarAccess.getBlockQuoteAccess().getAdditionalAssignment_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( rule__BlockQuote__AdditionalAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_CUSTOM_STRING||(LA16_0>=22 && LA16_0<=24)||LA16_0==27||LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__BlockQuote__AdditionalAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BlockQuote__AdditionalAssignment_2_in_rule__BlockQuote__Group__2__Impl4721);
            	    rule__BlockQuote__AdditionalAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBlockQuoteAccess().getAdditionalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__2__Impl"


    // $ANTLR start "rule__BlockQuote__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__BlockQuote__Group__3 : rule__BlockQuote__Group__3__Impl ;
    public final void rule__BlockQuote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( rule__BlockQuote__Group__3__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:2: rule__BlockQuote__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__34752);
            rule__BlockQuote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__3"


    // $ANTLR start "rule__BlockQuote__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: rule__BlockQuote__Group__3__Impl : ( '</blockquote>' ) ;
    public final void rule__BlockQuote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( ( '</blockquote>' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( '</blockquote>' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( '</blockquote>' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: '</blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__BlockQuote__Group__3__Impl4780); 
             after(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__3__Impl"


    // $ANTLR start "rule__ExternalLink__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: rule__ExternalLink__Group__0 : rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1 ;
    public final void rule__ExternalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:2: rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__0__Impl_in_rule__ExternalLink__Group__04819);
            rule__ExternalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group__1_in_rule__ExternalLink__Group__04822);
            rule__ExternalLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__0"


    // $ANTLR start "rule__ExternalLink__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: rule__ExternalLink__Group__0__Impl : ( '[' ) ;
    public final void rule__ExternalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( ( '[' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( '[' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( '[' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: '['
            {
             before(grammarAccess.getExternalLinkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ExternalLink__Group__0__Impl4850); 
             after(grammarAccess.getExternalLinkAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__0__Impl"


    // $ANTLR start "rule__ExternalLink__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: rule__ExternalLink__Group__1 : rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2 ;
    public final void rule__ExternalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: ( rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:2: rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__1__Impl_in_rule__ExternalLink__Group__14881);
            rule__ExternalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group__2_in_rule__ExternalLink__Group__14884);
            rule__ExternalLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__1"


    // $ANTLR start "rule__ExternalLink__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: rule__ExternalLink__Group__1__Impl : ( ( rule__ExternalLink__LinkNameAssignment_1 ) ) ;
    public final void rule__ExternalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ( ( ( rule__ExternalLink__LinkNameAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( ( rule__ExternalLink__LinkNameAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( ( rule__ExternalLink__LinkNameAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:1: ( rule__ExternalLink__LinkNameAssignment_1 )
            {
             before(grammarAccess.getExternalLinkAccess().getLinkNameAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( rule__ExternalLink__LinkNameAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:2: rule__ExternalLink__LinkNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalLink__LinkNameAssignment_1_in_rule__ExternalLink__Group__1__Impl4911);
            rule__ExternalLink__LinkNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAccess().getLinkNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__1__Impl"


    // $ANTLR start "rule__ExternalLink__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: rule__ExternalLink__Group__2 : rule__ExternalLink__Group__2__Impl rule__ExternalLink__Group__3 ;
    public final void rule__ExternalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( rule__ExternalLink__Group__2__Impl rule__ExternalLink__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:2: rule__ExternalLink__Group__2__Impl rule__ExternalLink__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__2__Impl_in_rule__ExternalLink__Group__24941);
            rule__ExternalLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group__3_in_rule__ExternalLink__Group__24944);
            rule__ExternalLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__2"


    // $ANTLR start "rule__ExternalLink__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: rule__ExternalLink__Group__2__Impl : ( ( rule__ExternalLink__Group_2__0 )? ) ;
    public final void rule__ExternalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( ( ( rule__ExternalLink__Group_2__0 )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( ( rule__ExternalLink__Group_2__0 )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( ( rule__ExternalLink__Group_2__0 )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:1: ( rule__ExternalLink__Group_2__0 )?
            {
             before(grammarAccess.getExternalLinkAccess().getGroup_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: ( rule__ExternalLink__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:2: rule__ExternalLink__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExternalLink__Group_2__0_in_rule__ExternalLink__Group__2__Impl4971);
                    rule__ExternalLink__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalLinkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__2__Impl"


    // $ANTLR start "rule__ExternalLink__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: rule__ExternalLink__Group__3 : rule__ExternalLink__Group__3__Impl ;
    public final void rule__ExternalLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( rule__ExternalLink__Group__3__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:2: rule__ExternalLink__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__3__Impl_in_rule__ExternalLink__Group__35002);
            rule__ExternalLink__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__3"


    // $ANTLR start "rule__ExternalLink__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__ExternalLink__Group__3__Impl : ( ']' ) ;
    public final void rule__ExternalLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( ( ']' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( ']' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: ( ']' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ']'
            {
             before(grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__ExternalLink__Group__3__Impl5030); 
             after(grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group__3__Impl"


    // $ANTLR start "rule__ExternalLink__Group_2__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: rule__ExternalLink__Group_2__0 : rule__ExternalLink__Group_2__0__Impl rule__ExternalLink__Group_2__1 ;
    public final void rule__ExternalLink__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( rule__ExternalLink__Group_2__0__Impl rule__ExternalLink__Group_2__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:2: rule__ExternalLink__Group_2__0__Impl rule__ExternalLink__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group_2__0__Impl_in_rule__ExternalLink__Group_2__05069);
            rule__ExternalLink__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group_2__1_in_rule__ExternalLink__Group_2__05072);
            rule__ExternalLink__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group_2__0"


    // $ANTLR start "rule__ExternalLink__Group_2__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: rule__ExternalLink__Group_2__0__Impl : ( ' ' ) ;
    public final void rule__ExternalLink__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: ( ( ' ' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( ' ' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( ' ' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ' '
            {
             before(grammarAccess.getExternalLinkAccess().getSpaceKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__ExternalLink__Group_2__0__Impl5100); 
             after(grammarAccess.getExternalLinkAccess().getSpaceKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalLink__Group_2__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: rule__ExternalLink__Group_2__1 : rule__ExternalLink__Group_2__1__Impl ;
    public final void rule__ExternalLink__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( rule__ExternalLink__Group_2__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:2: rule__ExternalLink__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group_2__1__Impl_in_rule__ExternalLink__Group_2__15131);
            rule__ExternalLink__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group_2__1"


    // $ANTLR start "rule__ExternalLink__Group_2__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: rule__ExternalLink__Group_2__1__Impl : ( ( rule__ExternalLink__RenamedLinkAssignment_2_1 ) ) ;
    public final void rule__ExternalLink__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ( ( ( rule__ExternalLink__RenamedLinkAssignment_2_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( ( rule__ExternalLink__RenamedLinkAssignment_2_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( ( rule__ExternalLink__RenamedLinkAssignment_2_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( rule__ExternalLink__RenamedLinkAssignment_2_1 )
            {
             before(grammarAccess.getExternalLinkAccess().getRenamedLinkAssignment_2_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: ( rule__ExternalLink__RenamedLinkAssignment_2_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:2: rule__ExternalLink__RenamedLinkAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExternalLink__RenamedLinkAssignment_2_1_in_rule__ExternalLink__Group_2__1__Impl5158);
            rule__ExternalLink__RenamedLinkAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAccess().getRenamedLinkAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__Group_2__1__Impl"


    // $ANTLR start "rule__InternalLink__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__InternalLink__Group__0 : rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1 ;
    public final void rule__InternalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:2: rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__0__Impl_in_rule__InternalLink__Group__05192);
            rule__InternalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group__1_in_rule__InternalLink__Group__05195);
            rule__InternalLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__0"


    // $ANTLR start "rule__InternalLink__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: rule__InternalLink__Group__0__Impl : ( '[[' ) ;
    public final void rule__InternalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( ( '[[' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ( '[[' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ( '[[' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: '[['
            {
             before(grammarAccess.getInternalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InternalLink__Group__0__Impl5223); 
             after(grammarAccess.getInternalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__0__Impl"


    // $ANTLR start "rule__InternalLink__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__InternalLink__Group__1 : rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2 ;
    public final void rule__InternalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:2: rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__1__Impl_in_rule__InternalLink__Group__15254);
            rule__InternalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group__2_in_rule__InternalLink__Group__15257);
            rule__InternalLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__1"


    // $ANTLR start "rule__InternalLink__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: rule__InternalLink__Group__1__Impl : ( ( rule__InternalLink__LinkNameAssignment_1 ) ) ;
    public final void rule__InternalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( ( ( rule__InternalLink__LinkNameAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( ( rule__InternalLink__LinkNameAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( ( rule__InternalLink__LinkNameAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( rule__InternalLink__LinkNameAssignment_1 )
            {
             before(grammarAccess.getInternalLinkAccess().getLinkNameAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: ( rule__InternalLink__LinkNameAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:2: rule__InternalLink__LinkNameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalLink__LinkNameAssignment_1_in_rule__InternalLink__Group__1__Impl5284);
            rule__InternalLink__LinkNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAccess().getLinkNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__1__Impl"


    // $ANTLR start "rule__InternalLink__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: rule__InternalLink__Group__2 : rule__InternalLink__Group__2__Impl rule__InternalLink__Group__3 ;
    public final void rule__InternalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( rule__InternalLink__Group__2__Impl rule__InternalLink__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:2: rule__InternalLink__Group__2__Impl rule__InternalLink__Group__3
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__2__Impl_in_rule__InternalLink__Group__25314);
            rule__InternalLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group__3_in_rule__InternalLink__Group__25317);
            rule__InternalLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__2"


    // $ANTLR start "rule__InternalLink__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: rule__InternalLink__Group__2__Impl : ( ( rule__InternalLink__Group_2__0 )? ) ;
    public final void rule__InternalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( ( ( rule__InternalLink__Group_2__0 )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( ( rule__InternalLink__Group_2__0 )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( ( rule__InternalLink__Group_2__0 )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: ( rule__InternalLink__Group_2__0 )?
            {
             before(grammarAccess.getInternalLinkAccess().getGroup_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( rule__InternalLink__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:2: rule__InternalLink__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InternalLink__Group_2__0_in_rule__InternalLink__Group__2__Impl5344);
                    rule__InternalLink__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalLinkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__2__Impl"


    // $ANTLR start "rule__InternalLink__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: rule__InternalLink__Group__3 : rule__InternalLink__Group__3__Impl ;
    public final void rule__InternalLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( rule__InternalLink__Group__3__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:2: rule__InternalLink__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__3__Impl_in_rule__InternalLink__Group__35375);
            rule__InternalLink__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__3"


    // $ANTLR start "rule__InternalLink__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: rule__InternalLink__Group__3__Impl : ( ']]' ) ;
    public final void rule__InternalLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ( ( ']]' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( ']]' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( ']]' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: ']]'
            {
             before(grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__InternalLink__Group__3__Impl5403); 
             after(grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group__3__Impl"


    // $ANTLR start "rule__InternalLink__Group_2__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: rule__InternalLink__Group_2__0 : rule__InternalLink__Group_2__0__Impl rule__InternalLink__Group_2__1 ;
    public final void rule__InternalLink__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__InternalLink__Group_2__0__Impl rule__InternalLink__Group_2__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__InternalLink__Group_2__0__Impl rule__InternalLink__Group_2__1
            {
            pushFollow(FOLLOW_rule__InternalLink__Group_2__0__Impl_in_rule__InternalLink__Group_2__05442);
            rule__InternalLink__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group_2__1_in_rule__InternalLink__Group_2__05445);
            rule__InternalLink__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group_2__0"


    // $ANTLR start "rule__InternalLink__Group_2__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2658:1: rule__InternalLink__Group_2__0__Impl : ( '|' ) ;
    public final void rule__InternalLink__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: ( ( '|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( '|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( '|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: '|'
            {
             before(grammarAccess.getInternalLinkAccess().getVerticalLineKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__InternalLink__Group_2__0__Impl5473); 
             after(grammarAccess.getInternalLinkAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group_2__0__Impl"


    // $ANTLR start "rule__InternalLink__Group_2__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__InternalLink__Group_2__1 : rule__InternalLink__Group_2__1__Impl ;
    public final void rule__InternalLink__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( rule__InternalLink__Group_2__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:2: rule__InternalLink__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__InternalLink__Group_2__1__Impl_in_rule__InternalLink__Group_2__15504);
            rule__InternalLink__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group_2__1"


    // $ANTLR start "rule__InternalLink__Group_2__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: rule__InternalLink__Group_2__1__Impl : ( ( rule__InternalLink__RenamedLinkAssignment_2_1 ) ) ;
    public final void rule__InternalLink__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( ( rule__InternalLink__RenamedLinkAssignment_2_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( ( rule__InternalLink__RenamedLinkAssignment_2_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( ( rule__InternalLink__RenamedLinkAssignment_2_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( rule__InternalLink__RenamedLinkAssignment_2_1 )
            {
             before(grammarAccess.getInternalLinkAccess().getRenamedLinkAssignment_2_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( rule__InternalLink__RenamedLinkAssignment_2_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:2: rule__InternalLink__RenamedLinkAssignment_2_1
            {
            pushFollow(FOLLOW_rule__InternalLink__RenamedLinkAssignment_2_1_in_rule__InternalLink__Group_2__1__Impl5531);
            rule__InternalLink__RenamedLinkAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAccess().getRenamedLinkAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__Group_2__1__Impl"


    // $ANTLR start "rule__File__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__05565);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__05568);
            rule__File__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: rule__File__Group__0__Impl : ( '[[File:' ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( ( '[[File:' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( '[[File:' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( '[[File:' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: '[[File:'
            {
             before(grammarAccess.getFileAccess().getFileKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__File__Group__0__Impl5596); 
             after(grammarAccess.getFileAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__15627);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__2_in_rule__File__Group__15630);
            rule__File__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: rule__File__Group__1__Impl : ( ( rule__File__FileNameAssignment_1 ) ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( ( ( rule__File__FileNameAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( ( rule__File__FileNameAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( ( rule__File__FileNameAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( rule__File__FileNameAssignment_1 )
            {
             before(grammarAccess.getFileAccess().getFileNameAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( rule__File__FileNameAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:2: rule__File__FileNameAssignment_1
            {
            pushFollow(FOLLOW_rule__File__FileNameAssignment_1_in_rule__File__Group__1__Impl5657);
            rule__File__FileNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getFileNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__25687);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__3_in_rule__File__Group__25690);
            rule__File__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: rule__File__Group__2__Impl : ( ( rule__File__ViewTypeAssignment_2 )? ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: ( ( ( rule__File__ViewTypeAssignment_2 )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ( ( rule__File__ViewTypeAssignment_2 )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ( ( rule__File__ViewTypeAssignment_2 )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( rule__File__ViewTypeAssignment_2 )?
            {
             before(grammarAccess.getFileAccess().getViewTypeAssignment_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: ( rule__File__ViewTypeAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=13 && LA19_0<=15)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:2: rule__File__ViewTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__File__ViewTypeAssignment_2_in_rule__File__Group__2__Impl5717);
                    rule__File__ViewTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getViewTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: rule__File__Group__3 : rule__File__Group__3__Impl rule__File__Group__4 ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: ( rule__File__Group__3__Impl rule__File__Group__4 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:2: rule__File__Group__3__Impl rule__File__Group__4
            {
            pushFollow(FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__35748);
            rule__File__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group__4_in_rule__File__Group__35751);
            rule__File__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:1: rule__File__Group__3__Impl : ( ( rule__File__Group_3__0 )? ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: ( ( ( rule__File__Group_3__0 )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__File__Group_3__0 )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: ( ( rule__File__Group_3__0 )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__File__Group_3__0 )?
            {
             before(grammarAccess.getFileAccess().getGroup_3()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( rule__File__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__File__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl5778);
                    rule__File__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__File__Group__4"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: rule__File__Group__4 : rule__File__Group__4__Impl ;
    public final void rule__File__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( rule__File__Group__4__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:2: rule__File__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__45809);
            rule__File__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4"


    // $ANTLR start "rule__File__Group__4__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: rule__File__Group__4__Impl : ( ']]' ) ;
    public final void rule__File__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: ( ( ']]' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( ']]' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( ']]' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ']]'
            {
             before(grammarAccess.getFileAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__File__Group__4__Impl5837); 
             after(grammarAccess.getFileAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group__4__Impl"


    // $ANTLR start "rule__File__Group_3__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: rule__File__Group_3__0 : rule__File__Group_3__0__Impl rule__File__Group_3__1 ;
    public final void rule__File__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: ( rule__File__Group_3__0__Impl rule__File__Group_3__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:2: rule__File__Group_3__0__Impl rule__File__Group_3__1
            {
            pushFollow(FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__05878);
            rule__File__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__05881);
            rule__File__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0"


    // $ANTLR start "rule__File__Group_3__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: rule__File__Group_3__0__Impl : ( '|' ) ;
    public final void rule__File__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( ( '|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( '|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( '|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:1: '|'
            {
             before(grammarAccess.getFileAccess().getVerticalLineKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__File__Group_3__0__Impl5909); 
             after(grammarAccess.getFileAccess().getVerticalLineKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__0__Impl"


    // $ANTLR start "rule__File__Group_3__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: rule__File__Group_3__1 : rule__File__Group_3__1__Impl rule__File__Group_3__2 ;
    public final void rule__File__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( rule__File__Group_3__1__Impl rule__File__Group_3__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:2: rule__File__Group_3__1__Impl rule__File__Group_3__2
            {
            pushFollow(FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__15940);
            rule__File__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__15943);
            rule__File__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1"


    // $ANTLR start "rule__File__Group_3__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__File__Group_3__1__Impl : ( ( rule__File__TextAssignment_3_1 ) ) ;
    public final void rule__File__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( ( ( rule__File__TextAssignment_3_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( ( rule__File__TextAssignment_3_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( ( rule__File__TextAssignment_3_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( rule__File__TextAssignment_3_1 )
            {
             before(grammarAccess.getFileAccess().getTextAssignment_3_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( rule__File__TextAssignment_3_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:2: rule__File__TextAssignment_3_1
            {
            pushFollow(FOLLOW_rule__File__TextAssignment_3_1_in_rule__File__Group_3__1__Impl5970);
            rule__File__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getTextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__1__Impl"


    // $ANTLR start "rule__File__Group_3__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: rule__File__Group_3__2 : rule__File__Group_3__2__Impl ;
    public final void rule__File__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: ( rule__File__Group_3__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2932:2: rule__File__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__26000);
            rule__File__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__2"


    // $ANTLR start "rule__File__Group_3__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: rule__File__Group_3__2__Impl : ( ( rule__File__AdditionalAssignment_3_2 )* ) ;
    public final void rule__File__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:1: ( ( ( rule__File__AdditionalAssignment_3_2 )* ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( rule__File__AdditionalAssignment_3_2 )* )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( rule__File__AdditionalAssignment_3_2 )* )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( rule__File__AdditionalAssignment_3_2 )*
            {
             before(grammarAccess.getFileAccess().getAdditionalAssignment_3_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: ( rule__File__AdditionalAssignment_3_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_CUSTOM_STRING||(LA21_0>=22 && LA21_0<=24)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:2: rule__File__AdditionalAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__File__AdditionalAssignment_3_2_in_rule__File__Group_3__2__Impl6027);
            	    rule__File__AdditionalAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFileAccess().getAdditionalAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__Group_3__2__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__06064);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__06067);
            rule__Category__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: rule__Category__Group__0__Impl : ( '[[Category:' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:1: ( ( '[[Category:' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( '[[Category:' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( '[[Category:' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: '[[Category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Category__Group__0__Impl6095); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2992:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2996:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__16126);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__2_in_rule__Category__Group__16129);
            rule__Category__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: rule__Category__Group__1__Impl : ( ( rule__Category__CategoryLinkAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( ( rule__Category__CategoryLinkAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ( rule__Category__CategoryLinkAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ( rule__Category__CategoryLinkAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( rule__Category__CategoryLinkAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getCategoryLinkAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( rule__Category__CategoryLinkAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:2: rule__Category__CategoryLinkAssignment_1
            {
            pushFollow(FOLLOW_rule__Category__CategoryLinkAssignment_1_in_rule__Category__Group__1__Impl6156);
            rule__Category__CategoryLinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getCategoryLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__26186);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__3_in_rule__Category__Group__26189);
            rule__Category__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: rule__Category__Group__2__Impl : ( ( '|*' )? ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ( ( ( '|*' )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( '|*' )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( '|*' )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( '|*' )?
            {
             before(grammarAccess.getCategoryAccess().getVerticalLineAsteriskKeyword_2()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( '|*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:2: '|*'
                    {
                    match(input,35,FOLLOW_35_in_rule__Category__Group__2__Impl6218); 

                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getVerticalLineAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: rule__Category__Group__3 : rule__Category__Group__3__Impl ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3056:1: ( rule__Category__Group__3__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:2: rule__Category__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__36251);
            rule__Category__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__Category__Group__3__Impl : ( ']]' ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( ( ']]' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ']]' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ']]' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ']]'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__Category__Group__3__Impl6279); 
             after(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__06318);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__06321);
            rule__Template__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: rule__Template__Group__0__Impl : ( '{{' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: ( ( '{{' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( '{{' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( '{{' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: '{{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Template__Group__0__Impl6349); 
             after(grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__16380);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__16383);
            rule__Template__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: rule__Template__Group__1__Impl : ( ( rule__Template__TemplateAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( ( ( rule__Template__TemplateAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( ( rule__Template__TemplateAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( ( rule__Template__TemplateAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( rule__Template__TemplateAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getTemplateAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( rule__Template__TemplateAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:2: rule__Template__TemplateAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__TemplateAssignment_1_in_rule__Template__Group__1__Impl6410);
            rule__Template__TemplateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getTemplateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: rule__Template__Group__2 : rule__Template__Group__2__Impl ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: ( rule__Template__Group__2__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:2: rule__Template__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__26440);
            rule__Template__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: rule__Template__Group__2__Impl : ( '}}' ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( ( '}}' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( '}}' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( '}}' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: '}}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Template__Group__2__Impl6468); 
             after(grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Metadata__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: rule__Metadata__Group__0 : rule__Metadata__Group__0__Impl rule__Metadata__Group__1 ;
    public final void rule__Metadata__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( rule__Metadata__Group__0__Impl rule__Metadata__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:2: rule__Metadata__Group__0__Impl rule__Metadata__Group__1
            {
            pushFollow(FOLLOW_rule__Metadata__Group__0__Impl_in_rule__Metadata__Group__06505);
            rule__Metadata__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Metadata__Group__1_in_rule__Metadata__Group__06508);
            rule__Metadata__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0"


    // $ANTLR start "rule__Metadata__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: rule__Metadata__Group__0__Impl : ( ( rule__Metadata__AboutAssignment_0 ) ) ;
    public final void rule__Metadata__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: ( ( ( rule__Metadata__AboutAssignment_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:1: ( ( rule__Metadata__AboutAssignment_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:1: ( ( rule__Metadata__AboutAssignment_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: ( rule__Metadata__AboutAssignment_0 )
            {
             before(grammarAccess.getMetadataAccess().getAboutAssignment_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( rule__Metadata__AboutAssignment_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:2: rule__Metadata__AboutAssignment_0
            {
            pushFollow(FOLLOW_rule__Metadata__AboutAssignment_0_in_rule__Metadata__Group__0__Impl6535);
            rule__Metadata__AboutAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetadataAccess().getAboutAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__0__Impl"


    // $ANTLR start "rule__Metadata__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: rule__Metadata__Group__1 : rule__Metadata__Group__1__Impl ;
    public final void rule__Metadata__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( rule__Metadata__Group__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:2: rule__Metadata__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Metadata__Group__1__Impl_in_rule__Metadata__Group__16565);
            rule__Metadata__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1"


    // $ANTLR start "rule__Metadata__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: rule__Metadata__Group__1__Impl : ( ( rule__Metadata__ActualInfoAssignment_1 )? ) ;
    public final void rule__Metadata__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( ( ( rule__Metadata__ActualInfoAssignment_1 )? ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( ( rule__Metadata__ActualInfoAssignment_1 )? )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( ( rule__Metadata__ActualInfoAssignment_1 )? )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: ( rule__Metadata__ActualInfoAssignment_1 )?
            {
             before(grammarAccess.getMetadataAccess().getActualInfoAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: ( rule__Metadata__ActualInfoAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:2: rule__Metadata__ActualInfoAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Metadata__ActualInfoAssignment_1_in_rule__Metadata__Group__1__Impl6592);
                    rule__Metadata__ActualInfoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetadataAccess().getActualInfoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__Group__1__Impl"


    // $ANTLR start "rule__About__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__About__Group__0 : rule__About__Group__0__Impl rule__About__Group__1 ;
    public final void rule__About__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( rule__About__Group__0__Impl rule__About__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:2: rule__About__Group__0__Impl rule__About__Group__1
            {
            pushFollow(FOLLOW_rule__About__Group__0__Impl_in_rule__About__Group__06627);
            rule__About__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__About__Group__1_in_rule__About__Group__06630);
            rule__About__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__About__Group__0"


    // $ANTLR start "rule__About__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: rule__About__Group__0__Impl : ( 'about|' ) ;
    public final void rule__About__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( ( 'about|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( 'about|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( 'about|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: 'about|'
            {
             before(grammarAccess.getAboutAccess().getAboutKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__About__Group__0__Impl6658); 
             after(grammarAccess.getAboutAccess().getAboutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__About__Group__0__Impl"


    // $ANTLR start "rule__About__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: rule__About__Group__1 : rule__About__Group__1__Impl ;
    public final void rule__About__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( rule__About__Group__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:2: rule__About__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__About__Group__1__Impl_in_rule__About__Group__16689);
            rule__About__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__About__Group__1"


    // $ANTLR start "rule__About__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: rule__About__Group__1__Impl : ( ( rule__About__AboutTextAssignment_1 ) ) ;
    public final void rule__About__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: ( ( ( rule__About__AboutTextAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( ( rule__About__AboutTextAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( ( rule__About__AboutTextAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: ( rule__About__AboutTextAssignment_1 )
            {
             before(grammarAccess.getAboutAccess().getAboutTextAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( rule__About__AboutTextAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:2: rule__About__AboutTextAssignment_1
            {
            pushFollow(FOLLOW_rule__About__AboutTextAssignment_1_in_rule__About__Group__1__Impl6716);
            rule__About__AboutTextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAboutAccess().getAboutTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__About__Group__1__Impl"


    // $ANTLR start "rule__ActualInformation__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: rule__ActualInformation__Group__0 : rule__ActualInformation__Group__0__Impl rule__ActualInformation__Group__1 ;
    public final void rule__ActualInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( rule__ActualInformation__Group__0__Impl rule__ActualInformation__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:2: rule__ActualInformation__Group__0__Impl rule__ActualInformation__Group__1
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__0__Impl_in_rule__ActualInformation__Group__06750);
            rule__ActualInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualInformation__Group__1_in_rule__ActualInformation__Group__06753);
            rule__ActualInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__0"


    // $ANTLR start "rule__ActualInformation__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: rule__ActualInformation__Group__0__Impl : ( '|' ) ;
    public final void rule__ActualInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( ( '|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( '|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( '|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: '|'
            {
             before(grammarAccess.getActualInformationAccess().getVerticalLineKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ActualInformation__Group__0__Impl6781); 
             after(grammarAccess.getActualInformationAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__0__Impl"


    // $ANTLR start "rule__ActualInformation__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: rule__ActualInformation__Group__1 : rule__ActualInformation__Group__1__Impl rule__ActualInformation__Group__2 ;
    public final void rule__ActualInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__ActualInformation__Group__1__Impl rule__ActualInformation__Group__2 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:2: rule__ActualInformation__Group__1__Impl rule__ActualInformation__Group__2
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__1__Impl_in_rule__ActualInformation__Group__16812);
            rule__ActualInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualInformation__Group__2_in_rule__ActualInformation__Group__16815);
            rule__ActualInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__1"


    // $ANTLR start "rule__ActualInformation__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: rule__ActualInformation__Group__1__Impl : ( ( rule__ActualInformation__InformationOnWhatAssignment_1 ) ) ;
    public final void rule__ActualInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( ( ( rule__ActualInformation__InformationOnWhatAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__ActualInformation__InformationOnWhatAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( ( rule__ActualInformation__InformationOnWhatAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__ActualInformation__InformationOnWhatAssignment_1 )
            {
             before(grammarAccess.getActualInformationAccess().getInformationOnWhatAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: ( rule__ActualInformation__InformationOnWhatAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__ActualInformation__InformationOnWhatAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualInformation__InformationOnWhatAssignment_1_in_rule__ActualInformation__Group__1__Impl6842);
            rule__ActualInformation__InformationOnWhatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActualInformationAccess().getInformationOnWhatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__1__Impl"


    // $ANTLR start "rule__ActualInformation__Group__2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: rule__ActualInformation__Group__2 : rule__ActualInformation__Group__2__Impl rule__ActualInformation__Group__3 ;
    public final void rule__ActualInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ( rule__ActualInformation__Group__2__Impl rule__ActualInformation__Group__3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:2: rule__ActualInformation__Group__2__Impl rule__ActualInformation__Group__3
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__2__Impl_in_rule__ActualInformation__Group__26872);
            rule__ActualInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualInformation__Group__3_in_rule__ActualInformation__Group__26875);
            rule__ActualInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__2"


    // $ANTLR start "rule__ActualInformation__Group__2__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: rule__ActualInformation__Group__2__Impl : ( '|' ) ;
    public final void rule__ActualInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( ( '|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( '|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( '|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: '|'
            {
             before(grammarAccess.getActualInformationAccess().getVerticalLineKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ActualInformation__Group__2__Impl6903); 
             after(grammarAccess.getActualInformationAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__2__Impl"


    // $ANTLR start "rule__ActualInformation__Group__3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: rule__ActualInformation__Group__3 : rule__ActualInformation__Group__3__Impl rule__ActualInformation__Group__4 ;
    public final void rule__ActualInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: ( rule__ActualInformation__Group__3__Impl rule__ActualInformation__Group__4 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:2: rule__ActualInformation__Group__3__Impl rule__ActualInformation__Group__4
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__3__Impl_in_rule__ActualInformation__Group__36934);
            rule__ActualInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualInformation__Group__4_in_rule__ActualInformation__Group__36937);
            rule__ActualInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__3"


    // $ANTLR start "rule__ActualInformation__Group__3__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: rule__ActualInformation__Group__3__Impl : ( ( rule__ActualInformation__LinkAssignment_3 ) ) ;
    public final void rule__ActualInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( ( ( rule__ActualInformation__LinkAssignment_3 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( ( rule__ActualInformation__LinkAssignment_3 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( ( rule__ActualInformation__LinkAssignment_3 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: ( rule__ActualInformation__LinkAssignment_3 )
            {
             before(grammarAccess.getActualInformationAccess().getLinkAssignment_3()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( rule__ActualInformation__LinkAssignment_3 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:2: rule__ActualInformation__LinkAssignment_3
            {
            pushFollow(FOLLOW_rule__ActualInformation__LinkAssignment_3_in_rule__ActualInformation__Group__3__Impl6964);
            rule__ActualInformation__LinkAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActualInformationAccess().getLinkAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__3__Impl"


    // $ANTLR start "rule__ActualInformation__Group__4"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: rule__ActualInformation__Group__4 : rule__ActualInformation__Group__4__Impl ;
    public final void rule__ActualInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( rule__ActualInformation__Group__4__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:2: rule__ActualInformation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group__4__Impl_in_rule__ActualInformation__Group__46994);
            rule__ActualInformation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__4"


    // $ANTLR start "rule__ActualInformation__Group__4__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: rule__ActualInformation__Group__4__Impl : ( ( rule__ActualInformation__Group_4__0 )* ) ;
    public final void rule__ActualInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( ( ( rule__ActualInformation__Group_4__0 )* ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( ( rule__ActualInformation__Group_4__0 )* )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( ( rule__ActualInformation__Group_4__0 )* )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__ActualInformation__Group_4__0 )*
            {
             before(grammarAccess.getActualInformationAccess().getGroup_4()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( rule__ActualInformation__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:2: rule__ActualInformation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ActualInformation__Group_4__0_in_rule__ActualInformation__Group__4__Impl7021);
            	    rule__ActualInformation__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getActualInformationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group__4__Impl"


    // $ANTLR start "rule__ActualInformation__Group_4__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: rule__ActualInformation__Group_4__0 : rule__ActualInformation__Group_4__0__Impl rule__ActualInformation__Group_4__1 ;
    public final void rule__ActualInformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( rule__ActualInformation__Group_4__0__Impl rule__ActualInformation__Group_4__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:2: rule__ActualInformation__Group_4__0__Impl rule__ActualInformation__Group_4__1
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group_4__0__Impl_in_rule__ActualInformation__Group_4__07062);
            rule__ActualInformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualInformation__Group_4__1_in_rule__ActualInformation__Group_4__07065);
            rule__ActualInformation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group_4__0"


    // $ANTLR start "rule__ActualInformation__Group_4__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: rule__ActualInformation__Group_4__0__Impl : ( '|and|' ) ;
    public final void rule__ActualInformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( ( '|and|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( '|and|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( '|and|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: '|and|'
            {
             before(grammarAccess.getActualInformationAccess().getAndKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__ActualInformation__Group_4__0__Impl7093); 
             after(grammarAccess.getActualInformationAccess().getAndKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group_4__0__Impl"


    // $ANTLR start "rule__ActualInformation__Group_4__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:1: rule__ActualInformation__Group_4__1 : rule__ActualInformation__Group_4__1__Impl ;
    public final void rule__ActualInformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3503:1: ( rule__ActualInformation__Group_4__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:2: rule__ActualInformation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualInformation__Group_4__1__Impl_in_rule__ActualInformation__Group_4__17124);
            rule__ActualInformation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group_4__1"


    // $ANTLR start "rule__ActualInformation__Group_4__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: rule__ActualInformation__Group_4__1__Impl : ( ( rule__ActualInformation__AdditionalLinksAssignment_4_1 ) ) ;
    public final void rule__ActualInformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( ( rule__ActualInformation__AdditionalLinksAssignment_4_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( ( rule__ActualInformation__AdditionalLinksAssignment_4_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( ( rule__ActualInformation__AdditionalLinksAssignment_4_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( rule__ActualInformation__AdditionalLinksAssignment_4_1 )
            {
             before(grammarAccess.getActualInformationAccess().getAdditionalLinksAssignment_4_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( rule__ActualInformation__AdditionalLinksAssignment_4_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:2: rule__ActualInformation__AdditionalLinksAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ActualInformation__AdditionalLinksAssignment_4_1_in_rule__ActualInformation__Group_4__1__Impl7151);
            rule__ActualInformation__AdditionalLinksAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActualInformationAccess().getAdditionalLinksAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__Group_4__1__Impl"


    // $ANTLR start "rule__MainInformation__Group__0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:1: rule__MainInformation__Group__0 : rule__MainInformation__Group__0__Impl rule__MainInformation__Group__1 ;
    public final void rule__MainInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( rule__MainInformation__Group__0__Impl rule__MainInformation__Group__1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:2: rule__MainInformation__Group__0__Impl rule__MainInformation__Group__1
            {
            pushFollow(FOLLOW_rule__MainInformation__Group__0__Impl_in_rule__MainInformation__Group__07185);
            rule__MainInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainInformation__Group__1_in_rule__MainInformation__Group__07188);
            rule__MainInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainInformation__Group__0"


    // $ANTLR start "rule__MainInformation__Group__0__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: rule__MainInformation__Group__0__Impl : ( 'main|' ) ;
    public final void rule__MainInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:1: ( ( 'main|' ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:1: ( 'main|' )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3548:1: ( 'main|' )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: 'main|'
            {
             before(grammarAccess.getMainInformationAccess().getMainKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__MainInformation__Group__0__Impl7216); 
             after(grammarAccess.getMainInformationAccess().getMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainInformation__Group__0__Impl"


    // $ANTLR start "rule__MainInformation__Group__1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: rule__MainInformation__Group__1 : rule__MainInformation__Group__1__Impl ;
    public final void rule__MainInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( rule__MainInformation__Group__1__Impl )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:2: rule__MainInformation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MainInformation__Group__1__Impl_in_rule__MainInformation__Group__17247);
            rule__MainInformation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainInformation__Group__1"


    // $ANTLR start "rule__MainInformation__Group__1__Impl"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: rule__MainInformation__Group__1__Impl : ( ( rule__MainInformation__LinkAssignment_1 ) ) ;
    public final void rule__MainInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:1: ( ( ( rule__MainInformation__LinkAssignment_1 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3578:1: ( ( rule__MainInformation__LinkAssignment_1 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3578:1: ( ( rule__MainInformation__LinkAssignment_1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: ( rule__MainInformation__LinkAssignment_1 )
            {
             before(grammarAccess.getMainInformationAccess().getLinkAssignment_1()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( rule__MainInformation__LinkAssignment_1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:2: rule__MainInformation__LinkAssignment_1
            {
            pushFollow(FOLLOW_rule__MainInformation__LinkAssignment_1_in_rule__MainInformation__Group__1__Impl7274);
            rule__MainInformation__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainInformationAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainInformation__Group__1__Impl"


    // $ANTLR start "rule__Document__TitleAssignment_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: rule__Document__TitleAssignment_0 : ( ruleHeading1 ) ;
    public final void rule__Document__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: ( ( ruleHeading1 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ruleHeading1 )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ruleHeading1 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ruleHeading1
            {
             before(grammarAccess.getDocumentAccess().getTitleHeading1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeading1_in_rule__Document__TitleAssignment_07313);
            ruleHeading1();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getTitleHeading1ParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__TitleAssignment_0"


    // $ANTLR start "rule__Document__ElementsAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: rule__Document__ElementsAssignment_1 : ( ruleAbstractElement ) ;
    public final void rule__Document__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: ( ( ruleAbstractElement ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: ( ruleAbstractElement )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: ( ruleAbstractElement )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ruleAbstractElement
            {
             before(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Document__ElementsAssignment_17344);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getElementsAbstractElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__ElementsAssignment_1"


    // $ANTLR start "rule__Document__CategoriesAssignment_2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: rule__Document__CategoriesAssignment_2 : ( ruleCategory ) ;
    public final void rule__Document__CategoriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( ruleCategory ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( ruleCategory )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( ruleCategory )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ruleCategory
            {
             before(grammarAccess.getDocumentAccess().getCategoriesCategoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCategory_in_rule__Document__CategoriesAssignment_27375);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getCategoriesCategoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__CategoriesAssignment_2"


    // $ANTLR start "rule__Comment__CommentAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: rule__Comment__CommentAssignment : ( RULE_WIKI_COMMENT ) ;
    public final void rule__Comment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: ( ( RULE_WIKI_COMMENT ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( RULE_WIKI_COMMENT )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( RULE_WIKI_COMMENT )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: RULE_WIKI_COMMENT
            {
             before(grammarAccess.getCommentAccess().getCommentWIKI_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_WIKI_COMMENT,FOLLOW_RULE_WIKI_COMMENT_in_rule__Comment__CommentAssignment7406); 
             after(grammarAccess.getCommentAccess().getCommentWIKI_COMMENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__CommentAssignment"


    // $ANTLR start "rule__UnformattedText__TextAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: rule__UnformattedText__TextAssignment : ( RULE_CUSTOM_STRING ) ;
    public final void rule__UnformattedText__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: ( ( RULE_CUSTOM_STRING ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( RULE_CUSTOM_STRING )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( RULE_CUSTOM_STRING )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: RULE_CUSTOM_STRING
            {
             before(grammarAccess.getUnformattedTextAccess().getTextCUSTOM_STRINGTerminalRuleCall_0()); 
            match(input,RULE_CUSTOM_STRING,FOLLOW_RULE_CUSTOM_STRING_in_rule__UnformattedText__TextAssignment7437); 
             after(grammarAccess.getUnformattedTextAccess().getTextCUSTOM_STRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnformattedText__TextAssignment"


    // $ANTLR start "rule__FormattedText__FormattedTextAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:1: rule__FormattedText__FormattedTextAssignment : ( ( rule__FormattedText__FormattedTextAlternatives_0 ) ) ;
    public final void rule__FormattedText__FormattedTextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: ( ( ( rule__FormattedText__FormattedTextAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( ( rule__FormattedText__FormattedTextAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( ( rule__FormattedText__FormattedTextAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( rule__FormattedText__FormattedTextAlternatives_0 )
            {
             before(grammarAccess.getFormattedTextAccess().getFormattedTextAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( rule__FormattedText__FormattedTextAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:2: rule__FormattedText__FormattedTextAlternatives_0
            {
            pushFollow(FOLLOW_rule__FormattedText__FormattedTextAlternatives_0_in_rule__FormattedText__FormattedTextAssignment7468);
            rule__FormattedText__FormattedTextAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFormattedTextAccess().getFormattedTextAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormattedText__FormattedTextAssignment"


    // $ANTLR start "rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3686:1: rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment : ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 ) ) ;
    public final void rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: ( ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: ( ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 )
            {
             before(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:2: rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0
            {
            pushFollow(FOLLOW_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment7501);
            rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFormattedTextWithoutLinksAccess().getFormattedTextWithoutLinksAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment"


    // $ANTLR start "rule__AbstractElement__ElementAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: rule__AbstractElement__ElementAssignment : ( ( rule__AbstractElement__ElementAlternatives_0 ) ) ;
    public final void rule__AbstractElement__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( ( ( rule__AbstractElement__ElementAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( rule__AbstractElement__ElementAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( rule__AbstractElement__ElementAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( rule__AbstractElement__ElementAlternatives_0 )
            {
             before(grammarAccess.getAbstractElementAccess().getElementAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( rule__AbstractElement__ElementAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:2: rule__AbstractElement__ElementAlternatives_0
            {
            pushFollow(FOLLOW_rule__AbstractElement__ElementAlternatives_0_in_rule__AbstractElement__ElementAssignment7534);
            rule__AbstractElement__ElementAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getElementAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__ElementAssignment"


    // $ANTLR start "rule__TextElement__ElementAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: rule__TextElement__ElementAssignment : ( ( rule__TextElement__ElementAlternatives_0 ) ) ;
    public final void rule__TextElement__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ( ( rule__TextElement__ElementAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ( rule__TextElement__ElementAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( ( rule__TextElement__ElementAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__TextElement__ElementAlternatives_0 )
            {
             before(grammarAccess.getTextElementAccess().getElementAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: ( rule__TextElement__ElementAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:2: rule__TextElement__ElementAlternatives_0
            {
            pushFollow(FOLLOW_rule__TextElement__ElementAlternatives_0_in_rule__TextElement__ElementAssignment7567);
            rule__TextElement__ElementAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTextElementAccess().getElementAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextElement__ElementAssignment"


    // $ANTLR start "rule__Heading__HeadingAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: rule__Heading__HeadingAssignment : ( ( rule__Heading__HeadingAlternatives_0 ) ) ;
    public final void rule__Heading__HeadingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( ( rule__Heading__HeadingAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( ( rule__Heading__HeadingAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( ( rule__Heading__HeadingAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( rule__Heading__HeadingAlternatives_0 )
            {
             before(grammarAccess.getHeadingAccess().getHeadingAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( rule__Heading__HeadingAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:2: rule__Heading__HeadingAlternatives_0
            {
            pushFollow(FOLLOW_rule__Heading__HeadingAlternatives_0_in_rule__Heading__HeadingAssignment7600);
            rule__Heading__HeadingAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadingAccess().getHeadingAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__HeadingAssignment"


    // $ANTLR start "rule__Heading1__HeadingAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__Heading1__HeadingAssignment_1 : ( ruleFormattedText ) ;
    public final void rule__Heading1__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ruleFormattedText
            {
             before(grammarAccess.getHeading1Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__Heading1__HeadingAssignment_17633);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getHeading1Access().getHeadingFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading1__HeadingAssignment_1"


    // $ANTLR start "rule__Heading2__HeadingAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3765:1: rule__Heading2__HeadingAssignment_1 : ( ruleFormattedText ) ;
    public final void rule__Heading2__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ruleFormattedText
            {
             before(grammarAccess.getHeading2Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__Heading2__HeadingAssignment_17664);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getHeading2Access().getHeadingFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading2__HeadingAssignment_1"


    // $ANTLR start "rule__Heading3__HeadingAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: rule__Heading3__HeadingAssignment_1 : ( ruleFormattedText ) ;
    public final void rule__Heading3__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:1: ruleFormattedText
            {
             before(grammarAccess.getHeading3Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__Heading3__HeadingAssignment_17695);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getHeading3Access().getHeadingFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading3__HeadingAssignment_1"


    // $ANTLR start "rule__Heading4__HeadingAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: rule__Heading4__HeadingAssignment_1 : ( ruleFormattedText ) ;
    public final void rule__Heading4__HeadingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ruleFormattedText
            {
             before(grammarAccess.getHeading4Access().getHeadingFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__Heading4__HeadingAssignment_17726);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getHeading4Access().getHeadingFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading4__HeadingAssignment_1"


    // $ANTLR start "rule__List__ListAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: rule__List__ListAssignment : ( ( rule__List__ListAlternatives_0 ) ) ;
    public final void rule__List__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: ( ( ( rule__List__ListAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( ( rule__List__ListAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( ( rule__List__ListAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( rule__List__ListAlternatives_0 )
            {
             before(grammarAccess.getListAccess().getListAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: ( rule__List__ListAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:2: rule__List__ListAlternatives_0
            {
            pushFollow(FOLLOW_rule__List__ListAlternatives_0_in_rule__List__ListAssignment7757);
            rule__List__ListAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getListAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ListAssignment"


    // $ANTLR start "rule__OrderedList__ItemsAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: rule__OrderedList__ItemsAssignment : ( ruleOrderedListItem ) ;
    public final void rule__OrderedList__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: ( ( ruleOrderedListItem ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ruleOrderedListItem )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ruleOrderedListItem )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ruleOrderedListItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsOrderedListItemParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrderedListItem_in_rule__OrderedList__ItemsAssignment7790);
            ruleOrderedListItem();

            state._fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsOrderedListItemParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedList__ItemsAssignment"


    // $ANTLR start "rule__UnorderedList__ItemsAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: rule__UnorderedList__ItemsAssignment : ( ruleUnorderedListItem ) ;
    public final void rule__UnorderedList__ItemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: ( ( ruleUnorderedListItem ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleUnorderedListItem )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleUnorderedListItem )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ruleUnorderedListItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsUnorderedListItemParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnorderedListItem_in_rule__UnorderedList__ItemsAssignment7821);
            ruleUnorderedListItem();

            state._fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsUnorderedListItemParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedList__ItemsAssignment"


    // $ANTLR start "rule__OrderedListItem__ItemAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: rule__OrderedListItem__ItemAssignment_1 : ( ( rule__OrderedListItem__ItemAlternatives_1_0 ) ) ;
    public final void rule__OrderedListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: ( ( ( rule__OrderedListItem__ItemAlternatives_1_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( rule__OrderedListItem__ItemAlternatives_1_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( rule__OrderedListItem__ItemAlternatives_1_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( rule__OrderedListItem__ItemAlternatives_1_0 )
            {
             before(grammarAccess.getOrderedListItemAccess().getItemAlternatives_1_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( rule__OrderedListItem__ItemAlternatives_1_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:2: rule__OrderedListItem__ItemAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__OrderedListItem__ItemAlternatives_1_0_in_rule__OrderedListItem__ItemAssignment_17852);
            rule__OrderedListItem__ItemAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListItemAccess().getItemAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedListItem__ItemAssignment_1"


    // $ANTLR start "rule__UnorderedListItem__ItemAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: rule__UnorderedListItem__ItemAssignment_1 : ( ( rule__UnorderedListItem__ItemAlternatives_1_0 ) ) ;
    public final void rule__UnorderedListItem__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: ( ( ( rule__UnorderedListItem__ItemAlternatives_1_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ( ( rule__UnorderedListItem__ItemAlternatives_1_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ( ( rule__UnorderedListItem__ItemAlternatives_1_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( rule__UnorderedListItem__ItemAlternatives_1_0 )
            {
             before(grammarAccess.getUnorderedListItemAccess().getItemAlternatives_1_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( rule__UnorderedListItem__ItemAlternatives_1_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:2: rule__UnorderedListItem__ItemAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnorderedListItem__ItemAlternatives_1_0_in_rule__UnorderedListItem__ItemAssignment_17885);
            rule__UnorderedListItem__ItemAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListItemAccess().getItemAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedListItem__ItemAssignment_1"


    // $ANTLR start "rule__ItalicText__ItalicTextAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: rule__ItalicText__ItalicTextAssignment_1 : ( ( rule__ItalicText__ItalicTextAlternatives_1_0 ) ) ;
    public final void rule__ItalicText__ItalicTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( ( ( rule__ItalicText__ItalicTextAlternatives_1_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( rule__ItalicText__ItalicTextAlternatives_1_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( rule__ItalicText__ItalicTextAlternatives_1_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( rule__ItalicText__ItalicTextAlternatives_1_0 )
            {
             before(grammarAccess.getItalicTextAccess().getItalicTextAlternatives_1_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( rule__ItalicText__ItalicTextAlternatives_1_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:2: rule__ItalicText__ItalicTextAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ItalicText__ItalicTextAlternatives_1_0_in_rule__ItalicText__ItalicTextAssignment_17918);
            rule__ItalicText__ItalicTextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getItalicTextAccess().getItalicTextAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicText__ItalicTextAssignment_1"


    // $ANTLR start "rule__BoldText__BoldTextAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: rule__BoldText__BoldTextAssignment_1 : ( ( rule__BoldText__BoldTextAlternatives_1_0 ) ) ;
    public final void rule__BoldText__BoldTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: ( ( ( rule__BoldText__BoldTextAlternatives_1_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( rule__BoldText__BoldTextAlternatives_1_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( rule__BoldText__BoldTextAlternatives_1_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__BoldText__BoldTextAlternatives_1_0 )
            {
             before(grammarAccess.getBoldTextAccess().getBoldTextAlternatives_1_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ( rule__BoldText__BoldTextAlternatives_1_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__BoldText__BoldTextAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__BoldText__BoldTextAlternatives_1_0_in_rule__BoldText__BoldTextAssignment_17951);
            rule__BoldText__BoldTextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBoldTextAccess().getBoldTextAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldText__BoldTextAssignment_1"


    // $ANTLR start "rule__ItalicBoldText__ItalicBoldTextAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: rule__ItalicBoldText__ItalicBoldTextAssignment_1 : ( ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 ) ) ;
    public final void rule__ItalicBoldText__ItalicBoldTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: ( ( ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: ( ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: ( ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3926:1: ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 )
            {
             before(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextAlternatives_1_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: ( rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:2: rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0_in_rule__ItalicBoldText__ItalicBoldTextAssignment_17984);
            rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getItalicBoldTextAccess().getItalicBoldTextAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicBoldText__ItalicBoldTextAssignment_1"


    // $ANTLR start "rule__BlockQuote__BlockQuoteTextAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3936:1: rule__BlockQuote__BlockQuoteTextAssignment_1 : ( ruleFormattedText ) ;
    public final void rule__BlockQuote__BlockQuoteTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ruleFormattedText
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockQuoteTextFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__BlockQuote__BlockQuoteTextAssignment_18017);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getBlockQuoteAccess().getBlockQuoteTextFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__BlockQuoteTextAssignment_1"


    // $ANTLR start "rule__BlockQuote__AdditionalAssignment_2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: rule__BlockQuote__AdditionalAssignment_2 : ( ruleFormattedText ) ;
    public final void rule__BlockQuote__AdditionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( ( ruleFormattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( ruleFormattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( ruleFormattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ruleFormattedText
            {
             before(grammarAccess.getBlockQuoteAccess().getAdditionalFormattedTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFormattedText_in_rule__BlockQuote__AdditionalAssignment_28048);
            ruleFormattedText();

            state._fsp--;

             after(grammarAccess.getBlockQuoteAccess().getAdditionalFormattedTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__AdditionalAssignment_2"


    // $ANTLR start "rule__ExternalLink__LinkNameAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: rule__ExternalLink__LinkNameAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__ExternalLink__LinkNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ruleUnformattedText
            {
             before(grammarAccess.getExternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__ExternalLink__LinkNameAssignment_18079);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getExternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__LinkNameAssignment_1"


    // $ANTLR start "rule__ExternalLink__RenamedLinkAssignment_2_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: rule__ExternalLink__RenamedLinkAssignment_2_1 : ( ruleFormattedTextWithoutLinks ) ;
    public final void rule__ExternalLink__RenamedLinkAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( ( ruleFormattedTextWithoutLinks ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( ruleFormattedTextWithoutLinks )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( ruleFormattedTextWithoutLinks )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ruleFormattedTextWithoutLinks
            {
             before(grammarAccess.getExternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_rule__ExternalLink__RenamedLinkAssignment_2_18110);
            ruleFormattedTextWithoutLinks();

            state._fsp--;

             after(grammarAccess.getExternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__RenamedLinkAssignment_2_1"


    // $ANTLR start "rule__InternalLink__LinkNameAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: rule__InternalLink__LinkNameAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__InternalLink__LinkNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4000:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: ruleUnformattedText
            {
             before(grammarAccess.getInternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__InternalLink__LinkNameAssignment_18141);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getInternalLinkAccess().getLinkNameUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__LinkNameAssignment_1"


    // $ANTLR start "rule__InternalLink__RenamedLinkAssignment_2_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: rule__InternalLink__RenamedLinkAssignment_2_1 : ( ruleFormattedTextWithoutLinks ) ;
    public final void rule__InternalLink__RenamedLinkAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: ( ( ruleFormattedTextWithoutLinks ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: ( ruleFormattedTextWithoutLinks )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4016:1: ( ruleFormattedTextWithoutLinks )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: ruleFormattedTextWithoutLinks
            {
             before(grammarAccess.getInternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_rule__InternalLink__RenamedLinkAssignment_2_18172);
            ruleFormattedTextWithoutLinks();

            state._fsp--;

             after(grammarAccess.getInternalLinkAccess().getRenamedLinkFormattedTextWithoutLinksParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__RenamedLinkAssignment_2_1"


    // $ANTLR start "rule__File__FileNameAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: rule__File__FileNameAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__File__FileNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: ruleUnformattedText
            {
             before(grammarAccess.getFileAccess().getFileNameUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__File__FileNameAssignment_18203);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getFileAccess().getFileNameUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__FileNameAssignment_1"


    // $ANTLR start "rule__File__ViewTypeAssignment_2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: rule__File__ViewTypeAssignment_2 : ( ( rule__File__ViewTypeAlternatives_2_0 ) ) ;
    public final void rule__File__ViewTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: ( ( ( rule__File__ViewTypeAlternatives_2_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ( rule__File__ViewTypeAlternatives_2_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ( rule__File__ViewTypeAlternatives_2_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( rule__File__ViewTypeAlternatives_2_0 )
            {
             before(grammarAccess.getFileAccess().getViewTypeAlternatives_2_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( rule__File__ViewTypeAlternatives_2_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:2: rule__File__ViewTypeAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__File__ViewTypeAlternatives_2_0_in_rule__File__ViewTypeAssignment_28234);
            rule__File__ViewTypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getViewTypeAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__ViewTypeAssignment_2"


    // $ANTLR start "rule__File__TextAssignment_3_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: rule__File__TextAssignment_3_1 : ( ruleFormattedTextWithoutLinks ) ;
    public final void rule__File__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ( ruleFormattedTextWithoutLinks ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( ruleFormattedTextWithoutLinks )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( ruleFormattedTextWithoutLinks )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: ruleFormattedTextWithoutLinks
            {
             before(grammarAccess.getFileAccess().getTextFormattedTextWithoutLinksParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_rule__File__TextAssignment_3_18267);
            ruleFormattedTextWithoutLinks();

            state._fsp--;

             after(grammarAccess.getFileAccess().getTextFormattedTextWithoutLinksParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__TextAssignment_3_1"


    // $ANTLR start "rule__File__AdditionalAssignment_3_2"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: rule__File__AdditionalAssignment_3_2 : ( ruleFormattedTextWithoutLinks ) ;
    public final void rule__File__AdditionalAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: ( ( ruleFormattedTextWithoutLinks ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( ruleFormattedTextWithoutLinks )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( ruleFormattedTextWithoutLinks )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ruleFormattedTextWithoutLinks
            {
             before(grammarAccess.getFileAccess().getAdditionalFormattedTextWithoutLinksParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleFormattedTextWithoutLinks_in_rule__File__AdditionalAssignment_3_28298);
            ruleFormattedTextWithoutLinks();

            state._fsp--;

             after(grammarAccess.getFileAccess().getAdditionalFormattedTextWithoutLinksParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__File__AdditionalAssignment_3_2"


    // $ANTLR start "rule__Category__CategoryLinkAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: rule__Category__CategoryLinkAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__Category__CategoryLinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ruleUnformattedText
            {
             before(grammarAccess.getCategoryAccess().getCategoryLinkUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__Category__CategoryLinkAssignment_18329);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getCategoryLinkUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__CategoryLinkAssignment_1"


    // $ANTLR start "rule__Template__TemplateAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: rule__Template__TemplateAssignment_1 : ( ruleTemplateType ) ;
    public final void rule__Template__TemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ( ruleTemplateType ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ruleTemplateType )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ruleTemplateType )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ruleTemplateType
            {
             before(grammarAccess.getTemplateAccess().getTemplateTemplateTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTemplateType_in_rule__Template__TemplateAssignment_18360);
            ruleTemplateType();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getTemplateTemplateTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__TemplateAssignment_1"


    // $ANTLR start "rule__TemplateType__TypeAssignment"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: rule__TemplateType__TypeAssignment : ( ( rule__TemplateType__TypeAlternatives_0 ) ) ;
    public final void rule__TemplateType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ( ( rule__TemplateType__TypeAlternatives_0 ) ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( ( rule__TemplateType__TypeAlternatives_0 ) )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ( ( rule__TemplateType__TypeAlternatives_0 ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( rule__TemplateType__TypeAlternatives_0 )
            {
             before(grammarAccess.getTemplateTypeAccess().getTypeAlternatives_0()); 
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( rule__TemplateType__TypeAlternatives_0 )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:2: rule__TemplateType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_rule__TemplateType__TypeAlternatives_0_in_rule__TemplateType__TypeAssignment8391);
            rule__TemplateType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__TypeAssignment"


    // $ANTLR start "rule__Metadata__AboutAssignment_0"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: rule__Metadata__AboutAssignment_0 : ( ruleAbout ) ;
    public final void rule__Metadata__AboutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ( ( ruleAbout ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: ( ruleAbout )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: ( ruleAbout )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ruleAbout
            {
             before(grammarAccess.getMetadataAccess().getAboutAboutParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAbout_in_rule__Metadata__AboutAssignment_08424);
            ruleAbout();

            state._fsp--;

             after(grammarAccess.getMetadataAccess().getAboutAboutParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__AboutAssignment_0"


    // $ANTLR start "rule__Metadata__ActualInfoAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:1: rule__Metadata__ActualInfoAssignment_1 : ( ruleActualInformation ) ;
    public final void rule__Metadata__ActualInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( ( ruleActualInformation ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ruleActualInformation )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ruleActualInformation )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ruleActualInformation
            {
             before(grammarAccess.getMetadataAccess().getActualInfoActualInformationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleActualInformation_in_rule__Metadata__ActualInfoAssignment_18455);
            ruleActualInformation();

            state._fsp--;

             after(grammarAccess.getMetadataAccess().getActualInfoActualInformationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metadata__ActualInfoAssignment_1"


    // $ANTLR start "rule__About__AboutTextAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: rule__About__AboutTextAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__About__AboutTextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ruleUnformattedText
            {
             before(grammarAccess.getAboutAccess().getAboutTextUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__About__AboutTextAssignment_18486);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getAboutAccess().getAboutTextUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__About__AboutTextAssignment_1"


    // $ANTLR start "rule__ActualInformation__InformationOnWhatAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4178:1: rule__ActualInformation__InformationOnWhatAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__ActualInformation__InformationOnWhatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: ruleUnformattedText
            {
             before(grammarAccess.getActualInformationAccess().getInformationOnWhatUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__ActualInformation__InformationOnWhatAssignment_18517);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getActualInformationAccess().getInformationOnWhatUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__InformationOnWhatAssignment_1"


    // $ANTLR start "rule__ActualInformation__LinkAssignment_3"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: rule__ActualInformation__LinkAssignment_3 : ( ruleUnformattedText ) ;
    public final void rule__ActualInformation__LinkAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: ruleUnformattedText
            {
             before(grammarAccess.getActualInformationAccess().getLinkUnformattedTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__ActualInformation__LinkAssignment_38548);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getActualInformationAccess().getLinkUnformattedTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__LinkAssignment_3"


    // $ANTLR start "rule__ActualInformation__AdditionalLinksAssignment_4_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: rule__ActualInformation__AdditionalLinksAssignment_4_1 : ( ruleUnformattedText ) ;
    public final void rule__ActualInformation__AdditionalLinksAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ruleUnformattedText
            {
             before(grammarAccess.getActualInformationAccess().getAdditionalLinksUnformattedTextParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__ActualInformation__AdditionalLinksAssignment_4_18579);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getActualInformationAccess().getAdditionalLinksUnformattedTextParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualInformation__AdditionalLinksAssignment_4_1"


    // $ANTLR start "rule__MainInformation__LinkAssignment_1"
    // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: rule__MainInformation__LinkAssignment_1 : ( ruleUnformattedText ) ;
    public final void rule__MainInformation__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: ( ( ruleUnformattedText ) )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: ( ruleUnformattedText )
            {
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: ( ruleUnformattedText )
            // ../example.wikitext.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ruleUnformattedText
            {
             before(grammarAccess.getMainInformationAccess().getLinkUnformattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnformattedText_in_rule__MainInformation__LinkAssignment_18610);
            ruleUnformattedText();

            state._fsp--;

             after(grammarAccess.getMainInformationAccess().getLinkUnformattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainInformation__LinkAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__CommentAssignment_in_ruleComment154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_entryRuleUnformattedText181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnformattedText188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnformattedText__TextAssignment_in_ruleUnformattedText214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_entryRuleFormattedText241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedText248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormattedText__FormattedTextAssignment_in_ruleFormattedText274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_entryRuleFormattedTextWithoutLinks301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedTextWithoutLinks308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment_in_ruleFormattedTextWithoutLinks334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__ElementAssignment_in_ruleAbstractElement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextElement_in_entryRuleTextElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextElement__ElementAssignment_in_ruleTextElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading_in_entryRuleHeading481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading__HeadingAssignment_in_ruleHeading514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading1541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__0_in_ruleHeading1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading2601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0_in_ruleHeading2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0_in_ruleHeading3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading4721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0_in_ruleHeading4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__ListAssignment_in_ruleList814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_in_ruleOrderedList874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_in_ruleUnorderedList934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedListItem_in_entryRuleOrderedListItem961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedListItem968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedListItem__Group__0_in_ruleOrderedListItem994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedListItem_in_entryRuleUnorderedListItem1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedListItem1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__Group__0_in_ruleUnorderedListItem1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_entryRuleItalicText1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicText1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__0_in_ruleItalicText1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_entryRuleBoldText1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldText1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__Group__0_in_ruleBoldText1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_entryRuleItalicBoldText1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBoldText1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__0_in_ruleItalicBoldText1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0_in_ruleBlockQuote1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_entryRuleExternalLink1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLink1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__0_in_ruleExternalLink1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_entryRuleInternalLink1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLink1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__0_in_ruleInternalLink1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0_in_ruleTemplate1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_entryRuleTemplateType1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__TypeAssignment_in_ruleTemplateType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__0_in_ruleMetadata1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbout_in_entryRuleAbout1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbout1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__About__Group__0_in_ruleAbout1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualInformation_in_entryRuleActualInformation1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualInformation1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__0_in_ruleActualInformation1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainInformation_in_entryRuleMainInformation1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainInformation1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainInformation__Group__0_in_ruleMainInformation1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_rule__FormattedText__FormattedTextAlternatives_01930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_rule__FormattedText__FormattedTextAlternatives_01947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_rule__FormattedText__FormattedTextAlternatives_01964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_rule__FormattedText__FormattedTextAlternatives_01981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_rule__FormattedText__FormattedTextAlternatives_01998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__FormattedText__FormattedTextAlternatives_02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBoldText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_02098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__AbstractElement__ElementAlternatives_02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading_in_rule__AbstractElement__ElementAlternatives_02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextElement_in_rule__AbstractElement__ElementAlternatives_02164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__AbstractElement__ElementAlternatives_02181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_rule__TextElement__ElementAlternatives_02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__TextElement__ElementAlternatives_02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__TextElement__ElementAlternatives_02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__TextElement__ElementAlternatives_02264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_rule__Heading__HeadingAlternatives_02296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_rule__Heading__HeadingAlternatives_02313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_rule__Heading__HeadingAlternatives_02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__List__ListAlternatives_02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__List__ListAlternatives_02379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__OrderedListItem__ItemAlternatives_1_02411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__OrderedListItem__ItemAlternatives_1_02428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__UnorderedListItem__ItemAlternatives_1_02460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__UnorderedListItem__ItemAlternatives_1_02477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_rule__ItalicText__ItalicTextAlternatives_1_02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_rule__ItalicText__ItalicTextAlternatives_1_02526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ItalicText__ItalicTextAlternatives_1_02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_rule__BoldText__BoldTextAlternatives_1_02575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_rule__BoldText__BoldTextAlternatives_1_02592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__BoldText__BoldTextAlternatives_1_02609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_02675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__File__ViewTypeAlternatives_2_02708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__File__ViewTypeAlternatives_2_02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__File__ViewTypeAlternatives_2_02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_rule__TemplateType__TypeAlternatives_02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainInformation_in_rule__TemplateType__TypeAlternatives_02799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__02829 = new BitSet(new long[]{0x000000164BFE0030L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__02832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__TitleAssignment_0_in_rule__Document__Group__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__12889 = new BitSet(new long[]{0x000000164BFE0030L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__ElementsAssignment_1_in_rule__Document__Group__1__Impl2919 = new BitSet(new long[]{0x000000124BFE0032L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__22950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__CategoriesAssignment_2_in_rule__Document__Group__2__Impl2977 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__03014 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__03017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Heading1__Group__0__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__13076 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__HeadingAssignment_1_in_rule__Heading1__Group__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__23136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Heading1__Group__2__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__03201 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Heading2__Group__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__13263 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__HeadingAssignment_1_in_rule__Heading2__Group__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__23323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Heading2__Group__2__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__03388 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__03391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Heading3__Group__0__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__13450 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__13453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__HeadingAssignment_1_in_rule__Heading3__Group__1__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__23510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Heading3__Group__2__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__03575 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__03578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Heading4__Group__0__Impl3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__13637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__13640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__HeadingAssignment_1_in_rule__Heading4__Group__1__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__23697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Heading4__Group__2__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedListItem__Group__0__Impl_in_rule__OrderedListItem__Group__03762 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__OrderedListItem__Group__1_in_rule__OrderedListItem__Group__03765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OrderedListItem__Group__0__Impl3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedListItem__Group__1__Impl_in_rule__OrderedListItem__Group__13824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedListItem__ItemAssignment_1_in_rule__OrderedListItem__Group__1__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__Group__0__Impl_in_rule__UnorderedListItem__Group__03885 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__Group__1_in_rule__UnorderedListItem__Group__03888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UnorderedListItem__Group__0__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__Group__1__Impl_in_rule__UnorderedListItem__Group__13947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__ItemAssignment_1_in_rule__UnorderedListItem__Group__1__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__0__Impl_in_rule__ItalicText__Group__04008 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__1_in_rule__ItalicText__Group__04011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ItalicText__Group__0__Impl4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__1__Impl_in_rule__ItalicText__Group__14070 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__2_in_rule__ItalicText__Group__14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__ItalicTextAssignment_1_in_rule__ItalicText__Group__1__Impl4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__Group__2__Impl_in_rule__ItalicText__Group__24130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ItalicText__Group__2__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__Group__0__Impl_in_rule__BoldText__Group__04195 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__BoldText__Group__1_in_rule__BoldText__Group__04198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BoldText__Group__0__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__Group__1__Impl_in_rule__BoldText__Group__14257 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BoldText__Group__2_in_rule__BoldText__Group__14260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__BoldTextAssignment_1_in_rule__BoldText__Group__1__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__Group__2__Impl_in_rule__BoldText__Group__24317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BoldText__Group__2__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__0__Impl_in_rule__ItalicBoldText__Group__04382 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__1_in_rule__ItalicBoldText__Group__04385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ItalicBoldText__Group__0__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__1__Impl_in_rule__ItalicBoldText__Group__14444 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__2_in_rule__ItalicBoldText__Group__14447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__ItalicBoldTextAssignment_1_in_rule__ItalicBoldText__Group__1__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__Group__2__Impl_in_rule__ItalicBoldText__Group__24504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ItalicBoldText__Group__2__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__04569 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__04572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BlockQuote__Group__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__14631 = new BitSet(new long[]{0x000000024FF00020L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__14634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__BlockQuoteTextAssignment_1_in_rule__BlockQuote__Group__1__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__24691 = new BitSet(new long[]{0x000000024FF00020L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__24694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__AdditionalAssignment_2_in_rule__BlockQuote__Group__2__Impl4721 = new BitSet(new long[]{0x000000024BF00022L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__34752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BlockQuote__Group__3__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__0__Impl_in_rule__ExternalLink__Group__04819 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__1_in_rule__ExternalLink__Group__04822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ExternalLink__Group__0__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__1__Impl_in_rule__ExternalLink__Group__14881 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__2_in_rule__ExternalLink__Group__14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__LinkNameAssignment_1_in_rule__ExternalLink__Group__1__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__2__Impl_in_rule__ExternalLink__Group__24941 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__3_in_rule__ExternalLink__Group__24944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group_2__0_in_rule__ExternalLink__Group__2__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__3__Impl_in_rule__ExternalLink__Group__35002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ExternalLink__Group__3__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group_2__0__Impl_in_rule__ExternalLink__Group_2__05069 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group_2__1_in_rule__ExternalLink__Group_2__05072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ExternalLink__Group_2__0__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group_2__1__Impl_in_rule__ExternalLink__Group_2__15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__RenamedLinkAssignment_2_1_in_rule__ExternalLink__Group_2__1__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__0__Impl_in_rule__InternalLink__Group__05192 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__1_in_rule__InternalLink__Group__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InternalLink__Group__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__1__Impl_in_rule__InternalLink__Group__15254 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__2_in_rule__InternalLink__Group__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__LinkNameAssignment_1_in_rule__InternalLink__Group__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__2__Impl_in_rule__InternalLink__Group__25314 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__3_in_rule__InternalLink__Group__25317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group_2__0_in_rule__InternalLink__Group__2__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__3__Impl_in_rule__InternalLink__Group__35375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InternalLink__Group__3__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group_2__0__Impl_in_rule__InternalLink__Group_2__05442 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__InternalLink__Group_2__1_in_rule__InternalLink__Group_2__05445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InternalLink__Group_2__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group_2__1__Impl_in_rule__InternalLink__Group_2__15504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__RenamedLinkAssignment_2_1_in_rule__InternalLink__Group_2__1__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__05565 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__05568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__File__Group__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__15627 = new BitSet(new long[]{0x000000018000E000L});
    public static final BitSet FOLLOW_rule__File__Group__2_in_rule__File__Group__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__FileNameAssignment_1_in_rule__File__Group__1__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__2__Impl_in_rule__File__Group__25687 = new BitSet(new long[]{0x000000018000E000L});
    public static final BitSet FOLLOW_rule__File__Group__3_in_rule__File__Group__25690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__ViewTypeAssignment_2_in_rule__File__Group__2__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__3__Impl_in_rule__File__Group__35748 = new BitSet(new long[]{0x000000018000E000L});
    public static final BitSet FOLLOW_rule__File__Group__4_in_rule__File__Group__35751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0_in_rule__File__Group__3__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__4__Impl_in_rule__File__Group__45809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__File__Group__4__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__0__Impl_in_rule__File__Group_3__05878 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__File__Group_3__1_in_rule__File__Group_3__05881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__File__Group_3__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__1__Impl_in_rule__File__Group_3__15940 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__File__Group_3__2_in_rule__File__Group_3__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__TextAssignment_3_1_in_rule__File__Group_3__1__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_3__2__Impl_in_rule__File__Group_3__26000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__AdditionalAssignment_3_2_in_rule__File__Group_3__2__Impl6027 = new BitSet(new long[]{0x000000024BF00022L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__06064 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__06067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Category__Group__0__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__16126 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__16129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__CategoryLinkAssignment_1_in_rule__Category__Group__1__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__26186 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__26189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Category__Group__2__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__36251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Category__Group__3__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__06318 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__06321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Template__Group__0__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__16380 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__16383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__TemplateAssignment_1_in_rule__Template__Group__1__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__26440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Template__Group__2__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__0__Impl_in_rule__Metadata__Group__06505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Metadata__Group__1_in_rule__Metadata__Group__06508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__AboutAssignment_0_in_rule__Metadata__Group__0__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__Group__1__Impl_in_rule__Metadata__Group__16565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metadata__ActualInfoAssignment_1_in_rule__Metadata__Group__1__Impl6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__About__Group__0__Impl_in_rule__About__Group__06627 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__About__Group__1_in_rule__About__Group__06630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__About__Group__0__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__About__Group__1__Impl_in_rule__About__Group__16689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__About__AboutTextAssignment_1_in_rule__About__Group__1__Impl6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__0__Impl_in_rule__ActualInformation__Group__06750 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__1_in_rule__ActualInformation__Group__06753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ActualInformation__Group__0__Impl6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__1__Impl_in_rule__ActualInformation__Group__16812 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__2_in_rule__ActualInformation__Group__16815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__InformationOnWhatAssignment_1_in_rule__ActualInformation__Group__1__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__2__Impl_in_rule__ActualInformation__Group__26872 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__3_in_rule__ActualInformation__Group__26875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ActualInformation__Group__2__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__3__Impl_in_rule__ActualInformation__Group__36934 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__4_in_rule__ActualInformation__Group__36937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__LinkAssignment_3_in_rule__ActualInformation__Group__3__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group__4__Impl_in_rule__ActualInformation__Group__46994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group_4__0_in_rule__ActualInformation__Group__4__Impl7021 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group_4__0__Impl_in_rule__ActualInformation__Group_4__07062 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group_4__1_in_rule__ActualInformation__Group_4__07065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ActualInformation__Group_4__0__Impl7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__Group_4__1__Impl_in_rule__ActualInformation__Group_4__17124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualInformation__AdditionalLinksAssignment_4_1_in_rule__ActualInformation__Group_4__1__Impl7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainInformation__Group__0__Impl_in_rule__MainInformation__Group__07185 = new BitSet(new long[]{0x000000024BF00020L});
    public static final BitSet FOLLOW_rule__MainInformation__Group__1_in_rule__MainInformation__Group__07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__MainInformation__Group__0__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainInformation__Group__1__Impl_in_rule__MainInformation__Group__17247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainInformation__LinkAssignment_1_in_rule__MainInformation__Group__1__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_rule__Document__TitleAssignment_07313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Document__ElementsAssignment_17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__Document__CategoriesAssignment_27375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKI_COMMENT_in_rule__Comment__CommentAssignment7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CUSTOM_STRING_in_rule__UnformattedText__TextAssignment7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormattedText__FormattedTextAlternatives_0_in_rule__FormattedText__FormattedTextAssignment7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAlternatives_0_in_rule__FormattedTextWithoutLinks__FormattedTextWithoutLinksAssignment7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__ElementAlternatives_0_in_rule__AbstractElement__ElementAssignment7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextElement__ElementAlternatives_0_in_rule__TextElement__ElementAssignment7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading__HeadingAlternatives_0_in_rule__Heading__HeadingAssignment7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__Heading1__HeadingAssignment_17633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__Heading2__HeadingAssignment_17664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__Heading3__HeadingAssignment_17695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__Heading4__HeadingAssignment_17726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__ListAlternatives_0_in_rule__List__ListAssignment7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedListItem_in_rule__OrderedList__ItemsAssignment7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedListItem_in_rule__UnorderedList__ItemsAssignment7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedListItem__ItemAlternatives_1_0_in_rule__OrderedListItem__ItemAssignment_17852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedListItem__ItemAlternatives_1_0_in_rule__UnorderedListItem__ItemAssignment_17885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicText__ItalicTextAlternatives_1_0_in_rule__ItalicText__ItalicTextAssignment_17918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldText__BoldTextAlternatives_1_0_in_rule__BoldText__BoldTextAssignment_17951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBoldText__ItalicBoldTextAlternatives_1_0_in_rule__ItalicBoldText__ItalicBoldTextAssignment_17984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__BlockQuote__BlockQuoteTextAssignment_18017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedText_in_rule__BlockQuote__AdditionalAssignment_28048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ExternalLink__LinkNameAssignment_18079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_rule__ExternalLink__RenamedLinkAssignment_2_18110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__InternalLink__LinkNameAssignment_18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_rule__InternalLink__RenamedLinkAssignment_2_18172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__File__FileNameAssignment_18203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__ViewTypeAlternatives_2_0_in_rule__File__ViewTypeAssignment_28234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_rule__File__TextAssignment_3_18267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedTextWithoutLinks_in_rule__File__AdditionalAssignment_3_28298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__Category__CategoryLinkAssignment_18329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_rule__Template__TemplateAssignment_18360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__TypeAlternatives_0_in_rule__TemplateType__TypeAssignment8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbout_in_rule__Metadata__AboutAssignment_08424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualInformation_in_rule__Metadata__ActualInfoAssignment_18455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__About__AboutTextAssignment_18486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ActualInformation__InformationOnWhatAssignment_18517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ActualInformation__LinkAssignment_38548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__ActualInformation__AdditionalLinksAssignment_4_18579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnformattedText_in_rule__MainInformation__LinkAssignment_18610 = new BitSet(new long[]{0x0000000000000002L});

}