import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer( or −1 to end): ");
        int number = in.nextInt();
        int sum = 0;
        int numberOne = number;

        if (hasEight(number)) {
            sum = sum + number;
        }

        while (numberOne != SENTINEL) {
            System.out.print("Enter a positive integer( or −1 to end): ");
            numberOne = in.nextInt();
            if (hasEight(numberOne)) {
                sum += numberOne;
            }
        }
        System.out.println("The magic sum is: " + sum);

    }

    public static boolean hasEight(int number) {
        int temp;
        while (number > 0) {
            temp = number % 10;
            if (temp == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
