import java.util.*;
public class Solution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        int layers = Math.min(m, n) / 2;
        for (int layer = 0; layer < layers; layer++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = layer; i < m - layer; i++)
                list.add(a[i][layer]);
            for (int j = layer + 1; j < n - layer; j++)
                list.add(a[m - layer - 1][j]);
            for (int i = m - layer - 2; i >= layer; i--)
                list.add(a[i][n - layer - 1]);
            for (int j = n - layer - 2; j > layer; j--)
                list.add(a[layer][j]);
            int len = list.size();
            int shift = r % len;
            int index = shift;
            for (int i = layer; i < m - layer; i++)
                a[i][layer] = list.get(index++ % len);
            for (int j = layer + 1; j < n - layer; j++)
                a[m - layer - 1][j] = list.get(index++ % len);
            for (int i = m - layer - 2; i >= layer; i--)
                a[i][n - layer - 1] = list.get(index++ % len);
            for (int j = n - layer - 2; j > layer; j--)
                a[layer][j] = list.get(index++ % len);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
