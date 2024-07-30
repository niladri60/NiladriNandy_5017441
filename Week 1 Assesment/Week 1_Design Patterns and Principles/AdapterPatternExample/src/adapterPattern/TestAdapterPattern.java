package adapterPattern;

public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using PayPal payment gateway through the adapter
        PayPal paypal = new PayPal();
        PaymentProcessor paypalProcessor = new PayPalAdapter(paypal);
        paypalProcessor.processPayment(100.00);

        // Using Stripe payment gateway through the adapter
        Stripe stripe = new Stripe();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        stripeProcessor.processPayment(200.00);
    }
}
