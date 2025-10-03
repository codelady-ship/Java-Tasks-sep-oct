package Lessons.Lesson11AbstractsInterface.Abstracts;
//clas absstracdrsa metodda abstract olmaldr.head hisse olr
public abstract class Animal {

    public Animal() {

    }

    //concrete metod/skeleton pattern/template methd
    public void initialize() {
        walk();
        sleep();
    }



    public abstract void sleep();
    public abstract void walk();

}
