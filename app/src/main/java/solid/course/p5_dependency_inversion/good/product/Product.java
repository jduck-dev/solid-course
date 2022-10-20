package solid.course.p5_dependency_inversion.good.product;

public class Product {
    String name;
    String description;
    Double pricePerUnit;
    Category category;
    
    public Product(String name, String description, Double pricePerUnit, Category category) {
        this.name = name;
        this.description = description;
        this.pricePerUnit = pricePerUnit;
        this.category = category;
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
    
    public Category getCategory() {
        return category;
    }
}
