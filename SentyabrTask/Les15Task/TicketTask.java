package tasklar.SentyabrTask.Les15Task;
import java.util.Scanner;

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
