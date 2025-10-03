package Lessons.Lesson11AbstractsInterface.Computer.parts;

import Lessons.Lesson11AbstractsInterface.Computer.Workable;

public class Computer {

    public Workable workable;
    public String givennumber;
    public int x,y;

    public Computer(String givennumber) {
    }

    public Computer(int x, int y, Workable workable) {
        this.x = x;
        this.y = y;
        this.workable = workable;

    }

    public void turnOn(){
      workable.start();
      workable.proses();
    }
    public void turnOff(){
        workable.stop();
    }
}
