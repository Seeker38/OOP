package lab6.Ex2_1;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    public String toString(){
        return "Line[begin=" + this.begin.toString() + ", end= " +this.end.toString() + "]";
    }
    public Point getBegin(){
        return begin;
    }
    public Point getEnd(){
        return end;
    }
    public void setBegin(Point begin){
        this.begin = begin;
    }
    public void setEnd(Point end){
        this.end = end;
    }
    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        return this.begin.getXY();
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setBeginXY(int x, int y) {
        this.setBeginX(x);
        this.setBeginY(y);
    }

    public void setEndXY(int x, int y) {
        this.setEndX(x);
        this.setEndY(y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.getBeginX() - this.getEndX(), 2) + Math.pow(this.getBeginY() - this.getEndY(), 2));
    }

    public double getGradient() {
        return Math.atan2(this.getEndY() - this.getBeginY(), this.getEndX() - this.getBeginX());
    }
}
