package tasklar.SentyabrTask.Lesson10task;


public class Main {
    public static void main(String[] args) {
        tasklar.SentyabrTask.library.Library library = new tasklar.SentyabrTask.library.Library(5);

        library.addBook("Java", "Murad", 2022);
        library.addBook("Zəka", "Ali", 2019);
        library.addBook("Python", "Murad", 2020);

        library.printBooksByAuthor("Ali");
        library.printBooksByAuthor("Murad");
        library.printBooksByAuthor("Leyla");
    }
}
