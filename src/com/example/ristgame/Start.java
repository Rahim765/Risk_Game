package com.example.ristgame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;

public class Start {
    public void start1(int tedad,JButton[] grade,JLabel Tedadsarbazha) {
        int baqimandehsarbazha_pink = 0;
        int baqimandehsarbazha_orange = 0;
        int  baqimandehsarbazha_Cyan = 0;
        int  baqimandehsarbazha_gray = 0;

        for (int i = 0; i <9 ; i++) {
            grade[i].setBorder(BorderFactory.createLineBorder(BLACK));
        }
        for (int i = 9; i <17 ; i++) {
            grade[i].setBorder(BorderFactory.createLineBorder(GREEN));
        }
        for (int i = 17; i <23 ; i++) {
            grade[i].setBorder(BorderFactory.createLineBorder(YELLOW));
        }
        for (int i = 23; i <29 ; i++) {
            grade[i].setBorder(BorderFactory.createLineBorder(RED));
        }

        for (int i = 0; i < 29; i++) {
            grade[i].setText("1");
        }

        if (tedad==2) {
            Random random = new Random();
            for (int i = 0; i < 29; i++) {
                int x = random.nextInt(2);
                if (x == 0) {
                    if (baqimandehsarbazha_orange < 15) {
                        baqimandehsarbazha_orange++;
                        grade[i].setBackground(Color.orange);
                    } else {
                        baqimandehsarbazha_pink++;
                        grade[i].setBackground(Color.pink);
                    }
                } else if (x == 1) {
                    if (baqimandehsarbazha_pink < 15) {
                        baqimandehsarbazha_pink++;
                        grade[i].setBackground(Color.pink);
                    } else {
                        grade[i].setBackground(Color.orange);
                        baqimandehsarbazha_orange++;
                    }
                }
                if (i == 28) {
                    baqimandehsarbazha_orange = 15;
                    baqimandehsarbazha_pink = 15;
                   Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                }

            }


        } else if (tedad==3) {
            for (int i = 0; i < 29; i++) {
                Random random = new Random();
                int y = random.nextInt(3);
                if (y == 0) {
                    if (baqimandehsarbazha_orange < 10) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_pink < 10) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_gray < 10) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;
                    }

                } else if (y == 1) {
                    if (baqimandehsarbazha_pink < 10) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_orange < 10) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_gray < 10) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;
                    }

                } else if (y == 2) {
                    if (baqimandehsarbazha_gray < 10) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;
                    } else if (baqimandehsarbazha_orange < 10) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_pink < 10) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    }

                }
                if (i == 28) {
                    baqimandehsarbazha_orange = 15;
                    baqimandehsarbazha_pink = 15;
                    baqimandehsarbazha_gray = 15;

                   Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                }

            }
        } else if (tedad==4) {

            for (int i = 0; i < 29; i++) {
                Random random = new Random();
                int x = random.nextInt(4);
                if (x == 0) {
                    if (baqimandehsarbazha_orange < 8) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_pink < 7) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_gray < 7) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;
                    } else if (baqimandehsarbazha_Cyan < 7) {
                        grade[i].setBackground(cyan);
                        baqimandehsarbazha_Cyan++;
                    }
                }
                if (x == 1) {
                    if (baqimandehsarbazha_pink < 7) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_orange < 8) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_gray < 7) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;

                    } else if (baqimandehsarbazha_Cyan < 7) {
                        grade[i].setBackground(cyan);
                        baqimandehsarbazha_Cyan++;
                    }
                }
                if (x == 2) {
                    if (baqimandehsarbazha_gray < 7) {
                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;

                    } else if (baqimandehsarbazha_orange < 8) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_pink < 7) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_Cyan < 7) {
                        grade[i].setBackground(cyan);
                        baqimandehsarbazha_Cyan++;
                    }
                }
                if (x == 3) {
                    if (baqimandehsarbazha_Cyan < 7) {
                        grade[i].setBackground(cyan);
                        baqimandehsarbazha_Cyan++;
                    } else if (baqimandehsarbazha_orange < 8) {
                        grade[i].setBackground(orange);
                        baqimandehsarbazha_orange++;
                    } else if (baqimandehsarbazha_pink < 7) {
                        grade[i].setBackground(pink);
                        baqimandehsarbazha_pink++;
                    } else if (baqimandehsarbazha_gray < 7) {

                        grade[i].setBackground(gray);
                        baqimandehsarbazha_gray++;

                    }
                }


                if (i == 28) {
                    baqimandehsarbazha_orange = 13;
                    baqimandehsarbazha_pink = 13;
                    baqimandehsarbazha_gray = 13;
                    baqimandehsarbazha_Cyan = 13;

                     Tedadsarbazha.setText("Tedad sarbaz hai orange :" + baqimandehsarbazha_orange);
                }
            }

        }
    }

}
