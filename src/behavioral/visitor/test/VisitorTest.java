package behavioral.visitor.test;

import behavioral.visitor.visitable.*;
import behavioral.visitor.visitor.JSONExporter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void shouldGetAJSON() {
        List<Company> companies = new ArrayList<>();
        Company company = new Company("1234567");
        Company company2 = new Company("1234568");
        CompoundVisitable employee = new Employee("1234567890", 5.4);
        CompoundVisitable employee2 = new Employee("1234567891", 5.3);
        CompoundVisitable employee3 = new Employee("1234567892", 5.5);
        Visitable adminRole = new Role("Admin");
        Visitable managerRole = new Role("Manager");
        employee.add(adminRole);
        employee.add(managerRole);
        employee2.add(adminRole);
        employee2.add(managerRole);
        employee3.add(adminRole);
        company.add(employee);
        company.add(employee2);
        company2.add(employee3);
        companies.add(company);
        companies.add(company2);
        JSONExporter JSONExporter = new JSONExporter();
        assertEquals("[\n" +
                        "\t{\n" +
                        "\t\t\"nit\": \"1234567\", \n" +
                        "\t\t\"empleados\": [{\n" +
                        "\t\t\t\t\"id\":\"1234567890\",\n" +
                        "\t\t\t\t\"salario\":5.4,\n" +
                        "\t\t\t\t\"roles\": [{\n" +
                        "\t\t\t\t\t\"name\":\"Admin\"},{\n" +
                        "\t\t\t\t\t\"name\":\"Manager\"}\n" +
                        "\t\t\t\t]},{\n" +
                        "\t\t\t\t\"id\":\"1234567891\",\n" +
                        "\t\t\t\t\"salario\":5.3,\n" +
                        "\t\t\t\t\"roles\": [{\n" +
                        "\t\t\t\t\t\"name\":\"Admin\"},{\n" +
                        "\t\t\t\t\t\"name\":\"Manager\"}\n" +
                        "\t\t\t\t]}\n" +
                        "\t\t\t]\n" +
                        "\t},\n" +
                        "\t{\n" +
                        "\t\t\"nit\": \"1234568\", \n" +
                        "\t\t\"empleados\": [{\n" +
                        "\t\t\t\t\"id\":\"1234567892\",\n" +
                        "\t\t\t\t\"salario\":5.5,\n" +
                        "\t\t\t\t\"roles\": [{\n" +
                        "\t\t\t\t\t\"name\":\"Admin\"}\n" +
                        "\t\t\t\t]}\n" +
                        "\t\t\t]\n" +
                        "\t}\n" +
                        "]",
                JSONExporter.export(companies));
    }
}
