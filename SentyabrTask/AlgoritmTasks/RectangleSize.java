package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class RectangleSize {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle: ");
        int a = sc.nextInt();
        System.out.println("Please enter the height of the rectangle: ");
        int b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
