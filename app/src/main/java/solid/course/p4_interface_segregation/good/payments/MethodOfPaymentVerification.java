package solid.course.p4_interface_segregation.good.payments;

public interface MethodOfPaymentVerification {
    boolean verify(MethodOfPayment mop);
}
