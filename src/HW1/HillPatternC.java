import java.util.*;

public class HillPatternC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    private static void printPattern(int n) {
        for(int row = 1; row < 2*n; row++) {
            for(int col = 1; col < 2*n; col++ ) {
                if(row <= n) {
                    if(row + col <= n || col - row >= n) {
                        System.out.print("  ");
                    }   else System.out.print("# ");
                }   else {
                    if(row >= n + 1 && (row - col >= n || row + col >= 3*n)) {
                        System.out.print("  ");
                    }   else System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
