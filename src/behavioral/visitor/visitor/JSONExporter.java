package behavioral.visitor.visitor;

import behavioral.visitor.visitable.Company;
import behavioral.visitor.visitable.CompoundVisitable;
import behavioral.visitor.visitable.Employee;
import behavioral.visitor.visitable.Role;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JSONExporter implements Visitor{
    public String export(List<Company> visitable) {
        return "[" + IntStream.range(0, visitable.size())
                .mapToObj(i -> {
                    StringBuilder string = new StringBuilder("\n" + visitable.get(i).accept(this));
                    if(i < visitable.size() - 1) {
                        return string.append(",");
                    }
                    return string.toString();
                }).collect(Collectors.joining()) + "\n]";
    }

    @Override
    public String visitCompany(Company company) {
        return "\t{\n\t" + company.toString() + ", \n\t\t" + '\"' + "empleados" + '\"' + ": " + "[" + visitCompoundEntity(company) + "\n\t\t\t]\n\t}";
    }

    private String visitCompoundEntity(CompoundVisitable company) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < company.getChildren().size(); i++) {
            stringBuilder.append("{\n");
            stringBuilder.append(company.getChildren().get(i).accept(this));
            if(i < company.getChildren().size() - 1) {
                stringBuilder.append("},");
            }
        }
        return stringBuilder.append("}").toString();
    }

    @Override
    public String visitEmployee(Employee employee) {
        return employee.toString() + ",\n\t\t\t\t" + '"' + "roles" + '"' + ": [" + visitCompoundEntity(employee) + "\n\t\t\t\t]";
    }

    @Override
    public String visitRole(Role role) {
        return "\t\t\t\t\t" + role.toString();
    }
}
