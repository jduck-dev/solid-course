package solid.course.p3_liskov_substitution.good;

public class Square implements Shape {
    Position position;
    Double width;
    
    public Square(Position position, Double width) {
        this.position = position;
        this.width = width;
    }
    
    public Double getWidth() {
        return width;
    }
    
    public void setWidth(Double width) {
        this.width = width;
    }
    
    @Override
    public Double getArea() {
        return width * width;
    }
}
