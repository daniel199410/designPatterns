package behavioral.interpreter.example1.terminalExpresions;

import behavioral.interpreter.example1.AbstractExpression;

public class SimpleExpression extends AbstractExpression {

	@Override
	public String interpret(String context) {
		if(context.contains("*")) {
			context = new MultiplyExpression().parse(context);
		}
		if(context.contains("/")) {
			context = new DivideExpression().parse(context);
		}
		if(context.contains("+")) {
			context = new AddExpression().parse(context);
		}
		if(context.contains("-")) {
			context = new SubtractExpression().parse(context);
		}
		return context;
	}
}
