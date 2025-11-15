package tasklar.SentyabrTask.EOLYMP;
import java.util.Scanner;

public class SmallestNotDivisibleBy2_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int next = n + 1;
        while (true) {
            if (next % 2 != 0 && next % 3 != 0 && next % 5 != 0) {
                System.out.println(next);
                break;
            }
            next++;
        }
    }
}
