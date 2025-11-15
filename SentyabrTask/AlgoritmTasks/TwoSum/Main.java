package tasklar.SentyabrTask.AlgoritmTasks.TwoSum;

import java.util.Scanner;
import static tasklar.SentyabrTask.AlgoritmTasks.TwoSum.TwoSum.twoSum;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for arr size: ");
        int arrsize = sc.nextInt();
        System.out.println("enter number as target: ");
        int target = sc.nextInt();

        int[] arr = new int[arrsize];

        for (int i = 0; i < arrsize; i++) {
            System.out.println("enter number for arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        twoSum(arr, target);

    }
}
