package structural.decorator.test;

import org.junit.Test;
import structural.decorator.components.Expresso;
import structural.decorator.decorators.Caramel;
import structural.decorator.decorators.Mocha;

import static org.junit.Assert.assertEquals;

public class Decorator {
	
	@Test
	public void should_build_expresso_mocha() {
		Expresso expresso = new Expresso();
		Mocha mocha = new Mocha(expresso);
		assertEquals(5, mocha.cost());
	}

	@Test
	public void should_build_expresson_caramel() {
		Expresso expresso = new Expresso();		
		Caramel caramel = new Caramel(expresso);
		assertEquals(3, caramel.cost());
	}
}
