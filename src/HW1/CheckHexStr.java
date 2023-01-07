import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a hex string: ");
        String x = in.next();
        int count =0;
        if (x.length() >=7){
            count =1;
        } else {
            for (int i =0; i< x.length(); i++){
                char c = x.charAt(i);
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))){
                    count =1;
                    break;
                }
            }
        }

        if (count ==0){
            System.out.println( x + " is a hex string");
        } else {
            System.out.println( x + " is NOT a hex string");
        }
    }
}
