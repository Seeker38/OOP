package lab7.Ex1_5;

public class TestResizableCircle  {
    public static void main(String[] args) {
        ResizableCircle resizableCircle1 = new ResizableCircle(2.3);
        System.out.println(resizableCircle1);
        System.out.println(resizableCircle1.getArea());
        System.out.println(resizableCircle1.getPerimeter());
        resizableCircle1.resize(2);
        System.out.println(resizableCircle1);


        GeometricObject geometricObject1 = new ResizableCircle(2.5);
        System.out.println(geometricObject1);
        System.out.println(geometricObject1.getArea());
        System.out.println(geometricObject1.getPerimeter());

        Circle circle1 = new ResizableCircle(1);
        System.out.println(circle1);
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());

        Resizable resizable1 = new ResizableCircle(2.2);
        System.out.println(resizable1);
        resizable1.resize(5);
        System.out.println(resizable1);
    }
}
