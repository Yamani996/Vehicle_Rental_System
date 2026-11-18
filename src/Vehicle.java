
public class Vehicle {

    // Basic information about each vehicle
    private String name;
    private String brand;
    private boolean available;
    private int year;
    private boolean insuranceIncluded;
    private double dailyRate;

    // Creates a vehicle and marks it as available by default
    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
        this.available = true;
    }

    // Returns the vehicle name
    public String getName() {
        return name;
    }

    // Updates the vehicle name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the vehicle brand
    public String getBrand() {
        return brand;
    }

    // Updates the vehicle brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Checks if the vehicle is available for rent
    public boolean isAvailable() {
        return available;
    }

    // Changes the vehicle availability status
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Returns the manufacturing year
    public int getYear() {
        return year;
    }

    // Updates the manufacturing year
    public void setYear(int year) {
        this.year = year;
    }

    // Checks if insurance is included in the rental price
    public boolean isInsuranceIncluded() {
        return insuranceIncluded;
    }

    // Updates the insurance information
    public void setInsuranceIncluded(boolean insuranceIncluded) {
        this.insuranceIncluded = insuranceIncluded;
    }

    // Returns the daily rental rate
    public double getDailyRate() {
        return dailyRate;
    }

    // Updates the daily rental rate
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Returns all vehicle details as a readable string
    @Override
    public String toString() {
        return "Name: " + name +
                " | Brand: " + brand +
                " | Year: " + year +
                " | Available: " + available +
                " | Insurance Included: " + insuranceIncluded +
                " | Daily Rate: " + dailyRate;
    }
}
