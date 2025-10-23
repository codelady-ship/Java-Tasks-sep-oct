package tasklar.SentyabrTask.Les15Task;
import java.util.Scanner;
/*Ticket Task-
skaner (scanner) vasitəsilə istifadəçidən yaşını və tələbə olub-olmadığını soruşun.
Nəticə əsasında aşağıdakı şərtlərə uyğun teatr üçün biletin qiymətini ekrana çıxarın:
Əgər yaş 12-dən kiçikdirsə, bilet pulsuzdur ($0)
Əgər tələbədirsə və ya yaş 65-dən böyük və ya bərabərdirsə, 50% endirimli qiymət
Qalan bütün hallarda biletin tam qiyməti
Bir biletin standart qiyməti $10-dur.

1. Yuxarıdakı task-da istifadəçi yaş yerinə tam ədəddən başqa bir məlumat daxil edərsə
 və ya tələbə olub-olmamasını göstərən true/false əvəzinə başqa məlumat tipi daxil
 edən ssenarini nəzərə alın. Çıxa biləcək xətaları aradan qaldırın və istifadəçiyə
 məlumatı səhv formada daxil etdiyini göstərin.*/
public class TicketTask {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int yas = -1;
            String telebe = "";
            double qiymet = 10.0;

            // Yaş
            try{
                System.out.print("Yaşınızı daxil edin: ");
                yas = Integer.parseInt(scanner.nextLine());//string->int
            } catch (NumberFormatException e) {
                return;//dayandiririq
            }
            if (yas<0){
                throw new IllegalArgumentException("yas menfi ola bilmez");
            }
            // Tələbə
            try{
                System.out.print("Tələbəsiniz? (beli/xeyr): ");
                telebe = scanner.nextLine();
               if(!telebe.equals("beli") && !telebe.equals("xeyr")){
                throw new IllegalArgumentException("Yalnız 'beli' və ya 'xeyr' daxil edə bilərsiniz.");
               }
            } catch (Exception e) {
                System.out.println("Xəta: " + e.getMessage());
                return;
            }

            //qiymet
            if (yas < 12) {
                qiymet = 0.0;
            } else if (telebe.equals("beli") || yas >= 65) {
                    qiymet = qiymet * 0.5;
            }
            System.out.println("Biletin qiyməti: $" + qiymet);
        }
    }
