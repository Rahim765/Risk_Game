package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

public class Undo {
    Color[] colors = new Color[29];
    int[] add= new int[29];
    public void get_undo(JButton[] buttons)
    {
        for (int i = 0; i <29 ; i++) {
            colors[i]=buttons[i].getBackground();
            add[i]=Integer.parseInt(buttons[i].getText());
        }


    }

    public void undo(JButton[] buttons,JCheckBox p1,JCheckBox p2,JCheckBox p3,JCheckBox p4,JCheckBox soldeir,
                     int borange , int bpink,int bgray,int bcyan,JLabel tedadsarbazha)
    {
        for (int i = 0; i <29 ; i++) {
            buttons[i].setBackground(colors[i]);
            buttons[i].setText(String.valueOf(add[i]));
        }
        if (soldeir.isEnabled())
        {
            if (p1.isEnabled())
            {
                borange++;
                tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

            }
            else if (p2.isEnabled()) {
                bpink++;
                tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

            }
            else if (p3.isEnabled()) {
                bgray++;
                tedadsarbazha.setText("Tedad sarbaz hai gray :" + bgray);

            }
            else if (p4.isEnabled()) {
                bcyan++;
                tedadsarbazha.setText("Tedad sarbaz hai cyan :" + bcyan);

            }

        }
    }
}
