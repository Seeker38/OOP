import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        items = new int[n];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }

            for (int idx = 0; idx < items.length; idx++) {
                System.out.print(idx + ": ");
                for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                    System.out.print("*");
                }
                System.out.println("(" + items[idx] + ")");
            }
        } else {
            System.out.println("lam lai");
        }

    }
}
