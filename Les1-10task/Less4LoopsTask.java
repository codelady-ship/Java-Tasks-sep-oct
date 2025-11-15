/*Task 1:İstifadəçidən ədəd alın.
0-dan başlayaraq həmin ədədədək hər bir ədəd üçün aşağıdakı qaydanı
tətbiq edin.
Əgər ədəd 3, 5, 15-dən yalnız 3-ə bölünürsə, ekrana "fizz" yazısı çıxsın.
Əgər ədəd 3, 5, 15-dən yalnız 5-ə bölünürsə, ekrana "buzz" yazısı çıxsın.
Əgər ədəd 15-ə bölünürsə, ekrana "fizzbuzz" yazısı çıxsın.
Qalan bütün hallarda ədədin özü ekrana çıxsın.*/

/*public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ədəd daxil edin: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 15 == 0 && i != 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}*/
/* Task 2:İstifadəçidən ədəd alın.
O ədədin faktorialını hesablayın.
Ədəd 0-dan böyük olmalıdır.*/
     /*  public class Less4LoopsTask {
           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               System.out.print("Bir eded daxil edin: ");
               int number = scanner.nextInt();
               int total=1;
               for (int i = 1; i < number; i++) {
                   total *= i;
               }
               System.out.println(number + "! = " + total );
           }
       }
*/

/*Task 3:Domino daşlarını aşağıdakı formada ekrana çıxaran proqram yazın (boşu 0 kimi nəzərə alın):
        0x0 0x1 0x2 0x3 0x4 0x5 0x6
        1x1 1x2 1x3 1x4 1x5 1x6
Qeyd, həlldə iç-içə dövrdən (nested loop) istifadə olunmalıdır.*/
       /* public class Less4LoopsTask {
            public static void main(String[] args) {
                for (int i = 0; i <= 6; i++) {
                    for (int j = i; j <= 6; j++) {
                        System.out.print(i + "x" + j + " " +"\n");
                    }
                }
            }
        }
*/
/*Task 4:
İstifadəçidən 0-dan böyük ədəd istəyin və o ədəddən 0-adək (daxil olmaqla) geri sayım edin.*/
   /*public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("0-dan böyük bir ədəd daxil edin: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = number; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Zəhmət olmasa 0-dan böyük bir ədəd daxil edin.");
        }
    }}*/
/*Task 5 - (sandıq kilidi oyunu, çətin):
Sandıq açarı 4 rəqəmli ədəd (kodda əllə təyin edin).
İstifadəçi üçün bu kodu tapmağa menyu ilə imkan verin.

Menyu aşağıdakı kimi olmalıdır:
Daxil etdiyiniz kod: (bu hissəyə istifadəçi rəqəmləri seçdikcə yeni rəqəm düşəcək).
Hazırki rəqəm: 1 (növbəti rəqəmi yığmağa keçdikdə bu ədəd bir vahid artmalıdır, 4 rəqəm var deyə bu ədəd 4-ə kimi (daxil olmaqla) getməlidir).
Aşağıdakılardan birinə basın:
1 (artır) - (seçilən ədədin bir vahid artırılması yerinə yetirilməlidir. Əgər ədəd 9-a bərabərdirsə, 0 ilə əvəzlənməlidir)
2 (azalt) - (seçilən ədədin bir vahid azaldılması yerinə yetirilməlidir. Əgər ədəd 0-a bərabərdirsə, 9 ilə əvəzlənməlidir)
3 (növbəti rəqəmə keç) - (sıradakı növbəti rəqəmi dəyişdirməyə keçməlidir proqram, əgər son (4-cü) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
4 (öncəki rəqəmə keç) - (sıradakı öncəki rəqəmi dəyişdirməyə keçməlidir proqram, əgər ilk (1-ci) rəqəmdə idisə, ekrana müvafiq xəta mesajı çıxmalıdır və heç bir dəyişiklik baş verməməlidir)
0 (kodu yoxla) - İstifadçi tərəfindən seçilmiş rəqəmlərin yaratdığı ədədi kodla müqayisə etməlidir proqram və düzdürsə, uğur mesajı ekrana çıxmalıdır. Səhvdirsə, xəta mesajı çıxmalıdır və proqram sonlanmalıdır.
Proqramın işləmə nümunəsi üçün aşağıdakı videonu izləyə bilərsiniz.*/
/*
public class Less4LoopsTask {
    public static void main(String[] args) {
        int myCode = 1234;

    }
}*/

/*task 1:
Palindrom ədədin yoxlanması
Ədəd və onun görünüş baxımdan tərsi eynidirsə,
bu ədəd palindrom ədəddir.
Ədədi istifadəçi int formasında daxil etməlidir.*/
/*
public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədədi daxil edin: ");
        int eded = scanner.nextInt();

        int original = eded; //Əvvəlki yadda saxlanır
        int ters = 0;

        //Ədədi tərsinə çeviririk
        while (eded != 0) {
            int sonReqem = ters * 10 + eded % 10;
            eded = eded / 10;
        }
        //palindrom serti
        if (original == ters) {
            System.out.println(original + " palindrom ədəddir.");
        } else {
            System.out.println(original + " palindrom ədəd deyil.");
        }
        scanner.close();
    }
}
*/
/*public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədədi daxil edin: ");
        int eded = scanner.nextInt();
        String reversed = "";
        for (char charnumber :StringNuber.charAt() )
    }
}*/














/*Task 2:
İstifadəçi tərəfindən ədəd daxil olunur.
Bu ədədin hansısa ədədin tam kvadratı olub-olmadığını yoxlayın.*/
/*
public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir ədəd daxil edin: ");
        int eded = sc.nextInt();

        for (int i = 1; i * i <= eded; i++) {
            if (i * i == eded) {
                System.out.println("Bu " + i + "-in kvadratıdır.");
                return;
            }
        }
        System.out.println("Bu heç bir ədədin kvadratı deyil.");
        sc.close();
    }
}
*/

/*Task 3:
Pilləkən formasında ulduzlardan ibarət yazı çap edin.
        Məsələn, istifadəçi 5 ədədini daxil edirsə, cavab belə olmalıdır.
        *
        **
        ***
        ****
 */
/*public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilləkən üçün bir ədəd daxil edin: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // sətirlər
            for (int j = 1; j <= i; j++) {// her sətir -ulduz sayı
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
*/
/*Task 4:
Task 3-ün şam ağacı formasında çapı
Məsələn, 5 daxil olunursa, cavab belə olmalıdır:
         *
        ***
        *****
 */
/*public class Less4LoopsTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Şam ağacının hündürlüyünü ucun tek eded daxil edin: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Boşluqları çap et
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }*/
/*Task 5:
İki ədəd istifadəçi tərəfindən daxil olunur.
Bu ədədlərin ƏBOB-unu tapan proqram yazın.*/