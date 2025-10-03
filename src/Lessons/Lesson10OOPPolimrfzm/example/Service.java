package Lessons.Lesson10OOPPolimrfzm.example;

public class Service {

public final Shape shape; // lousely couplink

//public final Triangle;//tightly couplink

    public Service(Shape shape) {
        this.shape = shape;
    }

    public  void print(Shape shape) {
        //instance of
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println(triangle.name);
        }else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.name);
        }
    }
}
