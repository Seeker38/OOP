package Ex2_8;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(6, 9);


        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(1, 3, 4);
        MyCircle circle3 = new MyCircle(point2, 4);



        circle1.setRadius(3);
        System.out.println(circle1);
        circle1.setCenter(point1);
        System.out.println(circle1);
        System.out.println( circle3.getRadius());
        System.out.println( circle2.getCenter().toString());
        System.out.println("The circle1's center is at: X = " + circle1.getCenterX() + ", Y = " + circle1.getCenterY());
        System.out.println("The circle2's center is at: X = " + circle2.getCenterXY()[0] + ", Y = " + circle2.getCenterXY()[1]);
        circle3.setCenterX(3);
        circle3.setCenterY(3);
        System.out.println(circle3);
        circle2.setCenterXY(6, 7);
        System.out.println(circle2);
        System.out.println(circle1.getArea());
        System.out.println(circle3.getCircumference());
        System.out.println(circle1.distance(circle3));
    }
}
