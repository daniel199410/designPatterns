package creational.builder.example1.src;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		this.pizza = new Pizza();
	}
	
	public PizzaBuilder buildDough(String dough) {
		this.pizza.setDough(dough);
		return this;
	}
	
	public PizzaBuilder buildSauce(String sauce) {
		this.pizza.setSauce(sauce);
		return this;
	}
	
	public PizzaBuilder buildTopping(String topping) {
		this.pizza.setTopping(topping);
		return this;
	}
	
	public Pizza build() {
		return this.pizza;
	}
	
}
