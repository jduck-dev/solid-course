package solid.course.p2_open_closed.good.payments;

public class Card implements MethodOfPayment {
    String holder;
    String number;
    
    public Card(String holder, String number) {
        this.holder = holder;
        this.number = number;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public String getNumber() {
        return number;
    }
}
