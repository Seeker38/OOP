package lab6.Ex1_1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        //Construced a Circle with Circle()
        //Constructed a Cylinder with Cylinder()
        System.out.println("Radius is " + cylinder1.getRadius()
                + ", Height is " + cylinder1.getHeight()
                + ", Color is " + cylinder1.getColor()
                + ", Base area is " + cylinder1.getArea()
                + ", Volume is " + cylinder1.getVolume());
        //Radius is 1.0, Height is 1.0, Color is red,
        //Base area is 3.141592653589793, Volume is 3.141592653589793

        Cylinder cylinder2 = new Cylinder(10.0);
        //Construced a Circle with Circle()
        //Constructed a Cylinder with Cylinder()
        System.out.println("Radius is " + cylinder2.getRadius()
                + ", Height is " + cylinder2.getHeight()
                + ", Color is " + cylinder2.getColor()
                + ", Base area is " + cylinder2.getArea()
                + ", Volume is " + cylinder2.getVolume());


        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        //Construced a Circle with Circle(radius)
        //Constructed a Cylinder with Cylinder(height, radius)
        System.out.println("Radius is " + cylinder3.getRadius()
                + ", Height is " + cylinder3.getHeight()
                + ", Color is " + cylinder3.getColor()
                + ", Base area is " + cylinder3.getArea()
                + ", Volume is " + cylinder3.getVolume());

    }
}
