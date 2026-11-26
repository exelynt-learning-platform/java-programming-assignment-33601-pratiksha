
import java.util.Scanner;

public class InteractiveConverter {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variables of different data types
        int conversionCount = 0;
        double value;
        double result;
        char conversionChoice;
        boolean keepRunning = true;
        String input;

        System.out.println("================================");
        System.out.println("     INTERACTIVE UNIT CONVERTER");
        System.out.println("================================");

        // Continue until the user chooses to exit
        while (keepRunning) {

            // Display conversion menu
            System.out.println("\nChoose a conversion:");
            System.out.println("1. Kilometers to Miles");
            System.out.println("2. Miles to Kilometers");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Pounds to Kilograms");
            System.out.println("5. Celsius to Fahrenheit");
            System.out.println("6. Fahrenheit to Celsius");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            input = scanner.nextLine().trim();

            // Validate that the user entered one character
            if (input.length() != 1) {
                System.out.println("Invalid choice! Please enter 0-6.");
                continue;
            }

            conversionChoice = input.charAt(0);

            // Exit the application when the user enters 0
            if (conversionChoice == '0') {
                keepRunning = false;
                System.out.println("Thank you for using the converter!");
                break;
            }

            // Validate conversion choice
            if (conversionChoice < '1' || conversionChoice > '6') {
                System.out.println("Invalid choice! Please select 1-6.");
                continue;
            }

            // Read the value to convert
            System.out.print("Enter value to convert: ");
            input = scanner.nextLine().trim();

            // Convert the input into a double
            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Please enter a valid numeric value.");
                continue;
            }

            // Reject infinite and NaN values
            if (!Double.isFinite(value)) {
                System.out.println("Invalid value! Please enter a finite number.");
                continue;
            }

            // Distance and weight cannot be negative
            if ((conversionChoice >= '1' && conversionChoice <= '4')
                    && value < 0) {
                System.out.println("Distance and weight cannot be negative.");
                continue;
            }

            // Perform conversion using switch
            switch (conversionChoice) {

                case '1':
                    // Kilometers to Miles
                    result = value * 0.621371;
                    System.out.printf("%.2f km = %.2f miles%n", value, result);
                    break;

                case '2':
                    // Miles to Kilometers
                    result = value / 0.621371;
                    System.out.printf("%.2f miles = %.2f km%n", value, result);
                    break;

                case '3':
                    // Kilograms to Pounds
                    result = value * 2.20462;
                    System.out.printf("%.2f kg = %.2f pounds%n", value, result);
                    break;

                case '4':
                    // Pounds to Kilograms
                    result = value / 2.20462;
                    System.out.printf("%.2f pounds = %.2f kg%n", value, result);
                    break;

                case '5':
                    // Celsius to Fahrenheit
                    result = (value * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit%n",
                            value, result);
                    break;

                case '6':
                    // Fahrenheit to Celsius
                    result = (value - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius%n",
                            value, result);
                    break;

                default:
                    System.out.println("Invalid conversion choice.");
                    continue;
            }

            // Increase successful conversion count
            conversionCount++;

            System.out.println("Total successful conversions: "
                    + conversionCount);
        }

        // Close Scanner after the loop ends
        scanner.close();
    }
}
