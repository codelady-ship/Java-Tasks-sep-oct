package Lessons.lesson9.StrOOP.Inheritance;

import java.util.Objects;

public class Animal {

    public String name ="Animal";

    public Animal(String dog) {
    }

    public Animal() {

    }


    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
