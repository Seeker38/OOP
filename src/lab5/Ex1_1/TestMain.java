package Ex1_1;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0, "red");
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println(c2.getColor());

        // you can not do System.out.println(c1.radius) or c1.radius=5.0 because radius is resigned as private so it can only be called in its own class


        Circle c4 = new Circle(); // construct an instance of Circle
        c4.setRadius(5.5); // change radius
        System.out.println("radius is: " + c4.getRadius());// Print radius via getter
        c4.setColor("green"); // Change color
        System.out.println("color is: " + c4.getColor()); // Print color via getter
        // You cannot do the following because setRadius() returns void,
        // which cannot be printed
        //System.out.println(c4.setRadius(4.4));

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);
    }
}

