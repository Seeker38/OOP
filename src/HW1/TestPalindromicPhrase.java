import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        String x = in.nextLine();


        int fIdx = 0;
        int bIdx = x.length()-1;
        boolean temp = true;

        x = x.toLowerCase();

        // Compares character until they are equal
        while(fIdx <= bIdx)
        {

            char chu_truoc = x.charAt(fIdx);
            char chu_cuoi = x.charAt(bIdx);

            // If there is another symbol in left of sentence
            if (!(chu_truoc >= 'a' && chu_truoc <= 'z'))
                fIdx++;

                // If there is another symbol in right of sentence
            else if(!(chu_cuoi >= 'a' && chu_cuoi <= 'z'))
                bIdx--;

                // If characters are equal
            else if( chu_cuoi == chu_truoc)
            {
                fIdx++;
                bIdx--;
            }

            // If characters are not equal then sentence is not palindrome
            else
                temp = false;
        }

        if (temp ){
            System.out.println(x + " is a palindrome phrase");
        } else {
            System.out.println(x + " is not a palindrome phrase");
        }
    }
}
