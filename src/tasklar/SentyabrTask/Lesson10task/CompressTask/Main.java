package tasklar.SentyabrTask.Lesson10task.CompressTask;

import static tasklar.SentyabrTask.Lesson10task.CompressTask.CompressionTask.compress;
import static tasklar.SentyabrTask.Lesson10task.CompressTask.Recursiv.power;
import static tasklar.SentyabrTask.Lesson10task.CompressTask.RomConverter.converter;

// 2. public static String compress(String string) - İçinə verilən String-i
// sıxışdırır (compression). Sıxışdırma alqoritmi hərflərin təkrarlanmasına görə
// olmalıdır. Məsələn: aaabbbbcc -> a3b4c2 - dddeeeefdddd -> d3e4f1d4

// 4. Rom ədədini 10-luq ədədlərə çevirən static method yazın.
public class Main {
    public static void main(String[] args) {
        System.out.println(compress("aaaaabbbbcc"));        // a3b4c2
        System.out.println(compress("a"));                // a1
        System.out.println(compress(""));                 // (empty)

        System.out.println(power(2, 5));  // 32


        System.out.println(converter("IV"));       // 4
        System.out.println(converter("IX"));       // 9
        System.out.println(converter("LVIII"));    // 58
        System.out.println(converter("MCMXCIV"));  // 1994

    }


}
