package solid.course.p4_interface_segregation.bad.payments;

import solid.course.p4_interface_segregation.Database;
import solid.course.p4_interface_segregation.bad.ECommerce;
import solid.course.p4_interface_segregation.bad.cart.Cart;
import solid.course.p4_interface_segregation.bad.customer.Customer;
import solid.course.p4_interface_segregation.bad.purchase_order.PurchaseOrder;

public class CardVerification implements ECommerce {
    @Override
    public boolean verifyMethodOfPayment(MethodOfPayment mop) {
        if (!(mop instanceof Card))
            return false;
        Card card = (Card) mop;
        return card.getHolder() != null && Database.CARD_NUMBERS_DB.contains(card.getNumber());
    }
    
    @Override
    public PurchaseOrder generatePurchaseOrder(Customer customer, Cart cart) {
        throw new UnsupportedOperationException();
    }
}
