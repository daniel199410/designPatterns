package after.concreteProduct;


import after.abstractProduct.Formatter;

public class DefaultFormatter extends Formatter {
    @Override
    public String beautify(String text) {
        return "";
    }

    @Override
    public String uglify(String text) {
        return "";
    }
}
