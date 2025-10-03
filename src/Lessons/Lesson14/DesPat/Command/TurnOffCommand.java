package Lessons.Lesson14.DesPat.Command;
//(əmr - TV söndürmək)
public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

