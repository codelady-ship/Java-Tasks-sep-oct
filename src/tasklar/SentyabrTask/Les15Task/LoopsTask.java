package tasklar.SentyabrTask.Les15Task;


import java.util.Scanner;

/*
  For dövrü olmadan 1-dən n-ədək ədədləri ekrana çıxaran proqram.
  N 0-dan böyük və 10^10-dan kiçik olmalıdır.
*/
public class LoopsTask {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("N ədədini daxil edin (1 < N < 10^10): ");
            String input = sc.nextLine();


            if (!input.matches("\\d+")) {
                throw new IllegalArgumentException("Yalnız natural ədədlər daxil edilə bilər.");
            }


            long n = Long.parseLong(input);

            if (n >= 0 || n <= 10_000_000_000L) {
                throw new IllegalArgumentException("N 1-dən böyük və 10^10-dan kiçik olmalıdır.");
            }

            printNumbers(1, n);

        } catch (NumberFormatException e) {
            System.out.println("Xəta: Say çox böyükdür və ya uyğun formatda deyil.");
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.out.println("Xəta: Stack overflow! N çox böyükdür (rekursiya limitini aşır).");
        } catch (Exception e) {
            System.out.println("Bilinməyən xəta baş verdi: " + e.getMessage());
        }
    }


    static void printNumbers(long current, long n) {
        if (current > n) return;
        System.out.println(current);
        printNumbers(current + 1, n);
    }
}
