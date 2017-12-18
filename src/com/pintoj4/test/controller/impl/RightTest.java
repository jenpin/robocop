package com.pintoj4.test.controller.impl;

import com.pintoj4.main.controller.impl.Right;
import com.pintoj4.main.model.Robot;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightTest extends Right {
    private static Right right;

    @BeforeAll
    static void setUp() {
        right = new Right ();
    }

    @Test
    void processCommand_RightFacingWest() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "WEST");
        right.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "NORTH",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_RightFacingEast() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "EAST");
        right.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "SOUTH",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_RightFacingNorth() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "NORTH");
        right.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "EAST",robot.getDirectionFacing () );

    }

    @Test
    void processCommand_RightFacingSouth() {
        Robot robot = new Robot ();
        robot.setyPosition ( 3 );
        robot.setxPosition ( -2 );
        robot.setDirectionFacing ( "SOUTH");
        right.processCommand ( robot );
        assertEquals ( -2,robot.getxPosition () );
        assertEquals ( 3,robot.getyPosition () );
        assertEquals ( "WEST",robot.getDirectionFacing () );

    }


}