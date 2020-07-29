package structural.proxy.protectiveProxy.internetAccess.db;

public class Employee {
    private Integer id;
    private String name;
    private EnumRol rol;

    public Employee(Integer id, String name, EnumRol rol) {
        this.id = id;
        this.name = name;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumRol getRol() {
        return rol;
    }

    public void setRol(EnumRol rol) {
        this.rol = rol;
    }
}
