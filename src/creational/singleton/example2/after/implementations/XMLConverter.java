package creational.singleton.example2.after.implementations;

import creational.singleton.example2.after.Instance;
import creational.singleton.example2.after.director.Converter;

public class XMLConverter implements Converter {
    @Override
    public String serialize(Instance instance) {
        return "bar";
    }
}
