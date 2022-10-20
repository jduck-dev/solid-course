package solid.course.p2_open_closed.bad.payments;

public class Transfer extends MethodOfPayment {
    String bank;
    
    public Transfer(String holder, String bank) {
        super(holder);
        this.bank = bank;
    }
    
    public String getBank() {
        return bank;
    }
}
