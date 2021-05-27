package by.epam.main.repository;

import by.epam.main.entity.Triangle;
import by.epam.main.repository.Specification;
import java.util.Collection;
import java.util.List;

public interface TriangleRepository {


        boolean add(Triangle triangle);

        boolean addAll(Collection<? extends Triangle> triangles);

        Triangle get(int index);

        List<Triangle> getAll();

        boolean delete(Triangle triangle);

        List<Triangle> query(Specification specification);


}
