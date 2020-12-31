package structural.decorator.example1.components;

import structural.decorator.example1.abstractC.Beverage;

public class Expresso extends Beverage {

	@Override
	public int cost() {
		return 2;
	}

}
