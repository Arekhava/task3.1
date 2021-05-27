package by.epam.main.repository.imp;

import by.epam.main.entity.Triangle;
import by.epam.main.entity.TriangleParameters;
import by.epam.main.exceptions.TriangleException;
import by.epam.main.repository.Specification;
import by.epam.main.warehouse.Warehouse;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AreaSpecification implements Specification {
    private final static Logger LOGGER = LogManager.getLogger();
    private final Warehouse warehouse = Warehouse.getInstance();
    private final double minArea;
    private final double maxArea;

    public AreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;

    }

    @Override
    public boolean specify(Triangle triangle) {
        Long triangleId = triangle.getId();
        TriangleParameters triangleParameters = null;
        try {
            triangleParameters = warehouse.getParameters(triangleId);
        } catch (TriangleException e) {
            LOGGER.log(Level.ERROR, e.getMessage());
        }
        double area = 0;
        if (triangleParameters != null) {
            area = triangleParameters.getArea();
        }
        return (area >= minArea && area <= maxArea);
    }
}
