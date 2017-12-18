package com.pintoj4.test.utils;

import com.pintoj4.main.utils.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ValidatorTest extends Validator {
    private static Validator validate;

    @BeforeAll
    static void setUp() {
        validate = new Validator ( );
    }

    @Test
    void isValidCommand_returnFalseforLowerCase() {
        String commandList = "move 123" ;
        Assertions.assertFalse ( validate.isValidCommand ( commandList ) );
    }

    @Test
    void isValidCommand_returnTrueforValidCommand() {
        Assertions.assertTrue ( validate.isValidCommand (  "MOVE 123" ) );
    }

    @Test
    void isValidCommand_returnFalseforInvalid() {
        Assertions.assertFalse ( validate.isValidCommand ( "hype" ) );
    }

    @Test
    void validateMove_returnTrue() {
        assertTrue ( validate.validateMove ( -3 ) );
    }

    @Test
    void validateMove_returnFalseValid() {
        assertFalse ( validate.validateMove ( -6 ) );
    }

    @Test
    void validateMove_returnTrueBoundary() {
        assertTrue ( validate.validateMove ( 5 ) );
    }
}