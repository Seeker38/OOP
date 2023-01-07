import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        final int NUMBERS;
        int[] items;

        System.out.print("Enter the number of items: ");
        Scanner in = new Scanner(System.in);
        NUMBERS = in.nextInt();
        items = new int[NUMBERS];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }

            for (int i = 0; i < items.length; i++) {
                if (i == 0) {
                    System.out.print("[ " + items[i] + " ");
                } else {
                    System.out.print(items[i] + " ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("lam lai");
        }


    }
}
