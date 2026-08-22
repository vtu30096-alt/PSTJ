import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            if (match(word, pattern))
                ans.add(word);
        }

        return ans;
    }

    private boolean match(String word, String pattern) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map.containsKey(w)) {
                if (map.get(w) != p)
                    return false;
            } else {
                if (used.contains(p))
                    return false;

                map.put(w, p);
                used.add(p);
            }
        }

        return true;
    }
}
