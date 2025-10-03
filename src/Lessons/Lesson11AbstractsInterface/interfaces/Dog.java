package Lessons.Lesson11AbstractsInterface.interfaces;

public class Dog extends Animal implements Runnable, java.lang.Runnable {

//butun metodlari override etmelyik
    @Override
    public void run() {}
    @Override
    public void walk() {}
}
