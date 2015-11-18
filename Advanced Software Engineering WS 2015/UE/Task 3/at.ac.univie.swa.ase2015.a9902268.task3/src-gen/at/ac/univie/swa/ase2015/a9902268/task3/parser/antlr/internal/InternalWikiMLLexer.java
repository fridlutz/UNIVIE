package at.ac.univie.swa.ase2015.a9902268.task3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWikiMLLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=4;
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

    public InternalWikiMLLexer() {;} 
    public InternalWikiMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWikiMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:11:7: ( '<blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:11:9: '<blockquote>'
            {
            match("<blockquote>"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:12:7: ( '</blockquote>' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:12:9: '</blockquote>'
            {
            match("</blockquote>"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:13:7: ( '{{' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:13:9: '{{'
            {
            match("{{"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:14:7: ( '|' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:14:9: '|'
            {
            match('|'); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:15:7: ( '}}' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:15:9: '}}'
            {
            match("}}"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:16:7: ( '**' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:16:9: '**'
            {
            match("**"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:17:7: ( ':LIST' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:17:9: ':LIST'
            {
            match(":LIST"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:18:7: ( '*' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:18:9: '*'
            {
            match('*'); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:19:7: ( '#' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:19:9: '#'
            {
            match('#'); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:20:7: ( '[[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:20:9: '[['
            {
            match("[["); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:21:7: ( 'File:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:21:9: 'File:'
            {
            match("File:"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:22:7: ( '|alt=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:22:9: '|alt='
            {
            match("|alt="); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:23:7: ( ']]' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:23:9: ']]'
            {
            match("]]"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:24:7: ( 'Category:' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:24:9: 'Category:'
            {
            match("Category:"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:25:7: ( '|*?' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:25:9: '|*?'
            {
            match("|*?"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:26:7: ( '=' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:26:9: '='
            {
            match('='); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:27:7: ( '==' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:27:9: '=='
            {
            match("=="); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:28:7: ( '===' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:28:9: '==='
            {
            match("==="); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:29:7: ( '====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:29:9: '===='
            {
            match("===="); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:30:7: ( '=====' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:30:9: '====='
            {
            match("====="); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:31:7: ( '\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:31:9: '\\'\\'\\''
            {
            match("'''"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:32:7: ( '\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:32:9: '\\'\\''
            {
            match("''"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:33:7: ( '\\'\\'\\'\\'\\'' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:33:9: '\\'\\'\\'\\'\\''
            {
            match("'''''"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:34:7: ( '[' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:34:9: '['
            {
            match('['); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:35:7: ( ']' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:35:9: ']'
            {
            match(']'); 

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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:36:7: ( 'thumb' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:36:9: 'thumb'
            {
            match("thumb"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:37:7: ( 'thumbnail' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:37:9: 'thumbnail'
            {
            match("thumbnail"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:38:7: ( 'frame' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:38:9: 'frame'
            {
            match("frame"); 


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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:39:7: ( 'framed' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:39:9: 'framed'
            {
            match("framed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:40:7: ( 'frameless' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:40:9: 'frameless'
            {
            match("frameless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:41:7: ( 'right' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:41:9: 'right'
            {
            match("right"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:42:7: ( 'left' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:42:9: 'left'
            {
            match("left"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:43:7: ( 'center' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:43:9: 'center'
            {
            match("center"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:44:7: ( 'none' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:44:9: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1813:9: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1813:11: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1813:11: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\"' && LA1_0<='#')||(LA1_0>='(' && LA1_0<=')')||(LA1_0>=',' && LA1_0<='.')||(LA1_0>='0' && LA1_0<=':')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:
            	    {
            	    if ( (input.LA(1)>='\"' && input.LA(1)<='#')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1815:17: ( '<!--' ( options {greedy=false; } : . )* '-->' )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1815:19: '<!--' ( options {greedy=false; } : . )* '-->'
            {
            match("<!--"); 

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1815:26: ( options {greedy=false; } : . )*
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
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1815:54: .
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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1817:13: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )* )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1817:15: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )*
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1817:15: ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '(' | ')' | ',' | '#' | '\"' | '.' | ':' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\"' && LA3_0<='#')||(LA3_0>='(' && LA3_0<=')')||(LA3_0>=',' && LA3_0<='.')||(LA3_0>='0' && LA3_0<=':')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:
            	    {
            	    if ( (input.LA(1)>='\"' && input.LA(1)<='#')||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:10: ( ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:12: ( 'a' .. 'z' )+ '://' ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ) ( ':' ( '0' .. '9' )+ )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:12: ( 'a' .. 'z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:13: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match("://"); 

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:30: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ | ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                alt12=1;
            }
            else if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:31: ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '.' ( '0' .. '9' )+
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:31: ( '0' .. '9' )+
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
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:32: '0' .. '9'
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

                    match('.'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:47: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:48: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:63: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:64: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:79: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:80: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:91: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=9;
                        alt9 = dfa9.predict(input);
                        switch (alt9) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:112: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:121: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:130: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:139: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:143: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:147: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:151: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:214: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:238: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='.') ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:239: '.' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    {
                    	    match('.'); 
                    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
                    	    loop10:
                    	    do {
                    	        int alt10=9;
                    	        alt10 = dfa10.predict(input);
                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:264: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:273: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:282: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:291: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:295: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:299: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:303: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:366: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop10;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:393: ( ':' ( '0' .. '9' )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==':') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:394: ':' ( '0' .. '9' )+
                    {
                    match(':'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:398: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:399: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:412: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='/') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:413: '/' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    {
            	    match('/'); 
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*
            	    loop15:
            	    do {
            	        int alt15=12;
            	        alt15 = dfa15.predict(input);
            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:418: 'a' .. 'z'
            	    	    {
            	    	    matchRange('a','z'); 

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:427: 'A' .. 'Z'
            	    	    {
            	    	    matchRange('A','Z'); 

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:436: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:445: '$'
            	    	    {
            	    	    match('$'); 

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:449: '-'
            	    	    {
            	    	    match('-'); 

            	    	    }
            	    	    break;
            	    	case 6 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:453: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;
            	    	case 7 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:457: '~'
            	    	    {
            	    	    match('~'); 

            	    	    }
            	    	    break;
            	    	case 8 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:461: '+'
            	    	    {
            	    	    match('+'); 

            	    	    }
            	    	    break;
            	    	case 9 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:465: '.'
            	    	    {
            	    	    match('.'); 

            	    	    }
            	    	    break;
            	    	case 10 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:469: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            	    	    {
            	    	    match('\\'); 
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}

            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 11 :
            	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:532: '%' '0' .. '9' '0' .. '9'
            	    	    {
            	    	    match('%'); 
            	    	    matchRange('0','9'); 
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:558: ( '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='?') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:559: '?' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    {
                    match('?'); 
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=12;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:564: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:573: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:582: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:591: '$'
                    	    {
                    	    match('$'); 

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:595: '-'
                    	    {
                    	    match('-'); 

                    	    }
                    	    break;
                    	case 6 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:599: '_'
                    	    {
                    	    match('_'); 

                    	    }
                    	    break;
                    	case 7 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:603: '='
                    	    {
                    	    match('='); 

                    	    }
                    	    break;
                    	case 8 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:607: '&'
                    	    {
                    	    match('&'); 

                    	    }
                    	    break;
                    	case 9 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:611: ';'
                    	    {
                    	    match(';'); 

                    	    }
                    	    break;
                    	case 10 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:615: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    match('\\'); 
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 11 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:678: '%' '0' .. '9' '0' .. '9'
                    	    {
                    	    match('%'); 
                    	    matchRange('0','9'); 
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:702: ( '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+ )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='+') ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:703: '+' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    {
                    	    match('+'); 
                    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+
                    	    int cnt18=0;
                    	    loop18:
                    	    do {
                    	        int alt18=12;
                    	        alt18 = dfa18.predict(input);
                    	        switch (alt18) {
                    	    	case 1 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:708: 'a' .. 'z'
                    	    	    {
                    	    	    matchRange('a','z'); 

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:717: 'A' .. 'Z'
                    	    	    {
                    	    	    matchRange('A','Z'); 

                    	    	    }
                    	    	    break;
                    	    	case 3 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:726: '0' .. '9'
                    	    	    {
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;
                    	    	case 4 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:735: '$'
                    	    	    {
                    	    	    match('$'); 

                    	    	    }
                    	    	    break;
                    	    	case 5 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:739: '-'
                    	    	    {
                    	    	    match('-'); 

                    	    	    }
                    	    	    break;
                    	    	case 6 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:743: '_'
                    	    	    {
                    	    	    match('_'); 

                    	    	    }
                    	    	    break;
                    	    	case 7 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:747: '='
                    	    	    {
                    	    	    match('='); 

                    	    	    }
                    	    	    break;
                    	    	case 8 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:751: '&'
                    	    	    {
                    	    	    match('&'); 

                    	    	    }
                    	    	    break;
                    	    	case 9 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:755: ';'
                    	    	    {
                    	    	    match(';'); 

                    	    	    }
                    	    	    break;
                    	    	case 10 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:759: '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    	    {
                    	    	    match('\\'); 
                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}

                    	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	    	        input.consume();

                    	    	    }
                    	    	    else {
                    	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	    	        recover(mse);
                    	    	        throw mse;}


                    	    	    }
                    	    	    break;
                    	    	case 11 :
                    	    	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1819:822: '%' '0' .. '9' '0' .. '9'
                    	    	    {
                    	    	    match('%'); 
                    	    	    matchRange('0','9'); 
                    	    	    matchRange('0','9'); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt18 >= 1 ) break loop18;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(18, input);
                    	                throw eee;
                    	        }
                    	        cnt18++;
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1821:10: ( ( '0' .. '9' )+ )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1821:12: ( '0' .. '9' )+
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1821:12: ( '0' .. '9' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1821:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:41: ( '\\r' )? '\\n'
                    {
                    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1823:41: '\\r'
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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1825:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1825:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1827:16: ( . )
            // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1827:18: .
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
        // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_ML_COMMENT | RULE_STRING | RULE_URL | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=42;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:222: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:238: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:250: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 39 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:259: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:268: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:284: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../at.ac.univie.swa.ase2015.a9902268.task3/src-gen/at/ac/univie/swa/ase2015/a9902268/task3/parser/antlr/internal/InternalWikiML.g:1:292: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA9_eotS =
        "\1\1\11\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\44\11\uffff";
    static final String DFA9_maxS =
        "\1\172\11\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10"+
            "\2\uffff\1\7\1\uffff\32\2",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 1819:111: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA10_eotS =
        "\1\1\11\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\44\11\uffff";
    static final String DFA10_maxS =
        "\1\172\11\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\5\1\11\7\uffff\1\6\2\uffff\12\4\7\uffff\32\3\1\uffff\1\10"+
            "\2\uffff\1\7\1\uffff\32\2",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 1819:263: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA15_eotS =
        "\1\1\14\uffff";
    static final String DFA15_eofS =
        "\15\uffff";
    static final String DFA15_minS =
        "\1\44\14\uffff";
    static final String DFA15_maxS =
        "\1\176\14\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\5\1\14\5\uffff\1\11\1\uffff\1\6\1\12\1\uffff\12\4\7\uffff"+
            "\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2\3\uffff\1\10",
            "",
            "",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 1819:417: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '~' | '+' | '.' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )*";
        }
    }
    static final String DFA17_eotS =
        "\1\1\14\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\44\14\uffff";
    static final String DFA17_maxS =
        "\1\172\14\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff"+
            "\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1819:563: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA18_eotS =
        "\1\1\14\uffff";
    static final String DFA18_eofS =
        "\15\uffff";
    static final String DFA18_minS =
        "\1\44\14\uffff";
    static final String DFA18_maxS =
        "\1\172\14\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA18_specialS =
        "\15\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\1\14\1\11\6\uffff\1\6\2\uffff\12\4\1\uffff\1\12\1\uffff"+
            "\1\10\3\uffff\32\3\1\uffff\1\13\2\uffff\1\7\1\uffff\32\2",
            "",
            "",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1819:707: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '$' | '-' | '_' | '=' | '&' | ';' | '\\\\' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) | '%' '0' .. '9' '0' .. '9' )+";
        }
    }
    static final String DFA26_eotS =
        "\1\25\2\32\1\41\1\32\1\44\1\25\1\47\1\51\1\25\1\54\1\25\1\57\1"+
        "\32\7\25\1\uffff\2\25\1\32\14\uffff\2\25\3\uffff\1\25\2\uffff\1"+
        "\25\1\100\1\uffff\1\102\11\25\2\uffff\3\25\1\116\1\uffff\1\120\1"+
        "\uffff\1\25\1\uffff\10\25\1\133\3\uffff\3\25\1\137\1\25\1\141\1"+
        "\142\1\143\1\25\2\uffff\1\146\1\151\1\152\1\uffff\1\25\3\uffff\2"+
        "\25\1\uffff\1\156\1\25\2\uffff\1\160\2\25\1\uffff\1\25\1\uffff\3"+
        "\25\1\167\1\170\1\171\3\uffff";
    static final String DFA26_eofS =
        "\172\uffff";
    static final String DFA26_minS =
        "\1\0\1\41\1\173\1\52\1\175\1\52\2\42\1\133\1\42\1\135\1\42\1\75"+
        "\1\47\7\42\1\uffff\2\42\1\57\14\uffff\2\42\3\uffff\1\42\2\uffff"+
        "\1\42\1\75\1\uffff\1\47\11\42\2\uffff\3\42\1\75\1\uffff\1\47\1\uffff"+
        "\1\42\1\uffff\10\42\1\75\3\uffff\11\42\2\uffff\3\42\1\uffff\1\42"+
        "\3\uffff\2\42\1\uffff\2\42\2\uffff\3\42\1\uffff\1\42\1\uffff\6\42"+
        "\3\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\142\1\173\1\141\1\175\1\52\2\172\1\133\1\172\1\135\1"+
        "\172\1\75\1\47\7\172\1\uffff\2\172\1\57\14\uffff\2\172\3\uffff\1"+
        "\172\2\uffff\1\172\1\75\1\uffff\1\47\11\172\2\uffff\3\172\1\75\1"+
        "\uffff\1\47\1\uffff\1\172\1\uffff\10\172\1\75\3\uffff\11\172\2\uffff"+
        "\3\172\1\uffff\1\172\3\uffff\2\172\1\uffff\2\172\2\uffff\3\172\1"+
        "\uffff\1\172\1\uffff\6\172\3\uffff";
    static final String DFA26_acceptS =
        "\25\uffff\1\43\3\uffff\1\51\1\52\1\1\1\2\1\44\1\3\1\14\1\17\1\4"+
        "\1\5\1\6\1\10\2\uffff\1\11\1\12\1\30\1\uffff\1\15\1\31\2\uffff\1"+
        "\20\12\uffff\1\50\1\51\4\uffff\1\21\1\uffff\1\26\1\uffff\1\46\11"+
        "\uffff\1\22\1\27\1\25\11\uffff\1\24\1\23\3\uffff\1\40\1\uffff\1"+
        "\42\1\7\1\13\2\uffff\1\32\2\uffff\1\34\1\37\3\uffff\1\35\1\uffff"+
        "\1\41\6\uffff\1\16\1\33\1\36";
    static final String DFA26_specialS =
        "\1\0\171\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\27\1\7\3\32\1\15\2"+
            "\27\1\5\1\32\3\27\1\30\12\26\1\6\1\32\1\1\1\14\3\32\2\27\1\13"+
            "\2\27\1\11\24\27\1\10\1\32\1\12\1\32\1\27\1\32\2\24\1\22\2\24"+
            "\1\17\5\24\1\21\1\24\1\23\3\24\1\20\1\24\1\16\6\24\1\2\1\3\1"+
            "\4\uff82\32",
            "\1\35\15\uffff\1\34\62\uffff\1\33",
            "\1\36",
            "\1\40\66\uffff\1\37",
            "\1\42",
            "\1\43",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\13\46"+
            "\1\45\16\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\1\50",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\10\46\1\52\21\46",
            "\1\53",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\1\55\31\46",
            "\1\56",
            "\1\60",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\7\63\1\61\22\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\21\63\1\64\10\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\10\63\1\65\21\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\66\25\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\67\25\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\16\63\1\70\13\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\71\1\46\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\10\46"+
            "\1\74\21\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\13\46\1\75\16\46",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\23\46\1\76\6\46",
            "\1\77",
            "",
            "\1\101",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\24\63\1\103\5\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\104\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\1\105\31\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\6\63\1\106\23\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\5\63\1\107\24\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\15\63\1\110\14\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\15\63\1\111\14\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\71\1\46\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\22\46"+
            "\1\112\7\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\4\46\1\113\25\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\4\46\1\114\25\46",
            "\1\115",
            "",
            "\1\117",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\14\63\1\121\15\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\14\63\1\122\15\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\7\63\1\123\22\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\23\63\1\124\6\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\23\63\1\125\6\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\126\25\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\23\46"+
            "\1\127\6\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\130\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\6\46\1\131\23\46",
            "\1\132",
            "",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\1\63\1\134\30\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\135\25\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\23\63\1\136\6\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\140\25\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\16\46\1\144\13\46",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\15\63\1\145\14\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\3\63\1\147\7\63\1\150\16\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\21\63\1\153\10\63",
            "",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\21\46\1\154\10\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\1\155\31\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\4\63\1\157\25\63",
            "",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\30\46\1\161\1\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\10\63\1\162\21\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\22\63\1\163\7\63",
            "",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\164\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\13\63\1\165\16\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\22\63\1\166\7\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\13\46\6\uffff\32\46"+
            "\4\uffff\1\46\1\uffff\32\46",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "\2\46\4\uffff\2\46\2\uffff\3\46\1\uffff\12\46\1\62\6\uffff"+
            "\32\46\4\uffff\1\46\1\uffff\32\63",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_ID | RULE_ML_COMMENT | RULE_STRING | RULE_URL | RULE_INT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='<') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='|') ) {s = 3;}

                        else if ( (LA26_0=='}') ) {s = 4;}

                        else if ( (LA26_0=='*') ) {s = 5;}

                        else if ( (LA26_0==':') ) {s = 6;}

                        else if ( (LA26_0=='#') ) {s = 7;}

                        else if ( (LA26_0=='[') ) {s = 8;}

                        else if ( (LA26_0=='F') ) {s = 9;}

                        else if ( (LA26_0==']') ) {s = 10;}

                        else if ( (LA26_0=='C') ) {s = 11;}

                        else if ( (LA26_0=='=') ) {s = 12;}

                        else if ( (LA26_0=='\'') ) {s = 13;}

                        else if ( (LA26_0=='t') ) {s = 14;}

                        else if ( (LA26_0=='f') ) {s = 15;}

                        else if ( (LA26_0=='r') ) {s = 16;}

                        else if ( (LA26_0=='l') ) {s = 17;}

                        else if ( (LA26_0=='c') ) {s = 18;}

                        else if ( (LA26_0=='n') ) {s = 19;}

                        else if ( ((LA26_0>='a' && LA26_0<='b')||(LA26_0>='d' && LA26_0<='e')||(LA26_0>='g' && LA26_0<='k')||LA26_0=='m'||(LA26_0>='o' && LA26_0<='q')||LA26_0=='s'||(LA26_0>='u' && LA26_0<='z')) ) {s = 20;}

                        else if ( ((LA26_0>='0' && LA26_0<='9')) ) {s = 22;}

                        else if ( (LA26_0=='\"'||(LA26_0>='(' && LA26_0<=')')||(LA26_0>=',' && LA26_0<='.')||(LA26_0>='A' && LA26_0<='B')||(LA26_0>='D' && LA26_0<='E')||(LA26_0>='G' && LA26_0<='Z')||LA26_0=='_') ) {s = 23;}

                        else if ( (LA26_0=='/') ) {s = 24;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 25;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='$' && LA26_0<='&')||LA26_0=='+'||LA26_0==';'||(LA26_0>='>' && LA26_0<='@')||LA26_0=='\\'||LA26_0=='^'||LA26_0=='`'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 26;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}