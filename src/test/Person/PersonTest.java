package Person;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person A = new Person(28, "Eiichiro", "Oda", 1.75, 80);
    Person B = new Person(28, "Eiichiro", "Oda", 1.75, 80);
    Person C = new Person(35, "Tite", "Kubo", 1.78, 88);

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

    @Test
    void heightComparator() {
        assertTrue(Person.heightComparator.compare(A, C) < 0); // A kleiner als C
        assertTrue(Person.heightComparator.compare(C, A) > 0); // C größer als A
        assertEquals(0, Person.heightComparator.compare(A, B)); // A und B gleich groß
    }

    @Test
    void ageComparator() {
        assertTrue(Person.ageComparator.compare(A, C) < 0); // A jünger als C
        assertTrue(Person.ageComparator.compare(C, A) > 0); // C älter als A
        assertEquals(0, Person.ageComparator.compare(A, B)); // gleich alt
    }

    @Test
    void compareToAge() {
        assertTrue(A.compareTo(C) < 0); // A jünger als C
        assertTrue(C.compareTo(A) > 0); // C älter als A
        assertEquals(0, A.compareTo(B));  // gleich alt
    }
}