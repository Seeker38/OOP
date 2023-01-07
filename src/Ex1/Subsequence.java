package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequence {
    public static List<String> ans;

    public static void main(String[] args) {
        ans = new ArrayList<>();
        String s = args[0];
        int k = Integer.parseInt(args[1]);
        generatePermutation(new StringBuilder(""), 0, s.toCharArray(), k);
        System.out.println(ans);
    }

    private static void generatePermutation(StringBuilder temp, int st, char[] str, int k) {
        if (temp.length() == k) {
            String br = temp.toString();
            ans.add(br);
            return;
        }

        for (int i = st; i < str.length; i++) {
            temp.append(str[i]);
            generatePermutation(temp, i + 1, str, k);
            temp.setLength(temp.length() - 1);
        }
    }

}