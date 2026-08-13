/**
 * Adapter design pattern is a structural design pattern
 * where to incompatible interface work together
 * Work like as converter
 */
public class Main {
    public static void main(String[] args) {
//        PaymentProcessor processor = new PaypalGatewayAdapter(new PaypalGateway());
        PaymentProcessor processor = new StripeGatewayAdapter(new StripeGateway());
        processor.processPayment(899.99);
    }
}