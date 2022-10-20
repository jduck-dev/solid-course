package solid.course.p5_dependency_inversion.good.services;

import solid.course.p5_dependency_inversion.good.product.Product;

import java.util.List;

public class ExportService {
    Exporter exporter;
    
    public ExportService(Exporter exporter) {
        this.exporter = exporter;
    }
    
    public String export(List<Product> products) {
        return exporter.export(products);
    }
}
