
import java.util.Scanner;

public class TrafficDecisions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Read a number and check whether it is positive, negative, or zero.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check whether the number is greater than zero.
        if (number > 0) {
            System.out.println("Positive");
        }
        // Check whether the number is less than zero.
        else if (number < 0) {
            System.out.println("Negative");
        }
        // If neither condition is true, the number must be zero.
        else {
            System.out.println("Zero");
        }

        // 2. Read speed and decide the driving action.
        System.out.print("\nEnter vehicle speed: ");
        int speed = scanner.nextInt();

        // Speed below 40 is considered slow.
        if (speed < 40) {
            System.out.println("Action: Slow - You can increase speed safely.");
        }
        // Speed from 40 to 80 is considered normal.
        else if (speed <= 80) {
            System.out.println("Action: Normal - Maintain your speed.");
        }
        // Speed above 80 is considered overspeeding.
        else {
            System.out.println("Action: Overspeeding - Reduce your speed.");
        }

        // 3. Read traffic signal code and display its meaning.
        System.out.print("\nEnter traffic signal code (1-3): ");
        int signalCode = scanner.nextInt();

        // Switch selects the matching traffic signal code.
        switch (signalCode) {
            case 1:
                System.out.println("Signal: Red - Stop");
                break;
            case 2:
                System.out.println("Signal: Yellow - Get ready");
                break;
            case 3:
                System.out.println("Signal: Green - Go");
                break;
            // Default runs when the code is not between 1 and 3.
            default:
                System.out.println("Invalid traffic signal code");
        }

        // 4. Read a day code and display the day name.
        System.out.print("\nEnter day code (1-7): ");
        int dayCode = scanner.nextInt();

        // Switch selects the day name based on the entered code.
        switch (dayCode) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // Default runs when the day code is outside 1-7.
            default:
                System.out.println("Invalid day code");
        }

        scanner.close();
    }
}
