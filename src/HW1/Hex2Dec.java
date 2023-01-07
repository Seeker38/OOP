import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String hex = in.next().toUpperCase();



        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            if ((c >= 'A' && c<= 'F') || (c >= '0' && c <= '9')) {
                int d = digits.indexOf(c);
                val = 16 * val + d;
            } else {
                System.out.println("error: invalid hexadecimal string " + hex);
                break;
            }
        }


        System.out.println("The equivalent decimal number for hex adecimal:"+ hex + " is " + val);
    }
}
