import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String args[])
    {
        String palindrom = "";

        Scanner in = new Scanner(System.in);
        String x = in.nextLine().toLowerCase();


        int length = x.length();
        for ( int i = length - 1; i >= 0; i-- )
            palindrom = palindrom + x.charAt(i);
        if (x.equals(palindrom))
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " isn't a palindrome");
    }
}
