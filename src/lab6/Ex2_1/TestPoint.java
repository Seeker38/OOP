package lab6.Ex2_1;

public class TestPoint {
    public static void main(String[] args) {
//        Point p1 = new Point(10,20);
//        System.out.println(p1);
//        Line l1 = new Line(0, 0, 3, 4);
//
//        Point p1 = new Point(3, 4);
//        Point p2 = new Point(4, 5);
//        Line l2 = new Line(p1, p2);
//        System.out.println(l2);

        LineSub l1 = new LineSub(1, 3, 4, 2);
        LineSub l2 = new LineSub(new Point(2, 3), new Point(4, 5));
        System.out.println(l1);
        System.out.println(l2);

        l2.setBegin(new Point(4, 5));
        l2.setEnd(new Point(5, 6));
        System.out.println(l2);
        System.out.println("length: " + l2.getLength());

        l2.setBeginX(12);
        l2.setBeginY(23);
        l2.setEndX(34);
        l2.setEndY(45);
        System.out.println(l2);


        l2.setBeginXY(11, 22);
        l2.setEndXY(33, 44);
        System.out.println(l2);


    }
}
