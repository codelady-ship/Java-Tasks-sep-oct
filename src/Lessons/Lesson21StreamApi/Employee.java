package Lessons.Lesson21StreamApi;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
   public String name;
   public int age;
   public Employee(String name, int age){
       this.name=name;
       this.age=age;
   }

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.age>o2.age){
            return 1;
        }else if (o1.age<o2.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}
