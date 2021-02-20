package com.example.ristgame;

import com.example.risk_GUI.Risk_Game.Map;

import javax.swing.*;

public class Ham_Marz {
    static Map m= new Map();

    JButton[][] grade;

    public JButton[][] ham_marz(JButton[] buttons)
    {
        grade=new JButton[5][29];

        grade[0][0] =buttons[0];
        grade[1][0] =buttons[1];
        grade[2][0] = buttons[6];
        grade[3][0] = null;
        grade[4][0] = null;

        grade[0][1] =buttons[1];
        grade[1][1] = buttons[0];
        grade[2][1] =buttons[2];
        grade[3][1] =buttons[7];
        grade[4][1] = null;

        grade[0][2] = buttons[2];
        grade[1][2] =buttons[1];
        grade[2][2] =buttons[3];
        grade[3][2] = null;
        grade[4][2] = null;

        grade[0][3] = buttons[3];
        grade[1][3] =buttons[2];
        grade[2][3] =  buttons[4];
        grade[3][3] = null;
        grade[4][3] = null;

        grade[0][4] = buttons[4];
        grade[1][4] =  buttons[3];
        grade[2][4] =  buttons[5];
        grade[3][4] = null;
        grade[4][4] = null;

        grade[0][5] =  buttons[5];
        grade[1][5] = buttons[4];
        grade[2][5] =  buttons[8];
        grade[3][5] = null;
        grade[4][5] = null;

        grade[0][6] =  buttons[6];
        grade[1][6] = buttons[0];
        grade[2][6] =  buttons[7];
        grade[3][6] = buttons[23];
        grade[4][6] = null;

        grade[0][7] = buttons[7];
        grade[1][7] =  buttons[6];
        grade[2][7] = buttons[1];
        grade[3][7] = buttons[24];
        grade[4][7] = null;

        grade[0][8] =  buttons[8];
        grade[1][8] =  buttons[5];
        grade[2][8] =  buttons[18];
        grade[3][8] = null;
        grade[4][8] = null;


        grade[0][9] = buttons[9];
        grade[1][9] =  buttons[26];
        grade[2][9] = buttons[13];
        grade[3][9] =  buttons[10];
        grade[4][9] = null;

        grade[0][10] =  buttons[10];
        grade[1][10] =  buttons[9];
        grade[2][10] = buttons[14];
        grade[3][10] =  buttons[11];
        grade[4][10] =  buttons[27];

        grade[0][11] =  buttons[11];
        grade[1][11] =  buttons[10];
        grade[2][11] =  buttons[12];
        grade[3][11] = buttons[15];
        grade[4][11] =  buttons[28];

        grade[0][12] =  buttons[12];
        grade[1][12] =  buttons[11];
        grade[2][12] = buttons[16];
        grade[3][12] =  buttons[20];
        grade[4][12] = null;

        grade[0][13] =  buttons[13];
        grade[1][13] =  buttons[9];
        grade[2][13] = buttons[14];
        grade[3][13] = null;
        grade[4][13] = null;

        grade[0][14] =  buttons[14];
        grade[1][14] =  buttons[13];
        grade[2][14] =  buttons[15];
        grade[3][14] =  buttons[10];
        grade[4][14] = null;


        grade[0][15] =  buttons[15];
        grade[1][15] =  buttons[14];
        grade[2][15] =  buttons[11];
        grade[3][15] = buttons[16];
        grade[4][15] = null;

        grade[0][16] =  buttons[16];
        grade[1][16] =  buttons[15];
        grade[2][16] =  buttons[12];
        grade[3][16] = null;
        grade[4][16] = null;

        grade[0][17] =  buttons[17];
        grade[1][17] =  buttons[18];
        grade[2][17] =  buttons[21];
        grade[3][17] = null;
        grade[4][17] = null;

        grade[0][18] =  buttons[18];
        grade[1][18] = buttons[17];
        grade[2][18] =  buttons[8];
        grade[3][18] =  buttons[19];
        grade[4][18] = buttons[22];

        grade[0][19] =  buttons[19];
        grade[1][19] =  buttons[18];
        grade[2][19] = null;
        grade[3][19] = null;
        grade[4][19] = null;

        grade[0][20] =  buttons[20];
        grade[1][20] =  buttons[28];
        grade[2][20] =  buttons[21];
        grade[3][20] = null;
        grade[4][20] = buttons[12];

        grade[0][21] = buttons[21];
        grade[1][21] = buttons[17];
        grade[2][21] =  buttons[20];
        grade[3][21] =  buttons[22];
        grade[4][21] = null;

        grade[0][22] =  buttons[22];
        grade[1][22] =  buttons[18];
        grade[2][22] =  buttons[21];
        grade[3][22] = null;
        grade[4][22] = null;

        grade[0][23] =  buttons[23];
        grade[1][23] =  buttons[24];
        grade[2][23] =  buttons[6];
        grade[3][23] =  buttons[26];
        grade[4][23] = null;

        grade[0][24] =  buttons[24];
        grade[1][24] =  buttons[23];
        grade[2][24] =  buttons[25];
        grade[3][24] =  buttons[27];
        grade[4][24] =  buttons[7];

        grade[0][25] =  buttons[25];
        grade[1][25] =  buttons[24];
        grade[2][25] =  buttons[28];
        grade[3][25] = null;
        grade[4][25] = null;

        grade[0][26] = buttons[26];
        grade[1][26] = buttons[23];
        grade[2][26] = buttons[27];
        grade[3][26] =  buttons[9];
        grade[4][26] = null;

        grade[0][27] = buttons[27];
        grade[1][27] =  buttons[26];
        grade[2][27] = buttons[24];
        grade[3][27] =  buttons[28];
        grade[4][27] = buttons[10];

        grade[0][28] = buttons[28];
        grade[1][28] =  buttons[27];
        grade[2][28] =  buttons[25];
        grade[3][28] =  buttons[11];
        grade[4][28] =  buttons[20];



        return grade;

    }
}
