import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @Test
    void testCalculateBMI1() {
        // Untergewicht
        String result = BMI.calculateBMI(44, 1.8);
        assertEquals("Untergewicht", result);
    }

    @Test
    void testCalculateBMI2() {
        // Normalgewicht
        String result = BMI.calculateBMI(65, 1.68);
        assertEquals("Normalgewicht", result);
    }

    @Test
    void testCalculateBMI3() {
        // Übergewicht
        String result = BMI.calculateBMI(75, 1.63);
        assertEquals("Übergewicht", result);
    }

    @Test
    void testCalculateBMI4() {
        // Schweres Übergewicht
        String result = BMI.calculateBMI(95, 1.63);
        assertEquals("Schweres Übergewicht", result);
    }


}