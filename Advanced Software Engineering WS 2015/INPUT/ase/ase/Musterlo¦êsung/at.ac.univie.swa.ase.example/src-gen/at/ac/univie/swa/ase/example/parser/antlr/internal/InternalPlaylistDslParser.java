package at.ac.univie.swa.ase.example.parser.antlr.internal; 

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
import at.ac.univie.swa.ase.example.services.PlaylistDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlaylistDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DOUBLE", "RULE_INT", "RULE_SECONDS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Distributors:'", "'Library:'", "'Playlists:'", "'consists of'", "','", "'Library '", "':'", "'list'", "'without'", "'('", "')'", "'Song'", "'sung by'", "'produced by'", "'length:'", "'genre:'", "'price:'", "'Distributor'", "'Address:'", "'Account Information:'", "'IBAN:'", "'BIC:'", "'.'", "'POP'", "'ROCK'", "'HARDROCK'", "'CLASSIC'", "'FOLK'", "'OTHER'"
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
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g"; }



     	private PlaylistDslGrammarAccess grammarAccess;
     	
        public InternalPlaylistDslParser(TokenStream input, PlaylistDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PlaylistDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Distributors:' ( (lv_distributors_2_0= ruleDistributor ) )+ otherlv_3= 'Library:' ( (lv_songLibrary_4_0= ruleLibrary ) )+ otherlv_5= 'Playlists:' ( (lv_playlists_6_0= rulePlaylist ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_distributors_2_0 = null;

        EObject lv_songLibrary_4_0 = null;

        EObject lv_playlists_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:80:28: ( ( () otherlv_1= 'Distributors:' ( (lv_distributors_2_0= ruleDistributor ) )+ otherlv_3= 'Library:' ( (lv_songLibrary_4_0= ruleLibrary ) )+ otherlv_5= 'Playlists:' ( (lv_playlists_6_0= rulePlaylist ) )* ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:81:1: ( () otherlv_1= 'Distributors:' ( (lv_distributors_2_0= ruleDistributor ) )+ otherlv_3= 'Library:' ( (lv_songLibrary_4_0= ruleLibrary ) )+ otherlv_5= 'Playlists:' ( (lv_playlists_6_0= rulePlaylist ) )* )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:81:1: ( () otherlv_1= 'Distributors:' ( (lv_distributors_2_0= ruleDistributor ) )+ otherlv_3= 'Library:' ( (lv_songLibrary_4_0= ruleLibrary ) )+ otherlv_5= 'Playlists:' ( (lv_playlists_6_0= rulePlaylist ) )* )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:81:2: () otherlv_1= 'Distributors:' ( (lv_distributors_2_0= ruleDistributor ) )+ otherlv_3= 'Library:' ( (lv_songLibrary_4_0= ruleLibrary ) )+ otherlv_5= 'Playlists:' ( (lv_playlists_6_0= rulePlaylist ) )*
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:81:2: ()
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDistributorsKeyword_1());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:91:1: ( (lv_distributors_2_0= ruleDistributor ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:92:1: (lv_distributors_2_0= ruleDistributor )
            	    {
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:92:1: (lv_distributors_2_0= ruleDistributor )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:93:3: lv_distributors_2_0= ruleDistributor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDistributorsDistributorParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDistributor_in_ruleModel152);
            	    lv_distributors_2_0=ruleDistributor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"distributors",
            	            		lv_distributors_2_0, 
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleModel165); 

                	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLibraryKeyword_3());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:113:1: ( (lv_songLibrary_4_0= ruleLibrary ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:114:1: (lv_songLibrary_4_0= ruleLibrary )
            	    {
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:114:1: (lv_songLibrary_4_0= ruleLibrary )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:115:3: lv_songLibrary_4_0= ruleLibrary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSongLibraryLibraryParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLibrary_in_ruleModel186);
            	    lv_songLibrary_4_0=ruleLibrary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"songLibrary",
            	            		lv_songLibrary_4_0, 
            	            		"Library");
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleModel199); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getPlaylistsKeyword_5());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:135:1: ( (lv_playlists_6_0= rulePlaylist ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:136:1: (lv_playlists_6_0= rulePlaylist )
            	    {
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:136:1: (lv_playlists_6_0= rulePlaylist )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:137:3: lv_playlists_6_0= rulePlaylist
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPlaylistsPlaylistParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlaylist_in_ruleModel220);
            	    lv_playlists_6_0=rulePlaylist();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"playlists",
            	            		lv_playlists_6_0, 
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


    // $ANTLR start "entryRulePlaylist"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:161:1: entryRulePlaylist returns [EObject current=null] : iv_rulePlaylist= rulePlaylist EOF ;
    public final EObject entryRulePlaylist() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaylist = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:162:2: (iv_rulePlaylist= rulePlaylist EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:163:2: iv_rulePlaylist= rulePlaylist EOF
            {
             newCompositeNode(grammarAccess.getPlaylistRule()); 
            pushFollow(FOLLOW_rulePlaylist_in_entryRulePlaylist257);
            iv_rulePlaylist=rulePlaylist();

            state._fsp--;

             current =iv_rulePlaylist; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlaylist267); 

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
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:170:1: rulePlaylist returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'consists of' ( (lv_items_2_0= ruleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )* ) ;
    public final EObject rulePlaylist() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:173:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'consists of' ( (lv_items_2_0= ruleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )* ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:174:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'consists of' ( (lv_items_2_0= ruleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )* )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:174:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'consists of' ( (lv_items_2_0= ruleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )* )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:174:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'consists of' ( (lv_items_2_0= ruleItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )*
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:174:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:175:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:175:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:176:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlaylist309); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePlaylist326); 

                	newLeafNode(otherlv_1, grammarAccess.getPlaylistAccess().getConsistsOfKeyword_1());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:196:1: ( (lv_items_2_0= ruleItem ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:197:1: (lv_items_2_0= ruleItem )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:197:1: (lv_items_2_0= ruleItem )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:198:3: lv_items_2_0= ruleItem
            {
             
            	        newCompositeNode(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleItem_in_rulePlaylist347);
            lv_items_2_0=ruleItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPlaylistRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_2_0, 
                    		"Item");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:214:2: (otherlv_3= ',' ( (lv_items_4_0= ruleItem ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:214:4: otherlv_3= ',' ( (lv_items_4_0= ruleItem ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePlaylist360); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPlaylistAccess().getCommaKeyword_3_0());
            	        
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:218:1: ( (lv_items_4_0= ruleItem ) )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:219:1: (lv_items_4_0= ruleItem )
            	    {
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:219:1: (lv_items_4_0= ruleItem )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:220:3: lv_items_4_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlaylistAccess().getItemsItemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_rulePlaylist381);
            	    lv_items_4_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlaylistRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleLibrary"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:246:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:247:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:248:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_ruleLibrary_in_entryRuleLibrary421);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLibrary431); 

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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:255:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'Library ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_songs_3_0= ruleSong ) )* ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_songs_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:258:28: ( (otherlv_0= 'Library ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_songs_3_0= ruleSong ) )* ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:259:1: (otherlv_0= 'Library ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_songs_3_0= ruleSong ) )* )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:259:1: (otherlv_0= 'Library ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_songs_3_0= ruleSong ) )* )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:259:3: otherlv_0= 'Library ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_songs_3_0= ruleSong ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleLibrary468); 

                	newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:263:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:264:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:264:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLibrary485); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLibraryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLibrary502); 

                	newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getColonKeyword_2());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:285:1: ( (lv_songs_3_0= ruleSong ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:286:1: (lv_songs_3_0= ruleSong )
            	    {
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:286:1: (lv_songs_3_0= ruleSong )
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:287:3: lv_songs_3_0= ruleSong
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLibraryAccess().getSongsSongParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSong_in_ruleLibrary523);
            	    lv_songs_3_0=ruleSong();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
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
            	    break loop5;
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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleItem"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:311:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:312:2: (iv_ruleItem= ruleItem EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:313:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem560);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem570); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:320:1: ruleItem returns [EObject current=null] : ( ( ( ruleFQN ) ) | (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? ) ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:323:28: ( ( ( ( ruleFQN ) ) | (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:324:1: ( ( ( ruleFQN ) ) | (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:324:1: ( ( ( ruleFQN ) ) | (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:324:2: ( ( ruleFQN ) )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:324:2: ( ( ruleFQN ) )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:325:1: ( ruleFQN )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:325:1: ( ruleFQN )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:326:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getItemAccess().getItemSongCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleItem618);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:340:6: (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:340:6: (otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )? )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:340:8: otherlv_1= 'list' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )?
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleItem637); 

                        	newLeafNode(otherlv_1, grammarAccess.getItemAccess().getListKeyword_1_0());
                        
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:344:1: ( (otherlv_2= RULE_ID ) )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:345:1: (otherlv_2= RULE_ID )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:345:1: (otherlv_2= RULE_ID )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:346:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItem657); 

                    		newLeafNode(otherlv_2, grammarAccess.getItemAccess().getItemPlaylistCrossReference_1_1_0()); 
                    	

                    }


                    }

                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:357:2: (otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==21) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:357:4: otherlv_3= 'without' otherlv_4= '(' ( ( ruleFQN ) ) (otherlv_6= ',' ( ( ruleFQN ) ) )* otherlv_8= ')'
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleItem670); 

                                	newLeafNode(otherlv_3, grammarAccess.getItemAccess().getWithoutKeyword_1_2_0());
                                
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleItem682); 

                                	newLeafNode(otherlv_4, grammarAccess.getItemAccess().getLeftParenthesisKeyword_1_2_1());
                                
                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:365:1: ( ( ruleFQN ) )
                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:366:1: ( ruleFQN )
                            {
                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:366:1: ( ruleFQN )
                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:367:3: ruleFQN
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getItemRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFQN_in_ruleItem705);
                            ruleFQN();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:380:2: (otherlv_6= ',' ( ( ruleFQN ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==17) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:380:4: otherlv_6= ',' ( ( ruleFQN ) )
                            	    {
                            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleItem718); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getItemAccess().getCommaKeyword_1_2_3_0());
                            	        
                            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:384:1: ( ( ruleFQN ) )
                            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:385:1: ( ruleFQN )
                            	    {
                            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:385:1: ( ruleFQN )
                            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:386:3: ruleFQN
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getItemRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getItemAccess().getExcludedSongCrossReference_1_2_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFQN_in_ruleItem741);
                            	    ruleFQN();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleItem755); 

                                	newLeafNode(otherlv_8, grammarAccess.getItemAccess().getRightParenthesisKeyword_1_2_4());
                                

                            }
                            break;

                    }


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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleSong"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:411:1: entryRuleSong returns [EObject current=null] : iv_ruleSong= ruleSong EOF ;
    public final EObject entryRuleSong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSong = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:412:2: (iv_ruleSong= ruleSong EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:413:2: iv_ruleSong= ruleSong EOF
            {
             newCompositeNode(grammarAccess.getSongRule()); 
            pushFollow(FOLLOW_ruleSong_in_entryRuleSong794);
            iv_ruleSong=ruleSong();

            state._fsp--;

             current =iv_ruleSong; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSong804); 

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
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:420:1: ruleSong returns [EObject current=null] : (otherlv_0= 'Song' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'sung by' ( (lv_artist_3_0= RULE_STRING ) ) otherlv_4= 'produced by' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'length:' ( (lv_length_7_0= ruleLength ) ) otherlv_8= 'genre:' ( (lv_genre_9_0= ruleGenre ) ) otherlv_10= 'price:' ( (lv_price_11_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleSong() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_artist_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_price_11_0=null;
        EObject lv_length_7_0 = null;

        Enumerator lv_genre_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:423:28: ( (otherlv_0= 'Song' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'sung by' ( (lv_artist_3_0= RULE_STRING ) ) otherlv_4= 'produced by' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'length:' ( (lv_length_7_0= ruleLength ) ) otherlv_8= 'genre:' ( (lv_genre_9_0= ruleGenre ) ) otherlv_10= 'price:' ( (lv_price_11_0= RULE_DOUBLE ) ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:424:1: (otherlv_0= 'Song' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'sung by' ( (lv_artist_3_0= RULE_STRING ) ) otherlv_4= 'produced by' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'length:' ( (lv_length_7_0= ruleLength ) ) otherlv_8= 'genre:' ( (lv_genre_9_0= ruleGenre ) ) otherlv_10= 'price:' ( (lv_price_11_0= RULE_DOUBLE ) ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:424:1: (otherlv_0= 'Song' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'sung by' ( (lv_artist_3_0= RULE_STRING ) ) otherlv_4= 'produced by' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'length:' ( (lv_length_7_0= ruleLength ) ) otherlv_8= 'genre:' ( (lv_genre_9_0= ruleGenre ) ) otherlv_10= 'price:' ( (lv_price_11_0= RULE_DOUBLE ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:424:3: otherlv_0= 'Song' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'sung by' ( (lv_artist_3_0= RULE_STRING ) ) otherlv_4= 'produced by' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'length:' ( (lv_length_7_0= ruleLength ) ) otherlv_8= 'genre:' ( (lv_genre_9_0= ruleGenre ) ) otherlv_10= 'price:' ( (lv_price_11_0= RULE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSong841); 

                	newLeafNode(otherlv_0, grammarAccess.getSongAccess().getSongKeyword_0());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:428:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:429:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:429:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:430:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSong858); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSongAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSong875); 

                	newLeafNode(otherlv_2, grammarAccess.getSongAccess().getSungByKeyword_2());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:450:1: ( (lv_artist_3_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:451:1: (lv_artist_3_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:451:1: (lv_artist_3_0= RULE_STRING )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:452:3: lv_artist_3_0= RULE_STRING
            {
            lv_artist_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSong892); 

            			newLeafNode(lv_artist_3_0, grammarAccess.getSongAccess().getArtistSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"artist",
                    		lv_artist_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleSong909); 

                	newLeafNode(otherlv_4, grammarAccess.getSongAccess().getProducedByKeyword_4());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:472:1: ( (otherlv_5= RULE_ID ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:473:1: (otherlv_5= RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:473:1: (otherlv_5= RULE_ID )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:474:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSong929); 

            		newLeafNode(otherlv_5, grammarAccess.getSongAccess().getDistributorDistributorCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleSong941); 

                	newLeafNode(otherlv_6, grammarAccess.getSongAccess().getLengthKeyword_6());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:489:1: ( (lv_length_7_0= ruleLength ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:490:1: (lv_length_7_0= ruleLength )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:490:1: (lv_length_7_0= ruleLength )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:491:3: lv_length_7_0= ruleLength
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getLengthLengthParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleLength_in_ruleSong962);
            lv_length_7_0=ruleLength();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_7_0, 
                    		"Length");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleSong974); 

                	newLeafNode(otherlv_8, grammarAccess.getSongAccess().getGenreKeyword_8());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:511:1: ( (lv_genre_9_0= ruleGenre ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:512:1: (lv_genre_9_0= ruleGenre )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:512:1: (lv_genre_9_0= ruleGenre )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:513:3: lv_genre_9_0= ruleGenre
            {
             
            	        newCompositeNode(grammarAccess.getSongAccess().getGenreGenreEnumRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleGenre_in_ruleSong995);
            lv_genre_9_0=ruleGenre();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSongRule());
            	        }
                   		set(
                   			current, 
                   			"genre",
                    		lv_genre_9_0, 
                    		"Genre");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleSong1007); 

                	newLeafNode(otherlv_10, grammarAccess.getSongAccess().getPriceKeyword_10());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:533:1: ( (lv_price_11_0= RULE_DOUBLE ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:534:1: (lv_price_11_0= RULE_DOUBLE )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:534:1: (lv_price_11_0= RULE_DOUBLE )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:535:3: lv_price_11_0= RULE_DOUBLE
            {
            lv_price_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleSong1024); 

            			newLeafNode(lv_price_11_0, grammarAccess.getSongAccess().getPriceDOUBLETerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSongRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"price",
                    		lv_price_11_0, 
                    		"DOUBLE");
            	    

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


    // $ANTLR start "entryRuleLength"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:559:1: entryRuleLength returns [EObject current=null] : iv_ruleLength= ruleLength EOF ;
    public final EObject entryRuleLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLength = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:560:2: (iv_ruleLength= ruleLength EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:561:2: iv_ruleLength= ruleLength EOF
            {
             newCompositeNode(grammarAccess.getLengthRule()); 
            pushFollow(FOLLOW_ruleLength_in_entryRuleLength1065);
            iv_ruleLength=ruleLength();

            state._fsp--;

             current =iv_ruleLength; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLength1075); 

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
    // $ANTLR end "entryRuleLength"


    // $ANTLR start "ruleLength"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:568:1: ruleLength returns [EObject current=null] : ( ( (lv_minutes_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_seconds_2_0= RULE_SECONDS ) ) ) ;
    public final EObject ruleLength() throws RecognitionException {
        EObject current = null;

        Token lv_minutes_0_0=null;
        Token otherlv_1=null;
        Token lv_seconds_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:571:28: ( ( ( (lv_minutes_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_seconds_2_0= RULE_SECONDS ) ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:572:1: ( ( (lv_minutes_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_seconds_2_0= RULE_SECONDS ) ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:572:1: ( ( (lv_minutes_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_seconds_2_0= RULE_SECONDS ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:572:2: ( (lv_minutes_0_0= RULE_INT ) ) otherlv_1= ':' ( (lv_seconds_2_0= RULE_SECONDS ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:572:2: ( (lv_minutes_0_0= RULE_INT ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:573:1: (lv_minutes_0_0= RULE_INT )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:573:1: (lv_minutes_0_0= RULE_INT )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:574:3: lv_minutes_0_0= RULE_INT
            {
            lv_minutes_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLength1117); 

            			newLeafNode(lv_minutes_0_0, grammarAccess.getLengthAccess().getMinutesINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLengthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minutes",
                    		lv_minutes_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleLength1134); 

                	newLeafNode(otherlv_1, grammarAccess.getLengthAccess().getColonKeyword_1());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:594:1: ( (lv_seconds_2_0= RULE_SECONDS ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:595:1: (lv_seconds_2_0= RULE_SECONDS )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:595:1: (lv_seconds_2_0= RULE_SECONDS )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:596:3: lv_seconds_2_0= RULE_SECONDS
            {
            lv_seconds_2_0=(Token)match(input,RULE_SECONDS,FOLLOW_RULE_SECONDS_in_ruleLength1151); 

            			newLeafNode(lv_seconds_2_0, grammarAccess.getLengthAccess().getSecondsSECONDSTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLengthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"seconds",
                    		lv_seconds_2_0, 
                    		"SECONDS");
            	    

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
    // $ANTLR end "ruleLength"


    // $ANTLR start "entryRuleDistributor"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:620:1: entryRuleDistributor returns [EObject current=null] : iv_ruleDistributor= ruleDistributor EOF ;
    public final EObject entryRuleDistributor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributor = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:621:2: (iv_ruleDistributor= ruleDistributor EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:622:2: iv_ruleDistributor= ruleDistributor EOF
            {
             newCompositeNode(grammarAccess.getDistributorRule()); 
            pushFollow(FOLLOW_ruleDistributor_in_entryRuleDistributor1192);
            iv_ruleDistributor=ruleDistributor();

            state._fsp--;

             current =iv_ruleDistributor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistributor1202); 

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
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:629:1: ruleDistributor returns [EObject current=null] : (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Address:' ( (lv_address_3_0= RULE_STRING ) ) otherlv_4= 'Account Information:' otherlv_5= 'IBAN:' ( (lv_iban_6_0= RULE_STRING ) ) otherlv_7= 'BIC:' ( (lv_bic_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleDistributor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_address_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_iban_6_0=null;
        Token otherlv_7=null;
        Token lv_bic_8_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:632:28: ( (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Address:' ( (lv_address_3_0= RULE_STRING ) ) otherlv_4= 'Account Information:' otherlv_5= 'IBAN:' ( (lv_iban_6_0= RULE_STRING ) ) otherlv_7= 'BIC:' ( (lv_bic_8_0= RULE_STRING ) ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:633:1: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Address:' ( (lv_address_3_0= RULE_STRING ) ) otherlv_4= 'Account Information:' otherlv_5= 'IBAN:' ( (lv_iban_6_0= RULE_STRING ) ) otherlv_7= 'BIC:' ( (lv_bic_8_0= RULE_STRING ) ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:633:1: (otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Address:' ( (lv_address_3_0= RULE_STRING ) ) otherlv_4= 'Account Information:' otherlv_5= 'IBAN:' ( (lv_iban_6_0= RULE_STRING ) ) otherlv_7= 'BIC:' ( (lv_bic_8_0= RULE_STRING ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:633:3: otherlv_0= 'Distributor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Address:' ( (lv_address_3_0= RULE_STRING ) ) otherlv_4= 'Account Information:' otherlv_5= 'IBAN:' ( (lv_iban_6_0= RULE_STRING ) ) otherlv_7= 'BIC:' ( (lv_bic_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDistributor1239); 

                	newLeafNode(otherlv_0, grammarAccess.getDistributorAccess().getDistributorKeyword_0());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:637:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:638:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:638:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:639:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDistributor1256); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDistributorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleDistributor1273); 

                	newLeafNode(otherlv_2, grammarAccess.getDistributorAccess().getAddressKeyword_2());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:659:1: ( (lv_address_3_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:660:1: (lv_address_3_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:660:1: (lv_address_3_0= RULE_STRING )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:661:3: lv_address_3_0= RULE_STRING
            {
            lv_address_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDistributor1290); 

            			newLeafNode(lv_address_3_0, grammarAccess.getDistributorAccess().getAddressSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleDistributor1307); 

                	newLeafNode(otherlv_4, grammarAccess.getDistributorAccess().getAccountInformationKeyword_4());
                
            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleDistributor1319); 

                	newLeafNode(otherlv_5, grammarAccess.getDistributorAccess().getIBANKeyword_5());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:685:1: ( (lv_iban_6_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:686:1: (lv_iban_6_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:686:1: (lv_iban_6_0= RULE_STRING )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:687:3: lv_iban_6_0= RULE_STRING
            {
            lv_iban_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDistributor1336); 

            			newLeafNode(lv_iban_6_0, grammarAccess.getDistributorAccess().getIbanSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iban",
                    		lv_iban_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleDistributor1353); 

                	newLeafNode(otherlv_7, grammarAccess.getDistributorAccess().getBICKeyword_7());
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:707:1: ( (lv_bic_8_0= RULE_STRING ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:708:1: (lv_bic_8_0= RULE_STRING )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:708:1: (lv_bic_8_0= RULE_STRING )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:709:3: lv_bic_8_0= RULE_STRING
            {
            lv_bic_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDistributor1370); 

            			newLeafNode(lv_bic_8_0, grammarAccess.getDistributorAccess().getBicSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDistributorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bic",
                    		lv_bic_8_0, 
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
    // $ANTLR end "ruleDistributor"


    // $ANTLR start "entryRuleFQN"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:733:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:734:2: (iv_ruleFQN= ruleFQN EOF )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:735:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1412);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1423); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:742:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:745:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:746:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:746:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1463); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:753:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:754:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleFQN1482); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1497); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleGenre"
    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:774:1: ruleGenre returns [Enumerator current=null] : ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) ) ;
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
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:776:28: ( ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) ) )
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:777:1: ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) )
            {
            // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:777:1: ( (enumLiteral_0= 'POP' ) | (enumLiteral_1= 'ROCK' ) | (enumLiteral_2= 'HARDROCK' ) | (enumLiteral_3= 'CLASSIC' ) | (enumLiteral_4= 'FOLK' ) | (enumLiteral_5= 'OTHER' ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 37:
                {
                alt10=2;
                }
                break;
            case 38:
                {
                alt10=3;
                }
                break;
            case 39:
                {
                alt10=4;
                }
                break;
            case 40:
                {
                alt10=5;
                }
                break;
            case 41:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:777:2: (enumLiteral_0= 'POP' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:777:2: (enumLiteral_0= 'POP' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:777:4: enumLiteral_0= 'POP'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_36_in_ruleGenre1558); 

                            current = grammarAccess.getGenreAccess().getPOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGenreAccess().getPOPEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:783:6: (enumLiteral_1= 'ROCK' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:783:6: (enumLiteral_1= 'ROCK' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:783:8: enumLiteral_1= 'ROCK'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_37_in_ruleGenre1575); 

                            current = grammarAccess.getGenreAccess().getROCKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGenreAccess().getROCKEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:789:6: (enumLiteral_2= 'HARDROCK' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:789:6: (enumLiteral_2= 'HARDROCK' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:789:8: enumLiteral_2= 'HARDROCK'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_38_in_ruleGenre1592); 

                            current = grammarAccess.getGenreAccess().getHARDROCKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGenreAccess().getHARDROCKEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:795:6: (enumLiteral_3= 'CLASSIC' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:795:6: (enumLiteral_3= 'CLASSIC' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:795:8: enumLiteral_3= 'CLASSIC'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_39_in_ruleGenre1609); 

                            current = grammarAccess.getGenreAccess().getCLASSICEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGenreAccess().getCLASSICEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:801:6: (enumLiteral_4= 'FOLK' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:801:6: (enumLiteral_4= 'FOLK' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:801:8: enumLiteral_4= 'FOLK'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_40_in_ruleGenre1626); 

                            current = grammarAccess.getGenreAccess().getFOLKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getGenreAccess().getFOLKEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:807:6: (enumLiteral_5= 'OTHER' )
                    {
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:807:6: (enumLiteral_5= 'OTHER' )
                    // ../at.ac.univie.swa.ase.example/src-gen/at/ac/univie/swa/ase/example/parser/antlr/internal/InternalPlaylistDsl.g:807:8: enumLiteral_5= 'OTHER'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_41_in_ruleGenre1643); 

                            current = grammarAccess.getGenreAccess().getOTHEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getGenreAccess().getOTHEREnumLiteralDeclaration_5()); 
                        

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
    public static final BitSet FOLLOW_13_in_ruleModel131 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleDistributor_in_ruleModel152 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleModel165 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleLibrary_in_ruleModel186 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleModel199 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePlaylist_in_ruleModel220 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePlaylist_in_entryRulePlaylist257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlaylist267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlaylist309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePlaylist326 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleItem_in_rulePlaylist347 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_rulePlaylist360 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleItem_in_rulePlaylist381 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLibrary431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLibrary468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLibrary485 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLibrary502 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleSong_in_ruleLibrary523 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleItem618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleItem637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItem657 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleItem670 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleItem682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleItem705 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_17_in_ruleItem718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleItem741 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_23_in_ruleItem755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSong_in_entryRuleSong794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSong804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSong841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSong858 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSong875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSong892 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSong909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSong929 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSong941 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleLength_in_ruleSong962 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSong974 = new BitSet(new long[]{0x000003F000000000L});
    public static final BitSet FOLLOW_ruleGenre_in_ruleSong995 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSong1007 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleSong1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLength_in_entryRuleLength1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLength1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLength1117 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLength1134 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SECONDS_in_ruleLength1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistributor_in_entryRuleDistributor1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistributor1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDistributor1239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDistributor1256 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDistributor1273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDistributor1290 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDistributor1307 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDistributor1319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDistributor1336 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDistributor1353 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDistributor1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1463 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFQN1482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1497 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36_in_ruleGenre1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGenre1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleGenre1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleGenre1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGenre1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleGenre1643 = new BitSet(new long[]{0x0000000000000002L});

}