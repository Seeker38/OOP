import java.util.Scanner;

public class NumberGuess {
    final static int SECRET_NUMBER = (int) (Math.random() * 100);

    public static void main(String[] args) {
        System.out.println("Answer: ");
        System.out.println(SECRET_NUMBER);
        System.out.println("Key in your guess:");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int count = 1;

        while (true) {
            x = numberGuess(x);
            if (x == -1) {
                System.out.println("Try higher ");
                x = in.nextInt();
            } else if (x == 1) {
                System.out.println("Try lower ");
                x = in.nextInt();
            } else {
                System.out.println("You got it in " + count + " trials!");
                break;
            }
            count++;
        }

    }

    public static int numberGuess(int x) {
        if (x > SECRET_NUMBER) {
            return 1;
        } else if (x < SECRET_NUMBER) {
            return -1;
        } else {
            return 0;
        }

    }
}
