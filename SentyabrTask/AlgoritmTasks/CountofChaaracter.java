package tasklar.SentyabrTask.AlgoritmTasks;

import java.util.*;

public class CountofChaaracter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + "\" - " + entry.getValue());
        }
    }
}
