package com.anish.day7.Assignment;

import com.anish.day7.Assignment.Assignment.Button.Button;
import com.anish.day7.Assignment.Gui.GuiFactory;
import com.anish.day7.Assignment.Gui.OsxFactory;
import com.anish.day7.Assignment.Gui.WinFactory;

public class Main {
    public static void main(String[] args) {
     GuiFactory WinFactory1 = Factory.get("win");
     Button button = WinFactory1.createButton("win");
     button.Print();
    }
}
