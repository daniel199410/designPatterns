package behavioral.interpreter.example1.terminalExpresions;

import java.util.Arrays;

public class MultiplyExpression extends TerminalExpressionInterpreter {

	public MultiplyExpression() {
		super("-*(\\d+(\\.\\d+)*)+(\\*-*\\d+(\\.\\d+)*)+");
	}

	@Override
	public Double interpret(String context) {
		return Arrays.stream(context.split("\\*"))
				.map(Double::valueOf)
				.reduce((acc, num) -> acc * num)
				.orElse(0D);
	}
}
