package by.epam.main.reader;

import by.epam.main.exceptions.TriangleException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import by.epam.main.validator.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TriangleDataReader {
    final static Logger logger = LogManager.getLogger(TriangleDataReader.class);

    public List<String> readDataFromFile(String pathToFile) throws TriangleException {
        if (!TriangleFileValidator.isValid(pathToFile)) {
            logger.log(Level.ERROR, "Wrong argument. Unable to read data from " + pathToFile);
            throw new TriangleException("Wrong argument. Unable to read data from " + pathToFile);
        }
        Path path = Paths.get(pathToFile);
        try (Stream<String> lineStream = Files.lines(path)) {
            List<String> data = lineStream.collect(Collectors.toList());
            return data;
        } catch (IOException e) {
            logger.log(Level.ERROR, "Error reading data in " + pathToFile);
            throw new TriangleException("Error reading data in " + pathToFile);
        }
    }
}