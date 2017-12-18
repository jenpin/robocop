package com.pintoj4.main.controller.impl;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.model.Robot;

import static com.pintoj4.main.utils.RoboConstants.*;


public class Left implements Command {

    @Override
    public void processCommand(Robot robot) {
        String direction = robot.getDirectionFacing ( );

        switch (DIRECTION.valueOf ( direction )) {
            case NORTH:
                robot.setDirectionFacing ( DIRECTION.WEST.name ( ) );
                break;
            case SOUTH:
                robot.setDirectionFacing ( DIRECTION.EAST.name ( ) );
                break;
            case EAST:
                robot.setDirectionFacing ( DIRECTION.NORTH.name ( ) );
                break;
            case WEST:
                robot.setDirectionFacing ( DIRECTION.SOUTH.name ( ) );
                break;
        }
    }

}
