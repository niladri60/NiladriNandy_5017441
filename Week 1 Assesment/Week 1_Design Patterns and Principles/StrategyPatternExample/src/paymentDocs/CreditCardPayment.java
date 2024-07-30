package paymentDocs;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card. Card Holder: " + cardHolderName);
    }
}
