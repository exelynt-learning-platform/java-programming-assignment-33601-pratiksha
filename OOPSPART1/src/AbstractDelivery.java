/**
 * Abstract parent class representing a delivery service.
 */
abstract class Delivery{
    // Common property for all delivery types
    protected String destination;

    // Constructor to initialize destination
    public Delivery(String destination) {
        this.destination = destination;
    }

    /**
     * Abstract method:
     * Has no implementation in the parent class.
     * Child classes must provide their own implementation.
     */
    public abstract double calculateCharge();

    /**
     * Concrete method:
     * Contains an implementation and can be inherited by child classes.
     */
    public void displayDeliveryInfo() {
        System.out.println("Destination: " + destination);
    }
}

/**
 * StandardDelivery implements the abstract calculateCharge() method.
 */
class StandardDelivery extends Delivery {

    private double weight;

    // Constructor
    public StandardDelivery(String destination, double weight) {
        super(destination);
        this.weight = weight;
    }

    /**
     * Concrete implementation of the abstract method.
     * Standard delivery costs Rs. 50 per kg.
     */
    @Override
    public double calculateCharge() {
        return weight * 50;
    }

    // Display standard delivery details
    public void displayDetails() {
        System.out.println("Delivery Type: Standard");
        displayDeliveryInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Delivery Charge: Rs. " + calculateCharge());
    }
}

/**
 * ExpressDelivery implements the abstract calculateCharge() method.
 */
class ExpressDelivery extends Delivery {

    private double weight;

    // Constructor
    public ExpressDelivery(String destination, double weight) {
        super(destination);
        this.weight = weight;
    }

    /**
     * Concrete implementation of the abstract method.
     * Express delivery costs Rs. 100 per kg.
     */
    @Override
    public double calculateCharge() {
        return weight * 100;
    }

    // Display express delivery details
    public void displayDetails() {
        System.out.println("Delivery Type: Express");
        displayDeliveryInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Delivery Charge: Rs. " + calculateCharge());
    }
}

/**
 * Main class to demonstrate abstraction and runtime polymorphism.
 */
public class AbstractDelivery {

    public static void main(String[] args) {

        // Delivery reference holding StandardDelivery object
        Delivery standard = new StandardDelivery("Pune", 5);

        // Delivery reference holding ExpressDelivery object
        Delivery express = new ExpressDelivery("Mumbai", 3);

        System.out.println("===== STANDARD DELIVERY =====");

        // Call concrete and overridden methods through parent reference
        standard.displayDeliveryInfo();
        System.out.println("Delivery Charge: Rs. " +
                standard.calculateCharge());

        System.out.println();

        System.out.println("===== EXPRESS DELIVERY =====");

        // Call concrete and overridden methods through parent reference
        express.displayDeliveryInfo();
        System.out.println("Delivery Charge: Rs. " +
                express.calculateCharge());
    }
}