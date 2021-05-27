package by.epam.main.action;

import by.epam.main.entity.Point;
import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;



public class TriangleServiceImpl implements TriangleService {

    @Override
    public double triangleAreaCalculate(Triangle triangle) throws TriangleException {
        double area;
        Point A = triangle.getPointA();
        Point B = triangle.getPointB();
        Point C = triangle.getPointC();
        area=Math.abs(((A.getX() - C.getX()) * (B.getY() - C.getY()) -
                (B.getX() - C.getX()) * (A.getY() - C.getY())) * 0.5);

        return area;
    }

    @Override
    public double trianglePerimeterCalculate(Triangle triangle) throws TriangleException {
        double perimeter;
        Point A = triangle.getPointA();
        Point B = triangle.getPointB();
        Point C = triangle.getPointC();

        double sideAB = Math.hypot(B.getX() - A.getX(), B.getY() - A.getY());
        double sideAC = Math.hypot(C.getX() - A.getX(), C.getY() - A.getY());
        double sideBC = Math.hypot(C.getX() - B.getX(), C.getY() - B.getY());

        perimeter = sideAB + sideAC + sideBC;

        return perimeter;

    }

    @Override
    public double triangleSidesCalculate(Triangle  triangle) throws TriangleException {
        double x1;
        double y1;
        Point pointA = new Point();
        x1 = pointA.getX();
        y1 = pointA.getY();

        double x2;
        double y2;
        Point pointB=new Point();
        x2 = pointB.getX();
        y2 = pointB.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

}
