import java.util.*;

public class Solution {

    static int longest(String s) {
        int n = s.length();
        String t = s + s;
        int best = 1;

        for (int center = 0; center < 2 * n; center++) {

            int l = center, r = center;

            while (l >= 0 && r < 2 * n &&
                   r - l + 1 <= n &&
                   t.charAt(l) == t.charAt(r)) {
                best = Math.max(best, r - l + 1);
                l--;
                r++;
            }

            l = center;
            r = center + 1;

            while (l >= 0 && r < 2 * n &&
                   r - l + 1 <= n &&
                   t.charAt(l) == t.charAt(r)) {
                best = Math.max(best, r - l + 1);
                l--;
                r++;
            }
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String x = s.substring(i) + s.substring(0, i);
            System.out.println(longest(x));
        }
    }
}
