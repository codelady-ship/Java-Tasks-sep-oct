package tasklar.SentyabrTask.Lesson10task;

public class Library {
    private Book[] books; //(Book) siyahısı
    private int count = 0;

    public Library(int maxCount) {
        this.books = new Book[maxCount];
    }

    public void addBook(String title, String author, int year) {
        if (count < books.length) {
            books[count] = new Book(title, author, year);//books say= new book
            count++;
            System.out.println("Kitab əlavə olundu: " + title + " - " + author);
        } else {
            System.out.println("Kitabxana doludur");
        }
    }

    public void printBooksByAuthor(String authorName) {
        StringBuilder result = new StringBuilder();
        //equalsIgnoreCase-iki mətnin (String-in)  = olub-olmadığını yoxlayır, böyük və ya kiçik hərf fərqinə baxmir

        for (Book book : books) {
            if (book != null && book.getAuthor().equalsIgnoreCase(authorName)) {
                result.append("- ")
                        .append(book.getName())
                        .append("\n");
            }
        }

        /*Əgər kitab null deyil və müəllifi uyğun gəlirsə, nəticəyə əlavə olunur.*/
        if (result.isEmpty()) {
            System.out.println("Bu müəllifin kitabı tapılmadı.");
        } else {
            System.out.println("Müəllif: " + authorName + " kitabları:\n" + result);
        }
    }
}
