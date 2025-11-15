package tasklar.SentyabrTask.Les16Tasks.GradingSystem;



import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", "Mammadov", 91.5));
        students.add(new Student("Nigar", "Huseynova", 95.0));
        students.add(new Student("Ali", "Aliyev", 91.5));
        students.add(new Student("Elvin", "Quliyev", 88.0));

        System.out.println("Sıralanmış tələbələr:");
        Student.searchGPA(students);

        System.out.println("\nBinary Search ilə axtarış:");
        int index = Student.searchNameSurname(students, "Ali", "Aliyev");

        if (index >= 0) {
            System.out.println("Tapıldı: " + students.get(index));
        } else {
            System.out.println("Tələbə tapılmadı!");
        }
    }
}
