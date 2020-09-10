package creational.abstractFactory.example2.after.factory;

import creational.abstractFactory.example2.after.abstractFactory.AbstractFactory;
import creational.abstractFactory.example2.after.abstractProduct.Formatter;
import creational.abstractFactory.example2.after.abstractProduct.Linter;
import creational.abstractFactory.example2.after.concreteProduct.PythonFormatter;
import creational.abstractFactory.example2.after.concreteProduct.PythonLinter;

public class PythonFactory extends AbstractFactory {
    @Override
    public Formatter createFormatter() {
        return new PythonFormatter();
    }

    @Override
    public Linter createLinter() {
        return new PythonLinter();
    }
}
