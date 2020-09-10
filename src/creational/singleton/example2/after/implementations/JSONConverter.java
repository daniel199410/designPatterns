package creational.singleton.example2.after.implementations;

import creational.singleton.example2.after.director.Converter;
import creational.singleton.example2.before.Instance;

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
