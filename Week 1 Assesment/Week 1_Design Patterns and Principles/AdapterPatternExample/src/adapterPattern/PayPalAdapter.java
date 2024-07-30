package com.example.adapter;

class PayPalAdapter implements PaymentProcessor {
    private final PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}
