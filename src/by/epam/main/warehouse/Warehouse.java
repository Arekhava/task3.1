package by.epam.main.warehouse;

import by.epam.main.entity.TriangleParameters;
import by.epam.main.exceptions.TriangleException;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Warehouse instance = new Warehouse();
    private Map<Long, TriangleParameters> triangleParametersMap = new HashMap<>();

    private Warehouse() {

    }

    public static Warehouse getInstance() {
        return instance;
    }

    public void putParameters(Long triangleId, double area, double perimeter) {
        TriangleParameters parameters = new TriangleParameters();
        parameters.setArea(area);
        parameters.setPerimeter(perimeter);
        instance.triangleParametersMap.put(triangleId, parameters);
    }

    public TriangleParameters getParameters(Long triandleId) throws TriangleException {
        TriangleParameters data = triangleParametersMap.get(triandleId);
        if (data == null) {
            throw new TriangleException("No such element in Warehouse");
        }
        return new TriangleParameters();
    }

    public void udateParameters(Long id, double area, double perimeter) throws TriangleException {
        TriangleParameters parameters = triangleParametersMap.get(id);
        if (parameters == null) {
            throw new TriangleException("No such element in warehouse");
        }
        parameters.setArea(area);
        parameters.setPerimeter(perimeter);
    }

    public boolean containsKey (Long key) {
        return triangleParametersMap.containsKey(key);
    }
}