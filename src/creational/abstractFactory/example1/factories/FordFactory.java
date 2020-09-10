package creational.abstractFactory.example1.factories;

import creational.abstractFactory.example1.abstractfactory.AbstractFactory;
import creational.abstractFactory.example1.car.Car;
import creational.abstractFactory.example1.car.EcoSport;
import creational.abstractFactory.example1.car.Focus;

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
