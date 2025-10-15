package tasklar.SentyabrTask.OOP.Ticket;

public class SeatingTicket extends Ticket {
    private int seatNumber;

    public SeatingTicket(String name, double price, String description) {
        super(name, price, description);
    }

    public SeatingTicket(String name, double price, String description, int seatNumber) {
        super(name, price, description);
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Seating Ticket: " + this.seatNumber);
    }
}
