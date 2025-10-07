package tasklar.SentyabrTask.Lesson10task;
//Lesson 1-10 -28avq
// 1. Kitab (Book) class-ı yaradın. İçində ad (name), müəllif (author)
// və buraxılış ili (year) xanalarını saxlasın.
// Kitabxana (Library) class-ı yaradın.
// Constructor ilə bu class-ın obyektini yaradın (constructor kitabxananın maksimum
// tutumunu qəbul etməlidir).
// Obyekt özündə kitabların (Book) siyahısını saxlasın.
// Aşağıdakı funksionallıqları method-lar vasitəsilə yazın:
// Kitabxanaya kitabın əlavə olunması;
// Müəllif adına görə kitabların adlarının ekrana çıxarılması;
// 2. public static String compress(String string) - İçinə verilən String-i
// sıxışdırır (compression). Sıxışdırma alqoritmi hərflərin təkrarlanmasına görə
// olmalıdır. Məsələn: aaabbbbcc -> a3b4c2 - dddeeeefdddd -> d3e4f1d4
// 3. Rekursiv method ilə ədədin qüvvətini hesablayın.
// 4. Rom ədədini 10-luq ədədlərə çevirən static method yazın.

public class Main {
    public static void main(String[] args) {
       Library library = new Library(5);

        library.addBook("Java", "Murad", 2022);
        library.addBook("Zəka", "Ali", 2019);
        library.addBook("Python", "Murad", 2020);

        library.printBooksByAuthor("Murad");
        library.printBooksByAuthor("L");
    }
}
