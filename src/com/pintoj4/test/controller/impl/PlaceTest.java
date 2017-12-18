package com.pintoj4.test.controller.impl;

import com.pintoj4.main.controller.impl.Place;
import com.pintoj4.main.model.Robot;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jpinto on 17/12/2017.
 */
class PlaceTest extends Place {

    private static Place place;
    @BeforeAll
    static void setUp() {
        place = new Place ();
    }

    @Test
    void setValues() {
        place.setFieldValues( "1,-5,WEST" );
       assertEquals ( place.getyPosition (),-5 );
       assertEquals ( place.getxPosition (),1 );
       assertEquals ( place.getDirectionFacing (),"WEST" );
    }

    @Test
    void processCommand_WithValidScenarios() {
        place.setFieldValues ( "-2,3,EAST" );
        Robot robot = new Robot ();
        place.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "EAST",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_WithInvalidInput() {
       ;
        Throwable exception = assertThrows(Exception.class,
                ()->{ place.setFieldValues ( "PLACE -2,3,EAST" );} );

    }

}