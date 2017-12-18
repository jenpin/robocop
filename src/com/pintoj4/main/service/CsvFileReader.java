package com.pintoj4.main.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CsvFileReader implements FileReader {
    String defaultFile = "/Users/jpinto/Robot/src/com/pintoj4/resources/data/defaultInputFile";

    @Override
    public List<String> readFile(String fileName) {

        fileName = ((fileName != null && !fileName.isEmpty ( )) ? fileName : defaultFile);

        try {

            return Files.readAllLines(Paths.get ( fileName ));

        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
        return null;
    }
}
