package de.tu_bs.ccc.contracting.parser.antlr.internal;

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
import de.tu_bs.ccc.contracting.services.BehaviorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBehaviorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CC_STRING", "RULE_E_DOUBLE_OBJECT", "RULE_E_FLOAT_OBJECT", "RULE_ANNOTATION_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Behavior'", "'implements'", "'{'", "'vars'", "';'", "'}'", "'events'", "'signals'", "'FSM'", "'('", "','", "')'", "'on'", "'->'", "'time'", "'condition'", "'call'", "'event'", "'signal'", "':'", "'void'", "'override'", "'Operation'", "'['", "']'", "'varargs'", "'ref'", "'contract'", "'also'", "'requires'", "'ensures'", "'initial'", "'state'", "'entry'", "'exit'", "'do'", "'tick'", "'emit'", "'Integer'", "'minInt'", "'maxInt'", "'-'", "'public'", "'array'", "'of'", "'typedef'", "'is'", "'struct'", "'extends'", "'polymorphic'", "'union'", "'-->'", "'map'", "'to'", "'='", "'const'", "'=>'", "'/*'", "'*/'", "'import'", "'from'", "'model'", "'as'", "'.'", "'*'", "'false'", "'true'", "'undefined'", "'Int8'", "'UInt8'", "'Int16'", "'UInt16'", "'Int32'", "'UInt32'", "'Int64'", "'UInt64'", "'Boolean'", "'String'", "'Float'", "'Double'", "'ByteBuffer'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'/'", "'!'"
    };
    public static final int RULE_E_FLOAT_OBJECT=9;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_E_DOUBLE_OBJECT=8;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_CC_STRING=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int RULE_ANNOTATION_STRING=10;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalBehaviorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBehaviorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBehaviorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBehavior.g"; }



     	private BehaviorGrammarAccess grammarAccess;

        public InternalBehaviorParser(TokenStream input, BehaviorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BehaviorModel";
       	}

       	@Override
       	protected BehaviorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBehaviorModel"
    // InternalBehavior.g:65:1: entryRuleBehaviorModel returns [EObject current=null] : iv_ruleBehaviorModel= ruleBehaviorModel EOF ;
    public final EObject entryRuleBehaviorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorModel = null;


        try {
            // InternalBehavior.g:65:54: (iv_ruleBehaviorModel= ruleBehaviorModel EOF )
            // InternalBehavior.g:66:2: iv_ruleBehaviorModel= ruleBehaviorModel EOF
            {
             newCompositeNode(grammarAccess.getBehaviorModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorModel=ruleBehaviorModel();

            state._fsp--;

             current =iv_ruleBehaviorModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehaviorModel"


    // $ANTLR start "ruleBehaviorModel"
    // InternalBehavior.g:72:1: ruleBehaviorModel returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_behaviors_4_0= ruleBehavior ) )* ) ;
    public final EObject ruleBehaviorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_behaviors_4_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:78:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_behaviors_4_0= ruleBehavior ) )* ) )
            // InternalBehavior.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_behaviors_4_0= ruleBehavior ) )* )
            {
            // InternalBehavior.g:79:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_behaviors_4_0= ruleBehavior ) )* )
            // InternalBehavior.g:80:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_behaviors_4_0= ruleBehavior ) )*
            {
            // InternalBehavior.g:80:3: ()
            // InternalBehavior.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorModelAccess().getBehaviorModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorModelAccess().getPackageKeyword_1());
            		
            // InternalBehavior.g:91:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalBehavior.g:92:4: (lv_name_2_0= ruleFQN )
            {
            // InternalBehavior.g:92:4: (lv_name_2_0= ruleFQN )
            // InternalBehavior.g:93:5: lv_name_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getBehaviorModelAccess().getNameFQNParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:110:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==75) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBehavior.g:111:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalBehavior.g:111:4: (lv_imports_3_0= ruleImport )
            	    // InternalBehavior.g:112:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorModelAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBehavior.g:129:3: ( (lv_behaviors_4_0= ruleBehavior ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==73) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBehavior.g:130:4: (lv_behaviors_4_0= ruleBehavior )
            	    {
            	    // InternalBehavior.g:130:4: (lv_behaviors_4_0= ruleBehavior )
            	    // InternalBehavior.g:131:5: lv_behaviors_4_0= ruleBehavior
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorModelAccess().getBehaviorsBehaviorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_behaviors_4_0=ruleBehavior();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"behaviors",
            	    						lv_behaviors_4_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.Behavior");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleBehaviorModel"


    // $ANTLR start "entryRuleBehavior"
    // InternalBehavior.g:152:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalBehavior.g:152:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalBehavior.g:153:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalBehavior.g:159:1: ruleBehavior returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'Behavior' ( (lv_name_3_0= RULE_ID ) )? (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )? (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )? (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )? ( (lv_operations_22_0= ruleStandardOperation ) )* otherlv_23= 'FSM' ( (lv_name_24_0= RULE_ID ) )? ( (lv_stateGraphs_25_0= ruleFStateGraph ) )* otherlv_26= '}' ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_componentName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_name_24_0=null;
        Token otherlv_26=null;
        EObject lv_comment_1_0 = null;

        EObject lv_variables_9_0 = null;

        EObject lv_events_14_0 = null;

        EObject lv_signals_19_0 = null;

        EObject lv_operations_22_0 = null;

        EObject lv_stateGraphs_25_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:165:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'Behavior' ( (lv_name_3_0= RULE_ID ) )? (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )? (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )? (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )? ( (lv_operations_22_0= ruleStandardOperation ) )* otherlv_23= 'FSM' ( (lv_name_24_0= RULE_ID ) )? ( (lv_stateGraphs_25_0= ruleFStateGraph ) )* otherlv_26= '}' ) )
            // InternalBehavior.g:166:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'Behavior' ( (lv_name_3_0= RULE_ID ) )? (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )? (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )? (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )? ( (lv_operations_22_0= ruleStandardOperation ) )* otherlv_23= 'FSM' ( (lv_name_24_0= RULE_ID ) )? ( (lv_stateGraphs_25_0= ruleFStateGraph ) )* otherlv_26= '}' )
            {
            // InternalBehavior.g:166:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'Behavior' ( (lv_name_3_0= RULE_ID ) )? (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )? (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )? (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )? ( (lv_operations_22_0= ruleStandardOperation ) )* otherlv_23= 'FSM' ( (lv_name_24_0= RULE_ID ) )? ( (lv_stateGraphs_25_0= ruleFStateGraph ) )* otherlv_26= '}' )
            // InternalBehavior.g:167:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'Behavior' ( (lv_name_3_0= RULE_ID ) )? (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )? (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )? (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )? ( (lv_operations_22_0= ruleStandardOperation ) )* otherlv_23= 'FSM' ( (lv_name_24_0= RULE_ID ) )? ( (lv_stateGraphs_25_0= ruleFStateGraph ) )* otherlv_26= '}'
            {
            // InternalBehavior.g:167:3: ()
            // InternalBehavior.g:168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorAccess().getBehaviorAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:174:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==73) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBehavior.g:175:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:175:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:176:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getBehaviorAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getBehaviorKeyword_2());
            		
            // InternalBehavior.g:197:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBehavior.g:198:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalBehavior.g:198:4: (lv_name_3_0= RULE_ID )
                    // InternalBehavior.g:199:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehaviorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:215:3: (otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBehavior.g:216:4: otherlv_4= 'implements' ( (lv_componentName_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getImplementsKeyword_4_0());
                    			
                    // InternalBehavior.g:220:4: ( (lv_componentName_5_0= RULE_ID ) )
                    // InternalBehavior.g:221:5: (lv_componentName_5_0= RULE_ID )
                    {
                    // InternalBehavior.g:221:5: (lv_componentName_5_0= RULE_ID )
                    // InternalBehavior.g:222:6: lv_componentName_5_0= RULE_ID
                    {
                    lv_componentName_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_componentName_5_0, grammarAccess.getBehaviorAccess().getComponentNameIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"componentName",
                    							lv_componentName_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBehavior.g:243:3: (otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBehavior.g:244:4: otherlv_7= 'vars' otherlv_8= '{' ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getBehaviorAccess().getVarsKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBehavior.g:252:4: ( ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )? )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==54||(LA7_0>=83 && LA7_0<=96)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBehavior.g:253:5: ( (lv_variables_9_0= ruleFDeclaration ) ) (otherlv_10= ';' )?
                    	    {
                    	    // InternalBehavior.g:253:5: ( (lv_variables_9_0= ruleFDeclaration ) )
                    	    // InternalBehavior.g:254:6: (lv_variables_9_0= ruleFDeclaration )
                    	    {
                    	    // InternalBehavior.g:254:6: (lv_variables_9_0= ruleFDeclaration )
                    	    // InternalBehavior.g:255:7: lv_variables_9_0= ruleFDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorAccess().getVariablesFDeclarationParserRuleCall_6_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_variables_9_0=ruleFDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variables",
                    	    								lv_variables_9_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.FDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalBehavior.g:272:5: (otherlv_10= ';' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==20) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalBehavior.g:273:6: otherlv_10= ';'
                    	            {
                    	            otherlv_10=(Token)match(input,20,FOLLOW_11); 

                    	            						newLeafNode(otherlv_10, grammarAccess.getBehaviorAccess().getSemicolonKeyword_6_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:284:3: (otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBehavior.g:285:4: otherlv_12= 'events' otherlv_13= '{' ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getBehaviorAccess().getEventsKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBehavior.g:293:4: ( ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )? )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==28||LA10_0==73) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBehavior.g:294:5: ( (lv_events_14_0= ruleEventBinding ) ) (otherlv_15= ';' )?
                    	    {
                    	    // InternalBehavior.g:294:5: ( (lv_events_14_0= ruleEventBinding ) )
                    	    // InternalBehavior.g:295:6: (lv_events_14_0= ruleEventBinding )
                    	    {
                    	    // InternalBehavior.g:295:6: (lv_events_14_0= ruleEventBinding )
                    	    // InternalBehavior.g:296:7: lv_events_14_0= ruleEventBinding
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorAccess().getEventsEventBindingParserRuleCall_7_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_events_14_0=ruleEventBinding();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_14_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.EventBinding");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalBehavior.g:313:5: (otherlv_15= ';' )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==20) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalBehavior.g:314:6: otherlv_15= ';'
                    	            {
                    	            otherlv_15=(Token)match(input,20,FOLLOW_14); 

                    	            						newLeafNode(otherlv_15, grammarAccess.getBehaviorAccess().getSemicolonKeyword_7_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:325:3: (otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBehavior.g:326:4: otherlv_17= 'signals' otherlv_18= '{' ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )* otherlv_21= '}'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getBehaviorAccess().getSignalsKeyword_8_0());
                    			
                    otherlv_18=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getBehaviorAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalBehavior.g:334:4: ( ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )? )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==73) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBehavior.g:335:5: ( (lv_signals_19_0= ruleSignal ) ) (otherlv_20= ';' )?
                    	    {
                    	    // InternalBehavior.g:335:5: ( (lv_signals_19_0= ruleSignal ) )
                    	    // InternalBehavior.g:336:6: (lv_signals_19_0= ruleSignal )
                    	    {
                    	    // InternalBehavior.g:336:6: (lv_signals_19_0= ruleSignal )
                    	    // InternalBehavior.g:337:7: lv_signals_19_0= ruleSignal
                    	    {

                    	    							newCompositeNode(grammarAccess.getBehaviorAccess().getSignalsSignalParserRuleCall_8_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_signals_19_0=ruleSignal();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBehaviorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"signals",
                    	    								lv_signals_19_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.Signal");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalBehavior.g:354:5: (otherlv_20= ';' )?
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==20) ) {
                    	        alt12=1;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // InternalBehavior.g:355:6: otherlv_20= ';'
                    	            {
                    	            otherlv_20=(Token)match(input,20,FOLLOW_17); 

                    	            						newLeafNode(otherlv_20, grammarAccess.getBehaviorAccess().getSemicolonKeyword_8_2_1());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:366:3: ( (lv_operations_22_0= ruleStandardOperation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)||LA15_0==73) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBehavior.g:367:4: (lv_operations_22_0= ruleStandardOperation )
            	    {
            	    // InternalBehavior.g:367:4: (lv_operations_22_0= ruleStandardOperation )
            	    // InternalBehavior.g:368:5: lv_operations_22_0= ruleStandardOperation
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getOperationsStandardOperationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_operations_22_0=ruleStandardOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_22_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.StandardOperation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_23=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_23, grammarAccess.getBehaviorAccess().getFSMKeyword_10());
            		
            // InternalBehavior.g:389:3: ( (lv_name_24_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBehavior.g:390:4: (lv_name_24_0= RULE_ID )
                    {
                    // InternalBehavior.g:390:4: (lv_name_24_0= RULE_ID )
                    // InternalBehavior.g:391:5: lv_name_24_0= RULE_ID
                    {
                    lv_name_24_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    					newLeafNode(lv_name_24_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBehaviorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_24_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:407:3: ( (lv_stateGraphs_25_0= ruleFStateGraph ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBehavior.g:408:4: (lv_stateGraphs_25_0= ruleFStateGraph )
            	    {
            	    // InternalBehavior.g:408:4: (lv_stateGraphs_25_0= ruleFStateGraph )
            	    // InternalBehavior.g:409:5: lv_stateGraphs_25_0= ruleFStateGraph
            	    {

            	    					newCompositeNode(grammarAccess.getBehaviorAccess().getStateGraphsFStateGraphParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_stateGraphs_25_0=ruleFStateGraph();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBehaviorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stateGraphs",
            	    						lv_stateGraphs_25_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.FStateGraph");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_26=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getBehaviorAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleSignal"
    // InternalBehavior.g:434:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalBehavior.g:434:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalBehavior.g:435:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalBehavior.g:441:1: ruleSignal returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_signal_2_0= ruleSignalSignature ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        EObject lv_comment_1_0 = null;

        EObject lv_signal_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:447:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_signal_2_0= ruleSignalSignature ) ) ) )
            // InternalBehavior.g:448:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_signal_2_0= ruleSignalSignature ) ) )
            {
            // InternalBehavior.g:448:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_signal_2_0= ruleSignalSignature ) ) )
            // InternalBehavior.g:449:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_signal_2_0= ruleSignalSignature ) )
            {
            // InternalBehavior.g:449:3: ()
            // InternalBehavior.g:450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignalAccess().getSignalAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:456:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==73) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalBehavior.g:457:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:457:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:458:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getSignalAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSignalRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:475:3: ( (lv_signal_2_0= ruleSignalSignature ) )
            // InternalBehavior.g:476:4: (lv_signal_2_0= ruleSignalSignature )
            {
            // InternalBehavior.g:476:4: (lv_signal_2_0= ruleSignalSignature )
            // InternalBehavior.g:477:5: lv_signal_2_0= ruleSignalSignature
            {

            					newCompositeNode(grammarAccess.getSignalAccess().getSignalSignalSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_signal_2_0=ruleSignalSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignalRule());
            					}
            					set(
            						current,
            						"signal",
            						lv_signal_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.SignalSignature");
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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleSignalSignature"
    // InternalBehavior.g:498:1: entryRuleSignalSignature returns [EObject current=null] : iv_ruleSignalSignature= ruleSignalSignature EOF ;
    public final EObject entryRuleSignalSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalSignature = null;


        try {
            // InternalBehavior.g:498:56: (iv_ruleSignalSignature= ruleSignalSignature EOF )
            // InternalBehavior.g:499:2: iv_ruleSignalSignature= ruleSignalSignature EOF
            {
             newCompositeNode(grammarAccess.getSignalSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignalSignature=ruleSignalSignature();

            state._fsp--;

             current =iv_ruleSignalSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSignalSignature"


    // $ANTLR start "ruleSignalSignature"
    // InternalBehavior.g:505:1: ruleSignalSignature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleSignalSignature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:511:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )? ) )
            // InternalBehavior.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalBehavior.g:512:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )? )
            // InternalBehavior.g:513:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )?
            {
            // InternalBehavior.g:513:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBehavior.g:514:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBehavior.g:514:4: (lv_name_0_0= RULE_ID )
            // InternalBehavior.g:515:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSignalSignatureAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:531:3: (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBehavior.g:532:4: otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getSignalSignatureAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBehavior.g:536:4: ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalBehavior.g:537:5: ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )*
                            {
                            // InternalBehavior.g:537:5: ( (lv_arguments_2_0= ruleVarDecl ) )
                            // InternalBehavior.g:538:6: (lv_arguments_2_0= ruleVarDecl )
                            {
                            // InternalBehavior.g:538:6: (lv_arguments_2_0= ruleVarDecl )
                            // InternalBehavior.g:539:7: lv_arguments_2_0= ruleVarDecl
                            {

                            							newCompositeNode(grammarAccess.getSignalSignatureAccess().getArgumentsVarDeclParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_25);
                            lv_arguments_2_0=ruleVarDecl();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSignalSignatureRule());
                            							}
                            							add(
                            								current,
                            								"arguments",
                            								lv_arguments_2_0,
                            								"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalBehavior.g:556:5: (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==26) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalBehavior.g:557:6: otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) )
                            	    {
                            	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getSignalSignatureAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalBehavior.g:561:6: ( (lv_arguments_4_0= ruleVarDecl ) )
                            	    // InternalBehavior.g:562:7: (lv_arguments_4_0= ruleVarDecl )
                            	    {
                            	    // InternalBehavior.g:562:7: (lv_arguments_4_0= ruleVarDecl )
                            	    // InternalBehavior.g:563:8: lv_arguments_4_0= ruleVarDecl
                            	    {

                            	    								newCompositeNode(grammarAccess.getSignalSignatureAccess().getArgumentsVarDeclParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_25);
                            	    lv_arguments_4_0=ruleVarDecl();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSignalSignatureRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"arguments",
                            	    									lv_arguments_4_0,
                            	    									"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignalSignatureAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSignalSignature"


    // $ANTLR start "entryRuleEventBinding"
    // InternalBehavior.g:591:1: entryRuleEventBinding returns [EObject current=null] : iv_ruleEventBinding= ruleEventBinding EOF ;
    public final EObject entryRuleEventBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBinding = null;


        try {
            // InternalBehavior.g:591:53: (iv_ruleEventBinding= ruleEventBinding EOF )
            // InternalBehavior.g:592:2: iv_ruleEventBinding= ruleEventBinding EOF
            {
             newCompositeNode(grammarAccess.getEventBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBinding=ruleEventBinding();

            state._fsp--;

             current =iv_ruleEventBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventBinding"


    // $ANTLR start "ruleEventBinding"
    // InternalBehavior.g:598:1: ruleEventBinding returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'on' ( (lv_trigger_3_0= ruleEventTrigger ) ) otherlv_4= '->' ( (lv_to_5_0= ruleEvent ) ) ) ;
    public final EObject ruleEventBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_comment_1_0 = null;

        EObject lv_trigger_3_0 = null;

        EObject lv_to_5_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:604:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'on' ( (lv_trigger_3_0= ruleEventTrigger ) ) otherlv_4= '->' ( (lv_to_5_0= ruleEvent ) ) ) )
            // InternalBehavior.g:605:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'on' ( (lv_trigger_3_0= ruleEventTrigger ) ) otherlv_4= '->' ( (lv_to_5_0= ruleEvent ) ) )
            {
            // InternalBehavior.g:605:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'on' ( (lv_trigger_3_0= ruleEventTrigger ) ) otherlv_4= '->' ( (lv_to_5_0= ruleEvent ) ) )
            // InternalBehavior.g:606:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'on' ( (lv_trigger_3_0= ruleEventTrigger ) ) otherlv_4= '->' ( (lv_to_5_0= ruleEvent ) )
            {
            // InternalBehavior.g:606:3: ()
            // InternalBehavior.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventBindingAccess().getEventBindingAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:613:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==73) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBehavior.g:614:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:614:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:615:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getEventBindingAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEventBindingRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getEventBindingAccess().getOnKeyword_2());
            		
            // InternalBehavior.g:636:3: ( (lv_trigger_3_0= ruleEventTrigger ) )
            // InternalBehavior.g:637:4: (lv_trigger_3_0= ruleEventTrigger )
            {
            // InternalBehavior.g:637:4: (lv_trigger_3_0= ruleEventTrigger )
            // InternalBehavior.g:638:5: lv_trigger_3_0= ruleEventTrigger
            {

            					newCompositeNode(grammarAccess.getEventBindingAccess().getTriggerEventTriggerParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_trigger_3_0=ruleEventTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBindingRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_3_0,
            						"de.tu_bs.ccc.contracting.Behavior.EventTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEventBindingAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalBehavior.g:659:3: ( (lv_to_5_0= ruleEvent ) )
            // InternalBehavior.g:660:4: (lv_to_5_0= ruleEvent )
            {
            // InternalBehavior.g:660:4: (lv_to_5_0= ruleEvent )
            // InternalBehavior.g:661:5: lv_to_5_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventBindingAccess().getToEventParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_to_5_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBindingRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_5_0,
            						"de.tu_bs.ccc.contracting.Behavior.Event");
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
    // $ANTLR end "ruleEventBinding"


    // $ANTLR start "entryRuleEventTrigger"
    // InternalBehavior.g:682:1: entryRuleEventTrigger returns [EObject current=null] : iv_ruleEventTrigger= ruleEventTrigger EOF ;
    public final EObject entryRuleEventTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventTrigger = null;


        try {
            // InternalBehavior.g:682:53: (iv_ruleEventTrigger= ruleEventTrigger EOF )
            // InternalBehavior.g:683:2: iv_ruleEventTrigger= ruleEventTrigger EOF
            {
             newCompositeNode(grammarAccess.getEventTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventTrigger=ruleEventTrigger();

            state._fsp--;

             current =iv_ruleEventTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventTrigger"


    // $ANTLR start "ruleEventTrigger"
    // InternalBehavior.g:689:1: ruleEventTrigger returns [EObject current=null] : ( (lv_event_0_0= ruleEventOnIf ) ) ;
    public final EObject ruleEventTrigger() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:695:2: ( ( (lv_event_0_0= ruleEventOnIf ) ) )
            // InternalBehavior.g:696:2: ( (lv_event_0_0= ruleEventOnIf ) )
            {
            // InternalBehavior.g:696:2: ( (lv_event_0_0= ruleEventOnIf ) )
            // InternalBehavior.g:697:3: (lv_event_0_0= ruleEventOnIf )
            {
            // InternalBehavior.g:697:3: (lv_event_0_0= ruleEventOnIf )
            // InternalBehavior.g:698:4: lv_event_0_0= ruleEventOnIf
            {

            				newCompositeNode(grammarAccess.getEventTriggerAccess().getEventEventOnIfParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_event_0_0=ruleEventOnIf();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventTriggerRule());
            				}
            				set(
            					current,
            					"event",
            					lv_event_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.EventOnIf");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleEventTrigger"


    // $ANTLR start "entryRuleEventOnIf"
    // InternalBehavior.g:718:1: entryRuleEventOnIf returns [EObject current=null] : iv_ruleEventOnIf= ruleEventOnIf EOF ;
    public final EObject entryRuleEventOnIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventOnIf = null;


        try {
            // InternalBehavior.g:718:50: (iv_ruleEventOnIf= ruleEventOnIf EOF )
            // InternalBehavior.g:719:2: iv_ruleEventOnIf= ruleEventOnIf EOF
            {
             newCompositeNode(grammarAccess.getEventOnIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventOnIf=ruleEventOnIf();

            state._fsp--;

             current =iv_ruleEventOnIf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventOnIf"


    // $ANTLR start "ruleEventOnIf"
    // InternalBehavior.g:725:1: ruleEventOnIf returns [EObject current=null] : ( (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) ) | (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) ) | (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) ) | (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) ) | (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEventOnIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_freq_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_signal_9_0=null;
        EObject lv_condition_3_0 = null;

        EObject lv_call_5_0 = null;

        AntlrDatatypeRuleToken lv_event_7_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:731:2: ( ( (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) ) | (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) ) | (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) ) | (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) ) | (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) ) ) )
            // InternalBehavior.g:732:2: ( (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) ) | (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) ) | (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) ) | (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) ) | (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) ) )
            {
            // InternalBehavior.g:732:2: ( (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) ) | (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) ) | (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) ) | (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) ) | (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            case 34:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalBehavior.g:733:3: (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) )
                    {
                    // InternalBehavior.g:733:3: (otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) ) )
                    // InternalBehavior.g:734:4: otherlv_0= 'time' ( (lv_freq_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventOnIfAccess().getTimeKeyword_0_0());
                    			
                    // InternalBehavior.g:738:4: ( (lv_freq_1_0= RULE_INT ) )
                    // InternalBehavior.g:739:5: (lv_freq_1_0= RULE_INT )
                    {
                    // InternalBehavior.g:739:5: (lv_freq_1_0= RULE_INT )
                    // InternalBehavior.g:740:6: lv_freq_1_0= RULE_INT
                    {
                    lv_freq_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_freq_1_0, grammarAccess.getEventOnIfAccess().getFreqINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOnIfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"freq",
                    							lv_freq_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:758:3: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) )
                    {
                    // InternalBehavior.g:758:3: (otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) ) )
                    // InternalBehavior.g:759:4: otherlv_2= 'condition' ( (lv_condition_3_0= ruleLogicalOrExpression ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getEventOnIfAccess().getConditionKeyword_1_0());
                    			
                    // InternalBehavior.g:763:4: ( (lv_condition_3_0= ruleLogicalOrExpression ) )
                    // InternalBehavior.g:764:5: (lv_condition_3_0= ruleLogicalOrExpression )
                    {
                    // InternalBehavior.g:764:5: (lv_condition_3_0= ruleLogicalOrExpression )
                    // InternalBehavior.g:765:6: lv_condition_3_0= ruleLogicalOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEventOnIfAccess().getConditionLogicalOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_3_0=ruleLogicalOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventOnIfRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"de.tu_bs.ccc.contracting.Behavior.LogicalOrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:784:3: (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) )
                    {
                    // InternalBehavior.g:784:3: (otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) ) )
                    // InternalBehavior.g:785:4: otherlv_4= 'call' ( (lv_call_5_0= ruleMethodSignature ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEventOnIfAccess().getCallKeyword_2_0());
                    			
                    // InternalBehavior.g:789:4: ( (lv_call_5_0= ruleMethodSignature ) )
                    // InternalBehavior.g:790:5: (lv_call_5_0= ruleMethodSignature )
                    {
                    // InternalBehavior.g:790:5: (lv_call_5_0= ruleMethodSignature )
                    // InternalBehavior.g:791:6: lv_call_5_0= ruleMethodSignature
                    {

                    						newCompositeNode(grammarAccess.getEventOnIfAccess().getCallMethodSignatureParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_call_5_0=ruleMethodSignature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventOnIfRule());
                    						}
                    						set(
                    							current,
                    							"call",
                    							lv_call_5_0,
                    							"de.tu_bs.ccc.contracting.Behavior.MethodSignature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:810:3: (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) )
                    {
                    // InternalBehavior.g:810:3: (otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) ) )
                    // InternalBehavior.g:811:4: otherlv_6= 'event' ( (lv_event_7_0= ruleFQN ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventOnIfAccess().getEventKeyword_3_0());
                    			
                    // InternalBehavior.g:815:4: ( (lv_event_7_0= ruleFQN ) )
                    // InternalBehavior.g:816:5: (lv_event_7_0= ruleFQN )
                    {
                    // InternalBehavior.g:816:5: (lv_event_7_0= ruleFQN )
                    // InternalBehavior.g:817:6: lv_event_7_0= ruleFQN
                    {

                    						newCompositeNode(grammarAccess.getEventOnIfAccess().getEventFQNParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_event_7_0=ruleFQN();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventOnIfRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_7_0,
                    							"de.tu_bs.ccc.contracting.Behavior.FQN");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBehavior.g:836:3: (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) )
                    {
                    // InternalBehavior.g:836:3: (otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) ) )
                    // InternalBehavior.g:837:4: otherlv_8= 'signal' ( (lv_signal_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEventOnIfAccess().getSignalKeyword_4_0());
                    			
                    // InternalBehavior.g:841:4: ( (lv_signal_9_0= RULE_ID ) )
                    // InternalBehavior.g:842:5: (lv_signal_9_0= RULE_ID )
                    {
                    // InternalBehavior.g:842:5: (lv_signal_9_0= RULE_ID )
                    // InternalBehavior.g:843:6: lv_signal_9_0= RULE_ID
                    {
                    lv_signal_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_signal_9_0, grammarAccess.getEventOnIfAccess().getSignalIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOnIfRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"signal",
                    							lv_signal_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleEventOnIf"


    // $ANTLR start "entryRuleMethodSignature"
    // InternalBehavior.g:864:1: entryRuleMethodSignature returns [EObject current=null] : iv_ruleMethodSignature= ruleMethodSignature EOF ;
    public final EObject entryRuleMethodSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodSignature = null;


        try {
            // InternalBehavior.g:864:56: (iv_ruleMethodSignature= ruleMethodSignature EOF )
            // InternalBehavior.g:865:2: iv_ruleMethodSignature= ruleMethodSignature EOF
            {
             newCompositeNode(grammarAccess.getMethodSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodSignature=ruleMethodSignature();

            state._fsp--;

             current =iv_ruleMethodSignature; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethodSignature"


    // $ANTLR start "ruleMethodSignature"
    // InternalBehavior.g:871:1: ruleMethodSignature returns [EObject current=null] : ( ( (lv_name_0_0= ruleFQN ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )? ) ;
    public final EObject ruleMethodSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_returnType_8_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:877:2: ( ( ( (lv_name_0_0= ruleFQN ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )? ) )
            // InternalBehavior.g:878:2: ( ( (lv_name_0_0= ruleFQN ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )? )
            {
            // InternalBehavior.g:878:2: ( ( (lv_name_0_0= ruleFQN ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )? )
            // InternalBehavior.g:879:3: ( (lv_name_0_0= ruleFQN ) ) otherlv_1= '(' ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )? otherlv_5= ')' (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )?
            {
            // InternalBehavior.g:879:3: ( (lv_name_0_0= ruleFQN ) )
            // InternalBehavior.g:880:4: (lv_name_0_0= ruleFQN )
            {
            // InternalBehavior.g:880:4: (lv_name_0_0= ruleFQN )
            // InternalBehavior.g:881:5: lv_name_0_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getMethodSignatureAccess().getNameFQNParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.tu_bs.ccc.contracting.Behavior.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodSignatureAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBehavior.g:902:3: ( ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBehavior.g:903:4: ( (lv_arguments_2_0= ruleVarDecl ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )*
                    {
                    // InternalBehavior.g:903:4: ( (lv_arguments_2_0= ruleVarDecl ) )
                    // InternalBehavior.g:904:5: (lv_arguments_2_0= ruleVarDecl )
                    {
                    // InternalBehavior.g:904:5: (lv_arguments_2_0= ruleVarDecl )
                    // InternalBehavior.g:905:6: lv_arguments_2_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getMethodSignatureAccess().getArgumentsVarDeclParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_arguments_2_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehavior.g:922:4: (otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==26) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalBehavior.g:923:5: otherlv_3= ',' ( (lv_arguments_4_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMethodSignatureAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBehavior.g:927:5: ( (lv_arguments_4_0= ruleVarDecl ) )
                    	    // InternalBehavior.g:928:6: (lv_arguments_4_0= ruleVarDecl )
                    	    {
                    	    // InternalBehavior.g:928:6: (lv_arguments_4_0= ruleVarDecl )
                    	    // InternalBehavior.g:929:7: lv_arguments_4_0= ruleVarDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodSignatureAccess().getArgumentsVarDeclParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_arguments_4_0=ruleVarDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodSignatureAccess().getRightParenthesisKeyword_3());
            		
            // InternalBehavior.g:952:3: (otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBehavior.g:953:4: otherlv_6= ':' (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodSignatureAccess().getColonKeyword_4_0());
                    			
                    // InternalBehavior.g:957:4: (otherlv_7= 'void' | ( (lv_returnType_8_0= ruleRefableType ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==36) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==RULE_ID) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalBehavior.g:958:5: otherlv_7= 'void'
                            {
                            otherlv_7=(Token)match(input,36,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getMethodSignatureAccess().getVoidKeyword_4_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehavior.g:963:5: ( (lv_returnType_8_0= ruleRefableType ) )
                            {
                            // InternalBehavior.g:963:5: ( (lv_returnType_8_0= ruleRefableType ) )
                            // InternalBehavior.g:964:6: (lv_returnType_8_0= ruleRefableType )
                            {
                            // InternalBehavior.g:964:6: (lv_returnType_8_0= ruleRefableType )
                            // InternalBehavior.g:965:7: lv_returnType_8_0= ruleRefableType
                            {

                            							newCompositeNode(grammarAccess.getMethodSignatureAccess().getReturnTypeRefableTypeParserRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_returnType_8_0=ruleRefableType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMethodSignatureRule());
                            							}
                            							set(
                            								current,
                            								"returnType",
                            								lv_returnType_8_0,
                            								"de.tu_bs.ccc.contracting.Behavior.RefableType");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleMethodSignature"


    // $ANTLR start "entryRuleEvent"
    // InternalBehavior.g:988:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalBehavior.g:988:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalBehavior.g:989:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalBehavior.g:995:1: ruleEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arguments_2_0=null;
        Token otherlv_3=null;
        Token lv_arguments_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalBehavior.g:1001:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )? ) )
            // InternalBehavior.g:1002:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
            {
            // InternalBehavior.g:1002:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )? )
            // InternalBehavior.g:1003:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
            {
            // InternalBehavior.g:1003:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBehavior.g:1004:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBehavior.g:1004:4: (lv_name_0_0= RULE_ID )
            // InternalBehavior.g:1005:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:1021:3: (otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalBehavior.g:1022:4: otherlv_1= '(' ( (lv_arguments_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalBehavior.g:1026:4: ( (lv_arguments_2_0= RULE_ID ) )
                    // InternalBehavior.g:1027:5: (lv_arguments_2_0= RULE_ID )
                    {
                    // InternalBehavior.g:1027:5: (lv_arguments_2_0= RULE_ID )
                    // InternalBehavior.g:1028:6: lv_arguments_2_0= RULE_ID
                    {
                    lv_arguments_2_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_arguments_2_0, grammarAccess.getEventAccess().getArgumentsIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"arguments",
                    							lv_arguments_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalBehavior.g:1044:4: (otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==26) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalBehavior.g:1045:5: otherlv_3= ',' ( (lv_arguments_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalBehavior.g:1049:5: ( (lv_arguments_4_0= RULE_ID ) )
                    	    // InternalBehavior.g:1050:6: (lv_arguments_4_0= RULE_ID )
                    	    {
                    	    // InternalBehavior.g:1050:6: (lv_arguments_4_0= RULE_ID )
                    	    // InternalBehavior.g:1051:7: lv_arguments_4_0= RULE_ID
                    	    {
                    	    lv_arguments_4_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_arguments_4_0, grammarAccess.getEventAccess().getArgumentsIDTerminalRuleCall_1_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_4_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleStandardOperation"
    // InternalBehavior.g:1077:1: entryRuleStandardOperation returns [EObject current=null] : iv_ruleStandardOperation= ruleStandardOperation EOF ;
    public final EObject entryRuleStandardOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardOperation = null;


        try {
            // InternalBehavior.g:1077:58: (iv_ruleStandardOperation= ruleStandardOperation EOF )
            // InternalBehavior.g:1078:2: iv_ruleStandardOperation= ruleStandardOperation EOF
            {
             newCompositeNode(grammarAccess.getStandardOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStandardOperation=ruleStandardOperation();

            state._fsp--;

             current =iv_ruleStandardOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStandardOperation"


    // $ANTLR start "ruleStandardOperation"
    // InternalBehavior.g:1084:1: ruleStandardOperation returns [EObject current=null] : ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_override_1_0= 'override' ) )? otherlv_2= 'Operation' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )? otherlv_8= ')' (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )? otherlv_14= '{' ( (lv_contract_15_0= ruleSpecificationBlock ) ) ( (lv_detailCode_16_0= ruleDetailCode ) ) otherlv_17= '}' ) ;
    public final EObject ruleStandardOperation() throws RecognitionException {
        EObject current = null;

        Token lv_override_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_array_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        EObject lv_comment_0_0 = null;

        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;

        EObject lv_returnType_11_0 = null;

        EObject lv_contract_15_0 = null;

        EObject lv_detailCode_16_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1090:2: ( ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_override_1_0= 'override' ) )? otherlv_2= 'Operation' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )? otherlv_8= ')' (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )? otherlv_14= '{' ( (lv_contract_15_0= ruleSpecificationBlock ) ) ( (lv_detailCode_16_0= ruleDetailCode ) ) otherlv_17= '}' ) )
            // InternalBehavior.g:1091:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_override_1_0= 'override' ) )? otherlv_2= 'Operation' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )? otherlv_8= ')' (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )? otherlv_14= '{' ( (lv_contract_15_0= ruleSpecificationBlock ) ) ( (lv_detailCode_16_0= ruleDetailCode ) ) otherlv_17= '}' )
            {
            // InternalBehavior.g:1091:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_override_1_0= 'override' ) )? otherlv_2= 'Operation' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )? otherlv_8= ')' (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )? otherlv_14= '{' ( (lv_contract_15_0= ruleSpecificationBlock ) ) ( (lv_detailCode_16_0= ruleDetailCode ) ) otherlv_17= '}' )
            // InternalBehavior.g:1092:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_override_1_0= 'override' ) )? otherlv_2= 'Operation' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )? otherlv_8= ')' (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )? otherlv_14= '{' ( (lv_contract_15_0= ruleSpecificationBlock ) ) ( (lv_detailCode_16_0= ruleDetailCode ) ) otherlv_17= '}'
            {
            // InternalBehavior.g:1092:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==73) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBehavior.g:1093:4: (lv_comment_0_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:1093:4: (lv_comment_0_0= ruleAnnotationBlock )
                    // InternalBehavior.g:1094:5: lv_comment_0_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getStandardOperationAccess().getCommentAnnotationBlockParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_comment_0_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStandardOperationRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_0_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:1111:3: ( (lv_override_1_0= 'override' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalBehavior.g:1112:4: (lv_override_1_0= 'override' )
                    {
                    // InternalBehavior.g:1112:4: (lv_override_1_0= 'override' )
                    // InternalBehavior.g:1113:5: lv_override_1_0= 'override'
                    {
                    lv_override_1_0=(Token)match(input,37,FOLLOW_35); 

                    					newLeafNode(lv_override_1_0, grammarAccess.getStandardOperationAccess().getOverrideOverrideKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStandardOperationRule());
                    					}
                    					setWithLastConsumed(current, "override", true, "override");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStandardOperationAccess().getOperationKeyword_2());
            		
            // InternalBehavior.g:1129:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBehavior.g:1130:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBehavior.g:1130:4: (lv_name_3_0= RULE_ID )
            // InternalBehavior.g:1131:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_3_0, grammarAccess.getStandardOperationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStandardOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getStandardOperationAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBehavior.g:1151:3: ( ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBehavior.g:1152:4: ( (lv_arguments_5_0= ruleVarDecl ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )*
                    {
                    // InternalBehavior.g:1152:4: ( (lv_arguments_5_0= ruleVarDecl ) )
                    // InternalBehavior.g:1153:5: (lv_arguments_5_0= ruleVarDecl )
                    {
                    // InternalBehavior.g:1153:5: (lv_arguments_5_0= ruleVarDecl )
                    // InternalBehavior.g:1154:6: lv_arguments_5_0= ruleVarDecl
                    {

                    						newCompositeNode(grammarAccess.getStandardOperationAccess().getArgumentsVarDeclParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_arguments_5_0=ruleVarDecl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStandardOperationRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_5_0,
                    							"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehavior.g:1171:4: (otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==26) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalBehavior.g:1172:5: otherlv_6= ',' ( (lv_arguments_7_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getStandardOperationAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalBehavior.g:1176:5: ( (lv_arguments_7_0= ruleVarDecl ) )
                    	    // InternalBehavior.g:1177:6: (lv_arguments_7_0= ruleVarDecl )
                    	    {
                    	    // InternalBehavior.g:1177:6: (lv_arguments_7_0= ruleVarDecl )
                    	    // InternalBehavior.g:1178:7: lv_arguments_7_0= ruleVarDecl
                    	    {

                    	    							newCompositeNode(grammarAccess.getStandardOperationAccess().getArgumentsVarDeclParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_arguments_7_0=ruleVarDecl();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStandardOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_7_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.VarDecl");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_36); 

            			newLeafNode(otherlv_8, grammarAccess.getStandardOperationAccess().getRightParenthesisKeyword_6());
            		
            // InternalBehavior.g:1201:3: (otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBehavior.g:1202:4: otherlv_9= ':' (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_37); 

                    				newLeafNode(otherlv_9, grammarAccess.getStandardOperationAccess().getColonKeyword_7_0());
                    			
                    // InternalBehavior.g:1206:4: (otherlv_10= 'void' | ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==36) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_ID||LA35_0==54||(LA35_0>=83 && LA35_0<=96)) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalBehavior.g:1207:5: otherlv_10= 'void'
                            {
                            otherlv_10=(Token)match(input,36,FOLLOW_9); 

                            					newLeafNode(otherlv_10, grammarAccess.getStandardOperationAccess().getVoidKeyword_7_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBehavior.g:1212:5: ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? )
                            {
                            // InternalBehavior.g:1212:5: ( ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )? )
                            // InternalBehavior.g:1213:6: ( (lv_returnType_11_0= ruleFTypeRef ) ) ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )?
                            {
                            // InternalBehavior.g:1213:6: ( (lv_returnType_11_0= ruleFTypeRef ) )
                            // InternalBehavior.g:1214:7: (lv_returnType_11_0= ruleFTypeRef )
                            {
                            // InternalBehavior.g:1214:7: (lv_returnType_11_0= ruleFTypeRef )
                            // InternalBehavior.g:1215:8: lv_returnType_11_0= ruleFTypeRef
                            {

                            								newCompositeNode(grammarAccess.getStandardOperationAccess().getReturnTypeFTypeRefParserRuleCall_7_1_1_0_0());
                            							
                            pushFollow(FOLLOW_38);
                            lv_returnType_11_0=ruleFTypeRef();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getStandardOperationRule());
                            								}
                            								set(
                            									current,
                            									"returnType",
                            									lv_returnType_11_0,
                            									"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalBehavior.g:1232:6: ( ( (lv_array_12_0= '[' ) ) otherlv_13= ']' )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==39) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // InternalBehavior.g:1233:7: ( (lv_array_12_0= '[' ) ) otherlv_13= ']'
                                    {
                                    // InternalBehavior.g:1233:7: ( (lv_array_12_0= '[' ) )
                                    // InternalBehavior.g:1234:8: (lv_array_12_0= '[' )
                                    {
                                    // InternalBehavior.g:1234:8: (lv_array_12_0= '[' )
                                    // InternalBehavior.g:1235:9: lv_array_12_0= '['
                                    {
                                    lv_array_12_0=(Token)match(input,39,FOLLOW_39); 

                                    									newLeafNode(lv_array_12_0, grammarAccess.getStandardOperationAccess().getArrayLeftSquareBracketKeyword_7_1_1_1_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getStandardOperationRule());
                                    									}
                                    									setWithLastConsumed(current, "array", true, "[");
                                    								

                                    }


                                    }

                                    otherlv_13=(Token)match(input,40,FOLLOW_9); 

                                    							newLeafNode(otherlv_13, grammarAccess.getStandardOperationAccess().getRightSquareBracketKeyword_7_1_1_1_1());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_40); 

            			newLeafNode(otherlv_14, grammarAccess.getStandardOperationAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalBehavior.g:1259:3: ( (lv_contract_15_0= ruleSpecificationBlock ) )
            // InternalBehavior.g:1260:4: (lv_contract_15_0= ruleSpecificationBlock )
            {
            // InternalBehavior.g:1260:4: (lv_contract_15_0= ruleSpecificationBlock )
            // InternalBehavior.g:1261:5: lv_contract_15_0= ruleSpecificationBlock
            {

            					newCompositeNode(grammarAccess.getStandardOperationAccess().getContractSpecificationBlockParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_41);
            lv_contract_15_0=ruleSpecificationBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardOperationRule());
            					}
            					set(
            						current,
            						"contract",
            						lv_contract_15_0,
            						"de.tu_bs.ccc.contracting.Behavior.SpecificationBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:1278:3: ( (lv_detailCode_16_0= ruleDetailCode ) )
            // InternalBehavior.g:1279:4: (lv_detailCode_16_0= ruleDetailCode )
            {
            // InternalBehavior.g:1279:4: (lv_detailCode_16_0= ruleDetailCode )
            // InternalBehavior.g:1280:5: lv_detailCode_16_0= ruleDetailCode
            {

            					newCompositeNode(grammarAccess.getStandardOperationAccess().getDetailCodeDetailCodeParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_42);
            lv_detailCode_16_0=ruleDetailCode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStandardOperationRule());
            					}
            					set(
            						current,
            						"detailCode",
            						lv_detailCode_16_0,
            						"de.tu_bs.ccc.contracting.Behavior.DetailCode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getStandardOperationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleStandardOperation"


    // $ANTLR start "entryRuleVarDecl"
    // InternalBehavior.g:1305:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalBehavior.g:1305:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalBehavior.g:1306:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalBehavior.g:1312:1: ruleVarDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_refType_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_varargs_5_0= 'varargs' ) )? ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_array_3_0=null;
        Token otherlv_4=null;
        Token lv_varargs_5_0=null;
        EObject lv_refType_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1318:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_refType_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_varargs_5_0= 'varargs' ) )? ) )
            // InternalBehavior.g:1319:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_refType_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_varargs_5_0= 'varargs' ) )? )
            {
            // InternalBehavior.g:1319:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_refType_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_varargs_5_0= 'varargs' ) )? )
            // InternalBehavior.g:1320:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_refType_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_varargs_5_0= 'varargs' ) )?
            {
            // InternalBehavior.g:1320:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBehavior.g:1321:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBehavior.g:1321:4: (lv_name_0_0= RULE_ID )
            // InternalBehavior.g:1322:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclAccess().getColonKeyword_1());
            		
            // InternalBehavior.g:1342:3: ( (lv_refType_2_0= ruleFTypeRef ) )
            // InternalBehavior.g:1343:4: (lv_refType_2_0= ruleFTypeRef )
            {
            // InternalBehavior.g:1343:4: (lv_refType_2_0= ruleFTypeRef )
            // InternalBehavior.g:1344:5: lv_refType_2_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getVarDeclAccess().getRefTypeFTypeRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
            lv_refType_2_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclRule());
            					}
            					set(
            						current,
            						"refType",
            						lv_refType_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:1361:3: ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBehavior.g:1362:4: ( (lv_array_3_0= '[' ) ) otherlv_4= ']'
                    {
                    // InternalBehavior.g:1362:4: ( (lv_array_3_0= '[' ) )
                    // InternalBehavior.g:1363:5: (lv_array_3_0= '[' )
                    {
                    // InternalBehavior.g:1363:5: (lv_array_3_0= '[' )
                    // InternalBehavior.g:1364:6: lv_array_3_0= '['
                    {
                    lv_array_3_0=(Token)match(input,39,FOLLOW_39); 

                    						newLeafNode(lv_array_3_0, grammarAccess.getVarDeclAccess().getArrayLeftSquareBracketKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:1381:3: ( (lv_varargs_5_0= 'varargs' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBehavior.g:1382:4: (lv_varargs_5_0= 'varargs' )
                    {
                    // InternalBehavior.g:1382:4: (lv_varargs_5_0= 'varargs' )
                    // InternalBehavior.g:1383:5: lv_varargs_5_0= 'varargs'
                    {
                    lv_varargs_5_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_varargs_5_0, grammarAccess.getVarDeclAccess().getVarargsVarargsKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarDeclRule());
                    					}
                    					setWithLastConsumed(current, "varargs", true, "varargs");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleRefableType"
    // InternalBehavior.g:1399:1: entryRuleRefableType returns [EObject current=null] : iv_ruleRefableType= ruleRefableType EOF ;
    public final EObject entryRuleRefableType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefableType = null;


        try {
            // InternalBehavior.g:1399:52: (iv_ruleRefableType= ruleRefableType EOF )
            // InternalBehavior.g:1400:2: iv_ruleRefableType= ruleRefableType EOF
            {
             newCompositeNode(grammarAccess.getRefableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefableType=ruleRefableType();

            state._fsp--;

             current =iv_ruleRefableType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefableType"


    // $ANTLR start "ruleRefableType"
    // InternalBehavior.g:1406:1: ruleRefableType returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_ref_1_0= 'ref' ) )? ) ;
    public final EObject ruleRefableType() throws RecognitionException {
        EObject current = null;

        Token lv_ref_1_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:1412:2: ( ( ( ( ruleFQN ) ) ( (lv_ref_1_0= 'ref' ) )? ) )
            // InternalBehavior.g:1413:2: ( ( ( ruleFQN ) ) ( (lv_ref_1_0= 'ref' ) )? )
            {
            // InternalBehavior.g:1413:2: ( ( ( ruleFQN ) ) ( (lv_ref_1_0= 'ref' ) )? )
            // InternalBehavior.g:1414:3: ( ( ruleFQN ) ) ( (lv_ref_1_0= 'ref' ) )?
            {
            // InternalBehavior.g:1414:3: ( ( ruleFQN ) )
            // InternalBehavior.g:1415:4: ( ruleFQN )
            {
            // InternalBehavior.g:1415:4: ( ruleFQN )
            // InternalBehavior.g:1416:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefableTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRefableTypeAccess().getTypeFTypeRefCrossReference_0_0());
            				
            pushFollow(FOLLOW_47);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:1430:3: ( (lv_ref_1_0= 'ref' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBehavior.g:1431:4: (lv_ref_1_0= 'ref' )
                    {
                    // InternalBehavior.g:1431:4: (lv_ref_1_0= 'ref' )
                    // InternalBehavior.g:1432:5: lv_ref_1_0= 'ref'
                    {
                    lv_ref_1_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_ref_1_0, grammarAccess.getRefableTypeAccess().getRefRefKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRefableTypeRule());
                    					}
                    					setWithLastConsumed(current, "ref", true, "ref");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleRefableType"


    // $ANTLR start "entryRuleSpecificationBlock"
    // InternalBehavior.g:1448:1: entryRuleSpecificationBlock returns [EObject current=null] : iv_ruleSpecificationBlock= ruleSpecificationBlock EOF ;
    public final EObject entryRuleSpecificationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationBlock = null;


        try {
            // InternalBehavior.g:1448:59: (iv_ruleSpecificationBlock= ruleSpecificationBlock EOF )
            // InternalBehavior.g:1449:2: iv_ruleSpecificationBlock= ruleSpecificationBlock EOF
            {
             newCompositeNode(grammarAccess.getSpecificationBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificationBlock=ruleSpecificationBlock();

            state._fsp--;

             current =iv_ruleSpecificationBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecificationBlock"


    // $ANTLR start "ruleSpecificationBlock"
    // InternalBehavior.g:1455:1: ruleSpecificationBlock returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'contract' otherlv_3= '{' ( (lv_contracts_4_0= ruleContractPair ) ) (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleSpecificationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_comment_1_0 = null;

        EObject lv_contracts_4_0 = null;

        EObject lv_contracts_6_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1461:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'contract' otherlv_3= '{' ( (lv_contracts_4_0= ruleContractPair ) ) (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )* otherlv_7= '}' ) )
            // InternalBehavior.g:1462:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'contract' otherlv_3= '{' ( (lv_contracts_4_0= ruleContractPair ) ) (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )* otherlv_7= '}' )
            {
            // InternalBehavior.g:1462:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'contract' otherlv_3= '{' ( (lv_contracts_4_0= ruleContractPair ) ) (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )* otherlv_7= '}' )
            // InternalBehavior.g:1463:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'contract' otherlv_3= '{' ( (lv_contracts_4_0= ruleContractPair ) ) (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )* otherlv_7= '}'
            {
            // InternalBehavior.g:1463:3: ()
            // InternalBehavior.g:1464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecificationBlockAccess().getSpecificationBlockAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:1470:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==73) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBehavior.g:1471:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:1471:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:1472:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getSpecificationBlockAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_48);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSpecificationBlockRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSpecificationBlockAccess().getContractKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecificationBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBehavior.g:1497:3: ( (lv_contracts_4_0= ruleContractPair ) )
            // InternalBehavior.g:1498:4: (lv_contracts_4_0= ruleContractPair )
            {
            // InternalBehavior.g:1498:4: (lv_contracts_4_0= ruleContractPair )
            // InternalBehavior.g:1499:5: lv_contracts_4_0= ruleContractPair
            {

            					newCompositeNode(grammarAccess.getSpecificationBlockAccess().getContractsContractPairParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
            lv_contracts_4_0=ruleContractPair();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecificationBlockRule());
            					}
            					add(
            						current,
            						"contracts",
            						lv_contracts_4_0,
            						"de.tu_bs.ccc.contracting.Behavior.ContractPair");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:1516:3: (otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==44) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalBehavior.g:1517:4: otherlv_5= 'also' ( (lv_contracts_6_0= ruleContractPair ) )
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_49); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSpecificationBlockAccess().getAlsoKeyword_5_0());
            	    			
            	    // InternalBehavior.g:1521:4: ( (lv_contracts_6_0= ruleContractPair ) )
            	    // InternalBehavior.g:1522:5: (lv_contracts_6_0= ruleContractPair )
            	    {
            	    // InternalBehavior.g:1522:5: (lv_contracts_6_0= ruleContractPair )
            	    // InternalBehavior.g:1523:6: lv_contracts_6_0= ruleContractPair
            	    {

            	    						newCompositeNode(grammarAccess.getSpecificationBlockAccess().getContractsContractPairParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_contracts_6_0=ruleContractPair();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpecificationBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contracts",
            	    							lv_contracts_6_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.ContractPair");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSpecificationBlockAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSpecificationBlock"


    // $ANTLR start "entryRuleContractPair"
    // InternalBehavior.g:1549:1: entryRuleContractPair returns [EObject current=null] : iv_ruleContractPair= ruleContractPair EOF ;
    public final EObject entryRuleContractPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractPair = null;


        try {
            // InternalBehavior.g:1549:53: (iv_ruleContractPair= ruleContractPair EOF )
            // InternalBehavior.g:1550:2: iv_ruleContractPair= ruleContractPair EOF
            {
             newCompositeNode(grammarAccess.getContractPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractPair=ruleContractPair();

            state._fsp--;

             current =iv_ruleContractPair; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContractPair"


    // $ANTLR start "ruleContractPair"
    // InternalBehavior.g:1556:1: ruleContractPair returns [EObject current=null] : ( () ( (lv_req_1_0= ruleRequires ) )* ( (lv_ens_2_0= ruleEnsures ) )* ) ;
    public final EObject ruleContractPair() throws RecognitionException {
        EObject current = null;

        EObject lv_req_1_0 = null;

        EObject lv_ens_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1562:2: ( ( () ( (lv_req_1_0= ruleRequires ) )* ( (lv_ens_2_0= ruleEnsures ) )* ) )
            // InternalBehavior.g:1563:2: ( () ( (lv_req_1_0= ruleRequires ) )* ( (lv_ens_2_0= ruleEnsures ) )* )
            {
            // InternalBehavior.g:1563:2: ( () ( (lv_req_1_0= ruleRequires ) )* ( (lv_ens_2_0= ruleEnsures ) )* )
            // InternalBehavior.g:1564:3: () ( (lv_req_1_0= ruleRequires ) )* ( (lv_ens_2_0= ruleEnsures ) )*
            {
            // InternalBehavior.g:1564:3: ()
            // InternalBehavior.g:1565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContractPairAccess().getContractPairAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:1571:3: ( (lv_req_1_0= ruleRequires ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==45) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalBehavior.g:1572:4: (lv_req_1_0= ruleRequires )
            	    {
            	    // InternalBehavior.g:1572:4: (lv_req_1_0= ruleRequires )
            	    // InternalBehavior.g:1573:5: lv_req_1_0= ruleRequires
            	    {

            	    					newCompositeNode(grammarAccess.getContractPairAccess().getReqRequiresParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_req_1_0=ruleRequires();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractPairRule());
            	    					}
            	    					add(
            	    						current,
            	    						"req",
            	    						lv_req_1_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.Requires");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalBehavior.g:1590:3: ( (lv_ens_2_0= ruleEnsures ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalBehavior.g:1591:4: (lv_ens_2_0= ruleEnsures )
            	    {
            	    // InternalBehavior.g:1591:4: (lv_ens_2_0= ruleEnsures )
            	    // InternalBehavior.g:1592:5: lv_ens_2_0= ruleEnsures
            	    {

            	    					newCompositeNode(grammarAccess.getContractPairAccess().getEnsEnsuresParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_52);
            	    lv_ens_2_0=ruleEnsures();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContractPairRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ens",
            	    						lv_ens_2_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.Ensures");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // $ANTLR end "ruleContractPair"


    // $ANTLR start "entryRuleRequires"
    // InternalBehavior.g:1613:1: entryRuleRequires returns [EObject current=null] : iv_ruleRequires= ruleRequires EOF ;
    public final EObject entryRuleRequires() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequires = null;


        try {
            // InternalBehavior.g:1613:49: (iv_ruleRequires= ruleRequires EOF )
            // InternalBehavior.g:1614:2: iv_ruleRequires= ruleRequires EOF
            {
             newCompositeNode(grammarAccess.getRequiresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequires=ruleRequires();

            state._fsp--;

             current =iv_ruleRequires; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRequires"


    // $ANTLR start "ruleRequires"
    // InternalBehavior.g:1620:1: ruleRequires returns [EObject current=null] : (otherlv_0= 'requires' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleRequires() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1626:2: ( (otherlv_0= 'requires' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' ) )
            // InternalBehavior.g:1627:2: (otherlv_0= 'requires' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' )
            {
            // InternalBehavior.g:1627:2: (otherlv_0= 'requires' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' )
            // InternalBehavior.g:1628:3: otherlv_0= 'requires' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiresAccess().getRequiresKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiresAccess().getColonKeyword_1());
            		
            // InternalBehavior.g:1636:3: ( (lv_expr_2_0= ruleContractExpression ) )
            // InternalBehavior.g:1637:4: (lv_expr_2_0= ruleContractExpression )
            {
            // InternalBehavior.g:1637:4: (lv_expr_2_0= ruleContractExpression )
            // InternalBehavior.g:1638:5: lv_expr_2_0= ruleContractExpression
            {

            					newCompositeNode(grammarAccess.getRequiresAccess().getExprContractExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_expr_2_0=ruleContractExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiresRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.ContractExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiresAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleRequires"


    // $ANTLR start "entryRuleEnsures"
    // InternalBehavior.g:1663:1: entryRuleEnsures returns [EObject current=null] : iv_ruleEnsures= ruleEnsures EOF ;
    public final EObject entryRuleEnsures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsures = null;


        try {
            // InternalBehavior.g:1663:48: (iv_ruleEnsures= ruleEnsures EOF )
            // InternalBehavior.g:1664:2: iv_ruleEnsures= ruleEnsures EOF
            {
             newCompositeNode(grammarAccess.getEnsuresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnsures=ruleEnsures();

            state._fsp--;

             current =iv_ruleEnsures; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEnsures"


    // $ANTLR start "ruleEnsures"
    // InternalBehavior.g:1670:1: ruleEnsures returns [EObject current=null] : (otherlv_0= 'ensures' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleEnsures() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1676:2: ( (otherlv_0= 'ensures' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' ) )
            // InternalBehavior.g:1677:2: (otherlv_0= 'ensures' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' )
            {
            // InternalBehavior.g:1677:2: (otherlv_0= 'ensures' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';' )
            // InternalBehavior.g:1678:3: otherlv_0= 'ensures' otherlv_1= ':' ( (lv_expr_2_0= ruleContractExpression ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getEnsuresAccess().getEnsuresKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getEnsuresAccess().getColonKeyword_1());
            		
            // InternalBehavior.g:1686:3: ( (lv_expr_2_0= ruleContractExpression ) )
            // InternalBehavior.g:1687:4: (lv_expr_2_0= ruleContractExpression )
            {
            // InternalBehavior.g:1687:4: (lv_expr_2_0= ruleContractExpression )
            // InternalBehavior.g:1688:5: lv_expr_2_0= ruleContractExpression
            {

            					newCompositeNode(grammarAccess.getEnsuresAccess().getExprContractExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_54);
            lv_expr_2_0=ruleContractExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnsuresRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.ContractExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEnsuresAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleEnsures"


    // $ANTLR start "entryRuleContractExpression"
    // InternalBehavior.g:1713:1: entryRuleContractExpression returns [String current=null] : iv_ruleContractExpression= ruleContractExpression EOF ;
    public final String entryRuleContractExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContractExpression = null;


        try {
            // InternalBehavior.g:1713:58: (iv_ruleContractExpression= ruleContractExpression EOF )
            // InternalBehavior.g:1714:2: iv_ruleContractExpression= ruleContractExpression EOF
            {
             newCompositeNode(grammarAccess.getContractExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContractExpression=ruleContractExpression();

            state._fsp--;

             current =iv_ruleContractExpression.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContractExpression"


    // $ANTLR start "ruleContractExpression"
    // InternalBehavior.g:1720:1: ruleContractExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleContractExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:1726:2: (this_STRING_0= RULE_STRING )
            // InternalBehavior.g:1727:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getContractExpressionAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleContractExpression"


    // $ANTLR start "entryRuleFStateGraph"
    // InternalBehavior.g:1737:1: entryRuleFStateGraph returns [EObject current=null] : iv_ruleFStateGraph= ruleFStateGraph EOF ;
    public final EObject entryRuleFStateGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFStateGraph = null;


        try {
            // InternalBehavior.g:1737:52: (iv_ruleFStateGraph= ruleFStateGraph EOF )
            // InternalBehavior.g:1738:2: iv_ruleFStateGraph= ruleFStateGraph EOF
            {
             newCompositeNode(grammarAccess.getFStateGraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFStateGraph=ruleFStateGraph();

            state._fsp--;

             current =iv_ruleFStateGraph; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFStateGraph"


    // $ANTLR start "ruleFStateGraph"
    // InternalBehavior.g:1744:1: ruleFStateGraph returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'initial' ( (otherlv_3= RULE_ID ) ) ( (lv_states_4_0= ruleFState ) )* otherlv_5= '}' ) ;
    public final EObject ruleFStateGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_states_4_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1750:2: ( ( () otherlv_1= '{' otherlv_2= 'initial' ( (otherlv_3= RULE_ID ) ) ( (lv_states_4_0= ruleFState ) )* otherlv_5= '}' ) )
            // InternalBehavior.g:1751:2: ( () otherlv_1= '{' otherlv_2= 'initial' ( (otherlv_3= RULE_ID ) ) ( (lv_states_4_0= ruleFState ) )* otherlv_5= '}' )
            {
            // InternalBehavior.g:1751:2: ( () otherlv_1= '{' otherlv_2= 'initial' ( (otherlv_3= RULE_ID ) ) ( (lv_states_4_0= ruleFState ) )* otherlv_5= '}' )
            // InternalBehavior.g:1752:3: () otherlv_1= '{' otherlv_2= 'initial' ( (otherlv_3= RULE_ID ) ) ( (lv_states_4_0= ruleFState ) )* otherlv_5= '}'
            {
            // InternalBehavior.g:1752:3: ()
            // InternalBehavior.g:1753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFStateGraphAccess().getFStateGraphAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getFStateGraphAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFStateGraphAccess().getInitialKeyword_2());
            		
            // InternalBehavior.g:1767:3: ( (otherlv_3= RULE_ID ) )
            // InternalBehavior.g:1768:4: (otherlv_3= RULE_ID )
            {
            // InternalBehavior.g:1768:4: (otherlv_3= RULE_ID )
            // InternalBehavior.g:1769:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFStateGraphRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(otherlv_3, grammarAccess.getFStateGraphAccess().getInitialFStateCrossReference_3_0());
            				

            }


            }

            // InternalBehavior.g:1780:3: ( (lv_states_4_0= ruleFState ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==48||LA44_0==73) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalBehavior.g:1781:4: (lv_states_4_0= ruleFState )
            	    {
            	    // InternalBehavior.g:1781:4: (lv_states_4_0= ruleFState )
            	    // InternalBehavior.g:1782:5: lv_states_4_0= ruleFState
            	    {

            	    					newCompositeNode(grammarAccess.getFStateGraphAccess().getStatesFStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_56);
            	    lv_states_4_0=ruleFState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFStateGraphRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_4_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.FState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFStateGraphAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFStateGraph"


    // $ANTLR start "entryRuleFState"
    // InternalBehavior.g:1807:1: entryRuleFState returns [EObject current=null] : iv_ruleFState= ruleFState EOF ;
    public final EObject entryRuleFState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFState = null;


        try {
            // InternalBehavior.g:1807:47: (iv_ruleFState= ruleFState EOF )
            // InternalBehavior.g:1808:2: iv_ruleFState= ruleFState EOF
            {
             newCompositeNode(grammarAccess.getFStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFState=ruleFState();

            state._fsp--;

             current =iv_ruleFState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFState"


    // $ANTLR start "ruleFState"
    // InternalBehavior.g:1814:1: ruleFState returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )? (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )? ( (lv_transitions_20_0= ruleFTransition ) )* otherlv_21= '}' ) ;
    public final EObject ruleFState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_entryAction_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_exitAction_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_doAction_17_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_comment_1_0 = null;

        EObject lv_broadcastEntry_8_0 = null;

        EObject lv_broadcastExit_13_0 = null;

        EObject lv_boradcastDo_18_0 = null;

        EObject lv_transitions_20_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:1820:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )? (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )? ( (lv_transitions_20_0= ruleFTransition ) )* otherlv_21= '}' ) )
            // InternalBehavior.g:1821:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )? (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )? ( (lv_transitions_20_0= ruleFTransition ) )* otherlv_21= '}' )
            {
            // InternalBehavior.g:1821:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )? (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )? ( (lv_transitions_20_0= ruleFTransition ) )* otherlv_21= '}' )
            // InternalBehavior.g:1822:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )? (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )? (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )? ( (lv_transitions_20_0= ruleFTransition ) )* otherlv_21= '}'
            {
            // InternalBehavior.g:1822:3: ()
            // InternalBehavior.g:1823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFStateAccess().getFStateAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:1829:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==73) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalBehavior.g:1830:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:1830:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:1831:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFStateAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_57);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFStateRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFStateAccess().getStateKeyword_2());
            		
            // InternalBehavior.g:1852:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBehavior.g:1853:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBehavior.g:1853:4: (lv_name_3_0= RULE_ID )
            // InternalBehavior.g:1854:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFStateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_58); 

            			newLeafNode(otherlv_4, grammarAccess.getFStateAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBehavior.g:1874:3: (otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalBehavior.g:1875:4: otherlv_5= 'entry' otherlv_6= '{' ( (lv_entryAction_7_0= RULE_CC_STRING ) ) ( (lv_broadcastEntry_8_0= ruleBroadcast ) )? otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getFStateAccess().getEntryKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_59); 

                    				newLeafNode(otherlv_6, grammarAccess.getFStateAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalBehavior.g:1883:4: ( (lv_entryAction_7_0= RULE_CC_STRING ) )
                    // InternalBehavior.g:1884:5: (lv_entryAction_7_0= RULE_CC_STRING )
                    {
                    // InternalBehavior.g:1884:5: (lv_entryAction_7_0= RULE_CC_STRING )
                    // InternalBehavior.g:1885:6: lv_entryAction_7_0= RULE_CC_STRING
                    {
                    lv_entryAction_7_0=(Token)match(input,RULE_CC_STRING,FOLLOW_60); 

                    						newLeafNode(lv_entryAction_7_0, grammarAccess.getFStateAccess().getEntryActionCC_STRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFStateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"entryAction",
                    							lv_entryAction_7_0,
                    							"de.tu_bs.ccc.contracting.Behavior.CC_STRING");
                    					

                    }


                    }

                    // InternalBehavior.g:1901:4: ( (lv_broadcastEntry_8_0= ruleBroadcast ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==53) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalBehavior.g:1902:5: (lv_broadcastEntry_8_0= ruleBroadcast )
                            {
                            // InternalBehavior.g:1902:5: (lv_broadcastEntry_8_0= ruleBroadcast )
                            // InternalBehavior.g:1903:6: lv_broadcastEntry_8_0= ruleBroadcast
                            {

                            						newCompositeNode(grammarAccess.getFStateAccess().getBroadcastEntryBroadcastParserRuleCall_5_3_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_broadcastEntry_8_0=ruleBroadcast();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFStateRule());
                            						}
                            						set(
                            							current,
                            							"broadcastEntry",
                            							lv_broadcastEntry_8_0,
                            							"de.tu_bs.ccc.contracting.Behavior.Broadcast");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_61); 

                    				newLeafNode(otherlv_9, grammarAccess.getFStateAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:1925:3: (otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalBehavior.g:1926:4: otherlv_10= 'exit' otherlv_11= '{' ( (lv_exitAction_12_0= RULE_CC_STRING ) ) ( (lv_broadcastExit_13_0= ruleBroadcast ) )? otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,50,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getFStateAccess().getExitKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getFStateAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBehavior.g:1934:4: ( (lv_exitAction_12_0= RULE_CC_STRING ) )
                    // InternalBehavior.g:1935:5: (lv_exitAction_12_0= RULE_CC_STRING )
                    {
                    // InternalBehavior.g:1935:5: (lv_exitAction_12_0= RULE_CC_STRING )
                    // InternalBehavior.g:1936:6: lv_exitAction_12_0= RULE_CC_STRING
                    {
                    lv_exitAction_12_0=(Token)match(input,RULE_CC_STRING,FOLLOW_60); 

                    						newLeafNode(lv_exitAction_12_0, grammarAccess.getFStateAccess().getExitActionCC_STRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFStateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"exitAction",
                    							lv_exitAction_12_0,
                    							"de.tu_bs.ccc.contracting.Behavior.CC_STRING");
                    					

                    }


                    }

                    // InternalBehavior.g:1952:4: ( (lv_broadcastExit_13_0= ruleBroadcast ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==53) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalBehavior.g:1953:5: (lv_broadcastExit_13_0= ruleBroadcast )
                            {
                            // InternalBehavior.g:1953:5: (lv_broadcastExit_13_0= ruleBroadcast )
                            // InternalBehavior.g:1954:6: lv_broadcastExit_13_0= ruleBroadcast
                            {

                            						newCompositeNode(grammarAccess.getFStateAccess().getBroadcastExitBroadcastParserRuleCall_6_3_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_broadcastExit_13_0=ruleBroadcast();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFStateRule());
                            						}
                            						set(
                            							current,
                            							"broadcastExit",
                            							lv_broadcastExit_13_0,
                            							"de.tu_bs.ccc.contracting.Behavior.Broadcast");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_62); 

                    				newLeafNode(otherlv_14, grammarAccess.getFStateAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:1976:3: (otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalBehavior.g:1977:4: otherlv_15= 'do' otherlv_16= '{' ( (lv_doAction_17_0= RULE_CC_STRING ) ) ( (lv_boradcastDo_18_0= ruleBroadcast ) )? otherlv_19= '}'
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getFStateAccess().getDoKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_59); 

                    				newLeafNode(otherlv_16, grammarAccess.getFStateAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBehavior.g:1985:4: ( (lv_doAction_17_0= RULE_CC_STRING ) )
                    // InternalBehavior.g:1986:5: (lv_doAction_17_0= RULE_CC_STRING )
                    {
                    // InternalBehavior.g:1986:5: (lv_doAction_17_0= RULE_CC_STRING )
                    // InternalBehavior.g:1987:6: lv_doAction_17_0= RULE_CC_STRING
                    {
                    lv_doAction_17_0=(Token)match(input,RULE_CC_STRING,FOLLOW_60); 

                    						newLeafNode(lv_doAction_17_0, grammarAccess.getFStateAccess().getDoActionCC_STRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFStateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"doAction",
                    							lv_doAction_17_0,
                    							"de.tu_bs.ccc.contracting.Behavior.CC_STRING");
                    					

                    }


                    }

                    // InternalBehavior.g:2003:4: ( (lv_boradcastDo_18_0= ruleBroadcast ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==53) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalBehavior.g:2004:5: (lv_boradcastDo_18_0= ruleBroadcast )
                            {
                            // InternalBehavior.g:2004:5: (lv_boradcastDo_18_0= ruleBroadcast )
                            // InternalBehavior.g:2005:6: lv_boradcastDo_18_0= ruleBroadcast
                            {

                            						newCompositeNode(grammarAccess.getFStateAccess().getBoradcastDoBroadcastParserRuleCall_7_3_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_boradcastDo_18_0=ruleBroadcast();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFStateRule());
                            						}
                            						set(
                            							current,
                            							"boradcastDo",
                            							lv_boradcastDo_18_0,
                            							"de.tu_bs.ccc.contracting.Behavior.Broadcast");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,21,FOLLOW_63); 

                    				newLeafNode(otherlv_19, grammarAccess.getFStateAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:2027:3: ( (lv_transitions_20_0= ruleFTransition ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==28) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalBehavior.g:2028:4: (lv_transitions_20_0= ruleFTransition )
            	    {
            	    // InternalBehavior.g:2028:4: (lv_transitions_20_0= ruleFTransition )
            	    // InternalBehavior.g:2029:5: lv_transitions_20_0= ruleFTransition
            	    {

            	    					newCompositeNode(grammarAccess.getFStateAccess().getTransitionsFTransitionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_63);
            	    lv_transitions_20_0=ruleFTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_20_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.FTransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getFStateAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFState"


    // $ANTLR start "entryRuleFTransition"
    // InternalBehavior.g:2054:1: entryRuleFTransition returns [EObject current=null] : iv_ruleFTransition= ruleFTransition EOF ;
    public final EObject entryRuleFTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTransition = null;


        try {
            // InternalBehavior.g:2054:52: (iv_ruleFTransition= ruleFTransition EOF )
            // InternalBehavior.g:2055:2: iv_ruleFTransition= ruleFTransition EOF
            {
             newCompositeNode(grammarAccess.getFTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTransition=ruleFTransition();

            state._fsp--;

             current =iv_ruleFTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFTransition"


    // $ANTLR start "ruleFTransition"
    // InternalBehavior.g:2061:1: ruleFTransition returns [EObject current=null] : (otherlv_0= 'on' ( (lv_trigger_1_0= ruleFTrigger ) ) ( (lv_guard_2_0= ruleFGuard ) )? otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )? ) ;
    public final EObject ruleFTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_action_6_0=null;
        Token otherlv_8=null;
        EObject lv_trigger_1_0 = null;

        EObject lv_guard_2_0 = null;

        EObject lv_broadcast_7_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2067:2: ( (otherlv_0= 'on' ( (lv_trigger_1_0= ruleFTrigger ) ) ( (lv_guard_2_0= ruleFGuard ) )? otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )? ) )
            // InternalBehavior.g:2068:2: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleFTrigger ) ) ( (lv_guard_2_0= ruleFGuard ) )? otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )? )
            {
            // InternalBehavior.g:2068:2: (otherlv_0= 'on' ( (lv_trigger_1_0= ruleFTrigger ) ) ( (lv_guard_2_0= ruleFGuard ) )? otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )? )
            // InternalBehavior.g:2069:3: otherlv_0= 'on' ( (lv_trigger_1_0= ruleFTrigger ) ) ( (lv_guard_2_0= ruleFGuard ) )? otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getFTransitionAccess().getOnKeyword_0());
            		
            // InternalBehavior.g:2073:3: ( (lv_trigger_1_0= ruleFTrigger ) )
            // InternalBehavior.g:2074:4: (lv_trigger_1_0= ruleFTrigger )
            {
            // InternalBehavior.g:2074:4: (lv_trigger_1_0= ruleFTrigger )
            // InternalBehavior.g:2075:5: lv_trigger_1_0= ruleFTrigger
            {

            					newCompositeNode(grammarAccess.getFTransitionAccess().getTriggerFTriggerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_65);
            lv_trigger_1_0=ruleFTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTransitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:2092:3: ( (lv_guard_2_0= ruleFGuard ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==39) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalBehavior.g:2093:4: (lv_guard_2_0= ruleFGuard )
                    {
                    // InternalBehavior.g:2093:4: (lv_guard_2_0= ruleFGuard )
                    // InternalBehavior.g:2094:5: lv_guard_2_0= ruleFGuard
                    {

                    					newCompositeNode(grammarAccess.getFTransitionAccess().getGuardFGuardParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_guard_2_0=ruleFGuard();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFTransitionRule());
                    					}
                    					set(
                    						current,
                    						"guard",
                    						lv_guard_2_0,
                    						"de.tu_bs.ccc.contracting.Behavior.FGuard");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalBehavior.g:2115:3: ( (otherlv_4= RULE_ID ) )
            // InternalBehavior.g:2116:4: (otherlv_4= RULE_ID )
            {
            // InternalBehavior.g:2116:4: (otherlv_4= RULE_ID )
            // InternalBehavior.g:2117:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(otherlv_4, grammarAccess.getFTransitionAccess().getToFStateCrossReference_4_0());
            				

            }


            }

            // InternalBehavior.g:2128:3: (otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==18) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBehavior.g:2129:4: otherlv_5= '{' ( (lv_action_6_0= RULE_CC_STRING ) ) ( (lv_broadcast_7_0= ruleBroadcast ) )? otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_59); 

                    				newLeafNode(otherlv_5, grammarAccess.getFTransitionAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalBehavior.g:2133:4: ( (lv_action_6_0= RULE_CC_STRING ) )
                    // InternalBehavior.g:2134:5: (lv_action_6_0= RULE_CC_STRING )
                    {
                    // InternalBehavior.g:2134:5: (lv_action_6_0= RULE_CC_STRING )
                    // InternalBehavior.g:2135:6: lv_action_6_0= RULE_CC_STRING
                    {
                    lv_action_6_0=(Token)match(input,RULE_CC_STRING,FOLLOW_60); 

                    						newLeafNode(lv_action_6_0, grammarAccess.getFTransitionAccess().getActionCC_STRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFTransitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"action",
                    							lv_action_6_0,
                    							"de.tu_bs.ccc.contracting.Behavior.CC_STRING");
                    					

                    }


                    }

                    // InternalBehavior.g:2151:4: ( (lv_broadcast_7_0= ruleBroadcast ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==53) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalBehavior.g:2152:5: (lv_broadcast_7_0= ruleBroadcast )
                            {
                            // InternalBehavior.g:2152:5: (lv_broadcast_7_0= ruleBroadcast )
                            // InternalBehavior.g:2153:6: lv_broadcast_7_0= ruleBroadcast
                            {

                            						newCompositeNode(grammarAccess.getFTransitionAccess().getBroadcastBroadcastParserRuleCall_5_2_0());
                            					
                            pushFollow(FOLLOW_42);
                            lv_broadcast_7_0=ruleBroadcast();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFTransitionRule());
                            						}
                            						set(
                            							current,
                            							"broadcast",
                            							lv_broadcast_7_0,
                            							"de.tu_bs.ccc.contracting.Behavior.Broadcast");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getFTransitionAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFTransition"


    // $ANTLR start "entryRuleFTrigger"
    // InternalBehavior.g:2179:1: entryRuleFTrigger returns [EObject current=null] : iv_ruleFTrigger= ruleFTrigger EOF ;
    public final EObject entryRuleFTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTrigger = null;


        try {
            // InternalBehavior.g:2179:49: (iv_ruleFTrigger= ruleFTrigger EOF )
            // InternalBehavior.g:2180:2: iv_ruleFTrigger= ruleFTrigger EOF
            {
             newCompositeNode(grammarAccess.getFTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTrigger=ruleFTrigger();

            state._fsp--;

             current =iv_ruleFTrigger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFTrigger"


    // $ANTLR start "ruleFTrigger"
    // InternalBehavior.g:2186:1: ruleFTrigger returns [EObject current=null] : ( (lv_event_0_0= ruleFEventOnIf ) ) ;
    public final EObject ruleFTrigger() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2192:2: ( ( (lv_event_0_0= ruleFEventOnIf ) ) )
            // InternalBehavior.g:2193:2: ( (lv_event_0_0= ruleFEventOnIf ) )
            {
            // InternalBehavior.g:2193:2: ( (lv_event_0_0= ruleFEventOnIf ) )
            // InternalBehavior.g:2194:3: (lv_event_0_0= ruleFEventOnIf )
            {
            // InternalBehavior.g:2194:3: (lv_event_0_0= ruleFEventOnIf )
            // InternalBehavior.g:2195:4: lv_event_0_0= ruleFEventOnIf
            {

            				newCompositeNode(grammarAccess.getFTriggerAccess().getEventFEventOnIfParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_event_0_0=ruleFEventOnIf();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFTriggerRule());
            				}
            				set(
            					current,
            					"event",
            					lv_event_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.FEventOnIf");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFTrigger"


    // $ANTLR start "entryRuleFEventOnIf"
    // InternalBehavior.g:2215:1: entryRuleFEventOnIf returns [EObject current=null] : iv_ruleFEventOnIf= ruleFEventOnIf EOF ;
    public final EObject entryRuleFEventOnIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFEventOnIf = null;


        try {
            // InternalBehavior.g:2215:51: (iv_ruleFEventOnIf= ruleFEventOnIf EOF )
            // InternalBehavior.g:2216:2: iv_ruleFEventOnIf= ruleFEventOnIf EOF
            {
             newCompositeNode(grammarAccess.getFEventOnIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFEventOnIf=ruleFEventOnIf();

            state._fsp--;

             current =iv_ruleFEventOnIf; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFEventOnIf"


    // $ANTLR start "ruleFEventOnIf"
    // InternalBehavior.g:2222:1: ruleFEventOnIf returns [EObject current=null] : ( ( () otherlv_1= 'tick' ) | (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) ) ) ;
    public final EObject ruleFEventOnIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2228:2: ( ( ( () otherlv_1= 'tick' ) | (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) ) ) )
            // InternalBehavior.g:2229:2: ( ( () otherlv_1= 'tick' ) | (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) ) )
            {
            // InternalBehavior.g:2229:2: ( ( () otherlv_1= 'tick' ) | (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==52) ) {
                alt56=1;
            }
            else if ( (LA56_0==33) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalBehavior.g:2230:3: ( () otherlv_1= 'tick' )
                    {
                    // InternalBehavior.g:2230:3: ( () otherlv_1= 'tick' )
                    // InternalBehavior.g:2231:4: () otherlv_1= 'tick'
                    {
                    // InternalBehavior.g:2231:4: ()
                    // InternalBehavior.g:2232:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFEventOnIfAccess().getFEventOnIfAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFEventOnIfAccess().getTickKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:2244:3: (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) )
                    {
                    // InternalBehavior.g:2244:3: (otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) ) )
                    // InternalBehavior.g:2245:4: otherlv_2= 'event' ( (lv_name_3_0= ruleEvent ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getFEventOnIfAccess().getEventKeyword_1_0());
                    			
                    // InternalBehavior.g:2249:4: ( (lv_name_3_0= ruleEvent ) )
                    // InternalBehavior.g:2250:5: (lv_name_3_0= ruleEvent )
                    {
                    // InternalBehavior.g:2250:5: (lv_name_3_0= ruleEvent )
                    // InternalBehavior.g:2251:6: lv_name_3_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getFEventOnIfAccess().getNameEventParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_3_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFEventOnIfRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.tu_bs.ccc.contracting.Behavior.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleFEventOnIf"


    // $ANTLR start "entryRuleBroadcast"
    // InternalBehavior.g:2273:1: entryRuleBroadcast returns [EObject current=null] : iv_ruleBroadcast= ruleBroadcast EOF ;
    public final EObject entryRuleBroadcast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBroadcast = null;


        try {
            // InternalBehavior.g:2273:50: (iv_ruleBroadcast= ruleBroadcast EOF )
            // InternalBehavior.g:2274:2: iv_ruleBroadcast= ruleBroadcast EOF
            {
             newCompositeNode(grammarAccess.getBroadcastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBroadcast=ruleBroadcast();

            state._fsp--;

             current =iv_ruleBroadcast; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBroadcast"


    // $ANTLR start "ruleBroadcast"
    // InternalBehavior.g:2280:1: ruleBroadcast returns [EObject current=null] : (otherlv_0= 'emit' ( (lv_signal_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleBroadcast() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_signal_1_0=null;
        Token otherlv_2=null;
        Token lv_arguments_3_0=null;
        Token otherlv_4=null;
        Token lv_arguments_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalBehavior.g:2286:2: ( (otherlv_0= 'emit' ( (lv_signal_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )? ) )
            // InternalBehavior.g:2287:2: (otherlv_0= 'emit' ( (lv_signal_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )? )
            {
            // InternalBehavior.g:2287:2: (otherlv_0= 'emit' ( (lv_signal_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )? )
            // InternalBehavior.g:2288:3: otherlv_0= 'emit' ( (lv_signal_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBroadcastAccess().getEmitKeyword_0());
            		
            // InternalBehavior.g:2292:3: ( (lv_signal_1_0= RULE_ID ) )
            // InternalBehavior.g:2293:4: (lv_signal_1_0= RULE_ID )
            {
            // InternalBehavior.g:2293:4: (lv_signal_1_0= RULE_ID )
            // InternalBehavior.g:2294:5: lv_signal_1_0= RULE_ID
            {
            lv_signal_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_signal_1_0, grammarAccess.getBroadcastAccess().getSignalIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBroadcastRule());
            					}
            					setWithLastConsumed(
            						current,
            						"signal",
            						lv_signal_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:2310:3: (otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBehavior.g:2311:4: otherlv_2= '(' ( (lv_arguments_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getBroadcastAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBehavior.g:2315:4: ( (lv_arguments_3_0= RULE_ID ) )
                    // InternalBehavior.g:2316:5: (lv_arguments_3_0= RULE_ID )
                    {
                    // InternalBehavior.g:2316:5: (lv_arguments_3_0= RULE_ID )
                    // InternalBehavior.g:2317:6: lv_arguments_3_0= RULE_ID
                    {
                    lv_arguments_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(lv_arguments_3_0, grammarAccess.getBroadcastAccess().getArgumentsIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBroadcastRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalBehavior.g:2333:4: (otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==26) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalBehavior.g:2334:5: otherlv_4= ',' ( (lv_arguments_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getBroadcastAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalBehavior.g:2338:5: ( (lv_arguments_5_0= RULE_ID ) )
                    	    // InternalBehavior.g:2339:6: (lv_arguments_5_0= RULE_ID )
                    	    {
                    	    // InternalBehavior.g:2339:6: (lv_arguments_5_0= RULE_ID )
                    	    // InternalBehavior.g:2340:7: lv_arguments_5_0= RULE_ID
                    	    {
                    	    lv_arguments_5_0=(Token)match(input,RULE_ID,FOLLOW_25); 

                    	    							newLeafNode(lv_arguments_5_0, grammarAccess.getBroadcastAccess().getArgumentsIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBroadcastRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getBroadcastAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleBroadcast"


    // $ANTLR start "entryRuleFGuard"
    // InternalBehavior.g:2366:1: entryRuleFGuard returns [EObject current=null] : iv_ruleFGuard= ruleFGuard EOF ;
    public final EObject entryRuleFGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGuard = null;


        try {
            // InternalBehavior.g:2366:47: (iv_ruleFGuard= ruleFGuard EOF )
            // InternalBehavior.g:2367:2: iv_ruleFGuard= ruleFGuard EOF
            {
             newCompositeNode(grammarAccess.getFGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFGuard=ruleFGuard();

            state._fsp--;

             current =iv_ruleFGuard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFGuard"


    // $ANTLR start "ruleFGuard"
    // InternalBehavior.g:2373:1: ruleFGuard returns [EObject current=null] : (otherlv_0= '[' ( (lv_condition_1_0= ruleLogicalOrExpression ) ) otherlv_2= ']' ) ;
    public final EObject ruleFGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2379:2: ( (otherlv_0= '[' ( (lv_condition_1_0= ruleLogicalOrExpression ) ) otherlv_2= ']' ) )
            // InternalBehavior.g:2380:2: (otherlv_0= '[' ( (lv_condition_1_0= ruleLogicalOrExpression ) ) otherlv_2= ']' )
            {
            // InternalBehavior.g:2380:2: (otherlv_0= '[' ( (lv_condition_1_0= ruleLogicalOrExpression ) ) otherlv_2= ']' )
            // InternalBehavior.g:2381:3: otherlv_0= '[' ( (lv_condition_1_0= ruleLogicalOrExpression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getFGuardAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBehavior.g:2385:3: ( (lv_condition_1_0= ruleLogicalOrExpression ) )
            // InternalBehavior.g:2386:4: (lv_condition_1_0= ruleLogicalOrExpression )
            {
            // InternalBehavior.g:2386:4: (lv_condition_1_0= ruleLogicalOrExpression )
            // InternalBehavior.g:2387:5: lv_condition_1_0= ruleLogicalOrExpression
            {

            					newCompositeNode(grammarAccess.getFGuardAccess().getConditionLogicalOrExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_condition_1_0=ruleLogicalOrExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFGuardRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.LogicalOrExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFGuardAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleFGuard"


    // $ANTLR start "entryRuleFTypeRef"
    // InternalBehavior.g:2412:1: entryRuleFTypeRef returns [EObject current=null] : iv_ruleFTypeRef= ruleFTypeRef EOF ;
    public final EObject entryRuleFTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTypeRef = null;


        try {
            // InternalBehavior.g:2412:49: (iv_ruleFTypeRef= ruleFTypeRef EOF )
            // InternalBehavior.g:2413:2: iv_ruleFTypeRef= ruleFTypeRef EOF
            {
             newCompositeNode(grammarAccess.getFTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTypeRef=ruleFTypeRef();

            state._fsp--;

             current =iv_ruleFTypeRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFTypeRef"


    // $ANTLR start "ruleFTypeRef"
    // InternalBehavior.g:2419:1: ruleFTypeRef returns [EObject current=null] : ( ( (lv_predefined_0_0= ruleFBasicTypeId ) ) | ( ( ruleFQN ) ) | ( (lv_interval_2_0= ruleFIntegerInterval ) ) ) ;
    public final EObject ruleFTypeRef() throws RecognitionException {
        EObject current = null;

        Enumerator lv_predefined_0_0 = null;

        EObject lv_interval_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2425:2: ( ( ( (lv_predefined_0_0= ruleFBasicTypeId ) ) | ( ( ruleFQN ) ) | ( (lv_interval_2_0= ruleFIntegerInterval ) ) ) )
            // InternalBehavior.g:2426:2: ( ( (lv_predefined_0_0= ruleFBasicTypeId ) ) | ( ( ruleFQN ) ) | ( (lv_interval_2_0= ruleFIntegerInterval ) ) )
            {
            // InternalBehavior.g:2426:2: ( ( (lv_predefined_0_0= ruleFBasicTypeId ) ) | ( ( ruleFQN ) ) | ( (lv_interval_2_0= ruleFIntegerInterval ) ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
                {
                alt59=1;
                }
                break;
            case RULE_ID:
                {
                alt59=2;
                }
                break;
            case 54:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalBehavior.g:2427:3: ( (lv_predefined_0_0= ruleFBasicTypeId ) )
                    {
                    // InternalBehavior.g:2427:3: ( (lv_predefined_0_0= ruleFBasicTypeId ) )
                    // InternalBehavior.g:2428:4: (lv_predefined_0_0= ruleFBasicTypeId )
                    {
                    // InternalBehavior.g:2428:4: (lv_predefined_0_0= ruleFBasicTypeId )
                    // InternalBehavior.g:2429:5: lv_predefined_0_0= ruleFBasicTypeId
                    {

                    					newCompositeNode(grammarAccess.getFTypeRefAccess().getPredefinedFBasicTypeIdEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_predefined_0_0=ruleFBasicTypeId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFTypeRefRule());
                    					}
                    					set(
                    						current,
                    						"predefined",
                    						lv_predefined_0_0,
                    						"de.tu_bs.ccc.contracting.Behavior.FBasicTypeId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:2447:3: ( ( ruleFQN ) )
                    {
                    // InternalBehavior.g:2447:3: ( ( ruleFQN ) )
                    // InternalBehavior.g:2448:4: ( ruleFQN )
                    {
                    // InternalBehavior.g:2448:4: ( ruleFQN )
                    // InternalBehavior.g:2449:5: ruleFQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTypeRefRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getFTypeRefAccess().getDerivedFTypeCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:2464:3: ( (lv_interval_2_0= ruleFIntegerInterval ) )
                    {
                    // InternalBehavior.g:2464:3: ( (lv_interval_2_0= ruleFIntegerInterval ) )
                    // InternalBehavior.g:2465:4: (lv_interval_2_0= ruleFIntegerInterval )
                    {
                    // InternalBehavior.g:2465:4: (lv_interval_2_0= ruleFIntegerInterval )
                    // InternalBehavior.g:2466:5: lv_interval_2_0= ruleFIntegerInterval
                    {

                    					newCompositeNode(grammarAccess.getFTypeRefAccess().getIntervalFIntegerIntervalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_interval_2_0=ruleFIntegerInterval();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFTypeRefRule());
                    					}
                    					set(
                    						current,
                    						"interval",
                    						lv_interval_2_0,
                    						"de.tu_bs.ccc.contracting.Behavior.FIntegerInterval");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFTypeRef"


    // $ANTLR start "entryRuleFIntegerInterval"
    // InternalBehavior.g:2487:1: entryRuleFIntegerInterval returns [EObject current=null] : iv_ruleFIntegerInterval= ruleFIntegerInterval EOF ;
    public final EObject entryRuleFIntegerInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIntegerInterval = null;


        try {
            // InternalBehavior.g:2487:57: (iv_ruleFIntegerInterval= ruleFIntegerInterval EOF )
            // InternalBehavior.g:2488:2: iv_ruleFIntegerInterval= ruleFIntegerInterval EOF
            {
             newCompositeNode(grammarAccess.getFIntegerIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFIntegerInterval=ruleFIntegerInterval();

            state._fsp--;

             current =iv_ruleFIntegerInterval; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFIntegerInterval"


    // $ANTLR start "ruleFIntegerInterval"
    // InternalBehavior.g:2494:1: ruleFIntegerInterval returns [EObject current=null] : ( () otherlv_1= 'Integer' (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )? ) ;
    public final EObject ruleFIntegerInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_lowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2500:2: ( ( () otherlv_1= 'Integer' (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )? ) )
            // InternalBehavior.g:2501:2: ( () otherlv_1= 'Integer' (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )? )
            {
            // InternalBehavior.g:2501:2: ( () otherlv_1= 'Integer' (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )? )
            // InternalBehavior.g:2502:3: () otherlv_1= 'Integer' (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )?
            {
            // InternalBehavior.g:2502:3: ()
            // InternalBehavior.g:2503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFIntegerIntervalAccess().getFIntegerIntervalAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFIntegerIntervalAccess().getIntegerKeyword_1());
            		
            // InternalBehavior.g:2513:3: (otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==25) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBehavior.g:2514:4: otherlv_2= '(' ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' ) otherlv_5= ',' ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' ) otherlv_8= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_67); 

                    				newLeafNode(otherlv_2, grammarAccess.getFIntegerIntervalAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBehavior.g:2518:4: ( ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) ) | otherlv_4= 'minInt' )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT||LA60_0==57) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==55) ) {
                        alt60=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBehavior.g:2519:5: ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) )
                            {
                            // InternalBehavior.g:2519:5: ( (lv_lowerBound_3_0= ruleINTERVAL_BOUND ) )
                            // InternalBehavior.g:2520:6: (lv_lowerBound_3_0= ruleINTERVAL_BOUND )
                            {
                            // InternalBehavior.g:2520:6: (lv_lowerBound_3_0= ruleINTERVAL_BOUND )
                            // InternalBehavior.g:2521:7: lv_lowerBound_3_0= ruleINTERVAL_BOUND
                            {

                            							newCompositeNode(grammarAccess.getFIntegerIntervalAccess().getLowerBoundINTERVAL_BOUNDParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_68);
                            lv_lowerBound_3_0=ruleINTERVAL_BOUND();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFIntegerIntervalRule());
                            							}
                            							set(
                            								current,
                            								"lowerBound",
                            								lv_lowerBound_3_0,
                            								"de.tu_bs.ccc.contracting.Behavior.INTERVAL_BOUND");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBehavior.g:2539:5: otherlv_4= 'minInt'
                            {
                            otherlv_4=(Token)match(input,55,FOLLOW_68); 

                            					newLeafNode(otherlv_4, grammarAccess.getFIntegerIntervalAccess().getMinIntKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_69); 

                    				newLeafNode(otherlv_5, grammarAccess.getFIntegerIntervalAccess().getCommaKeyword_2_2());
                    			
                    // InternalBehavior.g:2548:4: ( ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) ) | otherlv_7= 'maxInt' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_INT||LA61_0==57) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==56) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalBehavior.g:2549:5: ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) )
                            {
                            // InternalBehavior.g:2549:5: ( (lv_upperBound_6_0= ruleINTERVAL_BOUND ) )
                            // InternalBehavior.g:2550:6: (lv_upperBound_6_0= ruleINTERVAL_BOUND )
                            {
                            // InternalBehavior.g:2550:6: (lv_upperBound_6_0= ruleINTERVAL_BOUND )
                            // InternalBehavior.g:2551:7: lv_upperBound_6_0= ruleINTERVAL_BOUND
                            {

                            							newCompositeNode(grammarAccess.getFIntegerIntervalAccess().getUpperBoundINTERVAL_BOUNDParserRuleCall_2_3_0_0());
                            						
                            pushFollow(FOLLOW_70);
                            lv_upperBound_6_0=ruleINTERVAL_BOUND();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFIntegerIntervalRule());
                            							}
                            							set(
                            								current,
                            								"upperBound",
                            								lv_upperBound_6_0,
                            								"de.tu_bs.ccc.contracting.Behavior.INTERVAL_BOUND");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBehavior.g:2569:5: otherlv_7= 'maxInt'
                            {
                            otherlv_7=(Token)match(input,56,FOLLOW_70); 

                            					newLeafNode(otherlv_7, grammarAccess.getFIntegerIntervalAccess().getMaxIntKeyword_2_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getFIntegerIntervalAccess().getRightParenthesisKeyword_2_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFIntegerInterval"


    // $ANTLR start "entryRuleINTERVAL_BOUND"
    // InternalBehavior.g:2583:1: entryRuleINTERVAL_BOUND returns [String current=null] : iv_ruleINTERVAL_BOUND= ruleINTERVAL_BOUND EOF ;
    public final String entryRuleINTERVAL_BOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTERVAL_BOUND = null;


        try {
            // InternalBehavior.g:2583:54: (iv_ruleINTERVAL_BOUND= ruleINTERVAL_BOUND EOF )
            // InternalBehavior.g:2584:2: iv_ruleINTERVAL_BOUND= ruleINTERVAL_BOUND EOF
            {
             newCompositeNode(grammarAccess.getINTERVAL_BOUNDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTERVAL_BOUND=ruleINTERVAL_BOUND();

            state._fsp--;

             current =iv_ruleINTERVAL_BOUND.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINTERVAL_BOUND"


    // $ANTLR start "ruleINTERVAL_BOUND"
    // InternalBehavior.g:2590:1: ruleINTERVAL_BOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTERVAL_BOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBehavior.g:2596:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBehavior.g:2597:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBehavior.g:2597:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBehavior.g:2598:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBehavior.g:2598:3: (kw= '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==57) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBehavior.g:2599:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getINTERVAL_BOUNDAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getINTERVAL_BOUNDAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleINTERVAL_BOUND"


    // $ANTLR start "entryRuleFArrayType"
    // InternalBehavior.g:2616:1: entryRuleFArrayType returns [EObject current=null] : iv_ruleFArrayType= ruleFArrayType EOF ;
    public final EObject entryRuleFArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFArrayType = null;


        try {
            // InternalBehavior.g:2616:51: (iv_ruleFArrayType= ruleFArrayType EOF )
            // InternalBehavior.g:2617:2: iv_ruleFArrayType= ruleFArrayType EOF
            {
             newCompositeNode(grammarAccess.getFArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFArrayType=ruleFArrayType();

            state._fsp--;

             current =iv_ruleFArrayType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFArrayType"


    // $ANTLR start "ruleFArrayType"
    // InternalBehavior.g:2623:1: ruleFArrayType returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'array' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'of' ( (lv_elementType_6_0= ruleFTypeRef ) ) ) ;
    public final EObject ruleFArrayType() throws RecognitionException {
        EObject current = null;

        Token lv_public_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_comment_1_0 = null;

        EObject lv_elementType_6_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2629:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'array' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'of' ( (lv_elementType_6_0= ruleFTypeRef ) ) ) )
            // InternalBehavior.g:2630:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'array' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'of' ( (lv_elementType_6_0= ruleFTypeRef ) ) )
            {
            // InternalBehavior.g:2630:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'array' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'of' ( (lv_elementType_6_0= ruleFTypeRef ) ) )
            // InternalBehavior.g:2631:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'array' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'of' ( (lv_elementType_6_0= ruleFTypeRef ) )
            {
            // InternalBehavior.g:2631:3: ()
            // InternalBehavior.g:2632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFArrayTypeAccess().getFArrayTypeAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:2638:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==73) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalBehavior.g:2639:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:2639:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:2640:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFArrayTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_71);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFArrayTypeRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:2657:3: ( (lv_public_2_0= 'public' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==58) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBehavior.g:2658:4: (lv_public_2_0= 'public' )
                    {
                    // InternalBehavior.g:2658:4: (lv_public_2_0= 'public' )
                    // InternalBehavior.g:2659:5: lv_public_2_0= 'public'
                    {
                    lv_public_2_0=(Token)match(input,58,FOLLOW_72); 

                    					newLeafNode(lv_public_2_0, grammarAccess.getFArrayTypeAccess().getPublicPublicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFArrayTypeRule());
                    					}
                    					setWithLastConsumed(current, "public", true, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFArrayTypeAccess().getArrayKeyword_3());
            		
            // InternalBehavior.g:2675:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:2676:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:2676:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:2677:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_73); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFArrayTypeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFArrayTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,60,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getFArrayTypeAccess().getOfKeyword_5());
            		
            // InternalBehavior.g:2697:3: ( (lv_elementType_6_0= ruleFTypeRef ) )
            // InternalBehavior.g:2698:4: (lv_elementType_6_0= ruleFTypeRef )
            {
            // InternalBehavior.g:2698:4: (lv_elementType_6_0= ruleFTypeRef )
            // InternalBehavior.g:2699:5: lv_elementType_6_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFArrayTypeAccess().getElementTypeFTypeRefParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_elementType_6_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFArrayTypeRule());
            					}
            					set(
            						current,
            						"elementType",
            						lv_elementType_6_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
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
    // $ANTLR end "ruleFArrayType"


    // $ANTLR start "entryRuleFTypeDef"
    // InternalBehavior.g:2720:1: entryRuleFTypeDef returns [EObject current=null] : iv_ruleFTypeDef= ruleFTypeDef EOF ;
    public final EObject entryRuleFTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFTypeDef = null;


        try {
            // InternalBehavior.g:2720:49: (iv_ruleFTypeDef= ruleFTypeDef EOF )
            // InternalBehavior.g:2721:2: iv_ruleFTypeDef= ruleFTypeDef EOF
            {
             newCompositeNode(grammarAccess.getFTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFTypeDef=ruleFTypeDef();

            state._fsp--;

             current =iv_ruleFTypeDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFTypeDef"


    // $ANTLR start "ruleFTypeDef"
    // InternalBehavior.g:2727:1: ruleFTypeDef returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'typedef' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_actualType_6_0= ruleFTypeRef ) ) ) ;
    public final EObject ruleFTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_public_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_comment_1_0 = null;

        EObject lv_actualType_6_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2733:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'typedef' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_actualType_6_0= ruleFTypeRef ) ) ) )
            // InternalBehavior.g:2734:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'typedef' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_actualType_6_0= ruleFTypeRef ) ) )
            {
            // InternalBehavior.g:2734:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'typedef' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_actualType_6_0= ruleFTypeRef ) ) )
            // InternalBehavior.g:2735:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'typedef' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'is' ( (lv_actualType_6_0= ruleFTypeRef ) )
            {
            // InternalBehavior.g:2735:3: ()
            // InternalBehavior.g:2736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFTypeDefAccess().getFTypeDefAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:2742:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==73) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalBehavior.g:2743:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:2743:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:2744:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFTypeDefAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_74);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFTypeDefRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:2761:3: ( (lv_public_2_0= 'public' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==58) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalBehavior.g:2762:4: (lv_public_2_0= 'public' )
                    {
                    // InternalBehavior.g:2762:4: (lv_public_2_0= 'public' )
                    // InternalBehavior.g:2763:5: lv_public_2_0= 'public'
                    {
                    lv_public_2_0=(Token)match(input,58,FOLLOW_75); 

                    					newLeafNode(lv_public_2_0, grammarAccess.getFTypeDefAccess().getPublicPublicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFTypeDefRule());
                    					}
                    					setWithLastConsumed(current, "public", true, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFTypeDefAccess().getTypedefKeyword_3());
            		
            // InternalBehavior.g:2779:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:2780:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:2780:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:2781:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_76); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFTypeDefAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,62,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getFTypeDefAccess().getIsKeyword_5());
            		
            // InternalBehavior.g:2801:3: ( (lv_actualType_6_0= ruleFTypeRef ) )
            // InternalBehavior.g:2802:4: (lv_actualType_6_0= ruleFTypeRef )
            {
            // InternalBehavior.g:2802:4: (lv_actualType_6_0= ruleFTypeRef )
            // InternalBehavior.g:2803:5: lv_actualType_6_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFTypeDefAccess().getActualTypeFTypeRefParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_actualType_6_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFTypeDefRule());
            					}
            					set(
            						current,
            						"actualType",
            						lv_actualType_6_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
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
    // $ANTLR end "ruleFTypeDef"


    // $ANTLR start "entryRuleFStructType"
    // InternalBehavior.g:2824:1: entryRuleFStructType returns [EObject current=null] : iv_ruleFStructType= ruleFStructType EOF ;
    public final EObject entryRuleFStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFStructType = null;


        try {
            // InternalBehavior.g:2824:52: (iv_ruleFStructType= ruleFStructType EOF )
            // InternalBehavior.g:2825:2: iv_ruleFStructType= ruleFStructType EOF
            {
             newCompositeNode(grammarAccess.getFStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFStructType=ruleFStructType();

            state._fsp--;

             current =iv_ruleFStructType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFStructType"


    // $ANTLR start "ruleFStructType"
    // InternalBehavior.g:2831:1: ruleFStructType returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'struct' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleFField ) )* otherlv_10= '}' ) ;
    public final EObject ruleFStructType() throws RecognitionException {
        EObject current = null;

        Token lv_public_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_polymorphic_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_comment_1_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2837:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'struct' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleFField ) )* otherlv_10= '}' ) )
            // InternalBehavior.g:2838:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'struct' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleFField ) )* otherlv_10= '}' )
            {
            // InternalBehavior.g:2838:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'struct' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleFField ) )* otherlv_10= '}' )
            // InternalBehavior.g:2839:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'struct' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )? otherlv_8= '{' ( (lv_elements_9_0= ruleFField ) )* otherlv_10= '}'
            {
            // InternalBehavior.g:2839:3: ()
            // InternalBehavior.g:2840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFStructTypeAccess().getFStructTypeAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:2846:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==73) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalBehavior.g:2847:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:2847:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:2848:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFStructTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_77);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFStructTypeRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:2865:3: ( (lv_public_2_0= 'public' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==58) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBehavior.g:2866:4: (lv_public_2_0= 'public' )
                    {
                    // InternalBehavior.g:2866:4: (lv_public_2_0= 'public' )
                    // InternalBehavior.g:2867:5: lv_public_2_0= 'public'
                    {
                    lv_public_2_0=(Token)match(input,58,FOLLOW_78); 

                    					newLeafNode(lv_public_2_0, grammarAccess.getFStructTypeAccess().getPublicPublicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFStructTypeRule());
                    					}
                    					setWithLastConsumed(current, "public", true, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFStructTypeAccess().getStructKeyword_3());
            		
            // InternalBehavior.g:2883:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:2884:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:2884:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:2885:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_79); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFStructTypeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFStructTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:2901:3: ( (otherlv_5= 'extends' ( ( ruleFQN ) ) ) | ( (lv_polymorphic_7_0= 'polymorphic' ) ) )?
            int alt70=3;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==64) ) {
                alt70=1;
            }
            else if ( (LA70_0==65) ) {
                alt70=2;
            }
            switch (alt70) {
                case 1 :
                    // InternalBehavior.g:2902:4: (otherlv_5= 'extends' ( ( ruleFQN ) ) )
                    {
                    // InternalBehavior.g:2902:4: (otherlv_5= 'extends' ( ( ruleFQN ) ) )
                    // InternalBehavior.g:2903:5: otherlv_5= 'extends' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getFStructTypeAccess().getExtendsKeyword_5_0_0());
                    				
                    // InternalBehavior.g:2907:5: ( ( ruleFQN ) )
                    // InternalBehavior.g:2908:6: ( ruleFQN )
                    {
                    // InternalBehavior.g:2908:6: ( ruleFQN )
                    // InternalBehavior.g:2909:7: ruleFQN
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFStructTypeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getFStructTypeAccess().getBaseFStructTypeCrossReference_5_0_1_0());
                    						
                    pushFollow(FOLLOW_9);
                    ruleFQN();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:2925:4: ( (lv_polymorphic_7_0= 'polymorphic' ) )
                    {
                    // InternalBehavior.g:2925:4: ( (lv_polymorphic_7_0= 'polymorphic' ) )
                    // InternalBehavior.g:2926:5: (lv_polymorphic_7_0= 'polymorphic' )
                    {
                    // InternalBehavior.g:2926:5: (lv_polymorphic_7_0= 'polymorphic' )
                    // InternalBehavior.g:2927:6: lv_polymorphic_7_0= 'polymorphic'
                    {
                    lv_polymorphic_7_0=(Token)match(input,65,FOLLOW_9); 

                    						newLeafNode(lv_polymorphic_7_0, grammarAccess.getFStructTypeAccess().getPolymorphicPolymorphicKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFStructTypeRule());
                    						}
                    						setWithLastConsumed(current, "polymorphic", true, "polymorphic");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_80); 

            			newLeafNode(otherlv_8, grammarAccess.getFStructTypeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBehavior.g:2944:3: ( (lv_elements_9_0= ruleFField ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_ID||LA71_0==54||LA71_0==73||(LA71_0>=83 && LA71_0<=96)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalBehavior.g:2945:4: (lv_elements_9_0= ruleFField )
            	    {
            	    // InternalBehavior.g:2945:4: (lv_elements_9_0= ruleFField )
            	    // InternalBehavior.g:2946:5: lv_elements_9_0= ruleFField
            	    {

            	    					newCompositeNode(grammarAccess.getFStructTypeAccess().getElementsFFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_80);
            	    lv_elements_9_0=ruleFField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFStructTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_9_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.FField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFStructTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFStructType"


    // $ANTLR start "entryRuleFUnionType"
    // InternalBehavior.g:2971:1: entryRuleFUnionType returns [EObject current=null] : iv_ruleFUnionType= ruleFUnionType EOF ;
    public final EObject entryRuleFUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFUnionType = null;


        try {
            // InternalBehavior.g:2971:51: (iv_ruleFUnionType= ruleFUnionType EOF )
            // InternalBehavior.g:2972:2: iv_ruleFUnionType= ruleFUnionType EOF
            {
             newCompositeNode(grammarAccess.getFUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFUnionType=ruleFUnionType();

            state._fsp--;

             current =iv_ruleFUnionType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFUnionType"


    // $ANTLR start "ruleFUnionType"
    // InternalBehavior.g:2978:1: ruleFUnionType returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'union' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleFField ) )* otherlv_9= '}' ) ;
    public final EObject ruleFUnionType() throws RecognitionException {
        EObject current = null;

        Token lv_public_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_comment_1_0 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:2984:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'union' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleFField ) )* otherlv_9= '}' ) )
            // InternalBehavior.g:2985:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'union' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleFField ) )* otherlv_9= '}' )
            {
            // InternalBehavior.g:2985:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'union' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleFField ) )* otherlv_9= '}' )
            // InternalBehavior.g:2986:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'union' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleFQN ) ) )? otherlv_7= '{' ( (lv_elements_8_0= ruleFField ) )* otherlv_9= '}'
            {
            // InternalBehavior.g:2986:3: ()
            // InternalBehavior.g:2987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFUnionTypeAccess().getFUnionTypeAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:2993:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==73) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBehavior.g:2994:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:2994:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:2995:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFUnionTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_81);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFUnionTypeRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:3012:3: ( (lv_public_2_0= 'public' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==58) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalBehavior.g:3013:4: (lv_public_2_0= 'public' )
                    {
                    // InternalBehavior.g:3013:4: (lv_public_2_0= 'public' )
                    // InternalBehavior.g:3014:5: lv_public_2_0= 'public'
                    {
                    lv_public_2_0=(Token)match(input,58,FOLLOW_82); 

                    					newLeafNode(lv_public_2_0, grammarAccess.getFUnionTypeAccess().getPublicPublicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFUnionTypeRule());
                    					}
                    					setWithLastConsumed(current, "public", true, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFUnionTypeAccess().getUnionKeyword_3());
            		
            // InternalBehavior.g:3030:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:3031:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:3031:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:3032:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_83); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFUnionTypeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFUnionTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:3048:3: (otherlv_5= 'extends' ( ( ruleFQN ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==64) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalBehavior.g:3049:4: otherlv_5= 'extends' ( ( ruleFQN ) )
                    {
                    otherlv_5=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFUnionTypeAccess().getExtendsKeyword_5_0());
                    			
                    // InternalBehavior.g:3053:4: ( ( ruleFQN ) )
                    // InternalBehavior.g:3054:5: ( ruleFQN )
                    {
                    // InternalBehavior.g:3054:5: ( ruleFQN )
                    // InternalBehavior.g:3055:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFUnionTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFUnionTypeAccess().getBaseFUnionTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_80); 

            			newLeafNode(otherlv_7, grammarAccess.getFUnionTypeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalBehavior.g:3074:3: ( (lv_elements_8_0= ruleFField ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ID||LA75_0==54||LA75_0==73||(LA75_0>=83 && LA75_0<=96)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalBehavior.g:3075:4: (lv_elements_8_0= ruleFField )
            	    {
            	    // InternalBehavior.g:3075:4: (lv_elements_8_0= ruleFField )
            	    // InternalBehavior.g:3076:5: lv_elements_8_0= ruleFField
            	    {

            	    					newCompositeNode(grammarAccess.getFUnionTypeAccess().getElementsFFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_80);
            	    lv_elements_8_0=ruleFField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFUnionTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_8_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.FField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFUnionTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFUnionType"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalBehavior.g:3101:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // InternalBehavior.g:3101:60: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // InternalBehavior.g:3102:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;

             current =iv_ruleLogicalOrExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalBehavior.g:3108:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalAndExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3114:2: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* ) )
            // InternalBehavior.g:3115:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // InternalBehavior.g:3115:2: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )* )
            // InternalBehavior.g:3116:3: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_84);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;


            			current = this_LogicalAndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3124:3: ( () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==97) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalBehavior.g:3125:4: () ( (lv_op_2_0= ruleOperatorOr ) ) ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // InternalBehavior.g:3125:4: ()
            	    // InternalBehavior.g:3126:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalOrExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3132:4: ( (lv_op_2_0= ruleOperatorOr ) )
            	    // InternalBehavior.g:3133:5: (lv_op_2_0= ruleOperatorOr )
            	    {
            	    // InternalBehavior.g:3133:5: (lv_op_2_0= ruleOperatorOr )
            	    // InternalBehavior.g:3134:6: lv_op_2_0= ruleOperatorOr
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getOpOperatorOrEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorOr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorOr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3151:4: ( (lv_right_3_0= ruleLogicalAndExpression ) )
            	    // InternalBehavior.g:3152:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    {
            	    // InternalBehavior.g:3152:5: (lv_right_3_0= ruleLogicalAndExpression )
            	    // InternalBehavior.g:3153:6: lv_right_3_0= ruleLogicalAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightLogicalAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_84);
            	    lv_right_3_0=ruleLogicalAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.LogicalAndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalBehavior.g:3175:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // InternalBehavior.g:3175:61: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // InternalBehavior.g:3176:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;

             current =iv_ruleLogicalAndExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalBehavior.g:3182:1: ruleLogicalAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EqualityExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3188:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* ) )
            // InternalBehavior.g:3189:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            {
            // InternalBehavior.g:3189:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )* )
            // InternalBehavior.g:3190:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_85);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3198:3: ( () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==98) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalBehavior.g:3199:4: () ( (lv_op_2_0= ruleOperatorAnd ) ) ( (lv_right_3_0= ruleEqualityExpression ) )
            	    {
            	    // InternalBehavior.g:3199:4: ()
            	    // InternalBehavior.g:3200:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getLogicalAndExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3206:4: ( (lv_op_2_0= ruleOperatorAnd ) )
            	    // InternalBehavior.g:3207:5: (lv_op_2_0= ruleOperatorAnd )
            	    {
            	    // InternalBehavior.g:3207:5: (lv_op_2_0= ruleOperatorAnd )
            	    // InternalBehavior.g:3208:6: lv_op_2_0= ruleOperatorAnd
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getOpOperatorAndEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3225:4: ( (lv_right_3_0= ruleEqualityExpression ) )
            	    // InternalBehavior.g:3226:5: (lv_right_3_0= ruleEqualityExpression )
            	    {
            	    // InternalBehavior.g:3226:5: (lv_right_3_0= ruleEqualityExpression )
            	    // InternalBehavior.g:3227:6: lv_right_3_0= ruleEqualityExpression
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_85);
            	    lv_right_3_0=ruleEqualityExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.EqualityExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalBehavior.g:3249:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalBehavior.g:3249:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalBehavior.g:3250:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalBehavior.g:3256:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3262:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalBehavior.g:3263:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalBehavior.g:3263:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )* )
            // InternalBehavior.g:3264:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_86);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3272:3: ( () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=99 && LA78_0<=100)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalBehavior.g:3273:4: () ( (lv_op_2_0= ruleOperatorEquality ) ) ( (lv_right_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalBehavior.g:3273:4: ()
            	    // InternalBehavior.g:3274:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3280:4: ( (lv_op_2_0= ruleOperatorEquality ) )
            	    // InternalBehavior.g:3281:5: (lv_op_2_0= ruleOperatorEquality )
            	    {
            	    // InternalBehavior.g:3281:5: (lv_op_2_0= ruleOperatorEquality )
            	    // InternalBehavior.g:3282:6: lv_op_2_0= ruleOperatorEquality
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOpOperatorEqualityEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorEquality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3299:4: ( (lv_right_3_0= ruleRelationalExpression ) )
            	    // InternalBehavior.g:3300:5: (lv_right_3_0= ruleRelationalExpression )
            	    {
            	    // InternalBehavior.g:3300:5: (lv_right_3_0= ruleRelationalExpression )
            	    // InternalBehavior.g:3301:6: lv_right_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_86);
            	    lv_right_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalBehavior.g:3323:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalBehavior.g:3323:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalBehavior.g:3324:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalBehavior.g:3330:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3336:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalBehavior.g:3337:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalBehavior.g:3337:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )* )
            // InternalBehavior.g:3338:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_87);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3346:3: ( () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=101 && LA79_0<=104)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalBehavior.g:3347:4: () ( (lv_op_2_0= ruleOperatorRelational ) ) ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalBehavior.g:3347:4: ()
            	    // InternalBehavior.g:3348:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3354:4: ( (lv_op_2_0= ruleOperatorRelational ) )
            	    // InternalBehavior.g:3355:5: (lv_op_2_0= ruleOperatorRelational )
            	    {
            	    // InternalBehavior.g:3355:5: (lv_op_2_0= ruleOperatorRelational )
            	    // InternalBehavior.g:3356:6: lv_op_2_0= ruleOperatorRelational
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpOperatorRelationalEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorRelational();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorRelational");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3373:4: ( (lv_right_3_0= ruleAdditiveExpression ) )
            	    // InternalBehavior.g:3374:5: (lv_right_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalBehavior.g:3374:5: (lv_right_3_0= ruleAdditiveExpression )
            	    // InternalBehavior.g:3375:6: lv_right_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_87);
            	    lv_right_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalBehavior.g:3397:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalBehavior.g:3397:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalBehavior.g:3398:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalBehavior.g:3404:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3410:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalBehavior.g:3411:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalBehavior.g:3411:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalBehavior.g:3412:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_88);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3420:3: ( () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==57||LA80_0==105) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalBehavior.g:3421:4: () ( (lv_op_2_0= ruleOperatorAdditive ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalBehavior.g:3421:4: ()
            	    // InternalBehavior.g:3422:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3428:4: ( (lv_op_2_0= ruleOperatorAdditive ) )
            	    // InternalBehavior.g:3429:5: (lv_op_2_0= ruleOperatorAdditive )
            	    {
            	    // InternalBehavior.g:3429:5: (lv_op_2_0= ruleOperatorAdditive )
            	    // InternalBehavior.g:3430:6: lv_op_2_0= ruleOperatorAdditive
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOpOperatorAdditiveEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorAdditive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorAdditive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3447:4: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // InternalBehavior.g:3448:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalBehavior.g:3448:5: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // InternalBehavior.g:3449:6: lv_right_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_88);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalBehavior.g:3471:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalBehavior.g:3471:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalBehavior.g:3472:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalBehavior.g:3478:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3484:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // InternalBehavior.g:3485:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // InternalBehavior.g:3485:2: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // InternalBehavior.g:3486:3: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_89);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:3494:3: ( () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==80||LA81_0==106) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalBehavior.g:3495:4: () ( (lv_op_2_0= ruleOperatorMultiplicative ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalBehavior.g:3495:4: ()
            	    // InternalBehavior.g:3496:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getFBinaryOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalBehavior.g:3502:4: ( (lv_op_2_0= ruleOperatorMultiplicative ) )
            	    // InternalBehavior.g:3503:5: (lv_op_2_0= ruleOperatorMultiplicative )
            	    {
            	    // InternalBehavior.g:3503:5: (lv_op_2_0= ruleOperatorMultiplicative )
            	    // InternalBehavior.g:3504:6: lv_op_2_0= ruleOperatorMultiplicative
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOpOperatorMultiplicativeEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_op_2_0=ruleOperatorMultiplicative();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.OperatorMultiplicative");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalBehavior.g:3521:4: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalBehavior.g:3522:5: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalBehavior.g:3522:5: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalBehavior.g:3523:6: lv_right_3_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_89);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"de.tu_bs.ccc.contracting.Behavior.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalBehavior.g:3545:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalBehavior.g:3545:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalBehavior.g:3546:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalBehavior.g:3552:1: rulePrimaryExpression returns [EObject current=null] : (this_FUnaryOperation_0= ruleFUnaryOperation | this_SimplePrimaryExpression_1= ruleSimplePrimaryExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FUnaryOperation_0 = null;

        EObject this_SimplePrimaryExpression_1 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3558:2: ( (this_FUnaryOperation_0= ruleFUnaryOperation | this_SimplePrimaryExpression_1= ruleSimplePrimaryExpression ) )
            // InternalBehavior.g:3559:2: (this_FUnaryOperation_0= ruleFUnaryOperation | this_SimplePrimaryExpression_1= ruleSimplePrimaryExpression )
            {
            // InternalBehavior.g:3559:2: (this_FUnaryOperation_0= ruleFUnaryOperation | this_SimplePrimaryExpression_1= ruleSimplePrimaryExpression )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==57||LA82_0==107) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=RULE_ID && LA82_0<=RULE_STRING)||(LA82_0>=RULE_E_DOUBLE_OBJECT && LA82_0<=RULE_E_FLOAT_OBJECT)||LA82_0==25||(LA82_0>=81 && LA82_0<=82)) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalBehavior.g:3560:3: this_FUnaryOperation_0= ruleFUnaryOperation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFUnaryOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FUnaryOperation_0=ruleFUnaryOperation();

                    state._fsp--;


                    			current = this_FUnaryOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3569:3: this_SimplePrimaryExpression_1= ruleSimplePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSimplePrimaryExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimplePrimaryExpression_1=ruleSimplePrimaryExpression();

                    state._fsp--;


                    			current = this_SimplePrimaryExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleSimplePrimaryExpression"
    // InternalBehavior.g:3581:1: entryRuleSimplePrimaryExpression returns [EObject current=null] : iv_ruleSimplePrimaryExpression= ruleSimplePrimaryExpression EOF ;
    public final EObject entryRuleSimplePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePrimaryExpression = null;


        try {
            // InternalBehavior.g:3581:64: (iv_ruleSimplePrimaryExpression= ruleSimplePrimaryExpression EOF )
            // InternalBehavior.g:3582:2: iv_ruleSimplePrimaryExpression= ruleSimplePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getSimplePrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimplePrimaryExpression=ruleSimplePrimaryExpression();

            state._fsp--;

             current =iv_ruleSimplePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimplePrimaryExpression"


    // $ANTLR start "ruleSimplePrimaryExpression"
    // InternalBehavior.g:3588:1: ruleSimplePrimaryExpression returns [EObject current=null] : (this_FQualifiedElementRef_0= ruleFQualifiedElementRef | this_FConstant_1= ruleFConstant | (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' ) ) ;
    public final EObject ruleSimplePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_FQualifiedElementRef_0 = null;

        EObject this_FConstant_1 = null;

        EObject this_LogicalOrExpression_3 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3594:2: ( (this_FQualifiedElementRef_0= ruleFQualifiedElementRef | this_FConstant_1= ruleFConstant | (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' ) ) )
            // InternalBehavior.g:3595:2: (this_FQualifiedElementRef_0= ruleFQualifiedElementRef | this_FConstant_1= ruleFConstant | (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' ) )
            {
            // InternalBehavior.g:3595:2: (this_FQualifiedElementRef_0= ruleFQualifiedElementRef | this_FConstant_1= ruleFConstant | (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt83=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_E_DOUBLE_OBJECT:
            case RULE_E_FLOAT_OBJECT:
            case 81:
            case 82:
                {
                alt83=2;
                }
                break;
            case 25:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalBehavior.g:3596:3: this_FQualifiedElementRef_0= ruleFQualifiedElementRef
                    {

                    			newCompositeNode(grammarAccess.getSimplePrimaryExpressionAccess().getFQualifiedElementRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FQualifiedElementRef_0=ruleFQualifiedElementRef();

                    state._fsp--;


                    			current = this_FQualifiedElementRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3605:3: this_FConstant_1= ruleFConstant
                    {

                    			newCompositeNode(grammarAccess.getSimplePrimaryExpressionAccess().getFConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FConstant_1=ruleFConstant();

                    state._fsp--;


                    			current = this_FConstant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehavior.g:3614:3: (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' )
                    {
                    // InternalBehavior.g:3614:3: (otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')' )
                    // InternalBehavior.g:3615:4: otherlv_2= '(' this_LogicalOrExpression_3= ruleLogicalOrExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimplePrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getSimplePrimaryExpressionAccess().getLogicalOrExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_70);
                    this_LogicalOrExpression_3=ruleLogicalOrExpression();

                    state._fsp--;


                    				current = this_LogicalOrExpression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimplePrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleSimplePrimaryExpression"


    // $ANTLR start "entryRuleFUnaryOperation"
    // InternalBehavior.g:3636:1: entryRuleFUnaryOperation returns [EObject current=null] : iv_ruleFUnaryOperation= ruleFUnaryOperation EOF ;
    public final EObject entryRuleFUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFUnaryOperation = null;


        try {
            // InternalBehavior.g:3636:56: (iv_ruleFUnaryOperation= ruleFUnaryOperation EOF )
            // InternalBehavior.g:3637:2: iv_ruleFUnaryOperation= ruleFUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getFUnaryOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFUnaryOperation=ruleFUnaryOperation();

            state._fsp--;

             current =iv_ruleFUnaryOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFUnaryOperation"


    // $ANTLR start "ruleFUnaryOperation"
    // InternalBehavior.g:3643:1: ruleFUnaryOperation returns [EObject current=null] : ( () ( (lv_op_1_0= ruleOperatorUnary ) ) ( (lv_operand_2_0= ruleSimplePrimaryExpression ) ) ) ;
    public final EObject ruleFUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_operand_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3649:2: ( ( () ( (lv_op_1_0= ruleOperatorUnary ) ) ( (lv_operand_2_0= ruleSimplePrimaryExpression ) ) ) )
            // InternalBehavior.g:3650:2: ( () ( (lv_op_1_0= ruleOperatorUnary ) ) ( (lv_operand_2_0= ruleSimplePrimaryExpression ) ) )
            {
            // InternalBehavior.g:3650:2: ( () ( (lv_op_1_0= ruleOperatorUnary ) ) ( (lv_operand_2_0= ruleSimplePrimaryExpression ) ) )
            // InternalBehavior.g:3651:3: () ( (lv_op_1_0= ruleOperatorUnary ) ) ( (lv_operand_2_0= ruleSimplePrimaryExpression ) )
            {
            // InternalBehavior.g:3651:3: ()
            // InternalBehavior.g:3652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFUnaryOperationAccess().getFUnaryOperationAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:3658:3: ( (lv_op_1_0= ruleOperatorUnary ) )
            // InternalBehavior.g:3659:4: (lv_op_1_0= ruleOperatorUnary )
            {
            // InternalBehavior.g:3659:4: (lv_op_1_0= ruleOperatorUnary )
            // InternalBehavior.g:3660:5: lv_op_1_0= ruleOperatorUnary
            {

            					newCompositeNode(grammarAccess.getFUnaryOperationAccess().getOpOperatorUnaryEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_op_1_0=ruleOperatorUnary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFUnaryOperationRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.OperatorUnary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:3677:3: ( (lv_operand_2_0= ruleSimplePrimaryExpression ) )
            // InternalBehavior.g:3678:4: (lv_operand_2_0= ruleSimplePrimaryExpression )
            {
            // InternalBehavior.g:3678:4: (lv_operand_2_0= ruleSimplePrimaryExpression )
            // InternalBehavior.g:3679:5: lv_operand_2_0= ruleSimplePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getFUnaryOperationAccess().getOperandSimplePrimaryExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_operand_2_0=ruleSimplePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFUnaryOperationRule());
            					}
            					set(
            						current,
            						"operand",
            						lv_operand_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.SimplePrimaryExpression");
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
    // $ANTLR end "ruleFUnaryOperation"


    // $ANTLR start "entryRuleFQualifiedElementRef"
    // InternalBehavior.g:3700:1: entryRuleFQualifiedElementRef returns [EObject current=null] : iv_ruleFQualifiedElementRef= ruleFQualifiedElementRef EOF ;
    public final EObject entryRuleFQualifiedElementRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFQualifiedElementRef = null;


        try {
            // InternalBehavior.g:3700:61: (iv_ruleFQualifiedElementRef= ruleFQualifiedElementRef EOF )
            // InternalBehavior.g:3701:2: iv_ruleFQualifiedElementRef= ruleFQualifiedElementRef EOF
            {
             newCompositeNode(grammarAccess.getFQualifiedElementRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQualifiedElementRef=ruleFQualifiedElementRef();

            state._fsp--;

             current =iv_ruleFQualifiedElementRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFQualifiedElementRef"


    // $ANTLR start "ruleFQualifiedElementRef"
    // InternalBehavior.g:3707:1: ruleFQualifiedElementRef returns [EObject current=null] : ( () ( (lv_element_1_0= ruleFQN ) ) ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )* ) ;
    public final EObject ruleFQualifiedElementRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3713:2: ( ( () ( (lv_element_1_0= ruleFQN ) ) ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalBehavior.g:3714:2: ( () ( (lv_element_1_0= ruleFQN ) ) ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalBehavior.g:3714:2: ( () ( (lv_element_1_0= ruleFQN ) ) ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalBehavior.g:3715:3: () ( (lv_element_1_0= ruleFQN ) ) ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalBehavior.g:3715:3: ()
            // InternalBehavior.g:3716:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFQualifiedElementRefAccess().getFQualifiedElementRefAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:3722:3: ( (lv_element_1_0= ruleFQN ) )
            // InternalBehavior.g:3723:4: (lv_element_1_0= ruleFQN )
            {
            // InternalBehavior.g:3723:4: (lv_element_1_0= ruleFQN )
            // InternalBehavior.g:3724:5: lv_element_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getFQualifiedElementRefAccess().getElementFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_90);
            lv_element_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFQualifiedElementRefRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:3741:3: ( () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==67) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalBehavior.g:3742:4: () otherlv_3= '-->' ( (otherlv_4= RULE_ID ) )
            	    {
            	    // InternalBehavior.g:3742:4: ()
            	    // InternalBehavior.g:3743:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFQualifiedElementRefAccess().getFQualifiedElementRefQualifierAction_2_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_3=(Token)match(input,67,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getFQualifiedElementRefAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_2_1());
            	    			
            	    // InternalBehavior.g:3753:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalBehavior.g:3754:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalBehavior.g:3754:5: (otherlv_4= RULE_ID )
            	    // InternalBehavior.g:3755:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFQualifiedElementRefRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_90); 

            	    						newLeafNode(otherlv_4, grammarAccess.getFQualifiedElementRefAccess().getFieldFFieldCrossReference_2_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleFQualifiedElementRef"


    // $ANTLR start "entryRuleFConstant"
    // InternalBehavior.g:3771:1: entryRuleFConstant returns [EObject current=null] : iv_ruleFConstant= ruleFConstant EOF ;
    public final EObject entryRuleFConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFConstant = null;


        try {
            // InternalBehavior.g:3771:50: (iv_ruleFConstant= ruleFConstant EOF )
            // InternalBehavior.g:3772:2: iv_ruleFConstant= ruleFConstant EOF
            {
             newCompositeNode(grammarAccess.getFConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFConstant=ruleFConstant();

            state._fsp--;

             current =iv_ruleFConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFConstant"


    // $ANTLR start "ruleFConstant"
    // InternalBehavior.g:3778:1: ruleFConstant returns [EObject current=null] : (this_FFloatConstant_0= ruleFFloatConstant | this_FDoubleConstant_1= ruleFDoubleConstant | this_FIntegerConstant_2= ruleFIntegerConstant | this_FBooleanConstant_3= ruleFBooleanConstant | this_FStringConstant_4= ruleFStringConstant ) ;
    public final EObject ruleFConstant() throws RecognitionException {
        EObject current = null;

        EObject this_FFloatConstant_0 = null;

        EObject this_FDoubleConstant_1 = null;

        EObject this_FIntegerConstant_2 = null;

        EObject this_FBooleanConstant_3 = null;

        EObject this_FStringConstant_4 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3784:2: ( (this_FFloatConstant_0= ruleFFloatConstant | this_FDoubleConstant_1= ruleFDoubleConstant | this_FIntegerConstant_2= ruleFIntegerConstant | this_FBooleanConstant_3= ruleFBooleanConstant | this_FStringConstant_4= ruleFStringConstant ) )
            // InternalBehavior.g:3785:2: (this_FFloatConstant_0= ruleFFloatConstant | this_FDoubleConstant_1= ruleFDoubleConstant | this_FIntegerConstant_2= ruleFIntegerConstant | this_FBooleanConstant_3= ruleFBooleanConstant | this_FStringConstant_4= ruleFStringConstant )
            {
            // InternalBehavior.g:3785:2: (this_FFloatConstant_0= ruleFFloatConstant | this_FDoubleConstant_1= ruleFDoubleConstant | this_FIntegerConstant_2= ruleFIntegerConstant | this_FBooleanConstant_3= ruleFBooleanConstant | this_FStringConstant_4= ruleFStringConstant )
            int alt85=5;
            switch ( input.LA(1) ) {
            case RULE_E_FLOAT_OBJECT:
                {
                alt85=1;
                }
                break;
            case RULE_E_DOUBLE_OBJECT:
                {
                alt85=2;
                }
                break;
            case RULE_INT:
                {
                alt85=3;
                }
                break;
            case 81:
            case 82:
                {
                alt85=4;
                }
                break;
            case RULE_STRING:
                {
                alt85=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalBehavior.g:3786:3: this_FFloatConstant_0= ruleFFloatConstant
                    {

                    			newCompositeNode(grammarAccess.getFConstantAccess().getFFloatConstantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FFloatConstant_0=ruleFFloatConstant();

                    state._fsp--;


                    			current = this_FFloatConstant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:3795:3: this_FDoubleConstant_1= ruleFDoubleConstant
                    {

                    			newCompositeNode(grammarAccess.getFConstantAccess().getFDoubleConstantParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FDoubleConstant_1=ruleFDoubleConstant();

                    state._fsp--;


                    			current = this_FDoubleConstant_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBehavior.g:3804:3: this_FIntegerConstant_2= ruleFIntegerConstant
                    {

                    			newCompositeNode(grammarAccess.getFConstantAccess().getFIntegerConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FIntegerConstant_2=ruleFIntegerConstant();

                    state._fsp--;


                    			current = this_FIntegerConstant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBehavior.g:3813:3: this_FBooleanConstant_3= ruleFBooleanConstant
                    {

                    			newCompositeNode(grammarAccess.getFConstantAccess().getFBooleanConstantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FBooleanConstant_3=ruleFBooleanConstant();

                    state._fsp--;


                    			current = this_FBooleanConstant_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBehavior.g:3822:3: this_FStringConstant_4= ruleFStringConstant
                    {

                    			newCompositeNode(grammarAccess.getFConstantAccess().getFStringConstantParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FStringConstant_4=ruleFStringConstant();

                    state._fsp--;


                    			current = this_FStringConstant_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleFConstant"


    // $ANTLR start "entryRuleFDoubleConstant"
    // InternalBehavior.g:3834:1: entryRuleFDoubleConstant returns [EObject current=null] : iv_ruleFDoubleConstant= ruleFDoubleConstant EOF ;
    public final EObject entryRuleFDoubleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFDoubleConstant = null;


        try {
            // InternalBehavior.g:3834:56: (iv_ruleFDoubleConstant= ruleFDoubleConstant EOF )
            // InternalBehavior.g:3835:2: iv_ruleFDoubleConstant= ruleFDoubleConstant EOF
            {
             newCompositeNode(grammarAccess.getFDoubleConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFDoubleConstant=ruleFDoubleConstant();

            state._fsp--;

             current =iv_ruleFDoubleConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFDoubleConstant"


    // $ANTLR start "ruleFDoubleConstant"
    // InternalBehavior.g:3841:1: ruleFDoubleConstant returns [EObject current=null] : ( (lv_val_0_0= RULE_E_DOUBLE_OBJECT ) ) ;
    public final EObject ruleFDoubleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:3847:2: ( ( (lv_val_0_0= RULE_E_DOUBLE_OBJECT ) ) )
            // InternalBehavior.g:3848:2: ( (lv_val_0_0= RULE_E_DOUBLE_OBJECT ) )
            {
            // InternalBehavior.g:3848:2: ( (lv_val_0_0= RULE_E_DOUBLE_OBJECT ) )
            // InternalBehavior.g:3849:3: (lv_val_0_0= RULE_E_DOUBLE_OBJECT )
            {
            // InternalBehavior.g:3849:3: (lv_val_0_0= RULE_E_DOUBLE_OBJECT )
            // InternalBehavior.g:3850:4: lv_val_0_0= RULE_E_DOUBLE_OBJECT
            {
            lv_val_0_0=(Token)match(input,RULE_E_DOUBLE_OBJECT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getFDoubleConstantAccess().getValE_DOUBLE_OBJECTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFDoubleConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.E_DOUBLE_OBJECT");
            			

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
    // $ANTLR end "ruleFDoubleConstant"


    // $ANTLR start "entryRuleFFloatConstant"
    // InternalBehavior.g:3869:1: entryRuleFFloatConstant returns [EObject current=null] : iv_ruleFFloatConstant= ruleFFloatConstant EOF ;
    public final EObject entryRuleFFloatConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFFloatConstant = null;


        try {
            // InternalBehavior.g:3869:55: (iv_ruleFFloatConstant= ruleFFloatConstant EOF )
            // InternalBehavior.g:3870:2: iv_ruleFFloatConstant= ruleFFloatConstant EOF
            {
             newCompositeNode(grammarAccess.getFFloatConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFFloatConstant=ruleFFloatConstant();

            state._fsp--;

             current =iv_ruleFFloatConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFFloatConstant"


    // $ANTLR start "ruleFFloatConstant"
    // InternalBehavior.g:3876:1: ruleFFloatConstant returns [EObject current=null] : ( (lv_val_0_0= RULE_E_FLOAT_OBJECT ) ) ;
    public final EObject ruleFFloatConstant() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:3882:2: ( ( (lv_val_0_0= RULE_E_FLOAT_OBJECT ) ) )
            // InternalBehavior.g:3883:2: ( (lv_val_0_0= RULE_E_FLOAT_OBJECT ) )
            {
            // InternalBehavior.g:3883:2: ( (lv_val_0_0= RULE_E_FLOAT_OBJECT ) )
            // InternalBehavior.g:3884:3: (lv_val_0_0= RULE_E_FLOAT_OBJECT )
            {
            // InternalBehavior.g:3884:3: (lv_val_0_0= RULE_E_FLOAT_OBJECT )
            // InternalBehavior.g:3885:4: lv_val_0_0= RULE_E_FLOAT_OBJECT
            {
            lv_val_0_0=(Token)match(input,RULE_E_FLOAT_OBJECT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getFFloatConstantAccess().getValE_FLOAT_OBJECTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFFloatConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.E_FLOAT_OBJECT");
            			

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
    // $ANTLR end "ruleFFloatConstant"


    // $ANTLR start "entryRuleFIntegerConstant"
    // InternalBehavior.g:3904:1: entryRuleFIntegerConstant returns [EObject current=null] : iv_ruleFIntegerConstant= ruleFIntegerConstant EOF ;
    public final EObject entryRuleFIntegerConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFIntegerConstant = null;


        try {
            // InternalBehavior.g:3904:57: (iv_ruleFIntegerConstant= ruleFIntegerConstant EOF )
            // InternalBehavior.g:3905:2: iv_ruleFIntegerConstant= ruleFIntegerConstant EOF
            {
             newCompositeNode(grammarAccess.getFIntegerConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFIntegerConstant=ruleFIntegerConstant();

            state._fsp--;

             current =iv_ruleFIntegerConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFIntegerConstant"


    // $ANTLR start "ruleFIntegerConstant"
    // InternalBehavior.g:3911:1: ruleFIntegerConstant returns [EObject current=null] : ( (lv_val_0_0= ruleE_BigInteger ) ) ;
    public final EObject ruleFIntegerConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3917:2: ( ( (lv_val_0_0= ruleE_BigInteger ) ) )
            // InternalBehavior.g:3918:2: ( (lv_val_0_0= ruleE_BigInteger ) )
            {
            // InternalBehavior.g:3918:2: ( (lv_val_0_0= ruleE_BigInteger ) )
            // InternalBehavior.g:3919:3: (lv_val_0_0= ruleE_BigInteger )
            {
            // InternalBehavior.g:3919:3: (lv_val_0_0= ruleE_BigInteger )
            // InternalBehavior.g:3920:4: lv_val_0_0= ruleE_BigInteger
            {

            				newCompositeNode(grammarAccess.getFIntegerConstantAccess().getValE_BigIntegerParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleE_BigInteger();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFIntegerConstantRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.E_BigInteger");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFIntegerConstant"


    // $ANTLR start "entryRuleFBooleanConstant"
    // InternalBehavior.g:3940:1: entryRuleFBooleanConstant returns [EObject current=null] : iv_ruleFBooleanConstant= ruleFBooleanConstant EOF ;
    public final EObject entryRuleFBooleanConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFBooleanConstant = null;


        try {
            // InternalBehavior.g:3940:57: (iv_ruleFBooleanConstant= ruleFBooleanConstant EOF )
            // InternalBehavior.g:3941:2: iv_ruleFBooleanConstant= ruleFBooleanConstant EOF
            {
             newCompositeNode(grammarAccess.getFBooleanConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFBooleanConstant=ruleFBooleanConstant();

            state._fsp--;

             current =iv_ruleFBooleanConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFBooleanConstant"


    // $ANTLR start "ruleFBooleanConstant"
    // InternalBehavior.g:3947:1: ruleFBooleanConstant returns [EObject current=null] : ( (lv_val_0_0= ruleEBoolean ) ) ;
    public final EObject ruleFBooleanConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:3953:2: ( ( (lv_val_0_0= ruleEBoolean ) ) )
            // InternalBehavior.g:3954:2: ( (lv_val_0_0= ruleEBoolean ) )
            {
            // InternalBehavior.g:3954:2: ( (lv_val_0_0= ruleEBoolean ) )
            // InternalBehavior.g:3955:3: (lv_val_0_0= ruleEBoolean )
            {
            // InternalBehavior.g:3955:3: (lv_val_0_0= ruleEBoolean )
            // InternalBehavior.g:3956:4: lv_val_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getFBooleanConstantAccess().getValEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFBooleanConstantRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.EBoolean");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFBooleanConstant"


    // $ANTLR start "entryRuleFStringConstant"
    // InternalBehavior.g:3976:1: entryRuleFStringConstant returns [EObject current=null] : iv_ruleFStringConstant= ruleFStringConstant EOF ;
    public final EObject entryRuleFStringConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFStringConstant = null;


        try {
            // InternalBehavior.g:3976:56: (iv_ruleFStringConstant= ruleFStringConstant EOF )
            // InternalBehavior.g:3977:2: iv_ruleFStringConstant= ruleFStringConstant EOF
            {
             newCompositeNode(grammarAccess.getFStringConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFStringConstant=ruleFStringConstant();

            state._fsp--;

             current =iv_ruleFStringConstant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFStringConstant"


    // $ANTLR start "ruleFStringConstant"
    // InternalBehavior.g:3983:1: ruleFStringConstant returns [EObject current=null] : ( (lv_val_0_0= RULE_STRING ) ) ;
    public final EObject ruleFStringConstant() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:3989:2: ( ( (lv_val_0_0= RULE_STRING ) ) )
            // InternalBehavior.g:3990:2: ( (lv_val_0_0= RULE_STRING ) )
            {
            // InternalBehavior.g:3990:2: ( (lv_val_0_0= RULE_STRING ) )
            // InternalBehavior.g:3991:3: (lv_val_0_0= RULE_STRING )
            {
            // InternalBehavior.g:3991:3: (lv_val_0_0= RULE_STRING )
            // InternalBehavior.g:3992:4: lv_val_0_0= RULE_STRING
            {
            lv_val_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getFStringConstantAccess().getValSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFStringConstantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleFStringConstant"


    // $ANTLR start "entryRuleFMapType"
    // InternalBehavior.g:4011:1: entryRuleFMapType returns [EObject current=null] : iv_ruleFMapType= ruleFMapType EOF ;
    public final EObject entryRuleFMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFMapType = null;


        try {
            // InternalBehavior.g:4011:49: (iv_ruleFMapType= ruleFMapType EOF )
            // InternalBehavior.g:4012:2: iv_ruleFMapType= ruleFMapType EOF
            {
             newCompositeNode(grammarAccess.getFMapTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFMapType=ruleFMapType();

            state._fsp--;

             current =iv_ruleFMapType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFMapType"


    // $ANTLR start "ruleFMapType"
    // InternalBehavior.g:4018:1: ruleFMapType returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'map' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_keyType_6_0= ruleFTypeRef ) ) otherlv_7= 'to' ( (lv_valueType_8_0= ruleFTypeRef ) ) otherlv_9= '}' ) ;
    public final EObject ruleFMapType() throws RecognitionException {
        EObject current = null;

        Token lv_public_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_comment_1_0 = null;

        EObject lv_keyType_6_0 = null;

        EObject lv_valueType_8_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4024:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'map' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_keyType_6_0= ruleFTypeRef ) ) otherlv_7= 'to' ( (lv_valueType_8_0= ruleFTypeRef ) ) otherlv_9= '}' ) )
            // InternalBehavior.g:4025:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'map' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_keyType_6_0= ruleFTypeRef ) ) otherlv_7= 'to' ( (lv_valueType_8_0= ruleFTypeRef ) ) otherlv_9= '}' )
            {
            // InternalBehavior.g:4025:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'map' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_keyType_6_0= ruleFTypeRef ) ) otherlv_7= 'to' ( (lv_valueType_8_0= ruleFTypeRef ) ) otherlv_9= '}' )
            // InternalBehavior.g:4026:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? ( (lv_public_2_0= 'public' ) )? otherlv_3= 'map' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_keyType_6_0= ruleFTypeRef ) ) otherlv_7= 'to' ( (lv_valueType_8_0= ruleFTypeRef ) ) otherlv_9= '}'
            {
            // InternalBehavior.g:4026:3: ()
            // InternalBehavior.g:4027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFMapTypeAccess().getFMapTypeAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:4033:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==73) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalBehavior.g:4034:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:4034:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalBehavior.g:4035:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFMapTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_91);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFMapTypeRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:4052:3: ( (lv_public_2_0= 'public' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==58) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalBehavior.g:4053:4: (lv_public_2_0= 'public' )
                    {
                    // InternalBehavior.g:4053:4: (lv_public_2_0= 'public' )
                    // InternalBehavior.g:4054:5: lv_public_2_0= 'public'
                    {
                    lv_public_2_0=(Token)match(input,58,FOLLOW_92); 

                    					newLeafNode(lv_public_2_0, grammarAccess.getFMapTypeAccess().getPublicPublicKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFMapTypeRule());
                    					}
                    					setWithLastConsumed(current, "public", true, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFMapTypeAccess().getMapKeyword_3());
            		
            // InternalBehavior.g:4070:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:4071:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:4071:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:4072:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFMapTypeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFMapTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_44); 

            			newLeafNode(otherlv_5, grammarAccess.getFMapTypeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBehavior.g:4092:3: ( (lv_keyType_6_0= ruleFTypeRef ) )
            // InternalBehavior.g:4093:4: (lv_keyType_6_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4093:4: (lv_keyType_6_0= ruleFTypeRef )
            // InternalBehavior.g:4094:5: lv_keyType_6_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFMapTypeAccess().getKeyTypeFTypeRefParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_93);
            lv_keyType_6_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFMapTypeRule());
            					}
            					set(
            						current,
            						"keyType",
            						lv_keyType_6_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,69,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getFMapTypeAccess().getToKeyword_7());
            		
            // InternalBehavior.g:4115:3: ( (lv_valueType_8_0= ruleFTypeRef ) )
            // InternalBehavior.g:4116:4: (lv_valueType_8_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4116:4: (lv_valueType_8_0= ruleFTypeRef )
            // InternalBehavior.g:4117:5: lv_valueType_8_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFMapTypeAccess().getValueTypeFTypeRefParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_42);
            lv_valueType_8_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFMapTypeRule());
            					}
            					set(
            						current,
            						"valueType",
            						lv_valueType_8_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFMapTypeAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFMapType"


    // $ANTLR start "entryRuleFField"
    // InternalBehavior.g:4142:1: entryRuleFField returns [EObject current=null] : iv_ruleFField= ruleFField EOF ;
    public final EObject entryRuleFField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFField = null;


        try {
            // InternalBehavior.g:4142:47: (iv_ruleFField= ruleFField EOF )
            // InternalBehavior.g:4143:2: iv_ruleFField= ruleFField EOF
            {
             newCompositeNode(grammarAccess.getFFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFField=ruleFField();

            state._fsp--;

             current =iv_ruleFField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFField"


    // $ANTLR start "ruleFField"
    // InternalBehavior.g:4149:1: ruleFField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleFField() throws RecognitionException {
        EObject current = null;

        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_comment_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4155:2: ( ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalBehavior.g:4156:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalBehavior.g:4156:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalBehavior.g:4157:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalBehavior.g:4157:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==73) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalBehavior.g:4158:4: (lv_comment_0_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:4158:4: (lv_comment_0_0= ruleAnnotationBlock )
                    // InternalBehavior.g:4159:5: lv_comment_0_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFFieldAccess().getCommentAnnotationBlockParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_comment_0_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFFieldRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_0_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:4176:3: ( (lv_type_1_0= ruleFTypeRef ) )
            // InternalBehavior.g:4177:4: (lv_type_1_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4177:4: (lv_type_1_0= ruleFTypeRef )
            // InternalBehavior.g:4178:5: lv_type_1_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFFieldAccess().getTypeFTypeRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_94);
            lv_type_1_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:4195:3: ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==39) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalBehavior.g:4196:4: ( (lv_array_2_0= '[' ) ) otherlv_3= ']'
                    {
                    // InternalBehavior.g:4196:4: ( (lv_array_2_0= '[' ) )
                    // InternalBehavior.g:4197:5: (lv_array_2_0= '[' )
                    {
                    // InternalBehavior.g:4197:5: (lv_array_2_0= '[' )
                    // InternalBehavior.g:4198:6: lv_array_2_0= '['
                    {
                    lv_array_2_0=(Token)match(input,39,FOLLOW_39); 

                    						newLeafNode(lv_array_2_0, grammarAccess.getFFieldAccess().getArrayLeftSquareBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFFieldRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFFieldAccess().getRightSquareBracketKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:4215:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:4216:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:4216:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:4217:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFFieldAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFField"


    // $ANTLR start "entryRuleFDeclaration"
    // InternalBehavior.g:4237:1: entryRuleFDeclaration returns [EObject current=null] : iv_ruleFDeclaration= ruleFDeclaration EOF ;
    public final EObject entryRuleFDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFDeclaration = null;


        try {
            // InternalBehavior.g:4237:53: (iv_ruleFDeclaration= ruleFDeclaration EOF )
            // InternalBehavior.g:4238:2: iv_ruleFDeclaration= ruleFDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFDeclaration=ruleFDeclaration();

            state._fsp--;

             current =iv_ruleFDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFDeclaration"


    // $ANTLR start "ruleFDeclaration"
    // InternalBehavior.g:4244:1: ruleFDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleFTypeRef ) ) ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )? ) ;
    public final EObject ruleFDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_rhs_5_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4250:2: ( ( ( (lv_type_0_0= ruleFTypeRef ) ) ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )? ) )
            // InternalBehavior.g:4251:2: ( ( (lv_type_0_0= ruleFTypeRef ) ) ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )? )
            {
            // InternalBehavior.g:4251:2: ( ( (lv_type_0_0= ruleFTypeRef ) ) ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )? )
            // InternalBehavior.g:4252:3: ( (lv_type_0_0= ruleFTypeRef ) ) ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )?
            {
            // InternalBehavior.g:4252:3: ( (lv_type_0_0= ruleFTypeRef ) )
            // InternalBehavior.g:4253:4: (lv_type_0_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4253:4: (lv_type_0_0= ruleFTypeRef )
            // InternalBehavior.g:4254:5: lv_type_0_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFDeclarationAccess().getTypeFTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_94);
            lv_type_0_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:4271:3: ( ( (lv_array_1_0= '[' ) ) otherlv_2= ']' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==39) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalBehavior.g:4272:4: ( (lv_array_1_0= '[' ) ) otherlv_2= ']'
                    {
                    // InternalBehavior.g:4272:4: ( (lv_array_1_0= '[' ) )
                    // InternalBehavior.g:4273:5: (lv_array_1_0= '[' )
                    {
                    // InternalBehavior.g:4273:5: (lv_array_1_0= '[' )
                    // InternalBehavior.g:4274:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,39,FOLLOW_39); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getFDeclarationAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFDeclarationRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getFDeclarationAccess().getRightSquareBracketKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:4291:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalBehavior.g:4292:4: (lv_name_3_0= RULE_ID )
            {
            // InternalBehavior.g:4292:4: (lv_name_3_0= RULE_ID )
            // InternalBehavior.g:4293:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_95); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBehavior.g:4309:3: (otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==70) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalBehavior.g:4310:4: otherlv_4= '=' ( (lv_rhs_5_0= ruleFInitializerExpression ) )
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getFDeclarationAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalBehavior.g:4314:4: ( (lv_rhs_5_0= ruleFInitializerExpression ) )
                    // InternalBehavior.g:4315:5: (lv_rhs_5_0= ruleFInitializerExpression )
                    {
                    // InternalBehavior.g:4315:5: (lv_rhs_5_0= ruleFInitializerExpression )
                    // InternalBehavior.g:4316:6: lv_rhs_5_0= ruleFInitializerExpression
                    {

                    						newCompositeNode(grammarAccess.getFDeclarationAccess().getRhsFInitializerExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rhs_5_0=ruleFInitializerExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"rhs",
                    							lv_rhs_5_0,
                    							"de.tu_bs.ccc.contracting.Behavior.FInitializerExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFDeclaration"


    // $ANTLR start "entryRuleFArgument"
    // InternalBehavior.g:4338:1: entryRuleFArgument returns [EObject current=null] : iv_ruleFArgument= ruleFArgument EOF ;
    public final EObject entryRuleFArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFArgument = null;


        try {
            // InternalBehavior.g:4338:50: (iv_ruleFArgument= ruleFArgument EOF )
            // InternalBehavior.g:4339:2: iv_ruleFArgument= ruleFArgument EOF
            {
             newCompositeNode(grammarAccess.getFArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFArgument=ruleFArgument();

            state._fsp--;

             current =iv_ruleFArgument; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFArgument"


    // $ANTLR start "ruleFArgument"
    // InternalBehavior.g:4345:1: ruleFArgument returns [EObject current=null] : ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleFArgument() throws RecognitionException {
        EObject current = null;

        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_comment_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4351:2: ( ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalBehavior.g:4352:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalBehavior.g:4352:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) ) )
            // InternalBehavior.g:4353:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )? ( (lv_type_1_0= ruleFTypeRef ) ) ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )? ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalBehavior.g:4353:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==73) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalBehavior.g:4354:4: (lv_comment_0_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:4354:4: (lv_comment_0_0= ruleAnnotationBlock )
                    // InternalBehavior.g:4355:5: lv_comment_0_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFArgumentAccess().getCommentAnnotationBlockParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_comment_0_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFArgumentRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_0_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBehavior.g:4372:3: ( (lv_type_1_0= ruleFTypeRef ) )
            // InternalBehavior.g:4373:4: (lv_type_1_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4373:4: (lv_type_1_0= ruleFTypeRef )
            // InternalBehavior.g:4374:5: lv_type_1_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFArgumentAccess().getTypeFTypeRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_94);
            lv_type_1_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFArgumentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:4391:3: ( ( (lv_array_2_0= '[' ) ) otherlv_3= ']' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==39) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalBehavior.g:4392:4: ( (lv_array_2_0= '[' ) ) otherlv_3= ']'
                    {
                    // InternalBehavior.g:4392:4: ( (lv_array_2_0= '[' ) )
                    // InternalBehavior.g:4393:5: (lv_array_2_0= '[' )
                    {
                    // InternalBehavior.g:4393:5: (lv_array_2_0= '[' )
                    // InternalBehavior.g:4394:6: lv_array_2_0= '['
                    {
                    lv_array_2_0=(Token)match(input,39,FOLLOW_39); 

                    						newLeafNode(lv_array_2_0, grammarAccess.getFArgumentAccess().getArrayLeftSquareBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFArgumentRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFArgumentAccess().getRightSquareBracketKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:4411:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalBehavior.g:4412:4: (lv_name_4_0= RULE_ID )
            {
            // InternalBehavior.g:4412:4: (lv_name_4_0= RULE_ID )
            // InternalBehavior.g:4413:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFArgumentAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleFArgument"


    // $ANTLR start "entryRuleFConstantDef"
    // InternalBehavior.g:4433:1: entryRuleFConstantDef returns [EObject current=null] : iv_ruleFConstantDef= ruleFConstantDef EOF ;
    public final EObject entryRuleFConstantDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFConstantDef = null;


        try {
            // InternalBehavior.g:4433:53: (iv_ruleFConstantDef= ruleFConstantDef EOF )
            // InternalBehavior.g:4434:2: iv_ruleFConstantDef= ruleFConstantDef EOF
            {
             newCompositeNode(grammarAccess.getFConstantDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFConstantDef=ruleFConstantDef();

            state._fsp--;

             current =iv_ruleFConstantDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFConstantDef"


    // $ANTLR start "ruleFConstantDef"
    // InternalBehavior.g:4440:1: ruleFConstantDef returns [EObject current=null] : ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? otherlv_1= 'const' ( (lv_type_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_rhs_7_0= ruleFInitializerExpression ) ) ) ;
    public final EObject ruleFConstantDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_array_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        EObject lv_comment_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_rhs_7_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4446:2: ( ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? otherlv_1= 'const' ( (lv_type_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_rhs_7_0= ruleFInitializerExpression ) ) ) )
            // InternalBehavior.g:4447:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? otherlv_1= 'const' ( (lv_type_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_rhs_7_0= ruleFInitializerExpression ) ) )
            {
            // InternalBehavior.g:4447:2: ( ( (lv_comment_0_0= ruleAnnotationBlock ) )? otherlv_1= 'const' ( (lv_type_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_rhs_7_0= ruleFInitializerExpression ) ) )
            // InternalBehavior.g:4448:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )? otherlv_1= 'const' ( (lv_type_2_0= ruleFTypeRef ) ) ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )? ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_rhs_7_0= ruleFInitializerExpression ) )
            {
            // InternalBehavior.g:4448:3: ( (lv_comment_0_0= ruleAnnotationBlock ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==73) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalBehavior.g:4449:4: (lv_comment_0_0= ruleAnnotationBlock )
                    {
                    // InternalBehavior.g:4449:4: (lv_comment_0_0= ruleAnnotationBlock )
                    // InternalBehavior.g:4450:5: lv_comment_0_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getFConstantDefAccess().getCommentAnnotationBlockParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_comment_0_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFConstantDefRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_0_0,
                    						"de.tu_bs.ccc.contracting.Behavior.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,71,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getFConstantDefAccess().getConstKeyword_1());
            		
            // InternalBehavior.g:4471:3: ( (lv_type_2_0= ruleFTypeRef ) )
            // InternalBehavior.g:4472:4: (lv_type_2_0= ruleFTypeRef )
            {
            // InternalBehavior.g:4472:4: (lv_type_2_0= ruleFTypeRef )
            // InternalBehavior.g:4473:5: lv_type_2_0= ruleFTypeRef
            {

            					newCompositeNode(grammarAccess.getFConstantDefAccess().getTypeFTypeRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_94);
            lv_type_2_0=ruleFTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFConstantDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.FTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:4490:3: ( ( (lv_array_3_0= '[' ) ) otherlv_4= ']' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==39) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalBehavior.g:4491:4: ( (lv_array_3_0= '[' ) ) otherlv_4= ']'
                    {
                    // InternalBehavior.g:4491:4: ( (lv_array_3_0= '[' ) )
                    // InternalBehavior.g:4492:5: (lv_array_3_0= '[' )
                    {
                    // InternalBehavior.g:4492:5: (lv_array_3_0= '[' )
                    // InternalBehavior.g:4493:6: lv_array_3_0= '['
                    {
                    lv_array_3_0=(Token)match(input,39,FOLLOW_39); 

                    						newLeafNode(lv_array_3_0, grammarAccess.getFConstantDefAccess().getArrayLeftSquareBracketKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFConstantDefRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getFConstantDefAccess().getRightSquareBracketKeyword_3_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:4510:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalBehavior.g:4511:4: (lv_name_5_0= RULE_ID )
            {
            // InternalBehavior.g:4511:4: (lv_name_5_0= RULE_ID )
            // InternalBehavior.g:4512:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_97); 

            					newLeafNode(lv_name_5_0, grammarAccess.getFConstantDefAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFConstantDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,70,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getFConstantDefAccess().getEqualsSignKeyword_5());
            		
            // InternalBehavior.g:4532:3: ( (lv_rhs_7_0= ruleFInitializerExpression ) )
            // InternalBehavior.g:4533:4: (lv_rhs_7_0= ruleFInitializerExpression )
            {
            // InternalBehavior.g:4533:4: (lv_rhs_7_0= ruleFInitializerExpression )
            // InternalBehavior.g:4534:5: lv_rhs_7_0= ruleFInitializerExpression
            {

            					newCompositeNode(grammarAccess.getFConstantDefAccess().getRhsFInitializerExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_7_0=ruleFInitializerExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFConstantDefRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_7_0,
            						"de.tu_bs.ccc.contracting.Behavior.FInitializerExpression");
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
    // $ANTLR end "ruleFConstantDef"


    // $ANTLR start "entryRuleFInitializerExpression"
    // InternalBehavior.g:4555:1: entryRuleFInitializerExpression returns [EObject current=null] : iv_ruleFInitializerExpression= ruleFInitializerExpression EOF ;
    public final EObject entryRuleFInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFInitializerExpression = null;


        try {
            // InternalBehavior.g:4555:63: (iv_ruleFInitializerExpression= ruleFInitializerExpression EOF )
            // InternalBehavior.g:4556:2: iv_ruleFInitializerExpression= ruleFInitializerExpression EOF
            {
             newCompositeNode(grammarAccess.getFInitializerExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFInitializerExpression=ruleFInitializerExpression();

            state._fsp--;

             current =iv_ruleFInitializerExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFInitializerExpression"


    // $ANTLR start "ruleFInitializerExpression"
    // InternalBehavior.g:4562:1: ruleFInitializerExpression returns [EObject current=null] : this_FInitializer_0= ruleFInitializer ;
    public final EObject ruleFInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FInitializer_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4568:2: (this_FInitializer_0= ruleFInitializer )
            // InternalBehavior.g:4569:2: this_FInitializer_0= ruleFInitializer
            {

            		newCompositeNode(grammarAccess.getFInitializerExpressionAccess().getFInitializerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FInitializer_0=ruleFInitializer();

            state._fsp--;


            		current = this_FInitializer_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleFInitializerExpression"


    // $ANTLR start "entryRuleFInitializer"
    // InternalBehavior.g:4580:1: entryRuleFInitializer returns [EObject current=null] : iv_ruleFInitializer= ruleFInitializer EOF ;
    public final EObject entryRuleFInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFInitializer = null;


        try {
            // InternalBehavior.g:4580:53: (iv_ruleFInitializer= ruleFInitializer EOF )
            // InternalBehavior.g:4581:2: iv_ruleFInitializer= ruleFInitializer EOF
            {
             newCompositeNode(grammarAccess.getFInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFInitializer=ruleFInitializer();

            state._fsp--;

             current =iv_ruleFInitializer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFInitializer"


    // $ANTLR start "ruleFInitializer"
    // InternalBehavior.g:4587:1: ruleFInitializer returns [EObject current=null] : (this_FCompoundInitializer_0= ruleFCompoundInitializer | this_FBracketInitializer_1= ruleFBracketInitializer ) ;
    public final EObject ruleFInitializer() throws RecognitionException {
        EObject current = null;

        EObject this_FCompoundInitializer_0 = null;

        EObject this_FBracketInitializer_1 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4593:2: ( (this_FCompoundInitializer_0= ruleFCompoundInitializer | this_FBracketInitializer_1= ruleFBracketInitializer ) )
            // InternalBehavior.g:4594:2: (this_FCompoundInitializer_0= ruleFCompoundInitializer | this_FBracketInitializer_1= ruleFBracketInitializer )
            {
            // InternalBehavior.g:4594:2: (this_FCompoundInitializer_0= ruleFCompoundInitializer | this_FBracketInitializer_1= ruleFBracketInitializer )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==18) ) {
                alt96=1;
            }
            else if ( (LA96_0==39) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // InternalBehavior.g:4595:3: this_FCompoundInitializer_0= ruleFCompoundInitializer
                    {

                    			newCompositeNode(grammarAccess.getFInitializerAccess().getFCompoundInitializerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FCompoundInitializer_0=ruleFCompoundInitializer();

                    state._fsp--;


                    			current = this_FCompoundInitializer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:4604:3: this_FBracketInitializer_1= ruleFBracketInitializer
                    {

                    			newCompositeNode(grammarAccess.getFInitializerAccess().getFBracketInitializerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FBracketInitializer_1=ruleFBracketInitializer();

                    state._fsp--;


                    			current = this_FBracketInitializer_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleFInitializer"


    // $ANTLR start "entryRuleFCompoundInitializer"
    // InternalBehavior.g:4616:1: entryRuleFCompoundInitializer returns [EObject current=null] : iv_ruleFCompoundInitializer= ruleFCompoundInitializer EOF ;
    public final EObject entryRuleFCompoundInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFCompoundInitializer = null;


        try {
            // InternalBehavior.g:4616:61: (iv_ruleFCompoundInitializer= ruleFCompoundInitializer EOF )
            // InternalBehavior.g:4617:2: iv_ruleFCompoundInitializer= ruleFCompoundInitializer EOF
            {
             newCompositeNode(grammarAccess.getFCompoundInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFCompoundInitializer=ruleFCompoundInitializer();

            state._fsp--;

             current =iv_ruleFCompoundInitializer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFCompoundInitializer"


    // $ANTLR start "ruleFCompoundInitializer"
    // InternalBehavior.g:4623:1: ruleFCompoundInitializer returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleFCompoundInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4629:2: ( ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )? otherlv_5= '}' ) )
            // InternalBehavior.g:4630:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )? otherlv_5= '}' )
            {
            // InternalBehavior.g:4630:2: ( () otherlv_1= '{' ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )? otherlv_5= '}' )
            // InternalBehavior.g:4631:3: () otherlv_1= '{' ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )? otherlv_5= '}'
            {
            // InternalBehavior.g:4631:3: ()
            // InternalBehavior.g:4632:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFCompoundInitializerAccess().getFCompoundInitializerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_98); 

            			newLeafNode(otherlv_1, grammarAccess.getFCompoundInitializerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalBehavior.g:4642:3: ( ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )* )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalBehavior.g:4643:4: ( (lv_elements_2_0= ruleFFieldInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )*
                    {
                    // InternalBehavior.g:4643:4: ( (lv_elements_2_0= ruleFFieldInitializer ) )
                    // InternalBehavior.g:4644:5: (lv_elements_2_0= ruleFFieldInitializer )
                    {
                    // InternalBehavior.g:4644:5: (lv_elements_2_0= ruleFFieldInitializer )
                    // InternalBehavior.g:4645:6: lv_elements_2_0= ruleFFieldInitializer
                    {

                    						newCompositeNode(grammarAccess.getFCompoundInitializerAccess().getElementsFFieldInitializerParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_99);
                    lv_elements_2_0=ruleFFieldInitializer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFCompoundInitializerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"de.tu_bs.ccc.contracting.Behavior.FFieldInitializer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehavior.g:4662:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==26) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalBehavior.g:4663:5: otherlv_3= ',' ( (lv_elements_4_0= ruleFFieldInitializer ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFCompoundInitializerAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBehavior.g:4667:5: ( (lv_elements_4_0= ruleFFieldInitializer ) )
                    	    // InternalBehavior.g:4668:6: (lv_elements_4_0= ruleFFieldInitializer )
                    	    {
                    	    // InternalBehavior.g:4668:6: (lv_elements_4_0= ruleFFieldInitializer )
                    	    // InternalBehavior.g:4669:7: lv_elements_4_0= ruleFFieldInitializer
                    	    {

                    	    							newCompositeNode(grammarAccess.getFCompoundInitializerAccess().getElementsFFieldInitializerParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_99);
                    	    lv_elements_4_0=ruleFFieldInitializer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFCompoundInitializerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.FFieldInitializer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFCompoundInitializerAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFCompoundInitializer"


    // $ANTLR start "entryRuleFFieldInitializer"
    // InternalBehavior.g:4696:1: entryRuleFFieldInitializer returns [EObject current=null] : iv_ruleFFieldInitializer= ruleFFieldInitializer EOF ;
    public final EObject entryRuleFFieldInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFFieldInitializer = null;


        try {
            // InternalBehavior.g:4696:58: (iv_ruleFFieldInitializer= ruleFFieldInitializer EOF )
            // InternalBehavior.g:4697:2: iv_ruleFFieldInitializer= ruleFFieldInitializer EOF
            {
             newCompositeNode(grammarAccess.getFFieldInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFFieldInitializer=ruleFFieldInitializer();

            state._fsp--;

             current =iv_ruleFFieldInitializer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFFieldInitializer"


    // $ANTLR start "ruleFFieldInitializer"
    // InternalBehavior.g:4703:1: ruleFFieldInitializer returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFInitializerExpression ) ) ) ;
    public final EObject ruleFFieldInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4709:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFInitializerExpression ) ) ) )
            // InternalBehavior.g:4710:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFInitializerExpression ) ) )
            {
            // InternalBehavior.g:4710:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFInitializerExpression ) ) )
            // InternalBehavior.g:4711:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleFInitializerExpression ) )
            {
            // InternalBehavior.g:4711:3: ( (otherlv_0= RULE_ID ) )
            // InternalBehavior.g:4712:4: (otherlv_0= RULE_ID )
            {
            // InternalBehavior.g:4712:4: (otherlv_0= RULE_ID )
            // InternalBehavior.g:4713:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFFieldInitializerRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_0, grammarAccess.getFFieldInitializerAccess().getElementFFieldCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getFFieldInitializerAccess().getColonKeyword_1());
            		
            // InternalBehavior.g:4728:3: ( (lv_value_2_0= ruleFInitializerExpression ) )
            // InternalBehavior.g:4729:4: (lv_value_2_0= ruleFInitializerExpression )
            {
            // InternalBehavior.g:4729:4: (lv_value_2_0= ruleFInitializerExpression )
            // InternalBehavior.g:4730:5: lv_value_2_0= ruleFInitializerExpression
            {

            					newCompositeNode(grammarAccess.getFFieldInitializerAccess().getValueFInitializerExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleFInitializerExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFFieldInitializerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.tu_bs.ccc.contracting.Behavior.FInitializerExpression");
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
    // $ANTLR end "ruleFFieldInitializer"


    // $ANTLR start "entryRuleFBracketInitializer"
    // InternalBehavior.g:4751:1: entryRuleFBracketInitializer returns [EObject current=null] : iv_ruleFBracketInitializer= ruleFBracketInitializer EOF ;
    public final EObject entryRuleFBracketInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFBracketInitializer = null;


        try {
            // InternalBehavior.g:4751:60: (iv_ruleFBracketInitializer= ruleFBracketInitializer EOF )
            // InternalBehavior.g:4752:2: iv_ruleFBracketInitializer= ruleFBracketInitializer EOF
            {
             newCompositeNode(grammarAccess.getFBracketInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFBracketInitializer=ruleFBracketInitializer();

            state._fsp--;

             current =iv_ruleFBracketInitializer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFBracketInitializer"


    // $ANTLR start "ruleFBracketInitializer"
    // InternalBehavior.g:4758:1: ruleFBracketInitializer returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleFBracketInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4764:2: ( ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )? otherlv_5= ']' ) )
            // InternalBehavior.g:4765:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )? otherlv_5= ']' )
            {
            // InternalBehavior.g:4765:2: ( () otherlv_1= '[' ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )? otherlv_5= ']' )
            // InternalBehavior.g:4766:3: () otherlv_1= '[' ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )? otherlv_5= ']'
            {
            // InternalBehavior.g:4766:3: ()
            // InternalBehavior.g:4767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFBracketInitializerAccess().getFBracketInitializerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_100); 

            			newLeafNode(otherlv_1, grammarAccess.getFBracketInitializerAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalBehavior.g:4777:3: ( ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )* )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==18||LA100_0==39) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalBehavior.g:4778:4: ( (lv_elements_2_0= ruleFElementInitializer ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )*
                    {
                    // InternalBehavior.g:4778:4: ( (lv_elements_2_0= ruleFElementInitializer ) )
                    // InternalBehavior.g:4779:5: (lv_elements_2_0= ruleFElementInitializer )
                    {
                    // InternalBehavior.g:4779:5: (lv_elements_2_0= ruleFElementInitializer )
                    // InternalBehavior.g:4780:6: lv_elements_2_0= ruleFElementInitializer
                    {

                    						newCompositeNode(grammarAccess.getFBracketInitializerAccess().getElementsFElementInitializerParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_elements_2_0=ruleFElementInitializer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFBracketInitializerRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"de.tu_bs.ccc.contracting.Behavior.FElementInitializer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBehavior.g:4797:4: (otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==26) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalBehavior.g:4798:5: otherlv_3= ',' ( (lv_elements_4_0= ruleFElementInitializer ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_38); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFBracketInitializerAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalBehavior.g:4802:5: ( (lv_elements_4_0= ruleFElementInitializer ) )
                    	    // InternalBehavior.g:4803:6: (lv_elements_4_0= ruleFElementInitializer )
                    	    {
                    	    // InternalBehavior.g:4803:6: (lv_elements_4_0= ruleFElementInitializer )
                    	    // InternalBehavior.g:4804:7: lv_elements_4_0= ruleFElementInitializer
                    	    {

                    	    							newCompositeNode(grammarAccess.getFBracketInitializerAccess().getElementsFElementInitializerParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_101);
                    	    lv_elements_4_0=ruleFElementInitializer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFBracketInitializerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_4_0,
                    	    								"de.tu_bs.ccc.contracting.Behavior.FElementInitializer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFBracketInitializerAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFBracketInitializer"


    // $ANTLR start "entryRuleFElementInitializer"
    // InternalBehavior.g:4831:1: entryRuleFElementInitializer returns [EObject current=null] : iv_ruleFElementInitializer= ruleFElementInitializer EOF ;
    public final EObject entryRuleFElementInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFElementInitializer = null;


        try {
            // InternalBehavior.g:4831:60: (iv_ruleFElementInitializer= ruleFElementInitializer EOF )
            // InternalBehavior.g:4832:2: iv_ruleFElementInitializer= ruleFElementInitializer EOF
            {
             newCompositeNode(grammarAccess.getFElementInitializerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFElementInitializer=ruleFElementInitializer();

            state._fsp--;

             current =iv_ruleFElementInitializer; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFElementInitializer"


    // $ANTLR start "ruleFElementInitializer"
    // InternalBehavior.g:4838:1: ruleFElementInitializer returns [EObject current=null] : ( () ( (lv_first_1_0= ruleFInitializerExpression ) ) (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )? ) ;
    public final EObject ruleFElementInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_first_1_0 = null;

        EObject lv_second_3_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4844:2: ( ( () ( (lv_first_1_0= ruleFInitializerExpression ) ) (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )? ) )
            // InternalBehavior.g:4845:2: ( () ( (lv_first_1_0= ruleFInitializerExpression ) ) (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )? )
            {
            // InternalBehavior.g:4845:2: ( () ( (lv_first_1_0= ruleFInitializerExpression ) ) (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )? )
            // InternalBehavior.g:4846:3: () ( (lv_first_1_0= ruleFInitializerExpression ) ) (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )?
            {
            // InternalBehavior.g:4846:3: ()
            // InternalBehavior.g:4847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFElementInitializerAccess().getFElementInitializerAction_0(),
            					current);
            			

            }

            // InternalBehavior.g:4853:3: ( (lv_first_1_0= ruleFInitializerExpression ) )
            // InternalBehavior.g:4854:4: (lv_first_1_0= ruleFInitializerExpression )
            {
            // InternalBehavior.g:4854:4: (lv_first_1_0= ruleFInitializerExpression )
            // InternalBehavior.g:4855:5: lv_first_1_0= ruleFInitializerExpression
            {

            					newCompositeNode(grammarAccess.getFElementInitializerAccess().getFirstFInitializerExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_102);
            lv_first_1_0=ruleFInitializerExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFElementInitializerRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"de.tu_bs.ccc.contracting.Behavior.FInitializerExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBehavior.g:4872:3: (otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==72) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalBehavior.g:4873:4: otherlv_2= '=>' ( (lv_second_3_0= ruleFInitializerExpression ) )
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getFElementInitializerAccess().getEqualsSignGreaterThanSignKeyword_2_0());
                    			
                    // InternalBehavior.g:4877:4: ( (lv_second_3_0= ruleFInitializerExpression ) )
                    // InternalBehavior.g:4878:5: (lv_second_3_0= ruleFInitializerExpression )
                    {
                    // InternalBehavior.g:4878:5: (lv_second_3_0= ruleFInitializerExpression )
                    // InternalBehavior.g:4879:6: lv_second_3_0= ruleFInitializerExpression
                    {

                    						newCompositeNode(grammarAccess.getFElementInitializerAccess().getSecondFInitializerExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_second_3_0=ruleFInitializerExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFElementInitializerRule());
                    						}
                    						set(
                    							current,
                    							"second",
                    							lv_second_3_0,
                    							"de.tu_bs.ccc.contracting.Behavior.FInitializerExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFElementInitializer"


    // $ANTLR start "entryRuleDetailCode"
    // InternalBehavior.g:4901:1: entryRuleDetailCode returns [EObject current=null] : iv_ruleDetailCode= ruleDetailCode EOF ;
    public final EObject entryRuleDetailCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetailCode = null;


        try {
            // InternalBehavior.g:4901:51: (iv_ruleDetailCode= ruleDetailCode EOF )
            // InternalBehavior.g:4902:2: iv_ruleDetailCode= ruleDetailCode EOF
            {
             newCompositeNode(grammarAccess.getDetailCodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetailCode=ruleDetailCode();

            state._fsp--;

             current =iv_ruleDetailCode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDetailCode"


    // $ANTLR start "ruleDetailCode"
    // InternalBehavior.g:4908:1: ruleDetailCode returns [EObject current=null] : ( ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? ) | ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' ) ) ;
    public final EObject ruleDetailCode() throws RecognitionException {
        EObject current = null;

        Token lv_lines_1_0=null;
        Token lv_used_2_0=null;
        Token lv_lines_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalBehavior.g:4914:2: ( ( ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? ) | ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' ) ) )
            // InternalBehavior.g:4915:2: ( ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? ) | ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            {
            // InternalBehavior.g:4915:2: ( ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? ) | ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==EOF||LA104_0==RULE_CC_STRING||LA104_0==21) ) {
                alt104=1;
            }
            else if ( (LA104_0==18) ) {
                alt104=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalBehavior.g:4916:3: ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? )
                    {
                    // InternalBehavior.g:4916:3: ( () ( (lv_lines_1_0= RULE_CC_STRING ) )? )
                    // InternalBehavior.g:4917:4: () ( (lv_lines_1_0= RULE_CC_STRING ) )?
                    {
                    // InternalBehavior.g:4917:4: ()
                    // InternalBehavior.g:4918:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDetailCodeAccess().getDetailCodeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalBehavior.g:4924:4: ( (lv_lines_1_0= RULE_CC_STRING ) )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==RULE_CC_STRING) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // InternalBehavior.g:4925:5: (lv_lines_1_0= RULE_CC_STRING )
                            {
                            // InternalBehavior.g:4925:5: (lv_lines_1_0= RULE_CC_STRING )
                            // InternalBehavior.g:4926:6: lv_lines_1_0= RULE_CC_STRING
                            {
                            lv_lines_1_0=(Token)match(input,RULE_CC_STRING,FOLLOW_2); 

                            						newLeafNode(lv_lines_1_0, grammarAccess.getDetailCodeAccess().getLinesCC_STRINGTerminalRuleCall_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getDetailCodeRule());
                            						}
                            						addWithLastConsumed(
                            							current,
                            							"lines",
                            							lv_lines_1_0,
                            							"de.tu_bs.ccc.contracting.Behavior.CC_STRING");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:4944:3: ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' )
                    {
                    // InternalBehavior.g:4944:3: ( ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}' )
                    // InternalBehavior.g:4945:4: ( (lv_used_2_0= '{' ) ) ( (lv_lines_3_0= RULE_STRING ) )* otherlv_4= '}'
                    {
                    // InternalBehavior.g:4945:4: ( (lv_used_2_0= '{' ) )
                    // InternalBehavior.g:4946:5: (lv_used_2_0= '{' )
                    {
                    // InternalBehavior.g:4946:5: (lv_used_2_0= '{' )
                    // InternalBehavior.g:4947:6: lv_used_2_0= '{'
                    {
                    lv_used_2_0=(Token)match(input,18,FOLLOW_103); 

                    						newLeafNode(lv_used_2_0, grammarAccess.getDetailCodeAccess().getUsedLeftCurlyBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDetailCodeRule());
                    						}
                    						setWithLastConsumed(current, "used", true, "{");
                    					

                    }


                    }

                    // InternalBehavior.g:4959:4: ( (lv_lines_3_0= RULE_STRING ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==RULE_STRING) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalBehavior.g:4960:5: (lv_lines_3_0= RULE_STRING )
                    	    {
                    	    // InternalBehavior.g:4960:5: (lv_lines_3_0= RULE_STRING )
                    	    // InternalBehavior.g:4961:6: lv_lines_3_0= RULE_STRING
                    	    {
                    	    lv_lines_3_0=(Token)match(input,RULE_STRING,FOLLOW_103); 

                    	    						newLeafNode(lv_lines_3_0, grammarAccess.getDetailCodeAccess().getLinesSTRINGTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getDetailCodeRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"lines",
                    	    							lv_lines_3_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDetailCodeAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleDetailCode"


    // $ANTLR start "entryRuleAnnotationBlock"
    // InternalBehavior.g:4986:1: entryRuleAnnotationBlock returns [EObject current=null] : iv_ruleAnnotationBlock= ruleAnnotationBlock EOF ;
    public final EObject entryRuleAnnotationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationBlock = null;


        try {
            // InternalBehavior.g:4986:56: (iv_ruleAnnotationBlock= ruleAnnotationBlock EOF )
            // InternalBehavior.g:4987:2: iv_ruleAnnotationBlock= ruleAnnotationBlock EOF
            {
             newCompositeNode(grammarAccess.getAnnotationBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationBlock=ruleAnnotationBlock();

            state._fsp--;

             current =iv_ruleAnnotationBlock; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotationBlock"


    // $ANTLR start "ruleAnnotationBlock"
    // InternalBehavior.g:4993:1: ruleAnnotationBlock returns [EObject current=null] : (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' ) ;
    public final EObject ruleAnnotationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:4999:2: ( (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' ) )
            // InternalBehavior.g:5000:2: (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' )
            {
            // InternalBehavior.g:5000:2: (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' )
            // InternalBehavior.g:5001:3: otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_104); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationBlockAccess().getSolidusAsteriskKeyword_0());
            		
            // InternalBehavior.g:5005:3: ( (lv_elements_1_0= ruleAnnotation ) )+
            int cnt105=0;
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==RULE_ANNOTATION_STRING) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalBehavior.g:5006:4: (lv_elements_1_0= ruleAnnotation )
            	    {
            	    // InternalBehavior.g:5006:4: (lv_elements_1_0= ruleAnnotation )
            	    // InternalBehavior.g:5007:5: lv_elements_1_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationBlockAccess().getElementsAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_105);
            	    lv_elements_1_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"de.tu_bs.ccc.contracting.Behavior.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt105 >= 1 ) break loop105;
                        EarlyExitException eee =
                            new EarlyExitException(105, input);
                        throw eee;
                }
                cnt105++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getAnnotationBlockAccess().getAsteriskSolidusKeyword_2());
            		

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
    // $ANTLR end "ruleAnnotationBlock"


    // $ANTLR start "entryRuleAnnotation"
    // InternalBehavior.g:5032:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalBehavior.g:5032:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalBehavior.g:5033:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalBehavior.g:5039:1: ruleAnnotation returns [EObject current=null] : ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_rawText_0_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:5045:2: ( ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) ) )
            // InternalBehavior.g:5046:2: ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) )
            {
            // InternalBehavior.g:5046:2: ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) )
            // InternalBehavior.g:5047:3: (lv_rawText_0_0= RULE_ANNOTATION_STRING )
            {
            // InternalBehavior.g:5047:3: (lv_rawText_0_0= RULE_ANNOTATION_STRING )
            // InternalBehavior.g:5048:4: lv_rawText_0_0= RULE_ANNOTATION_STRING
            {
            lv_rawText_0_0=(Token)match(input,RULE_ANNOTATION_STRING,FOLLOW_2); 

            				newLeafNode(lv_rawText_0_0, grammarAccess.getAnnotationAccess().getRawTextANNOTATION_STRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAnnotationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"rawText",
            					lv_rawText_0_0,
            					"de.tu_bs.ccc.contracting.Behavior.ANNOTATION_STRING");
            			

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleImport"
    // InternalBehavior.g:5067:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalBehavior.g:5067:47: (iv_ruleImport= ruleImport EOF )
            // InternalBehavior.g:5068:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalBehavior.g:5074:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        Token otherlv_5=null;
        Token lv_alias_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:5080:2: ( (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? otherlv_7= ';' ) )
            // InternalBehavior.g:5081:2: (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            {
            // InternalBehavior.g:5081:2: (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? otherlv_7= ';' )
            // InternalBehavior.g:5082:3: otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_106); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalBehavior.g:5086:3: ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_ID) ) {
                alt106=1;
            }
            else if ( (LA106_0==77) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalBehavior.g:5087:4: ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' )
                    {
                    // InternalBehavior.g:5087:4: ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' )
                    // InternalBehavior.g:5088:5: ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from'
                    {
                    // InternalBehavior.g:5088:5: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
                    // InternalBehavior.g:5089:6: (lv_importedNamespace_1_0= ruleImportedFQN )
                    {
                    // InternalBehavior.g:5089:6: (lv_importedNamespace_1_0= ruleImportedFQN )
                    // InternalBehavior.g:5090:7: lv_importedNamespace_1_0= ruleImportedFQN
                    {

                    							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_107);
                    lv_importedNamespace_1_0=ruleImportedFQN();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImportRule());
                    							}
                    							set(
                    								current,
                    								"importedNamespace",
                    								lv_importedNamespace_1_0,
                    								"de.tu_bs.ccc.contracting.Behavior.ImportedFQN");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,76,FOLLOW_53); 

                    					newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5113:4: otherlv_3= 'model'
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getModelKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalBehavior.g:5118:3: ( (lv_importURI_4_0= RULE_STRING ) )
            // InternalBehavior.g:5119:4: (lv_importURI_4_0= RULE_STRING )
            {
            // InternalBehavior.g:5119:4: (lv_importURI_4_0= RULE_STRING )
            // InternalBehavior.g:5120:5: lv_importURI_4_0= RULE_STRING
            {
            lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

            					newLeafNode(lv_importURI_4_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalBehavior.g:5136:3: (otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==78) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalBehavior.g:5137:4: otherlv_5= 'as' ( (lv_alias_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getImportAccess().getAsKeyword_3_0());
                    			
                    // InternalBehavior.g:5141:4: ( (lv_alias_6_0= RULE_ID ) )
                    // InternalBehavior.g:5142:5: (lv_alias_6_0= RULE_ID )
                    {
                    // InternalBehavior.g:5142:5: (lv_alias_6_0= RULE_ID )
                    // InternalBehavior.g:5143:6: lv_alias_6_0= RULE_ID
                    {
                    lv_alias_6_0=(Token)match(input,RULE_ID,FOLLOW_54); 

                    						newLeafNode(lv_alias_6_0, grammarAccess.getImportAccess().getAliasIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImportAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleImportedFQN"
    // InternalBehavior.g:5168:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalBehavior.g:5168:51: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalBehavior.g:5169:2: iv_ruleImportedFQN= ruleImportedFQN EOF
            {
             newCompositeNode(grammarAccess.getImportedFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportedFQN=ruleImportedFQN();

            state._fsp--;

             current =iv_ruleImportedFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportedFQN"


    // $ANTLR start "ruleImportedFQN"
    // InternalBehavior.g:5175:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalBehavior.g:5181:2: ( (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? ) )
            // InternalBehavior.g:5182:2: (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? )
            {
            // InternalBehavior.g:5182:2: (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? )
            // InternalBehavior.g:5183:3: this_FQN_0= ruleFQN (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_109);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalBehavior.g:5193:3: (kw= '.' kw= '*' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==79) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalBehavior.g:5194:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,79,FOLLOW_110); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,80,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getAsteriskKeyword_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleImportedFQN"


    // $ANTLR start "entryRuleFQN"
    // InternalBehavior.g:5209:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalBehavior.g:5209:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalBehavior.g:5210:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalBehavior.g:5216:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalBehavior.g:5222:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalBehavior.g:5223:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalBehavior.g:5223:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalBehavior.g:5224:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_109); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalBehavior.g:5231:3: (kw= '.' this_ID_2= RULE_ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==79) ) {
                    int LA109_2 = input.LA(2);

                    if ( (LA109_2==RULE_ID) ) {
                        alt109=1;
                    }


                }


                switch (alt109) {
            	case 1 :
            	    // InternalBehavior.g:5232:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,79,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_109); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop109;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalBehavior.g:5249:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalBehavior.g:5249:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalBehavior.g:5250:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalBehavior.g:5256:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBehavior.g:5262:2: ( (kw= 'false' | kw= 'true' ) )
            // InternalBehavior.g:5263:2: (kw= 'false' | kw= 'true' )
            {
            // InternalBehavior.g:5263:2: (kw= 'false' | kw= 'true' )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==81) ) {
                alt110=1;
            }
            else if ( (LA110_0==82) ) {
                alt110=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // InternalBehavior.g:5264:3: kw= 'false'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5270:3: kw= 'true'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleE_BigInteger"
    // InternalBehavior.g:5279:1: entryRuleE_BigInteger returns [String current=null] : iv_ruleE_BigInteger= ruleE_BigInteger EOF ;
    public final String entryRuleE_BigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleE_BigInteger = null;


        try {
            // InternalBehavior.g:5279:52: (iv_ruleE_BigInteger= ruleE_BigInteger EOF )
            // InternalBehavior.g:5280:2: iv_ruleE_BigInteger= ruleE_BigInteger EOF
            {
             newCompositeNode(grammarAccess.getE_BigIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleE_BigInteger=ruleE_BigInteger();

            state._fsp--;

             current =iv_ruleE_BigInteger.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleE_BigInteger"


    // $ANTLR start "ruleE_BigInteger"
    // InternalBehavior.g:5286:1: ruleE_BigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleE_BigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:5292:2: (this_INT_0= RULE_INT )
            // InternalBehavior.g:5293:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getE_BigIntegerAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleE_BigInteger"


    // $ANTLR start "ruleFBasicTypeId"
    // InternalBehavior.g:5303:1: ruleFBasicTypeId returns [Enumerator current=null] : ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'Int8' ) | (enumLiteral_2= 'UInt8' ) | (enumLiteral_3= 'Int16' ) | (enumLiteral_4= 'UInt16' ) | (enumLiteral_5= 'Int32' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'Int64' ) | (enumLiteral_8= 'UInt64' ) | (enumLiteral_9= 'Boolean' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Float' ) | (enumLiteral_12= 'Double' ) | (enumLiteral_13= 'ByteBuffer' ) ) ;
    public final Enumerator ruleFBasicTypeId() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalBehavior.g:5309:2: ( ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'Int8' ) | (enumLiteral_2= 'UInt8' ) | (enumLiteral_3= 'Int16' ) | (enumLiteral_4= 'UInt16' ) | (enumLiteral_5= 'Int32' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'Int64' ) | (enumLiteral_8= 'UInt64' ) | (enumLiteral_9= 'Boolean' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Float' ) | (enumLiteral_12= 'Double' ) | (enumLiteral_13= 'ByteBuffer' ) ) )
            // InternalBehavior.g:5310:2: ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'Int8' ) | (enumLiteral_2= 'UInt8' ) | (enumLiteral_3= 'Int16' ) | (enumLiteral_4= 'UInt16' ) | (enumLiteral_5= 'Int32' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'Int64' ) | (enumLiteral_8= 'UInt64' ) | (enumLiteral_9= 'Boolean' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Float' ) | (enumLiteral_12= 'Double' ) | (enumLiteral_13= 'ByteBuffer' ) )
            {
            // InternalBehavior.g:5310:2: ( (enumLiteral_0= 'undefined' ) | (enumLiteral_1= 'Int8' ) | (enumLiteral_2= 'UInt8' ) | (enumLiteral_3= 'Int16' ) | (enumLiteral_4= 'UInt16' ) | (enumLiteral_5= 'Int32' ) | (enumLiteral_6= 'UInt32' ) | (enumLiteral_7= 'Int64' ) | (enumLiteral_8= 'UInt64' ) | (enumLiteral_9= 'Boolean' ) | (enumLiteral_10= 'String' ) | (enumLiteral_11= 'Float' ) | (enumLiteral_12= 'Double' ) | (enumLiteral_13= 'ByteBuffer' ) )
            int alt111=14;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt111=1;
                }
                break;
            case 84:
                {
                alt111=2;
                }
                break;
            case 85:
                {
                alt111=3;
                }
                break;
            case 86:
                {
                alt111=4;
                }
                break;
            case 87:
                {
                alt111=5;
                }
                break;
            case 88:
                {
                alt111=6;
                }
                break;
            case 89:
                {
                alt111=7;
                }
                break;
            case 90:
                {
                alt111=8;
                }
                break;
            case 91:
                {
                alt111=9;
                }
                break;
            case 92:
                {
                alt111=10;
                }
                break;
            case 93:
                {
                alt111=11;
                }
                break;
            case 94:
                {
                alt111=12;
                }
                break;
            case 95:
                {
                alt111=13;
                }
                break;
            case 96:
                {
                alt111=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalBehavior.g:5311:3: (enumLiteral_0= 'undefined' )
                    {
                    // InternalBehavior.g:5311:3: (enumLiteral_0= 'undefined' )
                    // InternalBehavior.g:5312:4: enumLiteral_0= 'undefined'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getUndefinedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFBasicTypeIdAccess().getUndefinedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5319:3: (enumLiteral_1= 'Int8' )
                    {
                    // InternalBehavior.g:5319:3: (enumLiteral_1= 'Int8' )
                    // InternalBehavior.g:5320:4: enumLiteral_1= 'Int8'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getInt8EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFBasicTypeIdAccess().getInt8EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:5327:3: (enumLiteral_2= 'UInt8' )
                    {
                    // InternalBehavior.g:5327:3: (enumLiteral_2= 'UInt8' )
                    // InternalBehavior.g:5328:4: enumLiteral_2= 'UInt8'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getUInt8EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFBasicTypeIdAccess().getUInt8EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:5335:3: (enumLiteral_3= 'Int16' )
                    {
                    // InternalBehavior.g:5335:3: (enumLiteral_3= 'Int16' )
                    // InternalBehavior.g:5336:4: enumLiteral_3= 'Int16'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getInt16EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFBasicTypeIdAccess().getInt16EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalBehavior.g:5343:3: (enumLiteral_4= 'UInt16' )
                    {
                    // InternalBehavior.g:5343:3: (enumLiteral_4= 'UInt16' )
                    // InternalBehavior.g:5344:4: enumLiteral_4= 'UInt16'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getUInt16EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getFBasicTypeIdAccess().getUInt16EnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalBehavior.g:5351:3: (enumLiteral_5= 'Int32' )
                    {
                    // InternalBehavior.g:5351:3: (enumLiteral_5= 'Int32' )
                    // InternalBehavior.g:5352:4: enumLiteral_5= 'Int32'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getInt32EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getFBasicTypeIdAccess().getInt32EnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalBehavior.g:5359:3: (enumLiteral_6= 'UInt32' )
                    {
                    // InternalBehavior.g:5359:3: (enumLiteral_6= 'UInt32' )
                    // InternalBehavior.g:5360:4: enumLiteral_6= 'UInt32'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getUInt32EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getFBasicTypeIdAccess().getUInt32EnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalBehavior.g:5367:3: (enumLiteral_7= 'Int64' )
                    {
                    // InternalBehavior.g:5367:3: (enumLiteral_7= 'Int64' )
                    // InternalBehavior.g:5368:4: enumLiteral_7= 'Int64'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getInt64EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getFBasicTypeIdAccess().getInt64EnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalBehavior.g:5375:3: (enumLiteral_8= 'UInt64' )
                    {
                    // InternalBehavior.g:5375:3: (enumLiteral_8= 'UInt64' )
                    // InternalBehavior.g:5376:4: enumLiteral_8= 'UInt64'
                    {
                    enumLiteral_8=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getUInt64EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getFBasicTypeIdAccess().getUInt64EnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalBehavior.g:5383:3: (enumLiteral_9= 'Boolean' )
                    {
                    // InternalBehavior.g:5383:3: (enumLiteral_9= 'Boolean' )
                    // InternalBehavior.g:5384:4: enumLiteral_9= 'Boolean'
                    {
                    enumLiteral_9=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getBooleanEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getFBasicTypeIdAccess().getBooleanEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalBehavior.g:5391:3: (enumLiteral_10= 'String' )
                    {
                    // InternalBehavior.g:5391:3: (enumLiteral_10= 'String' )
                    // InternalBehavior.g:5392:4: enumLiteral_10= 'String'
                    {
                    enumLiteral_10=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getStringEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getFBasicTypeIdAccess().getStringEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalBehavior.g:5399:3: (enumLiteral_11= 'Float' )
                    {
                    // InternalBehavior.g:5399:3: (enumLiteral_11= 'Float' )
                    // InternalBehavior.g:5400:4: enumLiteral_11= 'Float'
                    {
                    enumLiteral_11=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getFloatEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getFBasicTypeIdAccess().getFloatEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalBehavior.g:5407:3: (enumLiteral_12= 'Double' )
                    {
                    // InternalBehavior.g:5407:3: (enumLiteral_12= 'Double' )
                    // InternalBehavior.g:5408:4: enumLiteral_12= 'Double'
                    {
                    enumLiteral_12=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getDoubleEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getFBasicTypeIdAccess().getDoubleEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalBehavior.g:5415:3: (enumLiteral_13= 'ByteBuffer' )
                    {
                    // InternalBehavior.g:5415:3: (enumLiteral_13= 'ByteBuffer' )
                    // InternalBehavior.g:5416:4: enumLiteral_13= 'ByteBuffer'
                    {
                    enumLiteral_13=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getFBasicTypeIdAccess().getByteBufferEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getFBasicTypeIdAccess().getByteBufferEnumLiteralDeclaration_13());
                    			

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
    // $ANTLR end "ruleFBasicTypeId"


    // $ANTLR start "ruleOperatorOr"
    // InternalBehavior.g:5426:1: ruleOperatorOr returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleOperatorOr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:5432:2: ( (enumLiteral_0= '||' ) )
            // InternalBehavior.g:5433:2: (enumLiteral_0= '||' )
            {
            // InternalBehavior.g:5433:2: (enumLiteral_0= '||' )
            // InternalBehavior.g:5434:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

            			current = grammarAccess.getOperatorOrAccess().getOrEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperatorOrAccess().getOrEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOperatorOr"


    // $ANTLR start "ruleOperatorAnd"
    // InternalBehavior.g:5443:1: ruleOperatorAnd returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleOperatorAnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalBehavior.g:5449:2: ( (enumLiteral_0= '&&' ) )
            // InternalBehavior.g:5450:2: (enumLiteral_0= '&&' )
            {
            // InternalBehavior.g:5450:2: (enumLiteral_0= '&&' )
            // InternalBehavior.g:5451:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

            			current = grammarAccess.getOperatorAndAccess().getAndEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOperatorAndAccess().getAndEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleOperatorAnd"


    // $ANTLR start "ruleOperatorEquality"
    // InternalBehavior.g:5460:1: ruleOperatorEquality returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleOperatorEquality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBehavior.g:5466:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // InternalBehavior.g:5467:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // InternalBehavior.g:5467:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==99) ) {
                alt112=1;
            }
            else if ( (LA112_0==100) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalBehavior.g:5468:3: (enumLiteral_0= '==' )
                    {
                    // InternalBehavior.g:5468:3: (enumLiteral_0= '==' )
                    // InternalBehavior.g:5469:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getOperatorEqualityAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorEqualityAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5476:3: (enumLiteral_1= '!=' )
                    {
                    // InternalBehavior.g:5476:3: (enumLiteral_1= '!=' )
                    // InternalBehavior.g:5477:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getOperatorEqualityAccess().getUnequalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorEqualityAccess().getUnequalEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperatorEquality"


    // $ANTLR start "ruleOperatorRelational"
    // InternalBehavior.g:5487:1: ruleOperatorRelational returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) ;
    public final Enumerator ruleOperatorRelational() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBehavior.g:5493:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) ) )
            // InternalBehavior.g:5494:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            {
            // InternalBehavior.g:5494:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt113=1;
                }
                break;
            case 102:
                {
                alt113=2;
                }
                break;
            case 103:
                {
                alt113=3;
                }
                break;
            case 104:
                {
                alt113=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalBehavior.g:5495:3: (enumLiteral_0= '<' )
                    {
                    // InternalBehavior.g:5495:3: (enumLiteral_0= '<' )
                    // InternalBehavior.g:5496:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getOperatorRelationalAccess().getSmallerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorRelationalAccess().getSmallerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5503:3: (enumLiteral_1= '<=' )
                    {
                    // InternalBehavior.g:5503:3: (enumLiteral_1= '<=' )
                    // InternalBehavior.g:5504:4: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getOperatorRelationalAccess().getSmallerOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorRelationalAccess().getSmallerOrEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBehavior.g:5511:3: (enumLiteral_2= '>=' )
                    {
                    // InternalBehavior.g:5511:3: (enumLiteral_2= '>=' )
                    // InternalBehavior.g:5512:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getOperatorRelationalAccess().getGreaterOrEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorRelationalAccess().getGreaterOrEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBehavior.g:5519:3: (enumLiteral_3= '>' )
                    {
                    // InternalBehavior.g:5519:3: (enumLiteral_3= '>' )
                    // InternalBehavior.g:5520:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getOperatorRelationalAccess().getGreaterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorRelationalAccess().getGreaterEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOperatorRelational"


    // $ANTLR start "ruleOperatorAdditive"
    // InternalBehavior.g:5530:1: ruleOperatorAdditive returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOperatorAdditive() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBehavior.g:5536:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalBehavior.g:5537:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalBehavior.g:5537:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==105) ) {
                alt114=1;
            }
            else if ( (LA114_0==57) ) {
                alt114=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }
            switch (alt114) {
                case 1 :
                    // InternalBehavior.g:5538:3: (enumLiteral_0= '+' )
                    {
                    // InternalBehavior.g:5538:3: (enumLiteral_0= '+' )
                    // InternalBehavior.g:5539:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAdditiveAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAdditiveAccess().getAdditionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5546:3: (enumLiteral_1= '-' )
                    {
                    // InternalBehavior.g:5546:3: (enumLiteral_1= '-' )
                    // InternalBehavior.g:5547:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAdditiveAccess().getSubtractionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAdditiveAccess().getSubtractionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperatorAdditive"


    // $ANTLR start "ruleOperatorMultiplicative"
    // InternalBehavior.g:5557:1: ruleOperatorMultiplicative returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleOperatorMultiplicative() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBehavior.g:5563:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // InternalBehavior.g:5564:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // InternalBehavior.g:5564:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==80) ) {
                alt115=1;
            }
            else if ( (LA115_0==106) ) {
                alt115=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalBehavior.g:5565:3: (enumLiteral_0= '*' )
                    {
                    // InternalBehavior.g:5565:3: (enumLiteral_0= '*' )
                    // InternalBehavior.g:5566:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getOperatorMultiplicativeAccess().getMultiplicationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorMultiplicativeAccess().getMultiplicationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5573:3: (enumLiteral_1= '/' )
                    {
                    // InternalBehavior.g:5573:3: (enumLiteral_1= '/' )
                    // InternalBehavior.g:5574:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getOperatorMultiplicativeAccess().getDivisionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorMultiplicativeAccess().getDivisionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperatorMultiplicative"


    // $ANTLR start "ruleOperatorUnary"
    // InternalBehavior.g:5584:1: ruleOperatorUnary returns [Enumerator current=null] : ( (enumLiteral_0= '!' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOperatorUnary() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBehavior.g:5590:2: ( ( (enumLiteral_0= '!' ) | (enumLiteral_1= '-' ) ) )
            // InternalBehavior.g:5591:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '-' ) )
            {
            // InternalBehavior.g:5591:2: ( (enumLiteral_0= '!' ) | (enumLiteral_1= '-' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==107) ) {
                alt116=1;
            }
            else if ( (LA116_0==57) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalBehavior.g:5592:3: (enumLiteral_0= '!' )
                    {
                    // InternalBehavior.g:5592:3: (enumLiteral_0= '!' )
                    // InternalBehavior.g:5593:4: enumLiteral_0= '!'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getOperatorUnaryAccess().getNegationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorUnaryAccess().getNegationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBehavior.g:5600:3: (enumLiteral_1= '-' )
                    {
                    // InternalBehavior.g:5600:3: (enumLiteral_1= '-' )
                    // InternalBehavior.g:5601:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperatorUnaryAccess().getSubtractionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorUnaryAccess().getSubtractionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperatorUnary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000A00L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006001C80000L,0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0040000000200010L,0x00000001FFF80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0040000000300010L,0x00000001FFF80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006001C00000L,0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010300000L,0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000006001800000L,0x0000000000000200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300010L,0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006001000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000240010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0200000002000370L,0x0000080000060000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040001000000010L,0x00000001FFF80000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000240080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000010L,0x00000001FFF80000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000700000200000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000E000010200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x000C000010200000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000010200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0280000000000020L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0300000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2400000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x8400000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000003L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0040000000200010L,0x00000001FFF80200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0200000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000040000010000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000400L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000100000L,0x0000000000004000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}