package Lessons.Lesson21StreamApi;

import java.util.ArrayList;
import java.util.List;
//Stream api -listlerin ustunde daha suretli hereket etmeye imkan verir.

public class Collections {
    public static void main(String[] args) {
      ArrayList<User> users = new ArrayList<>();
      users.add(new User("John",12));
      users.add (new User("Ali",44));
      users.add (new User("veli",14));


        //pipeline -ard arda boru kimi
        //intermediate operators -map,filter-streami davam etmek olursa noqte qoyub ve geri nese qaytarirsa
        //terminal operators -forEach,toList-streami davam etdirmek olmur
        //for(User u : users){}

        //streamin metorlari:
        //.var deyende stringlerin streamini verir
        //.colllect = .toList
      /*Stream<String> names = users.stream()
        //.forEach(u -> System.out.println(u.name));
       .map((u) -> u.name)
       .filter(u -> u.contains("u"))// u olanlari filterle
       .toList()
       //.limit(5)//icinde ilk 5 ni saxla

      .forEach(u-> System.out.println(u))//consumerdir,geriye void verir;

      System.out.println(names);
     }*/

   boolean result = users.stream()
     .distinct() //təkrar element+i cixrdr,yalnız unikal element olan yeni Stream verr.
     //.allMatch()//hamisi uymalidir
     .noneMatch(u -> u.name.equals("Jon")); //hec biri Jon olmayanlari true versin
     //.anyMatch(u -> u.name.equals("Ali"));//icerisinden biri ali olan yoxlayir.
    System.out.println(result);

     //comparator yada comparable interfacedir ve onun override edirler clasa

    User user  =users.stream()
                //.max((u,v)->u.compareTo(v))
                .max(User:: compareTo)//static metod call,=yuxardakina
                .get();
    System.out.println(user.age);




   ArrayList <Employee> employees = new ArrayList<>();
   employees.add(new Employee("John",12));
   employees.add(new Employee("Ali",44));
   employees.add(new Employee("veli",14));

   List<Employee> list= employees.stream()
   .max((e,f)->e.compare(e,f))
   .stream()
   .toList();

 }
}