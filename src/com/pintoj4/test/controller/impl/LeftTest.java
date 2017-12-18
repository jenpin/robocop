package com.pintoj4.test.controller.impl;

import com.pintoj4.main.controller.impl.Left;
import com.pintoj4.main.model.Robot;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jpinto on 17/12/2017.
 */
class LeftTest extends Left {
    private static Left left;

    @BeforeAll
    static void setUp() {
        left = new Left();
    }

    @Test
    void processCommand_LeftFacingWest() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "WEST");
        left.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "SOUTH",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_LeftFacingEast() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "EAST");
        left.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "NORTH",robot.getDirectionFacing () );
    }

    @Test
    void processCommand_LeftFacingNorth() {
        Robot robot = new Robot ();
        robot.setDirectionFacing ( "NORTH");
        left.processCommand ( robot );
        assertEquals ( "WEST",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_LeftFacingSouth() {
        Robot robot = new Robot ();
        robot.setDirectionFacing ( "SOUTH");
        left.processCommand ( robot );
        assertEquals ( "EAST",robot.getDirectionFacing () );

    }

}