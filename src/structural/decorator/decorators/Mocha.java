package structural.decorator.decorators;

import structural.decorator.abstractC.Beverage;
import structural.decorator.abstractC.Decorator;

public class Mocha extends Decorator {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int cost() {
		return beverage.cost() + 3;
	}

}
