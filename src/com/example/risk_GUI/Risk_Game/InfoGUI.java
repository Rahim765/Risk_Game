package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoGUI {
    public void RiskInfo()
    {
        JFrame info = new JFrame();
        info.setExtendedState(JFrame.MAXIMIZED_BOTH);
        info.setTitle("RISK INFO");
        JLabel Back = new JLabel();
        Back.setBounds(0,0,1300,800);
        ImageIcon imageIcon = new ImageIcon("Image/102116_EC_bubble_nucleus_main_0.jpg");

        Back.setIcon(imageIcon);
        JButton back = new JButton("Main Menu");
        back.setBounds(1100,0,220,120);
        ImageIcon imageIcon1 = new ImageIcon("Image/main-menu-png-6.png");
        back.setBackground(Color.lightGray);
        back.setIcon(imageIcon1);


        JTextArea infotext = new JTextArea("Risk is a strategy board game of diplomacy, \n" +
                "conflict and conquest[1] for two to six players. The standard version is played \n" +
                "on a board depicting a political map of Earth, divided into forty-two territories,\n" +
                " which are grouped into six continents.  Turn rotates among players who control armies of \n" +
                "playing pieces with which they attempt to capture territories from other players, \n" +
                "with results determined by dice rolls. Players may form and dissolve alliances during the\n" +
                " course of the game. The goal of the game is to occupy every territory on the board and in \n" +
                "doing so, eliminate the other players.[2] The game can be lengthy, requiring several hours to\n" +
                " multiple days to finish. European versions are structured so that each player has a limited \"\n" +
                "secret mission\" objective that shortens the game\n" +
                "\n" +
                "\n" +
                "\n" +
                "Risk was invented in 1957 by Albert Lamorisse, a French filmmaker, and went on to become \n" +
                "one of the most popular board games in history, inspiring other popular games such as Axis \n" +
                "& Allies and Settlers of Catan. The simple rules but complex interactions make it appealing to \n" +
                "adults as well as children and families. It is still in production by Hasbro with numerous editions \n" +
                "and variants with popular media themes and different rules including PC software versions,\n" +
                " video games, and mobile apps");

infotext.setBackground(Color.cyan);
        infotext.setBounds(300,100,600,500);
        Back.add(back);
        Back.add(infotext);
        info.add(Back);
        info.setLayout(null);
        info.setVisible(true);

        Info i = new Info();
        i.Info_Action(back,info);
    }
}
