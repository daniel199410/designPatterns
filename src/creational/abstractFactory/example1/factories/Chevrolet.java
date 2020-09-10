package creational.abstractFactory.example1.factories;

import creational.abstractFactory.example1.abstractfactory.AbstractFactory;
import creational.abstractFactory.example1.car.Car;
import creational.abstractFactory.example1.car.Serie3;
import creational.abstractFactory.example1.car.X1;

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
