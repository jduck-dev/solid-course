package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.Database;
import solid.course.p2_open_closed.good.payments.Transfer;

public class TransferVerification implements MethodOfPaymentVerification<Transfer> {
    @Override
    public boolean verify(Transfer mop) {
        return Database.BANKS_BD.contains((mop).getBank());
    }
}
