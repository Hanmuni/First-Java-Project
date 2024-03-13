package Person;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {
    Person A = new Person(28, "Eiichiro", "Oda", 1.75, 80);
    Person B = new Person(28, "Eiichiro", "Oda", 1.75, 80);
    Person C = new Person(35, "Tite", "Kubo", 1.70, 88);

    @Test
    void testEquals() {
        assertEquals(A, B);
    }

    @Test
    void testNotEquals() {
        assertNotEquals(A, C);
    }

    @Test
    void testHashMapKeyValue() {
        Map<Person, String> map = new HashMap<>();
        map.put(A, "ValueA");
        String result1 = map.get(A);
        String result2 = map.get(B);
        assertEquals("ValueA", result1);
        assertEquals("ValueA", result2);
    }
}