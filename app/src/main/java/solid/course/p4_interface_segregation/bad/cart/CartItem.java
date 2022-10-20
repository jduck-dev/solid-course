package solid.course.p4_interface_segregation.bad.cart;


import solid.course.p4_interface_segregation.bad.product.Product;

public class CartItem {
    Product product;
    Double units;
    
    public CartItem(Product product, Double units) {
    }
    
    public Product getProduct() {
        return product;
    }
    
    public Double getUnits() {
        return units;
    }
}