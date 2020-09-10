package creational.abstractFactory.example1.abstractfactory;

import creational.abstractFactory.example1.car.Car;
import creational.abstractFactory.example1.constants.Factory;
import creational.abstractFactory.example1.factories.Chevrolet;
import creational.abstractFactory.example1.factories.FordFactory;
import creational.abstractFactory.example1.factories.RenaultFactory;

public abstract class AbstractFactory {
    
    private static final Chevrolet CHEVROLET_FACTORY = new Chevrolet();
    private static final FordFactory FORD_FACTORY = new FordFactory();
    private static final RenaultFactory RENAULT_FACTORY = new RenaultFactory();
    
    public static AbstractFactory getFactory(Factory factory) {
        switch(factory) {
            case CHEVROLET:
                return CHEVROLET_FACTORY;
            case FORD:
                return FORD_FACTORY;
            case RENAULT:    
                return RENAULT_FACTORY;
            default:
                return null;
        }
    }
    
    public abstract Car createSedan();
    
    public abstract Car createSuv();
    
}
