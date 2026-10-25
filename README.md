# Payment System — Strategy Pattern

## Introduction

This project demonstrates the Strategy Design Pattern using a payment system implemented in Java. It allows users to choose between different payment methods and switch between them while the application is running.

## Payment Methods

The application supports four payment strategies:

- **Credit Card:** Simulates payment using a bank card.
- **PayPal:** Simulates payment using PayPal.
- **Cash:** Simulates cash payment.
- **Palm Payment:** Simulates biometric palm recognition and payment confirmation.

All payment methods implement the `PaymentStrategy` interface.

## Project Structure

- `PaymentStrategy.java` — defines the common payment interface.
- `CreditCardPayment.java` — implements credit card payments.
- `PayPalPayment.java` — implements PayPal payments.
- `CashPayment.java` — implements cash payments.
- `PalmPayment.java` — simulates palm payment.
- `PaymentProcessor.java` — stores the selected strategy, validates the amount, and delegates payment execution.
- `Main.java` — provides the console menu and allows users to change payment methods at runtime.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure a compatible JDK is configured.
3. Open `Main.java`.
4. Run the `main()` method.
5. Select a payment method from the console menu.
6. Enter the payment amount.
7. Choose another method to test runtime strategy switching.
8. Enter `0` to exit.

## Strategy Pattern

The `PaymentProcessor` class acts as the Context. It stores a reference to the `PaymentStrategy` interface and delegates payment execution to the selected strategy.

The concrete strategies can be replaced at runtime using `setPaymentStrategy()`. The context does not use conditional statements to identify concrete payment strategy types.

## Limitations

This is an educational simulation. It does not process real payments, connect to PayPal or banking services, or perform actual biometric palm recognition.

## Author

SE-2527 MELIS ANEL