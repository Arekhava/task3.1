package by.epam.test;

import by.epam.main.action.TriangleServiceImpl;
import by.epam.main.entity.Point;
import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;
import org.junit.jupiter.api.Assertions;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleServiceImplTest {
    private final static Point A = new Point(3.0, 0.0);
    private final static Point B = new Point(0.0, 4.0);
    private final static Point C = new Point(0.0, 0.0);
    private TriangleServiceImpl triangleService;
    private Triangle triangle;

    @BeforeClass
    void setUp() {
        triangleService = new TriangleServiceImpl();
        triangle = new Triangle(A, B, C);
    }

    @Test
    public void testTriangleAreaCalculate() throws TriangleException {
        double expectedTriangleArea = 6.0;
        double actualTriangleArea = triangleService.triangleAreaCalculate(triangle);
        Assertions.assertEquals(expectedTriangleArea, actualTriangleArea);
    }

    @Test
    public void testTrianglePerimeterCalculate() throws TriangleException {
            double expectedTrianglePerimeter = 12.0;
            double actualTrianglePerimeter = triangleService.trianglePerimeterCalculate(triangle);
            Assertions.assertEquals(expectedTrianglePerimeter, actualTrianglePerimeter);
    }


}