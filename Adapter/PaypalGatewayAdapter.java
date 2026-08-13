public class PaypalGatewayAdapter implements PaymentProcessor {
    private PaypalGateway gateway;

    public PaypalGatewayAdapter(PaypalGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}