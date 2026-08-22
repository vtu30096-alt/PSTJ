import java.util.*;

public class Solution {
    static String twoStrings(String s1, String s2) {
        boolean[] seen = new boolean[26];

        for (char c : s1.toCharArray())
            seen[c - 'a'] = true;

        for (char c : s2.toCharArray())
            if (seen[c - 'a'])
                return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(twoStrings(a, b));
        }
    }
}
