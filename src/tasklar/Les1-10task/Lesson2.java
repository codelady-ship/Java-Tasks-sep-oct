/*
import java.util.Scanner;
*/
/*Task 1 - kinoteatr endirimi:
skaner (scanner) vasitəsilə istifadəçidən yaşını və tələbə olub-olmadığını soruşun.
Nəticə əsasında aşağıdakı şərtlərə uyğun teatr üçün biletin qiymətini ekrana çıxarın:
Əgər yaş 12-dən kiçikdirsə, bilet pulsuzdur ($0)
Əgər tələbədirsə və ya yaş 65-dən böyük və ya bərabərdirsə, 50% endirimli qiymət
Qalan bütün hallarda biletin tam qiyməti
Bir biletin standart qiyməti $10-dur.*//*

*/
/*skaner (scanner) vasitəsilə istifadəçidən yaşını və tələbə olub-olmadığını soruşun.
Nəticə əsasında aşağıdakı şərtlərə uyğun teatr üçün biletin qiymətini ekrana çıxarın:
Əgər yaş 12-dən kiçikdirsə, bilet pulsuzdur ($0)
Əgər tələbədirsə və ya yaş 65-dən böyük və ya bərabərdirsə, 50% endirimli qiymət
Qalan bütün hallarda biletin tam qiyməti
Bir biletin standart qiyməti $10-dur.*/
/*public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        System.out.print("Tələbəsiniz? (bəli/xeyr): ");
        String telebe = scanner.nextLine().toLowerCase();

        double qiymet = 10.0;

        if (yas < 12) {
            qiymet = 0.0;
        } else if (telebe.equals("bəli") || yas >= 65) {
            qiymet = qiymet * 0.5;
        }

        System.out.println("Biletin qiyməti: $" + qiymet);
    }
}
*//*

        */
/*Task 2 - Xəzinə oyunu:
İstifadəçi scanner vasitəsilə 1-100 aralığında ədəd daxil etməlidir (yoxlayın).
Əgər ədəd xəzinə kodu ilə eynidirsə, ekrana "xəzinə tapdınız!" yazısı çıxarılsın.
Əgər istifadəçinin daxil etdiyi ədəd xəzinə kodundan maksimum 5 vahid fərqlənirsə, ekrana "çox yaxın idin..." yazısı çıxsın.
Qalan bütün hallarda öz tərcihinizə uyğun istifadəçiyə səhv kod yazdığını göstərən yazını ekrana çıxarın.
Qeyd: xəzinənin düzgün kodunu variable ilə kodda saxlayın.*//*

*/
/*
public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xezineKodu = 42;

        System.out.print("1-100 aralığında bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        if (eded < 1 || eded > 100) {
            System.out.println("Yanlış aralıq! Zəhmət olmasa 1-100 arasında ədəd daxil edin.");
        } else if (eded == xezineKodu) {
            System.out.println("Xəzinə tapdınız!");
        } else if (Math.abs(eded - xezineKodu) <= 5) {
            System.out.println("Çox yaxın idin...");
        } else {
            System.out.println("Təəssüf, səhv kod daxil etdiniz.");
        }
    }
}
*//*


        */
/*Task 3 - İngilis rəqəm oyunu:
Oyunun şərti belədir:0dan baslasin
Verilən ədəd 15-ə bölünürsə, "fizzbuzz" deməlisən
Yalnız 5-ə bölünürsə, "buzz" deməlisən
Yalnız 3-ə bölünürsə, "fizz" deməlisən
Yuxarıdakı heç bir şərt ödənmədikdə, sadəcə ədədin özünü deməlisən
Proqram istifadəçidən ədəd istəməlidir və yuxarıdakı şərtlərə əsasən lazımi cavabı ekrana çıxarmalıdır.
Qeyd: ədədin 0-dan böyük olmasından əmin olun.*//*


*/
/*public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin (0-dan böyük): ");
        int eded = scanner.nextInt();

        if (eded <= 0) {
            System.out.println("Ədəd 0-dan böyük olmalıdır.");
        } else if (eded % 15 == 0) {
            System.out.println("fizzbuzz");
        } else if (eded % 5 == 0) {
            System.out.println("buzz");
        } else if (eded % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println(eded);
        }
    }
}*//*



        */
/*Task 4 - Pizza sifarişi terminalı:
İstifadəçidən pizza ölçüsünü, əlavə pendir olub-olmamasını, və əlavə acılı bibər olub-olmamasını soruşun (scanner ilə).
Aşağıdakı qiymətlərə əsasən sifarişin yekun qiymətini ekrana çıxarın:
S - $8
M - $10
L - $12
Əlavə pendir - $2
Əlavə acılı bibər - $1*//*

   */
/* public class Lesson2 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int price = 0;

                System.out.print("Pizza ölçüsünü daxil edin (S, M, L): ");
                char pizzaSize = scanner.next().charAt(0);

                switch(pizzaSize){
                    case 'L','l' ->price +=12;
                    case 'm','M'-> price +=10;
                    case 'S','s'-> price +=8;
                }
                System.out.print("Əlavə pendir istəyirsiniz? (bəli/xeyr): ");
                String pendir = scanner.nextLine().toLowerCase();

                if (pendir.equals("bəli")) {
                    price += 2;
                }

                System.out.print("Əlavə acılı bibər istəyirsiniz? (bəli/xeyr): ");
                String biber = scanner.nextLine().toLowerCase();
                if (biber.equals("bəli")) {
                    price += 1;
                }

                System.out.println("Sifarişinizin yekun qiyməti: $" + price);
            }
            }
*//*

*/
/*Task 5 - Sənin superhero:
İstifadəçidən rəng və heyvan adı istə (scanner ilə).
Əgər rəng qara, heyvan panther-dirsə, "Sən qara panther-sən!" yazısını ekrana çıxar
Yox, əgər rəng qırmızı, heyvan isə hörümçəkdirsə, "Sən Spider-man-sən!" yazısını ekrana çıxar
Qalan bütün hallarda, "Sən möhtəşəm {daxil edilmiş rəng} {daxil edilmiş heyvanın adı} ola bilərsən!" yazısını ekrana çıxar
Qeyd: axırıncı şərtdə rəng və heyvan adı olan hissə istifadəçinin daxil etdiyi olmalıdır.*//*


public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir rəng daxil edin: ");
        String reng = scanner.nextLine().toLowerCase();

        System.out.print("Bir heyvan adı daxil edin: ");
        String heyvan = scanner.nextLine().toLowerCase();

        if (reng.equals("qara") && heyvan.equals("panther")) {
            System.out.println("Sən Qara Panther-sən!");
        } else if (reng.equals("qırmızı") && heyvan.equals("hörümçək")) {
            System.out.println("Sən Spider-man-sən!");
        } else {
            System.out.println("Sən möhtəşəm " + reng + " " + heyvan + " ola bilərsən!");
        }
    }
}
*/
