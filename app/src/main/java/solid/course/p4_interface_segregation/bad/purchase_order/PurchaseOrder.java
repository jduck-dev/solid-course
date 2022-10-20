package solid.course.p4_interface_segregation.bad.purchase_order;

import java.util.Collections;
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
        return Collections.unmodifiableList(items);
    }
    
    public PurchaseOrderStatus getStatus() {
        return status;
    }
}
