import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector3DTest {
    private Vector3D vector1;
    private Vector3D vector2;


    @BeforeEach
    public void initializer() {
        vector1 = new Vector3D(4.0, 13.0, 28.0);
        vector2 = new Vector3D(6.7, 12.0, 8.0);

    }

    @Test
    void add() {
        Vector3D result = vector1.add(vector2);
        Vector3D expected = new Vector3D(10.7, 25.0, 36.0);
        assertEquals(expected, result);
    }

    @Test
    void subtract() {
        Vector3D result = vector1.subtract(vector2);
        Vector3D expected = new Vector3D(-2.7, 1.0, 20.0);
        assertEquals(expected, result);
    }

    @Test
    void multiply() {
        double factor = 2.0;
        Vector3D result = vector1.multiply(factor);
        Vector3D expected = new Vector3D(8.0, 26.0, 56.0);
        assertEquals(expected, result);
    }

    @Test
    void divide() {
        double divisor = 2.0;
        Vector3D result = vector1.divide(divisor);
        Vector3D expected = new Vector3D(2.0, 6.5, 14.0);
        assertEquals(expected, result);
    }

    @Test
    void crossProduct() {
        Vector3D result = vector1.crossProduct(vector2);
        Vector3D expected = new Vector3D(-232.0, 155.6, -39.1);
        assertEquals(expected, result);
    }

    @Test
    void length() {
        double result = vector1.length();
        double expectedLength = 31.12;
        assertEquals(expectedLength, result, 0.01);
    }
}