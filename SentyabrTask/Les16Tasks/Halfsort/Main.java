package tasklar.SentyabrTask.Les16Tasks.Halfsort;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static tasklar.SentyabrTask.Les16Tasks.Halfsort.Halfsort.*;

public class Main {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("N ededi ucun bir eded daxil edin (minimum 100): ");


            if (!scan.hasNextInt()) {
                System.out.println("Xəta: Zəhmət olmasa yalnız tam ədəd daxil edin!\n");
                scan.nextLine(); // səhv tokeni təmizlə
                continue;
            }

            n = scan.nextInt();

            if (n < 100) {
                System.out.println("Xəta: N ən azı 100 olmalıdır! Yenidən cəhd edin.\n");
                continue;
            }
            break; // düzgün N alındı
        }


            int[] arr = new int[n];
            // random ədədlərlə doldursun
            for (int i = 0; i < n; i++) {
                arr[i] = ThreadLocalRandom.current().nextInt(-10000, 10001);
            }

            printArray(arr, "İlk massiv:");

            int mid = n / 2;
            quickSortAsc(arr, 0, mid - 1);
            quickSortDesc(arr, mid, n - 1);

            printArray(arr, "Yarı artan / yarı azalan massiv:");

            scan.close();
        }
    }

