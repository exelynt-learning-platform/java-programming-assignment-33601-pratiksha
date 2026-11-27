/**
 * Parent class representing a general payment.
 */
class Payment{
    /**
     * Compile-time polymorphism: Method overloading.
     * Accepts only the payment amount.
     */
    public void pay(double amount) {
        System.out.println("Payment Amount: Rs. " + amount);
    }

    /**
     * Overloaded pay() method.
     * Accepts payment amount and currency.
     */
    public void pay(double amount, String currency) {
        System.out.println("Payment Amount: " + amount + " " + currency);
    }
}

/**
 * Child class representing card payments.
 * Demonstrates runtime polymorphism through method overriding.
 */
class CardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card Payment...");
        System.out.println("Card Payment Successful: Rs. " + amount);
    }
}

/**
 * Child class representing UPI payments.
 * Demonstrates runtime polymorphism through method overriding.
 */
class UpiPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI Payment Successful: Rs. " + amount);
    }
}


/**
 * Main class to demonstrate compile-time and runtime polymorphism.
 */
public class PaymentPolymorphism {

    public static void main(String[] args) {

        // ====================================
        // COMPILE-TIME POLYMORPHISM
        // Method Overloading
        // ====================================

        Payment payment = new Payment();

        System.out.println("===== COMPILE-TIME POLYMORPHISM =====");

        // Calls pay() with one parameter
        payment.pay(1500.00);

        // Calls overloaded pay() with two parameters
        payment.pay(2500.00, "INR");

        System.out.println();

        // ====================================
        // RUNTIME POLYMORPHISM
        // Method Overriding
        // ====================================

        System.out.println("===== RUNTIME POLYMORPHISM =====");

        // Parent class reference holding CardPayment object
        Payment card = new CardPayment();

        // Calls CardPayment's overridden pay() method
        card.pay(5000.00);

        System.out.println();

        // Parent class reference holding UpiPayment object
        Payment upi = new UpiPayment();

        // Calls UpiPayment's overridden pay() method
        upi.pay(1200.00);
    }
}
