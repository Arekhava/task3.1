package by.epam.main.action;

import by.epam.main.entity.*;
import by.epam.main.exceptions.*;


public interface TriangleService {
    double triangleAreaCalculate(Triangle triangle) throws TriangleException;

    double trianglePerimeterCalculate(Triangle triangle) throws TriangleException;

    double triangleSidesCalculate(Triangle triangle)throws TriangleException;

}
