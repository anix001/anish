package com.anish.day7.Assignment.Gui;

import com.anish.day7.Assignment.Assignment.Button.Button;
import com.anish.day7.Assignment.Assignment.Button.OsxButton;


public class OsxFactory implements GuiFactory {
    @Override
    public Button createButton(String buttonName) {
        if (buttonName.equalsIgnoreCase("osx"))
        {
            return new OsxButton();
        }
        return null;
    }
}
