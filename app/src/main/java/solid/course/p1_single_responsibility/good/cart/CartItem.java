package solid.course.p1_single_responsibility.good.cart;


import solid.course.p1_single_responsibility.good.product.Product;

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