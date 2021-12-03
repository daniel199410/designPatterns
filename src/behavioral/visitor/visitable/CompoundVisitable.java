package behavioral.visitor.visitable;

import java.util.List;

public interface CompoundVisitable extends Visitable {
    void add(Visitable visitable);
    List<Visitable> getChildren();
}
