package solid.course.p4_interface_segregation.bad.purchase_order;

public class PurchaseItem {
    String name;
    Double pricePerUnit;
    Double units;
    Double totalPrice;
    Double vatRate;
    Double vat;
    
    public PurchaseItem(String name, Double pricePerUnit, Double units, Double vatRate) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.units = units;
    }
    
    public String getName() {
        return name;
    }
    
    public Double getPricePerUnit() {
        return pricePerUnit;
    }
    
    public Double getUnits() {
        return units;
    }
    
    public Double getTotalPrice() {
        return totalPrice;
    }
    
    public Double getVatRate() {
        return vatRate;
    }
    
    public Double getVat() {
        return vat;
    }
}
