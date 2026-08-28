import java.util.Scanner;

public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num <= 1) {
            System.out.println(num + " is neither Prime nor Composite");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is Composite");
            }
        }

        sc.close();
    }
}
