
// This class demonstrates Java type casting and type conversion.
public class CartCasting {

    public static void main(String[] args) {

        // Declare an int variable to store product quantity.
        int quantity = 5;

        // Declare a double variable to store product price.
        double price = 199.99;

        // Declare a float variable to store product weight.
        float weight = 2.5f;

        // Declare a char variable to store product category.
        char category = 'E';

        // Print original variable values.
        System.out.println("----- Original Values -----");
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: Rs. " + price);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Category: " + category);

        // IMPLICIT CASTING: Convert int quantity to double automatically.
        // No data loss occurs because double can store larger numeric values.
        double convertedQuantity = quantity;

        System.out.println("\n----- Implicit Casting -----");
        System.out.println("Integer Quantity: " + quantity);
        System.out.println("Double Quantity: " + convertedQuantity);

        // EXPLICIT CASTING: Convert double price to int manually.
        // Data loss occurs because decimal digits are removed.
        int convertedPrice = (int) price;

        System.out.println("\n----- Explicit Casting -----");
        System.out.println("Original Double Price: " + price);
        System.out.println("Converted Integer Price: " + convertedPrice);

        // Convert integer quantity into String.
        String quantityString = String.valueOf(quantity);

        // Convert double price into String.
        String priceString = String.valueOf(price);

        System.out.println("\n----- Number to String Conversion -----");
        System.out.println("Quantity as String: " + quantityString);
        System.out.println("Price as String: " + priceString);

        // Convert a String containing a whole number into int.
        String cartPrice = "250";
        int convertedCartPrice = Integer.parseInt(cartPrice);

        // Convert a String containing a decimal number into double.
        String decimalPrice = "499.99";
        double convertedDecimalPrice = Double.parseDouble(decimalPrice);

        System.out.println("\n----- String to Number Conversion -----");
        System.out.println("String Price: " + cartPrice);
        System.out.println("Integer Price: " + convertedCartPrice);

        System.out.println("String Decimal Price: " + decimalPrice);
        System.out.println("Double Price: " + convertedDecimalPrice);

        // Print a summary of data loss.
        System.out.println("\n----- Data Loss Summary -----");
        System.out.println("Original Price: " + price);
        System.out.println("Price After Explicit Casting: " + convertedPrice);
        System.out.println("Lost Decimal Part: " + (price - convertedPrice));
    }
}
