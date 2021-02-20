package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Rules;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RulesGUI {
    public void RiskRules()
    {
        JFrame rules = new JFrame();
        rules.setTitle("THE RULES OF RISK GAME");
        rules.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JLabel jLabel = new JLabel();
        jLabel.setBounds(0,0,1300,800);
        ImageIcon imageIcon = new ImageIcon("Image/picture.jpeg");
        jLabel.setIcon(imageIcon);
        JButton back = new JButton("Main Menu");
        back.setBounds(1100,0,220,120);
        ImageIcon imageIcon1 = new ImageIcon("Image/main-menu-png-6.png");
        back.setBackground(Color.lightGray);
        back.setIcon(imageIcon1);


        JTextArea rule = new JTextArea("Basic strategyEdit\n" +
                "The official rulebook recommends three basic strategy points for play under the standard rules:\n" +
                "    1. Players should control entire continents to get the bonus reinforcement armies.\n" +
                "    2. Players should watch their borders for buildups of armies that could imply an upcoming attack.\n" +
                "    3. Players should build up armies on their own borders for better defense.\n" +
                "Holding continents is the most common way to increase reinforcements.\n" +
                " Players often attempt to gain control of Australia early in the game,\n" +
                " since Australia is the only continent that can be successfully defended\n" +
                " by heavily fortifying one country (either Siam or Indonesia).\n" +
                "[7]South America has 2 access points, North Americaand Africa each have 3,\n" +
                " Europe has 4, and Asiahas 5.\n" +
                "Generally, it is thought advisable to hold Riskcards until they can be\n" +
                " turned in for maximum reinforcements.[7] This is especially true earlier on in gameplay,\n" +
                " because extra armies make a greater difference in the beginning of the game.\n" +
                "[7] Eliminating a weak player who holds a large number of Risk cards is also a good strategy,\n" +
                "[7] since players who eliminate their opponents get possession of their opponents' Risk cards.\n" +
                " In this case, trading in Risk cards earlier may help acquire the necessary troops. \n" +
                "If the conquering player has six[8] or more Riskcards after taking the cards of another player, \n" +
                "the cards must be immediately turned in for reinforcements until the player has fewer than \n" +
                "five cards and then may continue attacking.\n" +
                "\"Turtling\" is a defensive strategy where a player who feels vulnerable\n" +
                " tries to become too expensive to be removed while remaining a threat to harass other players.\n" +
                " The objective of this strategy is to avoid early defeat. A player using this\n" +
                " strategy might remain in the game all the way to later stages and then mount an \n" +
                "attack on the weakest player and start a chain elimination to remove one player after\n" +
                " another to win the game. The player who uses this strategy is called a ‘turtle’.\n" +
                " The term was popularised in real-time strategy games where a player creates\n" +
                " a defensive perimeter or a turtle shell around the base of operations. \n" +
                "Solutions to counteract this strategy using cooperation have been proposed.\n");
        rule.setBounds(300,100,650,500);
        rule.setBackground(Color.lightGray);
        jLabel.add(back);
        jLabel.add(rule);
        rules.add(jLabel);
        rules.setLayout(null);
        rules.setVisible(true);
        Rules r = new Rules();
        r.Rules_Action(back,rules);
    }
}
