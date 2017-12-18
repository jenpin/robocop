package com.pintoj4.main.controller.impl;

import com.pintoj4.main.model.Robot;
import com.pintoj4.main.controller.Command;
import com.pintoj4.main.service.CommandUtil;

import java.util.List;

/**
 * Created by jpinto on 17/12/2017.
 */
public class Place implements Command {

    private int xPosition;
    private int yPosition;
    private String directionFacing;

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public String getDirectionFacing() {
        return directionFacing;
    }

    public void setFieldValues(String tokenList){
        List<String> tokens = CommandUtil.splitCommandByRegex ( tokenList,",");
        xPosition = Integer.parseInt (tokens.get(0));
        yPosition = Integer.parseInt (tokens.get(1));
        directionFacing = tokens.get(2);
    }

    @Override
    public void processCommand(Robot robot) {
        robot.setxPosition ( xPosition);
        robot.setyPosition ( yPosition);
        robot.setDirectionFacing ( directionFacing );
    }
}
