package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.MethodOfPayment;
import solid.course.p2_open_closed.good.payments.Transfer;

public class TransferVerification implements MethodOfPaymentVerification {
    @Override
    public boolean verify(MethodOfPayment mop) {
        if (!(mop instanceof Transfer))
            return false;
        return Database.BANKS_BD.contains(((Transfer) mop).getBank());
    }
}
