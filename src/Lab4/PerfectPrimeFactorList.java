import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = in.nextInt();
        in.close();
        if (n < 6) {
            System.out.println("khong ton tai");
        } else {
            System.out.println("These numbers are equal to product of prime factors:");
            int count = 0;
            for (int i = 6; i <= n; i++) {
                if (isProductOfPrimeFactors(i)) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.printf("\n[%d primes found (%.2f%c)]", count, (double) count / n * 100, '%');
        }


    }
    public static boolean isProductOfPrimeFactors(int aPosInt){
        int temp =1;
        for (int i = 2; i <= aPosInt / 2; i++) {
            if (aPosInt % i == 0 && PrimeList.isPrime(i)) {
                temp *= i;
                if (temp > aPosInt) {
                    return false;
                }
            }
        }
        if (temp == aPosInt){
            return true;
        }
        return false;
    }
}
