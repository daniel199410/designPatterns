package creational.singleton.example2.after.factory;

import creational.singleton.example2.after.director.Converter;
import creational.singleton.example2.after.implementations.JSONConverter;
import creational.singleton.example2.after.implementations.XMLConverter;
import creational.singleton.example2.after.implementations.YMLConverter;

public class Director {

    public static Converter getConverter(ConverterType format) {
        switch (format) {
            case JSON:
                return JSONConverter.getInstance();
            case XML:
                return new XMLConverter();
            case YML:
                return new YMLConverter();
            default:
                return null;
        }
    }

}
