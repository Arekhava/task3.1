package by.epam.main.observer;



import by.epam.main.exceptions.TriangleException;

public interface TriangleObservable {

  //  void addObserver(TriangleObserver observer) throws TriangleException;

   // void removeObserver(TriangleObserver observer) throws TriangleException;

    void notifyObserver() throws  TriangleException;
}

