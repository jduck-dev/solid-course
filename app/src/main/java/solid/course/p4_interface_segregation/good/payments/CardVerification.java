package solid.course.p4_interface_segregation.good.payments;

import solid.course.p4_interface_segregation.Database;
import solid.course.p4_interface_segregation.good.ECommerce;
import solid.course.p4_interface_segregation.good.cart.Cart;
import solid.course.p4_interface_segregation.good.customer.Customer;
import solid.course.p4_interface_segregation.good.purchase_order.PurchaseOrder;

public class CardVerification implements MethodOfPaymentVerification {
    @Override
    public boolean verify(MethodOfPayment mop) {
        if (!(mop instanceof Card))
            return false;
        Card card = (Card) mop;
        return card.getHolder() != null && Database.CARD_NUMBERS_DB.contains(card.getNumber());
    }
}
