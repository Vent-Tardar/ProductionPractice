package com.practic.vt.two.triangle;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel{
    private int[] x = {150, 200, 250};
    private int[] y = {250, 127, 250};

    public Triangle(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLocation(750, 300);
        frame.setResizable(true);
        frame.add(this);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.YELLOW);
        g.fillPolygon(x, y, 3);
    }
}
