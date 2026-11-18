
public class Main {

    public static void main(String[] args) {

        // Create the rental management system
        RentalManagement rental = new RentalManagement();

        // Display the sample vehicles
        System.out.println("=== Initial Vehicle List ===");
        rental.displayAvailableVehicles();

        // Test searching for a vehicle by name
        System.out.println("\n=== Search by Name ===");
        for (Vehicle vehicle : rental.searchVehiclesByName("Camry")) {
            System.out.println(vehicle);
        }

        // Test searching for a vehicle by brand
        System.out.println("\n=== Search by Brand ===");
        for (Vehicle vehicle : rental.searchVehiclesByBrand("Toyota")) {
            System.out.println(vehicle);
        }

        // Test renting a vehicle
        System.out.println("\n=== Rent Vehicle ===");
        if (rental.rentVehicle("Camry", "Toyota")) {
            System.out.println("Vehicle rented successfully.");
        } else {
            System.out.println("Rental failed.");
        }

        // Test displaying available vehicles after renting
        System.out.println("\n=== Available Vehicles After Rental ===");
        rental.displayAvailableVehicles();

        // Test returning a vehicle
        System.out.println("\n=== Return Vehicle ===");
        if (rental.returnVehicle("Camry", "Toyota")) {
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Return failed.");
        }

        // Display the final vehicle list
        System.out.println("\n=== Final Vehicle List ===");
        rental.displayAvailableVehicles();
    }
}
