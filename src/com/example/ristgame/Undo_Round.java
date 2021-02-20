package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

public class Undo_Round {
    Color[] colors = new Color[29];
    int[] add= new int[29];
    public void get_undo(JButton[] buttons)
    {
        for (int i = 0; i <29 ; i++) {
            colors[i]=buttons[i].getBackground();
            add[i]=Integer.parseInt(buttons[i].getText());
        }


    }

    public void undo(JButton[] buttons)
    {
        for (int i = 0; i <29 ; i++) {
            buttons[i].setBackground(colors[i]);
            buttons[i].setText(String.valueOf(add[i]));
        }

    }
}
