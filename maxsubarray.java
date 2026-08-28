import java.util.*;
public class Solution {
  public static List<Integer> maxSubarray(List<Integer> arr) {
        int current = arr.get(0);
        int sub = arr.get(0);
        int non = Math.max(0, arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            current = Math.max(x, current + x);
            sub = Math.max(sub, current);
            if (x > 0)
                non += x;
        }
        if (non == 0)
            non = Collections.max(arr);
        return Arrays.asList(sub, non);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++)
                arr.add(sc.nextInt());
            List<Integer> result = maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
    }
}
