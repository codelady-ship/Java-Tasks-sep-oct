package tasklar.SentyabrTask.Les15Task;

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

