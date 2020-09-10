package creational.abstractFactory.test;

import creational.abstractFactory.example1.abstractfactory.AbstractFactory;
import creational.abstractFactory.example1.constants.Factory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Daniel Cataño
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
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

    /**
     * Test of createSedan method, of class Chevrolet.
     */
    @Test
    public void testCreateSedanChevrolet() {
        System.out.println("createSedan - Chevrolet");
        AbstractFactory chevroletInstance = AbstractFactory.getFactory(Factory.CHEVROLET);
        String expResult = "Serie 3";
        String result = chevroletInstance.createSedan().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createSuv method, of class Chevrolet.
     */
    @Test
    public void testCreateSuvChevrolet() {
        System.out.println("createSuv - Chevrolet");
        AbstractFactory chevroletInstance = AbstractFactory.getFactory(Factory.CHEVROLET);
        String expResult = "X1";
        String result = chevroletInstance.createSuv().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createSedan method, of class Ford.
     */
    @Test
    public void testCreateSedanFord() {
        System.out.println("createSedan - Ford");
        AbstractFactory fordInstance = AbstractFactory.getFactory(Factory.FORD);
        String expResult = "Focus";
        String result = fordInstance.createSedan().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createSuv method, of class Ford.
     */
    @Test
    public void testCreateSuvFord() {
        System.out.println("createSuv - Chevrolet");
        AbstractFactory fordInstance = AbstractFactory.getFactory(Factory.FORD);
        String expResult = "EcoSport";
        String result = fordInstance.createSuv().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createSedan method, of class Reault.
     */
    @Test
    public void testCreateSedanRenault() {
        System.out.println("createSedan - Renault");
        AbstractFactory fordInstance = AbstractFactory.getFactory(Factory.RENAULT);
        String expResult = "Sienna";
        String result = fordInstance.createSedan().toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createSuv method, of class Ford.
     */
    @Test
    public void testCreateSuvRenault() {
        System.out.println("createSuv - Renault");
        AbstractFactory fordInstance = AbstractFactory.getFactory(Factory.RENAULT);
        String expResult = "F500X";
        String result = fordInstance.createSuv().toString();
        assertEquals(expResult, result);
    }
    
}
