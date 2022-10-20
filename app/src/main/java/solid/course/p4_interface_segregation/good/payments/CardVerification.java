package solid.course.p4_interface_segregation.good.payments;

import solid.course.p4_interface_segregation.Database;

public class CardVerification implements MethodOfPaymentVerification {
    @Override
    public boolean verify(MethodOfPayment mop) {
        if (!(mop instanceof Card))
            return false;
        Card card = (Card) mop;
        return card.getHolder() != null && Database.CARD_NUMBERS_DB.contains(card.getNumber());
    }
}
