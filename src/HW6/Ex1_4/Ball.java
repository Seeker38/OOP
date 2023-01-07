package HW6.Ex1_4;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int dir) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(dir));
        this.yDelta = (float) (-1 * speed * Math.sin(dir));
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta *= -1;
    }

    public void reflectVertical() {
        yDelta *= -1;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + ", " + y + "), speed=(" + xDelta + ", " + yDelta + ")]";
    }
}
