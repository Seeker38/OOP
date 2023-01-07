package lab7.Ex1_5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "TestResizableCircle[" +
                super.toString() +
                ']';
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}
