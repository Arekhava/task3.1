package by.epam.main.factory;

import by.epam.main.entity.Point;
import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class TriangleFactory {
        private final static Logger LOGGER = LogManager.getLogger();

        public static Triangle createTriangle(Point A, Point B, Point C) {
            return new Triangle(A, B, C);
        }

        public static Triangle createTriangle(double[] coordinates) throws TriangleException {

            if (coordinates.length >= 6) {
                Point pointA = new Point(coordinates[0], coordinates[1]);
                Point pointB = new Point(coordinates[2], coordinates[3]);
                Point pointC = new Point(coordinates[4], coordinates[5]);
                LOGGER.info("Create triangle from data (" + pointA + ", " + pointB + ", " + pointC + ") successful.");
                return createTriangle(pointA, pointB, pointC);
            } else {
            throw new TriangleException("Unable to create triangle from this coordinates " + Arrays.toString(coordinates));
        }
    }
}
