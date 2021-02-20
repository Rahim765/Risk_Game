package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.Map;
import com.example.risk_GUI.Risk_Game.MenuGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import static java.awt.Color.cyan;

public class Game_Controller {
    static PLaySound pLaySound = new PLaySound();
    static Sarbaz_Gozari s = new Sarbaz_Gozari();
    static Pakhsh_sarbaz p = new Pakhsh_sarbaz();
    static Sarbaz_Dahi s2 = new Sarbaz_Dahi();
    static Attack a = new Attack();
    static Group_Attack ga = new Group_Attack();
    static Map m = new Map();
    static Move k = new Move();
    static Turn t = new Turn();
    static Undo_Round u = new Undo_Round();
    static Undo u2 = new Undo();
    boolean gereftan=true;
    JButton[] buttons = new JButton[29];
    JCheckBox player2;
    JCheckBox player3;
    JCheckBox player4;
    JCheckBox p1;
    JCheckBox p2;
    JCheckBox p3;
    JCheckBox p4;
    JCheckBox multy;
    JButton start;
    JButton exit;
    JButton att1;
    JButton att2;
    JButton att3;
    JButton def1;
    JButton def2;
    JButton next;
    JButton round;
    JLabel tedadsarbazha;
    JFrame frame;
    JCheckBox soldeir;
    JCheckBox attack;
    JCheckBox move;
    JLabel winner;
    JButton UNDO;
    JButton Undo;
    JLabel attacker;
    JLabel defender;
    TextArea chat;
    TextField textField;
    JButton Enter;
    JLabel winner2;
    JLabel amaro;
    JLabel amarp;
    JLabel amarg;
    JLabel amarc;

    boolean aval=true;
    int tedad_orange;
    int tedad_pink;
    int tedad_gray;
    int tedad_cyan;
    int baqimandehsarbazha_orange;
    int baqimandehsarbazha_pink;
    int baqimandehsarbazha_gray;
    int baqimandehsarbazha_Cyan;
    static boolean undo=true;
    static int Round=0;
    String value="";
    boolean st = true;
    public Game_Controller(JButton[] buttons,JCheckBox player2,JCheckBox player3, JCheckBox player4,
                           JCheckBox p1,JCheckBox p2,JCheckBox p3,JCheckBox p4,JButton start , JButton exit,JButton att1,
                           JButton att2, JButton att3,JButton def1,JButton def2,JButton round , JLabel tedadsarbaz,JFrame frame,JCheckBox attack,
                           JCheckBox move,JCheckBox soldeir,JButton next,JLabel winner,JButton undo,
                           JLabel attacker,JLabel defender,TextArea chat,TextField textField,JButton Enter,JButton Undo,
                           JCheckBox multy,JLabel winner2,JLabel amaro,JLabel amarp,JLabel amarg,JLabel amarc)
    {
        this.buttons=buttons;
        this.player2=player2;
        this.player3=player3;
        this.player4=player4;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        this.start=start;
        this.exit=exit;
        this.att1=att1;
        this.att2=att2;
        this.att3=att3;
        this.def1=def1;
        this.def2=def2;
        this.round=round;
        this.tedadsarbazha=tedadsarbaz;
        this.frame=frame;
        this.attack=attack;
        this.move=move;
        this.soldeir=soldeir;
        this.next=next;
        this.winner=winner;
        this.UNDO=undo;
        this.attacker=attacker;
        this.defender=defender;
        this.chat=chat;
        this.textField=textField;
        this.Enter = Enter;
        this.Undo=Undo;
        this.multy=multy;
        this.winner2=winner2;
        this.amaro =amaro;
        this.amarp=amarp;
        this.amarg=amarg;
        this.amarc=amarc;
        MAtch();
    }
public Game_Controller(){

}

    public void MAtch() {
        multy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (st) {
                    if (multy.isSelected()) {
                        player2.setEnabled(false);
                        player2.setSelected(false);
                        player3.setSelected(false);
                        player3.setEnabled(false);
                        player4.setSelected(true);
                    } else if (!multy.isSelected()) {
                        player2.setEnabled(true);
                        player3.setEnabled(true);
                    }
                }
            }
        });
        for (int i = 0; i < 29; i++) {
            Button_Action(buttons[i]);
        }

        Enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (p1.isEnabled()) {
                    chat.setText(value +"p1 :"+ textField.getText());
                    textField.setText("");
                }
                if (p2.isEnabled()) {
                    chat.setText(value +"p2 :"+ textField.getText());
                    textField.setText("");
                }
                if (p3.isEnabled()) {
                    chat.setText(value +"p3 :"+ textField.getText());
                    textField.setText("");
                }
                if (p4.isEnabled()) {
                    chat.setText(value +"p4 :"+ textField.getText());
                    textField.setText("");
                }

                value = chat.getText()+"\n";
            }
        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Start s = new Start();
                st=false;
                if (!multy.isSelected())
                {
                    multy.setEnabled(false);
                }
                if (player2.isSelected()) {
                    s.start1(2, buttons, tedadsarbazha);

                    multy.setEnabled(false);
                    p.baqimandehsarbazha_orange = 15;
                    p.baqimandehsarbazha_pink = 15;
                    player4.setEnabled(false);
                    player3.setEnabled(false);

                } else if (player3.isSelected()) {
                    s.start1(3, buttons, tedadsarbazha);
                    multy.setEnabled(false);
                    p.baqimandehsarbazha_orange = 15;
                    p.baqimandehsarbazha_pink = 15;
                    p.baqimandehsarbazha_gray = 15;
                    player2.setEnabled(false);
                    player4.setEnabled(false);

                } else if (player4.isSelected()) {
                    s.start1(4, buttons, tedadsarbazha);
                    p.baqimandehsarbazha_orange = 13;
                    p.baqimandehsarbazha_pink = 13;
                    p.baqimandehsarbazha_gray = 13;
                    p.baqimandehsarbazha_Cyan = 13;
                    player2.setEnabled(false);
                    player3.setEnabled(false);

                }
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setVisible(false);
                MenuGUI m = new MenuGUI();
                m.Menu_GUI();
            }
        });

        Next n = new Next();
        Sarbaz_Dahi s3 = new Sarbaz_Dahi(buttons);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                n.Next(next, p1, p2, p3, p4, player2, player3, player4, soldeir, attack, move, winner, s3,Round,round,
                       UNDO,undo,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,baqimandehsarbazha_Cyan
                ,tedadsarbazha,multy,winner2);
                if (!multy.isEnabled()) {
                    baqimandehsarbazha_gray = s3.Setsarbaz(gray);
                    baqimandehsarbazha_pink = s3.Setsarbaz(pink);
                    baqimandehsarbazha_orange = s3.Setsarbaz(orange);
                    baqimandehsarbazha_Cyan = s3.Setsarbaz(cyan);
                }
                else if (multy.isEnabled())
                {
                    baqimandehsarbazha_gray = s3.Setsarbaz(gray,orange);
                    baqimandehsarbazha_pink = s3.Setsarbaz(pink,cyan);
                    baqimandehsarbazha_orange = s3.Setsarbaz(orange,gray);
                    baqimandehsarbazha_Cyan = s3.Setsarbaz(cyan,pink);
                }
            }

        });
        UNDO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                u.undo(buttons);
            }
        });

        Undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                u2.undo(buttons,p1,p2,p3,p4,soldeir,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,
                        baqimandehsarbazha_Cyan,tedadsarbazha);
                if (soldeir.isEnabled())
                {
                    if (p1.isEnabled()){baqimandehsarbazha_orange++;}
                    else if (p2.isEnabled()){baqimandehsarbazha_pink++;}
                    else if (p3.isEnabled()){baqimandehsarbazha_gray++;}
                    else if (p4.isEnabled()){baqimandehsarbazha_Cyan++;}
                }
            }
        });
    }



    public void Button_Action(JButton button){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Sarbaz_Dahi s4= new Sarbaz_Dahi(buttons);
                if (soldeir.isEnabled())
                {
                    UNDO.setEnabled(false);
                    if (aval)
                    {

                       int w= p.Sarbaz_QozariA1(button,p1,p2,p3,p4,player2,player3,player4,soldeir,tedadsarbazha);
                       if (w==0)
                       {
                            Sarbaz_Dahi s2 = new Sarbaz_Dahi(buttons);

                           aval = false;
                           p1.setEnabled(true);
                           baqimandehsarbazha_orange = s2.Setsarbaz(orange);
                           baqimandehsarbazha_pink=s2.Setsarbaz(pink);
                           baqimandehsarbazha_gray=s2.Setsarbaz(gray);
                           baqimandehsarbazha_Cyan=s2.Setsarbaz(cyan);
                           tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                           p2.setEnabled(false);
                           p3.setEnabled(false);
                           p4.setEnabled(false);
                       }
                    }
                    else if (!aval)
                    {
                        Undo.setVisible(true);
                        u2.get_undo(buttons);

                        if (undo)
                        {
                            u.get_undo(buttons);
                            UNDO.setEnabled(false);
                            undo=false;
                        }

                        if (p1.isEnabled()) {

                            int w= s.sarbaz_gozari(button,orange,baqimandehsarbazha_orange,"orange",tedadsarbazha);
                            if (w==1) {
                                baqimandehsarbazha_orange--;
                            }
                            if (baqimandehsarbazha_orange <= 0) {
                                pLaySound.playSound("/home/rahim/Downloads/Swords Clashing-SoundBible.com-912903192.wav");
                                soldeir.setEnabled(false);
                                attack.setEnabled(true);
                                next.setEnabled(true);
                            }
                        }
                        else if (p2.isEnabled())
                        {
                            int w=s.sarbaz_gozari(button,pink,baqimandehsarbazha_pink,"pink",tedadsarbazha);
                            if (w==1) {
                                baqimandehsarbazha_pink--;
                            }
                            if (baqimandehsarbazha_pink <= 0) {
                                pLaySound.playSound("/home/rahim/Downloads/Swords Clashing-SoundBible.com-912903192.wav");
                                soldeir.setEnabled(false);
                                attack.setEnabled(true);
                                next.setEnabled(true);
                            }
                        }
                        else if (p3.isEnabled())
                        {
                            int w =s.sarbaz_gozari(button,gray,baqimandehsarbazha_gray,"gray",tedadsarbazha);
                            if (w==1) {
                                baqimandehsarbazha_gray--;
                            }
                            if (baqimandehsarbazha_gray <= 0) {
                                pLaySound.playSound("/home/rahim/Downloads/Swords Clashing-SoundBible.com-912903192.wav");
                                soldeir.setEnabled(false);
                                attack.setEnabled(true);
                                next.setEnabled(true);
                            }
                        }
                        else if (p4.isEnabled())
                        {
                            int w= s.sarbaz_gozari(button,cyan,baqimandehsarbazha_Cyan,"cyan",tedadsarbazha);
                            if (w==1) {
                                baqimandehsarbazha_Cyan--;
                            }
                            if (baqimandehsarbazha_Cyan <= 0) {
                                pLaySound.playSound("/home/rahim/Downloads/Swords Clashing-SoundBible.com-912903192.wav");
                                soldeir.setEnabled(false);
                                attack.setEnabled(true);
                                next.setEnabled(true);
                            }
                        }
                    }


                }
                else if (attack.isEnabled()) {
                    u2.get_undo(buttons);

                    Ham_Marz h = new Ham_Marz();
                    h.ham_marz(buttons);
                    if (!multy.isEnabled()) {
                        if (p1.isEnabled()) {
                            a.Attack(button, orange, h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p2.isEnabled()) {
                            a.Attack(button, pink, h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p3.isEnabled()) {
                            a.Attack(button, gray, h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p4.isEnabled()) {
                            a.Attack(button, cyan, h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        }
                    }
                    else if (multy.isEnabled())
                    {
                        if (p1.isEnabled()) {
                            ga.G_Attack(button, orange,gray, h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p2.isEnabled()) {
                            ga.G_Attack(button, pink, cyan,h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p3.isEnabled()) {
                            ga.G_Attack(button, gray, orange,h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        } else if (p4.isEnabled()) {
                            ga.G_Attack(button, cyan, pink,h, att1, att2, att3, def1, def2, attacker, defender,amaro,amarp,amarg,amarc);
                        }
                    }
                }
                else if (move.isEnabled())
                {

                    if (p1.isEnabled())
                    {
                        if (gereftan==true) {
                            int w =k.setMove(button, orange);
                            if (w==1) {
                                gereftan = false;
                            }
                        }
                        else if (gereftan==false)
                        {
                            if (multy.isEnabled())
                            {
                                int w=k.setmove2(button,orange,gray);
                                if (w==1) {
                                    t.turn(p1,p2,p3,p4,player2,player3,player4,move,soldeir,round,Round,next,s4,UNDO,undo
                                            ,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan=true;
                                    baqimandehsarbazha_pink=s4.Setsarbaz(pink,cyan);
                                    baqimandehsarbazha_Cyan=s4.Setsarbaz(cyan,pink);
                                    baqimandehsarbazha_gray=s4.Setsarbaz(gray,orange);

                                }
                            }
                            else if (!multy.isEnabled()) {
                                int w = k.setmove2(button, orange);
                                if (w == 1) {
                                    t.turn(p1, p2, p3, p4, player2, player3, player4, move, soldeir, round, Round, next, s4, UNDO, undo
                                            , baqimandehsarbazha_orange, baqimandehsarbazha_pink, baqimandehsarbazha_gray, baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan = true;
                                    baqimandehsarbazha_pink = s4.Setsarbaz(pink);
                                    baqimandehsarbazha_Cyan = s4.Setsarbaz(cyan);
                                    baqimandehsarbazha_gray = s4.Setsarbaz(gray);

                                }
                            }
                        }
                    }
                    else if (p2.isEnabled())
                    {
                        if (gereftan==true) {
                            int w= k.setMove(button, pink);
                            if (w==1) {
                                gereftan = false;
                            }
                        }
                        else if (gereftan==false)
                        {
                            if (multy.isEnabled())
                            {
                                int w=k.setmove2(button,pink,cyan);
                                if (w==1) {
                                    t.turn(p1,p2,p3,p4,player2,player3,player4,move,soldeir,round,Round,next,s4,UNDO,undo
                                            ,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan=true;
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange,gray);
                                    baqimandehsarbazha_gray = s4.Setsarbaz(gray,orange);
                                    baqimandehsarbazha_Cyan = s4.Setsarbaz(cyan,pink);

                                }
                            }
                            else if (!multy.isEnabled()) {
                                int w = k.setmove2(button, pink);
                                if (w == 1) {
                                    t.turn(p1, p2, p3, p4, player2, player3, player4, move, soldeir, round, Round, next, s4, UNDO, undo
                                            , baqimandehsarbazha_orange, baqimandehsarbazha_pink, baqimandehsarbazha_gray, baqimandehsarbazha_Cyan, tedadsarbazha);
                                    gereftan = true;
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange);
                                    baqimandehsarbazha_gray = s4.Setsarbaz(gray);
                                    baqimandehsarbazha_Cyan = s4.Setsarbaz(cyan);
                                }
                            }
                        }

                    }
                    else if (p3.isEnabled())
                    {
                        if (gereftan==true) {
                            int w=k.setMove(button,gray);
                            if (w==1) {
                                gereftan = false;
                            }
                        }
                        else if (gereftan==false)
                        {
                            if (multy.isEnabled())
                            {
                                int w=k.setmove2(button,gray,orange);
                                if (w==1) {
                                    t.turn(p1,p2,p3,p4,player2,player3,player4,move,soldeir,round,Round,next,s4,UNDO,undo
                                            ,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan=true;
                                    baqimandehsarbazha_Cyan = s4.Setsarbaz(cyan,pink);
                                    baqimandehsarbazha_pink = s4.Setsarbaz(pink,cyan);
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange,gray);

                                }
                            }
                            else  if (!multy.isEnabled()) {
                                int w = k.setmove2(button, gray);
                                if (w == 1) {
                                    t.turn(p1, p2, p3, p4, player2, player3, player4, move, soldeir, round, Round, next, s4, UNDO, undo,
                                            baqimandehsarbazha_orange, baqimandehsarbazha_pink, baqimandehsarbazha_gray, baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan = true;
                                    baqimandehsarbazha_Cyan = s4.Setsarbaz(cyan);
                                    baqimandehsarbazha_pink = s4.Setsarbaz(pink);
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange);
                                }
                            }
                        }

                    }
                    else if (p4.isEnabled())
                    {
                        if (gereftan==true) {
                            int w= k.setMove(button, cyan);
                            if (w==1) {
                                gereftan = false;
                            }
                        }
                        else if (gereftan==false)
                        {
                            if (multy.isEnabled())
                            {
                                int w=k.setmove2(button,cyan,pink);
                                if (w==1) {
                                    t.turn(p1,p2,p3,p4,player2,player3,player4,move,soldeir,round,Round,next,s4,UNDO,undo
                                            ,baqimandehsarbazha_orange,baqimandehsarbazha_pink,baqimandehsarbazha_gray,baqimandehsarbazha_Cyan,
                                            tedadsarbazha);
                                    gereftan=true;
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange,gray);
                                    baqimandehsarbazha_pink = s4.Setsarbaz(pink,cyan);
                                    baqimandehsarbazha_gray = s4.Setsarbaz(gray,orange);

                                }
                            }
                            else  if (!multy.isEnabled()) {
                                int w = k.setmove2(button, cyan);
                                if (w == 1) {
                                    t.turn(p1, p2, p3, p4, player2, player3, player4, move, soldeir, round, Round, next, s4, UNDO, undo,
                                            baqimandehsarbazha_orange, baqimandehsarbazha_pink, baqimandehsarbazha_gray, baqimandehsarbazha_Cyan
                                            , tedadsarbazha);
                                    gereftan = true;
                                    baqimandehsarbazha_orange = s4.Setsarbaz(orange);
                                    baqimandehsarbazha_pink = s4.Setsarbaz(pink);
                                    baqimandehsarbazha_gray = s4.Setsarbaz(gray);
                                }
                            }
                        }
                    }
                }
            }
        });


        }
    }

