package behavioral.interpreter.example1.nonTerminalExpressions;

import behavioral.interpreter.example1.AbstractExpression;
import behavioral.interpreter.example1.terminalExpresions.SimpleExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonTerminalExpression extends AbstractExpression {
	@Override
	public String interpret(String context) {
		final String regex = "\\(-*\\d+(\\.\\d+)*([+*/\\-]*\\d*(\\.\\d+)*)*\\)";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(context);
		while (matcher.find()) {
			String match = matcher.group();
			String result = new SimpleExpression().interpret(match.substring(1, match.length() - 1));
			context = context.replace(match, result);
		}
		return context;
	}
}
