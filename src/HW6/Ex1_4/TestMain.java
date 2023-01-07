package HW6.Ex1_4;

public class TestMain {
    public static void main(String[] args) {
        Ball ball1 = new Ball(12, 21, 1, 2, 3);
        System.out.println(ball1);
        ball1.setRadius(2);
        ball1.setX(23);
        ball1.setY(12);
        System.out.println(ball1);

        ball1.reflectHorizontal();
        ball1.reflectVertical();
        ball1.move();
        System.out.println(ball1);


        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}

