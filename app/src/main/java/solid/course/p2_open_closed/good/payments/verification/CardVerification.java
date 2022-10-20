package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.Card;
import solid.course.p2_open_closed.good.payments.MethodOfPayment;

public class CardVerification implements MethodOfPaymentVerification {
    @Override
    public boolean verify(MethodOfPayment mop) {
        if (!(mop instanceof Card))
            return false;
        Card card = (Card) mop;
        return card.getHolder() != null && Database.CARD_NUMBERS_DB.contains(card.getNumber());
    }
}
