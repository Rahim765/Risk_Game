package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.MenuGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules {
    public void Rules_Action(JButton button,JFrame frame){

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MenuGUI m = new MenuGUI();
                frame.setVisible(false);
                m.Menu_GUI();
            }
        });
    }
}
