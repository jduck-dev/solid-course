package solid.course.p1_single_responsibility.good.customer;

public class Customer {
    String name;
    String address;
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
}
