import java.util.Arrays;


class Pizza {
    String size;
    double price;

    // Default constructor.
    // this() calls the parameterized constructor with default values.
    Pizza() {
        this("Medium", 250.00);
    }

    // Parameterized constructor initializes pizza details.
    Pizza(String size, double price){
        this.size = size;
        this.price = price;
    }

    // First version of printOrder().
    // Prints only pizza size and price.
    void printOrder() {
        System.out.println("Pizza Size: " + size);
        System.out.println("Pizza Price: Rs. " + price);
    }

    // Second version of printOrder().
    // Accepts toppings as a parameter and prints additional details.
    // This is method overloading because the parameter list is different.
    void printOrder(String[] toppings) {
        System.out.println("Pizza Size: " + size);
        System.out.println("Pizza Price: Rs. " + price);
        System.out.println("Pizza Toppings: " + Arrays.toString(toppings));
    }
}

// Main class to demonstrate Pizza constructors and overloaded methods.
public class PizzaOverload {

    public static void main(String[] args) {

        // Create first Pizza object using the default constructor.
        Pizza pizza1 = new Pizza();

        // Call first overloaded method without toppings.
        System.out.println("Default Pizza Order:");
        pizza1.printOrder();

        // Create second Pizza object using the parameterized constructor.
        Pizza pizza2 = new Pizza("Large", 450.00);

        // Define toppings for the second pizza.
        String[] toppings = {"Cheese", "Olives", "Mushrooms"};

        // Call second overloaded method with toppings.
        System.out.println("\nCustomized Pizza Order:");
        pizza2.printOrder(toppings);
    }
}