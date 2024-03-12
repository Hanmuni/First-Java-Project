import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}