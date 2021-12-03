package behavioral.visitor.visitable;

import behavioral.visitor.visitor.Visitor;

public interface Visitable {
    String accept(Visitor visitor);
}
