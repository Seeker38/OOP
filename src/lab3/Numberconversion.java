import java.util.Scanner;

public class Numberconversion {

    public static final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and a radix: ");
        String numberStr = in.next();
        System.out.print("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = in.nextInt();


        System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n", numberStr, inRadix, toRadix(numberStr, inRadix, outRadix), outRadix);
    }

    public static int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        String result = "";
        if (radix == 0) {
            return result;
        }

        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }

}
