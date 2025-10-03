package Lessons.Lesson20Lambda.FuncInterfaces;

public class Supplier {
    static void main(String[] args) {
        //Supplier
        Example example = new Example();
        operate(() -> {
            return "Hello World!";
        });
    }
        //Supplier
    public static String operate(java.util.function.Supplier<String> supplier) {
        return supplier.get();
    }
}
