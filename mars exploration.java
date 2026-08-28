import java.util.*;

public class Solution {
    static int marsExploration(String s) {
        String x = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != x.charAt(i % 3))
                count++;

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(marsExploration(sc.next()));
    }
}
