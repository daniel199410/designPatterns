
package creational.factory.src.example1.implementations;

import creational.factory.src.example1.interfaces.IConnection;

public class MySQLConnection implements IConnection {

    @Override
    public String connect() {
        return "MySql connection stablished";
    }

    @Override
    public String disconnect() {
        return "MySql connection closed";    
    }
    
}
