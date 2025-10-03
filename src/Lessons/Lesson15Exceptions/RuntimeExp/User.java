package Lessons.Lesson15Exceptions.RuntimeExp;
import java.util.Objects;

public class User implements  AutoCloseable {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        if (age < 0) {
            throw new RuntimeException("exception"); //exceptionlar
           // System.out.println("Age can't be negative");
        }
        this.age = age;
    }

    public void setName(String name) {
     if(Objects.equals(name,"") || name.length()<3){
         try {
             throw new InvalidNameException("invalid name");
         } catch (InvalidNameException e) {
             //throw new RuntimeException(e);
         }
     }
     this.name = name;
    }

    public void divideAgeByZero() {
        System.out.println(age/0);

        //try catch yazmasaq bunu yazib
        // metodu cagranda bu mesaj cxacaq.
        //throw new RuntimeException("division by zero");
    }


    @Override
    public void close() throws Exception {

    }
}
