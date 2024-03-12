package Shape;

import Dimensions.Point2D;

public class Rectangle extends Shape {
    // Variablen Rechteckform
    private Point2D a;
    private Point2D b;
    private Point2D c;
    private Point2D d;


    // constructor() Methode für Rechteck
    public Rectangle(Point2D a, Point2D b, Point2D c, Point2D d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Methode zum Rechteckformen
    @Override
    public double formArea() {
        // Flächeninhalt
        double AB = a.distance(b);
        double BC = b.distance(c);
        return AB * BC;
    }

    @Override
    public double formCircumference() {
        //Umfang
        double AB = a.distance(b);
        double BC = b.distance(c);
        return 2 * (AB + BC);
    }

}

