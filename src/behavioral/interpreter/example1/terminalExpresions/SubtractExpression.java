package behavioral.interpreter.example1.terminalExpresions;

import java.util.Arrays;

public class SubtractExpression extends TerminalExpressionInterpreter {

	public SubtractExpression() {
		super("-*(\\d+(\\.\\d+)*)+(--*\\d+(\\.\\d+)*)+");
	}

	@Override
	public Double interpret(String context) {
		return Arrays.stream(context.split("-"))
				.map(token -> {
					if(token.isEmpty()) return 0D;
					return Double.parseDouble(token);
				})
				.reduce((acc, num) -> acc - num)
				.orElse(0D);
	}
}
