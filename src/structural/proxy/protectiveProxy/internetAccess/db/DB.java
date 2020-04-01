package structural.proxy.protectiveProxy.internetAccess.db;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DB {

    private static DB db;
    private Map<Integer, Employee> employees;

    public static DB getInstance() {
        if(db == null) {
            db = new DB();
            db.employees = new HashMap<>();
            db.employees.put(1, new Employee(1, "Nombre 1", EnumRol.ROLE_1));
            db.employees.put(2, new Employee(2, "Nombre 2", EnumRol.ROLE_1));
            db.employees.put(3, new Employee(3, "Nombre 3", EnumRol.ROLE_2));
            db.employees.put(4, new Employee(4, "Nombre 4", EnumRol.ROLE_2));
        }
        return db;
    }

    public Optional<Employee> findById(Integer id) {
        return Optional.ofNullable(db.employees.get(id));
    }
}
