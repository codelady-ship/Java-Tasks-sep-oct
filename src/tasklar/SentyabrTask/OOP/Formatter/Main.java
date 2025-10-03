package tasklar.SentyabrTask.OOP.Formatter;

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
