package lab6.Ex1_4;

public class TestMain {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("xanh", false);
        System.out.println(shape1);
        System.out.println(shape2);

        shape2.setColor("vang");
        shape2.setFilled(true);
        System.out.println(shape2);

        Cicrle cicrle1 = new Cicrle();
        Cicrle cicrle2 = new Cicrle(2);
        Cicrle cicrle3 = new Cicrle(3, "den", false);
        System.out.println(cicrle1);
        System.out.println(cicrle2);
        System.out.println(cicrle3);

        System.out.println("area: " + cicrle3.getArea());
        System.out.println("perimeter: " + cicrle3.getPerimeter());
        cicrle3.setColor("xanh");
        cicrle3.setFilled(true);
        cicrle3.setRadius(4);
        System.out.println(cicrle3);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2, 3);
        Rectangle rectangle3 = new Rectangle(3, 4, "do", false);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("area: " + rectangle3.getArea());
        System.out.println("perimeter: " + rectangle3.getPerimeter());

        rectangle3.setLength(5);
        rectangle3.setWidth(6);
        rectangle3.setColor("trang");
        rectangle3.setFilled(true);
        System.out.println(rectangle3);

        Square square1 = new Square();
        Square square2 = new Square(3);
        Square square3 = new Square(4, "den", false);
        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println("area: " + square3.getArea());
        System.out.println("perimeter: " + square3.getPerimeter());

        square3.setSide(5);
        System.out.println(square3);
        square3.setLength(6);
        System.out.println(square3);
        square3.setWidth(7);
        System.out.println(square3);
        square3.setColor("hong");
        square3.setFilled(true);
        System.out.println(square3);


    }
}
