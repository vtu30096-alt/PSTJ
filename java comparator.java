import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            players[i] = new Player(name, score);
        }

        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player a, Player b) {
                return Integer.compare(b.score, a.score);
            }
        });

        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }

        sc.close();
    }
}
