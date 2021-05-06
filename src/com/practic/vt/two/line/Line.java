package com.practic.vt.two.line;

import javax.swing.*;
import java.awt.*;

public class Line extends JFrame {
    public Line(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.MAGENTA);
        g2D.setStroke(new BasicStroke(10));
        g2D.drawLine(175,100,250,200);
    }
}
