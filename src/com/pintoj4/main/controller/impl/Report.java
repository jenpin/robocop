package com.pintoj4.main.controller.impl;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.model.Robot;

public class Report implements Command {
    @Override
    public void processCommand(Robot robot) {
        System.out.println ("Robot Position : "+ robot.getxPosition () +" , "+ robot.getyPosition ()+" , "+robot.getDirectionFacing ());
    }
}
