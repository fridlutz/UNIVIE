package at.ac.univie.swa.ase2015.a9902268.task3.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWikiMLLexer extends Lexer {
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

    public InternalWikiMLLexer() {;} 
    public InternalWikiMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWikiMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:11:7: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:12:7: ( '\\n' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:12:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:13:7: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:13:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:14:7: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:14:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:15:7: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:15:9: '===='
            {
            match("===="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:16:7: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:16:9: '====='
            {
            match("====="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:17:7: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:17:9: '\\'\\''
            {
            match("''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:18:7: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:18:9: '\\'\\'\\''
            {
            match("'''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:19:7: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:19:9: '\\'\\'\\'\\'\\''
            {
            match("'''''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:20:7: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:20:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:21:7: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:21:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:22:7: ( ' ' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:22:9: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:23:7: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:23:9: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:24:7: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:24:9: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:25:7: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:25:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_WIKITEXT"
    public final void mRULE_WIKITEXT() throws RecognitionException {
        try {
            int _type = RULE_WIKITEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:15: ( ( '^' )? (~ ( ( '=' | '\\'' | '[' | ']' | '\\n' ) ) )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:17: ( '^' )? (~ ( ( '=' | '\\'' | '[' | ']' | '\\n' ) ) )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:17: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:17: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:22: (~ ( ( '=' | '\\'' | '[' | ']' | '\\n' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='<')||(LA2_0>='>' && LA2_0<='Z')||LA2_0=='\\'||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2747:22: ~ ( ( '=' | '\\'' | '[' | ']' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WIKITEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2749:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2749:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2749:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2749:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2749:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2751:10: ( ( '0' .. '9' )+ )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2751:12: ( '0' .. '9' )+
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2751:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2751:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2753:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2755:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2755:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2755:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2755:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:41: ( '\\r' )? '\\n'
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2757:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2759:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2759:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2759:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2761:16: ( . )
            // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:2761:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_WIKITEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=23;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:100: RULE_WIKITEXT
                {
                mRULE_WIKITEXT(); 

                }
                break;
            case 17 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3.ui/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/ui/contentassist/antlr/internal/InternalWikiML.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\12\1\21\1\22\1\25\1\30\1\32\1\33\1\35\2\12\1\uffff\4\12\1\uffff"+
        "\1\47\3\uffff\1\51\7\uffff\1\12\1\uffff\5\12\1\uffff\2\12\1\62\1"+
        "\uffff\1\64\1\uffff\2\12\1\uffff\3\12\1\uffff\1\67\3\uffff\1\12"+
        "\2\uffff";
    static final String DFA14_eofS =
        "\70\uffff";
    static final String DFA14_minS =
        "\1\0\1\75\1\11\1\0\1\133\1\135\2\0\1\101\1\60\1\uffff\1\60\1\0"+
        "\1\52\1\11\1\uffff\1\75\3\uffff\1\47\7\uffff\1\11\1\uffff\3\60\2"+
        "\0\1\uffff\2\0\1\75\1\uffff\1\47\1\uffff\2\0\1\uffff\2\0\1\12\1"+
        "\uffff\1\75\3\uffff\1\0\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\75\1\40\1\uffff\1\133\1\135\2\uffff\2\172\1\uffff\1"+
        "\71\1\uffff\1\57\1\40\1\uffff\1\75\3\uffff\1\47\7\uffff\1\40\1\uffff"+
        "\2\172\1\71\2\uffff\1\uffff\2\uffff\1\75\1\uffff\1\47\1\uffff\2"+
        "\uffff\1\uffff\2\uffff\1\12\1\uffff\1\75\3\uffff\1\uffff\2\uffff";
    static final String DFA14_acceptS =
        "\12\uffff\1\20\4\uffff\1\20\1\uffff\1\1\1\2\1\26\1\uffff\1\27\1"+
        "\23\1\15\1\12\1\16\1\13\1\14\1\uffff\1\17\5\uffff\1\20\3\uffff\1"+
        "\3\1\uffff\1\7\2\uffff\1\24\3\uffff\1\25\1\uffff\1\4\1\11\1\10\1"+
        "\uffff\1\6\1\5";
    static final String DFA14_specialS =
        "\1\7\2\uffff\1\4\2\uffff\1\5\1\0\4\uffff\1\12\24\uffff\1\1\1\10"+
        "\1\uffff\1\14\1\13\4\uffff\1\6\1\3\1\uffff\1\11\1\2\6\uffff\1\15"+
        "\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\17\1\16\1\2\2\17\1\16\22\17\1\6\1\17\1\14\4\17\1\3\7\17"+
            "\1\15\12\13\3\17\1\1\3\17\32\11\1\4\1\17\1\5\1\10\1\11\1\17"+
            "\32\11\1\17\1\7\uff83\17",
            "\1\20",
            "\2\23\2\uffff\1\23\22\uffff\1\23",
            "\47\26\1\24\uffd8\26",
            "\1\27",
            "\1\31",
            "\11\12\1\34\1\23\2\12\1\34\22\12\1\34\6\12\1\uffff\25\12\1"+
            "\uffff\35\12\1\uffff\1\12\1\uffff\uffa2\12",
            "\12\12\1\uffff\34\12\1\uffff\25\12\1\uffff\35\12\1\uffff\1"+
            "\12\1\uffff\uffa2\12",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\40",
            "\12\42\1\26\27\42\1\43\4\42\1\26\25\42\1\26\35\42\1\26\1\41"+
            "\1\26\uffa2\42",
            "\1\44\4\uffff\1\45",
            "\1\34\1\23\2\uffff\1\34\22\uffff\1\34",
            "",
            "\1\46",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\23\2\uffff\1\34\22\uffff\1\34",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\40",
            "\12\52\1\26\34\52\1\26\25\52\1\26\35\52\1\26\1\52\1\26\uffa2"+
            "\52",
            "\12\42\1\26\27\42\1\43\4\42\1\26\25\42\1\26\35\42\1\26\1\41"+
            "\1\26\uffa2\42",
            "",
            "\12\55\1\54\34\55\1\54\2\55\1\53\22\55\1\54\35\55\1\54\1\55"+
            "\1\54\uffa2\55",
            "\12\56\1\60\2\56\1\57\31\56\1\60\25\56\1\60\35\56\1\60\1\56"+
            "\1\60\uffa2\56",
            "\1\61",
            "",
            "\1\63",
            "",
            "\12\42\1\26\27\42\1\43\4\42\1\26\25\42\1\26\35\42\1\26\1\41"+
            "\1\26\uffa2\42",
            "\12\55\1\54\34\55\1\54\2\55\1\53\4\55\1\65\15\55\1\54\35\55"+
            "\1\54\1\55\1\54\uffa2\55",
            "",
            "\12\55\1\54\34\55\1\54\2\55\1\53\22\55\1\54\35\55\1\54\1\55"+
            "\1\54\uffa2\55",
            "\12\56\1\60\2\56\1\57\31\56\1\60\25\56\1\60\35\56\1\60\1\56"+
            "\1\60\uffa2\56",
            "\1\60",
            "",
            "\1\66",
            "",
            "",
            "",
            "\12\55\1\54\34\55\1\54\2\55\1\53\22\55\1\54\35\55\1\54\1\55"+
            "\1\54\uffa2\55",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_WIKITEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_7 = input.LA(1);

                        s = -1;
                        if ( ((LA14_7>='\u0000' && LA14_7<='\t')||(LA14_7>='\u000B' && LA14_7<='&')||(LA14_7>='(' && LA14_7<='<')||(LA14_7>='>' && LA14_7<='Z')||LA14_7=='\\'||(LA14_7>='^' && LA14_7<='\uFFFF')) ) {s = 10;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_33 = input.LA(1);

                        s = -1;
                        if ( ((LA14_33>='\u0000' && LA14_33<='\t')||(LA14_33>='\u000B' && LA14_33<='&')||(LA14_33>='(' && LA14_33<='<')||(LA14_33>='>' && LA14_33<='Z')||LA14_33=='\\'||(LA14_33>='^' && LA14_33<='\uFFFF')) ) {s = 42;}

                        else if ( (LA14_33=='\n'||LA14_33=='\''||LA14_33=='='||LA14_33=='['||LA14_33==']') ) {s = 22;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_46 = input.LA(1);

                        s = -1;
                        if ( (LA14_46=='\r') ) {s = 47;}

                        else if ( (LA14_46=='\n'||LA14_46=='\''||LA14_46=='='||LA14_46=='['||LA14_46==']') ) {s = 48;}

                        else if ( ((LA14_46>='\u0000' && LA14_46<='\t')||(LA14_46>='\u000B' && LA14_46<='\f')||(LA14_46>='\u000E' && LA14_46<='&')||(LA14_46>='(' && LA14_46<='<')||(LA14_46>='>' && LA14_46<='Z')||LA14_46=='\\'||(LA14_46>='^' && LA14_46<='\uFFFF')) ) {s = 46;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( (LA14_43=='/') ) {s = 53;}

                        else if ( (LA14_43=='*') ) {s = 43;}

                        else if ( ((LA14_43>='\u0000' && LA14_43<='\t')||(LA14_43>='\u000B' && LA14_43<='&')||(LA14_43>='(' && LA14_43<=')')||(LA14_43>='+' && LA14_43<='.')||(LA14_43>='0' && LA14_43<='<')||(LA14_43>='>' && LA14_43<='Z')||LA14_43=='\\'||(LA14_43>='^' && LA14_43<='\uFFFF')) ) {s = 45;}

                        else if ( (LA14_43=='\n'||LA14_43=='\''||LA14_43=='='||LA14_43=='['||LA14_43==']') ) {s = 44;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_3 = input.LA(1);

                        s = -1;
                        if ( (LA14_3=='\'') ) {s = 20;}

                        else if ( ((LA14_3>='\u0000' && LA14_3<='&')||(LA14_3>='(' && LA14_3<='\uFFFF')) ) {s = 22;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_6 = input.LA(1);

                        s = -1;
                        if ( (LA14_6=='\t'||LA14_6=='\r'||LA14_6==' ') ) {s = 28;}

                        else if ( (LA14_6=='\n') ) {s = 19;}

                        else if ( ((LA14_6>='\u0000' && LA14_6<='\b')||(LA14_6>='\u000B' && LA14_6<='\f')||(LA14_6>='\u000E' && LA14_6<='\u001F')||(LA14_6>='!' && LA14_6<='&')||(LA14_6>='(' && LA14_6<='<')||(LA14_6>='>' && LA14_6<='Z')||LA14_6=='\\'||(LA14_6>='^' && LA14_6<='\uFFFF')) ) {s = 10;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_42 = input.LA(1);

                        s = -1;
                        if ( (LA14_42=='\"') ) {s = 35;}

                        else if ( (LA14_42=='\\') ) {s = 33;}

                        else if ( ((LA14_42>='\u0000' && LA14_42<='\t')||(LA14_42>='\u000B' && LA14_42<='!')||(LA14_42>='#' && LA14_42<='&')||(LA14_42>='(' && LA14_42<='<')||(LA14_42>='>' && LA14_42<='Z')||(LA14_42>='^' && LA14_42<='\uFFFF')) ) {s = 34;}

                        else if ( (LA14_42=='\n'||LA14_42=='\''||LA14_42=='='||LA14_42=='['||LA14_42==']') ) {s = 22;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0=='\n') ) {s = 2;}

                        else if ( (LA14_0=='\'') ) {s = 3;}

                        else if ( (LA14_0=='[') ) {s = 4;}

                        else if ( (LA14_0==']') ) {s = 5;}

                        else if ( (LA14_0==' ') ) {s = 6;}

                        else if ( (LA14_0=='|') ) {s = 7;}

                        else if ( (LA14_0=='^') ) {s = 8;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 9;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 11;}

                        else if ( (LA14_0=='\"') ) {s = 12;}

                        else if ( (LA14_0=='/') ) {s = 13;}

                        else if ( (LA14_0=='\t'||LA14_0=='\r') ) {s = 14;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='{'||(LA14_0>='}' && LA14_0<='\uFFFF')) ) {s = 15;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( (LA14_34=='\"') ) {s = 35;}

                        else if ( (LA14_34=='\\') ) {s = 33;}

                        else if ( ((LA14_34>='\u0000' && LA14_34<='\t')||(LA14_34>='\u000B' && LA14_34<='!')||(LA14_34>='#' && LA14_34<='&')||(LA14_34>='(' && LA14_34<='<')||(LA14_34>='>' && LA14_34<='Z')||(LA14_34>='^' && LA14_34<='\uFFFF')) ) {s = 34;}

                        else if ( (LA14_34=='\n'||LA14_34=='\''||LA14_34=='='||LA14_34=='['||LA14_34==']') ) {s = 22;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( (LA14_45=='*') ) {s = 43;}

                        else if ( ((LA14_45>='\u0000' && LA14_45<='\t')||(LA14_45>='\u000B' && LA14_45<='&')||(LA14_45>='(' && LA14_45<=')')||(LA14_45>='+' && LA14_45<='<')||(LA14_45>='>' && LA14_45<='Z')||LA14_45=='\\'||(LA14_45>='^' && LA14_45<='\uFFFF')) ) {s = 45;}

                        else if ( (LA14_45=='\n'||LA14_45=='\''||LA14_45=='='||LA14_45=='['||LA14_45==']') ) {s = 44;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( (LA14_12=='\\') ) {s = 33;}

                        else if ( ((LA14_12>='\u0000' && LA14_12<='\t')||(LA14_12>='\u000B' && LA14_12<='!')||(LA14_12>='#' && LA14_12<='&')||(LA14_12>='(' && LA14_12<='<')||(LA14_12>='>' && LA14_12<='Z')||(LA14_12>='^' && LA14_12<='\uFFFF')) ) {s = 34;}

                        else if ( (LA14_12=='\"') ) {s = 35;}

                        else if ( (LA14_12=='\n'||LA14_12=='\''||LA14_12=='='||LA14_12=='['||LA14_12==']') ) {s = 22;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_37 = input.LA(1);

                        s = -1;
                        if ( ((LA14_37>='\u0000' && LA14_37<='\t')||(LA14_37>='\u000B' && LA14_37<='\f')||(LA14_37>='\u000E' && LA14_37<='&')||(LA14_37>='(' && LA14_37<='<')||(LA14_37>='>' && LA14_37<='Z')||LA14_37=='\\'||(LA14_37>='^' && LA14_37<='\uFFFF')) ) {s = 46;}

                        else if ( (LA14_37=='\r') ) {s = 47;}

                        else if ( (LA14_37=='\n'||LA14_37=='\''||LA14_37=='='||LA14_37=='['||LA14_37==']') ) {s = 48;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_36 = input.LA(1);

                        s = -1;
                        if ( (LA14_36=='*') ) {s = 43;}

                        else if ( (LA14_36=='\n'||LA14_36=='\''||LA14_36=='='||LA14_36=='['||LA14_36==']') ) {s = 44;}

                        else if ( ((LA14_36>='\u0000' && LA14_36<='\t')||(LA14_36>='\u000B' && LA14_36<='&')||(LA14_36>='(' && LA14_36<=')')||(LA14_36>='+' && LA14_36<='<')||(LA14_36>='>' && LA14_36<='Z')||LA14_36=='\\'||(LA14_36>='^' && LA14_36<='\uFFFF')) ) {s = 45;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( (LA14_53=='*') ) {s = 43;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='\t')||(LA14_53>='\u000B' && LA14_53<='&')||(LA14_53>='(' && LA14_53<=')')||(LA14_53>='+' && LA14_53<='<')||(LA14_53>='>' && LA14_53<='Z')||LA14_53=='\\'||(LA14_53>='^' && LA14_53<='\uFFFF')) ) {s = 45;}

                        else if ( (LA14_53=='\n'||LA14_53=='\''||LA14_53=='='||LA14_53=='['||LA14_53==']') ) {s = 44;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}