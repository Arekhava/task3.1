package by.action;

import by.entity.Triangle;
import by.exceptions.TriangleException;

public interface TriangleService {
    double triangleAreaCalculate(Triangle triangle) throws TriangleException;

    double trianglePerimeterCalculate(Triangle triangle) throws TriangleException;

}
