package tu_bs.cs.isf.mapping.ide.contentassist.antlr.internal;

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
import tu_bs.cs.isf.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalContentAssistParser {
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
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
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

		public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
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



	// $ANTLR start "entryRuleMappingModel"
	// InternalMapping.g:53:1: entryRuleMappingModel : ruleMappingModel EOF ;
	public final void entryRuleMappingModel() throws RecognitionException {
		try {
			// InternalMapping.g:54:1: ( ruleMappingModel EOF )
			// InternalMapping.g:55:1: ruleMappingModel EOF
			{
			 before(grammarAccess.getMappingModelRule()); 
			pushFollow(FOLLOW_1);
			ruleMappingModel();
			state._fsp--;

			 after(grammarAccess.getMappingModelRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleMappingModel"



	// $ANTLR start "ruleMappingModel"
	// InternalMapping.g:62:1: ruleMappingModel : ( ( rule__MappingModel__Group__0 ) ) ;
	public final void ruleMappingModel() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:66:2: ( ( ( rule__MappingModel__Group__0 ) ) )
			// InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
			{
			// InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
			// InternalMapping.g:68:3: ( rule__MappingModel__Group__0 )
			{
			 before(grammarAccess.getMappingModelAccess().getGroup()); 
			// InternalMapping.g:69:3: ( rule__MappingModel__Group__0 )
			// InternalMapping.g:69:4: rule__MappingModel__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__MappingModel__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getMappingModelAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleMappingModel"



	// $ANTLR start "entryRuleAnnotation"
	// InternalMapping.g:78:1: entryRuleAnnotation : ruleAnnotation EOF ;
	public final void entryRuleAnnotation() throws RecognitionException {
		try {
			// InternalMapping.g:79:1: ( ruleAnnotation EOF )
			// InternalMapping.g:80:1: ruleAnnotation EOF
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAnnotation"



	// $ANTLR start "ruleAnnotation"
	// InternalMapping.g:87:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
	public final void ruleAnnotation() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:91:2: ( ( ( rule__Annotation__Alternatives ) ) )
			// InternalMapping.g:92:2: ( ( rule__Annotation__Alternatives ) )
			{
			// InternalMapping.g:92:2: ( ( rule__Annotation__Alternatives ) )
			// InternalMapping.g:93:3: ( rule__Annotation__Alternatives )
			{
			 before(grammarAccess.getAnnotationAccess().getAlternatives()); 
			// InternalMapping.g:94:3: ( rule__Annotation__Alternatives )
			// InternalMapping.g:94:4: rule__Annotation__Alternatives
			{
			pushFollow(FOLLOW_2);
			rule__Annotation__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getAnnotationAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAnnotation"



	// $ANTLR start "entryRuleVersion"
	// InternalMapping.g:103:1: entryRuleVersion : ruleVersion EOF ;
	public final void entryRuleVersion() throws RecognitionException {
		try {
			// InternalMapping.g:104:1: ( ruleVersion EOF )
			// InternalMapping.g:105:1: ruleVersion EOF
			{
			 before(grammarAccess.getVersionRule()); 
			pushFollow(FOLLOW_1);
			ruleVersion();
			state._fsp--;

			 after(grammarAccess.getVersionRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleVersion"



	// $ANTLR start "ruleVersion"
	// InternalMapping.g:112:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
	public final void ruleVersion() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:116:2: ( ( ( rule__Version__Group__0 ) ) )
			// InternalMapping.g:117:2: ( ( rule__Version__Group__0 ) )
			{
			// InternalMapping.g:117:2: ( ( rule__Version__Group__0 ) )
			// InternalMapping.g:118:3: ( rule__Version__Group__0 )
			{
			 before(grammarAccess.getVersionAccess().getGroup()); 
			// InternalMapping.g:119:3: ( rule__Version__Group__0 )
			// InternalMapping.g:119:4: rule__Version__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Version__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getVersionAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleVersion"



	// $ANTLR start "entryRuleBundle"
	// InternalMapping.g:128:1: entryRuleBundle : ruleBundle EOF ;
	public final void entryRuleBundle() throws RecognitionException {
		try {
			// InternalMapping.g:129:1: ( ruleBundle EOF )
			// InternalMapping.g:130:1: ruleBundle EOF
			{
			 before(grammarAccess.getBundleRule()); 
			pushFollow(FOLLOW_1);
			ruleBundle();
			state._fsp--;

			 after(grammarAccess.getBundleRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleBundle"



	// $ANTLR start "ruleBundle"
	// InternalMapping.g:137:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
	public final void ruleBundle() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:141:2: ( ( ( rule__Bundle__Group__0 ) ) )
			// InternalMapping.g:142:2: ( ( rule__Bundle__Group__0 ) )
			{
			// InternalMapping.g:142:2: ( ( rule__Bundle__Group__0 ) )
			// InternalMapping.g:143:3: ( rule__Bundle__Group__0 )
			{
			 before(grammarAccess.getBundleAccess().getGroup()); 
			// InternalMapping.g:144:3: ( rule__Bundle__Group__0 )
			// InternalMapping.g:144:4: rule__Bundle__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Bundle__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getBundleAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleBundle"



	// $ANTLR start "entryRuleDate"
	// InternalMapping.g:153:1: entryRuleDate : ruleDate EOF ;
	public final void entryRuleDate() throws RecognitionException {
		try {
			// InternalMapping.g:154:1: ( ruleDate EOF )
			// InternalMapping.g:155:1: ruleDate EOF
			{
			 before(grammarAccess.getDateRule()); 
			pushFollow(FOLLOW_1);
			ruleDate();
			state._fsp--;

			 after(grammarAccess.getDateRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleDate"



	// $ANTLR start "ruleDate"
	// InternalMapping.g:162:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
	public final void ruleDate() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:166:2: ( ( ( rule__Date__Group__0 ) ) )
			// InternalMapping.g:167:2: ( ( rule__Date__Group__0 ) )
			{
			// InternalMapping.g:167:2: ( ( rule__Date__Group__0 ) )
			// InternalMapping.g:168:3: ( rule__Date__Group__0 )
			{
			 before(grammarAccess.getDateAccess().getGroup()); 
			// InternalMapping.g:169:3: ( rule__Date__Group__0 )
			// InternalMapping.g:169:4: rule__Date__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Date__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getDateAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleDate"



	// $ANTLR start "entryRuleAuthor"
	// InternalMapping.g:178:1: entryRuleAuthor : ruleAuthor EOF ;
	public final void entryRuleAuthor() throws RecognitionException {
		try {
			// InternalMapping.g:179:1: ( ruleAuthor EOF )
			// InternalMapping.g:180:1: ruleAuthor EOF
			{
			 before(grammarAccess.getAuthorRule()); 
			pushFollow(FOLLOW_1);
			ruleAuthor();
			state._fsp--;

			 after(grammarAccess.getAuthorRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAuthor"



	// $ANTLR start "ruleAuthor"
	// InternalMapping.g:187:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
	public final void ruleAuthor() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:191:2: ( ( ( rule__Author__Group__0 ) ) )
			// InternalMapping.g:192:2: ( ( rule__Author__Group__0 ) )
			{
			// InternalMapping.g:192:2: ( ( rule__Author__Group__0 ) )
			// InternalMapping.g:193:3: ( rule__Author__Group__0 )
			{
			 before(grammarAccess.getAuthorAccess().getGroup()); 
			// InternalMapping.g:194:3: ( rule__Author__Group__0 )
			// InternalMapping.g:194:4: rule__Author__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Author__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getAuthorAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAuthor"



	// $ANTLR start "entryRuleImport"
	// InternalMapping.g:203:1: entryRuleImport : ruleImport EOF ;
	public final void entryRuleImport() throws RecognitionException {
		try {
			// InternalMapping.g:204:1: ( ruleImport EOF )
			// InternalMapping.g:205:1: ruleImport EOF
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleImport"



	// $ANTLR start "ruleImport"
	// InternalMapping.g:212:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
	public final void ruleImport() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:216:2: ( ( ( rule__Import__Group__0 ) ) )
			// InternalMapping.g:217:2: ( ( rule__Import__Group__0 ) )
			{
			// InternalMapping.g:217:2: ( ( rule__Import__Group__0 ) )
			// InternalMapping.g:218:3: ( rule__Import__Group__0 )
			{
			 before(grammarAccess.getImportAccess().getGroup()); 
			// InternalMapping.g:219:3: ( rule__Import__Group__0 )
			// InternalMapping.g:219:4: rule__Import__Group__0
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleImport"



	// $ANTLR start "entryRuleMapping"
	// InternalMapping.g:228:1: entryRuleMapping : ruleMapping EOF ;
	public final void entryRuleMapping() throws RecognitionException {
		try {
			// InternalMapping.g:229:1: ( ruleMapping EOF )
			// InternalMapping.g:230:1: ruleMapping EOF
			{
			 before(grammarAccess.getMappingRule()); 
			pushFollow(FOLLOW_1);
			ruleMapping();
			state._fsp--;

			 after(grammarAccess.getMappingRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleMapping"



	// $ANTLR start "ruleMapping"
	// InternalMapping.g:237:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
	public final void ruleMapping() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:241:2: ( ( ( rule__Mapping__Group__0 ) ) )
			// InternalMapping.g:242:2: ( ( rule__Mapping__Group__0 ) )
			{
			// InternalMapping.g:242:2: ( ( rule__Mapping__Group__0 ) )
			// InternalMapping.g:243:3: ( rule__Mapping__Group__0 )
			{
			 before(grammarAccess.getMappingAccess().getGroup()); 
			// InternalMapping.g:244:3: ( rule__Mapping__Group__0 )
			// InternalMapping.g:244:4: rule__Mapping__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Mapping__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getMappingAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleMapping"



	// $ANTLR start "entryRuleComponent"
	// InternalMapping.g:253:1: entryRuleComponent : ruleComponent EOF ;
	public final void entryRuleComponent() throws RecognitionException {
		try {
			// InternalMapping.g:254:1: ( ruleComponent EOF )
			// InternalMapping.g:255:1: ruleComponent EOF
			{
			 before(grammarAccess.getComponentRule()); 
			pushFollow(FOLLOW_1);
			ruleComponent();
			state._fsp--;

			 after(grammarAccess.getComponentRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleComponent"



	// $ANTLR start "ruleComponent"
	// InternalMapping.g:262:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
	public final void ruleComponent() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:266:2: ( ( ( rule__Component__Group__0 ) ) )
			// InternalMapping.g:267:2: ( ( rule__Component__Group__0 ) )
			{
			// InternalMapping.g:267:2: ( ( rule__Component__Group__0 ) )
			// InternalMapping.g:268:3: ( rule__Component__Group__0 )
			{
			 before(grammarAccess.getComponentAccess().getGroup()); 
			// InternalMapping.g:269:3: ( rule__Component__Group__0 )
			// InternalMapping.g:269:4: rule__Component__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Component__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getComponentAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleComponent"



	// $ANTLR start "entryRuleMappingPair"
	// InternalMapping.g:278:1: entryRuleMappingPair : ruleMappingPair EOF ;
	public final void entryRuleMappingPair() throws RecognitionException {
		try {
			// InternalMapping.g:279:1: ( ruleMappingPair EOF )
			// InternalMapping.g:280:1: ruleMappingPair EOF
			{
			 before(grammarAccess.getMappingPairRule()); 
			pushFollow(FOLLOW_1);
			ruleMappingPair();
			state._fsp--;

			 after(grammarAccess.getMappingPairRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleMappingPair"



	// $ANTLR start "ruleMappingPair"
	// InternalMapping.g:287:1: ruleMappingPair : ( ( rule__MappingPair__Group__0 ) ) ;
	public final void ruleMappingPair() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:291:2: ( ( ( rule__MappingPair__Group__0 ) ) )
			// InternalMapping.g:292:2: ( ( rule__MappingPair__Group__0 ) )
			{
			// InternalMapping.g:292:2: ( ( rule__MappingPair__Group__0 ) )
			// InternalMapping.g:293:3: ( rule__MappingPair__Group__0 )
			{
			 before(grammarAccess.getMappingPairAccess().getGroup()); 
			// InternalMapping.g:294:3: ( rule__MappingPair__Group__0 )
			// InternalMapping.g:294:4: rule__MappingPair__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getMappingPairAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleMappingPair"



	// $ANTLR start "entryRuleServiceMethod"
	// InternalMapping.g:303:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
	public final void entryRuleServiceMethod() throws RecognitionException {
		try {
			// InternalMapping.g:304:1: ( ruleServiceMethod EOF )
			// InternalMapping.g:305:1: ruleServiceMethod EOF
			{
			 before(grammarAccess.getServiceMethodRule()); 
			pushFollow(FOLLOW_1);
			ruleServiceMethod();
			state._fsp--;

			 after(grammarAccess.getServiceMethodRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleServiceMethod"



	// $ANTLR start "ruleServiceMethod"
	// InternalMapping.g:312:1: ruleServiceMethod : ( ( rule__ServiceMethod__Group__0 ) ) ;
	public final void ruleServiceMethod() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:316:2: ( ( ( rule__ServiceMethod__Group__0 ) ) )
			// InternalMapping.g:317:2: ( ( rule__ServiceMethod__Group__0 ) )
			{
			// InternalMapping.g:317:2: ( ( rule__ServiceMethod__Group__0 ) )
			// InternalMapping.g:318:3: ( rule__ServiceMethod__Group__0 )
			{
			 before(grammarAccess.getServiceMethodAccess().getGroup()); 
			// InternalMapping.g:319:3: ( rule__ServiceMethod__Group__0 )
			// InternalMapping.g:319:4: rule__ServiceMethod__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__ServiceMethod__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getServiceMethodAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleServiceMethod"



	// $ANTLR start "entryRuleCbcDiagram"
	// InternalMapping.g:328:1: entryRuleCbcDiagram : ruleCbcDiagram EOF ;
	public final void entryRuleCbcDiagram() throws RecognitionException {
		try {
			// InternalMapping.g:329:1: ( ruleCbcDiagram EOF )
			// InternalMapping.g:330:1: ruleCbcDiagram EOF
			{
			 before(grammarAccess.getCbcDiagramRule()); 
			pushFollow(FOLLOW_1);
			ruleCbcDiagram();
			state._fsp--;

			 after(grammarAccess.getCbcDiagramRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleCbcDiagram"



	// $ANTLR start "ruleCbcDiagram"
	// InternalMapping.g:337:1: ruleCbcDiagram : ( ( rule__CbcDiagram__Alternatives ) ) ;
	public final void ruleCbcDiagram() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:341:2: ( ( ( rule__CbcDiagram__Alternatives ) ) )
			// InternalMapping.g:342:2: ( ( rule__CbcDiagram__Alternatives ) )
			{
			// InternalMapping.g:342:2: ( ( rule__CbcDiagram__Alternatives ) )
			// InternalMapping.g:343:3: ( rule__CbcDiagram__Alternatives )
			{
			 before(grammarAccess.getCbcDiagramAccess().getAlternatives()); 
			// InternalMapping.g:344:3: ( rule__CbcDiagram__Alternatives )
			// InternalMapping.g:344:4: rule__CbcDiagram__Alternatives
			{
			pushFollow(FOLLOW_2);
			rule__CbcDiagram__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getCbcDiagramAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleCbcDiagram"



	// $ANTLR start "entryRuleFQN"
	// InternalMapping.g:353:1: entryRuleFQN : ruleFQN EOF ;
	public final void entryRuleFQN() throws RecognitionException {
		try {
			// InternalMapping.g:354:1: ( ruleFQN EOF )
			// InternalMapping.g:355:1: ruleFQN EOF
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleFQN"



	// $ANTLR start "ruleFQN"
	// InternalMapping.g:362:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
	public final void ruleFQN() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:366:2: ( ( ( rule__FQN__Group__0 ) ) )
			// InternalMapping.g:367:2: ( ( rule__FQN__Group__0 ) )
			{
			// InternalMapping.g:367:2: ( ( rule__FQN__Group__0 ) )
			// InternalMapping.g:368:3: ( rule__FQN__Group__0 )
			{
			 before(grammarAccess.getFQNAccess().getGroup()); 
			// InternalMapping.g:369:3: ( rule__FQN__Group__0 )
			// InternalMapping.g:369:4: rule__FQN__Group__0
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleFQN"



	// $ANTLR start "entryRuleEString"
	// InternalMapping.g:378:1: entryRuleEString : ruleEString EOF ;
	public final void entryRuleEString() throws RecognitionException {
		try {
			// InternalMapping.g:379:1: ( ruleEString EOF )
			// InternalMapping.g:380:1: ruleEString EOF
			{
			 before(grammarAccess.getEStringRule()); 
			pushFollow(FOLLOW_1);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getEStringRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEString"



	// $ANTLR start "ruleEString"
	// InternalMapping.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
	public final void ruleEString() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
			// InternalMapping.g:392:2: ( ( rule__EString__Alternatives ) )
			{
			// InternalMapping.g:392:2: ( ( rule__EString__Alternatives ) )
			// InternalMapping.g:393:3: ( rule__EString__Alternatives )
			{
			 before(grammarAccess.getEStringAccess().getAlternatives()); 
			// InternalMapping.g:394:3: ( rule__EString__Alternatives )
			// InternalMapping.g:394:4: rule__EString__Alternatives
			{
			pushFollow(FOLLOW_2);
			rule__EString__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getEStringAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEString"



	// $ANTLR start "rule__Annotation__Alternatives"
	// InternalMapping.g:402:1: rule__Annotation__Alternatives : ( ( ( rule__Annotation__Group_0__0 ) ) | ( ruleBundle ) | ( ruleDate ) | ( ruleAuthor ) );
	public final void rule__Annotation__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:406:2: ( ( ( rule__Annotation__Group_0__0 ) ) | ( ruleBundle ) | ( ruleDate ) | ( ruleAuthor ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt1=1;
				}
				break;
			case 16:
				{
				alt1=2;
				}
				break;
			case 17:
				{
				alt1=3;
				}
				break;
			case 15:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// InternalMapping.g:407:2: ( ( rule__Annotation__Group_0__0 ) )
					{
					// InternalMapping.g:407:2: ( ( rule__Annotation__Group_0__0 ) )
					// InternalMapping.g:408:3: ( rule__Annotation__Group_0__0 )
					{
					 before(grammarAccess.getAnnotationAccess().getGroup_0()); 
					// InternalMapping.g:409:3: ( rule__Annotation__Group_0__0 )
					// InternalMapping.g:409:4: rule__Annotation__Group_0__0
					{
					pushFollow(FOLLOW_2);
					rule__Annotation__Group_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getAnnotationAccess().getGroup_0()); 
					}

					}
					break;
				case 2 :
					// InternalMapping.g:413:2: ( ruleBundle )
					{
					// InternalMapping.g:413:2: ( ruleBundle )
					// InternalMapping.g:414:3: ruleBundle
					{
					 before(grammarAccess.getAnnotationAccess().getBundleParserRuleCall_1()); 
					pushFollow(FOLLOW_2);
					ruleBundle();
					state._fsp--;

					 after(grammarAccess.getAnnotationAccess().getBundleParserRuleCall_1()); 
					}

					}
					break;
				case 3 :
					// InternalMapping.g:419:2: ( ruleDate )
					{
					// InternalMapping.g:419:2: ( ruleDate )
					// InternalMapping.g:420:3: ruleDate
					{
					 before(grammarAccess.getAnnotationAccess().getDateParserRuleCall_2()); 
					pushFollow(FOLLOW_2);
					ruleDate();
					state._fsp--;

					 after(grammarAccess.getAnnotationAccess().getDateParserRuleCall_2()); 
					}

					}
					break;
				case 4 :
					// InternalMapping.g:425:2: ( ruleAuthor )
					{
					// InternalMapping.g:425:2: ( ruleAuthor )
					// InternalMapping.g:426:3: ruleAuthor
					{
					 before(grammarAccess.getAnnotationAccess().getAuthorParserRuleCall_3()); 
					pushFollow(FOLLOW_2);
					ruleAuthor();
					state._fsp--;

					 after(grammarAccess.getAnnotationAccess().getAuthorParserRuleCall_3()); 
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__Alternatives"



	// $ANTLR start "rule__CbcDiagram__Alternatives"
	// InternalMapping.g:435:1: rule__CbcDiagram__Alternatives : ( ( ( rule__CbcDiagram__Group_0__0 ) ) | ( 'null' ) );
	public final void rule__CbcDiagram__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:439:2: ( ( ( rule__CbcDiagram__Group_0__0 ) ) | ( 'null' ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= RULE_ID && LA2_0 <= RULE_INT)||LA2_0==RULE_STRING) ) {
				alt2=1;
			}
			else if ( (LA2_0==21) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// InternalMapping.g:440:2: ( ( rule__CbcDiagram__Group_0__0 ) )
					{
					// InternalMapping.g:440:2: ( ( rule__CbcDiagram__Group_0__0 ) )
					// InternalMapping.g:441:3: ( rule__CbcDiagram__Group_0__0 )
					{
					 before(grammarAccess.getCbcDiagramAccess().getGroup_0()); 
					// InternalMapping.g:442:3: ( rule__CbcDiagram__Group_0__0 )
					// InternalMapping.g:442:4: rule__CbcDiagram__Group_0__0
					{
					pushFollow(FOLLOW_2);
					rule__CbcDiagram__Group_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getCbcDiagramAccess().getGroup_0()); 
					}

					}
					break;
				case 2 :
					// InternalMapping.g:446:2: ( 'null' )
					{
					// InternalMapping.g:446:2: ( 'null' )
					// InternalMapping.g:447:3: 'null'
					{
					 before(grammarAccess.getCbcDiagramAccess().getNullKeyword_1()); 
					match(input,21,FOLLOW_2); 
					 after(grammarAccess.getCbcDiagramAccess().getNullKeyword_1()); 
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__Alternatives"



	// $ANTLR start "rule__EString__Alternatives"
	// InternalMapping.g:456:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( ( rule__EString__Group_1__0 ) ) | ( ( rule__EString__Group_2__0 ) ) );
	public final void rule__EString__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:460:2: ( ( RULE_STRING ) | ( ( rule__EString__Group_1__0 ) ) | ( ( rule__EString__Group_2__0 ) ) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case RULE_STRING:
				{
				alt3=1;
				}
				break;
			case RULE_ID:
				{
				alt3=2;
				}
				break;
			case RULE_INT:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// InternalMapping.g:461:2: ( RULE_STRING )
					{
					// InternalMapping.g:461:2: ( RULE_STRING )
					// InternalMapping.g:462:3: RULE_STRING
					{
					 before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
					match(input,RULE_STRING,FOLLOW_2); 
					 after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// InternalMapping.g:467:2: ( ( rule__EString__Group_1__0 ) )
					{
					// InternalMapping.g:467:2: ( ( rule__EString__Group_1__0 ) )
					// InternalMapping.g:468:3: ( rule__EString__Group_1__0 )
					{
					 before(grammarAccess.getEStringAccess().getGroup_1()); 
					// InternalMapping.g:469:3: ( rule__EString__Group_1__0 )
					// InternalMapping.g:469:4: rule__EString__Group_1__0
					{
					pushFollow(FOLLOW_2);
					rule__EString__Group_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getEStringAccess().getGroup_1()); 
					}

					}
					break;
				case 3 :
					// InternalMapping.g:473:2: ( ( rule__EString__Group_2__0 ) )
					{
					// InternalMapping.g:473:2: ( ( rule__EString__Group_2__0 ) )
					// InternalMapping.g:474:3: ( rule__EString__Group_2__0 )
					{
					 before(grammarAccess.getEStringAccess().getGroup_2()); 
					// InternalMapping.g:475:3: ( rule__EString__Group_2__0 )
					// InternalMapping.g:475:4: rule__EString__Group_2__0
					{
					pushFollow(FOLLOW_2);
					rule__EString__Group_2__0();
					state._fsp--;

					}

					 after(grammarAccess.getEStringAccess().getGroup_2()); 
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Alternatives"



	// $ANTLR start "rule__MappingModel__Group__0"
	// InternalMapping.g:483:1: rule__MappingModel__Group__0 : rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 ;
	public final void rule__MappingModel__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:487:2: ( rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 )
			// InternalMapping.g:488:2: rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1
			{
			pushFollow(FOLLOW_3);
			rule__MappingModel__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingModel__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__0"



	// $ANTLR start "rule__MappingModel__Group__0__Impl"
	// InternalMapping.g:495:1: rule__MappingModel__Group__0__Impl : ( () ) ;
	public final void rule__MappingModel__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:499:2: ( ( () ) )
			// InternalMapping.g:500:2: ( () )
			{
			// InternalMapping.g:500:2: ( () )
			// InternalMapping.g:501:2: ()
			{
			 before(grammarAccess.getMappingModelAccess().getMappingModelAction_0()); 
			// InternalMapping.g:502:2: ()
			// InternalMapping.g:502:3: 
			{
			}

			 after(grammarAccess.getMappingModelAccess().getMappingModelAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__0__Impl"



	// $ANTLR start "rule__MappingModel__Group__1"
	// InternalMapping.g:510:1: rule__MappingModel__Group__1 : rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 ;
	public final void rule__MappingModel__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:514:2: ( rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 )
			// InternalMapping.g:515:2: rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2
			{
			pushFollow(FOLLOW_4);
			rule__MappingModel__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingModel__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__1"



	// $ANTLR start "rule__MappingModel__Group__1__Impl"
	// InternalMapping.g:522:1: rule__MappingModel__Group__1__Impl : ( ( rule__MappingModel__AnnotationsAssignment_1 )* ) ;
	public final void rule__MappingModel__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:526:2: ( ( ( rule__MappingModel__AnnotationsAssignment_1 )* ) )
			// InternalMapping.g:527:2: ( ( rule__MappingModel__AnnotationsAssignment_1 )* )
			{
			// InternalMapping.g:527:2: ( ( rule__MappingModel__AnnotationsAssignment_1 )* )
			// InternalMapping.g:528:2: ( rule__MappingModel__AnnotationsAssignment_1 )*
			{
			 before(grammarAccess.getMappingModelAccess().getAnnotationsAssignment_1()); 
			// InternalMapping.g:529:2: ( rule__MappingModel__AnnotationsAssignment_1 )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 15 && LA4_0 <= 17)||LA4_0==22) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// InternalMapping.g:529:3: rule__MappingModel__AnnotationsAssignment_1
					{
					pushFollow(FOLLOW_5);
					rule__MappingModel__AnnotationsAssignment_1();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			 after(grammarAccess.getMappingModelAccess().getAnnotationsAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__1__Impl"



	// $ANTLR start "rule__MappingModel__Group__2"
	// InternalMapping.g:537:1: rule__MappingModel__Group__2 : rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 ;
	public final void rule__MappingModel__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:541:2: ( rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 )
			// InternalMapping.g:542:2: rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3
			{
			pushFollow(FOLLOW_6);
			rule__MappingModel__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingModel__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__2"



	// $ANTLR start "rule__MappingModel__Group__2__Impl"
	// InternalMapping.g:549:1: rule__MappingModel__Group__2__Impl : ( ( rule__MappingModel__ImportsAssignment_2 )* ) ;
	public final void rule__MappingModel__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:553:2: ( ( ( rule__MappingModel__ImportsAssignment_2 )* ) )
			// InternalMapping.g:554:2: ( ( rule__MappingModel__ImportsAssignment_2 )* )
			{
			// InternalMapping.g:554:2: ( ( rule__MappingModel__ImportsAssignment_2 )* )
			// InternalMapping.g:555:2: ( rule__MappingModel__ImportsAssignment_2 )*
			{
			 before(grammarAccess.getMappingModelAccess().getImportsAssignment_2()); 
			// InternalMapping.g:556:2: ( rule__MappingModel__ImportsAssignment_2 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==19) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// InternalMapping.g:556:3: rule__MappingModel__ImportsAssignment_2
					{
					pushFollow(FOLLOW_7);
					rule__MappingModel__ImportsAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			 after(grammarAccess.getMappingModelAccess().getImportsAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__2__Impl"



	// $ANTLR start "rule__MappingModel__Group__3"
	// InternalMapping.g:564:1: rule__MappingModel__Group__3 : rule__MappingModel__Group__3__Impl ;
	public final void rule__MappingModel__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:568:2: ( rule__MappingModel__Group__3__Impl )
			// InternalMapping.g:569:2: rule__MappingModel__Group__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__MappingModel__Group__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__3"



	// $ANTLR start "rule__MappingModel__Group__3__Impl"
	// InternalMapping.g:575:1: rule__MappingModel__Group__3__Impl : ( ( rule__MappingModel__MappingsAssignment_3 )* ) ;
	public final void rule__MappingModel__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:579:2: ( ( ( rule__MappingModel__MappingsAssignment_3 )* ) )
			// InternalMapping.g:580:2: ( ( rule__MappingModel__MappingsAssignment_3 )* )
			{
			// InternalMapping.g:580:2: ( ( rule__MappingModel__MappingsAssignment_3 )* )
			// InternalMapping.g:581:2: ( rule__MappingModel__MappingsAssignment_3 )*
			{
			 before(grammarAccess.getMappingModelAccess().getMappingsAssignment_3()); 
			// InternalMapping.g:582:2: ( rule__MappingModel__MappingsAssignment_3 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// InternalMapping.g:582:3: rule__MappingModel__MappingsAssignment_3
					{
					pushFollow(FOLLOW_8);
					rule__MappingModel__MappingsAssignment_3();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			 after(grammarAccess.getMappingModelAccess().getMappingsAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__Group__3__Impl"



	// $ANTLR start "rule__Annotation__Group_0__0"
	// InternalMapping.g:591:1: rule__Annotation__Group_0__0 : rule__Annotation__Group_0__0__Impl rule__Annotation__Group_0__1 ;
	public final void rule__Annotation__Group_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:595:2: ( rule__Annotation__Group_0__0__Impl rule__Annotation__Group_0__1 )
			// InternalMapping.g:596:2: rule__Annotation__Group_0__0__Impl rule__Annotation__Group_0__1
			{
			pushFollow(FOLLOW_9);
			rule__Annotation__Group_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Annotation__Group_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__Group_0__0"



	// $ANTLR start "rule__Annotation__Group_0__0__Impl"
	// InternalMapping.g:603:1: rule__Annotation__Group_0__0__Impl : ( () ) ;
	public final void rule__Annotation__Group_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:607:2: ( ( () ) )
			// InternalMapping.g:608:2: ( () )
			{
			// InternalMapping.g:608:2: ( () )
			// InternalMapping.g:609:2: ()
			{
			 before(grammarAccess.getAnnotationAccess().getAnnotationAction_0_0()); 
			// InternalMapping.g:610:2: ()
			// InternalMapping.g:610:3: 
			{
			}

			 after(grammarAccess.getAnnotationAccess().getAnnotationAction_0_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__Group_0__0__Impl"



	// $ANTLR start "rule__Annotation__Group_0__1"
	// InternalMapping.g:618:1: rule__Annotation__Group_0__1 : rule__Annotation__Group_0__1__Impl ;
	public final void rule__Annotation__Group_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:622:2: ( rule__Annotation__Group_0__1__Impl )
			// InternalMapping.g:623:2: rule__Annotation__Group_0__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Annotation__Group_0__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__Group_0__1"



	// $ANTLR start "rule__Annotation__Group_0__1__Impl"
	// InternalMapping.g:629:1: rule__Annotation__Group_0__1__Impl : ( ( rule__Annotation__AnnotationAssignment_0_1 ) ) ;
	public final void rule__Annotation__Group_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:633:2: ( ( ( rule__Annotation__AnnotationAssignment_0_1 ) ) )
			// InternalMapping.g:634:2: ( ( rule__Annotation__AnnotationAssignment_0_1 ) )
			{
			// InternalMapping.g:634:2: ( ( rule__Annotation__AnnotationAssignment_0_1 ) )
			// InternalMapping.g:635:2: ( rule__Annotation__AnnotationAssignment_0_1 )
			{
			 before(grammarAccess.getAnnotationAccess().getAnnotationAssignment_0_1()); 
			// InternalMapping.g:636:2: ( rule__Annotation__AnnotationAssignment_0_1 )
			// InternalMapping.g:636:3: rule__Annotation__AnnotationAssignment_0_1
			{
			pushFollow(FOLLOW_2);
			rule__Annotation__AnnotationAssignment_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getAnnotationAccess().getAnnotationAssignment_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__Group_0__1__Impl"



	// $ANTLR start "rule__Version__Group__0"
	// InternalMapping.g:645:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
	public final void rule__Version__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:649:2: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
			// InternalMapping.g:650:2: rule__Version__Group__0__Impl rule__Version__Group__1
			{
			pushFollow(FOLLOW_10);
			rule__Version__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Version__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Version__Group__0"



	// $ANTLR start "rule__Version__Group__0__Impl"
	// InternalMapping.g:657:1: rule__Version__Group__0__Impl : ( 'version:' ) ;
	public final void rule__Version__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:661:2: ( ( 'version:' ) )
			// InternalMapping.g:662:2: ( 'version:' )
			{
			// InternalMapping.g:662:2: ( 'version:' )
			// InternalMapping.g:663:2: 'version:'
			{
			 before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
			match(input,22,FOLLOW_2); 
			 after(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Version__Group__0__Impl"



	// $ANTLR start "rule__Version__Group__1"
	// InternalMapping.g:672:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
	public final void rule__Version__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:676:2: ( rule__Version__Group__1__Impl )
			// InternalMapping.g:677:2: rule__Version__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Version__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Version__Group__1"



	// $ANTLR start "rule__Version__Group__1__Impl"
	// InternalMapping.g:683:1: rule__Version__Group__1__Impl : ( ( rule__Version__NameAssignment_1 ) ) ;
	public final void rule__Version__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:687:2: ( ( ( rule__Version__NameAssignment_1 ) ) )
			// InternalMapping.g:688:2: ( ( rule__Version__NameAssignment_1 ) )
			{
			// InternalMapping.g:688:2: ( ( rule__Version__NameAssignment_1 ) )
			// InternalMapping.g:689:2: ( rule__Version__NameAssignment_1 )
			{
			 before(grammarAccess.getVersionAccess().getNameAssignment_1()); 
			// InternalMapping.g:690:2: ( rule__Version__NameAssignment_1 )
			// InternalMapping.g:690:3: rule__Version__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Version__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getVersionAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Version__Group__1__Impl"



	// $ANTLR start "rule__Bundle__Group__0"
	// InternalMapping.g:699:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
	public final void rule__Bundle__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:703:2: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
			// InternalMapping.g:704:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
			{
			pushFollow(FOLLOW_10);
			rule__Bundle__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Bundle__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Bundle__Group__0"



	// $ANTLR start "rule__Bundle__Group__0__Impl"
	// InternalMapping.g:711:1: rule__Bundle__Group__0__Impl : ( 'bundle:' ) ;
	public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:715:2: ( ( 'bundle:' ) )
			// InternalMapping.g:716:2: ( 'bundle:' )
			{
			// InternalMapping.g:716:2: ( 'bundle:' )
			// InternalMapping.g:717:2: 'bundle:'
			{
			 before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
			match(input,16,FOLLOW_2); 
			 after(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Bundle__Group__0__Impl"



	// $ANTLR start "rule__Bundle__Group__1"
	// InternalMapping.g:726:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl ;
	public final void rule__Bundle__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:730:2: ( rule__Bundle__Group__1__Impl )
			// InternalMapping.g:731:2: rule__Bundle__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Bundle__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Bundle__Group__1"



	// $ANTLR start "rule__Bundle__Group__1__Impl"
	// InternalMapping.g:737:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__NameAssignment_1 ) ) ;
	public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:741:2: ( ( ( rule__Bundle__NameAssignment_1 ) ) )
			// InternalMapping.g:742:2: ( ( rule__Bundle__NameAssignment_1 ) )
			{
			// InternalMapping.g:742:2: ( ( rule__Bundle__NameAssignment_1 ) )
			// InternalMapping.g:743:2: ( rule__Bundle__NameAssignment_1 )
			{
			 before(grammarAccess.getBundleAccess().getNameAssignment_1()); 
			// InternalMapping.g:744:2: ( rule__Bundle__NameAssignment_1 )
			// InternalMapping.g:744:3: rule__Bundle__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Bundle__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getBundleAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Bundle__Group__1__Impl"



	// $ANTLR start "rule__Date__Group__0"
	// InternalMapping.g:753:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
	public final void rule__Date__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:757:2: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
			// InternalMapping.g:758:2: rule__Date__Group__0__Impl rule__Date__Group__1
			{
			pushFollow(FOLLOW_10);
			rule__Date__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Date__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Date__Group__0"



	// $ANTLR start "rule__Date__Group__0__Impl"
	// InternalMapping.g:765:1: rule__Date__Group__0__Impl : ( 'date:' ) ;
	public final void rule__Date__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:769:2: ( ( 'date:' ) )
			// InternalMapping.g:770:2: ( 'date:' )
			{
			// InternalMapping.g:770:2: ( 'date:' )
			// InternalMapping.g:771:2: 'date:'
			{
			 before(grammarAccess.getDateAccess().getDateKeyword_0()); 
			match(input,17,FOLLOW_2); 
			 after(grammarAccess.getDateAccess().getDateKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Date__Group__0__Impl"



	// $ANTLR start "rule__Date__Group__1"
	// InternalMapping.g:780:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
	public final void rule__Date__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:784:2: ( rule__Date__Group__1__Impl )
			// InternalMapping.g:785:2: rule__Date__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Date__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Date__Group__1"



	// $ANTLR start "rule__Date__Group__1__Impl"
	// InternalMapping.g:791:1: rule__Date__Group__1__Impl : ( ( rule__Date__NameAssignment_1 ) ) ;
	public final void rule__Date__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:795:2: ( ( ( rule__Date__NameAssignment_1 ) ) )
			// InternalMapping.g:796:2: ( ( rule__Date__NameAssignment_1 ) )
			{
			// InternalMapping.g:796:2: ( ( rule__Date__NameAssignment_1 ) )
			// InternalMapping.g:797:2: ( rule__Date__NameAssignment_1 )
			{
			 before(grammarAccess.getDateAccess().getNameAssignment_1()); 
			// InternalMapping.g:798:2: ( rule__Date__NameAssignment_1 )
			// InternalMapping.g:798:3: rule__Date__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Date__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getDateAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Date__Group__1__Impl"



	// $ANTLR start "rule__Author__Group__0"
	// InternalMapping.g:807:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
	public final void rule__Author__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:811:2: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
			// InternalMapping.g:812:2: rule__Author__Group__0__Impl rule__Author__Group__1
			{
			pushFollow(FOLLOW_10);
			rule__Author__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Author__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Author__Group__0"



	// $ANTLR start "rule__Author__Group__0__Impl"
	// InternalMapping.g:819:1: rule__Author__Group__0__Impl : ( 'author:' ) ;
	public final void rule__Author__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:823:2: ( ( 'author:' ) )
			// InternalMapping.g:824:2: ( 'author:' )
			{
			// InternalMapping.g:824:2: ( 'author:' )
			// InternalMapping.g:825:2: 'author:'
			{
			 before(grammarAccess.getAuthorAccess().getAuthorKeyword_0()); 
			match(input,15,FOLLOW_2); 
			 after(grammarAccess.getAuthorAccess().getAuthorKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Author__Group__0__Impl"



	// $ANTLR start "rule__Author__Group__1"
	// InternalMapping.g:834:1: rule__Author__Group__1 : rule__Author__Group__1__Impl ;
	public final void rule__Author__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:838:2: ( rule__Author__Group__1__Impl )
			// InternalMapping.g:839:2: rule__Author__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Author__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Author__Group__1"



	// $ANTLR start "rule__Author__Group__1__Impl"
	// InternalMapping.g:845:1: rule__Author__Group__1__Impl : ( ( rule__Author__NameAssignment_1 ) ) ;
	public final void rule__Author__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:849:2: ( ( ( rule__Author__NameAssignment_1 ) ) )
			// InternalMapping.g:850:2: ( ( rule__Author__NameAssignment_1 ) )
			{
			// InternalMapping.g:850:2: ( ( rule__Author__NameAssignment_1 ) )
			// InternalMapping.g:851:2: ( rule__Author__NameAssignment_1 )
			{
			 before(grammarAccess.getAuthorAccess().getNameAssignment_1()); 
			// InternalMapping.g:852:2: ( rule__Author__NameAssignment_1 )
			// InternalMapping.g:852:3: rule__Author__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Author__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getAuthorAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Author__Group__1__Impl"



	// $ANTLR start "rule__Import__Group__0"
	// InternalMapping.g:861:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
	public final void rule__Import__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:865:2: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
			// InternalMapping.g:866:2: rule__Import__Group__0__Impl rule__Import__Group__1
			{
			pushFollow(FOLLOW_11);
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__0"



	// $ANTLR start "rule__Import__Group__0__Impl"
	// InternalMapping.g:873:1: rule__Import__Group__0__Impl : ( () ) ;
	public final void rule__Import__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:877:2: ( ( () ) )
			// InternalMapping.g:878:2: ( () )
			{
			// InternalMapping.g:878:2: ( () )
			// InternalMapping.g:879:2: ()
			{
			 before(grammarAccess.getImportAccess().getImportAction_0()); 
			// InternalMapping.g:880:2: ()
			// InternalMapping.g:880:3: 
			{
			}

			 after(grammarAccess.getImportAccess().getImportAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__0__Impl"



	// $ANTLR start "rule__Import__Group__1"
	// InternalMapping.g:888:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
	public final void rule__Import__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:892:2: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
			// InternalMapping.g:893:2: rule__Import__Group__1__Impl rule__Import__Group__2
			{
			pushFollow(FOLLOW_10);
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__1"



	// $ANTLR start "rule__Import__Group__1__Impl"
	// InternalMapping.g:900:1: rule__Import__Group__1__Impl : ( 'import' ) ;
	public final void rule__Import__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:904:2: ( ( 'import' ) )
			// InternalMapping.g:905:2: ( 'import' )
			{
			// InternalMapping.g:905:2: ( 'import' )
			// InternalMapping.g:906:2: 'import'
			{
			 before(grammarAccess.getImportAccess().getImportKeyword_1()); 
			match(input,19,FOLLOW_2); 
			 after(grammarAccess.getImportAccess().getImportKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__1__Impl"



	// $ANTLR start "rule__Import__Group__2"
	// InternalMapping.g:915:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
	public final void rule__Import__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:919:2: ( rule__Import__Group__2__Impl )
			// InternalMapping.g:920:2: rule__Import__Group__2__Impl
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__2"



	// $ANTLR start "rule__Import__Group__2__Impl"
	// InternalMapping.g:926:1: rule__Import__Group__2__Impl : ( ( rule__Import__NameAssignment_2 ) ) ;
	public final void rule__Import__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:930:2: ( ( ( rule__Import__NameAssignment_2 ) ) )
			// InternalMapping.g:931:2: ( ( rule__Import__NameAssignment_2 ) )
			{
			// InternalMapping.g:931:2: ( ( rule__Import__NameAssignment_2 ) )
			// InternalMapping.g:932:2: ( rule__Import__NameAssignment_2 )
			{
			 before(grammarAccess.getImportAccess().getNameAssignment_2()); 
			// InternalMapping.g:933:2: ( rule__Import__NameAssignment_2 )
			// InternalMapping.g:933:3: rule__Import__NameAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Import__NameAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getImportAccess().getNameAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__2__Impl"



	// $ANTLR start "rule__Mapping__Group__0"
	// InternalMapping.g:942:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
	public final void rule__Mapping__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:946:2: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
			// InternalMapping.g:947:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
			{
			pushFollow(FOLLOW_6);
			rule__Mapping__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__0"



	// $ANTLR start "rule__Mapping__Group__0__Impl"
	// InternalMapping.g:954:1: rule__Mapping__Group__0__Impl : ( () ) ;
	public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:958:2: ( ( () ) )
			// InternalMapping.g:959:2: ( () )
			{
			// InternalMapping.g:959:2: ( () )
			// InternalMapping.g:960:2: ()
			{
			 before(grammarAccess.getMappingAccess().getMappingAction_0()); 
			// InternalMapping.g:961:2: ()
			// InternalMapping.g:961:3: 
			{
			}

			 after(grammarAccess.getMappingAccess().getMappingAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__0__Impl"



	// $ANTLR start "rule__Mapping__Group__1"
	// InternalMapping.g:969:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
	public final void rule__Mapping__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:973:2: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
			// InternalMapping.g:974:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
			{
			pushFollow(FOLLOW_10);
			rule__Mapping__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__1"



	// $ANTLR start "rule__Mapping__Group__1__Impl"
	// InternalMapping.g:981:1: rule__Mapping__Group__1__Impl : ( 'map' ) ;
	public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:985:2: ( ( 'map' ) )
			// InternalMapping.g:986:2: ( 'map' )
			{
			// InternalMapping.g:986:2: ( 'map' )
			// InternalMapping.g:987:2: 'map'
			{
			 before(grammarAccess.getMappingAccess().getMapKeyword_1()); 
			match(input,20,FOLLOW_2); 
			 after(grammarAccess.getMappingAccess().getMapKeyword_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__1__Impl"



	// $ANTLR start "rule__Mapping__Group__2"
	// InternalMapping.g:996:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
	public final void rule__Mapping__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1000:2: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
			// InternalMapping.g:1001:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
			{
			pushFollow(FOLLOW_12);
			rule__Mapping__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__2"



	// $ANTLR start "rule__Mapping__Group__2__Impl"
	// InternalMapping.g:1008:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__NameAssignment_2 ) ) ;
	public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1012:2: ( ( ( rule__Mapping__NameAssignment_2 ) ) )
			// InternalMapping.g:1013:2: ( ( rule__Mapping__NameAssignment_2 ) )
			{
			// InternalMapping.g:1013:2: ( ( rule__Mapping__NameAssignment_2 ) )
			// InternalMapping.g:1014:2: ( rule__Mapping__NameAssignment_2 )
			{
			 before(grammarAccess.getMappingAccess().getNameAssignment_2()); 
			// InternalMapping.g:1015:2: ( rule__Mapping__NameAssignment_2 )
			// InternalMapping.g:1015:3: rule__Mapping__NameAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Mapping__NameAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getMappingAccess().getNameAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__2__Impl"



	// $ANTLR start "rule__Mapping__Group__3"
	// InternalMapping.g:1023:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
	public final void rule__Mapping__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1027:2: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
			// InternalMapping.g:1028:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
			{
			pushFollow(FOLLOW_13);
			rule__Mapping__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__3"



	// $ANTLR start "rule__Mapping__Group__3__Impl"
	// InternalMapping.g:1035:1: rule__Mapping__Group__3__Impl : ( '{' ) ;
	public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1039:2: ( ( '{' ) )
			// InternalMapping.g:1040:2: ( '{' )
			{
			// InternalMapping.g:1040:2: ( '{' )
			// InternalMapping.g:1041:2: '{'
			{
			 before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); 
			match(input,23,FOLLOW_2); 
			 after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__3__Impl"



	// $ANTLR start "rule__Mapping__Group__4"
	// InternalMapping.g:1050:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
	public final void rule__Mapping__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1054:2: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
			// InternalMapping.g:1055:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
			{
			pushFollow(FOLLOW_10);
			rule__Mapping__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__4"



	// $ANTLR start "rule__Mapping__Group__4__Impl"
	// InternalMapping.g:1062:1: rule__Mapping__Group__4__Impl : ( ( 'export' )? ) ;
	public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1066:2: ( ( ( 'export' )? ) )
			// InternalMapping.g:1067:2: ( ( 'export' )? )
			{
			// InternalMapping.g:1067:2: ( ( 'export' )? )
			// InternalMapping.g:1068:2: ( 'export' )?
			{
			 before(grammarAccess.getMappingAccess().getExportKeyword_4()); 
			// InternalMapping.g:1069:2: ( 'export' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==18) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// InternalMapping.g:1069:3: 'export'
					{
					match(input,18,FOLLOW_2); 
					}
					break;

			}

			 after(grammarAccess.getMappingAccess().getExportKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__4__Impl"



	// $ANTLR start "rule__Mapping__Group__5"
	// InternalMapping.g:1077:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
	public final void rule__Mapping__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1081:2: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
			// InternalMapping.g:1082:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
			{
			pushFollow(FOLLOW_14);
			rule__Mapping__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Mapping__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__5"



	// $ANTLR start "rule__Mapping__Group__5__Impl"
	// InternalMapping.g:1089:1: rule__Mapping__Group__5__Impl : ( ( rule__Mapping__ComponentAssignment_5 ) ) ;
	public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1093:2: ( ( ( rule__Mapping__ComponentAssignment_5 ) ) )
			// InternalMapping.g:1094:2: ( ( rule__Mapping__ComponentAssignment_5 ) )
			{
			// InternalMapping.g:1094:2: ( ( rule__Mapping__ComponentAssignment_5 ) )
			// InternalMapping.g:1095:2: ( rule__Mapping__ComponentAssignment_5 )
			{
			 before(grammarAccess.getMappingAccess().getComponentAssignment_5()); 
			// InternalMapping.g:1096:2: ( rule__Mapping__ComponentAssignment_5 )
			// InternalMapping.g:1096:3: rule__Mapping__ComponentAssignment_5
			{
			pushFollow(FOLLOW_2);
			rule__Mapping__ComponentAssignment_5();
			state._fsp--;

			}

			 after(grammarAccess.getMappingAccess().getComponentAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__5__Impl"



	// $ANTLR start "rule__Mapping__Group__6"
	// InternalMapping.g:1104:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl ;
	public final void rule__Mapping__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1108:2: ( rule__Mapping__Group__6__Impl )
			// InternalMapping.g:1109:2: rule__Mapping__Group__6__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Mapping__Group__6__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__6"



	// $ANTLR start "rule__Mapping__Group__6__Impl"
	// InternalMapping.g:1115:1: rule__Mapping__Group__6__Impl : ( '}' ) ;
	public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1119:2: ( ( '}' ) )
			// InternalMapping.g:1120:2: ( '}' )
			{
			// InternalMapping.g:1120:2: ( '}' )
			// InternalMapping.g:1121:2: '}'
			{
			 before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
			match(input,24,FOLLOW_2); 
			 after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__Group__6__Impl"



	// $ANTLR start "rule__Component__Group__0"
	// InternalMapping.g:1131:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
	public final void rule__Component__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1135:2: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
			// InternalMapping.g:1136:2: rule__Component__Group__0__Impl rule__Component__Group__1
			{
			pushFollow(FOLLOW_10);
			rule__Component__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Component__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__0"



	// $ANTLR start "rule__Component__Group__0__Impl"
	// InternalMapping.g:1143:1: rule__Component__Group__0__Impl : ( () ) ;
	public final void rule__Component__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1147:2: ( ( () ) )
			// InternalMapping.g:1148:2: ( () )
			{
			// InternalMapping.g:1148:2: ( () )
			// InternalMapping.g:1149:2: ()
			{
			 before(grammarAccess.getComponentAccess().getComponentAction_0()); 
			// InternalMapping.g:1150:2: ()
			// InternalMapping.g:1150:3: 
			{
			}

			 after(grammarAccess.getComponentAccess().getComponentAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__0__Impl"



	// $ANTLR start "rule__Component__Group__1"
	// InternalMapping.g:1158:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
	public final void rule__Component__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1162:2: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
			// InternalMapping.g:1163:2: rule__Component__Group__1__Impl rule__Component__Group__2
			{
			pushFollow(FOLLOW_12);
			rule__Component__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Component__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__1"



	// $ANTLR start "rule__Component__Group__1__Impl"
	// InternalMapping.g:1170:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
	public final void rule__Component__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1174:2: ( ( ( rule__Component__NameAssignment_1 ) ) )
			// InternalMapping.g:1175:2: ( ( rule__Component__NameAssignment_1 ) )
			{
			// InternalMapping.g:1175:2: ( ( rule__Component__NameAssignment_1 ) )
			// InternalMapping.g:1176:2: ( rule__Component__NameAssignment_1 )
			{
			 before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
			// InternalMapping.g:1177:2: ( rule__Component__NameAssignment_1 )
			// InternalMapping.g:1177:3: rule__Component__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Component__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getComponentAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__1__Impl"



	// $ANTLR start "rule__Component__Group__2"
	// InternalMapping.g:1185:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
	public final void rule__Component__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1189:2: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
			// InternalMapping.g:1190:2: rule__Component__Group__2__Impl rule__Component__Group__3
			{
			pushFollow(FOLLOW_15);
			rule__Component__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Component__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__2"



	// $ANTLR start "rule__Component__Group__2__Impl"
	// InternalMapping.g:1197:1: rule__Component__Group__2__Impl : ( '{' ) ;
	public final void rule__Component__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1201:2: ( ( '{' ) )
			// InternalMapping.g:1202:2: ( '{' )
			{
			// InternalMapping.g:1202:2: ( '{' )
			// InternalMapping.g:1203:2: '{'
			{
			 before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
			match(input,23,FOLLOW_2); 
			 after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__2__Impl"



	// $ANTLR start "rule__Component__Group__3"
	// InternalMapping.g:1212:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
	public final void rule__Component__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1216:2: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
			// InternalMapping.g:1217:2: rule__Component__Group__3__Impl rule__Component__Group__4
			{
			pushFollow(FOLLOW_14);
			rule__Component__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Component__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__3"



	// $ANTLR start "rule__Component__Group__3__Impl"
	// InternalMapping.g:1224:1: rule__Component__Group__3__Impl : ( ( rule__Component__MappingPairAssignment_3 )* ) ;
	public final void rule__Component__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1228:2: ( ( ( rule__Component__MappingPairAssignment_3 )* ) )
			// InternalMapping.g:1229:2: ( ( rule__Component__MappingPairAssignment_3 )* )
			{
			// InternalMapping.g:1229:2: ( ( rule__Component__MappingPairAssignment_3 )* )
			// InternalMapping.g:1230:2: ( rule__Component__MappingPairAssignment_3 )*
			{
			 before(grammarAccess.getComponentAccess().getMappingPairAssignment_3()); 
			// InternalMapping.g:1231:2: ( rule__Component__MappingPairAssignment_3 )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==RULE_ID) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// InternalMapping.g:1231:3: rule__Component__MappingPairAssignment_3
					{
					pushFollow(FOLLOW_16);
					rule__Component__MappingPairAssignment_3();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			 after(grammarAccess.getComponentAccess().getMappingPairAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__3__Impl"



	// $ANTLR start "rule__Component__Group__4"
	// InternalMapping.g:1239:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
	public final void rule__Component__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1243:2: ( rule__Component__Group__4__Impl )
			// InternalMapping.g:1244:2: rule__Component__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Component__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__4"



	// $ANTLR start "rule__Component__Group__4__Impl"
	// InternalMapping.g:1250:1: rule__Component__Group__4__Impl : ( '}' ) ;
	public final void rule__Component__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1254:2: ( ( '}' ) )
			// InternalMapping.g:1255:2: ( '}' )
			{
			// InternalMapping.g:1255:2: ( '}' )
			// InternalMapping.g:1256:2: '}'
			{
			 before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
			match(input,24,FOLLOW_2); 
			 after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__Group__4__Impl"



	// $ANTLR start "rule__MappingPair__Group__0"
	// InternalMapping.g:1266:1: rule__MappingPair__Group__0 : rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 ;
	public final void rule__MappingPair__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1270:2: ( rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1 )
			// InternalMapping.g:1271:2: rule__MappingPair__Group__0__Impl rule__MappingPair__Group__1
			{
			pushFollow(FOLLOW_17);
			rule__MappingPair__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__0"



	// $ANTLR start "rule__MappingPair__Group__0__Impl"
	// InternalMapping.g:1278:1: rule__MappingPair__Group__0__Impl : ( () ) ;
	public final void rule__MappingPair__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1282:2: ( ( () ) )
			// InternalMapping.g:1283:2: ( () )
			{
			// InternalMapping.g:1283:2: ( () )
			// InternalMapping.g:1284:2: ()
			{
			 before(grammarAccess.getMappingPairAccess().getMappingPairAction_0()); 
			// InternalMapping.g:1285:2: ()
			// InternalMapping.g:1285:3: 
			{
			}

			 after(grammarAccess.getMappingPairAccess().getMappingPairAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__0__Impl"



	// $ANTLR start "rule__MappingPair__Group__1"
	// InternalMapping.g:1293:1: rule__MappingPair__Group__1 : rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 ;
	public final void rule__MappingPair__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1297:2: ( rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2 )
			// InternalMapping.g:1298:2: rule__MappingPair__Group__1__Impl rule__MappingPair__Group__2
			{
			pushFollow(FOLLOW_18);
			rule__MappingPair__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__1"



	// $ANTLR start "rule__MappingPair__Group__1__Impl"
	// InternalMapping.g:1305:1: rule__MappingPair__Group__1__Impl : ( ( rule__MappingPair__PortAssignment_1 ) ) ;
	public final void rule__MappingPair__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1309:2: ( ( ( rule__MappingPair__PortAssignment_1 ) ) )
			// InternalMapping.g:1310:2: ( ( rule__MappingPair__PortAssignment_1 ) )
			{
			// InternalMapping.g:1310:2: ( ( rule__MappingPair__PortAssignment_1 ) )
			// InternalMapping.g:1311:2: ( rule__MappingPair__PortAssignment_1 )
			{
			 before(grammarAccess.getMappingPairAccess().getPortAssignment_1()); 
			// InternalMapping.g:1312:2: ( rule__MappingPair__PortAssignment_1 )
			// InternalMapping.g:1312:3: rule__MappingPair__PortAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__MappingPair__PortAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getMappingPairAccess().getPortAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__1__Impl"



	// $ANTLR start "rule__MappingPair__Group__2"
	// InternalMapping.g:1320:1: rule__MappingPair__Group__2 : rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 ;
	public final void rule__MappingPair__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1324:2: ( rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3 )
			// InternalMapping.g:1325:2: rule__MappingPair__Group__2__Impl rule__MappingPair__Group__3
			{
			pushFollow(FOLLOW_19);
			rule__MappingPair__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__2"



	// $ANTLR start "rule__MappingPair__Group__2__Impl"
	// InternalMapping.g:1332:1: rule__MappingPair__Group__2__Impl : ( '->' ) ;
	public final void rule__MappingPair__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1336:2: ( ( '->' ) )
			// InternalMapping.g:1337:2: ( '->' )
			{
			// InternalMapping.g:1337:2: ( '->' )
			// InternalMapping.g:1338:2: '->'
			{
			 before(grammarAccess.getMappingPairAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
			match(input,11,FOLLOW_2); 
			 after(grammarAccess.getMappingPairAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__2__Impl"



	// $ANTLR start "rule__MappingPair__Group__3"
	// InternalMapping.g:1347:1: rule__MappingPair__Group__3 : rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 ;
	public final void rule__MappingPair__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1351:2: ( rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4 )
			// InternalMapping.g:1352:2: rule__MappingPair__Group__3__Impl rule__MappingPair__Group__4
			{
			pushFollow(FOLLOW_20);
			rule__MappingPair__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__3"



	// $ANTLR start "rule__MappingPair__Group__3__Impl"
	// InternalMapping.g:1359:1: rule__MappingPair__Group__3__Impl : ( ( rule__MappingPair__DiagramAssignment_3 ) ) ;
	public final void rule__MappingPair__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1363:2: ( ( ( rule__MappingPair__DiagramAssignment_3 ) ) )
			// InternalMapping.g:1364:2: ( ( rule__MappingPair__DiagramAssignment_3 ) )
			{
			// InternalMapping.g:1364:2: ( ( rule__MappingPair__DiagramAssignment_3 ) )
			// InternalMapping.g:1365:2: ( rule__MappingPair__DiagramAssignment_3 )
			{
			 before(grammarAccess.getMappingPairAccess().getDiagramAssignment_3()); 
			// InternalMapping.g:1366:2: ( rule__MappingPair__DiagramAssignment_3 )
			// InternalMapping.g:1366:3: rule__MappingPair__DiagramAssignment_3
			{
			pushFollow(FOLLOW_2);
			rule__MappingPair__DiagramAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getMappingPairAccess().getDiagramAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__3__Impl"



	// $ANTLR start "rule__MappingPair__Group__4"
	// InternalMapping.g:1374:1: rule__MappingPair__Group__4 : rule__MappingPair__Group__4__Impl ;
	public final void rule__MappingPair__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1378:2: ( rule__MappingPair__Group__4__Impl )
			// InternalMapping.g:1379:2: rule__MappingPair__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__MappingPair__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__4"



	// $ANTLR start "rule__MappingPair__Group__4__Impl"
	// InternalMapping.g:1385:1: rule__MappingPair__Group__4__Impl : ( ';' ) ;
	public final void rule__MappingPair__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1389:2: ( ( ';' ) )
			// InternalMapping.g:1390:2: ( ';' )
			{
			// InternalMapping.g:1390:2: ( ';' )
			// InternalMapping.g:1391:2: ';'
			{
			 before(grammarAccess.getMappingPairAccess().getSemicolonKeyword_4()); 
			match(input,14,FOLLOW_2); 
			 after(grammarAccess.getMappingPairAccess().getSemicolonKeyword_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__Group__4__Impl"



	// $ANTLR start "rule__ServiceMethod__Group__0"
	// InternalMapping.g:1401:1: rule__ServiceMethod__Group__0 : rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 ;
	public final void rule__ServiceMethod__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1405:2: ( rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 )
			// InternalMapping.g:1406:2: rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1
			{
			pushFollow(FOLLOW_17);
			rule__ServiceMethod__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__ServiceMethod__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ServiceMethod__Group__0"



	// $ANTLR start "rule__ServiceMethod__Group__0__Impl"
	// InternalMapping.g:1413:1: rule__ServiceMethod__Group__0__Impl : ( () ) ;
	public final void rule__ServiceMethod__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1417:2: ( ( () ) )
			// InternalMapping.g:1418:2: ( () )
			{
			// InternalMapping.g:1418:2: ( () )
			// InternalMapping.g:1419:2: ()
			{
			 before(grammarAccess.getServiceMethodAccess().getServiceMethodAction_0()); 
			// InternalMapping.g:1420:2: ()
			// InternalMapping.g:1420:3: 
			{
			}

			 after(grammarAccess.getServiceMethodAccess().getServiceMethodAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ServiceMethod__Group__0__Impl"



	// $ANTLR start "rule__ServiceMethod__Group__1"
	// InternalMapping.g:1428:1: rule__ServiceMethod__Group__1 : rule__ServiceMethod__Group__1__Impl ;
	public final void rule__ServiceMethod__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1432:2: ( rule__ServiceMethod__Group__1__Impl )
			// InternalMapping.g:1433:2: rule__ServiceMethod__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__ServiceMethod__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ServiceMethod__Group__1"



	// $ANTLR start "rule__ServiceMethod__Group__1__Impl"
	// InternalMapping.g:1439:1: rule__ServiceMethod__Group__1__Impl : ( ( rule__ServiceMethod__NameAssignment_1 ) ) ;
	public final void rule__ServiceMethod__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1443:2: ( ( ( rule__ServiceMethod__NameAssignment_1 ) ) )
			// InternalMapping.g:1444:2: ( ( rule__ServiceMethod__NameAssignment_1 ) )
			{
			// InternalMapping.g:1444:2: ( ( rule__ServiceMethod__NameAssignment_1 ) )
			// InternalMapping.g:1445:2: ( rule__ServiceMethod__NameAssignment_1 )
			{
			 before(grammarAccess.getServiceMethodAccess().getNameAssignment_1()); 
			// InternalMapping.g:1446:2: ( rule__ServiceMethod__NameAssignment_1 )
			// InternalMapping.g:1446:3: rule__ServiceMethod__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__ServiceMethod__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getServiceMethodAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ServiceMethod__Group__1__Impl"



	// $ANTLR start "rule__CbcDiagram__Group_0__0"
	// InternalMapping.g:1455:1: rule__CbcDiagram__Group_0__0 : rule__CbcDiagram__Group_0__0__Impl rule__CbcDiagram__Group_0__1 ;
	public final void rule__CbcDiagram__Group_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1459:2: ( rule__CbcDiagram__Group_0__0__Impl rule__CbcDiagram__Group_0__1 )
			// InternalMapping.g:1460:2: rule__CbcDiagram__Group_0__0__Impl rule__CbcDiagram__Group_0__1
			{
			pushFollow(FOLLOW_10);
			rule__CbcDiagram__Group_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CbcDiagram__Group_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__Group_0__0"



	// $ANTLR start "rule__CbcDiagram__Group_0__0__Impl"
	// InternalMapping.g:1467:1: rule__CbcDiagram__Group_0__0__Impl : ( () ) ;
	public final void rule__CbcDiagram__Group_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1471:2: ( ( () ) )
			// InternalMapping.g:1472:2: ( () )
			{
			// InternalMapping.g:1472:2: ( () )
			// InternalMapping.g:1473:2: ()
			{
			 before(grammarAccess.getCbcDiagramAccess().getCbcDiagramAction_0_0()); 
			// InternalMapping.g:1474:2: ()
			// InternalMapping.g:1474:3: 
			{
			}

			 after(grammarAccess.getCbcDiagramAccess().getCbcDiagramAction_0_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__Group_0__0__Impl"



	// $ANTLR start "rule__CbcDiagram__Group_0__1"
	// InternalMapping.g:1482:1: rule__CbcDiagram__Group_0__1 : rule__CbcDiagram__Group_0__1__Impl ;
	public final void rule__CbcDiagram__Group_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1486:2: ( rule__CbcDiagram__Group_0__1__Impl )
			// InternalMapping.g:1487:2: rule__CbcDiagram__Group_0__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__CbcDiagram__Group_0__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__Group_0__1"



	// $ANTLR start "rule__CbcDiagram__Group_0__1__Impl"
	// InternalMapping.g:1493:1: rule__CbcDiagram__Group_0__1__Impl : ( ( rule__CbcDiagram__NameAssignment_0_1 ) ) ;
	public final void rule__CbcDiagram__Group_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1497:2: ( ( ( rule__CbcDiagram__NameAssignment_0_1 ) ) )
			// InternalMapping.g:1498:2: ( ( rule__CbcDiagram__NameAssignment_0_1 ) )
			{
			// InternalMapping.g:1498:2: ( ( rule__CbcDiagram__NameAssignment_0_1 ) )
			// InternalMapping.g:1499:2: ( rule__CbcDiagram__NameAssignment_0_1 )
			{
			 before(grammarAccess.getCbcDiagramAccess().getNameAssignment_0_1()); 
			// InternalMapping.g:1500:2: ( rule__CbcDiagram__NameAssignment_0_1 )
			// InternalMapping.g:1500:3: rule__CbcDiagram__NameAssignment_0_1
			{
			pushFollow(FOLLOW_2);
			rule__CbcDiagram__NameAssignment_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getCbcDiagramAccess().getNameAssignment_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__Group_0__1__Impl"



	// $ANTLR start "rule__FQN__Group__0"
	// InternalMapping.g:1509:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
	public final void rule__FQN__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1513:2: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
			// InternalMapping.g:1514:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
			{
			pushFollow(FOLLOW_21);
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group__0"



	// $ANTLR start "rule__FQN__Group__0__Impl"
	// InternalMapping.g:1521:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
	public final void rule__FQN__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1525:2: ( ( RULE_ID ) )
			// InternalMapping.g:1526:2: ( RULE_ID )
			{
			// InternalMapping.g:1526:2: ( RULE_ID )
			// InternalMapping.g:1527:2: RULE_ID
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group__0__Impl"



	// $ANTLR start "rule__FQN__Group__1"
	// InternalMapping.g:1536:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
	public final void rule__FQN__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1540:2: ( rule__FQN__Group__1__Impl )
			// InternalMapping.g:1541:2: rule__FQN__Group__1__Impl
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group__1"



	// $ANTLR start "rule__FQN__Group__1__Impl"
	// InternalMapping.g:1547:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
	public final void rule__FQN__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1551:2: ( ( ( rule__FQN__Group_1__0 )* ) )
			// InternalMapping.g:1552:2: ( ( rule__FQN__Group_1__0 )* )
			{
			// InternalMapping.g:1552:2: ( ( rule__FQN__Group_1__0 )* )
			// InternalMapping.g:1553:2: ( rule__FQN__Group_1__0 )*
			{
			 before(grammarAccess.getFQNAccess().getGroup_1()); 
			// InternalMapping.g:1554:2: ( rule__FQN__Group_1__0 )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==12) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// InternalMapping.g:1554:3: rule__FQN__Group_1__0
					{
					pushFollow(FOLLOW_22);
					rule__FQN__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			 after(grammarAccess.getFQNAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group__1__Impl"



	// $ANTLR start "rule__FQN__Group_1__0"
	// InternalMapping.g:1563:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
	public final void rule__FQN__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1567:2: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
			// InternalMapping.g:1568:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
			{
			pushFollow(FOLLOW_17);
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group_1__0"



	// $ANTLR start "rule__FQN__Group_1__0__Impl"
	// InternalMapping.g:1575:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
	public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1579:2: ( ( '.' ) )
			// InternalMapping.g:1580:2: ( '.' )
			{
			// InternalMapping.g:1580:2: ( '.' )
			// InternalMapping.g:1581:2: '.'
			{
			 before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group_1__0__Impl"



	// $ANTLR start "rule__FQN__Group_1__1"
	// InternalMapping.g:1590:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
	public final void rule__FQN__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1594:2: ( rule__FQN__Group_1__1__Impl )
			// InternalMapping.g:1595:2: rule__FQN__Group_1__1__Impl
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group_1__1"



	// $ANTLR start "rule__FQN__Group_1__1__Impl"
	// InternalMapping.g:1601:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
	public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1605:2: ( ( RULE_ID ) )
			// InternalMapping.g:1606:2: ( RULE_ID )
			{
			// InternalMapping.g:1606:2: ( RULE_ID )
			// InternalMapping.g:1607:2: RULE_ID
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__FQN__Group_1__1__Impl"



	// $ANTLR start "rule__EString__Group_1__0"
	// InternalMapping.g:1617:1: rule__EString__Group_1__0 : rule__EString__Group_1__0__Impl rule__EString__Group_1__1 ;
	public final void rule__EString__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1621:2: ( rule__EString__Group_1__0__Impl rule__EString__Group_1__1 )
			// InternalMapping.g:1622:2: rule__EString__Group_1__0__Impl rule__EString__Group_1__1
			{
			pushFollow(FOLLOW_23);
			rule__EString__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__0"



	// $ANTLR start "rule__EString__Group_1__0__Impl"
	// InternalMapping.g:1629:1: rule__EString__Group_1__0__Impl : ( RULE_ID ) ;
	public final void rule__EString__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1633:2: ( ( RULE_ID ) )
			// InternalMapping.g:1634:2: ( RULE_ID )
			{
			// InternalMapping.g:1634:2: ( RULE_ID )
			// InternalMapping.g:1635:2: RULE_ID
			{
			 before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__0__Impl"



	// $ANTLR start "rule__EString__Group_1__1"
	// InternalMapping.g:1644:1: rule__EString__Group_1__1 : rule__EString__Group_1__1__Impl rule__EString__Group_1__2 ;
	public final void rule__EString__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1648:2: ( rule__EString__Group_1__1__Impl rule__EString__Group_1__2 )
			// InternalMapping.g:1649:2: rule__EString__Group_1__1__Impl rule__EString__Group_1__2
			{
			pushFollow(FOLLOW_21);
			rule__EString__Group_1__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_1__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__1"



	// $ANTLR start "rule__EString__Group_1__1__Impl"
	// InternalMapping.g:1656:1: rule__EString__Group_1__1__Impl : ( ( rule__EString__Group_1_1__0 )* ) ;
	public final void rule__EString__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1660:2: ( ( ( rule__EString__Group_1_1__0 )* ) )
			// InternalMapping.g:1661:2: ( ( rule__EString__Group_1_1__0 )* )
			{
			// InternalMapping.g:1661:2: ( ( rule__EString__Group_1_1__0 )* )
			// InternalMapping.g:1662:2: ( rule__EString__Group_1_1__0 )*
			{
			 before(grammarAccess.getEStringAccess().getGroup_1_1()); 
			// InternalMapping.g:1663:2: ( rule__EString__Group_1_1__0 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==13) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// InternalMapping.g:1663:3: rule__EString__Group_1_1__0
					{
					pushFollow(FOLLOW_24);
					rule__EString__Group_1_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			 after(grammarAccess.getEStringAccess().getGroup_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__1__Impl"



	// $ANTLR start "rule__EString__Group_1__2"
	// InternalMapping.g:1671:1: rule__EString__Group_1__2 : rule__EString__Group_1__2__Impl ;
	public final void rule__EString__Group_1__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1675:2: ( rule__EString__Group_1__2__Impl )
			// InternalMapping.g:1676:2: rule__EString__Group_1__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EString__Group_1__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__2"



	// $ANTLR start "rule__EString__Group_1__2__Impl"
	// InternalMapping.g:1682:1: rule__EString__Group_1__2__Impl : ( ( rule__EString__Group_1_2__0 )* ) ;
	public final void rule__EString__Group_1__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1686:2: ( ( ( rule__EString__Group_1_2__0 )* ) )
			// InternalMapping.g:1687:2: ( ( rule__EString__Group_1_2__0 )* )
			{
			// InternalMapping.g:1687:2: ( ( rule__EString__Group_1_2__0 )* )
			// InternalMapping.g:1688:2: ( rule__EString__Group_1_2__0 )*
			{
			 before(grammarAccess.getEStringAccess().getGroup_1_2()); 
			// InternalMapping.g:1689:2: ( rule__EString__Group_1_2__0 )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==12) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// InternalMapping.g:1689:3: rule__EString__Group_1_2__0
					{
					pushFollow(FOLLOW_22);
					rule__EString__Group_1_2__0();
					state._fsp--;

					}
					break;

				default :
					break loop11;
				}
			}

			 after(grammarAccess.getEStringAccess().getGroup_1_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1__2__Impl"



	// $ANTLR start "rule__EString__Group_1_1__0"
	// InternalMapping.g:1698:1: rule__EString__Group_1_1__0 : rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1 ;
	public final void rule__EString__Group_1_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1702:2: ( rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1 )
			// InternalMapping.g:1703:2: rule__EString__Group_1_1__0__Impl rule__EString__Group_1_1__1
			{
			pushFollow(FOLLOW_17);
			rule__EString__Group_1_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_1_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_1__0"



	// $ANTLR start "rule__EString__Group_1_1__0__Impl"
	// InternalMapping.g:1710:1: rule__EString__Group_1_1__0__Impl : ( '/' ) ;
	public final void rule__EString__Group_1_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1714:2: ( ( '/' ) )
			// InternalMapping.g:1715:2: ( '/' )
			{
			// InternalMapping.g:1715:2: ( '/' )
			// InternalMapping.g:1716:2: '/'
			{
			 before(grammarAccess.getEStringAccess().getSolidusKeyword_1_1_0()); 
			match(input,13,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getSolidusKeyword_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_1__0__Impl"



	// $ANTLR start "rule__EString__Group_1_1__1"
	// InternalMapping.g:1725:1: rule__EString__Group_1_1__1 : rule__EString__Group_1_1__1__Impl ;
	public final void rule__EString__Group_1_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1729:2: ( rule__EString__Group_1_1__1__Impl )
			// InternalMapping.g:1730:2: rule__EString__Group_1_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EString__Group_1_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_1__1"



	// $ANTLR start "rule__EString__Group_1_1__1__Impl"
	// InternalMapping.g:1736:1: rule__EString__Group_1_1__1__Impl : ( RULE_ID ) ;
	public final void rule__EString__Group_1_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1740:2: ( ( RULE_ID ) )
			// InternalMapping.g:1741:2: ( RULE_ID )
			{
			// InternalMapping.g:1741:2: ( RULE_ID )
			// InternalMapping.g:1742:2: RULE_ID
			{
			 before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_1__1__Impl"



	// $ANTLR start "rule__EString__Group_1_2__0"
	// InternalMapping.g:1752:1: rule__EString__Group_1_2__0 : rule__EString__Group_1_2__0__Impl rule__EString__Group_1_2__1 ;
	public final void rule__EString__Group_1_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1756:2: ( rule__EString__Group_1_2__0__Impl rule__EString__Group_1_2__1 )
			// InternalMapping.g:1757:2: rule__EString__Group_1_2__0__Impl rule__EString__Group_1_2__1
			{
			pushFollow(FOLLOW_17);
			rule__EString__Group_1_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_1_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_2__0"



	// $ANTLR start "rule__EString__Group_1_2__0__Impl"
	// InternalMapping.g:1764:1: rule__EString__Group_1_2__0__Impl : ( '.' ) ;
	public final void rule__EString__Group_1_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1768:2: ( ( '.' ) )
			// InternalMapping.g:1769:2: ( '.' )
			{
			// InternalMapping.g:1769:2: ( '.' )
			// InternalMapping.g:1770:2: '.'
			{
			 before(grammarAccess.getEStringAccess().getFullStopKeyword_1_2_0()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getFullStopKeyword_1_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_2__0__Impl"



	// $ANTLR start "rule__EString__Group_1_2__1"
	// InternalMapping.g:1779:1: rule__EString__Group_1_2__1 : rule__EString__Group_1_2__1__Impl ;
	public final void rule__EString__Group_1_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1783:2: ( rule__EString__Group_1_2__1__Impl )
			// InternalMapping.g:1784:2: rule__EString__Group_1_2__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EString__Group_1_2__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_2__1"



	// $ANTLR start "rule__EString__Group_1_2__1__Impl"
	// InternalMapping.g:1790:1: rule__EString__Group_1_2__1__Impl : ( RULE_ID ) ;
	public final void rule__EString__Group_1_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1794:2: ( ( RULE_ID ) )
			// InternalMapping.g:1795:2: ( RULE_ID )
			{
			// InternalMapping.g:1795:2: ( RULE_ID )
			// InternalMapping.g:1796:2: RULE_ID
			{
			 before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_2_1()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_1_2__1__Impl"



	// $ANTLR start "rule__EString__Group_2__0"
	// InternalMapping.g:1806:1: rule__EString__Group_2__0 : rule__EString__Group_2__0__Impl rule__EString__Group_2__1 ;
	public final void rule__EString__Group_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1810:2: ( rule__EString__Group_2__0__Impl rule__EString__Group_2__1 )
			// InternalMapping.g:1811:2: rule__EString__Group_2__0__Impl rule__EString__Group_2__1
			{
			pushFollow(FOLLOW_21);
			rule__EString__Group_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2__0"



	// $ANTLR start "rule__EString__Group_2__0__Impl"
	// InternalMapping.g:1818:1: rule__EString__Group_2__0__Impl : ( RULE_INT ) ;
	public final void rule__EString__Group_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1822:2: ( ( RULE_INT ) )
			// InternalMapping.g:1823:2: ( RULE_INT )
			{
			// InternalMapping.g:1823:2: ( RULE_INT )
			// InternalMapping.g:1824:2: RULE_INT
			{
			 before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_0()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2__0__Impl"



	// $ANTLR start "rule__EString__Group_2__1"
	// InternalMapping.g:1833:1: rule__EString__Group_2__1 : rule__EString__Group_2__1__Impl ;
	public final void rule__EString__Group_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1837:2: ( rule__EString__Group_2__1__Impl )
			// InternalMapping.g:1838:2: rule__EString__Group_2__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EString__Group_2__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2__1"



	// $ANTLR start "rule__EString__Group_2__1__Impl"
	// InternalMapping.g:1844:1: rule__EString__Group_2__1__Impl : ( ( rule__EString__Group_2_1__0 )* ) ;
	public final void rule__EString__Group_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1848:2: ( ( ( rule__EString__Group_2_1__0 )* ) )
			// InternalMapping.g:1849:2: ( ( rule__EString__Group_2_1__0 )* )
			{
			// InternalMapping.g:1849:2: ( ( rule__EString__Group_2_1__0 )* )
			// InternalMapping.g:1850:2: ( rule__EString__Group_2_1__0 )*
			{
			 before(grammarAccess.getEStringAccess().getGroup_2_1()); 
			// InternalMapping.g:1851:2: ( rule__EString__Group_2_1__0 )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==12) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// InternalMapping.g:1851:3: rule__EString__Group_2_1__0
					{
					pushFollow(FOLLOW_22);
					rule__EString__Group_2_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}

			 after(grammarAccess.getEStringAccess().getGroup_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2__1__Impl"



	// $ANTLR start "rule__EString__Group_2_1__0"
	// InternalMapping.g:1860:1: rule__EString__Group_2_1__0 : rule__EString__Group_2_1__0__Impl rule__EString__Group_2_1__1 ;
	public final void rule__EString__Group_2_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1864:2: ( rule__EString__Group_2_1__0__Impl rule__EString__Group_2_1__1 )
			// InternalMapping.g:1865:2: rule__EString__Group_2_1__0__Impl rule__EString__Group_2_1__1
			{
			pushFollow(FOLLOW_25);
			rule__EString__Group_2_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EString__Group_2_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2_1__0"



	// $ANTLR start "rule__EString__Group_2_1__0__Impl"
	// InternalMapping.g:1872:1: rule__EString__Group_2_1__0__Impl : ( '.' ) ;
	public final void rule__EString__Group_2_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1876:2: ( ( '.' ) )
			// InternalMapping.g:1877:2: ( '.' )
			{
			// InternalMapping.g:1877:2: ( '.' )
			// InternalMapping.g:1878:2: '.'
			{
			 before(grammarAccess.getEStringAccess().getFullStopKeyword_2_1_0()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getFullStopKeyword_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2_1__0__Impl"



	// $ANTLR start "rule__EString__Group_2_1__1"
	// InternalMapping.g:1887:1: rule__EString__Group_2_1__1 : rule__EString__Group_2_1__1__Impl ;
	public final void rule__EString__Group_2_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1891:2: ( rule__EString__Group_2_1__1__Impl )
			// InternalMapping.g:1892:2: rule__EString__Group_2_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EString__Group_2_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2_1__1"



	// $ANTLR start "rule__EString__Group_2_1__1__Impl"
	// InternalMapping.g:1898:1: rule__EString__Group_2_1__1__Impl : ( RULE_INT ) ;
	public final void rule__EString__Group_2_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1902:2: ( ( RULE_INT ) )
			// InternalMapping.g:1903:2: ( RULE_INT )
			{
			// InternalMapping.g:1903:2: ( RULE_INT )
			// InternalMapping.g:1904:2: RULE_INT
			{
			 before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_1_1()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EString__Group_2_1__1__Impl"



	// $ANTLR start "rule__MappingModel__AnnotationsAssignment_1"
	// InternalMapping.g:1914:1: rule__MappingModel__AnnotationsAssignment_1 : ( ruleAnnotation ) ;
	public final void rule__MappingModel__AnnotationsAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1918:2: ( ( ruleAnnotation ) )
			// InternalMapping.g:1919:2: ( ruleAnnotation )
			{
			// InternalMapping.g:1919:2: ( ruleAnnotation )
			// InternalMapping.g:1920:3: ruleAnnotation
			{
			 before(grammarAccess.getMappingModelAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleAnnotation();
			state._fsp--;

			 after(grammarAccess.getMappingModelAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__AnnotationsAssignment_1"



	// $ANTLR start "rule__MappingModel__ImportsAssignment_2"
	// InternalMapping.g:1929:1: rule__MappingModel__ImportsAssignment_2 : ( ruleImport ) ;
	public final void rule__MappingModel__ImportsAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1933:2: ( ( ruleImport ) )
			// InternalMapping.g:1934:2: ( ruleImport )
			{
			// InternalMapping.g:1934:2: ( ruleImport )
			// InternalMapping.g:1935:3: ruleImport
			{
			 before(grammarAccess.getMappingModelAccess().getImportsImportParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleImport();
			state._fsp--;

			 after(grammarAccess.getMappingModelAccess().getImportsImportParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__ImportsAssignment_2"



	// $ANTLR start "rule__MappingModel__MappingsAssignment_3"
	// InternalMapping.g:1944:1: rule__MappingModel__MappingsAssignment_3 : ( ruleMapping ) ;
	public final void rule__MappingModel__MappingsAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1948:2: ( ( ruleMapping ) )
			// InternalMapping.g:1949:2: ( ruleMapping )
			{
			// InternalMapping.g:1949:2: ( ruleMapping )
			// InternalMapping.g:1950:3: ruleMapping
			{
			 before(grammarAccess.getMappingModelAccess().getMappingsMappingParserRuleCall_3_0()); 
			pushFollow(FOLLOW_2);
			ruleMapping();
			state._fsp--;

			 after(grammarAccess.getMappingModelAccess().getMappingsMappingParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingModel__MappingsAssignment_3"



	// $ANTLR start "rule__Annotation__AnnotationAssignment_0_1"
	// InternalMapping.g:1959:1: rule__Annotation__AnnotationAssignment_0_1 : ( ruleVersion ) ;
	public final void rule__Annotation__AnnotationAssignment_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1963:2: ( ( ruleVersion ) )
			// InternalMapping.g:1964:2: ( ruleVersion )
			{
			// InternalMapping.g:1964:2: ( ruleVersion )
			// InternalMapping.g:1965:3: ruleVersion
			{
			 before(grammarAccess.getAnnotationAccess().getAnnotationVersionParserRuleCall_0_1_0()); 
			pushFollow(FOLLOW_2);
			ruleVersion();
			state._fsp--;

			 after(grammarAccess.getAnnotationAccess().getAnnotationVersionParserRuleCall_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Annotation__AnnotationAssignment_0_1"



	// $ANTLR start "rule__Version__NameAssignment_1"
	// InternalMapping.g:1974:1: rule__Version__NameAssignment_1 : ( ruleEString ) ;
	public final void rule__Version__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1978:2: ( ( ruleEString ) )
			// InternalMapping.g:1979:2: ( ruleEString )
			{
			// InternalMapping.g:1979:2: ( ruleEString )
			// InternalMapping.g:1980:3: ruleEString
			{
			 before(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getVersionAccess().getNameEStringParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Version__NameAssignment_1"



	// $ANTLR start "rule__Bundle__NameAssignment_1"
	// InternalMapping.g:1989:1: rule__Bundle__NameAssignment_1 : ( ruleEString ) ;
	public final void rule__Bundle__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:1993:2: ( ( ruleEString ) )
			// InternalMapping.g:1994:2: ( ruleEString )
			{
			// InternalMapping.g:1994:2: ( ruleEString )
			// InternalMapping.g:1995:3: ruleEString
			{
			 before(grammarAccess.getBundleAccess().getNameEStringParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getBundleAccess().getNameEStringParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Bundle__NameAssignment_1"



	// $ANTLR start "rule__Date__NameAssignment_1"
	// InternalMapping.g:2004:1: rule__Date__NameAssignment_1 : ( ruleEString ) ;
	public final void rule__Date__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2008:2: ( ( ruleEString ) )
			// InternalMapping.g:2009:2: ( ruleEString )
			{
			// InternalMapping.g:2009:2: ( ruleEString )
			// InternalMapping.g:2010:3: ruleEString
			{
			 before(grammarAccess.getDateAccess().getNameEStringParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getDateAccess().getNameEStringParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Date__NameAssignment_1"



	// $ANTLR start "rule__Author__NameAssignment_1"
	// InternalMapping.g:2019:1: rule__Author__NameAssignment_1 : ( ruleEString ) ;
	public final void rule__Author__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2023:2: ( ( ruleEString ) )
			// InternalMapping.g:2024:2: ( ruleEString )
			{
			// InternalMapping.g:2024:2: ( ruleEString )
			// InternalMapping.g:2025:3: ruleEString
			{
			 before(grammarAccess.getAuthorAccess().getNameEStringParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getAuthorAccess().getNameEStringParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Author__NameAssignment_1"



	// $ANTLR start "rule__Import__NameAssignment_2"
	// InternalMapping.g:2034:1: rule__Import__NameAssignment_2 : ( ruleEString ) ;
	public final void rule__Import__NameAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2038:2: ( ( ruleEString ) )
			// InternalMapping.g:2039:2: ( ruleEString )
			{
			// InternalMapping.g:2039:2: ( ruleEString )
			// InternalMapping.g:2040:3: ruleEString
			{
			 before(grammarAccess.getImportAccess().getNameEStringParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getImportAccess().getNameEStringParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__NameAssignment_2"



	// $ANTLR start "rule__Mapping__NameAssignment_2"
	// InternalMapping.g:2049:1: rule__Mapping__NameAssignment_2 : ( ruleEString ) ;
	public final void rule__Mapping__NameAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2053:2: ( ( ruleEString ) )
			// InternalMapping.g:2054:2: ( ruleEString )
			{
			// InternalMapping.g:2054:2: ( ruleEString )
			// InternalMapping.g:2055:3: ruleEString
			{
			 before(grammarAccess.getMappingAccess().getNameEStringParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getMappingAccess().getNameEStringParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__NameAssignment_2"



	// $ANTLR start "rule__Mapping__ComponentAssignment_5"
	// InternalMapping.g:2064:1: rule__Mapping__ComponentAssignment_5 : ( ruleComponent ) ;
	public final void rule__Mapping__ComponentAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2068:2: ( ( ruleComponent ) )
			// InternalMapping.g:2069:2: ( ruleComponent )
			{
			// InternalMapping.g:2069:2: ( ruleComponent )
			// InternalMapping.g:2070:3: ruleComponent
			{
			 before(grammarAccess.getMappingAccess().getComponentComponentParserRuleCall_5_0()); 
			pushFollow(FOLLOW_2);
			ruleComponent();
			state._fsp--;

			 after(grammarAccess.getMappingAccess().getComponentComponentParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Mapping__ComponentAssignment_5"



	// $ANTLR start "rule__Component__NameAssignment_1"
	// InternalMapping.g:2079:1: rule__Component__NameAssignment_1 : ( ruleEString ) ;
	public final void rule__Component__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2083:2: ( ( ruleEString ) )
			// InternalMapping.g:2084:2: ( ruleEString )
			{
			// InternalMapping.g:2084:2: ( ruleEString )
			// InternalMapping.g:2085:3: ruleEString
			{
			 before(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getComponentAccess().getNameEStringParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__NameAssignment_1"



	// $ANTLR start "rule__Component__MappingPairAssignment_3"
	// InternalMapping.g:2094:1: rule__Component__MappingPairAssignment_3 : ( ruleMappingPair ) ;
	public final void rule__Component__MappingPairAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2098:2: ( ( ruleMappingPair ) )
			// InternalMapping.g:2099:2: ( ruleMappingPair )
			{
			// InternalMapping.g:2099:2: ( ruleMappingPair )
			// InternalMapping.g:2100:3: ruleMappingPair
			{
			 before(grammarAccess.getComponentAccess().getMappingPairMappingPairParserRuleCall_3_0()); 
			pushFollow(FOLLOW_2);
			ruleMappingPair();
			state._fsp--;

			 after(grammarAccess.getComponentAccess().getMappingPairMappingPairParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Component__MappingPairAssignment_3"



	// $ANTLR start "rule__MappingPair__PortAssignment_1"
	// InternalMapping.g:2109:1: rule__MappingPair__PortAssignment_1 : ( ruleServiceMethod ) ;
	public final void rule__MappingPair__PortAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2113:2: ( ( ruleServiceMethod ) )
			// InternalMapping.g:2114:2: ( ruleServiceMethod )
			{
			// InternalMapping.g:2114:2: ( ruleServiceMethod )
			// InternalMapping.g:2115:3: ruleServiceMethod
			{
			 before(grammarAccess.getMappingPairAccess().getPortServiceMethodParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleServiceMethod();
			state._fsp--;

			 after(grammarAccess.getMappingPairAccess().getPortServiceMethodParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__PortAssignment_1"



	// $ANTLR start "rule__MappingPair__DiagramAssignment_3"
	// InternalMapping.g:2124:1: rule__MappingPair__DiagramAssignment_3 : ( ruleCbcDiagram ) ;
	public final void rule__MappingPair__DiagramAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2128:2: ( ( ruleCbcDiagram ) )
			// InternalMapping.g:2129:2: ( ruleCbcDiagram )
			{
			// InternalMapping.g:2129:2: ( ruleCbcDiagram )
			// InternalMapping.g:2130:3: ruleCbcDiagram
			{
			 before(grammarAccess.getMappingPairAccess().getDiagramCbcDiagramParserRuleCall_3_0()); 
			pushFollow(FOLLOW_2);
			ruleCbcDiagram();
			state._fsp--;

			 after(grammarAccess.getMappingPairAccess().getDiagramCbcDiagramParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MappingPair__DiagramAssignment_3"



	// $ANTLR start "rule__ServiceMethod__NameAssignment_1"
	// InternalMapping.g:2139:1: rule__ServiceMethod__NameAssignment_1 : ( ruleFQN ) ;
	public final void rule__ServiceMethod__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2143:2: ( ( ruleFQN ) )
			// InternalMapping.g:2144:2: ( ruleFQN )
			{
			// InternalMapping.g:2144:2: ( ruleFQN )
			// InternalMapping.g:2145:3: ruleFQN
			{
			 before(grammarAccess.getServiceMethodAccess().getNameFQNParserRuleCall_1_0()); 
			pushFollow(FOLLOW_2);
			ruleFQN();
			state._fsp--;

			 after(grammarAccess.getServiceMethodAccess().getNameFQNParserRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ServiceMethod__NameAssignment_1"



	// $ANTLR start "rule__CbcDiagram__NameAssignment_0_1"
	// InternalMapping.g:2154:1: rule__CbcDiagram__NameAssignment_0_1 : ( ruleEString ) ;
	public final void rule__CbcDiagram__NameAssignment_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalMapping.g:2158:2: ( ( ruleEString ) )
			// InternalMapping.g:2159:2: ( ruleEString )
			{
			// InternalMapping.g:2159:2: ( ruleEString )
			// InternalMapping.g:2160:3: ruleEString
			{
			 before(grammarAccess.getCbcDiagramAccess().getNameEStringParserRuleCall_0_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEString();
			state._fsp--;

			 after(grammarAccess.getCbcDiagramAccess().getNameEStringParserRuleCall_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CbcDiagram__NameAssignment_0_1"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000005B8000L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000438002L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000260L});
	public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040260L});
	public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000020L});
	public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200260L});
	public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
}
