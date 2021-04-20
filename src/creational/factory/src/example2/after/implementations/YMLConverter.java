package after.implementations;


import after.director.Converter;
import creational.factory.src.example2.before.Instance;

public class YMLConverter implements Converter {
    @Override
    public String serialize(Instance instance) {
        return "meh";
    }
}
