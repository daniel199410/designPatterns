package after.factory;

import after.abstractFactory.AbstractFactory;
import after.abstractProduct.Formatter;
import after.abstractProduct.Linter;
import after.concreteProduct.JavaScriptFormatter;
import after.concreteProduct.JavaScriptLinter;

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
