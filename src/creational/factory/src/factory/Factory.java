package creational.factory.src.factory;

import creational.factory.src.implementations.MySQLConnection;
import creational.factory.src.implementations.OracleConnection;
import creational.factory.src.implementations.SqlServerConnection;
import creational.factory.src.implementations.VoidConnection;
import creational.factory.src.interfaces.IConnection;

public class Factory {
    
    public static IConnection getConnection(String engine){
        String engineLower = engine.toLowerCase();
        switch(engineLower){
            case "mysql":
                return new MySQLConnection();
            case "oracle":
                return new OracleConnection();
            case "sqlserver":
                return new SqlServerConnection();
            default:
                return new VoidConnection();
        }
    }
    
}
