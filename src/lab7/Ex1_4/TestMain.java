package lab7.Ex1_4;


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

        Movable movable3 = new MovableCircle(3, 4, 5, 6, 7);
        System.out.println(movable3);
        movable3.moveDown();
        movable3.moveRight();
        System.out.println(movable3);
        movable3.moveLeft();
        movable3.moveUp();
        System.out.println(movable3);

    }
}
