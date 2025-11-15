package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of the I array: ");
        int size1 = scan.nextInt();
        List <Integer>list1 = new ArrayList<>();
        System.out.println("enter the elements of I array: ");
        for (int i = 0; i < size1; i++) {
            list1.add(scan.nextInt());
        }

        System.out.println("enter the size of the II array: ");
        int size2 = scan.nextInt();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("enter the elements of II array: ");
        for (int i = 0; i < size2; i++) {
            list2.add(scan.nextInt());
        }

        //intersection
        List <Integer>intersection = new ArrayList<>();
        for(int a : list1){
            for (int b : list2) {
                if (a == b && !intersection.contains(a)) {
                    intersection.add(a);
                }
            }
        }
        System.out.println("intersection" + intersection);





    }
}
