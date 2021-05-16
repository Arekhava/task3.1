package by.parser;

import by.exceptions.TriangleException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import by.validator.TriangleValidator;

public class TriangleParser {
    private final static Logger logger = LogManager.getLogger(TriangleParser.class);

    final static String SPACE_REGEX = "\\s+";

    public double[] parseStringToDouble(String DataLine) throws TriangleException {
        if (DataLine == null) {
            throw new TriangleException("Line for parsing is null."); }
        String[] triangleElements = DataLine.split(SPACE_REGEX);
        double[] pointElements = new double[triangleElements.length];
        for (int i = 0; i < triangleElements.length; i++) {
            String line = triangleElements[i];
            if (!TriangleValidator.isValid(line))
            {
              //  throw new TriangleException("Error. Element is not number");
                //logger//TODO
            }
            pointElements[i] = Double.parseDouble(triangleElements[i].trim());
        }
        logger.info("Method TriangleParser returns ");
        return pointElements;
    }
}
