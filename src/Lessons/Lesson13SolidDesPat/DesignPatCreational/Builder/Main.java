package Lessons.Lesson13SolidDesPat.DesignPatCreational.Builder;
//builderle bagladgmiz deyeri kimse deyise bilmir
//Builder nested classdir. staticdir deye -
// new Person.Builder()demek olacq mainde

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setName("Ahmet")
                .setAge(25)
                .build();
    }
}
