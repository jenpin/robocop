package com.pintoj4.main.controller.impl;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.model.Robot;
import com.pintoj4.main.utils.RoboConstants;
import com.pintoj4.main.utils.Validator;


public class Move implements Command {

    Validator validate = new Validator ();
    @Override
    public void processCommand(Robot robot) {
        //Where MOVE will move the toy robot one unit forward in the direction it is currently facing.
        String direction = robot.getDirectionFacing ();
        int currentXPosition = robot.getxPosition ();
        int currentYPosition = robot.getyPosition ();

        switch (RoboConstants.DIRECTION.valueOf ( direction )) {
            case NORTH:
                calculateYPosition ( robot, currentYPosition+1);
                break;
            case SOUTH:
                calculateYPosition ( robot, currentYPosition-1);
                break;
            case EAST:
                calculateXPosition ( robot,currentXPosition+1 );
                break;
            case WEST:
                calculateXPosition ( robot,currentXPosition-1 );
                break;
        }
    }

    public void calculateYPosition(Robot robot, int move){
        if(validate.validateMove(move)){
            robot.setyPosition (move);
        }
    }

    public void calculateXPosition(Robot robot, int move){
        if(validate.validateMove(move)){
            robot.setxPosition (move);
        }

    }
}
