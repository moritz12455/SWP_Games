package at.moritz_hilti_games.Uebungsbeispiel;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Vehicle> vehicles;

    public CarDealer() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void printVehicles() {
        System.out.println("Vehicle List:");
        for (Vehicle v : vehicles) {
            System.out.println("- ID: " + v.getId() + ", Name: " + v.getName());
        }
    }
}