package lesson6;

import lesson6.statickeywords.PrintClass;
import lesson6.statickeywords.SumClass;

public class Lesson6_class {
    //entrypoint-main
    //1.method name-kicik herfle feller
    //2.argument
    //3.method body

   //metoddan kenarda deyerler ve claslar (meselen,class SumClass(){}-ata bilerik bura) yaradiriq
    static int value =5;
    static int value2 =5;//ada yox ardicillliga baxr

    public static void main(String[] args) {


        int result = SumClass.sum (value, value2);
        //print (result);

        PrintClass.print(result);
        //print(value,value2);//method call--ctrl +p olmayan argumenti gosterir







    }


    //dublication problem/tekrarlama
   /* public static void print(){
      int[]values =new int[10];
      values[0]=1;
      values[1]=2;
      values[2]=3;
      for(int value : values){
          System.out.println(value);
      }
    }*/



}
