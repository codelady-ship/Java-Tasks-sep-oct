package tasklar;

import java.util.Scanner;

public class MonthDayTask4 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ayın nece gun oldugunu göstərmək üçün 1-12 arası bir rəqəm daxil edin: ");
        int month = sc.nextInt();

        String result = switch (month) {
            case 1 -> "Yanvar - 31 gün";
            case 2 -> "Fevral - 28 gün";
            case 3 -> "Mart - 31 gün";
            case 4 -> "Aprel - 30 gün";
            case 5 -> "May - 31 gün";
            case 6 -> "İyun - 30 gün";
            case 7 -> "İyul - 31 gün";
            case 8 -> "Avqust - 31 gün";
            case 9 -> "Sentyabr - 30 gün";
            case 10 -> "Oktyabr - 31 gün";
            case 11 -> "Noyabr - 30 gün";
            case 12 -> "Dekabr - 31 gün";
            default -> "Yanlış giriş! Zəhmət olmasa 1 ilə 12 arasında bir rəqəm daxil edin.";
        };

        System.out.println(result);
    }
}
