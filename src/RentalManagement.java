
import java.util.ArrayList;

public class RentalManagement {

    // Stores the vehicles managed by the rental agency
    private ArrayList<Vehicle> vehicles;

    // Initializes the vehicle collection with sample data
    public RentalManagement() {
        vehicles = new ArrayList<>();

        // Add the required sample vehicles
        Vehicle car1 = new Vehicle("Camry", "Toyota");
        car1.setYear(2024);
        car1.setInsuranceIncluded(true);
        car1.setDailyRate(150.0);

        Vehicle car2 = new Vehicle("Taurus", "Ford");
        car2.setYear(2023);
        car2.setInsuranceIncluded(false);
        car2.setDailyRate(180.0);

        Vehicle car3 = new Vehicle("Accord", "Honda");
        car3.setYear(2025);
        car3.setInsuranceIncluded(true);
        car3.setDailyRate(170.0);

        // Add the sample vehicles to the collection
        addVehicle(car1);
        addVehicle(car2);
        addVehicle(car3);
    }

    // Adds a new vehicle after checking its information
    public boolean addVehicle(Vehicle vehicle) {

        if (vehicle == null) {
            return false;
        }

        if (vehicle.getName() == null || vehicle.getName().trim().isEmpty()
                || vehicle.getBrand() == null || vehicle.getBrand().trim().isEmpty()
                || vehicle.getYear() <= 0 || vehicle.getDailyRate() <= 0) {
            return false;
        }

        // Prevent adding the same vehicle twice
        for (Vehicle existing : vehicles) {
            if (existing.getName().equalsIgnoreCase(vehicle.getName())
                    && existing.getBrand().equalsIgnoreCase(vehicle.getBrand())) {
                return false;
            }
        }

        vehicles.add(vehicle);
        return true;
    }

    // Returns a list containing only available vehicles
    public ArrayList<Vehicle> getAvailableVehicles() {

        ArrayList<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                availableVehicles.add(vehicle);
            }
        }

        return availableVehicles;
    }

    // Displays all currently available vehicles
    public void displayAvailableVehicles() {

        ArrayList<Vehicle> availableVehicles = getAvailableVehicles();

        if (availableVehicles.isEmpty()) {
            System.out.println("No vehicles are currently available.");
            return;
        }

        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle);
        }
    }

    // Searches for vehicles by their name
    public ArrayList<Vehicle> searchVehiclesByName(String name) {

        ArrayList<Vehicle> results = new ArrayList<>();

        if (name == null || name.trim().isEmpty()) {
            return results;
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().toLowerCase()
                    .contains(name.trim().toLowerCase())) {
                results.add(vehicle);
            }
        }

        return results;
    }

    // Searches for vehicles by their brand
    public ArrayList<Vehicle> searchVehiclesByBrand(String brand) {

        ArrayList<Vehicle> results = new ArrayList<>();

        if (brand == null || brand.trim().isEmpty()) {
            return results;
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getBrand().toLowerCase()
                    .contains(brand.trim().toLowerCase())) {
                results.add(vehicle);
            }
        }

        return results;
    }

    // Finds and rents a vehicle if it is available
    public boolean rentVehicle(String name, String brand) {

        Vehicle vehicle = findVehicle(name, brand);

        if (vehicle == null || !vehicle.isAvailable()) {
            return false;
        }

        vehicle.setAvailable(false);
        return true;
    }

    // Returns a rented vehicle to the agency
    public boolean returnVehicle(String name, String brand) {

        Vehicle vehicle = findVehicle(name, brand);

        if (vehicle == null || vehicle.isAvailable()) {
            return false;
        }

        vehicle.setAvailable(true);
        return true;
    }

    // Finds a vehicle using its name and brand
    private Vehicle findVehicle(String name, String brand) {

        if (name == null || brand == null) {
            return null;
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().equalsIgnoreCase(name.trim())
                    && vehicle.getBrand().equalsIgnoreCase(brand.trim())) {
                return vehicle;
            }
        }

        return null;
    }
}
