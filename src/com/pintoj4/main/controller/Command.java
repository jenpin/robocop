package com.pintoj4.main.controller;

import com.pintoj4.main.model.Robot;

public interface Command {

    public void processCommand(Robot robot);
}
