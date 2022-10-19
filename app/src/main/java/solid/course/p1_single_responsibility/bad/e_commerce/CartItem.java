package solid.course.p1_single_responsibility.bad.e_commerce;

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