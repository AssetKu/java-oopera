public class Person {
    protected String name;
    protected String surname;
    protected String gender;

    public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}