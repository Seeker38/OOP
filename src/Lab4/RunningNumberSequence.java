import java.util.Scanner;

public class RunningNumberSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.println(sequence(n));
        System.out.println(len(n));

    }

    /*public static String sequence(int n) {
        if (n == 1) {
            return "1";
        } else {
            return sequence(n - 1) + n;
        }
    }*/

    public static int len(int n) {
        if (n == 1) {
            return 1;
        } else {
            return len(n - 1) + numOfDigits(n);
        }
    }

    private static int numOfDigits(int n) {
        return (n + "").length();
    }
}
