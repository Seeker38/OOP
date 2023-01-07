import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String x = in.next();

        int vowels =0, digits =0;

        x= x.toLowerCase();
        for (int i=0; i<x.length(); i++){
            char c = x.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                ++vowels;
            }
            else if (c >= '0' && c <= '9') {
                ++digits;
            }
        }
        int n=x.length();
        double ansV = (vowels /(double)n) *100;
        double ansD = (digits/(double)n) *100;

        System.out.printf("Number of vowels: " + vowels  + " (" + Math.round(ansV *100.0)/100.0 + ")" + "%%");
        System.out.println();
        System.out.printf("Number of vowels: " + digits  + " (" + Math.round(ansD *100.0)/100.0 + ")" + "%%");
    }
}
