package tasklar.SentyabrTask.Les16Tasks.Halfsort;

import java.util.Scanner;

/*N ədədini user-dən istəyin (minimum 100 daxil olunmalıdır).

Bu uzunluqda array yaradın və içini -10000 və 10000 aralığında təsadüfi ədədlərlə doldurun.
Yaratdığınız array-i ekrana çıxarın.
O array-ın ilk n/2 ədədini artan sıra, qalan bütün ədədlərini azalan sıra ilə düzün.
Array-ı yenidən ekrana çıxarın.

Qeyd: sorting üçün quick sort istifadə edin.*/
public class Halfsort {
    // Quick-artan
    static void quickSortAsc(int[] a, int left, int right) {
        if (left >= right) return;
        int i = left, j = right;
        int pivot = a[left + (right - left) / 2];
        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;
            if (i <= j) {
                int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                i++; j--;
            }
        }
        if (left < j) quickSortAsc(a, left, j);
        if (i < right) quickSortAsc(a, i, right);
    }

    // Quick-azalan
    static void quickSortDesc(int[] a, int left, int right) {
        if (left >= right) return;
        int i = left, j = right;
        int pivot = a[left + (right - left) / 2];
        while (i <= j) {
            while (a[i] > pivot) i++;
            while (a[j] < pivot) j--;
            if (i <= j) {
                int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
                i++; j--;
            }
        }
        if (left < j) quickSortDesc(a, left, j);
        if (i < right) quickSortDesc(a, i, right);
    }

    static void printArray(int[] a, String title) {
        System.out.println(title);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }
}
