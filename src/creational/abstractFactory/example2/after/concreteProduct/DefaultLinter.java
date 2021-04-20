package after.concreteProduct;

import after.abstractProduct.Linter;

public class DefaultLinter extends Linter {
    @Override
    public String lint(String text) {
        return "";
    }
}
