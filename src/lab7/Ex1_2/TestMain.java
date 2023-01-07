package lab7.Ex1_2;

public class TestMain {
    public static void main(String[] args) {
        Circle cicrle1 = new Circle(2);
        System.out.println(cicrle1);
        System.out.println(cicrle1.getArea());
        System.out.println(cicrle1.getPerimeter());

        GeometricObject geometricObject1 = new Circle(2);
//        System.out.println(geometricObject1);
//        System.out.println(geometricObject1.getArea());
//        System.out.println(geometricObject1.getPerimeter());

        GeometricObject geometricObject2 = new Rectangle(2, 4);
        System.out.println(geometricObject2);
        System.out.println(geometricObject2.getArea());
        System.out.println(geometricObject2.getPerimeter());

        Rectangle rectangle1 = new Rectangle(2, 3);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
