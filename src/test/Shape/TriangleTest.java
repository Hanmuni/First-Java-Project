package Shape;

import Dimensions.Point2D;
import Shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    Point2D a = new Point2D(0, 0);
    Point2D b = new Point2D(1, 0);
    Point2D c = new Point2D(0.5, 1);

    Triangle ABC = new Triangle(a, b, c);

    @Test
    void formArea() {
        double result = ABC.formArea();
        double expected = 0.5;
        assertEquals(expected, result, 0.01);
    }

    @Test
    void formCircumference() {
        double result = ABC.formCircumference();
        double expected = 3.23;
        assertEquals(expected, result, 0.01);
    }
}