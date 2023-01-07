package Ex1;

import java.util.Scanner;

public class PermutationsLex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        permutation(n);

    }

    public static void permutation(int n) {
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = ans + i;
        }
        permutation(ans, "");
    }

    public static void permutation(String n, String temp) {
        if (n.length() == 0) {
            System.out.println(temp);
        } else {
            for (int i = 0; i < n.length(); i++) {
                char num = n.charAt(i);
                permutation(n.substring(0, i) + n.substring(i + 1), temp + num);
            }
        }
    }
}
