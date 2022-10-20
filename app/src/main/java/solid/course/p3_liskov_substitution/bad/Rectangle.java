package solid.course.p3_liskov_substitution.bad;

public class Rectangle {
    protected Position position;
    protected Double height;
    protected Double width;
    
    public Rectangle(Position position, Double height, Double width) {
        this.position = position;
        this.height = height;
        this.width = width;
    }
    
    public Position getPosition() {
        return position;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public Double getHeight() {
        return height;
    }
    
    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double getWidth() {
        return width;
    }
    
    public void setWidth(Double width) {
        this.width = width;
    }
}
