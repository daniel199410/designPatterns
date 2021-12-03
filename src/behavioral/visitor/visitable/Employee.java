package behavioral.visitor.visitable;

import behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Employee implements CompoundVisitable {
    private final String id;
    private final Double salary;
    private final List<Visitable> roles = new ArrayList<>();

    public Employee(String id, Double salary) {
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitEmployee(this);
    }

    @Override
    public void add(Visitable visitable) {
        if(visitable instanceof Role) {
            this.roles.add(visitable);
        }
    }

    @Override
    public List<Visitable> getChildren() {
        return roles;
    }

    @Override
    public String toString() {
        return "\t\t\t\t" + '"' + "id" + '"' + ":" + '"' + id + '"' +
                ",\n\t\t\t\t" + '"' + "salario" + '"' + ":" + salary;
    }
}
