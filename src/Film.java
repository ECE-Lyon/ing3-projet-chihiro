import java.util.HashMap;
import java.util.Map;

public class Film {

    public enum MovieGenre {
        COMEDIE,
        DRAME,
        FANTASTIQUE,
        HORREUR,
        POLICIER,
        AVANTURE,

        //ETC
    }

    private Map<Integer, Customer> reservation;

    private MovieGenre movieGenre;

    private String title;

    private String releaseDate;

    private int duration;

    private int reamainingSeats;

    public Film(){
        this.reservation = new HashMap<>();
    }

    public Map<Integer, Customer> getReservation() {
        return reservation;
    }

    public void setReservation(Map<Integer, Customer> reservations) {
        this.reservation = reservations;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public int getReamainingSeats() {
        return reamainingSeats;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReamainingSeats(int reamainingSeats) {
        this.reamainingSeats = reamainingSeats;
    }
}
