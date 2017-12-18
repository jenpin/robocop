package com.pintoj4.main.utils;

import com.pintoj4.main.controller.Command;
import com.pintoj4.main.service.CommandUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.pintoj4.main.utils.RoboConstants.*;

public class Validator {

    private CommandUtil commandUtil = new CommandUtil ();

    public boolean isValidCommand(String command) {

        try {
            List<String> eachToken = CommandUtil.splitCommandByRegex ( command, "\\s" );
            validateCommandLength ( eachToken );
            Commands.valueOf ( eachToken.get ( 0 ) );
        } catch ( IllegalArgumentException e ) {
            return false;
        }
        return true;
    }

    public boolean validateMove (int position){
       return position<=5 && position>=-5 ? true :false;
    }

    public boolean validateCommandLength(List<String> tokenList){
        if(tokenList.get ( 0 ).equals ( Commands.PLACE.name () ) && tokenList.size () == 2){
            if(CommandUtil.splitCommandByRegex ( tokenList.get ( 1 ), "," ).size ()!=3){
                return false;
            }
            commandUtil.setPlaceCommand ( true );
        }else if(tokenList.size ()!=1){
            return false;
        }
        return true;
    }

}
