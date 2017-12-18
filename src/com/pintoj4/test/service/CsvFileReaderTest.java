package com.pintoj4.test.service;

import com.pintoj4.main.service.CsvFileReader;
import org.junit.jupiter.api.*;

import java.util.List;



class CsvFileReaderTest extends CsvFileReader {

    private static CsvFileReader reader;

    @BeforeAll
    static void setUp() {
        reader = new CsvFileReader ( );
    }

    @Test
    void readFile_shouldReturnListSize12() {
       List <String> outputList = reader.readFile ( "com/pintoj4/resources/data/basicInputFile" );
       Assertions.assertEquals ( 12,outputList.size () );
    }

    @Test
    void readFile_shouldReturnDefaultListSize6() {
        List <String> outputList = reader.readFile ( "" );
        Assertions.assertEquals ( 6,outputList.size () );
    }

    @Test
    void readFile_shouldReturnDefaultNullListSize6() {
        List <String> outputList = reader.readFile ( null );
        Assertions.assertEquals ( 6,outputList.size () );
    }

}