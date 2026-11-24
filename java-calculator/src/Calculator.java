
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("===== Java Calculator =====");

            System.out.print("Enter first number: ");
            double num1 = readNumber(scanner);

            System.out.print("Enter operator (+, -, *, /, %): ");
            String operator = scanner.nextLine().trim();

            if (!operator.matches("[+\\-*/%]")) {
                System.out.println("Invalid operator! Please use +, -, *, / or %.");
                return;
            }

            System.out.print("Enter second number: ");
            double num2 = readNumber(scanner);

            double result;

            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;

                case "%":
                    if (num2 == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                        return;
                    }
                    result = num1 % num2;
                    break;

                default:
                    System.out.println("Invalid operator.");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }

    private static double readNumber(Scanner scanner) {

        while (true) {
            String input = scanner.nextLine().trim();

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid number! Please enter a numeric value: ");
            }
        }
    }
}
