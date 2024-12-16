package dev.kataray.javaconcepts.interfaces;

interface PaymentProcessor {
    void processPayment(double amount); // Abstract method
}

// Implement the interface for Credit Card payment
class CreditCardPayment implements PaymentProcessor {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }
}

// Implement the interface for PayPal payment
class PayPalPayment implements PaymentProcessor {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
    }
}

public class interfaceEx {
    public static void main(String[] args) {

        // example of polymorphism here btw..
        PaymentProcessor creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentProcessor payPalPayment = new PayPalPayment("user@example.com");

        // Process payments
        creditCardPayment.processPayment(250.75);
        payPalPayment.processPayment(99.99);
    }
}

