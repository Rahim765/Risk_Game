package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Load;

import javax.swing.*;
import java.awt.*;

public class LoadGUI {
    public JFrame load = new JFrame();
    public JButton play = new JButton("Play");
    public void LoadPage() {

        load.setExtendedState(JFrame.MAXIMIZED_BOTH);
        load.setTitle("RISK");

        ImageIcon imageIcon = new ImageIcon("Image/risk.jpeg");

        ImageIcon imageIcon1 = new ImageIcon("Image/images231.png");

        JLabel jLabel = new JLabel();
        jLabel.setBounds(75, 0, 1300, 700);
        jLabel.setIcon(imageIcon);


        play.setBounds(400, 500, 475, 104);
        play.setIcon(imageIcon1);

        load.add(play);
        load.add(jLabel);


        load.setLayout(null);
        load.setVisible(true);

        Load l = new Load();
        l.play_Action(play,load);
    }
}
