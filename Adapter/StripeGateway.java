/**
 * This is already implemented or legacy implementation or some sdk
 * that we can't modify or don't want to
 */
public class StripeGateway implements StripeGatewayInterface {
    @Override
    public void charge(double amount) {
        System.out.println("Stripe charge amount: " + amount);
    }
}