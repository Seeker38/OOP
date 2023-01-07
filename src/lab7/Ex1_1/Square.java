package lab7.Ex1_1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void seWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString()+
                ", width=" + width +
                ", length=" + length +
                ']';
    }
}
