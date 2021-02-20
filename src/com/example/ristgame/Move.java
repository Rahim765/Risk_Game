package com.example.ristgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.awt.Color.blue;
import static java.awt.Color.yellow;

public class Move {

    boolean gereftan=true;
    int sar;
    int meghdar;
    public int setMove(JButton button, Color color) {
        if (button.getBackground().equals(color)) {
            sar = Integer.parseInt(button.getText());
            if (sar > 1) {
            JFrame tedatsarbaz = new JFrame();
            tedatsarbaz.setSize(225, 225);
            tedatsarbaz.setTitle("Meghdar sarabz enteghlai1");
            JLabel label = new JLabel();
            label.setBounds(0,0,225,225);
            ImageIcon imageIcon = new ImageIcon("/home/rahim/Downloads/images.jpeg");
            label.setIcon(imageIcon);
            JTextField jTextField = new JTextField();
            jTextField.setBackground(yellow);
            JButton Transfer = new JButton("Transfer");
            Transfer.setBackground(blue);
            jTextField.setBounds(35, 20, 150, 60);
            Transfer.setBounds(65, 100, 100, 60);
            label.add(jTextField);
            label.add(Transfer);

            tedatsarbaz.add(label);
            tedatsarbaz.setLayout(null);
            tedatsarbaz.setVisible(true);

                Transfer.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        meghdar = Integer.parseInt(jTextField.getText());
                        if (sar > meghdar&&meghdar>0) {
                            sar -= meghdar;
                            button.setText(String.valueOf(sar));
                            tedatsarbaz.setVisible(false);
                        }

                    }
                });
                return 1;
            }
            
        }
        return 0;
    }
    public int setmove2(JButton button,Color color) {
        if (button.getBackground().equals(color)) {

            int x = Integer.parseInt(button.getText());
            x += meghdar;
            button.setText(String.valueOf(x));
            return 1;
        }
        return 0;
    }

    public int setmove2(JButton button,Color color,Color color2) {
        if (button.getBackground().equals(color)||button.getBackground().equals(color2)) {

            int x = Integer.parseInt(button.getText());
            x += meghdar;
            button.setText(String.valueOf(x));
            return 1;
        }
        return 0;
    }
}
