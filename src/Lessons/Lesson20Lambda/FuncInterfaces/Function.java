package Lessons.Lesson20Lambda.FuncInterfaces;

public class Function {
    static void main(String[] args) {
        //Function
        Integer value = 5;
        operate(element -> element + 5, value);
    }
    //Function
    public static void operate(java.util.function.Function<Integer, Integer> function, Integer a) {
        function.apply(a);
    }
}
