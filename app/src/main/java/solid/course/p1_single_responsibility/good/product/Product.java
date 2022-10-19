package solid.course.p1_single_responsibility.good.product;

public class Product {
    String name;
    String description;
    Double pricePerUnit;
    
    public Product(String name, String description, Double pricePerUnit) {
        this.name = name;
        this.description = description;
        this.pricePerUnit = pricePerUnit;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Double getPricePerUnit() {
        return pricePerUnit;
    }
}