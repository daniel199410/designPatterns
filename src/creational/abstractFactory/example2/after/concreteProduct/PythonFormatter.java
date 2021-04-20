package after.concreteProduct;

import after.abstractProduct.Formatter;

public class PythonFormatter extends Formatter {
    @Override
    public String beautify(String text) {
        return String.format("%s beautified with Python beautifier", text);
    }

    @Override
    public String uglify(String text) {
        return String.format("%s uglified with Python uglifier", text);
    }
}
