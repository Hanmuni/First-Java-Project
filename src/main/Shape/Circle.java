package Shape;

import Dimensions.Point2D;

public class Circle extends Shape {
    // Variable Kreisform
    private double radius;
    private Point2D center;

    // constructor() Methode für Kreis
    public Circle(double radius, Point2D center) {
        this.radius = radius;
        this.center = center;
    }

    // Methode zum Kreisformen
    @Override
    public double formArea() {
        // Flächeninhalt
        return Math.PI * radius * radius;
    }

    @Override
    public double formCircumference() {
        // Umfang
        return 2 * Math.PI * radius;
    }
}
