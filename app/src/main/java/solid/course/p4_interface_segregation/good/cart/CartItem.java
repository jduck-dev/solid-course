package solid.course.p4_interface_segregation.good.cart;


import solid.course.p4_interface_segregation.good.product.Product;

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