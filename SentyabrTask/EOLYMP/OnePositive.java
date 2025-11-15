package tasklar.SentyabrTask.EOLYMP;

import java.util.Scanner;

public class OnePositive {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         boolean hasPositive = (a>0 || b >0 || c>0);
         boolean hasNegative = (a<0 || b<0 || c<0);
         System.out.println((hasPositive && hasNegative) ? "YES" : "NO");
    }
}

