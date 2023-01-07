import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        System.out.print("Enter the string: ");
        String str = in.next().toUpperCase();

        int len = str.length();
        int power = 1; // Initialize
        // power of base
        int num = 0; // Initialize result
        int i;

        // Decimal equivalent is
        // str[len-1]*1 + str[len-2] *
        // base + str[len-3]*(base^2) + ...
        for (i = len - 1; i >= 0; i--)
        {
            // A digit in input number
            // must be less than
            // number's base
            if (val(str.charAt(i)) >= radix)
            {
                System.out.println("Invalid Number");
                break;
            }

            num += val(str.charAt(i)) * power;
            power = power * radix;
        }
        System.out.println("The equivalent decimal number " + str + " is " + num);

    }
    static int val(char c)
    {
        if (c >= '0' && c <= '9')
            return (int)c - '0';
        else
            return (int)c - 'A' + 10;
    }
}
