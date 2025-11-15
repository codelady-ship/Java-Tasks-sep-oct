package tasklar.SentyabrTask.OOP2ToDo;
/*
* 1. Task class-ı yaradın.
2. Özündə String description və Boolean completed property-lərini saxlasın.
3. TaskRepository (Storage) class-ı yaradın.
4. Özündə Task-ların siyahısını saxlamalıdır.
5. Yeni task əlavə etmək üçün və mövcud bütün
*  taskları əldə etmək üçün method-u olmalıdır.
6. Exporter interface-i yaradın.
7. Bu interface export method-u olmalıdır hansı ki
* Task siyahısını götürüb String qaytarmalıdır.
8. Fərqli Exporter class-ları yaradın və
* Exporter interface-ni implement edin
*  (Məsələn, CSVExporter, HTMLExporter, PlainTextExporter və s.).
9. ToDoApp class-ı yaradın.
10. Özündə TaskRepository-ni saxlasn.
11. exportTasks method-u olsun, hansı ki,
*  içinə ötürülən exporter obyekti ilə export etsin
*  repository-də olan taskları.
12. App-ı demo etmək üçün Main class yaradın və
* nümunə taskları ilə app-i nümayiş etdirin.*/
public class Main {
    public static void main(String[] args) {
        ToDoApp app = new ToDoApp();

        app.addTask("Learn Java");
        app.addTask("Do Eolymp tasks");
        app.addTask("Read a book");

        // 2-ci task completed
        app.getRepository().getAllTasks().get(1).setCompleted(true);

        Exporter plainText = new PlainTextExporter();
        Exporter csv = new CSVExporter();
        Exporter html = new HTMLExporter();

        System.out.println("=== Plain Text ===");
        System.out.println(app.exportTasks(plainText));

        System.out.println("=== CSV Format ===");
        System.out.println(app.exportTasks(csv));

        System.out.println("=== HTML Format ===");
        System.out.println(app.exportTasks(html));
    }
}

