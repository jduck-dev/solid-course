package solid.course.p5_dependency_inversion.bad.product;

public class Category {
    String name;
    
    public Category(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
