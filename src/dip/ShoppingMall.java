package dip;

public class ShoppingMall {

    PaymentCard card;

    public ShoppingMall(PaymentCard card) {
        this.card = card;
    }

    public static void main(String[] args) {
        PaymentCard dCard = new DebitCard();
        PaymentCard cCard = new CreditCard();
        ShoppingMall transaction1 = new ShoppingMall(dCard);
        ShoppingMall transaction2 = new ShoppingMall(cCard);
        transaction1.card.doTransaction(1645);
        transaction2.card.doTransaction(475);
    }
}
