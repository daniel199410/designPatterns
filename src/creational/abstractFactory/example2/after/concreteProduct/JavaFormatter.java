package creational.abstractFactory.example2.after.concreteProduct;

import creational.abstractFactory.example2.after.abstractProduct.Formatter;

public class JavaFormatter extends Formatter {
    @Override
    public String beautify(String text) {
        return String.format("%s beautified with Java beautifier", text);
    }

    @Override
    public String uglify(String text) {
        return String.format("%s uglified with Java uglifier", text);
    }
}
