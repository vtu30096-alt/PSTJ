import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String a = in.next();
            String b = in.next();

            set.add(a + " " + b);

            System.out.println(set.size());
        }
    }
}
