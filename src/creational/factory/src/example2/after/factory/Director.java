package after.factory;

import after.director.Converter;
import after.implementations.JSONConverter;
import after.implementations.XMLConverter;
import after.implementations.YMLConverter;

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
