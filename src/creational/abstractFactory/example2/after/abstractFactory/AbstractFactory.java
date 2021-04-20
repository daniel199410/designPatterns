package after.abstractFactory;

import after.abstractProduct.Formatter;
import after.abstractProduct.Linter;
import after.factory.DefaultFactory;
import after.factory.JavaFactory;
import after.factory.JavaScriptFactory;
import after.factory.PythonFactory;
import creational.abstractFactory.example2.before.EnumPlatform;

public abstract class AbstractFactory {

    public static AbstractFactory getFactory(EnumPlatform platform) {
        switch (platform) {
            case JAVA:
                return new JavaFactory();
            case JAVASCRIPT:
                return new JavaScriptFactory();
            case PYTHON:
                return new PythonFactory();
            default:
                return new DefaultFactory();
        }
    }

    public abstract Formatter createFormatter();
    public abstract Linter createLinter();
}
