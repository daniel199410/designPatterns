package creational.singleton.example2.after.implementations;

import creational.singleton.example2.after.director.Converter;
import creational.singleton.example2.before.Instance;

public class XMLConverter implements Converter {
    @Override
    public String serialize(Instance instance) {
        return "bar";
    }
}
