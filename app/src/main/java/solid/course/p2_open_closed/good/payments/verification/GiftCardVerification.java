package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.GiftCard;

public class GiftCardVerification implements MethodOfPaymentVerification<GiftCard> {
    @Override
    public boolean verify(GiftCard mop) {
        return Database.GIFT_CARDS_DB.contains((mop).getCode());
    }
}
