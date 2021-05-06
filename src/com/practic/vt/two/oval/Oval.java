package com.practic.vt.two.oval;

import javax.swing.*;
import java.awt.*;

public class Oval extends JFrame{
    private final int width;
    private final int height;

    public Oval(int width, int height){
        this.width = width;
        this.height = height;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.ORANGE);
        g2D.fillOval(155, 100, width, height);
    }
}
