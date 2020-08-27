package creational.abstractFactory.example1.factories;

import creational.abstractFactory.example1.abstractfactory.AbstractFactory;
import creational.abstractFactory.example1.car.Car;
import creational.abstractFactory.example1.car.F500x;
import creational.abstractFactory.example1.car.Sienna;

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
