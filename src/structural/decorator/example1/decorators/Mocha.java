package structural.decorator.example1.decorators;

import structural.decorator.example1.abstractC.Beverage;
import structural.decorator.example1.abstractC.Decorator;

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
