package tasklar;

import java.util.Scanner;

public class WeekdayTask3 {
    public static void work() {
     Scanner sc= new Scanner(System.in);
        System.out.println("həftənin gununu gostərmək ücün 1-7 arasi bir reqem daxil edin: ");
        int day = sc.nextInt();

        String result = switch(day) {
            case 1 -> "Bazar ertəsi";
            case 2 -> "Çərşənbə axşamı";
            case 3 -> "Çərşənbə";
            case 4 -> "Cümə axşamı";
            case 5 -> "Cümə";
            case 6 -> "Şənbə";
            case 7 -> "Bazar";
            default->"Yanlış giriş! Zəhmət olmasa 1 ilə 7 arasında bir ədəd daxil edin.";
        };
        System.out.println(result);
    }
}
