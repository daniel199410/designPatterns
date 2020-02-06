package creational.factory.src.test;

import creational.factory.src.factory.Factory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {
    
    public FactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetMySQLConnection() {
        System.out.println("testGetMySQLConnection");
        String engine = "MYSQL";
        String expResult = "MySql connection stablished";
        String result = Factory.getConnection(engine).connect();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetOracleConnection() {
        System.out.println("testGetoOracleConnection");
        String engine = "oracle";
        String expResult = "Oracle connection stablished";
        String result = Factory.getConnection(engine).connect();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetNonExistentConnection() {
        System.out.println("testGetNonExistentConnection");
        String engine = "random";
        String expResult = "No engine connection available for this database";
        String result = Factory.getConnection(engine).connect();
        assertEquals(expResult, result);
    }
    
}
