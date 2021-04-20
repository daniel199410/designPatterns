package after.factory;

import after.abstractFactory.AbstractFactory;
import after.abstractProduct.Formatter;
import after.abstractProduct.Linter;
import after.concreteProduct.PythonFormatter;
import after.concreteProduct.PythonLinter;

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
