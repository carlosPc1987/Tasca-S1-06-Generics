package exercici1;

import org.example.nivell1.exercici1.module.NoGenericMethods;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoGenericMethodsTest {

    @Test
    public void testInitialization() {
        NoGenericMethods instance = new NoGenericMethods("A", "B", "C");

        assertEquals("A", instance.getObj1());
        assertEquals("B", instance.getObj2());
        assertEquals("C", instance.getObj3());
    }

    @Test
    public void testSetters() {
        NoGenericMethods instance = new NoGenericMethods("X", "Y", "Z");

        instance.setObj1("Uno");
        instance.setObj2("Dos");
        instance.setObj3("Tres");

        assertEquals("Uno", instance.getObj1());
        assertEquals("Dos", instance.getObj2());
        assertEquals("Tres", instance.getObj3());
    }
}

