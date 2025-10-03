package Lessons.Lesson14.DesPat.Command;
//(invoker – əmri işə salan obyekt)
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

