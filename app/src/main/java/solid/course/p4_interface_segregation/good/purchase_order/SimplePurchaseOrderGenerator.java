package solid.course.p4_interface_segregation.good.purchase_order;

import solid.course.p4_interface_segregation.good.cart.Cart;
import solid.course.p4_interface_segregation.good.customer.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class SimplePurchaseOrderGenerator implements PurchaseOrderGenerator {
    static final Double FIXED_VAT_RATE = 0.19;
    
    @Override
    public PurchaseOrder generate(Customer customer, Cart cart) {
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
