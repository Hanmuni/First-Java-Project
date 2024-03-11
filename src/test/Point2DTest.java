import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void add() {
        Point2D point1 = new Point2D(1.0, 2.0);
        Point2D point2 = new Point2D(3.0, 4.0);
        Point2D result = point1.add(point2);
        assertEquals(result);
    }

    @Test
    void subtract() {
        Point2D point1 = new Point2D(5.0, 6.0);
        Point2D point2 = new Point2D(2.0, 3.0);
        Point2D result = point1.subtract(point2);
        assertEquals(result);

    }

    @Test
    void multiply() {
        Point2D point = new Point2D(2.0, 3.0);
        Point2D result = point.multiply(2.0);
        assertEquals(result);
    }

    @Test
    void divide() {
        Point2D point = new Point2D(6.0, 8.0);
        Point2D result = point.divide(2.0);
        assertEquals(result);
    }
}