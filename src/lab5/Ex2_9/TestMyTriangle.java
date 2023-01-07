package Ex2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(2, 3);
        MyPoint point3 = new MyPoint(3, 4);


        MyTriangle triangle1 = new MyTriangle(5, 4, 3, 2, 1, 7);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);


        System.out.println(triangle1);
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
