import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        in.close();
//        System.out.println(gcd(a,b));
        System.out.println(gcd(9, 7));
        System.out.println(gcd(18, 9));
        System.out.println(gcd(9, 12));
        System.out.println(gcd(0, 1));
        System.out.println(gcd(0, -1));

    }

    public static int gcd(int a, int b) {
        if (b <= 0 || a <= 0) {
            return -1;
        }
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
