
public class CoffeeMachine {

    // Main method: program execution starts here.
    public static void main(String[] args) {

        // Calls showMenu() to display available coffee options.
        showMenu();

        // Calls brewCoffee() and passes the cup size as an argument.
        brewCoffee("Large");

        // Calls brewCoffee() again with a different cup size.
        brewCoffee("Small");
    }

    // Displays the coffee menu.
    public static void showMenu() {
        System.out.println("Welcome to Coffee Corner!");
        System.out.println("Available coffees:");
        System.out.println("1. Cappuccino");
        System.out.println("2. Espresso");
        System.out.println("3. Latte");
    }

    // Prepares coffee based on the cup size received as an argument.
    public static void brewCoffee(String cupSize) {
        System.out.println("Preparing " + cupSize + " cup of coffee...");
        System.out.println("Your " + cupSize + " coffee is ready!");
    }
}
