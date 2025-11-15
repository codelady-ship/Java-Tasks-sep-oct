package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.Scanner;

public class FirstUniqueCharacter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(firstUniqChar(str));
        }

        public static int firstUniqChar(String str) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (str.indexOf(c) == str.lastIndexOf(c)) {
                    return i;
                }
            }
            return -1;
        }
}
