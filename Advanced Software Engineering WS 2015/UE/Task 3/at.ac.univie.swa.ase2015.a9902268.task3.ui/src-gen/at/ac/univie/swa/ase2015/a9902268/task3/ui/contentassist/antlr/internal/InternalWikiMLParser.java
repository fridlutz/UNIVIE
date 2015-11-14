package at.ac.univie.swa.ase2015.a9902268.task3.ui.contentassist.antlr.internal; 

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
import at.ac.univie.swa.ase2015.a9902268.task3.services.WikiMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWikiMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URL", "RULE_ML_COMMENT", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thumb'", "'thumbnail'", "'frame'", "'framed'", "'frameless'", "'right'", "'left'", "'center'", "'none'", "'<blockquote>'", "'</blockquote>'", "'{{'", "'}}'", "'|'", "'**'", "':LIST'", "'*'", "'#'", "'[['", "'File:'", "']]'", "'|alt='", "'Category:'", "'='", "'=='", "'==='", "'===='", "'====='", "'\\'\\'\\''", "'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "'|*?'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=5;
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
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g"; }


     
     	private WikiMLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WikiMLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleWikiPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:60:1: entryRuleWikiPage : ruleWikiPage EOF ;
    public final void entryRuleWikiPage() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:61:1: ( ruleWikiPage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:62:1: ruleWikiPage EOF
            {
             before(grammarAccess.getWikiPageRule()); 
            pushFollow(FOLLOW_ruleWikiPage_in_entryRuleWikiPage61);
            ruleWikiPage();

            state._fsp--;

             after(grammarAccess.getWikiPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWikiPage68); 

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
    // $ANTLR end "entryRuleWikiPage"


    // $ANTLR start "ruleWikiPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:69:1: ruleWikiPage : ( ( rule__WikiPage__Group__0 ) ) ;
    public final void ruleWikiPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:73:2: ( ( ( rule__WikiPage__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__WikiPage__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__WikiPage__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:75:1: ( rule__WikiPage__Group__0 )
            {
             before(grammarAccess.getWikiPageAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:1: ( rule__WikiPage__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:2: rule__WikiPage__Group__0
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__0_in_ruleWikiPage94);
            rule__WikiPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWikiPageAccess().getGroup()); 

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
    // $ANTLR end "ruleWikiPage"


    // $ANTLR start "entryRuleParagraphTypes"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:88:1: entryRuleParagraphTypes : ruleParagraphTypes EOF ;
    public final void entryRuleParagraphTypes() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:89:1: ( ruleParagraphTypes EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:90:1: ruleParagraphTypes EOF
            {
             before(grammarAccess.getParagraphTypesRule()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes121);
            ruleParagraphTypes();

            state._fsp--;

             after(grammarAccess.getParagraphTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraphTypes128); 

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
    // $ANTLR end "entryRuleParagraphTypes"


    // $ANTLR start "ruleParagraphTypes"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:97:1: ruleParagraphTypes : ( ( rule__ParagraphTypes__Alternatives ) ) ;
    public final void ruleParagraphTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:101:2: ( ( ( rule__ParagraphTypes__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__ParagraphTypes__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__ParagraphTypes__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:103:1: ( rule__ParagraphTypes__Alternatives )
            {
             before(grammarAccess.getParagraphTypesAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:1: ( rule__ParagraphTypes__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:2: rule__ParagraphTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__ParagraphTypes__Alternatives_in_ruleParagraphTypes154);
            rule__ParagraphTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParagraphTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParagraphTypes"


    // $ANTLR start "entryRuleBlockQuote"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:116:1: entryRuleBlockQuote : ruleBlockQuote EOF ;
    public final void entryRuleBlockQuote() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:117:1: ( ruleBlockQuote EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:118:1: ruleBlockQuote EOF
            {
             before(grammarAccess.getBlockQuoteRule()); 
            pushFollow(FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote181);
            ruleBlockQuote();

            state._fsp--;

             after(grammarAccess.getBlockQuoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockQuote188); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:125:1: ruleBlockQuote : ( ( rule__BlockQuote__Group__0 ) ) ;
    public final void ruleBlockQuote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:129:2: ( ( ( rule__BlockQuote__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__BlockQuote__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__BlockQuote__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:131:1: ( rule__BlockQuote__Group__0 )
            {
             before(grammarAccess.getBlockQuoteAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:1: ( rule__BlockQuote__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:2: rule__BlockQuote__Group__0
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0_in_ruleBlockQuote214);
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


    // $ANTLR start "entryRuleTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:144:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:145:1: ( ruleTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:146:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate241);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate248); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:153:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:157:2: ( ( ( rule__Template__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__Template__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__Template__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:159:1: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:1: ( rule__Template__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:2: rule__Template__Group__0
            {
            pushFollow(FOLLOW_rule__Template__Group__0_in_ruleTemplate274);
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


    // $ANTLR start "entryRuleUnOrderListItemLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:172:1: entryRuleUnOrderListItemLevel2 : ruleUnOrderListItemLevel2 EOF ;
    public final void entryRuleUnOrderListItemLevel2() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:173:1: ( ruleUnOrderListItemLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:174:1: ruleUnOrderListItemLevel2 EOF
            {
             before(grammarAccess.getUnOrderListItemLevel2Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2301);
            ruleUnOrderListItemLevel2();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2308); 

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
    // $ANTLR end "entryRuleUnOrderListItemLevel2"


    // $ANTLR start "ruleUnOrderListItemLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:181:1: ruleUnOrderListItemLevel2 : ( ( rule__UnOrderListItemLevel2__Group__0 ) ) ;
    public final void ruleUnOrderListItemLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:185:2: ( ( ( rule__UnOrderListItemLevel2__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__UnOrderListItemLevel2__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__UnOrderListItemLevel2__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:187:1: ( rule__UnOrderListItemLevel2__Group__0 )
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:1: ( rule__UnOrderListItemLevel2__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:2: rule__UnOrderListItemLevel2__Group__0
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__0_in_ruleUnOrderListItemLevel2334);
            rule__UnOrderListItemLevel2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel2Access().getGroup()); 

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
    // $ANTLR end "ruleUnOrderListItemLevel2"


    // $ANTLR start "entryRuleUnOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:200:1: entryRuleUnOrderListItemLevel1 : ruleUnOrderListItemLevel1 EOF ;
    public final void entryRuleUnOrderListItemLevel1() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:201:1: ( ruleUnOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:202:1: ruleUnOrderListItemLevel1 EOF
            {
             before(grammarAccess.getUnOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel1361);
            ruleUnOrderListItemLevel1();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnOrderListItemLevel1368); 

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
    // $ANTLR end "entryRuleUnOrderListItemLevel1"


    // $ANTLR start "ruleUnOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:209:1: ruleUnOrderListItemLevel1 : ( ( rule__UnOrderListItemLevel1__Group__0 ) ) ;
    public final void ruleUnOrderListItemLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:213:2: ( ( ( rule__UnOrderListItemLevel1__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__UnOrderListItemLevel1__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__UnOrderListItemLevel1__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:215:1: ( rule__UnOrderListItemLevel1__Group__0 )
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:1: ( rule__UnOrderListItemLevel1__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:2: rule__UnOrderListItemLevel1__Group__0
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__0_in_ruleUnOrderListItemLevel1394);
            rule__UnOrderListItemLevel1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel1Access().getGroup()); 

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
    // $ANTLR end "ruleUnOrderListItemLevel1"


    // $ANTLR start "entryRuleOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:228:1: entryRuleOrderListItemLevel1 : ruleOrderListItemLevel1 EOF ;
    public final void entryRuleOrderListItemLevel1() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:229:1: ( ruleOrderListItemLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:230:1: ruleOrderListItemLevel1 EOF
            {
             before(grammarAccess.getOrderListItemLevel1Rule()); 
            pushFollow(FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel1421);
            ruleOrderListItemLevel1();

            state._fsp--;

             after(grammarAccess.getOrderListItemLevel1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderListItemLevel1428); 

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
    // $ANTLR end "entryRuleOrderListItemLevel1"


    // $ANTLR start "ruleOrderListItemLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:237:1: ruleOrderListItemLevel1 : ( ( rule__OrderListItemLevel1__Group__0 ) ) ;
    public final void ruleOrderListItemLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:241:2: ( ( ( rule__OrderListItemLevel1__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__OrderListItemLevel1__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__OrderListItemLevel1__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:243:1: ( rule__OrderListItemLevel1__Group__0 )
            {
             before(grammarAccess.getOrderListItemLevel1Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:1: ( rule__OrderListItemLevel1__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:2: rule__OrderListItemLevel1__Group__0
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__0_in_ruleOrderListItemLevel1454);
            rule__OrderListItemLevel1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderListItemLevel1Access().getGroup()); 

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
    // $ANTLR end "ruleOrderListItemLevel1"


    // $ANTLR start "entryRuleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:256:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:257:1: ( ruleImage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:258:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage481);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage488); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:265:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:269:2: ( ( ( rule__Image__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__Image__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__Image__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:271:1: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:1: ( rule__Image__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:2: rule__Image__Group__0
            {
            pushFollow(FOLLOW_rule__Image__Group__0_in_ruleImage514);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCategory"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:284:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:285:1: ( ruleCategory EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:286:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory541);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory548); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:293:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:297:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__Category__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__Category__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:299:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:1: ( rule__Category__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory574);
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


    // $ANTLR start "entryRuleHeading1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:312:1: entryRuleHeading1 : ruleHeading1 EOF ;
    public final void entryRuleHeading1() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:313:1: ( ruleHeading1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:314:1: ruleHeading1 EOF
            {
             before(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading1601);
            ruleHeading1();

            state._fsp--;

             after(grammarAccess.getHeading1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading1608); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:321:1: ruleHeading1 : ( ( rule__Heading1__Group__0 ) ) ;
    public final void ruleHeading1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:325:2: ( ( ( rule__Heading1__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__Heading1__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__Heading1__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:327:1: ( rule__Heading1__Group__0 )
            {
             before(grammarAccess.getHeading1Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:1: ( rule__Heading1__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:2: rule__Heading1__Group__0
            {
            pushFollow(FOLLOW_rule__Heading1__Group__0_in_ruleHeading1634);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: entryRuleHeading2 : ruleHeading2 EOF ;
    public final void entryRuleHeading2() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:341:1: ( ruleHeading2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:342:1: ruleHeading2 EOF
            {
             before(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading2661);
            ruleHeading2();

            state._fsp--;

             after(grammarAccess.getHeading2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading2668); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:349:1: ruleHeading2 : ( ( rule__Heading2__Group__0 ) ) ;
    public final void ruleHeading2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:353:2: ( ( ( rule__Heading2__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__Heading2__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__Heading2__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:355:1: ( rule__Heading2__Group__0 )
            {
             before(grammarAccess.getHeading2Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:1: ( rule__Heading2__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:2: rule__Heading2__Group__0
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0_in_ruleHeading2694);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:368:1: entryRuleHeading3 : ruleHeading3 EOF ;
    public final void entryRuleHeading3() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:369:1: ( ruleHeading3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:370:1: ruleHeading3 EOF
            {
             before(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading3721);
            ruleHeading3();

            state._fsp--;

             after(grammarAccess.getHeading3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading3728); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:377:1: ruleHeading3 : ( ( rule__Heading3__Group__0 ) ) ;
    public final void ruleHeading3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:381:2: ( ( ( rule__Heading3__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Heading3__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Heading3__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:383:1: ( rule__Heading3__Group__0 )
            {
             before(grammarAccess.getHeading3Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:1: ( rule__Heading3__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:2: rule__Heading3__Group__0
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0_in_ruleHeading3754);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:396:1: entryRuleHeading4 : ruleHeading4 EOF ;
    public final void entryRuleHeading4() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:397:1: ( ruleHeading4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:398:1: ruleHeading4 EOF
            {
             before(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading4781);
            ruleHeading4();

            state._fsp--;

             after(grammarAccess.getHeading4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading4788); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:405:1: ruleHeading4 : ( ( rule__Heading4__Group__0 ) ) ;
    public final void ruleHeading4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:409:2: ( ( ( rule__Heading4__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__Heading4__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__Heading4__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:411:1: ( rule__Heading4__Group__0 )
            {
             before(grammarAccess.getHeading4Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:1: ( rule__Heading4__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:2: rule__Heading4__Group__0
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0_in_ruleHeading4814);
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


    // $ANTLR start "entryRuleHeading5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:424:1: entryRuleHeading5 : ruleHeading5 EOF ;
    public final void entryRuleHeading5() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:425:1: ( ruleHeading5 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:426:1: ruleHeading5 EOF
            {
             before(grammarAccess.getHeading5Rule()); 
            pushFollow(FOLLOW_ruleHeading5_in_entryRuleHeading5841);
            ruleHeading5();

            state._fsp--;

             after(grammarAccess.getHeading5Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading5848); 

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
    // $ANTLR end "entryRuleHeading5"


    // $ANTLR start "ruleHeading5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:433:1: ruleHeading5 : ( ( rule__Heading5__Group__0 ) ) ;
    public final void ruleHeading5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:437:2: ( ( ( rule__Heading5__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Heading5__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Heading5__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:439:1: ( rule__Heading5__Group__0 )
            {
             before(grammarAccess.getHeading5Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:1: ( rule__Heading5__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:2: rule__Heading5__Group__0
            {
            pushFollow(FOLLOW_rule__Heading5__Group__0_in_ruleHeading5874);
            rule__Heading5__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeading5Access().getGroup()); 

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
    // $ANTLR end "ruleHeading5"


    // $ANTLR start "entryRuleAbstractFormattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:452:1: entryRuleAbstractFormattedInlineContent : ruleAbstractFormattedInlineContent EOF ;
    public final void entryRuleAbstractFormattedInlineContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:453:1: ( ruleAbstractFormattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:454:1: ruleAbstractFormattedInlineContent EOF
            {
             before(grammarAccess.getAbstractFormattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent901);
            ruleAbstractFormattedInlineContent();

            state._fsp--;

             after(grammarAccess.getAbstractFormattedInlineContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent908); 

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
    // $ANTLR end "entryRuleAbstractFormattedInlineContent"


    // $ANTLR start "ruleAbstractFormattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:461:1: ruleAbstractFormattedInlineContent : ( ( rule__AbstractFormattedInlineContent__Alternatives ) ) ;
    public final void ruleAbstractFormattedInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:465:2: ( ( ( rule__AbstractFormattedInlineContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__AbstractFormattedInlineContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__AbstractFormattedInlineContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:467:1: ( rule__AbstractFormattedInlineContent__Alternatives )
            {
             before(grammarAccess.getAbstractFormattedInlineContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:1: ( rule__AbstractFormattedInlineContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:2: rule__AbstractFormattedInlineContent__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractFormattedInlineContent__Alternatives_in_ruleAbstractFormattedInlineContent934);
            rule__AbstractFormattedInlineContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractFormattedInlineContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractFormattedInlineContent"


    // $ANTLR start "entryRuleBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:480:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:481:1: ( ruleBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:482:1: ruleBold EOF
            {
             before(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold961);
            ruleBold();

            state._fsp--;

             after(grammarAccess.getBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold968); 

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
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:489:1: ruleBold : ( ( rule__Bold__Group__0 ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:493:2: ( ( ( rule__Bold__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__Bold__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__Bold__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:495:1: ( rule__Bold__Group__0 )
            {
             before(grammarAccess.getBoldAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:1: ( rule__Bold__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:2: rule__Bold__Group__0
            {
            pushFollow(FOLLOW_rule__Bold__Group__0_in_ruleBold994);
            rule__Bold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getGroup()); 

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
    // $ANTLR end "ruleBold"


    // $ANTLR start "entryRuleItalic"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:508:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:509:1: ( ruleItalic EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:510:1: ruleItalic EOF
            {
             before(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic1021);
            ruleItalic();

            state._fsp--;

             after(grammarAccess.getItalicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic1028); 

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
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:517:1: ruleItalic : ( ( rule__Italic__Group__0 ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:521:2: ( ( ( rule__Italic__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__Italic__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__Italic__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:523:1: ( rule__Italic__Group__0 )
            {
             before(grammarAccess.getItalicAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:1: ( rule__Italic__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:2: rule__Italic__Group__0
            {
            pushFollow(FOLLOW_rule__Italic__Group__0_in_ruleItalic1054);
            rule__Italic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getGroup()); 

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
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleItalicBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:536:1: entryRuleItalicBold : ruleItalicBold EOF ;
    public final void entryRuleItalicBold() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:537:1: ( ruleItalicBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:538:1: ruleItalicBold EOF
            {
             before(grammarAccess.getItalicBoldRule()); 
            pushFollow(FOLLOW_ruleItalicBold_in_entryRuleItalicBold1081);
            ruleItalicBold();

            state._fsp--;

             after(grammarAccess.getItalicBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBold1088); 

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
    // $ANTLR end "entryRuleItalicBold"


    // $ANTLR start "ruleItalicBold"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:545:1: ruleItalicBold : ( ( rule__ItalicBold__Group__0 ) ) ;
    public final void ruleItalicBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:549:2: ( ( ( rule__ItalicBold__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__ItalicBold__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__ItalicBold__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:551:1: ( rule__ItalicBold__Group__0 )
            {
             before(grammarAccess.getItalicBoldAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:1: ( rule__ItalicBold__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:2: rule__ItalicBold__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__0_in_ruleItalicBold1114);
            rule__ItalicBold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicBoldAccess().getGroup()); 

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
    // $ANTLR end "ruleItalicBold"


    // $ANTLR start "entryRuleAbstractUnformattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:564:1: entryRuleAbstractUnformattedInlineContent : ruleAbstractUnformattedInlineContent EOF ;
    public final void entryRuleAbstractUnformattedInlineContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:565:1: ( ruleAbstractUnformattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:566:1: ruleAbstractUnformattedInlineContent EOF
            {
             before(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent1141);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent1148); 

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
    // $ANTLR end "entryRuleAbstractUnformattedInlineContent"


    // $ANTLR start "ruleAbstractUnformattedInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:573:1: ruleAbstractUnformattedInlineContent : ( ( rule__AbstractUnformattedInlineContent__Alternatives ) ) ;
    public final void ruleAbstractUnformattedInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:577:2: ( ( ( rule__AbstractUnformattedInlineContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:578:1: ( ( rule__AbstractUnformattedInlineContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:578:1: ( ( rule__AbstractUnformattedInlineContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:579:1: ( rule__AbstractUnformattedInlineContent__Alternatives )
            {
             before(grammarAccess.getAbstractUnformattedInlineContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:580:1: ( rule__AbstractUnformattedInlineContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:580:2: rule__AbstractUnformattedInlineContent__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractUnformattedInlineContent__Alternatives_in_ruleAbstractUnformattedInlineContent1174);
            rule__AbstractUnformattedInlineContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractUnformattedInlineContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractUnformattedInlineContent"


    // $ANTLR start "entryRuleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:592:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:593:1: ( ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:594:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1201);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1208); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:601:1: ruleText : ( ( rule__Text__NameAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:605:2: ( ( ( rule__Text__NameAssignment ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:606:1: ( ( rule__Text__NameAssignment ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:606:1: ( ( rule__Text__NameAssignment ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:607:1: ( rule__Text__NameAssignment )
            {
             before(grammarAccess.getTextAccess().getNameAssignment()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:608:1: ( rule__Text__NameAssignment )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:608:2: rule__Text__NameAssignment
            {
            pushFollow(FOLLOW_rule__Text__NameAssignment_in_ruleText1234);
            rule__Text__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleHyperLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:620:1: entryRuleHyperLink : ruleHyperLink EOF ;
    public final void entryRuleHyperLink() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:621:1: ( ruleHyperLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:622:1: ruleHyperLink EOF
            {
             before(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_ruleHyperLink_in_entryRuleHyperLink1261);
            ruleHyperLink();

            state._fsp--;

             after(grammarAccess.getHyperLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperLink1268); 

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
    // $ANTLR end "entryRuleHyperLink"


    // $ANTLR start "ruleHyperLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:629:1: ruleHyperLink : ( ( rule__HyperLink__Alternatives ) ) ;
    public final void ruleHyperLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:633:2: ( ( ( rule__HyperLink__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__HyperLink__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__HyperLink__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:635:1: ( rule__HyperLink__Alternatives )
            {
             before(grammarAccess.getHyperLinkAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:1: ( rule__HyperLink__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:2: rule__HyperLink__Alternatives
            {
            pushFollow(FOLLOW_rule__HyperLink__Alternatives_in_ruleHyperLink1294);
            rule__HyperLink__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHyperLinkAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHyperLink"


    // $ANTLR start "entryRuleInternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:648:1: entryRuleInternal : ruleInternal EOF ;
    public final void entryRuleInternal() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:649:1: ( ruleInternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:650:1: ruleInternal EOF
            {
             before(grammarAccess.getInternalRule()); 
            pushFollow(FOLLOW_ruleInternal_in_entryRuleInternal1321);
            ruleInternal();

            state._fsp--;

             after(grammarAccess.getInternalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternal1328); 

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
    // $ANTLR end "entryRuleInternal"


    // $ANTLR start "ruleInternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:657:1: ruleInternal : ( ( rule__Internal__Group__0 ) ) ;
    public final void ruleInternal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:661:2: ( ( ( rule__Internal__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:662:1: ( ( rule__Internal__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:662:1: ( ( rule__Internal__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:663:1: ( rule__Internal__Group__0 )
            {
             before(grammarAccess.getInternalAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:664:1: ( rule__Internal__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:664:2: rule__Internal__Group__0
            {
            pushFollow(FOLLOW_rule__Internal__Group__0_in_ruleInternal1354);
            rule__Internal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalAccess().getGroup()); 

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
    // $ANTLR end "ruleInternal"


    // $ANTLR start "entryRuleInternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:676:1: entryRuleInternalAlt : ruleInternalAlt EOF ;
    public final void entryRuleInternalAlt() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:677:1: ( ruleInternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:678:1: ruleInternalAlt EOF
            {
             before(grammarAccess.getInternalAltRule()); 
            pushFollow(FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt1381);
            ruleInternalAlt();

            state._fsp--;

             after(grammarAccess.getInternalAltRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalAlt1388); 

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
    // $ANTLR end "entryRuleInternalAlt"


    // $ANTLR start "ruleInternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:685:1: ruleInternalAlt : ( ( rule__InternalAlt__Group__0 ) ) ;
    public final void ruleInternalAlt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:689:2: ( ( ( rule__InternalAlt__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:690:1: ( ( rule__InternalAlt__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:690:1: ( ( rule__InternalAlt__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:691:1: ( rule__InternalAlt__Group__0 )
            {
             before(grammarAccess.getInternalAltAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:692:1: ( rule__InternalAlt__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:692:2: rule__InternalAlt__Group__0
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__0_in_ruleInternalAlt1414);
            rule__InternalAlt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalAltAccess().getGroup()); 

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
    // $ANTLR end "ruleInternalAlt"


    // $ANTLR start "entryRuleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:704:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:705:1: ( ruleExternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:706:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_ruleExternal_in_entryRuleExternal1441);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternal1448); 

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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:713:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:717:2: ( ( ( rule__External__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:1: ( ( rule__External__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:1: ( ( rule__External__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:719:1: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:720:1: ( rule__External__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:720:2: rule__External__Group__0
            {
            pushFollow(FOLLOW_rule__External__Group__0_in_ruleExternal1474);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleExternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:732:1: entryRuleExternalAlt : ruleExternalAlt EOF ;
    public final void entryRuleExternalAlt() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:733:1: ( ruleExternalAlt EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:734:1: ruleExternalAlt EOF
            {
             before(grammarAccess.getExternalAltRule()); 
            pushFollow(FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt1501);
            ruleExternalAlt();

            state._fsp--;

             after(grammarAccess.getExternalAltRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalAlt1508); 

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
    // $ANTLR end "entryRuleExternalAlt"


    // $ANTLR start "ruleExternalAlt"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:741:1: ruleExternalAlt : ( ( rule__ExternalAlt__Group__0 ) ) ;
    public final void ruleExternalAlt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:745:2: ( ( ( rule__ExternalAlt__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:746:1: ( ( rule__ExternalAlt__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:746:1: ( ( rule__ExternalAlt__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:747:1: ( rule__ExternalAlt__Group__0 )
            {
             before(grammarAccess.getExternalAltAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:748:1: ( rule__ExternalAlt__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:748:2: rule__ExternalAlt__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__0_in_ruleExternalAlt1534);
            rule__ExternalAlt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAltAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalAlt"


    // $ANTLR start "entryRuleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:760:1: entryRuleAnyTextSequence : ruleAnyTextSequence EOF ;
    public final void entryRuleAnyTextSequence() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:761:1: ( ruleAnyTextSequence EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:762:1: ruleAnyTextSequence EOF
            {
             before(grammarAccess.getAnyTextSequenceRule()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence1561);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getAnyTextSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyTextSequence1568); 

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
    // $ANTLR end "entryRuleAnyTextSequence"


    // $ANTLR start "ruleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:769:1: ruleAnyTextSequence : ( ( rule__AnyTextSequence__Group__0 ) ) ;
    public final void ruleAnyTextSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:773:2: ( ( ( rule__AnyTextSequence__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:774:1: ( ( rule__AnyTextSequence__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:774:1: ( ( rule__AnyTextSequence__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:775:1: ( rule__AnyTextSequence__Group__0 )
            {
             before(grammarAccess.getAnyTextSequenceAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:776:1: ( rule__AnyTextSequence__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:776:2: rule__AnyTextSequence__Group__0
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__0_in_ruleAnyTextSequence1594);
            rule__AnyTextSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnyTextSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleAnyTextSequence"


    // $ANTLR start "entryRuleAnyText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:788:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:789:1: ( ruleAnyText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:790:1: ruleAnyText EOF
            {
             before(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText1621);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getAnyTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText1628); 

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
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:797:1: ruleAnyText : ( ( rule__AnyText__NameAssignment ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:801:2: ( ( ( rule__AnyText__NameAssignment ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyText__NameAssignment ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyText__NameAssignment ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:803:1: ( rule__AnyText__NameAssignment )
            {
             before(grammarAccess.getAnyTextAccess().getNameAssignment()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:1: ( rule__AnyText__NameAssignment )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:2: rule__AnyText__NameAssignment
            {
            pushFollow(FOLLOW_rule__AnyText__NameAssignment_in_ruleAnyText1654);
            rule__AnyText__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnyTextAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleName"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:816:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:817:1: ( ruleName EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:818:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1681);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1688); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:825:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:829:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( ( rule__Name__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( ( rule__Name__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:831:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:832:1: ( rule__Name__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:832:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName1714);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleViewType"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:845:1: ruleViewType : ( ( rule__ViewType__Alternatives ) ) ;
    public final void ruleViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:849:1: ( ( ( rule__ViewType__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:850:1: ( ( rule__ViewType__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:850:1: ( ( rule__ViewType__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:851:1: ( rule__ViewType__Alternatives )
            {
             before(grammarAccess.getViewTypeAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:852:1: ( rule__ViewType__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:852:2: rule__ViewType__Alternatives
            {
            pushFollow(FOLLOW_rule__ViewType__Alternatives_in_ruleViewType1751);
            rule__ViewType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getViewTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleViewType"


    // $ANTLR start "ruleHorizontalAlign"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:864:1: ruleHorizontalAlign : ( ( rule__HorizontalAlign__Alternatives ) ) ;
    public final void ruleHorizontalAlign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:868:1: ( ( ( rule__HorizontalAlign__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:869:1: ( ( rule__HorizontalAlign__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:869:1: ( ( rule__HorizontalAlign__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:870:1: ( rule__HorizontalAlign__Alternatives )
            {
             before(grammarAccess.getHorizontalAlignAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:871:1: ( rule__HorizontalAlign__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:871:2: rule__HorizontalAlign__Alternatives
            {
            pushFollow(FOLLOW_rule__HorizontalAlign__Alternatives_in_ruleHorizontalAlign1787);
            rule__HorizontalAlign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHorizontalAlignAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHorizontalAlign"


    // $ANTLR start "rule__ParagraphTypes__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:882:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) );
    public final void rule__ParagraphTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:886:1: ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) )
            int alt1=14;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:887:1: ( ruleOrderListItemLevel1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:887:1: ( ruleOrderListItemLevel1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:888:1: ruleOrderListItemLevel1
                    {
                     before(grammarAccess.getParagraphTypesAccess().getOrderListItemLevel1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOrderListItemLevel1_in_rule__ParagraphTypes__Alternatives1822);
                    ruleOrderListItemLevel1();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getOrderListItemLevel1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:893:6: ( ruleUnOrderListItemLevel1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:893:6: ( ruleUnOrderListItemLevel1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:894:1: ruleUnOrderListItemLevel1
                    {
                     before(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel1ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnOrderListItemLevel1_in_rule__ParagraphTypes__Alternatives1839);
                    ruleUnOrderListItemLevel1();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel1ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:899:6: ( ruleUnOrderListItemLevel2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:899:6: ( ruleUnOrderListItemLevel2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:900:1: ruleUnOrderListItemLevel2
                    {
                     before(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel2ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUnOrderListItemLevel2_in_rule__ParagraphTypes__Alternatives1856);
                    ruleUnOrderListItemLevel2();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getUnOrderListItemLevel2ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:6: ( ruleImage )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:6: ( ruleImage )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:906:1: ruleImage
                    {
                     before(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__ParagraphTypes__Alternatives1873);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:911:6: ( ruleCategory )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:911:6: ( ruleCategory )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:912:1: ruleCategory
                    {
                     before(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCategory_in_rule__ParagraphTypes__Alternatives1890);
                    ruleCategory();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:917:6: ( ruleTemplate )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:917:6: ( ruleTemplate )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:918:1: ruleTemplate
                    {
                     before(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTemplate_in_rule__ParagraphTypes__Alternatives1907);
                    ruleTemplate();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:923:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:923:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:924:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getParagraphTypesAccess().getAbstractFormattedInlineContentParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ParagraphTypes__Alternatives1924);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getAbstractFormattedInlineContentParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:929:6: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:929:6: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:930:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getParagraphTypesAccess().getAbstractUnformattedInlineContentParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ParagraphTypes__Alternatives1941);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getAbstractUnformattedInlineContentParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:935:6: ( ruleBlockQuote )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:935:6: ( ruleBlockQuote )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:936:1: ruleBlockQuote
                    {
                     before(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives1958);
                    ruleBlockQuote();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:941:6: ( ruleHeading1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:941:6: ( ruleHeading1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:942:1: ruleHeading1
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleHeading1_in_rule__ParagraphTypes__Alternatives1975);
                    ruleHeading1();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:6: ( ruleHeading2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:6: ( ruleHeading2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:948:1: ruleHeading2
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives1992);
                    ruleHeading2();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:953:6: ( ruleHeading3 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:953:6: ( ruleHeading3 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:954:1: ruleHeading3
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives2009);
                    ruleHeading3();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:959:6: ( ruleHeading4 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:959:6: ( ruleHeading4 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:960:1: ruleHeading4
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2026);
                    ruleHeading4();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:965:6: ( ruleHeading5 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:965:6: ( ruleHeading5 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:966:1: ruleHeading5
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_13()); 
                    pushFollow(FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2043);
                    ruleHeading5();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_13()); 

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
    // $ANTLR end "rule__ParagraphTypes__Alternatives"


    // $ANTLR start "rule__AbstractFormattedInlineContent__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:976:1: rule__AbstractFormattedInlineContent__Alternatives : ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) );
    public final void rule__AbstractFormattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:980:1: ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 42:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:1: ( ruleBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:1: ( ruleBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:982:1: ruleBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2075);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleItalic )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleItalic )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:988:1: ruleItalic
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2092);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:993:6: ( ruleItalicBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:993:6: ( ruleItalicBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:994:1: ruleItalicBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2109);
                    ruleItalicBold();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractFormattedInlineContent__Alternatives"


    // $ANTLR start "rule__AbstractUnformattedInlineContent__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1004:1: rule__AbstractUnformattedInlineContent__Alternatives : ( ( ruleText ) | ( ruleHyperLink ) );
    public final void rule__AbstractUnformattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1008:1: ( ( ruleText ) | ( ruleHyperLink ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==30||LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:1: ( ruleText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:1: ( ruleText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1010:1: ruleText
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2141);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1015:6: ( ruleHyperLink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1015:6: ( ruleHyperLink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1016:1: ruleHyperLink
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2158);
                    ruleHyperLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractUnformattedInlineContent__Alternatives"


    // $ANTLR start "rule__HyperLink__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1026:1: rule__HyperLink__Alternatives : ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) );
    public final void rule__HyperLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1030:1: ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:1: ( ruleInternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:1: ( ruleInternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1032:1: ruleInternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2190);
                    ruleInternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1037:6: ( ruleInternalAlt )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1037:6: ( ruleInternalAlt )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1038:1: ruleInternalAlt
                    {
                     before(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInternalAlt_in_rule__HyperLink__Alternatives2207);
                    ruleInternalAlt();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:6: ( ruleExternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:6: ( ruleExternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1044:1: ruleExternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2224);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1049:6: ( ruleExternalAlt )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1049:6: ( ruleExternalAlt )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1050:1: ruleExternalAlt
                    {
                     before(grammarAccess.getHyperLinkAccess().getExternalAltParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExternalAlt_in_rule__HyperLink__Alternatives2241);
                    ruleExternalAlt();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getExternalAltParserRuleCall_3()); 

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
    // $ANTLR end "rule__HyperLink__Alternatives"


    // $ANTLR start "rule__InternalAlt__AltTextAlternatives_3_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1060:1: rule__InternalAlt__AltTextAlternatives_3_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__InternalAlt__AltTextAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1064:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==30||LA5_0==43) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=40 && LA5_0<=42)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1065:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1065:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1066:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02273);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1071:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1071:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1072:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getInternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02290);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getInternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__InternalAlt__AltTextAlternatives_3_0"


    // $ANTLR start "rule__ExternalAlt__AltTextAlternatives_2_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1082:1: rule__ExternalAlt__AltTextAlternatives_2_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__ExternalAlt__AltTextAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1086:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==30||LA6_0==43) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=40 && LA6_0<=42)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1088:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02322);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1093:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1093:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1094:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getExternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02339);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getExternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__ExternalAlt__AltTextAlternatives_2_0"


    // $ANTLR start "rule__AnyText__NameAlternatives_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1104:1: rule__AnyText__NameAlternatives_0 : ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) );
    public final void rule__AnyText__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1108:1: ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=40 && LA7_0<=42)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||LA7_0==30||LA7_0==43) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:1: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:1: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1110:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getNameAbstractFormattedInlineContentParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__NameAlternatives_02371);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getAnyTextAccess().getNameAbstractFormattedInlineContentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1115:6: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1115:6: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1116:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getNameAbstractUnformattedInlineContentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__NameAlternatives_02388);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getAnyTextAccess().getNameAbstractUnformattedInlineContentParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__AnyText__NameAlternatives_0"


    // $ANTLR start "rule__ViewType__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1126:1: rule__ViewType__Alternatives : ( ( ( 'thumb' ) ) | ( ( 'thumbnail' ) ) | ( ( 'frame' ) ) | ( ( 'framed' ) ) | ( ( 'frameless' ) ) );
    public final void rule__ViewType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1130:1: ( ( ( 'thumb' ) ) | ( ( 'thumbnail' ) ) | ( ( 'frame' ) ) | ( ( 'framed' ) ) | ( ( 'frameless' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            case 15:
                {
                alt8=4;
                }
                break;
            case 16:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ( 'thumb' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ( 'thumb' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1132:1: ( 'thumb' )
                    {
                     before(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1133:1: ( 'thumb' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1133:3: 'thumb'
                    {
                    match(input,12,FOLLOW_12_in_rule__ViewType__Alternatives2421); 

                    }

                     after(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1138:6: ( ( 'thumbnail' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1138:6: ( ( 'thumbnail' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1139:1: ( 'thumbnail' )
                    {
                     before(grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1140:1: ( 'thumbnail' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1140:3: 'thumbnail'
                    {
                    match(input,13,FOLLOW_13_in_rule__ViewType__Alternatives2442); 

                    }

                     after(grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1145:6: ( ( 'frame' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1145:6: ( ( 'frame' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1146:1: ( 'frame' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1147:1: ( 'frame' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1147:3: 'frame'
                    {
                    match(input,14,FOLLOW_14_in_rule__ViewType__Alternatives2463); 

                    }

                     after(grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1152:6: ( ( 'framed' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1152:6: ( ( 'framed' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1153:1: ( 'framed' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1154:1: ( 'framed' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1154:3: 'framed'
                    {
                    match(input,15,FOLLOW_15_in_rule__ViewType__Alternatives2484); 

                    }

                     after(grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1159:6: ( ( 'frameless' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1159:6: ( ( 'frameless' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1160:1: ( 'frameless' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFramelessEnumLiteralDeclaration_4()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1161:1: ( 'frameless' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1161:3: 'frameless'
                    {
                    match(input,16,FOLLOW_16_in_rule__ViewType__Alternatives2505); 

                    }

                     after(grammarAccess.getViewTypeAccess().getFramelessEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__ViewType__Alternatives"


    // $ANTLR start "rule__HorizontalAlign__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1171:1: rule__HorizontalAlign__Alternatives : ( ( ( 'right' ) ) | ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'none' ) ) );
    public final void rule__HorizontalAlign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1175:1: ( ( ( 'right' ) ) | ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'none' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            case 20:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1176:1: ( ( 'right' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1176:1: ( ( 'right' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1177:1: ( 'right' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1178:1: ( 'right' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1178:3: 'right'
                    {
                    match(input,17,FOLLOW_17_in_rule__HorizontalAlign__Alternatives2541); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1183:6: ( ( 'left' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1183:6: ( ( 'left' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1184:1: ( 'left' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1185:1: ( 'left' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1185:3: 'left'
                    {
                    match(input,18,FOLLOW_18_in_rule__HorizontalAlign__Alternatives2562); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1190:6: ( ( 'center' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1190:6: ( ( 'center' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:1: ( 'center' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1192:1: ( 'center' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1192:3: 'center'
                    {
                    match(input,19,FOLLOW_19_in_rule__HorizontalAlign__Alternatives2583); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1197:6: ( ( 'none' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1197:6: ( ( 'none' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1198:1: ( 'none' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getNoneEnumLiteralDeclaration_3()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1199:1: ( 'none' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1199:3: 'none'
                    {
                    match(input,20,FOLLOW_20_in_rule__HorizontalAlign__Alternatives2604); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getNoneEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__HorizontalAlign__Alternatives"


    // $ANTLR start "rule__WikiPage__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1211:1: rule__WikiPage__Group__0 : rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 ;
    public final void rule__WikiPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1215:1: ( rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1216:2: rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02637);
            rule__WikiPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02640);
            rule__WikiPage__Group__1();

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
    // $ANTLR end "rule__WikiPage__Group__0"


    // $ANTLR start "rule__WikiPage__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1223:1: rule__WikiPage__Group__0__Impl : ( ( rule__WikiPage__NameAssignment_0 ) ) ;
    public final void rule__WikiPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1227:1: ( ( ( rule__WikiPage__NameAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1228:1: ( ( rule__WikiPage__NameAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1228:1: ( ( rule__WikiPage__NameAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1229:1: ( rule__WikiPage__NameAssignment_0 )
            {
             before(grammarAccess.getWikiPageAccess().getNameAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1230:1: ( rule__WikiPage__NameAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1230:2: rule__WikiPage__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__WikiPage__NameAssignment_0_in_rule__WikiPage__Group__0__Impl2667);
            rule__WikiPage__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWikiPageAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__WikiPage__Group__0__Impl"


    // $ANTLR start "rule__WikiPage__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1240:1: rule__WikiPage__Group__1 : rule__WikiPage__Group__1__Impl ;
    public final void rule__WikiPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1244:1: ( rule__WikiPage__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1245:2: rule__WikiPage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12697);
            rule__WikiPage__Group__1__Impl();

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
    // $ANTLR end "rule__WikiPage__Group__1"


    // $ANTLR start "rule__WikiPage__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1251:1: rule__WikiPage__Group__1__Impl : ( ( rule__WikiPage__ElementsAssignment_1 )* ) ;
    public final void rule__WikiPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1255:1: ( ( ( rule__WikiPage__ElementsAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1256:1: ( ( rule__WikiPage__ElementsAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1256:1: ( ( rule__WikiPage__ElementsAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1257:1: ( rule__WikiPage__ElementsAssignment_1 )*
            {
             before(grammarAccess.getWikiPageAccess().getElementsAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1258:1: ( rule__WikiPage__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==21||LA10_0==23||LA10_0==26||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=35 && LA10_0<=43)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1258:2: rule__WikiPage__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__WikiPage__ElementsAssignment_1_in_rule__WikiPage__Group__1__Impl2724);
            	    rule__WikiPage__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWikiPageAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__WikiPage__Group__1__Impl"


    // $ANTLR start "rule__BlockQuote__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1272:1: rule__BlockQuote__Group__0 : rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 ;
    public final void rule__BlockQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1276:1: ( rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1277:2: rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02759);
            rule__BlockQuote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02762);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1284:1: rule__BlockQuote__Group__0__Impl : ( () ) ;
    public final void rule__BlockQuote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1288:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1289:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1289:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1290:1: ()
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1291:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1293:1: 
            {
            }

             after(grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockQuote__Group__0__Impl"


    // $ANTLR start "rule__BlockQuote__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1303:1: rule__BlockQuote__Group__1 : rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 ;
    public final void rule__BlockQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1307:1: ( rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1308:2: rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12820);
            rule__BlockQuote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12823);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1315:1: rule__BlockQuote__Group__1__Impl : ( '<blockquote>' ) ;
    public final void rule__BlockQuote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1319:1: ( ( '<blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1320:1: ( '<blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1320:1: ( '<blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1321:1: '<blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BlockQuote__Group__1__Impl2851); 
             after(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1334:1: rule__BlockQuote__Group__2 : rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 ;
    public final void rule__BlockQuote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1338:1: ( rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1339:2: rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22882);
            rule__BlockQuote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22885);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1346:1: rule__BlockQuote__Group__2__Impl : ( ( rule__BlockQuote__ContentAssignment_2 ) ) ;
    public final void rule__BlockQuote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1350:1: ( ( ( rule__BlockQuote__ContentAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1351:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1351:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1352:1: ( rule__BlockQuote__ContentAssignment_2 )
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1353:1: ( rule__BlockQuote__ContentAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1353:2: rule__BlockQuote__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl2912);
            rule__BlockQuote__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockQuoteAccess().getContentAssignment_2()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1363:1: rule__BlockQuote__Group__3 : rule__BlockQuote__Group__3__Impl ;
    public final void rule__BlockQuote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1367:1: ( rule__BlockQuote__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1368:2: rule__BlockQuote__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__32942);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1374:1: rule__BlockQuote__Group__3__Impl : ( '</blockquote>' ) ;
    public final void rule__BlockQuote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1378:1: ( ( '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1379:1: ( '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1379:1: ( '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1380:1: '</blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__BlockQuote__Group__3__Impl2970); 
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


    // $ANTLR start "rule__Template__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1401:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1405:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1406:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__03009);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__03012);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1413:1: rule__Template__Group__0__Impl : ( '{{' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1417:1: ( ( '{{' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1418:1: ( '{{' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1418:1: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1419:1: '{{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Template__Group__0__Impl3040); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1432:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1436:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1437:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__13071);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__13074);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1444:1: rule__Template__Group__1__Impl : ( ( rule__Template__ContentAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1448:1: ( ( ( rule__Template__ContentAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1449:1: ( ( rule__Template__ContentAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1449:1: ( ( rule__Template__ContentAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1450:1: ( rule__Template__ContentAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getContentAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1451:1: ( rule__Template__ContentAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1451:2: rule__Template__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__ContentAssignment_1_in_rule__Template__Group__1__Impl3101);
            rule__Template__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getContentAssignment_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1461:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1465:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1466:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__23131);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__23134);
            rule__Template__Group__3();

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1473:1: rule__Template__Group__2__Impl : ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1477:1: ( ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1478:1: ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1478:1: ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1479:1: ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1479:1: ( ( rule__Template__Group_2__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1480:1: ( rule__Template__Group_2__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1481:1: ( rule__Template__Group_2__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1481:2: rule__Template__Group_2__0
            {
            pushFollow(FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3163);
            rule__Template__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup_2()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1484:1: ( ( rule__Template__Group_2__0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1485:1: ( rule__Template__Group_2__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1486:1: ( rule__Template__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1486:2: rule__Template__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3175);
            	    rule__Template__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getGroup_2()); 

            }


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


    // $ANTLR start "rule__Template__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1497:1: rule__Template__Group__3 : rule__Template__Group__3__Impl ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1501:1: ( rule__Template__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1502:2: rule__Template__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__33208);
            rule__Template__Group__3__Impl();

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
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1508:1: rule__Template__Group__3__Impl : ( '}}' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1512:1: ( ( '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1513:1: ( '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1513:1: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1514:1: '}}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Template__Group__3__Impl3236); 
             after(grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group_2__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1535:1: rule__Template__Group_2__0 : rule__Template__Group_2__0__Impl rule__Template__Group_2__1 ;
    public final void rule__Template__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1539:1: ( rule__Template__Group_2__0__Impl rule__Template__Group_2__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1540:2: rule__Template__Group_2__0__Impl rule__Template__Group_2__1
            {
            pushFollow(FOLLOW_rule__Template__Group_2__0__Impl_in_rule__Template__Group_2__03275);
            rule__Template__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group_2__1_in_rule__Template__Group_2__03278);
            rule__Template__Group_2__1();

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
    // $ANTLR end "rule__Template__Group_2__0"


    // $ANTLR start "rule__Template__Group_2__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1547:1: rule__Template__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Template__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1551:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1552:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1552:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1553:1: '|'
            {
             before(grammarAccess.getTemplateAccess().getVerticalLineKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Template__Group_2__0__Impl3306); 
             after(grammarAccess.getTemplateAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__Template__Group_2__0__Impl"


    // $ANTLR start "rule__Template__Group_2__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1566:1: rule__Template__Group_2__1 : rule__Template__Group_2__1__Impl ;
    public final void rule__Template__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1570:1: ( rule__Template__Group_2__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1571:2: rule__Template__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group_2__1__Impl_in_rule__Template__Group_2__13337);
            rule__Template__Group_2__1__Impl();

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
    // $ANTLR end "rule__Template__Group_2__1"


    // $ANTLR start "rule__Template__Group_2__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1577:1: rule__Template__Group_2__1__Impl : ( ( rule__Template__ContentAssignment_2_1 ) ) ;
    public final void rule__Template__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1581:1: ( ( ( rule__Template__ContentAssignment_2_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1582:1: ( ( rule__Template__ContentAssignment_2_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1582:1: ( ( rule__Template__ContentAssignment_2_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1583:1: ( rule__Template__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTemplateAccess().getContentAssignment_2_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1584:1: ( rule__Template__ContentAssignment_2_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1584:2: rule__Template__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Template__ContentAssignment_2_1_in_rule__Template__Group_2__1__Impl3364);
            rule__Template__ContentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getContentAssignment_2_1()); 

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
    // $ANTLR end "rule__Template__Group_2__1__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1598:1: rule__UnOrderListItemLevel2__Group__0 : rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1 ;
    public final void rule__UnOrderListItemLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1602:1: ( rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1603:2: rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__0__Impl_in_rule__UnOrderListItemLevel2__Group__03398);
            rule__UnOrderListItemLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__1_in_rule__UnOrderListItemLevel2__Group__03401);
            rule__UnOrderListItemLevel2__Group__1();

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__0"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1610:1: rule__UnOrderListItemLevel2__Group__0__Impl : ( '**' ) ;
    public final void rule__UnOrderListItemLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1614:1: ( ( '**' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1615:1: ( '**' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1615:1: ( '**' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1616:1: '**'
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getAsteriskAsteriskKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__UnOrderListItemLevel2__Group__0__Impl3429); 
             after(grammarAccess.getUnOrderListItemLevel2Access().getAsteriskAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__0__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1629:1: rule__UnOrderListItemLevel2__Group__1 : rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2 ;
    public final void rule__UnOrderListItemLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1633:1: ( rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1634:2: rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__1__Impl_in_rule__UnOrderListItemLevel2__Group__13460);
            rule__UnOrderListItemLevel2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__2_in_rule__UnOrderListItemLevel2__Group__13463);
            rule__UnOrderListItemLevel2__Group__2();

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__1"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1641:1: rule__UnOrderListItemLevel2__Group__1__Impl : ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) ) ;
    public final void rule__UnOrderListItemLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1645:1: ( ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1646:1: ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1646:1: ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1647:1: ( rule__UnOrderListItemLevel2__NameAssignment_1 )
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1648:1: ( rule__UnOrderListItemLevel2__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1648:2: rule__UnOrderListItemLevel2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__NameAssignment_1_in_rule__UnOrderListItemLevel2__Group__1__Impl3490);
            rule__UnOrderListItemLevel2__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel2Access().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__1__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1658:1: rule__UnOrderListItemLevel2__Group__2 : rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3 ;
    public final void rule__UnOrderListItemLevel2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1662:1: ( rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1663:2: rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__2__Impl_in_rule__UnOrderListItemLevel2__Group__23520);
            rule__UnOrderListItemLevel2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__3_in_rule__UnOrderListItemLevel2__Group__23523);
            rule__UnOrderListItemLevel2__Group__3();

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__2"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1670:1: rule__UnOrderListItemLevel2__Group__2__Impl : ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) ) ;
    public final void rule__UnOrderListItemLevel2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1674:1: ( ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1675:1: ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1675:1: ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1676:1: ( rule__UnOrderListItemLevel2__ListAssignment_2 )
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1677:1: ( rule__UnOrderListItemLevel2__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1677:2: rule__UnOrderListItemLevel2__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__ListAssignment_2_in_rule__UnOrderListItemLevel2__Group__2__Impl3550);
            rule__UnOrderListItemLevel2__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel2Access().getListAssignment_2()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__2__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1687:1: rule__UnOrderListItemLevel2__Group__3 : rule__UnOrderListItemLevel2__Group__3__Impl ;
    public final void rule__UnOrderListItemLevel2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1691:1: ( rule__UnOrderListItemLevel2__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1692:2: rule__UnOrderListItemLevel2__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__3__Impl_in_rule__UnOrderListItemLevel2__Group__33580);
            rule__UnOrderListItemLevel2__Group__3__Impl();

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__3"


    // $ANTLR start "rule__UnOrderListItemLevel2__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1698:1: rule__UnOrderListItemLevel2__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__UnOrderListItemLevel2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1702:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1703:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1703:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1704:1: ':LIST'
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__UnOrderListItemLevel2__Group__3__Impl3608); 
             after(grammarAccess.getUnOrderListItemLevel2Access().getLISTKeyword_3()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__Group__3__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1725:1: rule__UnOrderListItemLevel1__Group__0 : rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1 ;
    public final void rule__UnOrderListItemLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1729:1: ( rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1730:2: rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__0__Impl_in_rule__UnOrderListItemLevel1__Group__03647);
            rule__UnOrderListItemLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__1_in_rule__UnOrderListItemLevel1__Group__03650);
            rule__UnOrderListItemLevel1__Group__1();

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__0"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1737:1: rule__UnOrderListItemLevel1__Group__0__Impl : ( '*' ) ;
    public final void rule__UnOrderListItemLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1741:1: ( ( '*' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1742:1: ( '*' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1742:1: ( '*' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1743:1: '*'
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getAsteriskKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UnOrderListItemLevel1__Group__0__Impl3678); 
             after(grammarAccess.getUnOrderListItemLevel1Access().getAsteriskKeyword_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__0__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1756:1: rule__UnOrderListItemLevel1__Group__1 : rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2 ;
    public final void rule__UnOrderListItemLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1760:1: ( rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1761:2: rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__1__Impl_in_rule__UnOrderListItemLevel1__Group__13709);
            rule__UnOrderListItemLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__2_in_rule__UnOrderListItemLevel1__Group__13712);
            rule__UnOrderListItemLevel1__Group__2();

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__1"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1768:1: rule__UnOrderListItemLevel1__Group__1__Impl : ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) ) ;
    public final void rule__UnOrderListItemLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1772:1: ( ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1773:1: ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1773:1: ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1774:1: ( rule__UnOrderListItemLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1775:1: ( rule__UnOrderListItemLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1775:2: rule__UnOrderListItemLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__NameAssignment_1_in_rule__UnOrderListItemLevel1__Group__1__Impl3739);
            rule__UnOrderListItemLevel1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel1Access().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__1__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1785:1: rule__UnOrderListItemLevel1__Group__2 : rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3 ;
    public final void rule__UnOrderListItemLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1789:1: ( rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1790:2: rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__2__Impl_in_rule__UnOrderListItemLevel1__Group__23769);
            rule__UnOrderListItemLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__3_in_rule__UnOrderListItemLevel1__Group__23772);
            rule__UnOrderListItemLevel1__Group__3();

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__2"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1797:1: rule__UnOrderListItemLevel1__Group__2__Impl : ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) ) ;
    public final void rule__UnOrderListItemLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1801:1: ( ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1802:1: ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1802:1: ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1803:1: ( rule__UnOrderListItemLevel1__ListAssignment_2 )
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1804:1: ( rule__UnOrderListItemLevel1__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1804:2: rule__UnOrderListItemLevel1__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__ListAssignment_2_in_rule__UnOrderListItemLevel1__Group__2__Impl3799);
            rule__UnOrderListItemLevel1__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnOrderListItemLevel1Access().getListAssignment_2()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__2__Impl"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1814:1: rule__UnOrderListItemLevel1__Group__3 : rule__UnOrderListItemLevel1__Group__3__Impl ;
    public final void rule__UnOrderListItemLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1818:1: ( rule__UnOrderListItemLevel1__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1819:2: rule__UnOrderListItemLevel1__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__3__Impl_in_rule__UnOrderListItemLevel1__Group__33829);
            rule__UnOrderListItemLevel1__Group__3__Impl();

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__3"


    // $ANTLR start "rule__UnOrderListItemLevel1__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1825:1: rule__UnOrderListItemLevel1__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__UnOrderListItemLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1829:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1830:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1830:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1831:1: ':LIST'
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__UnOrderListItemLevel1__Group__3__Impl3857); 
             after(grammarAccess.getUnOrderListItemLevel1Access().getLISTKeyword_3()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__Group__3__Impl"


    // $ANTLR start "rule__OrderListItemLevel1__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1852:1: rule__OrderListItemLevel1__Group__0 : rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1 ;
    public final void rule__OrderListItemLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1856:1: ( rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1857:2: rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__0__Impl_in_rule__OrderListItemLevel1__Group__03896);
            rule__OrderListItemLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__1_in_rule__OrderListItemLevel1__Group__03899);
            rule__OrderListItemLevel1__Group__1();

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__0"


    // $ANTLR start "rule__OrderListItemLevel1__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1864:1: rule__OrderListItemLevel1__Group__0__Impl : ( '#' ) ;
    public final void rule__OrderListItemLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1868:1: ( ( '#' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1869:1: ( '#' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1869:1: ( '#' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1870:1: '#'
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNumberSignKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__OrderListItemLevel1__Group__0__Impl3927); 
             after(grammarAccess.getOrderListItemLevel1Access().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__0__Impl"


    // $ANTLR start "rule__OrderListItemLevel1__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1883:1: rule__OrderListItemLevel1__Group__1 : rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2 ;
    public final void rule__OrderListItemLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1887:1: ( rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1888:2: rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__1__Impl_in_rule__OrderListItemLevel1__Group__13958);
            rule__OrderListItemLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__2_in_rule__OrderListItemLevel1__Group__13961);
            rule__OrderListItemLevel1__Group__2();

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__1"


    // $ANTLR start "rule__OrderListItemLevel1__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1895:1: rule__OrderListItemLevel1__Group__1__Impl : ( ( rule__OrderListItemLevel1__NameAssignment_1 ) ) ;
    public final void rule__OrderListItemLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1899:1: ( ( ( rule__OrderListItemLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1900:1: ( ( rule__OrderListItemLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1900:1: ( ( rule__OrderListItemLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1901:1: ( rule__OrderListItemLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1902:1: ( rule__OrderListItemLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1902:2: rule__OrderListItemLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__NameAssignment_1_in_rule__OrderListItemLevel1__Group__1__Impl3988);
            rule__OrderListItemLevel1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderListItemLevel1Access().getNameAssignment_1()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__1__Impl"


    // $ANTLR start "rule__OrderListItemLevel1__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1912:1: rule__OrderListItemLevel1__Group__2 : rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3 ;
    public final void rule__OrderListItemLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1916:1: ( rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1917:2: rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__2__Impl_in_rule__OrderListItemLevel1__Group__24018);
            rule__OrderListItemLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__3_in_rule__OrderListItemLevel1__Group__24021);
            rule__OrderListItemLevel1__Group__3();

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__2"


    // $ANTLR start "rule__OrderListItemLevel1__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1924:1: rule__OrderListItemLevel1__Group__2__Impl : ( ( rule__OrderListItemLevel1__ListAssignment_2 ) ) ;
    public final void rule__OrderListItemLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1928:1: ( ( ( rule__OrderListItemLevel1__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1929:1: ( ( rule__OrderListItemLevel1__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1929:1: ( ( rule__OrderListItemLevel1__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1930:1: ( rule__OrderListItemLevel1__ListAssignment_2 )
            {
             before(grammarAccess.getOrderListItemLevel1Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1931:1: ( rule__OrderListItemLevel1__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1931:2: rule__OrderListItemLevel1__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__ListAssignment_2_in_rule__OrderListItemLevel1__Group__2__Impl4048);
            rule__OrderListItemLevel1__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderListItemLevel1Access().getListAssignment_2()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__2__Impl"


    // $ANTLR start "rule__OrderListItemLevel1__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1941:1: rule__OrderListItemLevel1__Group__3 : rule__OrderListItemLevel1__Group__3__Impl ;
    public final void rule__OrderListItemLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1945:1: ( rule__OrderListItemLevel1__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1946:2: rule__OrderListItemLevel1__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__3__Impl_in_rule__OrderListItemLevel1__Group__34078);
            rule__OrderListItemLevel1__Group__3__Impl();

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__3"


    // $ANTLR start "rule__OrderListItemLevel1__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1952:1: rule__OrderListItemLevel1__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__OrderListItemLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1956:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1957:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1957:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1958:1: ':LIST'
            {
             before(grammarAccess.getOrderListItemLevel1Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__OrderListItemLevel1__Group__3__Impl4106); 
             after(grammarAccess.getOrderListItemLevel1Access().getLISTKeyword_3()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1979:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1983:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1984:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04145);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04148);
            rule__Image__Group__1();

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
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1991:1: rule__Image__Group__0__Impl : ( '[[' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1995:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1996:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1996:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1997:1: '[['
            {
             before(grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Image__Group__0__Impl4176); 
             after(grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2010:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2014:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2015:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14207);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14210);
            rule__Image__Group__2();

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
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2022:1: rule__Image__Group__1__Impl : ( 'File:' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2026:1: ( ( 'File:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2027:1: ( 'File:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2027:1: ( 'File:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2028:1: 'File:'
            {
             before(grammarAccess.getImageAccess().getFileKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Image__Group__1__Impl4238); 
             after(grammarAccess.getImageAccess().getFileKeyword_1()); 

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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2041:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2045:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2046:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24269);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24272);
            rule__Image__Group__3();

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
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2053:1: rule__Image__Group__2__Impl : ( ( rule__Image__NameAssignment_2 ) ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2057:1: ( ( ( rule__Image__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2058:1: ( ( rule__Image__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2058:1: ( ( rule__Image__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2059:1: ( rule__Image__NameAssignment_2 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2060:1: ( rule__Image__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2060:2: rule__Image__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4299);
            rule__Image__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2070:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2074:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2075:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34329);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34332);
            rule__Image__Group__4();

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
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2082:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2086:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2087:1: ( ( rule__Image__Group_3__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2087:1: ( ( rule__Image__Group_3__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2088:1: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2089:1: ( rule__Image__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=12 && LA12_1<=16)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2089:2: rule__Image__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4359);
                    rule__Image__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2099:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2103:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2104:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44390);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44393);
            rule__Image__Group__5();

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
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2111:1: rule__Image__Group__4__Impl : ( ( rule__Image__Group_4__0 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2115:1: ( ( ( rule__Image__Group_4__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2116:1: ( ( rule__Image__Group_4__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2116:1: ( ( rule__Image__Group_4__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2117:1: ( rule__Image__Group_4__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2118:1: ( rule__Image__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=17 && LA13_1<=20)) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2118:2: rule__Image__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4420);
                    rule__Image__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2128:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2132:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2133:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54451);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54454);
            rule__Image__Group__6();

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
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2140:1: rule__Image__Group__5__Impl : ( ( rule__Image__Group_5__0 )? ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2144:1: ( ( ( rule__Image__Group_5__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2145:1: ( ( rule__Image__Group_5__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2145:1: ( ( rule__Image__Group_5__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2146:1: ( rule__Image__Group_5__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_5()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2147:1: ( rule__Image__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2147:2: rule__Image__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4481);
                    rule__Image__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__6"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2157:1: rule__Image__Group__6 : rule__Image__Group__6__Impl rule__Image__Group__7 ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2161:1: ( rule__Image__Group__6__Impl rule__Image__Group__7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2162:2: rule__Image__Group__6__Impl rule__Image__Group__7
            {
            pushFollow(FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64512);
            rule__Image__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64515);
            rule__Image__Group__7();

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
    // $ANTLR end "rule__Image__Group__6"


    // $ANTLR start "rule__Image__Group__6__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2169:1: rule__Image__Group__6__Impl : ( '|' ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2173:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2174:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2174:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2175:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group__6__Impl4543); 
             after(grammarAccess.getImageAccess().getVerticalLineKeyword_6()); 

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
    // $ANTLR end "rule__Image__Group__6__Impl"


    // $ANTLR start "rule__Image__Group__7"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2188:1: rule__Image__Group__7 : rule__Image__Group__7__Impl rule__Image__Group__8 ;
    public final void rule__Image__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2192:1: ( rule__Image__Group__7__Impl rule__Image__Group__8 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2193:2: rule__Image__Group__7__Impl rule__Image__Group__8
            {
            pushFollow(FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__74574);
            rule__Image__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__8_in_rule__Image__Group__74577);
            rule__Image__Group__8();

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
    // $ANTLR end "rule__Image__Group__7"


    // $ANTLR start "rule__Image__Group__7__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2200:1: rule__Image__Group__7__Impl : ( ( rule__Image__CaptionAssignment_7 ) ) ;
    public final void rule__Image__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2204:1: ( ( ( rule__Image__CaptionAssignment_7 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2205:1: ( ( rule__Image__CaptionAssignment_7 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2205:1: ( ( rule__Image__CaptionAssignment_7 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2206:1: ( rule__Image__CaptionAssignment_7 )
            {
             before(grammarAccess.getImageAccess().getCaptionAssignment_7()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2207:1: ( rule__Image__CaptionAssignment_7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2207:2: rule__Image__CaptionAssignment_7
            {
            pushFollow(FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl4604);
            rule__Image__CaptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getCaptionAssignment_7()); 

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
    // $ANTLR end "rule__Image__Group__7__Impl"


    // $ANTLR start "rule__Image__Group__8"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2217:1: rule__Image__Group__8 : rule__Image__Group__8__Impl ;
    public final void rule__Image__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2221:1: ( rule__Image__Group__8__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2222:2: rule__Image__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__84634);
            rule__Image__Group__8__Impl();

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
    // $ANTLR end "rule__Image__Group__8"


    // $ANTLR start "rule__Image__Group__8__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2228:1: rule__Image__Group__8__Impl : ( ']]' ) ;
    public final void rule__Image__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2232:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2233:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2233:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2234:1: ']]'
            {
             before(grammarAccess.getImageAccess().getRightSquareBracketRightSquareBracketKeyword_8()); 
            match(input,32,FOLLOW_32_in_rule__Image__Group__8__Impl4662); 
             after(grammarAccess.getImageAccess().getRightSquareBracketRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__Image__Group__8__Impl"


    // $ANTLR start "rule__Image__Group_3__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2265:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2269:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2270:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
            {
            pushFollow(FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__04711);
            rule__Image__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__04714);
            rule__Image__Group_3__1();

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
    // $ANTLR end "rule__Image__Group_3__0"


    // $ANTLR start "rule__Image__Group_3__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2277:1: rule__Image__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2281:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2282:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2282:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2283:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group_3__0__Impl4742); 
             after(grammarAccess.getImageAccess().getVerticalLineKeyword_3_0()); 

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
    // $ANTLR end "rule__Image__Group_3__0__Impl"


    // $ANTLR start "rule__Image__Group_3__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2296:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2300:1: ( rule__Image__Group_3__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2301:2: rule__Image__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__14773);
            rule__Image__Group_3__1__Impl();

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
    // $ANTLR end "rule__Image__Group_3__1"


    // $ANTLR start "rule__Image__Group_3__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2307:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__TypeAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2311:1: ( ( ( rule__Image__TypeAssignment_3_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2312:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2312:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2313:1: ( rule__Image__TypeAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getTypeAssignment_3_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2314:1: ( rule__Image__TypeAssignment_3_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2314:2: rule__Image__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl4800);
            rule__Image__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Image__Group_3__1__Impl"


    // $ANTLR start "rule__Image__Group_4__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2328:1: rule__Image__Group_4__0 : rule__Image__Group_4__0__Impl rule__Image__Group_4__1 ;
    public final void rule__Image__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2332:1: ( rule__Image__Group_4__0__Impl rule__Image__Group_4__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2333:2: rule__Image__Group_4__0__Impl rule__Image__Group_4__1
            {
            pushFollow(FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__04834);
            rule__Image__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__04837);
            rule__Image__Group_4__1();

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
    // $ANTLR end "rule__Image__Group_4__0"


    // $ANTLR start "rule__Image__Group_4__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2340:1: rule__Image__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2344:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2345:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2345:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2346:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group_4__0__Impl4865); 
             after(grammarAccess.getImageAccess().getVerticalLineKeyword_4_0()); 

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
    // $ANTLR end "rule__Image__Group_4__0__Impl"


    // $ANTLR start "rule__Image__Group_4__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2359:1: rule__Image__Group_4__1 : rule__Image__Group_4__1__Impl ;
    public final void rule__Image__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2363:1: ( rule__Image__Group_4__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2364:2: rule__Image__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__14896);
            rule__Image__Group_4__1__Impl();

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
    // $ANTLR end "rule__Image__Group_4__1"


    // $ANTLR start "rule__Image__Group_4__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2370:1: rule__Image__Group_4__1__Impl : ( ( rule__Image__HAlignAssignment_4_1 ) ) ;
    public final void rule__Image__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2374:1: ( ( ( rule__Image__HAlignAssignment_4_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2375:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2375:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2376:1: ( rule__Image__HAlignAssignment_4_1 )
            {
             before(grammarAccess.getImageAccess().getHAlignAssignment_4_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2377:1: ( rule__Image__HAlignAssignment_4_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2377:2: rule__Image__HAlignAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl4923);
            rule__Image__HAlignAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getHAlignAssignment_4_1()); 

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
    // $ANTLR end "rule__Image__Group_4__1__Impl"


    // $ANTLR start "rule__Image__Group_5__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2391:1: rule__Image__Group_5__0 : rule__Image__Group_5__0__Impl rule__Image__Group_5__1 ;
    public final void rule__Image__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2395:1: ( rule__Image__Group_5__0__Impl rule__Image__Group_5__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2396:2: rule__Image__Group_5__0__Impl rule__Image__Group_5__1
            {
            pushFollow(FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__04957);
            rule__Image__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__04960);
            rule__Image__Group_5__1();

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
    // $ANTLR end "rule__Image__Group_5__0"


    // $ANTLR start "rule__Image__Group_5__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2403:1: rule__Image__Group_5__0__Impl : ( '|alt=' ) ;
    public final void rule__Image__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2407:1: ( ( '|alt=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2408:1: ( '|alt=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2408:1: ( '|alt=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2409:1: '|alt='
            {
             before(grammarAccess.getImageAccess().getAltKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__Image__Group_5__0__Impl4988); 
             after(grammarAccess.getImageAccess().getAltKeyword_5_0()); 

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
    // $ANTLR end "rule__Image__Group_5__0__Impl"


    // $ANTLR start "rule__Image__Group_5__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2422:1: rule__Image__Group_5__1 : rule__Image__Group_5__1__Impl ;
    public final void rule__Image__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2426:1: ( rule__Image__Group_5__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2427:2: rule__Image__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15019);
            rule__Image__Group_5__1__Impl();

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
    // $ANTLR end "rule__Image__Group_5__1"


    // $ANTLR start "rule__Image__Group_5__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2433:1: rule__Image__Group_5__1__Impl : ( ( rule__Image__AltTextAssignment_5_1 ) ) ;
    public final void rule__Image__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2437:1: ( ( ( rule__Image__AltTextAssignment_5_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2438:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2438:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2439:1: ( rule__Image__AltTextAssignment_5_1 )
            {
             before(grammarAccess.getImageAccess().getAltTextAssignment_5_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2440:1: ( rule__Image__AltTextAssignment_5_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2440:2: rule__Image__AltTextAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5046);
            rule__Image__AltTextAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAltTextAssignment_5_1()); 

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
    // $ANTLR end "rule__Image__Group_5__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2454:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2458:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2459:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05080);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05083);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2466:1: rule__Category__Group__0__Impl : ( '[[' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2470:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2471:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2471:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2472:1: '[['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Category__Group__0__Impl5111); 
             after(grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2485:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2489:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2490:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15142);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15145);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2497:1: rule__Category__Group__1__Impl : ( 'Category:' ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2501:1: ( ( 'Category:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2502:1: ( 'Category:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2502:1: ( 'Category:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2503:1: 'Category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Category__Group__1__Impl5173); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2516:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2520:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2521:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25204);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25207);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2528:1: rule__Category__Group__2__Impl : ( ( rule__Category__NameAssignment_2 ) ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2532:1: ( ( ( rule__Category__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2533:1: ( ( rule__Category__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2533:1: ( ( rule__Category__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2534:1: ( rule__Category__NameAssignment_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2535:1: ( rule__Category__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2535:2: rule__Category__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5234);
            rule__Category__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_2()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2545:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2549:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2550:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35264);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35267);
            rule__Category__Group__4();

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2557:1: rule__Category__Group__3__Impl : ( ( rule__Category__ValueAssignment_3 )? ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2561:1: ( ( ( rule__Category__ValueAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2562:1: ( ( rule__Category__ValueAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2562:1: ( ( rule__Category__ValueAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2563:1: ( rule__Category__ValueAssignment_3 )?
            {
             before(grammarAccess.getCategoryAccess().getValueAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2564:1: ( rule__Category__ValueAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2564:2: rule__Category__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5294);
                    rule__Category__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getValueAssignment_3()); 

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


    // $ANTLR start "rule__Category__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2574:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2578:1: ( rule__Category__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2579:2: rule__Category__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45325);
            rule__Category__Group__4__Impl();

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
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2585:1: rule__Category__Group__4__Impl : ( ']]' ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2589:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2590:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2590:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2591:1: ']]'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Category__Group__4__Impl5353); 
             after(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Heading1__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2614:1: rule__Heading1__Group__0 : rule__Heading1__Group__0__Impl rule__Heading1__Group__1 ;
    public final void rule__Heading1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2618:1: ( rule__Heading1__Group__0__Impl rule__Heading1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2619:2: rule__Heading1__Group__0__Impl rule__Heading1__Group__1
            {
            pushFollow(FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__05394);
            rule__Heading1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__05397);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2626:1: rule__Heading1__Group__0__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2630:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2631:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2631:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2632:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Heading1__Group__0__Impl5425); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2645:1: rule__Heading1__Group__1 : rule__Heading1__Group__1__Impl rule__Heading1__Group__2 ;
    public final void rule__Heading1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2649:1: ( rule__Heading1__Group__1__Impl rule__Heading1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2650:2: rule__Heading1__Group__1__Impl rule__Heading1__Group__2
            {
            pushFollow(FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__15456);
            rule__Heading1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__15459);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2657:1: rule__Heading1__Group__1__Impl : ( ( rule__Heading1__HeadingValue1Assignment_1 ) ) ;
    public final void rule__Heading1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2661:1: ( ( ( rule__Heading1__HeadingValue1Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2662:1: ( ( rule__Heading1__HeadingValue1Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2662:1: ( ( rule__Heading1__HeadingValue1Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2663:1: ( rule__Heading1__HeadingValue1Assignment_1 )
            {
             before(grammarAccess.getHeading1Access().getHeadingValue1Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2664:1: ( rule__Heading1__HeadingValue1Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2664:2: rule__Heading1__HeadingValue1Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading1__HeadingValue1Assignment_1_in_rule__Heading1__Group__1__Impl5486);
            rule__Heading1__HeadingValue1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading1Access().getHeadingValue1Assignment_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2674:1: rule__Heading1__Group__2 : rule__Heading1__Group__2__Impl ;
    public final void rule__Heading1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2678:1: ( rule__Heading1__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2679:2: rule__Heading1__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__25516);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2685:1: rule__Heading1__Group__2__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2689:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2690:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2690:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2691:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Heading1__Group__2__Impl5544); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2710:1: rule__Heading2__Group__0 : rule__Heading2__Group__0__Impl rule__Heading2__Group__1 ;
    public final void rule__Heading2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2714:1: ( rule__Heading2__Group__0__Impl rule__Heading2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2715:2: rule__Heading2__Group__0__Impl rule__Heading2__Group__1
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05581);
            rule__Heading2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05584);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2722:1: rule__Heading2__Group__0__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2726:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2727:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2727:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2728:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Heading2__Group__0__Impl5612); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2741:1: rule__Heading2__Group__1 : rule__Heading2__Group__1__Impl rule__Heading2__Group__2 ;
    public final void rule__Heading2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2745:1: ( rule__Heading2__Group__1__Impl rule__Heading2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2746:2: rule__Heading2__Group__1__Impl rule__Heading2__Group__2
            {
            pushFollow(FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15643);
            rule__Heading2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15646);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:1: rule__Heading2__Group__1__Impl : ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) ;
    public final void rule__Heading2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:1: ( ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2758:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2758:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2759:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2760:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2760:2: rule__Heading2__HeadingValue2Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5673);
            rule__Heading2__HeadingValue2Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading2Access().getHeadingValue2Assignment_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2770:1: rule__Heading2__Group__2 : rule__Heading2__Group__2__Impl ;
    public final void rule__Heading2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2774:1: ( rule__Heading2__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2775:2: rule__Heading2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25703);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2781:1: rule__Heading2__Group__2__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2785:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2786:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2786:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2787:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Heading2__Group__2__Impl5731); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2806:1: rule__Heading3__Group__0 : rule__Heading3__Group__0__Impl rule__Heading3__Group__1 ;
    public final void rule__Heading3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2810:1: ( rule__Heading3__Group__0__Impl rule__Heading3__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2811:2: rule__Heading3__Group__0__Impl rule__Heading3__Group__1
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__05768);
            rule__Heading3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__05771);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2818:1: rule__Heading3__Group__0__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2822:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2823:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2823:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2824:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Heading3__Group__0__Impl5799); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2837:1: rule__Heading3__Group__1 : rule__Heading3__Group__1__Impl rule__Heading3__Group__2 ;
    public final void rule__Heading3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2841:1: ( rule__Heading3__Group__1__Impl rule__Heading3__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2842:2: rule__Heading3__Group__1__Impl rule__Heading3__Group__2
            {
            pushFollow(FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__15830);
            rule__Heading3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__15833);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2849:1: rule__Heading3__Group__1__Impl : ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) ;
    public final void rule__Heading3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2853:1: ( ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2854:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2854:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2855:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2856:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2856:2: rule__Heading3__HeadingValue3Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl5860);
            rule__Heading3__HeadingValue3Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading3Access().getHeadingValue3Assignment_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2866:1: rule__Heading3__Group__2 : rule__Heading3__Group__2__Impl ;
    public final void rule__Heading3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2870:1: ( rule__Heading3__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2871:2: rule__Heading3__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__25890);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2877:1: rule__Heading3__Group__2__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2881:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2882:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2882:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2883:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Heading3__Group__2__Impl5918); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2902:1: rule__Heading4__Group__0 : rule__Heading4__Group__0__Impl rule__Heading4__Group__1 ;
    public final void rule__Heading4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2906:1: ( rule__Heading4__Group__0__Impl rule__Heading4__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2907:2: rule__Heading4__Group__0__Impl rule__Heading4__Group__1
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__05955);
            rule__Heading4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__05958);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2914:1: rule__Heading4__Group__0__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2918:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2919:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2919:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2920:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Heading4__Group__0__Impl5986); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2933:1: rule__Heading4__Group__1 : rule__Heading4__Group__1__Impl rule__Heading4__Group__2 ;
    public final void rule__Heading4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2937:1: ( rule__Heading4__Group__1__Impl rule__Heading4__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2938:2: rule__Heading4__Group__1__Impl rule__Heading4__Group__2
            {
            pushFollow(FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16017);
            rule__Heading4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16020);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2945:1: rule__Heading4__Group__1__Impl : ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) ;
    public final void rule__Heading4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2949:1: ( ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2950:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2950:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2951:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2952:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2952:2: rule__Heading4__HeadingValue4Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6047);
            rule__Heading4__HeadingValue4Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading4Access().getHeadingValue4Assignment_1()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2962:1: rule__Heading4__Group__2 : rule__Heading4__Group__2__Impl ;
    public final void rule__Heading4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2966:1: ( rule__Heading4__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2967:2: rule__Heading4__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26077);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2973:1: rule__Heading4__Group__2__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2977:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2978:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2978:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2979:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Heading4__Group__2__Impl6105); 
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


    // $ANTLR start "rule__Heading5__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2998:1: rule__Heading5__Group__0 : rule__Heading5__Group__0__Impl rule__Heading5__Group__1 ;
    public final void rule__Heading5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3002:1: ( rule__Heading5__Group__0__Impl rule__Heading5__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3003:2: rule__Heading5__Group__0__Impl rule__Heading5__Group__1
            {
            pushFollow(FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06142);
            rule__Heading5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06145);
            rule__Heading5__Group__1();

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
    // $ANTLR end "rule__Heading5__Group__0"


    // $ANTLR start "rule__Heading5__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3010:1: rule__Heading5__Group__0__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3014:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3015:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3015:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3016:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Heading5__Group__0__Impl6173); 
             after(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__Heading5__Group__0__Impl"


    // $ANTLR start "rule__Heading5__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3029:1: rule__Heading5__Group__1 : rule__Heading5__Group__1__Impl rule__Heading5__Group__2 ;
    public final void rule__Heading5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3033:1: ( rule__Heading5__Group__1__Impl rule__Heading5__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3034:2: rule__Heading5__Group__1__Impl rule__Heading5__Group__2
            {
            pushFollow(FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16204);
            rule__Heading5__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16207);
            rule__Heading5__Group__2();

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
    // $ANTLR end "rule__Heading5__Group__1"


    // $ANTLR start "rule__Heading5__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3041:1: rule__Heading5__Group__1__Impl : ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) ;
    public final void rule__Heading5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3045:1: ( ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3046:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3046:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3047:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3048:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3048:2: rule__Heading5__HeadingValue5Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6234);
            rule__Heading5__HeadingValue5Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeading5Access().getHeadingValue5Assignment_1()); 

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
    // $ANTLR end "rule__Heading5__Group__1__Impl"


    // $ANTLR start "rule__Heading5__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3058:1: rule__Heading5__Group__2 : rule__Heading5__Group__2__Impl ;
    public final void rule__Heading5__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3062:1: ( rule__Heading5__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3063:2: rule__Heading5__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26264);
            rule__Heading5__Group__2__Impl();

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
    // $ANTLR end "rule__Heading5__Group__2"


    // $ANTLR start "rule__Heading5__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3069:1: rule__Heading5__Group__2__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3073:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3074:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3074:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3075:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Heading5__Group__2__Impl6292); 
             after(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Heading5__Group__2__Impl"


    // $ANTLR start "rule__Bold__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3094:1: rule__Bold__Group__0 : rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
    public final void rule__Bold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3098:1: ( rule__Bold__Group__0__Impl rule__Bold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3099:2: rule__Bold__Group__0__Impl rule__Bold__Group__1
            {
            pushFollow(FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06329);
            rule__Bold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06332);
            rule__Bold__Group__1();

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
    // $ANTLR end "rule__Bold__Group__0"


    // $ANTLR start "rule__Bold__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3106:1: rule__Bold__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3110:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3111:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3111:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3112:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Bold__Group__0__Impl6360); 
             after(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0()); 

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
    // $ANTLR end "rule__Bold__Group__0__Impl"


    // $ANTLR start "rule__Bold__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3125:1: rule__Bold__Group__1 : rule__Bold__Group__1__Impl rule__Bold__Group__2 ;
    public final void rule__Bold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3129:1: ( rule__Bold__Group__1__Impl rule__Bold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3130:2: rule__Bold__Group__1__Impl rule__Bold__Group__2
            {
            pushFollow(FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16391);
            rule__Bold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16394);
            rule__Bold__Group__2();

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
    // $ANTLR end "rule__Bold__Group__1"


    // $ANTLR start "rule__Bold__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3137:1: rule__Bold__Group__1__Impl : ( ( rule__Bold__NameAssignment_1 ) ) ;
    public final void rule__Bold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3141:1: ( ( ( rule__Bold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3142:1: ( ( rule__Bold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3142:1: ( ( rule__Bold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3143:1: ( rule__Bold__NameAssignment_1 )
            {
             before(grammarAccess.getBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3144:1: ( rule__Bold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3144:2: rule__Bold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6421);
            rule__Bold__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Bold__Group__1__Impl"


    // $ANTLR start "rule__Bold__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3154:1: rule__Bold__Group__2 : rule__Bold__Group__2__Impl ;
    public final void rule__Bold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3158:1: ( rule__Bold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3159:2: rule__Bold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26451);
            rule__Bold__Group__2__Impl();

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
    // $ANTLR end "rule__Bold__Group__2"


    // $ANTLR start "rule__Bold__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3165:1: rule__Bold__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3169:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3170:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3170:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3171:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Bold__Group__2__Impl6479); 
             after(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_2()); 

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
    // $ANTLR end "rule__Bold__Group__2__Impl"


    // $ANTLR start "rule__Italic__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3190:1: rule__Italic__Group__0 : rule__Italic__Group__0__Impl rule__Italic__Group__1 ;
    public final void rule__Italic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3194:1: ( rule__Italic__Group__0__Impl rule__Italic__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3195:2: rule__Italic__Group__0__Impl rule__Italic__Group__1
            {
            pushFollow(FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06516);
            rule__Italic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06519);
            rule__Italic__Group__1();

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
    // $ANTLR end "rule__Italic__Group__0"


    // $ANTLR start "rule__Italic__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3202:1: rule__Italic__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3206:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3207:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3207:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3208:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Italic__Group__0__Impl6547); 
             after(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0()); 

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
    // $ANTLR end "rule__Italic__Group__0__Impl"


    // $ANTLR start "rule__Italic__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3221:1: rule__Italic__Group__1 : rule__Italic__Group__1__Impl rule__Italic__Group__2 ;
    public final void rule__Italic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3225:1: ( rule__Italic__Group__1__Impl rule__Italic__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3226:2: rule__Italic__Group__1__Impl rule__Italic__Group__2
            {
            pushFollow(FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16578);
            rule__Italic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16581);
            rule__Italic__Group__2();

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
    // $ANTLR end "rule__Italic__Group__1"


    // $ANTLR start "rule__Italic__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3233:1: rule__Italic__Group__1__Impl : ( ( rule__Italic__NameAssignment_1 ) ) ;
    public final void rule__Italic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3237:1: ( ( ( rule__Italic__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3238:1: ( ( rule__Italic__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3238:1: ( ( rule__Italic__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3239:1: ( rule__Italic__NameAssignment_1 )
            {
             before(grammarAccess.getItalicAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3240:1: ( rule__Italic__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3240:2: rule__Italic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6608);
            rule__Italic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Italic__Group__1__Impl"


    // $ANTLR start "rule__Italic__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3250:1: rule__Italic__Group__2 : rule__Italic__Group__2__Impl ;
    public final void rule__Italic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3254:1: ( rule__Italic__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3255:2: rule__Italic__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26638);
            rule__Italic__Group__2__Impl();

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
    // $ANTLR end "rule__Italic__Group__2"


    // $ANTLR start "rule__Italic__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3261:1: rule__Italic__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3265:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3266:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3266:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3267:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Italic__Group__2__Impl6666); 
             after(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_2()); 

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
    // $ANTLR end "rule__Italic__Group__2__Impl"


    // $ANTLR start "rule__ItalicBold__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3286:1: rule__ItalicBold__Group__0 : rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 ;
    public final void rule__ItalicBold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3290:1: ( rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3291:2: rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06703);
            rule__ItalicBold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06706);
            rule__ItalicBold__Group__1();

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
    // $ANTLR end "rule__ItalicBold__Group__0"


    // $ANTLR start "rule__ItalicBold__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3298:1: rule__ItalicBold__Group__0__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3302:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3303:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3303:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3304:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__ItalicBold__Group__0__Impl6734); 
             after(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 

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
    // $ANTLR end "rule__ItalicBold__Group__0__Impl"


    // $ANTLR start "rule__ItalicBold__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3317:1: rule__ItalicBold__Group__1 : rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 ;
    public final void rule__ItalicBold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3321:1: ( rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3322:2: rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__16765);
            rule__ItalicBold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__16768);
            rule__ItalicBold__Group__2();

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
    // $ANTLR end "rule__ItalicBold__Group__1"


    // $ANTLR start "rule__ItalicBold__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3329:1: rule__ItalicBold__Group__1__Impl : ( ( rule__ItalicBold__NameAssignment_1 ) ) ;
    public final void rule__ItalicBold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3333:1: ( ( ( rule__ItalicBold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3334:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3334:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3335:1: ( rule__ItalicBold__NameAssignment_1 )
            {
             before(grammarAccess.getItalicBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3336:1: ( rule__ItalicBold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3336:2: rule__ItalicBold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl6795);
            rule__ItalicBold__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicBoldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ItalicBold__Group__1__Impl"


    // $ANTLR start "rule__ItalicBold__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3346:1: rule__ItalicBold__Group__2 : rule__ItalicBold__Group__2__Impl ;
    public final void rule__ItalicBold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3350:1: ( rule__ItalicBold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3351:2: rule__ItalicBold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__26825);
            rule__ItalicBold__Group__2__Impl();

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
    // $ANTLR end "rule__ItalicBold__Group__2"


    // $ANTLR start "rule__ItalicBold__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3357:1: rule__ItalicBold__Group__2__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3361:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3362:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3362:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3363:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__ItalicBold__Group__2__Impl6853); 
             after(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 

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
    // $ANTLR end "rule__ItalicBold__Group__2__Impl"


    // $ANTLR start "rule__Internal__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3382:1: rule__Internal__Group__0 : rule__Internal__Group__0__Impl rule__Internal__Group__1 ;
    public final void rule__Internal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3386:1: ( rule__Internal__Group__0__Impl rule__Internal__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3387:2: rule__Internal__Group__0__Impl rule__Internal__Group__1
            {
            pushFollow(FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__06890);
            rule__Internal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__06893);
            rule__Internal__Group__1();

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
    // $ANTLR end "rule__Internal__Group__0"


    // $ANTLR start "rule__Internal__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3394:1: rule__Internal__Group__0__Impl : ( '[[' ) ;
    public final void rule__Internal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3398:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3399:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3399:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3400:1: '[['
            {
             before(grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Internal__Group__0__Impl6921); 
             after(grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Internal__Group__0__Impl"


    // $ANTLR start "rule__Internal__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3413:1: rule__Internal__Group__1 : rule__Internal__Group__1__Impl rule__Internal__Group__2 ;
    public final void rule__Internal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3417:1: ( rule__Internal__Group__1__Impl rule__Internal__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3418:2: rule__Internal__Group__1__Impl rule__Internal__Group__2
            {
            pushFollow(FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__16952);
            rule__Internal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__16955);
            rule__Internal__Group__2();

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
    // $ANTLR end "rule__Internal__Group__1"


    // $ANTLR start "rule__Internal__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3425:1: rule__Internal__Group__1__Impl : ( ( rule__Internal__NameAssignment_1 ) ) ;
    public final void rule__Internal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3429:1: ( ( ( rule__Internal__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3430:1: ( ( rule__Internal__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3430:1: ( ( rule__Internal__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3431:1: ( rule__Internal__NameAssignment_1 )
            {
             before(grammarAccess.getInternalAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3432:1: ( rule__Internal__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3432:2: rule__Internal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Internal__NameAssignment_1_in_rule__Internal__Group__1__Impl6982);
            rule__Internal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Internal__Group__1__Impl"


    // $ANTLR start "rule__Internal__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3442:1: rule__Internal__Group__2 : rule__Internal__Group__2__Impl ;
    public final void rule__Internal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3446:1: ( rule__Internal__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3447:2: rule__Internal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__27012);
            rule__Internal__Group__2__Impl();

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
    // $ANTLR end "rule__Internal__Group__2"


    // $ANTLR start "rule__Internal__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3453:1: rule__Internal__Group__2__Impl : ( ']]' ) ;
    public final void rule__Internal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3457:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3458:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3458:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3459:1: ']]'
            {
             before(grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Internal__Group__2__Impl7040); 
             after(grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Internal__Group__2__Impl"


    // $ANTLR start "rule__InternalAlt__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3478:1: rule__InternalAlt__Group__0 : rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1 ;
    public final void rule__InternalAlt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3482:1: ( rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3483:2: rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__0__Impl_in_rule__InternalAlt__Group__07077);
            rule__InternalAlt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__1_in_rule__InternalAlt__Group__07080);
            rule__InternalAlt__Group__1();

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
    // $ANTLR end "rule__InternalAlt__Group__0"


    // $ANTLR start "rule__InternalAlt__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3490:1: rule__InternalAlt__Group__0__Impl : ( '[[' ) ;
    public final void rule__InternalAlt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3494:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3495:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3495:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3496:1: '[['
            {
             before(grammarAccess.getInternalAltAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InternalAlt__Group__0__Impl7108); 
             after(grammarAccess.getInternalAltAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__InternalAlt__Group__0__Impl"


    // $ANTLR start "rule__InternalAlt__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3509:1: rule__InternalAlt__Group__1 : rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2 ;
    public final void rule__InternalAlt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3513:1: ( rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3514:2: rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__1__Impl_in_rule__InternalAlt__Group__17139);
            rule__InternalAlt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__2_in_rule__InternalAlt__Group__17142);
            rule__InternalAlt__Group__2();

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
    // $ANTLR end "rule__InternalAlt__Group__1"


    // $ANTLR start "rule__InternalAlt__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3521:1: rule__InternalAlt__Group__1__Impl : ( ( rule__InternalAlt__NameAssignment_1 ) ) ;
    public final void rule__InternalAlt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3525:1: ( ( ( rule__InternalAlt__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3526:1: ( ( rule__InternalAlt__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3526:1: ( ( rule__InternalAlt__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3527:1: ( rule__InternalAlt__NameAssignment_1 )
            {
             before(grammarAccess.getInternalAltAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3528:1: ( rule__InternalAlt__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3528:2: rule__InternalAlt__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalAlt__NameAssignment_1_in_rule__InternalAlt__Group__1__Impl7169);
            rule__InternalAlt__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalAltAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InternalAlt__Group__1__Impl"


    // $ANTLR start "rule__InternalAlt__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3538:1: rule__InternalAlt__Group__2 : rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3 ;
    public final void rule__InternalAlt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3542:1: ( rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3543:2: rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__2__Impl_in_rule__InternalAlt__Group__27199);
            rule__InternalAlt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__3_in_rule__InternalAlt__Group__27202);
            rule__InternalAlt__Group__3();

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
    // $ANTLR end "rule__InternalAlt__Group__2"


    // $ANTLR start "rule__InternalAlt__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3550:1: rule__InternalAlt__Group__2__Impl : ( '|' ) ;
    public final void rule__InternalAlt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3554:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3555:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3555:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3556:1: '|'
            {
             before(grammarAccess.getInternalAltAccess().getVerticalLineKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__InternalAlt__Group__2__Impl7230); 
             after(grammarAccess.getInternalAltAccess().getVerticalLineKeyword_2()); 

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
    // $ANTLR end "rule__InternalAlt__Group__2__Impl"


    // $ANTLR start "rule__InternalAlt__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3569:1: rule__InternalAlt__Group__3 : rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4 ;
    public final void rule__InternalAlt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3573:1: ( rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3574:2: rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__3__Impl_in_rule__InternalAlt__Group__37261);
            rule__InternalAlt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__4_in_rule__InternalAlt__Group__37264);
            rule__InternalAlt__Group__4();

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
    // $ANTLR end "rule__InternalAlt__Group__3"


    // $ANTLR start "rule__InternalAlt__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3581:1: rule__InternalAlt__Group__3__Impl : ( ( rule__InternalAlt__AltTextAssignment_3 ) ) ;
    public final void rule__InternalAlt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3585:1: ( ( ( rule__InternalAlt__AltTextAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3586:1: ( ( rule__InternalAlt__AltTextAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3586:1: ( ( rule__InternalAlt__AltTextAssignment_3 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3587:1: ( rule__InternalAlt__AltTextAssignment_3 )
            {
             before(grammarAccess.getInternalAltAccess().getAltTextAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3588:1: ( rule__InternalAlt__AltTextAssignment_3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3588:2: rule__InternalAlt__AltTextAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalAlt__AltTextAssignment_3_in_rule__InternalAlt__Group__3__Impl7291);
            rule__InternalAlt__AltTextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInternalAltAccess().getAltTextAssignment_3()); 

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
    // $ANTLR end "rule__InternalAlt__Group__3__Impl"


    // $ANTLR start "rule__InternalAlt__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3598:1: rule__InternalAlt__Group__4 : rule__InternalAlt__Group__4__Impl ;
    public final void rule__InternalAlt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3602:1: ( rule__InternalAlt__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3603:2: rule__InternalAlt__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__4__Impl_in_rule__InternalAlt__Group__47321);
            rule__InternalAlt__Group__4__Impl();

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
    // $ANTLR end "rule__InternalAlt__Group__4"


    // $ANTLR start "rule__InternalAlt__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3609:1: rule__InternalAlt__Group__4__Impl : ( ']]' ) ;
    public final void rule__InternalAlt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3613:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3614:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3614:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3615:1: ']]'
            {
             before(grammarAccess.getInternalAltAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__InternalAlt__Group__4__Impl7349); 
             after(grammarAccess.getInternalAltAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__InternalAlt__Group__4__Impl"


    // $ANTLR start "rule__External__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3638:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3642:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3643:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07390);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__1_in_rule__External__Group__07393);
            rule__External__Group__1();

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
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3650:1: rule__External__Group__0__Impl : ( '[' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3654:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3655:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3655:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3656:1: '['
            {
             before(grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__External__Group__0__Impl7421); 
             after(grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3669:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3673:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3674:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17452);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__2_in_rule__External__Group__17455);
            rule__External__Group__2();

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
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3681:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3685:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3686:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3686:1: ( ( rule__External__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3687:1: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3688:1: ( rule__External__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3688:2: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7482);
            rule__External__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__External__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3698:1: rule__External__Group__2 : rule__External__Group__2__Impl ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3702:1: ( rule__External__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3703:2: rule__External__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27512);
            rule__External__Group__2__Impl();

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
    // $ANTLR end "rule__External__Group__2"


    // $ANTLR start "rule__External__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3709:1: rule__External__Group__2__Impl : ( ']' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3713:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3714:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3714:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3715:1: ']'
            {
             before(grammarAccess.getExternalAccess().getRightSquareBracketKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__External__Group__2__Impl7540); 
             after(grammarAccess.getExternalAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__External__Group__2__Impl"


    // $ANTLR start "rule__ExternalAlt__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3734:1: rule__ExternalAlt__Group__0 : rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1 ;
    public final void rule__ExternalAlt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3738:1: ( rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3739:2: rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__0__Impl_in_rule__ExternalAlt__Group__07577);
            rule__ExternalAlt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__1_in_rule__ExternalAlt__Group__07580);
            rule__ExternalAlt__Group__1();

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
    // $ANTLR end "rule__ExternalAlt__Group__0"


    // $ANTLR start "rule__ExternalAlt__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3746:1: rule__ExternalAlt__Group__0__Impl : ( '[' ) ;
    public final void rule__ExternalAlt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3750:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3751:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3751:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3752:1: '['
            {
             before(grammarAccess.getExternalAltAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ExternalAlt__Group__0__Impl7608); 
             after(grammarAccess.getExternalAltAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ExternalAlt__Group__0__Impl"


    // $ANTLR start "rule__ExternalAlt__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3765:1: rule__ExternalAlt__Group__1 : rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2 ;
    public final void rule__ExternalAlt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3769:1: ( rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3770:2: rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__1__Impl_in_rule__ExternalAlt__Group__17639);
            rule__ExternalAlt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__2_in_rule__ExternalAlt__Group__17642);
            rule__ExternalAlt__Group__2();

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
    // $ANTLR end "rule__ExternalAlt__Group__1"


    // $ANTLR start "rule__ExternalAlt__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3777:1: rule__ExternalAlt__Group__1__Impl : ( ( rule__ExternalAlt__NameAssignment_1 ) ) ;
    public final void rule__ExternalAlt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3781:1: ( ( ( rule__ExternalAlt__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3782:1: ( ( rule__ExternalAlt__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3782:1: ( ( rule__ExternalAlt__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3783:1: ( rule__ExternalAlt__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAltAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3784:1: ( rule__ExternalAlt__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3784:2: rule__ExternalAlt__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalAlt__NameAssignment_1_in_rule__ExternalAlt__Group__1__Impl7669);
            rule__ExternalAlt__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAltAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ExternalAlt__Group__1__Impl"


    // $ANTLR start "rule__ExternalAlt__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3794:1: rule__ExternalAlt__Group__2 : rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3 ;
    public final void rule__ExternalAlt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3798:1: ( rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3799:2: rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__2__Impl_in_rule__ExternalAlt__Group__27699);
            rule__ExternalAlt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__3_in_rule__ExternalAlt__Group__27702);
            rule__ExternalAlt__Group__3();

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
    // $ANTLR end "rule__ExternalAlt__Group__2"


    // $ANTLR start "rule__ExternalAlt__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3806:1: rule__ExternalAlt__Group__2__Impl : ( ( rule__ExternalAlt__AltTextAssignment_2 ) ) ;
    public final void rule__ExternalAlt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3810:1: ( ( ( rule__ExternalAlt__AltTextAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3811:1: ( ( rule__ExternalAlt__AltTextAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3811:1: ( ( rule__ExternalAlt__AltTextAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3812:1: ( rule__ExternalAlt__AltTextAssignment_2 )
            {
             before(grammarAccess.getExternalAltAccess().getAltTextAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3813:1: ( rule__ExternalAlt__AltTextAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3813:2: rule__ExternalAlt__AltTextAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalAlt__AltTextAssignment_2_in_rule__ExternalAlt__Group__2__Impl7729);
            rule__ExternalAlt__AltTextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalAltAccess().getAltTextAssignment_2()); 

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
    // $ANTLR end "rule__ExternalAlt__Group__2__Impl"


    // $ANTLR start "rule__ExternalAlt__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3823:1: rule__ExternalAlt__Group__3 : rule__ExternalAlt__Group__3__Impl ;
    public final void rule__ExternalAlt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3827:1: ( rule__ExternalAlt__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3828:2: rule__ExternalAlt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__3__Impl_in_rule__ExternalAlt__Group__37759);
            rule__ExternalAlt__Group__3__Impl();

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
    // $ANTLR end "rule__ExternalAlt__Group__3"


    // $ANTLR start "rule__ExternalAlt__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3834:1: rule__ExternalAlt__Group__3__Impl : ( ']' ) ;
    public final void rule__ExternalAlt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3838:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3839:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3839:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3840:1: ']'
            {
             before(grammarAccess.getExternalAltAccess().getRightSquareBracketKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__ExternalAlt__Group__3__Impl7787); 
             after(grammarAccess.getExternalAltAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__ExternalAlt__Group__3__Impl"


    // $ANTLR start "rule__AnyTextSequence__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3861:1: rule__AnyTextSequence__Group__0 : rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 ;
    public final void rule__AnyTextSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3865:1: ( rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3866:2: rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__07826);
            rule__AnyTextSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__07829);
            rule__AnyTextSequence__Group__1();

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
    // $ANTLR end "rule__AnyTextSequence__Group__0"


    // $ANTLR start "rule__AnyTextSequence__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3873:1: rule__AnyTextSequence__Group__0__Impl : ( () ) ;
    public final void rule__AnyTextSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3877:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3878:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3878:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3879:1: ()
            {
             before(grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3880:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3882:1: 
            {
            }

             after(grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnyTextSequence__Group__0__Impl"


    // $ANTLR start "rule__AnyTextSequence__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3892:1: rule__AnyTextSequence__Group__1 : rule__AnyTextSequence__Group__1__Impl ;
    public final void rule__AnyTextSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3896:1: ( rule__AnyTextSequence__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3897:2: rule__AnyTextSequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__17887);
            rule__AnyTextSequence__Group__1__Impl();

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
    // $ANTLR end "rule__AnyTextSequence__Group__1"


    // $ANTLR start "rule__AnyTextSequence__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3903:1: rule__AnyTextSequence__Group__1__Impl : ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) ;
    public final void rule__AnyTextSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3907:1: ( ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3908:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3908:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3909:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3910:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==30||(LA16_0>=40 && LA16_0<=43)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3910:2: rule__AnyTextSequence__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl7914);
            	    rule__AnyTextSequence__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAnyTextSequenceAccess().getContentAssignment_1()); 

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
    // $ANTLR end "rule__AnyTextSequence__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3924:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3928:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3929:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07949);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07952);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3936:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3940:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3941:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3941:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3942:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl7979); 
             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3953:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3957:1: ( rule__Name__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3958:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__18008);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3964:1: rule__Name__Group__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3968:1: ( ( ( RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3969:1: ( ( RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3969:1: ( ( RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3970:1: ( RULE_ID )*
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3971:1: ( RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3971:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8036); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__WikiPage__NameAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3986:1: rule__WikiPage__NameAssignment_0 : ( ruleHeading1 ) ;
    public final void rule__WikiPage__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3990:1: ( ( ruleHeading1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3991:1: ( ruleHeading1 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3991:1: ( ruleHeading1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3992:1: ruleHeading1
            {
             before(grammarAccess.getWikiPageAccess().getNameHeading1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeading1_in_rule__WikiPage__NameAssignment_08076);
            ruleHeading1();

            state._fsp--;

             after(grammarAccess.getWikiPageAccess().getNameHeading1ParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__WikiPage__NameAssignment_0"


    // $ANTLR start "rule__WikiPage__ElementsAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4001:1: rule__WikiPage__ElementsAssignment_1 : ( ruleParagraphTypes ) ;
    public final void rule__WikiPage__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4005:1: ( ( ruleParagraphTypes ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4006:1: ( ruleParagraphTypes )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4006:1: ( ruleParagraphTypes )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4007:1: ruleParagraphTypes
            {
             before(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_18107);
            ruleParagraphTypes();

            state._fsp--;

             after(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WikiPage__ElementsAssignment_1"


    // $ANTLR start "rule__BlockQuote__ContentAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4016:1: rule__BlockQuote__ContentAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__BlockQuote__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4020:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4021:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4021:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4022:1: ruleAnyTextSequence
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28138);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BlockQuote__ContentAssignment_2"


    // $ANTLR start "rule__Template__ContentAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4031:1: rule__Template__ContentAssignment_1 : ( ruleText ) ;
    public final void rule__Template__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4035:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4036:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4036:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4037:1: ruleText
            {
             before(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Template__ContentAssignment_18169);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Template__ContentAssignment_1"


    // $ANTLR start "rule__Template__ContentAssignment_2_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4046:1: rule__Template__ContentAssignment_2_1 : ( ruleText ) ;
    public final void rule__Template__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4050:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4051:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4051:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4052:1: ruleText
            {
             before(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Template__ContentAssignment_2_18200);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Template__ContentAssignment_2_1"


    // $ANTLR start "rule__UnOrderListItemLevel2__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4061:1: rule__UnOrderListItemLevel2__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__UnOrderListItemLevel2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4065:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4066:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4066:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4067:1: ruleAnyText
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel2__NameAssignment_18231);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel2Access().getNameAnyTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__NameAssignment_1"


    // $ANTLR start "rule__UnOrderListItemLevel2__ListAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4076:1: rule__UnOrderListItemLevel2__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__UnOrderListItemLevel2__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4080:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4081:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4081:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4082:1: ruleAnyTextSequence
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel2__ListAssignment_28262);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel2Access().getListAnyTextSequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel2__ListAssignment_2"


    // $ANTLR start "rule__UnOrderListItemLevel1__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4091:1: rule__UnOrderListItemLevel1__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__UnOrderListItemLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4095:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4096:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4096:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4097:1: ruleAnyText
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel1__NameAssignment_18293);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__NameAssignment_1"


    // $ANTLR start "rule__UnOrderListItemLevel1__ListAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4106:1: rule__UnOrderListItemLevel1__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__UnOrderListItemLevel1__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4110:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4111:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4111:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4112:1: ruleAnyTextSequence
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel1__ListAssignment_28324);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getUnOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UnOrderListItemLevel1__ListAssignment_2"


    // $ANTLR start "rule__OrderListItemLevel1__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4121:1: rule__OrderListItemLevel1__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__OrderListItemLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4125:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4126:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4126:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4127:1: ruleAnyText
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__OrderListItemLevel1__NameAssignment_18355);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__NameAssignment_1"


    // $ANTLR start "rule__OrderListItemLevel1__ListAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4136:1: rule__OrderListItemLevel1__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__OrderListItemLevel1__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4140:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4141:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4141:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4142:1: ruleAnyTextSequence
            {
             before(grammarAccess.getOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__OrderListItemLevel1__ListAssignment_28386);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__OrderListItemLevel1__ListAssignment_2"


    // $ANTLR start "rule__Image__NameAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4151:1: rule__Image__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Image__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4155:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4156:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4156:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4157:1: ruleText
            {
             before(grammarAccess.getImageAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Image__NameAssignment_28417);
            ruleText();

            state._fsp--;

             after(grammarAccess.getImageAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Image__NameAssignment_2"


    // $ANTLR start "rule__Image__TypeAssignment_3_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4166:1: rule__Image__TypeAssignment_3_1 : ( ruleViewType ) ;
    public final void rule__Image__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4170:1: ( ( ruleViewType ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4171:1: ( ruleViewType )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4171:1: ( ruleViewType )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4172:1: ruleViewType
            {
             before(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18448);
            ruleViewType();

            state._fsp--;

             after(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Image__TypeAssignment_3_1"


    // $ANTLR start "rule__Image__HAlignAssignment_4_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4181:1: rule__Image__HAlignAssignment_4_1 : ( ruleHorizontalAlign ) ;
    public final void rule__Image__HAlignAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4185:1: ( ( ruleHorizontalAlign ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4186:1: ( ruleHorizontalAlign )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4186:1: ( ruleHorizontalAlign )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4187:1: ruleHorizontalAlign
            {
             before(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18479);
            ruleHorizontalAlign();

            state._fsp--;

             after(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Image__HAlignAssignment_4_1"


    // $ANTLR start "rule__Image__AltTextAssignment_5_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4196:1: rule__Image__AltTextAssignment_5_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Image__AltTextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4200:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4201:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4201:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4202:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18510);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Image__AltTextAssignment_5_1"


    // $ANTLR start "rule__Image__CaptionAssignment_7"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4211:1: rule__Image__CaptionAssignment_7 : ( ruleAnyTextSequence ) ;
    public final void rule__Image__CaptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4215:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4216:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4216:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4217:1: ruleAnyTextSequence
            {
             before(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78541);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Image__CaptionAssignment_7"


    // $ANTLR start "rule__Category__NameAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4226:1: rule__Category__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Category__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4230:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4231:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4231:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4232:1: ruleText
            {
             before(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Category__NameAssignment_28572);
            ruleText();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Category__NameAssignment_2"


    // $ANTLR start "rule__Category__ValueAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4241:1: rule__Category__ValueAssignment_3 : ( ( '|*?' ) ) ;
    public final void rule__Category__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4245:1: ( ( ( '|*?' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4246:1: ( ( '|*?' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4246:1: ( ( '|*?' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4247:1: ( '|*?' )
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4248:1: ( '|*?' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4249:1: '|*?'
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Category__ValueAssignment_38608); 
             after(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 

            }

             after(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 

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
    // $ANTLR end "rule__Category__ValueAssignment_3"


    // $ANTLR start "rule__Heading1__HeadingValue1Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4264:1: rule__Heading1__HeadingValue1Assignment_1 : ( ruleText ) ;
    public final void rule__Heading1__HeadingValue1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4268:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4269:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4269:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4270:1: ruleText
            {
             before(grammarAccess.getHeading1Access().getHeadingValue1TextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Heading1__HeadingValue1Assignment_18647);
            ruleText();

            state._fsp--;

             after(grammarAccess.getHeading1Access().getHeadingValue1TextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading1__HeadingValue1Assignment_1"


    // $ANTLR start "rule__Heading2__HeadingValue2Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4279:1: rule__Heading2__HeadingValue2Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading2__HeadingValue2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4283:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4284:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4284:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4285:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18678);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading2__HeadingValue2Assignment_1"


    // $ANTLR start "rule__Heading3__HeadingValue3Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4294:1: rule__Heading3__HeadingValue3Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading3__HeadingValue3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4298:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4299:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4299:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4300:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_18709);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading3__HeadingValue3Assignment_1"


    // $ANTLR start "rule__Heading4__HeadingValue4Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4309:1: rule__Heading4__HeadingValue4Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading4__HeadingValue4Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4313:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4314:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4314:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4315:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_18740);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading4__HeadingValue4Assignment_1"


    // $ANTLR start "rule__Heading5__HeadingValue5Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4324:1: rule__Heading5__HeadingValue5Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading5__HeadingValue5Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4328:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4329:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4329:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4330:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_18771);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Heading5__HeadingValue5Assignment_1"


    // $ANTLR start "rule__Bold__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4339:1: rule__Bold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Bold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4343:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4344:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4344:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4345:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_18802);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Bold__NameAssignment_1"


    // $ANTLR start "rule__Italic__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4354:1: rule__Italic__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Italic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4358:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4359:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4359:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4360:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_18833);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Italic__NameAssignment_1"


    // $ANTLR start "rule__ItalicBold__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4369:1: rule__ItalicBold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__ItalicBold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4373:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4374:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4374:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4375:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_18864);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ItalicBold__NameAssignment_1"


    // $ANTLR start "rule__Text__NameAssignment"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4384:1: rule__Text__NameAssignment : ( ruleName ) ;
    public final void rule__Text__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4388:1: ( ( ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4389:1: ( ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4389:1: ( ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4390:1: ruleName
            {
             before(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Text__NameAssignment8895);
            ruleName();

            state._fsp--;

             after(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__Text__NameAssignment"


    // $ANTLR start "rule__Internal__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4399:1: rule__Internal__NameAssignment_1 : ( ruleText ) ;
    public final void rule__Internal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4403:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4404:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4404:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4405:1: ruleText
            {
             before(grammarAccess.getInternalAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Internal__NameAssignment_18926);
            ruleText();

            state._fsp--;

             after(grammarAccess.getInternalAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Internal__NameAssignment_1"


    // $ANTLR start "rule__InternalAlt__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4414:1: rule__InternalAlt__NameAssignment_1 : ( ruleText ) ;
    public final void rule__InternalAlt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4418:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4419:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4419:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4420:1: ruleText
            {
             before(grammarAccess.getInternalAltAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__InternalAlt__NameAssignment_18957);
            ruleText();

            state._fsp--;

             after(grammarAccess.getInternalAltAccess().getNameTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__InternalAlt__NameAssignment_1"


    // $ANTLR start "rule__InternalAlt__AltTextAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4429:1: rule__InternalAlt__AltTextAssignment_3 : ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) ) ;
    public final void rule__InternalAlt__AltTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4433:1: ( ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4434:1: ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4434:1: ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4435:1: ( rule__InternalAlt__AltTextAlternatives_3_0 )
            {
             before(grammarAccess.getInternalAltAccess().getAltTextAlternatives_3_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4436:1: ( rule__InternalAlt__AltTextAlternatives_3_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4436:2: rule__InternalAlt__AltTextAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__InternalAlt__AltTextAlternatives_3_0_in_rule__InternalAlt__AltTextAssignment_38988);
            rule__InternalAlt__AltTextAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getInternalAltAccess().getAltTextAlternatives_3_0()); 

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
    // $ANTLR end "rule__InternalAlt__AltTextAssignment_3"


    // $ANTLR start "rule__External__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4445:1: rule__External__NameAssignment_1 : ( RULE_URL ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4449:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4450:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4450:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4451:1: RULE_URL
            {
             before(grammarAccess.getExternalAccess().getNameURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__External__NameAssignment_19021); 
             after(grammarAccess.getExternalAccess().getNameURLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__External__NameAssignment_1"


    // $ANTLR start "rule__ExternalAlt__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4460:1: rule__ExternalAlt__NameAssignment_1 : ( RULE_URL ) ;
    public final void rule__ExternalAlt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4464:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4465:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4465:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4466:1: RULE_URL
            {
             before(grammarAccess.getExternalAltAccess().getNameURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__ExternalAlt__NameAssignment_19052); 
             after(grammarAccess.getExternalAltAccess().getNameURLTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExternalAlt__NameAssignment_1"


    // $ANTLR start "rule__ExternalAlt__AltTextAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4475:1: rule__ExternalAlt__AltTextAssignment_2 : ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) ) ;
    public final void rule__ExternalAlt__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4479:1: ( ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4480:1: ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4480:1: ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4481:1: ( rule__ExternalAlt__AltTextAlternatives_2_0 )
            {
             before(grammarAccess.getExternalAltAccess().getAltTextAlternatives_2_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4482:1: ( rule__ExternalAlt__AltTextAlternatives_2_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4482:2: rule__ExternalAlt__AltTextAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ExternalAlt__AltTextAlternatives_2_0_in_rule__ExternalAlt__AltTextAssignment_29083);
            rule__ExternalAlt__AltTextAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAltAccess().getAltTextAlternatives_2_0()); 

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
    // $ANTLR end "rule__ExternalAlt__AltTextAssignment_2"


    // $ANTLR start "rule__AnyTextSequence__ContentAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4491:1: rule__AnyTextSequence__ContentAssignment_1 : ( ruleAnyText ) ;
    public final void rule__AnyTextSequence__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4495:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4496:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4496:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4497:1: ruleAnyText
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19116);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnyTextSequence__ContentAssignment_1"


    // $ANTLR start "rule__AnyText__NameAssignment"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4506:1: rule__AnyText__NameAssignment : ( ( rule__AnyText__NameAlternatives_0 ) ) ;
    public final void rule__AnyText__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4510:1: ( ( ( rule__AnyText__NameAlternatives_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4511:1: ( ( rule__AnyText__NameAlternatives_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4511:1: ( ( rule__AnyText__NameAlternatives_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4512:1: ( rule__AnyText__NameAlternatives_0 )
            {
             before(grammarAccess.getAnyTextAccess().getNameAlternatives_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4513:1: ( rule__AnyText__NameAlternatives_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4513:2: rule__AnyText__NameAlternatives_0
            {
            pushFollow(FOLLOW_rule__AnyText__NameAlternatives_0_in_rule__AnyText__NameAssignment9147);
            rule__AnyText__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAnyTextAccess().getNameAlternatives_0()); 

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
    // $ANTLR end "rule__AnyText__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\4\3\uffff\1\4\13\uffff";
    static final String DFA1_maxS =
        "\1\53\3\uffff\1\42\13\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\5\1\4";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\20\uffff\1\10\1\uffff\1\5\2\uffff\1\3\1\uffff\1\2\1\1"+
            "\1\4\4\uffff\1\11\1\12\1\13\1\14\1\15\3\6\1\7",
            "",
            "",
            "",
            "\1\7\32\uffff\1\17\2\uffff\1\16",
            "",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "882:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) );";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\36\1\4\1\5\3\4\4\uffff";
    static final String DFA4_maxS =
        "\1\53\1\4\1\5\1\40\1\54\1\40\4\uffff";
    static final String DFA4_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\14\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\24\uffff\1\7\6\uffff\1\6",
            "\1\11\31\uffff\1\11\11\uffff\4\11\1\10",
            "\1\5\24\uffff\1\7\6\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1026:1: rule__HyperLink__Alternatives : ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleWikiPage_in_entryRuleWikiPage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWikiPage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__0_in_ruleWikiPage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_entryRuleParagraphTypes121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraphTypes128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParagraphTypes__Alternatives_in_ruleParagraphTypes154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_entryRuleBlockQuote181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockQuote188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0_in_ruleBlockQuote214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0_in_ruleTemplate274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_entryRuleUnOrderListItemLevel2301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__0_in_ruleUnOrderListItemLevel2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_entryRuleUnOrderListItemLevel1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnOrderListItemLevel1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__0_in_ruleUnOrderListItemLevel1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_entryRuleOrderListItemLevel1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderListItemLevel1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__0_in_ruleOrderListItemLevel1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0_in_ruleImage514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading1601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__0_in_ruleHeading1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0_in_ruleHeading2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading3721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0_in_ruleHeading3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading4781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0_in_ruleHeading4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_entryRuleHeading5841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__0_in_ruleHeading5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFormattedInlineContent__Alternatives_in_ruleAbstractFormattedInlineContent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__0_in_ruleBold994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__0_in_ruleItalic1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_entryRuleItalicBold1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBold1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__0_in_ruleItalicBold1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractUnformattedInlineContent__Alternatives_in_ruleAbstractUnformattedInlineContent1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__NameAssignment_in_ruleText1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_entryRuleHyperLink1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperLink1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HyperLink__Alternatives_in_ruleHyperLink1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_entryRuleInternal1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternal1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__0_in_ruleInternal1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_entryRuleInternalAlt1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalAlt1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__0_in_ruleInternalAlt1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_entryRuleExternal1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternal1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__0_in_ruleExternal1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_entryRuleExternalAlt1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalAlt1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__0_in_ruleExternalAlt1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyTextSequence1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__0_in_ruleAnyTextSequence1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyText__NameAssignment_in_ruleAnyText1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewType__Alternatives_in_ruleViewType1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HorizontalAlign__Alternatives_in_ruleHorizontalAlign1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItemLevel1_in_rule__ParagraphTypes__Alternatives1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel1_in_rule__ParagraphTypes__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnOrderListItemLevel2_in_rule__ParagraphTypes__Alternatives1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__ParagraphTypes__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__ParagraphTypes__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__ParagraphTypes__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ParagraphTypes__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ParagraphTypes__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_rule__ParagraphTypes__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_rule__HyperLink__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_rule__HyperLink__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__NameAlternatives_02371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__NameAlternatives_02388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ViewType__Alternatives2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewType__Alternatives2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewType__Alternatives2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewType__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewType__Alternatives2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HorizontalAlign__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HorizontalAlign__Alternatives2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HorizontalAlign__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HorizontalAlign__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02637 = new BitSet(new long[]{0x00000FF874A00010L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__NameAssignment_0_in_rule__WikiPage__Group__0__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__ElementsAssignment_1_in_rule__WikiPage__Group__1__Impl2724 = new BitSet(new long[]{0x00000FF874A00012L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02759 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12820 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BlockQuote__Group__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22882 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__32942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BlockQuote__Group__3__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__03009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Template__Group__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__13071 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__ContentAssignment_1_in_rule__Template__Group__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__23131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__23134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3163 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3175 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__33208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Template__Group__3__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0__Impl_in_rule__Template__Group_2__03275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Template__Group_2__1_in_rule__Template__Group_2__03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Template__Group_2__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__1__Impl_in_rule__Template__Group_2__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__ContentAssignment_2_1_in_rule__Template__Group_2__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__0__Impl_in_rule__UnOrderListItemLevel2__Group__03398 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__1_in_rule__UnOrderListItemLevel2__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnOrderListItemLevel2__Group__0__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__1__Impl_in_rule__UnOrderListItemLevel2__Group__13460 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__2_in_rule__UnOrderListItemLevel2__Group__13463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__NameAssignment_1_in_rule__UnOrderListItemLevel2__Group__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__2__Impl_in_rule__UnOrderListItemLevel2__Group__23520 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__3_in_rule__UnOrderListItemLevel2__Group__23523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__ListAssignment_2_in_rule__UnOrderListItemLevel2__Group__2__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__3__Impl_in_rule__UnOrderListItemLevel2__Group__33580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UnOrderListItemLevel2__Group__3__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__0__Impl_in_rule__UnOrderListItemLevel1__Group__03647 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__1_in_rule__UnOrderListItemLevel1__Group__03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UnOrderListItemLevel1__Group__0__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__1__Impl_in_rule__UnOrderListItemLevel1__Group__13709 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__2_in_rule__UnOrderListItemLevel1__Group__13712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__NameAssignment_1_in_rule__UnOrderListItemLevel1__Group__1__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__2__Impl_in_rule__UnOrderListItemLevel1__Group__23769 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__3_in_rule__UnOrderListItemLevel1__Group__23772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__ListAssignment_2_in_rule__UnOrderListItemLevel1__Group__2__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__3__Impl_in_rule__UnOrderListItemLevel1__Group__33829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UnOrderListItemLevel1__Group__3__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__0__Impl_in_rule__OrderListItemLevel1__Group__03896 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__1_in_rule__OrderListItemLevel1__Group__03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OrderListItemLevel1__Group__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__1__Impl_in_rule__OrderListItemLevel1__Group__13958 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__2_in_rule__OrderListItemLevel1__Group__13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__NameAssignment_1_in_rule__OrderListItemLevel1__Group__1__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__2__Impl_in_rule__OrderListItemLevel1__Group__24018 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__3_in_rule__OrderListItemLevel1__Group__24021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__ListAssignment_2_in_rule__OrderListItemLevel1__Group__2__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__3__Impl_in_rule__OrderListItemLevel1__Group__34078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OrderListItemLevel1__Group__3__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04145 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Image__Group__0__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Image__Group__1__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24269 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34329 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44390 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54451 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64512 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group__6__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__74574 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Image__Group__8_in_rule__Image__Group__74577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__84634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Image__Group__8__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__04711 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__04714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group_3__0__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__14773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__04834 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__04837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group_4__0__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__14896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__04957 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__04960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Image__Group_5__0__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05080 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Category__Group__0__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Category__Group__1__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25204 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35264 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Category__Group__4__Impl5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__05394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Heading1__Group__0__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__15456 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__HeadingValue1Assignment_1_in_rule__Heading1__Group__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__25516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Heading1__Group__2__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05581 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Heading2__Group__0__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15643 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Heading2__Group__2__Impl5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__05768 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__05771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Heading3__Group__0__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__15830 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__25890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Heading3__Group__2__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__05955 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__05958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Heading4__Group__0__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16017 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Heading4__Group__2__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06142 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Heading5__Group__0__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16204 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Heading5__Group__2__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06329 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bold__Group__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16391 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bold__Group__2__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06516 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Italic__Group__0__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16578 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Italic__Group__2__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06703 = new BitSet(new long[]{0x0000080040000010L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ItalicBold__Group__0__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__16765 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__16768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl6795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__26825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ItalicBold__Group__2__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__06890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__06893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Internal__Group__0__Impl6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__16952 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__16955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__NameAssignment_1_in_rule__Internal__Group__1__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__27012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Internal__Group__2__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__0__Impl_in_rule__InternalAlt__Group__07077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__1_in_rule__InternalAlt__Group__07080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InternalAlt__Group__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__1__Impl_in_rule__InternalAlt__Group__17139 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__2_in_rule__InternalAlt__Group__17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__NameAssignment_1_in_rule__InternalAlt__Group__1__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__2__Impl_in_rule__InternalAlt__Group__27199 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__3_in_rule__InternalAlt__Group__27202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InternalAlt__Group__2__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__3__Impl_in_rule__InternalAlt__Group__37261 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__4_in_rule__InternalAlt__Group__37264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__AltTextAssignment_3_in_rule__InternalAlt__Group__3__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__4__Impl_in_rule__InternalAlt__Group__47321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InternalAlt__Group__4__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__External__Group__1_in_rule__External__Group__07393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__External__Group__0__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17452 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__External__Group__2_in_rule__External__Group__17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__External__Group__2__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__0__Impl_in_rule__ExternalAlt__Group__07577 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__1_in_rule__ExternalAlt__Group__07580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalAlt__Group__0__Impl7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__1__Impl_in_rule__ExternalAlt__Group__17639 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__2_in_rule__ExternalAlt__Group__17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__NameAssignment_1_in_rule__ExternalAlt__Group__1__Impl7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__2__Impl_in_rule__ExternalAlt__Group__27699 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__3_in_rule__ExternalAlt__Group__27702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__AltTextAssignment_2_in_rule__ExternalAlt__Group__2__Impl7729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__3__Impl_in_rule__ExternalAlt__Group__37759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalAlt__Group__3__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__07826 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__07829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl7914 = new BitSet(new long[]{0x00000F0040000012L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__18008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8036 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHeading1_in_rule__WikiPage__NameAssignment_08076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_18107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Template__ContentAssignment_18169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Template__ContentAssignment_2_18200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel2__NameAssignment_18231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel2__ListAssignment_28262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel1__NameAssignment_18293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel1__ListAssignment_28324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__OrderListItemLevel1__NameAssignment_18355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__OrderListItemLevel1__ListAssignment_28386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Image__NameAssignment_28417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Category__NameAssignment_28572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Category__ValueAssignment_38608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Heading1__HeadingValue1Assignment_18647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_18709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_18740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_18771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_18802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_18833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_18864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Text__NameAssignment8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Internal__NameAssignment_18926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__InternalAlt__NameAssignment_18957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__AltTextAlternatives_3_0_in_rule__InternalAlt__AltTextAssignment_38988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__External__NameAssignment_19021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__ExternalAlt__NameAssignment_19052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__AltTextAlternatives_2_0_in_rule__ExternalAlt__AltTextAssignment_29083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyText__NameAlternatives_0_in_rule__AnyText__NameAssignment9147 = new BitSet(new long[]{0x0000000000000002L});

}