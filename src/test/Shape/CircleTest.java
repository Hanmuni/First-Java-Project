package Shape;

import Dimensions.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle A = new Circle(5.0, new Point2D(2.0, 4.0));

    @Test
    void formArea() {
        double result = A.formArea();
        double expected = 78.54;
        assertEquals(expected, result, 0.01);
    }

    @Test
    void formCircumference() {
        double result = A.formCircumference();
        double expected = 31.4159;
        assertEquals(expected, result, 0.01);
    }
}