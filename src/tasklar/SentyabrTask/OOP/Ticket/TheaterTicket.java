package tasklar.SentyabrTask.OOP.Ticket;

import java.util.List;

public class TheaterTicket extends SeatingTicket{
    private int duration;
    private List<String> participants;

    public TheaterTicket(String name, double price, String description, int duration, List<String> participants) {
        super(name, price, description);
        this.duration = duration;
        this.participants = participants;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tamaşanın Müddəti: " + this.duration + " saat");
        System.out.println("İştirakçılar: " + String.join(", ", participants));
    }


}
