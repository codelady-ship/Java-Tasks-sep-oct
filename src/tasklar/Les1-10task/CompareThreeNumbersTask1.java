package tasklar;

import java.util.Scanner;

public class CompareThreeNumbersTask1 {
    public void run() {
        Scanner scan = new Scanner(System.in);

        System.out.print("I ədədi daxil edin: ");
        int a = scan.nextInt();
        System.out.print("II ədədi daxil edin: ");
        int b = scan.nextInt();
        System.out.print("III ədədi daxil edin: ");
        int c = scan.nextInt();

        if (a == b && b == c) {
            System.out.println("ədədlər bərabərdir: " + a);
        } else if (a == b && a != c) {
            System.out.println((a > c) ? a + "=" + b + ">" + c : c + ">" + a + "=" + b);
        } else if (b == c && b != a) {
            System.out.println((b > a) ? b + "=" + c + ">" + a : a + ">" + b + "=" + c);
        } else if (a == c && a != b) {
            System.out.println((a > b) ? a + "=" + c + ">" + b : b + ">" + a + "=" + c);
        } else {
            if (a > b && b > c) System.out.println(a + ">" + b + ">" + c);
            else if (a > c && c > b) System.out.println(a + ">" + c + ">" + b);
            else if (b > a && a > c) System.out.println(b + ">" + a + ">" + c);
            else if (b > c && c > a) System.out.println(b + ">" + c + ">" + a);
            else if (c > a && a > b) System.out.println(c + ">" + a + ">" + b);
            else if (c > b && b > a) System.out.println(c + ">" + b + ">" + a);
        }
    }
}
