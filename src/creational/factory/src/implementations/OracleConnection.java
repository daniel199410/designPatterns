package creational.factory.src.implementations;

import creational.factory.src.interfaces.IConnection;

public class OracleConnection implements IConnection {

    @Override
    public String connect() {
        return "Oracle connection stablished";
    }

    @Override
    public String disconnect() {
        return "Oracle connection closed";
    }
    
}
