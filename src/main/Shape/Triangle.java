package Shape;

import Dimensions.Point2D;

public class Triangle extends Shape {
    // Variablen Dreieckform
    // 3 Punkte
    private Point2D a;
    private Point2D b;
    private Point2D c;

    // constructor() Methode für Dreieck
    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Methode zum Dreieckformen
    @Override
    public double formArea() {
        // Flächeninhalt
        double AB = a.distance(b);
        double BC = b.distance(c);
        double CA = c.distance(a);
        return AB + BC + CA / 2;
    }

    @Override
    public double formCircumference() {
        // Umfang
        double AB = a.distance(b);
        double BC = b.distance(c);
        double CA = c.distance(a);
        return AB + BC + CA;
    }
}
