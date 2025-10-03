/*
command pattern==Əmri yerinə yetirən ilə
Əmrə nə ediləcəyini deyən ayrı-ayrı olur.

Command (interface) – əmrin interfeysidir, məsələn execute() metodu olur
ConcreteCommand – əmrin konkret implementasiyasıdır
Receiver – əsl işi görən obyekt (əsl funksiya burada olur)
Invoker – əmri çağıran obyekt (məsələn, düymə)
Client – hər şeyi birləşdirən obyekt
* */

package Lessons.Lesson14.DesPat.Command;
//(client)
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();  // TV açıldı.

        remote.setCommand(turnOff);
        remote.pressButton();  // TV söndürüldü.
    }
}
