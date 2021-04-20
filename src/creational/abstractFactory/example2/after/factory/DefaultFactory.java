package after.factory;

import after.abstractFactory.AbstractFactory;
import after.abstractProduct.Formatter;
import after.abstractProduct.Linter;
import after.concreteProduct.DefaultFormatter;
import after.concreteProduct.DefaultLinter;

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
