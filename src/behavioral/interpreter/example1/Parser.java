package behavioral.interpreter.example1;

import behavioral.interpreter.example1.nonTerminalExpressions.NonTerminalExpression;
import behavioral.interpreter.example1.terminalExpresions.SimpleExpression;

public class Parser {
	private String expression;

	public Parser(String expression) {
		this.expression = expression.replaceAll(" ", "").trim();
	}

	public String getExpression() {
		System.out.println(this.expression);
		if(this.expression.contains("(")) {
			this.expression = new NonTerminalExpression().interpret(this.expression);
		} else {
			this.expression = new SimpleExpression().interpret(this.expression);
			if(this.expression.matches("-*\\d+\\.*\\d*")) {
				return this.expression;
			}
		}
		return getExpression();
	}
}
