
// Import Scanner to read input from the keyboard.
import java.util.Scanner;

// This class demonstrates taking gym member details from the user.
public class GymInput {

    // Main method is the starting point of the program.
    public static void main(String[] args) {

        // Create a Scanner object to read keyboard input.
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name.
        System.out.print("Enter your name: ");

        // nextLine() reads the complete member name, including spaces.
        // Store the entered name in a String variable.
        String memberName = scanner.nextLine();

        // Ask the user to enter their age.
        System.out.print("Enter your age: ");

        // nextInt() reads the age as an integer.
        // Store the entered age in an int variable.
        int age = scanner.nextInt();

        // Ask the user to enter their weight.
        System.out.print("Enter your weight in kg: ");

        // nextDouble() reads the weight as a decimal number.
        // Store the entered weight in a double variable.
        double weight = scanner.nextDouble();

        // Consume the leftover newline after nextDouble().
        // This prevents issues if nextLine() is used afterwards.
        scanner.nextLine();

        // Display a personalized welcome message.
        System.out.println("\n===== GYM MEMBERSHIP WELCOME =====");
        System.out.println("Welcome, " + memberName + "!");
        System.out.println("Your age: " + age + " years");
        System.out.println("Your weight: " + weight + " kg");
        System.out.println("Welcome to our gym. Let's achieve your fitness goals!");

        // Close the Scanner after all inputs have been read.
        scanner.close();

    } // End of main method.

} // End of GymInput class.
