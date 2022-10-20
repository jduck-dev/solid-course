package solid.course.p4_interface_segregation.bad.purchase_order;

import solid.course.p4_interface_segregation.bad.ECommerce;
import solid.course.p4_interface_segregation.bad.cart.Cart;
import solid.course.p4_interface_segregation.bad.customer.Customer;
import solid.course.p4_interface_segregation.bad.payments.MethodOfPayment;

import java.util.List;
import java.util.stream.Collectors;

public class PurchaseOrderGenerator implements ECommerce {
    static final Double FIXED_VAT_RATE = 0.19;
    
    @Override
    public boolean verifyMethodOfPayment(MethodOfPayment mop) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public PurchaseOrder generatePurchaseOrder(Customer customer, Cart cart) {
        List<PurchaseItem> purchaseItems = cart
                .getItems()
                .stream()
                .map(i -> new PurchaseItem(i.getProduct().getName(),
                        i.getProduct().getPricePerUnit(),
                        i.getUnits(),
                        FIXED_VAT_RATE))
                .collect(Collectors.toList());
        return new PurchaseOrder(customer.getName(), customer.getAddress(), purchaseItems);
    }
}
