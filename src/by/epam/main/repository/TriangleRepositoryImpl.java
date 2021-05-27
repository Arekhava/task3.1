package by.epam.main.repository;

import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.epam.main.repository.Specification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleRepositoryImpl implements TriangleRepository {
    private final static TriangleRepositoryImpl instance = new TriangleRepositoryImpl();
    private final static Logger LOGGER = LogManager.getLogger();
    private List<Triangle> triangleList;

    private TriangleRepositoryImpl() {
        triangleList = new ArrayList<>();
    }

    public static TriangleRepositoryImpl getInstance() {
        return instance;
    }

    @Override
    public boolean add(Triangle triangle) {
        LOGGER.info("New triangle was add to repository " + triangle);
        return triangleList.add(triangle);
    }

    @Override
    public boolean addAll(Collection<? extends Triangle> triangles) {
        LOGGER.info("New triangles list was add to repository " + triangles.toString());
        return triangleList.addAll(triangles);
    }

    @Override
    public Triangle get(int index) {
        return triangleList.get(index);
    }

    @Override
    public List<Triangle> getAll() {
        return triangleList;
    }

    @Override
    public boolean delete(Triangle triangle) {
        LOGGER.info("Triangle " + triangle + " was deleted from repository ");
        return triangleList.remove(triangle);
    }

    @Override
    public List<Triangle> query(Specification specification) {
        List<Triangle> list = new ArrayList<>();
        for (Triangle triangle : triangleList) {
            try {
                if (specification.specify(triangle)) {
                    list.add(triangle);
                }
            } catch (TriangleException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}