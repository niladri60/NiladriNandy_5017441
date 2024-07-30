package paymentDocs;

public class PaymentSystemTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "Niladri Nandy");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.pay(250.00);

        PaymentStrategy payPalPayment = new PayPalPayment("niladrinandy58@gmail.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.pay(150.00);
    }
}
