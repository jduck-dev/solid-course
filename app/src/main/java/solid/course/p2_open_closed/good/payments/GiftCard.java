package solid.course.p2_open_closed.good.payments;


public class GiftCard implements MethodOfPayment {
    String holder;
    String code;
    
    public GiftCard(String holder, String code) {
        this.holder = holder;
        this.code = code;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public String getCode() {
        return code;
    }
}
