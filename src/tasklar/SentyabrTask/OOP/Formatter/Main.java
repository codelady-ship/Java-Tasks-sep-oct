package tasklar.SentyabrTask.OOP.Formatter;
/*Polimorphysm
Task 1 - Yazı formatlayıcı:
1.1. Formatter adlı class yaradın.
1.2. Onun format adlı String götürən və String qaytaran method-u olmalıdır.
1.3. Aşağıdakı class-ları yaradın:
UpperCaseFormatter
LowerCaseFormatter
CamelCaseFormatter
1.4. Bu class-lar Formatter class-ından törəməlidir.
1.5. Hər bir class-da format method-u String-i fərqli formada formatlamalıdır
(class-ların adlarına uyğun formada).
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Format ucun bir string daxil edin: ");
        String str = sc.nextLine();

        Formatter upper = new UpperCaseFormatter();
        Formatter lower = new LowerCaseFormatter();
        Formatter camel = new CamelCaseFormatter();

        System.out.println("UpperCase: " + upper.format(str));
        System.out.println("LowerCase: " + lower.format(str));
        System.out.println("CamelCase: " + camel.format(str));
    }
}
