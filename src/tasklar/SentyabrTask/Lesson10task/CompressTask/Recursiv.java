package tasklar.SentyabrTask.Lesson10task.CompressTask;

public class Recursiv {
    public static long power(long base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent should be non-negative");
        }
        if (exponent == 0) {
            return 1;  // 0 ustu quvvet 1
        }
        // Rekursiv
        return base * power(base, exponent - 1);
    }
}
