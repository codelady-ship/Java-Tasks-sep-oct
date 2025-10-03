package tasklar.SentyabrTask.Lesson1_9;
// 3. İstifadəçidən iki ədəd və (+, -, *, /) simvollarından
// birini alın. Müvafiq əməliyyatı iki ədəd üzrə yerinə yetirən
// proqram yazın (0-a bölməni nəzərə alın, əgər bölən 0 olarsa,
// müvafiq xəta mesajını ekrana çıxarın).
import java.util.Scanner;

public class Task3 {
    public void calculate(){
      Scanner input = new Scanner(System.in);
      System.out.println("1 eded daxil edin: ");
      int a =input.nextInt();

      System.out.println("2 eded daxil edin: ");
      int b =input.nextInt();

      System.out.println("operatorlardan 1-ni daxil edin (+, -, *, /): ");
      char c = input.next().charAt(0);

      int d; //cavab
        switch (c) {
            case '+'-> {
                d = a + b;
                System.out.println( "Netice "+ d);
            }
            case '-'-> {
                d = a - b;
                System.out.println( "Netice "+ d);
            }
            case '*'-> {
                    d = a * b ;
                    System.out.println( "Netice "+ d);
            }
            case '/' -> {
                if (b == 0) {
                    System.out.println("Xəta: 0-a bölmək olmaz!");
                    d=0;
                } else {
                    d = a / b;
                    System.out.println("Netice: " + d);
                }
            }
            default -> System.out.println("Xəta: Yanlış operator daxil etdiniz.");
        }
   }
}
