public class StripeGatewayAdapter implements PaymentProcessor {
    private StripeGateway gateway;

    public StripeGatewayAdapter(StripeGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.charge(amount);
    }
}