import java.util.Scanner;

public class TriangularPatternB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = in.nextInt();

        TriangularPatternB(size);
    }
    public static void TriangularPatternB(int size){
        for (int row=1; row <= size; row ++) {
            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
