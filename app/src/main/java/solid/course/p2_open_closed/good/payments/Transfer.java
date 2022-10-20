package solid.course.p2_open_closed.good.payments;


public class Transfer implements MethodOfPayment {
    String holder;
    String bank;
    
    public Transfer(String holder, String bank) {
        this.holder = holder;
        this.bank = bank;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public String getBank() {
        return bank;
    }
}
