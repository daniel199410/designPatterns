package creational.factory.src.example2.after.factory;

import creational.factory.src.example2.after.director.Converter;
import creational.factory.src.example2.after.implementations.JSONConverter;
import creational.factory.src.example2.after.implementations.XMLConverter;
import creational.factory.src.example2.after.implementations.YMLConverter;

public class Director {

    public static Converter getConverter(ConverterType format) {
        switch (format) {
            case JSON:
                return new JSONConverter();
            case XML:
                return new XMLConverter();
            case YML:
                return new YMLConverter();
            default:
                return null;
        }
    }

}
