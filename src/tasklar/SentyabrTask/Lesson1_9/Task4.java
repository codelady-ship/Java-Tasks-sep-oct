package tasklar.SentyabrTask.Lesson1_9;
//--------------------------------------------------------------------
// 4. Student class yaradın (özündə name (String) və grade (int)).
// Student massivi yaradın və içini istədiyiniz sayda
// Student obyektləri ilə doldurun. Bu massivdəki qiymətlərin
// ədədi ortasını double ilə qaytaran static method yazın.
// Bu massivdə ən yüksək qiymətə malik tələbənin adını çıxaran
// static method yazın.
public class Task4 {
    static Student[] students = {
            new Student(90, "Ali"),
            new Student(85, "Nigar"),
            new Student(98, "Murad"),
            new Student(76, "Aylin"),
            new Student(92, "Emin")
    };

   //orta eded
    public static double avarageGrade () {
        int total = 0;
        for (Student s : students) {
            total += s.grade;
        }
        return (double) total / students.length;
    }
    //max student
    public static Student getTopStudent() {
        Student topStudent = students[0];

        for (Student s : students) {
            if (s.grade > topStudent.grade) {
                topStudent = s;
            }
        }

        return topStudent;
    }
        
}





