package tasklar.SentyabrTask.OOP.Ticket;

public class StandingTicket extends Ticket {
   private String zoneName;

    public StandingTicket(String name, double price, String description,String zoneName) {
        super(name, price, description);
        this.zoneName = zoneName;
    }
    public StandingTicket(String name, double price, String description) {
        super(name, price, description);
    }

    public String getZoneName() {
        return zoneName;
    }
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Zona: " + zoneName);
    }
}
