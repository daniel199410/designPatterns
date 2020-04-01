package structural.proxy.protectiveProxy.internetAccess;

public class RealInternetAccess implements OfficeInternetAccess {
    private Integer employeeName;

    public RealInternetAccess(Integer employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public boolean grantInternetAccess() {
        return true;
    }

    public Integer getEmployeeName() {
        return this.employeeName;
    }
}
