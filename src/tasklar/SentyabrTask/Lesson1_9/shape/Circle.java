package tasklar.SentyabrTask.Lesson1_9.shape;

public class Circle extends Shapes {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
   public double getArea(){
        return Math.PI* radius * radius;
   }

}