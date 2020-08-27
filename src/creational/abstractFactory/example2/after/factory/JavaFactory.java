package creational.abstractFactory.example2.after.factory;

import creational.abstractFactory.example2.after.abstractFactory.AbstractFactory;
import creational.abstractFactory.example2.after.abstractProduct.Formatter;
import creational.abstractFactory.example2.after.abstractProduct.Linter;
import creational.abstractFactory.example2.after.concreteProduct.JavaFormatter;
import creational.abstractFactory.example2.after.concreteProduct.JavaLinter;

public class JavaFactory extends AbstractFactory {
    @Override
    public Formatter createFormatter() {
        return new JavaFormatter();
    }

    @Override
    public Linter createLinter() {
        return new JavaLinter();
    }
}
