package Lessons.Lesson11AbstractsInterface.interfaces;
//klas-klas .interface-interface extends olur
public interface Runnable extends Walkable {
    //rule-extend edilen yerde onun metodlarin implement etmelidir.
    //rule- hemise public olur.

    void run();//rule.abstract metods
    void walk();

    //fieldler constant olr
    int VELOSITY = 5;

    static void fly(){

    }
    default void move(){
        System.out.println("Dog move");
    }

}
