package Lessons.Lesson13SolidDesPat.DesignPatCreational.Prototype;

//Sheep klassı Cloneable interfeysini implement edir.
// Bu, Java-ya deyir ki, "bu obyekt klonlana bilər".
class Sheep implements Cloneable {
    public String name;

    //Constructor – yeni Sheep yaradanda name verir.
    public Sheep(String name) {
        this.name = name;
    }
//Bu metod super.clone() vasitəsilə obyektin eynisini çıxarır.
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();//"bit-by-bit" (shallow copy)
    }
}
