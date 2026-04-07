abstract class Payment {
    private String transactionId;
    private double amount;

    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getTransactionIDString() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double processPayment() {
        return getAmount() + (getAmount() * 0.02);
    }
}
class UPIPayment extends Payment {
    public UPIPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double processPayment() {
        return getAmount();
    }
}

class PaymentProcessor {
    public void execute(Payment payment) {
        double finalAmount = payment.processPayment();
        System.out.println("Transaction ID: " + payment.getTransactionIDString() + 
                           "Final Amount: " + finalAmount);
    }
}

public class Main3 {
    public static void main(String[] ars) {
        Payment cc = new CreditCardPayment("TID101", 1000.0);
        Payment upi = new UPIPayment("TID102", 1000.0);

        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("Credit Card Processing");
        processor.execute(cc);

        System.out.println("\nUPI Processing");
        processor.execute(upi);

        
        Payment[] payments = {cc, upi};
        double total = 0;
        for (Payment p : payments) {
            total += p.processPayment();
        }
        System.out.println("Total: " + total);
    }
}