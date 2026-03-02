import java.util.List;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> actors,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, actors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}