package com.example.ristgame;

import javax.swing.*;

import static java.awt.Color.*;
import static java.awt.Color.gray;

public class Turn {
    boolean gereftan=true;
   static Game_Controller m = new Game_Controller();

    public void turn(JCheckBox p1,JCheckBox p2,JCheckBox p3,JCheckBox p4,JCheckBox player2,JCheckBox player3,JCheckBox
                     player4,JCheckBox move,JCheckBox soldeir,JButton round,int Round,JButton next,Sarbaz_Dahi s,
                     JButton undo,boolean UNDO,int borange,int bpink,int bgray,int bcyan,JLabel tedadsarbazha)
    {
        if (p1.isEnabled()) {
            p1.setEnabled(false);
            if (player2.isEnabled()) {
                p2.setEnabled(true);
                tedadsarbazha.setBackground(pink);
                tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

            } else if (player3.isEnabled()) {
                if (s.Setsarbaz(pink) != -2) {
                    p2.setEnabled(true);
                    tedadsarbazha.setBackground(pink);
                    tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

                } else if (s.Setsarbaz(gray) != -2) {
                    p3.setEnabled(true);
                    tedadsarbazha.setBackground(gray);
                    tedadsarbazha.setText("Tedad sarbaz hai gray :" + bgray);

                }
            } else if (player4.isEnabled()) {
                if (s.Setsarbaz(pink) != -2) {
                    p2.setEnabled(true);
                    tedadsarbazha.setBackground(pink);
                    tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

                } else if (s.Setsarbaz(gray) != -2) {
                    p3.setEnabled(true);
                    tedadsarbazha.setBackground(gray);
                    tedadsarbazha.setText("Tedad sarbaz hai gray :" + bgray);

                } else if (s.Setsarbaz(cyan) != -2) {
                    p4.setEnabled(true);
                    tedadsarbazha.setBackground(cyan);
                    tedadsarbazha.setText("Tedad sarbaz hai cyan :" + bcyan);

                }
            }

            move.setEnabled(false);
            next.setEnabled(false);
            soldeir.setEnabled(true);
            gereftan = true;
        }
        else if (p2.isEnabled()) {
            p2.setEnabled(false);
            if (player3.isEnabled()||player4.isEnabled()) {

                if (s.Setsarbaz(gray)!=-2) {
                    p3.setEnabled(true);
                    tedadsarbazha.setBackground(gray);
                    tedadsarbazha.setText("Tedad sarbaz hai gray :" + bgray);


                }
                else if (s.Setsarbaz(cyan)!=-2&&player4.isEnabled())
                {
                    p4.setEnabled(true);
                    tedadsarbazha.setBackground(cyan);
                    tedadsarbazha.setText("Tedad sarbaz hai cyan :" + bcyan);

                }
                else if (s.Setsarbaz(orange)!=-2)
                {
                    p1.setEnabled(true);
                    tedadsarbazha.setBackground(orange);
                    tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

                    Round++;
                    round.setText("Round : "+Round);
                    m.Round++;
                    m.undo=true;
                }
            }
            else if (player2.isEnabled())
            {
                Round++;
                round.setText("Round : "+Round);
                m.Round++;
               m.undo=true;

                undo.setEnabled(true);

                p1.setEnabled(true);
                tedadsarbazha.setBackground(orange);
                tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

            }
            move.setEnabled(false);
            soldeir.setEnabled(true);
            next.setEnabled(false);
            gereftan = true;
        }

        else if (p3.isEnabled()) {
            p3.setEnabled(false);
            if (player4.isEnabled()) {

                if (s.Setsarbaz(cyan)!=-2) {
                    p4.setEnabled(true);
                    tedadsarbazha.setBackground(cyan);
                    tedadsarbazha.setText("Tedad sarbaz hai cyan :" + bcyan);

                }
                else if (s.Setsarbaz(orange)!=-2)
                {
                    p1.setEnabled(true);
                    tedadsarbazha.setBackground(orange);
                    tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

                    Round++;
                    round.setText("Round : "+Round);
                    m.Round++;
                    m.undo=true;
                }
                else if (s.Setsarbaz(pink)!=-2)
                {
                    p2.setEnabled(true);
                    tedadsarbazha.setBackground(pink);
                    tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

                    Round++;
                    round.setText("Round : "+Round);
                    m.Round++;
                    m.undo=true;
                }
            }
            else if (player3.isEnabled())
            {
                Round++;
                round.setText("Round : "+Round);
                m.Round++;
                undo.setEnabled(true);
                m.undo=true;

                if (s.Setsarbaz(orange)!=-2) {
                    p1.setEnabled(true);
                    tedadsarbazha.setBackground(orange);
                    tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

                }
                else if (s.Setsarbaz(pink)!=-2)
                {
                    p2.setEnabled(true);
                    tedadsarbazha.setBackground(pink);
                    tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

                }
            }
            move.setEnabled(false);
            next.setEnabled(false);
            soldeir.setEnabled(true);

            gereftan = true;
        }
        else if (p4.isEnabled()) {
            Round++;
            round.setText("Round : "+Round);
            m.Round++;
            m.undo=true;

            undo.setEnabled(true);

            p4.setEnabled(false);
            if (s.Setsarbaz(orange)!=-2) {
                p1.setEnabled(true);
                tedadsarbazha.setBackground(orange);
                tedadsarbazha.setText("Tedad sarbaz hai orange :" + borange);

            }
            else if (s.Setsarbaz(pink)!=-2)
            {
                p2.setEnabled(true);
                tedadsarbazha.setBackground(pink);
                tedadsarbazha.setText("Tedad sarbaz hai pink :" + bpink);

            }
            else if (s.Setsarbaz(gray)!=-2)
            {
                p3.setEnabled(true);
                tedadsarbazha.setBackground(gray);
                tedadsarbazha.setText("Tedad sarbaz hai gray :" + bgray);

            }
            move.setEnabled(false);
            soldeir.setEnabled(true);
            next.setEnabled(false);
            gereftan = true;
        }
    }
}
