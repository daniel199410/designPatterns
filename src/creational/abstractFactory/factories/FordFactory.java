package creational.abstractFactory.factories;

import creational.abstractFactory.abstractfactory.AbstractFactory;
import creational.abstractFactory.car.Car;
import creational.abstractFactory.car.EcoSport;
import creational.abstractFactory.car.Focus;

public class FordFactory extends AbstractFactory {
    
    @Override
    public Car createSedan() {
        return new Focus();
    }
    
    @Override
    public Car createSuv() {
        return new EcoSport();
    }
    
}
