package tasklar.SentyabrTask.EOLYMP;

import java.util.Scanner;

public class NextDivisibleBy7 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int next = n+1;
       while (next % 7 != 0) {
           next++;
       }
       System.out.println(next);
    }
}
