package com.example.ristgame;

import javax.swing.*;
import java.awt.*;

public class Sarbaz_Dahi {
    JButton[] grade=new JButton[29];
    public Sarbaz_Dahi(JButton[] grade){
        this.grade=grade;
    }
    public Sarbaz_Dahi()
    {}

    public int Setsarbaz(Color color) {

        int rang = 0;
        int Amrica = 0, Asia = 0, Africa = 0, Europe = 0;
        for (int i = 0; i < 29; i++) {
            if (grade[i].getBackground().equals(color)) {
                rang++;
            }

        }
        if (rang==29)
        {
            return -1;

        }
        if (rang==0)
        {
            return -2;
        }
        rang /= 3;
        for (int i = 0; i < 9; i++) {
            if (grade[i].getBackground().equals(color)) {
                Amrica++;
            }
        }
        for (int i = 9; i < 17; i++) {
            if (grade[i].getBackground().equals(color)) {
                Asia++;
            }
        }
        for (int i = 17; i < 23; i++) {
            if (grade[i].getBackground().equals(color)) {
                Africa++;
            }
        }
        for (int i = 23; i < 29; i++) {
            if (grade[i].getBackground().equals(color)) {
                Europe++;
            }
        }
        if (Amrica == 9) {
            rang += 3;
        }
        if (Asia == 8) {
            rang += 4;
        }
        if (Europe == 6) {
            rang += 4;
        }
        if (Africa == 6) {
            rang += 2;
        }
        return rang;
    }
    public int Setsarbaz(Color color,Color color2) {

        int rang = 0;
        int Amrica = 0, Asia = 0, Africa = 0, Europe = 0;
        for (int i = 0; i < 29; i++) {
            if (grade[i].getBackground().equals(color)) {
                rang++;
            }

        }
        if (rang==29)
        {
            return -1;

        }
        if (rang==0)
        {
            return -2;
        }
        rang /= 3;
        for (int i = 0; i < 9; i++) {
            if (grade[i].getBackground().equals(color)||grade[i].getBackground().equals(color2)) {
                Amrica++;
            }
        }
        for (int i = 9; i < 17; i++) {
            if (grade[i].getBackground().equals(color)||grade[i].getBackground().equals(color2)) {
                Asia++;
            }
        }
        for (int i = 17; i < 23; i++) {
            if (grade[i].getBackground().equals(color)||grade[i].getBackground().equals(color2)) {
                Africa++;
            }
        }
        for (int i = 23; i < 29; i++) {
            if (grade[i].getBackground().equals(color)||grade[i].getBackground().equals(color2)) {
                Europe++;
            }
        }
        if (Amrica == 9) {
            rang += 3;
        }
        if (Asia == 8) {
            rang += 4;
        }
        if (Europe == 6) {
            rang += 4;
        }
        if (Africa == 6) {
            rang += 2;
        }
        return rang;
    }

}
