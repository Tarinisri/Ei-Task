//PaymentProcessor is the target interface expected by the client.
//PayPal has a different interface (makePayment).
//PayPalAdapter bridges the gap by wrapping a PayPal object and implementing the PaymentProcessor interface.
//The client can now use PayPal as if it implements PaymentProcessor.


// Existing interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// A class with a different interface
class PayPal {
    void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made through PayPal.");
    }
}

// Adapter class
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}

// Client
public class Adapter {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayPalAdapter(new PayPal());
        paymentProcessor.processPayment(150.0);
    }
}
