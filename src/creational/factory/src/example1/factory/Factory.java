package creational.factory.src.example1.factory;

import creational.factory.src.example1.implementations.MySQLConnection;
import creational.factory.src.example1.implementations.OracleConnection;
import creational.factory.src.example1.implementations.SqlServerConnection;
import creational.factory.src.example1.implementations.VoidConnection;
import creational.factory.src.example1.interfaces.IConnection;

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
