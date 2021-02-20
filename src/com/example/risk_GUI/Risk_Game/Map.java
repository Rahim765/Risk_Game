package com.example.risk_GUI.Risk_Game;

import com.example.ristgame.Game_Controller;
import com.example.ristgame.Ham_Marz;
import com.example.ristgame.Undo_Round;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Color.white;

public class Map {
    int baqimandehsarbazha_pink;
    int baqimandehsarbazha_Cyan;
    int baqimandehsarbazha_gray;
    int baqimandehsarbazha_orange;

        JFrame match = new JFrame();

       public JButton next = new JButton("Next =>");

        JButton exit = new JButton("Main Menu");

        JButton def1 = new JButton();
        JButton def2 = new JButton();
        JButton att1 = new JButton();
        JButton att2 = new JButton();
        JButton att3 = new JButton();
        JLabel Tedadsarbazha;
    JButton start = new JButton("Start");
    public     JButton A1 = new JButton();
    public  JButton A2 = new JButton();
    public     JButton A3 = new JButton();
    public JButton A4 = new JButton();
    public    JButton A5 = new JButton();
    public     JButton A6 = new JButton();
    public      JButton A7 = new JButton();
    public     JButton A8 = new JButton();
    public    JButton A9 = new JButton();
    public    JButton o1 = new JButton();
    public    JButton o2 = new JButton();
    public     JButton o3 = new JButton();
    public     JButton o4 = new JButton();
    public    JButton o5 = new JButton();
    public    JButton o6 = new JButton();
    public   JButton Af1 = new JButton();
    public    JButton Af2 = new JButton();
    public  JButton Af3 = new JButton();
    public    JButton Af4 = new JButton();
    public    JButton Af5 = new JButton();
    public  JButton Af6 = new JButton();
    public    JButton As1 = new JButton();
    public  JButton As2 = new JButton();
    public   JButton As3 = new JButton();
    public    JButton As4 = new JButton();
    public    JButton As5 = new JButton();
    public    JButton As6 = new JButton();
    public     JButton As7 = new JButton();
    public     JButton As8 = new JButton();

    public JButton UNDO =new JButton("Undo Round");

        JButton d1 = new JButton();
        JButton d2 = new JButton();
        JButton d3 = new JButton();
        JButton d4 = new JButton();
        JButton d5 = new JButton();
        JButton d6 = new JButton();
        JButton d7 = new JButton();
        JButton d8 = new JButton();
        JButton d9 = new JButton();
        JButton d10 = new JButton();
        JButton d11 = new JButton();
        JButton d12 = new JButton();
        JButton d13 = new JButton();
    JLabel attacker = new JLabel("  Attacker");
    JLabel defender = new JLabel(" Defender");
    JCheckBox player2;
    JCheckBox player3;
    JCheckBox player4;
    JCheckBox soldeir;
    JCheckBox attack;
    JCheckBox move;

    JCheckBox p1;
    JCheckBox p2;
    JCheckBox p3;
    JCheckBox p4;

   JCheckBox multy;
    JLabel winner = new JLabel("Winner");
    public  JLabel winner2= new JLabel("Winner");
    int Round =0;
    JButton round = new JButton("Rounnd : " + Round);
   public JButton[] grade;

        public void design() {

            grade = new JButton[29];
            grade[0] = A1;
            grade[1] = A2;
            grade[2] =  A3;
            grade[3] =  A4;
            grade[4] =  A5;
            grade[5] =  A6;
            grade[6] =  A7;
            grade[7] =  A8;
            grade[8] =  A9;
            grade[9] = As1;
            grade[10] = As2;
            grade[11] = As3;
            grade[12] = As4;
            grade[13] = As5;
            grade[14] = As6;
            grade[15] = As7;
            grade[16] = As8;
            grade[17] = Af1;
            grade[18] = Af2;
            grade[19] = Af3;
            grade[20] = Af4;
            grade[21] = Af5;
            grade[22] = Af6;
            grade[23] = o1;
            grade[24] =  o2;
            grade[25] =  o3;
            grade[26] = o4;
            grade[27] = o5;
            grade[28] = o6;



            attacker.setOpaque(true);
            attacker.setBounds(185,140,80,50);
            attacker.setBackground(white);
            defender.setBounds(85,140,80,50);
            defender.setOpaque(true);
            defender.setBackground(white);




            p1 = new JCheckBox(" Orange", true);
            p2 = new JCheckBox("Pink", true);
            p3 = new JCheckBox("Gray", true);
            p4 = new JCheckBox("Cyan", true);
            p1.setBackground(orange);
            p2.setBackground(pink);
            p3.setBackground(gray);
            p4.setBackground(cyan);

            p1.setEnabled(true);
            p2.setEnabled(false);
            p3.setEnabled(false);
            p4.setEnabled(false);

            p1.setBounds(1000, 100, 100, 30);
            JLabel amaro = new JLabel();
            amaro.setOpaque(true);
            amaro.setBackground(orange);
            amaro.setBounds(1000,135,100,50);

            p2.setBounds(1000, 200, 100, 30);
            JLabel amarp = new JLabel();
            amarp.setOpaque(true);
            amarp.setBackground(pink);
            amarp.setBounds(1000,235,100,50);

            p3.setBounds(1000, 300, 100, 30);
            JLabel amarg = new JLabel();
            amarg.setOpaque(true);
            amarg.setBackground(gray);
            amarg.setBounds(1000,335,100,50);

            p4.setBounds(1000, 400, 100, 30);
            JLabel amarc = new JLabel();
            amarc.setOpaque(true);
            amarc.setBackground(cyan);
            amarc.setBounds(1000,435,100,50);


            TextArea chat = new TextArea();
            chat.setBounds(1130,120,160,300);
            chat.setBackground(white);
            chat.setEditable(false);

            TextField textField = new TextField();
            textField.setBounds(1130,450,150,40);
            JButton Enter = new JButton("Enter");
            Enter.setBounds(1165,500,90,40);
            Enter.setBackground(WHITE);


            soldeir = new JCheckBox("Soldeirs", true);
            attack = new JCheckBox("Attack", true);
            move = new JCheckBox("Move", true);
            soldeir.setBounds(300, 560, 80, 30);
            attack.setBounds(450, 560, 80, 30);
            move.setBounds(600, 560, 80, 30);
            soldeir.setEnabled(true);
            attack.setEnabled(false);
            move.setEnabled(false);

            player2 = new JCheckBox("Two Player ", true);
            player3 = new JCheckBox("Three Player", false);
            player4 = new JCheckBox("Four Player ", false);

            player2.setBounds(400, 50, 130, 30);
            player3.setBounds(530, 50, 130, 30);
            player4.setBounds(660, 50, 130, 30);


            multy = new JCheckBox("Multy player", false);
            multy.setBackground(green);
            multy.setBounds(530,10,130,30);


            player2.setBackground(Color.yellow);
            player3.setBackground(Color.yellow);
            player4.setBackground(Color.yellow);

            ButtonGroup tedadplayer = new ButtonGroup();

            tedadplayer.add(player2);
            tedadplayer.add(player3);
            tedadplayer.add(player4);

            start.setBounds(1100, 550, 100, 60);
            start.setBackground(Color.green);



            winner.setOpaque(true);
            winner.setBackground(white);
            winner.setBounds(100,540,150,65);
            winner.setVisible(false);

            winner2.setOpaque(true);
            winner2.setBackground(white);
            winner2.setBounds(100,600,150,65);
            winner2.setVisible(false);

            round.setBounds(50, 50, 130, 60);
            round.setBackground(Color.PINK);
            match.setTitle("Match Day");
            match.setExtendedState(JFrame.MAXIMIZED_BOTH);


            ImageIcon imageIcon = new ImageIcon("Image/muscletech-what-flavor-are-you-fire-ice-background.jpg");
            JLabel jLabel = new JLabel();
            jLabel.setBounds(0,0,1300,800);
            jLabel.setIcon(imageIcon);
            match.add(jLabel);



            d1.setBackground(Color.blue);
            d2.setBackground(Color.blue);
            d3.setBackground(Color.blue);
            d4.setBackground(Color.blue);
            d5.setBackground(Color.blue);
            d6.setBackground(Color.blue);
            d7.setBackground(Color.blue);
            d8.setBackground(Color.blue);
            d9.setBackground(Color.blue);
            d10.setBackground(Color.blue);
            d10.setBackground(Color.blue);
            d11.setBackground(Color.blue);
            d12.setBackground(Color.blue);
            d13.setBackground(Color.blue);

            A1.setBackground(black);
            A2.setBackground(black);
            A3.setBackground(black);
            A4.setBackground(black);
            A5.setBackground(black);
            A6.setBackground(black);
            A7.setBackground(black);
            A8.setBackground(black);
            A9.setBackground(black);
            o1.setBackground(Color.red);
            o2.setBackground(Color.red);
            o3.setBackground(Color.red);
            o4.setBackground(Color.red);
            o5.setBackground(Color.red);
            o6.setBackground(Color.red);
            As1.setBackground(Color.green);
            As2.setBackground(Color.green);
            As3.setBackground(Color.green);
            As4.setBackground(Color.green);
            As5.setBackground(Color.green);
            As6.setBackground(Color.green);
            As7.setBackground(Color.green);
            As8.setBackground(Color.green);
            Af1.setBackground(Color.yellow);
            Af2.setBackground(Color.yellow);
            Af3.setBackground(Color.yellow);
            Af4.setBackground(Color.yellow);
            Af5.setBackground(Color.yellow);
            Af6.setBackground(Color.yellow);
            A1.setBounds(300, 100, 100, 60);
            A2.setBounds(300, 160, 100, 60);
            A3.setBounds(300, 220, 100, 60);
            A4.setBounds(300, 280, 100, 60);
            A5.setBounds(300, 340, 100, 60);
            A6.setBounds(300, 400, 100, 60);
            A7.setBounds(400, 100, 100, 60);
            A8.setBounds(400, 160, 100, 60);
            A9.setBounds(400, 400, 100, 60);


            o1.setBounds(500, 100, 100, 60);
            o2.setBounds(500, 160, 100, 60);
            o3.setBounds(500, 220, 100, 60);
            o4.setBounds(600, 100, 100, 60);
            o5.setBounds(600, 160, 100, 60);
            o6.setBounds(600, 220, 100, 60);


            Af1.setBounds(500, 340, 100, 60);
            Af2.setBounds(500, 400, 100, 60);
            Af3.setBounds(500, 460, 100, 60);
            Af4.setBounds(600, 280, 100, 60);
            Af5.setBounds(600, 340, 100, 60);
            Af6.setBounds(600, 400, 100, 60);


            As1.setBounds(700, 100, 100, 60);
            As2.setBounds(700, 160, 100, 60);
            As3.setBounds(700, 220, 100, 60);
            As4.setBounds(700, 280, 100, 60);
            As5.setBounds(800, 100, 100, 60);
            As6.setBounds(800, 160, 100, 60);
            As7.setBounds(800, 220, 100, 60);
            As8.setBounds(800, 280, 100, 60);


            d1.setBounds(300, 460, 100, 60);
            d2.setBounds(400, 460, 100, 60);
            d3.setBounds(400, 220, 100, 60);
            d4.setBounds(400, 280, 100, 60);
            d5.setBounds(400, 340, 100, 60);
            d6.setBounds(500, 280, 100, 60);
            d7.setBounds(600, 460, 100, 60);


            d8.setBounds(700, 340, 100, 60);
            d9.setBounds(700, 400, 100, 60);
            d10.setBounds(700, 460, 100, 60);
            d11.setBounds(800, 340, 100, 60);
            d12.setBounds(800, 400, 100, 60);
            d13.setBounds(800, 460, 100, 60);


            next.setBackground(Color.CYAN);
            next.setBounds(700, 550, 140, 60);
            next.setEnabled(false);

            def1.setBackground(white);
            def2.setBackground(white);

            att1.setBackground(white);
            att2.setBackground(Color.white);
            att3.setBackground(Color.white);

            def1.setBounds(100, 200, 50, 50);
            def2.setBounds(100, 280, 50, 50);

            att1.setBounds(200, 200, 50, 50);
            att2.setBounds(200, 280, 50, 50);
            att3.setBounds(200, 360, 50, 50);



            UNDO.setBounds(150,420,130,50);
            UNDO.setBackground(blue);
            UNDO.setEnabled(false);

            JButton undo = new JButton("Undo");
            undo.setBounds(200,480,80,50);
            undo.setBackground(green);
            undo.setVisible(false);

            exit.setBackground(Color.red);
            exit.setBounds(1080, 0, 230, 80);
            ImageIcon imageIcon1 = new ImageIcon("Image/menugif2.gif");
            exit.setBackground(lightGray);
            exit.setIcon(imageIcon1);



            Tedadsarbazha = new JLabel();
            Tedadsarbazha.setOpaque(true);
            Tedadsarbazha.setBounds(900, 550, 200, 70);
            Tedadsarbazha.setBackground(Color.LIGHT_GRAY);

            jLabel.add(Tedadsarbazha);

            jLabel.add(UNDO);
            jLabel.add(A1);
            jLabel.add(A2);
            jLabel.add(A3);
            jLabel.add(A4);
            jLabel.add(A5);
            jLabel.add(A6);
            jLabel.add(A7);
            jLabel.add(A8);
            jLabel.add(A9);


            jLabel.add(o1);
            jLabel.add(o2);
            jLabel.add(o3);
            jLabel.add(o4);
            jLabel.add(o5);
            jLabel.add(o6);


            jLabel.add(Af1);
            jLabel.add(Af2);
            jLabel.add(Af3);
            jLabel.add(Af4);
            jLabel.add(Af5);
            jLabel.add(Af6);


            jLabel.add(As1);
            jLabel.add(As2);
            jLabel.add(As3);
            jLabel.add(As4);
            jLabel.add(As5);
            jLabel.add(As6);
            jLabel.add(As7);
            jLabel.add(As8);

            jLabel.add(amaro);
            jLabel.add(amarp);
            jLabel.add(amarg);
            jLabel.add(amarc);

            jLabel.add(d1);
            jLabel.add(d2);
            jLabel.add(d3);
            jLabel.add(d4);
            jLabel.add(d5);
            jLabel.add(d6);
            jLabel.add(d7);
            jLabel.add(d8);
            jLabel.add(d9);
            jLabel.add(d10);
            jLabel.add(d11);
            jLabel.add(d12);
            jLabel.add(d13);
            jLabel.add(next);


            jLabel.add(def1);
            jLabel.add(def2);
            jLabel.add(att1);
            jLabel.add(att2);
            jLabel.add(att3);
            jLabel.add(player2);
            jLabel.add(player3);
            jLabel.add(player4);
            jLabel.add(p1);
            jLabel.add(p2);
            jLabel.add(p3);
            jLabel.add(p4);
            jLabel.add(winner);
            jLabel.add(round);
            jLabel.add(attacker);
            jLabel.add(defender);
            jLabel.add(move);
            jLabel.add(soldeir);
            jLabel.add(attack);
            jLabel.add(undo);
            jLabel.add(start);
            jLabel.add(chat);
            jLabel.add(Enter);
            jLabel.add(textField);

            jLabel.add(multy);
            jLabel.add(winner2);
            match.setLayout(null);
            match.setVisible(true);
            jLabel.add(exit);

            Game_Controller game = new Game_Controller(grade,player2,player3,player4,p1,p2,p3,p4,start,
                    exit,att1,att2,att3,def1,def2,round,Tedadsarbazha,match,attack,
                    move,soldeir,next,winner,UNDO,attacker,defender,chat,textField,Enter,undo,multy,winner2,amaro,amarp,
                    amarg,amarc);
        }

    }
