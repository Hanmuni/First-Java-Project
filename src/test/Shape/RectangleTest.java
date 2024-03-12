package Shape;

import Dimensions.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private

    Rectangle A = new Rectangle(new Point2D(2.0, 2.0), new Point2D(3.0, 2.0), new Point2D(3.0, 4.0), new Point2D(2.0, 4.0));

    @Test
    void formArea() {
        double result = A.formArea();
        double expected = 2.0;
        assertEquals(expected, result, 0.01);
    }

    @Test
    void formCircumference() {
        double result = A.formCircumference();
        double expected = 6.0;
        assertEquals(expected, result, 0.01);
    }
}