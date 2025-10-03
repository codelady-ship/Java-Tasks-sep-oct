package Lessons.lesson9.StrOOP;

public class Stringsss {
    public static void main(String[] args) {
       //Stringler
        String name = "John";//check value
        String lastName = new String("John");//check reference
        System.out.println(name.equals(lastName));

        //str metods
        /*String name = "Adiniz";
        int lenght= name.length();//lenghti
        String lovercase= name.toLowerCase();
        String uppercase = name.toUpperCase();
        char [] Array =name.toCharArray();//massiv kimi verir
        boolean contains =name.contains("a");//herf daxildirmi
        boolean equals = name.equalsIgnoreCase("kENAN");//herflerin boyuk kicikliyine baxmasin
        boolean isempty=name.isEmpty()//lenght == 0-ra yeni.bosluq olanda true olmasa false
        boolean isblank = name.isBlank();//stringde herf varsa false olmasa true
        boolean tsrt= name.startsWith("k");
        boolean end= name.endsWith("n");
        String soz= "swd,dfd,df";
        String [] Spplit = soz.split(",");//vergul olan yerden array edir
        System.out.println(Spplit [0]);
        int a  =name.indexOf('a');//indelsin nomresi verir(str:"n",fromIndex:4) n-ni 4cuden sonra axtar
        String concat = name.concat(" hello");
        String replace = name.replace("dsd","heeell");
        String  string =name.trim();//etrafindaki bosluqlari silir
        String str = name.reverse();//tersin verir
        */

        //String builder-- her defe yeni string yarananda heresine ayri yer ayrilir deye istifade edirik evvelden olcu veririk,
        /*StringBuilder built = new StringBuilder();//reqem vermesek normalda a16 verir minlenght-i ve ya capasity-ni
        built.append("Hello");
        built.append("!");
        System.out.println(built);
        built.reverse();//tersin verir
        built.insert (3,"..");//3 sonra  .. yazsin davamn yazsin-- He..o
        built.capacity(); //length verir 16
        built.length();//lenght =0


        //StringBuffer-stredlerle islyende onlarin sinxron islemesine komek edir.
        //Sychronized
        StringBuffer built2 = new StringBuffer();
        built2.append("Hello");*/











    }
}
