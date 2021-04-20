package creational.abstractFactory.test;

import after.abstractFactory.AbstractFactory;
import creational.abstractFactory.example2.before.EnumPlatform;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryExample2Test {

    public AbstractFactoryExample2Test() {
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
    public void shouldGetJavaFormatter() {
        assertEquals("text beautified with Java beautifier", AbstractFactory.getFactory(EnumPlatform.JAVA).createFormatter().beautify("text"));
        assertEquals("text uglified with Java uglifier", AbstractFactory.getFactory(EnumPlatform.JAVA).createFormatter().uglify("text"));
    }

    @Test
    public void shouldGetJavaLinter() {
        assertEquals("text linted with Java linter", AbstractFactory.getFactory(EnumPlatform.JAVA).createLinter().lint("text"));
    }

    @Test
    public void shouldGetJavaScriptFormatter() {
        assertEquals("text beautified with Javascript beautifier", AbstractFactory.getFactory(EnumPlatform.JAVASCRIPT).createFormatter().beautify("text"));
        assertEquals("text uglified with Javascript uglifier", AbstractFactory.getFactory(EnumPlatform.JAVASCRIPT).createFormatter().uglify("text"));
    }

    @Test
    public void shouldGetJavaScriptLinter() {
        assertEquals("text linted with JavaScript linter", AbstractFactory.getFactory(EnumPlatform.JAVASCRIPT).createLinter().lint("text"));
    }

    @Test
    public void shouldGetPythonFormatter() {
        assertEquals("text beautified with Python beautifier", AbstractFactory.getFactory(EnumPlatform.PYTHON).createFormatter().beautify("text"));
        assertEquals("text uglified with Python uglifier", AbstractFactory.getFactory(EnumPlatform.PYTHON).createFormatter().uglify("text"));
    }

    @Test
    public void shouldGetPythonLinter() {
        assertEquals("text linted with Python linter", AbstractFactory.getFactory(EnumPlatform.PYTHON).createLinter().lint("text"));
    }
}
