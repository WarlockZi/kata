public class Humans {
public static void main(String[] args) {
    Human h1 = new Human();
    Human h2 = new Human((byte) 1, "d", "ds");
    Human h3 = new Human((byte) 1, "d", "ds", "sfds");
}

public static class Human {
    private byte age;
    private String name;
    private String secondName;
    private String favoriteSport;

    public Human() {
    }

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}
}
