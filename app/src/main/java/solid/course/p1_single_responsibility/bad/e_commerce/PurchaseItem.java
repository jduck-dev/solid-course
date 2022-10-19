package solid.course.p1_single_responsibility.bad.e_commerce;

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
}
