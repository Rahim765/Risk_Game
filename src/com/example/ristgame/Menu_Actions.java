package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.*;
import com.example.risk_GUI.Risk_Game.HelpGUI;
import com.example.risk_GUI.Risk_Game.InfoGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Actions {
    PLaySound p = new PLaySound();
    public void Menuaction(JButton info,JButton exit,JButton help,JButton rules, JButton match,JFrame jFrame)
    {

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jFrame.setVisible(false);
                InfoGUI i = new InfoGUI();
                i.RiskInfo();


            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
System.exit(0);
            }
        });

help.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFrame.setVisible(false);
        HelpGUI h = new HelpGUI();
        h.RiskHelp();
    }
});

rules.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFrame.setVisible(false);
        RulesGUI r = new RulesGUI();
        r.RiskRules();
    }
});

match.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        p.playSound("/home/rahim/Downloads/9_mm_gunshot-mike-koenig-123.wav");
        jFrame.setVisible(false);
      Map m = new Map();
      m.design();
    }
});
    }
}
