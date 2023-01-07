package lab7.Ex1_5;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        GeometricObject geometricObject1 = new Circle(2);
        System.out.println(geometricObject1.getPerimeter());
        System.out.println(geometricObject1.getArea());
    }
}
