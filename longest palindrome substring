class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;

        String t = "^#" + String.join("#", s.split("")) + "#$";
        int n = t.length();
        int[] p = new int[n];

        int center = 0, right = 0;
        int best = 0, bestCenter = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            while (t.charAt(i + 1 + p[i]) ==
                   t.charAt(i - 1 - p[i]))
                p[i]++;

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > best) {
                best = p[i];
                bestCenter = i;
            }
        }

        int start = (bestCenter - best) / 2;
        return s.substring(start, start + best);
    }
}
