package lesson6;

public class PrintClas {
    //acces modifiers -public, private, protected ,default

    public int value = 10;//object instance,instance,non-static
    public static double value2 = 10; //class variable,static variable


    public static void print(int a, double b){
        if(a>10){
            System.out.println(a);
             return;
        }
        if(b>50.5){
            System.out.println(b);
        }
    }
}
