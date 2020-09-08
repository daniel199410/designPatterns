package creational.builder.test;

import creational.builder.example1.src.Pizza;
import creational.builder.example1.src.PizzaBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaBuilderTest {
	
	@Test
    public void testBuildPizzaDough() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.buildDough("dough").build();
        assertEquals("dough", pizza.getDough());
    }

	@Test
    public void testBuildSauce() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.buildSauce("sauce").build();
        assertEquals("sauce", pizza.getSauce());
    }
	
	@Test
    public void testBuildTopping() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.buildTopping("topping").build();
        assertEquals("topping", pizza.getTopping());
    }
	
	@Test
    public void testBuildPizzaDoughAndSauce() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.buildDough("dough").buildSauce("sauce").build();
        assertEquals("dough", pizza.getDough());
        assertEquals("sauce", pizza.getSauce());
    }
}
