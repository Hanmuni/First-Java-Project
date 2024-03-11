public class Point2D {

    //Variablen Koordinaten
    private double x, y;

    // constructor() x und y
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter X
    public double getX() {
        return x;
    }

    // Setter X
    public void setX(double x) {
        this.x = x;
    }

    // Getter Y
    public double getY() {
        return y;
    }

    // Setter Y
    public void setY(double y) {
        this.y = y;
    }

    // Addition
    public Point2D add(Point2D otherPoint) {
        return new Point2D(this.x + otherPoint.getX(), this.y + otherPoint.getY());
    }

    // Subtraktion
    public Point2D subtract(Point2D otherPoint) {
        return new Point2D(this.x - otherPoint.getX(), this.y - otherPoint.getY());
    }

    // Multiplikation
    public Point2D multiply(double factor) {
        return new Point2D(this.x * factor, this.y * factor);
    }

    // Division
    public Point2D divide(double divisor) {
        return new Point2D(this.x / divisor, this.y / divisor);

    }

    // in String formattieren
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public double distance(Point2D b) {
    }
}
