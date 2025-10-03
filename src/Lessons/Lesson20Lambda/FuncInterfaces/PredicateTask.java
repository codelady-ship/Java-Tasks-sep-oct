package Lessons.Lesson20Lambda.FuncInterfaces;

import java.util.function.Predicate;

//38 deq likde 20 deq
public class PredicateTask {
    static void main(String[] args) {
       Integer given =10;
       boolean result = operate(a -> a < 15,given);
       System.out.println(result);
    }

    public static boolean operate (Predicate<Integer> supplier, Integer value ){
    return supplier.test(value);
    }
}
