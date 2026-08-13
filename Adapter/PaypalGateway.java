/**
 * This is already implemented or legacy implementation or some sdk
 * that we can't modify or don't want to
 */
public class PaypalGateway implements PaypalGatewayInterface {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paypal charge amount: " + amount);
    }
}