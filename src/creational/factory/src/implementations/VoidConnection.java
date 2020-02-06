package creational.factory.src.implementations;

import creational.factory.src.interfaces.IConnection;

public class VoidConnection implements IConnection {

    @Override
    public String connect() {
        return "No engine connection available for this database";
    }

    @Override
    public String disconnect() {
        return "No engine connection available for this database";
    }
    
}
