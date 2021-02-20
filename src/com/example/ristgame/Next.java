package com.example.ristgame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import static java.awt.Color.cyan;

public class Next {
    static  PLaySound p =new PLaySound();
static Game_Controller m= new Game_Controller();
static Undo_Round u = new Undo_Round();
static Winner w= new Winner();

    public void Next(JButton button,JCheckBox p1,JCheckBox p2,JCheckBox p3,JCheckBox p4,JCheckBox player2,
                     JCheckBox player3, JCheckBox player4,JCheckBox soldeir,JCheckBox attack,JCheckBox move,JLabel winner
         ,Sarbaz_Dahi s,int Round,JButton round,JButton undo,boolean UNDO,int borange,int bpink,
                     int bgray,int bcyan,JLabel tedadsabazha,JCheckBox multy,JLabel winner2)
    {

                if (attack.isEnabled()) {
                    if (multy.isEnabled())
                    {
                        if (p1.isEnabled())
                        {
                            if (s.Setsarbaz(pink)==-2&&s.Setsarbaz(cyan)==-2)
                            {
                                w.Win(player2,player3,player4,p1,p2,p3,p4,soldeir,attack,move,winner,orange,gray,button,winner2);
                            }
                        }
                        else  if (p2.isEnabled())
                        {
                            if (s.Setsarbaz(orange)==-2&&s.Setsarbaz(gray)==-2) {
                                w.Win(player2, player3, player4, p1, p2, p3, p4, soldeir, attack, move, winner, pink, cyan, button, winner2);
                            }
                        }
                        else if (p3.isEnabled())
                        {
                            if (s.Setsarbaz(pink)==-2&&s.Setsarbaz(cyan)==-2) {
                                w.Win(player2, player3, player4, p1, p2, p3, p4, soldeir, attack, move, winner, gray, orange, button, winner2);
                            }
                        }
                        else if (p4.isEnabled())
                        {
                            if (s.Setsarbaz(orange)==-2&&s.Setsarbaz(gray)==-2) {
                                w.Win(player2, player3, player4, p1, p2, p3, p4, soldeir, attack, move, winner, cyan, pink, button, winner2);
                            }
                        }
                    }
                    if (p1.isEnabled())
                    {

                        if (s.Setsarbaz(orange)==-1)
                        {
                            p.playSound("/home/rahim/Downloads/gunfight2.wav");

                           w.Win(player2,player3,player4,p1,p2,p3,p4,soldeir,attack,move,winner,orange,button);

                        }
                    }
                    else if (p2.isEnabled())
                    {


                        if (s.Setsarbaz(pink)==-1)
                        {
                            p.playSound("/home/rahim/Downloads/gunfight2.wav");
                            w.Win(player2,player3,player4,p1,p2,p3,p4,soldeir,attack,move,winner,pink,button);

                        }
                    }
                    else if (p3.isEnabled())
                    {
                        if (s.Setsarbaz(gray)==-1)
                        {
                            p.playSound("/home/rahim/Downloads/gunfight2.wav");
                            w.Win(player2,player3,player4,p1,p2,p3,p4,soldeir,attack,move,winner,gray,button);
                        }
                    }
                    else if (p4.isEnabled())
                    {
                        if (s.Setsarbaz(cyan)==-1)
                        {
                            p.playSound("/home/rahim/Downloads/gunfight2.wav");

                            w.Win(player2,player3,player4,p1,p2,p3,p4,soldeir,attack,move,winner,cyan,button);


                        }
                    }

                    attack.setEnabled(false);
                    p.playSound("/home/rahim/Downloads/horse_trot.wav");
                    move.setEnabled(true);
                }
                else if (move.isEnabled()) {
                    move.setEnabled(false);

                    soldeir.setEnabled(true);
                    button.setEnabled(false);

                    if (p4.isEnabled())
                    {
                        p4.setEnabled(false);
                        if (s.Setsarbaz(orange)!=-2) {
                            p1.setEnabled(true);
                            tedadsabazha.setBackground(orange);
                            tedadsabazha.setText("Tedad sarbaz hai orange :" + borange);

                            Round++;
                            round.setText("Round :" + Round);
                            m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);
                        }
                        else if (s.Setsarbaz(pink)!=-2)
                        {
                            p2.setEnabled(true);
                            tedadsabazha.setBackground(pink);
                            tedadsabazha.setText("Tedad sarbaz hai pink :" + bpink);
                         Round++;
                         round.setText("Round :" + Round);
                         m.Round++;
                            m.undo=true;
                         undo.setEnabled(true);

                        }
                        else if (s.Setsarbaz(gray)!=-2)
                        {
                            p3.setEnabled(true);
                            tedadsabazha.setBackground(gray);
                            tedadsabazha.setText("Tedad sarbaz hai gray :" + bgray);
                            Round++;
                            round.setText("Round :" + Round);
                            m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);

                        }
                    }
                    else if (p3.isEnabled()&&player4.isEnabled())
                    {
                        p3.setEnabled(false);
                        if (s.Setsarbaz(cyan)!=-2) {
                            p4.setEnabled(true);
                            tedadsabazha.setBackground(cyan);
                            tedadsabazha.setText("Tedad sarbaz hai cyan :" + bcyan);
                        }
                        else if (s.Setsarbaz(orange)!=-2)
                        {
                            p1.setEnabled(true);
                            tedadsabazha.setBackground(orange);
                            tedadsabazha.setText("Tedad sarbaz hai orange :" + borange);
                            Round++;
                            round.setText("Round :" + Round);
                            m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);
                        }
                        else if (s.Setsarbaz(pink)!=-2)
                        {
                            p2.setEnabled(true);
                            tedadsabazha.setBackground(pink);
                            tedadsabazha.setText("Tedad sarbaz hai pink:" + bpink);
                            Round++;
                            round.setText("Round :" + Round);
                            m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);
                        }
                    }
                    else if (p3.isEnabled()&&player3.isEnabled())
                    {
                        p3.setEnabled(false);
                        if (s.Setsarbaz(orange)!=-2) {
                            p1.setEnabled(true);
                            tedadsabazha.setBackground(orange);
                            tedadsabazha.setText("Tedad sarbaz hai orange :" + borange);
                           Round++;
                           round.setText("Round :" + Round);
                           m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);

                        }
                        else if (s.Setsarbaz(pink)!=-2)
                        {
                            p2.setEnabled(true);
                            tedadsabazha.setBackground(pink);
                            tedadsabazha.setText("Tedad sarbaz hai pink :" + bpink);
                            Round++;
                           round.setText("Round :" + Round);
                           m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);

                        }
                    }
                    else if (p2.isEnabled()&&(player3.isEnabled()||player4.isEnabled()))
                    {
                        p2.setEnabled(false);
                        if (s.Setsarbaz(gray)!=-2) {
                            p3.setEnabled(true);
                            tedadsabazha.setBackground(gray);
                            tedadsabazha.setText("Tedad sarbaz hai gray :" + bgray);
                        }
                        else if (player4.isEnabled()&&s.Setsarbaz(cyan)!=-2)
                        {
                            p4.setEnabled(true);
                            tedadsabazha.setBackground(cyan);
                            tedadsabazha.setText("Tedad sarbaz hai cyan :" + bcyan);
                        }
                        else if (s.Setsarbaz(orange)!=-2)
                        {
                            p1.setEnabled(true);
                            tedadsabazha.setBackground(orange);
                            tedadsabazha.setText("Tedad sarbaz hai orange :" + borange);
                            Round++;
                            round.setText("Round :" + Round);
                            m.Round++;
                            m.undo=true;
                            undo.setEnabled(true);
                        }
                    }
                    else if (p2.isEnabled()&&player2.isEnabled()) {
                        p2.setEnabled(false);
                        p1.setEnabled(true);
                        tedadsabazha.setBackground(orange);
                        tedadsabazha.setText("Tedad sarbaz hai orange :" + borange);
                       Round++;
                       round.setText("Round :"+Round);
                       m.Round++;
                        m.undo=true;
                        undo.setEnabled(true);

                    }
                    else if (p1.isEnabled())
                    {
                        p1.setEnabled(false);
                        if (player2.isEnabled()) {
                            p1.setEnabled(false);
                            if (s.Setsarbaz(pink) != -2) {
                                p2.setEnabled(true);
                                tedadsabazha.setBackground(pink);
                                tedadsabazha.setText("Tedad sarbaz hai pink :" + bpink);
                            }
                        }
                        else if (player3.isEnabled()) {
                            if (s.Setsarbaz(pink) != -2) {
                                p2.setEnabled(true);
                                tedadsabazha.setBackground(pink);
                                tedadsabazha.setText("Tedad sarbaz hai pink :" + bpink);
                            } else if (s.Setsarbaz(gray) != -2) {
                                p3.setEnabled(true);
                                tedadsabazha.setBackground(gray);
                                tedadsabazha.setText("Tedad sarbaz hai gray :" + bgray);
                            }
                        }
                        else if (player4.isEnabled())
                        {
                            if (s.Setsarbaz(pink)!=-2)
                            {
                                p2.setEnabled(true);
                                tedadsabazha.setBackground(pink);
                                tedadsabazha.setText("Tedad sarbaz hai pink :" + bpink);
                            }
                            else if (s.Setsarbaz(gray)!=-2)
                            {
                                p3.setEnabled(true);
                                tedadsabazha.setBackground(gray);
                                tedadsabazha.setText("Tedad sarbaz hai gray :" + bgray);
                            }
                            else if (s.Setsarbaz(cyan)!=-2)
                            {
                                p4.setEnabled(true);
                                tedadsabazha.setBackground(cyan);
                                tedadsabazha.setText("Tedad sarbaz hai cyan :" + bcyan);
                            }
                        }
                    }
                }
            }


    }

