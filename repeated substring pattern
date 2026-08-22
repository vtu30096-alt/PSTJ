class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];

        for (int i = 1, j = 0; i < n;) {
            if (s.charAt(i) == s.charAt(j))
                lps[i++] = ++j;
            else if (j > 0)
                j = lps[j - 1];
            else
                i++;
        }

        int len = lps[n - 1];
        return len > 0 && n % (n - len) == 0;
    }
}
