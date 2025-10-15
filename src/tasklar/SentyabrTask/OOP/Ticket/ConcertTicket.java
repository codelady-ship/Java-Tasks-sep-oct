package tasklar.SentyabrTask.OOP.Ticket;

public class ConcertTicket extends StandingTicket{
    private String artistOrBand;

    public ConcertTicket(String name, double price, String description, String zoneName) {
        super(name, price, description);
        this.artistOrBand = artistOrBand;
        setZoneName(zoneName);
    }

    public String getArtistOrBand() {
        return artistOrBand;
    }

    public void setArtistOrBand(String artistOrBand) {
        this.artistOrBand = artistOrBand;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Artist Or Band: " + artistOrBand);

    }

    @Override
    public void setZoneName(String zoneName) {
        super.setZoneName(zoneName);
    }
}
