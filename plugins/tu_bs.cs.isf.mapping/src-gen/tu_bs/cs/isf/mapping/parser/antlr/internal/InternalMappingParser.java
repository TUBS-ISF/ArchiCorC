package tu_bs.cs.isf.mapping.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tu_bs.cs.isf.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", 
		"RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'->'", 
		"'.'", "'/'", "';'", "'author:'", "'bundle:'", "'date:'", "'export'", 
		"'import'", "'map'", "'null'", "'version:'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_ID=5;
	public static final int RULE_INT=6;
	public static final int RULE_ML_COMMENT=7;
	public static final int RULE_SL_COMMENT=8;
	public static final int RULE_STRING=9;
	public static final int RULE_WS=10;

	// delegates
	public AbstractInternalAntlrParser[] getDelegates() {
		return new AbstractInternalAntlrParser[] {};
	}

	// delegators


	public InternalMappingParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalMappingParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalMappingParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalMapping.g"; }



	 	private MappingGrammarAccess grammarAccess;

	    public InternalMappingParser(TokenStream input, MappingGrammarAccess grammarAccess) {
	        this(input);
	        this.grammarAccess = grammarAccess;
	        registerRules(grammarAccess.getGrammar());
	    }

	    @Override
	    protected String getFirstRuleName() {
	    	return "MappingModel";
	   	}

	   	@Override
	   	protected MappingGrammarAccess getGrammarAccess() {
	   		return grammarAccess;
	   	}




	// $ANTLR start "entryRuleMappingModel"
	// InternalMapping.g:64:1: entryRuleMappingModel returns [EObject current=null] :iv_ruleMappingModel= ruleMappingModel EOF ;
	public final EObject entryRuleMappingModel() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleMappingModel =null;

		try {
			// InternalMapping.g:64:53: (iv_ruleMappingModel= ruleMappingModel EOF )
			// InternalMapping.g:65:2: iv_ruleMappingModel= ruleMappingModel EOF
			{
			 newCompositeNode(grammarAccess.getMappingModelRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleMappingModel=ruleMappingModel();
			state._fsp--;

			 current =iv_ruleMappingModel; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleMappingModel"



	// $ANTLR start "ruleMappingModel"
	// InternalMapping.g:71:1: ruleMappingModel returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_imports_2_0= ruleImport ) )* ( (lv_mappings_3_0= ruleMapping ) )* ) ;
	public final EObject ruleMappingModel() throws RecognitionException {
		EObject current = null;


		EObject lv_annotations_1_0 =null;
		EObject lv_imports_2_0 =null;
		EObject lv_mappings_3_0 =null;


			enterRule();

		try {
			// InternalMapping.g:77:2: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_imports_2_0= ruleImport ) )* ( (lv_mappings_3_0= ruleMapping ) )* ) )
			// InternalMapping.g:78:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_imports_2_0= ruleImport ) )* ( (lv_mappings_3_0= ruleMapping ) )* )
			{
			// InternalMapping.g:78:2: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_imports_2_0= ruleImport ) )* ( (lv_mappings_3_0= ruleMapping ) )* )
			// InternalMapping.g:79:3: () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_imports_2_0= ruleImport ) )* ( (lv_mappings_3_0= ruleMapping ) )*
			{
			// InternalMapping.g:79:3: ()
			// InternalMapping.g:80:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getMappingModelAccess().getMappingModelAction_0(),
								current);
						
			}

			// InternalMapping.g:86:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 15 && LA1_0 <= 17)||LA1_0==22) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalMapping.g:87:4: (lv_annotations_1_0= ruleAnnotation )
					{
					// InternalMapping.g:87:4: (lv_annotations_1_0= ruleAnnotation )
					// InternalMapping.g:88:5: lv_annotations_1_0= ruleAnnotation
					{

										newCompositeNode(grammarAccess.getMappingModelAccess().getAnnotationsAnnotationParserRuleCall_1_0());
									
					pushFollow(FOLLOW_3);
					lv_annotations_1_0=ruleAnnotation();
					state._fsp--;


										if (current==null) {
											current = createModelElementForParent(grammarAccess.getMappingModelRule());
										}
										add(
											current,
											"annotations",
											lv_annotations_1_0,
											"tu_bs.cs.isf.mapping.Mapping.Annotation");
										afterParserOrEnumRuleCall();
									
					}

					}
					break;

				default :
					break loop1;
				}
			}

			// InternalMapping.g:105:3: ( (lv_imports_2_0= ruleImport ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==19) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// InternalMapping.g:106:4: (lv_imports_2_0= ruleImport )
					{
					// InternalMapping.g:106:4: (lv_imports_2_0= ruleImport )
					// InternalMapping.g:107:5: lv_imports_2_0= ruleImport
					{

										newCompositeNode(grammarAccess.getMappingModelAccess().getImportsImportParserRuleCall_2_0());
									
					pushFollow(FOLLOW_4);
					lv_imports_2_0=ruleImport();
					state._fsp--;


										if (current==null) {
											current = createModelElementForParent(grammarAccess.getMappingModelRule());
										}
										add(
											current,
											"imports",
											lv_imports_2_0,
											"tu_bs.cs.isf.mapping.Mapping.Import");
										afterParserOrEnumRuleCall();
									
					}

					}
					break;

				default :
					break loop2;
				}
			}

			// InternalMapping.g:124:3: ( (lv_mappings_3_0= ruleMapping ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==20) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// InternalMapping.g:125:4: (lv_mappings_3_0= ruleMapping )
					{
					// InternalMapping.g:125:4: (lv_mappings_3_0= ruleMapping )
					// InternalMapping.g:126:5: lv_mappings_3_0= ruleMapping
					{

										newCompositeNode(grammarAccess.getMappingModelAccess().getMappingsMappingParserRuleCall_3_0());
									
					pushFollow(FOLLOW_5);
					lv_mappings_3_0=ruleMapping();
					state._fsp--;


										if (current==null) {
											current = createModelElementForParent(grammarAccess.getMappingModelRule());
										}
										add(
											current,
											"mappings",
											lv_mappings_3_0,
											"tu_bs.cs.isf.mapping.Mapping.Mapping");
										afterParserOrEnumRuleCall();
									
					}

					}
					break;

				default :
					break loop3;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleMappingModel"



	// $ANTLR start "entryRuleAnnotation"
	// InternalMapping.g:147:1: entryRuleAnnotation returns [EObject current=null] :iv_ruleAnnotation= ruleAnnotation EOF ;
	public final EObject entryRuleAnnotation() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAnnotation =null;

		try {
			// InternalMapping.g:147:51: (iv_ruleAnnotation= ruleAnnotation EOF )
			// InternalMapping.g:148:2: iv_ruleAnnotation= ruleAnnotation EOF
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleAnnotation"



	// $ANTLR start "ruleAnnotation"
	// InternalMapping.g:154:1: ruleAnnotation returns [EObject current=null] : ( ( () ( (lv_annotation_1_0= ruleVersion ) ) ) |this_Bundle_2= ruleBundle |this_Date_3= ruleDate |this_Author_4= ruleAuthor ) ;
	public final EObject ruleAnnotation() throws RecognitionException {
		EObject current = null;


		EObject lv_annotation_1_0 =null;
		EObject this_Bundle_2 =null;
		EObject this_Date_3 =null;
		EObject this_Author_4 =null;


			enterRule();

		try {
			// InternalMapping.g:160:2: ( ( ( () ( (lv_annotation_1_0= ruleVersion ) ) ) |this_Bundle_2= ruleBundle |this_Date_3= ruleDate |this_Author_4= ruleAuthor ) )
			// InternalMapping.g:161:2: ( ( () ( (lv_annotation_1_0= ruleVersion ) ) ) |this_Bundle_2= ruleBundle |this_Date_3= ruleDate |this_Author_4= ruleAuthor )
			{
			// InternalMapping.g:161:2: ( ( () ( (lv_annotation_1_0= ruleVersion ) ) ) |this_Bundle_2= ruleBundle |this_Date_3= ruleDate |this_Author_4= ruleAuthor )
			int alt4=4;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt4=1;
				}
				break;
			case 16:
				{
				alt4=2;
				}
				break;
			case 17:
				{
				alt4=3;
				}
				break;
			case 15:
				{
				alt4=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// InternalMapping.g:162:3: ( () ( (lv_annotation_1_0= ruleVersion ) ) )
					{
					// InternalMapping.g:162:3: ( () ( (lv_annotation_1_0= ruleVersion ) ) )
					// InternalMapping.g:163:4: () ( (lv_annotation_1_0= ruleVersion ) )
					{
					// InternalMapping.g:163:4: ()
					// InternalMapping.g:164:5: 
					{

										current = forceCreateModelElement(
											grammarAccess.getAnnotationAccess().getAnnotationAction_0_0(),
											current);
									
					}

					// InternalMapping.g:170:4: ( (lv_annotation_1_0= ruleVersion ) )
					// InternalMapping.g:171:5: (lv_annotation_1_0= ruleVersion )
					{
					// InternalMapping.g:171:5: (lv_annotation_1_0= ruleVersion )
					// InternalMapping.g:172:6: lv_annotation_1_0= ruleVersion
					{

											newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationVersionParserRuleCall_0_1_0());
										
					pushFollow(FOLLOW_2);
					lv_annotation_1_0=ruleVersion();
					state._fsp--;


											if (current==null) {
												current = createModelElementForParent(grammarAccess.getAnnotationRule());
											}
											set(
												current,
												"annotation",
												lv_annotation_1_0,
												"tu_bs.cs.isf.mapping.Mapping.Version");
											afterParserOrEnumRuleCall();
										
					}

					}

					}

					}
					break;
				case 2 :
					// InternalMapping.g:191:3: this_Bundle_2= ruleBundle
					{

								newCompositeNode(grammarAccess.getAnnotationAccess().getBundleParserRuleCall_1());
							
					pushFollow(FOLLOW_2);
					this_Bundle_2=ruleBundle();
					state._fsp--;


								current = this_Bundle_2;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 3 :
					// InternalMapping.g:200:3: this_Date_3= ruleDate
					{

								newCompositeNode(grammarAccess.getAnnotationAccess().getDateParserRuleCall_2());
							
					pushFollow(FOLLOW_2);
					this_Date_3=ruleDate();
					state._fsp--;


								current = this_Date_3;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 4 :
					// InternalMapping.g:209:3: this_Author_4= ruleAuthor
					{

								newCompositeNode(grammarAccess.getAnnotationAccess().getAuthorParserRuleCall_3());
							
					pushFollow(FOLLOW_2);
					this_Author_4=ruleAuthor();
					state._fsp--;


								current = this_Author_4;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleAnnotation"



	// $ANTLR start "entryRuleVersion"
	// InternalMapping.g:221:1: entryRuleVersion returns [EObject current=null] :iv_ruleVersion= ruleVersion EOF ;
	public final EObject entryRuleVersion() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleVersion =null;

		try {
			// InternalMapping.g:221:48: (iv_ruleVersion= ruleVersion EOF )
			// InternalMapping.g:222:2: iv_ruleVersion= ruleVersion EOF
			{
			 newCompositeNode(grammarAccess.getVersionRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleVersion=ruleVersion();
			state._fsp--;

			 current =iv_ruleVersion; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleVersion"



	// $ANTLR start "ruleVersion"
	// InternalMapping.g:228:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version:' ( (lv_name_1_0= ruleEString ) ) ) ;
	public final EObject ruleVersion() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:234:2: ( (otherlv_0= 'version:' ( (lv_name_1_0= ruleEString ) ) ) )
			// InternalMapping.g:235:2: (otherlv_0= 'version:' ( (lv_name_1_0= ruleEString ) ) )
			{
			// InternalMapping.g:235:2: (otherlv_0= 'version:' ( (lv_name_1_0= ruleEString ) ) )
			// InternalMapping.g:236:3: otherlv_0= 'version:' ( (lv_name_1_0= ruleEString ) )
			{
			otherlv_0=(Token)match(input,22,FOLLOW_6); 

						newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
					
			// InternalMapping.g:240:3: ( (lv_name_1_0= ruleEString ) )
			// InternalMapping.g:241:4: (lv_name_1_0= ruleEString )
			{
			// InternalMapping.g:241:4: (lv_name_1_0= ruleEString )
			// InternalMapping.g:242:5: lv_name_1_0= ruleEString
			{

								newCompositeNode(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_1_0());
							
			pushFollow(FOLLOW_2);
			lv_name_1_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getVersionRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleVersion"



	// $ANTLR start "entryRuleBundle"
	// InternalMapping.g:263:1: entryRuleBundle returns [EObject current=null] :iv_ruleBundle= ruleBundle EOF ;
	public final EObject entryRuleBundle() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleBundle =null;

		try {
			// InternalMapping.g:263:47: (iv_ruleBundle= ruleBundle EOF )
			// InternalMapping.g:264:2: iv_ruleBundle= ruleBundle EOF
			{
			 newCompositeNode(grammarAccess.getBundleRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleBundle=ruleBundle();
			state._fsp--;

			 current =iv_ruleBundle; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleBundle"



	// $ANTLR start "ruleBundle"
	// InternalMapping.g:270:1: ruleBundle returns [EObject current=null] : (otherlv_0= 'bundle:' ( (lv_name_1_0= ruleEString ) ) ) ;
	public final EObject ruleBundle() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:276:2: ( (otherlv_0= 'bundle:' ( (lv_name_1_0= ruleEString ) ) ) )
			// InternalMapping.g:277:2: (otherlv_0= 'bundle:' ( (lv_name_1_0= ruleEString ) ) )
			{
			// InternalMapping.g:277:2: (otherlv_0= 'bundle:' ( (lv_name_1_0= ruleEString ) ) )
			// InternalMapping.g:278:3: otherlv_0= 'bundle:' ( (lv_name_1_0= ruleEString ) )
			{
			otherlv_0=(Token)match(input,16,FOLLOW_6); 

						newLeafNode(otherlv_0, grammarAccess.getBundleAccess().getBundleKeyword_0());
					
			// InternalMapping.g:282:3: ( (lv_name_1_0= ruleEString ) )
			// InternalMapping.g:283:4: (lv_name_1_0= ruleEString )
			{
			// InternalMapping.g:283:4: (lv_name_1_0= ruleEString )
			// InternalMapping.g:284:5: lv_name_1_0= ruleEString
			{

								newCompositeNode(grammarAccess.getBundleAccess().getNameEStringParserRuleCall_1_0());
							
			pushFollow(FOLLOW_2);
			lv_name_1_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getBundleRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleBundle"



	// $ANTLR start "entryRuleDate"
	// InternalMapping.g:305:1: entryRuleDate returns [EObject current=null] :iv_ruleDate= ruleDate EOF ;
	public final EObject entryRuleDate() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleDate =null;

		try {
			// InternalMapping.g:305:45: (iv_ruleDate= ruleDate EOF )
			// InternalMapping.g:306:2: iv_ruleDate= ruleDate EOF
			{
			 newCompositeNode(grammarAccess.getDateRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleDate=ruleDate();
			state._fsp--;

			 current =iv_ruleDate; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleDate"



	// $ANTLR start "ruleDate"
	// InternalMapping.g:312:1: ruleDate returns [EObject current=null] : (otherlv_0= 'date:' ( (lv_name_1_0= ruleEString ) ) ) ;
	public final EObject ruleDate() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:318:2: ( (otherlv_0= 'date:' ( (lv_name_1_0= ruleEString ) ) ) )
			// InternalMapping.g:319:2: (otherlv_0= 'date:' ( (lv_name_1_0= ruleEString ) ) )
			{
			// InternalMapping.g:319:2: (otherlv_0= 'date:' ( (lv_name_1_0= ruleEString ) ) )
			// InternalMapping.g:320:3: otherlv_0= 'date:' ( (lv_name_1_0= ruleEString ) )
			{
			otherlv_0=(Token)match(input,17,FOLLOW_6); 

						newLeafNode(otherlv_0, grammarAccess.getDateAccess().getDateKeyword_0());
					
			// InternalMapping.g:324:3: ( (lv_name_1_0= ruleEString ) )
			// InternalMapping.g:325:4: (lv_name_1_0= ruleEString )
			{
			// InternalMapping.g:325:4: (lv_name_1_0= ruleEString )
			// InternalMapping.g:326:5: lv_name_1_0= ruleEString
			{

								newCompositeNode(grammarAccess.getDateAccess().getNameEStringParserRuleCall_1_0());
							
			pushFollow(FOLLOW_2);
			lv_name_1_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getDateRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleDate"



	// $ANTLR start "entryRuleAuthor"
	// InternalMapping.g:347:1: entryRuleAuthor returns [EObject current=null] :iv_ruleAuthor= ruleAuthor EOF ;
	public final EObject entryRuleAuthor() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleAuthor =null;

		try {
			// InternalMapping.g:347:47: (iv_ruleAuthor= ruleAuthor EOF )
			// InternalMapping.g:348:2: iv_ruleAuthor= ruleAuthor EOF
			{
			 newCompositeNode(grammarAccess.getAuthorRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleAuthor=ruleAuthor();
			state._fsp--;

			 current =iv_ruleAuthor; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleAuthor"



	// $ANTLR start "ruleAuthor"
	// InternalMapping.g:354:1: ruleAuthor returns [EObject current=null] : (otherlv_0= 'author:' ( (lv_name_1_0= ruleEString ) ) ) ;
	public final EObject ruleAuthor() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:360:2: ( (otherlv_0= 'author:' ( (lv_name_1_0= ruleEString ) ) ) )
			// InternalMapping.g:361:2: (otherlv_0= 'author:' ( (lv_name_1_0= ruleEString ) ) )
			{
			// InternalMapping.g:361:2: (otherlv_0= 'author:' ( (lv_name_1_0= ruleEString ) ) )
			// InternalMapping.g:362:3: otherlv_0= 'author:' ( (lv_name_1_0= ruleEString ) )
			{
			otherlv_0=(Token)match(input,15,FOLLOW_6); 

						newLeafNode(otherlv_0, grammarAccess.getAuthorAccess().getAuthorKeyword_0());
					
			// InternalMapping.g:366:3: ( (lv_name_1_0= ruleEString ) )
			// InternalMapping.g:367:4: (lv_name_1_0= ruleEString )
			{
			// InternalMapping.g:367:4: (lv_name_1_0= ruleEString )
			// InternalMapping.g:368:5: lv_name_1_0= ruleEString
			{

								newCompositeNode(grammarAccess.getAuthorAccess().getNameEStringParserRuleCall_1_0());
							
			pushFollow(FOLLOW_2);
			lv_name_1_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getAuthorRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleAuthor"



	// $ANTLR start "entryRuleImport"
	// InternalMapping.g:389:1: entryRuleImport returns [EObject current=null] :iv_ruleImport= ruleImport EOF ;
	public final EObject entryRuleImport() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleImport =null;

		try {
			// InternalMapping.g:389:47: (iv_ruleImport= ruleImport EOF )
			// InternalMapping.g:390:2: iv_ruleImport= ruleImport EOF
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleImport"



	// $ANTLR start "ruleImport"
	// InternalMapping.g:396:1: ruleImport returns [EObject current=null] : ( () otherlv_1= 'import' ( (lv_name_2_0= ruleEString ) ) ) ;
	public final EObject ruleImport() throws RecognitionException {
		EObject current = null;


		Token otherlv_1=null;
		AntlrDatatypeRuleToken lv_name_2_0 =null;


			enterRule();

		try {
			// InternalMapping.g:402:2: ( ( () otherlv_1= 'import' ( (lv_name_2_0= ruleEString ) ) ) )
			// InternalMapping.g:403:2: ( () otherlv_1= 'import' ( (lv_name_2_0= ruleEString ) ) )
			{
			// InternalMapping.g:403:2: ( () otherlv_1= 'import' ( (lv_name_2_0= ruleEString ) ) )
			// InternalMapping.g:404:3: () otherlv_1= 'import' ( (lv_name_2_0= ruleEString ) )
			{
			// InternalMapping.g:404:3: ()
			// InternalMapping.g:405:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getImportAccess().getImportAction_0(),
								current);
						
			}

			otherlv_1=(Token)match(input,19,FOLLOW_6); 

						newLeafNode(otherlv_1, grammarAccess.getImportAccess().getImportKeyword_1());
					
			// InternalMapping.g:415:3: ( (lv_name_2_0= ruleEString ) )
			// InternalMapping.g:416:4: (lv_name_2_0= ruleEString )
			{
			// InternalMapping.g:416:4: (lv_name_2_0= ruleEString )
			// InternalMapping.g:417:5: lv_name_2_0= ruleEString
			{

								newCompositeNode(grammarAccess.getImportAccess().getNameEStringParserRuleCall_2_0());
							
			pushFollow(FOLLOW_2);
			lv_name_2_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getImportRule());
								}
								set(
									current,
									"name",
									lv_name_2_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleImport"



	// $ANTLR start "entryRuleMapping"
	// InternalMapping.g:438:1: entryRuleMapping returns [EObject current=null] :iv_ruleMapping= ruleMapping EOF ;
	public final EObject entryRuleMapping() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleMapping =null;

		try {
			// InternalMapping.g:438:48: (iv_ruleMapping= ruleMapping EOF )
			// InternalMapping.g:439:2: iv_ruleMapping= ruleMapping EOF
			{
			 newCompositeNode(grammarAccess.getMappingRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleMapping=ruleMapping();
			state._fsp--;

			 current =iv_ruleMapping; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleMapping"



	// $ANTLR start "ruleMapping"
	// InternalMapping.g:445:1: ruleMapping returns [EObject current=null] : ( () otherlv_1= 'map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'export' )? ( (lv_component_5_0= ruleComponent ) ) otherlv_6= '}' ) ;
	public final EObject ruleMapping() throws RecognitionException {
		EObject current = null;


		Token otherlv_1=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_6=null;
		AntlrDatatypeRuleToken lv_name_2_0 =null;
		EObject lv_component_5_0 =null;


			enterRule();

		try {
			// InternalMapping.g:451:2: ( ( () otherlv_1= 'map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'export' )? ( (lv_component_5_0= ruleComponent ) ) otherlv_6= '}' ) )
			// InternalMapping.g:452:2: ( () otherlv_1= 'map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'export' )? ( (lv_component_5_0= ruleComponent ) ) otherlv_6= '}' )
			{
			// InternalMapping.g:452:2: ( () otherlv_1= 'map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'export' )? ( (lv_component_5_0= ruleComponent ) ) otherlv_6= '}' )
			// InternalMapping.g:453:3: () otherlv_1= 'map' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'export' )? ( (lv_component_5_0= ruleComponent ) ) otherlv_6= '}'
			{
			// InternalMapping.g:453:3: ()
			// InternalMapping.g:454:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getMappingAccess().getMappingAction_0(),
								current);
						
			}

			otherlv_1=(Token)match(input,20,FOLLOW_6); 

						newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getMapKeyword_1());
					
			// InternalMapping.g:464:3: ( (lv_name_2_0= ruleEString ) )
			// InternalMapping.g:465:4: (lv_name_2_0= ruleEString )
			{
			// InternalMapping.g:465:4: (lv_name_2_0= ruleEString )
			// InternalMapping.g:466:5: lv_name_2_0= ruleEString
			{

								newCompositeNode(grammarAccess.getMappingAccess().getNameEStringParserRuleCall_2_0());
							
			pushFollow(FOLLOW_7);
			lv_name_2_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getMappingRule());
								}
								set(
									current,
									"name",
									lv_name_2_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_3=(Token)match(input,23,FOLLOW_8); 

						newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3());
					
			// InternalMapping.g:487:3: (otherlv_4= 'export' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==18) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// InternalMapping.g:488:4: otherlv_4= 'export'
					{
					otherlv_4=(Token)match(input,18,FOLLOW_6); 

									newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getExportKeyword_4());
								
					}
					break;

			}

			// InternalMapping.g:493:3: ( (lv_component_5_0= ruleComponent ) )
			// InternalMapping.g:494:4: (lv_component_5_0= ruleComponent )
			{
			// InternalMapping.g:494:4: (lv_component_5_0= ruleComponent )
			// InternalMapping.g:495:5: lv_component_5_0= ruleComponent
			{

								newCompositeNode(grammarAccess.getMappingAccess().getComponentComponentParserRuleCall_5_0());
							
			pushFollow(FOLLOW_9);
			lv_component_5_0=ruleComponent();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getMappingRule());
								}
								set(
									current,
									"component",
									lv_component_5_0,
									"tu_bs.cs.isf.mapping.Mapping.Component");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_6=(Token)match(input,24,FOLLOW_2); 

						newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleMapping"



	// $ANTLR start "entryRuleComponent"
	// InternalMapping.g:520:1: entryRuleComponent returns [EObject current=null] :iv_ruleComponent= ruleComponent EOF ;
	public final EObject entryRuleComponent() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleComponent =null;

		try {
			// InternalMapping.g:520:50: (iv_ruleComponent= ruleComponent EOF )
			// InternalMapping.g:521:2: iv_ruleComponent= ruleComponent EOF
			{
			 newCompositeNode(grammarAccess.getComponentRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleComponent=ruleComponent();
			state._fsp--;

			 current =iv_ruleComponent; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleComponent"



	// $ANTLR start "ruleComponent"
	// InternalMapping.g:527:1: ruleComponent returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_mappingPair_3_0= ruleMappingPair ) )* otherlv_4= '}' ) ;
	public final EObject ruleComponent() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		Token otherlv_4=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;
		EObject lv_mappingPair_3_0 =null;


			enterRule();

		try {
			// InternalMapping.g:533:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_mappingPair_3_0= ruleMappingPair ) )* otherlv_4= '}' ) )
			// InternalMapping.g:534:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_mappingPair_3_0= ruleMappingPair ) )* otherlv_4= '}' )
			{
			// InternalMapping.g:534:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_mappingPair_3_0= ruleMappingPair ) )* otherlv_4= '}' )
			// InternalMapping.g:535:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_mappingPair_3_0= ruleMappingPair ) )* otherlv_4= '}'
			{
			// InternalMapping.g:535:3: ()
			// InternalMapping.g:536:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getComponentAccess().getComponentAction_0(),
								current);
						
			}

			// InternalMapping.g:542:3: ( (lv_name_1_0= ruleEString ) )
			// InternalMapping.g:543:4: (lv_name_1_0= ruleEString )
			{
			// InternalMapping.g:543:4: (lv_name_1_0= ruleEString )
			// InternalMapping.g:544:5: lv_name_1_0= ruleEString
			{

								newCompositeNode(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0());
							
			pushFollow(FOLLOW_7);
			lv_name_1_0=ruleEString();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getComponentRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.EString");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_2=(Token)match(input,23,FOLLOW_10); 

						newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
					
			// InternalMapping.g:565:3: ( (lv_mappingPair_3_0= ruleMappingPair ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==RULE_ID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// InternalMapping.g:566:4: (lv_mappingPair_3_0= ruleMappingPair )
					{
					// InternalMapping.g:566:4: (lv_mappingPair_3_0= ruleMappingPair )
					// InternalMapping.g:567:5: lv_mappingPair_3_0= ruleMappingPair
					{

										newCompositeNode(grammarAccess.getComponentAccess().getMappingPairMappingPairParserRuleCall_3_0());
									
					pushFollow(FOLLOW_10);
					lv_mappingPair_3_0=ruleMappingPair();
					state._fsp--;


										if (current==null) {
											current = createModelElementForParent(grammarAccess.getComponentRule());
										}
										add(
											current,
											"mappingPair",
											lv_mappingPair_3_0,
											"tu_bs.cs.isf.mapping.Mapping.MappingPair");
										afterParserOrEnumRuleCall();
									
					}

					}
					break;

				default :
					break loop6;
				}
			}

			otherlv_4=(Token)match(input,24,FOLLOW_2); 

						newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleComponent"



	// $ANTLR start "entryRuleMappingPair"
	// InternalMapping.g:592:1: entryRuleMappingPair returns [EObject current=null] :iv_ruleMappingPair= ruleMappingPair EOF ;
	public final EObject entryRuleMappingPair() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleMappingPair =null;

		try {
			// InternalMapping.g:592:52: (iv_ruleMappingPair= ruleMappingPair EOF )
			// InternalMapping.g:593:2: iv_ruleMappingPair= ruleMappingPair EOF
			{
			 newCompositeNode(grammarAccess.getMappingPairRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleMappingPair=ruleMappingPair();
			state._fsp--;

			 current =iv_ruleMappingPair; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleMappingPair"



	// $ANTLR start "ruleMappingPair"
	// InternalMapping.g:599:1: ruleMappingPair returns [EObject current=null] : ( () ( (lv_port_1_0= ruleServiceMethod ) ) otherlv_2= '->' ( (lv_diagram_3_0= ruleCbcDiagram ) ) otherlv_4= ';' ) ;
	public final EObject ruleMappingPair() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_port_1_0 =null;
		EObject lv_diagram_3_0 =null;


			enterRule();

		try {
			// InternalMapping.g:605:2: ( ( () ( (lv_port_1_0= ruleServiceMethod ) ) otherlv_2= '->' ( (lv_diagram_3_0= ruleCbcDiagram ) ) otherlv_4= ';' ) )
			// InternalMapping.g:606:2: ( () ( (lv_port_1_0= ruleServiceMethod ) ) otherlv_2= '->' ( (lv_diagram_3_0= ruleCbcDiagram ) ) otherlv_4= ';' )
			{
			// InternalMapping.g:606:2: ( () ( (lv_port_1_0= ruleServiceMethod ) ) otherlv_2= '->' ( (lv_diagram_3_0= ruleCbcDiagram ) ) otherlv_4= ';' )
			// InternalMapping.g:607:3: () ( (lv_port_1_0= ruleServiceMethod ) ) otherlv_2= '->' ( (lv_diagram_3_0= ruleCbcDiagram ) ) otherlv_4= ';'
			{
			// InternalMapping.g:607:3: ()
			// InternalMapping.g:608:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getMappingPairAccess().getMappingPairAction_0(),
								current);
						
			}

			// InternalMapping.g:614:3: ( (lv_port_1_0= ruleServiceMethod ) )
			// InternalMapping.g:615:4: (lv_port_1_0= ruleServiceMethod )
			{
			// InternalMapping.g:615:4: (lv_port_1_0= ruleServiceMethod )
			// InternalMapping.g:616:5: lv_port_1_0= ruleServiceMethod
			{

								newCompositeNode(grammarAccess.getMappingPairAccess().getPortServiceMethodParserRuleCall_1_0());
							
			pushFollow(FOLLOW_11);
			lv_port_1_0=ruleServiceMethod();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getMappingPairRule());
								}
								set(
									current,
									"port",
									lv_port_1_0,
									"tu_bs.cs.isf.mapping.Mapping.ServiceMethod");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_2=(Token)match(input,11,FOLLOW_12); 

						newLeafNode(otherlv_2, grammarAccess.getMappingPairAccess().getHyphenMinusGreaterThanSignKeyword_2());
					
			// InternalMapping.g:637:3: ( (lv_diagram_3_0= ruleCbcDiagram ) )
			// InternalMapping.g:638:4: (lv_diagram_3_0= ruleCbcDiagram )
			{
			// InternalMapping.g:638:4: (lv_diagram_3_0= ruleCbcDiagram )
			// InternalMapping.g:639:5: lv_diagram_3_0= ruleCbcDiagram
			{

								newCompositeNode(grammarAccess.getMappingPairAccess().getDiagramCbcDiagramParserRuleCall_3_0());
							
			pushFollow(FOLLOW_13);
			lv_diagram_3_0=ruleCbcDiagram();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getMappingPairRule());
								}
								set(
									current,
									"diagram",
									lv_diagram_3_0,
									"tu_bs.cs.isf.mapping.Mapping.CbcDiagram");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_4=(Token)match(input,14,FOLLOW_2); 

						newLeafNode(otherlv_4, grammarAccess.getMappingPairAccess().getSemicolonKeyword_4());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleMappingPair"



	// $ANTLR start "entryRuleServiceMethod"
	// InternalMapping.g:664:1: entryRuleServiceMethod returns [EObject current=null] :iv_ruleServiceMethod= ruleServiceMethod EOF ;
	public final EObject entryRuleServiceMethod() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleServiceMethod =null;

		try {
			// InternalMapping.g:664:54: (iv_ruleServiceMethod= ruleServiceMethod EOF )
			// InternalMapping.g:665:2: iv_ruleServiceMethod= ruleServiceMethod EOF
			{
			 newCompositeNode(grammarAccess.getServiceMethodRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleServiceMethod=ruleServiceMethod();
			state._fsp--;

			 current =iv_ruleServiceMethod; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleServiceMethod"



	// $ANTLR start "ruleServiceMethod"
	// InternalMapping.g:671:1: ruleServiceMethod returns [EObject current=null] : ( () ( (lv_name_1_0= ruleFQN ) ) ) ;
	public final EObject ruleServiceMethod() throws RecognitionException {
		EObject current = null;


		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:677:2: ( ( () ( (lv_name_1_0= ruleFQN ) ) ) )
			// InternalMapping.g:678:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
			{
			// InternalMapping.g:678:2: ( () ( (lv_name_1_0= ruleFQN ) ) )
			// InternalMapping.g:679:3: () ( (lv_name_1_0= ruleFQN ) )
			{
			// InternalMapping.g:679:3: ()
			// InternalMapping.g:680:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getServiceMethodAccess().getServiceMethodAction_0(),
								current);
						
			}

			// InternalMapping.g:686:3: ( (lv_name_1_0= ruleFQN ) )
			// InternalMapping.g:687:4: (lv_name_1_0= ruleFQN )
			{
			// InternalMapping.g:687:4: (lv_name_1_0= ruleFQN )
			// InternalMapping.g:688:5: lv_name_1_0= ruleFQN
			{

								newCompositeNode(grammarAccess.getServiceMethodAccess().getNameFQNParserRuleCall_1_0());
							
			pushFollow(FOLLOW_2);
			lv_name_1_0=ruleFQN();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getServiceMethodRule());
								}
								set(
									current,
									"name",
									lv_name_1_0,
									"tu_bs.cs.isf.mapping.Mapping.FQN");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleServiceMethod"



	// $ANTLR start "entryRuleCbcDiagram"
	// InternalMapping.g:709:1: entryRuleCbcDiagram returns [EObject current=null] :iv_ruleCbcDiagram= ruleCbcDiagram EOF ;
	public final EObject entryRuleCbcDiagram() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCbcDiagram =null;

		try {
			// InternalMapping.g:709:51: (iv_ruleCbcDiagram= ruleCbcDiagram EOF )
			// InternalMapping.g:710:2: iv_ruleCbcDiagram= ruleCbcDiagram EOF
			{
			 newCompositeNode(grammarAccess.getCbcDiagramRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleCbcDiagram=ruleCbcDiagram();
			state._fsp--;

			 current =iv_ruleCbcDiagram; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleCbcDiagram"



	// $ANTLR start "ruleCbcDiagram"
	// InternalMapping.g:716:1: ruleCbcDiagram returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleEString ) ) ) |otherlv_2= 'null' ) ;
	public final EObject ruleCbcDiagram() throws RecognitionException {
		EObject current = null;


		Token otherlv_2=null;
		AntlrDatatypeRuleToken lv_name_1_0 =null;


			enterRule();

		try {
			// InternalMapping.g:722:2: ( ( ( () ( (lv_name_1_0= ruleEString ) ) ) |otherlv_2= 'null' ) )
			// InternalMapping.g:723:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) |otherlv_2= 'null' )
			{
			// InternalMapping.g:723:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) |otherlv_2= 'null' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= RULE_ID && LA7_0 <= RULE_INT)||LA7_0==RULE_STRING) ) {
				alt7=1;
			}
			else if ( (LA7_0==21) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// InternalMapping.g:724:3: ( () ( (lv_name_1_0= ruleEString ) ) )
					{
					// InternalMapping.g:724:3: ( () ( (lv_name_1_0= ruleEString ) ) )
					// InternalMapping.g:725:4: () ( (lv_name_1_0= ruleEString ) )
					{
					// InternalMapping.g:725:4: ()
					// InternalMapping.g:726:5: 
					{

										current = forceCreateModelElement(
											grammarAccess.getCbcDiagramAccess().getCbcDiagramAction_0_0(),
											current);
									
					}

					// InternalMapping.g:732:4: ( (lv_name_1_0= ruleEString ) )
					// InternalMapping.g:733:5: (lv_name_1_0= ruleEString )
					{
					// InternalMapping.g:733:5: (lv_name_1_0= ruleEString )
					// InternalMapping.g:734:6: lv_name_1_0= ruleEString
					{

											newCompositeNode(grammarAccess.getCbcDiagramAccess().getNameEStringParserRuleCall_0_1_0());
										
					pushFollow(FOLLOW_2);
					lv_name_1_0=ruleEString();
					state._fsp--;


											if (current==null) {
												current = createModelElementForParent(grammarAccess.getCbcDiagramRule());
											}
											set(
												current,
												"name",
												lv_name_1_0,
												"tu_bs.cs.isf.mapping.Mapping.EString");
											afterParserOrEnumRuleCall();
										
					}

					}

					}

					}
					break;
				case 2 :
					// InternalMapping.g:753:3: otherlv_2= 'null'
					{
					otherlv_2=(Token)match(input,21,FOLLOW_2); 

								newLeafNode(otherlv_2, grammarAccess.getCbcDiagramAccess().getNullKeyword_1());
							
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleCbcDiagram"



	// $ANTLR start "entryRuleFQN"
	// InternalMapping.g:761:1: entryRuleFQN returns [String current=null] :iv_ruleFQN= ruleFQN EOF ;
	public final String entryRuleFQN() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleFQN =null;

		try {
			// InternalMapping.g:761:43: (iv_ruleFQN= ruleFQN EOF )
			// InternalMapping.g:762:2: iv_ruleFQN= ruleFQN EOF
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleFQN"



	// $ANTLR start "ruleFQN"
	// InternalMapping.g:768:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
	public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_ID_0=null;
		Token kw=null;
		Token this_ID_2=null;


			enterRule();

		try {
			// InternalMapping.g:774:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
			// InternalMapping.g:775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			{
			// InternalMapping.g:775:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
			// InternalMapping.g:776:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
			{
			this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

						current.merge(this_ID_0);
					

						newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
					
			// InternalMapping.g:783:3: (kw= '.' this_ID_2= RULE_ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==12) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// InternalMapping.g:784:4: kw= '.' this_ID_2= RULE_ID
					{
					kw=(Token)match(input,12,FOLLOW_15); 

									current.merge(kw);
									newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
								
					this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

									current.merge(this_ID_2);
								

									newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
								
					}
					break;

				default :
					break loop8;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleFQN"



	// $ANTLR start "entryRuleEString"
	// InternalMapping.g:801:1: entryRuleEString returns [String current=null] :iv_ruleEString= ruleEString EOF ;
	public final String entryRuleEString() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleEString =null;

		try {
			// InternalMapping.g:801:47: (iv_ruleEString= ruleEString EOF )
			// InternalMapping.g:802:2: iv_ruleEString= ruleEString EOF
			{
			 newCompositeNode(grammarAccess.getEStringRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleEString=ruleEString();
			state._fsp--;

			 current =iv_ruleEString.getText(); 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleEString"



	// $ANTLR start "ruleEString"
	// InternalMapping.g:808:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* ) | (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* ) ) ;
	public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_STRING_0=null;
		Token this_ID_1=null;
		Token kw=null;
		Token this_ID_3=null;
		Token this_ID_5=null;
		Token this_INT_6=null;
		Token this_INT_8=null;


			enterRule();

		try {
			// InternalMapping.g:814:2: ( (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* ) | (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* ) ) )
			// InternalMapping.g:815:2: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* ) | (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* ) )
			{
			// InternalMapping.g:815:2: (this_STRING_0= RULE_STRING | (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* ) | (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case RULE_STRING:
				{
				alt12=1;
				}
				break;
			case RULE_ID:
				{
				alt12=2;
				}
				break;
			case RULE_INT:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// InternalMapping.g:816:3: this_STRING_0= RULE_STRING
					{
					this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

								current.merge(this_STRING_0);
							

								newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
							
					}
					break;
				case 2 :
					// InternalMapping.g:824:3: (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* )
					{
					// InternalMapping.g:824:3: (this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )* )
					// InternalMapping.g:825:4: this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID )*
					{
					this_ID_1=(Token)match(input,RULE_ID,FOLLOW_16); 

									current.merge(this_ID_1);
								

									newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0());
								
					// InternalMapping.g:832:4: (kw= '/' this_ID_3= RULE_ID )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==13) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// InternalMapping.g:833:5: kw= '/' this_ID_3= RULE_ID
							{
							kw=(Token)match(input,13,FOLLOW_15); 

												current.merge(kw);
												newLeafNode(kw, grammarAccess.getEStringAccess().getSolidusKeyword_1_1_0());
											
							this_ID_3=(Token)match(input,RULE_ID,FOLLOW_16); 

												current.merge(this_ID_3);
											

												newLeafNode(this_ID_3, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1());
											
							}
							break;

						default :
							break loop9;
						}
					}

					// InternalMapping.g:846:4: (kw= '.' this_ID_5= RULE_ID )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==12) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// InternalMapping.g:847:5: kw= '.' this_ID_5= RULE_ID
							{
							kw=(Token)match(input,12,FOLLOW_15); 

												current.merge(kw);
												newLeafNode(kw, grammarAccess.getEStringAccess().getFullStopKeyword_1_2_0());
											
							this_ID_5=(Token)match(input,RULE_ID,FOLLOW_14); 

												current.merge(this_ID_5);
											

												newLeafNode(this_ID_5, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_2_1());
											
							}
							break;

						default :
							break loop10;
						}
					}

					}

					}
					break;
				case 3 :
					// InternalMapping.g:862:3: (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* )
					{
					// InternalMapping.g:862:3: (this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )* )
					// InternalMapping.g:863:4: this_INT_6= RULE_INT (kw= '.' this_INT_8= RULE_INT )*
					{
					this_INT_6=(Token)match(input,RULE_INT,FOLLOW_14); 

									current.merge(this_INT_6);
								

									newLeafNode(this_INT_6, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_0());
								
					// InternalMapping.g:870:4: (kw= '.' this_INT_8= RULE_INT )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==12) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// InternalMapping.g:871:5: kw= '.' this_INT_8= RULE_INT
							{
							kw=(Token)match(input,12,FOLLOW_17); 

												current.merge(kw);
												newLeafNode(kw, grammarAccess.getEStringAccess().getFullStopKeyword_2_1_0());
											
							this_INT_8=(Token)match(input,RULE_INT,FOLLOW_14); 

												current.merge(this_INT_8);
											

												newLeafNode(this_INT_8, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_1_1());
											
							}
							break;

						default :
							break loop11;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleEString"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000005B8002L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040260L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000020L});
	public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200260L});
	public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
}
