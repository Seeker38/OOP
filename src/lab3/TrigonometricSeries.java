import java.math.BigInteger;
import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int numTerms = in.nextInt();
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(x));
        System.out.println();
        System.out.println(sin(x, numTerms));
        System.out.println(cos(x, numTerms));

    }

    public static double factorial(int numTerms) {
        double ans = 1;
        for (int i = 1; i <= numTerms; i++) {
            ans *= i;
        }
        return ans;
    }

    public static double sin(double x, int numTerms) {
        double sum = 0;
        for (int i = 0; i <= numTerms; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
        }
        return sum;
    }

    public static double cos(double x, int numTerms) {
        double sum = 0;
        for (int i = 0; i <= numTerms; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorial(2 * i);
        }
        return sum;
    }

}
