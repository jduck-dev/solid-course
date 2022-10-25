package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.Card;
import solid.course.p2_open_closed.good.payments.MethodOfPayment;

public class CardVerification implements MethodOfPaymentVerification<Card> {
    @Override
    public boolean verify(Card mop) {
        return mop.getHolder() != null && Database.CARD_NUMBERS_DB.contains(mop.getNumber());
    }
}
