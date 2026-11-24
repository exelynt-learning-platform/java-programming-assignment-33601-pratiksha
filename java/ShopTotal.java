
public class ShopTotal {

    // Constant for tax percentage
    private static final double TAX_RATE = 0.18;

    public static void main(String[] args) {

        // Shopping item prices
        double itemPrice1 = 500.00;
        double itemPrice2 = 300.00;
        double itemPrice3 = 200.00;

        // Calculate subtotal
        double subTotal = itemPrice1 + itemPrice2 + itemPrice3;

        // Calculate tax and final total
        double taxAmount = subTotal * TAX_RATE;
        double totalAmount = subTotal + taxAmount;

        // Display shopping bill
        System.out.println("----- Shopping Bill -----");
        System.out.println("Subtotal: Rs. " + subTotal);
        System.out.println("Tax (18%): Rs. " + taxAmount);
        System.out.println("Total Amount: Rs. " + totalAmount);
    }
}
