package tasklar.SentyabrTask.EOLYMP;

import java.util.Scanner;

public class FindRightNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long lastDigit = n % 10;    // təklik mərtəbəsi
        System.out.println(lastDigit);
    }
}
