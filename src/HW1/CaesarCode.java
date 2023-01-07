import java.util.Scanner;

public class CaesarCode {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a plain text string: ");
        String x = in.next().toUpperCase();
        System.out.print("The cipher text string is: ");

        for (int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            if ( c == 'X'){
                System.out.print((char)65);
            } else if ( c == 'Y'){
                System.out.print((char)66);
            } else if (c == 'Z'){
                System.out.print((char)67);
            } else{
                    c = (char)((int)c + 3);
                    System.out.print(c);
            }
        }
    }
}
