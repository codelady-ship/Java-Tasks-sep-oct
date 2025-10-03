
package Lessons.lesson9.StrOOP.Inheritance;

public class Dog extends Animal {
    public String name = "Dog";// variable hidding

    public Dog(String dog) {
        super(dog);
        System.out.println("Inside Dog");
    }

    public Dog() {
        super();
    }
    //protected ancaq subclasda gorunur


    @Override // annotasiyadr
    //private edende accesibilityni asagi salirsan.
    public void eat(){
        super.eat();
        System.out.println("dog Eating");
    }

    public String getName (){
       return super.name;
    }
    public void  bark(){
        System.out.println("Barking...");
    }
}

