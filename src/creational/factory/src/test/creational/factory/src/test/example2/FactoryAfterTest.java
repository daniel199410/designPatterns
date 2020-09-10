package creational.factory.src.test.example2;

import creational.factory.src.example2.after.factory.ConverterType;
import creational.factory.src.example2.after.factory.Director;
import creational.factory.src.example2.before.Instance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

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
    public void shouldGetFoo() {
        assertEquals("foo", Objects.requireNonNull(Director.getConverter(ConverterType.JSON)).serialize(new Instance()));
    }
}
