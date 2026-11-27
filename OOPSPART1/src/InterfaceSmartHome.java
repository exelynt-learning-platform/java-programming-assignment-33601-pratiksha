
/**
 * Interface representing devices that can be switched ON and OFF.
 */
interface Switchable {

    // Abstract methods that implementing classes must define
    void turnOn();

    void turnOff();
}

/**
 * Interface representing devices that support scheduling.
 */
interface Schedulable {

    // Abstract method for scheduling device operations
    void schedule();
}

/**
 * SmartLight implements two interfaces.
 * Multiple inheritance through interfaces:
 * A class can implement multiple interfaces in Java.
 */
class SmartLight implements Switchable, Schedulable {

    // Instance variable to store light name
    private String lightName;

    // Constructor to initialize light name
    public SmartLight(String lightName) {
        this.lightName = lightName;
    }

    /**
     * Implementation of turnOn() from Switchable interface.
     */
    @Override
    public void turnOn() {
        System.out.println(lightName + " is turned ON.");
    }

    /**
     * Implementation of turnOff() from Switchable interface.
     */
    @Override
    public void turnOff() {
        System.out.println(lightName + " is turned OFF.");
    }

    /**
     * Implementation of schedule() from Schedulable interface.
     */
    @Override
    public void schedule() {
        System.out.println(lightName + " is scheduled to turn ON at 7 PM.");
    }
}


/**
 * Main class to demonstrate Java interfaces.
 */
public class InterfaceSmartHome {
    public static void main(String[] args) {

        // Create first SmartLight object
        SmartLight livingRoomLight = new SmartLight("Living Room Light");

        // Create second SmartLight object
        SmartLight bedroomLight = new SmartLight("Bedroom Light");

        // Call all interface methods on first object
        System.out.println("===== LIVING ROOM LIGHT =====");

        livingRoomLight.turnOn();
        livingRoomLight.schedule();
        livingRoomLight.turnOff();

        System.out.println();

        // Call all interface methods on second object
        System.out.println("===== BEDROOM LIGHT =====");

        bedroomLight.turnOn();
        bedroomLight.schedule();
        bedroomLight.turnOff();
    }
}
