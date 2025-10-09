package tasklar.SentyabrTask.Lesson10task.CompressTask;

import java.util.HashMap;
import java.util.Map;

public class RomConverter {
    public static long converter(String input) {
        if (input == null || input.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            int value = map.get(input.charAt(i));
            if (i + 1 < input.length()) {
                int nextValue = map.getOrDefault(input.charAt(i + 1), 0);


                if (value < nextValue) {
                    result += (nextValue - value);
                    i++;
                    continue;
                }
            }
            result += value;
        }
        return result;
    }
}