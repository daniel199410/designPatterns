package creational.singleton.example2.after.implementations;

import creational.singleton.example2.after.Instance;
import creational.singleton.example2.after.director.Converter;

public class JSONConverter implements Converter {

    private static JSONConverter jsonConverter;

    private JSONConverter(){}

    public static JSONConverter getInstance() {
        if(jsonConverter == null) {
            jsonConverter = new JSONConverter();
        }
        return jsonConverter;
    }

    @Override
    public String serialize(Instance instance) {
        return "foo";
    }
}
