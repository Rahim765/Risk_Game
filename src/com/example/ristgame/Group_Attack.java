package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.Map;

import javax.swing.*;
import java.awt.*;
import java.time.temporal.JulianFields;

public class Group_Attack {

    JButton[] att;
    boolean attack2=true;
    int a2=0;
    int mabda=0;
    int maghsad=0;
    int hamleh=0;
    int dafa=0;
    JButton att1;
    JulianFields att2;
    JButton att3;
    JButton def1;
    JButton def2;
    static int kill_o=0;
    static int kill_p=0;
    static int kill_g=0;
    static int kill_c=0;
    int man;
    Map m = new Map();
    Game_Controller p =new Game_Controller();
    public void G_Attack(JButton button, Color color,Color color2, Ham_Marz ham_marz, JButton att1, JButton att2, JButton att3,
                       JButton def1, JButton def2, JLabel attacker, JLabel defender,
                         JLabel amaro,JLabel amarp,
                         JLabel amarg, JLabel amarc) {

        JButton[][] grade;
        grade = new JButton[5][29];
        grade=ham_marz.grade;
        att = new JButton[1];
        if (attack2 && button.getBackground().equals(color)) {
            for (int i = 0; i < 29; i++) {
                if (grade[0][i]==button) {
                    a2 = i;
                }
            }
            mabda = Integer.parseInt(button.getText());

            attack2 = false;
        }
        else if (attack2 == false && !button.getBackground().equals(color)&&!button.getBackground().equals(color2) ) {
            att[0] = button;


            maghsad = Integer.parseInt(att[0].getText());
            attack2 = true;
            for (int k = 1; k < 5; k++) {
                if (grade[k][a2] == att[0]) {
                    att1.setBackground(grade[0][a2].getBackground());
                    att2.setBackground(grade[0][a2].getBackground());
                    att3.setBackground(grade[0][a2].getBackground());
                    attacker.setBackground(grade[0][a2].getBackground());

                    def1.setBackground(button.getBackground());
                    def2.setBackground(button.getBackground());
                    defender.setBackground(button.getBackground());
                    man = maghsad;
                    if (mabda >= 4) {
                        hamleh = 3;
                    } else if (mabda < 4) {
                        hamleh = mabda - 1;
                    }
                    if (maghsad >= 2) {
                        dafa = 2;
                    } else if (maghsad < 2) {
                        dafa = 1;
                    }
                }
            }
            if (hamleh > 0 && dafa > 0) {
                Sort s = new Sort();

                int[] Attt;
                Attt = new int[hamleh];
                Attt = s.sort(hamleh);

                int[] dafa2;
                dafa2 = new int[dafa];
                dafa2 = s.sort(dafa);

                att1.setVisible(true);
                att2.setVisible(true);
                att3.setVisible(true);
                def1.setVisible(true);
                def2.setVisible(true);

                if (dafa == 1) {
                    def1.setText(String.valueOf(dafa2[0]));
                    def2.setVisible(false);
                } else if (dafa == 2) {
                    def2.setVisible(true);
                    def1.setText(String.valueOf(dafa2[0]));
                    def2.setText(String.valueOf(dafa2[1]));
                }
                if (hamleh == 3) {
                    att1.setText(String.valueOf(Attt[0]));
                    att2.setText(String.valueOf(Attt[1]));
                    att3.setText(String.valueOf(Attt[2]));
                }

                if (hamleh == 2) {
                    att1.setText(String.valueOf(Attt[0]));
                    att2.setText(String.valueOf(Attt[1]));
                    att3.setVisible(false);
                }

                if (hamleh == 1) {
                    att1.setText(String.valueOf(Attt[0]));
                    att2.setVisible(false);
                    att3.setVisible(false);
                }

                if (dafa == 2&&hamleh>=2){
                    for (int i = 0; i < dafa; i++) {
                        if (Attt[i] > dafa2[i]) {
                            maghsad--;
                        } else {
                            mabda--;
                            hamleh--;
                        }
                    }
                }
                else if (dafa==1)
                {
                    for (int i = 0; i <dafa ; i++) {
                        if (Attt[i] > dafa2[i]) {
                            maghsad--;
                        } else {
                            mabda--;
                            hamleh--;
                        }
                    }
                }
                else if (dafa==2&&hamleh<2)
                {
                    for (int i = 0; i <hamleh ; i++) {
                        if (Attt[i] > dafa2[i]) {
                            maghsad--;
                        } else {
                            mabda--;
                            hamleh--;
                        }
                    }
                }
                grade[0][a2].setText(String.valueOf(mabda));

                man-=maghsad;
                if (color.equals(Color.orange))
                {
                    kill_o+=man;
                }
                else  if (color.equals(Color.pink))
                {
                    kill_p+=man;
                }
                else  if (color.equals(Color.gray))
                {
                    kill_g+=man;
                }
                else if (color.equals(Color.cyan))
                {
                    kill_c+=man;
                }
                amaro.setText("killed : "+kill_o);
                amarp.setText("killed : "+kill_p);
                amarg.setText("killed : "+kill_g);
                amarc.setText("killed : "+kill_c);


                if (maghsad>0)
                {
                    att[0].setText(String.valueOf(maghsad));
                }
                else if (maghsad<=0)
                {
                    att[0].setText(String.valueOf(hamleh));
                    mabda= mabda-hamleh;
                    grade[0][a2].setText(String.valueOf(mabda));
                    att[0].setBackground(color);
                }
                hamleh=0;
                dafa=0;
            }
        }

    }
}
