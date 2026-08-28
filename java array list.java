import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(in.nextInt());
            }

            list.add(row);
        }

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x >= 1 && x <= n && y >= 1 && y <= list.get(x - 1).size()) {
                System.out.println(list.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
