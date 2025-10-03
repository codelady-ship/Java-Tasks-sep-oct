package Lessons.Lesson20Lambda;
       //lambda
public class Main {
    static void main() {
        //old way
        Room room = new RoomApi();
        int count = room.count (10);
        System.out.println(count);



        //new way
       //->arrow operator
        Room roomi = (x) -> x * x;
        System.out.println(roomi.count(5));


    }
}
