package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class IndexesOfSpaces {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("Please enter a string");
        } else {
            int firstSpace = str.indexOf(' ');
            int lastSpace = str.lastIndexOf(' ');

            if (firstSpace == -1) {
                System.out.println(-1);
            } else {
                System.out.println(firstSpace + " " + lastSpace);
            }
        }
    }
}
