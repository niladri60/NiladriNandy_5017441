package com.example.adapter;

class StripeAdapter implements PaymentProcessor {
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.chargePayment(amount);
    }
}
