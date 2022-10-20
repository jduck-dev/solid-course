package solid.course.p3_liskov_substitution.good;

public class Position {
    Double x;
    Double y;
    
    public Position(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    
    public Double getX() {
        return x;
    }
    
    public Double getY() {
        return y;
    }
}
