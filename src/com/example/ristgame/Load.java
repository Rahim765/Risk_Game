package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.LoadGUI;
import com.example.risk_GUI.Risk_Game.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Load {
    MenuGUI menu = new MenuGUI();
    LoadGUI l = new LoadGUI();
    PLaySound p = new PLaySound();
  public void play_Action(JButton button,JFrame jFrame)
  {
      button.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent actionEvent) {


              p.playSound("/home/rahim/Downloads/lion_roar.wav");
              jFrame.setVisible(false);
              menu.Menu_GUI();
          }
      });

  }

}
