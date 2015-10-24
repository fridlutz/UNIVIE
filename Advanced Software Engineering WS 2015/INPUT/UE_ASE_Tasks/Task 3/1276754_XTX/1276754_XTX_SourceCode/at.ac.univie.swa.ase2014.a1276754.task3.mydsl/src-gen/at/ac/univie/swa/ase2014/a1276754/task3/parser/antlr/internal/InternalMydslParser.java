package at.ac.univie.swa.ase2014.a1276754.task3.parser.antlr.internal; 

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
import at.ac.univie.swa.ase2014.a1276754.task3.services.MydslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMydslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Distributors:'", "'Library:'", "'Playlists:'", "'Address:'", "'Account Information:'", "'IBAN:'", "'BIC:'", "'sung by'", "'produced by'", "'length:'", "'genre:'", "'price:'", "':'", "'.'", "' consists of'", "','", "'Playlist'", "'without'", "'POP'", "'ROCK'", "'HARDROCK'", "'CLASSIC'", "'FOLK'", "'OTHER'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMydslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMydslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMydslParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g"; }



     	private MydslGrammarAccess grammarAccess;
     	
        public InternalMydslParser(TokenStream input, MydslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MydslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Distributors:' ( (lv_distributors_1_0= ruleDistributor ) )+ otherlv_2= 'Library:' ( (lv_songs_3_0= ruleSong ) )+ otherlv_4= 'Playlists:' ( (lv_playlists_5_0= rulePlaylist ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_distributors_1_0 = null;

        EObject lv_songs_3_0 = null;

        EObject lv_playlists_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:80:28: ( (otherlv_0= 'Distributors:' ( (lv_distributors_1_0= ruleDistributor ) )+ otherlv_2= 'Library:' ( (lv_songs_3_0= ruleSong ) )+ otherlv_4= 'Playlists:' ( (lv_playlists_5_0= rulePlaylist ) )* ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:81:1: (otherlv_0= 'Distributors:' ( (lv_distributors_1_0= ruleDistributor ) )+ otherlv_2= 'Library:' ( (lv_songs_3_0= ruleSong ) )+ otherlv_4= 'Playlists:' ( (lv_playlists_5_0= rulePlaylist ) )* )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:81:1: (otherlv_0= 'Distributors:' ( (lv_distributors_1_0= ruleDistributor ) )+ otherlv_2= 'Library:' ( (lv_songs_3_0= ruleSong ) )+ otherlv_4= 'Playlists:' ( (lv_playlists_5_0= rulePlaylist ) )* )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:81:3: otherlv_0= 'Distributors:' ( (lv_distributors_1_0= ruleDistributor ) )+ otherlv_2= 'Library:' ( (lv_songs_3_0= ruleSong ) )+ otherlv_4= 'Playlists:' ( (lv_playlists_5_0= rulePlaylist ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDistributorsKeyword_0());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:85:1: ( (lv_distributors_1_0= ruleDistributor ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:86:1: (lv_distributors_1_0= ruleDistributor )
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:86:1: (lv_distributors_1_0= ruleDistributor )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:87:3: lv_distributors_1_0= ruleDistributor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDistributorsDistributorParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDistributor_in_ruleModel143);
            	    lv_distributors_1_0=ruleDistributor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"distributors",
            	            		lv_distributors_1_0, 
            	            		"Distributor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLibraryKeyword_2());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:107:1: ( (lv_songs_3_0= ruleSong ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:108:1: (lv_songs_3_0= ruleSong )
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:108:1: (lv_songs_3_0= ruleSong )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:109:3: lv_songs_3_0= ruleSong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSongsSongParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSong_in_ruleModel177);
            	    lv_songs_3_0=ruleSong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"songs",
            	            		lv_songs_3_0, 
            	            		"Song");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getPlaylistsKeyword_4());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:129:1: ( (lv_playlists_5_0= rulePlaylist ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:130:1: (lv_playlists_5_0= rulePlaylist )
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:130:1: (lv_playlists_5_0= rulePlaylist )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:131:3: lv_playlists_5_0= rulePlaylist
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlaylistsPlaylistParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlaylist_in_ruleModel211);
            	    lv_playlists_5_0=rulePlaylist();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"playlists",
            	            		lv_playlists_5_0, 
            	            		"Playlist");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDistributor"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:155:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:156:2: (iv_ruleDistributor= ruleDistributor EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:157:2: iv_ruleDistributor= ruleDistributor EOF
            {
             newCompositeNode(grammarAccess.getDistributorRule()); 
            pushFollow(FOLLOW_ruleDistributor_in_entryRuleDistributor248);
            iv_ruleDistributor=ruleDistributor();

            state._fsp--;

             current =iv_ruleDistributor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributor258); 

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
    // $ANTLR end "entryRuleDistributor"


    // $ANTLR start "ruleDistributor"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:164:1: ruleDistributor returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Address:' ( (lv_adresse_2_0= RULE_STRING ) ) otherlv_3= 'Account Information:' ( (lv_acc_info_4_0= ruleAccount_Information ) ) ) ;
    public final EObject ruleDistributor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_adresse_2_0=null;
        Token otherlv_3=null;
        EObject lv_acc_info_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:167:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Address:' ( (lv_adresse_2_0= RULE_STRING ) ) otherlv_3= 'Account Information:' ( (lv_acc_info_4_0= ruleAccount_Information ) ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:168:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Address:' ( (lv_adresse_2_0= RULE_STRING ) ) otherlv_3= 'Account Information:' ( (lv_acc_info_4_0= ruleAccount_Information ) ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:168:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Address:' ( (lv_adresse_2_0= RULE_STRING ) ) otherlv_3= 'Account Information:' ( (lv_acc_info_4_0= ruleAccount_Information ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:168:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Address:' ( (lv_adresse_2_0= RULE_STRING ) ) otherlv_3= 'Account Information:' ( (lv_acc_info_4_0= ruleAccount_Information ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:168:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:169:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:169:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:170:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDistributor300); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDistributor317); 

                	newLeafNode(otherlv_1, grammarAccess.getDistributorAccess().getAddressKeyword_1());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:190:1: ( (lv_adresse_2_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:191:1: (lv_adresse_2_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:191:1: (lv_adresse_2_0= RULE_STRING )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:192:3: lv_adresse_2_0= RULE_STRING
            {
            lv_adresse_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDistributor334); 

            			newLeafNode(lv_adresse_2_0, grammarAccess.getDistributorAccess().getAdresseSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"adresse",
                    		lv_adresse_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDistributor351); 

                	newLeafNode(otherlv_3, grammarAccess.getDistributorAccess().getAccountInformationKeyword_3());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:212:1: ( (lv_acc_info_4_0= ruleAccount_Information ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:213:1: (lv_acc_info_4_0= ruleAccount_Information )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:213:1: (lv_acc_info_4_0= ruleAccount_Information )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:214:3: lv_acc_info_4_0= ruleAccount_Information
            {
             
            	        newCompositeNode(grammarAccess.getDistributorAccess().getAcc_infoAccount_InformationParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAccount_Information_in_ruleDistributor372);
            lv_acc_info_4_0=ruleAccount_Information();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistributorRule());
            	        }
                   		set(
                   			current, 
                   			"acc_info",
                    		lv_acc_info_4_0, 
                    		"Account_Information");
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
    // $ANTLR end "ruleDistributor"


    // $ANTLR start "entryRuleAccount_Information"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:238:1: entryRuleAccount_Information returns [EObject current=null] : iv_ruleAccount_Information= ruleAccount_Information EOF ;
    public final EObject entryRuleAccount_Information() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccount_Information = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:239:2: (iv_ruleAccount_Information= ruleAccount_Information EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:240:2: iv_ruleAccount_Information= ruleAccount_Information EOF
            {
             newCompositeNode(grammarAccess.getAccount_InformationRule()); 
            pushFollow(FOLLOW_ruleAccount_Information_in_entryRuleAccount_Information408);
            iv_ruleAccount_Information=ruleAccount_Information();

            state._fsp--;

             current =iv_ruleAccount_Information; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccount_Information418); 

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
    // $ANTLR end "entryRuleAccount_Information"


    // $ANTLR start "ruleAccount_Information"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:247:1: ruleAccount_Information returns [EObject current=null] : (otherlv_0= 'IBAN:' ( (lv_iban_1_0= RULE_STRING ) ) otherlv_2= 'BIC:' ( (lv_bic_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAccount_Information() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iban_1_0=null;
        Token otherlv_2=null;
        Token lv_bic_3_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:250:28: ( (otherlv_0= 'IBAN:' ( (lv_iban_1_0= RULE_STRING ) ) otherlv_2= 'BIC:' ( (lv_bic_3_0= RULE_STRING ) ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:251:1: (otherlv_0= 'IBAN:' ( (lv_iban_1_0= RULE_STRING ) ) otherlv_2= 'BIC:' ( (lv_bic_3_0= RULE_STRING ) ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:251:1: (otherlv_0= 'IBAN:' ( (lv_iban_1_0= RULE_STRING ) ) otherlv_2= 'BIC:' ( (lv_bic_3_0= RULE_STRING ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:251:3: otherlv_0= 'IBAN:' ( (lv_iban_1_0= RULE_STRING ) ) otherlv_2= 'BIC:' ( (lv_bic_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAccount_Information455); 

                	newLeafNode(otherlv_0, grammarAccess.getAccount_InformationAccess().getIBANKeyword_0());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:255:1: ( (lv_iban_1_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:256:1: (lv_iban_1_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:256:1: (lv_iban_1_0= RULE_STRING )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:257:3: lv_iban_1_0= RULE_STRING
            {
            lv_iban_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAccount_Information472); 

            			newLeafNode(lv_iban_1_0, grammarAccess.getAccount_InformationAccess().getIbanSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAccount_InformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iban",
                    		lv_iban_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAccount_Information489); 

                	newLeafNode(otherlv_2, grammarAccess.getAccount_InformationAccess().getBICKeyword_2());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:277:1: ( (lv_bic_3_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:278:1: (lv_bic_3_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:278:1: (lv_bic_3_0= RULE_STRING )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:279:3: lv_bic_3_0= RULE_STRING
            {
            lv_bic_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAccount_Information506); 

            			newLeafNode(lv_bic_3_0, grammarAccess.getAccount_InformationAccess().getBicSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAccount_InformationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bic",
                    		lv_bic_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAccount_Information"


    // $ANTLR start "entryRuleSong"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:303:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:304:2: (iv_ruleSong= ruleSong EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:305:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong547);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong557); 

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
    // $ANTLR end "entryRuleSong"


    // $ANTLR start "ruleSong"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:312:1: ruleSong returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'sung by' ( (lv_artist_2_0= RULE_STRING ) ) otherlv_3= 'produced by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'length:' ( (lv_length_6_0= ruleTime ) ) otherlv_7= 'genre:' ( (lv_genre_8_0= ruleGenre ) ) otherlv_9= 'price:' ( (lv_price_10_0= ruleDouble ) ) ) ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_artist_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_length_6_0 = null;

        Enumerator lv_genre_8_0 = null;

        AntlrDatatypeRuleToken lv_price_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:315:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'sung by' ( (lv_artist_2_0= RULE_STRING ) ) otherlv_3= 'produced by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'length:' ( (lv_length_6_0= ruleTime ) ) otherlv_7= 'genre:' ( (lv_genre_8_0= ruleGenre ) ) otherlv_9= 'price:' ( (lv_price_10_0= ruleDouble ) ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:316:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'sung by' ( (lv_artist_2_0= RULE_STRING ) ) otherlv_3= 'produced by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'length:' ( (lv_length_6_0= ruleTime ) ) otherlv_7= 'genre:' ( (lv_genre_8_0= ruleGenre ) ) otherlv_9= 'price:' ( (lv_price_10_0= ruleDouble ) ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:316:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'sung by' ( (lv_artist_2_0= RULE_STRING ) ) otherlv_3= 'produced by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'length:' ( (lv_length_6_0= ruleTime ) ) otherlv_7= 'genre:' ( (lv_genre_8_0= ruleGenre ) ) otherlv_9= 'price:' ( (lv_price_10_0= ruleDouble ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:316:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'sung by' ( (lv_artist_2_0= RULE_STRING ) ) otherlv_3= 'produced by' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'length:' ( (lv_length_6_0= ruleTime ) ) otherlv_7= 'genre:' ( (lv_genre_8_0= ruleGenre ) ) otherlv_9= 'price:' ( (lv_price_10_0= ruleDouble ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:316:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:317:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:317:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:318:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSong599); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSongAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSong616); 

                	newLeafNode(otherlv_1, grammarAccess.getSongAccess().getSungByKeyword_1());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:338:1: ( (lv_artist_2_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:339:1: (lv_artist_2_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:339:1: (lv_artist_2_0= RULE_STRING )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:340:3: lv_artist_2_0= RULE_STRING
            {
            lv_artist_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSong633); 

            			newLeafNode(lv_artist_2_0, grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"artist",
                    		lv_artist_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSong650); 

                	newLeafNode(otherlv_3, grammarAccess.getSongAccess().getProducedByKeyword_3());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:360:1: ( (otherlv_4= RULE_ID ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:361:1: (otherlv_4= RULE_ID )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:361:1: (otherlv_4= RULE_ID )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:362:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSong670); 

            		newLeafNode(otherlv_4, grammarAccess.getSongAccess().getDistDistributorCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSong682); 

                	newLeafNode(otherlv_5, grammarAccess.getSongAccess().getLengthKeyword_5());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:377:1: ( (lv_length_6_0= ruleTime ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:378:1: (lv_length_6_0= ruleTime )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:378:1: (lv_length_6_0= ruleTime )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:379:3: lv_length_6_0= ruleTime
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getLengthTimeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTime_in_ruleSong703);
            lv_length_6_0=ruleTime();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_6_0, 
                    		"Time");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleSong715); 

                	newLeafNode(otherlv_7, grammarAccess.getSongAccess().getGenreKeyword_7());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:399:1: ( (lv_genre_8_0= ruleGenre ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:400:1: (lv_genre_8_0= ruleGenre )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:400:1: (lv_genre_8_0= ruleGenre )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:401:3: lv_genre_8_0= ruleGenre
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleGenre_in_ruleSong736);
            lv_genre_8_0=ruleGenre();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		set(
                   			current, 
                   			"genre",
                    		lv_genre_8_0, 
                    		"Genre");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleSong748); 

                	newLeafNode(otherlv_9, grammarAccess.getSongAccess().getPriceKeyword_9());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:421:1: ( (lv_price_10_0= ruleDouble ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:422:1: (lv_price_10_0= ruleDouble )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:422:1: (lv_price_10_0= ruleDouble )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:423:3: lv_price_10_0= ruleDouble
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getPriceDoubleParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleDouble_in_ruleSong769);
            lv_price_10_0=ruleDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		set(
                   			current, 
                   			"price",
                    		lv_price_10_0, 
                    		"Double");
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
    // $ANTLR end "ruleSong"


    // $ANTLR start "entryRuleTime"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:447:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:448:2: (iv_ruleTime= ruleTime EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:449:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_ruleTime_in_entryRuleTime805);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTime815); 

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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:456:1: ruleTime returns [EObject current=null] : ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_sec_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token otherlv_1=null;
        Token lv_sec_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:459:28: ( ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_sec_2_0= RULE_INT ) ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:460:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_sec_2_0= RULE_INT ) ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:460:1: ( ( (lv_min_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_sec_2_0= RULE_INT ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:460:2: ( (lv_min_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_sec_2_0= RULE_INT ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:460:2: ( (lv_min_0_0= RULE_INT ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:461:1: (lv_min_0_0= RULE_INT )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:461:1: (lv_min_0_0= RULE_INT )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:462:3: lv_min_0_0= RULE_INT
            {
            lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTime857); 

            			newLeafNode(lv_min_0_0, grammarAccess.getTimeAccess().getMinINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTime874); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getColonKeyword_1());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:482:1: ( (lv_sec_2_0= RULE_INT ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:483:1: (lv_sec_2_0= RULE_INT )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:483:1: (lv_sec_2_0= RULE_INT )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:484:3: lv_sec_2_0= RULE_INT
            {
            lv_sec_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTime891); 

            			newLeafNode(lv_sec_2_0, grammarAccess.getTimeAccess().getSecINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sec",
                    		lv_sec_2_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleDouble"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:508:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:509:2: (iv_ruleDouble= ruleDouble EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:510:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_ruleDouble_in_entryRuleDouble933);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDouble944); 

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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:517:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:520:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:521:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:521:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:521:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble984); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
                
            kw=(Token)match(input,24,FOLLOW_24_in_ruleDouble1002); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble1017); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRulePlaylist"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:549:1: entryRulePlaylist returns [EObject current=null] : iv_rulePlaylist= rulePlaylist EOF ;
    public final EObject entryRulePlaylist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaylist = null;


        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:550:2: (iv_rulePlaylist= rulePlaylist EOF )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:551:2: iv_rulePlaylist= rulePlaylist EOF
            {
             newCompositeNode(grammarAccess.getPlaylistRule()); 
            pushFollow(FOLLOW_rulePlaylist_in_entryRulePlaylist1062);
            iv_rulePlaylist=rulePlaylist();

            state._fsp--;

             current =iv_rulePlaylist; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlaylist1072); 

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
    // $ANTLR end "entryRulePlaylist"


    // $ANTLR start "rulePlaylist"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:558:1: rulePlaylist returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' consists of' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )* ) ;
    public final EObject rulePlaylist() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:561:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' consists of' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )* ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:562:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' consists of' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )* )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:562:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' consists of' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )* )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:562:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ' consists of' ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )* ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )*
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:562:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:563:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:563:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:564:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist1114); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPlaylistAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaylistRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_rulePlaylist1131); 

                	newLeafNode(otherlv_1, grammarAccess.getPlaylistAccess().getConsistsOfKeyword_1());
                
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:584:1: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= ',' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==26) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:584:2: ( (otherlv_2= RULE_ID ) ) otherlv_3= ','
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:584:2: ( (otherlv_2= RULE_ID ) )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:585:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:585:1: (otherlv_2= RULE_ID )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:586:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlaylistRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist1152); 

            	    		newLeafNode(otherlv_2, grammarAccess.getPlaylistAccess().getSongsSongCrossReference_2_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_rulePlaylist1164); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPlaylistAccess().getCommaKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:601:3: ( (otherlv_4= RULE_ID ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==27) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:602:1: (otherlv_4= RULE_ID )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:602:1: (otherlv_4= RULE_ID )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:603:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPlaylistRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist1186); 

                    		newLeafNode(otherlv_4, grammarAccess.getPlaylistAccess().getSongsSongCrossReference_3_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:614:3: (otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:614:5: otherlv_5= 'Playlist' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )?
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_rulePlaylist1200); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPlaylistAccess().getPlaylistKeyword_4_0());
            	        
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:618:1: ( (otherlv_6= RULE_ID ) )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:619:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:619:1: (otherlv_6= RULE_ID )
            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:620:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlaylistRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist1220); 

            	    		newLeafNode(otherlv_6, grammarAccess.getPlaylistAccess().getInclPlaylistCrossReference_4_1_0()); 
            	    	

            	    }


            	    }

            	    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:631:2: (otherlv_7= 'without' ( (otherlv_8= RULE_ID ) ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==28) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:631:4: otherlv_7= 'without' ( (otherlv_8= RULE_ID ) )
            	            {
            	            otherlv_7=(Token)match(input,28,FOLLOW_28_in_rulePlaylist1233); 

            	                	newLeafNode(otherlv_7, grammarAccess.getPlaylistAccess().getWithoutKeyword_4_2_0());
            	                
            	            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:635:1: ( (otherlv_8= RULE_ID ) )
            	            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:636:1: (otherlv_8= RULE_ID )
            	            {
            	            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:636:1: (otherlv_8= RULE_ID )
            	            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:637:3: otherlv_8= RULE_ID
            	            {

            	            			if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPlaylistRule());
            	            	        }
            	                    
            	            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist1253); 

            	            		newLeafNode(otherlv_8, grammarAccess.getPlaylistAccess().getExclSongCrossReference_4_2_1_0()); 
            	            	

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "rulePlaylist"


    // $ANTLR start "ruleGenre"
    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:656:1: ruleGenre returns [Enumerator current=null] : ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) ) ;
    public final Enumerator ruleGenre() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:658:28: ( ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) ) )
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:659:1: ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) )
            {
            // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:659:1: ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 33:
                {
                alt8=5;
                }
                break;
            case 34:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:659:2: (enumLiteral_0= 'POP' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:659:2: (enumLiteral_0= 'POP' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:659:4: enumLiteral_0= 'POP'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleGenre1307); 

                            current = grammarAccess.getGenreAccess().getPopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenreAccess().getPopEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:665:6: (enumLiteral_1= 'ROCK' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:665:6: (enumLiteral_1= 'ROCK' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:665:8: enumLiteral_1= 'ROCK'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleGenre1324); 

                            current = grammarAccess.getGenreAccess().getRockEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenreAccess().getRockEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:671:6: (enumLiteral_2= 'HARDROCK' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:671:6: (enumLiteral_2= 'HARDROCK' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:671:8: enumLiteral_2= 'HARDROCK'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleGenre1341); 

                            current = grammarAccess.getGenreAccess().getHardrockEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenreAccess().getHardrockEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:677:6: (enumLiteral_3= 'CLASSIC' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:677:6: (enumLiteral_3= 'CLASSIC' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:677:8: enumLiteral_3= 'CLASSIC'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleGenre1358); 

                            current = grammarAccess.getGenreAccess().getClassicEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGenreAccess().getClassicEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:683:6: (enumLiteral_4= 'FOLK' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:683:6: (enumLiteral_4= 'FOLK' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:683:8: enumLiteral_4= 'FOLK'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_33_in_ruleGenre1375); 

                            current = grammarAccess.getGenreAccess().getFolkEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getGenreAccess().getFolkEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:689:6: (enumLiteral_5= 'OTHER' )
                    {
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:689:6: (enumLiteral_5= 'OTHER' )
                    // ../at.ac.univie.swa.ase2014.a1276754.task3.mydsl/src-gen/at/ac/univie/swa/ase2014/a1276754/task3/parser/antlr/internal/InternalMydsl.g:689:8: enumLiteral_5= 'OTHER'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_34_in_ruleGenre1392); 

                            current = grammarAccess.getGenreAccess().getOtherEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getGenreAccess().getOtherEnumLiteralDeclaration_5()); 
                        

                    }


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
    // $ANTLR end "ruleGenre"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDistributor_in_ruleModel143 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSong_in_ruleModel177 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePlaylist_in_ruleModel211 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDistributor_in_entryRuleDistributor248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributor258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDistributor300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDistributor317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDistributor334 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDistributor351 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAccount_Information_in_ruleDistributor372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccount_Information_in_entryRuleAccount_Information408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccount_Information418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAccount_Information455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAccount_Information472 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAccount_Information489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAccount_Information506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSong599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSong616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSong633 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSong650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSong670 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSong682 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTime_in_ruleSong703 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSong715 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_ruleGenre_in_ruleSong736 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSong748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleSong769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTime_in_entryRuleTime805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTime815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTime857 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTime874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTime891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_entryRuleDouble933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDouble944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble984 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDouble1002 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlaylist_in_entryRulePlaylist1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlaylist1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist1114 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePlaylist1131 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist1152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePlaylist1164 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist1186 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePlaylist1200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist1220 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_28_in_rulePlaylist1233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist1253 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_29_in_ruleGenre1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGenre1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleGenre1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGenre1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGenre1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGenre1392 = new BitSet(new long[]{0x0000000000000002L});

}