package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class DeleteALetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                String result = str.replace("a", "");
                System.out.println(result);
            }
        }
    }
}