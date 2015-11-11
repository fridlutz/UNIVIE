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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:237:1: ruleInlineContent : ( ( rule__InlineContent__Group__0 ) ) ;
    public final void ruleInlineContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:241:2: ( ( ( rule__InlineContent__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__InlineContent__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__InlineContent__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:243:1: ( rule__InlineContent__Group__0 )
            {
             before(grammarAccess.getInlineContentAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:1: ( rule__InlineContent__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:2: rule__InlineContent__Group__0
            {
            pushFollow(FOLLOW_rule__InlineContent__Group__0_in_ruleInlineContent454);
            rule__InlineContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineContentAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbstractSection__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:256:1: rule__AbstractSection__Alternatives : ( ( ruleSubsectionLevel1 ) | ( ruleSubsectionLevel2 ) | ( ruleSubsectionLevel3 ) | ( ruleSubsectionLevel4 ) );
    public final void rule__AbstractSection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:260:1: ( ( ruleSubsectionLevel1 ) | ( ruleSubsectionLevel2 ) | ( ruleSubsectionLevel3 ) | ( ruleSubsectionLevel4 ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 19:
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:261:1: ( ruleSubsectionLevel1 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:261:1: ( ruleSubsectionLevel1 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:262:1: ruleSubsectionLevel1
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel1_in_rule__AbstractSection__Alternatives490);
                    ruleSubsectionLevel1();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel1ParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:267:6: ( ruleSubsectionLevel2 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:267:6: ( ruleSubsectionLevel2 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:268:1: ruleSubsectionLevel2
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel2_in_rule__AbstractSection__Alternatives507);
                    ruleSubsectionLevel2();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel2ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:273:6: ( ruleSubsectionLevel3 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:273:6: ( ruleSubsectionLevel3 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:274:1: ruleSubsectionLevel3
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel3_in_rule__AbstractSection__Alternatives524);
                    ruleSubsectionLevel3();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubsectionLevel3ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:279:6: ( ruleSubsectionLevel4 )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:279:6: ( ruleSubsectionLevel4 )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:280:1: ruleSubsectionLevel4
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubsectionLevel4ParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSubsectionLevel4_in_rule__AbstractSection__Alternatives541);
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


    // $ANTLR start "rule__Wikipage__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:292:1: rule__Wikipage__Group__0 : rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1 ;
    public final void rule__Wikipage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:296:1: ( rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:297:2: rule__Wikipage__Group__0__Impl rule__Wikipage__Group__1
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__0__Impl_in_rule__Wikipage__Group__0571);
            rule__Wikipage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__1_in_rule__Wikipage__Group__0574);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:304:1: rule__Wikipage__Group__0__Impl : ( 'title' ) ;
    public final void rule__Wikipage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:308:1: ( ( 'title' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:309:1: ( 'title' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:309:1: ( 'title' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:310:1: 'title'
            {
             before(grammarAccess.getWikipageAccess().getTitleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Wikipage__Group__0__Impl602); 
             after(grammarAccess.getWikipageAccess().getTitleKeyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:323:1: rule__Wikipage__Group__1 : rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2 ;
    public final void rule__Wikipage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:327:1: ( rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:2: rule__Wikipage__Group__1__Impl rule__Wikipage__Group__2
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__1__Impl_in_rule__Wikipage__Group__1633);
            rule__Wikipage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__2_in_rule__Wikipage__Group__1636);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:335:1: rule__Wikipage__Group__1__Impl : ( ( rule__Wikipage__NameAssignment_1 ) ) ;
    public final void rule__Wikipage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:339:1: ( ( ( rule__Wikipage__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: ( ( rule__Wikipage__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: ( ( rule__Wikipage__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:341:1: ( rule__Wikipage__NameAssignment_1 )
            {
             before(grammarAccess.getWikipageAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:342:1: ( rule__Wikipage__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:342:2: rule__Wikipage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Wikipage__NameAssignment_1_in_rule__Wikipage__Group__1__Impl663);
            rule__Wikipage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWikipageAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:352:1: rule__Wikipage__Group__2 : rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3 ;
    public final void rule__Wikipage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:356:1: ( rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:357:2: rule__Wikipage__Group__2__Impl rule__Wikipage__Group__3
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__2__Impl_in_rule__Wikipage__Group__2693);
            rule__Wikipage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__3_in_rule__Wikipage__Group__2696);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:364:1: rule__Wikipage__Group__2__Impl : ( 'title\\n' ) ;
    public final void rule__Wikipage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:368:1: ( ( 'title\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:369:1: ( 'title\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:369:1: ( 'title\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:370:1: 'title\\n'
            {
             before(grammarAccess.getWikipageAccess().getTitleKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Wikipage__Group__2__Impl724); 
             after(grammarAccess.getWikipageAccess().getTitleKeyword_2()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:383:1: rule__Wikipage__Group__3 : rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4 ;
    public final void rule__Wikipage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:387:1: ( rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:388:2: rule__Wikipage__Group__3__Impl rule__Wikipage__Group__4
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__3__Impl_in_rule__Wikipage__Group__3755);
            rule__Wikipage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__4_in_rule__Wikipage__Group__3758);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:395:1: rule__Wikipage__Group__3__Impl : ( ( rule__Wikipage__ContentAssignment_3 )? ) ;
    public final void rule__Wikipage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:399:1: ( ( ( rule__Wikipage__ContentAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:400:1: ( ( rule__Wikipage__ContentAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:400:1: ( ( rule__Wikipage__ContentAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:401:1: ( rule__Wikipage__ContentAssignment_3 )?
            {
             before(grammarAccess.getWikipageAccess().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:402:1: ( rule__Wikipage__ContentAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:402:2: rule__Wikipage__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Wikipage__ContentAssignment_3_in_rule__Wikipage__Group__3__Impl785);
                    rule__Wikipage__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWikipageAccess().getContentAssignment_3()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:412:1: rule__Wikipage__Group__4 : rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5 ;
    public final void rule__Wikipage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:416:1: ( rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:417:2: rule__Wikipage__Group__4__Impl rule__Wikipage__Group__5
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__4__Impl_in_rule__Wikipage__Group__4816);
            rule__Wikipage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Wikipage__Group__5_in_rule__Wikipage__Group__4819);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:424:1: rule__Wikipage__Group__4__Impl : ( ( rule__Wikipage__SectionsAssignment_4 ) ) ;
    public final void rule__Wikipage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:428:1: ( ( ( rule__Wikipage__SectionsAssignment_4 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:429:1: ( ( rule__Wikipage__SectionsAssignment_4 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:429:1: ( ( rule__Wikipage__SectionsAssignment_4 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:430:1: ( rule__Wikipage__SectionsAssignment_4 )
            {
             before(grammarAccess.getWikipageAccess().getSectionsAssignment_4()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:431:1: ( rule__Wikipage__SectionsAssignment_4 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:431:2: rule__Wikipage__SectionsAssignment_4
            {
            pushFollow(FOLLOW_rule__Wikipage__SectionsAssignment_4_in_rule__Wikipage__Group__4__Impl846);
            rule__Wikipage__SectionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWikipageAccess().getSectionsAssignment_4()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:441:1: rule__Wikipage__Group__5 : rule__Wikipage__Group__5__Impl ;
    public final void rule__Wikipage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:445:1: ( rule__Wikipage__Group__5__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:446:2: rule__Wikipage__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Wikipage__Group__5__Impl_in_rule__Wikipage__Group__5876);
            rule__Wikipage__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:452:1: rule__Wikipage__Group__5__Impl : ( ( rule__Wikipage__AbstractSectionsAssignment_5 )* ) ;
    public final void rule__Wikipage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:456:1: ( ( ( rule__Wikipage__AbstractSectionsAssignment_5 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:457:1: ( ( rule__Wikipage__AbstractSectionsAssignment_5 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:457:1: ( ( rule__Wikipage__AbstractSectionsAssignment_5 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:458:1: ( rule__Wikipage__AbstractSectionsAssignment_5 )*
            {
             before(grammarAccess.getWikipageAccess().getAbstractSectionsAssignment_5()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:459:1: ( rule__Wikipage__AbstractSectionsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==15||LA3_0==17||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:459:2: rule__Wikipage__AbstractSectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Wikipage__AbstractSectionsAssignment_5_in_rule__Wikipage__Group__5__Impl903);
            	    rule__Wikipage__AbstractSectionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWikipageAccess().getAbstractSectionsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel1__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:481:1: rule__SubsectionLevel1__Group__0 : rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1 ;
    public final void rule__SubsectionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:485:1: ( rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:486:2: rule__SubsectionLevel1__Group__0__Impl rule__SubsectionLevel1__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__0__Impl_in_rule__SubsectionLevel1__Group__0946);
            rule__SubsectionLevel1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__1_in_rule__SubsectionLevel1__Group__0949);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:493:1: rule__SubsectionLevel1__Group__0__Impl : ( 'section1' ) ;
    public final void rule__SubsectionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:497:1: ( ( 'section1' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:498:1: ( 'section1' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:498:1: ( 'section1' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:499:1: 'section1'
            {
             before(grammarAccess.getSubsectionLevel1Access().getSection1Keyword_0()); 
            match(input,13,FOLLOW_13_in_rule__SubsectionLevel1__Group__0__Impl977); 
             after(grammarAccess.getSubsectionLevel1Access().getSection1Keyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:512:1: rule__SubsectionLevel1__Group__1 : rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2 ;
    public final void rule__SubsectionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:516:1: ( rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:517:2: rule__SubsectionLevel1__Group__1__Impl rule__SubsectionLevel1__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__1__Impl_in_rule__SubsectionLevel1__Group__11008);
            rule__SubsectionLevel1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__2_in_rule__SubsectionLevel1__Group__11011);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:1: rule__SubsectionLevel1__Group__1__Impl : ( ( rule__SubsectionLevel1__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:528:1: ( ( ( rule__SubsectionLevel1__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:529:1: ( ( rule__SubsectionLevel1__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:529:1: ( ( rule__SubsectionLevel1__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:530:1: ( rule__SubsectionLevel1__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel1Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:531:1: ( rule__SubsectionLevel1__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:531:2: rule__SubsectionLevel1__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__NameAssignment_1_in_rule__SubsectionLevel1__Group__1__Impl1038);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:541:1: rule__SubsectionLevel1__Group__2 : rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3 ;
    public final void rule__SubsectionLevel1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:545:1: ( rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:546:2: rule__SubsectionLevel1__Group__2__Impl rule__SubsectionLevel1__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__2__Impl_in_rule__SubsectionLevel1__Group__21068);
            rule__SubsectionLevel1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__3_in_rule__SubsectionLevel1__Group__21071);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:553:1: rule__SubsectionLevel1__Group__2__Impl : ( 'section1\\n' ) ;
    public final void rule__SubsectionLevel1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:557:1: ( ( 'section1\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:558:1: ( 'section1\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:558:1: ( 'section1\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:559:1: 'section1\\n'
            {
             before(grammarAccess.getSubsectionLevel1Access().getSection1Keyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SubsectionLevel1__Group__2__Impl1099); 
             after(grammarAccess.getSubsectionLevel1Access().getSection1Keyword_2()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:572:1: rule__SubsectionLevel1__Group__3 : rule__SubsectionLevel1__Group__3__Impl ;
    public final void rule__SubsectionLevel1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:576:1: ( rule__SubsectionLevel1__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:577:2: rule__SubsectionLevel1__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel1__Group__3__Impl_in_rule__SubsectionLevel1__Group__31130);
            rule__SubsectionLevel1__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:583:1: rule__SubsectionLevel1__Group__3__Impl : ( ( rule__SubsectionLevel1__ContentAssignment_3 )? ) ;
    public final void rule__SubsectionLevel1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:587:1: ( ( ( rule__SubsectionLevel1__ContentAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:588:1: ( ( rule__SubsectionLevel1__ContentAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:588:1: ( ( rule__SubsectionLevel1__ContentAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:589:1: ( rule__SubsectionLevel1__ContentAssignment_3 )?
            {
             before(grammarAccess.getSubsectionLevel1Access().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:590:1: ( rule__SubsectionLevel1__ContentAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:590:2: rule__SubsectionLevel1__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SubsectionLevel1__ContentAssignment_3_in_rule__SubsectionLevel1__Group__3__Impl1157);
                    rule__SubsectionLevel1__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubsectionLevel1Access().getContentAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel2__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:608:1: rule__SubsectionLevel2__Group__0 : rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1 ;
    public final void rule__SubsectionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:612:1: ( rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:613:2: rule__SubsectionLevel2__Group__0__Impl rule__SubsectionLevel2__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__0__Impl_in_rule__SubsectionLevel2__Group__01196);
            rule__SubsectionLevel2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__1_in_rule__SubsectionLevel2__Group__01199);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:620:1: rule__SubsectionLevel2__Group__0__Impl : ( 'section2' ) ;
    public final void rule__SubsectionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:624:1: ( ( 'section2' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:625:1: ( 'section2' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:625:1: ( 'section2' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:626:1: 'section2'
            {
             before(grammarAccess.getSubsectionLevel2Access().getSection2Keyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SubsectionLevel2__Group__0__Impl1227); 
             after(grammarAccess.getSubsectionLevel2Access().getSection2Keyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:639:1: rule__SubsectionLevel2__Group__1 : rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2 ;
    public final void rule__SubsectionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:643:1: ( rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:644:2: rule__SubsectionLevel2__Group__1__Impl rule__SubsectionLevel2__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__1__Impl_in_rule__SubsectionLevel2__Group__11258);
            rule__SubsectionLevel2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__2_in_rule__SubsectionLevel2__Group__11261);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:651:1: rule__SubsectionLevel2__Group__1__Impl : ( ( rule__SubsectionLevel2__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:655:1: ( ( ( rule__SubsectionLevel2__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:656:1: ( ( rule__SubsectionLevel2__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:656:1: ( ( rule__SubsectionLevel2__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:657:1: ( rule__SubsectionLevel2__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel2Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:658:1: ( rule__SubsectionLevel2__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:658:2: rule__SubsectionLevel2__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__NameAssignment_1_in_rule__SubsectionLevel2__Group__1__Impl1288);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:668:1: rule__SubsectionLevel2__Group__2 : rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3 ;
    public final void rule__SubsectionLevel2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:672:1: ( rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:673:2: rule__SubsectionLevel2__Group__2__Impl rule__SubsectionLevel2__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__2__Impl_in_rule__SubsectionLevel2__Group__21318);
            rule__SubsectionLevel2__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__3_in_rule__SubsectionLevel2__Group__21321);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:680:1: rule__SubsectionLevel2__Group__2__Impl : ( 'section2\\n' ) ;
    public final void rule__SubsectionLevel2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:684:1: ( ( 'section2\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:685:1: ( 'section2\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:685:1: ( 'section2\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:686:1: 'section2\\n'
            {
             before(grammarAccess.getSubsectionLevel2Access().getSection2Keyword_2()); 
            match(input,16,FOLLOW_16_in_rule__SubsectionLevel2__Group__2__Impl1349); 
             after(grammarAccess.getSubsectionLevel2Access().getSection2Keyword_2()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:699:1: rule__SubsectionLevel2__Group__3 : rule__SubsectionLevel2__Group__3__Impl ;
    public final void rule__SubsectionLevel2__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:703:1: ( rule__SubsectionLevel2__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:704:2: rule__SubsectionLevel2__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel2__Group__3__Impl_in_rule__SubsectionLevel2__Group__31380);
            rule__SubsectionLevel2__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:710:1: rule__SubsectionLevel2__Group__3__Impl : ( ( rule__SubsectionLevel2__ContentAssignment_3 )? ) ;
    public final void rule__SubsectionLevel2__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:714:1: ( ( ( rule__SubsectionLevel2__ContentAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:715:1: ( ( rule__SubsectionLevel2__ContentAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:715:1: ( ( rule__SubsectionLevel2__ContentAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:716:1: ( rule__SubsectionLevel2__ContentAssignment_3 )?
            {
             before(grammarAccess.getSubsectionLevel2Access().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:717:1: ( rule__SubsectionLevel2__ContentAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:717:2: rule__SubsectionLevel2__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SubsectionLevel2__ContentAssignment_3_in_rule__SubsectionLevel2__Group__3__Impl1407);
                    rule__SubsectionLevel2__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubsectionLevel2Access().getContentAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel3__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:735:1: rule__SubsectionLevel3__Group__0 : rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1 ;
    public final void rule__SubsectionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:739:1: ( rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:740:2: rule__SubsectionLevel3__Group__0__Impl rule__SubsectionLevel3__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__0__Impl_in_rule__SubsectionLevel3__Group__01446);
            rule__SubsectionLevel3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__1_in_rule__SubsectionLevel3__Group__01449);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:747:1: rule__SubsectionLevel3__Group__0__Impl : ( 'section3' ) ;
    public final void rule__SubsectionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:751:1: ( ( 'section3' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:752:1: ( 'section3' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:752:1: ( 'section3' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:753:1: 'section3'
            {
             before(grammarAccess.getSubsectionLevel3Access().getSection3Keyword_0()); 
            match(input,17,FOLLOW_17_in_rule__SubsectionLevel3__Group__0__Impl1477); 
             after(grammarAccess.getSubsectionLevel3Access().getSection3Keyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:766:1: rule__SubsectionLevel3__Group__1 : rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2 ;
    public final void rule__SubsectionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:770:1: ( rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:771:2: rule__SubsectionLevel3__Group__1__Impl rule__SubsectionLevel3__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__1__Impl_in_rule__SubsectionLevel3__Group__11508);
            rule__SubsectionLevel3__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__2_in_rule__SubsectionLevel3__Group__11511);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:778:1: rule__SubsectionLevel3__Group__1__Impl : ( ( rule__SubsectionLevel3__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:782:1: ( ( ( rule__SubsectionLevel3__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:783:1: ( ( rule__SubsectionLevel3__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:783:1: ( ( rule__SubsectionLevel3__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:784:1: ( rule__SubsectionLevel3__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel3Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:785:1: ( rule__SubsectionLevel3__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:785:2: rule__SubsectionLevel3__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__NameAssignment_1_in_rule__SubsectionLevel3__Group__1__Impl1538);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:795:1: rule__SubsectionLevel3__Group__2 : rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3 ;
    public final void rule__SubsectionLevel3__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:799:1: ( rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:800:2: rule__SubsectionLevel3__Group__2__Impl rule__SubsectionLevel3__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__2__Impl_in_rule__SubsectionLevel3__Group__21568);
            rule__SubsectionLevel3__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__3_in_rule__SubsectionLevel3__Group__21571);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:807:1: rule__SubsectionLevel3__Group__2__Impl : ( 'section3\\n' ) ;
    public final void rule__SubsectionLevel3__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:811:1: ( ( 'section3\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:812:1: ( 'section3\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:812:1: ( 'section3\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:813:1: 'section3\\n'
            {
             before(grammarAccess.getSubsectionLevel3Access().getSection3Keyword_2()); 
            match(input,18,FOLLOW_18_in_rule__SubsectionLevel3__Group__2__Impl1599); 
             after(grammarAccess.getSubsectionLevel3Access().getSection3Keyword_2()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:826:1: rule__SubsectionLevel3__Group__3 : rule__SubsectionLevel3__Group__3__Impl ;
    public final void rule__SubsectionLevel3__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:830:1: ( rule__SubsectionLevel3__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:831:2: rule__SubsectionLevel3__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel3__Group__3__Impl_in_rule__SubsectionLevel3__Group__31630);
            rule__SubsectionLevel3__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:837:1: rule__SubsectionLevel3__Group__3__Impl : ( ( rule__SubsectionLevel3__ContentAssignment_3 )? ) ;
    public final void rule__SubsectionLevel3__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:841:1: ( ( ( rule__SubsectionLevel3__ContentAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:842:1: ( ( rule__SubsectionLevel3__ContentAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:842:1: ( ( rule__SubsectionLevel3__ContentAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:843:1: ( rule__SubsectionLevel3__ContentAssignment_3 )?
            {
             before(grammarAccess.getSubsectionLevel3Access().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:844:1: ( rule__SubsectionLevel3__ContentAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:844:2: rule__SubsectionLevel3__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SubsectionLevel3__ContentAssignment_3_in_rule__SubsectionLevel3__Group__3__Impl1657);
                    rule__SubsectionLevel3__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubsectionLevel3Access().getContentAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel4__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:862:1: rule__SubsectionLevel4__Group__0 : rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1 ;
    public final void rule__SubsectionLevel4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:866:1: ( rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:867:2: rule__SubsectionLevel4__Group__0__Impl rule__SubsectionLevel4__Group__1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__0__Impl_in_rule__SubsectionLevel4__Group__01696);
            rule__SubsectionLevel4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__1_in_rule__SubsectionLevel4__Group__01699);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:874:1: rule__SubsectionLevel4__Group__0__Impl : ( 'section4' ) ;
    public final void rule__SubsectionLevel4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:878:1: ( ( 'section4' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:879:1: ( 'section4' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:879:1: ( 'section4' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:880:1: 'section4'
            {
             before(grammarAccess.getSubsectionLevel4Access().getSection4Keyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SubsectionLevel4__Group__0__Impl1727); 
             after(grammarAccess.getSubsectionLevel4Access().getSection4Keyword_0()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:893:1: rule__SubsectionLevel4__Group__1 : rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2 ;
    public final void rule__SubsectionLevel4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:897:1: ( rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:898:2: rule__SubsectionLevel4__Group__1__Impl rule__SubsectionLevel4__Group__2
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__1__Impl_in_rule__SubsectionLevel4__Group__11758);
            rule__SubsectionLevel4__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__2_in_rule__SubsectionLevel4__Group__11761);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:1: rule__SubsectionLevel4__Group__1__Impl : ( ( rule__SubsectionLevel4__NameAssignment_1 ) ) ;
    public final void rule__SubsectionLevel4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:909:1: ( ( ( rule__SubsectionLevel4__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:910:1: ( ( rule__SubsectionLevel4__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:910:1: ( ( rule__SubsectionLevel4__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:911:1: ( rule__SubsectionLevel4__NameAssignment_1 )
            {
             before(grammarAccess.getSubsectionLevel4Access().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:912:1: ( rule__SubsectionLevel4__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:912:2: rule__SubsectionLevel4__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__NameAssignment_1_in_rule__SubsectionLevel4__Group__1__Impl1788);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:922:1: rule__SubsectionLevel4__Group__2 : rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3 ;
    public final void rule__SubsectionLevel4__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:926:1: ( rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:927:2: rule__SubsectionLevel4__Group__2__Impl rule__SubsectionLevel4__Group__3
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__2__Impl_in_rule__SubsectionLevel4__Group__21818);
            rule__SubsectionLevel4__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__3_in_rule__SubsectionLevel4__Group__21821);
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:934:1: rule__SubsectionLevel4__Group__2__Impl : ( 'section4\\n' ) ;
    public final void rule__SubsectionLevel4__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:938:1: ( ( 'section4\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:939:1: ( 'section4\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:939:1: ( 'section4\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:940:1: 'section4\\n'
            {
             before(grammarAccess.getSubsectionLevel4Access().getSection4Keyword_2()); 
            match(input,20,FOLLOW_20_in_rule__SubsectionLevel4__Group__2__Impl1849); 
             after(grammarAccess.getSubsectionLevel4Access().getSection4Keyword_2()); 

            }


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:953:1: rule__SubsectionLevel4__Group__3 : rule__SubsectionLevel4__Group__3__Impl ;
    public final void rule__SubsectionLevel4__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:957:1: ( rule__SubsectionLevel4__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:958:2: rule__SubsectionLevel4__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubsectionLevel4__Group__3__Impl_in_rule__SubsectionLevel4__Group__31880);
            rule__SubsectionLevel4__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:964:1: rule__SubsectionLevel4__Group__3__Impl : ( ( rule__SubsectionLevel4__ContentAssignment_3 )? ) ;
    public final void rule__SubsectionLevel4__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:968:1: ( ( ( rule__SubsectionLevel4__ContentAssignment_3 )? ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:969:1: ( ( rule__SubsectionLevel4__ContentAssignment_3 )? )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:969:1: ( ( rule__SubsectionLevel4__ContentAssignment_3 )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:970:1: ( rule__SubsectionLevel4__ContentAssignment_3 )?
            {
             before(grammarAccess.getSubsectionLevel4Access().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:971:1: ( rule__SubsectionLevel4__ContentAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:971:2: rule__SubsectionLevel4__ContentAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SubsectionLevel4__ContentAssignment_3_in_rule__SubsectionLevel4__Group__3__Impl1907);
                    rule__SubsectionLevel4__ContentAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubsectionLevel4Access().getContentAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__InlineContent__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:989:1: rule__InlineContent__Group__0 : rule__InlineContent__Group__0__Impl rule__InlineContent__Group__1 ;
    public final void rule__InlineContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:993:1: ( rule__InlineContent__Group__0__Impl rule__InlineContent__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:994:2: rule__InlineContent__Group__0__Impl rule__InlineContent__Group__1
            {
            pushFollow(FOLLOW_rule__InlineContent__Group__0__Impl_in_rule__InlineContent__Group__01946);
            rule__InlineContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InlineContent__Group__1_in_rule__InlineContent__Group__01949);
            rule__InlineContent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineContent__Group__0"


    // $ANTLR start "rule__InlineContent__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1001:1: rule__InlineContent__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__InlineContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1005:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1006:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1006:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1007:1: RULE_ID
            {
             before(grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InlineContent__Group__0__Impl1976); 
             after(grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineContent__Group__0__Impl"


    // $ANTLR start "rule__InlineContent__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1018:1: rule__InlineContent__Group__1 : rule__InlineContent__Group__1__Impl ;
    public final void rule__InlineContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1022:1: ( rule__InlineContent__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1023:2: rule__InlineContent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InlineContent__Group__1__Impl_in_rule__InlineContent__Group__12005);
            rule__InlineContent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineContent__Group__1"


    // $ANTLR start "rule__InlineContent__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1029:1: rule__InlineContent__Group__1__Impl : ( ( RULE_ID )* ) ;
    public final void rule__InlineContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1033:1: ( ( ( RULE_ID )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1034:1: ( ( RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1034:1: ( ( RULE_ID )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1035:1: ( RULE_ID )*
            {
             before(grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1036:1: ( RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1036:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InlineContent__Group__1__Impl2033); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getInlineContentAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineContent__Group__1__Impl"


    // $ANTLR start "rule__Wikipage__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1051:1: rule__Wikipage__NameAssignment_1 : ( ruleInlineContent ) ;
    public final void rule__Wikipage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1055:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1056:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1056:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1057:1: ruleInlineContent
            {
             before(grammarAccess.getWikipageAccess().getNameInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__Wikipage__NameAssignment_12073);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getNameInlineContentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__NameAssignment_1"


    // $ANTLR start "rule__Wikipage__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1066:1: rule__Wikipage__ContentAssignment_3 : ( ruleInlineContent ) ;
    public final void rule__Wikipage__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1070:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1071:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1071:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1072:1: ruleInlineContent
            {
             before(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__Wikipage__ContentAssignment_32104);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getContentInlineContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__ContentAssignment_3"


    // $ANTLR start "rule__Wikipage__SectionsAssignment_4"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: rule__Wikipage__SectionsAssignment_4 : ( ruleAbstractSection ) ;
    public final void rule__Wikipage__SectionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1085:1: ( ( ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1086:1: ( ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1086:1: ( ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1087:1: ruleAbstractSection
            {
             before(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_42135);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getSectionsAbstractSectionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__SectionsAssignment_4"


    // $ANTLR start "rule__Wikipage__AbstractSectionsAssignment_5"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1096:1: rule__Wikipage__AbstractSectionsAssignment_5 : ( ruleAbstractSection ) ;
    public final void rule__Wikipage__AbstractSectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1100:1: ( ( ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1101:1: ( ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1101:1: ( ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1102:1: ruleAbstractSection
            {
             before(grammarAccess.getWikipageAccess().getAbstractSectionsAbstractSectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_rule__Wikipage__AbstractSectionsAssignment_52166);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getWikipageAccess().getAbstractSectionsAbstractSectionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wikipage__AbstractSectionsAssignment_5"


    // $ANTLR start "rule__SubsectionLevel1__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1111:1: rule__SubsectionLevel1__NameAssignment_1 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel1__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1115:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1116:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1116:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1117:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel1Access().getNameInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__NameAssignment_12197);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel1Access().getNameInlineContentParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel1__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1126:1: rule__SubsectionLevel1__ContentAssignment_3 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel1__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1130:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1131:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1132:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__ContentAssignment_32228);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel1Access().getContentInlineContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel1__ContentAssignment_3"


    // $ANTLR start "rule__SubsectionLevel2__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1141:1: rule__SubsectionLevel2__NameAssignment_1 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel2__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1145:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1146:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1146:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1147:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel2Access().getNameInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__NameAssignment_12259);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel2Access().getNameInlineContentParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel2__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1156:1: rule__SubsectionLevel2__ContentAssignment_3 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel2__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1160:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1161:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1161:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1162:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__ContentAssignment_32290);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel2Access().getContentInlineContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel2__ContentAssignment_3"


    // $ANTLR start "rule__SubsectionLevel3__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1171:1: rule__SubsectionLevel3__NameAssignment_1 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel3__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1175:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1176:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1176:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1177:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel3Access().getNameInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__NameAssignment_12321);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel3Access().getNameInlineContentParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel3__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1186:1: rule__SubsectionLevel3__ContentAssignment_3 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel3__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1190:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1191:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1192:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__ContentAssignment_32352);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel3Access().getContentInlineContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel3__ContentAssignment_3"


    // $ANTLR start "rule__SubsectionLevel4__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1201:1: rule__SubsectionLevel4__NameAssignment_1 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel4__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1205:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1206:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1206:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1207:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel4Access().getNameInlineContentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__NameAssignment_12383);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel4Access().getNameInlineContentParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SubsectionLevel4__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1216:1: rule__SubsectionLevel4__ContentAssignment_3 : ( ruleInlineContent ) ;
    public final void rule__SubsectionLevel4__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1220:1: ( ( ruleInlineContent ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1221:1: ( ruleInlineContent )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1221:1: ( ruleInlineContent )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1222:1: ruleInlineContent
            {
             before(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__ContentAssignment_32414);
            ruleInlineContent();

            state._fsp--;

             after(grammarAccess.getSubsectionLevel4Access().getContentInlineContentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubsectionLevel4__ContentAssignment_3"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_rule__InlineContent__Group__0_in_ruleInlineContent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel1_in_rule__AbstractSection__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel2_in_rule__AbstractSection__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel3_in_rule__AbstractSection__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsectionLevel4_in_rule__AbstractSection__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__0__Impl_in_rule__Wikipage__Group__0571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__1_in_rule__Wikipage__Group__0574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Wikipage__Group__0__Impl602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__1__Impl_in_rule__Wikipage__Group__1633 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__2_in_rule__Wikipage__Group__1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__NameAssignment_1_in_rule__Wikipage__Group__1__Impl663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__2__Impl_in_rule__Wikipage__Group__2693 = new BitSet(new long[]{0x00000000000AA010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__3_in_rule__Wikipage__Group__2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Wikipage__Group__2__Impl724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__3__Impl_in_rule__Wikipage__Group__3755 = new BitSet(new long[]{0x00000000000AA010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__4_in_rule__Wikipage__Group__3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__ContentAssignment_3_in_rule__Wikipage__Group__3__Impl785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__4__Impl_in_rule__Wikipage__Group__4816 = new BitSet(new long[]{0x00000000000AA010L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__5_in_rule__Wikipage__Group__4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__SectionsAssignment_4_in_rule__Wikipage__Group__4__Impl846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__Group__5__Impl_in_rule__Wikipage__Group__5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wikipage__AbstractSectionsAssignment_5_in_rule__Wikipage__Group__5__Impl903 = new BitSet(new long[]{0x00000000000AA012L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__0__Impl_in_rule__SubsectionLevel1__Group__0946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__1_in_rule__SubsectionLevel1__Group__0949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubsectionLevel1__Group__0__Impl977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__1__Impl_in_rule__SubsectionLevel1__Group__11008 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__2_in_rule__SubsectionLevel1__Group__11011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__NameAssignment_1_in_rule__SubsectionLevel1__Group__1__Impl1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__2__Impl_in_rule__SubsectionLevel1__Group__21068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__3_in_rule__SubsectionLevel1__Group__21071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubsectionLevel1__Group__2__Impl1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__Group__3__Impl_in_rule__SubsectionLevel1__Group__31130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel1__ContentAssignment_3_in_rule__SubsectionLevel1__Group__3__Impl1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__0__Impl_in_rule__SubsectionLevel2__Group__01196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__1_in_rule__SubsectionLevel2__Group__01199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubsectionLevel2__Group__0__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__1__Impl_in_rule__SubsectionLevel2__Group__11258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__2_in_rule__SubsectionLevel2__Group__11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__NameAssignment_1_in_rule__SubsectionLevel2__Group__1__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__2__Impl_in_rule__SubsectionLevel2__Group__21318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__3_in_rule__SubsectionLevel2__Group__21321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubsectionLevel2__Group__2__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__Group__3__Impl_in_rule__SubsectionLevel2__Group__31380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel2__ContentAssignment_3_in_rule__SubsectionLevel2__Group__3__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__0__Impl_in_rule__SubsectionLevel3__Group__01446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__1_in_rule__SubsectionLevel3__Group__01449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubsectionLevel3__Group__0__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__1__Impl_in_rule__SubsectionLevel3__Group__11508 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__2_in_rule__SubsectionLevel3__Group__11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__NameAssignment_1_in_rule__SubsectionLevel3__Group__1__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__2__Impl_in_rule__SubsectionLevel3__Group__21568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__3_in_rule__SubsectionLevel3__Group__21571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SubsectionLevel3__Group__2__Impl1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__Group__3__Impl_in_rule__SubsectionLevel3__Group__31630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel3__ContentAssignment_3_in_rule__SubsectionLevel3__Group__3__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__0__Impl_in_rule__SubsectionLevel4__Group__01696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__1_in_rule__SubsectionLevel4__Group__01699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SubsectionLevel4__Group__0__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__1__Impl_in_rule__SubsectionLevel4__Group__11758 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__2_in_rule__SubsectionLevel4__Group__11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__NameAssignment_1_in_rule__SubsectionLevel4__Group__1__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__2__Impl_in_rule__SubsectionLevel4__Group__21818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__3_in_rule__SubsectionLevel4__Group__21821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SubsectionLevel4__Group__2__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__Group__3__Impl_in_rule__SubsectionLevel4__Group__31880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubsectionLevel4__ContentAssignment_3_in_rule__SubsectionLevel4__Group__3__Impl1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InlineContent__Group__0__Impl_in_rule__InlineContent__Group__01946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InlineContent__Group__1_in_rule__InlineContent__Group__01949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InlineContent__Group__0__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InlineContent__Group__1__Impl_in_rule__InlineContent__Group__12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InlineContent__Group__1__Impl2033 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__Wikipage__NameAssignment_12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__Wikipage__ContentAssignment_32104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rule__Wikipage__SectionsAssignment_42135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rule__Wikipage__AbstractSectionsAssignment_52166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__NameAssignment_12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel1__ContentAssignment_32228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__NameAssignment_12259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel2__ContentAssignment_32290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__NameAssignment_12321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel3__ContentAssignment_32352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__NameAssignment_12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineContent_in_rule__SubsectionLevel4__ContentAssignment_32414 = new BitSet(new long[]{0x0000000000000002L});

}