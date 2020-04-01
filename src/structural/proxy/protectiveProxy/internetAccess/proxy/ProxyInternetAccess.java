package structural.proxy.protectiveProxy.internetAccess.proxy;

import structural.proxy.protectiveProxy.internetAccess.OfficeInternetAccess;
import structural.proxy.protectiveProxy.internetAccess.RealInternetAccess;
import structural.proxy.protectiveProxy.internetAccess.db.DB;
import structural.proxy.protectiveProxy.internetAccess.db.Employee;
import structural.proxy.protectiveProxy.internetAccess.db.EnumRol;

import java.util.Optional;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private Integer employeeId;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean grantInternetAccess() {
        DB db = DB.getInstance();
        Optional<Employee> employee = db.findById(this.employeeId);
        if(employee.isPresent() && isRoleEnabled(employee.get().getRol())) {
            realInternetAccess = new RealInternetAccess((this.employeeId));
            return realInternetAccess.grantInternetAccess();
        }
        return false;
    }

    public boolean isRoleEnabled(EnumRol role) {
        return EnumRol.ROLE_1.equals(role);
    }
}
