package behavioral.visitor.visitor;

import behavioral.visitor.visitable.Company;
import behavioral.visitor.visitable.Employee;
import behavioral.visitor.visitable.Role;

public interface Visitor {
    String visitCompany(Company company);
    String visitEmployee(Employee employee);
    String visitRole(Role role);
}
