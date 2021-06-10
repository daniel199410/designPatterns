package behavioral.interpreter.example1.terminalExpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TerminalExpressionInterpreter {
	private final String regex;

	public TerminalExpressionInterpreter(String regex) {
		this.regex = regex;
	}

	public String parse(String expression) {
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(expression);
		Double result;
		while (matcher.find()) {
			String match = matcher.group();
			result = interpret(match);
			int index = expression.indexOf(match) - 1;
			if (result >= 0 && index >= 0) {
				expression = expression.replace(match, "+".concat(result.toString()));
			} else {
				expression = expression.replace(match, result.toString());
			}
		}
		return expression;
	}

	abstract Double interpret(String context);
}
