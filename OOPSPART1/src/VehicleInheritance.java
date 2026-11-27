
/**
 * Parent class representing a general vehicle.
 */
class Vehicle {

    // Common properties inherited by child classes
    String brand;
    int speed;

    // Constructor to initialize vehicle details
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    public void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

/**
 * Single Inheritance:
 * Car inherits properties and methods from Vehicle.
 */
class Car extends Vehicle {

    // Car-specific property
    int numberOfDoors;

    // Constructor
    public Car(String brand, int speed, int numberOfDoors) {

        // Call parent class constructor
        super(brand, speed);

        this.numberOfDoors = numberOfDoors;
    }

    // Display car details
    public void displayCar() {
        displayVehicle();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

/**
 * Multilevel Inheritance:
 * SportsCar inherits from Car.
 * Car inherits from Vehicle.
 */
class SportsCar extends Car {

    // SportsCar-specific property
    boolean turboEnabled;

    // Constructor
    public SportsCar(String brand, int speed, int numberOfDoors,
                     boolean turboEnabled) {

        super(brand, speed, numberOfDoors);

        this.turboEnabled = turboEnabled;
    }

    // Display sports car details
    public void displaySportsCar() {
        displayCar();
        System.out.println("Turbo Enabled: " + turboEnabled);
    }
}

/**
 * Hierarchical Inheritance:
 * Bike and Car both inherit from Vehicle.
 */
class Bike extends Vehicle {

    // Bike-specific property
    boolean hasGear;

    // Constructor
    public Bike(String brand, int speed, boolean hasGear) {

        super(brand, speed);

        this.hasGear = hasGear;
    }

    // Display bike details
    public void displayBike() {
        displayVehicle();
        System.out.println("Has Gear: " + hasGear);
    }
}

/**
 * Main class to demonstrate different types of inheritance.
 */
public class VehicleInheritance {

    public static void main(String[] args) {

        // Single Inheritance: Vehicle -> Car
        System.out.println("===== CAR DETAILS =====");

        Car car = new Car("Toyota", 180, 4);
        car.displayCar();

        System.out.println();

        // Multilevel Inheritance: Vehicle -> Car -> SportsCar
        System.out.println("===== SPORTS CAR DETAILS =====");

        SportsCar sportsCar =
                new SportsCar("Ferrari", 320, 2, true);

        sportsCar.displaySportsCar();

        System.out.println();

        // Hierarchical Inheritance: Vehicle -> Bike
        System.out.println("===== BIKE DETAILS =====");

        Bike bike = new Bike("Royal Enfield", 120, true);
        bike.displayBike();
    }
}
