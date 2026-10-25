import java.util.Objects;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        setPaymentStrategy(paymentStrategy);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = Objects.requireNonNull(
                paymentStrategy,
                "Payment strategy cannot be null."
        );
    }

    public void processPayment(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                    "Payment amount must be a positive number."
            );
        }
        paymentStrategy.pay(amount);
    }
}


