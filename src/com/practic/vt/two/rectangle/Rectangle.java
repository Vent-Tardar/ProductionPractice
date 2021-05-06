package com.practic.vt.two.rectangle;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame {
    public Rectangle(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.fillRect(190, 150, 50, 100);
    }
}
