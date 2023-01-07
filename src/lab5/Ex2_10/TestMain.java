package Ex2_10;


public class TestMain {
    public static void main(String[] args) {

        MyPoint topLeft1 = new MyPoint(-2, 3);
        MyPoint bottomRight1 = new MyPoint(0, 0);
//        MyPoint topLeft1 = new MyPoint(-3, 3);
//        MyPoint bottomRight1 = new MyPoint(0, 0);
//        MyPoint topLeft1 = new MyPoint(2, 3);
//        MyPoint bottomRight1 = new MyPoint(1, 2);

        MyRectangle rectangle = new MyRectangle(topLeft1, bottomRight1);


        if (rectangle.isValid()) {
            System.out.println("The area is: " + rectangle.getArea());
            System.out.println("The perimeter is: " + rectangle.getPerimeter());
            System.out.println("Type: " + rectangle.getType());

        } else {
            System.out.println("not rectangle");

        }
    }
}
