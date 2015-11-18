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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:797:1: ruleAnyText : ( ( rule__AnyText__Alternatives ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:801:2: ( ( ( rule__AnyText__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyText__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyText__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:803:1: ( rule__AnyText__Alternatives )
            {
             before(grammarAccess.getAnyTextAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:1: ( rule__AnyText__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:2: rule__AnyText__Alternatives
            {
            pushFollow(FOLLOW_rule__AnyText__Alternatives_in_ruleAnyText1654);
            rule__AnyText__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnyTextAccess().getAlternatives()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:882:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) );
    public final void rule__ParagraphTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:886:1: ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) )
            int alt1=13;
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:923:6: ( ruleAnyText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:923:6: ( ruleAnyText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:924:1: ruleAnyText
                    {
                     before(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleAnyText_in_rule__ParagraphTypes__Alternatives1924);
                    ruleAnyText();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:929:6: ( ruleBlockQuote )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:929:6: ( ruleBlockQuote )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:930:1: ruleBlockQuote
                    {
                     before(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives1941);
                    ruleBlockQuote();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:935:6: ( ruleHeading1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:935:6: ( ruleHeading1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:936:1: ruleHeading1
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHeading1_in_rule__ParagraphTypes__Alternatives1958);
                    ruleHeading1();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading1ParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:941:6: ( ruleHeading2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:941:6: ( ruleHeading2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:942:1: ruleHeading2
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives1975);
                    ruleHeading2();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:6: ( ruleHeading3 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:6: ( ruleHeading3 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:948:1: ruleHeading3
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives1992);
                    ruleHeading3();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:953:6: ( ruleHeading4 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:953:6: ( ruleHeading4 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:954:1: ruleHeading4
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2009);
                    ruleHeading4();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:959:6: ( ruleHeading5 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:959:6: ( ruleHeading5 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:960:1: ruleHeading5
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2026);
                    ruleHeading5();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_12()); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:970:1: rule__AbstractFormattedInlineContent__Alternatives : ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) );
    public final void rule__AbstractFormattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:974:1: ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:975:1: ( ruleBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:975:1: ( ruleBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:976:1: ruleBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2058);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:6: ( ruleItalic )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:6: ( ruleItalic )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:982:1: ruleItalic
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2075);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleItalicBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleItalicBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:988:1: ruleItalicBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2092);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:998:1: rule__AbstractUnformattedInlineContent__Alternatives : ( ( ruleText ) | ( ruleHyperLink ) );
    public final void rule__AbstractUnformattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1002:1: ( ( ruleText ) | ( ruleHyperLink ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1003:1: ( ruleText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1003:1: ( ruleText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1004:1: ruleText
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2124);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:6: ( ruleHyperLink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:6: ( ruleHyperLink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1010:1: ruleHyperLink
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2141);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1020:1: rule__HyperLink__Alternatives : ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) );
    public final void rule__HyperLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1024:1: ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1025:1: ( ruleInternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1025:1: ( ruleInternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1026:1: ruleInternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2173);
                    ruleInternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:6: ( ruleInternalAlt )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:6: ( ruleInternalAlt )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1032:1: ruleInternalAlt
                    {
                     before(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInternalAlt_in_rule__HyperLink__Alternatives2190);
                    ruleInternalAlt();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getInternalAltParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1037:6: ( ruleExternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1037:6: ( ruleExternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1038:1: ruleExternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2207);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:6: ( ruleExternalAlt )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:6: ( ruleExternalAlt )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1044:1: ruleExternalAlt
                    {
                     before(grammarAccess.getHyperLinkAccess().getExternalAltParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExternalAlt_in_rule__HyperLink__Alternatives2224);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1054:1: rule__InternalAlt__AltTextAlternatives_3_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__InternalAlt__AltTextAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1058:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1059:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1059:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1060:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02256);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getInternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1065:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1065:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1066:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getInternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02273);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1076:1: rule__ExternalAlt__AltTextAlternatives_2_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__ExternalAlt__AltTextAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1080:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1082:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02305);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getExternalAltAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1088:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getExternalAltAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02322);
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


    // $ANTLR start "rule__AnyText__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1098:1: rule__AnyText__Alternatives : ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) );
    public final void rule__AnyText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1102:1: ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1103:1: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1103:1: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1104:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__Alternatives2354);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:6: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:6: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1110:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__Alternatives2371);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getAnyTextAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 

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
    // $ANTLR end "rule__AnyText__Alternatives"


    // $ANTLR start "rule__ViewType__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1120:1: rule__ViewType__Alternatives : ( ( ( 'thumb' ) ) | ( ( 'thumbnail' ) ) | ( ( 'frame' ) ) | ( ( 'framed' ) ) | ( ( 'frameless' ) ) );
    public final void rule__ViewType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1124:1: ( ( ( 'thumb' ) ) | ( ( 'thumbnail' ) ) | ( ( 'frame' ) ) | ( ( 'framed' ) ) | ( ( 'frameless' ) ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1125:1: ( ( 'thumb' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1125:1: ( ( 'thumb' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1126:1: ( 'thumb' )
                    {
                     before(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1127:1: ( 'thumb' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1127:3: 'thumb'
                    {
                    match(input,12,FOLLOW_12_in_rule__ViewType__Alternatives2404); 

                    }

                     after(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1132:6: ( ( 'thumbnail' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1132:6: ( ( 'thumbnail' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1133:1: ( 'thumbnail' )
                    {
                     before(grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1134:1: ( 'thumbnail' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1134:3: 'thumbnail'
                    {
                    match(input,13,FOLLOW_13_in_rule__ViewType__Alternatives2425); 

                    }

                     after(grammarAccess.getViewTypeAccess().getThumbnailEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1139:6: ( ( 'frame' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1139:6: ( ( 'frame' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1140:1: ( 'frame' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1141:1: ( 'frame' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1141:3: 'frame'
                    {
                    match(input,14,FOLLOW_14_in_rule__ViewType__Alternatives2446); 

                    }

                     after(grammarAccess.getViewTypeAccess().getFrameEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1146:6: ( ( 'framed' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1146:6: ( ( 'framed' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1147:1: ( 'framed' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1148:1: ( 'framed' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1148:3: 'framed'
                    {
                    match(input,15,FOLLOW_15_in_rule__ViewType__Alternatives2467); 

                    }

                     after(grammarAccess.getViewTypeAccess().getFramedEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1153:6: ( ( 'frameless' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1153:6: ( ( 'frameless' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1154:1: ( 'frameless' )
                    {
                     before(grammarAccess.getViewTypeAccess().getFramelessEnumLiteralDeclaration_4()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1155:1: ( 'frameless' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1155:3: 'frameless'
                    {
                    match(input,16,FOLLOW_16_in_rule__ViewType__Alternatives2488); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1165:1: rule__HorizontalAlign__Alternatives : ( ( ( 'right' ) ) | ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'none' ) ) );
    public final void rule__HorizontalAlign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1169:1: ( ( ( 'right' ) ) | ( ( 'left' ) ) | ( ( 'center' ) ) | ( ( 'none' ) ) )
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1170:1: ( ( 'right' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1170:1: ( ( 'right' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1171:1: ( 'right' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1172:1: ( 'right' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1172:3: 'right'
                    {
                    match(input,17,FOLLOW_17_in_rule__HorizontalAlign__Alternatives2524); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1177:6: ( ( 'left' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1177:6: ( ( 'left' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1178:1: ( 'left' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1179:1: ( 'left' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1179:3: 'left'
                    {
                    match(input,18,FOLLOW_18_in_rule__HorizontalAlign__Alternatives2545); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1184:6: ( ( 'center' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1184:6: ( ( 'center' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1185:1: ( 'center' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1186:1: ( 'center' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1186:3: 'center'
                    {
                    match(input,19,FOLLOW_19_in_rule__HorizontalAlign__Alternatives2566); 

                    }

                     after(grammarAccess.getHorizontalAlignAccess().getCenterEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:6: ( ( 'none' ) )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:6: ( ( 'none' ) )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1192:1: ( 'none' )
                    {
                     before(grammarAccess.getHorizontalAlignAccess().getNoneEnumLiteralDeclaration_3()); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1193:1: ( 'none' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1193:3: 'none'
                    {
                    match(input,20,FOLLOW_20_in_rule__HorizontalAlign__Alternatives2587); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1205:1: rule__WikiPage__Group__0 : rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 ;
    public final void rule__WikiPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1209:1: ( rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1210:2: rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02620);
            rule__WikiPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02623);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1217:1: rule__WikiPage__Group__0__Impl : ( ( rule__WikiPage__NameAssignment_0 ) ) ;
    public final void rule__WikiPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1221:1: ( ( ( rule__WikiPage__NameAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1222:1: ( ( rule__WikiPage__NameAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1222:1: ( ( rule__WikiPage__NameAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1223:1: ( rule__WikiPage__NameAssignment_0 )
            {
             before(grammarAccess.getWikiPageAccess().getNameAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1224:1: ( rule__WikiPage__NameAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1224:2: rule__WikiPage__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__WikiPage__NameAssignment_0_in_rule__WikiPage__Group__0__Impl2650);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1234:1: rule__WikiPage__Group__1 : rule__WikiPage__Group__1__Impl ;
    public final void rule__WikiPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1238:1: ( rule__WikiPage__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1239:2: rule__WikiPage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12680);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1245:1: rule__WikiPage__Group__1__Impl : ( ( rule__WikiPage__ElementsAssignment_1 )* ) ;
    public final void rule__WikiPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1249:1: ( ( ( rule__WikiPage__ElementsAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1250:1: ( ( rule__WikiPage__ElementsAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1250:1: ( ( rule__WikiPage__ElementsAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1251:1: ( rule__WikiPage__ElementsAssignment_1 )*
            {
             before(grammarAccess.getWikiPageAccess().getElementsAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1252:1: ( rule__WikiPage__ElementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==21||LA10_0==23||LA10_0==26||(LA10_0>=28 && LA10_0<=30)||(LA10_0>=35 && LA10_0<=43)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1252:2: rule__WikiPage__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__WikiPage__ElementsAssignment_1_in_rule__WikiPage__Group__1__Impl2707);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1266:1: rule__BlockQuote__Group__0 : rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 ;
    public final void rule__BlockQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1270:1: ( rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1271:2: rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02742);
            rule__BlockQuote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02745);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1278:1: rule__BlockQuote__Group__0__Impl : ( () ) ;
    public final void rule__BlockQuote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1282:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1283:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1283:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1284:1: ()
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1285:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1287:1: 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1297:1: rule__BlockQuote__Group__1 : rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 ;
    public final void rule__BlockQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1301:1: ( rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1302:2: rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12803);
            rule__BlockQuote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12806);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1309:1: rule__BlockQuote__Group__1__Impl : ( '<blockquote>' ) ;
    public final void rule__BlockQuote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1313:1: ( ( '<blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1314:1: ( '<blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1314:1: ( '<blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1315:1: '<blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BlockQuote__Group__1__Impl2834); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1328:1: rule__BlockQuote__Group__2 : rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 ;
    public final void rule__BlockQuote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1332:1: ( rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1333:2: rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22865);
            rule__BlockQuote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22868);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1340:1: rule__BlockQuote__Group__2__Impl : ( ( rule__BlockQuote__ContentAssignment_2 ) ) ;
    public final void rule__BlockQuote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1344:1: ( ( ( rule__BlockQuote__ContentAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1345:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1345:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1346:1: ( rule__BlockQuote__ContentAssignment_2 )
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1347:1: ( rule__BlockQuote__ContentAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1347:2: rule__BlockQuote__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl2895);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1357:1: rule__BlockQuote__Group__3 : rule__BlockQuote__Group__3__Impl ;
    public final void rule__BlockQuote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1361:1: ( rule__BlockQuote__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1362:2: rule__BlockQuote__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__32925);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1368:1: rule__BlockQuote__Group__3__Impl : ( '</blockquote>' ) ;
    public final void rule__BlockQuote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1372:1: ( ( '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1373:1: ( '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1373:1: ( '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1374:1: '</blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__BlockQuote__Group__3__Impl2953); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1395:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1399:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1400:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02992);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02995);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1407:1: rule__Template__Group__0__Impl : ( '{{' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1411:1: ( ( '{{' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1412:1: ( '{{' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1412:1: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1413:1: '{{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Template__Group__0__Impl3023); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1426:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1430:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1431:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__13054);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__13057);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1438:1: rule__Template__Group__1__Impl : ( ( rule__Template__ContentAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1442:1: ( ( ( rule__Template__ContentAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1443:1: ( ( rule__Template__ContentAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1443:1: ( ( rule__Template__ContentAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1444:1: ( rule__Template__ContentAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getContentAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1445:1: ( rule__Template__ContentAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1445:2: rule__Template__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__ContentAssignment_1_in_rule__Template__Group__1__Impl3084);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1455:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1459:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1460:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__23114);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__23117);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1467:1: rule__Template__Group__2__Impl : ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1471:1: ( ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1472:1: ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1472:1: ( ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1473:1: ( ( rule__Template__Group_2__0 ) ) ( ( rule__Template__Group_2__0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1473:1: ( ( rule__Template__Group_2__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1474:1: ( rule__Template__Group_2__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1475:1: ( rule__Template__Group_2__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1475:2: rule__Template__Group_2__0
            {
            pushFollow(FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3146);
            rule__Template__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup_2()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1478:1: ( ( rule__Template__Group_2__0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1479:1: ( rule__Template__Group_2__0 )*
            {
             before(grammarAccess.getTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1480:1: ( rule__Template__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1480:2: rule__Template__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3158);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1491:1: rule__Template__Group__3 : rule__Template__Group__3__Impl ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1495:1: ( rule__Template__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1496:2: rule__Template__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__33191);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1502:1: rule__Template__Group__3__Impl : ( '}}' ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1506:1: ( ( '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1507:1: ( '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1507:1: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1508:1: '}}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Template__Group__3__Impl3219); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1529:1: rule__Template__Group_2__0 : rule__Template__Group_2__0__Impl rule__Template__Group_2__1 ;
    public final void rule__Template__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1533:1: ( rule__Template__Group_2__0__Impl rule__Template__Group_2__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1534:2: rule__Template__Group_2__0__Impl rule__Template__Group_2__1
            {
            pushFollow(FOLLOW_rule__Template__Group_2__0__Impl_in_rule__Template__Group_2__03258);
            rule__Template__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group_2__1_in_rule__Template__Group_2__03261);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1541:1: rule__Template__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Template__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1545:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1546:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1546:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1547:1: '|'
            {
             before(grammarAccess.getTemplateAccess().getVerticalLineKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Template__Group_2__0__Impl3289); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1560:1: rule__Template__Group_2__1 : rule__Template__Group_2__1__Impl ;
    public final void rule__Template__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1564:1: ( rule__Template__Group_2__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1565:2: rule__Template__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group_2__1__Impl_in_rule__Template__Group_2__13320);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1571:1: rule__Template__Group_2__1__Impl : ( ( rule__Template__ContentAssignment_2_1 ) ) ;
    public final void rule__Template__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1575:1: ( ( ( rule__Template__ContentAssignment_2_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1576:1: ( ( rule__Template__ContentAssignment_2_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1576:1: ( ( rule__Template__ContentAssignment_2_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1577:1: ( rule__Template__ContentAssignment_2_1 )
            {
             before(grammarAccess.getTemplateAccess().getContentAssignment_2_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1578:1: ( rule__Template__ContentAssignment_2_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1578:2: rule__Template__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Template__ContentAssignment_2_1_in_rule__Template__Group_2__1__Impl3347);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1592:1: rule__UnOrderListItemLevel2__Group__0 : rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1 ;
    public final void rule__UnOrderListItemLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1596:1: ( rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1597:2: rule__UnOrderListItemLevel2__Group__0__Impl rule__UnOrderListItemLevel2__Group__1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__0__Impl_in_rule__UnOrderListItemLevel2__Group__03381);
            rule__UnOrderListItemLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__1_in_rule__UnOrderListItemLevel2__Group__03384);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1604:1: rule__UnOrderListItemLevel2__Group__0__Impl : ( '**' ) ;
    public final void rule__UnOrderListItemLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1608:1: ( ( '**' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1609:1: ( '**' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1609:1: ( '**' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1610:1: '**'
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getAsteriskAsteriskKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__UnOrderListItemLevel2__Group__0__Impl3412); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1623:1: rule__UnOrderListItemLevel2__Group__1 : rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2 ;
    public final void rule__UnOrderListItemLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1627:1: ( rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1628:2: rule__UnOrderListItemLevel2__Group__1__Impl rule__UnOrderListItemLevel2__Group__2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__1__Impl_in_rule__UnOrderListItemLevel2__Group__13443);
            rule__UnOrderListItemLevel2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__2_in_rule__UnOrderListItemLevel2__Group__13446);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1635:1: rule__UnOrderListItemLevel2__Group__1__Impl : ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) ) ;
    public final void rule__UnOrderListItemLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1639:1: ( ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1640:1: ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1640:1: ( ( rule__UnOrderListItemLevel2__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1641:1: ( rule__UnOrderListItemLevel2__NameAssignment_1 )
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1642:1: ( rule__UnOrderListItemLevel2__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1642:2: rule__UnOrderListItemLevel2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__NameAssignment_1_in_rule__UnOrderListItemLevel2__Group__1__Impl3473);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1652:1: rule__UnOrderListItemLevel2__Group__2 : rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3 ;
    public final void rule__UnOrderListItemLevel2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1656:1: ( rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1657:2: rule__UnOrderListItemLevel2__Group__2__Impl rule__UnOrderListItemLevel2__Group__3
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__2__Impl_in_rule__UnOrderListItemLevel2__Group__23503);
            rule__UnOrderListItemLevel2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__3_in_rule__UnOrderListItemLevel2__Group__23506);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1664:1: rule__UnOrderListItemLevel2__Group__2__Impl : ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) ) ;
    public final void rule__UnOrderListItemLevel2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1668:1: ( ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1669:1: ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1669:1: ( ( rule__UnOrderListItemLevel2__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1670:1: ( rule__UnOrderListItemLevel2__ListAssignment_2 )
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1671:1: ( rule__UnOrderListItemLevel2__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1671:2: rule__UnOrderListItemLevel2__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__ListAssignment_2_in_rule__UnOrderListItemLevel2__Group__2__Impl3533);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1681:1: rule__UnOrderListItemLevel2__Group__3 : rule__UnOrderListItemLevel2__Group__3__Impl ;
    public final void rule__UnOrderListItemLevel2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1685:1: ( rule__UnOrderListItemLevel2__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1686:2: rule__UnOrderListItemLevel2__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel2__Group__3__Impl_in_rule__UnOrderListItemLevel2__Group__33563);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1692:1: rule__UnOrderListItemLevel2__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__UnOrderListItemLevel2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1696:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1697:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1697:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1698:1: ':LIST'
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__UnOrderListItemLevel2__Group__3__Impl3591); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1719:1: rule__UnOrderListItemLevel1__Group__0 : rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1 ;
    public final void rule__UnOrderListItemLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1723:1: ( rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1724:2: rule__UnOrderListItemLevel1__Group__0__Impl rule__UnOrderListItemLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__0__Impl_in_rule__UnOrderListItemLevel1__Group__03630);
            rule__UnOrderListItemLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__1_in_rule__UnOrderListItemLevel1__Group__03633);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1731:1: rule__UnOrderListItemLevel1__Group__0__Impl : ( '*' ) ;
    public final void rule__UnOrderListItemLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1735:1: ( ( '*' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1736:1: ( '*' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1736:1: ( '*' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1737:1: '*'
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getAsteriskKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UnOrderListItemLevel1__Group__0__Impl3661); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1750:1: rule__UnOrderListItemLevel1__Group__1 : rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2 ;
    public final void rule__UnOrderListItemLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1754:1: ( rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1755:2: rule__UnOrderListItemLevel1__Group__1__Impl rule__UnOrderListItemLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__1__Impl_in_rule__UnOrderListItemLevel1__Group__13692);
            rule__UnOrderListItemLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__2_in_rule__UnOrderListItemLevel1__Group__13695);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1762:1: rule__UnOrderListItemLevel1__Group__1__Impl : ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) ) ;
    public final void rule__UnOrderListItemLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1766:1: ( ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1767:1: ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1767:1: ( ( rule__UnOrderListItemLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1768:1: ( rule__UnOrderListItemLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1769:1: ( rule__UnOrderListItemLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1769:2: rule__UnOrderListItemLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__NameAssignment_1_in_rule__UnOrderListItemLevel1__Group__1__Impl3722);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1779:1: rule__UnOrderListItemLevel1__Group__2 : rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3 ;
    public final void rule__UnOrderListItemLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1783:1: ( rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1784:2: rule__UnOrderListItemLevel1__Group__2__Impl rule__UnOrderListItemLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__2__Impl_in_rule__UnOrderListItemLevel1__Group__23752);
            rule__UnOrderListItemLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__3_in_rule__UnOrderListItemLevel1__Group__23755);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1791:1: rule__UnOrderListItemLevel1__Group__2__Impl : ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) ) ;
    public final void rule__UnOrderListItemLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1795:1: ( ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1796:1: ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1796:1: ( ( rule__UnOrderListItemLevel1__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1797:1: ( rule__UnOrderListItemLevel1__ListAssignment_2 )
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1798:1: ( rule__UnOrderListItemLevel1__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1798:2: rule__UnOrderListItemLevel1__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__ListAssignment_2_in_rule__UnOrderListItemLevel1__Group__2__Impl3782);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1808:1: rule__UnOrderListItemLevel1__Group__3 : rule__UnOrderListItemLevel1__Group__3__Impl ;
    public final void rule__UnOrderListItemLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1812:1: ( rule__UnOrderListItemLevel1__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1813:2: rule__UnOrderListItemLevel1__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnOrderListItemLevel1__Group__3__Impl_in_rule__UnOrderListItemLevel1__Group__33812);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1819:1: rule__UnOrderListItemLevel1__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__UnOrderListItemLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1823:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1824:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1824:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1825:1: ':LIST'
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__UnOrderListItemLevel1__Group__3__Impl3840); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1846:1: rule__OrderListItemLevel1__Group__0 : rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1 ;
    public final void rule__OrderListItemLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1850:1: ( rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1851:2: rule__OrderListItemLevel1__Group__0__Impl rule__OrderListItemLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__0__Impl_in_rule__OrderListItemLevel1__Group__03879);
            rule__OrderListItemLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__1_in_rule__OrderListItemLevel1__Group__03882);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1858:1: rule__OrderListItemLevel1__Group__0__Impl : ( '#' ) ;
    public final void rule__OrderListItemLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1862:1: ( ( '#' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1863:1: ( '#' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1863:1: ( '#' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1864:1: '#'
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNumberSignKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__OrderListItemLevel1__Group__0__Impl3910); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1877:1: rule__OrderListItemLevel1__Group__1 : rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2 ;
    public final void rule__OrderListItemLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1881:1: ( rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1882:2: rule__OrderListItemLevel1__Group__1__Impl rule__OrderListItemLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__1__Impl_in_rule__OrderListItemLevel1__Group__13941);
            rule__OrderListItemLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__2_in_rule__OrderListItemLevel1__Group__13944);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1889:1: rule__OrderListItemLevel1__Group__1__Impl : ( ( rule__OrderListItemLevel1__NameAssignment_1 ) ) ;
    public final void rule__OrderListItemLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1893:1: ( ( ( rule__OrderListItemLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1894:1: ( ( rule__OrderListItemLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1894:1: ( ( rule__OrderListItemLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1895:1: ( rule__OrderListItemLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1896:1: ( rule__OrderListItemLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1896:2: rule__OrderListItemLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__NameAssignment_1_in_rule__OrderListItemLevel1__Group__1__Impl3971);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1906:1: rule__OrderListItemLevel1__Group__2 : rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3 ;
    public final void rule__OrderListItemLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1910:1: ( rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1911:2: rule__OrderListItemLevel1__Group__2__Impl rule__OrderListItemLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__2__Impl_in_rule__OrderListItemLevel1__Group__24001);
            rule__OrderListItemLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__3_in_rule__OrderListItemLevel1__Group__24004);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1918:1: rule__OrderListItemLevel1__Group__2__Impl : ( ( rule__OrderListItemLevel1__ListAssignment_2 ) ) ;
    public final void rule__OrderListItemLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1922:1: ( ( ( rule__OrderListItemLevel1__ListAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1923:1: ( ( rule__OrderListItemLevel1__ListAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1923:1: ( ( rule__OrderListItemLevel1__ListAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1924:1: ( rule__OrderListItemLevel1__ListAssignment_2 )
            {
             before(grammarAccess.getOrderListItemLevel1Access().getListAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1925:1: ( rule__OrderListItemLevel1__ListAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1925:2: rule__OrderListItemLevel1__ListAssignment_2
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__ListAssignment_2_in_rule__OrderListItemLevel1__Group__2__Impl4031);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1935:1: rule__OrderListItemLevel1__Group__3 : rule__OrderListItemLevel1__Group__3__Impl ;
    public final void rule__OrderListItemLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1939:1: ( rule__OrderListItemLevel1__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1940:2: rule__OrderListItemLevel1__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__OrderListItemLevel1__Group__3__Impl_in_rule__OrderListItemLevel1__Group__34061);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1946:1: rule__OrderListItemLevel1__Group__3__Impl : ( ':LIST' ) ;
    public final void rule__OrderListItemLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1950:1: ( ( ':LIST' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1951:1: ( ':LIST' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1951:1: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1952:1: ':LIST'
            {
             before(grammarAccess.getOrderListItemLevel1Access().getLISTKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__OrderListItemLevel1__Group__3__Impl4089); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1973:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1977:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1978:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04128);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04131);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1985:1: rule__Image__Group__0__Impl : ( '[[' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1989:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1990:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1990:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1991:1: '[['
            {
             before(grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Image__Group__0__Impl4159); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2004:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2008:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2009:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14190);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14193);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2016:1: rule__Image__Group__1__Impl : ( 'File:' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2020:1: ( ( 'File:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2021:1: ( 'File:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2021:1: ( 'File:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2022:1: 'File:'
            {
             before(grammarAccess.getImageAccess().getFileKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Image__Group__1__Impl4221); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2035:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2039:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2040:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24252);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24255);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2047:1: rule__Image__Group__2__Impl : ( ( rule__Image__NameAssignment_2 ) ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2051:1: ( ( ( rule__Image__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2052:1: ( ( rule__Image__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2052:1: ( ( rule__Image__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2053:1: ( rule__Image__NameAssignment_2 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2054:1: ( rule__Image__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2054:2: rule__Image__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4282);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2064:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2068:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2069:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34312);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34315);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2076:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2080:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2081:1: ( ( rule__Image__Group_3__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2081:1: ( ( rule__Image__Group_3__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2082:1: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2083:1: ( rule__Image__Group_3__0 )?
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2083:2: rule__Image__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4342);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2093:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2097:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2098:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44373);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44376);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2105:1: rule__Image__Group__4__Impl : ( ( rule__Image__Group_4__0 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2109:1: ( ( ( rule__Image__Group_4__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2110:1: ( ( rule__Image__Group_4__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2110:1: ( ( rule__Image__Group_4__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2111:1: ( rule__Image__Group_4__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2112:1: ( rule__Image__Group_4__0 )?
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2112:2: rule__Image__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4403);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2122:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2126:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2127:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54434);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54437);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2134:1: rule__Image__Group__5__Impl : ( ( rule__Image__Group_5__0 )? ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2138:1: ( ( ( rule__Image__Group_5__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2139:1: ( ( rule__Image__Group_5__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2139:1: ( ( rule__Image__Group_5__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2140:1: ( rule__Image__Group_5__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_5()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2141:1: ( rule__Image__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2141:2: rule__Image__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4464);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2151:1: rule__Image__Group__6 : rule__Image__Group__6__Impl rule__Image__Group__7 ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2155:1: ( rule__Image__Group__6__Impl rule__Image__Group__7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2156:2: rule__Image__Group__6__Impl rule__Image__Group__7
            {
            pushFollow(FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64495);
            rule__Image__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64498);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2163:1: rule__Image__Group__6__Impl : ( '|' ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2167:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2168:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2168:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2169:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group__6__Impl4526); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2182:1: rule__Image__Group__7 : rule__Image__Group__7__Impl rule__Image__Group__8 ;
    public final void rule__Image__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2186:1: ( rule__Image__Group__7__Impl rule__Image__Group__8 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2187:2: rule__Image__Group__7__Impl rule__Image__Group__8
            {
            pushFollow(FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__74557);
            rule__Image__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__8_in_rule__Image__Group__74560);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2194:1: rule__Image__Group__7__Impl : ( ( rule__Image__CaptionAssignment_7 ) ) ;
    public final void rule__Image__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2198:1: ( ( ( rule__Image__CaptionAssignment_7 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2199:1: ( ( rule__Image__CaptionAssignment_7 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2199:1: ( ( rule__Image__CaptionAssignment_7 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2200:1: ( rule__Image__CaptionAssignment_7 )
            {
             before(grammarAccess.getImageAccess().getCaptionAssignment_7()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2201:1: ( rule__Image__CaptionAssignment_7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2201:2: rule__Image__CaptionAssignment_7
            {
            pushFollow(FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl4587);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2211:1: rule__Image__Group__8 : rule__Image__Group__8__Impl ;
    public final void rule__Image__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2215:1: ( rule__Image__Group__8__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2216:2: rule__Image__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__84617);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2222:1: rule__Image__Group__8__Impl : ( ']]' ) ;
    public final void rule__Image__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2226:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2227:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2227:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2228:1: ']]'
            {
             before(grammarAccess.getImageAccess().getRightSquareBracketRightSquareBracketKeyword_8()); 
            match(input,32,FOLLOW_32_in_rule__Image__Group__8__Impl4645); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2259:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2263:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2264:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
            {
            pushFollow(FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__04694);
            rule__Image__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__04697);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2271:1: rule__Image__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2275:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2276:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2276:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2277:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group_3__0__Impl4725); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2290:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2294:1: ( rule__Image__Group_3__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2295:2: rule__Image__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__14756);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2301:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__TypeAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2305:1: ( ( ( rule__Image__TypeAssignment_3_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2306:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2306:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2307:1: ( rule__Image__TypeAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getTypeAssignment_3_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2308:1: ( rule__Image__TypeAssignment_3_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2308:2: rule__Image__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl4783);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2322:1: rule__Image__Group_4__0 : rule__Image__Group_4__0__Impl rule__Image__Group_4__1 ;
    public final void rule__Image__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2326:1: ( rule__Image__Group_4__0__Impl rule__Image__Group_4__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2327:2: rule__Image__Group_4__0__Impl rule__Image__Group_4__1
            {
            pushFollow(FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__04817);
            rule__Image__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__04820);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2334:1: rule__Image__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2338:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2339:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2339:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2340:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group_4__0__Impl4848); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2353:1: rule__Image__Group_4__1 : rule__Image__Group_4__1__Impl ;
    public final void rule__Image__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2357:1: ( rule__Image__Group_4__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2358:2: rule__Image__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__14879);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2364:1: rule__Image__Group_4__1__Impl : ( ( rule__Image__HAlignAssignment_4_1 ) ) ;
    public final void rule__Image__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2368:1: ( ( ( rule__Image__HAlignAssignment_4_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2369:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2369:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2370:1: ( rule__Image__HAlignAssignment_4_1 )
            {
             before(grammarAccess.getImageAccess().getHAlignAssignment_4_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2371:1: ( rule__Image__HAlignAssignment_4_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2371:2: rule__Image__HAlignAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl4906);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2385:1: rule__Image__Group_5__0 : rule__Image__Group_5__0__Impl rule__Image__Group_5__1 ;
    public final void rule__Image__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2389:1: ( rule__Image__Group_5__0__Impl rule__Image__Group_5__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2390:2: rule__Image__Group_5__0__Impl rule__Image__Group_5__1
            {
            pushFollow(FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__04940);
            rule__Image__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__04943);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2397:1: rule__Image__Group_5__0__Impl : ( '|alt=' ) ;
    public final void rule__Image__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2401:1: ( ( '|alt=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2402:1: ( '|alt=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2402:1: ( '|alt=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2403:1: '|alt='
            {
             before(grammarAccess.getImageAccess().getAltKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__Image__Group_5__0__Impl4971); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2416:1: rule__Image__Group_5__1 : rule__Image__Group_5__1__Impl ;
    public final void rule__Image__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2420:1: ( rule__Image__Group_5__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2421:2: rule__Image__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15002);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2427:1: rule__Image__Group_5__1__Impl : ( ( rule__Image__AltTextAssignment_5_1 ) ) ;
    public final void rule__Image__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2431:1: ( ( ( rule__Image__AltTextAssignment_5_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2432:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2432:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2433:1: ( rule__Image__AltTextAssignment_5_1 )
            {
             before(grammarAccess.getImageAccess().getAltTextAssignment_5_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2434:1: ( rule__Image__AltTextAssignment_5_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2434:2: rule__Image__AltTextAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5029);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2448:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2452:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2453:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05063);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05066);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2460:1: rule__Category__Group__0__Impl : ( '[[' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2464:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2465:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2465:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2466:1: '[['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Category__Group__0__Impl5094); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2479:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2483:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2484:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15125);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15128);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2491:1: rule__Category__Group__1__Impl : ( 'Category:' ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2495:1: ( ( 'Category:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2496:1: ( 'Category:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2496:1: ( 'Category:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2497:1: 'Category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Category__Group__1__Impl5156); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2510:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2514:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2515:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25187);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25190);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2522:1: rule__Category__Group__2__Impl : ( ( rule__Category__NameAssignment_2 ) ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2526:1: ( ( ( rule__Category__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2527:1: ( ( rule__Category__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2527:1: ( ( rule__Category__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2528:1: ( rule__Category__NameAssignment_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2529:1: ( rule__Category__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2529:2: rule__Category__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5217);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2539:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2543:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2544:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35247);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35250);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2551:1: rule__Category__Group__3__Impl : ( ( rule__Category__ValueAssignment_3 )? ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2555:1: ( ( ( rule__Category__ValueAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2556:1: ( ( rule__Category__ValueAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2556:1: ( ( rule__Category__ValueAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2557:1: ( rule__Category__ValueAssignment_3 )?
            {
             before(grammarAccess.getCategoryAccess().getValueAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2558:1: ( rule__Category__ValueAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2558:2: rule__Category__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5277);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2568:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2572:1: ( rule__Category__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2573:2: rule__Category__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45308);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2579:1: rule__Category__Group__4__Impl : ( ']]' ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2583:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2584:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2584:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2585:1: ']]'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Category__Group__4__Impl5336); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2608:1: rule__Heading1__Group__0 : rule__Heading1__Group__0__Impl rule__Heading1__Group__1 ;
    public final void rule__Heading1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2612:1: ( rule__Heading1__Group__0__Impl rule__Heading1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2613:2: rule__Heading1__Group__0__Impl rule__Heading1__Group__1
            {
            pushFollow(FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__05377);
            rule__Heading1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__05380);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2620:1: rule__Heading1__Group__0__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2624:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2625:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2625:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2626:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Heading1__Group__0__Impl5408); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2639:1: rule__Heading1__Group__1 : rule__Heading1__Group__1__Impl rule__Heading1__Group__2 ;
    public final void rule__Heading1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2643:1: ( rule__Heading1__Group__1__Impl rule__Heading1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2644:2: rule__Heading1__Group__1__Impl rule__Heading1__Group__2
            {
            pushFollow(FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__15439);
            rule__Heading1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__15442);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2651:1: rule__Heading1__Group__1__Impl : ( ( rule__Heading1__HeadingValue1Assignment_1 ) ) ;
    public final void rule__Heading1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2655:1: ( ( ( rule__Heading1__HeadingValue1Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2656:1: ( ( rule__Heading1__HeadingValue1Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2656:1: ( ( rule__Heading1__HeadingValue1Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2657:1: ( rule__Heading1__HeadingValue1Assignment_1 )
            {
             before(grammarAccess.getHeading1Access().getHeadingValue1Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2658:1: ( rule__Heading1__HeadingValue1Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2658:2: rule__Heading1__HeadingValue1Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading1__HeadingValue1Assignment_1_in_rule__Heading1__Group__1__Impl5469);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2668:1: rule__Heading1__Group__2 : rule__Heading1__Group__2__Impl ;
    public final void rule__Heading1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2672:1: ( rule__Heading1__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2673:2: rule__Heading1__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__25499);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2679:1: rule__Heading1__Group__2__Impl : ( '=' ) ;
    public final void rule__Heading1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2683:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2684:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2684:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2685:1: '='
            {
             before(grammarAccess.getHeading1Access().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Heading1__Group__2__Impl5527); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2704:1: rule__Heading2__Group__0 : rule__Heading2__Group__0__Impl rule__Heading2__Group__1 ;
    public final void rule__Heading2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2708:1: ( rule__Heading2__Group__0__Impl rule__Heading2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2709:2: rule__Heading2__Group__0__Impl rule__Heading2__Group__1
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05564);
            rule__Heading2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05567);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2716:1: rule__Heading2__Group__0__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2720:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2721:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2721:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2722:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Heading2__Group__0__Impl5595); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2735:1: rule__Heading2__Group__1 : rule__Heading2__Group__1__Impl rule__Heading2__Group__2 ;
    public final void rule__Heading2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2739:1: ( rule__Heading2__Group__1__Impl rule__Heading2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2740:2: rule__Heading2__Group__1__Impl rule__Heading2__Group__2
            {
            pushFollow(FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15626);
            rule__Heading2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15629);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:1: rule__Heading2__Group__1__Impl : ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) ;
    public final void rule__Heading2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2751:1: ( ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2752:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2752:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2754:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2754:2: rule__Heading2__HeadingValue2Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5656);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2764:1: rule__Heading2__Group__2 : rule__Heading2__Group__2__Impl ;
    public final void rule__Heading2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2768:1: ( rule__Heading2__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2769:2: rule__Heading2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25686);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2775:1: rule__Heading2__Group__2__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2779:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2780:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2780:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2781:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__Heading2__Group__2__Impl5714); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2800:1: rule__Heading3__Group__0 : rule__Heading3__Group__0__Impl rule__Heading3__Group__1 ;
    public final void rule__Heading3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2804:1: ( rule__Heading3__Group__0__Impl rule__Heading3__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2805:2: rule__Heading3__Group__0__Impl rule__Heading3__Group__1
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__05751);
            rule__Heading3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__05754);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2812:1: rule__Heading3__Group__0__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2816:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2817:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2817:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2818:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Heading3__Group__0__Impl5782); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2831:1: rule__Heading3__Group__1 : rule__Heading3__Group__1__Impl rule__Heading3__Group__2 ;
    public final void rule__Heading3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2835:1: ( rule__Heading3__Group__1__Impl rule__Heading3__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2836:2: rule__Heading3__Group__1__Impl rule__Heading3__Group__2
            {
            pushFollow(FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__15813);
            rule__Heading3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__15816);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2843:1: rule__Heading3__Group__1__Impl : ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) ;
    public final void rule__Heading3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2847:1: ( ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2848:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2848:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2849:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2850:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2850:2: rule__Heading3__HeadingValue3Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl5843);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2860:1: rule__Heading3__Group__2 : rule__Heading3__Group__2__Impl ;
    public final void rule__Heading3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2864:1: ( rule__Heading3__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2865:2: rule__Heading3__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__25873);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2871:1: rule__Heading3__Group__2__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2875:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2876:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2876:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2877:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Heading3__Group__2__Impl5901); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2896:1: rule__Heading4__Group__0 : rule__Heading4__Group__0__Impl rule__Heading4__Group__1 ;
    public final void rule__Heading4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2900:1: ( rule__Heading4__Group__0__Impl rule__Heading4__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2901:2: rule__Heading4__Group__0__Impl rule__Heading4__Group__1
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__05938);
            rule__Heading4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__05941);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2908:1: rule__Heading4__Group__0__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2912:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2913:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2913:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2914:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Heading4__Group__0__Impl5969); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2927:1: rule__Heading4__Group__1 : rule__Heading4__Group__1__Impl rule__Heading4__Group__2 ;
    public final void rule__Heading4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2931:1: ( rule__Heading4__Group__1__Impl rule__Heading4__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2932:2: rule__Heading4__Group__1__Impl rule__Heading4__Group__2
            {
            pushFollow(FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16000);
            rule__Heading4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16003);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2939:1: rule__Heading4__Group__1__Impl : ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) ;
    public final void rule__Heading4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2943:1: ( ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2944:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2944:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2945:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2946:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2946:2: rule__Heading4__HeadingValue4Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6030);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2956:1: rule__Heading4__Group__2 : rule__Heading4__Group__2__Impl ;
    public final void rule__Heading4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2960:1: ( rule__Heading4__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2961:2: rule__Heading4__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26060);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2967:1: rule__Heading4__Group__2__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2971:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2972:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2972:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2973:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Heading4__Group__2__Impl6088); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2992:1: rule__Heading5__Group__0 : rule__Heading5__Group__0__Impl rule__Heading5__Group__1 ;
    public final void rule__Heading5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2996:1: ( rule__Heading5__Group__0__Impl rule__Heading5__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2997:2: rule__Heading5__Group__0__Impl rule__Heading5__Group__1
            {
            pushFollow(FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06125);
            rule__Heading5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06128);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3004:1: rule__Heading5__Group__0__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3008:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3009:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3009:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3010:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Heading5__Group__0__Impl6156); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3023:1: rule__Heading5__Group__1 : rule__Heading5__Group__1__Impl rule__Heading5__Group__2 ;
    public final void rule__Heading5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3027:1: ( rule__Heading5__Group__1__Impl rule__Heading5__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3028:2: rule__Heading5__Group__1__Impl rule__Heading5__Group__2
            {
            pushFollow(FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16187);
            rule__Heading5__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16190);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3035:1: rule__Heading5__Group__1__Impl : ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) ;
    public final void rule__Heading5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3039:1: ( ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3040:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3040:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3041:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3042:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3042:2: rule__Heading5__HeadingValue5Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6217);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3052:1: rule__Heading5__Group__2 : rule__Heading5__Group__2__Impl ;
    public final void rule__Heading5__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3056:1: ( rule__Heading5__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3057:2: rule__Heading5__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26247);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3063:1: rule__Heading5__Group__2__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3067:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3068:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3068:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3069:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Heading5__Group__2__Impl6275); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3088:1: rule__Bold__Group__0 : rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
    public final void rule__Bold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3092:1: ( rule__Bold__Group__0__Impl rule__Bold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3093:2: rule__Bold__Group__0__Impl rule__Bold__Group__1
            {
            pushFollow(FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06312);
            rule__Bold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06315);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3100:1: rule__Bold__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3104:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3105:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3105:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3106:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Bold__Group__0__Impl6343); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3119:1: rule__Bold__Group__1 : rule__Bold__Group__1__Impl rule__Bold__Group__2 ;
    public final void rule__Bold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3123:1: ( rule__Bold__Group__1__Impl rule__Bold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3124:2: rule__Bold__Group__1__Impl rule__Bold__Group__2
            {
            pushFollow(FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16374);
            rule__Bold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16377);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3131:1: rule__Bold__Group__1__Impl : ( ( rule__Bold__NameAssignment_1 ) ) ;
    public final void rule__Bold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3135:1: ( ( ( rule__Bold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3136:1: ( ( rule__Bold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3136:1: ( ( rule__Bold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3137:1: ( rule__Bold__NameAssignment_1 )
            {
             before(grammarAccess.getBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3138:1: ( rule__Bold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3138:2: rule__Bold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6404);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3148:1: rule__Bold__Group__2 : rule__Bold__Group__2__Impl ;
    public final void rule__Bold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3152:1: ( rule__Bold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3153:2: rule__Bold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26434);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3159:1: rule__Bold__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3163:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3164:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3164:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3165:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,40,FOLLOW_40_in_rule__Bold__Group__2__Impl6462); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3184:1: rule__Italic__Group__0 : rule__Italic__Group__0__Impl rule__Italic__Group__1 ;
    public final void rule__Italic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3188:1: ( rule__Italic__Group__0__Impl rule__Italic__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3189:2: rule__Italic__Group__0__Impl rule__Italic__Group__1
            {
            pushFollow(FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06499);
            rule__Italic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06502);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3196:1: rule__Italic__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3200:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3201:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3201:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3202:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Italic__Group__0__Impl6530); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3215:1: rule__Italic__Group__1 : rule__Italic__Group__1__Impl rule__Italic__Group__2 ;
    public final void rule__Italic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3219:1: ( rule__Italic__Group__1__Impl rule__Italic__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3220:2: rule__Italic__Group__1__Impl rule__Italic__Group__2
            {
            pushFollow(FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16561);
            rule__Italic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16564);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3227:1: rule__Italic__Group__1__Impl : ( ( rule__Italic__NameAssignment_1 ) ) ;
    public final void rule__Italic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3231:1: ( ( ( rule__Italic__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3232:1: ( ( rule__Italic__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3232:1: ( ( rule__Italic__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3233:1: ( rule__Italic__NameAssignment_1 )
            {
             before(grammarAccess.getItalicAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3234:1: ( rule__Italic__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3234:2: rule__Italic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6591);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3244:1: rule__Italic__Group__2 : rule__Italic__Group__2__Impl ;
    public final void rule__Italic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3248:1: ( rule__Italic__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3249:2: rule__Italic__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26621);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3255:1: rule__Italic__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3259:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3260:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3260:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3261:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__Italic__Group__2__Impl6649); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3280:1: rule__ItalicBold__Group__0 : rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 ;
    public final void rule__ItalicBold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3284:1: ( rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3285:2: rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06686);
            rule__ItalicBold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06689);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3292:1: rule__ItalicBold__Group__0__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3296:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3297:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3297:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3298:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__ItalicBold__Group__0__Impl6717); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3311:1: rule__ItalicBold__Group__1 : rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 ;
    public final void rule__ItalicBold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3315:1: ( rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3316:2: rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__16748);
            rule__ItalicBold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__16751);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3323:1: rule__ItalicBold__Group__1__Impl : ( ( rule__ItalicBold__NameAssignment_1 ) ) ;
    public final void rule__ItalicBold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3327:1: ( ( ( rule__ItalicBold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3328:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3328:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3329:1: ( rule__ItalicBold__NameAssignment_1 )
            {
             before(grammarAccess.getItalicBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3330:1: ( rule__ItalicBold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3330:2: rule__ItalicBold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl6778);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3340:1: rule__ItalicBold__Group__2 : rule__ItalicBold__Group__2__Impl ;
    public final void rule__ItalicBold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3344:1: ( rule__ItalicBold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3345:2: rule__ItalicBold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__26808);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3351:1: rule__ItalicBold__Group__2__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3355:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3356:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3356:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3357:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__ItalicBold__Group__2__Impl6836); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3376:1: rule__Internal__Group__0 : rule__Internal__Group__0__Impl rule__Internal__Group__1 ;
    public final void rule__Internal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3380:1: ( rule__Internal__Group__0__Impl rule__Internal__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3381:2: rule__Internal__Group__0__Impl rule__Internal__Group__1
            {
            pushFollow(FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__06873);
            rule__Internal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__06876);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3388:1: rule__Internal__Group__0__Impl : ( '[[' ) ;
    public final void rule__Internal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3392:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3393:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3393:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3394:1: '[['
            {
             before(grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Internal__Group__0__Impl6904); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3407:1: rule__Internal__Group__1 : rule__Internal__Group__1__Impl rule__Internal__Group__2 ;
    public final void rule__Internal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3411:1: ( rule__Internal__Group__1__Impl rule__Internal__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3412:2: rule__Internal__Group__1__Impl rule__Internal__Group__2
            {
            pushFollow(FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__16935);
            rule__Internal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__16938);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3419:1: rule__Internal__Group__1__Impl : ( ( rule__Internal__NameAssignment_1 ) ) ;
    public final void rule__Internal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3423:1: ( ( ( rule__Internal__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3424:1: ( ( rule__Internal__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3424:1: ( ( rule__Internal__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3425:1: ( rule__Internal__NameAssignment_1 )
            {
             before(grammarAccess.getInternalAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3426:1: ( rule__Internal__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3426:2: rule__Internal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Internal__NameAssignment_1_in_rule__Internal__Group__1__Impl6965);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3436:1: rule__Internal__Group__2 : rule__Internal__Group__2__Impl ;
    public final void rule__Internal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3440:1: ( rule__Internal__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3441:2: rule__Internal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__26995);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3447:1: rule__Internal__Group__2__Impl : ( ']]' ) ;
    public final void rule__Internal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3451:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3452:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3452:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3453:1: ']]'
            {
             before(grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Internal__Group__2__Impl7023); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3472:1: rule__InternalAlt__Group__0 : rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1 ;
    public final void rule__InternalAlt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3476:1: ( rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3477:2: rule__InternalAlt__Group__0__Impl rule__InternalAlt__Group__1
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__0__Impl_in_rule__InternalAlt__Group__07060);
            rule__InternalAlt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__1_in_rule__InternalAlt__Group__07063);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3484:1: rule__InternalAlt__Group__0__Impl : ( '[[' ) ;
    public final void rule__InternalAlt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3488:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3489:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3489:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3490:1: '[['
            {
             before(grammarAccess.getInternalAltAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__InternalAlt__Group__0__Impl7091); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3503:1: rule__InternalAlt__Group__1 : rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2 ;
    public final void rule__InternalAlt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3507:1: ( rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3508:2: rule__InternalAlt__Group__1__Impl rule__InternalAlt__Group__2
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__1__Impl_in_rule__InternalAlt__Group__17122);
            rule__InternalAlt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__2_in_rule__InternalAlt__Group__17125);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3515:1: rule__InternalAlt__Group__1__Impl : ( ( rule__InternalAlt__NameAssignment_1 ) ) ;
    public final void rule__InternalAlt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3519:1: ( ( ( rule__InternalAlt__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3520:1: ( ( rule__InternalAlt__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3520:1: ( ( rule__InternalAlt__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3521:1: ( rule__InternalAlt__NameAssignment_1 )
            {
             before(grammarAccess.getInternalAltAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3522:1: ( rule__InternalAlt__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3522:2: rule__InternalAlt__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalAlt__NameAssignment_1_in_rule__InternalAlt__Group__1__Impl7152);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3532:1: rule__InternalAlt__Group__2 : rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3 ;
    public final void rule__InternalAlt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3536:1: ( rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3537:2: rule__InternalAlt__Group__2__Impl rule__InternalAlt__Group__3
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__2__Impl_in_rule__InternalAlt__Group__27182);
            rule__InternalAlt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__3_in_rule__InternalAlt__Group__27185);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3544:1: rule__InternalAlt__Group__2__Impl : ( '|' ) ;
    public final void rule__InternalAlt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3548:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3549:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3549:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3550:1: '|'
            {
             before(grammarAccess.getInternalAltAccess().getVerticalLineKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__InternalAlt__Group__2__Impl7213); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3563:1: rule__InternalAlt__Group__3 : rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4 ;
    public final void rule__InternalAlt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3567:1: ( rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3568:2: rule__InternalAlt__Group__3__Impl rule__InternalAlt__Group__4
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__3__Impl_in_rule__InternalAlt__Group__37244);
            rule__InternalAlt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalAlt__Group__4_in_rule__InternalAlt__Group__37247);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3575:1: rule__InternalAlt__Group__3__Impl : ( ( rule__InternalAlt__AltTextAssignment_3 ) ) ;
    public final void rule__InternalAlt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3579:1: ( ( ( rule__InternalAlt__AltTextAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3580:1: ( ( rule__InternalAlt__AltTextAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3580:1: ( ( rule__InternalAlt__AltTextAssignment_3 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3581:1: ( rule__InternalAlt__AltTextAssignment_3 )
            {
             before(grammarAccess.getInternalAltAccess().getAltTextAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3582:1: ( rule__InternalAlt__AltTextAssignment_3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3582:2: rule__InternalAlt__AltTextAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalAlt__AltTextAssignment_3_in_rule__InternalAlt__Group__3__Impl7274);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3592:1: rule__InternalAlt__Group__4 : rule__InternalAlt__Group__4__Impl ;
    public final void rule__InternalAlt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3596:1: ( rule__InternalAlt__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3597:2: rule__InternalAlt__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InternalAlt__Group__4__Impl_in_rule__InternalAlt__Group__47304);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3603:1: rule__InternalAlt__Group__4__Impl : ( ']]' ) ;
    public final void rule__InternalAlt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3607:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3608:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3608:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3609:1: ']]'
            {
             before(grammarAccess.getInternalAltAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__InternalAlt__Group__4__Impl7332); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3632:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3636:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3637:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07373);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__1_in_rule__External__Group__07376);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3644:1: rule__External__Group__0__Impl : ( '[' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3648:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3649:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3649:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3650:1: '['
            {
             before(grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__External__Group__0__Impl7404); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3663:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3667:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3668:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17435);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__2_in_rule__External__Group__17438);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3675:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3679:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3680:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3680:1: ( ( rule__External__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3681:1: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3682:1: ( rule__External__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3682:2: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7465);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3692:1: rule__External__Group__2 : rule__External__Group__2__Impl ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3696:1: ( rule__External__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3697:2: rule__External__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27495);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3703:1: rule__External__Group__2__Impl : ( ']' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3707:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3708:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3708:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3709:1: ']'
            {
             before(grammarAccess.getExternalAccess().getRightSquareBracketKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__External__Group__2__Impl7523); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3728:1: rule__ExternalAlt__Group__0 : rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1 ;
    public final void rule__ExternalAlt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3732:1: ( rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3733:2: rule__ExternalAlt__Group__0__Impl rule__ExternalAlt__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__0__Impl_in_rule__ExternalAlt__Group__07560);
            rule__ExternalAlt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__1_in_rule__ExternalAlt__Group__07563);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3740:1: rule__ExternalAlt__Group__0__Impl : ( '[' ) ;
    public final void rule__ExternalAlt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3744:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3745:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3745:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3746:1: '['
            {
             before(grammarAccess.getExternalAltAccess().getLeftSquareBracketKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__ExternalAlt__Group__0__Impl7591); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3759:1: rule__ExternalAlt__Group__1 : rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2 ;
    public final void rule__ExternalAlt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3763:1: ( rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3764:2: rule__ExternalAlt__Group__1__Impl rule__ExternalAlt__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__1__Impl_in_rule__ExternalAlt__Group__17622);
            rule__ExternalAlt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__2_in_rule__ExternalAlt__Group__17625);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3771:1: rule__ExternalAlt__Group__1__Impl : ( ( rule__ExternalAlt__NameAssignment_1 ) ) ;
    public final void rule__ExternalAlt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3775:1: ( ( ( rule__ExternalAlt__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3776:1: ( ( rule__ExternalAlt__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3776:1: ( ( rule__ExternalAlt__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3777:1: ( rule__ExternalAlt__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAltAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3778:1: ( rule__ExternalAlt__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3778:2: rule__ExternalAlt__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalAlt__NameAssignment_1_in_rule__ExternalAlt__Group__1__Impl7652);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3788:1: rule__ExternalAlt__Group__2 : rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3 ;
    public final void rule__ExternalAlt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3792:1: ( rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3793:2: rule__ExternalAlt__Group__2__Impl rule__ExternalAlt__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__2__Impl_in_rule__ExternalAlt__Group__27682);
            rule__ExternalAlt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalAlt__Group__3_in_rule__ExternalAlt__Group__27685);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3800:1: rule__ExternalAlt__Group__2__Impl : ( ( rule__ExternalAlt__AltTextAssignment_2 ) ) ;
    public final void rule__ExternalAlt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3804:1: ( ( ( rule__ExternalAlt__AltTextAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3805:1: ( ( rule__ExternalAlt__AltTextAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3805:1: ( ( rule__ExternalAlt__AltTextAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3806:1: ( rule__ExternalAlt__AltTextAssignment_2 )
            {
             before(grammarAccess.getExternalAltAccess().getAltTextAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3807:1: ( rule__ExternalAlt__AltTextAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3807:2: rule__ExternalAlt__AltTextAssignment_2
            {
            pushFollow(FOLLOW_rule__ExternalAlt__AltTextAssignment_2_in_rule__ExternalAlt__Group__2__Impl7712);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3817:1: rule__ExternalAlt__Group__3 : rule__ExternalAlt__Group__3__Impl ;
    public final void rule__ExternalAlt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3821:1: ( rule__ExternalAlt__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3822:2: rule__ExternalAlt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ExternalAlt__Group__3__Impl_in_rule__ExternalAlt__Group__37742);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3828:1: rule__ExternalAlt__Group__3__Impl : ( ']' ) ;
    public final void rule__ExternalAlt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3832:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3833:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3833:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3834:1: ']'
            {
             before(grammarAccess.getExternalAltAccess().getRightSquareBracketKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__ExternalAlt__Group__3__Impl7770); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3855:1: rule__AnyTextSequence__Group__0 : rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 ;
    public final void rule__AnyTextSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3859:1: ( rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3860:2: rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__07809);
            rule__AnyTextSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__07812);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3867:1: rule__AnyTextSequence__Group__0__Impl : ( () ) ;
    public final void rule__AnyTextSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3871:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3872:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3872:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3873:1: ()
            {
             before(grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3874:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3876:1: 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3886:1: rule__AnyTextSequence__Group__1 : rule__AnyTextSequence__Group__1__Impl ;
    public final void rule__AnyTextSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3890:1: ( rule__AnyTextSequence__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3891:2: rule__AnyTextSequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__17870);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3897:1: rule__AnyTextSequence__Group__1__Impl : ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) ;
    public final void rule__AnyTextSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3901:1: ( ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3902:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3902:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3903:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3904:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==30||(LA16_0>=40 && LA16_0<=43)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3904:2: rule__AnyTextSequence__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl7897);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3918:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3922:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3923:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07932);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07935);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3930:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3934:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3935:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3935:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3936:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl7962); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3947:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3951:1: ( rule__Name__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3952:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17991);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3958:1: rule__Name__Group__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3962:1: ( ( ( RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3963:1: ( ( RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3963:1: ( ( RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3964:1: ( RULE_ID )*
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3965:1: ( RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3965:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8019); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3980:1: rule__WikiPage__NameAssignment_0 : ( ruleHeading1 ) ;
    public final void rule__WikiPage__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3984:1: ( ( ruleHeading1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3985:1: ( ruleHeading1 )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3985:1: ( ruleHeading1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3986:1: ruleHeading1
            {
             before(grammarAccess.getWikiPageAccess().getNameHeading1ParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeading1_in_rule__WikiPage__NameAssignment_08059);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3995:1: rule__WikiPage__ElementsAssignment_1 : ( ruleParagraphTypes ) ;
    public final void rule__WikiPage__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3999:1: ( ( ruleParagraphTypes ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4000:1: ( ruleParagraphTypes )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4000:1: ( ruleParagraphTypes )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4001:1: ruleParagraphTypes
            {
             before(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_18090);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4010:1: rule__BlockQuote__ContentAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__BlockQuote__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4014:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4015:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4015:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4016:1: ruleAnyTextSequence
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28121);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4025:1: rule__Template__ContentAssignment_1 : ( ruleText ) ;
    public final void rule__Template__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4029:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4030:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4030:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4031:1: ruleText
            {
             before(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Template__ContentAssignment_18152);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4040:1: rule__Template__ContentAssignment_2_1 : ( ruleText ) ;
    public final void rule__Template__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4044:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4045:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4045:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4046:1: ruleText
            {
             before(grammarAccess.getTemplateAccess().getContentTextParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Template__ContentAssignment_2_18183);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4055:1: rule__UnOrderListItemLevel2__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__UnOrderListItemLevel2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4059:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4060:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4060:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4061:1: ruleAnyText
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel2__NameAssignment_18214);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4070:1: rule__UnOrderListItemLevel2__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__UnOrderListItemLevel2__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4074:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4075:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4075:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4076:1: ruleAnyTextSequence
            {
             before(grammarAccess.getUnOrderListItemLevel2Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel2__ListAssignment_28245);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4085:1: rule__UnOrderListItemLevel1__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__UnOrderListItemLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4089:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4090:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4090:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4091:1: ruleAnyText
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel1__NameAssignment_18276);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4100:1: rule__UnOrderListItemLevel1__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__UnOrderListItemLevel1__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4104:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4105:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4105:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4106:1: ruleAnyTextSequence
            {
             before(grammarAccess.getUnOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel1__ListAssignment_28307);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4115:1: rule__OrderListItemLevel1__NameAssignment_1 : ( ruleAnyText ) ;
    public final void rule__OrderListItemLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4119:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4120:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4120:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4121:1: ruleAnyText
            {
             before(grammarAccess.getOrderListItemLevel1Access().getNameAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__OrderListItemLevel1__NameAssignment_18338);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4130:1: rule__OrderListItemLevel1__ListAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__OrderListItemLevel1__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4134:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4135:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4135:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4136:1: ruleAnyTextSequence
            {
             before(grammarAccess.getOrderListItemLevel1Access().getListAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__OrderListItemLevel1__ListAssignment_28369);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4145:1: rule__Image__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Image__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4149:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4150:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4150:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4151:1: ruleText
            {
             before(grammarAccess.getImageAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Image__NameAssignment_28400);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4160:1: rule__Image__TypeAssignment_3_1 : ( ruleViewType ) ;
    public final void rule__Image__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4164:1: ( ( ruleViewType ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4165:1: ( ruleViewType )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4165:1: ( ruleViewType )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4166:1: ruleViewType
            {
             before(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18431);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4175:1: rule__Image__HAlignAssignment_4_1 : ( ruleHorizontalAlign ) ;
    public final void rule__Image__HAlignAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4179:1: ( ( ruleHorizontalAlign ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4180:1: ( ruleHorizontalAlign )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4180:1: ( ruleHorizontalAlign )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4181:1: ruleHorizontalAlign
            {
             before(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18462);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4190:1: rule__Image__AltTextAssignment_5_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Image__AltTextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4194:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4195:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4195:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4196:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18493);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4205:1: rule__Image__CaptionAssignment_7 : ( ruleAnyTextSequence ) ;
    public final void rule__Image__CaptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4209:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4210:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4210:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4211:1: ruleAnyTextSequence
            {
             before(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78524);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4220:1: rule__Category__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Category__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4224:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4225:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4225:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4226:1: ruleText
            {
             before(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Category__NameAssignment_28555);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4235:1: rule__Category__ValueAssignment_3 : ( ( '|*?' ) ) ;
    public final void rule__Category__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4239:1: ( ( ( '|*?' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4240:1: ( ( '|*?' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4240:1: ( ( '|*?' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4241:1: ( '|*?' )
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4242:1: ( '|*?' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4243:1: '|*?'
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Category__ValueAssignment_38591); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4258:1: rule__Heading1__HeadingValue1Assignment_1 : ( ruleText ) ;
    public final void rule__Heading1__HeadingValue1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4262:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4263:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4263:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4264:1: ruleText
            {
             before(grammarAccess.getHeading1Access().getHeadingValue1TextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Heading1__HeadingValue1Assignment_18630);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4273:1: rule__Heading2__HeadingValue2Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading2__HeadingValue2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4277:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4278:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4278:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4279:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18661);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4288:1: rule__Heading3__HeadingValue3Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading3__HeadingValue3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4292:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4293:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4293:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4294:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_18692);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4303:1: rule__Heading4__HeadingValue4Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading4__HeadingValue4Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4307:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4308:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4308:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4309:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_18723);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4318:1: rule__Heading5__HeadingValue5Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading5__HeadingValue5Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4322:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4323:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4323:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4324:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_18754);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4333:1: rule__Bold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Bold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4337:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4338:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4338:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4339:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_18785);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4348:1: rule__Italic__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Italic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4352:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4353:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4353:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4354:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_18816);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4363:1: rule__ItalicBold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__ItalicBold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4367:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4368:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4368:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4369:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_18847);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4378:1: rule__Text__NameAssignment : ( ruleName ) ;
    public final void rule__Text__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4382:1: ( ( ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4383:1: ( ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4383:1: ( ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4384:1: ruleName
            {
             before(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Text__NameAssignment8878);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4393:1: rule__Internal__NameAssignment_1 : ( ruleText ) ;
    public final void rule__Internal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4397:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4398:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4398:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4399:1: ruleText
            {
             before(grammarAccess.getInternalAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Internal__NameAssignment_18909);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4408:1: rule__InternalAlt__NameAssignment_1 : ( ruleText ) ;
    public final void rule__InternalAlt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4412:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4413:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4413:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4414:1: ruleText
            {
             before(grammarAccess.getInternalAltAccess().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__InternalAlt__NameAssignment_18940);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4423:1: rule__InternalAlt__AltTextAssignment_3 : ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) ) ;
    public final void rule__InternalAlt__AltTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4427:1: ( ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4428:1: ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4428:1: ( ( rule__InternalAlt__AltTextAlternatives_3_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4429:1: ( rule__InternalAlt__AltTextAlternatives_3_0 )
            {
             before(grammarAccess.getInternalAltAccess().getAltTextAlternatives_3_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4430:1: ( rule__InternalAlt__AltTextAlternatives_3_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4430:2: rule__InternalAlt__AltTextAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__InternalAlt__AltTextAlternatives_3_0_in_rule__InternalAlt__AltTextAssignment_38971);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4439:1: rule__External__NameAssignment_1 : ( RULE_URL ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4443:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4444:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4444:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4445:1: RULE_URL
            {
             before(grammarAccess.getExternalAccess().getNameURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__External__NameAssignment_19004); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4454:1: rule__ExternalAlt__NameAssignment_1 : ( RULE_URL ) ;
    public final void rule__ExternalAlt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4458:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4459:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4459:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4460:1: RULE_URL
            {
             before(grammarAccess.getExternalAltAccess().getNameURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__ExternalAlt__NameAssignment_19035); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4469:1: rule__ExternalAlt__AltTextAssignment_2 : ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) ) ;
    public final void rule__ExternalAlt__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4473:1: ( ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4474:1: ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4474:1: ( ( rule__ExternalAlt__AltTextAlternatives_2_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4475:1: ( rule__ExternalAlt__AltTextAlternatives_2_0 )
            {
             before(grammarAccess.getExternalAltAccess().getAltTextAlternatives_2_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4476:1: ( rule__ExternalAlt__AltTextAlternatives_2_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4476:2: rule__ExternalAlt__AltTextAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ExternalAlt__AltTextAlternatives_2_0_in_rule__ExternalAlt__AltTextAssignment_29066);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4485:1: rule__AnyTextSequence__ContentAssignment_1 : ( ruleAnyText ) ;
    public final void rule__AnyTextSequence__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4489:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4490:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4490:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4491:1: ruleAnyText
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19099);
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\4\3\uffff\1\4\12\uffff";
    static final String DFA1_maxS =
        "\1\53\3\uffff\1\42\12\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\5\1\4";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\20\uffff\1\7\1\uffff\1\5\2\uffff\1\3\1\uffff\1\2\1\1\1"+
            "\4\4\uffff\1\10\1\11\1\12\1\13\1\14\4\6",
            "",
            "",
            "",
            "\1\6\32\uffff\1\16\2\uffff\1\15",
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
            return "882:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel1 ) | ( ruleUnOrderListItemLevel2 ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading1 ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) );";
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
        "\6\uffff\1\1\1\2\1\4\1\3";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\14\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\24\uffff\1\7\6\uffff\1\6",
            "\1\10\31\uffff\1\10\11\uffff\4\10\1\11",
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
            return "1020:1: rule__HyperLink__Alternatives : ( ( ruleInternal ) | ( ruleInternalAlt ) | ( ruleExternal ) | ( ruleExternalAlt ) );";
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
    public static final BitSet FOLLOW_rule__AnyText__Alternatives_in_ruleAnyText1654 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleAnyText_in_rule__ParagraphTypes__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_rule__ParagraphTypes__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalAlt_in_rule__HyperLink__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalAlt_in_rule__HyperLink__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__InternalAlt__AltTextAlternatives_3_02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__ExternalAlt__AltTextAlternatives_2_02322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ViewType__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ViewType__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ViewType__Alternatives2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ViewType__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ViewType__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__HorizontalAlign__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__HorizontalAlign__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__HorizontalAlign__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__HorizontalAlign__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02620 = new BitSet(new long[]{0x00000FF874A00010L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__NameAssignment_0_in_rule__WikiPage__Group__0__Impl2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__ElementsAssignment_1_in_rule__WikiPage__Group__1__Impl2707 = new BitSet(new long[]{0x00000FF874A00012L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02742 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12803 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BlockQuote__Group__1__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22865 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__32925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BlockQuote__Group__3__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Template__Group__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__13054 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__ContentAssignment_1_in_rule__Template__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__23114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__23117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3146 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0_in_rule__Template__Group__2__Impl3158 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__33191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Template__Group__3__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__0__Impl_in_rule__Template__Group_2__03258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Template__Group_2__1_in_rule__Template__Group_2__03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Template__Group_2__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group_2__1__Impl_in_rule__Template__Group_2__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__ContentAssignment_2_1_in_rule__Template__Group_2__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__0__Impl_in_rule__UnOrderListItemLevel2__Group__03381 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__1_in_rule__UnOrderListItemLevel2__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UnOrderListItemLevel2__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__1__Impl_in_rule__UnOrderListItemLevel2__Group__13443 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__2_in_rule__UnOrderListItemLevel2__Group__13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__NameAssignment_1_in_rule__UnOrderListItemLevel2__Group__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__2__Impl_in_rule__UnOrderListItemLevel2__Group__23503 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__3_in_rule__UnOrderListItemLevel2__Group__23506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__ListAssignment_2_in_rule__UnOrderListItemLevel2__Group__2__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel2__Group__3__Impl_in_rule__UnOrderListItemLevel2__Group__33563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UnOrderListItemLevel2__Group__3__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__0__Impl_in_rule__UnOrderListItemLevel1__Group__03630 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__1_in_rule__UnOrderListItemLevel1__Group__03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UnOrderListItemLevel1__Group__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__1__Impl_in_rule__UnOrderListItemLevel1__Group__13692 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__2_in_rule__UnOrderListItemLevel1__Group__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__NameAssignment_1_in_rule__UnOrderListItemLevel1__Group__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__2__Impl_in_rule__UnOrderListItemLevel1__Group__23752 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__3_in_rule__UnOrderListItemLevel1__Group__23755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__ListAssignment_2_in_rule__UnOrderListItemLevel1__Group__2__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnOrderListItemLevel1__Group__3__Impl_in_rule__UnOrderListItemLevel1__Group__33812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UnOrderListItemLevel1__Group__3__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__0__Impl_in_rule__OrderListItemLevel1__Group__03879 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__1_in_rule__OrderListItemLevel1__Group__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OrderListItemLevel1__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__1__Impl_in_rule__OrderListItemLevel1__Group__13941 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__2_in_rule__OrderListItemLevel1__Group__13944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__NameAssignment_1_in_rule__OrderListItemLevel1__Group__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__2__Impl_in_rule__OrderListItemLevel1__Group__24001 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__3_in_rule__OrderListItemLevel1__Group__24004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__ListAssignment_2_in_rule__OrderListItemLevel1__Group__2__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItemLevel1__Group__3__Impl_in_rule__OrderListItemLevel1__Group__34061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__OrderListItemLevel1__Group__3__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04128 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Image__Group__0__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Image__Group__1__Impl4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24252 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34312 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44373 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54434 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64495 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group__6__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__74557 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Image__Group__8_in_rule__Image__Group__74560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__84617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Image__Group__8__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__04694 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__04697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group_3__0__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__14756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__04817 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__04820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group_4__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__04940 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Image__Group_5__0__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05063 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Category__Group__0__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Category__Group__1__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25187 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35247 = new BitSet(new long[]{0x0000200100000000L});
    public static final BitSet FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Category__Group__4__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__0__Impl_in_rule__Heading1__Group__05377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1_in_rule__Heading1__Group__05380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Heading1__Group__0__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__1__Impl_in_rule__Heading1__Group__15439 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2_in_rule__Heading1__Group__15442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__HeadingValue1Assignment_1_in_rule__Heading1__Group__1__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading1__Group__2__Impl_in_rule__Heading1__Group__25499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Heading1__Group__2__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05564 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Heading2__Group__0__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15626 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Heading2__Group__2__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__05751 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__05754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Heading3__Group__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__15813 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__15816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__25873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Heading3__Group__2__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__05938 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__05941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Heading4__Group__0__Impl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16000 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Heading4__Group__2__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06125 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Heading5__Group__0__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16187 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Heading5__Group__2__Impl6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06312 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bold__Group__0__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16374 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bold__Group__2__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06499 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Italic__Group__0__Impl6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16561 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Italic__Group__2__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06686 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ItalicBold__Group__0__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__16748 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__16751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__26808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ItalicBold__Group__2__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__06873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__06876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Internal__Group__0__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__16935 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__16938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__NameAssignment_1_in_rule__Internal__Group__1__Impl6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__26995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Internal__Group__2__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__0__Impl_in_rule__InternalAlt__Group__07060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__1_in_rule__InternalAlt__Group__07063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InternalAlt__Group__0__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__1__Impl_in_rule__InternalAlt__Group__17122 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__2_in_rule__InternalAlt__Group__17125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__NameAssignment_1_in_rule__InternalAlt__Group__1__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__2__Impl_in_rule__InternalAlt__Group__27182 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__3_in_rule__InternalAlt__Group__27185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InternalAlt__Group__2__Impl7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__3__Impl_in_rule__InternalAlt__Group__37244 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__4_in_rule__InternalAlt__Group__37247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__AltTextAssignment_3_in_rule__InternalAlt__Group__3__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__Group__4__Impl_in_rule__InternalAlt__Group__47304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InternalAlt__Group__4__Impl7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__External__Group__1_in_rule__External__Group__07376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__External__Group__0__Impl7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17435 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__External__Group__2_in_rule__External__Group__17438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__External__Group__2__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__0__Impl_in_rule__ExternalAlt__Group__07560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__1_in_rule__ExternalAlt__Group__07563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExternalAlt__Group__0__Impl7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__1__Impl_in_rule__ExternalAlt__Group__17622 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__2_in_rule__ExternalAlt__Group__17625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__NameAssignment_1_in_rule__ExternalAlt__Group__1__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__2__Impl_in_rule__ExternalAlt__Group__27682 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__3_in_rule__ExternalAlt__Group__27685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__AltTextAssignment_2_in_rule__ExternalAlt__Group__2__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__Group__3__Impl_in_rule__ExternalAlt__Group__37742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ExternalAlt__Group__3__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__07809 = new BitSet(new long[]{0x00000F0040000010L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__07812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__17870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl7897 = new BitSet(new long[]{0x00000F0040000012L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__07932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__07935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__17991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8019 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHeading1_in_rule__WikiPage__NameAssignment_08059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_18090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Template__ContentAssignment_18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Template__ContentAssignment_2_18183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel2__NameAssignment_18214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel2__ListAssignment_28245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__UnOrderListItemLevel1__NameAssignment_18276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__UnOrderListItemLevel1__ListAssignment_28307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__OrderListItemLevel1__NameAssignment_18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__OrderListItemLevel1__ListAssignment_28369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Image__NameAssignment_28400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Category__NameAssignment_28555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Category__ValueAssignment_38591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Heading1__HeadingValue1Assignment_18630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_18692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_18723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_18754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_18785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_18816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_18847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Text__NameAssignment8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Internal__NameAssignment_18909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__InternalAlt__NameAssignment_18940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalAlt__AltTextAlternatives_3_0_in_rule__InternalAlt__AltTextAssignment_38971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__External__NameAssignment_19004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__ExternalAlt__NameAssignment_19035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalAlt__AltTextAlternatives_2_0_in_rule__ExternalAlt__AltTextAssignment_29066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19099 = new BitSet(new long[]{0x0000000000000002L});

}