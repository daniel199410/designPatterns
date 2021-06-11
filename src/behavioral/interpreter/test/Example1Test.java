package behavioral.interpreter.test;

import behavioral.interpreter.example1.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example1Test {
	@Test
	public void shouldInterpretDifferentOperations() {
		Parser parser = new Parser("(3-(4*(5+6))/(7-8))*9/4");
		Parser parser2 = new Parser("3*3*-3");
		Parser parser3 = new Parser("3/-3/-3");
		Parser parser4 = new Parser("3+3+-3");
		Parser parser5 = new Parser("3-3-3");
		Parser parser6 = new Parser("3-44.0/-1.0");
		Parser parser7 = new Parser("3+44.0/-1.0");
		Parser parser8 = new Parser("((3-(4*(5+6))/(7-8))*3+(9/4))*4-(3+6-8/(7 * 6 / 4))");
		Parser parser9 = new Parser("3+3-2-2+4+4");
		Parser parser10 = new Parser("-((3-(4*(5+6))/(7-8))*3+(9/4))*4-(3+6-8/(7 * 6 / 4))");
		assertEquals("105.75", parser.getExpression());
		assertEquals("-27.0", parser2.getExpression());
		assertEquals("0.3333333333333333", parser3.getExpression());
		assertEquals("3.0", parser4.getExpression());
		assertEquals("-3.0", parser5.getExpression());
		assertEquals("47.0", parser6.getExpression());
		assertEquals("-41.0", parser7.getExpression());
		assertEquals("564.7619047619048", parser8.getExpression());
		assertEquals("10.0", parser9.getExpression());
		assertEquals("-581.2380952380952", parser10.getExpression());
	}
}
