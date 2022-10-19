package solid.course.p1_single_responsibility.bad.e_commerce;

import java.util.List;

public class PurchaseOrder {
    String customerName;
    String customerAddress;
    List<PurchaseItem> items;
    PurchaseOrderStatus status;
    
    public PurchaseOrder(String customerName, String customerAddress, List<PurchaseItem> items) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.items = items;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    public List<PurchaseItem> getItems() {
        return items;
    }
    
    public PurchaseOrderStatus getStatus() {
        return status;
    }
}
