package dip;

public class CreditCard implements PaymentCard {

    @Override
    public void doTransaction(double amount) {
        System.out.println("Payment using credit card!");
    }
}
