package solid.course.p2_open_closed.bad.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.bad.payments.Card;
import solid.course.p2_open_closed.bad.payments.GiftCard;
import solid.course.p2_open_closed.bad.payments.MethodOfPayment;
import solid.course.p2_open_closed.bad.payments.Transfer;

public class VerifyMethodOfPayment {
    public boolean verify(MethodOfPayment mop) {
        if (mop instanceof Card)
            return mop.getHolder() != null && Database.CARD_NUMBERS_DB.contains(((Card) mop).getNumber());
        if (mop instanceof GiftCard)
            return Database.GIFT_CARDS_DB.contains(((GiftCard) mop).getCode());
        if (mop instanceof Transfer)
            return Database.BANKS_BD.contains(((Transfer) mop).getBank());
        return false;
    }
}
