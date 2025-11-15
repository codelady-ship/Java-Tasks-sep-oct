package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class VowelsDoubling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();

        String vowels = "aeiouy";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c);
            if (vowels.indexOf(c) != -1) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
