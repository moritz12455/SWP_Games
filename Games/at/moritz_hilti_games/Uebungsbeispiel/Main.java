package at.moritz_hilti_games.Uebungsbeispiel;

public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();
        dealer.addVehicle(new Vehicle("BMW X5", 101));
        dealer.addVehicle(new Vehicle("Audi A6", 102));
        dealer.printVehicles();
    }
}
