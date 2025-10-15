package tasklar.SentyabrTask.EOLYMP;
import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number which last one will be 0");
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            sum += n;
        }

        System.out.println(sum);
    }
}
