package tasklar.SentyabrTask.Lesson1_9.shape;

public class Rectangle extends Shapes {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

}
