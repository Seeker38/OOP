package Ex2_7;

public class TestLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(4, 5);
        System.out.println(point1);
        System.out.println(point2);


        MyLine line1 = new MyLine(3, 8, 7, 5);
        MyLine line2 = new MyLine(point2, point1);


        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line1.getBegin().toString());
        System.out.println(line2.getEnd().toString());

        line2.setBegin(point1);
        line1.setEnd(point2);

        System.out.println("The coordinates of the beginning point of line1 is: X = " + line1.getBeginXY()[0] + ", Y = " + line1.getBeginXY()[1]);
        MyLine line3 = new MyLine(1, 4, 2, 3);
        line3.setBeginXY(1, 2);
        line3.setEndXY(2, 4);
        System.out.println(line3);
        System.out.println("The length of line2 is: " + line2.getLength());
        System.out.println("The gradient of line3 is: " + line3.getGradient());

    }
}
