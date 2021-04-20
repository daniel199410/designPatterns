package after.concreteProduct;

import after.abstractProduct.Linter;

public class JavaLinter extends Linter {
    @Override
    public String lint(String text) {
        return String.format("%s linted with Java linter", text);
    }
}
