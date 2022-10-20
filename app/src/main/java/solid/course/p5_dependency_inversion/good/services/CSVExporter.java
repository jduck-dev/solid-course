package solid.course.p5_dependency_inversion.good.services;

import java.util.List;

public class CSVExporter implements Exporter {
    String stringQualifier = "\"";
    String columnSeparator = ";";
    String newLine = "\n";
    
    public <T> String export(List<T> obj) {
        // Doing some fancy CSV exporter implementation
        return "exported!";
    }
    
    public String getStringQualifier() {
        return stringQualifier;
    }
    
    public String getColumnSeparator() {
        return columnSeparator;
    }
    
    public String getNewLine() {
        return newLine;
    }
}
