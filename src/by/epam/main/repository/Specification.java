package by.epam.main.repository;


import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;

@FunctionalInterface
public interface Specification {

        boolean specify(Triangle triangle) throws TriangleException;
    }