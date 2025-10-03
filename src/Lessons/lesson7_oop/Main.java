
package lesson7_oop;

public class Main {
    public static void main(String[] args) {
      /*Human human =  new Human ("ali", "mammadli",36);
      human.walk();
        Human human2 =  new Human ("vali", "mammadli",36);
        human2.walk();

    System.out.println(human.weight);
        human.eat();
        System.out.println(human.weight);*/


        //var             arrImplementation     yaza bilerik
        //var a= "string";
        ArrImplementation arrImplementation = new ArrImplementation();
        int [] myArray = {1,2,3,4,5};
        int [] result  = arrImplementation.addOneToEach(myArray,2);
        arrImplementation.printArray(result);


        //varargs
        arrImplementation.loopElemnt(1,2,3,4);

    }
}

