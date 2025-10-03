package Lessons.Lesson10OOPPolimrfzm;

public class Main {
    //polimorfizm--subclasin referansinin parent clasa menimsedilmesi
    //koda dinamiklik qatr

    // abstaction-menimsetme

    public static void main(String[] args) {

        Shape shape = new Triangle();//upcatsing (Shape)
        shape.draw();
        //parenti cxaririq kenara- downcasting
        Triangle triangle = (Triangle) shape;
        //triangle.draw();
        Rectangle rectangle = new Rectangle();
        //Triangle triangle = new Triangle();

        print(triangle);
        print(rectangle);
    }

    public static void print(Shape shape) {
        //instance of-Shape triangle-in objectidirse
        if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;//downcasting
            System.out.println(triangle.name);
        }else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.name);
        }
    }

}
