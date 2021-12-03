package behavioral.visitor.visitable;

import behavioral.visitor.visitor.Visitor;

public class Role implements Visitable {
    private final String name;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitRole(this);
    }

    @Override
    public String toString() {
        return '"' + "name" + '"' + ":" + '"' + name + '"';
    }
}
