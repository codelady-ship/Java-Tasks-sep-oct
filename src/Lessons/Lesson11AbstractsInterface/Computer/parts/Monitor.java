package Lessons.Lesson11AbstractsInterface.Computer.parts;

import Lessons.Lesson11AbstractsInterface.Computer.Workable;

public class Monitor extends Computer implements Workable {


    public Monitor(String givennumber) {
        super(givennumber);
    }

    @Override
    public void start() {
        System.out.println("monitor started");

    }

    @Override
    public void stop() {
        System.out.println("monitor stopped");
    }

    @Override
    public void proses() {
        System.out.println("input was: "+givennumber);
    }
}
