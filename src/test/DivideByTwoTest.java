import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DivideByTwoTest {

    @Test
    void divisibleTwo() {
        // divisible two
        boolean result = DivideByTwo.divisibleTwo(4);
        assertTrue(result);
    }

    @Test
    void testDivisibleTwo() {
        // not divisible two
        boolean result = DivideByTwo.divisibleTwo(13);
        assertFalse(result);
    }
}