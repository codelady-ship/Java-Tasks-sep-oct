package Lessons.Lesson11AbstractsInterface.Computer.parts;

import Lessons.Lesson11AbstractsInterface.Computer.Workable;

import java.util.Scanner;

public class Mouse extends Computer implements Workable {

    public Mouse(int x, int y, Workable workable) {
        super(x, y, workable);
    }

    @Override
    public void start() {
        System.out.println("Mouse is moving cursor");
    }

    @Override
    public void stop() {
      System.out.println("Mouse stopped");
    }

    @Override
    public void proses() {
      Scanner sc = new Scanner(System.in);
      System.out.println("define mouse position");
      x = sc.nextInt();
      y = sc.nextInt();
    }
}
