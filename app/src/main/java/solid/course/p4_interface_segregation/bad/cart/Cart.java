package solid.course.p4_interface_segregation.bad.cart;

import solid.course.p4_interface_segregation.bad.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
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
    
}