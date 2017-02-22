/*
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslAParser;
import org.xtext.example.mydsl.services.MyDslAGrammarAccess;

public class MyDslAParser extends AbstractContentAssistParser {

	@Inject
	private MyDslAGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslAParser createParser() {
		InternalMyDslAParser result = new InternalMyDslAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
