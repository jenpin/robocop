package com.pintoj4.test.service;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.controller.impl.Move;
import com.pintoj4.main.controller.impl.Place;
import com.pintoj4.main.service.CommandUtil;
import com.pintoj4.main.utils.RoboConstants;
import com.pintoj4.main.utils.RoboConstants.Commands;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommandUtilTest extends CommandUtil {
    private static CommandUtil commandUtil;
    @BeforeAll
    static void setUp() {
        commandUtil = new CommandUtil ();
    }

    @Test
    void splitCommandByRegex_CommandPlaceAndRegexSpace() {
        List <String> tokenList = commandUtil.splitCommandByRegex ( "PLACE 1,2,3"," " );
        assertEquals ( 2,tokenList.size () );
        assertLinesMatch (Arrays.asList ( "PLACE","1,2,3"),tokenList);

    }

    @Test
    void splitCommandByRegex_RegexComma() {
        List <String> tokenList = commandUtil.splitCommandByRegex ( "1,2,3","," );
        assertEquals ( 3,tokenList.size () );
        assertLinesMatch (Arrays.asList ( "1","2","3"),tokenList);
    }

    @Test
    void getCommand_validscenario() {
        Commands command = commandUtil.getCommand ( "MOVE" );
        assertNotNull ( command );
        assertSame (  Commands.MOVE,command);
    }

    @Test
    void getCommand_validPLACEScenario() {
        Commands command = commandUtil.getCommand ( "PLACE 1,2,SOUTH" );
        assertSame (  Commands.PLACE,command);
    }


    @Test
    void getCommandObject_validPLACEScenario() {
        Command command = commandUtil.getCommandObject ( "PLACE 1,2,SOUTH" );
        assertNotNull ( command );
        assertTrue ( command instanceof Place );
    }

    @Test
    void getCommandObject_validMOVEScenario() {
        Command command;
        command = commandUtil.getCommandObject ( "MOVE ");
        assertNotNull ( command );
        assertTrue ( command instanceof Move );
    }
}