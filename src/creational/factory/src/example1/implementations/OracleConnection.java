package creational.factory.src.example1.implementations;

import creational.factory.src.example1.interfaces.IConnection;

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
