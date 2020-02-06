package creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SingletonTest {

    @Test
    public void should_create_new_instance() {
        Singleton instance = Singleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void should_get_same_instance() {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertEquals(instance, instance2);
    }

}
