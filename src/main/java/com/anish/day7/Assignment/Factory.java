package com.anish.day7.Assignment;

import com.anish.day7.Assignment.Gui.GuiFactory;
import com.anish.day7.Assignment.Gui.OsxFactory;
import com.anish.day7.Assignment.Gui.WinFactory;

public class Factory {

    public static GuiFactory get(String FactoryType){
        switch (FactoryType){
            case "win":
                return new WinFactory();
            case "osx":
                return  new OsxFactory();
            default:
                return null;
        }
    }
}
