package after.concreteProduct;

import after.abstractProduct.Linter;

public class JavaScriptLinter extends Linter {
    @Override
    public String lint(String text) {
        return String.format("%s linted with JavaScript linter", text);
    }
}
