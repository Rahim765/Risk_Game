package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Help;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpGUI {
    public void RiskHelp()
    {
        JFrame help = new JFrame();
        help.setTitle("RISK HELP");
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("Image/help.jpg");
       jLabel.setBounds(0,0,1300,800);
       jLabel.setIcon(imageIcon);

        help.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JButton back = new JButton("Main Menu");
        back.setBounds(1100,0,220,120);
        back.setBackground(Color.lightGray);
        ImageIcon imageIcon1 = new ImageIcon("Image/main-menu-png-6.png");
        back.setIcon(imageIcon1);

        JTextArea  helptext = new JTextArea("AlliancesEdit\n" +
                "The rules of Risk neither endorse nor prohibit alliances or truces. Thus players often\n" +
                " form unofficial treaties for various reasons, such as safeguarding themselves from attacks \n" +
                "on one border while they concentrate their forces elsewhere, or eliminating a player who has\n" +
                " grown too strong. Because these agreements are not enforceable by the rules, these agreements\n" +
                " are often broken. Alliance making/breaking can be one of the most important elements of the\n" +
                " game, and it adds human interaction to a decidedly probabilistic game. Some players allow \n" +
                "trading of Riskcards, but only during their turn. This optional rule can make alliances more\n" +
                " powerful.\n" +
                "Attack and defenseEdit\n" +
                "Capturing a territory depends on the number of attacking and defending armies and the \n" +
                "associated probabilities. In a battle to completion, a player who has more armies \n" +
                "(even just one more) has a significant advantage, whether on attack or defense \n" +
                "(the number of attacking armies does not include the minimum one army that must be\n" +
                " left behind in the territory).\n" +
                "Defenders always win ties when dice are rolled. This gives the defending player\n" +
                " the advantage in \"one-on-one\" fights, but the attacker's ability to use more dice \n" +
                "offsets this advantage. It is always advantageous to roll the maximum number of dice, \n" +
                "unless an attacker wishes to avoid moving men into a 'dead-end' territory, in which \n" +
                "case they may choose to roll fewer than three. Thus when rolling three dice against two,\n" +
                " three against one, or two against one, the attacker has a slight advantage, otherwise\n" +
                " the defender has an advantage.\n" +
                "There are online tools available to compute the outcome of whole campaigns \n" +
                "(i.e. the attacking of several territories in a row).[10]\n" +
                "RisiKo! is a variant of the game released in Italy, in which the defender is allowed to \n" +
                "roll up to three dice to defend. This variation dramatically shifts the balance of power\n" +
                " towards defense.\n" +
                "" +
                "\n" +
                "\n" +
                "\n" +
                "for more detail message us:" +
                "\n" +
                "rahmanirahim955@gmail.com ");
        helptext.setBounds(300,100,600,500);
        helptext.setBackground(Color.lightGray);
        jLabel.add(back);
        jLabel.add(helptext);
        help.add(jLabel);
        help.setLayout(null);
        help.setVisible(true);
Help h = new Help();
h.Help_Action(back,help);
    }
}
