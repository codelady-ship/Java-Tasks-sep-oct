/*

*/
/*public class Lesson1 {
   public static void main(String[] args) {
       System.out.println("Hello, world!");
  }
}*//*

*/
/*public class Lesson1 {
    public static void main(String[] args) {
        int rad = 7;
        double pi = 3.14;
        double sahe =Math.floor(pi * rad * rad) ;
        System.out.println("cevrenin sahesi :" + sahe);
    }
}*//*

*/
/*public class Lesson1 {
    public static void main(String[] args) {
        double celsi = -18;
        double farenheit = Math.floor(9/5 * celsi + 32);
        System.out.println(" farenheit derece:" + farenheit);
    }
}*//*

*/
/*public class Lesson1 {
    public static void main(String[] args) {
        int year =2004;
        boolean leap = year % 4 == 0;
        boolean noleap = year % 100 != 0;
        System.out.println(leap && noleap);
}}*//*

*/
/*public class Scoring{
}*//*


*/
/*public class Lesson1 {
    public static void main(String[] args) {
        double score =85;

        String[] grades = {"F", "E", "D", "C", "B", "A"};

        // -0.5 çıxaraq intervalları düz gətiririk: 0–50.5 → F, 50.5–60.5 → E və s.
        int index = (int)((score - 0.5) / 10);

        // Skor 0-100 aralığında olmalıdır
        String grade = grades[Math.max(0, Math.min(index, 5))];
        System.out.println("Your grade is: " + grade);
    }
}*//*



//5ci FIBONACCI EDED-ilk 1-2dirse,ondan sonraki ededler ozunden evvelki 2 eded cemidir/1.2.3.5.8
*/
/*public class Lesson1 {
    public static void main(String[] args) {
        int first_num = 0;
        int second_num =1;
        int thirth_num = first_num + second_num;
        int fourth_num = thirth_num + second_num;
        int fifth_num = fourth_num + thirth_num ;
        System.out.println("Your 5th fibonacci number is: " + fifth_num );
    }
}*//*


//2 deyisen var onlarin  ededlerin deyisin..1ci yol bitvise
*/
/*public class Lesson1 {
    public static void main(String[] args) {
        int a = 5;//0101
        int b = 7;//0111
        a=a^b;//0010
        b=a^b;//0101
        a=a^b;//0111
        System.out.println(a + "" + b );
    }
}
*//*

*/
/*2 deyisen var onlarin  ededlerin deyisin..2ci yol
public class Lesson1 {
    public static void main(String[] args) {
        int a = 5;
        int b =7;
         a = a+b;//12
         b = a-b;//5
         a=a-b;//7
        System.out.println("Your changeable number is: " + a +"and" +b);
    }
}*//*

public class Lesson1 {
    public static void main(String[] args) {
        System.out.printf("hello");
    }
}
*/
