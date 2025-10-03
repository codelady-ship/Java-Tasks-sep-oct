package lesson7_oop;

public class Human {
    //state-field/property
    public String name;
    public String surname;
    public int age;
    public double weight = 35.2;
    private static final int ADD_TO_Weight = 1;//constant

    //behaivor/actionlar-metodlar
    public void eat() {
        weight += ADD_TO_Weight; //magic number
        System.out.println("Eating");

        if(weight > 35.2){
            return;
        }
        eat();//recursion -stack overflov olana kimi davam edir.loop  kimi dovr edir.şert qoymaliyq.
    }
    public void walk() {
        if (this.name == null) {
            this.name = "Sali"; //defolt ad verdik
        }
        System.out.println(name + " walking");//debugger -programdaki problemleri gormek ucun
    }

    //metod overloading -adi eyni arumentleri ferqli metodlar
    public  void sleep(String name) {
        System.out.println(name +" Sleeping");
    }
    public  void sleep(String name,int clock) {
        System.out.println(name + clock +" sleep");
    }

   /*
    new edende mainde -static ve non static iki blok da cxr.ardcilliq-static-nonstatic-konstuctor olur.
   metod overloading eyni ad ferqli arqumentli metodlar
   */
}