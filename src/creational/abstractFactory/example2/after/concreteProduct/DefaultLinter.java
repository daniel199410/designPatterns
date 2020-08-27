package creational.abstractFactory.example2.after.concreteProduct;

import creational.abstractFactory.example2.after.abstractProduct.Linter;

public class DefaultLinter extends Linter {
    @Override
    public String lint(String text) {
        return "";
    }
}
