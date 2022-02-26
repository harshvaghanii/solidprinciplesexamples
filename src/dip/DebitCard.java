package dip;

public class DebitCard implements PaymentCard {

    @Override
    public void doTransaction(double amount) {
        System.out.println("Payment using debit card!");
    }
}
