package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class IndexesOfLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         boolean found = false;
         for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) == 'a'){
                 System.out.println(i+ ",");
                 found = true;
             }
             if (!found) {
                 System.out.println(-1);
             }
         }
    }
}
