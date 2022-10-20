package solid.course.p2_open_closed.good.payments.verification;

import solid.course.p2_open_closed.good.payments.MethodOfPayment;

public interface MethodOfPaymentVerification {
    boolean verify(MethodOfPayment mop);
}
