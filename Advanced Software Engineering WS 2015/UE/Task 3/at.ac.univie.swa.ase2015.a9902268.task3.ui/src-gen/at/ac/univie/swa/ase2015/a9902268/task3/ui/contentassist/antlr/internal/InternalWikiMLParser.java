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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WIKITEXT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'\\n'", "'=='", "'==='", "'===='", "'====='", "'\\'\\''", "'\\'\\'\\''", "'\\'\\'\\'\\'\\''", "'['", "']'", "' '", "'[['", "']]'", "'|'"
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
    public static final int RULE_WIKITEXT=4;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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




    // $ANTLR start "entryRulewikipage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:60:1: entryRulewikipage : rulewikipage EOF ;
    public final void entryRulewikipage() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:61:1: ( rulewikipage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:62:1: rulewikipage EOF
            {
             before(grammarAccess.getWikipageRule()); 
            pushFollow(FOLLOW_rulewikipage_in_entryRulewikipage61);
            rulewikipage();

            state._fsp--;

             after(grammarAccess.getWikipageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewikipage68); 

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
    // $ANTLR end "entryRulewikipage"


    // $ANTLR start "rulewikipage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:69:1: rulewikipage : ( ( rule__Wikipage__Group__0 ) ) ;
    public final void rulewikipage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:73:2: ( ( ( rule__Wikipage__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__Wikipage__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__Wikipage__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:75:1: ( rule__Wikipage__Group__0 )
            {
             before(grammarAccess.getWikipageAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:1: ( rule__Wikipage__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:2: rule__Wikipage__Group__0
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__0_in_rulewikipage94);
            rule__Wikipage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWikipageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulewikipage"


    // $ANTLR start "entryRuleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:88:1: entryRuleAbstractSection : ruleAbstractSection EOF ;
    public final void entryRuleAbstractSection() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:89:1: ( ruleAbstractSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:90:1: ruleAbstractSection EOF
            {
             before(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection121);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getAbstractSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection128); 

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
    // $ANTLR end "entryRuleAbstractSection"


    // $ANTLR start "ruleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:97:1: ruleAbstractSection : ( ( rule__AbstractSection__Alternatives ) ) ;
    public final void ruleAbstractSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:101:2: ( ( ( rule__AbstractSection__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__AbstractSection__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__AbstractSection__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:103:1: ( rule__AbstractSection__Alternatives )
            {
             before(grammarAccess.getAbstractSectionAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:1: ( rule__AbstractSection__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:2: rule__AbstractSection__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection154);
            rule__AbstractSection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractSection"


    // $ANTLR start "entryRuleSubsectionLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:116:1: entryRuleSubsectionLevel1 : ruleSubsectionLevel1 EOF ;
    public final void entryRuleSubsectionLevel1() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:117:1: ( ruleSubsectionLevel1 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:118:1: ruleSubsectionLevel1 EOF
            {
             before(grammarAccess.getSubsectionLevel1Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1181);
            ruleSubsectionLevel1();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel1188); 

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
    // $ANTLR end "entryRuleSubsectionLevel1"


    // $ANTLR start "ruleSubsectionLevel1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:125:1: ruleSubsectionLevel1 : ( ( rule__SubsectionLevel1__Group__0 ) ) ;
    public final void ruleSubsectionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:129:2: ( ( ( rule__SubsectionLevel1__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__SubsectionLevel1__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__SubsectionLevel1__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:131:1: ( rule__SubsectionLevel1__Group__0 )
            {
             before(grammarAccess.getSubsectionLevel1Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:1: ( rule__SubsectionLevel1__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:2: rule__SubsectionLevel1__Group__0
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__0_in_ruleSubsectionLevel1214);
            rule__SubsectionLevel1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsectionLevel1"


    // $ANTLR start "entryRuleSubsectionLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:144:1: entryRuleSubsectionLevel2 : ruleSubsectionLevel2 EOF ;
    public final void entryRuleSubsectionLevel2() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:145:1: ( ruleSubsectionLevel2 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:146:1: ruleSubsectionLevel2 EOF
            {
             before(grammarAccess.getSubsectionLevel2Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2241);
            ruleSubsectionLevel2();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel2248); 

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
    // $ANTLR end "entryRuleSubsectionLevel2"


    // $ANTLR start "ruleSubsectionLevel2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:153:1: ruleSubsectionLevel2 : ( ( rule__SubsectionLevel2__Group__0 ) ) ;
    public final void ruleSubsectionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:157:2: ( ( ( rule__SubsectionLevel2__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__SubsectionLevel2__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__SubsectionLevel2__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:159:1: ( rule__SubsectionLevel2__Group__0 )
            {
             before(grammarAccess.getSubsectionLevel2Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:1: ( rule__SubsectionLevel2__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:2: rule__SubsectionLevel2__Group__0
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__0_in_ruleSubsectionLevel2274);
            rule__SubsectionLevel2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsectionLevel2"


    // $ANTLR start "entryRuleSubsectionLevel3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:172:1: entryRuleSubsectionLevel3 : ruleSubsectionLevel3 EOF ;
    public final void entryRuleSubsectionLevel3() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:173:1: ( ruleSubsectionLevel3 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:174:1: ruleSubsectionLevel3 EOF
            {
             before(grammarAccess.getSubsectionLevel3Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3301);
            ruleSubsectionLevel3();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel3Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel3308); 

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
    // $ANTLR end "entryRuleSubsectionLevel3"


    // $ANTLR start "ruleSubsectionLevel3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:181:1: ruleSubsectionLevel3 : ( ( rule__SubsectionLevel3__Group__0 ) ) ;
    public final void ruleSubsectionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:185:2: ( ( ( rule__SubsectionLevel3__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__SubsectionLevel3__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__SubsectionLevel3__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:187:1: ( rule__SubsectionLevel3__Group__0 )
            {
             before(grammarAccess.getSubsectionLevel3Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:1: ( rule__SubsectionLevel3__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:2: rule__SubsectionLevel3__Group__0
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__0_in_ruleSubsectionLevel3334);
            rule__SubsectionLevel3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsectionLevel3"


    // $ANTLR start "entryRuleSubsectionLevel4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:200:1: entryRuleSubsectionLevel4 : ruleSubsectionLevel4 EOF ;
    public final void entryRuleSubsectionLevel4() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:201:1: ( ruleSubsectionLevel4 EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:202:1: ruleSubsectionLevel4 EOF
            {
             before(grammarAccess.getSubsectionLevel4Rule()); 
            pushFollow(FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4361);
            ruleSubsectionLevel4();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel4Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsectionLevel4368); 

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
    // $ANTLR end "entryRuleSubsectionLevel4"


    // $ANTLR start "ruleSubsectionLevel4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:209:1: ruleSubsectionLevel4 : ( ( rule__SubsectionLevel4__Group__0 ) ) ;
    public final void ruleSubsectionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:213:2: ( ( ( rule__SubsectionLevel4__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__SubsectionLevel4__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__SubsectionLevel4__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:215:1: ( rule__SubsectionLevel4__Group__0 )
            {
             before(grammarAccess.getSubsectionLevel4Access().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:1: ( rule__SubsectionLevel4__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:2: rule__SubsectionLevel4__Group__0
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__0_in_ruleSubsectionLevel4394);
            rule__SubsectionLevel4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsectionLevel4"


    // $ANTLR start "entryRuleInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:228:1: entryRuleInlineContent : ruleInlineContent EOF ;
    public final void entryRuleInlineContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:229:1: ( ruleInlineContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:230:1: ruleInlineContent EOF
            {
             before(grammarAccess.getInlineContentRule()); 
            pushFollow(FOLLOW_ruleInlineContent_in_entryRuleInlineContent421);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getInlineContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineContent428); 

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
    // $ANTLR end "entryRuleInlineContent"


    // $ANTLR start "ruleInlineContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:237:1: ruleInlineContent : ( ( rule__InlineContent__Alternatives ) ) ;
    public final void ruleInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:241:2: ( ( ( rule__InlineContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__InlineContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__InlineContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:243:1: ( rule__InlineContent__Alternatives )
            {
             before(grammarAccess.getInlineContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:1: ( rule__InlineContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:2: rule__InlineContent__Alternatives
            {
            pushFollow(FOLLOW_rule__InlineContent__Alternatives_in_ruleInlineContent454);
            rule__InlineContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInlineContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineContent"


    // $ANTLR start "entryRuleFormattedContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:256:1: entryRuleFormattedContent : ruleFormattedContent EOF ;
    public final void entryRuleFormattedContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:257:1: ( ruleFormattedContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:258:1: ruleFormattedContent EOF
            {
             before(grammarAccess.getFormattedContentRule()); 
            pushFollow(FOLLOW_ruleFormattedContent_in_entryRuleFormattedContent481);
            ruleFormattedContent();

            state._fsp--;

             after(grammarAccess.getFormattedContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormattedContent488); 

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
    // $ANTLR end "entryRuleFormattedContent"


    // $ANTLR start "ruleFormattedContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:265:1: ruleFormattedContent : ( ( rule__FormattedContent__Alternatives ) ) ;
    public final void ruleFormattedContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:269:2: ( ( ( rule__FormattedContent__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__FormattedContent__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__FormattedContent__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:271:1: ( rule__FormattedContent__Alternatives )
            {
             before(grammarAccess.getFormattedContentAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:1: ( rule__FormattedContent__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:2: rule__FormattedContent__Alternatives
            {
            pushFollow(FOLLOW_rule__FormattedContent__Alternatives_in_ruleFormattedContent514);
            rule__FormattedContent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormattedContentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormattedContent"


    // $ANTLR start "entryRuleItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:284:1: entryRuleItalicContent : ruleItalicContent EOF ;
    public final void entryRuleItalicContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:285:1: ( ruleItalicContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:286:1: ruleItalicContent EOF
            {
             before(grammarAccess.getItalicContentRule()); 
            pushFollow(FOLLOW_ruleItalicContent_in_entryRuleItalicContent541);
            ruleItalicContent();

            state._fsp--;

             after(grammarAccess.getItalicContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicContent548); 

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
    // $ANTLR end "entryRuleItalicContent"


    // $ANTLR start "ruleItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:293:1: ruleItalicContent : ( ( rule__ItalicContent__Group__0 ) ) ;
    public final void ruleItalicContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:297:2: ( ( ( rule__ItalicContent__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__ItalicContent__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__ItalicContent__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:299:1: ( rule__ItalicContent__Group__0 )
            {
             before(grammarAccess.getItalicContentAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:1: ( rule__ItalicContent__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:2: rule__ItalicContent__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicContent__Group__0_in_ruleItalicContent574);
            rule__ItalicContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalicContent"


    // $ANTLR start "entryRuleBoldContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:312:1: entryRuleBoldContent : ruleBoldContent EOF ;
    public final void entryRuleBoldContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:313:1: ( ruleBoldContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:314:1: ruleBoldContent EOF
            {
             before(grammarAccess.getBoldContentRule()); 
            pushFollow(FOLLOW_ruleBoldContent_in_entryRuleBoldContent601);
            ruleBoldContent();

            state._fsp--;

             after(grammarAccess.getBoldContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldContent608); 

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
    // $ANTLR end "entryRuleBoldContent"


    // $ANTLR start "ruleBoldContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:321:1: ruleBoldContent : ( ( rule__BoldContent__Group__0 ) ) ;
    public final void ruleBoldContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:325:2: ( ( ( rule__BoldContent__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__BoldContent__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__BoldContent__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:327:1: ( rule__BoldContent__Group__0 )
            {
             before(grammarAccess.getBoldContentAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:1: ( rule__BoldContent__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:2: rule__BoldContent__Group__0
            {
            pushFollow(FOLLOW_rule__BoldContent__Group__0_in_ruleBoldContent634);
            rule__BoldContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoldContent"


    // $ANTLR start "entryRuleBoldItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: entryRuleBoldItalicContent : ruleBoldItalicContent EOF ;
    public final void entryRuleBoldItalicContent() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:341:1: ( ruleBoldItalicContent EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:342:1: ruleBoldItalicContent EOF
            {
             before(grammarAccess.getBoldItalicContentRule()); 
            pushFollow(FOLLOW_ruleBoldItalicContent_in_entryRuleBoldItalicContent661);
            ruleBoldItalicContent();

            state._fsp--;

             after(grammarAccess.getBoldItalicContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldItalicContent668); 

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
    // $ANTLR end "entryRuleBoldItalicContent"


    // $ANTLR start "ruleBoldItalicContent"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:349:1: ruleBoldItalicContent : ( ( rule__BoldItalicContent__Group__0 ) ) ;
    public final void ruleBoldItalicContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:353:2: ( ( ( rule__BoldItalicContent__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__BoldItalicContent__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:354:1: ( ( rule__BoldItalicContent__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:355:1: ( rule__BoldItalicContent__Group__0 )
            {
             before(grammarAccess.getBoldItalicContentAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:1: ( rule__BoldItalicContent__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:2: rule__BoldItalicContent__Group__0
            {
            pushFollow(FOLLOW_rule__BoldItalicContent__Group__0_in_ruleBoldItalicContent694);
            rule__BoldItalicContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldItalicContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoldItalicContent"


    // $ANTLR start "entryRuleText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:368:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:369:1: ( ruleText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:370:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_ruleText_in_entryRuleText721);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleText728); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:377:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:381:2: ( ( ( rule__Text__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Text__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:382:1: ( ( rule__Text__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:383:1: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:1: ( rule__Text__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:384:2: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_rule__Text__Alternatives_in_ruleText754);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUnFormattedText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:396:1: entryRuleUnFormattedText : ruleUnFormattedText EOF ;
    public final void entryRuleUnFormattedText() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:397:1: ( ruleUnFormattedText EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:398:1: ruleUnFormattedText EOF
            {
             before(grammarAccess.getUnFormattedTextRule()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_entryRuleUnFormattedText781);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getUnFormattedTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnFormattedText788); 

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
    // $ANTLR end "entryRuleUnFormattedText"


    // $ANTLR start "ruleUnFormattedText"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:405:1: ruleUnFormattedText : ( ( rule__UnFormattedText__Group__0 ) ) ;
    public final void ruleUnFormattedText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:409:2: ( ( ( rule__UnFormattedText__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__UnFormattedText__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: ( ( rule__UnFormattedText__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:411:1: ( rule__UnFormattedText__Group__0 )
            {
             before(grammarAccess.getUnFormattedTextAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:1: ( rule__UnFormattedText__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:2: rule__UnFormattedText__Group__0
            {
            pushFollow(FOLLOW_rule__UnFormattedText__Group__0_in_ruleUnFormattedText814);
            rule__UnFormattedText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnFormattedTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnFormattedText"


    // $ANTLR start "entryRuleHyperlink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:424:1: entryRuleHyperlink : ruleHyperlink EOF ;
    public final void entryRuleHyperlink() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:425:1: ( ruleHyperlink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:426:1: ruleHyperlink EOF
            {
             before(grammarAccess.getHyperlinkRule()); 
            pushFollow(FOLLOW_ruleHyperlink_in_entryRuleHyperlink841);
            ruleHyperlink();

            state._fsp--;

             after(grammarAccess.getHyperlinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperlink848); 

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
    // $ANTLR end "entryRuleHyperlink"


    // $ANTLR start "ruleHyperlink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:433:1: ruleHyperlink : ( ( rule__Hyperlink__Alternatives ) ) ;
    public final void ruleHyperlink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:437:2: ( ( ( rule__Hyperlink__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Hyperlink__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: ( ( rule__Hyperlink__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:439:1: ( rule__Hyperlink__Alternatives )
            {
             before(grammarAccess.getHyperlinkAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:1: ( rule__Hyperlink__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:440:2: rule__Hyperlink__Alternatives
            {
            pushFollow(FOLLOW_rule__Hyperlink__Alternatives_in_ruleHyperlink874);
            rule__Hyperlink__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHyperlinkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHyperlink"


    // $ANTLR start "entryRuleExternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:452:1: entryRuleExternalLink : ruleExternalLink EOF ;
    public final void entryRuleExternalLink() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:453:1: ( ruleExternalLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:454:1: ruleExternalLink EOF
            {
             before(grammarAccess.getExternalLinkRule()); 
            pushFollow(FOLLOW_ruleExternalLink_in_entryRuleExternalLink901);
            ruleExternalLink();

            state._fsp--;

             after(grammarAccess.getExternalLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLink908); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:461:1: ruleExternalLink : ( ( rule__ExternalLink__Group__0 ) ) ;
    public final void ruleExternalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:465:2: ( ( ( rule__ExternalLink__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__ExternalLink__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:466:1: ( ( rule__ExternalLink__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:467:1: ( rule__ExternalLink__Group__0 )
            {
             before(grammarAccess.getExternalLinkAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:1: ( rule__ExternalLink__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:468:2: rule__ExternalLink__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__0_in_ruleExternalLink934);
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


    // $ANTLR start "entryRuleExternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:480:1: entryRuleExternalLinkAlternative : ruleExternalLinkAlternative EOF ;
    public final void entryRuleExternalLinkAlternative() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:481:1: ( ruleExternalLinkAlternative EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:482:1: ruleExternalLinkAlternative EOF
            {
             before(grammarAccess.getExternalLinkAlternativeRule()); 
            pushFollow(FOLLOW_ruleExternalLinkAlternative_in_entryRuleExternalLinkAlternative961);
            ruleExternalLinkAlternative();

            state._fsp--;

             after(grammarAccess.getExternalLinkAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalLinkAlternative968); 

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
    // $ANTLR end "entryRuleExternalLinkAlternative"


    // $ANTLR start "ruleExternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:489:1: ruleExternalLinkAlternative : ( ( rule__ExternalLinkAlternative__Group__0 ) ) ;
    public final void ruleExternalLinkAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:493:2: ( ( ( rule__ExternalLinkAlternative__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__ExternalLinkAlternative__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( ( rule__ExternalLinkAlternative__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:495:1: ( rule__ExternalLinkAlternative__Group__0 )
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:1: ( rule__ExternalLinkAlternative__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:496:2: rule__ExternalLinkAlternative__Group__0
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__0_in_ruleExternalLinkAlternative994);
            rule__ExternalLinkAlternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalLinkAlternative"


    // $ANTLR start "entryRuleInternalLink"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:508:1: entryRuleInternalLink : ruleInternalLink EOF ;
    public final void entryRuleInternalLink() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:509:1: ( ruleInternalLink EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:510:1: ruleInternalLink EOF
            {
             before(grammarAccess.getInternalLinkRule()); 
            pushFollow(FOLLOW_ruleInternalLink_in_entryRuleInternalLink1021);
            ruleInternalLink();

            state._fsp--;

             after(grammarAccess.getInternalLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLink1028); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:517:1: ruleInternalLink : ( ( rule__InternalLink__Group__0 ) ) ;
    public final void ruleInternalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:521:2: ( ( ( rule__InternalLink__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__InternalLink__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:522:1: ( ( rule__InternalLink__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:523:1: ( rule__InternalLink__Group__0 )
            {
             before(grammarAccess.getInternalLinkAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:1: ( rule__InternalLink__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:2: rule__InternalLink__Group__0
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__0_in_ruleInternalLink1054);
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


    // $ANTLR start "entryRuleInternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:536:1: entryRuleInternalLinkAlternative : ruleInternalLinkAlternative EOF ;
    public final void entryRuleInternalLinkAlternative() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:537:1: ( ruleInternalLinkAlternative EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:538:1: ruleInternalLinkAlternative EOF
            {
             before(grammarAccess.getInternalLinkAlternativeRule()); 
            pushFollow(FOLLOW_ruleInternalLinkAlternative_in_entryRuleInternalLinkAlternative1081);
            ruleInternalLinkAlternative();

            state._fsp--;

             after(grammarAccess.getInternalLinkAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalLinkAlternative1088); 

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
    // $ANTLR end "entryRuleInternalLinkAlternative"


    // $ANTLR start "ruleInternalLinkAlternative"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:545:1: ruleInternalLinkAlternative : ( ( rule__InternalLinkAlternative__Group__0 ) ) ;
    public final void ruleInternalLinkAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:549:2: ( ( ( rule__InternalLinkAlternative__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__InternalLinkAlternative__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: ( ( rule__InternalLinkAlternative__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:551:1: ( rule__InternalLinkAlternative__Group__0 )
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:1: ( rule__InternalLinkAlternative__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:552:2: rule__InternalLinkAlternative__Group__0
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__0_in_ruleInternalLinkAlternative1114);
            rule__InternalLinkAlternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalLinkAlternative"


    // $ANTLR start "rule__AbstractSection__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:564:1: rule__AbstractSection__Alternatives : ( ( ruleSubsectionLevel1 ) | ( ruleSubsectionLevel2 ) | ( ruleSubsectionLevel3 ) | ( ruleSubsectionLevel4 ) );
    public final void rule__AbstractSection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:568:1: ( ( ruleSubsectionLevel1 ) | ( ruleSubsectionLevel2 ) | ( ruleSubsectionLevel3 ) | ( ruleSubsectionLevel4 ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:569:1: ( ruleSubsectionLevel1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:569:1: ( ruleSubsectionLevel1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:570:1: ruleSubsectionLevel1
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel1_in_rule__AbstractSection__Alternatives1150);
                    ruleSubsectionLevel1();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:575:6: ( ruleSubsectionLevel2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:575:6: ( ruleSubsectionLevel2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:576:1: ruleSubsectionLevel2
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel2_in_rule__AbstractSection__Alternatives1167);
                    ruleSubsectionLevel2();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:581:6: ( ruleSubsectionLevel3 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:581:6: ( ruleSubsectionLevel3 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:582:1: ruleSubsectionLevel3
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel3_in_rule__AbstractSection__Alternatives1184);
                    ruleSubsectionLevel3();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:587:6: ( ruleSubsectionLevel4 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:587:6: ( ruleSubsectionLevel4 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:588:1: ruleSubsectionLevel4
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel4ParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel4_in_rule__AbstractSection__Alternatives1201);
                    ruleSubsectionLevel4();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel4ParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractSection__Alternatives"


    // $ANTLR start "rule__InlineContent__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:598:1: rule__InlineContent__Alternatives : ( ( ruleFormattedContent ) | ( ruleText ) );
    public final void rule__InlineContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:602:1: ( ( ruleFormattedContent ) | ( ruleText ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=20)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_WIKITEXT||LA2_0==21||LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:603:1: ( ruleFormattedContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:603:1: ( ruleFormattedContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:604:1: ruleFormattedContent
                    {
                     before(grammarAccess.getInlineContentAccess().getFormattedContentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFormattedContent_in_rule__InlineContent__Alternatives1233);
                    ruleFormattedContent();

                    state._fsp--;

                     after(grammarAccess.getInlineContentAccess().getFormattedContentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:609:6: ( ruleText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:609:6: ( ruleText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:610:1: ruleText
                    {
                     before(grammarAccess.getInlineContentAccess().getTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleText_in_rule__InlineContent__Alternatives1250);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getInlineContentAccess().getTextParserRuleCall_1()); 

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
    // $ANTLR end "rule__InlineContent__Alternatives"


    // $ANTLR start "rule__FormattedContent__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:620:1: rule__FormattedContent__Alternatives : ( ( ruleItalicContent ) | ( ruleBoldContent ) | ( ruleBoldItalicContent ) );
    public final void rule__FormattedContent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:624:1: ( ( ruleItalicContent ) | ( ruleBoldContent ) | ( ruleBoldItalicContent ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:625:1: ( ruleItalicContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:625:1: ( ruleItalicContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:626:1: ruleItalicContent
                    {
                     before(grammarAccess.getFormattedContentAccess().getItalicContentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleItalicContent_in_rule__FormattedContent__Alternatives1282);
                    ruleItalicContent();

                    state._fsp--;

                     after(grammarAccess.getFormattedContentAccess().getItalicContentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:631:6: ( ruleBoldContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:631:6: ( ruleBoldContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:632:1: ruleBoldContent
                    {
                     before(grammarAccess.getFormattedContentAccess().getBoldContentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoldContent_in_rule__FormattedContent__Alternatives1299);
                    ruleBoldContent();

                    state._fsp--;

                     after(grammarAccess.getFormattedContentAccess().getBoldContentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:637:6: ( ruleBoldItalicContent )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:637:6: ( ruleBoldItalicContent )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:638:1: ruleBoldItalicContent
                    {
                     before(grammarAccess.getFormattedContentAccess().getBoldItalicContentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoldItalicContent_in_rule__FormattedContent__Alternatives1316);
                    ruleBoldItalicContent();

                    state._fsp--;

                     after(grammarAccess.getFormattedContentAccess().getBoldItalicContentParserRuleCall_2()); 

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
    // $ANTLR end "rule__FormattedContent__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:648:1: rule__Text__Alternatives : ( ( ruleUnFormattedText ) | ( ruleHyperlink ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:652:1: ( ( ruleUnFormattedText ) | ( ruleHyperlink ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WIKITEXT) ) {
                alt4=1;
            }
            else if ( (LA4_0==21||LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:653:1: ( ruleUnFormattedText )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:653:1: ( ruleUnFormattedText )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:654:1: ruleUnFormattedText
                    {
                     before(grammarAccess.getTextAccess().getUnFormattedTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUnFormattedText_in_rule__Text__Alternatives1348);
                    ruleUnFormattedText();

                    state._fsp--;

                     after(grammarAccess.getTextAccess().getUnFormattedTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:659:6: ( ruleHyperlink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:659:6: ( ruleHyperlink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:660:1: ruleHyperlink
                    {
                     before(grammarAccess.getTextAccess().getHyperlinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHyperlink_in_rule__Text__Alternatives1365);
                    ruleHyperlink();

                    state._fsp--;

                     after(grammarAccess.getTextAccess().getHyperlinkParserRuleCall_1()); 

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
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__Hyperlink__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:670:1: rule__Hyperlink__Alternatives : ( ( ruleInternalLink ) | ( ruleInternalLinkAlternative ) | ( ruleExternalLink ) | ( ruleExternalLinkAlternative ) );
    public final void rule__Hyperlink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:674:1: ( ( ruleInternalLink ) | ( ruleInternalLinkAlternative ) | ( ruleExternalLink ) | ( ruleExternalLinkAlternative ) )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:675:1: ( ruleInternalLink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:675:1: ( ruleInternalLink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:676:1: ruleInternalLink
                    {
                     before(grammarAccess.getHyperlinkAccess().getInternalLinkParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInternalLink_in_rule__Hyperlink__Alternatives1397);
                    ruleInternalLink();

                    state._fsp--;

                     after(grammarAccess.getHyperlinkAccess().getInternalLinkParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:681:6: ( ruleInternalLinkAlternative )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:681:6: ( ruleInternalLinkAlternative )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:682:1: ruleInternalLinkAlternative
                    {
                     before(grammarAccess.getHyperlinkAccess().getInternalLinkAlternativeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInternalLinkAlternative_in_rule__Hyperlink__Alternatives1414);
                    ruleInternalLinkAlternative();

                    state._fsp--;

                     after(grammarAccess.getHyperlinkAccess().getInternalLinkAlternativeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:687:6: ( ruleExternalLink )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:687:6: ( ruleExternalLink )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:688:1: ruleExternalLink
                    {
                     before(grammarAccess.getHyperlinkAccess().getExternalLinkParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExternalLink_in_rule__Hyperlink__Alternatives1431);
                    ruleExternalLink();

                    state._fsp--;

                     after(grammarAccess.getHyperlinkAccess().getExternalLinkParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:693:6: ( ruleExternalLinkAlternative )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:693:6: ( ruleExternalLinkAlternative )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:694:1: ruleExternalLinkAlternative
                    {
                     before(grammarAccess.getHyperlinkAccess().getExternalLinkAlternativeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleExternalLinkAlternative_in_rule__Hyperlink__Alternatives1448);
                    ruleExternalLinkAlternative();

                    state._fsp--;

                     after(grammarAccess.getHyperlinkAccess().getExternalLinkAlternativeParserRuleCall_3()); 

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
    // $ANTLR end "rule__Hyperlink__Alternatives"


    // $ANTLR start "rule__Wikipage__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:706:1: rule__Wikipage__Group__0 : rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1 ;
    public final void rule__Wikipage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:710:1: ( rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:711:2: rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__0__Impl_in_rule__Wikipage__Group__01478);
            rule__Wikipage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__1_in_rule__Wikipage__Group__01481);
            rule__Wikipage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__0"


    // $ANTLR start "rule__Wikipage__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:1: rule__Wikipage__Group__0__Impl : ( '=' ) ;
    public final void rule__Wikipage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:722:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:723:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:723:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:724:1: '='
            {
             before(grammarAccess.getWikipageAccess().getEqualsSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Wikipage__Group__0__Impl1509); 
             after(grammarAccess.getWikipageAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__0__Impl"


    // $ANTLR start "rule__Wikipage__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:737:1: rule__Wikipage__Group__1 : rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2 ;
    public final void rule__Wikipage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:741:1: ( rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:742:2: rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__1__Impl_in_rule__Wikipage__Group__11540);
            rule__Wikipage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__2_in_rule__Wikipage__Group__11543);
            rule__Wikipage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__1"


    // $ANTLR start "rule__Wikipage__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:749:1: rule__Wikipage__Group__1__Impl : ( ( rule__Wikipage__TitleAssignment_1 ) ) ;
    public final void rule__Wikipage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:753:1: ( ( ( rule__Wikipage__TitleAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:754:1: ( ( rule__Wikipage__TitleAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:754:1: ( ( rule__Wikipage__TitleAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:755:1: ( rule__Wikipage__TitleAssignment_1 )
            {
             before(grammarAccess.getWikipageAccess().getTitleAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:756:1: ( rule__Wikipage__TitleAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:756:2: rule__Wikipage__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__Wikipage__TitleAssignment_1_in_rule__Wikipage__Group__1__Impl1570);
            rule__Wikipage__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWikipageAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__1__Impl"


    // $ANTLR start "rule__Wikipage__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:766:1: rule__Wikipage__Group__2 : rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3 ;
    public final void rule__Wikipage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:770:1: ( rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:771:2: rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__2__Impl_in_rule__Wikipage__Group__21600);
            rule__Wikipage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__3_in_rule__Wikipage__Group__21603);
            rule__Wikipage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__2"


    // $ANTLR start "rule__Wikipage__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:778:1: rule__Wikipage__Group__2__Impl : ( ( RULE_WIKITEXT )* ) ;
    public final void rule__Wikipage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:782:1: ( ( ( RULE_WIKITEXT )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:783:1: ( ( RULE_WIKITEXT )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:783:1: ( ( RULE_WIKITEXT )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:784:1: ( RULE_WIKITEXT )*
            {
             before(grammarAccess.getWikipageAccess().getWIKITEXTTerminalRuleCall_2()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:785:1: ( RULE_WIKITEXT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_WIKITEXT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:785:3: RULE_WIKITEXT
            	    {
            	    match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rule__Wikipage__Group__2__Impl1631); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWikipageAccess().getWIKITEXTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__2__Impl"


    // $ANTLR start "rule__Wikipage__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:795:1: rule__Wikipage__Group__3 : rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4 ;
    public final void rule__Wikipage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:799:1: ( rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:800:2: rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__3__Impl_in_rule__Wikipage__Group__31662);
            rule__Wikipage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__4_in_rule__Wikipage__Group__31665);
            rule__Wikipage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__3"


    // $ANTLR start "rule__Wikipage__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:807:1: rule__Wikipage__Group__3__Impl : ( '=' ) ;
    public final void rule__Wikipage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:811:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:812:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:812:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:813:1: '='
            {
             before(grammarAccess.getWikipageAccess().getEqualsSignKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Wikipage__Group__3__Impl1693); 
             after(grammarAccess.getWikipageAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__3__Impl"


    // $ANTLR start "rule__Wikipage__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:826:1: rule__Wikipage__Group__4 : rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5 ;
    public final void rule__Wikipage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:831:2: rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__4__Impl_in_rule__Wikipage__Group__41724);
            rule__Wikipage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__5_in_rule__Wikipage__Group__41727);
            rule__Wikipage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__4"


    // $ANTLR start "rule__Wikipage__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:838:1: rule__Wikipage__Group__4__Impl : ( '\\n' ) ;
    public final void rule__Wikipage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:842:1: ( ( '\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:843:1: ( '\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:843:1: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:844:1: '\\n'
            {
             before(grammarAccess.getWikipageAccess().getControl000aKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Wikipage__Group__4__Impl1755); 
             after(grammarAccess.getWikipageAccess().getControl000aKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__4__Impl"


    // $ANTLR start "rule__Wikipage__Group__5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:857:1: rule__Wikipage__Group__5 : rule__Wikipage__Group__5__Impl rule__Wikipage__Group__6 ;
    public final void rule__Wikipage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:861:1: ( rule__Wikipage__Group__5__Impl rule__Wikipage__Group__6 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:862:2: rule__Wikipage__Group__5__Impl rule__Wikipage__Group__6
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__5__Impl_in_rule__Wikipage__Group__51786);
            rule__Wikipage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__6_in_rule__Wikipage__Group__51789);
            rule__Wikipage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__5"


    // $ANTLR start "rule__Wikipage__Group__5__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:869:1: rule__Wikipage__Group__5__Impl : ( ( rule__Wikipage__ContentAssignment_5 )* ) ;
    public final void rule__Wikipage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:873:1: ( ( ( rule__Wikipage__ContentAssignment_5 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:874:1: ( ( rule__Wikipage__ContentAssignment_5 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:874:1: ( ( rule__Wikipage__ContentAssignment_5 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:875:1: ( rule__Wikipage__ContentAssignment_5 )*
            {
             before(grammarAccess.getWikipageAccess().getContentAssignment_5()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:876:1: ( rule__Wikipage__ContentAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WIKITEXT||(LA7_0>=18 && LA7_0<=21)||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:876:2: rule__Wikipage__ContentAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Wikipage__ContentAssignment_5_in_rule__Wikipage__Group__5__Impl1816);
            	    rule__Wikipage__ContentAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWikipageAccess().getContentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__5__Impl"


    // $ANTLR start "rule__Wikipage__Group__6"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:886:1: rule__Wikipage__Group__6 : rule__Wikipage__Group__6__Impl rule__Wikipage__Group__7 ;
    public final void rule__Wikipage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:890:1: ( rule__Wikipage__Group__6__Impl rule__Wikipage__Group__7 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:891:2: rule__Wikipage__Group__6__Impl rule__Wikipage__Group__7
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__6__Impl_in_rule__Wikipage__Group__61847);
            rule__Wikipage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__7_in_rule__Wikipage__Group__61850);
            rule__Wikipage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__6"


    // $ANTLR start "rule__Wikipage__Group__6__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:898:1: rule__Wikipage__Group__6__Impl : ( ( rule__Wikipage__SectionsAssignment_6 ) ) ;
    public final void rule__Wikipage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:902:1: ( ( ( rule__Wikipage__SectionsAssignment_6 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:903:1: ( ( rule__Wikipage__SectionsAssignment_6 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:903:1: ( ( rule__Wikipage__SectionsAssignment_6 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:904:1: ( rule__Wikipage__SectionsAssignment_6 )
            {
             before(grammarAccess.getWikipageAccess().getSectionsAssignment_6()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:1: ( rule__Wikipage__SectionsAssignment_6 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:2: rule__Wikipage__SectionsAssignment_6
            {
            pushFollow(FOLLOW_rule__Wikipage__SectionsAssignment_6_in_rule__Wikipage__Group__6__Impl1877);
            rule__Wikipage__SectionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWikipageAccess().getSectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__6__Impl"


    // $ANTLR start "rule__Wikipage__Group__7"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:915:1: rule__Wikipage__Group__7 : rule__Wikipage__Group__7__Impl ;
    public final void rule__Wikipage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:919:1: ( rule__Wikipage__Group__7__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:920:2: rule__Wikipage__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__7__Impl_in_rule__Wikipage__Group__71907);
            rule__Wikipage__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__7"


    // $ANTLR start "rule__Wikipage__Group__7__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:926:1: rule__Wikipage__Group__7__Impl : ( ( rule__Wikipage__SectionsAssignment_7 )* ) ;
    public final void rule__Wikipage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:930:1: ( ( ( rule__Wikipage__SectionsAssignment_7 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:931:1: ( ( rule__Wikipage__SectionsAssignment_7 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:931:1: ( ( rule__Wikipage__SectionsAssignment_7 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:932:1: ( rule__Wikipage__SectionsAssignment_7 )*
            {
             before(grammarAccess.getWikipageAccess().getSectionsAssignment_7()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:933:1: ( rule__Wikipage__SectionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=14 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:933:2: rule__Wikipage__SectionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Wikipage__SectionsAssignment_7_in_rule__Wikipage__Group__7__Impl1934);
            	    rule__Wikipage__SectionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWikipageAccess().getSectionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__Group__7__Impl"


    // $ANTLR start "rule__SubsectionLevel1__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:959:1: rule__SubsectionLevel1__Group__0 : rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1 ;
    public final void rule__SubsectionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:963:1: ( rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:964:2: rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__0__Impl_in_rule__SubsectionLevel1__Group__01981);
            rule__SubsectionLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__1_in_rule__SubsectionLevel1__Group__01984);
            rule__SubsectionLevel1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__0"


    // $ANTLR start "rule__SubsectionLevel1__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:971:1: rule__SubsectionLevel1__Group__0__Impl : ( '==' ) ;
    public final void rule__SubsectionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:975:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:976:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:976:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:977:1: '=='
            {
             before(grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SubsectionLevel1__Group__0__Impl2012); 
             after(grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__0__Impl"


    // $ANTLR start "rule__SubsectionLevel1__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:990:1: rule__SubsectionLevel1__Group__1 : rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2 ;
    public final void rule__SubsectionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:994:1: ( rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:995:2: rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__1__Impl_in_rule__SubsectionLevel1__Group__12043);
            rule__SubsectionLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__2_in_rule__SubsectionLevel1__Group__12046);
            rule__SubsectionLevel1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__1"


    // $ANTLR start "rule__SubsectionLevel1__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1002:1: rule__SubsectionLevel1__Group__1__Impl : ( ( rule__SubsectionLevel1__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1006:1: ( ( ( rule__SubsectionLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1007:1: ( ( rule__SubsectionLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1007:1: ( ( rule__SubsectionLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1008:1: ( rule__SubsectionLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:1: ( rule__SubsectionLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1009:2: rule__SubsectionLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__NameAssignment_1_in_rule__SubsectionLevel1__Group__1__Impl2073);
            rule__SubsectionLevel1__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel1Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__1__Impl"


    // $ANTLR start "rule__SubsectionLevel1__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1019:1: rule__SubsectionLevel1__Group__2 : rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3 ;
    public final void rule__SubsectionLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1023:1: ( rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1024:2: rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__2__Impl_in_rule__SubsectionLevel1__Group__22103);
            rule__SubsectionLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__3_in_rule__SubsectionLevel1__Group__22106);
            rule__SubsectionLevel1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__2"


    // $ANTLR start "rule__SubsectionLevel1__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:1: rule__SubsectionLevel1__Group__2__Impl : ( '==' ) ;
    public final void rule__SubsectionLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1035:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1036:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1036:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1037:1: '=='
            {
             before(grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SubsectionLevel1__Group__2__Impl2134); 
             after(grammarAccess.getSubsectionLevel1Access().getEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__2__Impl"


    // $ANTLR start "rule__SubsectionLevel1__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1050:1: rule__SubsectionLevel1__Group__3 : rule__SubsectionLevel1__Group__3__Impl rule__SubsectionLevel1__Group__4 ;
    public final void rule__SubsectionLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1054:1: ( rule__SubsectionLevel1__Group__3__Impl rule__SubsectionLevel1__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1055:2: rule__SubsectionLevel1__Group__3__Impl rule__SubsectionLevel1__Group__4
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__3__Impl_in_rule__SubsectionLevel1__Group__32165);
            rule__SubsectionLevel1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__4_in_rule__SubsectionLevel1__Group__32168);
            rule__SubsectionLevel1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__3"


    // $ANTLR start "rule__SubsectionLevel1__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1062:1: rule__SubsectionLevel1__Group__3__Impl : ( '\\n' ) ;
    public final void rule__SubsectionLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1066:1: ( ( '\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1067:1: ( '\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1067:1: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1068:1: '\\n'
            {
             before(grammarAccess.getSubsectionLevel1Access().getControl000aKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SubsectionLevel1__Group__3__Impl2196); 
             after(grammarAccess.getSubsectionLevel1Access().getControl000aKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__3__Impl"


    // $ANTLR start "rule__SubsectionLevel1__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: rule__SubsectionLevel1__Group__4 : rule__SubsectionLevel1__Group__4__Impl ;
    public final void rule__SubsectionLevel1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1085:1: ( rule__SubsectionLevel1__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1086:2: rule__SubsectionLevel1__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__4__Impl_in_rule__SubsectionLevel1__Group__42227);
            rule__SubsectionLevel1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__4"


    // $ANTLR start "rule__SubsectionLevel1__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1092:1: rule__SubsectionLevel1__Group__4__Impl : ( ( rule__SubsectionLevel1__ContentAssignment_4 )* ) ;
    public final void rule__SubsectionLevel1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1096:1: ( ( ( rule__SubsectionLevel1__ContentAssignment_4 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1097:1: ( ( rule__SubsectionLevel1__ContentAssignment_4 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1097:1: ( ( rule__SubsectionLevel1__ContentAssignment_4 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1098:1: ( rule__SubsectionLevel1__ContentAssignment_4 )*
            {
             before(grammarAccess.getSubsectionLevel1Access().getContentAssignment_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1099:1: ( rule__SubsectionLevel1__ContentAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WIKITEXT||(LA9_0>=18 && LA9_0<=21)||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1099:2: rule__SubsectionLevel1__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubsectionLevel1__ContentAssignment_4_in_rule__SubsectionLevel1__Group__4__Impl2254);
            	    rule__SubsectionLevel1__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubsectionLevel1Access().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__Group__4__Impl"


    // $ANTLR start "rule__SubsectionLevel2__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1119:1: rule__SubsectionLevel2__Group__0 : rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1 ;
    public final void rule__SubsectionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1123:1: ( rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1124:2: rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__0__Impl_in_rule__SubsectionLevel2__Group__02295);
            rule__SubsectionLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__1_in_rule__SubsectionLevel2__Group__02298);
            rule__SubsectionLevel2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__0"


    // $ANTLR start "rule__SubsectionLevel2__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: rule__SubsectionLevel2__Group__0__Impl : ( '===' ) ;
    public final void rule__SubsectionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1135:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1136:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1136:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1137:1: '==='
            {
             before(grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SubsectionLevel2__Group__0__Impl2326); 
             after(grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__0__Impl"


    // $ANTLR start "rule__SubsectionLevel2__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1150:1: rule__SubsectionLevel2__Group__1 : rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2 ;
    public final void rule__SubsectionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1154:1: ( rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1155:2: rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__1__Impl_in_rule__SubsectionLevel2__Group__12357);
            rule__SubsectionLevel2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__2_in_rule__SubsectionLevel2__Group__12360);
            rule__SubsectionLevel2__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__1"


    // $ANTLR start "rule__SubsectionLevel2__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1162:1: rule__SubsectionLevel2__Group__1__Impl : ( ( rule__SubsectionLevel2__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1166:1: ( ( ( rule__SubsectionLevel2__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1167:1: ( ( rule__SubsectionLevel2__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1167:1: ( ( rule__SubsectionLevel2__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1168:1: ( rule__SubsectionLevel2__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel2Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1169:1: ( rule__SubsectionLevel2__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1169:2: rule__SubsectionLevel2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__NameAssignment_1_in_rule__SubsectionLevel2__Group__1__Impl2387);
            rule__SubsectionLevel2__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel2Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__1__Impl"


    // $ANTLR start "rule__SubsectionLevel2__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1179:1: rule__SubsectionLevel2__Group__2 : rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3 ;
    public final void rule__SubsectionLevel2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1183:1: ( rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1184:2: rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__2__Impl_in_rule__SubsectionLevel2__Group__22417);
            rule__SubsectionLevel2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__3_in_rule__SubsectionLevel2__Group__22420);
            rule__SubsectionLevel2__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__2"


    // $ANTLR start "rule__SubsectionLevel2__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:1: rule__SubsectionLevel2__Group__2__Impl : ( '===' ) ;
    public final void rule__SubsectionLevel2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1195:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1196:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1196:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1197:1: '==='
            {
             before(grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__SubsectionLevel2__Group__2__Impl2448); 
             after(grammarAccess.getSubsectionLevel2Access().getEqualsSignEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__2__Impl"


    // $ANTLR start "rule__SubsectionLevel2__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1210:1: rule__SubsectionLevel2__Group__3 : rule__SubsectionLevel2__Group__3__Impl rule__SubsectionLevel2__Group__4 ;
    public final void rule__SubsectionLevel2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1214:1: ( rule__SubsectionLevel2__Group__3__Impl rule__SubsectionLevel2__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1215:2: rule__SubsectionLevel2__Group__3__Impl rule__SubsectionLevel2__Group__4
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__3__Impl_in_rule__SubsectionLevel2__Group__32479);
            rule__SubsectionLevel2__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__4_in_rule__SubsectionLevel2__Group__32482);
            rule__SubsectionLevel2__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__3"


    // $ANTLR start "rule__SubsectionLevel2__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1222:1: rule__SubsectionLevel2__Group__3__Impl : ( '\\n' ) ;
    public final void rule__SubsectionLevel2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1226:1: ( ( '\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1227:1: ( '\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1227:1: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1228:1: '\\n'
            {
             before(grammarAccess.getSubsectionLevel2Access().getControl000aKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SubsectionLevel2__Group__3__Impl2510); 
             after(grammarAccess.getSubsectionLevel2Access().getControl000aKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__3__Impl"


    // $ANTLR start "rule__SubsectionLevel2__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1241:1: rule__SubsectionLevel2__Group__4 : rule__SubsectionLevel2__Group__4__Impl ;
    public final void rule__SubsectionLevel2__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1245:1: ( rule__SubsectionLevel2__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1246:2: rule__SubsectionLevel2__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__4__Impl_in_rule__SubsectionLevel2__Group__42541);
            rule__SubsectionLevel2__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__4"


    // $ANTLR start "rule__SubsectionLevel2__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1252:1: rule__SubsectionLevel2__Group__4__Impl : ( ( rule__SubsectionLevel2__ContentAssignment_4 )* ) ;
    public final void rule__SubsectionLevel2__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1256:1: ( ( ( rule__SubsectionLevel2__ContentAssignment_4 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1257:1: ( ( rule__SubsectionLevel2__ContentAssignment_4 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1257:1: ( ( rule__SubsectionLevel2__ContentAssignment_4 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1258:1: ( rule__SubsectionLevel2__ContentAssignment_4 )*
            {
             before(grammarAccess.getSubsectionLevel2Access().getContentAssignment_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1259:1: ( rule__SubsectionLevel2__ContentAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WIKITEXT||(LA10_0>=18 && LA10_0<=21)||LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1259:2: rule__SubsectionLevel2__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubsectionLevel2__ContentAssignment_4_in_rule__SubsectionLevel2__Group__4__Impl2568);
            	    rule__SubsectionLevel2__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubsectionLevel2Access().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__Group__4__Impl"


    // $ANTLR start "rule__SubsectionLevel3__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1279:1: rule__SubsectionLevel3__Group__0 : rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1 ;
    public final void rule__SubsectionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1283:1: ( rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1284:2: rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__0__Impl_in_rule__SubsectionLevel3__Group__02609);
            rule__SubsectionLevel3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__1_in_rule__SubsectionLevel3__Group__02612);
            rule__SubsectionLevel3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__0"


    // $ANTLR start "rule__SubsectionLevel3__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1291:1: rule__SubsectionLevel3__Group__0__Impl : ( '====' ) ;
    public final void rule__SubsectionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1295:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1296:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1296:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1297:1: '===='
            {
             before(grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SubsectionLevel3__Group__0__Impl2640); 
             after(grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__0__Impl"


    // $ANTLR start "rule__SubsectionLevel3__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1310:1: rule__SubsectionLevel3__Group__1 : rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2 ;
    public final void rule__SubsectionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1314:1: ( rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1315:2: rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__1__Impl_in_rule__SubsectionLevel3__Group__12671);
            rule__SubsectionLevel3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__2_in_rule__SubsectionLevel3__Group__12674);
            rule__SubsectionLevel3__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__1"


    // $ANTLR start "rule__SubsectionLevel3__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1322:1: rule__SubsectionLevel3__Group__1__Impl : ( ( rule__SubsectionLevel3__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1326:1: ( ( ( rule__SubsectionLevel3__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1327:1: ( ( rule__SubsectionLevel3__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1327:1: ( ( rule__SubsectionLevel3__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1328:1: ( rule__SubsectionLevel3__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel3Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1329:1: ( rule__SubsectionLevel3__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1329:2: rule__SubsectionLevel3__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__NameAssignment_1_in_rule__SubsectionLevel3__Group__1__Impl2701);
            rule__SubsectionLevel3__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel3Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__1__Impl"


    // $ANTLR start "rule__SubsectionLevel3__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1339:1: rule__SubsectionLevel3__Group__2 : rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3 ;
    public final void rule__SubsectionLevel3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1343:1: ( rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1344:2: rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__2__Impl_in_rule__SubsectionLevel3__Group__22731);
            rule__SubsectionLevel3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__3_in_rule__SubsectionLevel3__Group__22734);
            rule__SubsectionLevel3__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__2"


    // $ANTLR start "rule__SubsectionLevel3__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1351:1: rule__SubsectionLevel3__Group__2__Impl : ( '====' ) ;
    public final void rule__SubsectionLevel3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1355:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1356:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1356:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1357:1: '===='
            {
             before(grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__SubsectionLevel3__Group__2__Impl2762); 
             after(grammarAccess.getSubsectionLevel3Access().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__2__Impl"


    // $ANTLR start "rule__SubsectionLevel3__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1370:1: rule__SubsectionLevel3__Group__3 : rule__SubsectionLevel3__Group__3__Impl rule__SubsectionLevel3__Group__4 ;
    public final void rule__SubsectionLevel3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1374:1: ( rule__SubsectionLevel3__Group__3__Impl rule__SubsectionLevel3__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1375:2: rule__SubsectionLevel3__Group__3__Impl rule__SubsectionLevel3__Group__4
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__3__Impl_in_rule__SubsectionLevel3__Group__32793);
            rule__SubsectionLevel3__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__4_in_rule__SubsectionLevel3__Group__32796);
            rule__SubsectionLevel3__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__3"


    // $ANTLR start "rule__SubsectionLevel3__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1382:1: rule__SubsectionLevel3__Group__3__Impl : ( '\\n' ) ;
    public final void rule__SubsectionLevel3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1386:1: ( ( '\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1387:1: ( '\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1387:1: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1388:1: '\\n'
            {
             before(grammarAccess.getSubsectionLevel3Access().getControl000aKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SubsectionLevel3__Group__3__Impl2824); 
             after(grammarAccess.getSubsectionLevel3Access().getControl000aKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__3__Impl"


    // $ANTLR start "rule__SubsectionLevel3__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1401:1: rule__SubsectionLevel3__Group__4 : rule__SubsectionLevel3__Group__4__Impl ;
    public final void rule__SubsectionLevel3__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1405:1: ( rule__SubsectionLevel3__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1406:2: rule__SubsectionLevel3__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__4__Impl_in_rule__SubsectionLevel3__Group__42855);
            rule__SubsectionLevel3__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__4"


    // $ANTLR start "rule__SubsectionLevel3__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1412:1: rule__SubsectionLevel3__Group__4__Impl : ( ( rule__SubsectionLevel3__ContentAssignment_4 )* ) ;
    public final void rule__SubsectionLevel3__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1416:1: ( ( ( rule__SubsectionLevel3__ContentAssignment_4 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1417:1: ( ( rule__SubsectionLevel3__ContentAssignment_4 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1417:1: ( ( rule__SubsectionLevel3__ContentAssignment_4 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1418:1: ( rule__SubsectionLevel3__ContentAssignment_4 )*
            {
             before(grammarAccess.getSubsectionLevel3Access().getContentAssignment_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1419:1: ( rule__SubsectionLevel3__ContentAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WIKITEXT||(LA11_0>=18 && LA11_0<=21)||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1419:2: rule__SubsectionLevel3__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubsectionLevel3__ContentAssignment_4_in_rule__SubsectionLevel3__Group__4__Impl2882);
            	    rule__SubsectionLevel3__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSubsectionLevel3Access().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__Group__4__Impl"


    // $ANTLR start "rule__SubsectionLevel4__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1439:1: rule__SubsectionLevel4__Group__0 : rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1 ;
    public final void rule__SubsectionLevel4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1443:1: ( rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1444:2: rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__0__Impl_in_rule__SubsectionLevel4__Group__02923);
            rule__SubsectionLevel4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__1_in_rule__SubsectionLevel4__Group__02926);
            rule__SubsectionLevel4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__0"


    // $ANTLR start "rule__SubsectionLevel4__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1451:1: rule__SubsectionLevel4__Group__0__Impl : ( '=====' ) ;
    public final void rule__SubsectionLevel4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1455:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1456:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1456:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1457:1: '====='
            {
             before(grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SubsectionLevel4__Group__0__Impl2954); 
             after(grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__0__Impl"


    // $ANTLR start "rule__SubsectionLevel4__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1470:1: rule__SubsectionLevel4__Group__1 : rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2 ;
    public final void rule__SubsectionLevel4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1474:1: ( rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1475:2: rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__1__Impl_in_rule__SubsectionLevel4__Group__12985);
            rule__SubsectionLevel4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__2_in_rule__SubsectionLevel4__Group__12988);
            rule__SubsectionLevel4__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__1"


    // $ANTLR start "rule__SubsectionLevel4__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1482:1: rule__SubsectionLevel4__Group__1__Impl : ( ( rule__SubsectionLevel4__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1486:1: ( ( ( rule__SubsectionLevel4__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1487:1: ( ( rule__SubsectionLevel4__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1487:1: ( ( rule__SubsectionLevel4__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1488:1: ( rule__SubsectionLevel4__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel4Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1489:1: ( rule__SubsectionLevel4__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1489:2: rule__SubsectionLevel4__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__NameAssignment_1_in_rule__SubsectionLevel4__Group__1__Impl3015);
            rule__SubsectionLevel4__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsectionLevel4Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__1__Impl"


    // $ANTLR start "rule__SubsectionLevel4__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1499:1: rule__SubsectionLevel4__Group__2 : rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3 ;
    public final void rule__SubsectionLevel4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1503:1: ( rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1504:2: rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__2__Impl_in_rule__SubsectionLevel4__Group__23045);
            rule__SubsectionLevel4__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__3_in_rule__SubsectionLevel4__Group__23048);
            rule__SubsectionLevel4__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__2"


    // $ANTLR start "rule__SubsectionLevel4__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1511:1: rule__SubsectionLevel4__Group__2__Impl : ( '=====' ) ;
    public final void rule__SubsectionLevel4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1515:1: ( ( '=====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1516:1: ( '=====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1516:1: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1517:1: '====='
            {
             before(grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__SubsectionLevel4__Group__2__Impl3076); 
             after(grammarAccess.getSubsectionLevel4Access().getEqualsSignEqualsSignEqualsSignEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__2__Impl"


    // $ANTLR start "rule__SubsectionLevel4__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1530:1: rule__SubsectionLevel4__Group__3 : rule__SubsectionLevel4__Group__3__Impl rule__SubsectionLevel4__Group__4 ;
    public final void rule__SubsectionLevel4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1534:1: ( rule__SubsectionLevel4__Group__3__Impl rule__SubsectionLevel4__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1535:2: rule__SubsectionLevel4__Group__3__Impl rule__SubsectionLevel4__Group__4
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__3__Impl_in_rule__SubsectionLevel4__Group__33107);
            rule__SubsectionLevel4__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__4_in_rule__SubsectionLevel4__Group__33110);
            rule__SubsectionLevel4__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__3"


    // $ANTLR start "rule__SubsectionLevel4__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1542:1: rule__SubsectionLevel4__Group__3__Impl : ( '\\n' ) ;
    public final void rule__SubsectionLevel4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1546:1: ( ( '\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1547:1: ( '\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1547:1: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1548:1: '\\n'
            {
             before(grammarAccess.getSubsectionLevel4Access().getControl000aKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__SubsectionLevel4__Group__3__Impl3138); 
             after(grammarAccess.getSubsectionLevel4Access().getControl000aKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__3__Impl"


    // $ANTLR start "rule__SubsectionLevel4__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1561:1: rule__SubsectionLevel4__Group__4 : rule__SubsectionLevel4__Group__4__Impl ;
    public final void rule__SubsectionLevel4__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1565:1: ( rule__SubsectionLevel4__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1566:2: rule__SubsectionLevel4__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__4__Impl_in_rule__SubsectionLevel4__Group__43169);
            rule__SubsectionLevel4__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__4"


    // $ANTLR start "rule__SubsectionLevel4__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1572:1: rule__SubsectionLevel4__Group__4__Impl : ( ( rule__SubsectionLevel4__ContentAssignment_4 )* ) ;
    public final void rule__SubsectionLevel4__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1576:1: ( ( ( rule__SubsectionLevel4__ContentAssignment_4 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1577:1: ( ( rule__SubsectionLevel4__ContentAssignment_4 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1577:1: ( ( rule__SubsectionLevel4__ContentAssignment_4 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1578:1: ( rule__SubsectionLevel4__ContentAssignment_4 )*
            {
             before(grammarAccess.getSubsectionLevel4Access().getContentAssignment_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1579:1: ( rule__SubsectionLevel4__ContentAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_WIKITEXT||(LA12_0>=18 && LA12_0<=21)||LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1579:2: rule__SubsectionLevel4__ContentAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubsectionLevel4__ContentAssignment_4_in_rule__SubsectionLevel4__Group__4__Impl3196);
            	    rule__SubsectionLevel4__ContentAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSubsectionLevel4Access().getContentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__Group__4__Impl"


    // $ANTLR start "rule__ItalicContent__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1599:1: rule__ItalicContent__Group__0 : rule__ItalicContent__Group__0__Impl rule__ItalicContent__Group__1 ;
    public final void rule__ItalicContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1603:1: ( rule__ItalicContent__Group__0__Impl rule__ItalicContent__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1604:2: rule__ItalicContent__Group__0__Impl rule__ItalicContent__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicContent__Group__0__Impl_in_rule__ItalicContent__Group__03237);
            rule__ItalicContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicContent__Group__1_in_rule__ItalicContent__Group__03240);
            rule__ItalicContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__0"


    // $ANTLR start "rule__ItalicContent__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1611:1: rule__ItalicContent__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1615:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1616:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1616:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1617:1: '\\'\\''
            {
             before(grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ItalicContent__Group__0__Impl3268); 
             after(grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__0__Impl"


    // $ANTLR start "rule__ItalicContent__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1630:1: rule__ItalicContent__Group__1 : rule__ItalicContent__Group__1__Impl rule__ItalicContent__Group__2 ;
    public final void rule__ItalicContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1634:1: ( rule__ItalicContent__Group__1__Impl rule__ItalicContent__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1635:2: rule__ItalicContent__Group__1__Impl rule__ItalicContent__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicContent__Group__1__Impl_in_rule__ItalicContent__Group__13299);
            rule__ItalicContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicContent__Group__2_in_rule__ItalicContent__Group__13302);
            rule__ItalicContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__1"


    // $ANTLR start "rule__ItalicContent__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1642:1: rule__ItalicContent__Group__1__Impl : ( ruleText ) ;
    public final void rule__ItalicContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1646:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1647:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1647:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1648:1: ruleText
            {
             before(grammarAccess.getItalicContentAccess().getTextParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__ItalicContent__Group__1__Impl3329);
            ruleText();

            state._fsp--;

             after(grammarAccess.getItalicContentAccess().getTextParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__1__Impl"


    // $ANTLR start "rule__ItalicContent__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1659:1: rule__ItalicContent__Group__2 : rule__ItalicContent__Group__2__Impl ;
    public final void rule__ItalicContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1663:1: ( rule__ItalicContent__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1664:2: rule__ItalicContent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicContent__Group__2__Impl_in_rule__ItalicContent__Group__23358);
            rule__ItalicContent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__2"


    // $ANTLR start "rule__ItalicContent__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1670:1: rule__ItalicContent__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1674:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1675:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1675:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1676:1: '\\'\\''
            {
             before(grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ItalicContent__Group__2__Impl3386); 
             after(grammarAccess.getItalicContentAccess().getApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicContent__Group__2__Impl"


    // $ANTLR start "rule__BoldContent__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1695:1: rule__BoldContent__Group__0 : rule__BoldContent__Group__0__Impl rule__BoldContent__Group__1 ;
    public final void rule__BoldContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1699:1: ( rule__BoldContent__Group__0__Impl rule__BoldContent__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1700:2: rule__BoldContent__Group__0__Impl rule__BoldContent__Group__1
            {
            pushFollow(FOLLOW_rule__BoldContent__Group__0__Impl_in_rule__BoldContent__Group__03423);
            rule__BoldContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldContent__Group__1_in_rule__BoldContent__Group__03426);
            rule__BoldContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__0"


    // $ANTLR start "rule__BoldContent__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1707:1: rule__BoldContent__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1711:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1712:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1712:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1713:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__BoldContent__Group__0__Impl3454); 
             after(grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__0__Impl"


    // $ANTLR start "rule__BoldContent__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1726:1: rule__BoldContent__Group__1 : rule__BoldContent__Group__1__Impl rule__BoldContent__Group__2 ;
    public final void rule__BoldContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1730:1: ( rule__BoldContent__Group__1__Impl rule__BoldContent__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1731:2: rule__BoldContent__Group__1__Impl rule__BoldContent__Group__2
            {
            pushFollow(FOLLOW_rule__BoldContent__Group__1__Impl_in_rule__BoldContent__Group__13485);
            rule__BoldContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldContent__Group__2_in_rule__BoldContent__Group__13488);
            rule__BoldContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__1"


    // $ANTLR start "rule__BoldContent__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1738:1: rule__BoldContent__Group__1__Impl : ( ruleText ) ;
    public final void rule__BoldContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1742:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1743:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1743:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1744:1: ruleText
            {
             before(grammarAccess.getBoldContentAccess().getTextParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__BoldContent__Group__1__Impl3515);
            ruleText();

            state._fsp--;

             after(grammarAccess.getBoldContentAccess().getTextParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__1__Impl"


    // $ANTLR start "rule__BoldContent__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1755:1: rule__BoldContent__Group__2 : rule__BoldContent__Group__2__Impl ;
    public final void rule__BoldContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1759:1: ( rule__BoldContent__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1760:2: rule__BoldContent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BoldContent__Group__2__Impl_in_rule__BoldContent__Group__23544);
            rule__BoldContent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__2"


    // $ANTLR start "rule__BoldContent__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1766:1: rule__BoldContent__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1770:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1771:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1771:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1772:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__BoldContent__Group__2__Impl3572); 
             after(grammarAccess.getBoldContentAccess().getApostropheApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldContent__Group__2__Impl"


    // $ANTLR start "rule__BoldItalicContent__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1791:1: rule__BoldItalicContent__Group__0 : rule__BoldItalicContent__Group__0__Impl rule__BoldItalicContent__Group__1 ;
    public final void rule__BoldItalicContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1795:1: ( rule__BoldItalicContent__Group__0__Impl rule__BoldItalicContent__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1796:2: rule__BoldItalicContent__Group__0__Impl rule__BoldItalicContent__Group__1
            {
            pushFollow(FOLLOW_rule__BoldItalicContent__Group__0__Impl_in_rule__BoldItalicContent__Group__03609);
            rule__BoldItalicContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldItalicContent__Group__1_in_rule__BoldItalicContent__Group__03612);
            rule__BoldItalicContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__0"


    // $ANTLR start "rule__BoldItalicContent__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1803:1: rule__BoldItalicContent__Group__0__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__BoldItalicContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1807:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1808:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1808:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1809:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__BoldItalicContent__Group__0__Impl3640); 
             after(grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__0__Impl"


    // $ANTLR start "rule__BoldItalicContent__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1822:1: rule__BoldItalicContent__Group__1 : rule__BoldItalicContent__Group__1__Impl rule__BoldItalicContent__Group__2 ;
    public final void rule__BoldItalicContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1826:1: ( rule__BoldItalicContent__Group__1__Impl rule__BoldItalicContent__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1827:2: rule__BoldItalicContent__Group__1__Impl rule__BoldItalicContent__Group__2
            {
            pushFollow(FOLLOW_rule__BoldItalicContent__Group__1__Impl_in_rule__BoldItalicContent__Group__13671);
            rule__BoldItalicContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldItalicContent__Group__2_in_rule__BoldItalicContent__Group__13674);
            rule__BoldItalicContent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__1"


    // $ANTLR start "rule__BoldItalicContent__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1834:1: rule__BoldItalicContent__Group__1__Impl : ( ruleText ) ;
    public final void rule__BoldItalicContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1838:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1839:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1839:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1840:1: ruleText
            {
             before(grammarAccess.getBoldItalicContentAccess().getTextParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleText_in_rule__BoldItalicContent__Group__1__Impl3701);
            ruleText();

            state._fsp--;

             after(grammarAccess.getBoldItalicContentAccess().getTextParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__1__Impl"


    // $ANTLR start "rule__BoldItalicContent__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1851:1: rule__BoldItalicContent__Group__2 : rule__BoldItalicContent__Group__2__Impl ;
    public final void rule__BoldItalicContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1855:1: ( rule__BoldItalicContent__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1856:2: rule__BoldItalicContent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BoldItalicContent__Group__2__Impl_in_rule__BoldItalicContent__Group__23730);
            rule__BoldItalicContent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__2"


    // $ANTLR start "rule__BoldItalicContent__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1862:1: rule__BoldItalicContent__Group__2__Impl : ( '\\'\\'\\'\\'\\'' ) ;
    public final void rule__BoldItalicContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1866:1: ( ( '\\'\\'\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1867:1: ( '\\'\\'\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1867:1: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1868:1: '\\'\\'\\'\\'\\''
            {
             before(grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__BoldItalicContent__Group__2__Impl3758); 
             after(grammarAccess.getBoldItalicContentAccess().getApostropheApostropheApostropheApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldItalicContent__Group__2__Impl"


    // $ANTLR start "rule__UnFormattedText__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1887:1: rule__UnFormattedText__Group__0 : rule__UnFormattedText__Group__0__Impl rule__UnFormattedText__Group__1 ;
    public final void rule__UnFormattedText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1891:1: ( rule__UnFormattedText__Group__0__Impl rule__UnFormattedText__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1892:2: rule__UnFormattedText__Group__0__Impl rule__UnFormattedText__Group__1
            {
            pushFollow(FOLLOW_rule__UnFormattedText__Group__0__Impl_in_rule__UnFormattedText__Group__03795);
            rule__UnFormattedText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnFormattedText__Group__1_in_rule__UnFormattedText__Group__03798);
            rule__UnFormattedText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnFormattedText__Group__0"


    // $ANTLR start "rule__UnFormattedText__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1899:1: rule__UnFormattedText__Group__0__Impl : ( ( rule__UnFormattedText__WordsAssignment_0 ) ) ;
    public final void rule__UnFormattedText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1903:1: ( ( ( rule__UnFormattedText__WordsAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1904:1: ( ( rule__UnFormattedText__WordsAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1904:1: ( ( rule__UnFormattedText__WordsAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1905:1: ( rule__UnFormattedText__WordsAssignment_0 )
            {
             before(grammarAccess.getUnFormattedTextAccess().getWordsAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1906:1: ( rule__UnFormattedText__WordsAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1906:2: rule__UnFormattedText__WordsAssignment_0
            {
            pushFollow(FOLLOW_rule__UnFormattedText__WordsAssignment_0_in_rule__UnFormattedText__Group__0__Impl3825);
            rule__UnFormattedText__WordsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnFormattedTextAccess().getWordsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnFormattedText__Group__0__Impl"


    // $ANTLR start "rule__UnFormattedText__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1916:1: rule__UnFormattedText__Group__1 : rule__UnFormattedText__Group__1__Impl ;
    public final void rule__UnFormattedText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1920:1: ( rule__UnFormattedText__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1921:2: rule__UnFormattedText__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnFormattedText__Group__1__Impl_in_rule__UnFormattedText__Group__13855);
            rule__UnFormattedText__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnFormattedText__Group__1"


    // $ANTLR start "rule__UnFormattedText__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1927:1: rule__UnFormattedText__Group__1__Impl : ( ( RULE_WIKITEXT )* ) ;
    public final void rule__UnFormattedText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1931:1: ( ( ( RULE_WIKITEXT )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1932:1: ( ( RULE_WIKITEXT )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1932:1: ( ( RULE_WIKITEXT )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1933:1: ( RULE_WIKITEXT )*
            {
             before(grammarAccess.getUnFormattedTextAccess().getWIKITEXTTerminalRuleCall_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1934:1: ( RULE_WIKITEXT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WIKITEXT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1934:3: RULE_WIKITEXT
            	    {
            	    match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rule__UnFormattedText__Group__1__Impl3883); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUnFormattedTextAccess().getWIKITEXTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnFormattedText__Group__1__Impl"


    // $ANTLR start "rule__ExternalLink__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1948:1: rule__ExternalLink__Group__0 : rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1 ;
    public final void rule__ExternalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1952:1: ( rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1953:2: rule__ExternalLink__Group__0__Impl rule__ExternalLink__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__0__Impl_in_rule__ExternalLink__Group__03918);
            rule__ExternalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group__1_in_rule__ExternalLink__Group__03921);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1960:1: rule__ExternalLink__Group__0__Impl : ( '[' ) ;
    public final void rule__ExternalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1964:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1965:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1965:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1966:1: '['
            {
             before(grammarAccess.getExternalLinkAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ExternalLink__Group__0__Impl3949); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1979:1: rule__ExternalLink__Group__1 : rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2 ;
    public final void rule__ExternalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1983:1: ( rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1984:2: rule__ExternalLink__Group__1__Impl rule__ExternalLink__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__1__Impl_in_rule__ExternalLink__Group__13980);
            rule__ExternalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLink__Group__2_in_rule__ExternalLink__Group__13983);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1991:1: rule__ExternalLink__Group__1__Impl : ( ( rule__ExternalLink__PageNameAssignment_1 ) ) ;
    public final void rule__ExternalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1995:1: ( ( ( rule__ExternalLink__PageNameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1996:1: ( ( rule__ExternalLink__PageNameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1996:1: ( ( rule__ExternalLink__PageNameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1997:1: ( rule__ExternalLink__PageNameAssignment_1 )
            {
             before(grammarAccess.getExternalLinkAccess().getPageNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1998:1: ( rule__ExternalLink__PageNameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1998:2: rule__ExternalLink__PageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalLink__PageNameAssignment_1_in_rule__ExternalLink__Group__1__Impl4010);
            rule__ExternalLink__PageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAccess().getPageNameAssignment_1()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2008:1: rule__ExternalLink__Group__2 : rule__ExternalLink__Group__2__Impl ;
    public final void rule__ExternalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2012:1: ( rule__ExternalLink__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2013:2: rule__ExternalLink__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLink__Group__2__Impl_in_rule__ExternalLink__Group__24040);
            rule__ExternalLink__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2019:1: rule__ExternalLink__Group__2__Impl : ( ']' ) ;
    public final void rule__ExternalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2023:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2024:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2024:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2025:1: ']'
            {
             before(grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__ExternalLink__Group__2__Impl4068); 
             after(grammarAccess.getExternalLinkAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExternalLinkAlternative__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2044:1: rule__ExternalLinkAlternative__Group__0 : rule__ExternalLinkAlternative__Group__0__Impl rule__ExternalLinkAlternative__Group__1 ;
    public final void rule__ExternalLinkAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2048:1: ( rule__ExternalLinkAlternative__Group__0__Impl rule__ExternalLinkAlternative__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2049:2: rule__ExternalLinkAlternative__Group__0__Impl rule__ExternalLinkAlternative__Group__1
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__0__Impl_in_rule__ExternalLinkAlternative__Group__04105);
            rule__ExternalLinkAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__1_in_rule__ExternalLinkAlternative__Group__04108);
            rule__ExternalLinkAlternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__0"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2056:1: rule__ExternalLinkAlternative__Group__0__Impl : ( '[' ) ;
    public final void rule__ExternalLinkAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2060:1: ( ( '[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2061:1: ( '[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2061:1: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2062:1: '['
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ExternalLinkAlternative__Group__0__Impl4136); 
             after(grammarAccess.getExternalLinkAlternativeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__0__Impl"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2075:1: rule__ExternalLinkAlternative__Group__1 : rule__ExternalLinkAlternative__Group__1__Impl rule__ExternalLinkAlternative__Group__2 ;
    public final void rule__ExternalLinkAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2079:1: ( rule__ExternalLinkAlternative__Group__1__Impl rule__ExternalLinkAlternative__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2080:2: rule__ExternalLinkAlternative__Group__1__Impl rule__ExternalLinkAlternative__Group__2
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__1__Impl_in_rule__ExternalLinkAlternative__Group__14167);
            rule__ExternalLinkAlternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__2_in_rule__ExternalLinkAlternative__Group__14170);
            rule__ExternalLinkAlternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__1"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2087:1: rule__ExternalLinkAlternative__Group__1__Impl : ( ( rule__ExternalLinkAlternative__UrlAssignment_1 ) ) ;
    public final void rule__ExternalLinkAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2091:1: ( ( ( rule__ExternalLinkAlternative__UrlAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2092:1: ( ( rule__ExternalLinkAlternative__UrlAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2092:1: ( ( rule__ExternalLinkAlternative__UrlAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2093:1: ( rule__ExternalLinkAlternative__UrlAssignment_1 )
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getUrlAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2094:1: ( rule__ExternalLinkAlternative__UrlAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2094:2: rule__ExternalLinkAlternative__UrlAssignment_1
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__UrlAssignment_1_in_rule__ExternalLinkAlternative__Group__1__Impl4197);
            rule__ExternalLinkAlternative__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAlternativeAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__1__Impl"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2104:1: rule__ExternalLinkAlternative__Group__2 : rule__ExternalLinkAlternative__Group__2__Impl rule__ExternalLinkAlternative__Group__3 ;
    public final void rule__ExternalLinkAlternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2108:1: ( rule__ExternalLinkAlternative__Group__2__Impl rule__ExternalLinkAlternative__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2109:2: rule__ExternalLinkAlternative__Group__2__Impl rule__ExternalLinkAlternative__Group__3
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__2__Impl_in_rule__ExternalLinkAlternative__Group__24227);
            rule__ExternalLinkAlternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__3_in_rule__ExternalLinkAlternative__Group__24230);
            rule__ExternalLinkAlternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__2"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2116:1: rule__ExternalLinkAlternative__Group__2__Impl : ( ' ' ) ;
    public final void rule__ExternalLinkAlternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2120:1: ( ( ' ' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2121:1: ( ' ' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2121:1: ( ' ' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2122:1: ' '
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getSpaceKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__ExternalLinkAlternative__Group__2__Impl4258); 
             after(grammarAccess.getExternalLinkAlternativeAccess().getSpaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__2__Impl"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2135:1: rule__ExternalLinkAlternative__Group__3 : rule__ExternalLinkAlternative__Group__3__Impl rule__ExternalLinkAlternative__Group__4 ;
    public final void rule__ExternalLinkAlternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2139:1: ( rule__ExternalLinkAlternative__Group__3__Impl rule__ExternalLinkAlternative__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2140:2: rule__ExternalLinkAlternative__Group__3__Impl rule__ExternalLinkAlternative__Group__4
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__3__Impl_in_rule__ExternalLinkAlternative__Group__34289);
            rule__ExternalLinkAlternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__4_in_rule__ExternalLinkAlternative__Group__34292);
            rule__ExternalLinkAlternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__3"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2147:1: rule__ExternalLinkAlternative__Group__3__Impl : ( ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 ) ) ;
    public final void rule__ExternalLinkAlternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2151:1: ( ( ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2152:1: ( ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2152:1: ( ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2153:1: ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 )
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getAlternativeTextAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2154:1: ( rule__ExternalLinkAlternative__AlternativeTextAssignment_3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2154:2: rule__ExternalLinkAlternative__AlternativeTextAssignment_3
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__AlternativeTextAssignment_3_in_rule__ExternalLinkAlternative__Group__3__Impl4319);
            rule__ExternalLinkAlternative__AlternativeTextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalLinkAlternativeAccess().getAlternativeTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__3__Impl"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2164:1: rule__ExternalLinkAlternative__Group__4 : rule__ExternalLinkAlternative__Group__4__Impl ;
    public final void rule__ExternalLinkAlternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2168:1: ( rule__ExternalLinkAlternative__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2169:2: rule__ExternalLinkAlternative__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ExternalLinkAlternative__Group__4__Impl_in_rule__ExternalLinkAlternative__Group__44349);
            rule__ExternalLinkAlternative__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__4"


    // $ANTLR start "rule__ExternalLinkAlternative__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2175:1: rule__ExternalLinkAlternative__Group__4__Impl : ( ']' ) ;
    public final void rule__ExternalLinkAlternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2179:1: ( ( ']' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2180:1: ( ']' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2180:1: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2181:1: ']'
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__ExternalLinkAlternative__Group__4__Impl4377); 
             after(grammarAccess.getExternalLinkAlternativeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__Group__4__Impl"


    // $ANTLR start "rule__InternalLink__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2204:1: rule__InternalLink__Group__0 : rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1 ;
    public final void rule__InternalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2208:1: ( rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2209:2: rule__InternalLink__Group__0__Impl rule__InternalLink__Group__1
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__0__Impl_in_rule__InternalLink__Group__04418);
            rule__InternalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group__1_in_rule__InternalLink__Group__04421);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2216:1: rule__InternalLink__Group__0__Impl : ( '[[' ) ;
    public final void rule__InternalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2220:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2221:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2221:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2222:1: '[['
            {
             before(grammarAccess.getInternalLinkAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__InternalLink__Group__0__Impl4449); 
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2235:1: rule__InternalLink__Group__1 : rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2 ;
    public final void rule__InternalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2239:1: ( rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2240:2: rule__InternalLink__Group__1__Impl rule__InternalLink__Group__2
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__1__Impl_in_rule__InternalLink__Group__14480);
            rule__InternalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLink__Group__2_in_rule__InternalLink__Group__14483);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2247:1: rule__InternalLink__Group__1__Impl : ( ( rule__InternalLink__PageNameAssignment_1 ) ) ;
    public final void rule__InternalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2251:1: ( ( ( rule__InternalLink__PageNameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2252:1: ( ( rule__InternalLink__PageNameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2252:1: ( ( rule__InternalLink__PageNameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2253:1: ( rule__InternalLink__PageNameAssignment_1 )
            {
             before(grammarAccess.getInternalLinkAccess().getPageNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2254:1: ( rule__InternalLink__PageNameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2254:2: rule__InternalLink__PageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalLink__PageNameAssignment_1_in_rule__InternalLink__Group__1__Impl4510);
            rule__InternalLink__PageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAccess().getPageNameAssignment_1()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2264:1: rule__InternalLink__Group__2 : rule__InternalLink__Group__2__Impl ;
    public final void rule__InternalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2268:1: ( rule__InternalLink__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2269:2: rule__InternalLink__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__InternalLink__Group__2__Impl_in_rule__InternalLink__Group__24540);
            rule__InternalLink__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2275:1: rule__InternalLink__Group__2__Impl : ( ']]' ) ;
    public final void rule__InternalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2279:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2280:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2280:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2281:1: ']]'
            {
             before(grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__InternalLink__Group__2__Impl4568); 
             after(grammarAccess.getInternalLinkAccess().getRightSquareBracketRightSquareBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InternalLinkAlternative__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2300:1: rule__InternalLinkAlternative__Group__0 : rule__InternalLinkAlternative__Group__0__Impl rule__InternalLinkAlternative__Group__1 ;
    public final void rule__InternalLinkAlternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2304:1: ( rule__InternalLinkAlternative__Group__0__Impl rule__InternalLinkAlternative__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2305:2: rule__InternalLinkAlternative__Group__0__Impl rule__InternalLinkAlternative__Group__1
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__0__Impl_in_rule__InternalLinkAlternative__Group__04605);
            rule__InternalLinkAlternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__1_in_rule__InternalLinkAlternative__Group__04608);
            rule__InternalLinkAlternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__0"


    // $ANTLR start "rule__InternalLinkAlternative__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2312:1: rule__InternalLinkAlternative__Group__0__Impl : ( '[[' ) ;
    public final void rule__InternalLinkAlternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2316:1: ( ( '[[' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2317:1: ( '[[' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2317:1: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2318:1: '[['
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__InternalLinkAlternative__Group__0__Impl4636); 
             after(grammarAccess.getInternalLinkAlternativeAccess().getLeftSquareBracketLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__0__Impl"


    // $ANTLR start "rule__InternalLinkAlternative__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2331:1: rule__InternalLinkAlternative__Group__1 : rule__InternalLinkAlternative__Group__1__Impl rule__InternalLinkAlternative__Group__2 ;
    public final void rule__InternalLinkAlternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2335:1: ( rule__InternalLinkAlternative__Group__1__Impl rule__InternalLinkAlternative__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2336:2: rule__InternalLinkAlternative__Group__1__Impl rule__InternalLinkAlternative__Group__2
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__1__Impl_in_rule__InternalLinkAlternative__Group__14667);
            rule__InternalLinkAlternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__2_in_rule__InternalLinkAlternative__Group__14670);
            rule__InternalLinkAlternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__1"


    // $ANTLR start "rule__InternalLinkAlternative__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2343:1: rule__InternalLinkAlternative__Group__1__Impl : ( ( rule__InternalLinkAlternative__PageNameAssignment_1 ) ) ;
    public final void rule__InternalLinkAlternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2347:1: ( ( ( rule__InternalLinkAlternative__PageNameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2348:1: ( ( rule__InternalLinkAlternative__PageNameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2348:1: ( ( rule__InternalLinkAlternative__PageNameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2349:1: ( rule__InternalLinkAlternative__PageNameAssignment_1 )
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getPageNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2350:1: ( rule__InternalLinkAlternative__PageNameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2350:2: rule__InternalLinkAlternative__PageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__PageNameAssignment_1_in_rule__InternalLinkAlternative__Group__1__Impl4697);
            rule__InternalLinkAlternative__PageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAlternativeAccess().getPageNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__1__Impl"


    // $ANTLR start "rule__InternalLinkAlternative__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2360:1: rule__InternalLinkAlternative__Group__2 : rule__InternalLinkAlternative__Group__2__Impl rule__InternalLinkAlternative__Group__3 ;
    public final void rule__InternalLinkAlternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2364:1: ( rule__InternalLinkAlternative__Group__2__Impl rule__InternalLinkAlternative__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2365:2: rule__InternalLinkAlternative__Group__2__Impl rule__InternalLinkAlternative__Group__3
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__2__Impl_in_rule__InternalLinkAlternative__Group__24727);
            rule__InternalLinkAlternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__3_in_rule__InternalLinkAlternative__Group__24730);
            rule__InternalLinkAlternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__2"


    // $ANTLR start "rule__InternalLinkAlternative__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2372:1: rule__InternalLinkAlternative__Group__2__Impl : ( '|' ) ;
    public final void rule__InternalLinkAlternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2376:1: ( ( '|' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2377:1: ( '|' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2377:1: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2378:1: '|'
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getVerticalLineKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__InternalLinkAlternative__Group__2__Impl4758); 
             after(grammarAccess.getInternalLinkAlternativeAccess().getVerticalLineKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__2__Impl"


    // $ANTLR start "rule__InternalLinkAlternative__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2391:1: rule__InternalLinkAlternative__Group__3 : rule__InternalLinkAlternative__Group__3__Impl rule__InternalLinkAlternative__Group__4 ;
    public final void rule__InternalLinkAlternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2395:1: ( rule__InternalLinkAlternative__Group__3__Impl rule__InternalLinkAlternative__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2396:2: rule__InternalLinkAlternative__Group__3__Impl rule__InternalLinkAlternative__Group__4
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__3__Impl_in_rule__InternalLinkAlternative__Group__34789);
            rule__InternalLinkAlternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__4_in_rule__InternalLinkAlternative__Group__34792);
            rule__InternalLinkAlternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__3"


    // $ANTLR start "rule__InternalLinkAlternative__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2403:1: rule__InternalLinkAlternative__Group__3__Impl : ( ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 ) ) ;
    public final void rule__InternalLinkAlternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2407:1: ( ( ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2408:1: ( ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2408:1: ( ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2409:1: ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 )
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getAlternativeTextAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2410:1: ( rule__InternalLinkAlternative__AlternativeTextAssignment_3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2410:2: rule__InternalLinkAlternative__AlternativeTextAssignment_3
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__AlternativeTextAssignment_3_in_rule__InternalLinkAlternative__Group__3__Impl4819);
            rule__InternalLinkAlternative__AlternativeTextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInternalLinkAlternativeAccess().getAlternativeTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__3__Impl"


    // $ANTLR start "rule__InternalLinkAlternative__Group__4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2420:1: rule__InternalLinkAlternative__Group__4 : rule__InternalLinkAlternative__Group__4__Impl ;
    public final void rule__InternalLinkAlternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2424:1: ( rule__InternalLinkAlternative__Group__4__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2425:2: rule__InternalLinkAlternative__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InternalLinkAlternative__Group__4__Impl_in_rule__InternalLinkAlternative__Group__44849);
            rule__InternalLinkAlternative__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__4"


    // $ANTLR start "rule__InternalLinkAlternative__Group__4__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2431:1: rule__InternalLinkAlternative__Group__4__Impl : ( ']]' ) ;
    public final void rule__InternalLinkAlternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2435:1: ( ( ']]' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2436:1: ( ']]' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2436:1: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2437:1: ']]'
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__InternalLinkAlternative__Group__4__Impl4877); 
             after(grammarAccess.getInternalLinkAlternativeAccess().getRightSquareBracketRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__Group__4__Impl"


    // $ANTLR start "rule__Wikipage__TitleAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2461:1: rule__Wikipage__TitleAssignment_1 : ( RULE_WIKITEXT ) ;
    public final void rule__Wikipage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2465:1: ( ( RULE_WIKITEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2466:1: ( RULE_WIKITEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2466:1: ( RULE_WIKITEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2467:1: RULE_WIKITEXT
            {
             before(grammarAccess.getWikipageAccess().getTitleWIKITEXTTerminalRuleCall_1_0()); 
            match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rule__Wikipage__TitleAssignment_14923); 
             after(grammarAccess.getWikipageAccess().getTitleWIKITEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__TitleAssignment_1"


    // $ANTLR start "rule__Wikipage__ContentAssignment_5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2476:1: rule__Wikipage__ContentAssignment_5 : ( ruleInlineContent ) ;
    public final void rule__Wikipage__ContentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2480:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2481:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2481:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2482:1: ruleInlineContent
            {
             before(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__Wikipage__ContentAssignment_54954);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__ContentAssignment_5"


    // $ANTLR start "rule__Wikipage__SectionsAssignment_6"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2491:1: rule__Wikipage__SectionsAssignment_6 : ( ruleAbstractSection ) ;
    public final void rule__Wikipage__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2495:1: ( ( ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2496:1: ( ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2496:1: ( ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2497:1: ruleAbstractSection
            {
             before(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_64985);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__SectionsAssignment_6"


    // $ANTLR start "rule__Wikipage__SectionsAssignment_7"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2506:1: rule__Wikipage__SectionsAssignment_7 : ( ruleAbstractSection ) ;
    public final void rule__Wikipage__SectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2510:1: ( ( ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2511:1: ( ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2511:1: ( ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2512:1: ruleAbstractSection
            {
             before(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_75016);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__SectionsAssignment_7"


    // $ANTLR start "rule__SubsectionLevel1__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2521:1: rule__SubsectionLevel1__NameAssignment_1 : ( ruleText ) ;
    public final void rule__SubsectionLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2525:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2526:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2526:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2527:1: ruleText
            {
             before(grammarAccess.getSubsectionLevel1Access().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__SubsectionLevel1__NameAssignment_15047);
            ruleText();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel1Access().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__NameAssignment_1"


    // $ANTLR start "rule__SubsectionLevel1__ContentAssignment_4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2536:1: rule__SubsectionLevel1__ContentAssignment_4 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel1__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2540:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2541:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2541:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2542:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__ContentAssignment_45078);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__ContentAssignment_4"


    // $ANTLR start "rule__SubsectionLevel2__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2551:1: rule__SubsectionLevel2__NameAssignment_1 : ( ruleText ) ;
    public final void rule__SubsectionLevel2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2555:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2556:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2556:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2557:1: ruleText
            {
             before(grammarAccess.getSubsectionLevel2Access().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__SubsectionLevel2__NameAssignment_15109);
            ruleText();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel2Access().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__NameAssignment_1"


    // $ANTLR start "rule__SubsectionLevel2__ContentAssignment_4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2566:1: rule__SubsectionLevel2__ContentAssignment_4 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel2__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2570:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2571:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2571:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2572:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__ContentAssignment_45140);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__ContentAssignment_4"


    // $ANTLR start "rule__SubsectionLevel3__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2581:1: rule__SubsectionLevel3__NameAssignment_1 : ( ruleText ) ;
    public final void rule__SubsectionLevel3__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2585:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2586:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2586:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2587:1: ruleText
            {
             before(grammarAccess.getSubsectionLevel3Access().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__SubsectionLevel3__NameAssignment_15171);
            ruleText();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel3Access().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__NameAssignment_1"


    // $ANTLR start "rule__SubsectionLevel3__ContentAssignment_4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2596:1: rule__SubsectionLevel3__ContentAssignment_4 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel3__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2600:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2601:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2601:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2602:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__ContentAssignment_45202);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__ContentAssignment_4"


    // $ANTLR start "rule__SubsectionLevel4__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2611:1: rule__SubsectionLevel4__NameAssignment_1 : ( ruleText ) ;
    public final void rule__SubsectionLevel4__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2615:1: ( ( ruleText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2616:1: ( ruleText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2616:1: ( ruleText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2617:1: ruleText
            {
             before(grammarAccess.getSubsectionLevel4Access().getNameTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleText_in_rule__SubsectionLevel4__NameAssignment_15233);
            ruleText();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel4Access().getNameTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__NameAssignment_1"


    // $ANTLR start "rule__SubsectionLevel4__ContentAssignment_4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2626:1: rule__SubsectionLevel4__ContentAssignment_4 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel4__ContentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2630:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2631:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2631:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2632:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__ContentAssignment_45264);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__ContentAssignment_4"


    // $ANTLR start "rule__UnFormattedText__WordsAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2641:1: rule__UnFormattedText__WordsAssignment_0 : ( RULE_WIKITEXT ) ;
    public final void rule__UnFormattedText__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2645:1: ( ( RULE_WIKITEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2646:1: ( RULE_WIKITEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2646:1: ( RULE_WIKITEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2647:1: RULE_WIKITEXT
            {
             before(grammarAccess.getUnFormattedTextAccess().getWordsWIKITEXTTerminalRuleCall_0_0()); 
            match(input,RULE_WIKITEXT,FOLLOW_RULE_WIKITEXT_in_rule__UnFormattedText__WordsAssignment_05295); 
             after(grammarAccess.getUnFormattedTextAccess().getWordsWIKITEXTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnFormattedText__WordsAssignment_0"


    // $ANTLR start "rule__ExternalLink__PageNameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2656:1: rule__ExternalLink__PageNameAssignment_1 : ( ruleUnFormattedText ) ;
    public final void rule__ExternalLink__PageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2660:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2661:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2661:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2662:1: ruleUnFormattedText
            {
             before(grammarAccess.getExternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__ExternalLink__PageNameAssignment_15326);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getExternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLink__PageNameAssignment_1"


    // $ANTLR start "rule__ExternalLinkAlternative__UrlAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2671:1: rule__ExternalLinkAlternative__UrlAssignment_1 : ( ruleUnFormattedText ) ;
    public final void rule__ExternalLinkAlternative__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2675:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2676:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2676:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2677:1: ruleUnFormattedText
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getUrlUnFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__ExternalLinkAlternative__UrlAssignment_15357);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getExternalLinkAlternativeAccess().getUrlUnFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__UrlAssignment_1"


    // $ANTLR start "rule__ExternalLinkAlternative__AlternativeTextAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2686:1: rule__ExternalLinkAlternative__AlternativeTextAssignment_3 : ( ruleUnFormattedText ) ;
    public final void rule__ExternalLinkAlternative__AlternativeTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2690:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2691:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2691:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2692:1: ruleUnFormattedText
            {
             before(grammarAccess.getExternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__ExternalLinkAlternative__AlternativeTextAssignment_35388);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getExternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLinkAlternative__AlternativeTextAssignment_3"


    // $ANTLR start "rule__InternalLink__PageNameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2701:1: rule__InternalLink__PageNameAssignment_1 : ( ruleUnFormattedText ) ;
    public final void rule__InternalLink__PageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2705:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2706:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2706:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2707:1: ruleUnFormattedText
            {
             before(grammarAccess.getInternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__InternalLink__PageNameAssignment_15419);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getInternalLinkAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLink__PageNameAssignment_1"


    // $ANTLR start "rule__InternalLinkAlternative__PageNameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2716:1: rule__InternalLinkAlternative__PageNameAssignment_1 : ( ruleUnFormattedText ) ;
    public final void rule__InternalLinkAlternative__PageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2720:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2721:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2721:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2722:1: ruleUnFormattedText
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__InternalLinkAlternative__PageNameAssignment_15450);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getInternalLinkAlternativeAccess().getPageNameUnFormattedTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__PageNameAssignment_1"


    // $ANTLR start "rule__InternalLinkAlternative__AlternativeTextAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2731:1: rule__InternalLinkAlternative__AlternativeTextAssignment_3 : ( ruleUnFormattedText ) ;
    public final void rule__InternalLinkAlternative__AlternativeTextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2735:1: ( ( ruleUnFormattedText ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2736:1: ( ruleUnFormattedText )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2736:1: ( ruleUnFormattedText )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2737:1: ruleUnFormattedText
            {
             before(grammarAccess.getInternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUnFormattedText_in_rule__InternalLinkAlternative__AlternativeTextAssignment_35481);
            ruleUnFormattedText();

            state._fsp--;

             after(grammarAccess.getInternalLinkAlternativeAccess().getAlternativeTextUnFormattedTextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalLinkAlternative__AlternativeTextAssignment_3"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\13\uffff";
    static final String DFA5_eofS =
        "\13\uffff";
    static final String DFA5_minS =
        "\1\25\5\4\2\uffff\1\4\2\uffff";
    static final String DFA5_maxS =
        "\1\30\2\4\1\32\1\27\1\32\2\uffff\1\27\2\uffff";
    static final String DFA5_acceptS =
        "\6\uffff\1\1\1\2\1\uffff\1\4\1\3";
    static final String DFA5_specialS =
        "\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\2\uffff\1\1",
            "\1\3",
            "\1\4",
            "\1\5\24\uffff\1\6\1\7",
            "\1\10\21\uffff\1\12\1\11",
            "\1\5\24\uffff\1\6\1\7",
            "",
            "",
            "\1\10\21\uffff\1\12\1\11",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "670:1: rule__Hyperlink__Alternatives : ( ( ruleInternalLink ) | ( ruleInternalLinkAlternative ) | ( ruleExternalLink ) | ( ruleExternalLinkAlternative ) );";
        }
    }
 

    public static final BitSet FOLLOW_rulewikipage_in_entryRulewikipage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewikipage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__0_in_rulewikipage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_entryRuleSubsectionLevel1181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__0_in_ruleSubsectionLevel1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_entryRuleSubsectionLevel2241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__0_in_ruleSubsectionLevel2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_entryRuleSubsectionLevel3301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__0_in_ruleSubsectionLevel3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_entryRuleSubsectionLevel4361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsectionLevel4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__0_in_ruleSubsectionLevel4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_entryRuleInlineContent421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineContent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InlineContent__Alternatives_in_ruleInlineContent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedContent_in_entryRuleFormattedContent481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormattedContent488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormattedContent__Alternatives_in_ruleFormattedContent514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicContent_in_entryRuleItalicContent541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicContent548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__0_in_ruleItalicContent574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldContent_in_entryRuleBoldContent601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldContent608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__0_in_ruleBoldContent634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldItalicContent_in_entryRuleBoldItalicContent661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldItalicContent668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__0_in_ruleBoldItalicContent694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_entryRuleText721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleText728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__Alternatives_in_ruleText754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_entryRuleUnFormattedText781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnFormattedText788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnFormattedText__Group__0_in_ruleUnFormattedText814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperlink_in_entryRuleHyperlink841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperlink848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hyperlink__Alternatives_in_ruleHyperlink874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_entryRuleExternalLink901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLink908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__0_in_ruleExternalLink934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLinkAlternative_in_entryRuleExternalLinkAlternative961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalLinkAlternative968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__0_in_ruleExternalLinkAlternative994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_entryRuleInternalLink1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLink1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__0_in_ruleInternalLink1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLinkAlternative_in_entryRuleInternalLinkAlternative1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalLinkAlternative1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__0_in_ruleInternalLinkAlternative1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_rule__AbstractSection__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_rule__AbstractSection__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_rule__AbstractSection__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_rule__AbstractSection__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormattedContent_in_rule__InlineContent__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__InlineContent__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicContent_in_rule__FormattedContent__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldContent_in_rule__FormattedContent__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldItalicContent_in_rule__FormattedContent__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__Text__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHyperlink_in_rule__Text__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLink_in_rule__Hyperlink__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalLinkAlternative_in_rule__Hyperlink__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLink_in_rule__Hyperlink__Alternatives1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalLinkAlternative_in_rule__Hyperlink__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__0__Impl_in_rule__Wikipage__Group__01478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__1_in_rule__Wikipage__Group__01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Wikipage__Group__0__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__1__Impl_in_rule__Wikipage__Group__11540 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__2_in_rule__Wikipage__Group__11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__TitleAssignment_1_in_rule__Wikipage__Group__1__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__2__Impl_in_rule__Wikipage__Group__21600 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__3_in_rule__Wikipage__Group__21603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rule__Wikipage__Group__2__Impl1631 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__3__Impl_in_rule__Wikipage__Group__31662 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__4_in_rule__Wikipage__Group__31665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Wikipage__Group__3__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__4__Impl_in_rule__Wikipage__Group__41724 = new BitSet(new long[]{0x00000000013FC010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__5_in_rule__Wikipage__Group__41727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Wikipage__Group__4__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__5__Impl_in_rule__Wikipage__Group__51786 = new BitSet(new long[]{0x00000000013FC010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__6_in_rule__Wikipage__Group__51789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__ContentAssignment_5_in_rule__Wikipage__Group__5__Impl1816 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__6__Impl_in_rule__Wikipage__Group__61847 = new BitSet(new long[]{0x00000000013FC010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__7_in_rule__Wikipage__Group__61850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__SectionsAssignment_6_in_rule__Wikipage__Group__6__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__7__Impl_in_rule__Wikipage__Group__71907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__SectionsAssignment_7_in_rule__Wikipage__Group__7__Impl1934 = new BitSet(new long[]{0x00000000013FC012L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__0__Impl_in_rule__SubsectionLevel1__Group__01981 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__1_in_rule__SubsectionLevel1__Group__01984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubsectionLevel1__Group__0__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__1__Impl_in_rule__SubsectionLevel1__Group__12043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__2_in_rule__SubsectionLevel1__Group__12046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__NameAssignment_1_in_rule__SubsectionLevel1__Group__1__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__2__Impl_in_rule__SubsectionLevel1__Group__22103 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__3_in_rule__SubsectionLevel1__Group__22106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubsectionLevel1__Group__2__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__3__Impl_in_rule__SubsectionLevel1__Group__32165 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__4_in_rule__SubsectionLevel1__Group__32168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubsectionLevel1__Group__3__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__4__Impl_in_rule__SubsectionLevel1__Group__42227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__ContentAssignment_4_in_rule__SubsectionLevel1__Group__4__Impl2254 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__0__Impl_in_rule__SubsectionLevel2__Group__02295 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__1_in_rule__SubsectionLevel2__Group__02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubsectionLevel2__Group__0__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__1__Impl_in_rule__SubsectionLevel2__Group__12357 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__2_in_rule__SubsectionLevel2__Group__12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__NameAssignment_1_in_rule__SubsectionLevel2__Group__1__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__2__Impl_in_rule__SubsectionLevel2__Group__22417 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__3_in_rule__SubsectionLevel2__Group__22420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubsectionLevel2__Group__2__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__3__Impl_in_rule__SubsectionLevel2__Group__32479 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__4_in_rule__SubsectionLevel2__Group__32482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubsectionLevel2__Group__3__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__4__Impl_in_rule__SubsectionLevel2__Group__42541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__ContentAssignment_4_in_rule__SubsectionLevel2__Group__4__Impl2568 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__0__Impl_in_rule__SubsectionLevel3__Group__02609 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__1_in_rule__SubsectionLevel3__Group__02612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubsectionLevel3__Group__0__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__1__Impl_in_rule__SubsectionLevel3__Group__12671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__2_in_rule__SubsectionLevel3__Group__12674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__NameAssignment_1_in_rule__SubsectionLevel3__Group__1__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__2__Impl_in_rule__SubsectionLevel3__Group__22731 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__3_in_rule__SubsectionLevel3__Group__22734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubsectionLevel3__Group__2__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__3__Impl_in_rule__SubsectionLevel3__Group__32793 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__4_in_rule__SubsectionLevel3__Group__32796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubsectionLevel3__Group__3__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__4__Impl_in_rule__SubsectionLevel3__Group__42855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__ContentAssignment_4_in_rule__SubsectionLevel3__Group__4__Impl2882 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__0__Impl_in_rule__SubsectionLevel4__Group__02923 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__1_in_rule__SubsectionLevel4__Group__02926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubsectionLevel4__Group__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__1__Impl_in_rule__SubsectionLevel4__Group__12985 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__2_in_rule__SubsectionLevel4__Group__12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__NameAssignment_1_in_rule__SubsectionLevel4__Group__1__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__2__Impl_in_rule__SubsectionLevel4__Group__23045 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__3_in_rule__SubsectionLevel4__Group__23048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubsectionLevel4__Group__2__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__3__Impl_in_rule__SubsectionLevel4__Group__33107 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__4_in_rule__SubsectionLevel4__Group__33110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubsectionLevel4__Group__3__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__4__Impl_in_rule__SubsectionLevel4__Group__43169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__ContentAssignment_4_in_rule__SubsectionLevel4__Group__4__Impl3196 = new BitSet(new long[]{0x00000000013C0012L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__0__Impl_in_rule__ItalicContent__Group__03237 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__1_in_rule__ItalicContent__Group__03240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ItalicContent__Group__0__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__1__Impl_in_rule__ItalicContent__Group__13299 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__2_in_rule__ItalicContent__Group__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__ItalicContent__Group__1__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicContent__Group__2__Impl_in_rule__ItalicContent__Group__23358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ItalicContent__Group__2__Impl3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__0__Impl_in_rule__BoldContent__Group__03423 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__1_in_rule__BoldContent__Group__03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BoldContent__Group__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__1__Impl_in_rule__BoldContent__Group__13485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__2_in_rule__BoldContent__Group__13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__BoldContent__Group__1__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldContent__Group__2__Impl_in_rule__BoldContent__Group__23544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BoldContent__Group__2__Impl3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__0__Impl_in_rule__BoldItalicContent__Group__03609 = new BitSet(new long[]{0x00000000013C0010L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__1_in_rule__BoldItalicContent__Group__03612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BoldItalicContent__Group__0__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__1__Impl_in_rule__BoldItalicContent__Group__13671 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__2_in_rule__BoldItalicContent__Group__13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__BoldItalicContent__Group__1__Impl3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldItalicContent__Group__2__Impl_in_rule__BoldItalicContent__Group__23730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BoldItalicContent__Group__2__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnFormattedText__Group__0__Impl_in_rule__UnFormattedText__Group__03795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UnFormattedText__Group__1_in_rule__UnFormattedText__Group__03798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnFormattedText__WordsAssignment_0_in_rule__UnFormattedText__Group__0__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnFormattedText__Group__1__Impl_in_rule__UnFormattedText__Group__13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rule__UnFormattedText__Group__1__Impl3883 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__0__Impl_in_rule__ExternalLink__Group__03918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__1_in_rule__ExternalLink__Group__03921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExternalLink__Group__0__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__1__Impl_in_rule__ExternalLink__Group__13980 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__2_in_rule__ExternalLink__Group__13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__PageNameAssignment_1_in_rule__ExternalLink__Group__1__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLink__Group__2__Impl_in_rule__ExternalLink__Group__24040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExternalLink__Group__2__Impl4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__0__Impl_in_rule__ExternalLinkAlternative__Group__04105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__1_in_rule__ExternalLinkAlternative__Group__04108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ExternalLinkAlternative__Group__0__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__1__Impl_in_rule__ExternalLinkAlternative__Group__14167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__2_in_rule__ExternalLinkAlternative__Group__14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__UrlAssignment_1_in_rule__ExternalLinkAlternative__Group__1__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__2__Impl_in_rule__ExternalLinkAlternative__Group__24227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__3_in_rule__ExternalLinkAlternative__Group__24230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExternalLinkAlternative__Group__2__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__3__Impl_in_rule__ExternalLinkAlternative__Group__34289 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__4_in_rule__ExternalLinkAlternative__Group__34292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__AlternativeTextAssignment_3_in_rule__ExternalLinkAlternative__Group__3__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExternalLinkAlternative__Group__4__Impl_in_rule__ExternalLinkAlternative__Group__44349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ExternalLinkAlternative__Group__4__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__0__Impl_in_rule__InternalLink__Group__04418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__1_in_rule__InternalLink__Group__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InternalLink__Group__0__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__1__Impl_in_rule__InternalLink__Group__14480 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__2_in_rule__InternalLink__Group__14483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__PageNameAssignment_1_in_rule__InternalLink__Group__1__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLink__Group__2__Impl_in_rule__InternalLink__Group__24540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InternalLink__Group__2__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__0__Impl_in_rule__InternalLinkAlternative__Group__04605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__1_in_rule__InternalLinkAlternative__Group__04608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InternalLinkAlternative__Group__0__Impl4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__1__Impl_in_rule__InternalLinkAlternative__Group__14667 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__2_in_rule__InternalLinkAlternative__Group__14670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__PageNameAssignment_1_in_rule__InternalLinkAlternative__Group__1__Impl4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__2__Impl_in_rule__InternalLinkAlternative__Group__24727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__3_in_rule__InternalLinkAlternative__Group__24730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__InternalLinkAlternative__Group__2__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__3__Impl_in_rule__InternalLinkAlternative__Group__34789 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__4_in_rule__InternalLinkAlternative__Group__34792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__AlternativeTextAssignment_3_in_rule__InternalLinkAlternative__Group__3__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalLinkAlternative__Group__4__Impl_in_rule__InternalLinkAlternative__Group__44849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InternalLinkAlternative__Group__4__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rule__Wikipage__TitleAssignment_14923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__Wikipage__ContentAssignment_54954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_64985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_75016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__SubsectionLevel1__NameAssignment_15047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__ContentAssignment_45078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__SubsectionLevel2__NameAssignment_15109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__ContentAssignment_45140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__SubsectionLevel3__NameAssignment_15171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__ContentAssignment_45202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__SubsectionLevel4__NameAssignment_15233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__ContentAssignment_45264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WIKITEXT_in_rule__UnFormattedText__WordsAssignment_05295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__ExternalLink__PageNameAssignment_15326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__ExternalLinkAlternative__UrlAssignment_15357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__ExternalLinkAlternative__AlternativeTextAssignment_35388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__InternalLink__PageNameAssignment_15419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__InternalLinkAlternative__PageNameAssignment_15450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnFormattedText_in_rule__InternalLinkAlternative__AlternativeTextAssignment_35481 = new BitSet(new long[]{0x0000000000000002L});

}