package tasklar.SentyabrTask.Les16Tasks.GradingSystem;


/*1. Student class-ı yaradın.
1.1. Özündə tələbə adı və soyadını,
əlavə olaraq tələbənin GPA-sını (GPA 100 üzərindəndir) saxlasın (Double).
2. Tələbələri List-də saxlayın.
3. static method yazın, hansı ki, tələbələri qiymətlərinin
azalması sırası ilə göstərsin (Əgər qiymətlər eyni olarsa,
ada, adları da eyni olarsa, soyada görə sıralasın həm də).
4. Binary search vasitəsi ilə tələbələri adlarına və
soyadlarına görə axtarmağa imkan verən static method yazın.*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Arrays.sort() istifadə edə bilmək ucn implement etdik
public class Student  implements Comparable<Student> {
    String name;
    String surname;
    Double gpa;

    public Student(String name, String surname, Double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " " + surname + "`s gpa is " + gpa;
    }

    @Override
    public int compareTo(Student other) {
        int GpaCompare = other.gpa.compareTo(this.gpa);//azalan sira -GPA ↓ ,eksi olsa artan olacaq
        if (GpaCompare != 0) return GpaCompare;
        int nameCompare = this.name.compareTo(other.name);// ad ↑
        if (nameCompare != 0) return nameCompare;
        return this.surname.compareTo(other.surname);//soyad ↑
    }

    // 4. Binarysearch Comparator-ad,soyada grə
    public static Comparator<Student> nameSurnameComparator() {
        return Comparator
                .comparing(Student::getName, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Student::getSurname, String.CASE_INSENSITIVE_ORDER);
    }


    public static int searchNameSurname(List<Student> students, String name, String surname) {
        Student key = new Student(name, surname, 0.0);
        students.sort(nameSurnameComparator()); // binary search
        return Collections.binarySearch(students, key, nameSurnameComparator());
    }


    public static void searchGPA(List<Student> students) {
        Collections.sort(students); // compareTo metodu istifadə olunur
        for (Student s : students) {
            System.out.println(s);
        }
    }

    }
