package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_CUSTOM_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_WIKI_COMMENT=4;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:7: ( '=' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:9: '='
            {
            match('='); 

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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:7: ( '==' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:9: '=='
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:7: ( '===' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:9: '==='
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:7: ( '====' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:9: '===='
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:7: ( '#' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:9: '#'
            {
            match('#'); 

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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:7: ( '*' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:9: '*'
            {
            match('*'); 

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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:7: ( '\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:9: '\\'\\''
            {
            match("''"); 


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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:7: ( '\\'\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:9: '\\'\\'\\''
            {
            match("'''"); 


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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:7: ( '\\'\\'\\'\\'\\'' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:9: '\\'\\'\\'\\'\\''
            {
            match("'''''"); 


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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:7: ( '<blockquote>' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:9: '<blockquote>'
            {
            match("<blockquote>"); 


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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:7: ( '</blockquote>' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:9: '</blockquote>'
            {
            match("</blockquote>"); 


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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:7: ( '[' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:9: '['
            {
            match('['); 

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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:7: ( ' ' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:9: ' '
            {
            match(' '); 

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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:7: ( ']' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:7: ( '[[' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:9: '[['
            {
            match("[["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:7: ( '|' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:7: ( ']]' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:9: ']]'
            {
            match("]]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:7: ( '[[File:' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:9: '[[File:'
            {
            match("[[File:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:7: ( '|thumb' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:29:9: '|thumb'
            {
            match("|thumb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:30:7: ( '|frame' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:30:9: '|frame'
            {
            match("|frame"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:31:7: ( '|frameless' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:31:9: '|frameless'
            {
            match("|frameless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:32:7: ( '[[Category:' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:32:9: '[[Category:'
            {
            match("[[Category:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:33:7: ( '|*' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:33:9: '|*'
            {
            match("|*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:34:7: ( '{{' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:34:9: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:35:7: ( '}}' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:35:9: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:36:7: ( 'about|' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:36:9: 'about|'
            {
            match("about|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:37:7: ( '|and|' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:37:9: '|and|'
            {
            match("|and|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:38:7: ( 'main|' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:38:9: 'main|'
            {
            match("main|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_CUSTOM_STRING"
    public final void mRULE_CUSTOM_STRING() throws RecognitionException {
        try {
            int _type = RULE_CUSTOM_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:20: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '!' | '?' | ',' | '#' | ':' | '(' | ')' | ' ' | '/' | '\"' )+ )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '!' | '?' | ',' | '#' | ':' | '(' | ')' | ' ' | '/' | '\"' )+
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2071:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '!' | '?' | ',' | '#' | ':' | '(' | ')' | ' ' | '/' | '\"' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=' ' && LA1_0<='#')||(LA1_0>='(' && LA1_0<=')')||(LA1_0>=',' && LA1_0<=':')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='#')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<=':')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CUSTOM_STRING"

    // $ANTLR start "RULE_WIKI_COMMENT"
    public final void mRULE_WIKI_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_WIKI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:19: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:21: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:28: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='-') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='>') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='=')||(LA2_3>='?' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=',')||(LA2_1>='.' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2073:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WIKI_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:13: ( '\\u00B4' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:15: '\\u00B4'
            {
            match('\u00B4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:11: '^'
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

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:10: ( ( '0' .. '9' )+ )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:12: ( '0' .. '9' )+
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:12: ( '0' .. '9' )+
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
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2079:13: '0' .. '9'
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:24: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2081:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop7;
                }
            } while (true);

            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:40: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:41: ( '\\r' )? '\\n'
                    {
                    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:41: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2083:41: '\\r'
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2085:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2087:16: ( . )
            // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2087:18: .
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
        // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_CUSTOM_STRING | RULE_WIKI_COMMENT | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=37;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:178: RULE_CUSTOM_STRING
                {
                mRULE_CUSTOM_STRING(); 

                }
                break;
            case 30 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:197: RULE_WIKI_COMMENT
                {
                mRULE_WIKI_COMMENT(); 

                }
                break;
            case 31 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:215: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:244: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:260: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:276: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../example.wikitext/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:284: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\27\1\30\1\uffff\2\25\1\40\1\41\1\45\1\52\2\25\3\31\1"+
        "\uffff\1\25\2\31\3\uffff\1\66\4\uffff\1\70\3\uffff\1\73\2\uffff"+
        "\1\31\12\uffff\3\31\2\uffff\1\31\1\uffff\1\31\1\102\1\uffff\1\104"+
        "\5\uffff\3\31\6\uffff\2\31\1\uffff\1\31\1\uffff\1\116\3\uffff";
    static final String DFA11_eofS =
        "\117\uffff";
    static final String DFA11_minS =
        "\1\0\1\75\1\40\1\uffff\1\47\1\41\1\133\1\11\1\135\1\52\1\173\1"+
        "\175\3\60\1\uffff\1\101\1\60\1\52\3\uffff\1\75\4\uffff\1\47\3\uffff"+
        "\1\103\2\uffff\1\11\4\uffff\1\162\5\uffff\3\60\2\uffff\1\60\1\uffff"+
        "\1\0\1\75\1\uffff\1\47\4\uffff\1\141\2\60\1\0\5\uffff\1\155\2\60"+
        "\1\145\1\60\1\uffff\1\154\3\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\75\1\172\1\uffff\1\47\1\142\1\133\1\172\1\135\1\164"+
        "\1\173\1\175\3\172\1\uffff\1\172\1\71\1\57\3\uffff\1\75\4\uffff"+
        "\1\47\3\uffff\1\106\2\uffff\1\40\4\uffff\1\162\5\uffff\3\172\2\uffff"+
        "\1\71\1\uffff\1\uffff\1\75\1\uffff\1\47\4\uffff\1\141\2\172\1\uffff"+
        "\5\uffff\1\155\1\172\1\174\1\145\1\174\1\uffff\1\154\3\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\6\13\uffff\1\37\3\uffff\1\35\1\44\1\45\1\uffff\1\1\1"+
        "\5\1\35\1\6\1\uffff\1\12\1\13\1\36\1\uffff\1\14\1\15\1\uffff\1\44"+
        "\1\21\1\16\1\23\1\uffff\1\27\1\33\1\20\1\30\1\31\3\uffff\1\37\1"+
        "\40\1\uffff\1\42\2\uffff\1\2\1\uffff\1\7\1\22\1\26\1\17\4\uffff"+
        "\1\43\1\4\1\3\1\11\1\10\5\uffff\1\34\1\uffff\1\32\1\25\1\24";
    static final String DFA11_specialS =
        "\1\1\63\uffff\1\2\12\uffff\1\0\17\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\7\2\23\1\2\3\25\1\4\2\23\1\3"+
            "\1\25\3\23\1\22\12\21\1\23\1\25\1\5\1\1\1\25\1\23\1\25\32\16"+
            "\1\6\1\25\1\10\1\20\1\16\1\25\1\14\13\16\1\15\15\16\1\12\1\11"+
            "\1\13\66\25\1\17\uff4b\25",
            "\1\26",
            "\4\31\4\uffff\2\31\2\uffff\17\31\4\uffff\1\31\1\uffff\32\31"+
            "\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\33",
            "\1\36\15\uffff\1\35\62\uffff\1\34",
            "\1\37",
            "\2\43\2\uffff\1\43\22\uffff\1\42\3\31\4\uffff\2\31\2\uffff"+
            "\17\31\4\uffff\1\31\1\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\44",
            "\1\50\66\uffff\1\51\4\uffff\1\47\15\uffff\1\46",
            "\1\53",
            "\1\54",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\55\30\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\57\31\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "\1\72\2\uffff\1\71",
            "",
            "",
            "\2\43\2\uffff\1\43\22\uffff\1\42",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\75\13\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\76\21\56",
            "",
            "",
            "\12\62",
            "",
            "\40\100\4\77\4\100\2\77\2\100\17\77\4\100\1\77\1\100\32\77"+
            "\4\100\1\77\1\100\32\77\uff85\100",
            "\1\101",
            "",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\105",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\106\5\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\107\14\56",
            "\40\100\4\77\4\100\2\77\2\100\17\77\4\100\1\77\1\100\32\77"+
            "\4\100\1\77\1\100\32\77\uff85\100",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\111\6\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\1\uffff\1"+
            "\112",
            "\1\113",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\1\uffff\1"+
            "\114",
            "",
            "\1\115",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_CUSTOM_STRING | RULE_WIKI_COMMENT | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_63 = input.LA(1);

                        s = -1;
                        if ( ((LA11_63>=' ' && LA11_63<='#')||(LA11_63>='(' && LA11_63<=')')||(LA11_63>=',' && LA11_63<=':')||LA11_63=='?'||(LA11_63>='A' && LA11_63<='Z')||LA11_63=='_'||(LA11_63>='a' && LA11_63<='z')) ) {s = 63;}

                        else if ( ((LA11_63>='\u0000' && LA11_63<='\u001F')||(LA11_63>='$' && LA11_63<='\'')||(LA11_63>='*' && LA11_63<='+')||(LA11_63>=';' && LA11_63<='>')||LA11_63=='@'||(LA11_63>='[' && LA11_63<='^')||LA11_63=='`'||(LA11_63>='{' && LA11_63<='\uFFFF')) ) {s = 64;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='=') ) {s = 1;}

                        else if ( (LA11_0=='#') ) {s = 2;}

                        else if ( (LA11_0=='*') ) {s = 3;}

                        else if ( (LA11_0=='\'') ) {s = 4;}

                        else if ( (LA11_0=='<') ) {s = 5;}

                        else if ( (LA11_0=='[') ) {s = 6;}

                        else if ( (LA11_0==' ') ) {s = 7;}

                        else if ( (LA11_0==']') ) {s = 8;}

                        else if ( (LA11_0=='|') ) {s = 9;}

                        else if ( (LA11_0=='{') ) {s = 10;}

                        else if ( (LA11_0=='}') ) {s = 11;}

                        else if ( (LA11_0=='a') ) {s = 12;}

                        else if ( (LA11_0=='m') ) {s = 13;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='b' && LA11_0<='l')||(LA11_0>='n' && LA11_0<='z')) ) {s = 14;}

                        else if ( (LA11_0=='\u00B4') ) {s = 15;}

                        else if ( (LA11_0=='^') ) {s = 16;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 17;}

                        else if ( (LA11_0=='/') ) {s = 18;}

                        else if ( ((LA11_0>='!' && LA11_0<='\"')||(LA11_0>='(' && LA11_0<=')')||(LA11_0>=',' && LA11_0<='.')||LA11_0==':'||LA11_0=='?') ) {s = 19;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r') ) {s = 20;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||(LA11_0>='$' && LA11_0<='&')||LA11_0=='+'||LA11_0==';'||LA11_0=='>'||LA11_0=='@'||LA11_0=='\\'||LA11_0=='`'||(LA11_0>='~' && LA11_0<='\u00B3')||(LA11_0>='\u00B5' && LA11_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_52 = input.LA(1);

                        s = -1;
                        if ( ((LA11_52>=' ' && LA11_52<='#')||(LA11_52>='(' && LA11_52<=')')||(LA11_52>=',' && LA11_52<=':')||LA11_52=='?'||(LA11_52>='A' && LA11_52<='Z')||LA11_52=='_'||(LA11_52>='a' && LA11_52<='z')) ) {s = 63;}

                        else if ( ((LA11_52>='\u0000' && LA11_52<='\u001F')||(LA11_52>='$' && LA11_52<='\'')||(LA11_52>='*' && LA11_52<='+')||(LA11_52>=';' && LA11_52<='>')||LA11_52=='@'||(LA11_52>='[' && LA11_52<='^')||LA11_52=='`'||(LA11_52>='{' && LA11_52<='\uFFFF')) ) {s = 64;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}