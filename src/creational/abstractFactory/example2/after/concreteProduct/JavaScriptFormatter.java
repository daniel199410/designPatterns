package after.concreteProduct;

import after.abstractProduct.Formatter;
import after.abstractProduct.Formatter;

public class JavaScriptFormatter extends Formatter {
    @Override
    public String beautify(String text) {
        return String.format("%s beautified with Javascript beautifier", text);
    }

    @Override
    public String uglify(String text) {
        return String.format("%s uglified with Javascript uglifier", text);
    }
}
