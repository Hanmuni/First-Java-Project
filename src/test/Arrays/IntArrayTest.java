package Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {
    IntArray intArray1 = new IntArray(5);

    @Test
    void add() {
        intArray1.add(15);
        intArray1.add(13);
        intArray1.add(18);
        int result1 = intArray1.getIndex(0);
        int result2 = intArray1.getIndex(1);
        int result3 = intArray1.getIndex(2);
        int expected1 = 15;
        int expected2 = 13;
        int expected3 = 18;
        assertEquals(expected1, result1);
        assertEquals(expected2, result2);
        assertEquals(expected3, result3);
    }

    @Test
    void getArraySize() {
        int result1 = intArray1.getArraySize();
        int expected1 = 5;
        assertEquals(expected1, result1);
        intArray1.add(10);
        intArray1.add(10);
        intArray1.add(10);
        intArray1.add(10);
        intArray1.add(10);
        intArray1.add(10);
        int result2 = intArray1.getArraySize();
        int expected2 = 10;
        assertEquals(expected2, result2);

    }

    @Test
    void getElementCount() {
        intArray1.add(1);
        int result = intArray1.getElementCount();
        int expected = 1;
        assertEquals(expected, result);
    }
}