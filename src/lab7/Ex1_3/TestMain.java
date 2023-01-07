package lab7.Ex1_3;

public class TestMain {
    public static void main(String[] args) {
        //Movable movable 1 = new Movable();

        Movable movable2 = new MovablePoint(2, 3, 5, 6);
        System.out.println(movable2);
        movable2.moveDown();
        movable2.moveLeft();
        System.out.println(movable2);
        movable2.moveRight();
        movable2.moveUp();
        System.out.println(movable2);
    }
}
