package Lessons.Lesson13SolidDesPat.DesignPatCreational.Singleton;
//1 class-dan yalnız bir obyektin yaradılmasına
// icazə vermək.
public class Singleton {
    private static Singleton instanc;
    private Singleton() {}//constructor
    public static Singleton getInstance() {
        if (instanc == null) {
            instanc = new Singleton();
        }
        return instanc;
    }
}
