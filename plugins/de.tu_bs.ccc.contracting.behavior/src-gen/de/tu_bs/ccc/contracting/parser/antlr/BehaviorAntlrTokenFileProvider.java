/*
 * generated by Xtext 2.20.0
 */
package de.tu_bs.ccc.contracting.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BehaviorAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/tu_bs/ccc/contracting/parser/antlr/internal/InternalBehavior.tokens");
	}
}
