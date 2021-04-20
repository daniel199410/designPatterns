package after.concreteProduct;

import after.abstractProduct.Linter;

public class PythonLinter extends Linter {
    @Override
    public String lint(String text) {
        return String.format("%s linted with Python linter", text);
    }
}
