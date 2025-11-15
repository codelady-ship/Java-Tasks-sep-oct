package tasklar.SentyabrTask.EOLYMP;

import java.util.Scanner;

public class CountOfNegatives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int count = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            if(n<0) {
                count++;
            }
        }

        System.out.println("Negative numbers count is " +count);
    }
}
