import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(actors);
    }

    // 1. Печать информации о режиссёре
    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.getFullName());
    }

    // 2. Печать списка актёров
    public void printActors() {
        System.out.println("Актёры:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getFullName() + " (" + actor.getHeight() + " см)");
        }
    }

    // 3. Добавление актёра без дублирования
    public void addActor(Actor actor) {
        for (Actor a : listOfActors) {
            if (a.name.equals(actor.name)
                    && a.surname.equals(actor.surname)
                    && a.getHeight() == actor.getHeight()) {
                System.out.println("Предупреждение: такой актёр уже существует.");
                return;
            }
        }
        listOfActors.add(actor);
    }

    // 4. Замена актёра по фамилии
    public void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Предупреждение: актёр с фамилией " + surnameToReplace + " не найден.");
    }
}