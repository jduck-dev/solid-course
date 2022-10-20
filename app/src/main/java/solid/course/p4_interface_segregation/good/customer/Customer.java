package solid.course.p4_interface_segregation.good.customer;

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
