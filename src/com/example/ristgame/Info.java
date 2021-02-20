package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.MenuGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info {
    public  void Info_Action(JButton button,JFrame frame)
    {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setVisible(false);
                MenuGUI m = new MenuGUI();
                m.Menu_GUI();
            }
        });

    }
}
