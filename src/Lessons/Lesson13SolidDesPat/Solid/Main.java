
//S-single responsibility.class sadece 1 responsiblity goturur.
//o-open to extention close modification
//L-liskov klaslarin yerin deyisende implement extendde problem olmasn
//i-interface segragation class metodlari interfaceden almalidir.
//   interfacenin adina uygun olmayan metod icinde olmamaldr
//d-dependency inversion -yuxari ve asagi claslar her ikiside abstraksiyadan asili olmalidir

package Lessons.Lesson13SolidDesPat.Solid;

public class Main{
    public static void main() {

        //liskov
        Flyable flyingBird = new Flyable() {
            @Override
            public void fly() {

            }
        };
        flyingBird.fly(); // OK

        Qarg qarga = new Qarg();
        qarga.eat();     // OK
    }
}




