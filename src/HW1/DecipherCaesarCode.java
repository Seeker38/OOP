import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a cipher text string: ");
        String x = in.next().toUpperCase();
        System.out.print("Enter a plain text string: ");

        for (int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            if ( c == 'C'){
                System.out.print("Z");
            } else if ( c == 'B'){
                System.out.print("Y");
            } else if (c == 'A'){
                System.out.print("X");
            } else{
                c = (char)((int)c - 3);
                System.out.print(c);
            }
        }
    }
}
