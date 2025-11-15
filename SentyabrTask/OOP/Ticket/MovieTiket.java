package tasklar.SentyabrTask.OOP.Ticket;

public class MovieTiket extends SeatingTicket{
    private String movieLanguage;
    private String movieGenre;
    public MovieTiket(String name, double price, String description,
                      String movieLanguage, String movieGenre) {
        super(name, price, description);
        this.movieLanguage = movieLanguage;
        this.movieGenre = movieGenre;

    }
    public String getMovieLanguage() {
        return movieLanguage;
    }
    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Movie language: " + movieLanguage);
        System.out.println("Movie genre: " + movieGenre);
    }
}
