package after.factory;

import after.abstractFactory.AbstractFactory;
import after.abstractProduct.Formatter;
import after.abstractProduct.Linter;
import after.concreteProduct.JavaFormatter;
import after.concreteProduct.JavaLinter;

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
