package behavioral.interpreter.example1.terminalExpresions;

import java.util.Arrays;

public class AddExpression extends TerminalExpressionInterpreter {

	public AddExpression() {
		super("-*(\\d+(\\.\\d+)*)+(\\+-*\\d+(\\.\\d+)*)+");
	}

	@Override
	public Double interpret(String context) {
		return Arrays.stream(context.split("\\+"))
				.map(Double::valueOf)
				.reduce(Double::sum)
				.orElse(0D);
	}
}
