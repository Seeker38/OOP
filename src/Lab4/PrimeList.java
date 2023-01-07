import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        if (n <= 1) {
            System.out.println("khong ton tai so nguyen to");
        } else {
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.printf("[%d primes found (%.2f%c)]", count, (double) count / n * 100, '%');
        }


    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
                if (aPosInt % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
