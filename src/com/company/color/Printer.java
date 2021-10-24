package com.company.color;

public class Printer {

    public Printer() {}

    public static boolean isColorWarm(Color c){
        if(c.color.equals("blue")){
            return false;
        }
        if(c.color.equals("red")){
            return true;
        }
        if(c.color.equals("green")){
            return false;
        }
        return false;
    }
}
