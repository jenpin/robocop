package com.pintoj4.main.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class CsvFileReader implements FileReader {
    String defaultFile = "com/pintoj4/resources/data/defaultInputFile";

    @Override
    public List<String> readFile(String fileName) {

        fileName = ((fileName != null && !fileName.isEmpty ( )) ? fileName : defaultFile);
        try {
            Path path = Paths.get ( ClassLoader.getSystemResource ( fileName ).toURI ( ) );
            return Files.readAllLines ( path );
        } catch ( Exception e ) {
            e.printStackTrace ( );
        }
        return null;
    }
}
