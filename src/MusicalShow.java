import java.util.List;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       List<Actor> actors, String musicAuthor, String librettoText) {
        super(title, duration, director, actors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Печать либретто
    public void printLibretto() {
        System.out.println("Либретто:\n" + librettoText);
    }
}