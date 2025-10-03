package Lessons.Lesson11AbstractsInterface.Computer.parts;

import Lessons.Lesson11AbstractsInterface.Computer.Workable;

import java.util.Scanner;

public class Keyboard implements Workable {

    
    @Override
    public void start() {
        System.out.println("keyboard started");
    }

    @Override
    public void proses() {
        Scanner sc = new Scanner(System.in);
        String givennumber = sc.nextLine();

    }
    @Override
    public void stop() {
        System.out.println("keyboard stopped");
    }
}
