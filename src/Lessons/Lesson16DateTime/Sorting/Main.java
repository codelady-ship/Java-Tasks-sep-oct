package Lessons.Lesson16DateTime.Sorting;

import java.util.Arrays;

public class Main {
    static void main() {
        int [] mas = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] newMas = Arrays.copyOf(mas,15);
        newMas[14]= 25;
        System.out.println(Arrays.toString(newMas));
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 25] olacaq
        //int evezine string yazsaq [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null,null, 25]
        //Arrays.(newMas)-hash verecek

        //linear search -0ci indekse beraber edib yoxlamaq bildyimiz
        //binary search -arrayi sort edir.yariya bolub arrayi pivot secir.
        // verilen ededi o pivotla muqaise edir
        // her defe o muqaiseden < dirse evveli atir.yene pivot secib muqaise edir.
        Arrays.sort(newMas);
        int index= Arrays.binarySearch(newMas,10);
        System.out.println(index);


        //max /min tapmaq arrayda-sort edirik
        //buble sort-
        //bir array uzr den 2 defe gedirik.
        //selection sort -en boyuk en kiciyi tapir swapla, kiciyi sola boyuyu saga atir digerleri araya forla yerlesdrir
        //quick sort -pivot teyin edir her defe yeni pivotlar secib onla yerde qslsni muqsaise edir.

    }
}
