
package creational.factory.src.implementations;

import creational.factory.src.interfaces.IConnection;

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
