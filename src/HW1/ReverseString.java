import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= in.nextLine();
        String nstr="";
        char ch;

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("The reverse of the string "+ str + " is " + nstr);
    }
}
