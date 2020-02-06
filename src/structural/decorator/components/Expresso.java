package structural.decorator.components;

import structural.decorator.abstractC.Beverage;

public class Expresso extends Beverage {

	@Override
	public int cost() {
		return 2;
	}

}
