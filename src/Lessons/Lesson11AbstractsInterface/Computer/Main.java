package Lessons.Lesson11AbstractsInterface.Computer;

import Lessons.Lesson11AbstractsInterface.Computer.parts.Keyboard;
import Lessons.Lesson11AbstractsInterface.Computer.parts.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(5,6, (Workable) new Keyboard());
        computer.turnOn();
        computer.turnOff();
    }


}
