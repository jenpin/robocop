package com.pintoj4.test;

import com.pintoj4.main.RoboCopEntryPoint;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RoboCopEntryPointTest extends RoboCopEntryPoint {

    private RoboCopEntryPoint entryPoint;

    @BeforeEach
    void setUp() {
        entryPoint = new RoboCopEntryPoint ();
    }

    @Test
    void processFile_NoFileSupplied() {
        entryPoint.processFile ( null );
    }

    @Test
    void processFile_ValidFileSupplied() {
        entryPoint.processFile ( "/Users/jpinto/Robot/src/com/pintoj4/resources/data/basicInputFile" );
    }

}