package solid.course.p5_dependency_inversion.bad.services;

import solid.course.p5_dependency_inversion.bad.product.Product;

import java.util.List;

public class ExportService {
    CSVExporter csv;
    
    public ExportService() {
        csv = new CSVExporter();
    }
    
    public String export2csv(List<Product> products) {
        return csv.export(products);
    }
}
