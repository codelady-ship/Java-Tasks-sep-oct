package tasklar.SentyabrTask.Lesson10task;
import tasklar.SentyabrTask.Lesson10task.Book;

public class Library {
    private Book[] books;
    private int count = 0;

    public Library(int maxCount) {
        this.books = new Book[maxCount];
    }

    public void addBook(String title, String author, int year) {
        if (count < books.length) {
            books[count] = new Book(title, author, year);
            count++;
            System.out.println("Kitab əlavə olundu: " + title + " - " + author);
        } else {
            System.out.println("Kitabxana doludur");
        }
    }

    public void printBooksByAuthor(String authorName) {
        StringBuilder result = new StringBuilder();

        for (Book book : books) {
            if (book != null && book.getAuthor().equalsIgnoreCase(authorName)) {
                result.append("- ").append(book.getName()).append("\n");
            }
        }

        if (result.isEmpty()) {
            System.out.println("Bu müəllifin kitabı tapılmadı.");
        } else {
            System.out.println("Müəllif: " + authorName + " kitabları:\n" + result);
        }
    }
}
