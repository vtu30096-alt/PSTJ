class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                count += (i < mid) ? 1 : -1;
            }
        }
        return count == 0;
    }
}
