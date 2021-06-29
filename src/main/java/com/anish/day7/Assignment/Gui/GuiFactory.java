package com.anish.day7.Assignment.Gui;

import com.anish.day7.Assignment.Assignment.Button.Button;

public interface GuiFactory {
    Button createButton(String buttonName);
}
