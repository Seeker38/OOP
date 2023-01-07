import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        for (int i = 1; i<=size; i++){
            for (int y =1; y<= size; y++){
                System.out.printf("%4d", (y*i));
            }
            System.out.println();
        }
    }
}
