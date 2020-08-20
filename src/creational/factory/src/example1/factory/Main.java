package creational.factory.src.example1.factory;

import creational.factory.src.example1.interfaces.IConnection;

public class Main {

    public static void main(String[] args) {
        IConnection mySqlConnection = Factory.getConnection("mysql");
        mySqlConnection.connect();
        IConnection oracleConnection = Factory.getConnection("oracle");
        oracleConnection.connect();
        IConnection h2Connection = Factory.getConnection("h2");
        h2Connection.connect();
    }
    
}
