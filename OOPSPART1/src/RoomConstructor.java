
import java.util.Scanner;

// Room class represents a hotel room
class Room {

    // Fields to store room details
    int number;
    String type;
    double price;

    // Default constructor assigns default values
    Room() {
        number = 101;
        type = "Standard";
        price = 1500.00;
    }

    // Parameterized constructor accepts values from the user
    Room(int number, String type, double price) {
        this.number = number;
        this.type = type;
        this.price = price;
    }

    // Method to display room details
    void displayDetails() {
        System.out.println("Room Number: " + number);
        System.out.println("Room Type: " + type);
        System.out.println("Room Price: Rs. " + price);
    }
}

// Main class to demonstrate constructors
public class RoomConstructor {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create first room using the default constructor
        Room room1 = new Room();

        System.out.println("Default Room Details:");
        room1.displayDetails();

        // Read room details from the user
        System.out.println("\nEnter Room Details:");

        System.out.print("Enter room number: ");
        int number = scanner.nextInt();

        scanner.nextLine(); // Consume the leftover newline

        System.out.print("Enter room type: ");
        String type = scanner.nextLine();

        System.out.print("Enter room price: ");
        double price = scanner.nextDouble();

        // Create second room using the parameterized constructor
        Room room2 = new Room(number, type, price);

        // Display second room details
        System.out.println("\nParameterized Room Details:");
        room2.displayDetails();

        // Close Scanner
        scanner.close();
    }
}
