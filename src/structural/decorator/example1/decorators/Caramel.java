package structural.decorator.example1.decorators;

import structural.decorator.example1.abstractC.Beverage;
import structural.decorator.example1.abstractC.Decorator;

public class Caramel extends Decorator {
	
	private Beverage beverage;
	
	public Caramel(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return this.beverage.cost() + 1;
	}
}
