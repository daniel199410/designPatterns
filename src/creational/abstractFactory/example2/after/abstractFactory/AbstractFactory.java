package creational.abstractFactory.example2.after.abstractFactory;

import creational.abstractFactory.example2.after.abstractProduct.Formatter;
import creational.abstractFactory.example2.after.abstractProduct.Linter;
import creational.abstractFactory.example2.after.factory.DefaultFactory;
import creational.abstractFactory.example2.after.factory.JavaFactory;
import creational.abstractFactory.example2.after.factory.JavaScriptFactory;
import creational.abstractFactory.example2.after.factory.PythonFactory;
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
