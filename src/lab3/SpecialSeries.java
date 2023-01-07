import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int numTerms = in.nextInt();
        if (-1 <= x && x >= -1)
            System.out.println(specialSeries(x, numTerms));
        else
            System.out.println("Lam lai");
    }

    public static double even(int numTerms) {
        double ans = 1;
        for (int i = 1; i < numTerms; i++) {
            if (i % 2 == 0) {
                ans *= i;
            }
        }
        return ans;
    }

    public static double odd(int numTerms) {
        double ans = 1;
        for (int i = 1; i < numTerms; i++) {
            if (i % 2 != 0) {
                ans *= i;
            }
        }
        return ans;
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0;
        for (int i = 0; i <= numTerms; i++) {
            sum += Math.pow(x, 2 * i + 1) * odd(2 * i + 1) / (even(2 * i + 1) * (2 * i + 1));
        }
        return sum;
    }
}
