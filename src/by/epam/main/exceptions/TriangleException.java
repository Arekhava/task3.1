package by.epam.main.exceptions;

public class TriangleException extends Exception {

    public TriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public TriangleException(Throwable cause) {
        super(cause);
    }


    public TriangleException(String message) {
        super(message);
    }
}