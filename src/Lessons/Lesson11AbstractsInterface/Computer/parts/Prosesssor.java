package Lessons.Lesson11AbstractsInterface.Computer.parts;

import Lessons.Lesson11AbstractsInterface.Computer.Workable;

public class Prosesssor extends Computer implements Workable {

    public Prosesssor(String givennumber) {
        super(givennumber);
    }

    @Override
    public void start() {
        System.out.println("Prosesssor start");
    }

    @Override
    public void stop() {
        System.out.println("Prosesssor stop");
    }

    @Override
    public void proses() {
        System.out.printf("Processor proses: x: %d, y: %d%n", x, y);
    }
}
