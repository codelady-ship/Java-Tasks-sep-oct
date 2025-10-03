package Lessons.Lesson13SolidDesPat.DesignPatCreational.Factory;


        //Factory-Obyektin yaradılmasını alt class-lara həvalə etmək.yeni animal factory-e
        public class Main {
            public static void main(String[] args) {
                AnimalFactory factory = new AnimalFactory();

                Animal animal1 = factory.createAnimal("dog");
                animal1.speak(); // Hav hav

                Animal animal2 = factory.createAnimal("cat");
                animal2.speak(); // Miyav
            }
        }

