package Lessons.Lesson11AbstractsInterface.Abstracts;

public class Dog extends Animal {

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void walk() {
        System.out.println("Dog walk");

    }
}
