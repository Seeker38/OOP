import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        String x = in.nextLine();
        x = x.toUpperCase();

        int number = 0;
        for (int i =0; i<x.length(); i++){
            char c = x.charAt(i);
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    number = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    number = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    number = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    number = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    number = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    number = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    number = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    number = 9;
            }
            System.out.print(number);
        }
        System.out.println();
        nested_if(x);
    }

    public static void nested_if(String x){
        int number =0;
        for (int i =0; i<x.length(); i++) {
            char c = x.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C'){
                number =2;
            } else if (c == 'D' || c == 'E' || c=='F' ){
                number =3;
            } else if (c == 'G' || c == 'H' || c=='I' ){
                number=4;
            } else if (c == 'J' || c == 'K' || c=='L' ){
                number =5;
            } else if (c == 'M' || c == 'N' || c=='O' ){
                number =6;
            } else if (c == 'P' || c == 'Q' || c=='R'  || c == 'S'){
                number =7;
            } else if (c == 'T' || c == 'U' || c=='V' ){
                number =8;
            } else if (c == 'W' || c == 'X' || c=='Y' || c=='Z' ){
                number =9;
            } else{
                number=-1;
            }

            System.out.print(number);
        }
    }
}
