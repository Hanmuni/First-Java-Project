package Dimensions;

import Dimensions.Point2D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    private Point2D point1;
    private Point2D point2;

    @BeforeEach
    public void initializer() {
        point1 = new Point2D(4.0, 8.0);
        point2 = new Point2D(8.0, 6.0);
    }

    @Test
    void add() {
        Point2D result = point1.add(point2);
        assertEquals(12.0, result.getX());
        assertEquals(14.0, result.getY());
    }

    @Test
    void subtract() {
        Point2D result = point1.subtract(point2);
        assertEquals(-4.0, result.getX());
        assertEquals(2.0, result.getY());
    }

    @Test
    void multiply() {
        Point2D result = point1.multiply(2.0);
        assertEquals(8.0, result.getX());
        assertEquals(16.0, result.getY());
    }

    @Test
    void divide() {
        Point2D result = point1.divide(2.0);
        assertEquals(2.0, result.getX());
        assertEquals(4.0, result.getY());
    }
}