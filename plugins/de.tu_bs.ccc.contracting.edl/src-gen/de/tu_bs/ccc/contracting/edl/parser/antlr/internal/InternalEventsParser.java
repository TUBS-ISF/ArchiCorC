package de.tu_bs.ccc.contracting.edl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tu_bs.ccc.contracting.edl.services.EventsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANNOTATION_STRING", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'EventType'", "'{'", "','", "'}'", "'='", "'default'", "'/*'", "'*/'", "'import'", "'from'", "'model'", "'.'", "'*'"
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

        public InternalEventsParser(TokenStream input, EventsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EventsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEvents.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEvents.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEvents.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEvents.g:71:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_eventCollection_4_0= ruleEventType ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_eventCollection_4_0 = null;



        	enterRule();

        try {
            // InternalEvents.g:77:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_eventCollection_4_0= ruleEventType ) )* ) )
            // InternalEvents.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_eventCollection_4_0= ruleEventType ) )* )
            {
            // InternalEvents.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_eventCollection_4_0= ruleEventType ) )* )
            // InternalEvents.g:79:3: () otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_eventCollection_4_0= ruleEventType ) )*
            {
            // InternalEvents.g:79:3: ()
            // InternalEvents.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getPackageKeyword_1());
            		
            // InternalEvents.g:90:3: ( (lv_name_2_0= ruleFQN ) )
            // InternalEvents.g:91:4: (lv_name_2_0= ruleFQN )
            {
            // InternalEvents.g:91:4: (lv_name_2_0= ruleFQN )
            // InternalEvents.g:92:5: lv_name_2_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameFQNParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.tu_bs.ccc.contracting.edl.Events.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvents.g:109:3: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEvents.g:110:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalEvents.g:110:4: (lv_imports_3_0= ruleImport )
            	    // InternalEvents.g:111:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"de.tu_bs.ccc.contracting.edl.Events.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEvents.g:128:3: ( (lv_eventCollection_4_0= ruleEventType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEvents.g:129:4: (lv_eventCollection_4_0= ruleEventType )
            	    {
            	    // InternalEvents.g:129:4: (lv_eventCollection_4_0= ruleEventType )
            	    // InternalEvents.g:130:5: lv_eventCollection_4_0= ruleEventType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEventCollectionEventTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_eventCollection_4_0=ruleEventType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventCollection",
            	    						lv_eventCollection_4_0,
            	    						"de.tu_bs.ccc.contracting.edl.Events.EventType");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEventType"
    // InternalEvents.g:151:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // InternalEvents.g:151:50: (iv_ruleEventType= ruleEventType EOF )
            // InternalEvents.g:152:2: iv_ruleEventType= ruleEventType EOF
            {
             newCompositeNode(grammarAccess.getEventTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventType=ruleEventType();

            state._fsp--;

             current =iv_ruleEventType; 
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
    // $ANTLR end "entryRuleEventType"


    // $ANTLR start "ruleEventType"
    // InternalEvents.g:158:1: ruleEventType returns [EObject current=null] : ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'EventType' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleEventType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_comment_1_0 = null;

        EObject lv_events_5_0 = null;

        EObject lv_events_7_0 = null;



        	enterRule();

        try {
            // InternalEvents.g:164:2: ( ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'EventType' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' ) )
            // InternalEvents.g:165:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'EventType' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )
            {
            // InternalEvents.g:165:2: ( () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'EventType' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}' )
            // InternalEvents.g:166:3: () ( (lv_comment_1_0= ruleAnnotationBlock ) )? otherlv_2= 'EventType' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_events_5_0= ruleEvent ) ) (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )* otherlv_8= '}'
            {
            // InternalEvents.g:166:3: ()
            // InternalEvents.g:167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventTypeAccess().getEventTypeAction_0(),
            					current);
            			

            }

            // InternalEvents.g:173:3: ( (lv_comment_1_0= ruleAnnotationBlock ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEvents.g:174:4: (lv_comment_1_0= ruleAnnotationBlock )
                    {
                    // InternalEvents.g:174:4: (lv_comment_1_0= ruleAnnotationBlock )
                    // InternalEvents.g:175:5: lv_comment_1_0= ruleAnnotationBlock
                    {

                    					newCompositeNode(grammarAccess.getEventTypeAccess().getCommentAnnotationBlockParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_comment_1_0=ruleAnnotationBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEventTypeRule());
                    					}
                    					set(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"de.tu_bs.ccc.contracting.edl.Events.AnnotationBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEventTypeAccess().getEventTypeKeyword_2());
            		
            // InternalEvents.g:196:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEvents.g:197:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalEvents.g:197:4: (lv_name_3_0= RULE_ID )
                    // InternalEvents.g:198:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getEventTypeAccess().getNameIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEventTypeRule());
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

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEvents.g:218:3: ( (lv_events_5_0= ruleEvent ) )
            // InternalEvents.g:219:4: (lv_events_5_0= ruleEvent )
            {
            // InternalEvents.g:219:4: (lv_events_5_0= ruleEvent )
            // InternalEvents.g:220:5: lv_events_5_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_events_5_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventTypeRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_5_0,
            						"de.tu_bs.ccc.contracting.edl.Events.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEvents.g:237:3: (otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEvents.g:238:4: otherlv_6= ',' ( (lv_events_7_0= ruleEvent ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEventTypeAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalEvents.g:242:4: ( (lv_events_7_0= ruleEvent ) )
            	    // InternalEvents.g:243:5: (lv_events_7_0= ruleEvent )
            	    {
            	    // InternalEvents.g:243:5: (lv_events_7_0= ruleEvent )
            	    // InternalEvents.g:244:6: lv_events_7_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_events_7_0=ruleEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_7_0,
            	    							"de.tu_bs.ccc.contracting.edl.Events.Event");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleEvent"
    // InternalEvents.g:270:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEvents.g:270:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEvents.g:271:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalEvents.g:277:1: ruleEvent returns [EObject current=null] : ( ( (lv_element_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_element_0_0=null;
        Token otherlv_1=null;
        Token lv_default_2_0=null;


        	enterRule();

        try {
            // InternalEvents.g:283:2: ( ( ( (lv_element_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )? ) )
            // InternalEvents.g:284:2: ( ( (lv_element_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )? )
            {
            // InternalEvents.g:284:2: ( ( (lv_element_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )? )
            // InternalEvents.g:285:3: ( (lv_element_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )?
            {
            // InternalEvents.g:285:3: ( (lv_element_0_0= RULE_ID ) )
            // InternalEvents.g:286:4: (lv_element_0_0= RULE_ID )
            {
            // InternalEvents.g:286:4: (lv_element_0_0= RULE_ID )
            // InternalEvents.g:287:5: lv_element_0_0= RULE_ID
            {
            lv_element_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_element_0_0, grammarAccess.getEventAccess().getElementIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"element",
            						lv_element_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEvents.g:303:3: (otherlv_1= '=' ( (lv_default_2_0= 'default' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEvents.g:304:4: otherlv_1= '=' ( (lv_default_2_0= 'default' ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEqualsSignKeyword_1_0());
                    			
                    // InternalEvents.g:308:4: ( (lv_default_2_0= 'default' ) )
                    // InternalEvents.g:309:5: (lv_default_2_0= 'default' )
                    {
                    // InternalEvents.g:309:5: (lv_default_2_0= 'default' )
                    // InternalEvents.g:310:6: lv_default_2_0= 'default'
                    {
                    lv_default_2_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_default_2_0, grammarAccess.getEventAccess().getDefaultDefaultKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAnnotationBlock"
    // InternalEvents.g:327:1: entryRuleAnnotationBlock returns [EObject current=null] : iv_ruleAnnotationBlock= ruleAnnotationBlock EOF ;
    public final EObject entryRuleAnnotationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationBlock = null;


        try {
            // InternalEvents.g:327:56: (iv_ruleAnnotationBlock= ruleAnnotationBlock EOF )
            // InternalEvents.g:328:2: iv_ruleAnnotationBlock= ruleAnnotationBlock EOF
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
    // InternalEvents.g:334:1: ruleAnnotationBlock returns [EObject current=null] : (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' ) ;
    public final EObject ruleAnnotationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalEvents.g:340:2: ( (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' ) )
            // InternalEvents.g:341:2: (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' )
            {
            // InternalEvents.g:341:2: (otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/' )
            // InternalEvents.g:342:3: otherlv_0= '/*' ( (lv_elements_1_0= ruleAnnotation ) )+ otherlv_2= '*/'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnotationBlockAccess().getSolidusAsteriskKeyword_0());
            		
            // InternalEvents.g:346:3: ( (lv_elements_1_0= ruleAnnotation ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ANNOTATION_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEvents.g:347:4: (lv_elements_1_0= ruleAnnotation )
            	    {
            	    // InternalEvents.g:347:4: (lv_elements_1_0= ruleAnnotation )
            	    // InternalEvents.g:348:5: lv_elements_1_0= ruleAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getAnnotationBlockAccess().getElementsAnnotationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_elements_1_0=ruleAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnotationBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"de.tu_bs.ccc.contracting.edl.Events.Annotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalEvents.g:373:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalEvents.g:373:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalEvents.g:374:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalEvents.g:380:1: ruleAnnotation returns [EObject current=null] : ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_rawText_0_0=null;


        	enterRule();

        try {
            // InternalEvents.g:386:2: ( ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) ) )
            // InternalEvents.g:387:2: ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) )
            {
            // InternalEvents.g:387:2: ( (lv_rawText_0_0= RULE_ANNOTATION_STRING ) )
            // InternalEvents.g:388:3: (lv_rawText_0_0= RULE_ANNOTATION_STRING )
            {
            // InternalEvents.g:388:3: (lv_rawText_0_0= RULE_ANNOTATION_STRING )
            // InternalEvents.g:389:4: lv_rawText_0_0= RULE_ANNOTATION_STRING
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
            					"de.tu_bs.ccc.contracting.edl.Events.ANNOTATION_STRING");
            			

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
    // InternalEvents.g:408:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalEvents.g:408:47: (iv_ruleImport= ruleImport EOF )
            // InternalEvents.g:409:2: iv_ruleImport= ruleImport EOF
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
    // InternalEvents.g:415:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_importURI_4_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalEvents.g:421:2: ( (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) ) )
            // InternalEvents.g:422:2: (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) )
            {
            // InternalEvents.g:422:2: (otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) ) )
            // InternalEvents.g:423:3: otherlv_0= 'import' ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' ) ( (lv_importURI_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalEvents.g:427:3: ( ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' ) | otherlv_3= 'model' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEvents.g:428:4: ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' )
                    {
                    // InternalEvents.g:428:4: ( ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from' )
                    // InternalEvents.g:429:5: ( (lv_importedNamespace_1_0= ruleImportedFQN ) ) otherlv_2= 'from'
                    {
                    // InternalEvents.g:429:5: ( (lv_importedNamespace_1_0= ruleImportedFQN ) )
                    // InternalEvents.g:430:6: (lv_importedNamespace_1_0= ruleImportedFQN )
                    {
                    // InternalEvents.g:430:6: (lv_importedNamespace_1_0= ruleImportedFQN )
                    // InternalEvents.g:431:7: lv_importedNamespace_1_0= ruleImportedFQN
                    {

                    							newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceImportedFQNParserRuleCall_1_0_0_0());
                    						
                    pushFollow(FOLLOW_15);
                    lv_importedNamespace_1_0=ruleImportedFQN();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImportRule());
                    							}
                    							set(
                    								current,
                    								"importedNamespace",
                    								lv_importedNamespace_1_0,
                    								"de.tu_bs.ccc.contracting.edl.Events.ImportedFQN");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_16); 

                    					newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalEvents.g:454:4: otherlv_3= 'model'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getImportAccess().getModelKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalEvents.g:459:3: ( (lv_importURI_4_0= RULE_STRING ) )
            // InternalEvents.g:460:4: (lv_importURI_4_0= RULE_STRING )
            {
            // InternalEvents.g:460:4: (lv_importURI_4_0= RULE_STRING )
            // InternalEvents.g:461:5: lv_importURI_4_0= RULE_STRING
            {
            lv_importURI_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalEvents.g:481:1: entryRuleImportedFQN returns [String current=null] : iv_ruleImportedFQN= ruleImportedFQN EOF ;
    public final String entryRuleImportedFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportedFQN = null;


        try {
            // InternalEvents.g:481:51: (iv_ruleImportedFQN= ruleImportedFQN EOF )
            // InternalEvents.g:482:2: iv_ruleImportedFQN= ruleImportedFQN EOF
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
    // InternalEvents.g:488:1: ruleImportedFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportedFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalEvents.g:494:2: ( (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? ) )
            // InternalEvents.g:495:2: (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? )
            {
            // InternalEvents.g:495:2: (this_FQN_0= ruleFQN (kw= '.' kw= '*' )? )
            // InternalEvents.g:496:3: this_FQN_0= ruleFQN (kw= '.' kw= '*' )?
            {

            			newCompositeNode(grammarAccess.getImportedFQNAccess().getFQNParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_FQN_0=ruleFQN();

            state._fsp--;


            			current.merge(this_FQN_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalEvents.g:506:3: (kw= '.' kw= '*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEvents.g:507:4: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,24,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImportedFQNAccess().getFullStopKeyword_1_0());
                    			
                    kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEvents.g:522:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalEvents.g:522:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalEvents.g:523:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalEvents.g:529:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEvents.g:535:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEvents.g:536:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEvents.g:536:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEvents.g:537:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalEvents.g:544:3: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalEvents.g:545:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000282002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});

}