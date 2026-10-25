public class PalmPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Scanning palm...");
        System.out.println("Palm recognized successfully.");
        System.out.println("Paid " + amount + " using Palm Payment.");
    }
}
