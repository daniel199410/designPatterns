package creational.singleton.test;

import creational.singleton.example2.after.factory.ConverterType;
import creational.singleton.example2.after.factory.Director;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactoryAfterTest {

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
    public void shouldGetSameConcreteCreatorInstance() {
        assertEquals(Director.getConverter(ConverterType.JSON), Director.getConverter(ConverterType.JSON));
    }

    @Test
    public void shouldGetDifferentConcreteCreatorInstance() {
        assertNotEquals(Director.getConverter(ConverterType.XML), Director.getConverter(ConverterType.XML));
    }
}
