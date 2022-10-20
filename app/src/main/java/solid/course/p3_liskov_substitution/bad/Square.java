package solid.course.p3_liskov_substitution.bad;

public class Square extends Rectangle {
    
    public Square(Position position, Double height, Double width) {
        super(position, height, width);
    }
    
    @Override
    public void setHeight(Double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
    
    @Override
    public void setWidth(Double width) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
