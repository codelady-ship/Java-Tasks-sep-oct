package tasklar;

import java.util.Scanner;

public class NumbersTask5 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = sc.nextInt();

        int reqemSayi = 0;
        int sifirSayi = 0;
        int myNumber = number;

        // mənfidirsə, müsbətə çevir
        if (number < 0) {
            number = -number;
        }

        if (number == 0) {
            reqemSayi = 1;
            sifirSayi = 1;
        } else {
            while (number > 0) {
                int digit = number % 10; //sonuncu rəqəmi alir
                if (digit == 0) {
                    sifirSayi++;
                }
                reqemSayi ++;
                number /= 10;//sonuncu rəqəmi silir.
            }
        }

        System.out.println("Daxil etdiyiniz ədəd: " +  myNumber);
        System.out.println("Rəqəmlərin sayı: " + reqemSayi );
        System.out.println("Sıfırların sayı: " + sifirSayi);
    }
}
