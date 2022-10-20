package solid.course.p5_dependency_inversion.good.services;

import java.util.List;

public interface Exporter {
    <T> String export(List<T> objs);
}
