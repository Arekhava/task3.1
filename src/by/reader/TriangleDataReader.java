package by.reader;


import by.exceptions.TriangleException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TriangleDataReader {
      final static Logger logger= LogManager.getLogger(TriangleDataReader.class);
        public List<String> read (String fileName) throws TriangleException {
            List<String> DataList = null;
            //List<Triangle>
            try (Scanner file = new Scanner(new File(fileName))) {

                while (file.hasNextLine()) {
                    String line = file.nextLine();
                    // try {

                    // catch (CustomException ex) { log message; continue;}
                    //if (!validator.isValid(line)) { log("line"+ line + "is not valid"); continue; }
                    //DataList.add(line);

                    // obtain double[]
                    // check count of array
                    // if count > 6 ? -> take first 6 and create Points
                    // Point a = new Point (array[0], array[1]);
                    // Point b

                    //Triangle triange = new Triangle({generate id, see UUID class}, a, b, c);
                   //triangles.add(triangle);
                }

            } catch(IOException e) {
                logger.error (e.getMessage());
                throw new TriangleException("Reader failed with IO Exception");
            }
            return DataList;
        }
    }
