package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.GiftCard;
import solid.course.p2_open_closed.good.payments.MethodOfPayment;

public class GiftCardVerification implements MethodOfPaymentVerification {
    @Override
    public boolean verify(MethodOfPayment mop) {
        if (!(mop instanceof GiftCard))
            return false;
        return Database.GIFT_CARDS_DB.contains(((GiftCard) mop).getCode());
    }
}
