package com.anish.day7.Assignment.Gui;

import com.anish.day7.Assignment.Assignment.Button.Button;
import com.anish.day7.Assignment.Assignment.Button.WinButton;


public class WinFactory  implements GuiFactory {
    @Override
    public Button createButton(String buttonName) {
        if (buttonName.equalsIgnoreCase("win"))
        {
            return new WinButton();
        }
        return null;

    }
}
