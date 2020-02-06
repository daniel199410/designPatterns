package structural.decorator.decorators;

import structural.decorator.abstractC.Beverage;
import structural.decorator.abstractC.Decorator;

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
