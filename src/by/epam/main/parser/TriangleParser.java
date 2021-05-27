package by.epam.main.parser;

import by.epam.main.exceptions.TriangleException;
import by.epam.main.exceptions.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import by.epam.main.validator.*;

public class TriangleParser {
    private final static Logger logger = LogManager.getLogger(TriangleParser.class);

    final static String SPACE_REGEX = "\\s+";

    public double[] parseStringToDouble(String DataLine) throws TriangleException {
        if (DataLine == null) {
            throw new TriangleException("Line for parsing is null.");
        }
        String[] triangleElements = DataLine.split(SPACE_REGEX);
        double[] pointElements = new double[triangleElements.length];
        for (int i = 0; i < triangleElements.length; i++) {
            String line = triangleElements[i];
            if (!TriangleFileValidator.isValid(line)) {
                try {
                    pointElements[i] = Double.parseDouble(triangleElements[i].trim());
                } catch (NumberFormatException e) {
                    logger.error("This characters can not be a parse to double ." + e.getMessage());
                    throw new TriangleException(e);
                }
            }
        }
        return pointElements;
    }
}