
/*
 * Car class represents a car with its model and price.
 */
class Car {

    // Field to store the car model
    String model;

    // Field to store the car price
    double price;
}

// Main class to demonstrate creating Car objects
public class CarDemo {

    public static void main(String[] args) {

        // Create the first Car object
        Car car1 = new Car();

        // Assign values to the first Car object
        car1.model = "Toyota Fortuner";
        car1.price = 3500000.00;

        // Create the second Car object
        Car car2 = new Car();

        // Assign values to the second Car object
        car2.model = "Hyundai Creta";
        car2.price = 1500000.00;

        // Print the first car details
        System.out.println("First Car Details:");
        System.out.println("Model: " + car1.model);
        System.out.println("Price: Rs. " + car1.price);

        // Print the second car details
        System.out.println("\nSecond Car Details:");
        System.out.println("Model: " + car2.model);
        System.out.println("Price: Rs. " + car2.price);
    }
}
