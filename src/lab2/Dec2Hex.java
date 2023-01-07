import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a dedcimal number: ");
        int input = in.nextInt();
        String output = toHex(input);
        System.out.println("The equivalent hex adecimal number is: " + output);
    }

    public static String toHex(int decimal) {
        int rem;
        String hex = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            rem = decimal % 16;
            hex = hexchars[rem] + hex;
            decimal = decimal / 16;
        }
        return hex;
    }
}
