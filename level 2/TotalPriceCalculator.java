public class TotalPriceCalculator {
    public static void main(String[] args) {
        int unitPrice = 50;    
        int quantity = 10;     
        int totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);
    }
}
