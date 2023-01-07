import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String input = in.nextLine();
        int n = input.length();

        char[] digit = input.toLowerCase().toCharArray();
        System.out.print("The equivalent binary for hexadecimal " + input + " is: ");

        int i = 0;
        while (i < n) {
            switch (digit[i]) {
                case '0':
                    System.out.print("0000 ");
                    break;
                case '1':
                    System.out.print("0001 ");
                    break;
                case '2':
                    System.out.print("0010 ");
                    break;
                case '3':
                    System.out.print("0011 ");
                    break;
                case '4':
                    System.out.print("0100 ");
                    break;
                case '5':
                    System.out.print("0101 ");
                    break;
                case '6':
                    System.out.print("0110 ");
                    break;
                case '7':
                    System.out.print("0111 ");
                    break;
                case '8':
                    System.out.print("1000 ");
                    break;
                case '9':
                    System.out.print("1001 ");
                    break;
                case 'a':
                    System.out.print("1010 ");
                    break;
                case 'b':
                    System.out.print("1011 ");
                    break;
                case 'c':
                    System.out.print("1100 ");
                    break;
                case 'd':
                    System.out.print("1101 ");
                    break;
                case 'e':
                    System.out.print("1110 ");
                    break;
                case 'f':
                    System.out.print("1111 ");
                    break;
                default:
                    System.out.println("lam lai");
                    return;
            }
            i++;
        }

    }
}
