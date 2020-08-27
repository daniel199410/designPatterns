package creational.abstractFactory.example2.after.factory;

import creational.abstractFactory.example2.after.abstractFactory.AbstractFactory;
import creational.abstractFactory.example2.after.abstractProduct.Formatter;
import creational.abstractFactory.example2.after.abstractProduct.Linter;
import creational.abstractFactory.example2.after.concreteProduct.DefaultFormatter;
import creational.abstractFactory.example2.after.concreteProduct.DefaultLinter;

public class DefaultFactory extends AbstractFactory {
    @Override
    public Formatter createFormatter() {
        return new DefaultFormatter();
    }

    @Override
    public Linter createLinter() {
        return new DefaultLinter();
    }
}
