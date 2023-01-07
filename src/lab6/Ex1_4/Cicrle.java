package lab6.Ex1_4;

public class Cicrle extends Shape {
    private double radius = 1;

    public Cicrle() {

    }

    public Cicrle(double radius) {
        this.radius = radius;
    }

    public Cicrle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;

    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Cicrle[" + super.toString() +
                ", radius=" + radius +
                ']';
    }
}
