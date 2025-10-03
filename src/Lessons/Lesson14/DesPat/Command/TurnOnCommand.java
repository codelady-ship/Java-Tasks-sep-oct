package Lessons.Lesson14.DesPat.Command;
//(əmr - TV açmaq)
public class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

