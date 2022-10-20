package solid.course.p2_open_closed.bad.payments;

public class GiftCard extends MethodOfPayment {
    String code;
    
    public GiftCard(String holder, String code) {
        super(holder);
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
