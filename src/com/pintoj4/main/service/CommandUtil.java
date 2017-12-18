package com.pintoj4.main.service;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.controller.impl.*;
import com.pintoj4.main.utils.RoboConstants;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jpinto on 17/12/2017.
 */
public class CommandUtil {

    private static boolean placeCommand = false;

    private String params;

    public boolean isPlaceCommand() {
        return placeCommand;
    }

    public void setPlaceCommand(boolean placeCommand) {
        this.placeCommand = placeCommand;
    }

    public static List<String> splitCommandByRegex (String token,String regex){
       return Arrays.asList (token.split ( regex));
    }

    public RoboConstants.Commands getCommand(String command) {
        List<String> eachToken = CommandUtil.splitCommandByRegex ( command, "\\s" );
        setParams ( eachToken );
        return  RoboConstants.Commands.valueOf ( eachToken.get ( 0 ) ) ;
    }

    public void setParams (List<String> token) {
        if(token.size () == 2 ){
            params = token.get ( 1 );
        }
    }

    public Command getCommandObject(String commandType) {
        switch (getCommand ( commandType )) {
            case MOVE:
                return new Move ( );
            case LEFT:
                return new Left ( );
            case RIGHT:
                return new Right ( );
            case REPORT:
                return new Report ( );
            case PLACE:
                Place placeCommand = new Place ( );
                placeCommand.setFieldValues ( params );
                return placeCommand;
        }
        return null;
    }

}
