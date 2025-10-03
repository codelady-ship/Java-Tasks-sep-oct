package tasklar;

import java.util.Scanner;

        public class MonthTask6  {
            public void run() {
                Scanner sc = new Scanner(System.in);
                System.out.print("İl daxil edin (məsələn 2026): ");
                int inputYear = sc.nextInt();
                System.out.print("Ay daxil edin (1-12): ");
                int inputMonth = sc.nextInt();

                // Cari tarix (Avqust 2025)
                int currentYear = 2025,currentMonth = 8;

                // umumi ay ferqi =İl fərqine gore nece ay var + ay ferqi -1(indiki ay nəzərə alınmasın deyə)
                int totalMonth = (inputYear - currentYear) * 12 + (inputMonth - currentMonth) - 1;

                if (totalMonth > 0) {
                    System.out.println("Gələcək tarixə " + totalMonth + " ay qalıb.");
                } else if (totalMonth < 0) {
                    System.out.println("Bu tarix " + (-1 * totalMonth) + " ay əvvəl olub.");
                } else {
                    System.out.println("Daxil etdiyiniz tarix növbəti aydır.");
                }
            }
        }

