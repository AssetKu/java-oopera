//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Поехали!");
//    }
//}
//

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director d = new Director("Анна", "Иванова", "F", 12);

        Actor a1 = new Actor("Павел", "Смирнов", "M", 180);
        Actor a2 = new Actor("Ирина", "Ковалёва", "F", 168);

        List<Actor> actors = List.of(a1, a2);

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                140,
                d,
                actors,
                "Чайковский",
                "Либретто балета…",
                "Мариус Петипа"
        );

        ballet.printDirectorInfo();
        ballet.printActors();
        ballet.printLibretto();

        Actor replacement = new Actor("Олег", "Смирнов", "M", 182);
        ballet.replaceActor("Смирнов", replacement);
    }
}