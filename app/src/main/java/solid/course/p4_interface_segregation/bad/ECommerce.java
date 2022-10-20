package solid.course.p4_interface_segregation.bad;

import solid.course.p4_interface_segregation.bad.cart.Cart;
import solid.course.p4_interface_segregation.bad.customer.Customer;
import solid.course.p4_interface_segregation.bad.payments.MethodOfPayment;
import solid.course.p4_interface_segregation.bad.purchase_order.PurchaseOrder;

public interface ECommerce {
    boolean verifyMethodOfPayment(MethodOfPayment mop);
    
    PurchaseOrder generatePurchaseOrder(Customer customer, Cart cart);
}
