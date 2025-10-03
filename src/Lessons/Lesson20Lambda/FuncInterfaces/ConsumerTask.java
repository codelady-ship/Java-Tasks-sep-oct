package Lessons.Lesson20Lambda.FuncInterfaces;

import java.util.function.Consumer;

public class ConsumerTask {
    static void main() {
        //Consumer
        String s = "hello";
        print(value -> System.out.println(value), s);//cap et,local scopedadir value ona gore kompile xatesi vermir.
        print((value) -> {
            value.trim();
        }, s); //trim et value ile

    }

    //Consumer
    public static void print(Consumer<String> consumer, String text) {
        consumer.accept(text);
    }

}
