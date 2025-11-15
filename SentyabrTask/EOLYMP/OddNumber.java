package tasklar.SentyabrTask.EOLYMP;

import java.util.Scanner;

public class OddNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0 || (n > 0 && n >= 100 && n <= 999)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
