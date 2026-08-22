import java.util.*;

public class Solution {
    static int palindromeIndex(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (check(s, l + 1, r)) return l;
                return r;
            }
            l++;
            r--;
        }

        return -1;
    }

    static boolean check(String s, int l, int r) {
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
            System.out.println(palindromeIndex(sc.next()));
    }
}
