package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.orange;

public class Winner {
    public void Win(JCheckBox player2 , JCheckBox player3 , JCheckBox player4 , JCheckBox p1, JCheckBox p2, JCheckBox p3,
                    JCheckBox p4, JCheckBox soldeir , JCheckBox attack, JCheckBox move, JLabel winner, Color color,JButton button)
    {
        player4.setEnabled(true);
        player2.setEnabled(true);
        player3.setEnabled(true);

        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);

        soldeir.setEnabled(false);
        attack.setEnabled(false);
        move.setEnabled(false);

        winner.setVisible(true);
        winner.setBackground(color);
        button.setEnabled(false);
    }

    public void Win(JCheckBox player2 , JCheckBox player3 , JCheckBox player4 , JCheckBox p1, JCheckBox p2, JCheckBox p3,
                    JCheckBox p4, JCheckBox soldeir , JCheckBox attack, JCheckBox move, JLabel winner, Color color
            ,Color color2,JButton button,JLabel winner2)
    {
        player4.setEnabled(true);
        player2.setEnabled(true);
        player3.setEnabled(true);

        p1.setEnabled(false);
        p2.setEnabled(false);
        p3.setEnabled(false);
        p4.setEnabled(false);

        soldeir.setEnabled(false);
        attack.setEnabled(false);
        move.setEnabled(false);

        winner.setVisible(true);
        winner.setBackground(color);
        button.setEnabled(false);

        winner2.setVisible(true);
        winner2.setBackground(color2);

    }
}
