package solid.course.p2_open_closed.bad.payments;

public class Card extends MethodOfPayment {
    String number;
    
    public Card(String holder, String number) {
        super(holder);
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }
}
