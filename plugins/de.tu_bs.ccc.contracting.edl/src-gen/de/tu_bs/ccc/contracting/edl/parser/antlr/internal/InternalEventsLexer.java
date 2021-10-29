package de.tu_bs.ccc.contracting.edl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventsLexer extends Lexer {
    public static final int RULE_STRING=6;
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
    public static final int RULE_ANNOTATION_STRING=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalEventsLexer() {;} 
    public InternalEventsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEventsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEvents.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvents.g:11:7: ( 'package' )
            // InternalEvents.g:11:9: 'package'
            {
            match("package"); 


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
            // InternalEvents.g:12:7: ( 'EventType' )
            // InternalEvents.g:12:9: 'EventType'
            {
            match("EventType"); 


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
            // InternalEvents.g:13:7: ( '{' )
            // InternalEvents.g:13:9: '{'
            {
            match('{'); 

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
            // InternalEvents.g:14:7: ( ',' )
            // InternalEvents.g:14:9: ','
            {
            match(','); 

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
            // InternalEvents.g:15:7: ( '}' )
            // InternalEvents.g:15:9: '}'
            {
            match('}'); 

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
            // InternalEvents.g:16:7: ( '=' )
            // InternalEvents.g:16:9: '='
            {
            match('='); 

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
            // InternalEvents.g:17:7: ( 'default' )
            // InternalEvents.g:17:9: 'default'
            {
            match("default"); 


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
            // InternalEvents.g:18:7: ( '/*' )
            // InternalEvents.g:18:9: '/*'
            {
            match("/*"); 


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
            // InternalEvents.g:19:7: ( '*/' )
            // InternalEvents.g:19:9: '*/'
            {
            match("*/"); 


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
            // InternalEvents.g:20:7: ( 'import' )
            // InternalEvents.g:20:9: 'import'
            {
            match("import"); 


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
            // InternalEvents.g:21:7: ( 'from' )
            // InternalEvents.g:21:9: 'from'
            {
            match("from"); 


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
            // InternalEvents.g:22:7: ( 'model' )
            // InternalEvents.g:22:9: 'model'
            {
            match("model"); 


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
            // InternalEvents.g:23:7: ( '.' )
            // InternalEvents.g:23:9: '.'
            {
            match('.'); 

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
            // InternalEvents.g:24:7: ( '*' )
            // InternalEvents.g:24:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ANNOTATION_STRING"
    public final void mRULE_ANNOTATION_STRING() throws RecognitionException {
        try {
            int _type = RULE_ANNOTATION_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvents.g:561:24: ( '@' ( 'a' .. 'z' | '-' )+ ( ' ' | '\\t' )* ':' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ( '\\\\*' | '\\\\@' ) | ~ ( ( '\\\\' | '*' | '@' ) ) )* )
            // InternalEvents.g:561:26: '@' ( 'a' .. 'z' | '-' )+ ( ' ' | '\\t' )* ':' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ( '\\\\*' | '\\\\@' ) | ~ ( ( '\\\\' | '*' | '@' ) ) )*
            {
            match('@'); 
            // InternalEvents.g:561:30: ( 'a' .. 'z' | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvents.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            // InternalEvents.g:561:46: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvents.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

            match(':'); 
            // InternalEvents.g:561:62: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ( '\\\\*' | '\\\\@' ) | ~ ( ( '\\\\' | '*' | '@' ) ) )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2=='\"'||LA4_2=='\''||LA4_2=='\\'||LA4_2=='b'||LA4_2=='f'||LA4_2=='n'||LA4_2=='r'||(LA4_2>='t' && LA4_2<='u')) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2=='*'||LA4_2=='@') ) {
                        alt4=2;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='?')||(LA4_0>='A' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEvents.g:561:63: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalEvents.g:561:108: ( '\\\\*' | '\\\\@' )
            	    {
            	    // InternalEvents.g:561:108: ( '\\\\*' | '\\\\@' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0=='\\') ) {
            	        int LA3_1 = input.LA(2);

            	        if ( (LA3_1=='*') ) {
            	            alt3=1;
            	        }
            	        else if ( (LA3_1=='@') ) {
            	            alt3=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalEvents.g:561:109: '\\\\*'
            	            {
            	            match("\\*"); 


            	            }
            	            break;
            	        case 2 :
            	            // InternalEvents.g:561:115: '\\\\@'
            	            {
            	            match("\\@"); 


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEvents.g:561:122: ~ ( ( '\\\\' | '*' | '@' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_ANNOTATION_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEvents.g:563:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEvents.g:563:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEvents.g:563:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvents.g:563:11: '^'
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

            // InternalEvents.g:563:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvents.g:
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
            	    break loop6;
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
            // InternalEvents.g:565:10: ( ( '0' .. '9' )+ )
            // InternalEvents.g:565:12: ( '0' .. '9' )+
            {
            // InternalEvents.g:565:12: ( '0' .. '9' )+
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
            	    // InternalEvents.g:565:13: '0' .. '9'
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
            // InternalEvents.g:567:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEvents.g:567:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEvents.g:567:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEvents.g:567:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEvents.g:567:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalEvents.g:567:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEvents.g:567:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEvents.g:567:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEvents.g:567:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEvents.g:567:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEvents.g:567:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalEvents.g:569:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEvents.g:569:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEvents.g:569:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEvents.g:569:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalEvents.g:571:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEvents.g:571:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEvents.g:571:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEvents.g:571:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalEvents.g:571:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEvents.g:571:41: ( '\\r' )? '\\n'
                    {
                    // InternalEvents.g:571:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEvents.g:571:41: '\\r'
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
            // InternalEvents.g:573:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEvents.g:573:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEvents.g:573:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEvents.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalEvents.g:575:16: ( . )
            // InternalEvents.g:575:18: .
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
        // InternalEvents.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ANNOTATION_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=22;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalEvents.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalEvents.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalEvents.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalEvents.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalEvents.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalEvents.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalEvents.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalEvents.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalEvents.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalEvents.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalEvents.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalEvents.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalEvents.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalEvents.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalEvents.g:1:94: RULE_ANNOTATION_STRING
                {
                mRULE_ANNOTATION_STRING(); 

                }
                break;
            case 16 :
                // InternalEvents.g:1:117: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalEvents.g:1:125: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalEvents.g:1:134: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalEvents.g:1:146: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalEvents.g:1:162: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalEvents.g:1:178: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalEvents.g:1:186: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\2\27\4\uffff\1\27\1\25\1\41\3\27\1\uffff\2\25\2\uffff\2\25\2\uffff\1\27\1\uffff\1\27\4\uffff\1\27\1\55\3\uffff\3\27\5\uffff\3\27\2\uffff\7\27\1\74\5\27\1\uffff\1\102\3\27\1\106\1\uffff\1\107\1\27\1\111\2\uffff\1\27\1\uffff\1\113\1\uffff";
    static final String DFA16_eofS =
        "\114\uffff";
    static final String DFA16_minS =
        "\1\0\1\141\1\166\4\uffff\1\145\1\52\1\57\1\155\1\162\1\157\1\uffff\1\55\1\101\2\uffff\2\0\2\uffff\1\143\1\uffff\1\145\4\uffff\1\146\1\0\3\uffff\1\160\1\157\1\144\5\uffff\1\153\1\156\1\141\2\uffff\1\157\1\155\1\145\1\141\1\164\1\165\1\162\1\60\1\154\1\147\1\124\1\154\1\164\1\uffff\1\60\1\145\1\171\1\164\1\60\1\uffff\1\60\1\160\1\60\2\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\141\1\166\4\uffff\1\145\2\57\1\155\1\162\1\157\1\uffff\2\172\2\uffff\2\uffff\2\uffff\1\143\1\uffff\1\145\4\uffff\1\146\1\uffff\3\uffff\1\160\1\157\1\144\5\uffff\1\153\1\156\1\141\2\uffff\1\157\1\155\1\145\1\141\1\164\1\165\1\162\1\172\1\154\1\147\1\124\1\154\1\164\1\uffff\1\172\1\145\1\171\1\164\1\172\1\uffff\1\172\1\160\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\6\uffff\1\15\2\uffff\1\20\1\21\2\uffff\1\25\1\26\1\uffff\1\20\1\uffff\1\3\1\4\1\5\1\6\2\uffff\1\24\1\11\1\16\3\uffff\1\15\1\17\1\21\1\22\1\25\3\uffff\1\10\1\23\15\uffff\1\13\5\uffff\1\14\3\uffff\1\12\1\1\1\uffff\1\7\1\uffff\1\2";
    static final String DFA16_specialS =
        "\1\2\21\uffff\1\3\1\1\12\uffff\1\0\55\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\22\4\25\1\23\2\25\1\11\1\25\1\4\1\25\1\15\1\10\12\21\3\25\1\6\2\25\1\16\4\20\1\2\25\20\3\25\1\17\1\20\1\25\3\20\1\7\1\20\1\13\2\20\1\12\3\20\1\14\2\20\1\1\12\20\1\3\1\25\1\5\uff82\25",
            "\1\26",
            "\1\30",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36\4\uffff\1\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\1\46\63\uffff\32\46",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\50",
            "\0\50",
            "",
            "",
            "\1\52",
            "",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\0\56",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\110",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\112",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ANNOTATION_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 46;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_19 = input.LA(1);

                        s = -1;
                        if ( ((LA16_19>='\u0000' && LA16_19<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='p') ) {s = 1;}

                        else if ( (LA16_0=='E') ) {s = 2;}

                        else if ( (LA16_0=='{') ) {s = 3;}

                        else if ( (LA16_0==',') ) {s = 4;}

                        else if ( (LA16_0=='}') ) {s = 5;}

                        else if ( (LA16_0=='=') ) {s = 6;}

                        else if ( (LA16_0=='d') ) {s = 7;}

                        else if ( (LA16_0=='/') ) {s = 8;}

                        else if ( (LA16_0=='*') ) {s = 9;}

                        else if ( (LA16_0=='i') ) {s = 10;}

                        else if ( (LA16_0=='f') ) {s = 11;}

                        else if ( (LA16_0=='m') ) {s = 12;}

                        else if ( (LA16_0=='.') ) {s = 13;}

                        else if ( (LA16_0=='@') ) {s = 14;}

                        else if ( (LA16_0=='^') ) {s = 15;}

                        else if ( ((LA16_0>='A' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='c')||LA16_0=='e'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='l')||(LA16_0>='n' && LA16_0<='o')||(LA16_0>='q' && LA16_0<='z')) ) {s = 16;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 17;}

                        else if ( (LA16_0=='\"') ) {s = 18;}

                        else if ( (LA16_0=='\'') ) {s = 19;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 20;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0=='+'||LA16_0=='-'||(LA16_0>=':' && LA16_0<='<')||(LA16_0>='>' && LA16_0<='?')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_18 = input.LA(1);

                        s = -1;
                        if ( ((LA16_18>='\u0000' && LA16_18<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}