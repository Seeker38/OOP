package lab6.Ex2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.base.getArea() * 2 + this.base.getPerimeter() * this.height;
    }

    public double getVolume() {
        return this.base.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + base.toString() + ", height=" + this.height + "]";
    }
}

