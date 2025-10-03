package Lessons.Lesson13SolidDesPat.DesignPatCreational.Singleton;
/*
Singleton-	Yalnız bir obyekt lazımdırsa
Factory Method-	Obyekt növü sonradan dəyişə bilərsə
Abstract Factory-	Birləşmiş obyekt ailələri yaradırsansa
Builder	-Mürəkkəb obyektləri sadə şəkildə yığmaq üçün
Prototype-	Mövcud obyektin kopyasını çıxartmaq üçün
* */
public class Main {
    static void main() {
        //Singleton
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        // obj1 və obj2 eyni obyektə işarə edir

        if (obj1 == obj2) {
            System.out.println("Eyni obyektə işarə edir");
        } else {
            System.out.println("Fərqli obyektlərdir");
        }






    }
}
