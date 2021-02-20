package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Menu_Actions;

import javax.swing.*;
import java.awt.*;

public class MenuGUI {
    public JFrame menupage = new JFrame();
    public JLabel background = new JLabel();
    public JButton info = new JButton("Info");
    public JButton exit = new JButton("Exit");
    public JButton help = new JButton("Help");
    public JButton rules = new JButton("Rules");
    public JButton match = new JButton("Match");
    public  void Menu_GUI()
    {

        menupage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menupage.setTitle("Risk Menu");


        background.setBounds(7,-35,1300,800);
        ImageIcon imageIcon1 = new ImageIcon("Image/picture.jpeg");
        background.setIcon(imageIcon1);



        exit.setBounds(1000,100,280,110);
        ImageIcon imageIcon6 = new ImageIcon("Image/exit-10951491.jpg");
        exit.setIcon(imageIcon6);


        info.setBounds(100,100,236,137);
        ImageIcon imageIcon2 = new ImageIcon("Image/word-info-3d-people-human-character-and-word-info-3d-render-illustration-drawing_csp7397044.jpg");
info.setIcon(imageIcon2);

        help.setBounds(990,520,270,120);
        ImageIcon imageIcon3=new ImageIcon("Image/gelp.jpeg");
        help.setIcon(imageIcon3);

        rules.setBounds(90,520,250,130);
        ImageIcon imageIcon4=new ImageIcon("Image/index.jpeg");
        rules.setIcon(imageIcon4);



        match.setBounds(530,450,270,160);
        ImageIcon imageIcon5 = new ImageIcon("Image/w.jpeg");
        match.setIcon(imageIcon5);


        background.add(match);

        background.add(rules);
        background.add(help);
        background.add(info);
        background.add(exit);


        menupage.add(background);
        menupage.setLayout(null);
        menupage.setVisible(true);

        Menu_Actions menu = new Menu_Actions();
        menu.Menuaction(info,exit,help,rules,match,menupage);

    }
}
