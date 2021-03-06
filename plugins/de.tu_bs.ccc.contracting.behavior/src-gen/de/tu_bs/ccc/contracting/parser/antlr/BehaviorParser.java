/*
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.parser.antlr;

import com.google.inject.Inject;
import de.tu_bs.ccc.contracting.parser.antlr.internal.InternalBehaviorParser;
import de.tu_bs.ccc.contracting.services.BehaviorGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BehaviorParser extends AbstractAntlrParser {

	@Inject
	private BehaviorGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBehaviorParser createParser(XtextTokenStream stream) {
		return new InternalBehaviorParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "BehaviorModel";
	}

	public BehaviorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BehaviorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
