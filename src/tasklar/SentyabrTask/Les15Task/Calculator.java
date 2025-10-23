package tasklar.SentyabrTask.Les15Task;

/*
Istifadəçidən iki ədəd və (+, -, *, /) simvollarından birini alın.
Müvafiq əməliyyatı iki ədəd üzrə yerinə yetirən
proqram yazın (0-a bölməni nəzərə alın, əgər bölən 0 olarsa,
müvafiq xəta mesajını ekrana çıxarın).
2. İstifadəçi ədəd əvəzinə başqa məlumat daxil etdiyi ssenarini nəzərə alın.
Əlavə olaraq, 0-a bölməni də nəzərə alın.
Əgər bölən 0 olarsa, müvafiq xətanı aradan qaldırın.
*/
import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double eded1 = 0;
        double eded2 = 0;
        String operator;

        try {
            System.out.println("1ci ededi daxil edin: ");
            eded1 = Double.parseDouble(sc.nextLine());
            System.out.println("Hesablama operatoru daxil edin -> (*,/,+,-) ");
            operator = sc.nextLine().trim();

            if(!operator.equals("*") && !operator.equals("+") && !operator.equals("-") && !operator.equals("/")) {
                System.out.println("Xeta: Yanliz '+', '-', '*', '/' əməliyyatları qəbul edilir.");
                return;
            }

            System.out.print("İkinci ədədi daxil edin: ");
            eded2 = Double.parseDouble(sc.nextLine());

            if (operator.equals("/") && eded2 == 0) {
                System.out.println("Xeta: 0-a bölmek olmaz.");
                return;
            }

            double netice =0;
            switch (operator) {
                case "+" -> netice = eded1 + eded2;
                case "-" -> netice = eded1 - eded2;
                case "*" -> netice = eded1 * eded2;
                case "/" -> netice = eded1 / eded2;
            }
            System.out.println("Netice: " + netice);

        }catch (NumberFormatException e) {
            System.out.println("Xeta: Sadece ededler daxil edin.");
        }
    }
}

