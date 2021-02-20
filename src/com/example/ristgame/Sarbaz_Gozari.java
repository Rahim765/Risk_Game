package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Color.gray;

public class Sarbaz_Gozari {
    static Sarbaz_Dahi s2 = new Sarbaz_Dahi();
    JCheckBox p1;
    JCheckBox p2;
    JCheckBox p3;
    JCheckBox p4;
    JCheckBox player2;
    JCheckBox player3;
    JCheckBox player4;
    JCheckBox soldeir;
    JCheckBox attack;
    JCheckBox move;
    JLabel Tedadsarbazha;
    int baqimandehsarbazha_pink;
    int baqimandehsarbazha_Cyan;
    int baqimandehsarbazha_gray;
    int baqimandehsarbazha_orange;

    public Sarbaz_Gozari(JCheckBox p1,JCheckBox p2, JCheckBox p3, JCheckBox p4, JCheckBox player2,JCheckBox player3,JCheckBox player4
    ,JCheckBox soldeir , JCheckBox attack,JCheckBox move, JLabel Tedadsarbazha,int baqimandehsarbazha_orange, int baqimandehsarbazha_pink,
                         int baqimandehsarbazha_gray,int baqimandehsarbazha_Cyan)
    {
        this.player2=player2;
        this.player3=player3;
        this.player4=player4;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
        this.Tedadsarbazha=Tedadsarbazha;
        this.move=move;
        this.soldeir=soldeir;
        this.attack=attack;
        this.baqimandehsarbazha_Cyan=baqimandehsarbazha_Cyan;
        this.baqimandehsarbazha_orange=baqimandehsarbazha_orange;
        this.baqimandehsarbazha_gray=baqimandehsarbazha_gray;
        this.baqimandehsarbazha_pink=baqimandehsarbazha_pink;

    }
    public Sarbaz_Gozari()
    {

    }

    public int  sarbaz_gozari(JButton button, Color color,int baqimandehsarbazha_orange,String name,JLabel Tedadsarbazha) {
        if (button.getBackground().equals(color)) {

            int x = Integer.parseInt(button.getText());
            Set_Get s = new Set_Get();
            s.Setnumber(x + 1);
            button.setText(String.valueOf(s.getnumber()));
            if (baqimandehsarbazha_orange > 0) {
                baqimandehsarbazha_orange--;
            }
           Tedadsarbazha.setText("Tedad sarbaz hai " + name + " : " + baqimandehsarbazha_orange);
            return 1;
        }
        return 0;
    }


}

