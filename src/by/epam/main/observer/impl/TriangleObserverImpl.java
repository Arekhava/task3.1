package by.epam.main.observer.impl;


import by.epam.main.action.TriangleServiceImpl;
import by.epam.main.entity.Triangle;
import by.epam.main.exceptions.TriangleException;
import by.epam.main.observer.*;
import by.epam.main.observer.TriangleObserver;

import by.epam.main.warehouse.Warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TriangleObserverImpl implements TriangleObserver {
    private final static Logger LOGGER = LogManager.getLogger();


    @Override
    public void parametersChanged(TriangleEvent event) throws TriangleException {

            Triangle triangle = event.getSource();
            TriangleServiceImpl triangleService = new TriangleServiceImpl();
            Warehouse warehouse = Warehouse.getInstance();
            Long triangleId = triangle.getId();
            double area = triangleService.triangleAreaCalculate(triangle);
            double perimeter = triangleService.trianglePerimeterCalculate(triangle);
            warehouse.putParameters(triangleId, area, perimeter);
            LOGGER.info("Parameters in warehouse was update with " + triangle);

    }
}