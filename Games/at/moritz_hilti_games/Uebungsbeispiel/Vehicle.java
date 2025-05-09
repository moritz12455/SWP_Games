package at.moritz_hilti_games.Uebungsbeispiel;

public class Vehicle {
    private String name;
    private int id;

    public Vehicle(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}