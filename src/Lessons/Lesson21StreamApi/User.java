package Lessons.Lesson21StreamApi;

public class User implements Comparable<User> {
    public String name;
    public Integer age;
    public User (String name,Integer age){
      this.name=name;
      this.age=age;
    }

    @Override
    public int compareTo(User o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }
        return 0;
    }

}
