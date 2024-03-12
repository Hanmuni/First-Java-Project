package Dimensions;

import java.util.Objects;

public class Vector3D {
    // Variablen Koordinaten
    private double x, y, z;

    // constructor() x, y und z
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getter X
    public double getX() {
        return x;
    }

    // Getter Y
    public double getY() {
        return y;
    }

    // Getter Z
    public double getZ() {
        return z;
    }

    // Addition
    public Vector3D add(Vector3D otherVector) {
        return new Vector3D(this.x + otherVector.getX(), this.y + otherVector.getY(), this.z + otherVector.getZ());
    }

    // Subtraktion
    public Vector3D subtract(Vector3D otherVector) {
        return new Vector3D(this.x - otherVector.getX(), this.y - otherVector.getY(), this.z - otherVector.getZ());
    }

    // Multiplikation
    public Vector3D multiply(double factor) {
        return new Vector3D(this.x * factor, this.y * factor, this.z * factor);
    }

    // Division
    public Vector3D divide(double divisor) {
        return new Vector3D(this.x / divisor, this.y / divisor, this.z / divisor);

    }

    // Kreuzprodukt
    public Vector3D crossProduct(Vector3D otherVector) {
        double crossProductX = this.y * otherVector.getZ() - this.z * otherVector.getY();
        double crossProductY = this.z * otherVector.getX() - this.x * otherVector.getZ();
        double crossProductZ = this.x * otherVector.getY() - this.y * otherVector.getX();
        return new Vector3D(crossProductX, crossProductY, crossProductZ);
    }

    // Länge
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Double.compare(x, vector3D.x) == 0 && Double.compare(y, vector3D.y) == 0 && Double.compare(z, vector3D.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
