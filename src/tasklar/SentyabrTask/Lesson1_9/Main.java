package tasklar.SentyabrTask.Lesson1_9;

import java.util.Scanner;


//-----------------------------------------------------------------------
// 8. 6-dakı aldığınız String-in hər bir sözünü tərsinə çevirin.
// Nümunə: "Java is fun!"; Nəticə: "avaJ si !nuf"
//----------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
            System.out.println("salam " + name);
        } else {
            System.out.println("salam Human");
        }

        /* task2 */
        turn(args);

        //task3
        /*Task3 task3 = new Task3();
        task3.calculate();*/

        //task4
        System.out.println("Ədədi orta: " + Task4.avarageGrade());
        System.out.println("Ən yüksək qiymətə malik tələbə: " + Task4.getTopStudent().name + ", onun balı: " + Task4.getTopStudent().grade);

        //task5

    }
    //task2
    public static void turn(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = a % 2 == 0 ? "true" : "false";
        System.out.println(b);
    }
    //task6
}
