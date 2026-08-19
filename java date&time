import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY",
            "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };

        System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
