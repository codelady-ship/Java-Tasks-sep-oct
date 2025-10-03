package Lessons.Lesson13SolidDesPat.DesignPatCreational.Prototype;
//throws CloneNotSupportedException try/catchla yazabilerk
//"bit-by-bit" (shallow copy)


public class Main {
    public static void main() throws CloneNotSupportedException {
        Sheep original = new Sheep("Dolly");
        Sheep clone = original.clone();
        System.out.println(clone.name);  // "Dolly"


    }
}
