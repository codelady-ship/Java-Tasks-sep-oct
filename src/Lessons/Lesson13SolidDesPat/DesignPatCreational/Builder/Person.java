package Lessons.Lesson13SolidDesPat.DesignPatCreational.Builder;

public class Person {
    private String name;
    private int age;

    //nested class staticdir deye -new Person.Builder()demek olacq mainde
    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;           //method chaining
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

