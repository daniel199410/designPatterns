package creational.singleton.example2.after.implementations;

import creational.singleton.example2.after.director.Converter;
import creational.singleton.example2.before.Instance;

public class YMLConverter implements Converter {
    @Override
    public String serialize(Instance instance) {
        return "meh";
    }
}
