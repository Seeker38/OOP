import java.util.*;
public class HillPatternD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = sc.nextInt();
        printPattern(n);
    }
    private static void printPattern(int n) {
        for(int row = 1; row < 2*n; row++) {
            for(int col = 1; col < 2*n; col++) {
                if(row <= n) {
                    if ((col <= n && row + col <= n + 1) || (col >= n && col <= 2*n - 1 && col - row >= n - 1)) {
                        System.out.print("# ");
                    } else System.out.print("  ");
                }   else if (row > n) {
                    if((col <= n && row - n + 1 >= col) || (col >= n && col <= 2*n - 1 &&  row - n + 1 + col > 2*n - 1)) {
                        System.out.print("# ");
                    }   else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
