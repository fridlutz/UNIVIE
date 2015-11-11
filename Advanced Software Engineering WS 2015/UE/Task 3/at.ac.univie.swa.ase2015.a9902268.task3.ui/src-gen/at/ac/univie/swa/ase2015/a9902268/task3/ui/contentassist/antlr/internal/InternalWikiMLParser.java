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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TEXT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'=\\n'", "'=='", "'==\\n'", "'==='", "'===\\n'", "'===='", "'====\\n'", "'\\'\\'\\''", "'\\'\\''"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_TEXT=4;
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




    // $ANTLR start "entryRuleWikiMLPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:60:1: entryRuleWikiMLPage : ruleWikiMLPage EOF ;
    public final void entryRuleWikiMLPage() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:61:1: ( ruleWikiMLPage EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:62:1: ruleWikiMLPage EOF
            {
             before(grammarAccess.getWikiMLPageRule()); 
            pushFollow(FOLLOW_ruleWikiMLPage_in_entryRuleWikiMLPage61);
            ruleWikiMLPage();

            state._fsp--;

             after(grammarAccess.getWikiMLPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWikiMLPage68); 

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
    // $ANTLR end "entryRuleWikiMLPage"


    // $ANTLR start "ruleWikiMLPage"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:69:1: ruleWikiMLPage : ( ( rule__WikiMLPage__Group__0 ) ) ;
    public final void ruleWikiMLPage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:73:2: ( ( ( rule__WikiMLPage__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__WikiMLPage__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:74:1: ( ( rule__WikiMLPage__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:75:1: ( rule__WikiMLPage__Group__0 )
            {
             before(grammarAccess.getWikiMLPageAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:1: ( rule__WikiMLPage__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:76:2: rule__WikiMLPage__Group__0
            {
            pushFollow(FOLLOW_rule__WikiMLPage__Group__0_in_ruleWikiMLPage94);
            rule__WikiMLPage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWikiMLPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWikiMLPage"


    // $ANTLR start "entryRulePageTitle"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:88:1: entryRulePageTitle : rulePageTitle EOF ;
    public final void entryRulePageTitle() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:89:1: ( rulePageTitle EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:90:1: rulePageTitle EOF
            {
             before(grammarAccess.getPageTitleRule()); 
            pushFollow(FOLLOW_rulePageTitle_in_entryRulePageTitle121);
            rulePageTitle();

            state._fsp--;

             after(grammarAccess.getPageTitleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageTitle128); 

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
    // $ANTLR end "entryRulePageTitle"


    // $ANTLR start "rulePageTitle"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:97:1: rulePageTitle : ( ( rule__PageTitle__Group__0 ) ) ;
    public final void rulePageTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:101:2: ( ( ( rule__PageTitle__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__PageTitle__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:102:1: ( ( rule__PageTitle__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:103:1: ( rule__PageTitle__Group__0 )
            {
             before(grammarAccess.getPageTitleAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:1: ( rule__PageTitle__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:104:2: rule__PageTitle__Group__0
            {
            pushFollow(FOLLOW_rule__PageTitle__Group__0_in_rulePageTitle154);
            rule__PageTitle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageTitle"


    // $ANTLR start "entryRuleAbstractSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:116:1: entryRuleAbstractSection : ruleAbstractSection EOF ;
    public final void entryRuleAbstractSection() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:117:1: ( ruleAbstractSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:118:1: ruleAbstractSection EOF
            {
             before(grammarAccess.getAbstractSectionRule()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection181);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getAbstractSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSection188); 

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
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:125:1: ruleAbstractSection : ( ( rule__AbstractSection__Alternatives ) ) ;
    public final void ruleAbstractSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:129:2: ( ( ( rule__AbstractSection__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__AbstractSection__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:130:1: ( ( rule__AbstractSection__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:131:1: ( rule__AbstractSection__Alternatives )
            {
             before(grammarAccess.getAbstractSectionAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:1: ( rule__AbstractSection__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:132:2: rule__AbstractSection__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection214);
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


    // $ANTLR start "entryRuleSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:144:1: entryRuleSubSection : ruleSubSection EOF ;
    public final void entryRuleSubSection() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:145:1: ( ruleSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:146:1: ruleSubSection EOF
            {
             before(grammarAccess.getSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSection_in_entryRuleSubSection241);
            ruleSubSection();

            state._fsp--;

             after(grammarAccess.getSubSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSection248); 

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
    // $ANTLR end "entryRuleSubSection"


    // $ANTLR start "ruleSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:153:1: ruleSubSection : ( ( rule__SubSection__Group__0 ) ) ;
    public final void ruleSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:157:2: ( ( ( rule__SubSection__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__SubSection__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:158:1: ( ( rule__SubSection__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:159:1: ( rule__SubSection__Group__0 )
            {
             before(grammarAccess.getSubSectionAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:1: ( rule__SubSection__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:160:2: rule__SubSection__Group__0
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274);
            rule__SubSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSection"


    // $ANTLR start "entryRuleSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:172:1: entryRuleSubSubSection : ruleSubSubSection EOF ;
    public final void entryRuleSubSubSection() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:173:1: ( ruleSubSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:174:1: ruleSubSubSection EOF
            {
             before(grammarAccess.getSubSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSubSection_in_entryRuleSubSubSection301);
            ruleSubSubSection();

            state._fsp--;

             after(grammarAccess.getSubSubSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSubSection308); 

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
    // $ANTLR end "entryRuleSubSubSection"


    // $ANTLR start "ruleSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:181:1: ruleSubSubSection : ( ( rule__SubSubSection__Group__0 ) ) ;
    public final void ruleSubSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:185:2: ( ( ( rule__SubSubSection__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__SubSubSection__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:186:1: ( ( rule__SubSubSection__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:187:1: ( rule__SubSubSection__Group__0 )
            {
             before(grammarAccess.getSubSubSectionAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:1: ( rule__SubSubSection__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:188:2: rule__SubSubSection__Group__0
            {
            pushFollow(FOLLOW_rule__SubSubSection__Group__0_in_ruleSubSubSection334);
            rule__SubSubSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSubSection"


    // $ANTLR start "entryRuleSubSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:200:1: entryRuleSubSubSubSection : ruleSubSubSubSection EOF ;
    public final void entryRuleSubSubSubSection() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:201:1: ( ruleSubSubSubSection EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:202:1: ruleSubSubSubSection EOF
            {
             before(grammarAccess.getSubSubSubSectionRule()); 
            pushFollow(FOLLOW_ruleSubSubSubSection_in_entryRuleSubSubSubSection361);
            ruleSubSubSubSection();

            state._fsp--;

             after(grammarAccess.getSubSubSubSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSubSubSection368); 

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
    // $ANTLR end "entryRuleSubSubSubSection"


    // $ANTLR start "ruleSubSubSubSection"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:209:1: ruleSubSubSubSection : ( ( rule__SubSubSubSection__Group__0 ) ) ;
    public final void ruleSubSubSubSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:213:2: ( ( ( rule__SubSubSubSection__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__SubSubSubSection__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:214:1: ( ( rule__SubSubSubSection__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:215:1: ( rule__SubSubSubSection__Group__0 )
            {
             before(grammarAccess.getSubSubSubSectionAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:1: ( rule__SubSubSubSection__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:216:2: rule__SubSubSubSection__Group__0
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__Group__0_in_ruleSubSubSubSection394);
            rule__SubSubSubSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSubSubSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSubSubSection"


    // $ANTLR start "entryRuleAbstractParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:228:1: entryRuleAbstractParagraph : ruleAbstractParagraph EOF ;
    public final void entryRuleAbstractParagraph() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:229:1: ( ruleAbstractParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:230:1: ruleAbstractParagraph EOF
            {
             before(grammarAccess.getAbstractParagraphRule()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_entryRuleAbstractParagraph421);
            ruleAbstractParagraph();

            state._fsp--;

             after(grammarAccess.getAbstractParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractParagraph428); 

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
    // $ANTLR end "entryRuleAbstractParagraph"


    // $ANTLR start "ruleAbstractParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:237:1: ruleAbstractParagraph : ( ( rule__AbstractParagraph__Alternatives ) ) ;
    public final void ruleAbstractParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:241:2: ( ( ( rule__AbstractParagraph__Alternatives ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__AbstractParagraph__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:242:1: ( ( rule__AbstractParagraph__Alternatives ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:243:1: ( rule__AbstractParagraph__Alternatives )
            {
             before(grammarAccess.getAbstractParagraphAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:1: ( rule__AbstractParagraph__Alternatives )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:244:2: rule__AbstractParagraph__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractParagraph__Alternatives_in_ruleAbstractParagraph454);
            rule__AbstractParagraph__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractParagraphAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractParagraph"


    // $ANTLR start "entryRuleNormalParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:256:1: entryRuleNormalParagraph : ruleNormalParagraph EOF ;
    public final void entryRuleNormalParagraph() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:257:1: ( ruleNormalParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:258:1: ruleNormalParagraph EOF
            {
             before(grammarAccess.getNormalParagraphRule()); 
            pushFollow(FOLLOW_ruleNormalParagraph_in_entryRuleNormalParagraph481);
            ruleNormalParagraph();

            state._fsp--;

             after(grammarAccess.getNormalParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalParagraph488); 

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
    // $ANTLR end "entryRuleNormalParagraph"


    // $ANTLR start "ruleNormalParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:265:1: ruleNormalParagraph : ( ( rule__NormalParagraph__NameAssignment ) ) ;
    public final void ruleNormalParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:269:2: ( ( ( rule__NormalParagraph__NameAssignment ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__NormalParagraph__NameAssignment ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:270:1: ( ( rule__NormalParagraph__NameAssignment ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:271:1: ( rule__NormalParagraph__NameAssignment )
            {
             before(grammarAccess.getNormalParagraphAccess().getNameAssignment()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:1: ( rule__NormalParagraph__NameAssignment )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:272:2: rule__NormalParagraph__NameAssignment
            {
            pushFollow(FOLLOW_rule__NormalParagraph__NameAssignment_in_ruleNormalParagraph514);
            rule__NormalParagraph__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNormalParagraphAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormalParagraph"


    // $ANTLR start "entryRuleBoldParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:284:1: entryRuleBoldParagraph : ruleBoldParagraph EOF ;
    public final void entryRuleBoldParagraph() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:285:1: ( ruleBoldParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:286:1: ruleBoldParagraph EOF
            {
             before(grammarAccess.getBoldParagraphRule()); 
            pushFollow(FOLLOW_ruleBoldParagraph_in_entryRuleBoldParagraph541);
            ruleBoldParagraph();

            state._fsp--;

             after(grammarAccess.getBoldParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoldParagraph548); 

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
    // $ANTLR end "entryRuleBoldParagraph"


    // $ANTLR start "ruleBoldParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:293:1: ruleBoldParagraph : ( ( rule__BoldParagraph__Group__0 ) ) ;
    public final void ruleBoldParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:297:2: ( ( ( rule__BoldParagraph__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__BoldParagraph__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:298:1: ( ( rule__BoldParagraph__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:299:1: ( rule__BoldParagraph__Group__0 )
            {
             before(grammarAccess.getBoldParagraphAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:1: ( rule__BoldParagraph__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:300:2: rule__BoldParagraph__Group__0
            {
            pushFollow(FOLLOW_rule__BoldParagraph__Group__0_in_ruleBoldParagraph574);
            rule__BoldParagraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoldParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoldParagraph"


    // $ANTLR start "entryRuleItalicParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:312:1: entryRuleItalicParagraph : ruleItalicParagraph EOF ;
    public final void entryRuleItalicParagraph() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:313:1: ( ruleItalicParagraph EOF )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:314:1: ruleItalicParagraph EOF
            {
             before(grammarAccess.getItalicParagraphRule()); 
            pushFollow(FOLLOW_ruleItalicParagraph_in_entryRuleItalicParagraph601);
            ruleItalicParagraph();

            state._fsp--;

             after(grammarAccess.getItalicParagraphRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalicParagraph608); 

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
    // $ANTLR end "entryRuleItalicParagraph"


    // $ANTLR start "ruleItalicParagraph"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:321:1: ruleItalicParagraph : ( ( rule__ItalicParagraph__Group__0 ) ) ;
    public final void ruleItalicParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:325:2: ( ( ( rule__ItalicParagraph__Group__0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__ItalicParagraph__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:326:1: ( ( rule__ItalicParagraph__Group__0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:327:1: ( rule__ItalicParagraph__Group__0 )
            {
             before(grammarAccess.getItalicParagraphAccess().getGroup()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:1: ( rule__ItalicParagraph__Group__0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:328:2: rule__ItalicParagraph__Group__0
            {
            pushFollow(FOLLOW_rule__ItalicParagraph__Group__0_in_ruleItalicParagraph634);
            rule__ItalicParagraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItalicParagraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalicParagraph"


    // $ANTLR start "rule__AbstractSection__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:340:1: rule__AbstractSection__Alternatives : ( ( ruleSubSection ) | ( ruleSubSubSection ) | ( ruleSubSubSubSection ) );
    public final void rule__AbstractSection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:344:1: ( ( ruleSubSection ) | ( ruleSubSubSection ) | ( ruleSubSubSubSection ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:345:1: ( ruleSubSection )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:345:1: ( ruleSubSection )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:346:1: ruleSubSection
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubSectionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubSection_in_rule__AbstractSection__Alternatives670);
                    ruleSubSection();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubSectionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:351:6: ( ruleSubSubSection )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:351:6: ( ruleSubSubSection )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:352:1: ruleSubSubSection
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubSubSectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSubSubSection_in_rule__AbstractSection__Alternatives687);
                    ruleSubSubSection();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubSubSectionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:357:6: ( ruleSubSubSubSection )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:357:6: ( ruleSubSubSubSection )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:358:1: ruleSubSubSubSection
                    {
                     before(grammarAccess.getAbstractSectionAccess().getSubSubSubSectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSubSubSubSection_in_rule__AbstractSection__Alternatives704);
                    ruleSubSubSubSection();

                    state._fsp--;

                     after(grammarAccess.getAbstractSectionAccess().getSubSubSubSectionParserRuleCall_2()); 

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


    // $ANTLR start "rule__AbstractParagraph__Alternatives"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:368:1: rule__AbstractParagraph__Alternatives : ( ( ruleNormalParagraph ) | ( ruleBoldParagraph ) | ( ruleItalicParagraph ) );
    public final void rule__AbstractParagraph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:372:1: ( ( ruleNormalParagraph ) | ( ruleBoldParagraph ) | ( ruleItalicParagraph ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_TEXT:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
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
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:373:1: ( ruleNormalParagraph )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:373:1: ( ruleNormalParagraph )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:374:1: ruleNormalParagraph
                    {
                     before(grammarAccess.getAbstractParagraphAccess().getNormalParagraphParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNormalParagraph_in_rule__AbstractParagraph__Alternatives736);
                    ruleNormalParagraph();

                    state._fsp--;

                     after(grammarAccess.getAbstractParagraphAccess().getNormalParagraphParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:379:6: ( ruleBoldParagraph )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:379:6: ( ruleBoldParagraph )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:380:1: ruleBoldParagraph
                    {
                     before(grammarAccess.getAbstractParagraphAccess().getBoldParagraphParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBoldParagraph_in_rule__AbstractParagraph__Alternatives753);
                    ruleBoldParagraph();

                    state._fsp--;

                     after(grammarAccess.getAbstractParagraphAccess().getBoldParagraphParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:385:6: ( ruleItalicParagraph )
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:385:6: ( ruleItalicParagraph )
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:386:1: ruleItalicParagraph
                    {
                     before(grammarAccess.getAbstractParagraphAccess().getItalicParagraphParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleItalicParagraph_in_rule__AbstractParagraph__Alternatives770);
                    ruleItalicParagraph();

                    state._fsp--;

                     after(grammarAccess.getAbstractParagraphAccess().getItalicParagraphParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractParagraph__Alternatives"


    // $ANTLR start "rule__WikiMLPage__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:398:1: rule__WikiMLPage__Group__0 : rule__WikiMLPage__Group__0__Impl rule__WikiMLPage__Group__1 ;
    public final void rule__WikiMLPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:402:1: ( rule__WikiMLPage__Group__0__Impl rule__WikiMLPage__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:403:2: rule__WikiMLPage__Group__0__Impl rule__WikiMLPage__Group__1
            {
            pushFollow(FOLLOW_rule__WikiMLPage__Group__0__Impl_in_rule__WikiMLPage__Group__0800);
            rule__WikiMLPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WikiMLPage__Group__1_in_rule__WikiMLPage__Group__0803);
            rule__WikiMLPage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__Group__0"


    // $ANTLR start "rule__WikiMLPage__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:410:1: rule__WikiMLPage__Group__0__Impl : ( ( rule__WikiMLPage__TitleAssignment_0 ) ) ;
    public final void rule__WikiMLPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:414:1: ( ( ( rule__WikiMLPage__TitleAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:415:1: ( ( rule__WikiMLPage__TitleAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:415:1: ( ( rule__WikiMLPage__TitleAssignment_0 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:416:1: ( rule__WikiMLPage__TitleAssignment_0 )
            {
             before(grammarAccess.getWikiMLPageAccess().getTitleAssignment_0()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:417:1: ( rule__WikiMLPage__TitleAssignment_0 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:417:2: rule__WikiMLPage__TitleAssignment_0
            {
            pushFollow(FOLLOW_rule__WikiMLPage__TitleAssignment_0_in_rule__WikiMLPage__Group__0__Impl830);
            rule__WikiMLPage__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWikiMLPageAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__Group__0__Impl"


    // $ANTLR start "rule__WikiMLPage__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:427:1: rule__WikiMLPage__Group__1 : rule__WikiMLPage__Group__1__Impl ;
    public final void rule__WikiMLPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:431:1: ( rule__WikiMLPage__Group__1__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:432:2: rule__WikiMLPage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WikiMLPage__Group__1__Impl_in_rule__WikiMLPage__Group__1860);
            rule__WikiMLPage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__Group__1"


    // $ANTLR start "rule__WikiMLPage__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:438:1: rule__WikiMLPage__Group__1__Impl : ( ( rule__WikiMLPage__SectionAssignment_1 )* ) ;
    public final void rule__WikiMLPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:442:1: ( ( ( rule__WikiMLPage__SectionAssignment_1 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:443:1: ( ( rule__WikiMLPage__SectionAssignment_1 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:443:1: ( ( rule__WikiMLPage__SectionAssignment_1 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:444:1: ( rule__WikiMLPage__SectionAssignment_1 )*
            {
             before(grammarAccess.getWikiMLPageAccess().getSectionAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:445:1: ( rule__WikiMLPage__SectionAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==16||LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:445:2: rule__WikiMLPage__SectionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__WikiMLPage__SectionAssignment_1_in_rule__WikiMLPage__Group__1__Impl887);
            	    rule__WikiMLPage__SectionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getWikiMLPageAccess().getSectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__Group__1__Impl"


    // $ANTLR start "rule__PageTitle__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:459:1: rule__PageTitle__Group__0 : rule__PageTitle__Group__0__Impl rule__PageTitle__Group__1 ;
    public final void rule__PageTitle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:463:1: ( rule__PageTitle__Group__0__Impl rule__PageTitle__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:464:2: rule__PageTitle__Group__0__Impl rule__PageTitle__Group__1
            {
            pushFollow(FOLLOW_rule__PageTitle__Group__0__Impl_in_rule__PageTitle__Group__0922);
            rule__PageTitle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PageTitle__Group__1_in_rule__PageTitle__Group__0925);
            rule__PageTitle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__0"


    // $ANTLR start "rule__PageTitle__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:471:1: rule__PageTitle__Group__0__Impl : ( '=' ) ;
    public final void rule__PageTitle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:475:1: ( ( '=' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:476:1: ( '=' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:476:1: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:477:1: '='
            {
             before(grammarAccess.getPageTitleAccess().getEqualsSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__PageTitle__Group__0__Impl953); 
             after(grammarAccess.getPageTitleAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__0__Impl"


    // $ANTLR start "rule__PageTitle__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:490:1: rule__PageTitle__Group__1 : rule__PageTitle__Group__1__Impl rule__PageTitle__Group__2 ;
    public final void rule__PageTitle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:494:1: ( rule__PageTitle__Group__1__Impl rule__PageTitle__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:495:2: rule__PageTitle__Group__1__Impl rule__PageTitle__Group__2
            {
            pushFollow(FOLLOW_rule__PageTitle__Group__1__Impl_in_rule__PageTitle__Group__1984);
            rule__PageTitle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PageTitle__Group__2_in_rule__PageTitle__Group__1987);
            rule__PageTitle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__1"


    // $ANTLR start "rule__PageTitle__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:502:1: rule__PageTitle__Group__1__Impl : ( ( rule__PageTitle__NameAssignment_1 ) ) ;
    public final void rule__PageTitle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:506:1: ( ( ( rule__PageTitle__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:507:1: ( ( rule__PageTitle__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:507:1: ( ( rule__PageTitle__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:508:1: ( rule__PageTitle__NameAssignment_1 )
            {
             before(grammarAccess.getPageTitleAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:509:1: ( rule__PageTitle__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:509:2: rule__PageTitle__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PageTitle__NameAssignment_1_in_rule__PageTitle__Group__1__Impl1014);
            rule__PageTitle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageTitleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__1__Impl"


    // $ANTLR start "rule__PageTitle__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:519:1: rule__PageTitle__Group__2 : rule__PageTitle__Group__2__Impl rule__PageTitle__Group__3 ;
    public final void rule__PageTitle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:523:1: ( rule__PageTitle__Group__2__Impl rule__PageTitle__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:524:2: rule__PageTitle__Group__2__Impl rule__PageTitle__Group__3
            {
            pushFollow(FOLLOW_rule__PageTitle__Group__2__Impl_in_rule__PageTitle__Group__21044);
            rule__PageTitle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PageTitle__Group__3_in_rule__PageTitle__Group__21047);
            rule__PageTitle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__2"


    // $ANTLR start "rule__PageTitle__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:531:1: rule__PageTitle__Group__2__Impl : ( '=\\n' ) ;
    public final void rule__PageTitle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:535:1: ( ( '=\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:536:1: ( '=\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:536:1: ( '=\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:537:1: '=\\n'
            {
             before(grammarAccess.getPageTitleAccess().getEqualsSignControl000aKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__PageTitle__Group__2__Impl1075); 
             after(grammarAccess.getPageTitleAccess().getEqualsSignControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__2__Impl"


    // $ANTLR start "rule__PageTitle__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:550:1: rule__PageTitle__Group__3 : rule__PageTitle__Group__3__Impl ;
    public final void rule__PageTitle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:554:1: ( rule__PageTitle__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:555:2: rule__PageTitle__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PageTitle__Group__3__Impl_in_rule__PageTitle__Group__31106);
            rule__PageTitle__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__3"


    // $ANTLR start "rule__PageTitle__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:561:1: rule__PageTitle__Group__3__Impl : ( ( rule__PageTitle__ContentAssignment_3 )* ) ;
    public final void rule__PageTitle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:565:1: ( ( ( rule__PageTitle__ContentAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:566:1: ( ( rule__PageTitle__ContentAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:566:1: ( ( rule__PageTitle__ContentAssignment_3 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:567:1: ( rule__PageTitle__ContentAssignment_3 )*
            {
             before(grammarAccess.getPageTitleAccess().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:568:1: ( rule__PageTitle__ContentAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TEXT||(LA4_0>=20 && LA4_0<=21)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:568:2: rule__PageTitle__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PageTitle__ContentAssignment_3_in_rule__PageTitle__Group__3__Impl1133);
            	    rule__PageTitle__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPageTitleAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__Group__3__Impl"


    // $ANTLR start "rule__SubSection__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:586:1: rule__SubSection__Group__0 : rule__SubSection__Group__0__Impl rule__SubSection__Group__1 ;
    public final void rule__SubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:590:1: ( rule__SubSection__Group__0__Impl rule__SubSection__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:591:2: rule__SubSection__Group__0__Impl rule__SubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__01172);
            rule__SubSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__01175);
            rule__SubSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__0"


    // $ANTLR start "rule__SubSection__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:598:1: rule__SubSection__Group__0__Impl : ( '==' ) ;
    public final void rule__SubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:602:1: ( ( '==' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:603:1: ( '==' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:603:1: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:604:1: '=='
            {
             before(grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SubSection__Group__0__Impl1203); 
             after(grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__0__Impl"


    // $ANTLR start "rule__SubSection__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:617:1: rule__SubSection__Group__1 : rule__SubSection__Group__1__Impl rule__SubSection__Group__2 ;
    public final void rule__SubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:621:1: ( rule__SubSection__Group__1__Impl rule__SubSection__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:622:2: rule__SubSection__Group__1__Impl rule__SubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__11234);
            rule__SubSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__11237);
            rule__SubSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__1"


    // $ANTLR start "rule__SubSection__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:629:1: rule__SubSection__Group__1__Impl : ( ( rule__SubSection__NameAssignment_1 ) ) ;
    public final void rule__SubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:633:1: ( ( ( rule__SubSection__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__SubSection__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:634:1: ( ( rule__SubSection__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:635:1: ( rule__SubSection__NameAssignment_1 )
            {
             before(grammarAccess.getSubSectionAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:1: ( rule__SubSection__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:636:2: rule__SubSection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSection__NameAssignment_1_in_rule__SubSection__Group__1__Impl1264);
            rule__SubSection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__1__Impl"


    // $ANTLR start "rule__SubSection__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:646:1: rule__SubSection__Group__2 : rule__SubSection__Group__2__Impl rule__SubSection__Group__3 ;
    public final void rule__SubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:650:1: ( rule__SubSection__Group__2__Impl rule__SubSection__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:651:2: rule__SubSection__Group__2__Impl rule__SubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__21294);
            rule__SubSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__21297);
            rule__SubSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__2"


    // $ANTLR start "rule__SubSection__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:658:1: rule__SubSection__Group__2__Impl : ( '==\\n' ) ;
    public final void rule__SubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:662:1: ( ( '==\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:663:1: ( '==\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:663:1: ( '==\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:664:1: '==\\n'
            {
             before(grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignControl000aKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__SubSection__Group__2__Impl1325); 
             after(grammarAccess.getSubSectionAccess().getEqualsSignEqualsSignControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__2__Impl"


    // $ANTLR start "rule__SubSection__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:677:1: rule__SubSection__Group__3 : rule__SubSection__Group__3__Impl ;
    public final void rule__SubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:681:1: ( rule__SubSection__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:682:2: rule__SubSection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__31356);
            rule__SubSection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__3"


    // $ANTLR start "rule__SubSection__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:688:1: rule__SubSection__Group__3__Impl : ( ( rule__SubSection__ContentAssignment_3 )* ) ;
    public final void rule__SubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:692:1: ( ( ( rule__SubSection__ContentAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:693:1: ( ( rule__SubSection__ContentAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:693:1: ( ( rule__SubSection__ContentAssignment_3 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:694:1: ( rule__SubSection__ContentAssignment_3 )*
            {
             before(grammarAccess.getSubSectionAccess().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:695:1: ( rule__SubSection__ContentAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TEXT||(LA5_0>=20 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:695:2: rule__SubSection__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SubSection__ContentAssignment_3_in_rule__SubSection__Group__3__Impl1383);
            	    rule__SubSection__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSubSectionAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__Group__3__Impl"


    // $ANTLR start "rule__SubSubSection__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:713:1: rule__SubSubSection__Group__0 : rule__SubSubSection__Group__0__Impl rule__SubSubSection__Group__1 ;
    public final void rule__SubSubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:717:1: ( rule__SubSubSection__Group__0__Impl rule__SubSubSection__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:718:2: rule__SubSubSection__Group__0__Impl rule__SubSubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSubSection__Group__0__Impl_in_rule__SubSubSection__Group__01422);
            rule__SubSubSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSection__Group__1_in_rule__SubSubSection__Group__01425);
            rule__SubSubSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__0"


    // $ANTLR start "rule__SubSubSection__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:725:1: rule__SubSubSection__Group__0__Impl : ( '===' ) ;
    public final void rule__SubSubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:729:1: ( ( '===' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:730:1: ( '===' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:730:1: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:731:1: '==='
            {
             before(grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__SubSubSection__Group__0__Impl1453); 
             after(grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__0__Impl"


    // $ANTLR start "rule__SubSubSection__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:744:1: rule__SubSubSection__Group__1 : rule__SubSubSection__Group__1__Impl rule__SubSubSection__Group__2 ;
    public final void rule__SubSubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:748:1: ( rule__SubSubSection__Group__1__Impl rule__SubSubSection__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:749:2: rule__SubSubSection__Group__1__Impl rule__SubSubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSubSection__Group__1__Impl_in_rule__SubSubSection__Group__11484);
            rule__SubSubSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSection__Group__2_in_rule__SubSubSection__Group__11487);
            rule__SubSubSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__1"


    // $ANTLR start "rule__SubSubSection__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:756:1: rule__SubSubSection__Group__1__Impl : ( ( rule__SubSubSection__NameAssignment_1 ) ) ;
    public final void rule__SubSubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:760:1: ( ( ( rule__SubSubSection__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:761:1: ( ( rule__SubSubSection__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:761:1: ( ( rule__SubSubSection__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:762:1: ( rule__SubSubSection__NameAssignment_1 )
            {
             before(grammarAccess.getSubSubSectionAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:763:1: ( rule__SubSubSection__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:763:2: rule__SubSubSection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSubSection__NameAssignment_1_in_rule__SubSubSection__Group__1__Impl1514);
            rule__SubSubSection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSubSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__1__Impl"


    // $ANTLR start "rule__SubSubSection__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:773:1: rule__SubSubSection__Group__2 : rule__SubSubSection__Group__2__Impl rule__SubSubSection__Group__3 ;
    public final void rule__SubSubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:777:1: ( rule__SubSubSection__Group__2__Impl rule__SubSubSection__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:778:2: rule__SubSubSection__Group__2__Impl rule__SubSubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSubSection__Group__2__Impl_in_rule__SubSubSection__Group__21544);
            rule__SubSubSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSection__Group__3_in_rule__SubSubSection__Group__21547);
            rule__SubSubSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__2"


    // $ANTLR start "rule__SubSubSection__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:785:1: rule__SubSubSection__Group__2__Impl : ( '===\\n' ) ;
    public final void rule__SubSubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:789:1: ( ( '===\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:790:1: ( '===\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:790:1: ( '===\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:791:1: '===\\n'
            {
             before(grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignControl000aKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__SubSubSection__Group__2__Impl1575); 
             after(grammarAccess.getSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__2__Impl"


    // $ANTLR start "rule__SubSubSection__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:804:1: rule__SubSubSection__Group__3 : rule__SubSubSection__Group__3__Impl ;
    public final void rule__SubSubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:808:1: ( rule__SubSubSection__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:809:2: rule__SubSubSection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubSubSection__Group__3__Impl_in_rule__SubSubSection__Group__31606);
            rule__SubSubSection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__3"


    // $ANTLR start "rule__SubSubSection__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:815:1: rule__SubSubSection__Group__3__Impl : ( ( rule__SubSubSection__ContentAssignment_3 )* ) ;
    public final void rule__SubSubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:819:1: ( ( ( rule__SubSubSection__ContentAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:820:1: ( ( rule__SubSubSection__ContentAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:820:1: ( ( rule__SubSubSection__ContentAssignment_3 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:821:1: ( rule__SubSubSection__ContentAssignment_3 )*
            {
             before(grammarAccess.getSubSubSectionAccess().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:822:1: ( rule__SubSubSection__ContentAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TEXT||(LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:822:2: rule__SubSubSection__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SubSubSection__ContentAssignment_3_in_rule__SubSubSection__Group__3__Impl1633);
            	    rule__SubSubSection__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSubSubSectionAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__Group__3__Impl"


    // $ANTLR start "rule__SubSubSubSection__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:840:1: rule__SubSubSubSection__Group__0 : rule__SubSubSubSection__Group__0__Impl rule__SubSubSubSection__Group__1 ;
    public final void rule__SubSubSubSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:844:1: ( rule__SubSubSubSection__Group__0__Impl rule__SubSubSubSection__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:845:2: rule__SubSubSubSection__Group__0__Impl rule__SubSubSubSection__Group__1
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__Group__0__Impl_in_rule__SubSubSubSection__Group__01672);
            rule__SubSubSubSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSubSection__Group__1_in_rule__SubSubSubSection__Group__01675);
            rule__SubSubSubSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__0"


    // $ANTLR start "rule__SubSubSubSection__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:852:1: rule__SubSubSubSection__Group__0__Impl : ( '====' ) ;
    public final void rule__SubSubSubSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:856:1: ( ( '====' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:857:1: ( '====' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:857:1: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:858:1: '===='
            {
             before(grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SubSubSubSection__Group__0__Impl1703); 
             after(grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__0__Impl"


    // $ANTLR start "rule__SubSubSubSection__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:871:1: rule__SubSubSubSection__Group__1 : rule__SubSubSubSection__Group__1__Impl rule__SubSubSubSection__Group__2 ;
    public final void rule__SubSubSubSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:875:1: ( rule__SubSubSubSection__Group__1__Impl rule__SubSubSubSection__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:876:2: rule__SubSubSubSection__Group__1__Impl rule__SubSubSubSection__Group__2
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__Group__1__Impl_in_rule__SubSubSubSection__Group__11734);
            rule__SubSubSubSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSubSection__Group__2_in_rule__SubSubSubSection__Group__11737);
            rule__SubSubSubSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__1"


    // $ANTLR start "rule__SubSubSubSection__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:883:1: rule__SubSubSubSection__Group__1__Impl : ( ( rule__SubSubSubSection__NameAssignment_1 ) ) ;
    public final void rule__SubSubSubSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:887:1: ( ( ( rule__SubSubSubSection__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:888:1: ( ( rule__SubSubSubSection__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:888:1: ( ( rule__SubSubSubSection__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:889:1: ( rule__SubSubSubSection__NameAssignment_1 )
            {
             before(grammarAccess.getSubSubSubSectionAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:890:1: ( rule__SubSubSubSection__NameAssignment_1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:890:2: rule__SubSubSubSection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__NameAssignment_1_in_rule__SubSubSubSection__Group__1__Impl1764);
            rule__SubSubSubSection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSubSubSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__1__Impl"


    // $ANTLR start "rule__SubSubSubSection__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:900:1: rule__SubSubSubSection__Group__2 : rule__SubSubSubSection__Group__2__Impl rule__SubSubSubSection__Group__3 ;
    public final void rule__SubSubSubSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:904:1: ( rule__SubSubSubSection__Group__2__Impl rule__SubSubSubSection__Group__3 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:905:2: rule__SubSubSubSection__Group__2__Impl rule__SubSubSubSection__Group__3
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__Group__2__Impl_in_rule__SubSubSubSection__Group__21794);
            rule__SubSubSubSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSubSubSection__Group__3_in_rule__SubSubSubSection__Group__21797);
            rule__SubSubSubSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__2"


    // $ANTLR start "rule__SubSubSubSection__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:912:1: rule__SubSubSubSection__Group__2__Impl : ( '====\\n' ) ;
    public final void rule__SubSubSubSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:916:1: ( ( '====\\n' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:917:1: ( '====\\n' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:917:1: ( '====\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:918:1: '====\\n'
            {
             before(grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignControl000aKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__SubSubSubSection__Group__2__Impl1825); 
             after(grammarAccess.getSubSubSubSectionAccess().getEqualsSignEqualsSignEqualsSignEqualsSignControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__2__Impl"


    // $ANTLR start "rule__SubSubSubSection__Group__3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:931:1: rule__SubSubSubSection__Group__3 : rule__SubSubSubSection__Group__3__Impl ;
    public final void rule__SubSubSubSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:935:1: ( rule__SubSubSubSection__Group__3__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:936:2: rule__SubSubSubSection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SubSubSubSection__Group__3__Impl_in_rule__SubSubSubSection__Group__31856);
            rule__SubSubSubSection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__3"


    // $ANTLR start "rule__SubSubSubSection__Group__3__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:942:1: rule__SubSubSubSection__Group__3__Impl : ( ( rule__SubSubSubSection__ContentAssignment_3 )* ) ;
    public final void rule__SubSubSubSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:946:1: ( ( ( rule__SubSubSubSection__ContentAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:1: ( ( rule__SubSubSubSection__ContentAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:947:1: ( ( rule__SubSubSubSection__ContentAssignment_3 )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:948:1: ( rule__SubSubSubSection__ContentAssignment_3 )*
            {
             before(grammarAccess.getSubSubSubSectionAccess().getContentAssignment_3()); 
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:949:1: ( rule__SubSubSubSection__ContentAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TEXT||(LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:949:2: rule__SubSubSubSection__ContentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SubSubSubSection__ContentAssignment_3_in_rule__SubSubSubSection__Group__3__Impl1883);
            	    rule__SubSubSubSection__ContentAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubSubSubSectionAccess().getContentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__Group__3__Impl"


    // $ANTLR start "rule__BoldParagraph__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:967:1: rule__BoldParagraph__Group__0 : rule__BoldParagraph__Group__0__Impl rule__BoldParagraph__Group__1 ;
    public final void rule__BoldParagraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:971:1: ( rule__BoldParagraph__Group__0__Impl rule__BoldParagraph__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:972:2: rule__BoldParagraph__Group__0__Impl rule__BoldParagraph__Group__1
            {
            pushFollow(FOLLOW_rule__BoldParagraph__Group__0__Impl_in_rule__BoldParagraph__Group__01922);
            rule__BoldParagraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldParagraph__Group__1_in_rule__BoldParagraph__Group__01925);
            rule__BoldParagraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__0"


    // $ANTLR start "rule__BoldParagraph__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:979:1: rule__BoldParagraph__Group__0__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldParagraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:983:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:984:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:984:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:985:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__BoldParagraph__Group__0__Impl1953); 
             after(grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__0__Impl"


    // $ANTLR start "rule__BoldParagraph__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:998:1: rule__BoldParagraph__Group__1 : rule__BoldParagraph__Group__1__Impl rule__BoldParagraph__Group__2 ;
    public final void rule__BoldParagraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1002:1: ( rule__BoldParagraph__Group__1__Impl rule__BoldParagraph__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1003:2: rule__BoldParagraph__Group__1__Impl rule__BoldParagraph__Group__2
            {
            pushFollow(FOLLOW_rule__BoldParagraph__Group__1__Impl_in_rule__BoldParagraph__Group__11984);
            rule__BoldParagraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BoldParagraph__Group__2_in_rule__BoldParagraph__Group__11987);
            rule__BoldParagraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__1"


    // $ANTLR start "rule__BoldParagraph__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1010:1: rule__BoldParagraph__Group__1__Impl : ( ruleNormalParagraph ) ;
    public final void rule__BoldParagraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1014:1: ( ( ruleNormalParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1015:1: ( ruleNormalParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1015:1: ( ruleNormalParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1016:1: ruleNormalParagraph
            {
             before(grammarAccess.getBoldParagraphAccess().getNormalParagraphParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNormalParagraph_in_rule__BoldParagraph__Group__1__Impl2014);
            ruleNormalParagraph();

            state._fsp--;

             after(grammarAccess.getBoldParagraphAccess().getNormalParagraphParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__1__Impl"


    // $ANTLR start "rule__BoldParagraph__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1027:1: rule__BoldParagraph__Group__2 : rule__BoldParagraph__Group__2__Impl ;
    public final void rule__BoldParagraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1031:1: ( rule__BoldParagraph__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1032:2: rule__BoldParagraph__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BoldParagraph__Group__2__Impl_in_rule__BoldParagraph__Group__22043);
            rule__BoldParagraph__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__2"


    // $ANTLR start "rule__BoldParagraph__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1038:1: rule__BoldParagraph__Group__2__Impl : ( '\\'\\'\\'' ) ;
    public final void rule__BoldParagraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1042:1: ( ( '\\'\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:1: ( '\\'\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1043:1: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1044:1: '\\'\\'\\''
            {
             before(grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__BoldParagraph__Group__2__Impl2071); 
             after(grammarAccess.getBoldParagraphAccess().getApostropheApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoldParagraph__Group__2__Impl"


    // $ANTLR start "rule__ItalicParagraph__Group__0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1063:1: rule__ItalicParagraph__Group__0 : rule__ItalicParagraph__Group__0__Impl rule__ItalicParagraph__Group__1 ;
    public final void rule__ItalicParagraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1067:1: ( rule__ItalicParagraph__Group__0__Impl rule__ItalicParagraph__Group__1 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1068:2: rule__ItalicParagraph__Group__0__Impl rule__ItalicParagraph__Group__1
            {
            pushFollow(FOLLOW_rule__ItalicParagraph__Group__0__Impl_in_rule__ItalicParagraph__Group__02108);
            rule__ItalicParagraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicParagraph__Group__1_in_rule__ItalicParagraph__Group__02111);
            rule__ItalicParagraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__0"


    // $ANTLR start "rule__ItalicParagraph__Group__0__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1075:1: rule__ItalicParagraph__Group__0__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicParagraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1079:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1080:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1080:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1081:1: '\\'\\''
            {
             before(grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ItalicParagraph__Group__0__Impl2139); 
             after(grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__0__Impl"


    // $ANTLR start "rule__ItalicParagraph__Group__1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1094:1: rule__ItalicParagraph__Group__1 : rule__ItalicParagraph__Group__1__Impl rule__ItalicParagraph__Group__2 ;
    public final void rule__ItalicParagraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1098:1: ( rule__ItalicParagraph__Group__1__Impl rule__ItalicParagraph__Group__2 )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1099:2: rule__ItalicParagraph__Group__1__Impl rule__ItalicParagraph__Group__2
            {
            pushFollow(FOLLOW_rule__ItalicParagraph__Group__1__Impl_in_rule__ItalicParagraph__Group__12170);
            rule__ItalicParagraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItalicParagraph__Group__2_in_rule__ItalicParagraph__Group__12173);
            rule__ItalicParagraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__1"


    // $ANTLR start "rule__ItalicParagraph__Group__1__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1106:1: rule__ItalicParagraph__Group__1__Impl : ( ruleNormalParagraph ) ;
    public final void rule__ItalicParagraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1110:1: ( ( ruleNormalParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1111:1: ( ruleNormalParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1111:1: ( ruleNormalParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1112:1: ruleNormalParagraph
            {
             before(grammarAccess.getItalicParagraphAccess().getNormalParagraphParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNormalParagraph_in_rule__ItalicParagraph__Group__1__Impl2200);
            ruleNormalParagraph();

            state._fsp--;

             after(grammarAccess.getItalicParagraphAccess().getNormalParagraphParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__1__Impl"


    // $ANTLR start "rule__ItalicParagraph__Group__2"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1123:1: rule__ItalicParagraph__Group__2 : rule__ItalicParagraph__Group__2__Impl ;
    public final void rule__ItalicParagraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1127:1: ( rule__ItalicParagraph__Group__2__Impl )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1128:2: rule__ItalicParagraph__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItalicParagraph__Group__2__Impl_in_rule__ItalicParagraph__Group__22229);
            rule__ItalicParagraph__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__2"


    // $ANTLR start "rule__ItalicParagraph__Group__2__Impl"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1134:1: rule__ItalicParagraph__Group__2__Impl : ( '\\'\\'' ) ;
    public final void rule__ItalicParagraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1138:1: ( ( '\\'\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1139:1: ( '\\'\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1139:1: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1140:1: '\\'\\''
            {
             before(grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__ItalicParagraph__Group__2__Impl2257); 
             after(grammarAccess.getItalicParagraphAccess().getApostropheApostropheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItalicParagraph__Group__2__Impl"


    // $ANTLR start "rule__WikiMLPage__TitleAssignment_0"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1160:1: rule__WikiMLPage__TitleAssignment_0 : ( rulePageTitle ) ;
    public final void rule__WikiMLPage__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1164:1: ( ( rulePageTitle ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1165:1: ( rulePageTitle )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1165:1: ( rulePageTitle )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1166:1: rulePageTitle
            {
             before(grammarAccess.getWikiMLPageAccess().getTitlePageTitleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePageTitle_in_rule__WikiMLPage__TitleAssignment_02299);
            rulePageTitle();

            state._fsp--;

             after(grammarAccess.getWikiMLPageAccess().getTitlePageTitleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__TitleAssignment_0"


    // $ANTLR start "rule__WikiMLPage__SectionAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1175:1: rule__WikiMLPage__SectionAssignment_1 : ( ruleAbstractSection ) ;
    public final void rule__WikiMLPage__SectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1179:1: ( ( ruleAbstractSection ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1180:1: ( ruleAbstractSection )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1180:1: ( ruleAbstractSection )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1181:1: ruleAbstractSection
            {
             before(grammarAccess.getWikiMLPageAccess().getSectionAbstractSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAbstractSection_in_rule__WikiMLPage__SectionAssignment_12330);
            ruleAbstractSection();

            state._fsp--;

             after(grammarAccess.getWikiMLPageAccess().getSectionAbstractSectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WikiMLPage__SectionAssignment_1"


    // $ANTLR start "rule__PageTitle__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1190:1: rule__PageTitle__NameAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__PageTitle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1194:1: ( ( RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1195:1: ( RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1195:1: ( RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1196:1: RULE_TEXT
            {
             before(grammarAccess.getPageTitleAccess().getNameTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__PageTitle__NameAssignment_12361); 
             after(grammarAccess.getPageTitleAccess().getNameTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__NameAssignment_1"


    // $ANTLR start "rule__PageTitle__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1205:1: rule__PageTitle__ContentAssignment_3 : ( ruleAbstractParagraph ) ;
    public final void rule__PageTitle__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1209:1: ( ( ruleAbstractParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1210:1: ( ruleAbstractParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1210:1: ( ruleAbstractParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1211:1: ruleAbstractParagraph
            {
             before(grammarAccess.getPageTitleAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_rule__PageTitle__ContentAssignment_32392);
            ruleAbstractParagraph();

            state._fsp--;

             after(grammarAccess.getPageTitleAccess().getContentAbstractParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageTitle__ContentAssignment_3"


    // $ANTLR start "rule__SubSection__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1220:1: rule__SubSection__NameAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__SubSection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1224:1: ( ( RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1225:1: ( RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1225:1: ( RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1226:1: RULE_TEXT
            {
             before(grammarAccess.getSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__SubSection__NameAssignment_12423); 
             after(grammarAccess.getSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__NameAssignment_1"


    // $ANTLR start "rule__SubSection__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1235:1: rule__SubSection__ContentAssignment_3 : ( ruleAbstractParagraph ) ;
    public final void rule__SubSection__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1239:1: ( ( ruleAbstractParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1240:1: ( ruleAbstractParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1240:1: ( ruleAbstractParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1241:1: ruleAbstractParagraph
            {
             before(grammarAccess.getSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_rule__SubSection__ContentAssignment_32454);
            ruleAbstractParagraph();

            state._fsp--;

             after(grammarAccess.getSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSection__ContentAssignment_3"


    // $ANTLR start "rule__SubSubSection__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1250:1: rule__SubSubSection__NameAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__SubSubSection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1254:1: ( ( RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1255:1: ( RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1255:1: ( RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1256:1: RULE_TEXT
            {
             before(grammarAccess.getSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__SubSubSection__NameAssignment_12485); 
             after(grammarAccess.getSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__NameAssignment_1"


    // $ANTLR start "rule__SubSubSection__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1265:1: rule__SubSubSection__ContentAssignment_3 : ( ruleAbstractParagraph ) ;
    public final void rule__SubSubSection__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1269:1: ( ( ruleAbstractParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1270:1: ( ruleAbstractParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1270:1: ( ruleAbstractParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1271:1: ruleAbstractParagraph
            {
             before(grammarAccess.getSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_rule__SubSubSection__ContentAssignment_32516);
            ruleAbstractParagraph();

            state._fsp--;

             after(grammarAccess.getSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSection__ContentAssignment_3"


    // $ANTLR start "rule__SubSubSubSection__NameAssignment_1"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1280:1: rule__SubSubSubSection__NameAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__SubSubSubSection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1284:1: ( ( RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1285:1: ( RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1285:1: ( RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1286:1: RULE_TEXT
            {
             before(grammarAccess.getSubSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__SubSubSubSection__NameAssignment_12547); 
             after(grammarAccess.getSubSubSubSectionAccess().getNameTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__NameAssignment_1"


    // $ANTLR start "rule__SubSubSubSection__ContentAssignment_3"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1295:1: rule__SubSubSubSection__ContentAssignment_3 : ( ruleAbstractParagraph ) ;
    public final void rule__SubSubSubSection__ContentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1299:1: ( ( ruleAbstractParagraph ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1300:1: ( ruleAbstractParagraph )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1300:1: ( ruleAbstractParagraph )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1301:1: ruleAbstractParagraph
            {
             before(grammarAccess.getSubSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAbstractParagraph_in_rule__SubSubSubSection__ContentAssignment_32578);
            ruleAbstractParagraph();

            state._fsp--;

             after(grammarAccess.getSubSubSubSectionAccess().getContentAbstractParagraphParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSubSubSection__ContentAssignment_3"


    // $ANTLR start "rule__NormalParagraph__NameAssignment"
    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1310:1: rule__NormalParagraph__NameAssignment : ( RULE_TEXT ) ;
    public final void rule__NormalParagraph__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1314:1: ( ( RULE_TEXT ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1315:1: ( RULE_TEXT )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1315:1: ( RULE_TEXT )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1316:1: RULE_TEXT
            {
             before(grammarAccess.getNormalParagraphAccess().getNameTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__NormalParagraph__NameAssignment2609); 
             after(grammarAccess.getNormalParagraphAccess().getNameTEXTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NormalParagraph__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleWikiMLPage_in_entryRuleWikiMLPage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWikiMLPage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiMLPage__Group__0_in_ruleWikiMLPage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageTitle_in_entryRulePageTitle121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageTitle128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__0_in_rulePageTitle154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_entryRuleAbstractSection181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSection188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractSection__Alternatives_in_ruleAbstractSection214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_entryRuleSubSection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0_in_ruleSubSection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSection_in_entryRuleSubSubSection301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSubSection308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__0_in_ruleSubSubSection334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSubSection_in_entryRuleSubSubSubSection361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSubSubSection368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__0_in_ruleSubSubSubSection394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_entryRuleAbstractParagraph421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractParagraph428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractParagraph__Alternatives_in_ruleAbstractParagraph454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_entryRuleNormalParagraph481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalParagraph488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NormalParagraph__NameAssignment_in_ruleNormalParagraph514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldParagraph_in_entryRuleBoldParagraph541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoldParagraph548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__0_in_ruleBoldParagraph574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicParagraph_in_entryRuleItalicParagraph601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalicParagraph608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__0_in_ruleItalicParagraph634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSection_in_rule__AbstractSection__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSection_in_rule__AbstractSection__Alternatives687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSubSubSection_in_rule__AbstractSection__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_rule__AbstractParagraph__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoldParagraph_in_rule__AbstractParagraph__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalicParagraph_in_rule__AbstractParagraph__Alternatives770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiMLPage__Group__0__Impl_in_rule__WikiMLPage__Group__0800 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_rule__WikiMLPage__Group__1_in_rule__WikiMLPage__Group__0803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiMLPage__TitleAssignment_0_in_rule__WikiMLPage__Group__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiMLPage__Group__1__Impl_in_rule__WikiMLPage__Group__1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WikiMLPage__SectionAssignment_1_in_rule__WikiMLPage__Group__1__Impl887 = new BitSet(new long[]{0x0000000000054002L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__0__Impl_in_rule__PageTitle__Group__0922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__1_in_rule__PageTitle__Group__0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PageTitle__Group__0__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__1__Impl_in_rule__PageTitle__Group__1984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__2_in_rule__PageTitle__Group__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__NameAssignment_1_in_rule__PageTitle__Group__1__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__2__Impl_in_rule__PageTitle__Group__21044 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__3_in_rule__PageTitle__Group__21047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PageTitle__Group__2__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__Group__3__Impl_in_rule__PageTitle__Group__31106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PageTitle__ContentAssignment_3_in_rule__PageTitle__Group__3__Impl1133 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rule__SubSection__Group__0__Impl_in_rule__SubSection__Group__01172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1_in_rule__SubSection__Group__01175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubSection__Group__0__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__1__Impl_in_rule__SubSection__Group__11234 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2_in_rule__SubSection__Group__11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__NameAssignment_1_in_rule__SubSection__Group__1__Impl1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__2__Impl_in_rule__SubSection__Group__21294 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3_in_rule__SubSection__Group__21297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubSection__Group__2__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__Group__3__Impl_in_rule__SubSection__Group__31356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSection__ContentAssignment_3_in_rule__SubSection__Group__3__Impl1383 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__0__Impl_in_rule__SubSubSection__Group__01422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__1_in_rule__SubSubSection__Group__01425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubSubSection__Group__0__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__1__Impl_in_rule__SubSubSection__Group__11484 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__2_in_rule__SubSubSection__Group__11487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__NameAssignment_1_in_rule__SubSubSection__Group__1__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__2__Impl_in_rule__SubSubSection__Group__21544 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__3_in_rule__SubSubSection__Group__21547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubSubSection__Group__2__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__Group__3__Impl_in_rule__SubSubSection__Group__31606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSection__ContentAssignment_3_in_rule__SubSubSection__Group__3__Impl1633 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__0__Impl_in_rule__SubSubSubSection__Group__01672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__1_in_rule__SubSubSubSection__Group__01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SubSubSubSection__Group__0__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__1__Impl_in_rule__SubSubSubSection__Group__11734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__2_in_rule__SubSubSubSection__Group__11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__NameAssignment_1_in_rule__SubSubSubSection__Group__1__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__2__Impl_in_rule__SubSubSubSection__Group__21794 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__3_in_rule__SubSubSubSection__Group__21797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SubSubSubSection__Group__2__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__Group__3__Impl_in_rule__SubSubSubSection__Group__31856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSubSubSection__ContentAssignment_3_in_rule__SubSubSubSection__Group__3__Impl1883 = new BitSet(new long[]{0x0000000000300012L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__0__Impl_in_rule__BoldParagraph__Group__01922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__1_in_rule__BoldParagraph__Group__01925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BoldParagraph__Group__0__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__1__Impl_in_rule__BoldParagraph__Group__11984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__2_in_rule__BoldParagraph__Group__11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_rule__BoldParagraph__Group__1__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoldParagraph__Group__2__Impl_in_rule__BoldParagraph__Group__22043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BoldParagraph__Group__2__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__0__Impl_in_rule__ItalicParagraph__Group__02108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__1_in_rule__ItalicParagraph__Group__02111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ItalicParagraph__Group__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__1__Impl_in_rule__ItalicParagraph__Group__12170 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__2_in_rule__ItalicParagraph__Group__12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalParagraph_in_rule__ItalicParagraph__Group__1__Impl2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItalicParagraph__Group__2__Impl_in_rule__ItalicParagraph__Group__22229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ItalicParagraph__Group__2__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageTitle_in_rule__WikiMLPage__TitleAssignment_02299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSection_in_rule__WikiMLPage__SectionAssignment_12330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__PageTitle__NameAssignment_12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_rule__PageTitle__ContentAssignment_32392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__SubSection__NameAssignment_12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_rule__SubSection__ContentAssignment_32454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__SubSubSection__NameAssignment_12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_rule__SubSubSection__ContentAssignment_32516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__SubSubSubSection__NameAssignment_12547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractParagraph_in_rule__SubSubSubSection__ContentAssignment_32578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__NormalParagraph__NameAssignment2609 = new BitSet(new long[]{0x0000000000000002L});

}