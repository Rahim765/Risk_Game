package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Color.gray;

public class Pakhsh_sarbaz {

    int baqimandehsarbazha_orange;
    int baqimandehsarbazha_pink;
    int baqimandehsarbazha_gray;
    int baqimandehsarbazha_Cyan;
    boolean aval=true;
    static Sarbaz_Dahi s= new Sarbaz_Dahi();
    static Game_Controller g = new Game_Controller();


    public int Sarbaz_QozariA1(JButton button,JCheckBox p1,JCheckBox p2,JCheckBox p3,
                                JCheckBox p4,JCheckBox player2,JCheckBox player3,
                                JCheckBox player4,
                                JCheckBox soldeir,JLabel Tedadsarbazha) {

        if (player2.isSelected()) {
            if (soldeir.isEnabled() & baqimandehsarbazha_orange > 0 & button.getBackground().equals(orange) & p1.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_orange--;
                p1.setEnabled(false);
                p2.setEnabled(true);
                Tedadsarbazha.setText("Tedad sarbaz hai pink :" + baqimandehsarbazha_pink);
            }
            if (soldeir.isEnabled() & baqimandehsarbazha_pink > 0 & button.getBackground().equals(pink) & p2.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_pink--;

                 Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                p2.setEnabled(false);
                p1.setEnabled(true);
            }
            if (baqimandehsarbazha_orange == 0 && baqimandehsarbazha_pink == 0 && soldeir.isEnabled()) {
          return 0;

            }
        } else if (player3.isSelected()) {
            if (soldeir.isEnabled() & baqimandehsarbazha_orange > 0 & button.getBackground().equals(orange) & p1.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_orange--;
                p1.setEnabled(false);
                p2.setEnabled(true);
                Tedadsarbazha.setText("Tedad sarbaz hai pink :" + baqimandehsarbazha_pink);
            }
            if (soldeir.isEnabled() & baqimandehsarbazha_pink > 0 & button.getBackground().equals(pink) & p2.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_pink--;
                 Tedadsarbazha.setText("Tedad sarbaz hai gray :" + baqimandehsarbazha_gray);
                p2.setEnabled(false);
                p3.setEnabled(true);
            }

            if (soldeir.isEnabled() & baqimandehsarbazha_gray > 0 & button.getBackground().equals(gray) & p3.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_gray--;
               Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                p3.setEnabled(false);
                p1.setEnabled(true);
            }
            if (baqimandehsarbazha_orange == 0 && baqimandehsarbazha_pink == 0 && baqimandehsarbazha_gray == 0 && soldeir.isEnabled()) {

            return 0;
            }
        } else if (player4.isSelected()) {
            if (soldeir.isEnabled() & baqimandehsarbazha_orange > 0 & button.getBackground().equals(orange) & p1.isEnabled()) {

                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_orange--;
                p1.setEnabled(false);
                p2.setEnabled(true);
                Tedadsarbazha.setText("Tedad sarbaz hai pink :" + baqimandehsarbazha_pink);
            }
            if (soldeir.isEnabled() & baqimandehsarbazha_pink > 0 & button.getBackground().equals(pink) & p2.isEnabled()) {
                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_pink--;
               Tedadsarbazha.setText("Tedad sarbaz hai gray :" + baqimandehsarbazha_gray);
                p2.setEnabled(false);
                p3.setEnabled(true);
            }
            if (soldeir.isEnabled() & baqimandehsarbazha_gray > 0 & button.getBackground().equals(gray) & p3.isEnabled()) {

                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_gray--;
                 Tedadsarbazha.setText("Tedad sarbaz hai cyan :" + baqimandehsarbazha_Cyan);
                p3.setEnabled(false);
                p4.setEnabled(true);
            }
            if (soldeir.isEnabled() & baqimandehsarbazha_Cyan >0 & button.getBackground().equals(cyan) & p4.isEnabled()) {

                int x = Integer.parseInt(button.getText());
                Set_Get s = new Set_Get();
                s.Setnumber(x + 1);
                button.setText(String.valueOf(s.getnumber()));
                baqimandehsarbazha_Cyan--;
                Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                p4.setEnabled(false);
                p1.setEnabled(true);
            }
            if (baqimandehsarbazha_orange == 0 && baqimandehsarbazha_pink == 0 && baqimandehsarbazha_Cyan == 0 && baqimandehsarbazha_gray == 0 && soldeir.isEnabled()) {
           return 0;

            }
        }
        return 1;
    }

}