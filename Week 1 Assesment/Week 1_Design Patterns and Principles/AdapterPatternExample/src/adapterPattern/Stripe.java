package adapterPattern;

public class Stripe {
    public void chargePayment(double amount) {
        System.out.println("Charging payment of $" + amount + " through Stripe.");
    }
}
