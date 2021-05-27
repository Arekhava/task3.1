package by.epam.main.observer;

import by.epam.main.exceptions.TriangleException;

public interface TriangleObserver {


    public void parametersChanged(TriangleEvent event) throws TriangleException;
}
