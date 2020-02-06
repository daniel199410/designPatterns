package creational.abstractFactory.factories;

import creational.abstractFactory.abstractfactory.AbstractFactory;
import creational.abstractFactory.car.Car;
import creational.abstractFactory.car.Serie3;
import creational.abstractFactory.car.X1;

public class Chevrolet extends AbstractFactory {

    @Override
    public Car createSedan() {
        return new Serie3();
    }

    @Override
    public Car createSuv() {
        return new X1();
    }
    
}
