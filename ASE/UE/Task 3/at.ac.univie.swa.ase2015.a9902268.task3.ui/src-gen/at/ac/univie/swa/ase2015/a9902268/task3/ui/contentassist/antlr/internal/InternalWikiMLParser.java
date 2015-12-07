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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_URL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'thumb'", "'right'", "'*'", "'**'", "'='", "'<blockquote>'", "'</blockquote>'", "'{{'", "'}}'", "'|'", "'#'", "'[['", "'File:'", "']]'", "'|alt='", "'Category:'", "'=='", "'==='", "'===='", "'====='", "'\\'\\'\\''", "'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "'about'", "'main'", "'\\''", "'|*?'", "'\\r\\n\\r\\n'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=5;
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:153:1: ruleTemplate : ( ( rule__Template__Alternatives ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:157:2: ( ( ( rule__Template__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__Template__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__Template__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:159:1: ( rule__Template__Alternatives )
            {
             before(grammarAccess.getTemplateAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:1: ( rule__Template__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:2: rule__Template__Alternatives
            {
            pushFollow(FOLLOW_rule__Template__Alternatives_in_ruleTemplate274);
            rule__Template__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAboutTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:172:1: entryRuleAboutTemplate : ruleAboutTemplate EOF ;
    public final void entryRuleAboutTemplate() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:173:1: ( ruleAboutTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:174:1: ruleAboutTemplate EOF
            {
             before(grammarAccess.getAboutTemplateRule()); 
            pushFollow(FOLLOW_ruleAboutTemplate_in_entryRuleAboutTemplate301);
            ruleAboutTemplate();

            state._fsp--;

             after(grammarAccess.getAboutTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAboutTemplate308); 

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
    // $ANTLR end "entryRuleAboutTemplate"


    // $ANTLR start "ruleAboutTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:181:1: ruleAboutTemplate : ( ( rule__AboutTemplate__Group__0 ) ) ;
    public final void ruleAboutTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:185:2: ( ( ( rule__AboutTemplate__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__AboutTemplate__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__AboutTemplate__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:187:1: ( rule__AboutTemplate__Group__0 )
            {
             before(grammarAccess.getAboutTemplateAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:1: ( rule__AboutTemplate__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:2: rule__AboutTemplate__Group__0
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group__0_in_ruleAboutTemplate334);
            rule__AboutTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAboutTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAboutTemplate"


    // $ANTLR start "entryRuleMainTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:200:1: entryRuleMainTemplate : ruleMainTemplate EOF ;
    public final void entryRuleMainTemplate() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:201:1: ( ruleMainTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:202:1: ruleMainTemplate EOF
            {
             before(grammarAccess.getMainTemplateRule()); 
            pushFollow(FOLLOW_ruleMainTemplate_in_entryRuleMainTemplate361);
            ruleMainTemplate();

            state._fsp--;

             after(grammarAccess.getMainTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainTemplate368); 

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
    // $ANTLR end "entryRuleMainTemplate"


    // $ANTLR start "ruleMainTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:209:1: ruleMainTemplate : ( ( rule__MainTemplate__Group__0 ) ) ;
    public final void ruleMainTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:213:2: ( ( ( rule__MainTemplate__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__MainTemplate__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__MainTemplate__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:215:1: ( rule__MainTemplate__Group__0 )
            {
             before(grammarAccess.getMainTemplateAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:1: ( rule__MainTemplate__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:2: rule__MainTemplate__Group__0
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group__0_in_ruleMainTemplate394);
            rule__MainTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainTemplate"


    // $ANTLR start "entryRuleQuoteTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:228:1: entryRuleQuoteTemplate : ruleQuoteTemplate EOF ;
    public final void entryRuleQuoteTemplate() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:229:1: ( ruleQuoteTemplate EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:230:1: ruleQuoteTemplate EOF
            {
             before(grammarAccess.getQuoteTemplateRule()); 
            pushFollow(FOLLOW_ruleQuoteTemplate_in_entryRuleQuoteTemplate421);
            ruleQuoteTemplate();

            state._fsp--;

             after(grammarAccess.getQuoteTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuoteTemplate428); 

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
    // $ANTLR end "entryRuleQuoteTemplate"


    // $ANTLR start "ruleQuoteTemplate"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:237:1: ruleQuoteTemplate : ( ( rule__QuoteTemplate__Group__0 ) ) ;
    public final void ruleQuoteTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:241:2: ( ( ( rule__QuoteTemplate__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__QuoteTemplate__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__QuoteTemplate__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:243:1: ( rule__QuoteTemplate__Group__0 )
            {
             before(grammarAccess.getQuoteTemplateAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:1: ( rule__QuoteTemplate__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:2: rule__QuoteTemplate__Group__0
            {
            pushFollow(FOLLOW_rule__QuoteTemplate__Group__0_in_ruleQuoteTemplate454);
            rule__QuoteTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuoteTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuoteTemplate"


    // $ANTLR start "entryRuleOrderedList"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:256:1: entryRuleOrderedList : ruleOrderedList EOF ;
    public final void entryRuleOrderedList() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:257:1: ( ruleOrderedList EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:258:1: ruleOrderedList EOF
            {
             before(grammarAccess.getOrderedListRule()); 
            pushFollow(FOLLOW_ruleOrderedList_in_entryRuleOrderedList481);
            ruleOrderedList();

            state._fsp--;

             after(grammarAccess.getOrderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderedList488); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:265:1: ruleOrderedList : ( ( rule__OrderedList__Group__0 ) ) ;
    public final void ruleOrderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:269:2: ( ( ( rule__OrderedList__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__OrderedList__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__OrderedList__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:271:1: ( rule__OrderedList__Group__0 )
            {
             before(grammarAccess.getOrderedListAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:1: ( rule__OrderedList__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:2: rule__OrderedList__Group__0
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList514);
            rule__OrderedList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getGroup()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:284:1: entryRuleUnorderedList : ruleUnorderedList EOF ;
    public final void entryRuleUnorderedList() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:285:1: ( ruleUnorderedList EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:286:1: ruleUnorderedList EOF
            {
             before(grammarAccess.getUnorderedListRule()); 
            pushFollow(FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList541);
            ruleUnorderedList();

            state._fsp--;

             after(grammarAccess.getUnorderedListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderedList548); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:293:1: ruleUnorderedList : ( ( rule__UnorderedList__Group__0 ) ) ;
    public final void ruleUnorderedList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:297:2: ( ( ( rule__UnorderedList__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__UnorderedList__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__UnorderedList__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:299:1: ( rule__UnorderedList__Group__0 )
            {
             before(grammarAccess.getUnorderedListAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:1: ( rule__UnorderedList__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:2: rule__UnorderedList__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList574);
            rule__UnorderedList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUnorderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:312:1: entryRuleUnorderListItem : ruleUnorderListItem EOF ;
    public final void entryRuleUnorderListItem() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:313:1: ( ruleUnorderListItem EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:314:1: ruleUnorderListItem EOF
            {
             before(grammarAccess.getUnorderListItemRule()); 
            pushFollow(FOLLOW_ruleUnorderListItem_in_entryRuleUnorderListItem601);
            ruleUnorderListItem();

            state._fsp--;

             after(grammarAccess.getUnorderListItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnorderListItem608); 

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
    // $ANTLR end "entryRuleUnorderListItem"


    // $ANTLR start "ruleUnorderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:321:1: ruleUnorderListItem : ( ( rule__UnorderListItem__Group__0 ) ) ;
    public final void ruleUnorderListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:325:2: ( ( ( rule__UnorderListItem__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__UnorderListItem__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__UnorderListItem__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:327:1: ( rule__UnorderListItem__Group__0 )
            {
             before(grammarAccess.getUnorderListItemAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:1: ( rule__UnorderListItem__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:2: rule__UnorderListItem__Group__0
            {
            pushFollow(FOLLOW_rule__UnorderListItem__Group__0_in_ruleUnorderListItem634);
            rule__UnorderListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnorderListItem"


    // $ANTLR start "entryRuleOrderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: entryRuleOrderListItem : ruleOrderListItem EOF ;
    public final void entryRuleOrderListItem() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:341:1: ( ruleOrderListItem EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:342:1: ruleOrderListItem EOF
            {
             before(grammarAccess.getOrderListItemRule()); 
            pushFollow(FOLLOW_ruleOrderListItem_in_entryRuleOrderListItem661);
            ruleOrderListItem();

            state._fsp--;

             after(grammarAccess.getOrderListItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderListItem668); 

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
    // $ANTLR end "entryRuleOrderListItem"


    // $ANTLR start "ruleOrderListItem"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:349:1: ruleOrderListItem : ( ( rule__OrderListItem__Group__0 ) ) ;
    public final void ruleOrderListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:353:2: ( ( ( rule__OrderListItem__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__OrderListItem__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__OrderListItem__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:355:1: ( rule__OrderListItem__Group__0 )
            {
             before(grammarAccess.getOrderListItemAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:1: ( rule__OrderListItem__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:2: rule__OrderListItem__Group__0
            {
            pushFollow(FOLLOW_rule__OrderListItem__Group__0_in_ruleOrderListItem694);
            rule__OrderListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderListItem"


    // $ANTLR start "entryRuleImage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:368:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:369:1: ( ruleImage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:370:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_ruleImage_in_entryRuleImage721);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImage728); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:377:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:381:2: ( ( ( rule__Image__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Image__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Image__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:383:1: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:1: ( rule__Image__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:2: rule__Image__Group__0
            {
            pushFollow(FOLLOW_rule__Image__Group__0_in_ruleImage754);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:396:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:397:1: ( ruleCategory EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:398:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory781);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory788); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:405:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:409:2: ( ( ( rule__Category__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__Category__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__Category__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:411:1: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:1: ( rule__Category__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:2: rule__Category__Group__0
            {
            pushFollow(FOLLOW_rule__Category__Group__0_in_ruleCategory814);
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


    // $ANTLR start "entryRuleHeading2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:424:1: entryRuleHeading2 : ruleHeading2 EOF ;
    public final void entryRuleHeading2() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:425:1: ( ruleHeading2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:426:1: ruleHeading2 EOF
            {
             before(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading2841);
            ruleHeading2();

            state._fsp--;

             after(grammarAccess.getHeading2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading2848); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:433:1: ruleHeading2 : ( ( rule__Heading2__Group__0 ) ) ;
    public final void ruleHeading2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:437:2: ( ( ( rule__Heading2__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Heading2__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Heading2__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:439:1: ( rule__Heading2__Group__0 )
            {
             before(grammarAccess.getHeading2Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:1: ( rule__Heading2__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:2: rule__Heading2__Group__0
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0_in_ruleHeading2874);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:452:1: entryRuleHeading3 : ruleHeading3 EOF ;
    public final void entryRuleHeading3() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:453:1: ( ruleHeading3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:454:1: ruleHeading3 EOF
            {
             before(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading3901);
            ruleHeading3();

            state._fsp--;

             after(grammarAccess.getHeading3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading3908); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:461:1: ruleHeading3 : ( ( rule__Heading3__Group__0 ) ) ;
    public final void ruleHeading3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:465:2: ( ( ( rule__Heading3__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__Heading3__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__Heading3__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:467:1: ( rule__Heading3__Group__0 )
            {
             before(grammarAccess.getHeading3Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:1: ( rule__Heading3__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:2: rule__Heading3__Group__0
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0_in_ruleHeading3934);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:480:1: entryRuleHeading4 : ruleHeading4 EOF ;
    public final void entryRuleHeading4() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:481:1: ( ruleHeading4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:482:1: ruleHeading4 EOF
            {
             before(grammarAccess.getHeading4Rule()); 
            pushFollow(FOLLOW_ruleHeading4_in_entryRuleHeading4961);
            ruleHeading4();

            state._fsp--;

             after(grammarAccess.getHeading4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading4968); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:489:1: ruleHeading4 : ( ( rule__Heading4__Group__0 ) ) ;
    public final void ruleHeading4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:493:2: ( ( ( rule__Heading4__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__Heading4__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__Heading4__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:495:1: ( rule__Heading4__Group__0 )
            {
             before(grammarAccess.getHeading4Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:1: ( rule__Heading4__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:2: rule__Heading4__Group__0
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0_in_ruleHeading4994);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:508:1: entryRuleHeading5 : ruleHeading5 EOF ;
    public final void entryRuleHeading5() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:509:1: ( ruleHeading5 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:510:1: ruleHeading5 EOF
            {
             before(grammarAccess.getHeading5Rule()); 
            pushFollow(FOLLOW_ruleHeading5_in_entryRuleHeading51021);
            ruleHeading5();

            state._fsp--;

             after(grammarAccess.getHeading5Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading51028); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:517:1: ruleHeading5 : ( ( rule__Heading5__Group__0 ) ) ;
    public final void ruleHeading5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:521:2: ( ( ( rule__Heading5__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__Heading5__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__Heading5__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:523:1: ( rule__Heading5__Group__0 )
            {
             before(grammarAccess.getHeading5Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:1: ( rule__Heading5__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:2: rule__Heading5__Group__0
            {
            pushFollow(FOLLOW_rule__Heading5__Group__0_in_ruleHeading51054);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:536:1: entryRuleAbstractFormattedInlineContent : ruleAbstractFormattedInlineContent EOF ;
    public final void entryRuleAbstractFormattedInlineContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:537:1: ( ruleAbstractFormattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:538:1: ruleAbstractFormattedInlineContent EOF
            {
             before(grammarAccess.getAbstractFormattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent1081);
            ruleAbstractFormattedInlineContent();

            state._fsp--;

             after(grammarAccess.getAbstractFormattedInlineContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent1088); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:545:1: ruleAbstractFormattedInlineContent : ( ( rule__AbstractFormattedInlineContent__Alternatives ) ) ;
    public final void ruleAbstractFormattedInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:549:2: ( ( ( rule__AbstractFormattedInlineContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__AbstractFormattedInlineContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__AbstractFormattedInlineContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:551:1: ( rule__AbstractFormattedInlineContent__Alternatives )
            {
             before(grammarAccess.getAbstractFormattedInlineContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:1: ( rule__AbstractFormattedInlineContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:2: rule__AbstractFormattedInlineContent__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractFormattedInlineContent__Alternatives_in_ruleAbstractFormattedInlineContent1114);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:564:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:565:1: ( ruleBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:566:1: ruleBold EOF
            {
             before(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold1141);
            ruleBold();

            state._fsp--;

             after(grammarAccess.getBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold1148); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:573:1: ruleBold : ( ( rule__Bold__Group__0 ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:577:2: ( ( ( rule__Bold__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:578:1: ( ( rule__Bold__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:578:1: ( ( rule__Bold__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:579:1: ( rule__Bold__Group__0 )
            {
             before(grammarAccess.getBoldAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:580:1: ( rule__Bold__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:580:2: rule__Bold__Group__0
            {
            pushFollow(FOLLOW_rule__Bold__Group__0_in_ruleBold1174);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:592:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:593:1: ( ruleItalic EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:594:1: ruleItalic EOF
            {
             before(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic1201);
            ruleItalic();

            state._fsp--;

             after(grammarAccess.getItalicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic1208); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:601:1: ruleItalic : ( ( rule__Italic__Group__0 ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:605:2: ( ( ( rule__Italic__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:606:1: ( ( rule__Italic__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:606:1: ( ( rule__Italic__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:607:1: ( rule__Italic__Group__0 )
            {
             before(grammarAccess.getItalicAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:608:1: ( rule__Italic__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:608:2: rule__Italic__Group__0
            {
            pushFollow(FOLLOW_rule__Italic__Group__0_in_ruleItalic1234);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:620:1: entryRuleItalicBold : ruleItalicBold EOF ;
    public final void entryRuleItalicBold() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:621:1: ( ruleItalicBold EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:622:1: ruleItalicBold EOF
            {
             before(grammarAccess.getItalicBoldRule()); 
            pushFollow(FOLLOW_ruleItalicBold_in_entryRuleItalicBold1261);
            ruleItalicBold();

            state._fsp--;

             after(grammarAccess.getItalicBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicBold1268); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:629:1: ruleItalicBold : ( ( rule__ItalicBold__Group__0 ) ) ;
    public final void ruleItalicBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:633:2: ( ( ( rule__ItalicBold__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__ItalicBold__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__ItalicBold__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:635:1: ( rule__ItalicBold__Group__0 )
            {
             before(grammarAccess.getItalicBoldAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:1: ( rule__ItalicBold__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:2: rule__ItalicBold__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__0_in_ruleItalicBold1294);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:648:1: entryRuleAbstractUnformattedInlineContent : ruleAbstractUnformattedInlineContent EOF ;
    public final void entryRuleAbstractUnformattedInlineContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:649:1: ( ruleAbstractUnformattedInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:650:1: ruleAbstractUnformattedInlineContent EOF
            {
             before(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent1321);
            ruleAbstractUnformattedInlineContent();

            state._fsp--;

             after(grammarAccess.getAbstractUnformattedInlineContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent1328); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:657:1: ruleAbstractUnformattedInlineContent : ( ( rule__AbstractUnformattedInlineContent__Alternatives ) ) ;
    public final void ruleAbstractUnformattedInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:661:2: ( ( ( rule__AbstractUnformattedInlineContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:662:1: ( ( rule__AbstractUnformattedInlineContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:662:1: ( ( rule__AbstractUnformattedInlineContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:663:1: ( rule__AbstractUnformattedInlineContent__Alternatives )
            {
             before(grammarAccess.getAbstractUnformattedInlineContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:664:1: ( rule__AbstractUnformattedInlineContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:664:2: rule__AbstractUnformattedInlineContent__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractUnformattedInlineContent__Alternatives_in_ruleAbstractUnformattedInlineContent1354);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:676:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:677:1: ( ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:678:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText1381);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText1388); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:685:1: ruleText : ( ( rule__Text__NameAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:689:2: ( ( ( rule__Text__NameAssignment ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:690:1: ( ( rule__Text__NameAssignment ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:690:1: ( ( rule__Text__NameAssignment ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:691:1: ( rule__Text__NameAssignment )
            {
             before(grammarAccess.getTextAccess().getNameAssignment()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:692:1: ( rule__Text__NameAssignment )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:692:2: rule__Text__NameAssignment
            {
            pushFollow(FOLLOW_rule__Text__NameAssignment_in_ruleText1414);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:704:1: entryRuleHyperLink : ruleHyperLink EOF ;
    public final void entryRuleHyperLink() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:705:1: ( ruleHyperLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:706:1: ruleHyperLink EOF
            {
             before(grammarAccess.getHyperLinkRule()); 
            pushFollow(FOLLOW_ruleHyperLink_in_entryRuleHyperLink1441);
            ruleHyperLink();

            state._fsp--;

             after(grammarAccess.getHyperLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperLink1448); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:713:1: ruleHyperLink : ( ( rule__HyperLink__Alternatives ) ) ;
    public final void ruleHyperLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:717:2: ( ( ( rule__HyperLink__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:1: ( ( rule__HyperLink__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:1: ( ( rule__HyperLink__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:719:1: ( rule__HyperLink__Alternatives )
            {
             before(grammarAccess.getHyperLinkAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:720:1: ( rule__HyperLink__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:720:2: rule__HyperLink__Alternatives
            {
            pushFollow(FOLLOW_rule__HyperLink__Alternatives_in_ruleHyperLink1474);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:732:1: entryRuleInternal : ruleInternal EOF ;
    public final void entryRuleInternal() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:733:1: ( ruleInternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:734:1: ruleInternal EOF
            {
             before(grammarAccess.getInternalRule()); 
            pushFollow(FOLLOW_ruleInternal_in_entryRuleInternal1501);
            ruleInternal();

            state._fsp--;

             after(grammarAccess.getInternalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternal1508); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:741:1: ruleInternal : ( ( rule__Internal__Group__0 ) ) ;
    public final void ruleInternal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:745:2: ( ( ( rule__Internal__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:746:1: ( ( rule__Internal__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:746:1: ( ( rule__Internal__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:747:1: ( rule__Internal__Group__0 )
            {
             before(grammarAccess.getInternalAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:748:1: ( rule__Internal__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:748:2: rule__Internal__Group__0
            {
            pushFollow(FOLLOW_rule__Internal__Group__0_in_ruleInternal1534);
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


    // $ANTLR start "entryRuleExternal"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:760:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:761:1: ( ruleExternal EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:762:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_ruleExternal_in_entryRuleExternal1561);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternal1568); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:769:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:773:2: ( ( ( rule__External__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:774:1: ( ( rule__External__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:774:1: ( ( rule__External__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:775:1: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:776:1: ( rule__External__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:776:2: rule__External__Group__0
            {
            pushFollow(FOLLOW_rule__External__Group__0_in_ruleExternal1594);
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


    // $ANTLR start "entryRuleAnyTextSequence"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:788:1: entryRuleAnyTextSequence : ruleAnyTextSequence EOF ;
    public final void entryRuleAnyTextSequence() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:789:1: ( ruleAnyTextSequence EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:790:1: ruleAnyTextSequence EOF
            {
             before(grammarAccess.getAnyTextSequenceRule()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence1621);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getAnyTextSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyTextSequence1628); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:797:1: ruleAnyTextSequence : ( ( rule__AnyTextSequence__Group__0 ) ) ;
    public final void ruleAnyTextSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:801:2: ( ( ( rule__AnyTextSequence__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyTextSequence__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:802:1: ( ( rule__AnyTextSequence__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:803:1: ( rule__AnyTextSequence__Group__0 )
            {
             before(grammarAccess.getAnyTextSequenceAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:1: ( rule__AnyTextSequence__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:2: rule__AnyTextSequence__Group__0
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__0_in_ruleAnyTextSequence1654);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:816:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:817:1: ( ruleAnyText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:818:1: ruleAnyText EOF
            {
             before(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_ruleAnyText_in_entryRuleAnyText1681);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getAnyTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnyText1688); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:825:1: ruleAnyText : ( ( rule__AnyText__Alternatives ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:829:2: ( ( ( rule__AnyText__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( ( rule__AnyText__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( ( rule__AnyText__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:831:1: ( rule__AnyText__Alternatives )
            {
             before(grammarAccess.getAnyTextAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:832:1: ( rule__AnyText__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:832:2: rule__AnyText__Alternatives
            {
            pushFollow(FOLLOW_rule__AnyText__Alternatives_in_ruleAnyText1714);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:844:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:845:1: ( ruleName EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:846:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1741);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1748); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:853:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:857:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:858:1: ( ( rule__Name__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:858:1: ( ( rule__Name__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:859:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:860:1: ( rule__Name__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:860:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName1774);
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


    // $ANTLR start "entryRuleParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:872:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:873:1: ( ruleParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:874:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph1801);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph1808); 

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:881:1: ruleParagraph : ( ( rule__Paragraph__ParagraphAssignment ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:885:2: ( ( ( rule__Paragraph__ParagraphAssignment ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:886:1: ( ( rule__Paragraph__ParagraphAssignment ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:886:1: ( ( rule__Paragraph__ParagraphAssignment ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:887:1: ( rule__Paragraph__ParagraphAssignment )
            {
             before(grammarAccess.getParagraphAccess().getParagraphAssignment()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:888:1: ( rule__Paragraph__ParagraphAssignment )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:888:2: rule__Paragraph__ParagraphAssignment
            {
            pushFollow(FOLLOW_rule__Paragraph__ParagraphAssignment_in_ruleParagraph1834);
            rule__Paragraph__ParagraphAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getParagraphAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "ruleViewType"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:901:1: ruleViewType : ( ( 'thumb' ) ) ;
    public final void ruleViewType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:1: ( ( ( 'thumb' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:906:1: ( ( 'thumb' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:906:1: ( ( 'thumb' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:907:1: ( 'thumb' )
            {
             before(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:908:1: ( 'thumb' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:908:3: 'thumb'
            {
            match(input,12,FOLLOW_12_in_ruleViewType1872); 

            }

             after(grammarAccess.getViewTypeAccess().getThumbEnumLiteralDeclaration()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:921:1: ruleHorizontalAlign : ( ( 'right' ) ) ;
    public final void ruleHorizontalAlign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:925:1: ( ( ( 'right' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:926:1: ( ( 'right' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:926:1: ( ( 'right' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:927:1: ( 'right' )
            {
             before(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:928:1: ( 'right' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:928:3: 'right'
            {
            match(input,13,FOLLOW_13_in_ruleHorizontalAlign1911); 

            }

             after(grammarAccess.getHorizontalAlignAccess().getRightEnumLiteralDeclaration()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:940:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) | ( ruleParagraph ) );
    public final void rule__ParagraphTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:944:1: ( ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) | ( ruleParagraph ) )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:945:1: ( ruleOrderedList )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:945:1: ( ruleOrderedList )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:946:1: ruleOrderedList
                    {
                     before(grammarAccess.getParagraphTypesAccess().getOrderedListParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOrderedList_in_rule__ParagraphTypes__Alternatives1948);
                    ruleOrderedList();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getOrderedListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:951:6: ( ruleUnorderedList )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:951:6: ( ruleUnorderedList )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:952:1: ruleUnorderedList
                    {
                     before(grammarAccess.getParagraphTypesAccess().getUnorderedListParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnorderedList_in_rule__ParagraphTypes__Alternatives1965);
                    ruleUnorderedList();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getUnorderedListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:957:6: ( ruleImage )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:957:6: ( ruleImage )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:958:1: ruleImage
                    {
                     before(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleImage_in_rule__ParagraphTypes__Alternatives1982);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getImageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:963:6: ( ruleCategory )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:963:6: ( ruleCategory )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:964:1: ruleCategory
                    {
                     before(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleCategory_in_rule__ParagraphTypes__Alternatives1999);
                    ruleCategory();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getCategoryParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:969:6: ( ruleTemplate )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:969:6: ( ruleTemplate )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:970:1: ruleTemplate
                    {
                     before(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTemplate_in_rule__ParagraphTypes__Alternatives2016);
                    ruleTemplate();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getTemplateParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:975:6: ( ruleAnyText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:975:6: ( ruleAnyText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:976:1: ruleAnyText
                    {
                     before(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleAnyText_in_rule__ParagraphTypes__Alternatives2033);
                    ruleAnyText();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getAnyTextParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:6: ( ruleBlockQuote )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:981:6: ( ruleBlockQuote )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:982:1: ruleBlockQuote
                    {
                     before(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives2050);
                    ruleBlockQuote();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getBlockQuoteParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleHeading2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:987:6: ( ruleHeading2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:988:1: ruleHeading2
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives2067);
                    ruleHeading2();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading2ParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:993:6: ( ruleHeading3 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:993:6: ( ruleHeading3 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:994:1: ruleHeading3
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives2084);
                    ruleHeading3();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading3ParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:999:6: ( ruleHeading4 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:999:6: ( ruleHeading4 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1000:1: ruleHeading4
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2101);
                    ruleHeading4();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading4ParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1005:6: ( ruleHeading5 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1005:6: ( ruleHeading5 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1006:1: ruleHeading5
                    {
                     before(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2118);
                    ruleHeading5();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getHeading5ParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1011:6: ( ruleParagraph )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1011:6: ( ruleParagraph )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1012:1: ruleParagraph
                    {
                     before(grammarAccess.getParagraphTypesAccess().getParagraphParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleParagraph_in_rule__ParagraphTypes__Alternatives2135);
                    ruleParagraph();

                    state._fsp--;

                     after(grammarAccess.getParagraphTypesAccess().getParagraphParserRuleCall_11()); 

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


    // $ANTLR start "rule__Template__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1022:1: rule__Template__Alternatives : ( ( ruleAboutTemplate ) | ( ruleQuoteTemplate ) | ( ruleMainTemplate ) );
    public final void rule__Template__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1026:1: ( ( ruleAboutTemplate ) | ( ruleQuoteTemplate ) | ( ruleMainTemplate ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt2=1;
                    }
                    break;
                case 39:
                    {
                    alt2=2;
                    }
                    break;
                case 38:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1027:1: ( ruleAboutTemplate )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1027:1: ( ruleAboutTemplate )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1028:1: ruleAboutTemplate
                    {
                     before(grammarAccess.getTemplateAccess().getAboutTemplateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAboutTemplate_in_rule__Template__Alternatives2167);
                    ruleAboutTemplate();

                    state._fsp--;

                     after(grammarAccess.getTemplateAccess().getAboutTemplateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1033:6: ( ruleQuoteTemplate )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1033:6: ( ruleQuoteTemplate )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1034:1: ruleQuoteTemplate
                    {
                     before(grammarAccess.getTemplateAccess().getQuoteTemplateParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleQuoteTemplate_in_rule__Template__Alternatives2184);
                    ruleQuoteTemplate();

                    state._fsp--;

                     after(grammarAccess.getTemplateAccess().getQuoteTemplateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1039:6: ( ruleMainTemplate )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1039:6: ( ruleMainTemplate )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1040:1: ruleMainTemplate
                    {
                     before(grammarAccess.getTemplateAccess().getMainTemplateParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMainTemplate_in_rule__Template__Alternatives2201);
                    ruleMainTemplate();

                    state._fsp--;

                     after(grammarAccess.getTemplateAccess().getMainTemplateParserRuleCall_2()); 

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
    // $ANTLR end "rule__Template__Alternatives"


    // $ANTLR start "rule__UnorderListItem__LevelAlternatives_0_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1050:1: rule__UnorderListItem__LevelAlternatives_0_0 : ( ( '*' ) | ( '**' ) );
    public final void rule__UnorderListItem__LevelAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1054:1: ( ( '*' ) | ( '**' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1055:1: ( '*' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1055:1: ( '*' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1056:1: '*'
                    {
                     before(grammarAccess.getUnorderListItemAccess().getLevelAsteriskKeyword_0_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__UnorderListItem__LevelAlternatives_0_02234); 
                     after(grammarAccess.getUnorderListItemAccess().getLevelAsteriskKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1063:6: ( '**' )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1063:6: ( '**' )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1064:1: '**'
                    {
                     before(grammarAccess.getUnorderListItemAccess().getLevelAsteriskAsteriskKeyword_0_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__UnorderListItem__LevelAlternatives_0_02254); 
                     after(grammarAccess.getUnorderListItemAccess().getLevelAsteriskAsteriskKeyword_0_0_1()); 

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
    // $ANTLR end "rule__UnorderListItem__LevelAlternatives_0_0"


    // $ANTLR start "rule__AbstractFormattedInlineContent__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1076:1: rule__AbstractFormattedInlineContent__Alternatives : ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) );
    public final void rule__AbstractFormattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1080:1: ( ( ruleBold ) | ( ruleItalic ) | ( ruleItalicBold ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: ( ruleBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: ( ruleBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1082:1: ruleBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2288);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getBoldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:6: ( ruleItalic )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:6: ( ruleItalic )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1088:1: ruleItalic
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2305);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1093:6: ( ruleItalicBold )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1093:6: ( ruleItalicBold )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1094:1: ruleItalicBold
                    {
                     before(grammarAccess.getAbstractFormattedInlineContentAccess().getItalicBoldParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2322);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1104:1: rule__AbstractUnformattedInlineContent__Alternatives : ( ( ruleText ) | ( ruleHyperLink ) );
    public final void rule__AbstractUnformattedInlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1108:1: ( ( ruleText ) | ( ruleHyperLink ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==23||LA5_0==35) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:1: ( ruleText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1109:1: ( ruleText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1110:1: ruleText
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2354);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getAbstractUnformattedInlineContentAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1115:6: ( ruleHyperLink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1115:6: ( ruleHyperLink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1116:1: ruleHyperLink
                    {
                     before(grammarAccess.getAbstractUnformattedInlineContentAccess().getHyperLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2371);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1126:1: rule__HyperLink__Alternatives : ( ( ruleInternal ) | ( ruleExternal ) );
    public final void rule__HyperLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1130:1: ( ( ruleInternal ) | ( ruleExternal ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ruleInternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ruleInternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1132:1: ruleInternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2403);
                    ruleInternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getInternalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1137:6: ( ruleExternal )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1137:6: ( ruleExternal )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1138:1: ruleExternal
                    {
                     before(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2420);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getHyperLinkAccess().getExternalParserRuleCall_1()); 

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


    // $ANTLR start "rule__Internal__AltTextAlternatives_4_1_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1148:1: rule__Internal__AltTextAlternatives_4_1_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__Internal__AltTextAlternatives_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1152:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==23||LA7_0==35) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=32 && LA7_0<=34)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1153:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1153:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1154:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getInternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_4_1_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Internal__AltTextAlternatives_4_1_02452);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getInternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_4_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1159:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1159:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1160:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getInternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_4_1_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__Internal__AltTextAlternatives_4_1_02469);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getInternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_4_1_0_1()); 

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
    // $ANTLR end "rule__Internal__AltTextAlternatives_4_1_0"


    // $ANTLR start "rule__External__AltTextAlternatives_2_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1170:1: rule__External__AltTextAlternatives_2_0 : ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) );
    public final void rule__External__AltTextAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1174:1: ( ( ruleAbstractUnformattedInlineContent ) | ( ruleAbstractFormattedInlineContent ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==23||LA8_0==35) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=32 && LA8_0<=34)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1175:1: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1175:1: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1176:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getExternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__External__AltTextAlternatives_2_02501);
                    ruleAbstractUnformattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1181:6: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1181:6: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1182:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getExternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__External__AltTextAlternatives_2_02518);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getExternalAccess().getAltTextAbstractFormattedInlineContentParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__External__AltTextAlternatives_2_0"


    // $ANTLR start "rule__AnyText__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1192:1: rule__AnyText__Alternatives : ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) );
    public final void rule__AnyText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1196:1: ( ( ruleAbstractFormattedInlineContent ) | ( ruleAbstractUnformattedInlineContent ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=32 && LA9_0<=34)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==23||LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1197:1: ( ruleAbstractFormattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1197:1: ( ruleAbstractFormattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1198:1: ruleAbstractFormattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__Alternatives2550);
                    ruleAbstractFormattedInlineContent();

                    state._fsp--;

                     after(grammarAccess.getAnyTextAccess().getAbstractFormattedInlineContentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1203:6: ( ruleAbstractUnformattedInlineContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1203:6: ( ruleAbstractUnformattedInlineContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1204:1: ruleAbstractUnformattedInlineContent
                    {
                     before(grammarAccess.getAnyTextAccess().getAbstractUnformattedInlineContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__Alternatives2567);
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


    // $ANTLR start "rule__WikiPage__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1216:1: rule__WikiPage__Group__0 : rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 ;
    public final void rule__WikiPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1220:1: ( rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1221:2: rule__WikiPage__Group__0__Impl rule__WikiPage__Group__1
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02597);
            rule__WikiPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02600);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1228:1: rule__WikiPage__Group__0__Impl : ( '=' ) ;
    public final void rule__WikiPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1232:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1233:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1233:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1234:1: '='
            {
             before(grammarAccess.getWikiPageAccess().getEqualsSignKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__WikiPage__Group__0__Impl2628); 
             after(grammarAccess.getWikiPageAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1247:1: rule__WikiPage__Group__1 : rule__WikiPage__Group__1__Impl rule__WikiPage__Group__2 ;
    public final void rule__WikiPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1251:1: ( rule__WikiPage__Group__1__Impl rule__WikiPage__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1252:2: rule__WikiPage__Group__1__Impl rule__WikiPage__Group__2
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12659);
            rule__WikiPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiPage__Group__2_in_rule__WikiPage__Group__12662);
            rule__WikiPage__Group__2();

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1259:1: rule__WikiPage__Group__1__Impl : ( ( rule__WikiPage__NameAssignment_1 ) ) ;
    public final void rule__WikiPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1263:1: ( ( ( rule__WikiPage__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1264:1: ( ( rule__WikiPage__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1264:1: ( ( rule__WikiPage__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1265:1: ( rule__WikiPage__NameAssignment_1 )
            {
             before(grammarAccess.getWikiPageAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1266:1: ( rule__WikiPage__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1266:2: rule__WikiPage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__WikiPage__NameAssignment_1_in_rule__WikiPage__Group__1__Impl2689);
            rule__WikiPage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWikiPageAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__WikiPage__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1276:1: rule__WikiPage__Group__2 : rule__WikiPage__Group__2__Impl rule__WikiPage__Group__3 ;
    public final void rule__WikiPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1280:1: ( rule__WikiPage__Group__2__Impl rule__WikiPage__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1281:2: rule__WikiPage__Group__2__Impl rule__WikiPage__Group__3
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__2__Impl_in_rule__WikiPage__Group__22719);
            rule__WikiPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiPage__Group__3_in_rule__WikiPage__Group__22722);
            rule__WikiPage__Group__3();

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
    // $ANTLR end "rule__WikiPage__Group__2"


    // $ANTLR start "rule__WikiPage__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1288:1: rule__WikiPage__Group__2__Impl : ( '=' ) ;
    public final void rule__WikiPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1292:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1293:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1293:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1294:1: '='
            {
             before(grammarAccess.getWikiPageAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__WikiPage__Group__2__Impl2750); 
             after(grammarAccess.getWikiPageAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiPage__Group__2__Impl"


    // $ANTLR start "rule__WikiPage__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1307:1: rule__WikiPage__Group__3 : rule__WikiPage__Group__3__Impl ;
    public final void rule__WikiPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1311:1: ( rule__WikiPage__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1312:2: rule__WikiPage__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WikiPage__Group__3__Impl_in_rule__WikiPage__Group__32781);
            rule__WikiPage__Group__3__Impl();

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
    // $ANTLR end "rule__WikiPage__Group__3"


    // $ANTLR start "rule__WikiPage__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1318:1: rule__WikiPage__Group__3__Impl : ( ( rule__WikiPage__ElementsAssignment_3 )* ) ;
    public final void rule__WikiPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1322:1: ( ( ( rule__WikiPage__ElementsAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1323:1: ( ( rule__WikiPage__ElementsAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1323:1: ( ( rule__WikiPage__ElementsAssignment_3 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1324:1: ( rule__WikiPage__ElementsAssignment_3 )*
            {
             before(grammarAccess.getWikiPageAccess().getElementsAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1325:1: ( rule__WikiPage__ElementsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=14 && LA10_0<=15)||LA10_0==17||LA10_0==19||(LA10_0>=22 && LA10_0<=23)||(LA10_0>=28 && LA10_0<=35)||LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1325:2: rule__WikiPage__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__WikiPage__ElementsAssignment_3_in_rule__WikiPage__Group__3__Impl2808);
            	    rule__WikiPage__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWikiPageAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiPage__Group__3__Impl"


    // $ANTLR start "rule__BlockQuote__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1343:1: rule__BlockQuote__Group__0 : rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 ;
    public final void rule__BlockQuote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1347:1: ( rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1348:2: rule__BlockQuote__Group__0__Impl rule__BlockQuote__Group__1
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02847);
            rule__BlockQuote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02850);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1355:1: rule__BlockQuote__Group__0__Impl : ( () ) ;
    public final void rule__BlockQuote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1359:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1360:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1360:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1361:1: ()
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockQuoteAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1362:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1364:1: 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1374:1: rule__BlockQuote__Group__1 : rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 ;
    public final void rule__BlockQuote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1378:1: ( rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1379:2: rule__BlockQuote__Group__1__Impl rule__BlockQuote__Group__2
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12908);
            rule__BlockQuote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12911);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1386:1: rule__BlockQuote__Group__1__Impl : ( '<blockquote>' ) ;
    public final void rule__BlockQuote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1390:1: ( ( '<blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1391:1: ( '<blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1391:1: ( '<blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1392:1: '<blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__BlockQuote__Group__1__Impl2939); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1405:1: rule__BlockQuote__Group__2 : rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 ;
    public final void rule__BlockQuote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1409:1: ( rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1410:2: rule__BlockQuote__Group__2__Impl rule__BlockQuote__Group__3
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22970);
            rule__BlockQuote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22973);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1417:1: rule__BlockQuote__Group__2__Impl : ( ( rule__BlockQuote__ContentAssignment_2 ) ) ;
    public final void rule__BlockQuote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1421:1: ( ( ( rule__BlockQuote__ContentAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1422:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1422:1: ( ( rule__BlockQuote__ContentAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1423:1: ( rule__BlockQuote__ContentAssignment_2 )
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1424:1: ( rule__BlockQuote__ContentAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1424:2: rule__BlockQuote__ContentAssignment_2
            {
            pushFollow(FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl3000);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1434:1: rule__BlockQuote__Group__3 : rule__BlockQuote__Group__3__Impl ;
    public final void rule__BlockQuote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1438:1: ( rule__BlockQuote__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1439:2: rule__BlockQuote__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__33030);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1445:1: rule__BlockQuote__Group__3__Impl : ( '</blockquote>' ) ;
    public final void rule__BlockQuote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1449:1: ( ( '</blockquote>' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1450:1: ( '</blockquote>' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1450:1: ( '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1451:1: '</blockquote>'
            {
             before(grammarAccess.getBlockQuoteAccess().getBlockquoteKeyword_3()); 
            match(input,18,FOLLOW_18_in_rule__BlockQuote__Group__3__Impl3058); 
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


    // $ANTLR start "rule__AboutTemplate__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1472:1: rule__AboutTemplate__Group__0 : rule__AboutTemplate__Group__0__Impl rule__AboutTemplate__Group__1 ;
    public final void rule__AboutTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1476:1: ( rule__AboutTemplate__Group__0__Impl rule__AboutTemplate__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1477:2: rule__AboutTemplate__Group__0__Impl rule__AboutTemplate__Group__1
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group__0__Impl_in_rule__AboutTemplate__Group__03097);
            rule__AboutTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AboutTemplate__Group__1_in_rule__AboutTemplate__Group__03100);
            rule__AboutTemplate__Group__1();

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
    // $ANTLR end "rule__AboutTemplate__Group__0"


    // $ANTLR start "rule__AboutTemplate__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1484:1: rule__AboutTemplate__Group__0__Impl : ( '{{' ) ;
    public final void rule__AboutTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1488:1: ( ( '{{' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1489:1: ( '{{' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1489:1: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1490:1: '{{'
            {
             before(grammarAccess.getAboutTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__AboutTemplate__Group__0__Impl3128); 
             after(grammarAccess.getAboutTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__Group__0__Impl"


    // $ANTLR start "rule__AboutTemplate__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1503:1: rule__AboutTemplate__Group__1 : rule__AboutTemplate__Group__1__Impl rule__AboutTemplate__Group__2 ;
    public final void rule__AboutTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1507:1: ( rule__AboutTemplate__Group__1__Impl rule__AboutTemplate__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1508:2: rule__AboutTemplate__Group__1__Impl rule__AboutTemplate__Group__2
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group__1__Impl_in_rule__AboutTemplate__Group__13159);
            rule__AboutTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AboutTemplate__Group__2_in_rule__AboutTemplate__Group__13162);
            rule__AboutTemplate__Group__2();

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
    // $ANTLR end "rule__AboutTemplate__Group__1"


    // $ANTLR start "rule__AboutTemplate__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1515:1: rule__AboutTemplate__Group__1__Impl : ( ( rule__AboutTemplate__TypeAssignment_1 ) ) ;
    public final void rule__AboutTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1519:1: ( ( ( rule__AboutTemplate__TypeAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1520:1: ( ( rule__AboutTemplate__TypeAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1520:1: ( ( rule__AboutTemplate__TypeAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1521:1: ( rule__AboutTemplate__TypeAssignment_1 )
            {
             before(grammarAccess.getAboutTemplateAccess().getTypeAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1522:1: ( rule__AboutTemplate__TypeAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1522:2: rule__AboutTemplate__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__AboutTemplate__TypeAssignment_1_in_rule__AboutTemplate__Group__1__Impl3189);
            rule__AboutTemplate__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAboutTemplateAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__Group__1__Impl"


    // $ANTLR start "rule__AboutTemplate__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1532:1: rule__AboutTemplate__Group__2 : rule__AboutTemplate__Group__2__Impl rule__AboutTemplate__Group__3 ;
    public final void rule__AboutTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1536:1: ( rule__AboutTemplate__Group__2__Impl rule__AboutTemplate__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1537:2: rule__AboutTemplate__Group__2__Impl rule__AboutTemplate__Group__3
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group__2__Impl_in_rule__AboutTemplate__Group__23219);
            rule__AboutTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AboutTemplate__Group__3_in_rule__AboutTemplate__Group__23222);
            rule__AboutTemplate__Group__3();

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
    // $ANTLR end "rule__AboutTemplate__Group__2"


    // $ANTLR start "rule__AboutTemplate__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1544:1: rule__AboutTemplate__Group__2__Impl : ( ( ( rule__AboutTemplate__Group_2__0 ) ) ( ( rule__AboutTemplate__Group_2__0 )* ) ) ;
    public final void rule__AboutTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1548:1: ( ( ( ( rule__AboutTemplate__Group_2__0 ) ) ( ( rule__AboutTemplate__Group_2__0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1549:1: ( ( ( rule__AboutTemplate__Group_2__0 ) ) ( ( rule__AboutTemplate__Group_2__0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1549:1: ( ( ( rule__AboutTemplate__Group_2__0 ) ) ( ( rule__AboutTemplate__Group_2__0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1550:1: ( ( rule__AboutTemplate__Group_2__0 ) ) ( ( rule__AboutTemplate__Group_2__0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1550:1: ( ( rule__AboutTemplate__Group_2__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1551:1: ( rule__AboutTemplate__Group_2__0 )
            {
             before(grammarAccess.getAboutTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1552:1: ( rule__AboutTemplate__Group_2__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1552:2: rule__AboutTemplate__Group_2__0
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group_2__0_in_rule__AboutTemplate__Group__2__Impl3251);
            rule__AboutTemplate__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAboutTemplateAccess().getGroup_2()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1555:1: ( ( rule__AboutTemplate__Group_2__0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1556:1: ( rule__AboutTemplate__Group_2__0 )*
            {
             before(grammarAccess.getAboutTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1557:1: ( rule__AboutTemplate__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1557:2: rule__AboutTemplate__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AboutTemplate__Group_2__0_in_rule__AboutTemplate__Group__2__Impl3263);
            	    rule__AboutTemplate__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAboutTemplateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AboutTemplate__Group__2__Impl"


    // $ANTLR start "rule__AboutTemplate__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1568:1: rule__AboutTemplate__Group__3 : rule__AboutTemplate__Group__3__Impl ;
    public final void rule__AboutTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1572:1: ( rule__AboutTemplate__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1573:2: rule__AboutTemplate__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group__3__Impl_in_rule__AboutTemplate__Group__33296);
            rule__AboutTemplate__Group__3__Impl();

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
    // $ANTLR end "rule__AboutTemplate__Group__3"


    // $ANTLR start "rule__AboutTemplate__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1579:1: rule__AboutTemplate__Group__3__Impl : ( '}}' ) ;
    public final void rule__AboutTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1583:1: ( ( '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1584:1: ( '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1584:1: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1585:1: '}}'
            {
             before(grammarAccess.getAboutTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__AboutTemplate__Group__3__Impl3324); 
             after(grammarAccess.getAboutTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__Group__3__Impl"


    // $ANTLR start "rule__AboutTemplate__Group_2__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1606:1: rule__AboutTemplate__Group_2__0 : rule__AboutTemplate__Group_2__0__Impl rule__AboutTemplate__Group_2__1 ;
    public final void rule__AboutTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1610:1: ( rule__AboutTemplate__Group_2__0__Impl rule__AboutTemplate__Group_2__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1611:2: rule__AboutTemplate__Group_2__0__Impl rule__AboutTemplate__Group_2__1
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group_2__0__Impl_in_rule__AboutTemplate__Group_2__03363);
            rule__AboutTemplate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AboutTemplate__Group_2__1_in_rule__AboutTemplate__Group_2__03366);
            rule__AboutTemplate__Group_2__1();

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
    // $ANTLR end "rule__AboutTemplate__Group_2__0"


    // $ANTLR start "rule__AboutTemplate__Group_2__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1618:1: rule__AboutTemplate__Group_2__0__Impl : ( '|' ) ;
    public final void rule__AboutTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1622:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1623:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1623:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1624:1: '|'
            {
             before(grammarAccess.getAboutTemplateAccess().getVerticalLineKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__AboutTemplate__Group_2__0__Impl3394); 
             after(grammarAccess.getAboutTemplateAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__Group_2__0__Impl"


    // $ANTLR start "rule__AboutTemplate__Group_2__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1637:1: rule__AboutTemplate__Group_2__1 : rule__AboutTemplate__Group_2__1__Impl ;
    public final void rule__AboutTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1641:1: ( rule__AboutTemplate__Group_2__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1642:2: rule__AboutTemplate__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AboutTemplate__Group_2__1__Impl_in_rule__AboutTemplate__Group_2__13425);
            rule__AboutTemplate__Group_2__1__Impl();

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
    // $ANTLR end "rule__AboutTemplate__Group_2__1"


    // $ANTLR start "rule__AboutTemplate__Group_2__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1648:1: rule__AboutTemplate__Group_2__1__Impl : ( ( rule__AboutTemplate__ContentAssignment_2_1 ) ) ;
    public final void rule__AboutTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1652:1: ( ( ( rule__AboutTemplate__ContentAssignment_2_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1653:1: ( ( rule__AboutTemplate__ContentAssignment_2_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1653:1: ( ( rule__AboutTemplate__ContentAssignment_2_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1654:1: ( rule__AboutTemplate__ContentAssignment_2_1 )
            {
             before(grammarAccess.getAboutTemplateAccess().getContentAssignment_2_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1655:1: ( rule__AboutTemplate__ContentAssignment_2_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1655:2: rule__AboutTemplate__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AboutTemplate__ContentAssignment_2_1_in_rule__AboutTemplate__Group_2__1__Impl3452);
            rule__AboutTemplate__ContentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAboutTemplateAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__Group_2__1__Impl"


    // $ANTLR start "rule__MainTemplate__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1669:1: rule__MainTemplate__Group__0 : rule__MainTemplate__Group__0__Impl rule__MainTemplate__Group__1 ;
    public final void rule__MainTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1673:1: ( rule__MainTemplate__Group__0__Impl rule__MainTemplate__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1674:2: rule__MainTemplate__Group__0__Impl rule__MainTemplate__Group__1
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group__0__Impl_in_rule__MainTemplate__Group__03486);
            rule__MainTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainTemplate__Group__1_in_rule__MainTemplate__Group__03489);
            rule__MainTemplate__Group__1();

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
    // $ANTLR end "rule__MainTemplate__Group__0"


    // $ANTLR start "rule__MainTemplate__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1681:1: rule__MainTemplate__Group__0__Impl : ( '{{' ) ;
    public final void rule__MainTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1685:1: ( ( '{{' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1686:1: ( '{{' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1686:1: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1687:1: '{{'
            {
             before(grammarAccess.getMainTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__MainTemplate__Group__0__Impl3517); 
             after(grammarAccess.getMainTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__Group__0__Impl"


    // $ANTLR start "rule__MainTemplate__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1700:1: rule__MainTemplate__Group__1 : rule__MainTemplate__Group__1__Impl rule__MainTemplate__Group__2 ;
    public final void rule__MainTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1704:1: ( rule__MainTemplate__Group__1__Impl rule__MainTemplate__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1705:2: rule__MainTemplate__Group__1__Impl rule__MainTemplate__Group__2
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group__1__Impl_in_rule__MainTemplate__Group__13548);
            rule__MainTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainTemplate__Group__2_in_rule__MainTemplate__Group__13551);
            rule__MainTemplate__Group__2();

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
    // $ANTLR end "rule__MainTemplate__Group__1"


    // $ANTLR start "rule__MainTemplate__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1712:1: rule__MainTemplate__Group__1__Impl : ( ( rule__MainTemplate__TypeAssignment_1 ) ) ;
    public final void rule__MainTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1716:1: ( ( ( rule__MainTemplate__TypeAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1717:1: ( ( rule__MainTemplate__TypeAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1717:1: ( ( rule__MainTemplate__TypeAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1718:1: ( rule__MainTemplate__TypeAssignment_1 )
            {
             before(grammarAccess.getMainTemplateAccess().getTypeAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1719:1: ( rule__MainTemplate__TypeAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1719:2: rule__MainTemplate__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MainTemplate__TypeAssignment_1_in_rule__MainTemplate__Group__1__Impl3578);
            rule__MainTemplate__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainTemplateAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__Group__1__Impl"


    // $ANTLR start "rule__MainTemplate__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1729:1: rule__MainTemplate__Group__2 : rule__MainTemplate__Group__2__Impl rule__MainTemplate__Group__3 ;
    public final void rule__MainTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1733:1: ( rule__MainTemplate__Group__2__Impl rule__MainTemplate__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1734:2: rule__MainTemplate__Group__2__Impl rule__MainTemplate__Group__3
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group__2__Impl_in_rule__MainTemplate__Group__23608);
            rule__MainTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainTemplate__Group__3_in_rule__MainTemplate__Group__23611);
            rule__MainTemplate__Group__3();

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
    // $ANTLR end "rule__MainTemplate__Group__2"


    // $ANTLR start "rule__MainTemplate__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1741:1: rule__MainTemplate__Group__2__Impl : ( ( ( rule__MainTemplate__Group_2__0 ) ) ( ( rule__MainTemplate__Group_2__0 )* ) ) ;
    public final void rule__MainTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1745:1: ( ( ( ( rule__MainTemplate__Group_2__0 ) ) ( ( rule__MainTemplate__Group_2__0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1746:1: ( ( ( rule__MainTemplate__Group_2__0 ) ) ( ( rule__MainTemplate__Group_2__0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1746:1: ( ( ( rule__MainTemplate__Group_2__0 ) ) ( ( rule__MainTemplate__Group_2__0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1747:1: ( ( rule__MainTemplate__Group_2__0 ) ) ( ( rule__MainTemplate__Group_2__0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1747:1: ( ( rule__MainTemplate__Group_2__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1748:1: ( rule__MainTemplate__Group_2__0 )
            {
             before(grammarAccess.getMainTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1749:1: ( rule__MainTemplate__Group_2__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1749:2: rule__MainTemplate__Group_2__0
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group_2__0_in_rule__MainTemplate__Group__2__Impl3640);
            rule__MainTemplate__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMainTemplateAccess().getGroup_2()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1752:1: ( ( rule__MainTemplate__Group_2__0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1753:1: ( rule__MainTemplate__Group_2__0 )*
            {
             before(grammarAccess.getMainTemplateAccess().getGroup_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1754:1: ( rule__MainTemplate__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1754:2: rule__MainTemplate__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MainTemplate__Group_2__0_in_rule__MainTemplate__Group__2__Impl3652);
            	    rule__MainTemplate__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMainTemplateAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MainTemplate__Group__2__Impl"


    // $ANTLR start "rule__MainTemplate__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1765:1: rule__MainTemplate__Group__3 : rule__MainTemplate__Group__3__Impl ;
    public final void rule__MainTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1769:1: ( rule__MainTemplate__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1770:2: rule__MainTemplate__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group__3__Impl_in_rule__MainTemplate__Group__33685);
            rule__MainTemplate__Group__3__Impl();

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
    // $ANTLR end "rule__MainTemplate__Group__3"


    // $ANTLR start "rule__MainTemplate__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1776:1: rule__MainTemplate__Group__3__Impl : ( '}}' ) ;
    public final void rule__MainTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1780:1: ( ( '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1781:1: ( '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1781:1: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1782:1: '}}'
            {
             before(grammarAccess.getMainTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__MainTemplate__Group__3__Impl3713); 
             after(grammarAccess.getMainTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__Group__3__Impl"


    // $ANTLR start "rule__MainTemplate__Group_2__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1803:1: rule__MainTemplate__Group_2__0 : rule__MainTemplate__Group_2__0__Impl rule__MainTemplate__Group_2__1 ;
    public final void rule__MainTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1807:1: ( rule__MainTemplate__Group_2__0__Impl rule__MainTemplate__Group_2__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1808:2: rule__MainTemplate__Group_2__0__Impl rule__MainTemplate__Group_2__1
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group_2__0__Impl_in_rule__MainTemplate__Group_2__03752);
            rule__MainTemplate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MainTemplate__Group_2__1_in_rule__MainTemplate__Group_2__03755);
            rule__MainTemplate__Group_2__1();

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
    // $ANTLR end "rule__MainTemplate__Group_2__0"


    // $ANTLR start "rule__MainTemplate__Group_2__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1815:1: rule__MainTemplate__Group_2__0__Impl : ( '|' ) ;
    public final void rule__MainTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1819:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1820:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1820:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1821:1: '|'
            {
             before(grammarAccess.getMainTemplateAccess().getVerticalLineKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__MainTemplate__Group_2__0__Impl3783); 
             after(grammarAccess.getMainTemplateAccess().getVerticalLineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__Group_2__0__Impl"


    // $ANTLR start "rule__MainTemplate__Group_2__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1834:1: rule__MainTemplate__Group_2__1 : rule__MainTemplate__Group_2__1__Impl ;
    public final void rule__MainTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1838:1: ( rule__MainTemplate__Group_2__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1839:2: rule__MainTemplate__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MainTemplate__Group_2__1__Impl_in_rule__MainTemplate__Group_2__13814);
            rule__MainTemplate__Group_2__1__Impl();

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
    // $ANTLR end "rule__MainTemplate__Group_2__1"


    // $ANTLR start "rule__MainTemplate__Group_2__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1845:1: rule__MainTemplate__Group_2__1__Impl : ( ( rule__MainTemplate__ContentAssignment_2_1 ) ) ;
    public final void rule__MainTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1849:1: ( ( ( rule__MainTemplate__ContentAssignment_2_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1850:1: ( ( rule__MainTemplate__ContentAssignment_2_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1850:1: ( ( rule__MainTemplate__ContentAssignment_2_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1851:1: ( rule__MainTemplate__ContentAssignment_2_1 )
            {
             before(grammarAccess.getMainTemplateAccess().getContentAssignment_2_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1852:1: ( rule__MainTemplate__ContentAssignment_2_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1852:2: rule__MainTemplate__ContentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MainTemplate__ContentAssignment_2_1_in_rule__MainTemplate__Group_2__1__Impl3841);
            rule__MainTemplate__ContentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMainTemplateAccess().getContentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__Group_2__1__Impl"


    // $ANTLR start "rule__QuoteTemplate__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1866:1: rule__QuoteTemplate__Group__0 : rule__QuoteTemplate__Group__0__Impl rule__QuoteTemplate__Group__1 ;
    public final void rule__QuoteTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1870:1: ( rule__QuoteTemplate__Group__0__Impl rule__QuoteTemplate__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1871:2: rule__QuoteTemplate__Group__0__Impl rule__QuoteTemplate__Group__1
            {
            pushFollow(FOLLOW_rule__QuoteTemplate__Group__0__Impl_in_rule__QuoteTemplate__Group__03875);
            rule__QuoteTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuoteTemplate__Group__1_in_rule__QuoteTemplate__Group__03878);
            rule__QuoteTemplate__Group__1();

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
    // $ANTLR end "rule__QuoteTemplate__Group__0"


    // $ANTLR start "rule__QuoteTemplate__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1878:1: rule__QuoteTemplate__Group__0__Impl : ( '{{' ) ;
    public final void rule__QuoteTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1882:1: ( ( '{{' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1883:1: ( '{{' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1883:1: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1884:1: '{{'
            {
             before(grammarAccess.getQuoteTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__QuoteTemplate__Group__0__Impl3906); 
             after(grammarAccess.getQuoteTemplateAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuoteTemplate__Group__0__Impl"


    // $ANTLR start "rule__QuoteTemplate__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1897:1: rule__QuoteTemplate__Group__1 : rule__QuoteTemplate__Group__1__Impl rule__QuoteTemplate__Group__2 ;
    public final void rule__QuoteTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1901:1: ( rule__QuoteTemplate__Group__1__Impl rule__QuoteTemplate__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1902:2: rule__QuoteTemplate__Group__1__Impl rule__QuoteTemplate__Group__2
            {
            pushFollow(FOLLOW_rule__QuoteTemplate__Group__1__Impl_in_rule__QuoteTemplate__Group__13937);
            rule__QuoteTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuoteTemplate__Group__2_in_rule__QuoteTemplate__Group__13940);
            rule__QuoteTemplate__Group__2();

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
    // $ANTLR end "rule__QuoteTemplate__Group__1"


    // $ANTLR start "rule__QuoteTemplate__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1909:1: rule__QuoteTemplate__Group__1__Impl : ( ( rule__QuoteTemplate__TypeAssignment_1 ) ) ;
    public final void rule__QuoteTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1913:1: ( ( ( rule__QuoteTemplate__TypeAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1914:1: ( ( rule__QuoteTemplate__TypeAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1914:1: ( ( rule__QuoteTemplate__TypeAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1915:1: ( rule__QuoteTemplate__TypeAssignment_1 )
            {
             before(grammarAccess.getQuoteTemplateAccess().getTypeAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1916:1: ( rule__QuoteTemplate__TypeAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1916:2: rule__QuoteTemplate__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__QuoteTemplate__TypeAssignment_1_in_rule__QuoteTemplate__Group__1__Impl3967);
            rule__QuoteTemplate__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuoteTemplateAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuoteTemplate__Group__1__Impl"


    // $ANTLR start "rule__QuoteTemplate__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1926:1: rule__QuoteTemplate__Group__2 : rule__QuoteTemplate__Group__2__Impl ;
    public final void rule__QuoteTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1930:1: ( rule__QuoteTemplate__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1931:2: rule__QuoteTemplate__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QuoteTemplate__Group__2__Impl_in_rule__QuoteTemplate__Group__23997);
            rule__QuoteTemplate__Group__2__Impl();

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
    // $ANTLR end "rule__QuoteTemplate__Group__2"


    // $ANTLR start "rule__QuoteTemplate__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1937:1: rule__QuoteTemplate__Group__2__Impl : ( '}}' ) ;
    public final void rule__QuoteTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1941:1: ( ( '}}' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1942:1: ( '}}' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1942:1: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1943:1: '}}'
            {
             before(grammarAccess.getQuoteTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__QuoteTemplate__Group__2__Impl4025); 
             after(grammarAccess.getQuoteTemplateAccess().getRightCurlyBracketRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuoteTemplate__Group__2__Impl"


    // $ANTLR start "rule__OrderedList__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1962:1: rule__OrderedList__Group__0 : rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 ;
    public final void rule__OrderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1966:1: ( rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1967:2: rule__OrderedList__Group__0__Impl rule__OrderedList__Group__1
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__04062);
            rule__OrderedList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__04065);
            rule__OrderedList__Group__1();

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
    // $ANTLR end "rule__OrderedList__Group__0"


    // $ANTLR start "rule__OrderedList__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1974:1: rule__OrderedList__Group__0__Impl : ( ( ( rule__OrderedList__ItemsAssignment_0 ) ) ( ( rule__OrderedList__ItemsAssignment_0 )* ) ) ;
    public final void rule__OrderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1978:1: ( ( ( ( rule__OrderedList__ItemsAssignment_0 ) ) ( ( rule__OrderedList__ItemsAssignment_0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1979:1: ( ( ( rule__OrderedList__ItemsAssignment_0 ) ) ( ( rule__OrderedList__ItemsAssignment_0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1979:1: ( ( ( rule__OrderedList__ItemsAssignment_0 ) ) ( ( rule__OrderedList__ItemsAssignment_0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1980:1: ( ( rule__OrderedList__ItemsAssignment_0 ) ) ( ( rule__OrderedList__ItemsAssignment_0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1980:1: ( ( rule__OrderedList__ItemsAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1981:1: ( rule__OrderedList__ItemsAssignment_0 )
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1982:1: ( rule__OrderedList__ItemsAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1982:2: rule__OrderedList__ItemsAssignment_0
            {
            pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_0_in_rule__OrderedList__Group__0__Impl4094);
            rule__OrderedList__ItemsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_0()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1985:1: ( ( rule__OrderedList__ItemsAssignment_0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1986:1: ( rule__OrderedList__ItemsAssignment_0 )*
            {
             before(grammarAccess.getOrderedListAccess().getItemsAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1987:1: ( rule__OrderedList__ItemsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1987:2: rule__OrderedList__ItemsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__OrderedList__ItemsAssignment_0_in_rule__OrderedList__Group__0__Impl4106);
            	    rule__OrderedList__ItemsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOrderedListAccess().getItemsAssignment_0()); 

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
    // $ANTLR end "rule__OrderedList__Group__0__Impl"


    // $ANTLR start "rule__OrderedList__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1998:1: rule__OrderedList__Group__1 : rule__OrderedList__Group__1__Impl ;
    public final void rule__OrderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2002:1: ( rule__OrderedList__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2003:2: rule__OrderedList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__14139);
            rule__OrderedList__Group__1__Impl();

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
    // $ANTLR end "rule__OrderedList__Group__1"


    // $ANTLR start "rule__OrderedList__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2009:1: rule__OrderedList__Group__1__Impl : ( ( rule__OrderedList__EndAssignment_1 ) ) ;
    public final void rule__OrderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2013:1: ( ( ( rule__OrderedList__EndAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2014:1: ( ( rule__OrderedList__EndAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2014:1: ( ( rule__OrderedList__EndAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2015:1: ( rule__OrderedList__EndAssignment_1 )
            {
             before(grammarAccess.getOrderedListAccess().getEndAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2016:1: ( rule__OrderedList__EndAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2016:2: rule__OrderedList__EndAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderedList__EndAssignment_1_in_rule__OrderedList__Group__1__Impl4166);
            rule__OrderedList__EndAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderedListAccess().getEndAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedList__Group__1__Impl"


    // $ANTLR start "rule__UnorderedList__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2030:1: rule__UnorderedList__Group__0 : rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
    public final void rule__UnorderedList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2034:1: ( rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2035:2: rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__04200);
            rule__UnorderedList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__04203);
            rule__UnorderedList__Group__1();

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
    // $ANTLR end "rule__UnorderedList__Group__0"


    // $ANTLR start "rule__UnorderedList__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2042:1: rule__UnorderedList__Group__0__Impl : ( ( ( rule__UnorderedList__ItemsAssignment_0 ) ) ( ( rule__UnorderedList__ItemsAssignment_0 )* ) ) ;
    public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2046:1: ( ( ( ( rule__UnorderedList__ItemsAssignment_0 ) ) ( ( rule__UnorderedList__ItemsAssignment_0 )* ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2047:1: ( ( ( rule__UnorderedList__ItemsAssignment_0 ) ) ( ( rule__UnorderedList__ItemsAssignment_0 )* ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2047:1: ( ( ( rule__UnorderedList__ItemsAssignment_0 ) ) ( ( rule__UnorderedList__ItemsAssignment_0 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2048:1: ( ( rule__UnorderedList__ItemsAssignment_0 ) ) ( ( rule__UnorderedList__ItemsAssignment_0 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2048:1: ( ( rule__UnorderedList__ItemsAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2049:1: ( rule__UnorderedList__ItemsAssignment_0 )
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2050:1: ( rule__UnorderedList__ItemsAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2050:2: rule__UnorderedList__ItemsAssignment_0
            {
            pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_0_in_rule__UnorderedList__Group__0__Impl4232);
            rule__UnorderedList__ItemsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_0()); 

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2053:1: ( ( rule__UnorderedList__ItemsAssignment_0 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2054:1: ( rule__UnorderedList__ItemsAssignment_0 )*
            {
             before(grammarAccess.getUnorderedListAccess().getItemsAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2055:1: ( rule__UnorderedList__ItemsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=15)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2055:2: rule__UnorderedList__ItemsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__UnorderedList__ItemsAssignment_0_in_rule__UnorderedList__Group__0__Impl4244);
            	    rule__UnorderedList__ItemsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUnorderedListAccess().getItemsAssignment_0()); 

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
    // $ANTLR end "rule__UnorderedList__Group__0__Impl"


    // $ANTLR start "rule__UnorderedList__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2066:1: rule__UnorderedList__Group__1 : rule__UnorderedList__Group__1__Impl ;
    public final void rule__UnorderedList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2070:1: ( rule__UnorderedList__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2071:2: rule__UnorderedList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__14277);
            rule__UnorderedList__Group__1__Impl();

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
    // $ANTLR end "rule__UnorderedList__Group__1"


    // $ANTLR start "rule__UnorderedList__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2077:1: rule__UnorderedList__Group__1__Impl : ( ( rule__UnorderedList__EndAssignment_1 ) ) ;
    public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2081:1: ( ( ( rule__UnorderedList__EndAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2082:1: ( ( rule__UnorderedList__EndAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2082:1: ( ( rule__UnorderedList__EndAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2083:1: ( rule__UnorderedList__EndAssignment_1 )
            {
             before(grammarAccess.getUnorderedListAccess().getEndAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2084:1: ( rule__UnorderedList__EndAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2084:2: rule__UnorderedList__EndAssignment_1
            {
            pushFollow(FOLLOW_rule__UnorderedList__EndAssignment_1_in_rule__UnorderedList__Group__1__Impl4304);
            rule__UnorderedList__EndAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnorderedListAccess().getEndAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedList__Group__1__Impl"


    // $ANTLR start "rule__UnorderListItem__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2098:1: rule__UnorderListItem__Group__0 : rule__UnorderListItem__Group__0__Impl rule__UnorderListItem__Group__1 ;
    public final void rule__UnorderListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2102:1: ( rule__UnorderListItem__Group__0__Impl rule__UnorderListItem__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2103:2: rule__UnorderListItem__Group__0__Impl rule__UnorderListItem__Group__1
            {
            pushFollow(FOLLOW_rule__UnorderListItem__Group__0__Impl_in_rule__UnorderListItem__Group__04338);
            rule__UnorderListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnorderListItem__Group__1_in_rule__UnorderListItem__Group__04341);
            rule__UnorderListItem__Group__1();

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
    // $ANTLR end "rule__UnorderListItem__Group__0"


    // $ANTLR start "rule__UnorderListItem__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2110:1: rule__UnorderListItem__Group__0__Impl : ( ( rule__UnorderListItem__LevelAssignment_0 ) ) ;
    public final void rule__UnorderListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2114:1: ( ( ( rule__UnorderListItem__LevelAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2115:1: ( ( rule__UnorderListItem__LevelAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2115:1: ( ( rule__UnorderListItem__LevelAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2116:1: ( rule__UnorderListItem__LevelAssignment_0 )
            {
             before(grammarAccess.getUnorderListItemAccess().getLevelAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2117:1: ( rule__UnorderListItem__LevelAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2117:2: rule__UnorderListItem__LevelAssignment_0
            {
            pushFollow(FOLLOW_rule__UnorderListItem__LevelAssignment_0_in_rule__UnorderListItem__Group__0__Impl4368);
            rule__UnorderListItem__LevelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderListItemAccess().getLevelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderListItem__Group__0__Impl"


    // $ANTLR start "rule__UnorderListItem__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2127:1: rule__UnorderListItem__Group__1 : rule__UnorderListItem__Group__1__Impl ;
    public final void rule__UnorderListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2131:1: ( rule__UnorderListItem__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2132:2: rule__UnorderListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnorderListItem__Group__1__Impl_in_rule__UnorderListItem__Group__14398);
            rule__UnorderListItem__Group__1__Impl();

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
    // $ANTLR end "rule__UnorderListItem__Group__1"


    // $ANTLR start "rule__UnorderListItem__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2138:1: rule__UnorderListItem__Group__1__Impl : ( ( rule__UnorderListItem__ItemtextAssignment_1 ) ) ;
    public final void rule__UnorderListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2142:1: ( ( ( rule__UnorderListItem__ItemtextAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2143:1: ( ( rule__UnorderListItem__ItemtextAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2143:1: ( ( rule__UnorderListItem__ItemtextAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2144:1: ( rule__UnorderListItem__ItemtextAssignment_1 )
            {
             before(grammarAccess.getUnorderListItemAccess().getItemtextAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2145:1: ( rule__UnorderListItem__ItemtextAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2145:2: rule__UnorderListItem__ItemtextAssignment_1
            {
            pushFollow(FOLLOW_rule__UnorderListItem__ItemtextAssignment_1_in_rule__UnorderListItem__Group__1__Impl4425);
            rule__UnorderListItem__ItemtextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnorderListItemAccess().getItemtextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderListItem__Group__1__Impl"


    // $ANTLR start "rule__OrderListItem__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2159:1: rule__OrderListItem__Group__0 : rule__OrderListItem__Group__0__Impl rule__OrderListItem__Group__1 ;
    public final void rule__OrderListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2163:1: ( rule__OrderListItem__Group__0__Impl rule__OrderListItem__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2164:2: rule__OrderListItem__Group__0__Impl rule__OrderListItem__Group__1
            {
            pushFollow(FOLLOW_rule__OrderListItem__Group__0__Impl_in_rule__OrderListItem__Group__04459);
            rule__OrderListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrderListItem__Group__1_in_rule__OrderListItem__Group__04462);
            rule__OrderListItem__Group__1();

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
    // $ANTLR end "rule__OrderListItem__Group__0"


    // $ANTLR start "rule__OrderListItem__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2171:1: rule__OrderListItem__Group__0__Impl : ( '#' ) ;
    public final void rule__OrderListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2175:1: ( ( '#' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2176:1: ( '#' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2176:1: ( '#' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2177:1: '#'
            {
             before(grammarAccess.getOrderListItemAccess().getNumberSignKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__OrderListItem__Group__0__Impl4490); 
             after(grammarAccess.getOrderListItemAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderListItem__Group__0__Impl"


    // $ANTLR start "rule__OrderListItem__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2190:1: rule__OrderListItem__Group__1 : rule__OrderListItem__Group__1__Impl ;
    public final void rule__OrderListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2194:1: ( rule__OrderListItem__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2195:2: rule__OrderListItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrderListItem__Group__1__Impl_in_rule__OrderListItem__Group__14521);
            rule__OrderListItem__Group__1__Impl();

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
    // $ANTLR end "rule__OrderListItem__Group__1"


    // $ANTLR start "rule__OrderListItem__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2201:1: rule__OrderListItem__Group__1__Impl : ( ( rule__OrderListItem__ItemtextAssignment_1 ) ) ;
    public final void rule__OrderListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2205:1: ( ( ( rule__OrderListItem__ItemtextAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2206:1: ( ( rule__OrderListItem__ItemtextAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2206:1: ( ( rule__OrderListItem__ItemtextAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2207:1: ( rule__OrderListItem__ItemtextAssignment_1 )
            {
             before(grammarAccess.getOrderListItemAccess().getItemtextAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2208:1: ( rule__OrderListItem__ItemtextAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2208:2: rule__OrderListItem__ItemtextAssignment_1
            {
            pushFollow(FOLLOW_rule__OrderListItem__ItemtextAssignment_1_in_rule__OrderListItem__Group__1__Impl4548);
            rule__OrderListItem__ItemtextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderListItemAccess().getItemtextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderListItem__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2222:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2226:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2227:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04582);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04585);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2234:1: rule__Image__Group__0__Impl : ( '[[' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2238:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2239:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2239:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2240:1: '[['
            {
             before(grammarAccess.getImageAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Image__Group__0__Impl4613); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2253:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2257:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2258:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14644);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14647);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2265:1: rule__Image__Group__1__Impl : ( 'File:' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2269:1: ( ( 'File:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2270:1: ( 'File:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2270:1: ( 'File:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2271:1: 'File:'
            {
             before(grammarAccess.getImageAccess().getFileKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Image__Group__1__Impl4675); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2284:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2288:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2289:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24706);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24709);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2296:1: rule__Image__Group__2__Impl : ( ( rule__Image__NameAssignment_2 ) ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2300:1: ( ( ( rule__Image__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2301:1: ( ( rule__Image__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2301:1: ( ( rule__Image__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2302:1: ( rule__Image__NameAssignment_2 )
            {
             before(grammarAccess.getImageAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2303:1: ( rule__Image__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2303:2: rule__Image__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4736);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2313:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2317:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2318:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34766);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34769);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2325:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2329:1: ( ( ( rule__Image__Group_3__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2330:1: ( ( rule__Image__Group_3__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2330:1: ( ( rule__Image__Group_3__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2331:1: ( rule__Image__Group_3__0 )
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2332:1: ( rule__Image__Group_3__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2332:2: rule__Image__Group_3__0
            {
            pushFollow(FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4796);
            rule__Image__Group_3__0();

            state._fsp--;


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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2342:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2346:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2347:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44826);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44829);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2354:1: rule__Image__Group__4__Impl : ( ( rule__Image__Group_4__0 )? ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2358:1: ( ( ( rule__Image__Group_4__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2359:1: ( ( rule__Image__Group_4__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2359:1: ( ( rule__Image__Group_4__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2360:1: ( rule__Image__Group_4__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2361:1: ( rule__Image__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==13) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2361:2: rule__Image__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4856);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2371:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2375:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2376:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54887);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54890);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2383:1: rule__Image__Group__5__Impl : ( ( rule__Image__Group_5__0 )? ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2387:1: ( ( ( rule__Image__Group_5__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2388:1: ( ( rule__Image__Group_5__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2388:1: ( ( rule__Image__Group_5__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2389:1: ( rule__Image__Group_5__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_5()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2390:1: ( rule__Image__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2390:2: rule__Image__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4917);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2400:1: rule__Image__Group__6 : rule__Image__Group__6__Impl rule__Image__Group__7 ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2404:1: ( rule__Image__Group__6__Impl rule__Image__Group__7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2405:2: rule__Image__Group__6__Impl rule__Image__Group__7
            {
            pushFollow(FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64948);
            rule__Image__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64951);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2412:1: rule__Image__Group__6__Impl : ( '|' ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2416:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2417:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2417:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2418:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__Image__Group__6__Impl4979); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2431:1: rule__Image__Group__7 : rule__Image__Group__7__Impl rule__Image__Group__8 ;
    public final void rule__Image__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2435:1: ( rule__Image__Group__7__Impl rule__Image__Group__8 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2436:2: rule__Image__Group__7__Impl rule__Image__Group__8
            {
            pushFollow(FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__75010);
            rule__Image__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group__8_in_rule__Image__Group__75013);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2443:1: rule__Image__Group__7__Impl : ( ( rule__Image__CaptionAssignment_7 ) ) ;
    public final void rule__Image__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2447:1: ( ( ( rule__Image__CaptionAssignment_7 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2448:1: ( ( rule__Image__CaptionAssignment_7 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2448:1: ( ( rule__Image__CaptionAssignment_7 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2449:1: ( rule__Image__CaptionAssignment_7 )
            {
             before(grammarAccess.getImageAccess().getCaptionAssignment_7()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2450:1: ( rule__Image__CaptionAssignment_7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2450:2: rule__Image__CaptionAssignment_7
            {
            pushFollow(FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl5040);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2460:1: rule__Image__Group__8 : rule__Image__Group__8__Impl ;
    public final void rule__Image__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2464:1: ( rule__Image__Group__8__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2465:2: rule__Image__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__85070);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2471:1: rule__Image__Group__8__Impl : ( ']]' ) ;
    public final void rule__Image__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2475:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2476:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2476:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2477:1: ']]'
            {
             before(grammarAccess.getImageAccess().getRightSquareBracketRightSquareBracketKeyword_8()); 
            match(input,25,FOLLOW_25_in_rule__Image__Group__8__Impl5098); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2508:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2512:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2513:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
            {
            pushFollow(FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__05147);
            rule__Image__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__05150);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2520:1: rule__Image__Group_3__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2524:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2525:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2525:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2526:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Image__Group_3__0__Impl5178); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2539:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2543:1: ( rule__Image__Group_3__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2544:2: rule__Image__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__15209);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2550:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__TypeAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2554:1: ( ( ( rule__Image__TypeAssignment_3_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2555:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2555:1: ( ( rule__Image__TypeAssignment_3_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2556:1: ( rule__Image__TypeAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getTypeAssignment_3_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2557:1: ( rule__Image__TypeAssignment_3_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2557:2: rule__Image__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl5236);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2571:1: rule__Image__Group_4__0 : rule__Image__Group_4__0__Impl rule__Image__Group_4__1 ;
    public final void rule__Image__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2575:1: ( rule__Image__Group_4__0__Impl rule__Image__Group_4__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2576:2: rule__Image__Group_4__0__Impl rule__Image__Group_4__1
            {
            pushFollow(FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__05270);
            rule__Image__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__05273);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2583:1: rule__Image__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Image__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2587:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2588:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2588:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2589:1: '|'
            {
             before(grammarAccess.getImageAccess().getVerticalLineKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Image__Group_4__0__Impl5301); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2602:1: rule__Image__Group_4__1 : rule__Image__Group_4__1__Impl ;
    public final void rule__Image__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2606:1: ( rule__Image__Group_4__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2607:2: rule__Image__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__15332);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2613:1: rule__Image__Group_4__1__Impl : ( ( rule__Image__HAlignAssignment_4_1 ) ) ;
    public final void rule__Image__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2617:1: ( ( ( rule__Image__HAlignAssignment_4_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2618:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2618:1: ( ( rule__Image__HAlignAssignment_4_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2619:1: ( rule__Image__HAlignAssignment_4_1 )
            {
             before(grammarAccess.getImageAccess().getHAlignAssignment_4_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2620:1: ( rule__Image__HAlignAssignment_4_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2620:2: rule__Image__HAlignAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl5359);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2634:1: rule__Image__Group_5__0 : rule__Image__Group_5__0__Impl rule__Image__Group_5__1 ;
    public final void rule__Image__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2638:1: ( rule__Image__Group_5__0__Impl rule__Image__Group_5__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2639:2: rule__Image__Group_5__0__Impl rule__Image__Group_5__1
            {
            pushFollow(FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__05393);
            rule__Image__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__05396);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2646:1: rule__Image__Group_5__0__Impl : ( '|alt=' ) ;
    public final void rule__Image__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2650:1: ( ( '|alt=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2651:1: ( '|alt=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2651:1: ( '|alt=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2652:1: '|alt='
            {
             before(grammarAccess.getImageAccess().getAltKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__Image__Group_5__0__Impl5424); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2665:1: rule__Image__Group_5__1 : rule__Image__Group_5__1__Impl ;
    public final void rule__Image__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2669:1: ( rule__Image__Group_5__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2670:2: rule__Image__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15455);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2676:1: rule__Image__Group_5__1__Impl : ( ( rule__Image__AltTextAssignment_5_1 ) ) ;
    public final void rule__Image__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2680:1: ( ( ( rule__Image__AltTextAssignment_5_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2681:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2681:1: ( ( rule__Image__AltTextAssignment_5_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2682:1: ( rule__Image__AltTextAssignment_5_1 )
            {
             before(grammarAccess.getImageAccess().getAltTextAssignment_5_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2683:1: ( rule__Image__AltTextAssignment_5_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2683:2: rule__Image__AltTextAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5482);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2697:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2701:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2702:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05516);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05519);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2709:1: rule__Category__Group__0__Impl : ( '[[' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2713:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2714:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2714:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2715:1: '[['
            {
             before(grammarAccess.getCategoryAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Category__Group__0__Impl5547); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2728:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2732:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2733:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15578);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15581);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2740:1: rule__Category__Group__1__Impl : ( 'Category:' ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2744:1: ( ( 'Category:' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2745:1: ( 'Category:' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2745:1: ( 'Category:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2746:1: 'Category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Category__Group__1__Impl5609); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2759:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2763:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2764:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25640);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25643);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2771:1: rule__Category__Group__2__Impl : ( ( rule__Category__NameAssignment_2 ) ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2775:1: ( ( ( rule__Category__NameAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2776:1: ( ( rule__Category__NameAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2776:1: ( ( rule__Category__NameAssignment_2 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2777:1: ( rule__Category__NameAssignment_2 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2778:1: ( rule__Category__NameAssignment_2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2778:2: rule__Category__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5670);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2788:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2792:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2793:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35700);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35703);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2800:1: rule__Category__Group__3__Impl : ( ( rule__Category__ValueAssignment_3 )? ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2804:1: ( ( ( rule__Category__ValueAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2805:1: ( ( rule__Category__ValueAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2805:1: ( ( rule__Category__ValueAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2806:1: ( rule__Category__ValueAssignment_3 )?
            {
             before(grammarAccess.getCategoryAccess().getValueAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2807:1: ( rule__Category__ValueAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2807:2: rule__Category__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5730);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2817:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2821:1: ( rule__Category__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2822:2: rule__Category__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45761);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2828:1: rule__Category__Group__4__Impl : ( ']]' ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2832:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2833:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2833:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2834:1: ']]'
            {
             before(grammarAccess.getCategoryAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Category__Group__4__Impl5789); 
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


    // $ANTLR start "rule__Heading2__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2857:1: rule__Heading2__Group__0 : rule__Heading2__Group__0__Impl rule__Heading2__Group__1 ;
    public final void rule__Heading2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2861:1: ( rule__Heading2__Group__0__Impl rule__Heading2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2862:2: rule__Heading2__Group__0__Impl rule__Heading2__Group__1
            {
            pushFollow(FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05830);
            rule__Heading2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05833);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2869:1: rule__Heading2__Group__0__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2873:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2874:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2874:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2875:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Heading2__Group__0__Impl5861); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2888:1: rule__Heading2__Group__1 : rule__Heading2__Group__1__Impl rule__Heading2__Group__2 ;
    public final void rule__Heading2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2892:1: ( rule__Heading2__Group__1__Impl rule__Heading2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2893:2: rule__Heading2__Group__1__Impl rule__Heading2__Group__2
            {
            pushFollow(FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15892);
            rule__Heading2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15895);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2900:1: rule__Heading2__Group__1__Impl : ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) ;
    public final void rule__Heading2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2904:1: ( ( ( rule__Heading2__HeadingValue2Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2905:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2905:1: ( ( rule__Heading2__HeadingValue2Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2906:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2907:1: ( rule__Heading2__HeadingValue2Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2907:2: rule__Heading2__HeadingValue2Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5922);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2917:1: rule__Heading2__Group__2 : rule__Heading2__Group__2__Impl ;
    public final void rule__Heading2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2921:1: ( rule__Heading2__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2922:2: rule__Heading2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25952);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2928:1: rule__Heading2__Group__2__Impl : ( '==' ) ;
    public final void rule__Heading2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2932:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2933:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2933:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2934:1: '=='
            {
             before(grammarAccess.getHeading2Access().getEqualsSignEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Heading2__Group__2__Impl5980); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2953:1: rule__Heading3__Group__0 : rule__Heading3__Group__0__Impl rule__Heading3__Group__1 ;
    public final void rule__Heading3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2957:1: ( rule__Heading3__Group__0__Impl rule__Heading3__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2958:2: rule__Heading3__Group__0__Impl rule__Heading3__Group__1
            {
            pushFollow(FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__06017);
            rule__Heading3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__06020);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2965:1: rule__Heading3__Group__0__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2969:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2970:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2970:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2971:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Heading3__Group__0__Impl6048); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2984:1: rule__Heading3__Group__1 : rule__Heading3__Group__1__Impl rule__Heading3__Group__2 ;
    public final void rule__Heading3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2988:1: ( rule__Heading3__Group__1__Impl rule__Heading3__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2989:2: rule__Heading3__Group__1__Impl rule__Heading3__Group__2
            {
            pushFollow(FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__16079);
            rule__Heading3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__16082);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2996:1: rule__Heading3__Group__1__Impl : ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) ;
    public final void rule__Heading3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3000:1: ( ( ( rule__Heading3__HeadingValue3Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3001:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3001:1: ( ( rule__Heading3__HeadingValue3Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3002:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3003:1: ( rule__Heading3__HeadingValue3Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3003:2: rule__Heading3__HeadingValue3Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl6109);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3013:1: rule__Heading3__Group__2 : rule__Heading3__Group__2__Impl ;
    public final void rule__Heading3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3017:1: ( rule__Heading3__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3018:2: rule__Heading3__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__26139);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3024:1: rule__Heading3__Group__2__Impl : ( '===' ) ;
    public final void rule__Heading3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3028:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3029:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3029:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3030:1: '==='
            {
             before(grammarAccess.getHeading3Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Heading3__Group__2__Impl6167); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3049:1: rule__Heading4__Group__0 : rule__Heading4__Group__0__Impl rule__Heading4__Group__1 ;
    public final void rule__Heading4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3053:1: ( rule__Heading4__Group__0__Impl rule__Heading4__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3054:2: rule__Heading4__Group__0__Impl rule__Heading4__Group__1
            {
            pushFollow(FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__06204);
            rule__Heading4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__06207);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3061:1: rule__Heading4__Group__0__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3065:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3066:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3066:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3067:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Heading4__Group__0__Impl6235); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3080:1: rule__Heading4__Group__1 : rule__Heading4__Group__1__Impl rule__Heading4__Group__2 ;
    public final void rule__Heading4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3084:1: ( rule__Heading4__Group__1__Impl rule__Heading4__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3085:2: rule__Heading4__Group__1__Impl rule__Heading4__Group__2
            {
            pushFollow(FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16266);
            rule__Heading4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16269);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3092:1: rule__Heading4__Group__1__Impl : ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) ;
    public final void rule__Heading4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3096:1: ( ( ( rule__Heading4__HeadingValue4Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3097:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3097:1: ( ( rule__Heading4__HeadingValue4Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3098:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3099:1: ( rule__Heading4__HeadingValue4Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3099:2: rule__Heading4__HeadingValue4Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6296);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3109:1: rule__Heading4__Group__2 : rule__Heading4__Group__2__Impl ;
    public final void rule__Heading4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3113:1: ( rule__Heading4__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3114:2: rule__Heading4__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26326);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3120:1: rule__Heading4__Group__2__Impl : ( '====' ) ;
    public final void rule__Heading4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3124:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3125:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3125:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3126:1: '===='
            {
             before(grammarAccess.getHeading4Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Heading4__Group__2__Impl6354); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3145:1: rule__Heading5__Group__0 : rule__Heading5__Group__0__Impl rule__Heading5__Group__1 ;
    public final void rule__Heading5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3149:1: ( rule__Heading5__Group__0__Impl rule__Heading5__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3150:2: rule__Heading5__Group__0__Impl rule__Heading5__Group__1
            {
            pushFollow(FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06391);
            rule__Heading5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06394);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3157:1: rule__Heading5__Group__0__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3161:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3162:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3162:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3163:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Heading5__Group__0__Impl6422); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3176:1: rule__Heading5__Group__1 : rule__Heading5__Group__1__Impl rule__Heading5__Group__2 ;
    public final void rule__Heading5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3180:1: ( rule__Heading5__Group__1__Impl rule__Heading5__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3181:2: rule__Heading5__Group__1__Impl rule__Heading5__Group__2
            {
            pushFollow(FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16453);
            rule__Heading5__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16456);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3188:1: rule__Heading5__Group__1__Impl : ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) ;
    public final void rule__Heading5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3192:1: ( ( ( rule__Heading5__HeadingValue5Assignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3193:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3193:1: ( ( rule__Heading5__HeadingValue5Assignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3194:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5Assignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3195:1: ( rule__Heading5__HeadingValue5Assignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3195:2: rule__Heading5__HeadingValue5Assignment_1
            {
            pushFollow(FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6483);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3205:1: rule__Heading5__Group__2 : rule__Heading5__Group__2__Impl ;
    public final void rule__Heading5__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3209:1: ( rule__Heading5__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3210:2: rule__Heading5__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26513);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3216:1: rule__Heading5__Group__2__Impl : ( '=====' ) ;
    public final void rule__Heading5__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3220:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3221:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3221:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3222:1: '====='
            {
             before(grammarAccess.getHeading5Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Heading5__Group__2__Impl6541); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3241:1: rule__Bold__Group__0 : rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
    public final void rule__Bold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3245:1: ( rule__Bold__Group__0__Impl rule__Bold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3246:2: rule__Bold__Group__0__Impl rule__Bold__Group__1
            {
            pushFollow(FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06578);
            rule__Bold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06581);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3253:1: rule__Bold__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3257:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3258:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3258:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3259:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Bold__Group__0__Impl6609); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3272:1: rule__Bold__Group__1 : rule__Bold__Group__1__Impl rule__Bold__Group__2 ;
    public final void rule__Bold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3276:1: ( rule__Bold__Group__1__Impl rule__Bold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3277:2: rule__Bold__Group__1__Impl rule__Bold__Group__2
            {
            pushFollow(FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16640);
            rule__Bold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16643);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3284:1: rule__Bold__Group__1__Impl : ( ( rule__Bold__NameAssignment_1 ) ) ;
    public final void rule__Bold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3288:1: ( ( ( rule__Bold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3289:1: ( ( rule__Bold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3289:1: ( ( rule__Bold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3290:1: ( rule__Bold__NameAssignment_1 )
            {
             before(grammarAccess.getBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3291:1: ( rule__Bold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3291:2: rule__Bold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6670);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3301:1: rule__Bold__Group__2 : rule__Bold__Group__2__Impl ;
    public final void rule__Bold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3305:1: ( rule__Bold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3306:2: rule__Bold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26700);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3312:1: rule__Bold__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__Bold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3316:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3317:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3317:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3318:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Bold__Group__2__Impl6728); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3337:1: rule__Italic__Group__0 : rule__Italic__Group__0__Impl rule__Italic__Group__1 ;
    public final void rule__Italic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3341:1: ( rule__Italic__Group__0__Impl rule__Italic__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3342:2: rule__Italic__Group__0__Impl rule__Italic__Group__1
            {
            pushFollow(FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06765);
            rule__Italic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06768);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3349:1: rule__Italic__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3353:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3354:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3354:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3355:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Italic__Group__0__Impl6796); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3368:1: rule__Italic__Group__1 : rule__Italic__Group__1__Impl rule__Italic__Group__2 ;
    public final void rule__Italic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3372:1: ( rule__Italic__Group__1__Impl rule__Italic__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3373:2: rule__Italic__Group__1__Impl rule__Italic__Group__2
            {
            pushFollow(FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16827);
            rule__Italic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16830);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3380:1: rule__Italic__Group__1__Impl : ( ( rule__Italic__NameAssignment_1 ) ) ;
    public final void rule__Italic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3384:1: ( ( ( rule__Italic__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3385:1: ( ( rule__Italic__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3385:1: ( ( rule__Italic__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3386:1: ( rule__Italic__NameAssignment_1 )
            {
             before(grammarAccess.getItalicAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3387:1: ( rule__Italic__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3387:2: rule__Italic__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6857);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3397:1: rule__Italic__Group__2 : rule__Italic__Group__2__Impl ;
    public final void rule__Italic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3401:1: ( rule__Italic__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3402:2: rule__Italic__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26887);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3408:1: rule__Italic__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__Italic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3412:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3413:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3413:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3414:1: '\\'\\''
            {
             before(grammarAccess.getItalicAccess().getApostropheApostropheKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Italic__Group__2__Impl6915); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3433:1: rule__ItalicBold__Group__0 : rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 ;
    public final void rule__ItalicBold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3437:1: ( rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3438:2: rule__ItalicBold__Group__0__Impl rule__ItalicBold__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06952);
            rule__ItalicBold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06955);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3445:1: rule__ItalicBold__Group__0__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3449:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3450:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3450:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3451:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__ItalicBold__Group__0__Impl6983); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3464:1: rule__ItalicBold__Group__1 : rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 ;
    public final void rule__ItalicBold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3468:1: ( rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3469:2: rule__ItalicBold__Group__1__Impl rule__ItalicBold__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__17014);
            rule__ItalicBold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__17017);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3476:1: rule__ItalicBold__Group__1__Impl : ( ( rule__ItalicBold__NameAssignment_1 ) ) ;
    public final void rule__ItalicBold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3480:1: ( ( ( rule__ItalicBold__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3481:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3481:1: ( ( rule__ItalicBold__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3482:1: ( rule__ItalicBold__NameAssignment_1 )
            {
             before(grammarAccess.getItalicBoldAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3483:1: ( rule__ItalicBold__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3483:2: rule__ItalicBold__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl7044);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3493:1: rule__ItalicBold__Group__2 : rule__ItalicBold__Group__2__Impl ;
    public final void rule__ItalicBold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3497:1: ( rule__ItalicBold__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3498:2: rule__ItalicBold__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__27074);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3504:1: rule__ItalicBold__Group__2__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__ItalicBold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3508:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3509:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3509:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3510:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getItalicBoldAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__ItalicBold__Group__2__Impl7102); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3529:1: rule__Internal__Group__0 : rule__Internal__Group__0__Impl rule__Internal__Group__1 ;
    public final void rule__Internal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3533:1: ( rule__Internal__Group__0__Impl rule__Internal__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3534:2: rule__Internal__Group__0__Impl rule__Internal__Group__1
            {
            pushFollow(FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__07139);
            rule__Internal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__07142);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3541:1: rule__Internal__Group__0__Impl : ( () ) ;
    public final void rule__Internal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3545:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3546:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3546:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3547:1: ()
            {
             before(grammarAccess.getInternalAccess().getInternalAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3548:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3550:1: 
            {
            }

             after(grammarAccess.getInternalAccess().getInternalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group__0__Impl"


    // $ANTLR start "rule__Internal__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3560:1: rule__Internal__Group__1 : rule__Internal__Group__1__Impl rule__Internal__Group__2 ;
    public final void rule__Internal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3564:1: ( rule__Internal__Group__1__Impl rule__Internal__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3565:2: rule__Internal__Group__1__Impl rule__Internal__Group__2
            {
            pushFollow(FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__17200);
            rule__Internal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__17203);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3572:1: rule__Internal__Group__1__Impl : ( '[[' ) ;
    public final void rule__Internal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3576:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3577:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3577:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3578:1: '[['
            {
             before(grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Internal__Group__1__Impl7231); 
             after(grammarAccess.getInternalAccess().getLeftSquareBracketLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3591:1: rule__Internal__Group__2 : rule__Internal__Group__2__Impl rule__Internal__Group__3 ;
    public final void rule__Internal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3595:1: ( rule__Internal__Group__2__Impl rule__Internal__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3596:2: rule__Internal__Group__2__Impl rule__Internal__Group__3
            {
            pushFollow(FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__27262);
            rule__Internal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__3_in_rule__Internal__Group__27265);
            rule__Internal__Group__3();

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3603:1: rule__Internal__Group__2__Impl : ( ( rule__Internal__LinkAssignment_2 )? ) ;
    public final void rule__Internal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3607:1: ( ( ( rule__Internal__LinkAssignment_2 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3608:1: ( ( rule__Internal__LinkAssignment_2 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3608:1: ( ( rule__Internal__LinkAssignment_2 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3609:1: ( rule__Internal__LinkAssignment_2 )?
            {
             before(grammarAccess.getInternalAccess().getLinkAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3610:1: ( rule__Internal__LinkAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3610:2: rule__Internal__LinkAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Internal__LinkAssignment_2_in_rule__Internal__Group__2__Impl7292);
                    rule__Internal__LinkAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalAccess().getLinkAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Internal__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3620:1: rule__Internal__Group__3 : rule__Internal__Group__3__Impl rule__Internal__Group__4 ;
    public final void rule__Internal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3624:1: ( rule__Internal__Group__3__Impl rule__Internal__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3625:2: rule__Internal__Group__3__Impl rule__Internal__Group__4
            {
            pushFollow(FOLLOW_rule__Internal__Group__3__Impl_in_rule__Internal__Group__37323);
            rule__Internal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__4_in_rule__Internal__Group__37326);
            rule__Internal__Group__4();

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
    // $ANTLR end "rule__Internal__Group__3"


    // $ANTLR start "rule__Internal__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3632:1: rule__Internal__Group__3__Impl : ( ( rule__Internal__Group_3__0 )? ) ;
    public final void rule__Internal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3636:1: ( ( ( rule__Internal__Group_3__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3637:1: ( ( rule__Internal__Group_3__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3637:1: ( ( rule__Internal__Group_3__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3638:1: ( rule__Internal__Group_3__0 )?
            {
             before(grammarAccess.getInternalAccess().getGroup_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3639:1: ( rule__Internal__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3639:2: rule__Internal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Internal__Group_3__0_in_rule__Internal__Group__3__Impl7353);
                    rule__Internal__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group__3__Impl"


    // $ANTLR start "rule__Internal__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3649:1: rule__Internal__Group__4 : rule__Internal__Group__4__Impl rule__Internal__Group__5 ;
    public final void rule__Internal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3653:1: ( rule__Internal__Group__4__Impl rule__Internal__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3654:2: rule__Internal__Group__4__Impl rule__Internal__Group__5
            {
            pushFollow(FOLLOW_rule__Internal__Group__4__Impl_in_rule__Internal__Group__47384);
            rule__Internal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group__5_in_rule__Internal__Group__47387);
            rule__Internal__Group__5();

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
    // $ANTLR end "rule__Internal__Group__4"


    // $ANTLR start "rule__Internal__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3661:1: rule__Internal__Group__4__Impl : ( ( rule__Internal__Group_4__0 )? ) ;
    public final void rule__Internal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3665:1: ( ( ( rule__Internal__Group_4__0 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3666:1: ( ( rule__Internal__Group_4__0 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3666:1: ( ( rule__Internal__Group_4__0 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3667:1: ( rule__Internal__Group_4__0 )?
            {
             before(grammarAccess.getInternalAccess().getGroup_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3668:1: ( rule__Internal__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3668:2: rule__Internal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Internal__Group_4__0_in_rule__Internal__Group__4__Impl7414);
                    rule__Internal__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternalAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group__4__Impl"


    // $ANTLR start "rule__Internal__Group__5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3678:1: rule__Internal__Group__5 : rule__Internal__Group__5__Impl ;
    public final void rule__Internal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3682:1: ( rule__Internal__Group__5__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3683:2: rule__Internal__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Internal__Group__5__Impl_in_rule__Internal__Group__57445);
            rule__Internal__Group__5__Impl();

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
    // $ANTLR end "rule__Internal__Group__5"


    // $ANTLR start "rule__Internal__Group__5__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3689:1: rule__Internal__Group__5__Impl : ( ']]' ) ;
    public final void rule__Internal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3693:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3694:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3694:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3695:1: ']]'
            {
             before(grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Internal__Group__5__Impl7473); 
             after(grammarAccess.getInternalAccess().getRightSquareBracketRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group__5__Impl"


    // $ANTLR start "rule__Internal__Group_3__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3720:1: rule__Internal__Group_3__0 : rule__Internal__Group_3__0__Impl rule__Internal__Group_3__1 ;
    public final void rule__Internal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3724:1: ( rule__Internal__Group_3__0__Impl rule__Internal__Group_3__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3725:2: rule__Internal__Group_3__0__Impl rule__Internal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Internal__Group_3__0__Impl_in_rule__Internal__Group_3__07516);
            rule__Internal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group_3__1_in_rule__Internal__Group_3__07519);
            rule__Internal__Group_3__1();

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
    // $ANTLR end "rule__Internal__Group_3__0"


    // $ANTLR start "rule__Internal__Group_3__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3732:1: rule__Internal__Group_3__0__Impl : ( '#' ) ;
    public final void rule__Internal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3736:1: ( ( '#' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3737:1: ( '#' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3737:1: ( '#' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3738:1: '#'
            {
             before(grammarAccess.getInternalAccess().getNumberSignKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Internal__Group_3__0__Impl7547); 
             after(grammarAccess.getInternalAccess().getNumberSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group_3__0__Impl"


    // $ANTLR start "rule__Internal__Group_3__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3751:1: rule__Internal__Group_3__1 : rule__Internal__Group_3__1__Impl ;
    public final void rule__Internal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3755:1: ( rule__Internal__Group_3__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3756:2: rule__Internal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Internal__Group_3__1__Impl_in_rule__Internal__Group_3__17578);
            rule__Internal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Internal__Group_3__1"


    // $ANTLR start "rule__Internal__Group_3__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3762:1: rule__Internal__Group_3__1__Impl : ( ( rule__Internal__AnchorAssignment_3_1 ) ) ;
    public final void rule__Internal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3766:1: ( ( ( rule__Internal__AnchorAssignment_3_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3767:1: ( ( rule__Internal__AnchorAssignment_3_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3767:1: ( ( rule__Internal__AnchorAssignment_3_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3768:1: ( rule__Internal__AnchorAssignment_3_1 )
            {
             before(grammarAccess.getInternalAccess().getAnchorAssignment_3_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3769:1: ( rule__Internal__AnchorAssignment_3_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3769:2: rule__Internal__AnchorAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Internal__AnchorAssignment_3_1_in_rule__Internal__Group_3__1__Impl7605);
            rule__Internal__AnchorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalAccess().getAnchorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group_3__1__Impl"


    // $ANTLR start "rule__Internal__Group_4__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3783:1: rule__Internal__Group_4__0 : rule__Internal__Group_4__0__Impl rule__Internal__Group_4__1 ;
    public final void rule__Internal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3787:1: ( rule__Internal__Group_4__0__Impl rule__Internal__Group_4__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3788:2: rule__Internal__Group_4__0__Impl rule__Internal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Internal__Group_4__0__Impl_in_rule__Internal__Group_4__07639);
            rule__Internal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Internal__Group_4__1_in_rule__Internal__Group_4__07642);
            rule__Internal__Group_4__1();

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
    // $ANTLR end "rule__Internal__Group_4__0"


    // $ANTLR start "rule__Internal__Group_4__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3795:1: rule__Internal__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Internal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3799:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3800:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3800:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3801:1: '|'
            {
             before(grammarAccess.getInternalAccess().getVerticalLineKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Internal__Group_4__0__Impl7670); 
             after(grammarAccess.getInternalAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group_4__0__Impl"


    // $ANTLR start "rule__Internal__Group_4__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3814:1: rule__Internal__Group_4__1 : rule__Internal__Group_4__1__Impl ;
    public final void rule__Internal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3818:1: ( rule__Internal__Group_4__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3819:2: rule__Internal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Internal__Group_4__1__Impl_in_rule__Internal__Group_4__17701);
            rule__Internal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Internal__Group_4__1"


    // $ANTLR start "rule__Internal__Group_4__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3825:1: rule__Internal__Group_4__1__Impl : ( ( rule__Internal__AltTextAssignment_4_1 ) ) ;
    public final void rule__Internal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3829:1: ( ( ( rule__Internal__AltTextAssignment_4_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3830:1: ( ( rule__Internal__AltTextAssignment_4_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3830:1: ( ( rule__Internal__AltTextAssignment_4_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3831:1: ( rule__Internal__AltTextAssignment_4_1 )
            {
             before(grammarAccess.getInternalAccess().getAltTextAssignment_4_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3832:1: ( rule__Internal__AltTextAssignment_4_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3832:2: rule__Internal__AltTextAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Internal__AltTextAssignment_4_1_in_rule__Internal__Group_4__1__Impl7728);
            rule__Internal__AltTextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalAccess().getAltTextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__Group_4__1__Impl"


    // $ANTLR start "rule__External__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3846:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3850:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3851:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07762);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__1_in_rule__External__Group__07765);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3858:1: rule__External__Group__0__Impl : ( '[' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3862:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3863:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3863:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3864:1: '['
            {
             before(grammarAccess.getExternalAccess().getLeftSquareBracketKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__External__Group__0__Impl7793); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3877:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3881:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3882:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17824);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__2_in_rule__External__Group__17827);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3889:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3893:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3894:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3894:1: ( ( rule__External__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3895:1: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3896:1: ( rule__External__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3896:2: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7854);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3906:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3910:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3911:2: rule__External__Group__2__Impl rule__External__Group__3
            {
            pushFollow(FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27884);
            rule__External__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__External__Group__3_in_rule__External__Group__27887);
            rule__External__Group__3();

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3918:1: rule__External__Group__2__Impl : ( ( rule__External__AltTextAssignment_2 )? ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3922:1: ( ( ( rule__External__AltTextAssignment_2 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3923:1: ( ( rule__External__AltTextAssignment_2 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3923:1: ( ( rule__External__AltTextAssignment_2 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3924:1: ( rule__External__AltTextAssignment_2 )?
            {
             before(grammarAccess.getExternalAccess().getAltTextAssignment_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3925:1: ( rule__External__AltTextAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==23||(LA21_0>=32 && LA21_0<=35)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3925:2: rule__External__AltTextAssignment_2
                    {
                    pushFollow(FOLLOW_rule__External__AltTextAssignment_2_in_rule__External__Group__2__Impl7914);
                    rule__External__AltTextAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalAccess().getAltTextAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__External__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3935:1: rule__External__Group__3 : rule__External__Group__3__Impl ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3939:1: ( rule__External__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3940:2: rule__External__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__External__Group__3__Impl_in_rule__External__Group__37945);
            rule__External__Group__3__Impl();

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
    // $ANTLR end "rule__External__Group__3"


    // $ANTLR start "rule__External__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3946:1: rule__External__Group__3__Impl : ( ']' ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3950:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3951:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3951:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3952:1: ']'
            {
             before(grammarAccess.getExternalAccess().getRightSquareBracketKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__External__Group__3__Impl7973); 
             after(grammarAccess.getExternalAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3__Impl"


    // $ANTLR start "rule__AnyTextSequence__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3973:1: rule__AnyTextSequence__Group__0 : rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 ;
    public final void rule__AnyTextSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3977:1: ( rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3978:2: rule__AnyTextSequence__Group__0__Impl rule__AnyTextSequence__Group__1
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__08012);
            rule__AnyTextSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__08015);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3985:1: rule__AnyTextSequence__Group__0__Impl : ( () ) ;
    public final void rule__AnyTextSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3989:1: ( ( () ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3990:1: ( () )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3990:1: ( () )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3991:1: ()
            {
             before(grammarAccess.getAnyTextSequenceAccess().getAnyTextSequenceAction_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3992:1: ()
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:3994:1: 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4004:1: rule__AnyTextSequence__Group__1 : rule__AnyTextSequence__Group__1__Impl ;
    public final void rule__AnyTextSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4008:1: ( rule__AnyTextSequence__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4009:2: rule__AnyTextSequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__18073);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4015:1: rule__AnyTextSequence__Group__1__Impl : ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) ;
    public final void rule__AnyTextSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4019:1: ( ( ( rule__AnyTextSequence__ContentAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4020:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4020:1: ( ( rule__AnyTextSequence__ContentAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4021:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4022:1: ( rule__AnyTextSequence__ContentAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==23||(LA22_0>=32 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4022:2: rule__AnyTextSequence__ContentAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl8100);
            	    rule__AnyTextSequence__ContentAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4036:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4040:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4041:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__08135);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__08138);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4048:1: rule__Name__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4052:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4053:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4053:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4054:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl8165); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4065:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4069:1: ( rule__Name__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4070:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__18194);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4076:1: rule__Name__Group__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4080:1: ( ( ( RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4081:1: ( ( RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4081:1: ( ( RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4082:1: ( RULE_ID )*
            {
             before(grammarAccess.getNameAccess().getIDTerminalRuleCall_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4083:1: ( RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4083:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8222); 

            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "rule__WikiPage__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4098:1: rule__WikiPage__NameAssignment_1 : ( ruleName ) ;
    public final void rule__WikiPage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4102:1: ( ( ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4103:1: ( ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4103:1: ( ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4104:1: ruleName
            {
             before(grammarAccess.getWikiPageAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__WikiPage__NameAssignment_18262);
            ruleName();

            state._fsp--;

             after(grammarAccess.getWikiPageAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiPage__NameAssignment_1"


    // $ANTLR start "rule__WikiPage__ElementsAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4113:1: rule__WikiPage__ElementsAssignment_3 : ( ruleParagraphTypes ) ;
    public final void rule__WikiPage__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4117:1: ( ( ruleParagraphTypes ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4118:1: ( ruleParagraphTypes )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4118:1: ( ruleParagraphTypes )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4119:1: ruleParagraphTypes
            {
             before(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_38293);
            ruleParagraphTypes();

            state._fsp--;

             after(grammarAccess.getWikiPageAccess().getElementsParagraphTypesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiPage__ElementsAssignment_3"


    // $ANTLR start "rule__BlockQuote__ContentAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4128:1: rule__BlockQuote__ContentAssignment_2 : ( ruleAnyTextSequence ) ;
    public final void rule__BlockQuote__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4132:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4133:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4133:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4134:1: ruleAnyTextSequence
            {
             before(grammarAccess.getBlockQuoteAccess().getContentAnyTextSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28324);
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


    // $ANTLR start "rule__AboutTemplate__TypeAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4143:1: rule__AboutTemplate__TypeAssignment_1 : ( ( 'about' ) ) ;
    public final void rule__AboutTemplate__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4147:1: ( ( ( 'about' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4148:1: ( ( 'about' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4148:1: ( ( 'about' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4149:1: ( 'about' )
            {
             before(grammarAccess.getAboutTemplateAccess().getTypeAboutKeyword_1_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4150:1: ( 'about' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4151:1: 'about'
            {
             before(grammarAccess.getAboutTemplateAccess().getTypeAboutKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__AboutTemplate__TypeAssignment_18360); 
             after(grammarAccess.getAboutTemplateAccess().getTypeAboutKeyword_1_0()); 

            }

             after(grammarAccess.getAboutTemplateAccess().getTypeAboutKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__TypeAssignment_1"


    // $ANTLR start "rule__AboutTemplate__ContentAssignment_2_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4166:1: rule__AboutTemplate__ContentAssignment_2_1 : ( ruleAnyTextSequence ) ;
    public final void rule__AboutTemplate__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4170:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4171:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4171:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4172:1: ruleAnyTextSequence
            {
             before(grammarAccess.getAboutTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__AboutTemplate__ContentAssignment_2_18399);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getAboutTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AboutTemplate__ContentAssignment_2_1"


    // $ANTLR start "rule__MainTemplate__TypeAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4181:1: rule__MainTemplate__TypeAssignment_1 : ( ( 'main' ) ) ;
    public final void rule__MainTemplate__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4185:1: ( ( ( 'main' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4186:1: ( ( 'main' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4186:1: ( ( 'main' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4187:1: ( 'main' )
            {
             before(grammarAccess.getMainTemplateAccess().getTypeMainKeyword_1_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4188:1: ( 'main' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4189:1: 'main'
            {
             before(grammarAccess.getMainTemplateAccess().getTypeMainKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__MainTemplate__TypeAssignment_18435); 
             after(grammarAccess.getMainTemplateAccess().getTypeMainKeyword_1_0()); 

            }

             after(grammarAccess.getMainTemplateAccess().getTypeMainKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__TypeAssignment_1"


    // $ANTLR start "rule__MainTemplate__ContentAssignment_2_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4204:1: rule__MainTemplate__ContentAssignment_2_1 : ( ruleAnyTextSequence ) ;
    public final void rule__MainTemplate__ContentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4208:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4209:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4209:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4210:1: ruleAnyTextSequence
            {
             before(grammarAccess.getMainTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__MainTemplate__ContentAssignment_2_18474);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getMainTemplateAccess().getContentAnyTextSequenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainTemplate__ContentAssignment_2_1"


    // $ANTLR start "rule__QuoteTemplate__TypeAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4219:1: rule__QuoteTemplate__TypeAssignment_1 : ( ( '\\'' ) ) ;
    public final void rule__QuoteTemplate__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4223:1: ( ( ( '\\'' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4224:1: ( ( '\\'' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4224:1: ( ( '\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4225:1: ( '\\'' )
            {
             before(grammarAccess.getQuoteTemplateAccess().getTypeApostropheKeyword_1_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4226:1: ( '\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4227:1: '\\''
            {
             before(grammarAccess.getQuoteTemplateAccess().getTypeApostropheKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__QuoteTemplate__TypeAssignment_18510); 
             after(grammarAccess.getQuoteTemplateAccess().getTypeApostropheKeyword_1_0()); 

            }

             after(grammarAccess.getQuoteTemplateAccess().getTypeApostropheKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuoteTemplate__TypeAssignment_1"


    // $ANTLR start "rule__OrderedList__ItemsAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4242:1: rule__OrderedList__ItemsAssignment_0 : ( ruleOrderListItem ) ;
    public final void rule__OrderedList__ItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4246:1: ( ( ruleOrderListItem ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4247:1: ( ruleOrderListItem )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4247:1: ( ruleOrderListItem )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4248:1: ruleOrderListItem
            {
             before(grammarAccess.getOrderedListAccess().getItemsOrderListItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOrderListItem_in_rule__OrderedList__ItemsAssignment_08549);
            ruleOrderListItem();

            state._fsp--;

             after(grammarAccess.getOrderedListAccess().getItemsOrderListItemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedList__ItemsAssignment_0"


    // $ANTLR start "rule__OrderedList__EndAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4257:1: rule__OrderedList__EndAssignment_1 : ( ruleParagraph ) ;
    public final void rule__OrderedList__EndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4261:1: ( ( ruleParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4262:1: ( ruleParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4262:1: ( ruleParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4263:1: ruleParagraph
            {
             before(grammarAccess.getOrderedListAccess().getEndParagraphParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParagraph_in_rule__OrderedList__EndAssignment_18580);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getOrderedListAccess().getEndParagraphParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderedList__EndAssignment_1"


    // $ANTLR start "rule__UnorderedList__ItemsAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4272:1: rule__UnorderedList__ItemsAssignment_0 : ( ruleUnorderListItem ) ;
    public final void rule__UnorderedList__ItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4276:1: ( ( ruleUnorderListItem ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4277:1: ( ruleUnorderListItem )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4277:1: ( ruleUnorderListItem )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4278:1: ruleUnorderListItem
            {
             before(grammarAccess.getUnorderedListAccess().getItemsUnorderListItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnorderListItem_in_rule__UnorderedList__ItemsAssignment_08611);
            ruleUnorderListItem();

            state._fsp--;

             after(grammarAccess.getUnorderedListAccess().getItemsUnorderListItemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedList__ItemsAssignment_0"


    // $ANTLR start "rule__UnorderedList__EndAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4287:1: rule__UnorderedList__EndAssignment_1 : ( ruleParagraph ) ;
    public final void rule__UnorderedList__EndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4291:1: ( ( ruleParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4292:1: ( ruleParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4292:1: ( ruleParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4293:1: ruleParagraph
            {
             before(grammarAccess.getUnorderedListAccess().getEndParagraphParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParagraph_in_rule__UnorderedList__EndAssignment_18642);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getUnorderedListAccess().getEndParagraphParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderedList__EndAssignment_1"


    // $ANTLR start "rule__UnorderListItem__LevelAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4302:1: rule__UnorderListItem__LevelAssignment_0 : ( ( rule__UnorderListItem__LevelAlternatives_0_0 ) ) ;
    public final void rule__UnorderListItem__LevelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4306:1: ( ( ( rule__UnorderListItem__LevelAlternatives_0_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4307:1: ( ( rule__UnorderListItem__LevelAlternatives_0_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4307:1: ( ( rule__UnorderListItem__LevelAlternatives_0_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4308:1: ( rule__UnorderListItem__LevelAlternatives_0_0 )
            {
             before(grammarAccess.getUnorderListItemAccess().getLevelAlternatives_0_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4309:1: ( rule__UnorderListItem__LevelAlternatives_0_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4309:2: rule__UnorderListItem__LevelAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__UnorderListItem__LevelAlternatives_0_0_in_rule__UnorderListItem__LevelAssignment_08673);
            rule__UnorderListItem__LevelAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUnorderListItemAccess().getLevelAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderListItem__LevelAssignment_0"


    // $ANTLR start "rule__UnorderListItem__ItemtextAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4318:1: rule__UnorderListItem__ItemtextAssignment_1 : ( ruleAnyTextSequence ) ;
    public final void rule__UnorderListItem__ItemtextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4322:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4323:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4323:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4324:1: ruleAnyTextSequence
            {
             before(grammarAccess.getUnorderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__UnorderListItem__ItemtextAssignment_18706);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getUnorderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnorderListItem__ItemtextAssignment_1"


    // $ANTLR start "rule__OrderListItem__ItemtextAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4333:1: rule__OrderListItem__ItemtextAssignment_1 : ( ruleAnyTextSequence ) ;
    public final void rule__OrderListItem__ItemtextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4337:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4338:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4338:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4339:1: ruleAnyTextSequence
            {
             before(grammarAccess.getOrderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__OrderListItem__ItemtextAssignment_18737);
            ruleAnyTextSequence();

            state._fsp--;

             after(grammarAccess.getOrderListItemAccess().getItemtextAnyTextSequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderListItem__ItemtextAssignment_1"


    // $ANTLR start "rule__Image__NameAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4348:1: rule__Image__NameAssignment_2 : ( RULE_URL ) ;
    public final void rule__Image__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4352:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4353:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4353:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4354:1: RULE_URL
            {
             before(grammarAccess.getImageAccess().getNameURLTerminalRuleCall_2_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__Image__NameAssignment_28768); 
             after(grammarAccess.getImageAccess().getNameURLTerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4363:1: rule__Image__TypeAssignment_3_1 : ( ruleViewType ) ;
    public final void rule__Image__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4367:1: ( ( ruleViewType ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4368:1: ( ruleViewType )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4368:1: ( ruleViewType )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4369:1: ruleViewType
            {
             before(grammarAccess.getImageAccess().getTypeViewTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18799);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4378:1: rule__Image__HAlignAssignment_4_1 : ( ruleHorizontalAlign ) ;
    public final void rule__Image__HAlignAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4382:1: ( ( ruleHorizontalAlign ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4383:1: ( ruleHorizontalAlign )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4383:1: ( ruleHorizontalAlign )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4384:1: ruleHorizontalAlign
            {
             before(grammarAccess.getImageAccess().getHAlignHorizontalAlignEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18830);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4393:1: rule__Image__AltTextAssignment_5_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Image__AltTextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4397:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4398:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4398:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4399:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getImageAccess().getAltTextAbstractUnformattedInlineContentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18861);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4408:1: rule__Image__CaptionAssignment_7 : ( ruleAnyTextSequence ) ;
    public final void rule__Image__CaptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4412:1: ( ( ruleAnyTextSequence ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4413:1: ( ruleAnyTextSequence )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4413:1: ( ruleAnyTextSequence )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4414:1: ruleAnyTextSequence
            {
             before(grammarAccess.getImageAccess().getCaptionAnyTextSequenceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78892);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4423:1: rule__Category__NameAssignment_2 : ( ruleText ) ;
    public final void rule__Category__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4427:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4428:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4428:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4429:1: ruleText
            {
             before(grammarAccess.getCategoryAccess().getNameTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Category__NameAssignment_28923);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4438:1: rule__Category__ValueAssignment_3 : ( ( '|*?' ) ) ;
    public final void rule__Category__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4442:1: ( ( ( '|*?' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4443:1: ( ( '|*?' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4443:1: ( ( '|*?' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4444:1: ( '|*?' )
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4445:1: ( '|*?' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4446:1: '|*?'
            {
             before(grammarAccess.getCategoryAccess().getValueVerticalLineAsteriskQuestionMarkKeyword_3_0()); 
            match(input,40,FOLLOW_40_in_rule__Category__ValueAssignment_38959); 
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


    // $ANTLR start "rule__Heading2__HeadingValue2Assignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4461:1: rule__Heading2__HeadingValue2Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading2__HeadingValue2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4465:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4466:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4466:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4467:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading2Access().getHeadingValue2AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18998);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4476:1: rule__Heading3__HeadingValue3Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading3__HeadingValue3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4480:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4481:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4481:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4482:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading3Access().getHeadingValue3AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_19029);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4491:1: rule__Heading4__HeadingValue4Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading4__HeadingValue4Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4495:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4496:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4496:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4497:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading4Access().getHeadingValue4AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_19060);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4506:1: rule__Heading5__HeadingValue5Assignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Heading5__HeadingValue5Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4510:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4511:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4511:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4512:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getHeading5Access().getHeadingValue5AbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_19091);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4521:1: rule__Bold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Bold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4525:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4526:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4526:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4527:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_19122);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4536:1: rule__Italic__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__Italic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4540:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4541:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4541:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4542:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_19153);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4551:1: rule__ItalicBold__NameAssignment_1 : ( ruleAbstractUnformattedInlineContent ) ;
    public final void rule__ItalicBold__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4555:1: ( ( ruleAbstractUnformattedInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4556:1: ( ruleAbstractUnformattedInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4556:1: ( ruleAbstractUnformattedInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4557:1: ruleAbstractUnformattedInlineContent
            {
             before(grammarAccess.getItalicBoldAccess().getNameAbstractUnformattedInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_19184);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4566:1: rule__Text__NameAssignment : ( ruleName ) ;
    public final void rule__Text__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4570:1: ( ( ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4571:1: ( ruleName )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4571:1: ( ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4572:1: ruleName
            {
             before(grammarAccess.getTextAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Text__NameAssignment9215);
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


    // $ANTLR start "rule__Internal__LinkAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4581:1: rule__Internal__LinkAssignment_2 : ( ( ruleName ) ) ;
    public final void rule__Internal__LinkAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4585:1: ( ( ( ruleName ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4586:1: ( ( ruleName ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4586:1: ( ( ruleName ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4587:1: ( ruleName )
            {
             before(grammarAccess.getInternalAccess().getLinkWikiPageCrossReference_2_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4588:1: ( ruleName )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4589:1: ruleName
            {
             before(grammarAccess.getInternalAccess().getLinkWikiPageNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__Internal__LinkAssignment_29250);
            ruleName();

            state._fsp--;

             after(grammarAccess.getInternalAccess().getLinkWikiPageNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInternalAccess().getLinkWikiPageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__LinkAssignment_2"


    // $ANTLR start "rule__Internal__AnchorAssignment_3_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4600:1: rule__Internal__AnchorAssignment_3_1 : ( ruleText ) ;
    public final void rule__Internal__AnchorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4604:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4605:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4605:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4606:1: ruleText
            {
             before(grammarAccess.getInternalAccess().getAnchorTextParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__Internal__AnchorAssignment_3_19285);
            ruleText();

            state._fsp--;

             after(grammarAccess.getInternalAccess().getAnchorTextParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__AnchorAssignment_3_1"


    // $ANTLR start "rule__Internal__AltTextAssignment_4_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4615:1: rule__Internal__AltTextAssignment_4_1 : ( ( rule__Internal__AltTextAlternatives_4_1_0 ) ) ;
    public final void rule__Internal__AltTextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4619:1: ( ( ( rule__Internal__AltTextAlternatives_4_1_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4620:1: ( ( rule__Internal__AltTextAlternatives_4_1_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4620:1: ( ( rule__Internal__AltTextAlternatives_4_1_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4621:1: ( rule__Internal__AltTextAlternatives_4_1_0 )
            {
             before(grammarAccess.getInternalAccess().getAltTextAlternatives_4_1_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4622:1: ( rule__Internal__AltTextAlternatives_4_1_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4622:2: rule__Internal__AltTextAlternatives_4_1_0
            {
            pushFollow(FOLLOW_rule__Internal__AltTextAlternatives_4_1_0_in_rule__Internal__AltTextAssignment_4_19316);
            rule__Internal__AltTextAlternatives_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInternalAccess().getAltTextAlternatives_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Internal__AltTextAssignment_4_1"


    // $ANTLR start "rule__External__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4631:1: rule__External__NameAssignment_1 : ( RULE_URL ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4635:1: ( ( RULE_URL ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4636:1: ( RULE_URL )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4636:1: ( RULE_URL )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4637:1: RULE_URL
            {
             before(grammarAccess.getExternalAccess().getNameURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__External__NameAssignment_19349); 
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


    // $ANTLR start "rule__External__AltTextAssignment_2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4646:1: rule__External__AltTextAssignment_2 : ( ( rule__External__AltTextAlternatives_2_0 ) ) ;
    public final void rule__External__AltTextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4650:1: ( ( ( rule__External__AltTextAlternatives_2_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4651:1: ( ( rule__External__AltTextAlternatives_2_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4651:1: ( ( rule__External__AltTextAlternatives_2_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4652:1: ( rule__External__AltTextAlternatives_2_0 )
            {
             before(grammarAccess.getExternalAccess().getAltTextAlternatives_2_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4653:1: ( rule__External__AltTextAlternatives_2_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4653:2: rule__External__AltTextAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__External__AltTextAlternatives_2_0_in_rule__External__AltTextAssignment_29380);
            rule__External__AltTextAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getAltTextAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__AltTextAssignment_2"


    // $ANTLR start "rule__AnyTextSequence__ContentAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4662:1: rule__AnyTextSequence__ContentAssignment_1 : ( ruleAnyText ) ;
    public final void rule__AnyTextSequence__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4666:1: ( ( ruleAnyText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4667:1: ( ruleAnyText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4667:1: ( ruleAnyText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4668:1: ruleAnyText
            {
             before(grammarAccess.getAnyTextSequenceAccess().getContentAnyTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19413);
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


    // $ANTLR start "rule__Paragraph__ParagraphAssignment"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4677:1: rule__Paragraph__ParagraphAssignment : ( ( '\\r\\n\\r\\n' ) ) ;
    public final void rule__Paragraph__ParagraphAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4681:1: ( ( ( '\\r\\n\\r\\n' ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4682:1: ( ( '\\r\\n\\r\\n' ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4682:1: ( ( '\\r\\n\\r\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4683:1: ( '\\r\\n\\r\\n' )
            {
             before(grammarAccess.getParagraphAccess().getParagraphControl000dControl000aControl000dControl000aKeyword_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4684:1: ( '\\r\\n\\r\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:4685:1: '\\r\\n\\r\\n'
            {
             before(grammarAccess.getParagraphAccess().getParagraphControl000dControl000aControl000dControl000aKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Paragraph__ParagraphAssignment9449); 
             after(grammarAccess.getParagraphAccess().getParagraphControl000dControl000aControl000dControl000aKeyword_0()); 

            }

             after(grammarAccess.getParagraphAccess().getParagraphControl000dControl000aControl000dControl000aKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__ParagraphAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\4\2\uffff\1\4\12\uffff";
    static final String DFA1_maxS =
        "\1\51\2\uffff\1\33\12\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\4\1\3";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\11\uffff\2\2\1\uffff\1\6\1\uffff\1\4\2\uffff\1\1\1\3\4"+
            "\uffff\1\7\1\10\1\11\1\12\4\5\5\uffff\1\13",
            "",
            "",
            "\1\5\20\uffff\2\5\1\uffff\1\15\1\5\1\uffff\1\14",
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
            return "940:1: rule__ParagraphTypes__Alternatives : ( ( ruleOrderedList ) | ( ruleUnorderedList ) | ( ruleImage ) | ( ruleCategory ) | ( ruleTemplate ) | ( ruleAnyText ) | ( ruleBlockQuote ) | ( ruleHeading2 ) | ( ruleHeading3 ) | ( ruleHeading4 ) | ( ruleHeading5 ) | ( ruleParagraph ) );";
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
    public static final BitSet FOLLOW_rule__Template__Alternatives_in_ruleTemplate274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAboutTemplate_in_entryRuleAboutTemplate301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAboutTemplate308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__0_in_ruleAboutTemplate334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainTemplate_in_entryRuleMainTemplate361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainTemplate368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__0_in_ruleMainTemplate394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuoteTemplate_in_entryRuleQuoteTemplate421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuoteTemplate428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__0_in_ruleQuoteTemplate454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_entryRuleOrderedList481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderedList488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0_in_ruleOrderedList514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_entryRuleUnorderedList541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderedList548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0_in_ruleUnorderedList574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderListItem_in_entryRuleUnorderListItem601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnorderListItem608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__Group__0_in_ruleUnorderListItem634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItem_in_entryRuleOrderListItem661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderListItem668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItem__Group__0_in_ruleOrderListItem694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_entryRuleImage721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImage728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0_in_ruleImage754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0_in_ruleCategory814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0_in_ruleHeading2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0_in_ruleHeading3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_entryRuleHeading4961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0_in_ruleHeading4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_entryRuleHeading51021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading51028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__0_in_ruleHeading51054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_entryRuleAbstractFormattedInlineContent1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFormattedInlineContent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFormattedInlineContent__Alternatives_in_ruleAbstractFormattedInlineContent1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__0_in_ruleBold1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__0_in_ruleItalic1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_entryRuleItalicBold1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicBold1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__0_in_ruleItalicBold1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_entryRuleAbstractUnformattedInlineContent1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractUnformattedInlineContent1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractUnformattedInlineContent__Alternatives_in_ruleAbstractUnformattedInlineContent1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__NameAssignment_in_ruleText1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_entryRuleHyperLink1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperLink1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HyperLink__Alternatives_in_ruleHyperLink1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_entryRuleInternal1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternal1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__0_in_ruleInternal1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_entryRuleExternal1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternal1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__0_in_ruleExternal1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_entryRuleAnyTextSequence1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyTextSequence1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__0_in_ruleAnyTextSequence1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_entryRuleAnyText1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnyText1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyText__Alternatives_in_ruleAnyText1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Paragraph__ParagraphAssignment_in_ruleParagraph1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleViewType1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHorizontalAlign1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderedList_in_rule__ParagraphTypes__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderedList_in_rule__ParagraphTypes__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImage_in_rule__ParagraphTypes__Alternatives1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_rule__ParagraphTypes__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__ParagraphTypes__Alternatives2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__ParagraphTypes__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockQuote_in_rule__ParagraphTypes__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_rule__ParagraphTypes__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_rule__ParagraphTypes__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading4_in_rule__ParagraphTypes__Alternatives2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading5_in_rule__ParagraphTypes__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rule__ParagraphTypes__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAboutTemplate_in_rule__Template__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuoteTemplate_in_rule__Template__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainTemplate_in_rule__Template__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnorderListItem__LevelAlternatives_0_02234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UnorderListItem__LevelAlternatives_0_02254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__AbstractFormattedInlineContent__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__AbstractFormattedInlineContent__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicBold_in_rule__AbstractFormattedInlineContent__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__AbstractUnformattedInlineContent__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperLink_in_rule__AbstractUnformattedInlineContent__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternal_in_rule__HyperLink__Alternatives2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternal_in_rule__HyperLink__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Internal__AltTextAlternatives_4_1_02452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__Internal__AltTextAlternatives_4_1_02469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__External__AltTextAlternatives_2_02501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__External__AltTextAlternatives_2_02518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFormattedInlineContent_in_rule__AnyText__Alternatives2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__AnyText__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__0__Impl_in_rule__WikiPage__Group__02597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1_in_rule__WikiPage__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WikiPage__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__1__Impl_in_rule__WikiPage__Group__12659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__2_in_rule__WikiPage__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__NameAssignment_1_in_rule__WikiPage__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__2__Impl_in_rule__WikiPage__Group__22719 = new BitSet(new long[]{0x0000020FF0CAC010L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__3_in_rule__WikiPage__Group__22722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WikiPage__Group__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__Group__3__Impl_in_rule__WikiPage__Group__32781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiPage__ElementsAssignment_3_in_rule__WikiPage__Group__3__Impl2808 = new BitSet(new long[]{0x0000020FF0CAC012L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__0__Impl_in_rule__BlockQuote__Group__02847 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1_in_rule__BlockQuote__Group__02850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__1__Impl_in_rule__BlockQuote__Group__12908 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2_in_rule__BlockQuote__Group__12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BlockQuote__Group__1__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__2__Impl_in_rule__BlockQuote__Group__22970 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3_in_rule__BlockQuote__Group__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__ContentAssignment_2_in_rule__BlockQuote__Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockQuote__Group__3__Impl_in_rule__BlockQuote__Group__33030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BlockQuote__Group__3__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__0__Impl_in_rule__AboutTemplate__Group__03097 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__1_in_rule__AboutTemplate__Group__03100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AboutTemplate__Group__0__Impl3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__1__Impl_in_rule__AboutTemplate__Group__13159 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__2_in_rule__AboutTemplate__Group__13162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__TypeAssignment_1_in_rule__AboutTemplate__Group__1__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__2__Impl_in_rule__AboutTemplate__Group__23219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__3_in_rule__AboutTemplate__Group__23222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group_2__0_in_rule__AboutTemplate__Group__2__Impl3251 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group_2__0_in_rule__AboutTemplate__Group__2__Impl3263 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group__3__Impl_in_rule__AboutTemplate__Group__33296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AboutTemplate__Group__3__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group_2__0__Impl_in_rule__AboutTemplate__Group_2__03363 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group_2__1_in_rule__AboutTemplate__Group_2__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AboutTemplate__Group_2__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__Group_2__1__Impl_in_rule__AboutTemplate__Group_2__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AboutTemplate__ContentAssignment_2_1_in_rule__AboutTemplate__Group_2__1__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__0__Impl_in_rule__MainTemplate__Group__03486 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__1_in_rule__MainTemplate__Group__03489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MainTemplate__Group__0__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__1__Impl_in_rule__MainTemplate__Group__13548 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__2_in_rule__MainTemplate__Group__13551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__TypeAssignment_1_in_rule__MainTemplate__Group__1__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__2__Impl_in_rule__MainTemplate__Group__23608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__3_in_rule__MainTemplate__Group__23611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group_2__0_in_rule__MainTemplate__Group__2__Impl3640 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group_2__0_in_rule__MainTemplate__Group__2__Impl3652 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group__3__Impl_in_rule__MainTemplate__Group__33685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MainTemplate__Group__3__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group_2__0__Impl_in_rule__MainTemplate__Group_2__03752 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group_2__1_in_rule__MainTemplate__Group_2__03755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MainTemplate__Group_2__0__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__Group_2__1__Impl_in_rule__MainTemplate__Group_2__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainTemplate__ContentAssignment_2_1_in_rule__MainTemplate__Group_2__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__0__Impl_in_rule__QuoteTemplate__Group__03875 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__1_in_rule__QuoteTemplate__Group__03878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QuoteTemplate__Group__0__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__1__Impl_in_rule__QuoteTemplate__Group__13937 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__2_in_rule__QuoteTemplate__Group__13940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__TypeAssignment_1_in_rule__QuoteTemplate__Group__1__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuoteTemplate__Group__2__Impl_in_rule__QuoteTemplate__Group__23997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QuoteTemplate__Group__2__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__0__Impl_in_rule__OrderedList__Group__04062 = new BitSet(new long[]{0x0000020FF0CAC010L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1_in_rule__OrderedList__Group__04065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_0_in_rule__OrderedList__Group__0__Impl4094 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__OrderedList__ItemsAssignment_0_in_rule__OrderedList__Group__0__Impl4106 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__OrderedList__Group__1__Impl_in_rule__OrderedList__Group__14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderedList__EndAssignment_1_in_rule__OrderedList__Group__1__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__0__Impl_in_rule__UnorderedList__Group__04200 = new BitSet(new long[]{0x0000020FF0CAC010L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1_in_rule__UnorderedList__Group__04203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_0_in_rule__UnorderedList__Group__0__Impl4232 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__UnorderedList__ItemsAssignment_0_in_rule__UnorderedList__Group__0__Impl4244 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__UnorderedList__Group__1__Impl_in_rule__UnorderedList__Group__14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderedList__EndAssignment_1_in_rule__UnorderedList__Group__1__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__Group__0__Impl_in_rule__UnorderListItem__Group__04338 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__UnorderListItem__Group__1_in_rule__UnorderListItem__Group__04341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__LevelAssignment_0_in_rule__UnorderListItem__Group__0__Impl4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__Group__1__Impl_in_rule__UnorderListItem__Group__14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__ItemtextAssignment_1_in_rule__UnorderListItem__Group__1__Impl4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItem__Group__0__Impl_in_rule__OrderListItem__Group__04459 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__OrderListItem__Group__1_in_rule__OrderListItem__Group__04462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OrderListItem__Group__0__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItem__Group__1__Impl_in_rule__OrderListItem__Group__14521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrderListItem__ItemtextAssignment_1_in_rule__OrderListItem__Group__1__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__0__Impl_in_rule__Image__Group__04582 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Image__Group__1_in_rule__Image__Group__04585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Image__Group__0__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__1__Impl_in_rule__Image__Group__14644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Image__Group__2_in_rule__Image__Group__14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Image__Group__1__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__2__Impl_in_rule__Image__Group__24706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Image__Group__3_in_rule__Image__Group__24709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__NameAssignment_2_in_rule__Image__Group__2__Impl4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__3__Impl_in_rule__Image__Group__34766 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Image__Group__4_in_rule__Image__Group__34769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0_in_rule__Image__Group__3__Impl4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__4__Impl_in_rule__Image__Group__44826 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Image__Group__5_in_rule__Image__Group__44829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0_in_rule__Image__Group__4__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__5__Impl_in_rule__Image__Group__54887 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Image__Group__6_in_rule__Image__Group__54890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0_in_rule__Image__Group__5__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__6__Impl_in_rule__Image__Group__64948 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Image__Group__7_in_rule__Image__Group__64951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Image__Group__6__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__7__Impl_in_rule__Image__Group__75010 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Image__Group__8_in_rule__Image__Group__75013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__CaptionAssignment_7_in_rule__Image__Group__7__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group__8__Impl_in_rule__Image__Group__85070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Image__Group__8__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__0__Impl_in_rule__Image__Group_3__05147 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1_in_rule__Image__Group_3__05150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Image__Group_3__0__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_3__1__Impl_in_rule__Image__Group_3__15209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__TypeAssignment_3_1_in_rule__Image__Group_3__1__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__0__Impl_in_rule__Image__Group_4__05270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1_in_rule__Image__Group_4__05273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Image__Group_4__0__Impl5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_4__1__Impl_in_rule__Image__Group_4__15332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__HAlignAssignment_4_1_in_rule__Image__Group_4__1__Impl5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__0__Impl_in_rule__Image__Group_5__05393 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1_in_rule__Image__Group_5__05396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Image__Group_5__0__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__Group_5__1__Impl_in_rule__Image__Group_5__15455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Image__AltTextAssignment_5_1_in_rule__Image__Group_5__1__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__0__Impl_in_rule__Category__Group__05516 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Category__Group__1_in_rule__Category__Group__05519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Category__Group__0__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__1__Impl_in_rule__Category__Group__15578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Category__Group__2_in_rule__Category__Group__15581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Category__Group__1__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__2__Impl_in_rule__Category__Group__25640 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_rule__Category__Group__3_in_rule__Category__Group__25643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__NameAssignment_2_in_rule__Category__Group__2__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__3__Impl_in_rule__Category__Group__35700 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_rule__Category__Group__4_in_rule__Category__Group__35703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__ValueAssignment_3_in_rule__Category__Group__3__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Category__Group__4__Impl_in_rule__Category__Group__45761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Category__Group__4__Impl5789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__0__Impl_in_rule__Heading2__Group__05830 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1_in_rule__Heading2__Group__05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Heading2__Group__0__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__1__Impl_in_rule__Heading2__Group__15892 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2_in_rule__Heading2__Group__15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__HeadingValue2Assignment_1_in_rule__Heading2__Group__1__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading2__Group__2__Impl_in_rule__Heading2__Group__25952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Heading2__Group__2__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__0__Impl_in_rule__Heading3__Group__06017 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1_in_rule__Heading3__Group__06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Heading3__Group__0__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__1__Impl_in_rule__Heading3__Group__16079 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2_in_rule__Heading3__Group__16082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__HeadingValue3Assignment_1_in_rule__Heading3__Group__1__Impl6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading3__Group__2__Impl_in_rule__Heading3__Group__26139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Heading3__Group__2__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__0__Impl_in_rule__Heading4__Group__06204 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1_in_rule__Heading4__Group__06207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Heading4__Group__0__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__1__Impl_in_rule__Heading4__Group__16266 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2_in_rule__Heading4__Group__16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__HeadingValue4Assignment_1_in_rule__Heading4__Group__1__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading4__Group__2__Impl_in_rule__Heading4__Group__26326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Heading4__Group__2__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__0__Impl_in_rule__Heading5__Group__06391 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1_in_rule__Heading5__Group__06394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Heading5__Group__0__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__1__Impl_in_rule__Heading5__Group__16453 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2_in_rule__Heading5__Group__16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__HeadingValue5Assignment_1_in_rule__Heading5__Group__1__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Heading5__Group__2__Impl_in_rule__Heading5__Group__26513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Heading5__Group__2__Impl6541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__0__Impl_in_rule__Bold__Group__06578 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Bold__Group__1_in_rule__Bold__Group__06581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Bold__Group__0__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__1__Impl_in_rule__Bold__Group__16640 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Bold__Group__2_in_rule__Bold__Group__16643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__NameAssignment_1_in_rule__Bold__Group__1__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group__2__Impl_in_rule__Bold__Group__26700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Bold__Group__2__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__0__Impl_in_rule__Italic__Group__06765 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Italic__Group__1_in_rule__Italic__Group__06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Italic__Group__0__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__1__Impl_in_rule__Italic__Group__16827 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Italic__Group__2_in_rule__Italic__Group__16830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__NameAssignment_1_in_rule__Italic__Group__1__Impl6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group__2__Impl_in_rule__Italic__Group__26887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Italic__Group__2__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__0__Impl_in_rule__ItalicBold__Group__06952 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1_in_rule__ItalicBold__Group__06955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ItalicBold__Group__0__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__1__Impl_in_rule__ItalicBold__Group__17014 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2_in_rule__ItalicBold__Group__17017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__NameAssignment_1_in_rule__ItalicBold__Group__1__Impl7044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicBold__Group__2__Impl_in_rule__ItalicBold__Group__27074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ItalicBold__Group__2__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__0__Impl_in_rule__Internal__Group__07139 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Internal__Group__1_in_rule__Internal__Group__07142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__1__Impl_in_rule__Internal__Group__17200 = new BitSet(new long[]{0x0000000002600010L});
    public static final BitSet FOLLOW_rule__Internal__Group__2_in_rule__Internal__Group__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Internal__Group__1__Impl7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__2__Impl_in_rule__Internal__Group__27262 = new BitSet(new long[]{0x0000000002600010L});
    public static final BitSet FOLLOW_rule__Internal__Group__3_in_rule__Internal__Group__27265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__LinkAssignment_2_in_rule__Internal__Group__2__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__3__Impl_in_rule__Internal__Group__37323 = new BitSet(new long[]{0x0000000002600010L});
    public static final BitSet FOLLOW_rule__Internal__Group__4_in_rule__Internal__Group__37326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_3__0_in_rule__Internal__Group__3__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__4__Impl_in_rule__Internal__Group__47384 = new BitSet(new long[]{0x0000000002600010L});
    public static final BitSet FOLLOW_rule__Internal__Group__5_in_rule__Internal__Group__47387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_4__0_in_rule__Internal__Group__4__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group__5__Impl_in_rule__Internal__Group__57445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Internal__Group__5__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_3__0__Impl_in_rule__Internal__Group_3__07516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Internal__Group_3__1_in_rule__Internal__Group_3__07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Internal__Group_3__0__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_3__1__Impl_in_rule__Internal__Group_3__17578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__AnchorAssignment_3_1_in_rule__Internal__Group_3__1__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_4__0__Impl_in_rule__Internal__Group_4__07639 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__Internal__Group_4__1_in_rule__Internal__Group_4__07642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Internal__Group_4__0__Impl7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__Group_4__1__Impl_in_rule__Internal__Group_4__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__AltTextAssignment_4_1_in_rule__Internal__Group_4__1__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__0__Impl_in_rule__External__Group__07762 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__External__Group__1_in_rule__External__Group__07765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__External__Group__0__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__1__Impl_in_rule__External__Group__17824 = new BitSet(new long[]{0x0000001F00800010L});
    public static final BitSet FOLLOW_rule__External__Group__2_in_rule__External__Group__17827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__NameAssignment_1_in_rule__External__Group__1__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__2__Impl_in_rule__External__Group__27884 = new BitSet(new long[]{0x0000001F00800010L});
    public static final BitSet FOLLOW_rule__External__Group__3_in_rule__External__Group__27887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__AltTextAssignment_2_in_rule__External__Group__2__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__Group__3__Impl_in_rule__External__Group__37945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__External__Group__3__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__0__Impl_in_rule__AnyTextSequence__Group__08012 = new BitSet(new long[]{0x0000000F00800010L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1_in_rule__AnyTextSequence__Group__08015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__Group__1__Impl_in_rule__AnyTextSequence__Group__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnyTextSequence__ContentAssignment_1_in_rule__AnyTextSequence__Group__1__Impl8100 = new BitSet(new long[]{0x0000000F00800012L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__08135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__08138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__0__Impl8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__18194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Group__1__Impl8222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleName_in_rule__WikiPage__NameAssignment_18262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraphTypes_in_rule__WikiPage__ElementsAssignment_38293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__BlockQuote__ContentAssignment_28324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AboutTemplate__TypeAssignment_18360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__AboutTemplate__ContentAssignment_2_18399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__MainTemplate__TypeAssignment_18435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__MainTemplate__ContentAssignment_2_18474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QuoteTemplate__TypeAssignment_18510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderListItem_in_rule__OrderedList__ItemsAssignment_08549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rule__OrderedList__EndAssignment_18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnorderListItem_in_rule__UnorderedList__ItemsAssignment_08611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rule__UnorderedList__EndAssignment_18642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnorderListItem__LevelAlternatives_0_0_in_rule__UnorderListItem__LevelAssignment_08673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__UnorderListItem__ItemtextAssignment_18706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__OrderListItem__ItemtextAssignment_18737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__Image__NameAssignment_28768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewType_in_rule__Image__TypeAssignment_3_18799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHorizontalAlign_in_rule__Image__HAlignAssignment_4_18830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Image__AltTextAssignment_5_18861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyTextSequence_in_rule__Image__CaptionAssignment_78892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Category__NameAssignment_28923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Category__ValueAssignment_38959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading2__HeadingValue2Assignment_18998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading3__HeadingValue3Assignment_19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading4__HeadingValue4Assignment_19060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Heading5__HeadingValue5Assignment_19091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Bold__NameAssignment_19122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__Italic__NameAssignment_19153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractUnformattedInlineContent_in_rule__ItalicBold__NameAssignment_19184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Text__NameAssignment9215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Internal__LinkAssignment_29250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__Internal__AnchorAssignment_3_19285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Internal__AltTextAlternatives_4_1_0_in_rule__Internal__AltTextAssignment_4_19316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__External__NameAssignment_19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__External__AltTextAlternatives_2_0_in_rule__External__AltTextAssignment_29380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnyText_in_rule__AnyTextSequence__ContentAssignment_19413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Paragraph__ParagraphAssignment9449 = new BitSet(new long[]{0x0000000000000002L});

}