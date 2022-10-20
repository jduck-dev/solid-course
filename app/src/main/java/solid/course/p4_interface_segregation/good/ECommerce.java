package solid.course.p4_interface_segregation.good;

import solid.course.p4_interface_segregation.good.cart.Cart;
import solid.course.p4_interface_segregation.good.customer.Customer;
import solid.course.p4_interface_segregation.good.payments.MethodOfPayment;
import solid.course.p4_interface_segregation.good.purchase_order.PurchaseOrder;

public interface ECommerce {
    boolean verifyMethodOfPayment(MethodOfPayment mop);
    
    PurchaseOrder generatePurchaseOrder(Customer customer, Cart cart);
}
