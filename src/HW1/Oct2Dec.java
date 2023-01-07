import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        int n = in.nextInt();
        int decimal_num = 0;
        int i = 0;
        int temp = n;

        while (temp != 0)
        {
            decimal_num = (int)(decimal_num + (temp % 10) * Math.pow(8, i++));
            temp = temp / 10;
        }
        System.out.println("The equivalent decimal number "  + n + " is " + decimal_num);
    }
}
