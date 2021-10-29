/*
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.edl.parser.antlr;

import com.google.inject.Inject;
import de.tu_bs.ccc.contracting.edl.parser.antlr.internal.InternalEventsParser;
import de.tu_bs.ccc.contracting.edl.services.EventsGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EventsParser extends AbstractAntlrParser {

	@Inject
	private EventsGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEventsParser createParser(XtextTokenStream stream) {
		return new InternalEventsParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public EventsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EventsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
