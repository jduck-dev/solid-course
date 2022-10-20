package solid.course.p2_open_closed.bad.payments;

public class MethodOfPayment {
    String holder;
    
    public MethodOfPayment() {
    }
    
    public MethodOfPayment(String holder) {
        this.holder = holder;
    }
    
    public String getHolder() {
        return holder;
    }
}
