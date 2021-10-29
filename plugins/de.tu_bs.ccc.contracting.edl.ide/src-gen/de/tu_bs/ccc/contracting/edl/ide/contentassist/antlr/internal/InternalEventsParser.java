package de.tu_bs.ccc.contracting.edl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.tu_bs.ccc.contracting.edl.services.EventsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANNOTATION_STRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'package'", "'EventType'", "'{'", "'}'", "','", "'='", "'/*'", "'*/'", "'import'", "'from'", "'.'", "'*'", "'default'"
    };
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


        public InternalEventsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEvents.g"; }


    	private EventsGrammarAccess grammarAccess;

    	public void setGrammarAccess(EventsGrammarAccess grammarAccess) {
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
    // InternalEvents.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEvents.g:54:1: ( ruleModel EOF )
            // InternalEvents.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEvents.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalEvents.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalEvents.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalEvents.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalEvents.g:69:3: ( rule__Model__Group__0 )
            // InternalEvents.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEventType"
    // InternalEvents.g:78:1: entryRuleEventType : ruleEventType EOF ;
    public final void entryRuleEventType() throws RecognitionException {
        try {
            // InternalEvents.g:79:1: ( ruleEventType EOF )
            // InternalEvents.g:80:1: ruleEventType EOF
            {
             before(grammarAccess.getEventTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getEventTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventType"


    // $ANTLR start "ruleEventType"
    // InternalEvents.g:87:1: ruleEventType : ( ( rule__EventType__Group__0 ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:91:2: ( ( ( rule__EventType__Group__0 ) ) )
            // InternalEvents.g:92:2: ( ( rule__EventType__Group__0 ) )
            {
            // InternalEvents.g:92:2: ( ( rule__EventType__Group__0 ) )
            // InternalEvents.g:93:3: ( rule__EventType__Group__0 )
            {
             before(grammarAccess.getEventTypeAccess().getGroup()); 
            // InternalEvents.g:94:3: ( rule__EventType__Group__0 )
            // InternalEvents.g:94:4: rule__EventType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleEvent"
    // InternalEvents.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalEvents.g:104:1: ( ruleEvent EOF )
            // InternalEvents.g:105:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEvents.g:112:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:116:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalEvents.g:117:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalEvents.g:117:2: ( ( rule__Event__Group__0 ) )
            // InternalEvents.g:118:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalEvents.g:119:3: ( rule__Event__Group__0 )
            // InternalEvents.g:119:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAnnotationBlock"
    // InternalEvents.g:128:1: entryRuleAnnotationBlock : ruleAnnotationBlock EOF ;
    public final void entryRuleAnnotationBlock() throws RecognitionException {
        try {
            // InternalEvents.g:129:1: ( ruleAnnotationBlock EOF )
            // InternalEvents.g:130:1: ruleAnnotationBlock EOF
            {
             before(grammarAccess.getAnnotationBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotationBlock();

            state._fsp--;

             after(grammarAccess.getAnnotationBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotationBlock"


    // $ANTLR start "ruleAnnotationBlock"
    // InternalEvents.g:137:1: ruleAnnotationBlock : ( ( rule__AnnotationBlock__Group__0 ) ) ;
    public final void ruleAnnotationBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:141:2: ( ( ( rule__AnnotationBlock__Group__0 ) ) )
            // InternalEvents.g:142:2: ( ( rule__AnnotationBlock__Group__0 ) )
            {
            // InternalEvents.g:142:2: ( ( rule__AnnotationBlock__Group__0 ) )
            // InternalEvents.g:143:3: ( rule__AnnotationBlock__Group__0 )
            {
             before(grammarAccess.getAnnotationBlockAccess().getGroup()); 
            // InternalEvents.g:144:3: ( rule__AnnotationBlock__Group__0 )
            // InternalEvents.g:144:4: rule__AnnotationBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotationBlock"


    // $ANTLR start "entryRuleAnnotation"
    // InternalEvents.g:153:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalEvents.g:154:1: ( ruleAnnotation EOF )
            // InternalEvents.g:155:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalEvents.g:162:1: ruleAnnotation : ( ( rule__Annotation__RawTextAssignment ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:166:2: ( ( ( rule__Annotation__RawTextAssignment ) ) )
            // InternalEvents.g:167:2: ( ( rule__Annotation__RawTextAssignment ) )
            {
            // InternalEvents.g:167:2: ( ( rule__Annotation__RawTextAssignment ) )
            // InternalEvents.g:168:3: ( rule__Annotation__RawTextAssignment )
            {
             before(grammarAccess.getAnnotationAccess().getRawTextAssignment()); 
            // InternalEvents.g:169:3: ( rule__Annotation__RawTextAssignment )
            // InternalEvents.g:169:4: rule__Annotation__RawTextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__RawTextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getRawTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleImport"
    // InternalEvents.g:178:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEvents.g:179:1: ( ruleImport EOF )
            // InternalEvents.g:180:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEvents.g:187:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:191:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEvents.g:192:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEvents.g:192:2: ( ( rule__Import__Group__0 ) )
            // InternalEvents.g:193:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEvents.g:194:3: ( rule__Import__Group__0 )
            // InternalEvents.g:194:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalEvents.g:203:1: entryRuleImportedFQN : ruleImportedFQN EOF ;
    public final void entryRuleImportedFQN() throws RecognitionException {
        try {
            // InternalEvents.g:204:1: ( ruleImportedFQN EOF )
            // InternalEvents.g:205:1: ruleImportedFQN EOF
            {
             before(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalEvents.g:212:1: ruleImportedFQN : ( ( rule__ImportedFQN__Group__0 ) ) ;
    public final void ruleImportedFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:216:2: ( ( ( rule__ImportedFQN__Group__0 ) ) )
            // InternalEvents.g:217:2: ( ( rule__ImportedFQN__Group__0 ) )
            {
            // InternalEvents.g:217:2: ( ( rule__ImportedFQN__Group__0 ) )
            // InternalEvents.g:218:3: ( rule__ImportedFQN__Group__0 )
            {
             before(grammarAccess.getImportedFQNAccess().getGroup()); 
            // InternalEvents.g:219:3: ( rule__ImportedFQN__Group__0 )
            // InternalEvents.g:219:4: rule__ImportedFQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleFQN"
    // InternalEvents.g:228:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalEvents.g:229:1: ( ruleFQN EOF )
            // InternalEvents.g:230:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalEvents.g:237:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:241:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalEvents.g:242:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalEvents.g:242:2: ( ( rule__FQN__Group__0 ) )
            // InternalEvents.g:243:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalEvents.g:244:3: ( rule__FQN__Group__0 )
            // InternalEvents.g:244:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Import__Alternatives_1"
    // InternalEvents.g:252:1: rule__Import__Alternatives_1 : ( ( ( rule__Import__Group_1_0__0 ) ) | ( 'model' ) );
    public final void rule__Import__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:256:1: ( ( ( rule__Import__Group_1_0__0 ) ) | ( 'model' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEvents.g:257:2: ( ( rule__Import__Group_1_0__0 ) )
                    {
                    // InternalEvents.g:257:2: ( ( rule__Import__Group_1_0__0 ) )
                    // InternalEvents.g:258:3: ( rule__Import__Group_1_0__0 )
                    {
                     before(grammarAccess.getImportAccess().getGroup_1_0()); 
                    // InternalEvents.g:259:3: ( rule__Import__Group_1_0__0 )
                    // InternalEvents.g:259:4: rule__Import__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Import__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImportAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEvents.g:263:2: ( 'model' )
                    {
                    // InternalEvents.g:263:2: ( 'model' )
                    // InternalEvents.g:264:3: 'model'
                    {
                     before(grammarAccess.getImportAccess().getModelKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getImportAccess().getModelKeyword_1_1()); 

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
    // $ANTLR end "rule__Import__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalEvents.g:273:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:277:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalEvents.g:278:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:285:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:289:1: ( ( () ) )
            // InternalEvents.g:290:1: ( () )
            {
            // InternalEvents.g:290:1: ( () )
            // InternalEvents.g:291:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalEvents.g:292:2: ()
            // InternalEvents.g:292:3: 
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
    // InternalEvents.g:300:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:304:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalEvents.g:305:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:312:1: rule__Model__Group__1__Impl : ( 'package' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:316:1: ( ( 'package' ) )
            // InternalEvents.g:317:1: ( 'package' )
            {
            // InternalEvents.g:317:1: ( 'package' )
            // InternalEvents.g:318:2: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPackageKeyword_1()); 

            }


            }

        }
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
    // InternalEvents.g:327:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:331:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalEvents.g:332:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:339:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:343:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalEvents.g:344:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalEvents.g:344:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalEvents.g:345:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalEvents.g:346:2: ( rule__Model__NameAssignment_2 )
            // InternalEvents.g:346:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalEvents.g:354:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:358:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalEvents.g:359:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:366:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:370:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // InternalEvents.g:371:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // InternalEvents.g:371:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // InternalEvents.g:372:2: ( rule__Model__ImportsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            // InternalEvents.g:373:2: ( rule__Model__ImportsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvents.g:373:3: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_3()); 

            }


            }

        }
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
    // InternalEvents.g:381:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:385:1: ( rule__Model__Group__4__Impl )
            // InternalEvents.g:386:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // InternalEvents.g:392:1: rule__Model__Group__4__Impl : ( ( rule__Model__EventCollectionAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:396:1: ( ( ( rule__Model__EventCollectionAssignment_4 )* ) )
            // InternalEvents.g:397:1: ( ( rule__Model__EventCollectionAssignment_4 )* )
            {
            // InternalEvents.g:397:1: ( ( rule__Model__EventCollectionAssignment_4 )* )
            // InternalEvents.g:398:2: ( rule__Model__EventCollectionAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getEventCollectionAssignment_4()); 
            // InternalEvents.g:399:2: ( rule__Model__EventCollectionAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEvents.g:399:3: rule__Model__EventCollectionAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__EventCollectionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEventCollectionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__EventType__Group__0"
    // InternalEvents.g:408:1: rule__EventType__Group__0 : rule__EventType__Group__0__Impl rule__EventType__Group__1 ;
    public final void rule__EventType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:412:1: ( rule__EventType__Group__0__Impl rule__EventType__Group__1 )
            // InternalEvents.g:413:2: rule__EventType__Group__0__Impl rule__EventType__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EventType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__1();

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
    // $ANTLR end "rule__EventType__Group__0"


    // $ANTLR start "rule__EventType__Group__0__Impl"
    // InternalEvents.g:420:1: rule__EventType__Group__0__Impl : ( () ) ;
    public final void rule__EventType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:424:1: ( ( () ) )
            // InternalEvents.g:425:1: ( () )
            {
            // InternalEvents.g:425:1: ( () )
            // InternalEvents.g:426:2: ()
            {
             before(grammarAccess.getEventTypeAccess().getEventTypeAction_0()); 
            // InternalEvents.g:427:2: ()
            // InternalEvents.g:427:3: 
            {
            }

             after(grammarAccess.getEventTypeAccess().getEventTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__0__Impl"


    // $ANTLR start "rule__EventType__Group__1"
    // InternalEvents.g:435:1: rule__EventType__Group__1 : rule__EventType__Group__1__Impl rule__EventType__Group__2 ;
    public final void rule__EventType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:439:1: ( rule__EventType__Group__1__Impl rule__EventType__Group__2 )
            // InternalEvents.g:440:2: rule__EventType__Group__1__Impl rule__EventType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EventType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__2();

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
    // $ANTLR end "rule__EventType__Group__1"


    // $ANTLR start "rule__EventType__Group__1__Impl"
    // InternalEvents.g:447:1: rule__EventType__Group__1__Impl : ( ( rule__EventType__CommentAssignment_1 )? ) ;
    public final void rule__EventType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:451:1: ( ( ( rule__EventType__CommentAssignment_1 )? ) )
            // InternalEvents.g:452:1: ( ( rule__EventType__CommentAssignment_1 )? )
            {
            // InternalEvents.g:452:1: ( ( rule__EventType__CommentAssignment_1 )? )
            // InternalEvents.g:453:2: ( rule__EventType__CommentAssignment_1 )?
            {
             before(grammarAccess.getEventTypeAccess().getCommentAssignment_1()); 
            // InternalEvents.g:454:2: ( rule__EventType__CommentAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvents.g:454:3: rule__EventType__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventType__CommentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventTypeAccess().getCommentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__1__Impl"


    // $ANTLR start "rule__EventType__Group__2"
    // InternalEvents.g:462:1: rule__EventType__Group__2 : rule__EventType__Group__2__Impl rule__EventType__Group__3 ;
    public final void rule__EventType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:466:1: ( rule__EventType__Group__2__Impl rule__EventType__Group__3 )
            // InternalEvents.g:467:2: rule__EventType__Group__2__Impl rule__EventType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EventType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__3();

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
    // $ANTLR end "rule__EventType__Group__2"


    // $ANTLR start "rule__EventType__Group__2__Impl"
    // InternalEvents.g:474:1: rule__EventType__Group__2__Impl : ( 'EventType' ) ;
    public final void rule__EventType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:478:1: ( ( 'EventType' ) )
            // InternalEvents.g:479:1: ( 'EventType' )
            {
            // InternalEvents.g:479:1: ( 'EventType' )
            // InternalEvents.g:480:2: 'EventType'
            {
             before(grammarAccess.getEventTypeAccess().getEventTypeKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEventTypeAccess().getEventTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__2__Impl"


    // $ANTLR start "rule__EventType__Group__3"
    // InternalEvents.g:489:1: rule__EventType__Group__3 : rule__EventType__Group__3__Impl rule__EventType__Group__4 ;
    public final void rule__EventType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:493:1: ( rule__EventType__Group__3__Impl rule__EventType__Group__4 )
            // InternalEvents.g:494:2: rule__EventType__Group__3__Impl rule__EventType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__EventType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__4();

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
    // $ANTLR end "rule__EventType__Group__3"


    // $ANTLR start "rule__EventType__Group__3__Impl"
    // InternalEvents.g:501:1: rule__EventType__Group__3__Impl : ( ( rule__EventType__NameAssignment_3 )? ) ;
    public final void rule__EventType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:505:1: ( ( ( rule__EventType__NameAssignment_3 )? ) )
            // InternalEvents.g:506:1: ( ( rule__EventType__NameAssignment_3 )? )
            {
            // InternalEvents.g:506:1: ( ( rule__EventType__NameAssignment_3 )? )
            // InternalEvents.g:507:2: ( rule__EventType__NameAssignment_3 )?
            {
             before(grammarAccess.getEventTypeAccess().getNameAssignment_3()); 
            // InternalEvents.g:508:2: ( rule__EventType__NameAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEvents.g:508:3: rule__EventType__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventType__NameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventTypeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__3__Impl"


    // $ANTLR start "rule__EventType__Group__4"
    // InternalEvents.g:516:1: rule__EventType__Group__4 : rule__EventType__Group__4__Impl rule__EventType__Group__5 ;
    public final void rule__EventType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:520:1: ( rule__EventType__Group__4__Impl rule__EventType__Group__5 )
            // InternalEvents.g:521:2: rule__EventType__Group__4__Impl rule__EventType__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__EventType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__5();

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
    // $ANTLR end "rule__EventType__Group__4"


    // $ANTLR start "rule__EventType__Group__4__Impl"
    // InternalEvents.g:528:1: rule__EventType__Group__4__Impl : ( '{' ) ;
    public final void rule__EventType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:532:1: ( ( '{' ) )
            // InternalEvents.g:533:1: ( '{' )
            {
            // InternalEvents.g:533:1: ( '{' )
            // InternalEvents.g:534:2: '{'
            {
             before(grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__4__Impl"


    // $ANTLR start "rule__EventType__Group__5"
    // InternalEvents.g:543:1: rule__EventType__Group__5 : rule__EventType__Group__5__Impl rule__EventType__Group__6 ;
    public final void rule__EventType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:547:1: ( rule__EventType__Group__5__Impl rule__EventType__Group__6 )
            // InternalEvents.g:548:2: rule__EventType__Group__5__Impl rule__EventType__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__EventType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__6();

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
    // $ANTLR end "rule__EventType__Group__5"


    // $ANTLR start "rule__EventType__Group__5__Impl"
    // InternalEvents.g:555:1: rule__EventType__Group__5__Impl : ( ( rule__EventType__EventsAssignment_5 ) ) ;
    public final void rule__EventType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:559:1: ( ( ( rule__EventType__EventsAssignment_5 ) ) )
            // InternalEvents.g:560:1: ( ( rule__EventType__EventsAssignment_5 ) )
            {
            // InternalEvents.g:560:1: ( ( rule__EventType__EventsAssignment_5 ) )
            // InternalEvents.g:561:2: ( rule__EventType__EventsAssignment_5 )
            {
             before(grammarAccess.getEventTypeAccess().getEventsAssignment_5()); 
            // InternalEvents.g:562:2: ( rule__EventType__EventsAssignment_5 )
            // InternalEvents.g:562:3: rule__EventType__EventsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EventType__EventsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getEventsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__5__Impl"


    // $ANTLR start "rule__EventType__Group__6"
    // InternalEvents.g:570:1: rule__EventType__Group__6 : rule__EventType__Group__6__Impl rule__EventType__Group__7 ;
    public final void rule__EventType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:574:1: ( rule__EventType__Group__6__Impl rule__EventType__Group__7 )
            // InternalEvents.g:575:2: rule__EventType__Group__6__Impl rule__EventType__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__EventType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group__7();

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
    // $ANTLR end "rule__EventType__Group__6"


    // $ANTLR start "rule__EventType__Group__6__Impl"
    // InternalEvents.g:582:1: rule__EventType__Group__6__Impl : ( ( rule__EventType__Group_6__0 )* ) ;
    public final void rule__EventType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:586:1: ( ( ( rule__EventType__Group_6__0 )* ) )
            // InternalEvents.g:587:1: ( ( rule__EventType__Group_6__0 )* )
            {
            // InternalEvents.g:587:1: ( ( rule__EventType__Group_6__0 )* )
            // InternalEvents.g:588:2: ( rule__EventType__Group_6__0 )*
            {
             before(grammarAccess.getEventTypeAccess().getGroup_6()); 
            // InternalEvents.g:589:2: ( rule__EventType__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEvents.g:589:3: rule__EventType__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EventType__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEventTypeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__6__Impl"


    // $ANTLR start "rule__EventType__Group__7"
    // InternalEvents.g:597:1: rule__EventType__Group__7 : rule__EventType__Group__7__Impl ;
    public final void rule__EventType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:601:1: ( rule__EventType__Group__7__Impl )
            // InternalEvents.g:602:2: rule__EventType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Group__7__Impl();

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
    // $ANTLR end "rule__EventType__Group__7"


    // $ANTLR start "rule__EventType__Group__7__Impl"
    // InternalEvents.g:608:1: rule__EventType__Group__7__Impl : ( '}' ) ;
    public final void rule__EventType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:612:1: ( ( '}' ) )
            // InternalEvents.g:613:1: ( '}' )
            {
            // InternalEvents.g:613:1: ( '}' )
            // InternalEvents.g:614:2: '}'
            {
             before(grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group__7__Impl"


    // $ANTLR start "rule__EventType__Group_6__0"
    // InternalEvents.g:624:1: rule__EventType__Group_6__0 : rule__EventType__Group_6__0__Impl rule__EventType__Group_6__1 ;
    public final void rule__EventType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:628:1: ( rule__EventType__Group_6__0__Impl rule__EventType__Group_6__1 )
            // InternalEvents.g:629:2: rule__EventType__Group_6__0__Impl rule__EventType__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__EventType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventType__Group_6__1();

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
    // $ANTLR end "rule__EventType__Group_6__0"


    // $ANTLR start "rule__EventType__Group_6__0__Impl"
    // InternalEvents.g:636:1: rule__EventType__Group_6__0__Impl : ( ',' ) ;
    public final void rule__EventType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:640:1: ( ( ',' ) )
            // InternalEvents.g:641:1: ( ',' )
            {
            // InternalEvents.g:641:1: ( ',' )
            // InternalEvents.g:642:2: ','
            {
             before(grammarAccess.getEventTypeAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventTypeAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group_6__0__Impl"


    // $ANTLR start "rule__EventType__Group_6__1"
    // InternalEvents.g:651:1: rule__EventType__Group_6__1 : rule__EventType__Group_6__1__Impl ;
    public final void rule__EventType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:655:1: ( rule__EventType__Group_6__1__Impl )
            // InternalEvents.g:656:2: rule__EventType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Group_6__1__Impl();

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
    // $ANTLR end "rule__EventType__Group_6__1"


    // $ANTLR start "rule__EventType__Group_6__1__Impl"
    // InternalEvents.g:662:1: rule__EventType__Group_6__1__Impl : ( ( rule__EventType__EventsAssignment_6_1 ) ) ;
    public final void rule__EventType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:666:1: ( ( ( rule__EventType__EventsAssignment_6_1 ) ) )
            // InternalEvents.g:667:1: ( ( rule__EventType__EventsAssignment_6_1 ) )
            {
            // InternalEvents.g:667:1: ( ( rule__EventType__EventsAssignment_6_1 ) )
            // InternalEvents.g:668:2: ( rule__EventType__EventsAssignment_6_1 )
            {
             before(grammarAccess.getEventTypeAccess().getEventsAssignment_6_1()); 
            // InternalEvents.g:669:2: ( rule__EventType__EventsAssignment_6_1 )
            // InternalEvents.g:669:3: rule__EventType__EventsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EventType__EventsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventTypeAccess().getEventsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__Group_6__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalEvents.g:678:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:682:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalEvents.g:683:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalEvents.g:690:1: rule__Event__Group__0__Impl : ( ( rule__Event__ElementAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:694:1: ( ( ( rule__Event__ElementAssignment_0 ) ) )
            // InternalEvents.g:695:1: ( ( rule__Event__ElementAssignment_0 ) )
            {
            // InternalEvents.g:695:1: ( ( rule__Event__ElementAssignment_0 ) )
            // InternalEvents.g:696:2: ( rule__Event__ElementAssignment_0 )
            {
             before(grammarAccess.getEventAccess().getElementAssignment_0()); 
            // InternalEvents.g:697:2: ( rule__Event__ElementAssignment_0 )
            // InternalEvents.g:697:3: rule__Event__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalEvents.g:705:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:709:1: ( rule__Event__Group__1__Impl )
            // InternalEvents.g:710:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__1__Impl();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalEvents.g:716:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:720:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // InternalEvents.g:721:1: ( ( rule__Event__Group_1__0 )? )
            {
            // InternalEvents.g:721:1: ( ( rule__Event__Group_1__0 )? )
            // InternalEvents.g:722:2: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // InternalEvents.g:723:2: ( rule__Event__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEvents.g:723:3: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalEvents.g:732:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:736:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalEvents.g:737:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1();

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
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // InternalEvents.g:744:1: rule__Event__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:748:1: ( ( '=' ) )
            // InternalEvents.g:749:1: ( '=' )
            {
            // InternalEvents.g:749:1: ( '=' )
            // InternalEvents.g:750:2: '='
            {
             before(grammarAccess.getEventAccess().getEqualsSignKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // InternalEvents.g:759:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:763:1: ( rule__Event__Group_1__1__Impl )
            // InternalEvents.g:764:2: rule__Event__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1__Impl();

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
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // InternalEvents.g:770:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__DefaultAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:774:1: ( ( ( rule__Event__DefaultAssignment_1_1 ) ) )
            // InternalEvents.g:775:1: ( ( rule__Event__DefaultAssignment_1_1 ) )
            {
            // InternalEvents.g:775:1: ( ( rule__Event__DefaultAssignment_1_1 ) )
            // InternalEvents.g:776:2: ( rule__Event__DefaultAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getDefaultAssignment_1_1()); 
            // InternalEvents.g:777:2: ( rule__Event__DefaultAssignment_1_1 )
            // InternalEvents.g:777:3: rule__Event__DefaultAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__DefaultAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getDefaultAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__AnnotationBlock__Group__0"
    // InternalEvents.g:786:1: rule__AnnotationBlock__Group__0 : rule__AnnotationBlock__Group__0__Impl rule__AnnotationBlock__Group__1 ;
    public final void rule__AnnotationBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:790:1: ( rule__AnnotationBlock__Group__0__Impl rule__AnnotationBlock__Group__1 )
            // InternalEvents.g:791:2: rule__AnnotationBlock__Group__0__Impl rule__AnnotationBlock__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AnnotationBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationBlock__Group__1();

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
    // $ANTLR end "rule__AnnotationBlock__Group__0"


    // $ANTLR start "rule__AnnotationBlock__Group__0__Impl"
    // InternalEvents.g:798:1: rule__AnnotationBlock__Group__0__Impl : ( '/*' ) ;
    public final void rule__AnnotationBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:802:1: ( ( '/*' ) )
            // InternalEvents.g:803:1: ( '/*' )
            {
            // InternalEvents.g:803:1: ( '/*' )
            // InternalEvents.g:804:2: '/*'
            {
             before(grammarAccess.getAnnotationBlockAccess().getSolidusAsteriskKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAnnotationBlockAccess().getSolidusAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationBlock__Group__0__Impl"


    // $ANTLR start "rule__AnnotationBlock__Group__1"
    // InternalEvents.g:813:1: rule__AnnotationBlock__Group__1 : rule__AnnotationBlock__Group__1__Impl rule__AnnotationBlock__Group__2 ;
    public final void rule__AnnotationBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:817:1: ( rule__AnnotationBlock__Group__1__Impl rule__AnnotationBlock__Group__2 )
            // InternalEvents.g:818:2: rule__AnnotationBlock__Group__1__Impl rule__AnnotationBlock__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AnnotationBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnnotationBlock__Group__2();

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
    // $ANTLR end "rule__AnnotationBlock__Group__1"


    // $ANTLR start "rule__AnnotationBlock__Group__1__Impl"
    // InternalEvents.g:825:1: rule__AnnotationBlock__Group__1__Impl : ( ( ( rule__AnnotationBlock__ElementsAssignment_1 ) ) ( ( rule__AnnotationBlock__ElementsAssignment_1 )* ) ) ;
    public final void rule__AnnotationBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:829:1: ( ( ( ( rule__AnnotationBlock__ElementsAssignment_1 ) ) ( ( rule__AnnotationBlock__ElementsAssignment_1 )* ) ) )
            // InternalEvents.g:830:1: ( ( ( rule__AnnotationBlock__ElementsAssignment_1 ) ) ( ( rule__AnnotationBlock__ElementsAssignment_1 )* ) )
            {
            // InternalEvents.g:830:1: ( ( ( rule__AnnotationBlock__ElementsAssignment_1 ) ) ( ( rule__AnnotationBlock__ElementsAssignment_1 )* ) )
            // InternalEvents.g:831:2: ( ( rule__AnnotationBlock__ElementsAssignment_1 ) ) ( ( rule__AnnotationBlock__ElementsAssignment_1 )* )
            {
            // InternalEvents.g:831:2: ( ( rule__AnnotationBlock__ElementsAssignment_1 ) )
            // InternalEvents.g:832:3: ( rule__AnnotationBlock__ElementsAssignment_1 )
            {
             before(grammarAccess.getAnnotationBlockAccess().getElementsAssignment_1()); 
            // InternalEvents.g:833:3: ( rule__AnnotationBlock__ElementsAssignment_1 )
            // InternalEvents.g:833:4: rule__AnnotationBlock__ElementsAssignment_1
            {
            pushFollow(FOLLOW_16);
            rule__AnnotationBlock__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationBlockAccess().getElementsAssignment_1()); 

            }

            // InternalEvents.g:836:2: ( ( rule__AnnotationBlock__ElementsAssignment_1 )* )
            // InternalEvents.g:837:3: ( rule__AnnotationBlock__ElementsAssignment_1 )*
            {
             before(grammarAccess.getAnnotationBlockAccess().getElementsAssignment_1()); 
            // InternalEvents.g:838:3: ( rule__AnnotationBlock__ElementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ANNOTATION_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEvents.g:838:4: rule__AnnotationBlock__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AnnotationBlock__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAnnotationBlockAccess().getElementsAssignment_1()); 

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
    // $ANTLR end "rule__AnnotationBlock__Group__1__Impl"


    // $ANTLR start "rule__AnnotationBlock__Group__2"
    // InternalEvents.g:847:1: rule__AnnotationBlock__Group__2 : rule__AnnotationBlock__Group__2__Impl ;
    public final void rule__AnnotationBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:851:1: ( rule__AnnotationBlock__Group__2__Impl )
            // InternalEvents.g:852:2: rule__AnnotationBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnnotationBlock__Group__2__Impl();

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
    // $ANTLR end "rule__AnnotationBlock__Group__2"


    // $ANTLR start "rule__AnnotationBlock__Group__2__Impl"
    // InternalEvents.g:858:1: rule__AnnotationBlock__Group__2__Impl : ( '*/' ) ;
    public final void rule__AnnotationBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:862:1: ( ( '*/' ) )
            // InternalEvents.g:863:1: ( '*/' )
            {
            // InternalEvents.g:863:1: ( '*/' )
            // InternalEvents.g:864:2: '*/'
            {
             before(grammarAccess.getAnnotationBlockAccess().getAsteriskSolidusKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAnnotationBlockAccess().getAsteriskSolidusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationBlock__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEvents.g:874:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:878:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEvents.g:879:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEvents.g:886:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:890:1: ( ( 'import' ) )
            // InternalEvents.g:891:1: ( 'import' )
            {
            // InternalEvents.g:891:1: ( 'import' )
            // InternalEvents.g:892:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEvents.g:901:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:905:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalEvents.g:906:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEvents.g:913:1: rule__Import__Group__1__Impl : ( ( rule__Import__Alternatives_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:917:1: ( ( ( rule__Import__Alternatives_1 ) ) )
            // InternalEvents.g:918:1: ( ( rule__Import__Alternatives_1 ) )
            {
            // InternalEvents.g:918:1: ( ( rule__Import__Alternatives_1 ) )
            // InternalEvents.g:919:2: ( rule__Import__Alternatives_1 )
            {
             before(grammarAccess.getImportAccess().getAlternatives_1()); 
            // InternalEvents.g:920:2: ( rule__Import__Alternatives_1 )
            // InternalEvents.g:920:3: rule__Import__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalEvents.g:928:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:932:1: ( rule__Import__Group__2__Impl )
            // InternalEvents.g:933:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalEvents.g:939:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:943:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalEvents.g:944:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalEvents.g:944:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalEvents.g:945:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalEvents.g:946:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalEvents.g:946:3: rule__Import__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group_1_0__0"
    // InternalEvents.g:955:1: rule__Import__Group_1_0__0 : rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1 ;
    public final void rule__Import__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:959:1: ( rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1 )
            // InternalEvents.g:960:2: rule__Import__Group_1_0__0__Impl rule__Import__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Import__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0__1();

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
    // $ANTLR end "rule__Import__Group_1_0__0"


    // $ANTLR start "rule__Import__Group_1_0__0__Impl"
    // InternalEvents.g:967:1: rule__Import__Group_1_0__0__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1_0_0 ) ) ;
    public final void rule__Import__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:971:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1_0_0 ) ) )
            // InternalEvents.g:972:1: ( ( rule__Import__ImportedNamespaceAssignment_1_0_0 ) )
            {
            // InternalEvents.g:972:1: ( ( rule__Import__ImportedNamespaceAssignment_1_0_0 ) )
            // InternalEvents.g:973:2: ( rule__Import__ImportedNamespaceAssignment_1_0_0 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_0_0()); 
            // InternalEvents.g:974:2: ( rule__Import__ImportedNamespaceAssignment_1_0_0 )
            // InternalEvents.g:974:3: rule__Import__ImportedNamespaceAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0__0__Impl"


    // $ANTLR start "rule__Import__Group_1_0__1"
    // InternalEvents.g:982:1: rule__Import__Group_1_0__1 : rule__Import__Group_1_0__1__Impl ;
    public final void rule__Import__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:986:1: ( rule__Import__Group_1_0__1__Impl )
            // InternalEvents.g:987:2: rule__Import__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Import__Group_1_0__1"


    // $ANTLR start "rule__Import__Group_1_0__1__Impl"
    // InternalEvents.g:993:1: rule__Import__Group_1_0__1__Impl : ( 'from' ) ;
    public final void rule__Import__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:997:1: ( ( 'from' ) )
            // InternalEvents.g:998:1: ( 'from' )
            {
            // InternalEvents.g:998:1: ( 'from' )
            // InternalEvents.g:999:2: 'from'
            {
             before(grammarAccess.getImportAccess().getFromKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getFromKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group_1_0__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__0"
    // InternalEvents.g:1009:1: rule__ImportedFQN__Group__0 : rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 ;
    public final void rule__ImportedFQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1013:1: ( rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1 )
            // InternalEvents.g:1014:2: rule__ImportedFQN__Group__0__Impl rule__ImportedFQN__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ImportedFQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1();

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
    // $ANTLR end "rule__ImportedFQN__Group__0"


    // $ANTLR start "rule__ImportedFQN__Group__0__Impl"
    // InternalEvents.g:1021:1: rule__ImportedFQN__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__ImportedFQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1025:1: ( ( ruleFQN ) )
            // InternalEvents.g:1026:1: ( ruleFQN )
            {
            // InternalEvents.g:1026:1: ( ruleFQN )
            // InternalEvents.g:1027:2: ruleFQN
            {
             before(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group__1"
    // InternalEvents.g:1036:1: rule__ImportedFQN__Group__1 : rule__ImportedFQN__Group__1__Impl ;
    public final void rule__ImportedFQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1040:1: ( rule__ImportedFQN__Group__1__Impl )
            // InternalEvents.g:1041:2: rule__ImportedFQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group__1__Impl();

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
    // $ANTLR end "rule__ImportedFQN__Group__1"


    // $ANTLR start "rule__ImportedFQN__Group__1__Impl"
    // InternalEvents.g:1047:1: rule__ImportedFQN__Group__1__Impl : ( ( rule__ImportedFQN__Group_1__0 )? ) ;
    public final void rule__ImportedFQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1051:1: ( ( ( rule__ImportedFQN__Group_1__0 )? ) )
            // InternalEvents.g:1052:1: ( ( rule__ImportedFQN__Group_1__0 )? )
            {
            // InternalEvents.g:1052:1: ( ( rule__ImportedFQN__Group_1__0 )? )
            // InternalEvents.g:1053:2: ( rule__ImportedFQN__Group_1__0 )?
            {
             before(grammarAccess.getImportedFQNAccess().getGroup_1()); 
            // InternalEvents.g:1054:2: ( rule__ImportedFQN__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvents.g:1054:3: rule__ImportedFQN__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportedFQN__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportedFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group__1__Impl"


    // $ANTLR start "rule__ImportedFQN__Group_1__0"
    // InternalEvents.g:1063:1: rule__ImportedFQN__Group_1__0 : rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1 ;
    public final void rule__ImportedFQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1067:1: ( rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1 )
            // InternalEvents.g:1068:2: rule__ImportedFQN__Group_1__0__Impl rule__ImportedFQN__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ImportedFQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group_1__1();

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
    // $ANTLR end "rule__ImportedFQN__Group_1__0"


    // $ANTLR start "rule__ImportedFQN__Group_1__0__Impl"
    // InternalEvents.g:1075:1: rule__ImportedFQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ImportedFQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1079:1: ( ( '.' ) )
            // InternalEvents.g:1080:1: ( '.' )
            {
            // InternalEvents.g:1080:1: ( '.' )
            // InternalEvents.g:1081:2: '.'
            {
             before(grammarAccess.getImportedFQNAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getImportedFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__0__Impl"


    // $ANTLR start "rule__ImportedFQN__Group_1__1"
    // InternalEvents.g:1090:1: rule__ImportedFQN__Group_1__1 : rule__ImportedFQN__Group_1__1__Impl ;
    public final void rule__ImportedFQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1094:1: ( rule__ImportedFQN__Group_1__1__Impl )
            // InternalEvents.g:1095:2: rule__ImportedFQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedFQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__ImportedFQN__Group_1__1"


    // $ANTLR start "rule__ImportedFQN__Group_1__1__Impl"
    // InternalEvents.g:1101:1: rule__ImportedFQN__Group_1__1__Impl : ( '*' ) ;
    public final void rule__ImportedFQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1105:1: ( ( '*' ) )
            // InternalEvents.g:1106:1: ( '*' )
            {
            // InternalEvents.g:1106:1: ( '*' )
            // InternalEvents.g:1107:2: '*'
            {
             before(grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedFQN__Group_1__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalEvents.g:1117:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1121:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalEvents.g:1122:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:1129:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1133:1: ( ( RULE_ID ) )
            // InternalEvents.g:1134:1: ( RULE_ID )
            {
            // InternalEvents.g:1134:1: ( RULE_ID )
            // InternalEvents.g:1135:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalEvents.g:1144:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1148:1: ( rule__FQN__Group__1__Impl )
            // InternalEvents.g:1149:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:1155:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1159:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalEvents.g:1160:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalEvents.g:1160:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalEvents.g:1161:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalEvents.g:1162:2: ( rule__FQN__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvents.g:1162:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalEvents.g:1171:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1175:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalEvents.g:1176:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:1183:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1187:1: ( ( '.' ) )
            // InternalEvents.g:1188:1: ( '.' )
            {
            // InternalEvents.g:1188:1: ( '.' )
            // InternalEvents.g:1189:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEvents.g:1198:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1202:1: ( rule__FQN__Group_1__1__Impl )
            // InternalEvents.g:1203:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalEvents.g:1209:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1213:1: ( ( RULE_ID ) )
            // InternalEvents.g:1214:1: ( RULE_ID )
            {
            // InternalEvents.g:1214:1: ( RULE_ID )
            // InternalEvents.g:1215:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalEvents.g:1225:1: rule__Model__NameAssignment_2 : ( ruleFQN ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1229:1: ( ( ruleFQN ) )
            // InternalEvents.g:1230:2: ( ruleFQN )
            {
            // InternalEvents.g:1230:2: ( ruleFQN )
            // InternalEvents.g:1231:3: ruleFQN
            {
             before(grammarAccess.getModelAccess().getNameFQNParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameFQNParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // InternalEvents.g:1240:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1244:1: ( ( ruleImport ) )
            // InternalEvents.g:1245:2: ( ruleImport )
            {
            // InternalEvents.g:1245:2: ( ruleImport )
            // InternalEvents.g:1246:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__EventCollectionAssignment_4"
    // InternalEvents.g:1255:1: rule__Model__EventCollectionAssignment_4 : ( ruleEventType ) ;
    public final void rule__Model__EventCollectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1259:1: ( ( ruleEventType ) )
            // InternalEvents.g:1260:2: ( ruleEventType )
            {
            // InternalEvents.g:1260:2: ( ruleEventType )
            // InternalEvents.g:1261:3: ruleEventType
            {
             before(grammarAccess.getModelAccess().getEventCollectionEventTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventCollectionEventTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventCollectionAssignment_4"


    // $ANTLR start "rule__EventType__CommentAssignment_1"
    // InternalEvents.g:1270:1: rule__EventType__CommentAssignment_1 : ( ruleAnnotationBlock ) ;
    public final void rule__EventType__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1274:1: ( ( ruleAnnotationBlock ) )
            // InternalEvents.g:1275:2: ( ruleAnnotationBlock )
            {
            // InternalEvents.g:1275:2: ( ruleAnnotationBlock )
            // InternalEvents.g:1276:3: ruleAnnotationBlock
            {
             before(grammarAccess.getEventTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotationBlock();

            state._fsp--;

             after(grammarAccess.getEventTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__CommentAssignment_1"


    // $ANTLR start "rule__EventType__NameAssignment_3"
    // InternalEvents.g:1285:1: rule__EventType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EventType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1289:1: ( ( RULE_ID ) )
            // InternalEvents.g:1290:2: ( RULE_ID )
            {
            // InternalEvents.g:1290:2: ( RULE_ID )
            // InternalEvents.g:1291:3: RULE_ID
            {
             before(grammarAccess.getEventTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventTypeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__NameAssignment_3"


    // $ANTLR start "rule__EventType__EventsAssignment_5"
    // InternalEvents.g:1300:1: rule__EventType__EventsAssignment_5 : ( ruleEvent ) ;
    public final void rule__EventType__EventsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1304:1: ( ( ruleEvent ) )
            // InternalEvents.g:1305:2: ( ruleEvent )
            {
            // InternalEvents.g:1305:2: ( ruleEvent )
            // InternalEvents.g:1306:3: ruleEvent
            {
             before(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__EventsAssignment_5"


    // $ANTLR start "rule__EventType__EventsAssignment_6_1"
    // InternalEvents.g:1315:1: rule__EventType__EventsAssignment_6_1 : ( ruleEvent ) ;
    public final void rule__EventType__EventsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1319:1: ( ( ruleEvent ) )
            // InternalEvents.g:1320:2: ( ruleEvent )
            {
            // InternalEvents.g:1320:2: ( ruleEvent )
            // InternalEvents.g:1321:3: ruleEvent
            {
             before(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventType__EventsAssignment_6_1"


    // $ANTLR start "rule__Event__ElementAssignment_0"
    // InternalEvents.g:1330:1: rule__Event__ElementAssignment_0 : ( RULE_ID ) ;
    public final void rule__Event__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1334:1: ( ( RULE_ID ) )
            // InternalEvents.g:1335:2: ( RULE_ID )
            {
            // InternalEvents.g:1335:2: ( RULE_ID )
            // InternalEvents.g:1336:3: RULE_ID
            {
             before(grammarAccess.getEventAccess().getElementIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getElementIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ElementAssignment_0"


    // $ANTLR start "rule__Event__DefaultAssignment_1_1"
    // InternalEvents.g:1345:1: rule__Event__DefaultAssignment_1_1 : ( ( 'default' ) ) ;
    public final void rule__Event__DefaultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1349:1: ( ( ( 'default' ) ) )
            // InternalEvents.g:1350:2: ( ( 'default' ) )
            {
            // InternalEvents.g:1350:2: ( ( 'default' ) )
            // InternalEvents.g:1351:3: ( 'default' )
            {
             before(grammarAccess.getEventAccess().getDefaultDefaultKeyword_1_1_0()); 
            // InternalEvents.g:1352:3: ( 'default' )
            // InternalEvents.g:1353:4: 'default'
            {
             before(grammarAccess.getEventAccess().getDefaultDefaultKeyword_1_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getDefaultDefaultKeyword_1_1_0()); 

            }

             after(grammarAccess.getEventAccess().getDefaultDefaultKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DefaultAssignment_1_1"


    // $ANTLR start "rule__AnnotationBlock__ElementsAssignment_1"
    // InternalEvents.g:1364:1: rule__AnnotationBlock__ElementsAssignment_1 : ( ruleAnnotation ) ;
    public final void rule__AnnotationBlock__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1368:1: ( ( ruleAnnotation ) )
            // InternalEvents.g:1369:2: ( ruleAnnotation )
            {
            // InternalEvents.g:1369:2: ( ruleAnnotation )
            // InternalEvents.g:1370:3: ruleAnnotation
            {
             before(grammarAccess.getAnnotationBlockAccess().getElementsAnnotationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationBlockAccess().getElementsAnnotationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnnotationBlock__ElementsAssignment_1"


    // $ANTLR start "rule__Annotation__RawTextAssignment"
    // InternalEvents.g:1379:1: rule__Annotation__RawTextAssignment : ( RULE_ANNOTATION_STRING ) ;
    public final void rule__Annotation__RawTextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1383:1: ( ( RULE_ANNOTATION_STRING ) )
            // InternalEvents.g:1384:2: ( RULE_ANNOTATION_STRING )
            {
            // InternalEvents.g:1384:2: ( RULE_ANNOTATION_STRING )
            // InternalEvents.g:1385:3: RULE_ANNOTATION_STRING
            {
             before(grammarAccess.getAnnotationAccess().getRawTextANNOTATION_STRINGTerminalRuleCall_0()); 
            match(input,RULE_ANNOTATION_STRING,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getRawTextANNOTATION_STRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__RawTextAssignment"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1_0_0"
    // InternalEvents.g:1394:1: rule__Import__ImportedNamespaceAssignment_1_0_0 : ( ruleImportedFQN ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1398:1: ( ( ruleImportedFQN ) )
            // InternalEvents.g:1399:2: ( ruleImportedFQN )
            {
            // InternalEvents.g:1399:2: ( ruleImportedFQN )
            // InternalEvents.g:1400:3: ruleImportedFQN
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedFQN();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1_0_0"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // InternalEvents.g:1409:1: rule__Import__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEvents.g:1413:1: ( ( RULE_STRING ) )
            // InternalEvents.g:1414:2: ( RULE_STRING )
            {
            // InternalEvents.g:1414:2: ( RULE_STRING )
            // InternalEvents.g:1415:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000284000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});

}