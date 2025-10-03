package Lessons.Lesson11AbstractsInterface.interfaces;


import java.lang.Runnable;

public class Main {
    public static void main(String[] args) {
        //Runnable runnable = new Dog();//polimorfizm kimi olur
        //Runnable runnable = new Runnable() //olmur obyect deyil
        //public Runnable ();// constructorlari da olmur.


        //
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Running");
            }
        };
        runnable.run();
    }
}
