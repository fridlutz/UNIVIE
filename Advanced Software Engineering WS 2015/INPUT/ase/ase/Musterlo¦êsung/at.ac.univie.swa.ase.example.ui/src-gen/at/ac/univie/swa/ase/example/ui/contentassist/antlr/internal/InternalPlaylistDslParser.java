package at.ac.univie.swa.ase.example.ui.contentassist.antlr.internal; 

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
import at.ac.univie.swa.ase.example.services.PlaylistDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlaylistDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_SECONDS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'POP'", "'ROCK'", "'HARDROCK'", "'CLASSIC'", "'FOLK'", "'OTHER'", "'Distributors:'", "'Library:'", "'Playlists:'", "'consists of'", "','", "'Library '", "':'", "'list'", "'without'", "'('", "')'", "'Song'", "'sung by'", "'produced by'", "'length:'", "'genre:'", "'price:'", "'Distributor'", "'Address:'", "'Account Information:'", "'IBAN:'", "'BIC:'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_SECONDS=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPlaylistDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlaylistDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlaylistDslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g"; }


     
     	private PlaylistDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlaylistDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:61:1: ( ruleModel EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:76:1: ( rule__Model__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePlaylist"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:88:1: entryRulePlaylist : rulePlaylist EOF ;
    public final void entryRulePlaylist() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:89:1: ( rulePlaylist EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:90:1: rulePlaylist EOF
            {
             before(grammarAccess.getPlaylistRule()); 
            pushFollow(FOLLOW_rulePlaylist_in_entryRulePlaylist121);
            rulePlaylist();

            state._fsp--;

             after(grammarAccess.getPlaylistRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlaylist128); 

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
    // $ANTLR end "entryRulePlaylist"


    // $ANTLR start "rulePlaylist"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:97:1: rulePlaylist : ( ( rule__Playlist__Group__0 ) ) ;
    public final void rulePlaylist() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:101:2: ( ( ( rule__Playlist__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:102:1: ( ( rule__Playlist__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:102:1: ( ( rule__Playlist__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:103:1: ( rule__Playlist__Group__0 )
            {
             before(grammarAccess.getPlaylistAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:104:1: ( rule__Playlist__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:104:2: rule__Playlist__Group__0
            {
            pushFollow(FOLLOW_rule__Playlist__Group__0_in_rulePlaylist154);
            rule__Playlist__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlaylist"


    // $ANTLR start "entryRuleLibrary"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:118:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:119:1: ( ruleLibrary EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:120:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary183);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary190); 

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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:127:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:131:2: ( ( ( rule__Library__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:132:1: ( ( rule__Library__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:132:1: ( ( rule__Library__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:133:1: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:134:1: ( rule__Library__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:134:2: rule__Library__Group__0
            {
            pushFollow(FOLLOW_rule__Library__Group__0_in_ruleLibrary216);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleItem"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:146:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:147:1: ( ruleItem EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:148:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem243);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem250); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:155:1: ruleItem : ( ( rule__Item__Alternatives ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:159:2: ( ( ( rule__Item__Alternatives ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:160:1: ( ( rule__Item__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:160:1: ( ( rule__Item__Alternatives ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:161:1: ( rule__Item__Alternatives )
            {
             before(grammarAccess.getItemAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:162:1: ( rule__Item__Alternatives )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:162:2: rule__Item__Alternatives
            {
            pushFollow(FOLLOW_rule__Item__Alternatives_in_ruleItem276);
            rule__Item__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleSong"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:174:1: entryRuleSong : ruleSong EOF ;
    public final void entryRuleSong() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:175:1: ( ruleSong EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:176:1: ruleSong EOF
            {
             before(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong303);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getSongRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong310); 

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
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:183:1: ruleSong : ( ( rule__Song__Group__0 ) ) ;
    public final void ruleSong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:187:2: ( ( ( rule__Song__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:188:1: ( ( rule__Song__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:188:1: ( ( rule__Song__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:189:1: ( rule__Song__Group__0 )
            {
             before(grammarAccess.getSongAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:190:1: ( rule__Song__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:190:2: rule__Song__Group__0
            {
            pushFollow(FOLLOW_rule__Song__Group__0_in_ruleSong336);
            rule__Song__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleLength"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:202:1: entryRuleLength : ruleLength EOF ;
    public final void entryRuleLength() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:203:1: ( ruleLength EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:204:1: ruleLength EOF
            {
             before(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_ruleLength_in_entryRuleLength363);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getLengthRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLength370); 

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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:211:1: ruleLength : ( ( rule__Length__Group__0 ) ) ;
    public final void ruleLength() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:215:2: ( ( ( rule__Length__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:216:1: ( ( rule__Length__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:216:1: ( ( rule__Length__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:217:1: ( rule__Length__Group__0 )
            {
             before(grammarAccess.getLengthAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:218:1: ( rule__Length__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:218:2: rule__Length__Group__0
            {
            pushFollow(FOLLOW_rule__Length__Group__0_in_ruleLength396);
            rule__Length__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleDistributor"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:230:1: entryRuleDistributor : ruleDistributor EOF ;
    public final void entryRuleDistributor() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:231:1: ( ruleDistributor EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:232:1: ruleDistributor EOF
            {
             before(grammarAccess.getDistributorRule()); 
            pushFollow(FOLLOW_ruleDistributor_in_entryRuleDistributor423);
            ruleDistributor();

            state._fsp--;

             after(grammarAccess.getDistributorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributor430); 

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
    // $ANTLR end "entryRuleDistributor"


    // $ANTLR start "ruleDistributor"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:239:1: ruleDistributor : ( ( rule__Distributor__Group__0 ) ) ;
    public final void ruleDistributor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:243:2: ( ( ( rule__Distributor__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:244:1: ( ( rule__Distributor__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:244:1: ( ( rule__Distributor__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:245:1: ( rule__Distributor__Group__0 )
            {
             before(grammarAccess.getDistributorAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:246:1: ( rule__Distributor__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:246:2: rule__Distributor__Group__0
            {
            pushFollow(FOLLOW_rule__Distributor__Group__0_in_ruleDistributor456);
            rule__Distributor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistributorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistributor"


    // $ANTLR start "entryRuleFQN"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:258:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:259:1: ( ruleFQN EOF )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:260:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN483);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN490); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:267:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:271:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:272:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:272:1: ( ( rule__FQN__Group__0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:273:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:274:1: ( rule__FQN__Group__0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:274:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN516);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleGenre"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:287:1: ruleGenre : ( ( rule__Genre__Alternatives ) ) ;
    public final void ruleGenre() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:291:1: ( ( ( rule__Genre__Alternatives ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:292:1: ( ( rule__Genre__Alternatives ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:292:1: ( ( rule__Genre__Alternatives ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:293:1: ( rule__Genre__Alternatives )
            {
             before(grammarAccess.getGenreAccess().getAlternatives()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:294:1: ( rule__Genre__Alternatives )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:294:2: rule__Genre__Alternatives
            {
            pushFollow(FOLLOW_rule__Genre__Alternatives_in_ruleGenre553);
            rule__Genre__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenreAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenre"


    // $ANTLR start "rule__Item__Alternatives"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:306:1: rule__Item__Alternatives : ( ( ( rule__Item__ItemAssignment_0 ) ) | ( ( rule__Item__Group_1__0 ) ) );
    public final void rule__Item__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:310:1: ( ( ( rule__Item__ItemAssignment_0 ) ) | ( ( rule__Item__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:311:1: ( ( rule__Item__ItemAssignment_0 ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:311:1: ( ( rule__Item__ItemAssignment_0 ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:312:1: ( rule__Item__ItemAssignment_0 )
                    {
                     before(grammarAccess.getItemAccess().getItemAssignment_0()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:313:1: ( rule__Item__ItemAssignment_0 )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:313:2: rule__Item__ItemAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Item__ItemAssignment_0_in_rule__Item__Alternatives589);
                    rule__Item__ItemAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getItemAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:317:6: ( ( rule__Item__Group_1__0 ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:317:6: ( ( rule__Item__Group_1__0 ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:318:1: ( rule__Item__Group_1__0 )
                    {
                     before(grammarAccess.getItemAccess().getGroup_1()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:319:1: ( rule__Item__Group_1__0 )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:319:2: rule__Item__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1__0_in_rule__Item__Alternatives607);
                    rule__Item__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Item__Alternatives"


    // $ANTLR start "rule__Genre__Alternatives"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:328:1: rule__Genre__Alternatives : ( ( ( 'POP' ) ) | ( ( 'ROCK' ) ) | ( ( 'HARDROCK' ) ) | ( ( 'CLASSIC' ) ) | ( ( 'FOLK' ) ) | ( ( 'OTHER' ) ) );
    public final void rule__Genre__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:332:1: ( ( ( 'POP' ) ) | ( ( 'ROCK' ) ) | ( ( 'HARDROCK' ) ) | ( ( 'CLASSIC' ) ) | ( ( 'FOLK' ) ) | ( ( 'OTHER' ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:333:1: ( ( 'POP' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:333:1: ( ( 'POP' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:334:1: ( 'POP' )
                    {
                     before(grammarAccess.getGenreAccess().getPOPEnumLiteralDeclaration_0()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:335:1: ( 'POP' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:335:3: 'POP'
                    {
                    match(input,13,FOLLOW_13_in_rule__Genre__Alternatives641); 

                    }

                     after(grammarAccess.getGenreAccess().getPOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:340:6: ( ( 'ROCK' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:340:6: ( ( 'ROCK' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:341:1: ( 'ROCK' )
                    {
                     before(grammarAccess.getGenreAccess().getROCKEnumLiteralDeclaration_1()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:342:1: ( 'ROCK' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:342:3: 'ROCK'
                    {
                    match(input,14,FOLLOW_14_in_rule__Genre__Alternatives662); 

                    }

                     after(grammarAccess.getGenreAccess().getROCKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:347:6: ( ( 'HARDROCK' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:347:6: ( ( 'HARDROCK' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:348:1: ( 'HARDROCK' )
                    {
                     before(grammarAccess.getGenreAccess().getHARDROCKEnumLiteralDeclaration_2()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:349:1: ( 'HARDROCK' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:349:3: 'HARDROCK'
                    {
                    match(input,15,FOLLOW_15_in_rule__Genre__Alternatives683); 

                    }

                     after(grammarAccess.getGenreAccess().getHARDROCKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:354:6: ( ( 'CLASSIC' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:354:6: ( ( 'CLASSIC' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:355:1: ( 'CLASSIC' )
                    {
                     before(grammarAccess.getGenreAccess().getCLASSICEnumLiteralDeclaration_3()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:356:1: ( 'CLASSIC' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:356:3: 'CLASSIC'
                    {
                    match(input,16,FOLLOW_16_in_rule__Genre__Alternatives704); 

                    }

                     after(grammarAccess.getGenreAccess().getCLASSICEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:361:6: ( ( 'FOLK' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:361:6: ( ( 'FOLK' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:362:1: ( 'FOLK' )
                    {
                     before(grammarAccess.getGenreAccess().getFOLKEnumLiteralDeclaration_4()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:363:1: ( 'FOLK' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:363:3: 'FOLK'
                    {
                    match(input,17,FOLLOW_17_in_rule__Genre__Alternatives725); 

                    }

                     after(grammarAccess.getGenreAccess().getFOLKEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:368:6: ( ( 'OTHER' ) )
                    {
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:368:6: ( ( 'OTHER' ) )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:369:1: ( 'OTHER' )
                    {
                     before(grammarAccess.getGenreAccess().getOTHEREnumLiteralDeclaration_5()); 
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:370:1: ( 'OTHER' )
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:370:3: 'OTHER'
                    {
                    match(input,18,FOLLOW_18_in_rule__Genre__Alternatives746); 

                    }

                     after(grammarAccess.getGenreAccess().getOTHEREnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__Genre__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:382:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:386:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:387:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0779);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0782);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:394:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:398:1: ( ( () ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:399:1: ( () )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:399:1: ( () )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:400:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:401:1: ()
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:403:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:413:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:417:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:418:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1840);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1843);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:425:1: rule__Model__Group__1__Impl : ( 'Distributors:' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:429:1: ( ( 'Distributors:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:430:1: ( 'Distributors:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:430:1: ( 'Distributors:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:431:1: 'Distributors:'
            {
             before(grammarAccess.getModelAccess().getDistributorsKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__1__Impl871); 
             after(grammarAccess.getModelAccess().getDistributorsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:444:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:448:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:449:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2902);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2905);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:456:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__DistributorsAssignment_2 ) ) ( ( rule__Model__DistributorsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:460:1: ( ( ( ( rule__Model__DistributorsAssignment_2 ) ) ( ( rule__Model__DistributorsAssignment_2 )* ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:461:1: ( ( ( rule__Model__DistributorsAssignment_2 ) ) ( ( rule__Model__DistributorsAssignment_2 )* ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:461:1: ( ( ( rule__Model__DistributorsAssignment_2 ) ) ( ( rule__Model__DistributorsAssignment_2 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:462:1: ( ( rule__Model__DistributorsAssignment_2 ) ) ( ( rule__Model__DistributorsAssignment_2 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:462:1: ( ( rule__Model__DistributorsAssignment_2 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:463:1: ( rule__Model__DistributorsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getDistributorsAssignment_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:464:1: ( rule__Model__DistributorsAssignment_2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:464:2: rule__Model__DistributorsAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__DistributorsAssignment_2_in_rule__Model__Group__2__Impl934);
            rule__Model__DistributorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDistributorsAssignment_2()); 

            }

            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:467:1: ( ( rule__Model__DistributorsAssignment_2 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:468:1: ( rule__Model__DistributorsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDistributorsAssignment_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:469:1: ( rule__Model__DistributorsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:469:2: rule__Model__DistributorsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DistributorsAssignment_2_in_rule__Model__Group__2__Impl946);
            	    rule__Model__DistributorsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDistributorsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:480:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:484:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:485:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3979);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3982);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:492:1: rule__Model__Group__3__Impl : ( 'Library:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:496:1: ( ( 'Library:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:497:1: ( 'Library:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:497:1: ( 'Library:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:498:1: 'Library:'
            {
             before(grammarAccess.getModelAccess().getLibraryKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__3__Impl1010); 
             after(grammarAccess.getModelAccess().getLibraryKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:511:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:515:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:516:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41041);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41044);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:523:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__SongLibraryAssignment_4 ) ) ( ( rule__Model__SongLibraryAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:527:1: ( ( ( ( rule__Model__SongLibraryAssignment_4 ) ) ( ( rule__Model__SongLibraryAssignment_4 )* ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:528:1: ( ( ( rule__Model__SongLibraryAssignment_4 ) ) ( ( rule__Model__SongLibraryAssignment_4 )* ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:528:1: ( ( ( rule__Model__SongLibraryAssignment_4 ) ) ( ( rule__Model__SongLibraryAssignment_4 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:529:1: ( ( rule__Model__SongLibraryAssignment_4 ) ) ( ( rule__Model__SongLibraryAssignment_4 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:529:1: ( ( rule__Model__SongLibraryAssignment_4 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:530:1: ( rule__Model__SongLibraryAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getSongLibraryAssignment_4()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:531:1: ( rule__Model__SongLibraryAssignment_4 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:531:2: rule__Model__SongLibraryAssignment_4
            {
            pushFollow(FOLLOW_rule__Model__SongLibraryAssignment_4_in_rule__Model__Group__4__Impl1073);
            rule__Model__SongLibraryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSongLibraryAssignment_4()); 

            }

            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:534:1: ( ( rule__Model__SongLibraryAssignment_4 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:535:1: ( rule__Model__SongLibraryAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getSongLibraryAssignment_4()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:536:1: ( rule__Model__SongLibraryAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:536:2: rule__Model__SongLibraryAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__SongLibraryAssignment_4_in_rule__Model__Group__4__Impl1085);
            	    rule__Model__SongLibraryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSongLibraryAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:547:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:551:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:552:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51118);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51121);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:559:1: rule__Model__Group__5__Impl : ( 'Playlists:' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:563:1: ( ( 'Playlists:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:564:1: ( 'Playlists:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:564:1: ( 'Playlists:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:565:1: 'Playlists:'
            {
             before(grammarAccess.getModelAccess().getPlaylistsKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__5__Impl1149); 
             after(grammarAccess.getModelAccess().getPlaylistsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:578:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:582:1: ( rule__Model__Group__6__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:583:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61180);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:589:1: rule__Model__Group__6__Impl : ( ( rule__Model__PlaylistsAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:593:1: ( ( ( rule__Model__PlaylistsAssignment_6 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:594:1: ( ( rule__Model__PlaylistsAssignment_6 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:594:1: ( ( rule__Model__PlaylistsAssignment_6 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:595:1: ( rule__Model__PlaylistsAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getPlaylistsAssignment_6()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:596:1: ( rule__Model__PlaylistsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:596:2: rule__Model__PlaylistsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__PlaylistsAssignment_6_in_rule__Model__Group__6__Impl1207);
            	    rule__Model__PlaylistsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPlaylistsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Playlist__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:620:1: rule__Playlist__Group__0 : rule__Playlist__Group__0__Impl rule__Playlist__Group__1 ;
    public final void rule__Playlist__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:624:1: ( rule__Playlist__Group__0__Impl rule__Playlist__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:625:2: rule__Playlist__Group__0__Impl rule__Playlist__Group__1
            {
            pushFollow(FOLLOW_rule__Playlist__Group__0__Impl_in_rule__Playlist__Group__01252);
            rule__Playlist__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Playlist__Group__1_in_rule__Playlist__Group__01255);
            rule__Playlist__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__0"


    // $ANTLR start "rule__Playlist__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:632:1: rule__Playlist__Group__0__Impl : ( ( rule__Playlist__NameAssignment_0 ) ) ;
    public final void rule__Playlist__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:636:1: ( ( ( rule__Playlist__NameAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:637:1: ( ( rule__Playlist__NameAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:637:1: ( ( rule__Playlist__NameAssignment_0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:638:1: ( rule__Playlist__NameAssignment_0 )
            {
             before(grammarAccess.getPlaylistAccess().getNameAssignment_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:639:1: ( rule__Playlist__NameAssignment_0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:639:2: rule__Playlist__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Playlist__NameAssignment_0_in_rule__Playlist__Group__0__Impl1282);
            rule__Playlist__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__0__Impl"


    // $ANTLR start "rule__Playlist__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:649:1: rule__Playlist__Group__1 : rule__Playlist__Group__1__Impl rule__Playlist__Group__2 ;
    public final void rule__Playlist__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:653:1: ( rule__Playlist__Group__1__Impl rule__Playlist__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:654:2: rule__Playlist__Group__1__Impl rule__Playlist__Group__2
            {
            pushFollow(FOLLOW_rule__Playlist__Group__1__Impl_in_rule__Playlist__Group__11312);
            rule__Playlist__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Playlist__Group__2_in_rule__Playlist__Group__11315);
            rule__Playlist__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__1"


    // $ANTLR start "rule__Playlist__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:661:1: rule__Playlist__Group__1__Impl : ( 'consists of' ) ;
    public final void rule__Playlist__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:665:1: ( ( 'consists of' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:666:1: ( 'consists of' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:666:1: ( 'consists of' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:667:1: 'consists of'
            {
             before(grammarAccess.getPlaylistAccess().getConsistsOfKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Playlist__Group__1__Impl1343); 
             after(grammarAccess.getPlaylistAccess().getConsistsOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__1__Impl"


    // $ANTLR start "rule__Playlist__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:680:1: rule__Playlist__Group__2 : rule__Playlist__Group__2__Impl rule__Playlist__Group__3 ;
    public final void rule__Playlist__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:684:1: ( rule__Playlist__Group__2__Impl rule__Playlist__Group__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:685:2: rule__Playlist__Group__2__Impl rule__Playlist__Group__3
            {
            pushFollow(FOLLOW_rule__Playlist__Group__2__Impl_in_rule__Playlist__Group__21374);
            rule__Playlist__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Playlist__Group__3_in_rule__Playlist__Group__21377);
            rule__Playlist__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__2"


    // $ANTLR start "rule__Playlist__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:692:1: rule__Playlist__Group__2__Impl : ( ( rule__Playlist__ItemsAssignment_2 ) ) ;
    public final void rule__Playlist__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:696:1: ( ( ( rule__Playlist__ItemsAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:697:1: ( ( rule__Playlist__ItemsAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:697:1: ( ( rule__Playlist__ItemsAssignment_2 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:698:1: ( rule__Playlist__ItemsAssignment_2 )
            {
             before(grammarAccess.getPlaylistAccess().getItemsAssignment_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:699:1: ( rule__Playlist__ItemsAssignment_2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:699:2: rule__Playlist__ItemsAssignment_2
            {
            pushFollow(FOLLOW_rule__Playlist__ItemsAssignment_2_in_rule__Playlist__Group__2__Impl1404);
            rule__Playlist__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__2__Impl"


    // $ANTLR start "rule__Playlist__Group__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:709:1: rule__Playlist__Group__3 : rule__Playlist__Group__3__Impl ;
    public final void rule__Playlist__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:713:1: ( rule__Playlist__Group__3__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:714:2: rule__Playlist__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Playlist__Group__3__Impl_in_rule__Playlist__Group__31434);
            rule__Playlist__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__3"


    // $ANTLR start "rule__Playlist__Group__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:720:1: rule__Playlist__Group__3__Impl : ( ( rule__Playlist__Group_3__0 )* ) ;
    public final void rule__Playlist__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:724:1: ( ( ( rule__Playlist__Group_3__0 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:725:1: ( ( rule__Playlist__Group_3__0 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:725:1: ( ( rule__Playlist__Group_3__0 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:726:1: ( rule__Playlist__Group_3__0 )*
            {
             before(grammarAccess.getPlaylistAccess().getGroup_3()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:727:1: ( rule__Playlist__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:727:2: rule__Playlist__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Playlist__Group_3__0_in_rule__Playlist__Group__3__Impl1461);
            	    rule__Playlist__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlaylistAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group__3__Impl"


    // $ANTLR start "rule__Playlist__Group_3__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:745:1: rule__Playlist__Group_3__0 : rule__Playlist__Group_3__0__Impl rule__Playlist__Group_3__1 ;
    public final void rule__Playlist__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:749:1: ( rule__Playlist__Group_3__0__Impl rule__Playlist__Group_3__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:750:2: rule__Playlist__Group_3__0__Impl rule__Playlist__Group_3__1
            {
            pushFollow(FOLLOW_rule__Playlist__Group_3__0__Impl_in_rule__Playlist__Group_3__01500);
            rule__Playlist__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Playlist__Group_3__1_in_rule__Playlist__Group_3__01503);
            rule__Playlist__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group_3__0"


    // $ANTLR start "rule__Playlist__Group_3__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:757:1: rule__Playlist__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Playlist__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:761:1: ( ( ',' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:762:1: ( ',' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:762:1: ( ',' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:763:1: ','
            {
             before(grammarAccess.getPlaylistAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Playlist__Group_3__0__Impl1531); 
             after(grammarAccess.getPlaylistAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group_3__0__Impl"


    // $ANTLR start "rule__Playlist__Group_3__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:776:1: rule__Playlist__Group_3__1 : rule__Playlist__Group_3__1__Impl ;
    public final void rule__Playlist__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:780:1: ( rule__Playlist__Group_3__1__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:781:2: rule__Playlist__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Playlist__Group_3__1__Impl_in_rule__Playlist__Group_3__11562);
            rule__Playlist__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group_3__1"


    // $ANTLR start "rule__Playlist__Group_3__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:787:1: rule__Playlist__Group_3__1__Impl : ( ( rule__Playlist__ItemsAssignment_3_1 ) ) ;
    public final void rule__Playlist__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:791:1: ( ( ( rule__Playlist__ItemsAssignment_3_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:792:1: ( ( rule__Playlist__ItemsAssignment_3_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:792:1: ( ( rule__Playlist__ItemsAssignment_3_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:793:1: ( rule__Playlist__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getPlaylistAccess().getItemsAssignment_3_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:794:1: ( rule__Playlist__ItemsAssignment_3_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:794:2: rule__Playlist__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Playlist__ItemsAssignment_3_1_in_rule__Playlist__Group_3__1__Impl1589);
            rule__Playlist__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaylistAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__Group_3__1__Impl"


    // $ANTLR start "rule__Library__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:808:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:812:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:813:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01623);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01626);
            rule__Library__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:820:1: rule__Library__Group__0__Impl : ( 'Library ' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:824:1: ( ( 'Library ' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:825:1: ( 'Library ' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:825:1: ( 'Library ' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:826:1: 'Library '
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Library__Group__0__Impl1654); 
             after(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:839:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:843:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:844:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11685);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11688);
            rule__Library__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:851:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:855:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:856:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:856:1: ( ( rule__Library__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:857:1: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:858:1: ( rule__Library__NameAssignment_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:858:2: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1715);
            rule__Library__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:868:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:872:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:873:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21745);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21748);
            rule__Library__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:880:1: rule__Library__Group__2__Impl : ( ':' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:884:1: ( ( ':' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:885:1: ( ':' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:885:1: ( ':' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:886:1: ':'
            {
             before(grammarAccess.getLibraryAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Library__Group__2__Impl1776); 
             after(grammarAccess.getLibraryAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:899:1: rule__Library__Group__3 : rule__Library__Group__3__Impl ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:903:1: ( rule__Library__Group__3__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:904:2: rule__Library__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31807);
            rule__Library__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:910:1: rule__Library__Group__3__Impl : ( ( rule__Library__SongsAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:914:1: ( ( ( rule__Library__SongsAssignment_3 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:915:1: ( ( rule__Library__SongsAssignment_3 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:915:1: ( ( rule__Library__SongsAssignment_3 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:916:1: ( rule__Library__SongsAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getSongsAssignment_3()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:917:1: ( rule__Library__SongsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:917:2: rule__Library__SongsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Library__SongsAssignment_3_in_rule__Library__Group__3__Impl1834);
            	    rule__Library__SongsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getSongsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Item__Group_1__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:935:1: rule__Item__Group_1__0 : rule__Item__Group_1__0__Impl rule__Item__Group_1__1 ;
    public final void rule__Item__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:939:1: ( rule__Item__Group_1__0__Impl rule__Item__Group_1__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:940:2: rule__Item__Group_1__0__Impl rule__Item__Group_1__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1__0__Impl_in_rule__Item__Group_1__01873);
            rule__Item__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1__1_in_rule__Item__Group_1__01876);
            rule__Item__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__0"


    // $ANTLR start "rule__Item__Group_1__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:947:1: rule__Item__Group_1__0__Impl : ( 'list' ) ;
    public final void rule__Item__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:951:1: ( ( 'list' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:952:1: ( 'list' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:952:1: ( 'list' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:953:1: 'list'
            {
             before(grammarAccess.getItemAccess().getListKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Item__Group_1__0__Impl1904); 
             after(grammarAccess.getItemAccess().getListKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__0__Impl"


    // $ANTLR start "rule__Item__Group_1__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:966:1: rule__Item__Group_1__1 : rule__Item__Group_1__1__Impl rule__Item__Group_1__2 ;
    public final void rule__Item__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:970:1: ( rule__Item__Group_1__1__Impl rule__Item__Group_1__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:971:2: rule__Item__Group_1__1__Impl rule__Item__Group_1__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1__1__Impl_in_rule__Item__Group_1__11935);
            rule__Item__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1__2_in_rule__Item__Group_1__11938);
            rule__Item__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__1"


    // $ANTLR start "rule__Item__Group_1__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:978:1: rule__Item__Group_1__1__Impl : ( ( rule__Item__ItemAssignment_1_1 ) ) ;
    public final void rule__Item__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:982:1: ( ( ( rule__Item__ItemAssignment_1_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:983:1: ( ( rule__Item__ItemAssignment_1_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:983:1: ( ( rule__Item__ItemAssignment_1_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:984:1: ( rule__Item__ItemAssignment_1_1 )
            {
             before(grammarAccess.getItemAccess().getItemAssignment_1_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:985:1: ( rule__Item__ItemAssignment_1_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:985:2: rule__Item__ItemAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Item__ItemAssignment_1_1_in_rule__Item__Group_1__1__Impl1965);
            rule__Item__ItemAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getItemAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__1__Impl"


    // $ANTLR start "rule__Item__Group_1__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:995:1: rule__Item__Group_1__2 : rule__Item__Group_1__2__Impl ;
    public final void rule__Item__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:999:1: ( rule__Item__Group_1__2__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1000:2: rule__Item__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1__2__Impl_in_rule__Item__Group_1__21995);
            rule__Item__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__2"


    // $ANTLR start "rule__Item__Group_1__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1006:1: rule__Item__Group_1__2__Impl : ( ( rule__Item__Group_1_2__0 )? ) ;
    public final void rule__Item__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1010:1: ( ( ( rule__Item__Group_1_2__0 )? ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1011:1: ( ( rule__Item__Group_1_2__0 )? )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1011:1: ( ( rule__Item__Group_1_2__0 )? )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1012:1: ( rule__Item__Group_1_2__0 )?
            {
             before(grammarAccess.getItemAccess().getGroup_1_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1013:1: ( rule__Item__Group_1_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1013:2: rule__Item__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Item__Group_1_2__0_in_rule__Item__Group_1__2__Impl2022);
                    rule__Item__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getItemAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1__2__Impl"


    // $ANTLR start "rule__Item__Group_1_2__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1029:1: rule__Item__Group_1_2__0 : rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1 ;
    public final void rule__Item__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1033:1: ( rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1034:2: rule__Item__Group_1_2__0__Impl rule__Item__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__0__Impl_in_rule__Item__Group_1_2__02059);
            rule__Item__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__1_in_rule__Item__Group_1_2__02062);
            rule__Item__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__0"


    // $ANTLR start "rule__Item__Group_1_2__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1041:1: rule__Item__Group_1_2__0__Impl : ( 'without' ) ;
    public final void rule__Item__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1045:1: ( ( 'without' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1046:1: ( 'without' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1046:1: ( 'without' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1047:1: 'without'
            {
             before(grammarAccess.getItemAccess().getWithoutKeyword_1_2_0()); 
            match(input,27,FOLLOW_27_in_rule__Item__Group_1_2__0__Impl2090); 
             after(grammarAccess.getItemAccess().getWithoutKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__0__Impl"


    // $ANTLR start "rule__Item__Group_1_2__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1060:1: rule__Item__Group_1_2__1 : rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2 ;
    public final void rule__Item__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1064:1: ( rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1065:2: rule__Item__Group_1_2__1__Impl rule__Item__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__1__Impl_in_rule__Item__Group_1_2__12121);
            rule__Item__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__2_in_rule__Item__Group_1_2__12124);
            rule__Item__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__1"


    // $ANTLR start "rule__Item__Group_1_2__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1072:1: rule__Item__Group_1_2__1__Impl : ( '(' ) ;
    public final void rule__Item__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1076:1: ( ( '(' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1077:1: ( '(' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1077:1: ( '(' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1078:1: '('
            {
             before(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1_2_1()); 
            match(input,28,FOLLOW_28_in_rule__Item__Group_1_2__1__Impl2152); 
             after(grammarAccess.getItemAccess().getLeftParenthesisKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__1__Impl"


    // $ANTLR start "rule__Item__Group_1_2__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1091:1: rule__Item__Group_1_2__2 : rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3 ;
    public final void rule__Item__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1095:1: ( rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1096:2: rule__Item__Group_1_2__2__Impl rule__Item__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__2__Impl_in_rule__Item__Group_1_2__22183);
            rule__Item__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__3_in_rule__Item__Group_1_2__22186);
            rule__Item__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__2"


    // $ANTLR start "rule__Item__Group_1_2__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1103:1: rule__Item__Group_1_2__2__Impl : ( ( rule__Item__ExcludedAssignment_1_2_2 ) ) ;
    public final void rule__Item__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1107:1: ( ( ( rule__Item__ExcludedAssignment_1_2_2 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1108:1: ( ( rule__Item__ExcludedAssignment_1_2_2 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1108:1: ( ( rule__Item__ExcludedAssignment_1_2_2 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1109:1: ( rule__Item__ExcludedAssignment_1_2_2 )
            {
             before(grammarAccess.getItemAccess().getExcludedAssignment_1_2_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1110:1: ( rule__Item__ExcludedAssignment_1_2_2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1110:2: rule__Item__ExcludedAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__Item__ExcludedAssignment_1_2_2_in_rule__Item__Group_1_2__2__Impl2213);
            rule__Item__ExcludedAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getExcludedAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__2__Impl"


    // $ANTLR start "rule__Item__Group_1_2__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1120:1: rule__Item__Group_1_2__3 : rule__Item__Group_1_2__3__Impl rule__Item__Group_1_2__4 ;
    public final void rule__Item__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1124:1: ( rule__Item__Group_1_2__3__Impl rule__Item__Group_1_2__4 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1125:2: rule__Item__Group_1_2__3__Impl rule__Item__Group_1_2__4
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__3__Impl_in_rule__Item__Group_1_2__32243);
            rule__Item__Group_1_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2__4_in_rule__Item__Group_1_2__32246);
            rule__Item__Group_1_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__3"


    // $ANTLR start "rule__Item__Group_1_2__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1132:1: rule__Item__Group_1_2__3__Impl : ( ( rule__Item__Group_1_2_3__0 )* ) ;
    public final void rule__Item__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1136:1: ( ( ( rule__Item__Group_1_2_3__0 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1137:1: ( ( rule__Item__Group_1_2_3__0 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1137:1: ( ( rule__Item__Group_1_2_3__0 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1138:1: ( rule__Item__Group_1_2_3__0 )*
            {
             before(grammarAccess.getItemAccess().getGroup_1_2_3()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1139:1: ( rule__Item__Group_1_2_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1139:2: rule__Item__Group_1_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Item__Group_1_2_3__0_in_rule__Item__Group_1_2__3__Impl2273);
            	    rule__Item__Group_1_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getItemAccess().getGroup_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__3__Impl"


    // $ANTLR start "rule__Item__Group_1_2__4"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1149:1: rule__Item__Group_1_2__4 : rule__Item__Group_1_2__4__Impl ;
    public final void rule__Item__Group_1_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1153:1: ( rule__Item__Group_1_2__4__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1154:2: rule__Item__Group_1_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2__4__Impl_in_rule__Item__Group_1_2__42304);
            rule__Item__Group_1_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__4"


    // $ANTLR start "rule__Item__Group_1_2__4__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1160:1: rule__Item__Group_1_2__4__Impl : ( ')' ) ;
    public final void rule__Item__Group_1_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1164:1: ( ( ')' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1165:1: ( ')' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1165:1: ( ')' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1166:1: ')'
            {
             before(grammarAccess.getItemAccess().getRightParenthesisKeyword_1_2_4()); 
            match(input,29,FOLLOW_29_in_rule__Item__Group_1_2__4__Impl2332); 
             after(grammarAccess.getItemAccess().getRightParenthesisKeyword_1_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2__4__Impl"


    // $ANTLR start "rule__Item__Group_1_2_3__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1189:1: rule__Item__Group_1_2_3__0 : rule__Item__Group_1_2_3__0__Impl rule__Item__Group_1_2_3__1 ;
    public final void rule__Item__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1193:1: ( rule__Item__Group_1_2_3__0__Impl rule__Item__Group_1_2_3__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1194:2: rule__Item__Group_1_2_3__0__Impl rule__Item__Group_1_2_3__1
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2_3__0__Impl_in_rule__Item__Group_1_2_3__02373);
            rule__Item__Group_1_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Item__Group_1_2_3__1_in_rule__Item__Group_1_2_3__02376);
            rule__Item__Group_1_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2_3__0"


    // $ANTLR start "rule__Item__Group_1_2_3__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1201:1: rule__Item__Group_1_2_3__0__Impl : ( ',' ) ;
    public final void rule__Item__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1205:1: ( ( ',' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1206:1: ( ',' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1206:1: ( ',' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1207:1: ','
            {
             before(grammarAccess.getItemAccess().getCommaKeyword_1_2_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Item__Group_1_2_3__0__Impl2404); 
             after(grammarAccess.getItemAccess().getCommaKeyword_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2_3__0__Impl"


    // $ANTLR start "rule__Item__Group_1_2_3__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1220:1: rule__Item__Group_1_2_3__1 : rule__Item__Group_1_2_3__1__Impl ;
    public final void rule__Item__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1224:1: ( rule__Item__Group_1_2_3__1__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1225:2: rule__Item__Group_1_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Item__Group_1_2_3__1__Impl_in_rule__Item__Group_1_2_3__12435);
            rule__Item__Group_1_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2_3__1"


    // $ANTLR start "rule__Item__Group_1_2_3__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1231:1: rule__Item__Group_1_2_3__1__Impl : ( ( rule__Item__ExcludedAssignment_1_2_3_1 ) ) ;
    public final void rule__Item__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1235:1: ( ( ( rule__Item__ExcludedAssignment_1_2_3_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1236:1: ( ( rule__Item__ExcludedAssignment_1_2_3_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1236:1: ( ( rule__Item__ExcludedAssignment_1_2_3_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1237:1: ( rule__Item__ExcludedAssignment_1_2_3_1 )
            {
             before(grammarAccess.getItemAccess().getExcludedAssignment_1_2_3_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1238:1: ( rule__Item__ExcludedAssignment_1_2_3_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1238:2: rule__Item__ExcludedAssignment_1_2_3_1
            {
            pushFollow(FOLLOW_rule__Item__ExcludedAssignment_1_2_3_1_in_rule__Item__Group_1_2_3__1__Impl2462);
            rule__Item__ExcludedAssignment_1_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getExcludedAssignment_1_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group_1_2_3__1__Impl"


    // $ANTLR start "rule__Song__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1252:1: rule__Song__Group__0 : rule__Song__Group__0__Impl rule__Song__Group__1 ;
    public final void rule__Song__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1256:1: ( rule__Song__Group__0__Impl rule__Song__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1257:2: rule__Song__Group__0__Impl rule__Song__Group__1
            {
            pushFollow(FOLLOW_rule__Song__Group__0__Impl_in_rule__Song__Group__02496);
            rule__Song__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__1_in_rule__Song__Group__02499);
            rule__Song__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__0"


    // $ANTLR start "rule__Song__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1264:1: rule__Song__Group__0__Impl : ( 'Song' ) ;
    public final void rule__Song__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1268:1: ( ( 'Song' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1269:1: ( 'Song' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1269:1: ( 'Song' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1270:1: 'Song'
            {
             before(grammarAccess.getSongAccess().getSongKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Song__Group__0__Impl2527); 
             after(grammarAccess.getSongAccess().getSongKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__0__Impl"


    // $ANTLR start "rule__Song__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1283:1: rule__Song__Group__1 : rule__Song__Group__1__Impl rule__Song__Group__2 ;
    public final void rule__Song__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1287:1: ( rule__Song__Group__1__Impl rule__Song__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1288:2: rule__Song__Group__1__Impl rule__Song__Group__2
            {
            pushFollow(FOLLOW_rule__Song__Group__1__Impl_in_rule__Song__Group__12558);
            rule__Song__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__2_in_rule__Song__Group__12561);
            rule__Song__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__1"


    // $ANTLR start "rule__Song__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1295:1: rule__Song__Group__1__Impl : ( ( rule__Song__NameAssignment_1 ) ) ;
    public final void rule__Song__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1299:1: ( ( ( rule__Song__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1300:1: ( ( rule__Song__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1300:1: ( ( rule__Song__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1301:1: ( rule__Song__NameAssignment_1 )
            {
             before(grammarAccess.getSongAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1302:1: ( rule__Song__NameAssignment_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1302:2: rule__Song__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Song__NameAssignment_1_in_rule__Song__Group__1__Impl2588);
            rule__Song__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__1__Impl"


    // $ANTLR start "rule__Song__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1312:1: rule__Song__Group__2 : rule__Song__Group__2__Impl rule__Song__Group__3 ;
    public final void rule__Song__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1316:1: ( rule__Song__Group__2__Impl rule__Song__Group__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1317:2: rule__Song__Group__2__Impl rule__Song__Group__3
            {
            pushFollow(FOLLOW_rule__Song__Group__2__Impl_in_rule__Song__Group__22618);
            rule__Song__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__3_in_rule__Song__Group__22621);
            rule__Song__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__2"


    // $ANTLR start "rule__Song__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1324:1: rule__Song__Group__2__Impl : ( 'sung by' ) ;
    public final void rule__Song__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1328:1: ( ( 'sung by' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1329:1: ( 'sung by' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1329:1: ( 'sung by' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1330:1: 'sung by'
            {
             before(grammarAccess.getSongAccess().getSungByKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Song__Group__2__Impl2649); 
             after(grammarAccess.getSongAccess().getSungByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__2__Impl"


    // $ANTLR start "rule__Song__Group__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1343:1: rule__Song__Group__3 : rule__Song__Group__3__Impl rule__Song__Group__4 ;
    public final void rule__Song__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1347:1: ( rule__Song__Group__3__Impl rule__Song__Group__4 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1348:2: rule__Song__Group__3__Impl rule__Song__Group__4
            {
            pushFollow(FOLLOW_rule__Song__Group__3__Impl_in_rule__Song__Group__32680);
            rule__Song__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__4_in_rule__Song__Group__32683);
            rule__Song__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__3"


    // $ANTLR start "rule__Song__Group__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1355:1: rule__Song__Group__3__Impl : ( ( rule__Song__ArtistAssignment_3 ) ) ;
    public final void rule__Song__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1359:1: ( ( ( rule__Song__ArtistAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1360:1: ( ( rule__Song__ArtistAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1360:1: ( ( rule__Song__ArtistAssignment_3 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1361:1: ( rule__Song__ArtistAssignment_3 )
            {
             before(grammarAccess.getSongAccess().getArtistAssignment_3()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1362:1: ( rule__Song__ArtistAssignment_3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1362:2: rule__Song__ArtistAssignment_3
            {
            pushFollow(FOLLOW_rule__Song__ArtistAssignment_3_in_rule__Song__Group__3__Impl2710);
            rule__Song__ArtistAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getArtistAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__3__Impl"


    // $ANTLR start "rule__Song__Group__4"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1372:1: rule__Song__Group__4 : rule__Song__Group__4__Impl rule__Song__Group__5 ;
    public final void rule__Song__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1376:1: ( rule__Song__Group__4__Impl rule__Song__Group__5 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1377:2: rule__Song__Group__4__Impl rule__Song__Group__5
            {
            pushFollow(FOLLOW_rule__Song__Group__4__Impl_in_rule__Song__Group__42740);
            rule__Song__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__5_in_rule__Song__Group__42743);
            rule__Song__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__4"


    // $ANTLR start "rule__Song__Group__4__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1384:1: rule__Song__Group__4__Impl : ( 'produced by' ) ;
    public final void rule__Song__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1388:1: ( ( 'produced by' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1389:1: ( 'produced by' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1389:1: ( 'produced by' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1390:1: 'produced by'
            {
             before(grammarAccess.getSongAccess().getProducedByKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Song__Group__4__Impl2771); 
             after(grammarAccess.getSongAccess().getProducedByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__4__Impl"


    // $ANTLR start "rule__Song__Group__5"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1403:1: rule__Song__Group__5 : rule__Song__Group__5__Impl rule__Song__Group__6 ;
    public final void rule__Song__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1407:1: ( rule__Song__Group__5__Impl rule__Song__Group__6 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1408:2: rule__Song__Group__5__Impl rule__Song__Group__6
            {
            pushFollow(FOLLOW_rule__Song__Group__5__Impl_in_rule__Song__Group__52802);
            rule__Song__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__6_in_rule__Song__Group__52805);
            rule__Song__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__5"


    // $ANTLR start "rule__Song__Group__5__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1415:1: rule__Song__Group__5__Impl : ( ( rule__Song__DistributorAssignment_5 ) ) ;
    public final void rule__Song__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1419:1: ( ( ( rule__Song__DistributorAssignment_5 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1420:1: ( ( rule__Song__DistributorAssignment_5 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1420:1: ( ( rule__Song__DistributorAssignment_5 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1421:1: ( rule__Song__DistributorAssignment_5 )
            {
             before(grammarAccess.getSongAccess().getDistributorAssignment_5()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1422:1: ( rule__Song__DistributorAssignment_5 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1422:2: rule__Song__DistributorAssignment_5
            {
            pushFollow(FOLLOW_rule__Song__DistributorAssignment_5_in_rule__Song__Group__5__Impl2832);
            rule__Song__DistributorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getDistributorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__5__Impl"


    // $ANTLR start "rule__Song__Group__6"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1432:1: rule__Song__Group__6 : rule__Song__Group__6__Impl rule__Song__Group__7 ;
    public final void rule__Song__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1436:1: ( rule__Song__Group__6__Impl rule__Song__Group__7 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1437:2: rule__Song__Group__6__Impl rule__Song__Group__7
            {
            pushFollow(FOLLOW_rule__Song__Group__6__Impl_in_rule__Song__Group__62862);
            rule__Song__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__7_in_rule__Song__Group__62865);
            rule__Song__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__6"


    // $ANTLR start "rule__Song__Group__6__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1444:1: rule__Song__Group__6__Impl : ( 'length:' ) ;
    public final void rule__Song__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1448:1: ( ( 'length:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1449:1: ( 'length:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1449:1: ( 'length:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1450:1: 'length:'
            {
             before(grammarAccess.getSongAccess().getLengthKeyword_6()); 
            match(input,33,FOLLOW_33_in_rule__Song__Group__6__Impl2893); 
             after(grammarAccess.getSongAccess().getLengthKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__6__Impl"


    // $ANTLR start "rule__Song__Group__7"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1463:1: rule__Song__Group__7 : rule__Song__Group__7__Impl rule__Song__Group__8 ;
    public final void rule__Song__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1467:1: ( rule__Song__Group__7__Impl rule__Song__Group__8 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1468:2: rule__Song__Group__7__Impl rule__Song__Group__8
            {
            pushFollow(FOLLOW_rule__Song__Group__7__Impl_in_rule__Song__Group__72924);
            rule__Song__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__8_in_rule__Song__Group__72927);
            rule__Song__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__7"


    // $ANTLR start "rule__Song__Group__7__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1475:1: rule__Song__Group__7__Impl : ( ( rule__Song__LengthAssignment_7 ) ) ;
    public final void rule__Song__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1479:1: ( ( ( rule__Song__LengthAssignment_7 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1480:1: ( ( rule__Song__LengthAssignment_7 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1480:1: ( ( rule__Song__LengthAssignment_7 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1481:1: ( rule__Song__LengthAssignment_7 )
            {
             before(grammarAccess.getSongAccess().getLengthAssignment_7()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1482:1: ( rule__Song__LengthAssignment_7 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1482:2: rule__Song__LengthAssignment_7
            {
            pushFollow(FOLLOW_rule__Song__LengthAssignment_7_in_rule__Song__Group__7__Impl2954);
            rule__Song__LengthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getLengthAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__7__Impl"


    // $ANTLR start "rule__Song__Group__8"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1492:1: rule__Song__Group__8 : rule__Song__Group__8__Impl rule__Song__Group__9 ;
    public final void rule__Song__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1496:1: ( rule__Song__Group__8__Impl rule__Song__Group__9 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1497:2: rule__Song__Group__8__Impl rule__Song__Group__9
            {
            pushFollow(FOLLOW_rule__Song__Group__8__Impl_in_rule__Song__Group__82984);
            rule__Song__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__9_in_rule__Song__Group__82987);
            rule__Song__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__8"


    // $ANTLR start "rule__Song__Group__8__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1504:1: rule__Song__Group__8__Impl : ( 'genre:' ) ;
    public final void rule__Song__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1508:1: ( ( 'genre:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1509:1: ( 'genre:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1509:1: ( 'genre:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1510:1: 'genre:'
            {
             before(grammarAccess.getSongAccess().getGenreKeyword_8()); 
            match(input,34,FOLLOW_34_in_rule__Song__Group__8__Impl3015); 
             after(grammarAccess.getSongAccess().getGenreKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__8__Impl"


    // $ANTLR start "rule__Song__Group__9"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1523:1: rule__Song__Group__9 : rule__Song__Group__9__Impl rule__Song__Group__10 ;
    public final void rule__Song__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1527:1: ( rule__Song__Group__9__Impl rule__Song__Group__10 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1528:2: rule__Song__Group__9__Impl rule__Song__Group__10
            {
            pushFollow(FOLLOW_rule__Song__Group__9__Impl_in_rule__Song__Group__93046);
            rule__Song__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__10_in_rule__Song__Group__93049);
            rule__Song__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__9"


    // $ANTLR start "rule__Song__Group__9__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1535:1: rule__Song__Group__9__Impl : ( ( rule__Song__GenreAssignment_9 ) ) ;
    public final void rule__Song__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1539:1: ( ( ( rule__Song__GenreAssignment_9 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1540:1: ( ( rule__Song__GenreAssignment_9 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1540:1: ( ( rule__Song__GenreAssignment_9 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1541:1: ( rule__Song__GenreAssignment_9 )
            {
             before(grammarAccess.getSongAccess().getGenreAssignment_9()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1542:1: ( rule__Song__GenreAssignment_9 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1542:2: rule__Song__GenreAssignment_9
            {
            pushFollow(FOLLOW_rule__Song__GenreAssignment_9_in_rule__Song__Group__9__Impl3076);
            rule__Song__GenreAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getGenreAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__9__Impl"


    // $ANTLR start "rule__Song__Group__10"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1552:1: rule__Song__Group__10 : rule__Song__Group__10__Impl rule__Song__Group__11 ;
    public final void rule__Song__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1556:1: ( rule__Song__Group__10__Impl rule__Song__Group__11 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1557:2: rule__Song__Group__10__Impl rule__Song__Group__11
            {
            pushFollow(FOLLOW_rule__Song__Group__10__Impl_in_rule__Song__Group__103106);
            rule__Song__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Song__Group__11_in_rule__Song__Group__103109);
            rule__Song__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__10"


    // $ANTLR start "rule__Song__Group__10__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1564:1: rule__Song__Group__10__Impl : ( 'price:' ) ;
    public final void rule__Song__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1568:1: ( ( 'price:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1569:1: ( 'price:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1569:1: ( 'price:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1570:1: 'price:'
            {
             before(grammarAccess.getSongAccess().getPriceKeyword_10()); 
            match(input,35,FOLLOW_35_in_rule__Song__Group__10__Impl3137); 
             after(grammarAccess.getSongAccess().getPriceKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__10__Impl"


    // $ANTLR start "rule__Song__Group__11"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1583:1: rule__Song__Group__11 : rule__Song__Group__11__Impl ;
    public final void rule__Song__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1587:1: ( rule__Song__Group__11__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1588:2: rule__Song__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Song__Group__11__Impl_in_rule__Song__Group__113168);
            rule__Song__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__11"


    // $ANTLR start "rule__Song__Group__11__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1594:1: rule__Song__Group__11__Impl : ( ( rule__Song__PriceAssignment_11 ) ) ;
    public final void rule__Song__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1598:1: ( ( ( rule__Song__PriceAssignment_11 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1599:1: ( ( rule__Song__PriceAssignment_11 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1599:1: ( ( rule__Song__PriceAssignment_11 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1600:1: ( rule__Song__PriceAssignment_11 )
            {
             before(grammarAccess.getSongAccess().getPriceAssignment_11()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1601:1: ( rule__Song__PriceAssignment_11 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1601:2: rule__Song__PriceAssignment_11
            {
            pushFollow(FOLLOW_rule__Song__PriceAssignment_11_in_rule__Song__Group__11__Impl3195);
            rule__Song__PriceAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSongAccess().getPriceAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__Group__11__Impl"


    // $ANTLR start "rule__Length__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1635:1: rule__Length__Group__0 : rule__Length__Group__0__Impl rule__Length__Group__1 ;
    public final void rule__Length__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1639:1: ( rule__Length__Group__0__Impl rule__Length__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1640:2: rule__Length__Group__0__Impl rule__Length__Group__1
            {
            pushFollow(FOLLOW_rule__Length__Group__0__Impl_in_rule__Length__Group__03249);
            rule__Length__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Length__Group__1_in_rule__Length__Group__03252);
            rule__Length__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__0"


    // $ANTLR start "rule__Length__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1647:1: rule__Length__Group__0__Impl : ( ( rule__Length__MinutesAssignment_0 ) ) ;
    public final void rule__Length__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1651:1: ( ( ( rule__Length__MinutesAssignment_0 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1652:1: ( ( rule__Length__MinutesAssignment_0 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1652:1: ( ( rule__Length__MinutesAssignment_0 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1653:1: ( rule__Length__MinutesAssignment_0 )
            {
             before(grammarAccess.getLengthAccess().getMinutesAssignment_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1654:1: ( rule__Length__MinutesAssignment_0 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1654:2: rule__Length__MinutesAssignment_0
            {
            pushFollow(FOLLOW_rule__Length__MinutesAssignment_0_in_rule__Length__Group__0__Impl3279);
            rule__Length__MinutesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getMinutesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__0__Impl"


    // $ANTLR start "rule__Length__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1664:1: rule__Length__Group__1 : rule__Length__Group__1__Impl rule__Length__Group__2 ;
    public final void rule__Length__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1668:1: ( rule__Length__Group__1__Impl rule__Length__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1669:2: rule__Length__Group__1__Impl rule__Length__Group__2
            {
            pushFollow(FOLLOW_rule__Length__Group__1__Impl_in_rule__Length__Group__13309);
            rule__Length__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Length__Group__2_in_rule__Length__Group__13312);
            rule__Length__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__1"


    // $ANTLR start "rule__Length__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1676:1: rule__Length__Group__1__Impl : ( ':' ) ;
    public final void rule__Length__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1680:1: ( ( ':' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1681:1: ( ':' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1681:1: ( ':' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1682:1: ':'
            {
             before(grammarAccess.getLengthAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Length__Group__1__Impl3340); 
             after(grammarAccess.getLengthAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__1__Impl"


    // $ANTLR start "rule__Length__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1695:1: rule__Length__Group__2 : rule__Length__Group__2__Impl ;
    public final void rule__Length__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1699:1: ( rule__Length__Group__2__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1700:2: rule__Length__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Length__Group__2__Impl_in_rule__Length__Group__23371);
            rule__Length__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__2"


    // $ANTLR start "rule__Length__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1706:1: rule__Length__Group__2__Impl : ( ( rule__Length__SecondsAssignment_2 ) ) ;
    public final void rule__Length__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1710:1: ( ( ( rule__Length__SecondsAssignment_2 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1711:1: ( ( rule__Length__SecondsAssignment_2 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1711:1: ( ( rule__Length__SecondsAssignment_2 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1712:1: ( rule__Length__SecondsAssignment_2 )
            {
             before(grammarAccess.getLengthAccess().getSecondsAssignment_2()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1713:1: ( rule__Length__SecondsAssignment_2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1713:2: rule__Length__SecondsAssignment_2
            {
            pushFollow(FOLLOW_rule__Length__SecondsAssignment_2_in_rule__Length__Group__2__Impl3398);
            rule__Length__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLengthAccess().getSecondsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__Group__2__Impl"


    // $ANTLR start "rule__Distributor__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1729:1: rule__Distributor__Group__0 : rule__Distributor__Group__0__Impl rule__Distributor__Group__1 ;
    public final void rule__Distributor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1733:1: ( rule__Distributor__Group__0__Impl rule__Distributor__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1734:2: rule__Distributor__Group__0__Impl rule__Distributor__Group__1
            {
            pushFollow(FOLLOW_rule__Distributor__Group__0__Impl_in_rule__Distributor__Group__03434);
            rule__Distributor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__1_in_rule__Distributor__Group__03437);
            rule__Distributor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__0"


    // $ANTLR start "rule__Distributor__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1741:1: rule__Distributor__Group__0__Impl : ( 'Distributor' ) ;
    public final void rule__Distributor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1745:1: ( ( 'Distributor' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1746:1: ( 'Distributor' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1746:1: ( 'Distributor' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1747:1: 'Distributor'
            {
             before(grammarAccess.getDistributorAccess().getDistributorKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Distributor__Group__0__Impl3465); 
             after(grammarAccess.getDistributorAccess().getDistributorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__0__Impl"


    // $ANTLR start "rule__Distributor__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1760:1: rule__Distributor__Group__1 : rule__Distributor__Group__1__Impl rule__Distributor__Group__2 ;
    public final void rule__Distributor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1764:1: ( rule__Distributor__Group__1__Impl rule__Distributor__Group__2 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1765:2: rule__Distributor__Group__1__Impl rule__Distributor__Group__2
            {
            pushFollow(FOLLOW_rule__Distributor__Group__1__Impl_in_rule__Distributor__Group__13496);
            rule__Distributor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__2_in_rule__Distributor__Group__13499);
            rule__Distributor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__1"


    // $ANTLR start "rule__Distributor__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1772:1: rule__Distributor__Group__1__Impl : ( ( rule__Distributor__NameAssignment_1 ) ) ;
    public final void rule__Distributor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1776:1: ( ( ( rule__Distributor__NameAssignment_1 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1777:1: ( ( rule__Distributor__NameAssignment_1 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1777:1: ( ( rule__Distributor__NameAssignment_1 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1778:1: ( rule__Distributor__NameAssignment_1 )
            {
             before(grammarAccess.getDistributorAccess().getNameAssignment_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1779:1: ( rule__Distributor__NameAssignment_1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1779:2: rule__Distributor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Distributor__NameAssignment_1_in_rule__Distributor__Group__1__Impl3526);
            rule__Distributor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistributorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__1__Impl"


    // $ANTLR start "rule__Distributor__Group__2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1789:1: rule__Distributor__Group__2 : rule__Distributor__Group__2__Impl rule__Distributor__Group__3 ;
    public final void rule__Distributor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1793:1: ( rule__Distributor__Group__2__Impl rule__Distributor__Group__3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1794:2: rule__Distributor__Group__2__Impl rule__Distributor__Group__3
            {
            pushFollow(FOLLOW_rule__Distributor__Group__2__Impl_in_rule__Distributor__Group__23556);
            rule__Distributor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__3_in_rule__Distributor__Group__23559);
            rule__Distributor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__2"


    // $ANTLR start "rule__Distributor__Group__2__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1801:1: rule__Distributor__Group__2__Impl : ( 'Address:' ) ;
    public final void rule__Distributor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1805:1: ( ( 'Address:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1806:1: ( 'Address:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1806:1: ( 'Address:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1807:1: 'Address:'
            {
             before(grammarAccess.getDistributorAccess().getAddressKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Distributor__Group__2__Impl3587); 
             after(grammarAccess.getDistributorAccess().getAddressKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__2__Impl"


    // $ANTLR start "rule__Distributor__Group__3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1820:1: rule__Distributor__Group__3 : rule__Distributor__Group__3__Impl rule__Distributor__Group__4 ;
    public final void rule__Distributor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1824:1: ( rule__Distributor__Group__3__Impl rule__Distributor__Group__4 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1825:2: rule__Distributor__Group__3__Impl rule__Distributor__Group__4
            {
            pushFollow(FOLLOW_rule__Distributor__Group__3__Impl_in_rule__Distributor__Group__33618);
            rule__Distributor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__4_in_rule__Distributor__Group__33621);
            rule__Distributor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__3"


    // $ANTLR start "rule__Distributor__Group__3__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1832:1: rule__Distributor__Group__3__Impl : ( ( rule__Distributor__AddressAssignment_3 ) ) ;
    public final void rule__Distributor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1836:1: ( ( ( rule__Distributor__AddressAssignment_3 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1837:1: ( ( rule__Distributor__AddressAssignment_3 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1837:1: ( ( rule__Distributor__AddressAssignment_3 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1838:1: ( rule__Distributor__AddressAssignment_3 )
            {
             before(grammarAccess.getDistributorAccess().getAddressAssignment_3()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1839:1: ( rule__Distributor__AddressAssignment_3 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1839:2: rule__Distributor__AddressAssignment_3
            {
            pushFollow(FOLLOW_rule__Distributor__AddressAssignment_3_in_rule__Distributor__Group__3__Impl3648);
            rule__Distributor__AddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDistributorAccess().getAddressAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__3__Impl"


    // $ANTLR start "rule__Distributor__Group__4"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1849:1: rule__Distributor__Group__4 : rule__Distributor__Group__4__Impl rule__Distributor__Group__5 ;
    public final void rule__Distributor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1853:1: ( rule__Distributor__Group__4__Impl rule__Distributor__Group__5 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1854:2: rule__Distributor__Group__4__Impl rule__Distributor__Group__5
            {
            pushFollow(FOLLOW_rule__Distributor__Group__4__Impl_in_rule__Distributor__Group__43678);
            rule__Distributor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__5_in_rule__Distributor__Group__43681);
            rule__Distributor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__4"


    // $ANTLR start "rule__Distributor__Group__4__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1861:1: rule__Distributor__Group__4__Impl : ( 'Account Information:' ) ;
    public final void rule__Distributor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1865:1: ( ( 'Account Information:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1866:1: ( 'Account Information:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1866:1: ( 'Account Information:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1867:1: 'Account Information:'
            {
             before(grammarAccess.getDistributorAccess().getAccountInformationKeyword_4()); 
            match(input,38,FOLLOW_38_in_rule__Distributor__Group__4__Impl3709); 
             after(grammarAccess.getDistributorAccess().getAccountInformationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__4__Impl"


    // $ANTLR start "rule__Distributor__Group__5"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1880:1: rule__Distributor__Group__5 : rule__Distributor__Group__5__Impl rule__Distributor__Group__6 ;
    public final void rule__Distributor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1884:1: ( rule__Distributor__Group__5__Impl rule__Distributor__Group__6 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1885:2: rule__Distributor__Group__5__Impl rule__Distributor__Group__6
            {
            pushFollow(FOLLOW_rule__Distributor__Group__5__Impl_in_rule__Distributor__Group__53740);
            rule__Distributor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__6_in_rule__Distributor__Group__53743);
            rule__Distributor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__5"


    // $ANTLR start "rule__Distributor__Group__5__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1892:1: rule__Distributor__Group__5__Impl : ( 'IBAN:' ) ;
    public final void rule__Distributor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1896:1: ( ( 'IBAN:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1897:1: ( 'IBAN:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1897:1: ( 'IBAN:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1898:1: 'IBAN:'
            {
             before(grammarAccess.getDistributorAccess().getIBANKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Distributor__Group__5__Impl3771); 
             after(grammarAccess.getDistributorAccess().getIBANKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__5__Impl"


    // $ANTLR start "rule__Distributor__Group__6"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1911:1: rule__Distributor__Group__6 : rule__Distributor__Group__6__Impl rule__Distributor__Group__7 ;
    public final void rule__Distributor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1915:1: ( rule__Distributor__Group__6__Impl rule__Distributor__Group__7 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1916:2: rule__Distributor__Group__6__Impl rule__Distributor__Group__7
            {
            pushFollow(FOLLOW_rule__Distributor__Group__6__Impl_in_rule__Distributor__Group__63802);
            rule__Distributor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__7_in_rule__Distributor__Group__63805);
            rule__Distributor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__6"


    // $ANTLR start "rule__Distributor__Group__6__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1923:1: rule__Distributor__Group__6__Impl : ( ( rule__Distributor__IbanAssignment_6 ) ) ;
    public final void rule__Distributor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1927:1: ( ( ( rule__Distributor__IbanAssignment_6 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1928:1: ( ( rule__Distributor__IbanAssignment_6 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1928:1: ( ( rule__Distributor__IbanAssignment_6 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1929:1: ( rule__Distributor__IbanAssignment_6 )
            {
             before(grammarAccess.getDistributorAccess().getIbanAssignment_6()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1930:1: ( rule__Distributor__IbanAssignment_6 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1930:2: rule__Distributor__IbanAssignment_6
            {
            pushFollow(FOLLOW_rule__Distributor__IbanAssignment_6_in_rule__Distributor__Group__6__Impl3832);
            rule__Distributor__IbanAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDistributorAccess().getIbanAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__6__Impl"


    // $ANTLR start "rule__Distributor__Group__7"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1940:1: rule__Distributor__Group__7 : rule__Distributor__Group__7__Impl rule__Distributor__Group__8 ;
    public final void rule__Distributor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1944:1: ( rule__Distributor__Group__7__Impl rule__Distributor__Group__8 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1945:2: rule__Distributor__Group__7__Impl rule__Distributor__Group__8
            {
            pushFollow(FOLLOW_rule__Distributor__Group__7__Impl_in_rule__Distributor__Group__73862);
            rule__Distributor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Distributor__Group__8_in_rule__Distributor__Group__73865);
            rule__Distributor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__7"


    // $ANTLR start "rule__Distributor__Group__7__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1952:1: rule__Distributor__Group__7__Impl : ( 'BIC:' ) ;
    public final void rule__Distributor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1956:1: ( ( 'BIC:' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1957:1: ( 'BIC:' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1957:1: ( 'BIC:' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1958:1: 'BIC:'
            {
             before(grammarAccess.getDistributorAccess().getBICKeyword_7()); 
            match(input,40,FOLLOW_40_in_rule__Distributor__Group__7__Impl3893); 
             after(grammarAccess.getDistributorAccess().getBICKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__7__Impl"


    // $ANTLR start "rule__Distributor__Group__8"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1971:1: rule__Distributor__Group__8 : rule__Distributor__Group__8__Impl ;
    public final void rule__Distributor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1975:1: ( rule__Distributor__Group__8__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1976:2: rule__Distributor__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Distributor__Group__8__Impl_in_rule__Distributor__Group__83924);
            rule__Distributor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__8"


    // $ANTLR start "rule__Distributor__Group__8__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1982:1: rule__Distributor__Group__8__Impl : ( ( rule__Distributor__BicAssignment_8 ) ) ;
    public final void rule__Distributor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1986:1: ( ( ( rule__Distributor__BicAssignment_8 ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1987:1: ( ( rule__Distributor__BicAssignment_8 ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1987:1: ( ( rule__Distributor__BicAssignment_8 ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1988:1: ( rule__Distributor__BicAssignment_8 )
            {
             before(grammarAccess.getDistributorAccess().getBicAssignment_8()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1989:1: ( rule__Distributor__BicAssignment_8 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:1989:2: rule__Distributor__BicAssignment_8
            {
            pushFollow(FOLLOW_rule__Distributor__BicAssignment_8_in_rule__Distributor__Group__8__Impl3951);
            rule__Distributor__BicAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDistributorAccess().getBicAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__Group__8__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2017:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2021:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2022:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03999);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04002);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2029:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2033:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2034:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2034:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2035:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4029); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2046:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2050:1: ( rule__FQN__Group__1__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2051:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14058);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2057:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2061:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2062:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2062:1: ( ( rule__FQN__Group_1__0 )* )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2063:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2064:1: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==41) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2064:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4085);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2078:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2082:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2083:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04120);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04123);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2090:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2094:1: ( ( '.' ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2095:1: ( '.' )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2095:1: ( '.' )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2096:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__FQN__Group_1__0__Impl4151); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2109:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2113:1: ( rule__FQN__Group_1__1__Impl )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2114:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14182);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2120:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2124:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2125:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2125:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2126:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4209); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Model__DistributorsAssignment_2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2142:1: rule__Model__DistributorsAssignment_2 : ( ruleDistributor ) ;
    public final void rule__Model__DistributorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2146:1: ( ( ruleDistributor ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2147:1: ( ruleDistributor )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2147:1: ( ruleDistributor )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2148:1: ruleDistributor
            {
             before(grammarAccess.getModelAccess().getDistributorsDistributorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDistributor_in_rule__Model__DistributorsAssignment_24247);
            ruleDistributor();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDistributorsDistributorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DistributorsAssignment_2"


    // $ANTLR start "rule__Model__SongLibraryAssignment_4"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2157:1: rule__Model__SongLibraryAssignment_4 : ( ruleLibrary ) ;
    public final void rule__Model__SongLibraryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2161:1: ( ( ruleLibrary ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2162:1: ( ruleLibrary )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2162:1: ( ruleLibrary )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2163:1: ruleLibrary
            {
             before(grammarAccess.getModelAccess().getSongLibraryLibraryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleLibrary_in_rule__Model__SongLibraryAssignment_44278);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSongLibraryLibraryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SongLibraryAssignment_4"


    // $ANTLR start "rule__Model__PlaylistsAssignment_6"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2172:1: rule__Model__PlaylistsAssignment_6 : ( rulePlaylist ) ;
    public final void rule__Model__PlaylistsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2176:1: ( ( rulePlaylist ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2177:1: ( rulePlaylist )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2177:1: ( rulePlaylist )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2178:1: rulePlaylist
            {
             before(grammarAccess.getModelAccess().getPlaylistsPlaylistParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePlaylist_in_rule__Model__PlaylistsAssignment_64309);
            rulePlaylist();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPlaylistsPlaylistParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PlaylistsAssignment_6"


    // $ANTLR start "rule__Playlist__NameAssignment_0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2187:1: rule__Playlist__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Playlist__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2191:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2192:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2192:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2193:1: RULE_ID
            {
             before(grammarAccess.getPlaylistAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Playlist__NameAssignment_04340); 
             after(grammarAccess.getPlaylistAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__NameAssignment_0"


    // $ANTLR start "rule__Playlist__ItemsAssignment_2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2202:1: rule__Playlist__ItemsAssignment_2 : ( ruleItem ) ;
    public final void rule__Playlist__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2206:1: ( ( ruleItem ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2207:1: ( ruleItem )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2207:1: ( ruleItem )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2208:1: ruleItem
            {
             before(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Playlist__ItemsAssignment_24371);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__ItemsAssignment_2"


    // $ANTLR start "rule__Playlist__ItemsAssignment_3_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2217:1: rule__Playlist__ItemsAssignment_3_1 : ( ruleItem ) ;
    public final void rule__Playlist__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2221:1: ( ( ruleItem ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2222:1: ( ruleItem )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2222:1: ( ruleItem )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2223:1: ruleItem
            {
             before(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleItem_in_rule__Playlist__ItemsAssignment_3_14402);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Playlist__ItemsAssignment_3_1"


    // $ANTLR start "rule__Library__NameAssignment_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2232:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2236:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2237:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2237:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2238:1: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Library__NameAssignment_14433); 
             after(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NameAssignment_1"


    // $ANTLR start "rule__Library__SongsAssignment_3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2247:1: rule__Library__SongsAssignment_3 : ( ruleSong ) ;
    public final void rule__Library__SongsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2251:1: ( ( ruleSong ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2252:1: ( ruleSong )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2252:1: ( ruleSong )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2253:1: ruleSong
            {
             before(grammarAccess.getLibraryAccess().getSongsSongParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSong_in_rule__Library__SongsAssignment_34464);
            ruleSong();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getSongsSongParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__SongsAssignment_3"


    // $ANTLR start "rule__Item__ItemAssignment_0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2262:1: rule__Item__ItemAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Item__ItemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2266:1: ( ( ( ruleFQN ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2267:1: ( ( ruleFQN ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2267:1: ( ( ruleFQN ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2268:1: ( ruleFQN )
            {
             before(grammarAccess.getItemAccess().getItemSongCrossReference_0_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2269:1: ( ruleFQN )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2270:1: ruleFQN
            {
             before(grammarAccess.getItemAccess().getItemSongFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Item__ItemAssignment_04499);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getItemAccess().getItemSongFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getItemAccess().getItemSongCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ItemAssignment_0"


    // $ANTLR start "rule__Item__ItemAssignment_1_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2281:1: rule__Item__ItemAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Item__ItemAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2285:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2286:1: ( ( RULE_ID ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2286:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2287:1: ( RULE_ID )
            {
             before(grammarAccess.getItemAccess().getItemPlaylistCrossReference_1_1_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2288:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2289:1: RULE_ID
            {
             before(grammarAccess.getItemAccess().getItemPlaylistIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Item__ItemAssignment_1_14538); 
             after(grammarAccess.getItemAccess().getItemPlaylistIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getItemAccess().getItemPlaylistCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ItemAssignment_1_1"


    // $ANTLR start "rule__Item__ExcludedAssignment_1_2_2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2300:1: rule__Item__ExcludedAssignment_1_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__Item__ExcludedAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2304:1: ( ( ( ruleFQN ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2305:1: ( ( ruleFQN ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2305:1: ( ( ruleFQN ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2306:1: ( ruleFQN )
            {
             before(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_2_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2307:1: ( ruleFQN )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2308:1: ruleFQN
            {
             before(grammarAccess.getItemAccess().getExcludedSongFQNParserRuleCall_1_2_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Item__ExcludedAssignment_1_2_24577);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getItemAccess().getExcludedSongFQNParserRuleCall_1_2_2_0_1()); 

            }

             after(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ExcludedAssignment_1_2_2"


    // $ANTLR start "rule__Item__ExcludedAssignment_1_2_3_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2319:1: rule__Item__ExcludedAssignment_1_2_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Item__ExcludedAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2323:1: ( ( ( ruleFQN ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2324:1: ( ( ruleFQN ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2324:1: ( ( ruleFQN ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2325:1: ( ruleFQN )
            {
             before(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_3_1_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2326:1: ( ruleFQN )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2327:1: ruleFQN
            {
             before(grammarAccess.getItemAccess().getExcludedSongFQNParserRuleCall_1_2_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Item__ExcludedAssignment_1_2_3_14616);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getItemAccess().getExcludedSongFQNParserRuleCall_1_2_3_1_0_1()); 

            }

             after(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__ExcludedAssignment_1_2_3_1"


    // $ANTLR start "rule__Song__NameAssignment_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2338:1: rule__Song__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Song__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2342:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2343:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2343:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2344:1: RULE_ID
            {
             before(grammarAccess.getSongAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Song__NameAssignment_14651); 
             after(grammarAccess.getSongAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__NameAssignment_1"


    // $ANTLR start "rule__Song__ArtistAssignment_3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2353:1: rule__Song__ArtistAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Song__ArtistAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2357:1: ( ( RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2358:1: ( RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2358:1: ( RULE_STRING )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2359:1: RULE_STRING
            {
             before(grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Song__ArtistAssignment_34682); 
             after(grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__ArtistAssignment_3"


    // $ANTLR start "rule__Song__DistributorAssignment_5"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2368:1: rule__Song__DistributorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Song__DistributorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2372:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2373:1: ( ( RULE_ID ) )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2373:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2374:1: ( RULE_ID )
            {
             before(grammarAccess.getSongAccess().getDistributorDistributorCrossReference_5_0()); 
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2375:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2376:1: RULE_ID
            {
             before(grammarAccess.getSongAccess().getDistributorDistributorIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Song__DistributorAssignment_54717); 
             after(grammarAccess.getSongAccess().getDistributorDistributorIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSongAccess().getDistributorDistributorCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__DistributorAssignment_5"


    // $ANTLR start "rule__Song__LengthAssignment_7"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2387:1: rule__Song__LengthAssignment_7 : ( ruleLength ) ;
    public final void rule__Song__LengthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2391:1: ( ( ruleLength ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2392:1: ( ruleLength )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2392:1: ( ruleLength )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2393:1: ruleLength
            {
             before(grammarAccess.getSongAccess().getLengthLengthParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleLength_in_rule__Song__LengthAssignment_74752);
            ruleLength();

            state._fsp--;

             after(grammarAccess.getSongAccess().getLengthLengthParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__LengthAssignment_7"


    // $ANTLR start "rule__Song__GenreAssignment_9"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2402:1: rule__Song__GenreAssignment_9 : ( ruleGenre ) ;
    public final void rule__Song__GenreAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2406:1: ( ( ruleGenre ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2407:1: ( ruleGenre )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2407:1: ( ruleGenre )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2408:1: ruleGenre
            {
             before(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleGenre_in_rule__Song__GenreAssignment_94783);
            ruleGenre();

            state._fsp--;

             after(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__GenreAssignment_9"


    // $ANTLR start "rule__Song__PriceAssignment_11"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2417:1: rule__Song__PriceAssignment_11 : ( RULE_DOUBLE ) ;
    public final void rule__Song__PriceAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2421:1: ( ( RULE_DOUBLE ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2422:1: ( RULE_DOUBLE )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2422:1: ( RULE_DOUBLE )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2423:1: RULE_DOUBLE
            {
             before(grammarAccess.getSongAccess().getPriceDOUBLETerminalRuleCall_11_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Song__PriceAssignment_114814); 
             after(grammarAccess.getSongAccess().getPriceDOUBLETerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Song__PriceAssignment_11"


    // $ANTLR start "rule__Length__MinutesAssignment_0"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2432:1: rule__Length__MinutesAssignment_0 : ( RULE_INT ) ;
    public final void rule__Length__MinutesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2436:1: ( ( RULE_INT ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2437:1: ( RULE_INT )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2437:1: ( RULE_INT )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2438:1: RULE_INT
            {
             before(grammarAccess.getLengthAccess().getMinutesINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Length__MinutesAssignment_04845); 
             after(grammarAccess.getLengthAccess().getMinutesINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__MinutesAssignment_0"


    // $ANTLR start "rule__Length__SecondsAssignment_2"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2447:1: rule__Length__SecondsAssignment_2 : ( RULE_SECONDS ) ;
    public final void rule__Length__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2451:1: ( ( RULE_SECONDS ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2452:1: ( RULE_SECONDS )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2452:1: ( RULE_SECONDS )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2453:1: RULE_SECONDS
            {
             before(grammarAccess.getLengthAccess().getSecondsSECONDSTerminalRuleCall_2_0()); 
            match(input,RULE_SECONDS,FOLLOW_RULE_SECONDS_in_rule__Length__SecondsAssignment_24876); 
             after(grammarAccess.getLengthAccess().getSecondsSECONDSTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Length__SecondsAssignment_2"


    // $ANTLR start "rule__Distributor__NameAssignment_1"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2462:1: rule__Distributor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Distributor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2466:1: ( ( RULE_ID ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2467:1: ( RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2467:1: ( RULE_ID )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2468:1: RULE_ID
            {
             before(grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Distributor__NameAssignment_14907); 
             after(grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__NameAssignment_1"


    // $ANTLR start "rule__Distributor__AddressAssignment_3"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2477:1: rule__Distributor__AddressAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Distributor__AddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2481:1: ( ( RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2482:1: ( RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2482:1: ( RULE_STRING )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2483:1: RULE_STRING
            {
             before(grammarAccess.getDistributorAccess().getAddressSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Distributor__AddressAssignment_34938); 
             after(grammarAccess.getDistributorAccess().getAddressSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__AddressAssignment_3"


    // $ANTLR start "rule__Distributor__IbanAssignment_6"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2492:1: rule__Distributor__IbanAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Distributor__IbanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2496:1: ( ( RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2497:1: ( RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2497:1: ( RULE_STRING )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2498:1: RULE_STRING
            {
             before(grammarAccess.getDistributorAccess().getIbanSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Distributor__IbanAssignment_64969); 
             after(grammarAccess.getDistributorAccess().getIbanSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__IbanAssignment_6"


    // $ANTLR start "rule__Distributor__BicAssignment_8"
    // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2507:1: rule__Distributor__BicAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Distributor__BicAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2511:1: ( ( RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2512:1: ( RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2512:1: ( RULE_STRING )
            // ../at.ac.univie.swa.ase.example.ui/src-gen/at/ac/univie/swa/ase/example/ui/contentassist/antlr/internal/InternalPlaylistDsl.g:2513:1: RULE_STRING
            {
             before(grammarAccess.getDistributorAccess().getBicSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Distributor__BicAssignment_85000); 
             after(grammarAccess.getDistributorAccess().getBicSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distributor__BicAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlaylist_in_entryRulePlaylist121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlaylist128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group__0_in_rulePlaylist154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0_in_ruleLibrary216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Alternatives_in_ruleItem276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__0_in_ruleSong336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLength_in_entryRuleLength363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLength370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__Group__0_in_ruleLength396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributor_in_entryRuleDistributor423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributor430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__0_in_ruleDistributor456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Genre__Alternatives_in_ruleGenre553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ItemAssignment_0_in_rule__Item__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1__0_in_rule__Item__Alternatives607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Genre__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Genre__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Genre__Alternatives683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Genre__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Genre__Alternatives725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Genre__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1840 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__1__Impl871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DistributorsAssignment_2_in_rule__Model__Group__2__Impl934 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Model__DistributorsAssignment_2_in_rule__Model__Group__2__Impl946 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3979 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__3__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SongLibraryAssignment_4_in_rule__Model__Group__4__Impl1073 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__SongLibraryAssignment_4_in_rule__Model__Group__4__Impl1085 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__5__Impl1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PlaylistsAssignment_6_in_rule__Model__Group__6__Impl1207 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Playlist__Group__0__Impl_in_rule__Playlist__Group__01252 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Playlist__Group__1_in_rule__Playlist__Group__01255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__NameAssignment_0_in_rule__Playlist__Group__0__Impl1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group__1__Impl_in_rule__Playlist__Group__11312 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Playlist__Group__2_in_rule__Playlist__Group__11315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Playlist__Group__1__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group__2__Impl_in_rule__Playlist__Group__21374 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Playlist__Group__3_in_rule__Playlist__Group__21377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__ItemsAssignment_2_in_rule__Playlist__Group__2__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group__3__Impl_in_rule__Playlist__Group__31434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group_3__0_in_rule__Playlist__Group__3__Impl1461 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Playlist__Group_3__0__Impl_in_rule__Playlist__Group_3__01500 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Playlist__Group_3__1_in_rule__Playlist__Group_3__01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Playlist__Group_3__0__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__Group_3__1__Impl_in_rule__Playlist__Group_3__11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Playlist__ItemsAssignment_3_1_in_rule__Playlist__Group_3__1__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__01623 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__01626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Library__Group__0__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__11685 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__NameAssignment_1_in_rule__Library__Group__1__Impl1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__21745 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__21748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Library__Group__2__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__31807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Library__SongsAssignment_3_in_rule__Library__Group__3__Impl1834 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1__0__Impl_in_rule__Item__Group_1__01873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Item__Group_1__1_in_rule__Item__Group_1__01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Item__Group_1__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1__1__Impl_in_rule__Item__Group_1__11935 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1__2_in_rule__Item__Group_1__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ItemAssignment_1_1_in_rule__Item__Group_1__1__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1__2__Impl_in_rule__Item__Group_1__21995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__0_in_rule__Item__Group_1__2__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__0__Impl_in_rule__Item__Group_1_2__02059 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__1_in_rule__Item__Group_1_2__02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Item__Group_1_2__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__1__Impl_in_rule__Item__Group_1_2__12121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__2_in_rule__Item__Group_1_2__12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Item__Group_1_2__1__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__2__Impl_in_rule__Item__Group_1_2__22183 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__3_in_rule__Item__Group_1_2__22186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ExcludedAssignment_1_2_2_in_rule__Item__Group_1_2__2__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__3__Impl_in_rule__Item__Group_1_2__32243 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__4_in_rule__Item__Group_1_2__32246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2_3__0_in_rule__Item__Group_1_2__3__Impl2273 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2__4__Impl_in_rule__Item__Group_1_2__42304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Item__Group_1_2__4__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2_3__0__Impl_in_rule__Item__Group_1_2_3__02373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2_3__1_in_rule__Item__Group_1_2_3__02376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Item__Group_1_2_3__0__Impl2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__Group_1_2_3__1__Impl_in_rule__Item__Group_1_2_3__12435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Item__ExcludedAssignment_1_2_3_1_in_rule__Item__Group_1_2_3__1__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__0__Impl_in_rule__Song__Group__02496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Song__Group__1_in_rule__Song__Group__02499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Song__Group__0__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__1__Impl_in_rule__Song__Group__12558 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Song__Group__2_in_rule__Song__Group__12561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__NameAssignment_1_in_rule__Song__Group__1__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__2__Impl_in_rule__Song__Group__22618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Song__Group__3_in_rule__Song__Group__22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Song__Group__2__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__3__Impl_in_rule__Song__Group__32680 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Song__Group__4_in_rule__Song__Group__32683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__ArtistAssignment_3_in_rule__Song__Group__3__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__4__Impl_in_rule__Song__Group__42740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Song__Group__5_in_rule__Song__Group__42743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Song__Group__4__Impl2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__5__Impl_in_rule__Song__Group__52802 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Song__Group__6_in_rule__Song__Group__52805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__DistributorAssignment_5_in_rule__Song__Group__5__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__6__Impl_in_rule__Song__Group__62862 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Song__Group__7_in_rule__Song__Group__62865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Song__Group__6__Impl2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__7__Impl_in_rule__Song__Group__72924 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Song__Group__8_in_rule__Song__Group__72927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__LengthAssignment_7_in_rule__Song__Group__7__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__8__Impl_in_rule__Song__Group__82984 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Song__Group__9_in_rule__Song__Group__82987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Song__Group__8__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__9__Impl_in_rule__Song__Group__93046 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Song__Group__10_in_rule__Song__Group__93049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__GenreAssignment_9_in_rule__Song__Group__9__Impl3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__10__Impl_in_rule__Song__Group__103106 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Song__Group__11_in_rule__Song__Group__103109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Song__Group__10__Impl3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__Group__11__Impl_in_rule__Song__Group__113168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Song__PriceAssignment_11_in_rule__Song__Group__11__Impl3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__Group__0__Impl_in_rule__Length__Group__03249 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Length__Group__1_in_rule__Length__Group__03252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__MinutesAssignment_0_in_rule__Length__Group__0__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__Group__1__Impl_in_rule__Length__Group__13309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Length__Group__2_in_rule__Length__Group__13312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Length__Group__1__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__Group__2__Impl_in_rule__Length__Group__23371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Length__SecondsAssignment_2_in_rule__Length__Group__2__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__0__Impl_in_rule__Distributor__Group__03434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Distributor__Group__1_in_rule__Distributor__Group__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Distributor__Group__0__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__1__Impl_in_rule__Distributor__Group__13496 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Distributor__Group__2_in_rule__Distributor__Group__13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__NameAssignment_1_in_rule__Distributor__Group__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__2__Impl_in_rule__Distributor__Group__23556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Distributor__Group__3_in_rule__Distributor__Group__23559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Distributor__Group__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__3__Impl_in_rule__Distributor__Group__33618 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Distributor__Group__4_in_rule__Distributor__Group__33621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__AddressAssignment_3_in_rule__Distributor__Group__3__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__4__Impl_in_rule__Distributor__Group__43678 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Distributor__Group__5_in_rule__Distributor__Group__43681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Distributor__Group__4__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__5__Impl_in_rule__Distributor__Group__53740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Distributor__Group__6_in_rule__Distributor__Group__53743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Distributor__Group__5__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__6__Impl_in_rule__Distributor__Group__63802 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Distributor__Group__7_in_rule__Distributor__Group__63805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__IbanAssignment_6_in_rule__Distributor__Group__6__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__7__Impl_in_rule__Distributor__Group__73862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Distributor__Group__8_in_rule__Distributor__Group__73865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Distributor__Group__7__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__Group__8__Impl_in_rule__Distributor__Group__83924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Distributor__BicAssignment_8_in_rule__Distributor__Group__8__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03999 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__04002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__14058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl4085 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FQN__Group_1__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributor_in_rule__Model__DistributorsAssignment_24247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLibrary_in_rule__Model__SongLibraryAssignment_44278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlaylist_in_rule__Model__PlaylistsAssignment_64309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Playlist__NameAssignment_04340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Playlist__ItemsAssignment_24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItem_in_rule__Playlist__ItemsAssignment_3_14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Library__NameAssignment_14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_rule__Library__SongsAssignment_34464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Item__ItemAssignment_04499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Item__ItemAssignment_1_14538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Item__ExcludedAssignment_1_2_24577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Item__ExcludedAssignment_1_2_3_14616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Song__NameAssignment_14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Song__ArtistAssignment_34682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Song__DistributorAssignment_54717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLength_in_rule__Song__LengthAssignment_74752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenre_in_rule__Song__GenreAssignment_94783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Song__PriceAssignment_114814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Length__MinutesAssignment_04845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SECONDS_in_rule__Length__SecondsAssignment_24876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Distributor__NameAssignment_14907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Distributor__AddressAssignment_34938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Distributor__IbanAssignment_64969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Distributor__BicAssignment_85000 = new BitSet(new long[]{0x0000000000000002L});

}