package lab6.Ex1_1;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height + 2 * super.getArea();
    }

    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
