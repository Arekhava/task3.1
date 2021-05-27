package by.epam.main.repository.imp;

import by.epam.main.entity.Triangle;
import by.epam.main.entity.TriangleParameters;
import by.epam.main.exceptions.TriangleException;
import by.epam.main.repository.Specification;
import by.epam.main.warehouse.Warehouse;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerimeterSpecification implements Specification {
    private final static Logger LOGGER = LogManager.getLogger();
    private final Warehouse warehouse = Warehouse.getInstance();
    private final double minPerimeter;
    private final double maxPerimeter;

    public PerimeterSpecification(double minPerimeter, double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;

    }

    @Override
    public boolean specify(Triangle triangle) throws TriangleException {
        Long triangleId = triangle.getId();
        TriangleParameters triangleParameters = null;
        triangleParameters = warehouse.getParameters(triangleId);
        double area = 0;
        if (triangleParameters != null) {
            area = triangleParameters.getArea();
        }
        return (area >= minPerimeter && area <= maxPerimeter);
    }
}
