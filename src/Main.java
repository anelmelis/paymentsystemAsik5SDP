import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor =
                new PaymentProcessor(new CreditCardPayment());

        boolean running = true;

        System.out.println("Welcome to Payment System!");

        while (running) {
            System.out.println("\nChoose payment method:");
            System.out.println("1. Credit Card");
            System.out.println("2. PayPal");
            System.out.println("3. Cash");
            System.out.println("4. Palm Payment");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                running = false;
                System.out.println("Thank you for using Payment System.");
                continue;
            }

            try {
                PaymentStrategy strategy = selectStrategy(choice);
                processor.setPaymentStrategy(strategy);

                System.out.print("Enter payment amount: ");
                String amountInput = scanner.nextLine().trim();
                double amount = Double.parseDouble(amountInput);

                processor.processPayment(amount);

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input. Please enter a numeric amount."
                );
            } catch (IllegalArgumentException e) {
                System.out.println("Payment error: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static PaymentStrategy selectStrategy(String choice) {
        return switch (choice) {
            case "1" -> new CreditCardPayment();
            case "2" -> new PayPalPayment();
            case "3" -> new CashPayment();
            case "4" -> new PalmPayment();
            default -> throw new IllegalArgumentException(
                    "Invalid payment method. Choose a number from 1 to 4."
            );
        };
    }
}

