
public class TempConverter {

    public static void main(String[] args) {

        final double CELSIUS = 25.0; // Stores the Celsius temperature as a named constant.

        double fahrenheit = (CELSIUS * 9 / 5) + 32; // Converts Celsius into Fahrenheit.

        System.out.println("Temperature Converter"); // Displays the application title.
        System.out.println("---------------------"); // Displays a separator.
        System.out.println("Celsius: " + CELSIUS); // Displays Celsius temperature.
        System.out.println("Fahrenheit: " + fahrenheit); // Displays converted Fahrenheit temperature.
    }
}
