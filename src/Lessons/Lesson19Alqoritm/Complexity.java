package Lessons.Lesson19Alqoritm;
//complexity-
//Time complexity-BigO(n)=>big-o-notation.
//Space complexity-BigO(1)-yaxsidr-metod cal-lar stackda yigilir.nece defe yigilmasi
//BigO(log n)-yaxsidr
public class Complexity {
    static void main() {
        int[] arr = new int[]{1, 2, 3, 4, 2, 5, 4};//1

        for (int i = 0; i < arr.length; i++) { //1
            System.out.println(arr[i]);//n
        }
        printArr(1);

    }
    //1+1+n+1 = n+3 - reqemi sildi BigO(n)


    // Time Comp-BigO(1)
    // Space Comp -BigO(n)-en yaxsi

     public static void printArr(int element){
            System.out.println(element);//1
            element++;//1
            if(element >10){//1
                return;//
            }
            printArr(element);//1
     }
   //ic-ice for olanda bir birne vururuq n*n=n^2
   // log10 1000 =3
//Alqortmleri Worst keys-en pis halla yoxlayirlar
    }

