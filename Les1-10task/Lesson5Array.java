/*public class Lesson5Array {
    public static void main(String[] args) {
        int[] numbers ;//define
        numbers =new int[1];//instantiation
        numbers [0]=9;//instalization
        int len =numbers.length;


    }
}*//*


import java.util.Scanner;
//Task 1:İstifadəçidən N ədədi istəyin və həmin uzunluqda massiv yaradın.
// Sonra istifadəçidən N sayda ədəd istəyin və bu ədədləri array-a əlavə edin.
*/
/*
public class Lesson5Array {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("add number for massive lenght:");
        int massiveLenght = sc.nextInt();

        int[] massiveArrays = new int[massiveLenght];//arrayimiz-lenghtle
        for (int i = 0; i < massiveLenght; i++) {
            System.out.print("Enter number for position " + i + ": ");
            massiveArrays[i] = sc.nextInt();
        }

        System.out.println("Your array:");
        for (int array : massiveArrays) {
            System.out.print(array + ",");
        }
        //Task 2:Task 1-də yaradılmış massiv içində ən kiçik və ən böyük ədədi tapın.
        int min = massiveArrays[0];
        int max = massiveArrays[0];

        // Massivdekileri yoxlasin.mes 345 den yeni reqemi kicik ve boyukle muqaise edecik, ki mes 2 <3 ve ya 6>5 kimi
        for (int i = 1; i < massiveLenght; i++) {
            if (massiveArrays[i] < min) {
                min = massiveArrays[i];
            }
            if (massiveArrays[i] > max) {
                max = massiveArrays[i];
            }
        }
        // 2cinin neticesi
        System.out.println("\n Massivdəki ən kiçik ədəd: " + min);
        System.out.println("Massivdəki ən böyük ədəd: " + max);

        //Task 3:Task 1-də yaradılmış massivdə ən çox təkrarlanan ədədi və onun neçə dəfə təkrarlandığını tapın.
        int mostRepeated = massiveArrays[0];
        int maxCount = 0;

        for (int i = 0; i < massiveLenght; i++) {
            int count = 0;
            for (int j = 0; j < massiveLenght; j++) {
                if (massiveArrays[i] == massiveArrays[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostRepeated = massiveArrays[i];
            }
        }

        // Sadəcə 1 dəfə çap olunur
        System.out.println("Massivdə ən çox təkrarlanan ədəd: " + mostRepeated);
        System.out.println("Bu ədədin təkrar sayı: " + maxCount);

        //Task 4:Task 1-də yaradılmış massivi ədədlərin artmasına görə sıralayın (bubble sort alqoritmini araşdırmalı ola bilərsiniz).
        //bilmedim*




    }
}
*//*


//Task 5:İstifadəçidən 50-dən böyük olmayan və 1-dən kiçik olmayan N ədədi alın və
// (2, 4 fibonacci) ardıcıllığının 3-cü elementindən başlayaraq  ümumi cəmini göstərən N uzunluqda massiv yaradın.
*/
/*Nümunə: N = 5
       {6, 16, 32, 58, 100}
       {6. 10. 16. 26. 42}
 *//*

import java.util.Scanner;

public class Lesson5Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // N alma və şərtə uyğunluğunu yoxlama
        do {
            System.out.print("1 ilə 50 arasında N daxil edin: ");
            N = sc.nextInt();
        } while (N < 1 || N > 50);

        // Fibonacci-oxşar ardıcıllıq üçün ilk iki ədəd
        int a = 2;
        int b = 4;

        int[] fibo = new int[N];         // nəticə massivi
        int[] seq = new int[N + 2];      // tam ardıcıllıq (2 və 4 də daxil)
        seq[0] = a;
        seq[1] = b;

        for (int i = 2; i < N + 2; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

        // 3-cü elementdən başlayaraq yığılmış cəmlər
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += seq[i + 2];   // seq[2] = 6, seq[3] = 10, ...
            fibo[i] = sum;
        }

        // Nəticəni çap et
        System.out.print("Nəticə massiv: ");
        for (int num : fibo) {
            System.out.print(num + " ");
        }
    }
}
*/
