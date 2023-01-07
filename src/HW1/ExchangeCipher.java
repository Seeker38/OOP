import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a plain text string: ");
        String x = in.next().toUpperCase();
        System.out.print("Enter a cipher text string: ");

        for (int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            int differ = (77 - (int)c) *2 +1;
            System.out.print((char)(differ + c));

        }
    }
}
