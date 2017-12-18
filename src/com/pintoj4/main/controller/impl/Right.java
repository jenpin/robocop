package com.pintoj4.main.controller.impl;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.model.Robot;
import com.pintoj4.main.utils.RoboConstants;

/**
 * Created by jpinto on 17/12/2017.
 */
public class Right implements Command {
    @Override
    public void processCommand(Robot robot) {
        String direction = robot.getDirectionFacing ( );

        switch (RoboConstants.DIRECTION.valueOf ( direction )) {
            case NORTH:
                robot.setDirectionFacing ( RoboConstants.DIRECTION.EAST.name ( ) );
                break;
            case SOUTH:
                robot.setDirectionFacing ( RoboConstants.DIRECTION.WEST.name ( ) );
                break;
            case EAST:
                robot.setDirectionFacing ( RoboConstants.DIRECTION.SOUTH.name ( ) );
                break;
            case WEST:
                robot.setDirectionFacing ( RoboConstants.DIRECTION.NORTH.name ( ) );
                break;
        }
    }
}
