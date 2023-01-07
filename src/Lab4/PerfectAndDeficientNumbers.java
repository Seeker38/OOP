import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        if (n < 6) {
            System.out.println("khong ton tai perfect va deficient");
        } else {
            System.out.println("The numbers are perfect: ");
            for (int i = 6; i <= n; i++) {
                if (isPerfect(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\n[%d perfect number found (%.2f%c)]", count, (double) count / n * 100, '%');
            System.out.println();
            System.out.println("These numbers are neither deficient nor perfect:");
            int count2 = 0;
            for (int i = 6; i <= n; i++) {
                if (isPerfect(i) == false && isDeficient(i) == false) {
                    count2++;
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\n[%d perfect number found (%.2f%c)]", count2, (double) count2 / n * 100, '%');
        }
//        System.out.println(isDeficient(10));
//        System.out.println(isPerfect(10));
//        System.out.println(isPerfect(6));
//        System.out.println(isDeficient(6));

    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }
}
