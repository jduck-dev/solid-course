package solid.course.p4_interface_segregation.good.purchase_order;

import solid.course.p4_interface_segregation.good.cart.Cart;
import solid.course.p4_interface_segregation.good.customer.Customer;

public interface PurchaseOrderGenerator {
    PurchaseOrder generate(Customer customer, Cart cart);
}
