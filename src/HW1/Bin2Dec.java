

import java.util.Scanner;


public class Bin2Dec {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("\nEnter a Binary string: ");
       int n = in.nextInt();

        int num = n;
        int dec = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            if (last_digit == 0 || last_digit ==1) {
                temp = temp / 10;

                dec += last_digit * base;

                base = base * 2;
            }
            else {
                throw new ArithmeticException("error: invalid binary string " + n);
            }
        }
        System.out.println("The equivalent decimal number for binary" + n + " is " + base);
    }

}