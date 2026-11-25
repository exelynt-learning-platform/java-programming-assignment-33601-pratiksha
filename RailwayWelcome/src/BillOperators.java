
// This class demonstrates Java operators using a restaurant bill.
public class BillOperators {

    public static void main(String[] args) {

        // Item prices in rupees.
        double pizzaPrice = 250.00;
        double burgerPrice = 150.00;
        double drinkPrice = 50.00;

        // Quantities of each restaurant item.
        int pizzaQuantity = 2;
        int burgerQuantity = 1;
        int drinkQuantity = 2;

        // Calculate individual item totals using multiplication.
        double pizzaTotal = pizzaPrice * pizzaQuantity;
        double burgerTotal = burgerPrice * burgerQuantity;
        double drinkTotal = drinkPrice * drinkQuantity;

        // Calculate subtotal using addition.
        double subTotal = pizzaTotal + burgerTotal + drinkTotal;

        // Calculate 5% tax using multiplication.
        double taxRate = 5.0;
        double taxAmount = subTotal * taxRate / 100;

        // Calculate final bill using addition.
        double finalBill = subTotal + taxAmount;

        // Calculate amount payable by each of 3 people.
        int numberOfPeople = 3;
        double amountPerPerson = finalBill / numberOfPeople;

        // Check whether the customer is eligible for a discount.
        boolean isDiscountEligible = subTotal >= 500 && numberOfPeople >= 2;

        // Apply a 10% discount if eligible.
        double discount = 0.0;

        if (isDiscountEligible) {
            discount = subTotal * 10 / 100;
        }

        // Calculate final amount after discount and tax.
        double amountAfterDiscount = subTotal - discount;
        double finalAmount = amountAfterDiscount
                + (amountAfterDiscount * taxRate / 100);

        // Check whether table number 8 is even using bitwise AND.
        int tableNumber = 8;
        boolean isEvenTable = (tableNumber & 1) == 0;

        // Print restaurant bill details.
        System.out.println("===== RESTAURANT BILL =====");
        System.out.println("Pizza Total: Rs. " + pizzaTotal);
        System.out.println("Burger Total: Rs. " + burgerTotal);
        System.out.println("Drink Total: Rs. " + drinkTotal);

        // Print arithmetic operator results.
        System.out.println("\n----- Arithmetic Operations -----");
        System.out.println("Subtotal: Rs. " + subTotal);
        System.out.println("Tax (5%): Rs. " + taxAmount);
        System.out.println("Final Bill: Rs. " + finalBill);
        System.out.println("Amount Per Person: Rs. " + amountPerPerson);

        // Print relational and logical operator results.
        System.out.println("\n----- Discount Eligibility -----");
        System.out.println("Subtotal >= 500: " + (subTotal >= 500));
        System.out.println("People >= 2: " + (numberOfPeople >= 2));
        System.out.println("Discount Eligible: " + isDiscountEligible);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Amount After Discount and Tax: Rs. " + finalAmount);

        // Print bitwise operator result.
        System.out.println("\n----- Bitwise Operation -----");
        System.out.println("Table Number: " + tableNumber);
        System.out.println("Is Table Number Even? " + isEvenTable);
    }
}
