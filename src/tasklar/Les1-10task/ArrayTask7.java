package tasklar;

import java.util.Scanner;

//5 təsadüfi (özünüz yazın) təsadüfi ədəddən ibarət massiv yaradın.
// Bu massivdəki ədədlərin cəmini ekrana çıxarın.
// Bu massivdəki ədədlərin hasilini ekrana çıxarın.
// Əgər massivdə 0 varsa, onu 7.3-dəki vurmada istifadə etməyin.
// 7.1-dəki massivdə olan ən böyük və ən kiçik ədədlərin fərqi və cəminin hasilini tapın.
public class ArrayTask7 {


    public void run() {
        Scanner scan = new Scanner(System.in);

        System.out.print("I ədədi daxil edin: ");
        int a = scan.nextInt();
        System.out.print("II ədədi daxil edin: ");
        int b = scan.nextInt();
        System.out.print("III ədədi daxil edin: ");
        int c = scan.nextInt();
        System.out.println("IV ədədi daxil edin: ");
        int d = scan.nextInt();
        System.out.println("V ədədi daxil edin: ");
        int e = scan.nextInt();

        // Massiv
        int[] array = {a, b, c, d, e};
        int cem = 0;
        int hasil =1;
        boolean hasZero = false;
        int min = array[0];
        int max = array[0];
        // Dövr: cəmi, hasil, min/max
        for (int n : array) {
            cem += n;

            if (n != 0) {
                hasil *= n;
            } else {
                hasZero = true;
            }

            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Massivin cəmi: " + cem);
        if (hasZero) {
            System.out.println("Massivdə 0 var, vurmada nəzərə alınmadı.");
        }
        System.out.println("Massivin hasili: " + hasil);

        //7.5
        int ferqMaxveMin = max - min;
        int cemMaxveMin = max + min;
        int ferqVəCeminHasili = ferqMaxveMin * cemMaxveMin;
        System.out.println("Ən böyük və ən kiçik ədədin fərqi: " + ferqMaxveMin);
        System.out.println("Ən böyük və ən kiçik ədədin cəmi: " + cem);
        System.out.println("Fərq ilə cəmin hasil: " + ferqVəCeminHasili);
    }
}