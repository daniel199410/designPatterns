package behavioral.visitor.visitable;

import behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompoundVisitable {
    private final String nit;
    private final List<Visitable> employees = new ArrayList<>();

    public Company(String nit) {
        this.nit = nit;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompany(this);
    }

    public String getNit() {
        return nit;
    }

    public List<Visitable> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "\t" + '\"' + "nit" + '\"' + ": " + '"' + this.getNit() + '"';
    }

    @Override
    public void add(Visitable visitable) {
        this.employees.add(visitable);
    }

    @Override
    public List<Visitable> getChildren() {
        return this.employees;
    }
}
