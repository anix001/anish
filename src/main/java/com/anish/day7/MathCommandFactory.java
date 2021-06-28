package com.anish.day7;

public class MathCommandFactory {

    public static MathCommand get(String Type){
        MathCommand mathCommand = null;
        switch (Type){
            case "add" :
                mathCommand = new AddCommand();
                break;
            case "Sub":
                mathCommand = new SubCommand();
                break;
            case "div":
                mathCommand = new DivCommand();
                break;
            default:
                mathCommand = new  NullCommand();
        }
        return mathCommand;
    }
}
