package creational.abstractFactory.example2.after.factory;

import creational.abstractFactory.example2.after.abstractFactory.AbstractFactory;
import creational.abstractFactory.example2.after.abstractProduct.Formatter;
import creational.abstractFactory.example2.after.abstractProduct.Linter;
import creational.abstractFactory.example2.after.concreteProduct.JavaScriptFormatter;
import creational.abstractFactory.example2.after.concreteProduct.JavaScriptLinter;

public class JavaScriptFactory extends AbstractFactory {
    @Override
    public Formatter createFormatter() {
        return new JavaScriptFormatter();
    }

    @Override
    public Linter createLinter() {
        return new JavaScriptLinter();
    }
}
