package Ex2_10;


public class MyRectangle {
//    private MyPoint topLeft;
//    private MyPoint bottomRight;
//
//    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }

    private MyPoint topLeft = new MyPoint();
    private MyPoint bottomRight = new MyPoint();

    public MyRectangle(MyPoint top_left, MyPoint bottom_right) {
        this.topLeft = top_left;
        this.bottomRight = bottom_right;
    }

    public double getPerimeter() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottomRight.getX() - topLeft.getX();
            width = topLeft.getY() - bottomRight.getY();
        }
        return 2 * length * width;
    }

    public double getArea() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottomRight.getX() - topLeft.getX();
            width = topLeft.getY() - bottomRight.getY();
        }
        return length * width;
    }

    public boolean isValid() {
        if (topLeft.getX() < bottomRight.getX() && topLeft.getY() > bottomRight.getY()) {
            return true;
        } else {
            return false;
        }
    }

    public String getType() {
        int length = 1;
        int width = 1;
        if (this.isValid()) {
            length = bottomRight.getX() - topLeft.getX();
            width = topLeft.getY() - bottomRight.getY();
        }
        if (length == width) return "Square";
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "MyRectangle[" +
                "top_left=" + topLeft +
                ", bottom_right=" + bottomRight +
                ']';
    }

}
