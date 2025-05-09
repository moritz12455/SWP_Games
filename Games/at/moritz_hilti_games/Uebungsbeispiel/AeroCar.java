package at.moritz_hilti_games.Uebungsbeispiel;

public class AeroCar extends Vehicle {
    public AeroCar(String name, int id) {
        super(name, id);
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }
}