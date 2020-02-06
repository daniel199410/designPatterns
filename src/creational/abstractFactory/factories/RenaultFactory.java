package creational.abstractFactory.factories;

import creational.abstractFactory.abstractfactory.AbstractFactory;
import creational.abstractFactory.car.Car;
import creational.abstractFactory.car.F500x;
import creational.abstractFactory.car.Sienna;

public class RenaultFactory extends AbstractFactory {

    @Override
    public Car createSedan() {
        return new Sienna();
    }

    @Override
    public Car createSuv() {
        return new F500x();
    }
    
}
