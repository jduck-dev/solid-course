package solid.course.p1_single_responsibility.bad.e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    static final Double FIXED_VAT_RATE = 0.19;
    List<CartItem> items = new ArrayList<>();
    
    public Cart() {
    }
    
    public void addItem(Product product, Double units) {
        items.add(new CartItem(product, units));
    }
    
    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    public List<CartItem> getItems() {
        return Collections.unmodifiableList(items);
    }
    
    public PurchaseOrder generatePurchaseOrder(Customer customer) {
        List<PurchaseItem> purchaseItems = items
                .stream()
                .map(i -> new PurchaseItem(i.getProduct().name,
                        i.getProduct().getPricePerUnit(),
                        i.units,
                        FIXED_VAT_RATE))
                .collect(Collectors.toList());
        return new PurchaseOrder(customer.getName(), customer.getAddress(), purchaseItems);
    }
    
}